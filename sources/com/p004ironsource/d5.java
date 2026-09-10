package com.p004ironsource;

import com.applovin.impl.H0;
import com.p004ironsource.mediationsdk.e;
import com.p004ironsource.mediationsdk.impressionData.ImpressionData;
import com.p004ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.p004ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\t\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/ironsource/d5;", "Lcom/ironsource/zp;", "Lcom/ironsource/xk;", "publisherDataHolder", "Lcom/ironsource/m5;", "auctionResponseItem", "", "placementName", "", "a", "Lcom/ironsource/z;", m5.f25675p, "", "waterfallInstances", "winnerInstance", "Lcom/ironsource/u2;", "Lcom/ironsource/u2;", "adTools", "Lcom/ironsource/mediationsdk/e;", "b", "Lcom/ironsource/mediationsdk/e;", "auctionHandler", "", "c", "Z", "loadResultsReported", "<init>", "(Lcom/ironsource/u2;Lcom/ironsource/mediationsdk/e;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class d5 implements zp {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u2 adTools;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e auctionHandler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean loadResultsReported;

    public d5(u2 adTools, e auctionHandler) {
        Intrinsics.f(adTools, "adTools");
        Intrinsics.f(auctionHandler, "auctionHandler");
        this.adTools = adTools;
        this.auctionHandler = auctionHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(d5 this$0, ImpressionDataListener listener, ImpressionData impressionData) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(listener, "$listener");
        IronLog.CALLBACK.verbose(m1.a(this$0.adTools, "onImpressionSuccess " + listener.getClass().getSimpleName() + ": " + impressionData, (String) null, 2, (Object) null));
        listener.onImpressionSuccess(impressionData);
    }

    private final void a(xk publisherDataHolder, m5 auctionResponseItem, String placementName) {
        if (auctionResponseItem == null) {
            IronLog.INTERNAL.error(m1.a(this.adTools, "reportImpressionDataToPublisher - no auctionResponseItem or listener", (String) null, 2, (Object) null));
            this.adTools.getEventSender().getTroubleshoot().g("reportImpressionDataToPublisher - no auctionResponseItem or listener");
            return;
        }
        ImpressionData impressionDataA = auctionResponseItem.a(placementName);
        if (impressionDataA != null) {
            Iterator it = new HashSet(publisherDataHolder.a()).iterator();
            while (it.hasNext()) {
                this.adTools.e(new H0(this, (ImpressionDataListener) it.next(), impressionDataA, 15));
            }
        }
    }

    @Override // com.p004ironsource.zp
    public void a(AbstractC3389z instance, String placementName, xk publisherDataHolder) {
        Intrinsics.f(instance, "instance");
        Intrinsics.f(publisherDataHolder, "publisherDataHolder");
        this.auctionHandler.a(instance.getAuctionResponseItem(), instance.getInstanceType(), instance.getGenericNotifications(), placementName);
        a(publisherDataHolder, instance.getAuctionResponseItem(), placementName);
    }

    @Override // com.p004ironsource.zp
    public void a(List<? extends AbstractC3389z> waterfallInstances, AbstractC3389z winnerInstance) {
        Intrinsics.f(waterfallInstances, "waterfallInstances");
        Intrinsics.f(winnerInstance, "winnerInstance");
        if (this.loadResultsReported) {
            return;
        }
        this.loadResultsReported = true;
        m5 auctionResponseItem = winnerInstance.getAuctionResponseItem();
        this.auctionHandler.a(auctionResponseItem, winnerInstance.getInstanceType(), winnerInstance.getGenericNotifications());
        ArrayList<String> arrayList = new ArrayList<>();
        ConcurrentHashMap<String, m5> concurrentHashMap = new ConcurrentHashMap<>();
        for (AbstractC3389z abstractC3389z : waterfallInstances) {
            arrayList.add(abstractC3389z.getInstanceName());
            concurrentHashMap.put(abstractC3389z.getInstanceName(), abstractC3389z.getAuctionResponseItem());
        }
        this.auctionHandler.a(arrayList, concurrentHashMap, winnerInstance.getInstanceType(), winnerInstance.getGenericNotifications(), auctionResponseItem);
    }
}
