package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f23679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dd f23680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final na.p f23681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oa.j0 f23682d;

    public kf(Uri uri, dd ddVar, na.p pVar, oa.j0 j0Var) {
        this.f23679a = uri;
        this.f23680b = ddVar;
        this.f23681c = pVar;
        this.f23682d = j0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kf)) {
            return false;
        }
        kf kfVar = (kf) obj;
        if (!this.f23679a.equals(kfVar.f23679a) || !this.f23680b.equals(kfVar.f23680b) || !this.f23681c.equals(kfVar.f23681c) || !this.f23682d.equals(kfVar.f23682d)) {
            return false;
        }
        Object obj2 = f1.f23447c;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((((((this.f23682d.hashCode() ^ ((((((this.f23679a.hashCode() ^ 1000003) * 1000003) ^ this.f23680b.hashCode()) * 1000003) ^ this.f23681c.hashCode()) * 1000003)) * 1000003) ^ f1.f23447c.hashCode()) * 1000003) ^ 1231) * 1000003) ^ 1237;
    }

    public final String toString() {
        String string = this.f23679a.toString();
        int length = string.length();
        String string2 = this.f23680b.toString();
        int length2 = string2.length();
        f1 f1Var = f1.f23447c;
        String strValueOf = String.valueOf(this.f23681c);
        String strValueOf2 = String.valueOf(this.f23682d);
        String string3 = f1Var.toString();
        int length3 = strValueOf.length();
        int length4 = strValueOf2.length();
        StringBuilder sb2 = new StringBuilder(length + 34 + length2 + 10 + length3 + 13 + length4 + 16 + string3.length() + 32 + String.valueOf(true).length() + 22);
        d5.u.r(sb2, "ProtoDataStoreConfig{uri=", string, ", schema=", string2);
        d5.u.r(sb2, ", handler=", strValueOf, ", migrations=", strValueOf2);
        return q4.a.j(sb2, ", variantConfig=", string3, ", useGeneratedExtensionRegistry=true, enableTracing=false}");
    }
}
