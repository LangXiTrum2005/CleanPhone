package com.badlogic.gdx.scenes.scene2d.actions;

import com.badlogic.gdx.scenes.scene2d.Action;

/* JADX INFO: loaded from: classes.dex */
public class RepeatAction extends DelegateAction {
    public static final int FOREVER = -1;
    private int executedCount;
    private boolean finished;
    private int repeatCount;

    @Override // com.badlogic.gdx.scenes.scene2d.actions.DelegateAction
    public boolean delegate(float f) {
        if (this.executedCount == this.repeatCount) {
            return true;
        }
        if (!this.action.act(f)) {
            return false;
        }
        if (this.finished) {
            return true;
        }
        int i = this.repeatCount;
        if (i > 0) {
            this.executedCount++;
        }
        if (this.executedCount == i) {
            return true;
        }
        Action action = this.action;
        if (action == null) {
            return false;
        }
        action.restart();
        return false;
    }

    public void finish() {
        this.finished = true;
    }

    public int getCount() {
        return this.repeatCount;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.DelegateAction, com.badlogic.gdx.scenes.scene2d.Action
    public void restart() {
        super.restart();
        this.executedCount = 0;
        this.finished = false;
    }

    public void setCount(int i) {
        this.repeatCount = i;
    }
}
