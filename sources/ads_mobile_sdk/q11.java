package ads_mobile_sdk;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import saneness.biogenic;
import saneness.dextrorotary;
import saneness.droppable;
import saneness.estragon;
import saneness.haemopoiesis;
import saneness.macropsia;
import saneness.rotproof;

/* JADX INFO: loaded from: classes.dex */
public final class q11 extends dextrorotary {
    public int a = 0;
    public final Context b;
    public final String c;
    public rotproof d;
    public p11 e;

    public q11(Context context) {
        this.b = context.getApplicationContext();
        this.c = a(context);
    }

    public final kd2 a() throws RemoteException {
        if (this.a != 2 || this.d == null || this.e == null) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.c);
        try {
            macropsia macropsiaVar = (macropsia) this.d;
            macropsiaVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(macropsiaVar.b);
            int i = estragon.f37140attabal;
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            Parcel parcelA = macropsiaVar.a(parcelObtain, 1);
            Parcelable parcelable = parcelA.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(parcelA);
            parcelA.recycle();
            return new kd2((Bundle) parcelable);
        } catch (RemoteException e) {
            biogenic.saneness("RemoteException getting install referrer information");
            this.a = 0;
            throw e;
        }
    }

    public static String a(Context context) {
        if (claque.attabal.wireman() && SdkExtensions.getExtensionVersion(34) >= 8) {
            if (Process.isSdkSandbox()) {
                return droppable.attabal(context.getSystemService(haemopoiesis.attabal())).getClientPackageName();
            }
            return context.getPackageName();
        }
        return context.getPackageName();
    }
}
