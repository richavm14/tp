package seedu.address.model.member;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import java.util.Objects;

/**
 * Represents a Team in the address book.
 * Guarantees: details are present and not null, field values are validated, immutable.
 */
public class Member {

    private final seedu.address.model.member.Name name;

    /**
     * Constructor for member class.
     *
     * @param name
     */
    public Member(seedu.address.model.member.Name name) {
        requireAllNonNull(name);
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    /**
     * Returns true if both team have the same identity and data fields.
     * This defines a stronger notion of equality between two team.
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof seedu.address.model.member.Member)) {
            return false;
        }

        seedu.address.model.member.Member otherMember = (seedu.address.model.member.Member) other;
        return otherMember.getName().equals(getName());
    }

    @Override
    public int hashCode() {
        // use this method for custom fields hashing instead of implementing your own
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(getName());

        return builder.toString();
    }

}




