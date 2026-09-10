package com.smartdigimkt.v;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected b f38956a;

    public a(b bVar) {
        this.f38956a = bVar;
    }

    public synchronized SQLiteDatabase a() {
        return this.f38956a.c();
    }

    public synchronized SQLiteDatabase b() {
        return this.f38956a.d();
    }
}
