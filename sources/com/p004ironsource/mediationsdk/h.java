package com.p004ironsource.mediationsdk;

import com.p004ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f25892c = -1;
    public static final int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, ArrayList<a>> f25893a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25894b;

    public enum a {
        ISAuctionPerformanceDidntAttemptToLoad,
        ISAuctionPerformanceFailedToLoad,
        ISAuctionPerformanceLoadedSuccessfully,
        ISAuctionPerformanceFailedToShow,
        ISAuctionPerformanceShowedSuccessfully,
        ISAuctionPerformanceNotPartOfWaterfall
    }

    public h(List<NetworkSettings> list, int i2) {
        this.f25894b = i2;
        for (NetworkSettings networkSettings : list) {
            this.f25893a.put(networkSettings.getProviderName(), new ArrayList<>());
        }
    }

    public String a(String str) {
        ArrayList<a> arrayList = this.f25893a.get(str);
        String string = "";
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<a> it = arrayList.iterator();
            string = "" + it.next().ordinal();
            while (it.hasNext()) {
                StringBuilder sbW = android.support.v4.media.a.w(android.support.v4.media.a.m(string, ","));
                sbW.append(it.next().ordinal());
                string = sbW.toString();
            }
        }
        return string;
    }

    public void a(ConcurrentHashMap<String, a> concurrentHashMap) {
        if (this.f25894b == 0) {
            return;
        }
        for (String str : this.f25893a.keySet()) {
            a aVar = a.ISAuctionPerformanceNotPartOfWaterfall;
            if (concurrentHashMap.containsKey(str)) {
                aVar = concurrentHashMap.get(str);
            }
            ArrayList<a> arrayList = this.f25893a.get(str);
            if (this.f25894b != -1 && arrayList.size() == this.f25894b) {
                arrayList.remove(0);
            }
            arrayList.add(aVar);
        }
    }
}
