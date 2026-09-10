package com.smartdigimkt.o7;

import com.smartdigimkt.sdk.api.SDMDebuggerConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile a f37467c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37468a = "a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SDMDebuggerConfig f37469b;

    private a() {
    }

    public static a a() {
        if (f37467c == null) {
            synchronized (a.class) {
                try {
                    if (f37467c == null) {
                        f37467c = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f37467c;
    }

    public void a(SDMDebuggerConfig sDMDebuggerConfig) {
        this.f37469b = sDMDebuggerConfig;
    }

    public void a(JSONObject jSONObject) {
        SDMDebuggerConfig sDMDebuggerConfig;
        if (jSONObject == null || (sDMDebuggerConfig = this.f37469b) == null) {
            return;
        }
        sDMDebuggerConfig.fillRequestParam(jSONObject);
    }
}
