package com.chartboost.heliumsdk.ad;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000bJ\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAdQueueManager;", "", "()V", "placementToFullscreenAdQueues", "", "", "Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAdQueue;", "autoStartQueues", "", "isSdkInitialized", "", "autoStartQueues$Helium_release", "queue", "context", "Landroid/content/Context;", "placementName", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ChartboostMediationFullscreenAdQueueManager {
    public static final ChartboostMediationFullscreenAdQueueManager INSTANCE = new ChartboostMediationFullscreenAdQueueManager();
    private static final Map<String, ChartboostMediationFullscreenAdQueue> placementToFullscreenAdQueues = new LinkedHashMap();

    private ChartboostMediationFullscreenAdQueueManager() {
    }

    @JvmStatic
    public static final ChartboostMediationFullscreenAdQueue queue(Context context, String placementName) {
        Intrinsics.f(context, "context");
        Intrinsics.f(placementName, "placementName");
        Map<String, ChartboostMediationFullscreenAdQueue> map = placementToFullscreenAdQueues;
        ChartboostMediationFullscreenAdQueue chartboostMediationFullscreenAdQueue = map.get(placementName);
        if (chartboostMediationFullscreenAdQueue == null) {
            chartboostMediationFullscreenAdQueue = new ChartboostMediationFullscreenAdQueue(context, placementName);
            map.put(placementName, chartboostMediationFullscreenAdQueue);
        }
        return chartboostMediationFullscreenAdQueue;
    }

    public final void autoStartQueues$Helium_release(boolean isSdkInitialized) {
        Collection<ChartboostMediationFullscreenAdQueue> collectionValues = placementToFullscreenAdQueues.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((ChartboostMediationFullscreenAdQueue) obj).getIsRunning()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ChartboostMediationFullscreenAdQueue) it.next()).getNotifyQueueToAutoStart().onSdkInitAutoQueue(isSdkInitialized);
        }
    }
}
