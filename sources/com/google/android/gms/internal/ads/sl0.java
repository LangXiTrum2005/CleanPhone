package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Drawable f19996c;

    public sl0(String str, String str2, Drawable drawable) {
        this.f19994a = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.f19995b = str2;
        this.f19996c = drawable;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof sl0) {
            sl0 sl0Var = (sl0) obj;
            Drawable drawable2 = sl0Var.f19996c;
            String str = sl0Var.f19994a;
            String str2 = this.f19994a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.f19995b.equals(sl0Var.f19995b) && ((drawable = this.f19996c) != null ? drawable.equals(drawable2) : drawable2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f19994a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f19995b.hashCode();
        Drawable drawable = this.f19996c;
        return (iHashCode * 1000003) ^ (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f19996c);
        String str = this.f19994a;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        String str2 = this.f19995b;
        StringBuilder sb2 = new StringBuilder(str2.length() + length + 42 + 7 + length2 + 1);
        d5.u.r(sb2, "OfflineAdAssets{advertiserName=", str, ", imageUrl=", str2);
        return q4.a.j(sb2, ", icon=", strValueOf, "}");
    }
}
