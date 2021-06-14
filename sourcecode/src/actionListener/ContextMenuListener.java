package actionListener;

import javafx.event.EventHandler;
import javafx.scene.control.ContextMenu;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.shape.Rectangle;



public class ContextMenuListener implements EventHandler<ContextMenuEvent> {
    private Rectangle node;
    private ContextMenu contextMenu;

    private Boolean active = false;


    public void handle(ContextMenuEvent e) {
        if (active) {
            contextMenu.show(node, e.getScreenX(), e.getScreenY());
        }
    }
    public ContextMenuListener(Rectangle node, ContextMenu contextMenu){
        this.node = node;
        this.contextMenu = contextMenu;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
    public Boolean getActive() {
        return active;
    }


}
