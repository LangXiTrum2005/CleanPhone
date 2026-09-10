package h9;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.view.Surface;
import com.google.android.gms.internal.ads.zs;
import i1.z0;
import l1.y;
import l2.q;
import l2.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42271b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f42270a = i10;
        this.f42271b = obj;
    }

    public void a(long j10) {
        Surface surface;
        l2.h hVar = (l2.h) this.f42271b;
        v vVar = hVar.G0;
        if (this != hVar.f44885q1 || hVar.N == null) {
            return;
        }
        if (j10 == Long.MAX_VALUE) {
            hVar.r0 = true;
            return;
        }
        try {
            hVar.z0(j10);
            z0 z0Var = hVar.f44880l1;
            if (!z0Var.equals(z0.f42722d) && !z0Var.equals(hVar.f44881m1)) {
                hVar.f44881m1 = z0Var;
                vVar.b(z0Var);
            }
            hVar.t0.f22027f++;
            q qVar = hVar.J0;
            boolean z10 = qVar.f44926e != 3;
            qVar.f44926e = 3;
            qVar.l.getClass();
            qVar.f44928g = y.M(SystemClock.elapsedRealtime());
            if (z10 && (surface = hVar.V0) != null) {
                Handler handler = vVar.f44941a;
                if (handler != null) {
                    handler.post(new cj.l(vVar, surface, SystemClock.elapsedRealtime(), 5));
                }
                hVar.Y0 = true;
            }
            hVar.e0(j10);
        } catch (p1.h e10) {
            hVar.f54165s0 = e10;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f42270a) {
            case 0:
                int i10 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 30);
                    sb2.append("Received response to request: ");
                    sb2.append(i10);
                    Log.d("MessengerIpcClient", sb2.toString());
                }
                i iVar = (i) this.f42271b;
                synchronized (iVar) {
                    try {
                        SparseArray sparseArray = iVar.f42276e;
                        j jVar = (j) sparseArray.get(i10);
                        if (jVar != null) {
                            sparseArray.remove(i10);
                            iVar.d();
                            Bundle data = message.getData();
                            if (!data.getBoolean("unsupported", false)) {
                                switch (jVar.f42282e) {
                                    case 0:
                                        if (!data.getBoolean("ack", false)) {
                                            jVar.c(new zs(7, "Invalid response to one way request", null));
                                        } else {
                                            jVar.b(null);
                                        }
                                        break;
                                    default:
                                        Bundle bundle = data.getBundle("data");
                                        if (bundle == null) {
                                            bundle = Bundle.EMPTY;
                                        }
                                        jVar.b(bundle);
                                        break;
                                }
                            } else {
                                jVar.c(new zs(7, "Not supported by GmsCore", null));
                            }
                        } else {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 39);
                            sb3.append("Received response for unknown request: ");
                            sb3.append(i10);
                            Log.w("MessengerIpcClient", sb3.toString());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return true;
            case 1:
                if (message.what != 0) {
                    return false;
                }
                int i11 = message.arg1;
                int i12 = message.arg2;
                String str = y.f44830a;
                a(((((long) i11) & 4294967295L) << 32) | (4294967295L & ((long) i12)));
                return true;
            default:
                r6.g gVar = (r6.g) this.f42271b;
                int i13 = message.what;
                if (i13 == 1) {
                    gVar.b((r6.e) message.obj);
                    return true;
                }
                if (i13 == 2) {
                    gVar.f49440d.i((r6.e) message.obj);
                }
                return false;
        }
    }

    public h(l2.h hVar, y1.j jVar) {
        this.f42270a = 1;
        this.f42271b = hVar;
        jVar.o(this, y.q(this));
    }
}
