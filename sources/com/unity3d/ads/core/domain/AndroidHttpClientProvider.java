package com.unity3d.ads.core.domain;

import ak.f;
import an.h;
import android.content.Context;
import bn.d;
import ck.c;
import ck.e;
import cn.d0;
import cn.j;
import cn.l;
import com.google.android.gms.internal.play_billing.q1;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.CronetClient;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.core.LegacyHttpClient;
import com.unity3d.services.core.network.core.OkHttp3Client;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import org.chromium.net.CronetEngine;
import wj.g;
import xj.b0;
import xn.p;
import xn.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0010H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0012J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHttpClientProvider;", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "alternativeFlowReader", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Landroid/content/Context;", "context", "Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;", "cronetEngineBuilderFactory", "Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;", "mediationTraitsMetadataReader", "<init>", "(Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Landroid/content/Context;Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;)V", "Lcom/unity3d/services/core/network/core/HttpClient;", "createHttpClient", "(Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/HttpClientSelection;", "selectedHttpClient", "buildNetworkClient", "(Landroid/content/Context;Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/ads/core/domain/HttpClientSelection;Lak/f;)Ljava/lang/Object;", "invoke", "Lcom/unity3d/services/core/network/core/OkHttp3Client;", "getOkHttp3Client", "()Lcom/unity3d/services/core/network/core/OkHttp3Client;", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Landroid/content/Context;", "Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;", "Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;", "Lln/a;", "mutex", "Lln/a;", "cachedClient", "Lcom/unity3d/services/core/network/core/HttpClient;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidHttpClientProvider implements HttpClientProvider {
    private final AlternativeFlowReader alternativeFlowReader;
    private HttpClient cachedClient;
    private final Context context;
    private final CronetEngineBuilderFactory cronetEngineBuilderFactory;
    private final ISDKDispatchers dispatchers;
    private final MediationTraitsMetadataReader mediationTraitsMetadataReader;
    private final ln.a mutex;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHttpClientProvider$createHttpClient$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider", f = "AndroidHttpClientProvider.kt", l = {74}, m = "createHttpClient")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHttpClientProvider.this.createHttpClient(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider", f = "AndroidHttpClientProvider.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE}, m = "invoke")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class C07621 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C07621(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHttpClientProvider.this.invoke(this);
        }
    }

    public AndroidHttpClientProvider(AlternativeFlowReader alternativeFlowReader, ISDKDispatchers dispatchers, SendDiagnosticEvent sendDiagnosticEvent, Context context, CronetEngineBuilderFactory cronetEngineBuilderFactory, MediationTraitsMetadataReader mediationTraitsMetadataReader) {
        n.f(alternativeFlowReader, "alternativeFlowReader");
        n.f(dispatchers, "dispatchers");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(context, "context");
        n.f(cronetEngineBuilderFactory, "cronetEngineBuilderFactory");
        n.f(mediationTraitsMetadataReader, "mediationTraitsMetadataReader");
        this.alternativeFlowReader = alternativeFlowReader;
        this.dispatchers = dispatchers;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.context = context;
        this.cronetEngineBuilderFactory = cronetEngineBuilderFactory;
        this.mediationTraitsMetadataReader = mediationTraitsMetadataReader;
        this.mutex = new ln.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object buildNetworkClient(final Context context, final ISDKDispatchers iSDKDispatchers, final HttpClientSelection httpClientSelection, f fVar) {
        final l lVar = new l(1, q1.t(fVar));
        lVar.t();
        fa.a.a(context).addOnCompleteListener(d0.f(iSDKDispatchers.getIo()), new OnCompleteListener() { // from class: com.unity3d.ads.core.domain.AndroidHttpClientProvider$buildNetworkClient$2$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task<Void> it) {
                String message;
                n.f(it, "it");
                String str = "Errored without message.";
                if (!it.isSuccessful()) {
                    SendDiagnosticEvent sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                    Exception exception = it.getException();
                    if (exception != null && (message = exception.getMessage()) != null) {
                        str = message;
                    }
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_cronet_install_error", (Double) null, b0.P(new wj.f("reason", str)), (Map) null, (AdObject) null, (Integer) null, 58, (Object) null);
                    lVar.resumeWith(this.this$0.getOkHttp3Client());
                    return;
                }
                try {
                    CronetEngine.Builder builderCreateCronetEngineBuilder = this.this$0.cronetEngineBuilderFactory.createCronetEngineBuilder(context);
                    if (httpClientSelection == HttpClientSelection.CRONET_WITH_QUIC) {
                        builderCreateCronetEngineBuilder.enableQuic(true);
                        builderCreateCronetEngineBuilder.addQuicHint(ServiceProvider.GATEWAY_HOST, 443, 443);
                        builderCreateCronetEngineBuilder.addQuicHint(ServiceProvider.CDN_CREATIVES_HOST, 443, 443);
                    }
                    CronetEngine cronetEngine = builderCreateCronetEngineBuilder.build();
                    j jVar = lVar;
                    n.e(cronetEngine, "cronetEngine");
                    jVar.resumeWith(new CronetClient(cronetEngine, iSDKDispatchers));
                } catch (Throwable th2) {
                    SendDiagnosticEvent sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
                    String message2 = th2.getMessage();
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, "native_cronet_engine_error", (Double) null, b0.P(new wj.f("reason", message2 != null ? message2 : "Errored without message.")), (Map) null, (AdObject) null, (Integer) null, 58, (Object) null);
                    lVar.resumeWith(this.this$0.getOkHttp3Client());
                }
            }
        });
        return lVar.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object createHttpClient(f fVar) {
        AnonymousClass1 anonymousClass1;
        Object objC;
        HttpClientSelection httpClientSelection;
        AndroidHttpClientProvider androidHttpClientProvider;
        HttpClientSelection httpClientSelection2;
        long j10;
        String str;
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
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object obj = anonymousClass2.result;
        int i11 = anonymousClass2.label;
        if (i11 == 0) {
            t9.e.z(obj);
            if (!this.alternativeFlowReader.invoke()) {
                return new LegacyHttpClient(this.dispatchers);
            }
            String stringTrait = this.mediationTraitsMetadataReader.getStringTrait(MediationTraitsMetadataReader.USE_HTTP_CLIENT);
            if (stringTrait != null) {
                try {
                    String upperCase = stringTrait.toUpperCase(Locale.ROOT);
                    n.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    objC = HttpClientSelection.valueOf(upperCase);
                } catch (Throwable th2) {
                    objC = t9.e.c(th2);
                }
                if (objC instanceof g) {
                    objC = null;
                }
                httpClientSelection = (HttpClientSelection) objC;
                if (httpClientSelection == null) {
                    httpClientSelection = HttpClientSelection.CRONET_WITHOUT_QUIC;
                }
            } else {
                httpClientSelection = HttpClientSelection.CRONET_WITHOUT_QUIC;
            }
            long jB = d.b();
            AndroidHttpClientProvider$createHttpClient$client$1 androidHttpClientProvider$createHttpClient$client$1 = new AndroidHttpClientProvider$createHttpClient$client$1(httpClientSelection, this, null);
            anonymousClass2.L$0 = this;
            anonymousClass2.L$1 = httpClientSelection;
            anonymousClass2.J$0 = jB;
            anonymousClass2.label = 1;
            Object objK = d0.K(500L, androidHttpClientProvider$createHttpClient$client$1, anonymousClass2);
            bk.a aVar = bk.a.f5708a;
            if (objK == aVar) {
                return aVar;
            }
            androidHttpClientProvider = this;
            httpClientSelection2 = httpClientSelection;
            obj = objK;
            j10 = jB;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = anonymousClass2.J$0;
            httpClientSelection2 = (HttpClientSelection) anonymousClass2.L$1;
            androidHttpClientProvider = (AndroidHttpClientProvider) anonymousClass2.L$0;
            t9.e.z(obj);
        }
        HttpClient httpClient = (HttpClient) obj;
        double dG = bn.a.g(bn.f.a(j10), bn.c.MILLISECONDS);
        if (h.q0(httpClientSelection2.name(), "CRONET", false)) {
            if (httpClient == null) {
                str = "native_cronet_timeout";
            } else {
                str = httpClient instanceof CronetClient ? "native_cronet_success_time" : "native_cronet_failure_time";
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(androidHttpClientProvider.sendDiagnosticEvent, str, new Double(dG), (Map) null, (Map) null, (AdObject) null, (Integer) null, 60, (Object) null);
        }
        return httpClient == null ? androidHttpClientProvider.getOkHttp3Client() : httpClient;
    }

    public final OkHttp3Client getOkHttp3Client() {
        return new OkHttp3Client(this.dispatchers, new q(new p()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.HttpClientProvider
    public Object invoke(f fVar) throws Throwable {
        C07621 c07621;
        ln.c cVar;
        ln.a aVar;
        Throwable th2;
        ln.a aVar2;
        AndroidHttpClientProvider androidHttpClientProvider;
        if (fVar instanceof C07621) {
            c07621 = (C07621) fVar;
            int i10 = c07621.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07621.label = i10 - Integer.MIN_VALUE;
            } else {
                c07621 = new C07621(fVar);
            }
        } else {
            c07621 = new C07621(fVar);
        }
        Object obj = c07621.result;
        int i11 = c07621.label;
        bk.a aVar3 = bk.a.f5708a;
        try {
            if (i11 == 0) {
                t9.e.z(obj);
                ln.a aVar4 = this.mutex;
                c07621.L$0 = this;
                c07621.L$1 = aVar4;
                c07621.label = 1;
                cVar = (ln.c) aVar4;
                if (cVar.e(c07621) != aVar3) {
                }
                aVar = cVar;
                return aVar3;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (ln.a) c07621.L$1;
                androidHttpClientProvider = (AndroidHttpClientProvider) c07621.L$0;
                try {
                    t9.e.z(obj);
                    aVar2 = aVar2;
                    HttpClient httpClient = (HttpClient) obj;
                    androidHttpClientProvider.cachedClient = httpClient;
                    ((ln.c) aVar2).g(null);
                    return httpClient;
                } catch (Throwable th3) {
                    th2 = th3;
                    ((ln.c) aVar2).g(null);
                    throw th2;
                }
            }
            ln.a aVar5 = (ln.a) c07621.L$1;
            AndroidHttpClientProvider androidHttpClientProvider2 = (AndroidHttpClientProvider) c07621.L$0;
            t9.e.z(obj);
            aVar = aVar5;
            this = androidHttpClientProvider2;
            aVar = cVar;
            HttpClient httpClient2 = this.cachedClient;
            if (httpClient2 != null) {
                ((ln.c) aVar).g(null);
                return httpClient2;
            }
            c07621.L$0 = this;
            c07621.L$1 = aVar;
            c07621.label = 2;
            Object objCreateHttpClient = this.createHttpClient(c07621);
            if (objCreateHttpClient != aVar3) {
                androidHttpClientProvider = this;
                aVar2 = aVar;
                obj = objCreateHttpClient;
                HttpClient httpClient3 = (HttpClient) obj;
                androidHttpClientProvider.cachedClient = httpClient3;
                ((ln.c) aVar2).g(null);
                return httpClient3;
            }
            aVar = cVar;
            return aVar3;
        } catch (Throwable th4) {
            ln.a aVar6 = aVar;
            th2 = th4;
            aVar2 = aVar6;
            ((ln.c) aVar2).g(null);
            throw th2;
        }
    }
}
