package ea;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends l9.a implements Iterable {
    public static final Parcelable.Creator<t> CREATOR = new android.support.v4.media.a(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f39765a;

    public t(Bundle bundle) {
        this.f39765a = bundle;
    }

    public final Object b(String str) {
        return this.f39765a.get(str);
    }

    public final Double h() {
        return Double.valueOf(this.f39765a.getDouble(X3.i.X));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new s(this);
    }

    public final String m() {
        return this.f39765a.getString("currency");
    }

    public final Bundle n() {
        return new Bundle(this.f39765a);
    }

    public final String toString() {
        return this.f39765a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.C(parcel, 2, n());
        r9.b.S(parcel, iR);
    }
}
