package com.unity3d.services.ads.webplayer;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class WebPlayerViewCache {
    private static WebPlayerViewCache instance;
    private HashMap<String, WebPlayerView> _webPlayerMap = new HashMap<>();

    public static WebPlayerViewCache getInstance() {
        if (instance == null) {
            instance = new WebPlayerViewCache();
        }
        return instance;
    }

    public synchronized void addWebPlayer(String str, WebPlayerView webPlayerView) {
        this._webPlayerMap.put(str, webPlayerView);
    }

    public synchronized WebPlayerView getWebPlayer(String str) {
        if (!this._webPlayerMap.containsKey(str)) {
            return null;
        }
        return this._webPlayerMap.get(str);
    }

    public synchronized void removeWebPlayer(String str) {
        if (this._webPlayerMap.containsKey(str)) {
            this._webPlayerMap.remove(str);
        }
    }
}
