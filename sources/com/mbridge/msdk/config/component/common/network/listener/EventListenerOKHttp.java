package com.mbridge.msdk.config.component.common.network.listener;

import com.mbridge.msdk.config.component.nori.monitor.a;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.system.NoProGuard;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.d;
import com.mbridge.msdk.thrid.okhttp.h;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.q;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class EventListenerOKHttp extends o implements NoProGuard {
    private static final String TAG = "EventListenerOKHttp";
    private a monitorLink;

    public EventListenerOKHttp(a aVar) {
        this.monitorLink = aVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void callEnd(d dVar) {
        super.callEnd(dVar);
        q0.b(TAG, "callEnd");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void callFailed(d dVar, IOException iOException) {
        super.callFailed(dVar, iOException);
        q0.b(TAG, "callFailed");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.a(iOException);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void callStart(d dVar) {
        super.callStart(dVar);
        q0.b(TAG, "callStart");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void connectEnd(d dVar, InetSocketAddress inetSocketAddress, Proxy proxy, w wVar) {
        super.connectEnd(dVar, inetSocketAddress, proxy, wVar);
        q0.b(TAG, "connectEnd");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void connectFailed(d dVar, InetSocketAddress inetSocketAddress, Proxy proxy, w wVar, IOException iOException) {
        super.connectFailed(dVar, inetSocketAddress, proxy, wVar, iOException);
        q0.b(TAG, "connectFailed");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void connectStart(d dVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(dVar, inetSocketAddress, proxy);
        q0.b(TAG, "connectStart");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void connectionAcquired(d dVar, h hVar) {
        super.connectionAcquired(dVar, hVar);
        q0.b(TAG, "connectionAcquired");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void connectionReleased(d dVar, h hVar) {
        super.connectionReleased(dVar, hVar);
        q0.b(TAG, "connectionReleased");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.g();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void dnsEnd(d dVar, String str, List<InetAddress> list) {
        super.dnsEnd(dVar, str, list);
        q0.b(TAG, "dnsEnd");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.h();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void dnsStart(d dVar, String str) {
        super.dnsStart(dVar, str);
        q0.b(TAG, "dnsStart");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.i();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void requestBodyEnd(d dVar, long j10) {
        super.requestBodyEnd(dVar, j10);
        q0.b(TAG, "requestBodyEnd");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.a(j10);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void requestBodyStart(d dVar) {
        super.requestBodyStart(dVar);
        q0.b(TAG, "requestBodyStart");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.n();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void requestHeadersEnd(d dVar, y yVar) {
        super.requestHeadersEnd(dVar, yVar);
        q0.b(TAG, "requestHeadersEnd");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.o();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void requestHeadersStart(d dVar) {
        super.requestHeadersStart(dVar);
        q0.b(TAG, "requestHeadersStart");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.p();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void responseBodyEnd(d dVar, long j10) {
        super.responseBodyEnd(dVar, j10);
        q0.b(TAG, "responseBodyEnd");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.b(j10);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void responseBodyStart(d dVar) {
        super.responseBodyStart(dVar);
        q0.b(TAG, "responseBodyStart");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.q();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void responseHeadersEnd(d dVar, a0 a0Var) {
        super.responseHeadersEnd(dVar, a0Var);
        q0.b(TAG, "responseHeadersEnd");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.r();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void responseHeadersStart(d dVar) {
        super.responseHeadersStart(dVar);
        q0.b(TAG, "responseHeadersStart");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.s();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void secureConnectEnd(d dVar, q qVar) {
        super.secureConnectEnd(dVar, qVar);
        q0.b(TAG, "secureConnectEnd");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.t();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void secureConnectStart(d dVar) {
        super.secureConnectStart(dVar);
        q0.b(TAG, "secureConnectStart");
        a aVar = this.monitorLink;
        if (aVar != null) {
            aVar.u();
        }
    }
}
