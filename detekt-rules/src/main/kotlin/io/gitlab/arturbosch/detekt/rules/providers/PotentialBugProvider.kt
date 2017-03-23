package io.gitlab.arturbosch.detekt.rules.providers

import io.gitlab.arturbosch.detekt.api.Config
import io.gitlab.arturbosch.detekt.api.RuleSet
import io.gitlab.arturbosch.detekt.api.RuleSetProvider
import io.gitlab.arturbosch.detekt.rules.bugs.DuplicateCaseInWhenExpression
import io.gitlab.arturbosch.detekt.rules.bugs.EqualsWithHashCodeExist
import io.gitlab.arturbosch.detekt.rules.bugs.ExplicitGarbageCollectionCall

/**
 * @author Artur Bosch
 */
class PotentialBugProvider : RuleSetProvider {

	override val ruleSetId: String = "potential-bugs"

	override fun instance(config: Config): RuleSet {
		return RuleSet(ruleSetId, listOf(
				DuplicateCaseInWhenExpression(config),
				EqualsWithHashCodeExist(config),
				ExplicitGarbageCollectionCall(config)
		))
	}

}