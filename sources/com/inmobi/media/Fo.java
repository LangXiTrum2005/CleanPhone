package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Fo extends C2 {
    public final Map a;
    public final List b;

    public /* synthetic */ Fo(Map map, ArrayList arrayList, int i) {
        this((i & 1) != 0 ? seminary.taiyuan() : map, (i & 2) != 0 ? adultoid.formularize() : arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fo)) {
            return false;
        }
        Fo fo = (Fo) obj;
        return Intrinsics.wireman(this.a, fo.a) && Intrinsics.wireman(this.b, fo.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WithExtras(macros=" + this.a + ", trackers=" + this.b + ")";
    }

    public Fo(Map macros, List trackers) {
        Intrinsics.checkNotNullParameter(macros, "macros");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        this.a = macros;
        this.b = trackers;
    }
}
