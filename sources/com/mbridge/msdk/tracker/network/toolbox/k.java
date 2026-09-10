package com.mbridge.msdk.tracker.network.toolbox;

import android.os.SystemClock;
import com.ironsource.Hb;
import com.ironsource.Xa;
import com.mbridge.msdk.tracker.network.a0;
import com.mbridge.msdk.tracker.network.b0;
import com.mbridge.msdk.tracker.network.c0;
import com.mbridge.msdk.tracker.network.p;
import com.mbridge.msdk.tracker.network.q;
import com.mbridge.msdk.tracker.network.r;
import com.mbridge.msdk.tracker.network.t;
import com.mbridge.msdk.tracker.network.x;
import com.mbridge.msdk.tracker.network.y;
import com.mbridge.msdk.tracker.network.z;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class k {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f37019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b0 f37020b;

        private b(String str, b0 b0Var) {
            this.f37019a = str;
            this.f37020b = b0Var;
        }
    }

    public static void a(long j10, t<?> tVar, byte[] bArr, int i10) {
        if (j10 > Xa.C) {
            c0.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", tVar, Long.valueOf(j10), bArr != null ? Integer.valueOf(bArr.length) : "null", Integer.valueOf(i10), Integer.valueOf(tVar.o().c()));
        }
    }

    public static q a(t<?> tVar, long j10, List<com.mbridge.msdk.tracker.network.g> list) {
        com.mbridge.msdk.tracker.network.b.a aVarD = tVar.d();
        if (aVarD == null) {
            return new q(304, null, true, j10, list);
        }
        return new q(304, aVarD.f36898a, true, j10, f.a(list, aVarD));
    }

    public static byte[] a(InputStream inputStream, int i10, c cVar, p pVar) throws Throwable {
        byte[] bArrA;
        n nVar = new n(cVar, i10);
        a(pVar);
        try {
            bArrA = cVar.a(1024);
            while (true) {
                try {
                    int i11 = inputStream.read(bArrA);
                    if (i11 == -1) {
                        break;
                    }
                    nVar.write(bArrA, 0, i11);
                    a(pVar, i11);
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            c0.d("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    cVar.a(bArrA);
                    nVar.close();
                    throw th;
                }
            }
            byte[] byteArray = nVar.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                c0.d("Error occurred when closing InputStream", new Object[0]);
            }
            cVar.a(bArrA);
            nVar.close();
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            bArrA = null;
        }
    }

    private static void a(p pVar) {
        if (pVar != null) {
            pVar.c(0L);
        }
    }

    private static void a(p pVar, int i10) {
        if (pVar != null) {
            pVar.c(pVar.B() + ((long) i10));
        }
    }

    public static void a(t<?> tVar, b bVar) throws b0 {
        if (tVar == null) {
            throw new a0("request is null when retrying");
        }
        if (bVar != null) {
            x xVarO = tVar.o();
            if (xVarO != null) {
                if (!xVarO.a(bVar.f37020b)) {
                    throw bVar.f37020b;
                }
                return;
            }
            throw bVar.f37020b;
        }
        throw new a0("retry info is null when retrying");
    }

    public static b a(t<?> tVar, IOException iOException, long j10, g gVar, byte[] bArr) throws b0 {
        if (iOException instanceof SocketTimeoutException) {
            return new b("socket", new z());
        }
        if (iOException instanceof MalformedURLException) {
            throw new com.mbridge.msdk.tracker.network.a("Bad URL " + tVar.t());
        }
        if (gVar != null) {
            int iD = gVar.d();
            c0.c("Unexpected response code %d for %s", Integer.valueOf(iD), tVar.t());
            if (bArr != null) {
                q qVar = new q(iD, bArr, false, SystemClock.elapsedRealtime() - j10, gVar.c());
                if (iD >= 400 && iD <= 499) {
                    com.mbridge.msdk.tracker.network.d dVar = new com.mbridge.msdk.tracker.network.d(qVar);
                    dVar.a(iD);
                    throw dVar;
                }
                y yVar = new y(qVar);
                yVar.a(iD);
                if (iD >= 500 && iD <= 599 && tVar.B()) {
                    return new b(Hb.f26242a, yVar);
                }
                throw yVar;
            }
            com.mbridge.msdk.tracker.network.o oVar = new com.mbridge.msdk.tracker.network.o();
            oVar.a(iD);
            return new b("network", oVar);
        }
        if (tVar.A()) {
            return new b("connection", new r());
        }
        throw new r(iOException);
    }
}
