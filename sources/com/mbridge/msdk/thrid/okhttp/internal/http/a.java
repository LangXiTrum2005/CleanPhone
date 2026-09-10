package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.ironsource.B5;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.l;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.u;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f36337a;

    public a(l lVar) {
        this.f36337a = lVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t
    public a0 a(t.a aVar) throws IOException {
        y yVarD = aVar.d();
        y.a aVarF = yVarD.f();
        z zVarA = yVarD.a();
        if (zVarA != null) {
            u uVarB = zVarA.b();
            if (uVarB != null) {
                aVarF.b("Content-Type", uVarB.toString());
            }
            long jA = zVarA.a();
            if (jA != -1) {
                aVarF.b("Content-Length", Long.toString(jA));
                aVarF.a("Transfer-Encoding");
            } else {
                aVarF.b("Transfer-Encoding", "chunked");
                aVarF.a("Content-Length");
            }
        }
        boolean z10 = false;
        if (yVarD.a("Host") == null) {
            aVarF.b("Host", com.mbridge.msdk.thrid.okhttp.internal.c.a(yVarD.g(), false));
        }
        if (yVarD.a("Connection") == null) {
            aVarF.b("Connection", "Keep-Alive");
        }
        if (yVarD.a("Accept-Encoding") == null && yVarD.a(Command.HTTP_HEADER_RANGE) == null) {
            aVarF.b("Accept-Encoding", "gzip");
            z10 = true;
        }
        List<com.mbridge.msdk.thrid.okhttp.k> listA = this.f36337a.a(yVarD.g());
        if (!listA.isEmpty()) {
            aVarF.b("Cookie", a(listA));
        }
        if (yVarD.a(Command.HTTP_HEADER_USER_AGENT) == null) {
            aVarF.b(Command.HTTP_HEADER_USER_AGENT, com.mbridge.msdk.thrid.okhttp.internal.d.a());
        }
        a0 a0VarA = aVar.a(aVarF.a());
        e.a(this.f36337a, yVarD.g(), a0VarA.m());
        a0.a aVarA = a0VarA.p().a(yVarD);
        if (z10 && "gzip".equalsIgnoreCase(a0VarA.b("Content-Encoding")) && e.b(a0VarA)) {
            com.mbridge.msdk.thrid.okio.j jVar = new com.mbridge.msdk.thrid.okio.j(a0VarA.d().m());
            aVarA.a(a0VarA.m().a().b("Content-Encoding").b("Content-Length").a());
            aVarA.a(new h(a0VarA.b("Content-Type"), -1L, com.mbridge.msdk.thrid.okio.l.a(jVar)));
        }
        return aVarA.a();
    }

    private String a(List<com.mbridge.msdk.thrid.okhttp.k> list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                sb2.append("; ");
            }
            com.mbridge.msdk.thrid.okhttp.k kVar = list.get(i10);
            sb2.append(kVar.a());
            sb2.append(B5.U);
            sb2.append(kVar.b());
        }
        return sb2.toString();
    }
}
