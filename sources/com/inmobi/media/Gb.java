package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Gb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f22848a = {Reflection.f43333a.i(new PropertyReference1Impl("areImraidLogsEnabled", Gb.class, "getAreImraidLogsEnabled()Z"))};

    public static JSONObject a(String browser, String event) {
        Intrinsics.f(browser, "browser");
        Intrinsics.f(event, "event");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("browser", browser);
        jSONObject.put("event", event);
        return jSONObject;
    }
}
