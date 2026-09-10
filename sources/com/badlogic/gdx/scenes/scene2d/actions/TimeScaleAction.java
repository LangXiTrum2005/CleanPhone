package com.badlogic.gdx.scenes.scene2d.actions;

import com.badlogic.gdx.scenes.scene2d.Action;

/* JADX INFO: loaded from: classes.dex */
public class TimeScaleAction extends DelegateAction {
    private float scale;

    @Override // com.badlogic.gdx.scenes.scene2d.actions.DelegateAction
    public boolean delegate(float f) {
        Action action = this.action;
        if (action == null) {
            return true;
        }
        return action.act(f * this.scale);
    }

    public float getScale() {
        return this.scale;
    }

    public void setScale(float f) {
        this.scale = f;
    }
}
