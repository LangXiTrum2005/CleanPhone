package com.thinkup.core.common.no.m.o;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m implements Runnable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final String f42006n;

    public m(String str, Object... objArr) {
        this.f42006n = n.o(str, objArr);
    }

    public abstract void n();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f42006n);
        try {
            n();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
