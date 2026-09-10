package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.utils.Null;
import com.badlogic.gdx.utils.Scaling;

/* JADX INFO: loaded from: classes.dex */
public class CheckBox extends TextButton {
    private Image image;
    private Cell imageCell;
    private CheckBoxStyle style;

    public static class CheckBoxStyle extends TextButton.TextButtonStyle {
        public Drawable checkboxOff;

        @Null
        public Drawable checkboxOffDisabled;
        public Drawable checkboxOn;

        @Null
        public Drawable checkboxOnDisabled;

        @Null
        public Drawable checkboxOnOver;

        @Null
        public Drawable checkboxOver;

        public CheckBoxStyle() {
        }

        public CheckBoxStyle(Drawable drawable, Drawable drawable2, BitmapFont bitmapFont, @Null Color color) {
            this.checkboxOff = drawable;
            this.checkboxOn = drawable2;
            this.font = bitmapFont;
            this.fontColor = color;
        }

        public CheckBoxStyle(CheckBoxStyle checkBoxStyle) {
            super(checkBoxStyle);
            this.checkboxOff = checkBoxStyle.checkboxOff;
            this.checkboxOn = checkBoxStyle.checkboxOn;
            this.checkboxOnOver = checkBoxStyle.checkboxOnOver;
            this.checkboxOver = checkBoxStyle.checkboxOver;
            this.checkboxOnDisabled = checkBoxStyle.checkboxOnDisabled;
            this.checkboxOffDisabled = checkBoxStyle.checkboxOffDisabled;
        }
    }

    public CheckBox(@Null String str, Skin skin) {
        this(str, (CheckBoxStyle) skin.get(CheckBoxStyle.class));
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextButton, com.badlogic.gdx.scenes.scene2d.ui.Button, com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(Batch batch, float f) {
        this.image.setDrawable(getImageDrawable());
        super.draw(batch, f);
    }

    public Image getImage() {
        return this.image;
    }

    public Cell getImageCell() {
        return this.imageCell;
    }

    @Null
    public Drawable getImageDrawable() {
        Drawable drawable;
        CheckBoxStyle checkBoxStyle;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        if (isDisabled()) {
            return (!this.isChecked || (drawable4 = this.style.checkboxOnDisabled) == null) ? this.style.checkboxOffDisabled : drawable4;
        }
        boolean z = isOver() && !isDisabled();
        if (!this.isChecked || (drawable2 = (checkBoxStyle = this.style).checkboxOn) == null) {
            return (!z || (drawable = this.style.checkboxOver) == null) ? this.style.checkboxOff : drawable;
        }
        return (!z || (drawable3 = checkBoxStyle.checkboxOnOver) == null) ? drawable2 : drawable3;
    }

    public Image newImage() {
        return new Image((Drawable) null, Scaling.none);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextButton, com.badlogic.gdx.scenes.scene2d.ui.Button
    public void setStyle(Button.ButtonStyle buttonStyle) {
        if (!(buttonStyle instanceof CheckBoxStyle)) {
            throw new IllegalArgumentException("style must be a CheckBoxStyle.");
        }
        this.style = (CheckBoxStyle) buttonStyle;
        super.setStyle(buttonStyle);
    }

    public CheckBox(@Null String str, Skin skin, String str2) {
        this(str, (CheckBoxStyle) skin.get(str2, CheckBoxStyle.class));
    }

    public CheckBox(@Null String str, CheckBoxStyle checkBoxStyle) {
        super(str, checkBoxStyle);
        Label label = getLabel();
        label.setAlignment(8);
        Image imageNewImage = newImage();
        this.image = imageNewImage;
        imageNewImage.setDrawable(checkBoxStyle.checkboxOff);
        clearChildren();
        this.imageCell = add(this.image);
        add(label);
        setSize(getPrefWidth(), getPrefHeight());
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextButton, com.badlogic.gdx.scenes.scene2d.ui.Button
    public CheckBoxStyle getStyle() {
        return this.style;
    }
}
