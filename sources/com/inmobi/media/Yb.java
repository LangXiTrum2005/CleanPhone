package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Yb implements Ha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3005ec f23377a;

    public Yb(GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec) {
        this.f23377a = gestureDetectorOnGestureListenerC3005ec;
    }

    public final void a(String id, int i2, String str, long j, int i3) {
        Intrinsics.f(id, "id");
        Intrinsics.e(GestureDetectorOnGestureListenerC3005ec.a1, "access$getTAG$cp(...)");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", i2);
        if (str != null) {
            jSONObject.put("msg", str);
        }
        jSONObject.put("retryCount", i3);
        String string = jSONObject.toString();
        Intrinsics.e(string, "toString(...)");
        this.f23377a.c("window.imraidview.broadcastEvent('onPingComplete', '" + id + "', " + j + ", '" + string + "');");
    }
}
