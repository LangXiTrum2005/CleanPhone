package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new android.support.v4.media.a(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3817e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f3813a);
        parcel.writeInt(this.f3815c);
        parcel.writeInt(this.f3816d);
        parcel.writeInt(this.f3817e);
        parcel.writeInt(this.f3814b);
    }
}
