package k9;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.measurement.u6;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f44429a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(f fVar, Looper looper) {
        super(looper, 3);
        this.f44429a = fVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        x xVar;
        f fVar = this.f44429a;
        if (fVar.D.get() != message.arg1) {
            int i10 = message.what;
            if ((i10 == 2 || i10 == 1 || i10 == 7) && (xVar = (x) message.obj) != null) {
                synchronized (xVar) {
                    xVar.f44526a = null;
                }
                f fVar2 = xVar.f44528c;
                synchronized (fVar2.f44420r) {
                    fVar2.f44420r.remove(xVar);
                }
                return;
            }
            return;
        }
        int i11 = message.what;
        if ((i11 == 1 || i11 == 7 || i11 == 4 || i11 == 5) && !fVar.isConnecting()) {
            x xVar2 = (x) message.obj;
            if (xVar2 != null) {
                synchronized (xVar2) {
                    xVar2.f44526a = null;
                }
                f fVar3 = xVar2.f44528c;
                synchronized (fVar3.f44420r) {
                    fVar3.f44420r.remove(xVar2);
                }
                return;
            }
            return;
        }
        int i12 = message.what;
        if (i12 == 4) {
            fVar.A = new ConnectionResult(message.arg2, null, null);
            if (!fVar.B && !TextUtils.isEmpty(fVar.e()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(fVar.e());
                    if (!fVar.B) {
                        fVar.i(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            ConnectionResult connectionResult = fVar.A;
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(8, null, null);
            }
            fVar.f44418p.a(connectionResult);
            fVar.f44407d = connectionResult.f11641b;
            fVar.f44408e = System.currentTimeMillis();
            return;
        }
        if (i12 == 5) {
            ConnectionResult connectionResult2 = fVar.A;
            if (connectionResult2 == null) {
                connectionResult2 = new ConnectionResult(8, null, null);
            }
            fVar.f44418p.a(connectionResult2);
            fVar.f44407d = connectionResult2.f11641b;
            fVar.f44408e = System.currentTimeMillis();
            return;
        }
        if (i12 == 3) {
            Object obj = message.obj;
            PendingIntent pendingIntent = obj instanceof PendingIntent ? (PendingIntent) obj : null;
            int i13 = message.arg2;
            fVar.f44418p.a(new ConnectionResult(i13, pendingIntent, null));
            fVar.f44407d = i13;
            fVar.f44408e = System.currentTimeMillis();
            return;
        }
        if (i12 == 6) {
            fVar.i(5, null);
            b bVar = fVar.f44423u;
            if (bVar != null) {
                bVar.q(message.arg2);
            }
            fVar.f44404a = message.arg2;
            fVar.f44405b = System.currentTimeMillis();
            fVar.h(5, 1, null);
            return;
        }
        if (i12 == 2 && !fVar.isConnected()) {
            x xVar3 = (x) message.obj;
            if (xVar3 != null) {
                synchronized (xVar3) {
                    xVar3.f44526a = null;
                }
                f fVar4 = xVar3.f44528c;
                synchronized (fVar4.f44420r) {
                    fVar4.f44420r.remove(xVar3);
                }
                return;
            }
            return;
        }
        int i14 = message.what;
        if (i14 != 2 && i14 != 1 && i14 != 7) {
            Log.wtf("GmsClient", l1.d.k(new StringBuilder(String.valueOf(i14).length() + 34), "Don't know how to handle message: ", i14), new Exception());
            return;
        }
        x xVar4 = (x) message.obj;
        synchronized (xVar4) {
            try {
                bool = xVar4.f44526a;
                if (xVar4.f44527b) {
                    String string = xVar4.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 47);
                    sb2.append("Callback proxy ");
                    sb2.append(string);
                    sb2.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb2.toString());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bool != null) {
            f fVar5 = xVar4.f44531f;
            int i15 = xVar4.f44529d;
            if (i15 != 0) {
                fVar5.i(1, null);
                Bundle bundle = xVar4.f44530e;
                xVar4.b(new ConnectionResult(i15, bundle != null ? (PendingIntent) bundle.getParcelable(f.KEY_PENDING_INTENT) : null, null));
            } else if (!xVar4.a()) {
                fVar5.i(1, null);
                xVar4.b(new ConnectionResult(8, null, null));
            }
        }
        synchronized (xVar4) {
            xVar4.f44527b = true;
        }
        synchronized (xVar4) {
            xVar4.f44526a = null;
        }
        f fVar6 = xVar4.f44528c;
        synchronized (fVar6.f44420r) {
            fVar6.f44420r.remove(xVar4);
        }
    }
}
