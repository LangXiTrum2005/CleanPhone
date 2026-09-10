package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15558b;

    static {
        String str = uu0.f20901a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public i32(String str, String str2) {
        this.f15557a = uu0.p(str);
        this.f15558b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i32.class == obj.getClass()) {
            i32 i32Var = (i32) obj;
            if (Objects.equals(this.f15557a, i32Var.f15557a) && Objects.equals(this.f15558b, i32Var.f15558b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f15558b.hashCode() * 31;
        String str = this.f15557a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f15557a;
        int length = String.valueOf(str).length();
        String str2 = this.f15558b;
        StringBuilder sb2 = new StringBuilder(length + 10 + String.valueOf(str2).length() + 3);
        d5.u.r(sb2, "{ lang=", str, ", '", str2);
        sb2.append("' }");
        return sb2.toString();
    }
}
