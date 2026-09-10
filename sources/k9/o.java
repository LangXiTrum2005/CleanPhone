package k9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends l9.a {

    @NonNull
    public static final Parcelable.Creator<o> CREATOR = new f9.d(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f44492b;

    public o(int i10, List list) {
        this.f44491a = i10;
        this.f44492b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 4);
        parcel.writeInt(this.f44491a);
        r9.b.O(parcel, 2, this.f44492b);
        r9.b.S(parcel, iR);
    }
}
