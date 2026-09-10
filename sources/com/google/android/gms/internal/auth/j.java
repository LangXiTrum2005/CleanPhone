package com.google.android.gms.internal.auth;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f22848b;

    public j(Context context, x xVar) {
        this.f22847a = context;
        this.f22848b = xVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f22847a.equals(jVar.f22847a) && this.f22848b.equals(jVar.f22848b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f22848b.hashCode() ^ ((this.f22847a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return l1.d.h("FlagsContext{context=", this.f22847a.toString(), ", hermeticFileOverrides=", this.f22848b.toString(), "}");
    }
}
