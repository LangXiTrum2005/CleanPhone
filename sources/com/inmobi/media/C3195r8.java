package com.inmobi.media;

import java.util.ArrayList;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.r8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3195r8 {
    public final ArrayList a;
    public final Map b;
    public final String c;
    public final String d;
    public final boolean e;

    public C3195r8(ArrayList omidTrackers, Map macros, String customReferenceData, String str, boolean z) {
        Intrinsics.checkNotNullParameter(omidTrackers, "omidTrackers");
        Intrinsics.checkNotNullParameter(macros, "macros");
        Intrinsics.checkNotNullParameter(customReferenceData, "customReferenceData");
        this.a = omidTrackers;
        this.b = macros;
        this.c = customReferenceData;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3195r8)) {
            return false;
        }
        C3195r8 c3195r8 = (C3195r8) obj;
        return Intrinsics.wireman(this.a, c3195r8.a) && Intrinsics.wireman(this.b, c3195r8.b) && Intrinsics.wireman(this.c, c3195r8.c) && Intrinsics.wireman(this.d, c3195r8.d) && this.e == c3195r8.e;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "HybridOmidInfo(omidTrackers=" + this.a + ", macros=" + this.b + ", customReferenceData=" + this.c + ", contentUrl=" + this.d + ", isolateVerificationScripts=" + this.e + ")";
    }
}
