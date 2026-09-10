package ia;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.c0;
import com.google.android.gms.common.api.internal.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends com.google.android.gms.internal.auth.c {
    @Override // com.google.android.gms.internal.auth.c
    public final boolean m0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 3:
                x9.a.b(parcel);
                break;
            case 4:
                x9.a.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                x9.a.b(parcel);
                break;
            case 7:
                x9.a.b(parcel);
                break;
            case 8:
                f fVar = (f) x9.a.a(parcel, f.CREATOR);
                x9.a.b(parcel);
                c0 c0Var = (c0) this;
                c0Var.f11682c.post(new i0(c0Var, fVar, 3));
                break;
            case 9:
                x9.a.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
