package vb;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import na.g;
import oa.k0;
import qd.i;
import zb.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements yb.a, xb.a, tc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f52529a;

    public /* synthetic */ a(b bVar) {
        this.f52529a = bVar;
    }

    @Override // yb.a
    public void a(q qVar) {
        b bVar = this.f52529a;
        synchronized (bVar) {
            try {
                if (((yb.a) bVar.f52532c) instanceof yb.b) {
                    ((ArrayList) bVar.f52530a).add(qVar);
                }
                ((yb.a) bVar.f52532c).a(qVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // tc.a
    public void b(tc.b bVar) {
        b bVar2 = this.f52529a;
        wb.c cVar = wb.c.f53149a;
        cVar.b("AnalyticsConnector now available.");
        qb.b bVar3 = (qb.b) bVar.get();
        g gVar = new g(bVar3, 29);
        v6.c cVar2 = new v6.c();
        qb.c cVar3 = (qb.c) bVar3;
        ne.c cVarB = cVar3.b("clx", cVar2);
        if (cVarB == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            cVarB = cVar3.b("crash", cVar2);
            if (cVarB != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
        }
        if (cVarB == null) {
            cVar.d("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        cVar.b("Registered Firebase Analytics listener.");
        k0 k0Var = new k0(26, false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        i iVar = new i(gVar);
        synchronized (bVar2) {
            try {
                Iterator it = ((ArrayList) bVar2.f52530a).iterator();
                while (it.hasNext()) {
                    k0Var.a((q) it.next());
                }
                cVar2.f52488b = k0Var;
                cVar2.f52487a = iVar;
                bVar2.f52532c = k0Var;
                bVar2.f52531b = iVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // xb.a
    public void o(Bundle bundle) {
        ((xb.a) this.f52529a.f52531b).o(bundle);
    }
}
