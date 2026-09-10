package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Disableable;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.utils.Null;
import com.badlogic.gdx.utils.Pools;
import com.badlogic.gdx.utils.SnapshotArray;

/* JADX INFO: loaded from: classes.dex */
public class Button extends Table implements Disableable {
    ButtonGroup buttonGroup;
    private ClickListener clickListener;
    boolean isChecked;
    boolean isDisabled;
    private boolean programmaticChangeEvents;
    private ButtonStyle style;

    public static class ButtonStyle {

        @Null
        public Drawable checked;

        @Null
        public Drawable checkedDown;

        @Null
        public Drawable checkedFocused;
        public float checkedOffsetX;
        public float checkedOffsetY;

        @Null
        public Drawable checkedOver;

        @Null
        public Drawable disabled;

        @Null
        public Drawable down;

        @Null
        public Drawable focused;

        @Null
        public Drawable over;
        public float pressedOffsetX;
        public float pressedOffsetY;
        public float unpressedOffsetX;
        public float unpressedOffsetY;

        @Null
        public Drawable up;

        public ButtonStyle() {
        }

        public ButtonStyle(@Null Drawable drawable, @Null Drawable drawable2, @Null Drawable drawable3) {
            this.up = drawable;
            this.down = drawable2;
            this.checked = drawable3;
        }

        public ButtonStyle(ButtonStyle buttonStyle) {
            this.up = buttonStyle.up;
            this.down = buttonStyle.down;
            this.over = buttonStyle.over;
            this.focused = buttonStyle.focused;
            this.disabled = buttonStyle.disabled;
            this.checked = buttonStyle.checked;
            this.checkedOver = buttonStyle.checkedOver;
            this.checkedDown = buttonStyle.checkedDown;
            this.checkedFocused = buttonStyle.checkedFocused;
            this.pressedOffsetX = buttonStyle.pressedOffsetX;
            this.pressedOffsetY = buttonStyle.pressedOffsetY;
            this.unpressedOffsetX = buttonStyle.unpressedOffsetX;
            this.unpressedOffsetY = buttonStyle.unpressedOffsetY;
            this.checkedOffsetX = buttonStyle.checkedOffsetX;
            this.checkedOffsetY = buttonStyle.checkedOffsetY;
        }
    }

    public Button(Skin skin) {
        super(skin);
        this.programmaticChangeEvents = true;
        initialize();
        setStyle((ButtonStyle) skin.get(ButtonStyle.class));
        setSize(getPrefWidth(), getPrefHeight());
    }

