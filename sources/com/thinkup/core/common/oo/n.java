package com.thinkup.core.common.oo;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public class n<T> {
    protected o0 oo;

    public n(o0 o0Var) {
        this.oo = o0Var;
    }

    public final synchronized SQLiteDatabase n() {
        return this.oo.o();
    }

    public final synchronized SQLiteDatabase o0() {
        return this.oo.m();
    }
}
