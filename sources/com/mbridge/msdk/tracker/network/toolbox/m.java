package com.mbridge.msdk.tracker.network.toolbox;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import com.mbridge.msdk.tracker.network.p;
import com.mbridge.msdk.tracker.network.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class m extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f37021a = a();

    private static z a(t tVar) {
        byte[] bArrB;
        if (tVar == null || (bArrB = tVar.b()) == null) {
            return null;
        }
        return z.a(null, bArrB);
    }

    @Override // com.mbridge.msdk.tracker.network.toolbox.a
    public g a(t<?> tVar, Map<String, String> map) throws IOException {
        p pVarH = tVar.h();
        if (this.f37021a != null) {
            int iQ = tVar.q() <= 0 ? 30000 : tVar.q();
            long jR = tVar.r();
            String strA = tVar.g() == 0 ? d.a(tVar.t(), tVar) : tVar.t();
            if (pVarH != null) {
                pVarH.f(strA);
                long j10 = iQ;
                pVarH.e(j10);
                pVarH.f(j10);
                pVarH.j(j10);
                pVarH.a(tVar.n());
            }
            a(tVar, pVarH);
            ArrayList arrayList = new ArrayList();
            arrayList.add(w.HTTP_1_1);
            arrayList.add(w.HTTP_2);
            v.b bVarA = this.f37021a.s().a(arrayList).a(new MBridgeHostnameVerifier(strA));
            long j11 = iQ;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            v.b bVarA2 = bVarA.d(j11, timeUnit).b(j11, timeUnit).a(pVarH == null ? com.mbridge.msdk.thrid.okhttp.n.f36643a : new j(pVarH.H(), pVarH.b(), pVarH)).e(j11, timeUnit).a(Math.max(jR, 0L), timeUnit);
            a(pVarH, bVarA2);
            y.a aVar = new y.a();
            for (Map.Entry<String, String> entry : tVar.f().entrySet()) {
                aVar.a(entry.getKey(), entry.getValue());
            }
            aVar.a("Connection", CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
            a(aVar, tVar);
            a0 a0VarD = bVarA2.a().a(aVar.b(strA).a()).d();
            r rVarM = a0VarD.m();
            ArrayList arrayList2 = new ArrayList();
            int iB = rVarM.b();
            for (int i10 = 0; i10 < iB; i10++) {
                String strA2 = rVarM.a(i10);
                String strB = rVarM.b(i10);
                if (strA2 != null) {
                    arrayList2.add(new com.mbridge.msdk.tracker.network.g(strA2, strB));
                }
            }
            b0 b0VarD = a0VarD.d();
            if (b0VarD == null) {
                return new g(a0VarD.k(), arrayList2);
            }
            return new g(a0VarD.k(), arrayList2, a(b0VarD), b0VarD.d());
        }
        throw new IOException("okhttp client is null");
    }

    private static void a(p pVar, v.b bVar) {
        if (pVar == null || bVar == null) {
            return;
        }
        try {
            bVar.a(new OKHTTPEventListener(pVar));
        } catch (Exception unused) {
        }
    }

    private static void a(t<?> tVar, p pVar) {
        if (pVar == null || tVar == null) {
            return;
        }
        try {
            pVar.g(tVar.m());
        } catch (Exception unused) {
        }
    }

    private int a(b0 b0Var) {
        if (b0Var == null) {
            return 0;
        }
        if (b0Var.k() > 2147483647L) {
            return -1;
        }
        return (int) b0Var.k();
    }

    private v a() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        com.mbridge.msdk.thrid.okhttp.m mVar = new com.mbridge.msdk.thrid.okhttp.m(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Dispatcher", false)));
        mVar.b(50);
        mVar.a(NotificationCompat.FLAG_LOCAL_ONLY);
        v.b bVar = new v.b();
        bVar.d(30L, timeUnit);
        bVar.b(30L, timeUnit);
        bVar.e(30L, timeUnit);
        bVar.b(true);
        bVar.a(new com.mbridge.msdk.thrid.okhttp.i(32, 5L, TimeUnit.MINUTES));
        bVar.a(mVar);
        return bVar.a();
    }

    private static void a(y.a aVar, t<?> tVar) throws IOException {
        switch (tVar.g()) {
            case 0:
                aVar.c();
                return;
            case 1:
                z zVarA = a(tVar);
                if (zVarA != null) {
                    aVar.c(zVarA);
                    return;
                }
                throw new IOException("can't create request body for post");
            case 2:
                z zVarA2 = a(tVar);
                if (zVarA2 != null) {
                    aVar.d(zVarA2);
                    return;
                }
                throw new IOException("can't create request body for put");
            case 3:
                aVar.b();
                return;
            case 4:
                aVar.d();
                return;
            case 5:
                aVar.a("OPTIONS", (z) null);
                return;
            case 6:
                aVar.a("TRACE", (z) null);
                return;
            case 7:
                z zVarA3 = a(tVar);
                if (zVarA3 != null) {
                    aVar.b(zVarA3);
                    return;
                }
                throw new IOException("can't create request body for patch");
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }
}