    private void initialize() {
        setTouchable(Touchable.enabled);
        ClickListener clickListener = new ClickListener() { // from class: com.badlogic.gdx.scenes.scene2d.ui.Button.1
            @Override // com.badlogic.gdx.scenes.scene2d.utils.ClickListener
            public void clicked(InputEvent inputEvent, float f, float f2) {
                if (Button.this.isDisabled()) {
                    return;
                }
                Button button = Button.this;
                button.setChecked(!button.isChecked, true);
            }
        };
        this.clickListener = clickListener;
        addListener(clickListener);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(Batch batch, float f) {
        float f2;
        float f3;
        validate();
        setBackground(getBackgroundDrawable());
        if (isPressed() && !isDisabled()) {
            ButtonStyle buttonStyle = this.style;
            f2 = buttonStyle.pressedOffsetX;
            f3 = buttonStyle.pressedOffsetY;
        } else if (!isChecked() || isDisabled()) {
            ButtonStyle buttonStyle2 = this.style;
            f2 = buttonStyle2.unpressedOffsetX;
            f3 = buttonStyle2.unpressedOffsetY;
        } else {
            ButtonStyle buttonStyle3 = this.style;
            f2 = buttonStyle3.checkedOffsetX;
            f3 = buttonStyle3.checkedOffsetY;
        }
        boolean z = (f2 == 0.0f && f3 == 0.0f) ? false : true;
        SnapshotArray<Actor> children = getChildren();
        if (z) {
            for (int i = 0; i < children.size; i++) {
                children.get(i).moveBy(f2, f3);
            }
        }
        super.draw(batch, f);
        if (z) {
            for (int i2 = 0; i2 < children.size; i2++) {
                children.get(i2).moveBy(-f2, -f3);
            }
        }
        Stage stage = getStage();
        if (stage == null || !stage.getActionsRequestRendering() || isPressed() == this.clickListener.isPressed()) {
            return;
        }
        Gdx.graphics.requestRendering();
    }

    @Null
    public Drawable getBackgroundDrawable() {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        if (isDisabled() && (drawable5 = this.style.disabled) != null) {
            return drawable5;
        }
        if (isPressed()) {
            if (isChecked() && (drawable4 = this.style.checkedDown) != null) {
                return drawable4;
            }
            Drawable drawable6 = this.style.down;
            if (drawable6 != null) {
                return drawable6;
            }
        }
        if (isOver()) {
            if (isChecked()) {
                Drawable drawable7 = this.style.checkedOver;
                if (drawable7 != null) {
                    return drawable7;
                }
            } else {
                Drawable drawable8 = this.style.over;
                if (drawable8 != null) {
                    return drawable8;
                }
            }
        }
        boolean zHasKeyboardFocus = hasKeyboardFocus();
        if (isChecked()) {
            if (zHasKeyboardFocus && (drawable3 = this.style.checkedFocused) != null) {
                return drawable3;
            }
            Drawable drawable9 = this.style.checked;
            if (drawable9 != null) {
                return drawable9;
            }
            if (isOver() && (drawable2 = this.style.over) != null) {
                return drawable2;
            }
        }
        return (!zHasKeyboardFocus || (drawable = this.style.focused) == null) ? this.style.up : drawable;
    }

    @Null
    public ButtonGroup getButtonGroup() {
        return this.buttonGroup;
    }

    public ClickListener getClickListener() {
        return this.clickListener;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinHeight() {
        return getPrefHeight();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinWidth() {
        return getPrefWidth();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
        float prefHeight = super.getPrefHeight();
        Drawable drawable = this.style.up;
        if (drawable != null) {
            prefHeight = Math.max(prefHeight, drawable.getMinHeight());
        }
        Drawable drawable2 = this.style.down;
        if (drawable2 != null) {
            prefHeight = Math.max(prefHeight, drawable2.getMinHeight());
        }
        Drawable drawable3 = this.style.checked;
        return drawable3 != null ? Math.max(prefHeight, drawable3.getMinHeight()) : prefHeight;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
        float prefWidth = super.getPrefWidth();
        Drawable drawable = this.style.up;
        if (drawable != null) {
            prefWidth = Math.max(prefWidth, drawable.getMinWidth());
        }
        Drawable drawable2 = this.style.down;
        if (drawable2 != null) {
            prefWidth = Math.max(prefWidth, drawable2.getMinWidth());
        }
        Drawable drawable3 = this.style.checked;
        return drawable3 != null ? Math.max(prefWidth, drawable3.getMinWidth()) : prefWidth;
    }

    public ButtonStyle getStyle() {
        return this.style;
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Disableable
    public boolean isDisabled() {
        return this.isDisabled;
    }

    public boolean isOver() {
        return this.clickListener.isOver();
    }

    public boolean isPressed() {
        return this.clickListener.isVisualPressed();
    }

    public void setChecked(boolean z) {
        setChecked(z, this.programmaticChangeEvents);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Disableable
    public void setDisabled(boolean z) {
        this.isDisabled = z;
    }

    public void setProgrammaticChangeEvents(boolean z) {
        this.programmaticChangeEvents = z;
    }

    public void setStyle(ButtonStyle buttonStyle) {
        if (buttonStyle == null) {
            throw new IllegalArgumentException("style cannot be null.");
        }
        this.style = buttonStyle;
        setBackground(getBackgroundDrawable());
    }

    public void toggle() {
        setChecked(!this.isChecked);
    }

    public void setChecked(boolean z, boolean z2) {
        if (this.isChecked == z) {
            return;
        }
        ButtonGroup buttonGroup = this.buttonGroup;
        if (buttonGroup == null || buttonGroup.canCheck(this, z)) {
            this.isChecked = z;
            if (z2) {
                ChangeListener.ChangeEvent changeEvent = (ChangeListener.ChangeEvent) Pools.obtain(ChangeListener.ChangeEvent.class);
                if (fire(changeEvent)) {
                    this.isChecked = !z;
                }
                Pools.free(changeEvent);
            }
        }
    }

    public Button(Skin skin, String str) {
        super(skin);
        this.programmaticChangeEvents = true;
        initialize();
        setStyle((ButtonStyle) skin.get(str, ButtonStyle.class));
        setSize(getPrefWidth(), getPrefHeight());
    }

    public Button(Actor actor, Skin skin, String str) {
        this(actor, (ButtonStyle) skin.get(str, ButtonStyle.class));
        setSkin(skin);
    }

    public Button(Actor actor, ButtonStyle buttonStyle) {
        this.programmaticChangeEvents = true;
        initialize();
        add(actor);
        setStyle(buttonStyle);
        setSize(getPrefWidth(), getPrefHeight());
    }

    public Button(ButtonStyle buttonStyle) {
        this.programmaticChangeEvents = true;
        initialize();
        setStyle(buttonStyle);
        setSize(getPrefWidth(), getPrefHeight());
    }

    public Button() {
        this.programmaticChangeEvents = true;
        initialize();
    }

    public Button(@Null Drawable drawable) {
        this(new ButtonStyle(drawable, null, null));
    }

    public Button(@Null Drawable drawable, @Null Drawable drawable2) {
        this(new ButtonStyle(drawable, drawable2, null));
    }

    public Button(@Null Drawable drawable, @Null Drawable drawable2, @Null Drawable drawable3) {
        this(new ButtonStyle(drawable, drawable2, drawable3));
    }

    public Button(Actor actor, Skin skin) {
        this(actor, (ButtonStyle) skin.get(ButtonStyle.class));
    }
}
