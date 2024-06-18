package org.example.timeplanner.service;

import org.example.timeplanner.pojo.entity.Label;

public interface LabelServiceI {

    Label createLabel(Label label);

    Label updateLabel(Label label);

    boolean deleteLabelById(int id);
}