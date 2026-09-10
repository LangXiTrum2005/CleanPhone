package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3807b;

    public RatingCompat(int i10, float f10) {
        this.f3806a = i10;
        this.f3807b = f10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f3806a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f3806a);
        sb2.append(" rating=");
        float f10 = this.f3807b;
        sb2.append(f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? "unrated" : String.valueOf(f10));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f3806a);
        parcel.writeFloat(this.f3807b);
    }
}
