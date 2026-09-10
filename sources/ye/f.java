package ye;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.google.android.gms.common.api.internal.m0;
import com.ironsource.X3;
import java.util.HashMap;
import java.util.Map;
import wi.j;
import xi.m;
import xi.n;
import xi.o;
import xi.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class f implements n, ti.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f54390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f54391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f54392c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HandlerThread f54393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f54394e;

    public static d a(f fVar, e eVar) {
        String str;
        if (eVar.f54378b != null) {
            str = "ns:" + eVar.f54378b;
        } else {
            str = eVar.f54377a;
        }
        synchronized (fVar.f54392c) {
            try {
                d dVar = (d) fVar.f54392c.get(str);
                if (dVar != null) {
                    return dVar;
                }
                d dVar2 = new d(fVar.f54391b);
                fVar.f54392c.put(str, dVar2);
                return dVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String b(d dVar, m mVar) {
        return q4.a.j(new StringBuilder(), dVar.f54372a.f54379c, "_", (String) ((Map) mVar.f53823b).get(X3.i.W));
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a aVar) {
        xi.f fVar = aVar.f50789c;
        try {
            this.f54391b = aVar.f50787a.getApplicationContext();
            HandlerThread handlerThread = new HandlerThread("com.it_nomads.fluttersecurestorage.worker");
            this.f54393d = handlerThread;
            handlerThread.start();
            this.f54394e = new Handler(this.f54393d.getLooper());
            p pVar = new p(fVar, "plugins.it_nomads.com/flutter_secure_storage");
            this.f54390a = pVar;
            pVar.b(this);
        } catch (Exception e10) {
            Log.e("FlutterSecureStoragePlugin", "Registration failed", e10);
        }
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a aVar) {
        if (this.f54390a != null) {
            this.f54393d.quitSafely();
            this.f54393d = null;
            this.f54390a.b(null);
            this.f54390a = null;
        }
        synchronized (this.f54392c) {
            this.f54392c.clear();
        }
        this.f54391b = null;
    }

    @Override // xi.n
    public final void onMethodCall(m mVar, o oVar) {
        this.f54394e.post(new m0(this, mVar, new j((j) oVar), 28));
    }
}
