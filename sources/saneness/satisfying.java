package saneness;

import ads_mobile_sdk.if0;
import ads_mobile_sdk.tn0;
import ads_mobile_sdk.x23;
import ads_mobile_sdk.ya0;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class satisfying extends motel {
    public satisfying() {
        super("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    @Override // saneness.motel
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String trustlessToken = parcel.readString();
            Parcelable.Creator<ya0> creator = ya0.CREATOR;
            int i2 = estragon.f37140attabal;
            ya0 decagonRequestParcel = (ya0) (parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
            int iDataAvail = parcel.dataAvail();
            if (iDataAvail > 0) {
                throw new BadParcelableException(rotissomat.attabal("Parcel data not fully consumed, unread size: ", iDataAvail));
            }
            x23 x23Var = (x23) this;
            Intrinsics.checkNotNullParameter(trustlessToken, "trustlessToken");
            Intrinsics.checkNotNullParameter(decagonRequestParcel, "decagonRequestParcel");
            tn0 tn0Var = new tn0(trustlessToken);
            if (!x23Var.f.getAndSet(true)) {
                x23Var.h.saran(tn0Var);
            }
        } else {
            if (i != 2) {
                return false;
            }
            Parcelable.Creator<if0> creator2 = if0.CREATOR;
            int i3 = estragon.f37140attabal;
            if0 if0Var = (if0) (parcel.readInt() != 0 ? creator2.createFromParcel(parcel) : null);
            int iDataAvail2 = parcel.dataAvail();
            if (iDataAvail2 > 0) {
                throw new BadParcelableException(rotissomat.attabal("Parcel data not fully consumed, unread size: ", iDataAvail2));
            }
            ((x23) this).a(if0Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
