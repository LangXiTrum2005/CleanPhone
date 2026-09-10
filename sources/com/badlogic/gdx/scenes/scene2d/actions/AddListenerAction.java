package com.badlogic.gdx.scenes.scene2d.actions;

import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.EventListener;

/* JADX INFO: loaded from: classes.dex */
public class AddListenerAction extends Action {
    private boolean capture;
    private EventListener listener;

    @Override // com.badlogic.gdx.scenes.scene2d.Action
    public boolean act(float f) {
        if (this.capture) {
            this.target.addCaptureListener(this.listener);
            return true;
        }
        this.target.addListener(this.listener);
        return true;
    }

    public boolean getCapture() {
        return this.capture;
    }

    public EventListener getListener() {
        return this.listener;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action, com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
        super.reset();
        this.listener = null;
    }

    public void setCapture(boolean z) {
        this.capture = z;
    }

    public void setListener(EventListener eventListener) {
        this.listener = eventListener;
    }
}
