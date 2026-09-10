package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.ironsource.h2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0365h2 implements Vc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V0 f28764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.ironsource.mediationsdk.e f28765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28766c;

    public C0365h2(V0 adTools, com.ironsource.mediationsdk.e auctionHandler) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(auctionHandler, "auctionHandler");
        this.f28764a = adTools;
        this.f28765b = auctionHandler;
    }

    @Override // com.ironsource.Vc
    public void a(B instance, String str, C0462ma publisherDataHolder) {
        kotlin.jvm.internal.n.f(instance, "instance");
        kotlin.jvm.internal.n.f(publisherDataHolder, "publisherDataHolder");
        this.f28765b.a(instance.h(), instance.r(), instance.m(), str);
        a(publisherDataHolder, instance);
    }

    @Override // com.ironsource.Vc
    public void a(List<? extends B> waterfallInstances, B winnerInstance) {
        kotlin.jvm.internal.n.f(waterfallInstances, "waterfallInstances");
        kotlin.jvm.internal.n.f(winnerInstance, "winnerInstance");
        if (this.f28766c) {
            return;
        }
        this.f28766c = true;
        C0526q2 c0526q2H = winnerInstance.h();
        this.f28765b.a(c0526q2H, winnerInstance.r(), winnerInstance.m());
        ArrayList<String> arrayList = new ArrayList<>();
        ConcurrentHashMap<String, C0526q2> concurrentHashMap = new ConcurrentHashMap<>();
        for (B b10 : waterfallInstances) {
            arrayList.add(b10.p());
            concurrentHashMap.put(b10.p(), b10.h());
        }
        this.f28765b.a(arrayList, concurrentHashMap, winnerInstance.r(), winnerInstance.m(), c0526q2H);
    }

    private final void a(C0462ma c0462ma, B b10) {
        W8 w10 = new W8(b10.e());
        Iterator it = new HashSet(c0462ma.a()).iterator();
        while (it.hasNext()) {
            this.f28764a.d(new ph(this, (ImpressionDataListener) it.next(), w10, 13));
            this.f28764a.d().h().a(w10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0365h2 this$0, ImpressionDataListener listener, W8 impressionData) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(listener, "$listener");
        kotlin.jvm.internal.n.f(impressionData, "$impressionData");
        IronLog.CALLBACK.verbose(C0506p0.a(this$0.f28764a, "onImpressionSuccess " + listener.getClass().getSimpleName() + ": " + impressionData, (String) null, 2, (Object) null));
        listener.onImpressionSuccess(impressionData);
    }
}
