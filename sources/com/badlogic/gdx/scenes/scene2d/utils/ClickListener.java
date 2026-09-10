package com.badlogic.gdx.scenes.scene2d.utils;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.utils.Null;
import com.badlogic.gdx.utils.TimeUtils;

/* JADX INFO: loaded from: classes.dex */
public class ClickListener extends InputListener {
    public static float visualPressedDuration = 0.1f;
    private int button;
    private boolean cancelled;
    private long lastTapTime;
    private boolean over;
    private boolean pressed;
    private int tapCount;
    private long visualPressedTime;
    private float tapSquareSize = 14.0f;
    private float touchDownX = -1.0f;
    private float touchDownY = -1.0f;
    private int pressedPointer = -1;
    private int pressedButton = -1;
    private long tapCountInterval = 400000000;

    public ClickListener() {
    }

    public void cancel() {
        if (this.pressedPointer == -1) {
            return;
        }
        this.cancelled = true;
        this.pressed = false;
    }

    public void clicked(InputEvent inputEvent, float f, float f2) {
    }

    @Override // com.badlogic.gdx.scenes.scene2d.InputListener
    public void enter(InputEvent inputEvent, float f, float f2, int i, @Null Actor actor) {
        if (i != -1 || this.cancelled) {
            return;
        }
        this.over = true;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.InputListener
    public void exit(InputEvent inputEvent, float f, float f2, int i, @Null Actor actor) {
        if (i != -1 || this.cancelled) {
            return;
        }
        this.over = false;
    }

    public int getButton() {
        return this.button;
    }

    public int getPressedButton() {
        return this.pressedButton;
    }

    public int getPressedPointer() {
        return this.pressedPointer;
    }

    public int getTapCount() {
        return this.tapCount;
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

    public boolean inTapSquare(float f, float f2) {
        float f3 = this.touchDownX;
        return !(f3 == -1.0f && this.touchDownY == -1.0f) && Math.abs(f - f3) < this.tapSquareSize && Math.abs(f2 - this.touchDownY) < this.tapSquareSize;
    }

    public void invalidateTapSquare() {
        this.touchDownX = -1.0f;
        this.touchDownY = -1.0f;
    }

    public boolean isOver(Actor actor, float f, float f2) {
        Actor actorHit = actor.hit(f, f2, true);
        if (actorHit == null || !actorHit.isDescendantOf(actor)) {
            return inTapSquare(f, f2);
        }
        return true;
    }

    public boolean isPressed() {
        return this.pressed;
    }

    public boolean isVisualPressed() {
        if (this.pressed) {
            return true;
        }
        long j = this.visualPressedTime;
        if (j <= 0) {
            return false;
        }
        if (j > TimeUtils.millis()) {
            return true;
        }
        this.visualPressedTime = 0L;
        return false;
    }

    public void setButton(int i) {
        this.button = i;
    }

    public void setTapCount(int i) {
        this.tapCount = i;
    }

    public void setTapCountInterval(float f) {
        this.tapCountInterval = (long) (f * 1.0E9f);
    }

    public void setTapSquareSize(float f) {
        this.tapSquareSize = f;
    }

    public void setVisualPressed(boolean z) {
        if (z) {
            this.visualPressedTime = TimeUtils.millis() + ((long) (visualPressedDuration * 1000.0f));
        } else {
            this.visualPressedTime = 0L;
        }
    }

    @Override // com.badlogic.gdx.scenes.scene2d.InputListener
    public boolean touchDown(InputEvent inputEvent, float f, float f2, int i, int i2) {
        int i3;
        if (this.pressed) {
            return false;
        }
        if (i == 0 && (i3 = this.button) != -1 && i2 != i3) {
            return false;
        }
        this.pressed = true;
        this.pressedPointer = i;
        this.pressedButton = i2;
        this.touchDownX = f;
        this.touchDownY = f2;
        setVisualPressed(true);
        return true;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.InputListener
    public void touchDragged(InputEvent inputEvent, float f, float f2, int i) {
        if (i != this.pressedPointer || this.cancelled) {
            return;
        }
        boolean zIsOver = isOver(inputEvent.getListenerActor(), f, f2);
        this.pressed = zIsOver;
        if (zIsOver) {
            return;
        }
        invalidateTapSquare();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.InputListener
    public void touchUp(InputEvent inputEvent, float f, float f2, int i, int i2) {
        boolean zIsOver;
        int i3;
        if (i == this.pressedPointer) {
            if (!this.cancelled && ((!(zIsOver = isOver(inputEvent.getListenerActor(), f, f2)) || i != 0 || (i3 = this.button) == -1 || i2 == i3) && zIsOver)) {
                long jNanoTime = TimeUtils.nanoTime();
                if (jNanoTime - this.lastTapTime > this.tapCountInterval) {
                    this.tapCount = 0;
                }
                this.tapCount++;
                this.lastTapTime = jNanoTime;
                clicked(inputEvent, f, f2);
            }
            this.pressed = false;
            this.pressedPointer = -1;
            this.pressedButton = -1;
            this.cancelled = false;
        }
    }

    public boolean inTapSquare() {
        return this.touchDownX != -1.0f;
    }

    public boolean isOver() {
        return this.over || this.pressed;
    }

    public ClickListener(int i) {
        this.button = i;
    }
}
