package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h71 extends m71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f15201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f15206f;

    public h71(IBinder iBinder, String str, int i10, float f10, int i11, String str2) {
        this.f15201a = iBinder;
        this.f15202b = str;
        this.f15203c = i10;
        this.f15204d = f10;
        this.f15205e = i11;
        this.f15206f = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof m71) {
            h71 h71Var = (h71) ((m71) obj);
            String str3 = h71Var.f15206f;
            String str4 = h71Var.f15202b;
            if (this.f15201a.equals(h71Var.f15201a) && ((str = this.f15202b) != null ? str.equals(str4) : str4 == null) && this.f15203c == h71Var.f15203c && Float.floatToIntBits(this.f15204d) == Float.floatToIntBits(h71Var.f15204d) && this.f15205e == h71Var.f15205e && ((str2 = this.f15206f) != null ? str2.equals(str3) : str3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f15201a.hashCode() ^ 1000003;
        String str = this.f15202b;
        int iHashCode2 = (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f15203c) * 1000003) ^ Float.floatToIntBits(this.f15204d);
        String str2 = this.f15206f;
        return (((this.f15205e ^ (iHashCode2 * 1525764945)) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        String string = this.f15201a.toString();
        int length = string.length();
        String str = this.f15202b;
        int length2 = String.valueOf(str).length();
        int i10 = this.f15203c;
        int length3 = String.valueOf(i10).length();
        float f10 = this.f15204d;
        int length4 = String.valueOf(f10).length();
        int i11 = this.f15205e;
        int length5 = String.valueOf(i11).length();
        String str2 = this.f15206f;
        StringBuilder sb2 = new StringBuilder(length + 46 + length2 + 16 + length3 + 23 + length4 + 65 + length5 + 33 + String.valueOf(str2).length() + 30);
        d5.u.r(sb2, "OverlayDisplayShowRequest{windowToken=", string, ", appId=", str);
        sb2.append(", layoutGravity=");
        sb2.append(i10);
        sb2.append(", layoutVerticalMargin=");
        sb2.append(f10);
        sb2.append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        sb2.append(i11);
        sb2.append(", deeplinkUrl=null, adFieldEnifd=");
        sb2.append(str2);
        sb2.append(", thirdPartyAuthCallerId=null}");
        return sb2.toString();
    }
}
