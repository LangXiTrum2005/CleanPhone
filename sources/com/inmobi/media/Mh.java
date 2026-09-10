package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import kurbash.formularize;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;

/* JADX INFO: loaded from: classes3.dex */
public final class Mh {
    public static final /* synthetic */ formularize[] a = {polloi.cutely(new PropertyReference1Impl(Mh.class, "areImraidLogsEnabled", "getAreImraidLogsEnabled()Z", 0))};

    public static JSONObject a(String browser, String event) {
        Intrinsics.checkNotNullParameter(browser, "browser");
        Intrinsics.checkNotNullParameter(event, "event");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("browser", browser);
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, event);
        return jSONObject;
    }
}
