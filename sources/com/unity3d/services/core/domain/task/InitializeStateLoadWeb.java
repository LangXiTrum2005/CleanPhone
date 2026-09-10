package com.unity3d.services.core.domain.task;

import ak.f;
import bk.a;
import cn.d0;
import cn.w;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import t9.e;
import wi.d;
import wj.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0017\u0018B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb;", "Lcom/unity3d/services/core/domain/task/MetricTask;", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb$Params;", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb$LoadWebResult;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers", "Lcom/unity3d/services/core/domain/task/InitializeStateNetworkError;", "initializeStateNetworkError", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "httpClientProvider", "<init>", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/services/core/domain/task/InitializeStateNetworkError;Lcom/unity3d/ads/core/domain/HttpClientProvider;)V", "", "getMetricName", "()Ljava/lang/String;", "params", "Lwj/h;", "doWork-gIAlu-s", "(Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb$Params;Lak/f;)Ljava/lang/Object;", "doWork", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "Lcom/unity3d/services/core/domain/task/InitializeStateNetworkError;", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "LoadWebResult", "Params", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class InitializeStateLoadWeb extends MetricTask<Params, LoadWebResult> {
    private final ISDKDispatchers dispatchers;
    private final HttpClientProvider httpClientProvider;
    private final InitializeStateNetworkError initializeStateNetworkError;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb$LoadWebResult;", "", "config", "Lcom/unity3d/services/core/configuration/Configuration;", "webViewDataString", "", "(Lcom/unity3d/services/core/configuration/Configuration;Ljava/lang/String;)V", "getConfig", "()Lcom/unity3d/services/core/configuration/Configuration;", "getWebViewDataString", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final /* data */ class LoadWebResult {
        private final Configuration config;
        private final String webViewDataString;

        public LoadWebResult(Configuration config, String webViewDataString) {
            n.f(config, "config");
            n.f(webViewDataString, "webViewDataString");
            this.config = config;
            this.webViewDataString = webViewDataString;
        }

        public static /* synthetic */ LoadWebResult copy$default(LoadWebResult loadWebResult, Configuration configuration, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                configuration = loadWebResult.config;
            }
            if ((i10 & 2) != 0) {
                str = loadWebResult.webViewDataString;
            }
            return loadWebResult.copy(configuration, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Configuration getConfig() {
            return this.config;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getWebViewDataString() {
            return this.webViewDataString;
        }

        public final LoadWebResult copy(Configuration config, String webViewDataString) {
            n.f(config, "config");
            n.f(webViewDataString, "webViewDataString");
            return new LoadWebResult(config, webViewDataString);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadWebResult)) {
                return false;
            }
            LoadWebResult loadWebResult = (LoadWebResult) other;
            return n.a(this.config, loadWebResult.config) && n.a(this.webViewDataString, loadWebResult.webViewDataString);
        }

        public final Configuration getConfig() {
            return this.config;
        }

        public final String getWebViewDataString() {
            return this.webViewDataString;
        }

        public int hashCode() {
            return this.webViewDataString.hashCode() + (this.config.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("LoadWebResult(config=");
            sb2.append(this.config);
            sb2.append(", webViewDataString=");
            return d.k(sb2, this.webViewDataString, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb$Params;", "Lcom/unity3d/services/core/domain/task/BaseParams;", "config", "Lcom/unity3d/services/core/configuration/Configuration;", "(Lcom/unity3d/services/core/configuration/Configuration;)V", "getConfig", "()Lcom/unity3d/services/core/configuration/Configuration;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final /* data */ class Params implements BaseParams {
        private final Configuration config;

        public Params(Configuration config) {
            n.f(config, "config");
            this.config = config;
        }

        public static /* synthetic */ Params copy$default(Params params, Configuration configuration, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                configuration = params.config;
            }
            return params.copy(configuration);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Configuration getConfig() {
            return this.config;
        }

        public final Params copy(Configuration config) {
            n.f(config, "config");
            return new Params(config);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && n.a(this.config, ((Params) other).config);
        }

        public final Configuration getConfig() {
            return this.config;
        }

        public int hashCode() {
            return this.config.hashCode();
        }

        public String toString() {
            return "Params(config=" + this.config + ')';
        }
    }

    public InitializeStateLoadWeb(ISDKDispatchers dispatchers, InitializeStateNetworkError initializeStateNetworkError, HttpClientProvider httpClientProvider) {
        n.f(dispatchers, "dispatchers");
        n.f(initializeStateNetworkError, "initializeStateNetworkError");
        n.f(httpClientProvider, "httpClientProvider");
        this.dispatchers = dispatchers;
        this.initializeStateNetworkError = initializeStateNetworkError;
        this.httpClientProvider = httpClientProvider;
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    public String getMetricName() {
        return getMetricNameForInitializeTask("download_web_view");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name and merged with bridge method [inline-methods] */
    public Object mo3238doWorkgIAlus(Params params, f fVar) {
        InitializeStateLoadWeb$doWork$1 initializeStateLoadWeb$doWork$1;
        if (fVar instanceof InitializeStateLoadWeb$doWork$1) {
            initializeStateLoadWeb$doWork$1 = (InitializeStateLoadWeb$doWork$1) fVar;
            int i10 = initializeStateLoadWeb$doWork$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                initializeStateLoadWeb$doWork$1.label = i10 - Integer.MIN_VALUE;
            } else {
                initializeStateLoadWeb$doWork$1 = new InitializeStateLoadWeb$doWork$1(this, fVar);
            }
        } else {
            initializeStateLoadWeb$doWork$1 = new InitializeStateLoadWeb$doWork$1(this, fVar);
        }
        Object objJ = initializeStateLoadWeb$doWork$1.result;
        int i11 = initializeStateLoadWeb$doWork$1.label;
        if (i11 == 0) {
            e.z(objJ);
            w wVar = this.dispatchers.getDefault();
            InitializeStateLoadWeb$doWork$2 initializeStateLoadWeb$doWork$2 = new InitializeStateLoadWeb$doWork$2(params, this, null);
            initializeStateLoadWeb$doWork$1.label = 1;
            objJ = d0.J(wVar, initializeStateLoadWeb$doWork$2, initializeStateLoadWeb$doWork$1);
            a aVar = a.f5708a;
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.z(objJ);
        }
        return ((h) objJ).f53286a;
    }
}
