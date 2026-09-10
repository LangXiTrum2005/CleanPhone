package ea;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends l9.a {
    public static final Parcelable.Creator<d> CREATOR = new android.support.v4.media.a(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f39286c;

    public d(long j10, int i10, long j11) {
        this.f39284a = j10;
        this.f39285b = i10;
        this.f39286c = j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 8);
        parcel.writeLong(this.f39284a);
        r9.b.Q(parcel, 2, 4);
        parcel.writeInt(this.f39285b);
        r9.b.Q(parcel, 3, 8);
        parcel.writeLong(this.f39286c);
        r9.b.S(parcel, iR);
    }
}
