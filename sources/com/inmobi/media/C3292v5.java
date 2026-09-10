package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.v5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3292v5 {
    public final boolean a;
    public final String b;

    public C3292v5(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3292v5)) {
            return false;
        }
        C3292v5 c3292v5 = (C3292v5) obj;
        return this.a == c3292v5.a && Intrinsics.wireman(this.b, c3292v5.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PlayStoreSnapshot(disabled=" + this.a + ", version=" + this.b + ")";
    }
}
