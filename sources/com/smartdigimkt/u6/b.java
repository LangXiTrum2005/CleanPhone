package com.smartdigimkt.u6;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public class b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected c f38834a;

    public b(c cVar) {
        this.f38834a = cVar;
    }

    public synchronized SQLiteDatabase a() {
        return this.f38834a.c();
    }

    public synchronized SQLiteDatabase b() {
        return this.f38834a.d();
    }
}
