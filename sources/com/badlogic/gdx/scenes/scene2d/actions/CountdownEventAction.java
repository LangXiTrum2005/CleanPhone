package com.badlogic.gdx.scenes.scene2d.actions;

import com.badlogic.gdx.scenes.scene2d.Event;

/* JADX INFO: loaded from: classes.dex */
public class CountdownEventAction<T extends Event> extends EventAction<T> {
    int count;
    int current;

    public CountdownEventAction(Class<? extends T> cls, int i) {
        super(cls);
        this.count = i;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.EventAction
    public boolean handle(T t) {
        int i = this.current + 1;
        this.current = i;
        return i >= this.count;
    }
}
