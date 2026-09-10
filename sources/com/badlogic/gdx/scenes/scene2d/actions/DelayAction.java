package com.badlogic.gdx.scenes.scene2d.actions;

import com.badlogic.gdx.scenes.scene2d.Action;

/* JADX INFO: loaded from: classes.dex */
public class DelayAction extends DelegateAction {
    private float duration;
    private float time;

    public DelayAction() {
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.DelegateAction
    public boolean delegate(float f) {
        float f2 = this.time;
        float f3 = this.duration;
        if (f2 < f3) {
            float f4 = f2 + f;
            this.time = f4;
            if (f4 < f3) {
                return false;
            }
            f = f4 - f3;
        }
        Action action = this.action;
        if (action == null) {
            return true;
        }
        return action.act(f);
    }

    public void finish() {
        this.time = this.duration;
    }

    public float getDuration() {
        return this.duration;
    }

    public float getTime() {
        return this.time;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.DelegateAction, com.badlogic.gdx.scenes.scene2d.Action
    public void restart() {
        super.restart();
        this.time = 0.0f;
    }

    public void setDuration(float f) {
        this.duration = f;
    }

    public void setTime(float f) {
        this.time = f;
    }

    public DelayAction(float f) {
        this.duration = f;
    }
}
