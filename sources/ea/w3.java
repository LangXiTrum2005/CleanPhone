package ea;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class w3 extends l9.a {
    public static final Parcelable.Creator<w3> CREATOR = new android.support.v4.media.a(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f39870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f39872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f39874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f39875g;

    public w3(long j10, byte[] bArr, String str, Bundle bundle, int i10, long j11, String str2) {
        this.f39869a = j10;
        this.f39870b = bArr;
        this.f39871c = str;
        this.f39872d = bundle;
        this.f39873e = i10;
        this.f39874f = j11;
        this.f39875g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 8);
        parcel.writeLong(this.f39869a);
        r9.b.D(parcel, 2, this.f39870b);
        r9.b.J(parcel, 3, this.f39871c);
        r9.b.C(parcel, 4, this.f39872d);
        r9.b.Q(parcel, 5, 4);
        parcel.writeInt(this.f39873e);
        r9.b.Q(parcel, 6, 8);
        parcel.writeLong(this.f39874f);
        r9.b.J(parcel, 7, this.f39875g);
        r9.b.S(parcel, iR);
    }
}
