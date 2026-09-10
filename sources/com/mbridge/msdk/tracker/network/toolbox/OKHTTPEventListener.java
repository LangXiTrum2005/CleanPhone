package com.mbridge.msdk.tracker.network.toolbox;

import com.mbridge.msdk.system.NoProGuard;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.q;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.tracker.network.p;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class OKHTTPEventListener extends com.mbridge.msdk.thrid.okhttp.o implements NoProGuard {
    private static String TAG = "OKHTTPEventListener";
    private final p monitor;

    public OKHTTPEventListener(p pVar) {
        this.monitor = pVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void callEnd(com.mbridge.msdk.thrid.okhttp.d dVar) {
        p pVar = this.monitor;
        if (pVar == null) {
            return;
        }
        pVar.a((IOException) null);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void callFailed(com.mbridge.msdk.thrid.okhttp.d dVar, IOException iOException) {
        p pVar = this.monitor;
        if (pVar == null) {
            return;
        }
        pVar.a(iOException);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void callStart(com.mbridge.msdk.thrid.okhttp.d dVar) {
        p pVar = this.monitor;
        if (pVar == null) {
            return;
        }
        pVar.a(dVar);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void connectEnd(com.mbridge.msdk.thrid.okhttp.d dVar, InetSocketAddress inetSocketAddress, Proxy proxy, w wVar) {
        p pVar = this.monitor;
        if (pVar == null) {
            return;
        }
        pVar.d("connection_end");
        this.monitor.a(wVar, (IOException) null);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void connectFailed(com.mbridge.msdk.thrid.okhttp.d dVar, InetSocketAddress inetSocketAddress, Proxy proxy, w wVar, IOException iOException) {
        p pVar = this.monitor;
        if (pVar == null) {
            return;
        }
        pVar.a(wVar, iOException);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void connectStart(com.mbridge.msdk.thrid.okhttp.d dVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
        p pVar = this.monitor;
        if (pVar == null) {
            return;
        }
        pVar.d("connection_start");
        this.monitor.a(inetSocketAddress, proxy);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void connectionAcquired(com.mbridge.msdk.thrid.okhttp.d dVar, com.mbridge.msdk.thrid.okhttp.h hVar) {
        p pVar = this.monitor;
        if (pVar == null) {
            return;
        }
        pVar.a(hVar);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void connectionReleased(com.mbridge.msdk.thrid.okhttp.d dVar, com.mbridge.msdk.thrid.okhttp.h hVar) {
        p pVar = this.monitor;
        if (pVar == null) {
            return;
        }
        pVar.b(hVar);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void dnsEnd(com.mbridge.msdk.thrid.okhttp.d dVar, String str, List<InetAddress> list) {
        p pVar = this.monitor;
        if (pVar == null) {
            return;
        }
        pVar.d("dns_end");
        this.monitor.a(list);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void dnsStart(com.mbridge.msdk.thrid.okhttp.d dVar, String str) {
        p pVar = this.monitor;
        if (pVar == null) {
            return;
        }
        pVar.d("dns_start");
        this.monitor.a();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void requestBodyEnd(com.mbridge.msdk.thrid.okhttp.d dVar, long j10) {
        p pVar = this.monitor;
        if (pVar == null) {
            return;
        }
        pVar.d("request_body_end");
        this.monitor.b(j10);
        this.monitor.d("transmission_start");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void requestBodyStart(com.mbridge.msdk.thrid.okhttp.d dVar) {
        p pVar = this.monitor;
        if (pVar == null) {
            return;
        }
        pVar.d("request_body_start");
        this.monitor.R();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void requestHeadersEnd(com.mbridge.msdk.thrid.okhttp.d dVar, y yVar) {
        p pVar = this.monitor;
        if (pVar == null) {
            return;
        }
        pVar.d("request_header_end");
        this.monitor.a(yVar);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void requestHeadersStart(com.mbridge.msdk.thrid.okhttp.d dVar) {
        p pVar = this.monitor;
        if (pVar == null) {
            return;
        }
        pVar.d("request_header_start");
        this.monitor.S();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void responseBodyEnd(com.mbridge.msdk.thrid.okhttp.d dVar, long j10) {
        p pVar = this.monitor;
        if (pVar == null) {
            return;
        }
        pVar.d("response_body_end");
        this.monitor.h(j10);
        this.monitor.d(j10);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void responseBodyStart(com.mbridge.msdk.thrid.okhttp.d dVar) {
        p pVar = this.monitor;
        if (pVar == null) {
            return;
        }
        pVar.d("response_body_start");
        this.monitor.U();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void responseHeadersEnd(com.mbridge.msdk.thrid.okhttp.d dVar, a0 a0Var) {
        p pVar = this.monitor;
        if (pVar == null) {
            return;
        }
        pVar.d("response_header_end");
        this.monitor.a(a0Var);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void responseHeadersStart(com.mbridge.msdk.thrid.okhttp.d dVar) {
        p pVar = this.monitor;
        if (pVar == null) {
            return;
        }
        pVar.d("response_header_start");
        this.monitor.V();
        this.monitor.d("transmission_end");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void secureConnectEnd(com.mbridge.msdk.thrid.okhttp.d dVar, q qVar) {
        p pVar = this.monitor;
        if (pVar == null) {
            return;
        }
        pVar.d("secure_connect_end");
        this.monitor.a(qVar);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.o
    public void secureConnectStart(com.mbridge.msdk.thrid.okhttp.d dVar) {
        p pVar = this.monitor;
        if (pVar == null) {
            return;
        }
        pVar.d("secure_connect_start");
        this.monitor.W();
    }
}
