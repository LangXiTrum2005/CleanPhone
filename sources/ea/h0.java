package ea;

import android.os.Parcel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends com.google.android.gms.internal.auth.a implements i0 {
    @Override // ea.i0
    public final void l0(List list) {
        Parcel parcelU1 = u1();
        parcelU1.writeTypedList(list);
        x1(parcelU1);
    }
}
