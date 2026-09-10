package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.ironsource.C0375hc;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.y;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f36291a;

    public a(v vVar) {
        this.f36291a = vVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t
    public a0 a(t.a aVar) throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.http.g gVar = (com.mbridge.msdk.thrid.okhttp.internal.http.g) aVar;
        y yVarD = gVar.d();
        g gVarI = gVar.i();
        return gVar.a(yVarD, gVarI, gVarI.a(this.f36291a, aVar, !yVarD.e().equals(C0375hc.f28788a)), gVarI.c());
    }
}
