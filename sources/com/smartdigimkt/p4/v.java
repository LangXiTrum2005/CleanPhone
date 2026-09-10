package com.smartdigimkt.p4;

import com.p004ironsource.d9;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes6.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f37622a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PriorityQueue<Integer> f37623b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37624c = Integer.MIN_VALUE;

    public static class a extends IOException {
        public a(int i2, int i3) {
            super(androidx.datastore.preferences.protobuf.a.e(i2, i3, "Priority too low [priority=", ", highest=", d9.i.f24752e));
        }
    }

    public void a(int i2) {
        synchronized (this.f37622a) {
            this.f37623b.add(Integer.valueOf(i2));
            this.f37624c = Math.max(this.f37624c, i2);
        }
    }

    public void b(int i2) throws InterruptedException {
        synchronized (this.f37622a) {
            while (this.f37624c != i2) {
                try {
                    this.f37622a.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean c(int i2) {
        boolean z2;
        synchronized (this.f37622a) {
            z2 = this.f37624c == i2;
        }
        return z2;
    }

    public void d(int i2) throws a {
        synchronized (this.f37622a) {
            try {
                if (this.f37624c != i2) {
                    throw new a(i2, this.f37624c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(int i2) {
        synchronized (this.f37622a) {
            this.f37623b.remove(Integer.valueOf(i2));
            this.f37624c = this.f37623b.isEmpty() ? Integer.MIN_VALUE : this.f37623b.peek().intValue();
            this.f37622a.notifyAll();
        }
    }
}
