package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2978d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f23509c;

    public C2978d2(int i2, int i3, String str) {
        str = (i3 & 2) != 0 ? null : str;
        this.f23507a = i2;
        this.f23508b = str;
        this.f23509c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2978d2)) {
            return false;
        }
        C2978d2 c2978d2 = (C2978d2) obj;
        return this.f23507a == c2978d2.f23507a && Intrinsics.a(this.f23508b, c2978d2.f23508b) && Intrinsics.a(this.f23509c, c2978d2.f23509c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f23507a) * 31;
        String str = this.f23508b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.f23509c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BusEvent(eventId=");
        sb.append(this.f23507a);
        sb.append(", eventMessage=");
        sb.append(this.f23508b);
        sb.append(", eventData=");
        return com.applovin.impl.Z.o(sb, this.f23509c, ')');
    }

    public C2978d2(int i2, String str, Map map) {
        this.f23507a = i2;
        this.f23508b = str;
        this.f23509c = map;
    }
}
