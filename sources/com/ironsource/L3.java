package com.ironsource;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class L3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f26481a = a.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList f26482b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f26483c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum a {
        NOT_READY,
        READY
    }

    public L3(String str) {
        this.f26483c = str;
    }

    public synchronized void a(Runnable runnable) {
        if (this.f26481a != a.READY) {
            this.f26482b.add(runnable);
        } else {
            runnable.run();
        }
    }

    public synchronized void b() {
        this.f26481a = a.NOT_READY;
    }

    public synchronized void c() {
        this.f26481a = a.READY;
    }

    public synchronized void a() {
        try {
            Object[] array = this.f26482b.toArray();
            for (int i10 = 0; i10 < array.length; i10++) {
                ((Runnable) array[i10]).run();
                array[i10] = null;
            }
            this.f26482b.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
