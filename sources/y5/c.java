package y5;

import android.os.Parcel;
import com.google.android.gms.internal.play_billing.e;
import com.google.android.gms.internal.play_billing.j4;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends com.google.android.gms.internal.auth.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j4 f54211b;

    public c(j4 j4Var) {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback", 1);
        this.f54211b = j4Var;
    }

    @Override // com.google.android.gms.internal.auth.c
    public final boolean w1(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        int i11 = parcel.readInt();
        e.b(parcel);
        this.f54211b.a(Integer.valueOf(i11));
        return true;
    }
}
