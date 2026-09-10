package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f24102b = new t(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f24103c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f24104a;

    static {
        List list = Collections.EMPTY_LIST;
        f24103c = new w(new v());
    }

    public w(v vVar) {
        this.f24104a = vVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w) && ((w) obj).f24104a.equals(this.f24104a);
    }

    public final int hashCode() {
        return ~this.f24104a.hashCode();
    }

    public final String toString() {
        return this.f24104a.toString();
    }
}
