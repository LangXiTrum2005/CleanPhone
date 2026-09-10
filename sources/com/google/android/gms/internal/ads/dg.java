package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dg implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f13514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13515c;

    public dg() {
        this.f13513a = 0;
        this.f13515c = Executors.defaultThreadFactory();
        this.f13514b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f13513a) {
            case 0:
                Thread threadNewThread = ((ThreadFactory) this.f13515c).newThread(runnable);
                int andIncrement = this.f13514b.getAndIncrement();
                StringBuilder sb2 = new StringBuilder(String.valueOf(andIncrement).length() + 5);
                sb2.append("gads-");
                sb2.append(andIncrement);
                threadNewThread.setName(sb2.toString());
                return threadNewThread;
            default:
                int andIncrement2 = this.f13514b.getAndIncrement();
                int length = String.valueOf(andIncrement2).length();
                String str = (String) this.f13515c;
                StringBuilder sb3 = new StringBuilder(com.applovin.impl.ca.i(12, length, str));
                sb3.append("AdWorker(");
                sb3.append(str);
                sb3.append(") #");
                sb3.append(andIncrement2);
                return new Thread(runnable, sb3.toString());
        }
    }

    public dg(String str) {
        this.f13513a = 1;
        this.f13515c = str;
        this.f13514b = new AtomicInteger(1);
    }
}
