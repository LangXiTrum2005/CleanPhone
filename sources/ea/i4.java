package ea;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class i4 extends l9.a {
    public static final Parcelable.Creator<i4> CREATOR = new android.support.v4.media.a(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f39486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f39487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f39488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f39489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f39490g;

    public i4(int i10, String str, long j10, Long l, Float f10, String str2, String str3, Double d10) {
        this.f39484a = i10;
        this.f39485b = str;
        this.f39486c = j10;
        this.f39487d = l;
        this.f39490g = i10 == 1 ? f10 != null ? Double.valueOf(f10.doubleValue()) : null : d10;
        this.f39488e = str2;
        this.f39489f = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        android.support.v4.media.a.b(this, parcel);
    }

    public final Object zza() {
        Long l = this.f39487d;
        if (l != null) {
            return l;
        }
        Double d10 = this.f39490g;
        if (d10 != null) {
            return d10;
        }
        String str = this.f39488e;
        if (str != null) {
            return str;
        }
        return null;
    }

    public i4(long j10, Object obj, String str, String str2) {
        k9.c0.e(str);
        this.f39484a = 2;
        this.f39485b = str;
        this.f39486c = j10;
        this.f39489f = str2;
        if (obj == null) {
            this.f39487d = null;
            this.f39490g = null;
            this.f39488e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f39487d = (Long) obj;
            this.f39490g = null;
            this.f39488e = null;
        } else if (obj instanceof String) {
            this.f39487d = null;
            this.f39490g = null;
            this.f39488e = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f39487d = null;
                this.f39490g = (Double) obj;
                this.f39488e = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public i4(j4 j4Var) {
        this(j4Var.f39520d, j4Var.f39521e, j4Var.f39519c, j4Var.f39518b);
    }
}
