package com.badlogic.gdx.scenes.scene2d.utils;

import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.utils.Timer;

/* JADX INFO: loaded from: classes.dex */
public class DragScrollListener extends DragListener {
    static final Vector2 tmpCoords = new Vector2();
    float padBottom;
    float padTop;
    private ScrollPane scroll;
    private Timer.Task scrollDown;
    private Timer.Task scrollUp;
    long startTime;
    Interpolation interpolation = Interpolation.exp5In;
    float minSpeed = 15.0f;
    float maxSpeed = 75.0f;
    float tickSecs = 0.05f;
    long rampTime = 1750;

    public DragScrollListener(final ScrollPane scrollPane) {
        this.scroll = scrollPane;
        this.scrollUp = new Timer.Task() { // from class: com.badlogic.gdx.scenes.scene2d.utils.DragScrollListener.1
            @Override // com.badlogic.gdx.utils.Timer.Task, java.lang.Runnable
            public void run() {
                DragScrollListener.this.scroll(scrollPane.getScrollY() - DragScrollListener.this.getScrollPixels());
            }
        };
        this.scrollDown = new Timer.Task() { // from class: com.badlogic.gdx.scenes.scene2d.utils.DragScrollListener.2
            @Override // com.badlogic.gdx.utils.Timer.Task, java.lang.Runnable
            public void run() {
                DragScrollListener.this.scroll(DragScrollListener.this.getScrollPixels() + scrollPane.getScrollY());
            }
        };
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.DragListener
    public void drag(InputEvent inputEvent, float f, float f2, int i) {
        Actor listenerActor = inputEvent.getListenerActor();
        ScrollPane scrollPane = this.scroll;
        Vector2 vector2 = tmpCoords;
        listenerActor.localToActorCoordinates(scrollPane, vector2.set(f, f2));
        if (isAbove(vector2.y)) {
            this.scrollDown.cancel();
            if (this.scrollUp.isScheduled()) {
                return;
            }
            this.startTime = System.currentTimeMillis();
            Timer.Task task = this.scrollUp;
            float f3 = this.tickSecs;
            Timer.schedule(task, f3, f3);
            return;
        }
        if (!isBelow(vector2.y)) {
            this.scrollUp.cancel();
            this.scrollDown.cancel();
            return;
        }
        this.scrollUp.cancel();
        if (this.scrollDown.isScheduled()) {
            return;
        }
        this.startTime = System.currentTimeMillis();
        Timer.Task task2 = this.scrollDown;
        float f4 = this.tickSecs;
        Timer.schedule(task2, f4, f4);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.DragListener
    public void dragStop(InputEvent inputEvent, float f, float f2, int i) {
        this.scrollUp.cancel();
        this.scrollDown.cancel();
    }

    public float getScrollPixels() {
        return this.interpolation.apply(this.minSpeed, this.maxSpeed, Math.min(1.0f, (System.currentTimeMillis() - this.startTime) / this.rampTime));
    }

    public boolean isAbove(float f) {
        return f >= this.scroll.getHeight() - this.padTop;
    }

    public boolean isBelow(float f) {
        return f < this.padBottom;
    }

    public void scroll(float f) {
        this.scroll.setScrollY(f);
    }

    public void setPadding(float f, float f2) {
        this.padTop = f;
        this.padBottom = f2;
    }

    public void setup(float f, float f2, float f3, float f4) {
        this.minSpeed = f;
        this.maxSpeed = f2;
        this.tickSecs = f3;
        this.rampTime = (long) (f4 * 1000.0f);
    }
}
