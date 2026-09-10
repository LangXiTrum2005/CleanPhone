package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.utils.Null;

/* JADX INFO: loaded from: classes.dex */
public class TextButton extends Button {
    private Label label;
    private TextButtonStyle style;

    public static class TextButtonStyle extends Button.ButtonStyle {

        @Null
        public Color checkedDownFontColor;

        @Null
        public Color checkedFocusedFontColor;

        @Null
        public Color checkedFontColor;

        @Null
        public Color checkedOverFontColor;

        @Null
        public Color disabledFontColor;

        @Null
        public Color downFontColor;

        @Null
        public Color focusedFontColor;
        public BitmapFont font;

        @Null
        public Color fontColor;

        @Null
        public Color overFontColor;

        public TextButtonStyle() {
        }

        public TextButtonStyle(@Null Drawable drawable, @Null Drawable drawable2, @Null Drawable drawable3, @Null BitmapFont bitmapFont) {
            super(drawable, drawable2, drawable3);
            this.font = bitmapFont;
        }

        public TextButtonStyle(TextButtonStyle textButtonStyle) {
            super(textButtonStyle);
            this.font = textButtonStyle.font;
            if (textButtonStyle.fontColor != null) {
                this.fontColor = new Color(textButtonStyle.fontColor);
            }
            if (textButtonStyle.downFontColor != null) {
                this.downFontColor = new Color(textButtonStyle.downFontColor);
            }
            if (textButtonStyle.overFontColor != null) {
                this.overFontColor = new Color(textButtonStyle.overFontColor);
            }
            if (textButtonStyle.focusedFontColor != null) {
                this.focusedFontColor = new Color(textButtonStyle.focusedFontColor);
            }
            if (textButtonStyle.disabledFontColor != null) {
                this.disabledFontColor = new Color(textButtonStyle.disabledFontColor);
            }
            if (textButtonStyle.checkedFontColor != null) {
                this.checkedFontColor = new Color(textButtonStyle.checkedFontColor);
            }
            if (textButtonStyle.checkedDownFontColor != null) {
                this.checkedDownFontColor = new Color(textButtonStyle.checkedDownFontColor);
            }
            if (textButtonStyle.checkedOverFontColor != null) {
                this.checkedOverFontColor = new Color(textButtonStyle.checkedOverFontColor);
            }
            if (textButtonStyle.checkedFocusedFontColor != null) {
                this.checkedFocusedFontColor = new Color(textButtonStyle.checkedFocusedFontColor);
            }
        }
    }

    public TextButton(@Null String str, Skin skin) {
        this(str, (TextButtonStyle) skin.get(TextButtonStyle.class));
        setSkin(skin);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Button, com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(Batch batch, float f) {
        this.label.getStyle().fontColor = getFontColor();
        super.draw(batch, f);
    }

    @Null
    public Color getFontColor() {
        Color color;
        Color color2;
        Color color3;
        Color color4;
        Color color5;
        if (isDisabled() && (color5 = this.style.disabledFontColor) != null) {
            return color5;
        }
        if (isPressed()) {
            if (isChecked() && (color4 = this.style.checkedDownFontColor) != null) {
                return color4;
            }
            Color color6 = this.style.downFontColor;
            if (color6 != null) {
                return color6;
            }
        }
        if (isOver()) {
            if (isChecked()) {
                Color color7 = this.style.checkedOverFontColor;
                if (color7 != null) {
                    return color7;
                }
            } else {
                Color color8 = this.style.overFontColor;
                if (color8 != null) {
                    return color8;
                }
            }
        }
        boolean zHasKeyboardFocus = hasKeyboardFocus();
        if (isChecked()) {
            if (zHasKeyboardFocus && (color3 = this.style.checkedFocusedFontColor) != null) {
                return color3;
            }
            Color color9 = this.style.checkedFontColor;
            if (color9 != null) {
                return color9;
            }
            if (isOver() && (color2 = this.style.overFontColor) != null) {
                return color2;
            }
        }
        return (!zHasKeyboardFocus || (color = this.style.focusedFontColor) == null) ? this.style.fontColor : color;
    }

    public Label getLabel() {
        return this.label;
    }

    public Cell<Label> getLabelCell() {
        return getCell(this.label);
    }

    public CharSequence getText() {
        return this.label.getText();
    }

    public Label newLabel(String str, Label.LabelStyle labelStyle) {
        return new Label(str, labelStyle);
    }

    public void setLabel(Label label) {
        if (label == null) {
            throw new IllegalArgumentException("label cannot be null.");
        }
        getLabelCell().setActor(label);
        this.label = label;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Button
    public void setStyle(Button.ButtonStyle buttonStyle) {
        if (buttonStyle == null) {
            throw new NullPointerException("style cannot be null");
        }
        if (!(buttonStyle instanceof TextButtonStyle)) {
            throw new IllegalArgumentException("style must be a TextButtonStyle.");
        }
        TextButtonStyle textButtonStyle = (TextButtonStyle) buttonStyle;
        this.style = textButtonStyle;
        super.setStyle(buttonStyle);
        Label label = this.label;
        if (label != null) {
            Label.LabelStyle style = label.getStyle();
            style.font = textButtonStyle.font;
            style.fontColor = textButtonStyle.fontColor;
            this.label.setStyle(style);
        }
    }

    public void setText(@Null String str) {
        this.label.setText(str);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public String toString() {
        String name = getName();
        if (name != null) {
            return name;
        }
        String name2 = getClass().getName();
        int iLastIndexOf = name2.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            name2 = name2.substring(iLastIndexOf + 1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(name2.indexOf(36) != -1 ? "TextButton " : "");
        sb.append(name2);
        sb.append(": ");
        sb.append((Object) this.label.getText());
        return sb.toString();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Button
    public TextButtonStyle getStyle() {
        return this.style;
    }

    public TextButton(@Null String str, Skin skin, String str2) {
        this(str, (TextButtonStyle) skin.get(str2, TextButtonStyle.class));
        setSkin(skin);
    }

    public TextButton(@Null String str, TextButtonStyle textButtonStyle) {
        setStyle(textButtonStyle);
        Label labelNewLabel = newLabel(str, new Label.LabelStyle(textButtonStyle.font, textButtonStyle.fontColor));
        this.label = labelNewLabel;
        labelNewLabel.setAlignment(1);
        add(this.label).grow();
        setSize(getPrefWidth(), getPrefHeight());
    }
}
