package com.chartboost.sdk.impl;

import android.content.Context;
import android.webkit.WebSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class vh implements z6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final vh f15428b = new vh();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f15429c = "Invalid user-agent value";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z6 f15430a = xg.a();

    public final void a(String str) {
        try {
            track((ch) new u6(fh.f.USER_AGENT_UPDATE_ERROR, str, null, null, null, 28, null));
        } catch (Exception e2) {
            za.b("sendUserAgentErrorTracking", e2);
        }
    }

    @Override // com.chartboost.sdk.impl.y6
    public void clear(String type, String location) {
        Intrinsics.f(type, "type");
        Intrinsics.f(location, "location");
        this.f15430a.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch clearFromStorage(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f15430a.clearFromStorage(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch persist(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f15430a.persist(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ah refresh(ah ahVar) {
        Intrinsics.f(ahVar, "<this>");
        return this.f15430a.refresh(ahVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ug store(ug ugVar) {
        Intrinsics.f(ugVar, "<this>");
        return this.f15430a.store(ugVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch track(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f15430a.track(chVar);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo185clearFromStorage(ch event) {
        Intrinsics.f(event, "event");
        this.f15430a.mo185clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: persist */
    public void mo186persist(ch event) {
        Intrinsics.f(event, "event");
        this.f15430a.mo186persist(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: refresh */
    public void mo187refresh(ah config) {
        Intrinsics.f(config, "config");
        this.f15430a.mo187refresh(config);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: store */
    public void mo188store(ug ad) {
        Intrinsics.f(ad, "ad");
        this.f15430a.mo188store(ad);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: track */
    public void mo189track(ch event) {
        Intrinsics.f(event, "event");
        this.f15430a.mo189track(event);
    }

    public final void a(Context context) {
        String defaultUserAgent;
        Intrinsics.f(context, "context");
        try {
            defaultUserAgent = System.getProperty("http.agent");
        } catch (Exception e2) {
            a(e2.toString());
            defaultUserAgent = "";
        }
        try {
            defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        } catch (Exception e3) {
            a(e3.toString());
        }
        if (defaultUserAgent != null) {
            f15429c = defaultUserAgent;
        }
    }

    public final String a() {
        return f15429c;
    }
}
