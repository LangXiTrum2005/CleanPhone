package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.Trackers;
import com.inmobi.media.ads.network.common.model.TrackersV2;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.cord;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.yi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3380yi {
    public static final List a(com.inmobi.media.ads.network.common.model.Ad ad, String type) {
        Intrinsics.checkNotNullParameter(ad, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        List<Trackers> trackers$media_release = ad.getTrackers$media_release();
        ArrayList arrayList = new ArrayList();
        for (Object obj : trackers$media_release) {
            if (Intrinsics.wireman(((Trackers) obj).getType(), type)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            cord.stratoscope(arrayList2, ((Trackers) it.next()).getUrl());
        }
        List<TrackingInfo> trackingInfo$media_release = ad.getTrackingInfo$media_release();
        Collection arrayList3 = new ArrayList();
        for (TrackingInfo trackingInfo : trackingInfo$media_release) {
            List<TrackersV2> trackers = trackingInfo.getTrackers();
            ArrayList<TrackersV2> arrayList4 = new ArrayList();
            for (Object obj2 : trackers) {
                if (Intrinsics.wireman(((TrackersV2) obj2).getType(), type)) {
                    arrayList4.add(obj2);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            for (TrackersV2 trackersV2 : arrayList4) {
                List<String> url = trackersV2.getUrl();
                List<String> imExts = trackersV2.getImExts();
                ArrayList arrayList6 = new ArrayList(dovishness.gintrap(imExts, 10));
                for (String str : imExts) {
                    arrayList6.add(trackingInfo.getImBaseUrl() + str);
                }
                cord.stratoscope(arrayList5, CollectionsKt.unconsolidated(url, arrayList6));
            }
            cord.stratoscope(arrayList3, arrayList5);
        }
        if (arrayList3.isEmpty()) {
            arrayList3 = adultoid.formularize();
        }
        return CollectionsKt.unconsolidated(arrayList3, arrayList2);
    }
}
