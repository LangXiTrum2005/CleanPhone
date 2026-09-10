package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class e3 implements z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z6 f13760a;

    public e3(z6 eventTracker) {
        Intrinsics.f(eventTracker, "eventTracker");
        this.f13760a = eventTracker;
    }

    public final void a(String str, i3 i3Var, String str2, String str3) {
        try {
            if (i3Var == null) {
                track((ch) new h5(fh.i.WEBVIEW_ERROR, "Webview is null", str3, str2, null, null, 48, null));
                za.b("Calling native to javascript webview is null", (Throwable) null, 2, (Object) null);
            } else {
                za.a("Calling native to javascript: " + str, (Throwable) null, 2, (Object) null);
                i3Var.loadUrl(str);
            }
        } catch (Exception e2) {
            track((ch) new h5(fh.i.WEBVIEW_CRASH, "Cannot open url: " + e2, str3, str2, null, null, 48, null));
            za.b("Calling native to javascript. Cannot open url", e2);
        }
    }

    public final void b(String str, i3 i3Var, String str2, String str3) {
        a(android.support.v4.media.a.n("javascript:Chartboost.EventHandler.handleNativeEvent(\"", str, "\")"), i3Var, str2, str3);
    }

    public final void c(i3 i3Var, String location, String adTypeName) {
        Intrinsics.f(location, "location");
        Intrinsics.f(adTypeName, "adTypeName");
        b(rc.VIDEO_ENDED.c(), i3Var, location, adTypeName);
    }

    @Override // com.chartboost.sdk.impl.y6
    public void clear(String type, String location) {
        Intrinsics.f(type, "type");
        Intrinsics.f(location, "location");
        this.f13760a.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch clearFromStorage(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f13760a.clearFromStorage(chVar);
    }

    public final void d(i3 i3Var, String location, String adTypeName) {
        Intrinsics.f(location, "location");
        Intrinsics.f(adTypeName, "adTypeName");
        b(rc.VIDEO_FAILED.c(), i3Var, location, adTypeName);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch persist(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f13760a.persist(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ah refresh(ah ahVar) {
        Intrinsics.f(ahVar, "<this>");
        return this.f13760a.refresh(ahVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ug store(ug ugVar) {
        Intrinsics.f(ugVar, "<this>");
        return this.f13760a.store(ugVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch track(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f13760a.track(chVar);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo185clearFromStorage(ch event) {
        Intrinsics.f(event, "event");
        this.f13760a.mo185clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: persist */
    public void mo186persist(ch event) {
        Intrinsics.f(event, "event");
        this.f13760a.mo186persist(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: refresh */
    public void mo187refresh(ah config) {
        Intrinsics.f(config, "config");
        this.f13760a.mo187refresh(config);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: store */
    public void mo188store(ug ad) {
        Intrinsics.f(ad, "ad");
        this.f13760a.mo188store(ad);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: track */
    public void mo189track(ch event) {
        Intrinsics.f(event, "event");
        this.f13760a.mo189track(event);
    }

    public final void b(i3 i3Var, String location, String adTypeName) {
        Intrinsics.f(location, "location");
        Intrinsics.f(adTypeName, "adTypeName");
        b(rc.ON_FOREGROUND.c(), i3Var, location, adTypeName);
    }

    public final void b(i3 i3Var, float f, String location, String adTypeName) {
        Intrinsics.f(location, "location");
        Intrinsics.f(adTypeName, "adTypeName");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("totalDuration", Float.valueOf(f));
        String strC = rc.VIDEO_STARTED.c();
        String string = jSONObject.toString();
        Intrinsics.e(string, "toString(...)");
        a(strC, string, i3Var, location, adTypeName);
    }

    public final void a(String str, String str2, i3 i3Var, String str3, String str4) {
        a(androidx.datastore.preferences.protobuf.a.n("javascript:Chartboost.EventHandler.handleNativeEvent(\"", str, "\", ", str2, ")"), i3Var, str3, str4);
    }

    public final void a(i3 i3Var, String location, String adTypeName) {
        Intrinsics.f(location, "location");
        Intrinsics.f(adTypeName, "adTypeName");
        b(rc.ON_BACKGROUND.c(), i3Var, location, adTypeName);
    }

    public final void a(i3 i3Var, float f, String location, String adTypeName) {
        Intrinsics.f(location, "location");
        Intrinsics.f(adTypeName, "adTypeName");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("seconds", Float.valueOf(f));
        String strC = rc.PLAYBACK_TIME.c();
        String string = jSONObject.toString();
        Intrinsics.e(string, "toString(...)");
        a(strC, string, i3Var, location, adTypeName);
    }
}
