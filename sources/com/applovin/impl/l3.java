package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaxAdFormat f8344b;

    public l3(String str, MaxAdFormat maxAdFormat) {
        this.f8343a = str;
        this.f8344b = maxAdFormat;
    }

    public boolean a(Object obj) {
        return obj instanceof l3;
    }

    public String b() {
        return this.f8343a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) obj;
        if (!l3Var.a(this)) {
            return false;
        }
        String strB = b();
        String strB2 = l3Var.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        MaxAdFormat maxAdFormatA = a();
        MaxAdFormat maxAdFormatA2 = l3Var.a();
        return maxAdFormatA != null ? maxAdFormatA.equals(maxAdFormatA2) : maxAdFormatA2 == null;
    }

    public int hashCode() {
        String strB = b();
        int iHashCode = strB == null ? 43 : strB.hashCode();
        MaxAdFormat maxAdFormatA = a();
        return ((iHashCode + 59) * 59) + (maxAdFormatA != null ? maxAdFormatA.hashCode() : 43);
    }

    public String toString() {
        return this.f8343a + "-" + this.f8344b.getLabel();
    }

    public MaxAdFormat a() {
        return this.f8344b;
    }

    public static l3 a(String str) {
        String[] strArrSplit = str.split("-");
        return new l3(strArrSplit[0], MaxAdFormat.formatFromString(strArrSplit[1]));
    }
}
