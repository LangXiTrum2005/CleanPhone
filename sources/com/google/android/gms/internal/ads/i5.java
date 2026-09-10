package com.google.android.gms.internal.ads;

import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i5 implements v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15575b;

    public i5(String str, String str2) {
        this.f15574a = x10.o(str);
        this.f15575b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.v7
    public final void a(o6 o6Var) {
        Integer numO;
        Integer numO2;
        Integer numO3;
        Integer numO4;
        String str = this.f15574a;
        int iHashCode = str.hashCode();
        String str2 = this.f15575b;
        switch (iHashCode) {
            case -1935137620:
                if (str.equals("TOTALTRACKS") && (numO = gc1.o(str2)) != null) {
                    o6Var.f18159i = numO;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS") && (numO2 = gc1.o(str2)) != null) {
                    o6Var.f18171v = numO2;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER") && (numO3 = gc1.o(str2)) != null) {
                    o6Var.f18158h = numO3;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    o6Var.f18153c = str2;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    o6Var.f18172w = str2;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    o6Var.f18151a = str2;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    o6Var.f18155e = str2;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER") && (numO4 = gc1.o(str2)) != null) {
                    o6Var.f18170u = numO4;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    o6Var.f18154d = str2;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    o6Var.f18152b = str2;
                }
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i5.class == obj.getClass()) {
            i5 i5Var = (i5) obj;
            if (this.f15574a.equals(i5Var.f15574a) && this.f15575b.equals(i5Var.f15575b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f15575b.hashCode() + ((this.f15574a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final String toString() {
        String str = this.f15574a;
        int length = String.valueOf(str).length();
        String str2 = this.f15575b;
        return d5.u.h(new StringBuilder(length + 5 + String.valueOf(str2).length()), "VC: ", str, X3.j.f27830b, str2);
    }
}
