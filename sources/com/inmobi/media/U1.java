package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class U1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f23248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23249c;
    public String d;

    public U1(String eventType, String str) {
        Intrinsics.f(eventType, "eventType");
        this.f23247a = eventType;
        this.d = str;
        this.f23248b = System.currentTimeMillis();
    }

    public final String a() {
        String str = this.d;
        return str == null ? "" : str;
    }
}
