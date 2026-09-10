package ads_mobile_sdk;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import saneness.affiche;
import saneness.estragon;
import saneness.shinplaster;

/* JADX INFO: loaded from: classes.dex */
public final class im0 implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public final mm0 a;
    public final String b;
    public final String c;
    public final LinkedBlockingQueue d;
    public final HandlerThread e;

    public im0(Context context, String str, String str2) {
        this.b = str;
        this.c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.e = handlerThread;
        handlerThread.start();
        this.a = new mm0(context, handlerThread.getLooper(), this, this, 9200000);
        this.d = new LinkedBlockingQueue();
        a();
    }

    public final void a() {
        this.a.checkAvailabilityAndConnect();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        affiche afficheVar;
        mm0 mm0Var;
        try {
            afficheVar = (affiche) this.a.getService();
        } catch (DeadObjectException | IllegalStateException unused) {
            afficheVar = null;
        }
        if (afficheVar != null) {
            try {
                try {
                    pm0 pm0Var = new pm0(1, this.b, this.c);
                    shinplaster shinplasterVar = (shinplaster) afficheVar;
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken(shinplasterVar.b);
                    int i = estragon.f37140attabal;
                    parcelObtain.writeInt(1);
                    pm0Var.writeToParcel(parcelObtain, 0);
                    Parcel parcelA = shinplasterVar.a(parcelObtain, 1);
                    rm0 rm0VarCreateFromParcel = parcelA.readInt() == 0 ? null : rm0.CREATOR.createFromParcel(parcelA);
                    parcelA.recycle();
                    if (rm0VarCreateFromParcel.b == null) {
                        try {
                            rm0VarCreateFromParcel.b = ra.a(rm0VarCreateFromParcel.c, vf0.a());
                            rm0VarCreateFromParcel.c = null;
                        } catch (x81 | NullPointerException e) {
                            throw new IllegalStateException(e);
                        }
                    }
                    rm0VarCreateFromParcel.a();
                    this.d.put(rm0VarCreateFromParcel.b);
                    mm0 mm0Var2 = this.a;
                    if (mm0Var2 != null && (mm0Var2.isConnected() || this.a.isConnecting())) {
                        this.a.disconnect();
                    }
                } catch (InterruptedException unused2) {
                    mm0Var = this.a;
                    if (mm0Var != null) {
                    }
                    this.e.quit();
                } catch (Throwable th) {
                    mm0 mm0Var3 = this.a;
                    if (mm0Var3 != null && (mm0Var3.isConnected() || this.a.isConnecting())) {
                        this.a.disconnect();
                    }
                    this.e.quit();
                    throw th;
                }
            } catch (Throwable unused3) {
                this.d.put((ra) ra.t().timberyard(32768L).a());
                mm0Var = this.a;
                if (mm0Var != null && (mm0Var.isConnected() || this.a.isConnecting())) {
                    this.a.disconnect();
                }
                this.e.quit();
            }
            this.e.quit();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.d.put((ra) ra.t().timberyard(32768L).a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            this.d.put((ra) ra.t().timberyard(32768L).a());
        } catch (InterruptedException unused) {
        }
    }
}
