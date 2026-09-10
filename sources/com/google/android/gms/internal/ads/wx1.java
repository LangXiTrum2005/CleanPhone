package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wx1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wx1 f21618b = new wx1(new HashMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f21619a;

    public /* synthetic */ wx1(HashMap map) {
        this.f21619a = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wx1) {
            return this.f21619a.equals(((wx1) obj).f21619a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21619a.hashCode();
    }
}
