package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements Parcelable {
    public static final Parcelable.Creator<m1> CREATOR = new android.support.v4.media.a(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f4827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4828d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f4825a + ", mGapDir=" + this.f4826b + ", mHasUnwantedGapAfter=" + this.f4828d + ", mGapPerSpan=" + Arrays.toString(this.f4827c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4825a);
        parcel.writeInt(this.f4826b);
        parcel.writeInt(this.f4828d ? 1 : 0);
        int[] iArr = this.f4827c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f4827c);
        }
    }
}
