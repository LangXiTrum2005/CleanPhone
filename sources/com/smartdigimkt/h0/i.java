package com.smartdigimkt.h0;

import android.content.Context;
import android.os.Process;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes5.dex */
public class i {
    private static final String d = "i";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.smartdigimkt.m0.a f35581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h f35582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f35583c;

    public i(Context context, SSLSocketFactory sSLSocketFactory, c cVar) {
        com.smartdigimkt.m0.b bVar = new com.smartdigimkt.m0.b(sSLSocketFactory, null);
        this.f35581a = bVar;
        this.f35582b = new com.smartdigimkt.n0.a(bVar, cVar);
        this.f35583c = cVar;
    }

    private void a(j jVar) {
        try {
            this.f35583c.c(jVar);
            if (jVar.p()) {
                jVar.a("network-discard-cancelled");
                this.f35583c.b(jVar);
                this.f35583c.a(jVar);
            } else {
                this.f35583c.d(jVar);
                this.f35583c.a((j<?>) jVar, jVar.a(this.f35582b.a(jVar)));
            }
        } catch (com.smartdigimkt.i0.a e2) {
            this.f35583c.a((j<?>) jVar, jVar.b(e2));
        } catch (Exception e3) {
            e3.getMessage();
            this.f35583c.a((j<?>) jVar, new com.smartdigimkt.i0.a(4, null));
        }
    }

    public void b(j jVar) {
        Process.setThreadPriority(10);
        a(jVar);
    }

    public i(Context context, SSLSocketFactory sSLSocketFactory, c cVar, com.smartdigimkt.m0.a aVar) {
        if (aVar == null) {
            this.f35581a = new com.smartdigimkt.m0.b(sSLSocketFactory, null);
        } else {
            this.f35581a = aVar;
        }
        this.f35582b = new com.smartdigimkt.n0.a(this.f35581a, cVar);
        this.f35583c = cVar;
    }
}
