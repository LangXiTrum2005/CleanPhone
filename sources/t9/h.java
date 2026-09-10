package t9;

import android.os.Parcel;
import com.applovin.impl.ca;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends com.google.android.gms.internal.auth.a {
    public final s9.a C1(s9.b bVar, String str, int i10, s9.b bVar2) {
        Parcel parcelU1 = u1();
        z9.g.b(parcelU1, bVar);
        parcelU1.writeString(str);
        parcelU1.writeInt(i10);
        z9.g.b(parcelU1, bVar2);
        return ca.o(r(parcelU1, 2));
    }

    public final s9.a D1(s9.b bVar, String str, int i10, s9.b bVar2) {
        Parcel parcelU1 = u1();
        z9.g.b(parcelU1, bVar);
        parcelU1.writeString(str);
        parcelU1.writeInt(i10);
        z9.g.b(parcelU1, bVar2);
        return ca.o(r(parcelU1, 3));
    }
}
