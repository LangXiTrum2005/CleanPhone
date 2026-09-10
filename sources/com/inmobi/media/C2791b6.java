package com.inmobi.media;

import okio.ByteString;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.b6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2791b6 implements Ne {
    public final EnumC2765a6 a;
    public final ByteString b;

    public C2791b6(String url, EnumC2765a6 errorCode) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.a = errorCode;
        this.b = ByteString.EMPTY;
    }

    @Override // com.inmobi.media.Ne
    public final Object a() {
        return null;
    }

    @Override // com.inmobi.media.Ne
    public final Ie b() {
        return new Ie(0L, seminary.taiyuan(), 0, "");
    }

    @Override // com.inmobi.media.Ne
    public final int c() {
        return this.a.a;
    }

    @Override // com.inmobi.media.Ne
    public final ByteString d() {
        return this.b;
    }

    @Override // com.inmobi.media.Ne
    public final String e() {
        return this.a.name();
    }
}
