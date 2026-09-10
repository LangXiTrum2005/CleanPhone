package com.google.android.gms.ads.internal.util.client;

import com.applovin.impl.ca;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zza implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f10968a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10969b;

    public zza(String str) {
        this.f10969b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f10968a.getAndIncrement();
        int length = String.valueOf(andIncrement).length();
        String str = this.f10969b;
        StringBuilder sb2 = new StringBuilder(ca.i(12, length, str));
        sb2.append("AdWorker(");
        sb2.append(str);
        sb2.append(") #");
        sb2.append(andIncrement);
        return new Thread(runnable, sb2.toString());
    }
}
