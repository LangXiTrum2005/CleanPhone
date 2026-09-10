package com.inmobi.media;

import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3324yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public I9 f24133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f24134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f24135c;
    public Integer d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24136e;

    public final String toString() {
        return "STATUS_CODE:" + this.d + " | ERROR:" + this.f24133a + " | HEADERS:" + this.f24134b + " | RESPONSE: " + J9.a(this.f24135c);
    }
}
