package com.github.kostrovik.deal.views.menu;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * project: glc-mtx-deal
 * author:  kostrovik
 * date:    09/07/2018
 * github:  https://github.com/kostrovik/glc-mtx-deal
 */
public class DealsAction implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent event) {
        System.out.println("deals list event called");
    }
}
