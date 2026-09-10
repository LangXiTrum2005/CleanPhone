package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2789b4 extends AbstractC3142p4 {
    public final String a;
    public final int b;
    public final long c;

    public C2789b4(int i, long j, String configType) {
        Intrinsics.checkNotNullParameter(configType, "configType");
        this.a = configType;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2789b4)) {
            return false;
        }
        C2789b4 c2789b4 = (C2789b4) obj;
        return Intrinsics.wireman(this.a, c2789b4.a) && this.b == c2789b4.b && this.c == c2789b4.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + AbstractC2906fi.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ConfigFailure(configType=" + this.a + ", errorCode=" + this.b + ", lastUpdatedTimestamp=" + this.c + ")";
    }
}
