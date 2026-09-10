package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.Trackers;
import com.inmobi.media.ads.network.common.model.TrackersV2;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.cord;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.z4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3391z4 {
    public static final ArrayList a(G g, String type) {
        Intrinsics.checkNotNullParameter(g, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        List list = g.f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.wireman(((Trackers) obj).getType(), type)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            cord.stratoscope(arrayList2, ((Trackers) it.next()).getUrl());
        }
        return arrayList2.isEmpty() ? a(type, g.g) : arrayList2;
    }

    public static final ArrayList a(String type, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TrackingInfo trackingInfo = (TrackingInfo) it.next();
            List<TrackersV2> trackers = trackingInfo.getTrackers();
            ArrayList<TrackersV2> arrayList2 = new ArrayList();
            for (Object obj : trackers) {
                if (Intrinsics.wireman(((TrackersV2) obj).getType(), type)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (TrackersV2 trackersV2 : arrayList2) {
                List<String> url = trackersV2.getUrl();
                List<String> imExts = trackersV2.getImExts();
                ArrayList arrayList4 = new ArrayList(dovishness.gintrap(imExts, 10));
                for (String str : imExts) {
                    arrayList4.add(trackingInfo.getImBaseUrl() + str);
                }
                cord.stratoscope(arrayList3, CollectionsKt.unconsolidated(url, arrayList4));
            }
            cord.stratoscope(arrayList, arrayList3);
        }
        return arrayList;
    }
}
