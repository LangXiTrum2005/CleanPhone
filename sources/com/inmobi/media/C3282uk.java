package com.inmobi.media;

import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.uk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3282uk {
    public final String a;
    public final Map b;

    public C3282uk(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3282uk)) {
            return false;
        }
        C3282uk c3282uk = (C3282uk) obj;
        return Intrinsics.wireman(this.a, c3282uk.a) && Intrinsics.wireman(this.b, c3282uk.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map map = this.b;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "TokenMetaData(keywords=" + this.a + ", extras=" + this.b + ")";
    }
}
