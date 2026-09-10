package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16008b;

    public j71(String str, String str2) {
        this.f16007a = str;
        this.f16008b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j71) {
            j71 j71Var = (j71) obj;
            String str = j71Var.f16008b;
            String str2 = j71Var.f16007a;
            String str3 = this.f16007a;
            if (str3 != null ? str3.equals(str2) : str2 == null) {
                String str4 = this.f16008b;
                if (str4 != null ? str4.equals(str) : str == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f16007a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f16008b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f16007a;
        int length = String.valueOf(str).length();
        String str2 = this.f16008b;
        StringBuilder sb2 = new StringBuilder(length + 49 + String.valueOf(str2).length() + 1);
        d5.u.r(sb2, "OverlayDisplayUpdateRequest{sessionToken=", str, ", appId=", str2);
        sb2.append("}");
        return sb2.toString();
    }
}
