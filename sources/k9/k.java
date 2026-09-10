package k9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends l9.a {

    @NonNull
    public static final Parcelable.Creator<k> CREATOR = new f9.d(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f44461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f44462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f44463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f44464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f44465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f44466i;

    public k(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f44458a = i10;
        this.f44459b = i11;
        this.f44460c = i12;
        this.f44461d = j10;
        this.f44462e = j11;
        this.f44463f = str;
        this.f44464g = str2;
        this.f44465h = i13;
        this.f44466i = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 4);
        parcel.writeInt(this.f44458a);
        r9.b.Q(parcel, 2, 4);
        parcel.writeInt(this.f44459b);
        r9.b.Q(parcel, 3, 4);
        parcel.writeInt(this.f44460c);
        r9.b.Q(parcel, 4, 8);
        parcel.writeLong(this.f44461d);
        r9.b.Q(parcel, 5, 8);
        parcel.writeLong(this.f44462e);
        r9.b.J(parcel, 6, this.f44463f);
        r9.b.J(parcel, 7, this.f44464g);
        r9.b.Q(parcel, 8, 4);
        parcel.writeInt(this.f44465h);
        r9.b.Q(parcel, 9, 4);
        parcel.writeInt(this.f44466i);
        r9.b.S(parcel, iR);
    }
}
