package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3540h2 implements Qc {
    private final V0 a;
    private final com.ironsource.mediationsdk.e b;
    private boolean c;

    public C3540h2(V0 adTools, com.ironsource.mediationsdk.e auctionHandler) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(auctionHandler, "auctionHandler");
        this.a = adTools;
        this.b = auctionHandler;
    }

    @Override // com.ironsource.Qc
    public void a(B instance, String str, C3583ja publisherDataHolder) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.b.a(instance.h(), instance.r(), instance.m(), str);
        a(publisherDataHolder, instance);
    }

    @Override // com.ironsource.Qc
    public void a(List<? extends B> waterfallInstances, B winnerInstance) {
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        Intrinsics.checkNotNullParameter(winnerInstance, "winnerInstance");
        if (this.c) {
            return;
        }
        this.c = true;
        C3700q2 c3700q2H = winnerInstance.h();
        this.b.a(c3700q2H, winnerInstance.r(), winnerInstance.m());
        ArrayList<String> arrayList = new ArrayList<>();
        ConcurrentHashMap<String, C3700q2> concurrentHashMap = new ConcurrentHashMap<>();
        for (B b : waterfallInstances) {
            arrayList.add(b.p());
            concurrentHashMap.put(b.p(), b.h());
        }
        this.b.a(arrayList, concurrentHashMap, winnerInstance.r(), winnerInstance.m(), c3700q2H);
    }

    private final void a(C3583ja c3583ja, B b) {
        final U8 u8 = new U8(b.e());
        for (final ImpressionDataListener impressionDataListener : new HashSet(c3583ja.a())) {
            this.a.e(new Runnable() { // from class: com.ironsource.attendance
                @Override // java.lang.Runnable
                public final void run() {
                    C3540h2.a(this.f23143kowloon, impressionDataListener, u8);
                }
            });
            this.a.e().h().a(u8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3540h2 this$0, ImpressionDataListener listener, U8 impressionData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(impressionData, "$impressionData");
        IronLog.CALLBACK.verbose(C3681p0.a(this$0.a, "onImpressionSuccess " + listener.getClass().getSimpleName() + ": " + impressionData, (String) null, 2, (Object) null));
        listener.onImpressionSuccess(impressionData);
    }
}
