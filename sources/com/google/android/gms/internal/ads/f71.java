package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14305b;

    public f71(String str, String str2) {
        this.f14304a = str;
        this.f14305b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f71) {
            f71 f71Var = (f71) obj;
            String str = f71Var.f14305b;
            String str2 = f71Var.f14304a;
            String str3 = this.f14304a;
            if (str3 != null ? str3.equals(str2) : str2 == null) {
                String str4 = this.f14305b;
                if (str4 != null ? str4.equals(str) : str == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f14304a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f14305b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f14304a;
        int length = String.valueOf(str).length();
        String str2 = this.f14305b;
        StringBuilder sb2 = new StringBuilder(length + 50 + String.valueOf(str2).length() + 1);
        d5.u.r(sb2, "OverlayDisplayDismissRequest{sessionToken=", str, ", appId=", str2);
        sb2.append("}");
        return sb2.toString();
    }
}
