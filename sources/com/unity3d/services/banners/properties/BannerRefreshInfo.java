package com.unity3d.services.banners.properties;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class BannerRefreshInfo {
    private static BannerRefreshInfo instance;
    private HashMap<String, Integer> _refreshRateMap = new HashMap<>();

    public static BannerRefreshInfo getInstance() {
        if (instance == null) {
            instance = new BannerRefreshInfo();
        }
        return instance;
    }

    public synchronized Integer getRefreshRate(String str) {
        return this._refreshRateMap.get(str);
    }

    public synchronized void setRefreshRate(String str, Integer num) {
        this._refreshRateMap.put(str, num);
    }
}
