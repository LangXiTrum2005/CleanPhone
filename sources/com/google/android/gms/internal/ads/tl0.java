package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.zzm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class tl0 extends bm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f20438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzm f20439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20441d;

    public tl0(Activity activity, zzm zzmVar, String str, String str2) {
        this.f20438a = activity;
        this.f20439b = zzmVar;
        this.f20440c = str;
        this.f20441d = str2;
    }

    public final boolean equals(Object obj) {
        zzm zzmVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bm0) {
            tl0 tl0Var = (tl0) ((bm0) obj);
            String str3 = tl0Var.f20441d;
            String str4 = tl0Var.f20440c;
            zzm zzmVar2 = tl0Var.f20439b;
            if (this.f20438a.equals(tl0Var.f20438a) && ((zzmVar = this.f20439b) != null ? zzmVar.equals(zzmVar2) : zzmVar2 == null) && ((str = this.f20440c) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f20441d) != null ? str2.equals(str3) : str3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f20438a.hashCode() ^ 1000003;
        zzm zzmVar = this.f20439b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (zzmVar == null ? 0 : zzmVar.hashCode())) * 1000003;
        String str = this.f20440c;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f20441d;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String string = this.f20438a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f20439b);
        int length2 = strValueOf.length();
        String str = this.f20440c;
        int length3 = String.valueOf(str).length();
        String str2 = this.f20441d;
        StringBuilder sb2 = new StringBuilder(length + 40 + length2 + 13 + length3 + 6 + String.valueOf(str2).length() + 1);
        d5.u.r(sb2, "OfflineUtilsParams{activity=", string, ", adOverlay=", strValueOf);
        d5.u.r(sb2, ", gwsQueryId=", str, ", uri=", str2);
        sb2.append("}");
        return sb2.toString();
    }
}
