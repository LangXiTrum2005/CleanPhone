package com.badlogic.gdx.scenes.scene2d.actions;

import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.utils.Pool;

/* JADX INFO: loaded from: classes.dex */
public abstract class DelegateAction extends Action {
    protected Action action;

    @Override // com.badlogic.gdx.scenes.scene2d.Action
    public final boolean act(float f) {
        Pool pool = getPool();
        setPool(null);
        try {
            return delegate(f);
        } finally {
            setPool(pool);
        }
    }

    public abstract boolean delegate(float f);

    public Action getAction() {
        return this.action;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action, com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
        super.reset();
        this.action = null;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action
    public void restart() {
        Action action = this.action;
        if (action != null) {
            action.restart();
        }
    }

    public void setAction(Action action) {
        this.action = action;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action
    public void setActor(Actor actor) {
        Action action = this.action;
        if (action != null) {
            action.setActor(actor);
        }
        super.setActor(actor);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action
    public void setTarget(Actor actor) {
        Action action = this.action;
        if (action != null) {
            action.setTarget(actor);
        }
        super.setTarget(actor);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Action
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (this.action == null) {
            str = "";
        } else {
            str = "(" + this.action + ")";
        }
        sb.append(str);
        return sb.toString();
    }
}
