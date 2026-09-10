package com.mbridge.msdk.config.component.common.network.connect.okhttp;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.config.component.common.network.listener.EventListenerOKHttp;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.d;
import com.mbridge.msdk.thrid.okhttp.e;
import com.mbridge.msdk.thrid.okhttp.i;
import com.mbridge.msdk.thrid.okhttp.m;
import com.mbridge.msdk.thrid.okhttp.p;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile v f31963h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.model.a f31964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f31965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f31966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.retry.a f31967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.monitor.a f31968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f31969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f31970g;

    public a(com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.result.a aVar2, com.mbridge.msdk.config.component.common.network.a aVar3) {
        this.f31964a = aVar;
        this.f31965b = aVar2;
        this.f31966c = aVar3;
        this.f31968e = aVar2.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f31966c == null) {
            return;
        }
        if (c.a(this.f31965b.g())) {
            this.f31966c.b(this.f31965b);
            return;
        }
        if (this.f31965b.g() == 200) {
            this.f31966c.c(this.f31965b);
            com.mbridge.msdk.config.component.common.network.retry.a aVar = this.f31967d;
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        com.mbridge.msdk.config.component.common.network.retry.a aVar2 = this.f31967d;
        if (aVar2 != null) {
            aVar2.b();
        } else if (this.f31964a.g() <= 0) {
            this.f31966c.d(this.f31965b);
        } else {
            this.f31968e.a(true);
            new com.mbridge.msdk.config.component.common.network.retry.c(this.f31969f, this.f31964a, this.f31966c, this.f31965b).c();
        }
    }

    private static v b() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        m mVar = new m(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Dispatcher", false)));
        mVar.b(50);
        mVar.a(NotificationCompat.FLAG_LOCAL_ONLY);
        ArrayList arrayList = new ArrayList();
        arrayList.add(w.HTTP_1_1);
        arrayList.add(w.HTTP_2);
        return new v.b().a(arrayList).a(new i(32, 5L, TimeUnit.MINUTES)).a(mVar).b(30L, timeUnit).d(30L, timeUnit).e(30L, timeUnit).a();
    }

    public com.mbridge.msdk.config.component.common.network.result.a a(String str) {
        this.f31969f = str;
        com.mbridge.msdk.config.component.nori.monitor.a aVar = this.f31968e;
        if (aVar != null) {
            aVar.m();
        }
        d dVarB = b(str, this.f31964a);
        this.f31970g = dVarB;
        if (dVarB != null) {
            dVarB.a(new C0103a());
            return this.f31965b;
        }
        q0.b("OkHttpClientConnection", "");
        this.f31965b.c(1002);
        this.f31965b.a(1002);
        this.f31965b.a("create Call fail");
        c();
        return this.f31965b;
    }

    public void a() {
        if (this.f31970g != null) {
            q0.b("OkHttpClientConnection", "取消当前重试任务");
            this.f31970g.cancel();
        }
    }

    private static y a(String str, com.mbridge.msdk.config.component.nori.model.a aVar) {
        y.a aVarB = new y.a().b(str);
        a(aVarB, aVar);
        try {
            b(aVarB, aVar);
        } catch (IOException e10) {
            q0.b("OkHttpClientConnection", "Failed to set connection parameters: " + e10.getMessage());
        }
        return aVarB.a();
    }

    private d b(String str, com.mbridge.msdk.config.component.nori.model.a aVar) {
        try {
            if (f31963h == null) {
                f31963h = b();
            }
            v vVarA = f31963h.s().a(new EventListenerOKHttp(this.f31968e)).a(new MBridgeHostnameVerifier(str)).a(Math.max(aVar.k(), 30L), TimeUnit.SECONDS).a(false).a();
            a(vVarA);
            return vVarA.a(a(str, aVar));
        } catch (Exception e10) {
            f2.q(e10, new StringBuilder("Failed to create request: "), "OkHttpClientConnection");
            return null;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.network.connect.okhttp.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0103a implements e {
        public C0103a() {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.e
        public void a(d dVar, IOException iOException) {
            if (dVar.h()) {
                a.this.f31965b.a("Request was cancelled");
            } else if (iOException instanceof SocketTimeoutException) {
                a.this.f31965b.c(1001);
                a.this.f31965b.a(1001);
                a.this.f31965b.a("Connection timeout: " + iOException.getMessage());
            } else if (iOException instanceof UnknownHostException) {
                a.this.f31965b.c(1011);
                a.this.f31965b.a(1011);
                a.this.f31965b.a("Host unreachable: " + iOException.getMessage());
            } else if (iOException instanceof ConnectException) {
                a.this.f31965b.c(1002);
                a.this.f31965b.a(1002);
                a.this.f31965b.a("Connection refused: " + iOException.getMessage());
            } else {
                a.this.f31965b.c(1003);
                a.this.f31965b.a(1003);
                a.this.f31965b.a("Network error: " + iOException.getMessage());
            }
            a.this.f31965b.b(0);
            a.this.c();
        }

        @Override // com.mbridge.msdk.thrid.okhttp.e
        public void a(d dVar, a0 a0Var) throws IOException {
            a.this.f31965b.c(a0Var.k());
            a.this.f31965b.a(a0Var.o());
            if (c.a(a0Var.k())) {
                String strB = a0Var.b("Location");
                if (strB != null && !strB.isEmpty()) {
                    a.this.f31965b.b(strB);
                    a.this.f31965b.b(1);
                    Log.d("OkHttpClientConnection", "Redirect to: ".concat(strB));
                }
            } else {
                if (a0Var.d() == null) {
                    a.this.f31965b.b(0);
                    a.this.f31965b.a("Response body is null");
                    Log.e("OkHttpClientConnection", "Response body is null");
                } else {
                    String strN = a0Var.d().n();
                    a.this.f31965b.b(strN);
                    a.this.f31965b.b(1);
                    StringBuilder sb2 = new StringBuilder("Response data length: ");
                    sb2.append(strN != null ? strN.length() : 0);
                    Log.d("OkHttpClientConnection", sb2.toString());
                }
            }
            a0Var.close();
            a.this.c();
        }
    }

    private static void a(y.a aVar, com.mbridge.msdk.config.component.nori.model.a aVar2) {
        Map<String, Object> mapB = aVar2.b();
        if (mapB != null && !mapB.isEmpty()) {
            for (Map.Entry<String, Object> entry : mapB.entrySet()) {
                aVar.b(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        aVar.a("Connection", CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
    }

    public void a(com.mbridge.msdk.config.component.common.network.retry.a aVar) {
        this.f31967d = aVar;
    }

    private void a(v vVar) {
        if (this.f31968e == null || vVar == null) {
            return;
        }
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) vVar.j().a();
        this.f31968e.a(threadPoolExecutor.getPoolSize(), threadPoolExecutor.getActiveCount(), threadPoolExecutor.getQueue().size());
    }

    private static void b(y.a aVar, com.mbridge.msdk.config.component.nori.model.a aVar2) throws IOException {
        String strE = aVar2.e();
        if (strE != null) {
            String upperCase = strE.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
                case "OPTIONS":
                    aVar.a("OPTIONS", (z) null);
                    return;
                case "GET":
                    aVar.c();
                    return;
                case "PUT":
                    Map<String, Object> mapA = aVar2.a();
                    if (mapA == null || mapA.isEmpty()) {
                        return;
                    }
                    p.a aVar3 = new p.a();
                    for (Map.Entry<String, Object> entry : mapA.entrySet()) {
                        aVar3.a(entry.getKey(), String.valueOf(entry.getValue()));
                    }
                    aVar.d(aVar3.a());
                    return;
                case "HEAD":
                    aVar.d();
                    return;
                case "POST":
                    Map<String, Object> mapA2 = aVar2.a();
                    p.a aVar4 = new p.a();
                    if (mapA2 != null && !mapA2.isEmpty()) {
                        for (Map.Entry<String, Object> entry2 : mapA2.entrySet()) {
                            aVar4.a(entry2.getKey(), String.valueOf(entry2.getValue()));
                        }
                    }
                    aVar.c(aVar4.a());
                    return;
                case "PATCH":
                    Map<String, Object> mapA3 = aVar2.a();
                    if (mapA3 == null || mapA3.isEmpty()) {
                        return;
                    }
                    p.a aVar5 = new p.a();
                    for (Map.Entry<String, Object> entry3 : mapA3.entrySet()) {
                        aVar5.a(entry3.getKey(), String.valueOf(entry3.getValue()));
                    }
                    aVar.b(aVar5.a());
                    return;
                case "TRACE":
                    aVar.a("TRACE", (z) null);
                    return;
                case "DELETE":
                    aVar.b();
                    return;
                default:
                    throw new IllegalStateException("Unknown method type: ".concat(strE));
            }
        }
        throw new IOException("Request method cannot be null");
    }
}
