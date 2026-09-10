package com.inmobi.media;

import android.os.SystemClock;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3186q1 implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f23905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23907c;
    public final String d;

    public C3186q1(CountDownLatch countDownLatch, String remoteUrl, long j, String assetAdType) {
        Intrinsics.f(countDownLatch, "countDownLatch");
        Intrinsics.f(remoteUrl, "remoteUrl");
        Intrinsics.f(assetAdType, "assetAdType");
        this.f23905a = countDownLatch;
        this.f23906b = remoteUrl;
        this.f23907c = j;
        this.d = assetAdType;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method method, Object[] args) {
        Intrinsics.f(proxy, "proxy");
        Intrinsics.f(args, "args");
        C3233t1 c3233t1 = C3233t1.f23990a;
        Objects.toString(method);
        if (method == null) {
            return null;
        }
        if (!"onSuccess".equalsIgnoreCase(method.getName())) {
            if (!"onError".equalsIgnoreCase(method.getName())) {
                return null;
            }
            C3233t1.f23990a.c(this.f23906b);
            this.f23905a.countDown();
            return null;
        }
        HashMap mapG = MapsKt.g(new Pair("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f23907c)), new Pair("size", 0), new Pair("assetType", com.smartdigimkt.x.d.c.k), new Pair("networkType", L3.q()), new Pair("adType", this.d));
        Pd pd = Pd.f23077a;
        Pd.b("AssetDownloaded", mapG, Td.SDK);
        C3233t1.f23990a.d(this.f23906b);
        this.f23905a.countDown();
        return null;
    }
}
