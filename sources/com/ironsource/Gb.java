package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Gb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f26166d;

    public Gb(JSONObject applicationLogger) {
        kotlin.jvm.internal.n.f(applicationLogger, "applicationLogger");
        this.f26163a = applicationLogger.optInt(Hb.f26242a, 3);
        this.f26164b = applicationLogger.optInt(Hb.f26243b, 3);
        this.f26165c = applicationLogger.optInt("console", 3);
        this.f26166d = applicationLogger.optBoolean(Hb.f26245d, false);
    }

    public final int a() {
        return this.f26165c;
    }

    public final int b() {
        return this.f26164b;
    }

    public final int c() {
        return this.f26163a;
    }

    public final boolean d() {
        return this.f26166d;
    }
}
