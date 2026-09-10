package com.p004ironsource;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class s8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f26784a = a.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList f26785b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f26786c;

    public enum a {
        NOT_READY,
        READY
    }

    public s8(String str) {
        this.f26786c = str;
    }

    public synchronized void a() {
        try {
            Object[] array = this.f26785b.toArray();
            for (int i2 = 0; i2 < array.length; i2++) {
                ((Runnable) array[i2]).run();
                array[i2] = null;
            }
            this.f26785b.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b() {
        this.f26784a = a.NOT_READY;
    }

    public synchronized void c() {
        this.f26784a = a.READY;
    }

    public synchronized void a(Runnable runnable) {
        if (this.f26784a != a.READY) {
            this.f26785b.add(runnable);
        } else {
            runnable.run();
        }
    }
}
