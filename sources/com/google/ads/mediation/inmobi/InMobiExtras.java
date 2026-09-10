package com.google.ads.mediation.inmobi;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class InMobiExtras {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final HashMap<String, String> f18880attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f18881saneness;

    public InMobiExtras(HashMap<String, String> map, String str) {
        this.f18880attabal = map;
        this.f18881saneness = str;
    }

    public String getKeywords() {
        return this.f18881saneness;
    }

    public HashMap<String, String> getParameterMap() {
        return this.f18880attabal;
    }
}
