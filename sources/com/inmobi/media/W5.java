package com.inmobi.media;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class W5 {
    private final boolean GPID;

    public W5() {
        this(false, 1, null);
    }

    public final boolean a() {
        return this.GPID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof W5) && this.GPID == ((W5) obj).GPID;
    }

    public final int hashCode() {
        boolean z2 = this.GPID;
        if (z2) {
            return 1;
        }
        return z2 ? 1 : 0;
    }

    public final String toString() {
        return androidx.media3.extractor.text.ttml.a.r(new StringBuilder("IncludeIdParams(GPID="), this.GPID, ')');
    }

    public W5(boolean z2) {
        this.GPID = z2;
    }

    public /* synthetic */ W5(boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z2);
    }
}
