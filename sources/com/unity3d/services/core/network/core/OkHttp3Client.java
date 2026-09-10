package com.unity3d.services.core.network.core;

import ak.f;
import an.o;
import bk.a;
import ck.c;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import cn.j;
import cn.l;
import com.google.android.gms.internal.play_billing.q1;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.mapper.HttpRequestToOkHttpRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;
import xn.d;
import xn.p;
import xn.q;
import xn.s;
import xn.w;
import xn.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/unity3d/services/core/network/core/OkHttp3Client;", "Lcom/unity3d/services/core/network/core/HttpClient;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers", "Lxn/q;", "client", "<init>", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;Lxn/q;)V", "Lcom/unity3d/services/core/network/model/HttpRequest;", "request", "Lcom/unity3d/services/core/network/model/HttpResponse;", "executeBlocking", "(Lcom/unity3d/services/core/network/model/HttpRequest;)Lcom/unity3d/services/core/network/model/HttpResponse;", "", "withInputStream", "execute", "(Lcom/unity3d/services/core/network/model/HttpRequest;ZLak/f;)Ljava/lang/Object;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "Lxn/q;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class OkHttp3Client implements HttpClient {
    public static final String MSG_CONNECTION_FAILED = "Network request failed";
    public static final String MSG_CONNECTION_TIMEOUT = "Network request timeout";
    public static final String NETWORK_CLIENT_OKHTTP = "refactored-okhttp";
    private final q client;
    private final ISDKDispatchers dispatchers;

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.OkHttp3Client$execute$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.services.core.network.core.OkHttp3Client", f = "OkHttp3Client.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "execute")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OkHttp3Client.this.execute(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.OkHttp3Client$executeBlocking$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lcom/unity3d/services/core/network/model/HttpResponse;", "<anonymous>", "(Lcn/a0;)Lcom/unity3d/services/core/network/model/HttpResponse;"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.services.core.network.core.OkHttp3Client$executeBlocking$1", f = "OkHttp3Client.kt", l = {37}, m = "invokeSuspend")
    public static final class C08321 extends i implements jk.c {
        final /* synthetic */ HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08321(HttpRequest httpRequest, f fVar) {
            super(2, fVar);
            this.$request = httpRequest;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return OkHttp3Client.this.new C08321(this.$request, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((C08321) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
                return obj;
            }
            t9.e.z(obj);
            OkHttp3Client okHttp3Client = OkHttp3Client.this;
            HttpRequest httpRequest = this.$request;
            this.label = 1;
            Object objExecute$default = HttpClient.DefaultImpls.execute$default(okHttp3Client, httpRequest, false, this, 2, null);
            a aVar = a.f5708a;
            return objExecute$default == aVar ? aVar : objExecute$default;
        }
    }

    public OkHttp3Client(ISDKDispatchers dispatchers, q client) {
        n.f(dispatchers, "dispatchers");
        n.f(client, "client");
        this.dispatchers = dispatchers;
        this.client = client;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // com.unity3d.services.core.network.core.HttpClient
    public Object execute(HttpRequest httpRequest, final boolean z10, f fVar) throws UnityAdsNetworkException {
        AnonymousClass1 anonymousClass1;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(fVar);
        }
        Object obj = anonymousClass1.result;
        int i11 = anonymousClass1.label;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
                return obj;
            }
            t9.e.z(obj);
            s request = HttpRequestToOkHttpRequestKt.toOkHttpProtoRequest(httpRequest);
            p pVarA = this.client.a();
            long connectTimeout = httpRequest.getConnectTimeout();
            TimeUnit unit = TimeUnit.MILLISECONDS;
            n.f(unit, "unit");
            pVarA.f54022v = yn.a.b(connectTimeout);
            pVarA.f54023w = yn.a.b(httpRequest.getReadTimeout());
            pVarA.f54024x = yn.a.b(httpRequest.getWriteTimeout());
            q qVar = new q(pVarA);
            anonymousClass1.L$0 = httpRequest;
            anonymousClass1.L$1 = request;
            anonymousClass1.L$2 = qVar;
            anonymousClass1.Z$0 = z10;
            anonymousClass1.label = 1;
            final l lVar = new l(1, q1.t(anonymousClass1));
            lVar.t();
            n.f(request, "request");
            bo.i iVar = new bo.i(qVar, request);
            lVar.v(new OkHttp3Client$execute$2$1(iVar));
            iVar.f(new xn.e() { // from class: com.unity3d.services.core.network.core.OkHttp3Client$execute$2$2
                @Override // xn.e
                public void onFailure(d call, IOException e10) {
                    n.f(call, "call");
                    n.f(e10, "e");
                    lVar.resumeWith(t9.e.c(e10));
                }

                @Override // xn.e
                public void onResponse(d call, w response) {
                    Long lF0;
                    n.f(call, "call");
                    n.f(response, "response");
                    int i12 = response.f54084d;
                    y yVar = response.f54087g;
                    if (yVar == null) {
                        lVar.resumeWith(t9.e.c(new UnityAdsNetworkException("Empty response", null, Integer.valueOf(i12), null, null, null, OkHttp3Client.NETWORK_CLIENT_OKHTTP, 58, null)));
                        return;
                    }
                    if (200 > i12 || i12 >= 300) {
                        yVar.close();
                        lVar.resumeWith(t9.e.c(new UnityAdsNetworkException(l1.d.e(i12, "Network request failed with code "), null, Integer.valueOf(i12), null, null, null, OkHttp3Client.NETWORK_CLIENT_OKHTTP, 58, null)));
                        return;
                    }
                    try {
                        Object objInputStream = z10 ? yVar.n().inputStream() : yVar.d();
                        j jVar = lVar;
                        int i13 = response.f54084d;
                        Map mapP = response.f54086f.p();
                        String str = response.f54081a.f54060a.f53996h;
                        String str2 = response.f54082b.f54059a;
                        String strA = w.a("Content-Length", response);
                        jVar.resumeWith(new HttpResponse(objInputStream, i13, mapP, str, str2, OkHttp3Client.NETWORK_CLIENT_OKHTTP, (strA == null || (lF0 = o.f0(strA)) == null) ? -1L : lF0.longValue()));
                    } catch (Exception e10) {
                        yVar.close();
                        lVar.resumeWith(t9.e.c(e10));
                    }
                }
            });
            Object objS = lVar.s();
            a aVar = a.f5708a;
            return objS == aVar ? aVar : objS;
        } catch (SocketTimeoutException unused) {
            throw new NetworkTimeoutException(MSG_CONNECTION_TIMEOUT, null, null, httpRequest.getBaseURL(), null, null, NETWORK_CLIENT_OKHTTP, 54, null);
        } catch (IOException unused2) {
            throw new UnityAdsNetworkException(MSG_CONNECTION_FAILED, null, null, httpRequest.getBaseURL(), null, null, NETWORK_CLIENT_OKHTTP, 54, null);
        }
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public HttpResponse executeBlocking(HttpRequest request) {
        n.f(request, "request");
        return (HttpResponse) d0.C(this.dispatchers.getIo(), new C08321(request, null));
    }
}
