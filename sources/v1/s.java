package v1;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f52420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f52421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f52422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f52423f;

    public s(int i10, int i11, String str, String str2, String str3, String str4) {
        this.f52418a = i10;
        this.f52419b = i11;
        this.f52420c = str;
        this.f52421d = str2;
        this.f52422e = str3;
        this.f52423f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (this.f52418a == sVar.f52418a && this.f52419b == sVar.f52419b && TextUtils.equals(this.f52420c, sVar.f52420c) && TextUtils.equals(this.f52421d, sVar.f52421d) && TextUtils.equals(this.f52422e, sVar.f52422e) && TextUtils.equals(this.f52423f, sVar.f52423f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = ((this.f52418a * 31) + this.f52419b) * 31;
        String str = this.f52420c;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f52421d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f52422e;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f52423f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
