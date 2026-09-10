package com.badlogic.gdx.scenes.scene2d.utils;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

/* JADX INFO: loaded from: classes.dex */
public class DragListener extends InputListener {
    private int button;
    private float dragLastX;
    private float dragLastY;
    private float dragStartX;
    private float dragStartY;
    private float dragX;
    private float dragY;
    private boolean dragging;
    private float tapSquareSize = 14.0f;
    private float touchDownX = -1.0f;
    private float touchDownY = -1.0f;
    private float stageTouchDownX = -1.0f;
    private float stageTouchDownY = -1.0f;
    private int pressedPointer = -1;

    public void cancel() {
        this.dragging = false;
        this.pressedPointer = -1;
    }

    public void drag(InputEvent inputEvent, float f, float f2, int i) {
    }

    public void dragStart(InputEvent inputEvent, float f, float f2, int i) {
    }

    public void dragStop(InputEvent inputEvent, float f, float f2, int i) {
    }

    public int getButton() {
        return this.button;
    }

    public float getDeltaX() {
        return this.dragX - this.dragLastX;
    }

    public float getDeltaY() {
        return this.dragY - this.dragLastY;
    }

    public float getDragDistance() {
        return Vector2.len(this.dragX - this.dragStartX, this.dragY - this.dragStartY);
    }

    public float getDragStartX() {
        return this.dragStartX;
    }

    public float getDragStartY() {
        return this.dragStartY;
    }

    public float getDragX() {
        return this.dragX;
    }

    public float getDragY() {
        return this.dragY;
    }

    public float getStageTouchDownX() {
        return this.stageTouchDownX;
    }

    public float getStageTouchDownY() {
        return this.stageTouchDownY;
    }

    public float getTapSquareSize() {
        return this.tapSquareSize;
    }

    public float getTouchDownX() {
        return this.touchDownX;
    }

    public float getTouchDownY() {
        return this.touchDownY;
    }

    public boolean isDragging() {
        return this.dragging;
    }

    public void setButton(int i) {
        this.button = i;
    }

    public void setDragStartX(float f) {
        this.dragStartX = f;
    }

    public void setDragStartY(float f) {
        this.dragStartY = f;
    }

    public void setTapSquareSize(float f) {
        this.tapSquareSize = f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.InputListener
    public boolean touchDown(InputEvent inputEvent, float f, float f2, int i, int i2) {
        int i3;
        if (this.pressedPointer != -1) {
            return false;
        }
        if (i == 0 && (i3 = this.button) != -1 && i2 != i3) {
            return false;
        }
        this.pressedPointer = i;
        this.touchDownX = f;
        this.touchDownY = f2;
        this.stageTouchDownX = inputEvent.getStageX();
        this.stageTouchDownY = inputEvent.getStageY();
        return true;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.InputListener
    public void touchDragged(InputEvent inputEvent, float f, float f2, int i) {
        if (i != this.pressedPointer) {
            return;
        }
        if (!this.dragging && (Math.abs(this.touchDownX - f) > this.tapSquareSize || Math.abs(this.touchDownY - f2) > this.tapSquareSize)) {
            this.dragging = true;
            this.dragStartX = f;
            this.dragStartY = f2;
            dragStart(inputEvent, f, f2, i);
            this.dragX = f;
            this.dragY = f2;
        }
        if (this.dragging) {
            this.dragLastX = this.dragX;
            this.dragLastY = this.dragY;
            this.dragX = f;
            this.dragY = f2;
            drag(inputEvent, f, f2, i);
        }
    }

    @Override // com.badlogic.gdx.scenes.scene2d.InputListener
    public void touchUp(InputEvent inputEvent, float f, float f2, int i, int i2) {
        if (i == this.pressedPointer) {
            int i3 = this.button;
            if (i3 == -1 || i2 == i3) {
                if (this.dragging) {
                    dragStop(inputEvent, f, f2, i);
                }
                cancel();
            }
        }
    }
}
