package ia;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import j9.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends l9.a implements o {
    public static final Parcelable.Creator<b> CREATOR = new f9.d(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f42972c;

    public b(int i10, int i11, Intent intent) {
        this.f42970a = i10;
        this.f42971b = i11;
        this.f42972c = intent;
    }

    @Override // j9.o
    public final Status getStatus() {
        return this.f42971b == 0 ? Status.f11649e : Status.f11653i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 4);
        parcel.writeInt(this.f42970a);
        r9.b.Q(parcel, 2, 4);
        parcel.writeInt(this.f42971b);
        r9.b.I(parcel, 3, this.f42972c, i10);
        r9.b.S(parcel, iR);
    }
}
