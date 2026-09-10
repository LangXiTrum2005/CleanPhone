package com.pgl.ssdk;

import com.pgl.ssdk.a2;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes5.dex */
public class a3<T extends a2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BlockingQueue<T> f33386b = new LinkedBlockingQueue();

    private a3(int i2) {
        this.f33385a = i2;
    }

    public static a3 a(int i2) {
        return new a3(i2);
    }

    public T a() {
        return this.f33386b.poll();
    }
}
