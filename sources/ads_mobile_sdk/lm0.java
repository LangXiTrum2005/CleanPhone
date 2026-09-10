package ads_mobile_sdk;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.LinkedBlockingQueue;
import saneness.affiche;
import saneness.estragon;
import saneness.psalmodic;
import saneness.shinplaster;

/* JADX INFO: loaded from: classes.dex */
public final class lm0 implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public final mm0 a;
    public final String b;
    public final String c;
    public final dh d;
    public final int e = 1;
    public final LinkedBlockingQueue f;
    public final HandlerThread g;
    public final psalmodic h;
    public final long i;

    public lm0(Context context, dh dhVar, String str, String str2, psalmodic psalmodicVar) {
        this.b = str;
        this.d = dhVar;
        this.c = str2;
        this.h = psalmodicVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.g = handlerThread;
        handlerThread.start();
        this.i = System.currentTimeMillis();
        this.a = new mm0(context, handlerThread.getLooper(), this, this, 19621000);
        this.f = new LinkedBlockingQueue();
        a();
    }

    public final void a() {
        this.a.checkAvailabilityAndConnect();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        affiche afficheVar;
        try {
            afficheVar = (affiche) this.a.getService();
        } catch (DeadObjectException | IllegalStateException unused) {
            afficheVar = null;
        }
        if (afficheVar != null) {
            try {
                k72 k72Var = new k72(1, this.e, this.d.a, this.b, this.c);
                shinplaster shinplasterVar = (shinplaster) afficheVar;
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(shinplasterVar.b);
                int i = estragon.f37140attabal;
                parcelObtain.writeInt(1);
                k72Var.writeToParcel(parcelObtain, 0);
                Parcel parcelA = shinplasterVar.a(parcelObtain, 3);
                m72 m72VarCreateFromParcel = parcelA.readInt() == 0 ? null : m72.CREATOR.createFromParcel(parcelA);
                parcelA.recycle();
                a(IronSourceConstants.errorCode_internal, this.i, null);
                this.f.put(m72VarCreateFromParcel);
                mm0 mm0Var = this.a;
                if (mm0Var != null && (mm0Var.isConnected() || this.a.isConnecting())) {
                }
            } catch (Throwable th) {
                try {
                    a(2010, this.i, new Exception(th));
                } finally {
                    mm0 mm0Var2 = this.a;
                    if (mm0Var2 != null && (mm0Var2.isConnected() || this.a.isConnecting())) {
                        this.a.disconnect();
                    }
                    this.g.quit();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            a(4012, this.i, null);
            this.f.put(new m72(null, 1, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            a(4011, this.i, null);
            this.f.put(new m72(null, 1, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final void a(int i, long j, Exception exc) {
        psalmodic psalmodicVar = this.h;
        if (psalmodicVar != null) {
            psalmodicVar.a(i, System.currentTimeMillis() - j, exc);
        }
    }
}
