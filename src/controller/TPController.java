package controller;

import model.TPModel;
import view.TPView;

public class TPController {
    private TPModel model;
    private TPView view;

    public TPController(TPModel m, TPView v) {
        this.model = m;
        this.view = v;
    }
}
