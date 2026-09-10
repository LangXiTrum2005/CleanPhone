package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Yh implements InterfaceC2801bg {
    public final /* synthetic */ GestureDetectorOnGestureListenerC2829ci a;

    public Yh(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci) {
        this.a = gestureDetectorOnGestureListenerC2829ci;
    }

    public final void a(String id, int i, String str, long j, int i2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullExpressionValue(GestureDetectorOnGestureListenerC2829ci.g1, "access$getTAG$cp(...)");
        JSONObject jSONObjectA = Xh.a("code", i);
        if (str != null) {
            jSONObjectA.put(NotificationCompat.CATEGORY_MESSAGE, str);
        }
        jSONObjectA.put("retryCount", i2);
        String string = jSONObjectA.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.a.g("window.imraidview.broadcastEvent('onPingComplete', '" + id + "', " + j + ", '" + string + "');");
    }
}
