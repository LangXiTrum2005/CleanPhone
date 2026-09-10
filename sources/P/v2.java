package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 extends q0.b {
    public static final Parcelable.Creator<v2> CREATOR = new androidx.fragment.app.g0(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f47836d;

    public v2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f47835c = parcel.readInt();
        this.f47836d = parcel.readInt() != 0;
    }

    @Override // q0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f47835c);
        parcel.writeInt(this.f47836d ? 1 : 0);
    }
}
