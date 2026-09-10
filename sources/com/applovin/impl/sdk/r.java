package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue f9687a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f9688b = new Object();

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f9688b) {
            try {
                if (b() <= 25) {
                    this.f9687a.offer(appLovinAdImpl);
                } else {
                    p.h("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int b() {
        int size;
        synchronized (this.f9688b) {
            size = this.f9687a.size();
        }
        return size;
    }

    public boolean c() {
        boolean z10;
        synchronized (this.f9688b) {
            z10 = b() == 0;
        }
        return z10;
    }

    public AppLovinAdImpl d() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f9688b) {
            appLovinAdImpl = (AppLovinAdImpl) this.f9687a.peek();
        }
        return appLovinAdImpl;
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f9688b) {
            this.f9687a.remove(appLovinAdImpl);
        }
    }

    public AppLovinAdImpl a() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f9688b) {
            try {
                appLovinAdImpl = !c() ? (AppLovinAdImpl) this.f9687a.poll() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return appLovinAdImpl;
    }
}
