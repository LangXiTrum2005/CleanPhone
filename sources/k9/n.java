package k9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends l9.a {

    @NonNull
    public static final Parcelable.Creator<n> CREATOR = new f9.d(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f44487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f44489e;

    public n(int i10, int i11, int i12, boolean z10, boolean z11) {
        this.f44485a = i10;
        this.f44486b = z10;
        this.f44487c = z11;
        this.f44488d = i11;
        this.f44489e = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 4);
        parcel.writeInt(this.f44485a);
        r9.b.Q(parcel, 2, 4);
        parcel.writeInt(this.f44486b ? 1 : 0);
        r9.b.Q(parcel, 3, 4);
        parcel.writeInt(this.f44487c ? 1 : 0);
        r9.b.Q(parcel, 4, 4);
        parcel.writeInt(this.f44488d);
        r9.b.Q(parcel, 5, 4);
        parcel.writeInt(this.f44489e);
        r9.b.S(parcel, iR);
    }
}
