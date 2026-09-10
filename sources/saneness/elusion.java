package saneness;

import ads_mobile_sdk.j62;
import ads_mobile_sdk.k62;
import ads_mobile_sdk.lm2;
import ads_mobile_sdk.qm2;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class elusion extends motel {
    public elusion() {
        super("com.google.android.play.core.prewarm.protocol.IPrewarmServiceCallback");
    }

    @Override // saneness.motel
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i2 = estragon.f37140attabal;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(rotissomat.attabal("Parcel data not fully consumed, unread size: ", iDataAvail));
        }
        k62 k62Var = ((j62) this).a;
        if (k62Var.a != null) {
            k62.c.a("detach", new Object[0]);
            qm2 qm2Var = k62Var.a;
            qm2Var.getClass();
            qm2Var.b(new lm2(qm2Var));
        }
        return true;
    }
}
