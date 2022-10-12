package seedu.address.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import seedu.address.logic.Logic;
import seedu.address.model.team.Team;

/**
 *  An UI component that displays information of a {@code Team}.
 */
public class TeamCard extends UiPart<Region> {
    private static final String FXML = "TeamListCard.fxml";

    public final Team team;

    private PersonListPanel personListPanel;

    @FXML
    private Label name;

    @FXML
    private StackPane personListPanelPlaceholder;

    @FXML
    private StackPane taskListPanelPlaceholder;

    @FXML
    private StackPane teamListPanelPlaceholder;

    @FXML
    private Label id;

    /**
     * Creates a {@code TeamCode} with the given {@code Team} and index to display.
     */
    public TeamCard(Team team, int index, Logic logic) {
        super(FXML);

        name.setText(team.getName().fullName);
        id.setText(index + ". ");

        personListPanel = new PersonListPanel(team.getMemberList());
        personListPanelPlaceholder.getChildren().add(personListPanel.getRoot());


        //todo popoulate teamlistpanelplaceholder


        this.team = team;
    }
}