package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.utils.Cullable;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.Layout;
import com.badlogic.gdx.utils.Null;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes.dex */
public class Container<T extends Actor> extends WidgetGroup {

    @Null
    private T actor;
    private int align;

    @Null
    private Drawable background;
    private boolean clip;
    private float fillX;
    private float fillY;
    private Value maxHeight;
    private Value maxWidth;
    private Value minHeight;
    private Value minWidth;
    private Value padBottom;
    private Value padLeft;
    private Value padRight;
    private Value padTop;
    private Value prefHeight;
    private Value prefWidth;
    private boolean round;

    public Container() {
        this.minWidth = Value.minWidth;
        this.minHeight = Value.minHeight;
        this.prefWidth = Value.prefWidth;
        this.prefHeight = Value.prefHeight;
        Value.Fixed fixed = Value.zero;
        this.maxWidth = fixed;
        this.maxHeight = fixed;
        this.padTop = fixed;
        this.padLeft = fixed;
        this.padBottom = fixed;
        this.padRight = fixed;
        this.round = true;
        setTouchable(Touchable.childrenOnly);
        setTransform(false);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    @Deprecated
    public void addActor(Actor actor) {
        throw new UnsupportedOperationException("Use Container#setActor.");
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    @Deprecated
    public void addActorAfter(Actor actor, Actor actor2) {
        throw new UnsupportedOperationException("Use Container#setActor.");
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    @Deprecated
    public void addActorAt(int i, Actor actor) {
        throw new UnsupportedOperationException("Use Container#setActor.");
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    @Deprecated
    public void addActorBefore(Actor actor, Actor actor2) {
        throw new UnsupportedOperationException("Use Container#setActor.");
    }

    public Container<T> align(int i) {
        this.align = i;
        return this;
    }

    public Container<T> background(@Null Drawable drawable) {
        setBackground(drawable);
        return this;
    }

    public Container<T> bottom() {
        this.align = (this.align | 4) & (-3);
        return this;
    }

    public Container<T> center() {
        this.align = 1;
        return this;
    }

    public Container<T> clip() {
        setClip(true);
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(Batch batch, float f) {
        validate();
        if (!isTransform()) {
            drawBackground(batch, f, getX(), getY());
            super.draw(batch, f);
            return;
        }
        applyTransform(batch, computeTransform());
        drawBackground(batch, f, 0.0f, 0.0f);
        if (this.clip) {
            batch.flush();
            float f2 = this.padLeft.get(this);
            float f3 = this.padBottom.get(this);
            if (clipBegin(f2, f3, (getWidth() - f2) - this.padRight.get(this), (getHeight() - f3) - this.padTop.get(this))) {
                drawChildren(batch, f);
                batch.flush();
                clipEnd();
            }
        } else {
            drawChildren(batch, f);
        }
        resetTransform(batch);
    }

    public void drawBackground(Batch batch, float f, float f2, float f3) {
        if (this.background == null) {
            return;
        }
        Color color = getColor();
        batch.setColor(color.r, color.g, color.b, color.f202a * f);
        this.background.draw(batch, f2, f3, getWidth(), getHeight());
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void drawDebug(ShapeRenderer shapeRenderer) {
        validate();
        if (!isTransform()) {
            super.drawDebug(shapeRenderer);
            return;
        }
        applyTransform(shapeRenderer, computeTransform());
        if (this.clip) {
            shapeRenderer.flush();
            float f = this.padLeft.get(this);
            float f2 = this.padBottom.get(this);
            if (this.background == null ? clipBegin(0.0f, 0.0f, getWidth(), getHeight()) : clipBegin(f, f2, (getWidth() - f) - this.padRight.get(this), (getHeight() - f2) - this.padTop.get(this))) {
                drawDebugChildren(shapeRenderer);
                clipEnd();
            }
        } else {
            drawDebugChildren(shapeRenderer);
        }
        resetTransform(shapeRenderer);
    }

    public Container<T> fill() {
        this.fillX = 1.0f;
        this.fillY = 1.0f;
        return this;
    }

    public Container<T> fillX() {
        this.fillX = 1.0f;
        return this;
    }

    public Container<T> fillY() {
        this.fillY = 1.0f;
        return this;
    }

    @Null
    public T getActor() {
        return this.actor;
    }

    public int getAlign() {
        return this.align;
    }

    @Null
    public Drawable getBackground() {
        return this.background;
    }

    public boolean getClip() {
        return this.clip;
    }

    public float getFillX() {
        return this.fillX;
    }

    public float getFillY() {
        return this.fillY;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMaxHeight() {
        float f = this.maxHeight.get(this.actor);
        if (f <= 0.0f) {
            return f;
        }
        return f + this.padBottom.get(this) + this.padTop.get(this);
    }

    public Value getMaxHeightValue() {
        return this.maxHeight;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMaxWidth() {
        float f = this.maxWidth.get(this.actor);
        if (f <= 0.0f) {
            return f;
        }
        return f + this.padRight.get(this) + this.padLeft.get(this);
    }

    public Value getMaxWidthValue() {
        return this.maxWidth;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinHeight() {
        return this.padBottom.get(this) + this.padTop.get(this) + this.minHeight.get(this.actor);
    }

    public Value getMinHeightValue() {
        return this.minHeight;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinWidth() {
        return this.padRight.get(this) + this.padLeft.get(this) + this.minWidth.get(this.actor);
    }

    public float getPadBottom() {
        return this.padBottom.get(this);
    }

    public Value getPadBottomValue() {
        return this.padBottom;
    }

    public float getPadLeft() {
        return this.padLeft.get(this);
    }

    public Value getPadLeftValue() {
        return this.padLeft;
    }

    public float getPadRight() {
        return this.padRight.get(this);
    }

    public Value getPadRightValue() {
        return this.padRight;
    }

    public float getPadTop() {
        return this.padTop.get(this);
    }

    public Value getPadTopValue() {
        return this.padTop;
    }

    public float getPadX() {
        return this.padRight.get(this) + this.padLeft.get(this);
    }

    public float getPadY() {
        return this.padBottom.get(this) + this.padTop.get(this);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
        float fMax = this.prefHeight.get(this.actor);
        Drawable drawable = this.background;
        if (drawable != null) {
            fMax = Math.max(fMax, drawable.getMinHeight());
        }
        return Math.max(getMinHeight(), this.padBottom.get(this) + this.padTop.get(this) + fMax);
    }

    public Value getPrefHeightValue() {
        return this.prefHeight;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
        float fMax = this.prefWidth.get(this.actor);
        Drawable drawable = this.background;
        if (drawable != null) {
            fMax = Math.max(fMax, drawable.getMinWidth());
        }
        return Math.max(getMinWidth(), this.padRight.get(this) + this.padLeft.get(this) + fMax);
    }

    public Value getPrefWidthValue() {
        return this.prefWidth;
    }

    public Container<T> height(Value value) {
        if (value == null) {
            throw new IllegalArgumentException("height cannot be null.");
        }
        this.minHeight = value;
        this.prefHeight = value;
        this.maxHeight = value;
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    @Null
    public Actor hit(float f, float f2, boolean z) {
        if (!this.clip || (!(z && getTouchable() == Touchable.disabled) && f >= 0.0f && f < getWidth() && f2 >= 0.0f && f2 < getHeight())) {
            return super.hit(f, f2, z);
        }
        return null;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public void layout() {
        if (this.actor == null) {
            return;
        }
        float fC = this.padLeft.get(this);
        float fC2 = this.padBottom.get(this);
        float width = (getWidth() - fC) - this.padRight.get(this);
        float height = (getHeight() - fC2) - this.padTop.get(this);
        float f = this.minWidth.get(this.actor);
        float f2 = this.minHeight.get(this.actor);
        float f3 = this.prefWidth.get(this.actor);
        float f4 = this.prefHeight.get(this.actor);
        float fCeil = this.maxWidth.get(this.actor);
        float fCeil2 = this.maxHeight.get(this.actor);
        float f5 = this.fillX;
        float fMin = f5 > 0.0f ? f5 * width : Math.min(f3, width);
        if (fMin >= f) {
            f = fMin;
        }
        if (fCeil <= 0.0f || f <= fCeil) {
            fCeil = f;
        }
        float f6 = this.fillY;
        float fMin2 = f6 > 0.0f ? f6 * height : Math.min(f4, height);
        if (fMin2 >= f2) {
            f2 = fMin2;
        }
        if (fCeil2 <= 0.0f || f2 <= fCeil2) {
            fCeil2 = f2;
        }
        int i = this.align;
        if ((i & 16) != 0) {
            fC += width - fCeil;
        } else if ((i & 8) == 0) {
            fC = DM.c(width, fCeil, 2.0f, fC);
        }
        if ((i & 2) != 0) {
            fC2 += height - fCeil2;
        } else if ((i & 4) == 0) {
            fC2 = DM.c(height, fCeil2, 2.0f, fC2);
        }
        if (this.round) {
            fC = (float) Math.floor(fC);
            fC2 = (float) Math.floor(fC2);
            fCeil = (float) Math.ceil(fCeil);
            fCeil2 = (float) Math.ceil(fCeil2);
        }
        this.actor.setBounds(fC, fC2, fCeil, fCeil2);
        T t = this.actor;
        if (t instanceof Layout) {
            ((Layout) t).validate();
        }
    }

    public Container<T> left() {
        this.align = (this.align | 8) & (-17);
        return this;
    }

    public Container<T> maxHeight(Value value) {
        if (value == null) {
            throw new IllegalArgumentException("maxHeight cannot be null.");
        }
        this.maxHeight = value;
        return this;
    }

    public Container<T> maxSize(Value value) {
        if (value == null) {
            throw new IllegalArgumentException("size cannot be null.");
        }
        this.maxWidth = value;
        this.maxHeight = value;
        return this;
    }

    public Container<T> maxWidth(Value value) {
        if (value == null) {
            throw new IllegalArgumentException("maxWidth cannot be null.");
        }
        this.maxWidth = value;
        return this;
    }

    public Container<T> minHeight(Value value) {
        if (value == null) {
            throw new IllegalArgumentException("minHeight cannot be null.");
        }
        this.minHeight = value;
        return this;
    }

    public Container<T> minSize(Value value) {
        if (value == null) {
            throw new IllegalArgumentException("size cannot be null.");
        }
        this.minWidth = value;
        this.minHeight = value;
        return this;
    }

    public Container<T> minWidth(Value value) {
        if (value == null) {
            throw new IllegalArgumentException("minWidth cannot be null.");
        }
        this.minWidth = value;
        return this;
    }

    public Container<T> pad(Value value) {
        if (value == null) {
            throw new IllegalArgumentException("pad cannot be null.");
        }
        this.padTop = value;
        this.padLeft = value;
        this.padBottom = value;
        this.padRight = value;
        return this;
    }

    public Container<T> padBottom(Value value) {
        if (value == null) {
            throw new IllegalArgumentException("padBottom cannot be null.");
        }
        this.padBottom = value;
        return this;
    }

    public Container<T> padLeft(Value value) {
        if (value == null) {
            throw new IllegalArgumentException("padLeft cannot be null.");
        }
        this.padLeft = value;
        return this;
    }

    public Container<T> padRight(Value value) {
        if (value == null) {
            throw new IllegalArgumentException("padRight cannot be null.");
        }
        this.padRight = value;
        return this;
    }

    public Container<T> padTop(Value value) {
        if (value == null) {
            throw new IllegalArgumentException("padTop cannot be null.");
        }
        this.padTop = value;
        return this;
    }

    public Container<T> prefHeight(Value value) {
        if (value == null) {
            throw new IllegalArgumentException("prefHeight cannot be null.");
        }
        this.prefHeight = value;
        return this;
    }

    public Container<T> prefSize(Value value) {
        if (value == null) {
            throw new IllegalArgumentException("size cannot be null.");
        }
        this.prefWidth = value;
        this.prefHeight = value;
        return this;
    }

    public Container<T> prefWidth(Value value) {
        if (value == null) {
            throw new IllegalArgumentException("prefWidth cannot be null.");
        }
        this.prefWidth = value;
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    public boolean removeActor(Actor actor) {
        if (actor == null) {
            throw new IllegalArgumentException("actor cannot be null.");
        }
        if (actor != this.actor) {
            return false;
        }
        setActor(null);
        return true;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    public Actor removeActorAt(int i, boolean z) {
        Actor actorRemoveActorAt = super.removeActorAt(i, z);
        if (actorRemoveActorAt == this.actor) {
            this.actor = null;
        }
        return actorRemoveActorAt;
    }

    public Container<T> right() {
        this.align = (this.align | 16) & (-9);
        return this;
    }

    public void setActor(@Null T t) {
        if (t == this) {
            throw new IllegalArgumentException("actor cannot be the Container.");
        }
        T t2 = this.actor;
        if (t == t2) {
            return;
        }
        if (t2 != null) {
            super.removeActor(t2);
        }
        this.actor = t;
        if (t != null) {
            super.addActor(t);
        }
    }

    public void setBackground(@Null Drawable drawable) {
        setBackground(drawable, true);
    }

    public void setClip(boolean z) {
        this.clip = z;
        setTransform(z);
        invalidate();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.utils.Cullable
    public void setCullingArea(Rectangle rectangle) {
        super.setCullingArea(rectangle);
        if (this.fillX == 1.0f && this.fillY == 1.0f) {
            T t = this.actor;
            if (t instanceof Cullable) {
                ((Cullable) t).setCullingArea(rectangle);
            }
        }
    }

    public void setRound(boolean z) {
        this.round = z;
    }

    public Container<T> size(Value value) {
        if (value == null) {
            throw new IllegalArgumentException("size cannot be null.");
        }
        this.minWidth = value;
        this.minHeight = value;
        this.prefWidth = value;
        this.prefHeight = value;
        this.maxWidth = value;
        this.maxHeight = value;
        return this;
    }

    public Container<T> top() {
        this.align = (this.align | 2) & (-5);
        return this;
    }

    public Container<T> width(Value value) {
        if (value == null) {
            throw new IllegalArgumentException("width cannot be null.");
        }
        this.minWidth = value;
        this.prefWidth = value;
        this.maxWidth = value;
        return this;
    }

    public Container<T> clip(boolean z) {
        setClip(z);
        return this;
    }

    public void setBackground(@Null Drawable drawable, boolean z) {
        if (this.background == drawable) {
            return;
        }
        this.background = drawable;
        if (z) {
            if (drawable == null) {
                pad(Value.zero);
            } else {
                pad(drawable.getTopHeight(), drawable.getLeftWidth(), drawable.getBottomHeight(), drawable.getRightWidth());
            }
            invalidate();
        }
    }

    public Container<T> fill(float f, float f2) {
        this.fillX = f;
        this.fillY = f2;
        return this;
    }

    public Container<T> maxHeight(float f) {
        this.maxHeight = Value.Fixed.valueOf(f);
        return this;
    }

    public Container<T> maxWidth(float f) {
        this.maxWidth = Value.Fixed.valueOf(f);
        return this;
    }

    public Container<T> minHeight(float f) {
        this.minHeight = Value.Fixed.valueOf(f);
        return this;
    }

    public Container<T> minWidth(float f) {
        this.minWidth = Value.Fixed.valueOf(f);
        return this;
    }

    public Container<T> padBottom(float f) {
        this.padBottom = Value.Fixed.valueOf(f);
        return this;
    }

    public Container<T> padLeft(float f) {
        this.padLeft = Value.Fixed.valueOf(f);
        return this;
    }

    public Container<T> padRight(float f) {
        this.padRight = Value.Fixed.valueOf(f);
        return this;
    }

    public Container<T> padTop(float f) {
        this.padTop = Value.Fixed.valueOf(f);
        return this;
    }

    public Container<T> prefHeight(float f) {
        this.prefHeight = Value.Fixed.valueOf(f);
        return this;
    }

    public Container<T> prefWidth(float f) {
        this.prefWidth = Value.Fixed.valueOf(f);
        return this;
    }

    public Container<T> maxSize(Value value, Value value2) {
        if (value == null) {
            throw new IllegalArgumentException("width cannot be null.");
        }
        if (value2 != null) {
            this.maxWidth = value;
            this.maxHeight = value2;
            return this;
        }
        throw new IllegalArgumentException("height cannot be null.");
    }

    public Container<T> minSize(Value value, Value value2) {
        if (value == null) {
            throw new IllegalArgumentException("width cannot be null.");
        }
        if (value2 != null) {
            this.minWidth = value;
            this.minHeight = value2;
            return this;
        }
        throw new IllegalArgumentException("height cannot be null.");
    }

    public Container<T> prefSize(Value value, Value value2) {
        if (value == null) {
            throw new IllegalArgumentException("width cannot be null.");
        }
        if (value2 != null) {
            this.prefWidth = value;
            this.prefHeight = value2;
            return this;
        }
        throw new IllegalArgumentException("height cannot be null.");
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    public boolean removeActor(Actor actor, boolean z) {
        if (actor != null) {
            if (actor != this.actor) {
                return false;
            }
            this.actor = null;
            return super.removeActor(actor, z);
        }
        throw new IllegalArgumentException("actor cannot be null.");
    }

    public Container<T> fill(boolean z, boolean z2) {
        this.fillX = z ? 1.0f : 0.0f;
        this.fillY = z2 ? 1.0f : 0.0f;
        return this;
    }

    public Container<T> height(float f) {
        height(Value.Fixed.valueOf(f));
        return this;
    }

    public Container<T> width(float f) {
        width(Value.Fixed.valueOf(f));
        return this;
    }

    public Container<T> pad(Value value, Value value2, Value value3, Value value4) {
        if (value == null) {
            throw new IllegalArgumentException("top cannot be null.");
        }
        if (value2 == null) {
            throw new IllegalArgumentException("left cannot be null.");
        }
        if (value3 == null) {
            throw new IllegalArgumentException("bottom cannot be null.");
        }
        if (value4 != null) {
            this.padTop = value;
            this.padLeft = value2;
            this.padBottom = value3;
            this.padRight = value4;
            return this;
        }
        throw new IllegalArgumentException("right cannot be null.");
    }

    public Container<T> fill(boolean z) {
        this.fillX = z ? 1.0f : 0.0f;
        this.fillY = z ? 1.0f : 0.0f;
        return this;
    }

    public Container<T> maxSize(float f) {
        maxSize(Value.Fixed.valueOf(f));
        return this;
    }

    public Container<T> minSize(float f) {
        minSize(Value.Fixed.valueOf(f));
        return this;
    }

    public Container<T> prefSize(float f, float f2) {
        prefSize(Value.Fixed.valueOf(f), Value.Fixed.valueOf(f2));
        return this;
    }

    public Container<T> size(Value value, Value value2) {
        if (value == null) {
            throw new IllegalArgumentException("width cannot be null.");
        }
        if (value2 != null) {
            this.minWidth = value;
            this.minHeight = value2;
            this.prefWidth = value;
            this.prefHeight = value2;
            this.maxWidth = value;
            this.maxHeight = value2;
            return this;
        }
        throw new IllegalArgumentException("height cannot be null.");
    }

    public Container(@Null T t) {
        this();
        setActor(t);
    }

    public Container<T> maxSize(float f, float f2) {
        maxSize(Value.Fixed.valueOf(f), Value.Fixed.valueOf(f2));
        return this;
    }

    public Container<T> minSize(float f, float f2) {
        minSize(Value.Fixed.valueOf(f), Value.Fixed.valueOf(f2));
        return this;
    }

    public Container<T> prefSize(float f) {
        prefSize(Value.Fixed.valueOf(f));
        return this;
    }

    public Container<T> pad(float f) {
        Value.Fixed fixedValueOf = Value.Fixed.valueOf(f);
        this.padTop = fixedValueOf;
        this.padLeft = fixedValueOf;
        this.padBottom = fixedValueOf;
        this.padRight = fixedValueOf;
        return this;
    }

    public Container<T> size(float f) {
        size(Value.Fixed.valueOf(f));
        return this;
    }

    public Container<T> size(float f, float f2) {
        size(Value.Fixed.valueOf(f), Value.Fixed.valueOf(f2));
        return this;
    }

    public Container<T> pad(float f, float f2, float f3, float f4) {
        this.padTop = Value.Fixed.valueOf(f);
        this.padLeft = Value.Fixed.valueOf(f2);
        this.padBottom = Value.Fixed.valueOf(f3);
        this.padRight = Value.Fixed.valueOf(f4);
        return this;
    }
}
