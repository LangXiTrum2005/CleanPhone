package k9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends l9.a {

    @NonNull
    public static final Parcelable.Creator<g> CREATOR = new f9.d(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f44430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f44432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f44433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f44434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f44435f;

    public g(n nVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f44430a = nVar;
        this.f44431b = z10;
        this.f44432c = z11;
        this.f44433d = iArr;
        this.f44434e = i10;
        this.f44435f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.I(parcel, 1, this.f44430a, i10);
        r9.b.Q(parcel, 2, 4);
        parcel.writeInt(this.f44431b ? 1 : 0);
        r9.b.Q(parcel, 3, 4);
        parcel.writeInt(this.f44432c ? 1 : 0);
        r9.b.G(parcel, 4, this.f44433d);
        r9.b.Q(parcel, 5, 4);
        parcel.writeInt(this.f44434e);
        r9.b.G(parcel, 6, this.f44435f);
        r9.b.S(parcel, iR);
    }
}
