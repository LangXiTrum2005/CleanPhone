package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3307xb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f24103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24104b;

    public C3307xb(byte b2, String assetUrl) {
        Intrinsics.f(assetUrl, "assetUrl");
        this.f24103a = b2;
        this.f24104b = assetUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3307xb)) {
            return false;
        }
        C3307xb c3307xb = (C3307xb) obj;
        return this.f24103a == c3307xb.f24103a && Intrinsics.a(this.f24104b, c3307xb.f24104b);
    }

    public final int hashCode() {
        return this.f24104b.hashCode() + (Byte.hashCode(this.f24103a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RawAsset(mRawAssetType=");
        sb.append((int) this.f24103a);
        sb.append(", assetUrl=");
        return androidx.media3.extractor.text.ttml.a.p(sb, this.f24104b, ')');
    }
}
