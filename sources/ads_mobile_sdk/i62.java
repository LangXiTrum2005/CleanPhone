package ads_mobile_sdk;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import saneness.byname;
import saneness.estragon;
import saneness.provostship;

/* JADX INFO: loaded from: classes.dex */
public final class i62 extends lk2 {
    public final /* synthetic */ b42 b;
    public final /* synthetic */ TaskCompletionSource c;
    public final /* synthetic */ k62 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i62(k62 k62Var, TaskCompletionSource taskCompletionSource, b42 b42Var, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.d = k62Var;
        this.b = b42Var;
        this.c = taskCompletionSource2;
    }

    @Override // ads_mobile_sdk.lk2
    public final void a() {
        try {
            k62 k62Var = this.d;
            byname bynameVar = (byname) k62Var.a.n;
            String str = k62Var.b;
            ArrayList arrayListA = k62.a(this.b);
            Bundle bundle = new Bundle();
            j62 j62Var = new j62(this.d);
            provostship provostshipVar = (provostship) bynameVar;
            provostshipVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(provostshipVar.b);
            parcelObtain.writeString(str);
            parcelObtain.writeTypedList(arrayListA);
            int i = estragon.f37140attabal;
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(j62Var);
            try {
                provostshipVar.a.transact(1, parcelObtain, null, 1);
            } finally {
                parcelObtain.recycle();
            }
        } catch (RemoteException e) {
            hc1 hc1Var = k62.c;
            Object[] objArr = {this.d.b};
            hc1Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                hc1.a(hc1Var.a, "prewarm(%s)", objArr);
            }
            this.c.trySetException(new RuntimeException(e));
        }
    }
}
