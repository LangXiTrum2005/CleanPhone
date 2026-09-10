package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final na.r f23621b;

    public jb(Context context, na.r rVar) {
        this.f23620a = context;
        this.f23621b = rVar;
    }

    public final boolean equals(Object obj) {
        na.r rVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof jb) {
            jb jbVar = (jb) obj;
            na.r rVar2 = jbVar.f23621b;
            if (this.f23620a.equals(jbVar.f23620a) && ((rVar = this.f23621b) != null ? rVar.equals(rVar2) : rVar2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f23620a.hashCode() ^ 1000003;
        na.r rVar = this.f23621b;
        return (rVar == null ? 0 : rVar.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        String string = this.f23620a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f23621b);
        StringBuilder sb2 = new StringBuilder(length + 45 + strValueOf.length() + 1);
        d5.u.r(sb2, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
