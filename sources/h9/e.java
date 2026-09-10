package h9;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new f9.d(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Messenger f42265a;

    public e(IBinder iBinder) {
        this.f42265a = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            try {
                return this.f42265a.getBinder().equals(((e) obj).f42265a.getBinder());
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f42265a.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStrongBinder(this.f42265a.getBinder());
    }
}
