package seedu.address.model.team;

import java.util.List;
import java.util.function.Predicate;

import seedu.address.commons.util.StringUtil;

/**
 * Tests that a {@code Person}'s {@code Name} matches any of the keywords given.
 */
public class TeamNameContainsKeywordsPredicate implements Predicate<Team> {
    private final List<String> keywords;

    public TeamNameContainsKeywordsPredicate(List<String> keywords) {
        this.keywords = keywords;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof TeamNameContainsKeywordsPredicate // instanceof handles nulls
                && keywords.equals(((TeamNameContainsKeywordsPredicate) other).keywords)); // state check
    }

    @Override
    public boolean test(Team team) {
        return keywords.stream()
                .anyMatch(keyword -> StringUtil.containsWordIgnoreCase(team.getName().fullName, keyword));
    }
}
