package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okio.l;
import com.mbridge.msdk.thrid.okio.r;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f36338a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends com.mbridge.msdk.thrid.okio.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f36339b;

        public a(r rVar) {
            super(rVar);
        }

        @Override // com.mbridge.msdk.thrid.okio.g, com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            super.a(cVar, j10);
            this.f36339b += j10;
        }
    }

    public b(boolean z10) {
        this.f36338a = z10;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t
    public a0 a(t.a aVar) throws IOException {
        g gVar = (g) aVar;
        c cVarH = gVar.h();
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVarI = gVar.i();
        com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar = (com.mbridge.msdk.thrid.okhttp.internal.connection.c) gVar.f();
        y yVarD = gVar.d();
        long jCurrentTimeMillis = System.currentTimeMillis();
        gVar.g().requestHeadersStart(gVar.e());
        cVarH.a(yVarD);
        gVar.g().requestHeadersEnd(gVar.e(), yVarD);
        a0.a aVarA = null;
        if (f.a(yVarD.e()) && yVarD.a() != null) {
            if ("100-continue".equalsIgnoreCase(yVarD.a("Expect"))) {
                cVarH.b();
                gVar.g().responseHeadersStart(gVar.e());
                aVarA = cVarH.a(true);
            }
            if (aVarA == null) {
                gVar.g().requestBodyStart(gVar.e());
                a aVar2 = new a(cVarH.a(yVarD, yVarD.a().a()));
                com.mbridge.msdk.thrid.okio.d dVarA = l.a(aVar2);
                yVarD.a().a(dVarA);
                dVarA.close();
                gVar.g().requestBodyEnd(gVar.e(), aVar2.f36339b);
            } else if (!cVar.f()) {
                gVarI.e();
            }
        }
        cVarH.a();
        if (aVarA == null) {
            gVar.g().responseHeadersStart(gVar.e());
            aVarA = cVarH.a(false);
        }
        a0 a0VarA = aVarA.a(yVarD).a(gVarI.c().b()).b(jCurrentTimeMillis).a(System.currentTimeMillis()).a();
        int iK = a0VarA.k();
        if (iK == 100) {
            a0VarA = cVarH.a(false).a(yVarD).a(gVarI.c().b()).b(jCurrentTimeMillis).a(System.currentTimeMillis()).a();
            iK = a0VarA.k();
        }
        gVar.g().responseHeadersEnd(gVar.e(), a0VarA);
        a0 a0VarA2 = (this.f36338a && iK == 101) ? a0VarA.p().a(com.mbridge.msdk.thrid.okhttp.internal.c.f36260c).a() : a0VarA.p().a(cVarH.a(a0VarA)).a();
        if (CampaignEx.JSON_NATIVE_VIDEO_CLOSE.equalsIgnoreCase(a0VarA2.s().a("Connection")) || CampaignEx.JSON_NATIVE_VIDEO_CLOSE.equalsIgnoreCase(a0VarA2.b("Connection"))) {
            gVarI.e();
        }
        if ((iK != 204 && iK != 205) || a0VarA2.d().k() <= 0) {
            return a0VarA2;
        }
        StringBuilder sbU = defpackage.e.u(iK, "HTTP ", " had non-zero Content-Length: ");
        sbU.append(a0VarA2.d().k());
        throw new ProtocolException(sbU.toString());
    }
}
