package com.pgl.ssdk;

import com.pgl.ssdk.y0;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public class z0<T extends y0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2465a;
    private BlockingQueue<T> b = new LinkedBlockingQueue();

    private z0(int i) {
        this.f2465a = i;
    }

    public static z0 a(int i) {
        return new z0(i);
    }

    public T a() {
        return this.b.poll();
    }
}
