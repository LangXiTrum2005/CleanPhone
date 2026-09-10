package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2966i2 {
    public String a;
    public String b;
    public long c;
    public int d;

    public AbstractC2966i2(String eventType, String str) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.a = eventType;
        this.b = str;
        this.c = System.currentTimeMillis();
    }
}
