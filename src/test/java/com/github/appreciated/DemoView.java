package com.github.appreciated;

import com.github.appreciated.card.Card;
import com.github.appreciated.card.label.PrimaryLabel;
import com.github.appreciated.layout.SinglePageLayout;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


@Route("")
public class DemoView extends VerticalLayout {

    public DemoView() {
        SinglePageLayout layout = new SinglePageLayout();
        layout.setHeader(getContent()).getElement().setAttribute("theme", "dark");
        layout.setHeader(getContent()).getElement().setAttribute("theme", "dark");
        layout.setHeader(getContent()).getElement().setAttribute("theme", "dark");
        layout.add(
                getContent(),
                getContent(),
                getContent(),
                getContent(),
                getContent(),
                getContent(),
                getContent(),
                getContent(),
                getContent(),
                getContent(),
                getContent(),
                getContent(),
                getContent(),
                getContent(),
                getContent(),
                getContent(),
                getContent(),
                getContent(),
                getContent(),
                getContent(),
                getContent(),
                getContent(),
                getContent(),
                getContent(),
                getContent()
        );
        add(new Label("Test"), layout);
        setSizeFull();
    }

    Component getContent() {
        return new Card(
                new PrimaryLabel("Test")
        );
    }
}
