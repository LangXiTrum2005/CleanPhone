package com.badlogic.gdx.scenes.scene2d;

import com.badlogic.gdx.utils.Pool;

/* JADX INFO: loaded from: classes.dex */
public class Event implements Pool.Poolable {
    private boolean bubbles = true;
    private boolean cancelled;
    private boolean capture;
    private boolean handled;
    private Actor listenerActor;
    private Stage stage;
    private boolean stopped;
    private Actor targetActor;

    public void cancel() {
        this.cancelled = true;
        this.stopped = true;
        this.handled = true;
    }

    public boolean getBubbles() {
        return this.bubbles;
    }

    public Actor getListenerActor() {
        return this.listenerActor;
    }

    public Stage getStage() {
        return this.stage;
    }

    public Actor getTarget() {
        return this.targetActor;
    }

    public void handle() {
        this.handled = true;
    }

    public boolean isCancelled() {
        return this.cancelled;
    }

    public boolean isCapture() {
        return this.capture;
    }

    public boolean isHandled() {
        return this.handled;
    }

    public boolean isStopped() {
        return this.stopped;
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
        this.stage = null;
        this.targetActor = null;
        this.listenerActor = null;
        this.capture = false;
        this.bubbles = true;
        this.handled = false;
        this.stopped = false;
        this.cancelled = false;
    }

    public void setBubbles(boolean z) {
        this.bubbles = z;
    }

    public void setCapture(boolean z) {
        this.capture = z;
    }

    public void setListenerActor(Actor actor) {
        this.listenerActor = actor;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setTarget(Actor actor) {
        this.targetActor = actor;
    }

    public void stop() {
        this.stopped = true;
    }
}
