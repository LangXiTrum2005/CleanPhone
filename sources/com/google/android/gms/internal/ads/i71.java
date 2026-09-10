package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i71 extends n71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f15647d;

    public i71(int i10, String str, int i11, Boolean bool) {
        this.f15644a = i10;
        this.f15645b = str;
        this.f15646c = i11;
        this.f15647d = bool;
    }

    public final boolean equals(Object obj) {
        String str;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof n71) {
            i71 i71Var = (i71) ((n71) obj);
            Boolean bool2 = i71Var.f15647d;
            String str2 = i71Var.f15645b;
            if (this.f15644a == i71Var.f15644a && ((str = this.f15645b) != null ? str.equals(str2) : str2 == null) && this.f15646c == i71Var.f15646c && ((bool = this.f15647d) != null ? bool.equals(bool2) : bool2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f15645b;
        int iHashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.f15647d;
        return ((this.f15646c ^ ((iHashCode ^ ((this.f15644a ^ 1000003) * 1000003)) * 1000003)) * 1000003) ^ (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        int i10 = this.f15644a;
        int length = String.valueOf(i10).length();
        String str = this.f15645b;
        int length2 = String.valueOf(str).length();
        int i11 = this.f15646c;
        int length3 = String.valueOf(i11).length();
        Boolean bool = this.f15647d;
        StringBuilder sb2 = new StringBuilder(length + 46 + length2 + 9 + length3 + 17 + String.valueOf(bool).length() + 1);
        sb2.append("OverlayDisplayState{statusCode=");
        sb2.append(i10);
        sb2.append(", sessionToken=");
        sb2.append(str);
        sb2.append(", uiMode=");
        sb2.append(i11);
        sb2.append(", userInteracted=");
        sb2.append(bool);
        sb2.append("}");
        return sb2.toString();
    }
}
