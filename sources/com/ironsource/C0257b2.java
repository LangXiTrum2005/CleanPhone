package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.ironsource.b2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0257b2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f28250c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f28251d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, ArrayList<a>> f28252a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28253b;

    /* JADX INFO: renamed from: com.ironsource.b2$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum a {
        ISAuctionPerformanceDidntAttemptToLoad,
        ISAuctionPerformanceFailedToLoad,
        ISAuctionPerformanceLoadedSuccessfully,
        ISAuctionPerformanceFailedToShow,
        ISAuctionPerformanceShowedSuccessfully,
        ISAuctionPerformanceNotPartOfWaterfall
    }

    public C0257b2(List<NetworkSettings> list, int i10) {
        this.f28253b = i10;
        for (NetworkSettings networkSettings : list) {
            this.f28252a.put(networkSettings.getProviderName(), new ArrayList<>());
        }
    }

    public void a(ConcurrentHashMap<String, a> concurrentHashMap) {
        if (this.f28253b == 0) {
            return;
        }
        for (String str : this.f28252a.keySet()) {
            a aVar = a.ISAuctionPerformanceNotPartOfWaterfall;
            if (concurrentHashMap.containsKey(str)) {
                aVar = concurrentHashMap.get(str);
            }
            ArrayList<a> arrayList = this.f28252a.get(str);
            if (this.f28253b != -1 && arrayList.size() == this.f28253b) {
                arrayList.remove(0);
            }
            arrayList.add(aVar);
        }
    }

    public String a(String str) {
        ArrayList<a> arrayList = this.f28252a.get(str);
        String string = "";
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<a> it = arrayList.iterator();
            string = "" + it.next().ordinal();
            while (it.hasNext()) {
                StringBuilder sbI = d5.u.i(wi.d.h(string, ","));
                sbI.append(it.next().ordinal());
                string = sbI.toString();
            }
        }
        return string;
    }
}
