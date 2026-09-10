package com.badlogic.gdx.scenes.scene2d;

import com.badlogic.gdx.utils.Null;
import com.badlogic.gdx.utils.Pool;

/* JADX INFO: loaded from: classes.dex */
public abstract class Action implements Pool.Poolable {
    protected Actor actor;

    @Null
    private Pool pool;
    protected Actor target;

    public abstract boolean act(float f);

    public Actor getActor() {
        return this.actor;
    }

    @Null
    public Pool getPool() {
        return this.pool;
    }

    public Actor getTarget() {
        return this.target;
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
        this.actor = null;
        this.target = null;
        this.pool = null;
        restart();
    }

    public void restart() {
    }

    public void setActor(Actor actor) {
        Pool pool;
        this.actor = actor;
        if (this.target == null) {
            setTarget(actor);
        }
        if (actor != null || (pool = this.pool) == null) {
            return;
        }
        pool.free(this);
        this.pool = null;
    }

    public void setPool(@Null Pool pool) {
        this.pool = pool;
    }

    public void setTarget(Actor actor) {
        this.target = actor;
    }

    public String toString() {
        String name = getClass().getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            name = name.substring(iLastIndexOf + 1);
        }
        return name.endsWith("Action") ? name.substring(0, name.length() - 6) : name;
    }
}
