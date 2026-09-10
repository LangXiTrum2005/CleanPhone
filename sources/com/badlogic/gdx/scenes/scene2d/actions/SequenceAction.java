package com.badlogic.gdx.scenes.scene2d.actions;

import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.utils.Pool;

/* JADX INFO: loaded from: classes.dex */
public class SequenceAction extends ParallelAction {
    private int index;

    public SequenceAction() {
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.ParallelAction, com.badlogic.gdx.scenes.scene2d.Action
    public boolean act(float f) {
        if (this.index >= this.actions.size) {
            return true;
        }
        Pool pool = getPool();
        setPool(null);
        try {
            if (this.actions.get(this.index).act(f)) {
                if (this.actor == null) {
                    return true;
                }
                int i = this.index + 1;
                this.index = i;
                if (i >= this.actions.size) {
                    setPool(pool);
                    return true;
                }
            }
            return false;
        } finally {
            setPool(pool);
        }
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.ParallelAction, com.badlogic.gdx.scenes.scene2d.Action
    public void restart() {
        super.restart();
        this.index = 0;
    }

    public SequenceAction(Action action) {
        addAction(action);
    }

    public SequenceAction(Action action, Action action2) {
        addAction(action);
        addAction(action2);
    }

    public SequenceAction(Action action, Action action2, Action action3) {
        addAction(action);
        addAction(action2);
        addAction(action3);
    }

    public SequenceAction(Action action, Action action2, Action action3, Action action4) {
        addAction(action);
        addAction(action2);
        addAction(action3);
        addAction(action4);
    }

    public SequenceAction(Action action, Action action2, Action action3, Action action4, Action action5) {
        addAction(action);
        addAction(action2);
        addAction(action3);
        addAction(action4);
        addAction(action5);
    }
}
