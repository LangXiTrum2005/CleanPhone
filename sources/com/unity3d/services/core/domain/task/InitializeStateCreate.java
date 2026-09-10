package com.unity3d.services.core.domain.task;

import ak.f;
import bk.a;
import cn.d0;
import cn.w;
import com.facebook.appevents.iap.InAppPurchaseConstants;
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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateCreate;", "Lcom/unity3d/services/core/domain/task/MetricTask;", "Lcom/unity3d/services/core/domain/task/InitializeStateCreate$Params;", "Lcom/unity3d/services/core/configuration/Configuration;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers", "<init>", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;)V", "", "getMetricName", "()Ljava/lang/String;", "params", "Lwj/h;", "doWork-gIAlu-s", "(Lcom/unity3d/services/core/domain/task/InitializeStateCreate$Params;Lak/f;)Ljava/lang/Object;", "doWork", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "Params", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class InitializeStateCreate extends MetricTask<Params, Configuration> {
    private final ISDKDispatchers dispatchers;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateCreate$Params;", "Lcom/unity3d/services/core/domain/task/BaseParams;", "config", "Lcom/unity3d/services/core/configuration/Configuration;", "webViewData", "", "(Lcom/unity3d/services/core/configuration/Configuration;Ljava/lang/String;)V", "getConfig", "()Lcom/unity3d/services/core/configuration/Configuration;", "getWebViewData", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final /* data */ class Params implements BaseParams {
        private final Configuration config;
        private final String webViewData;

        public Params(Configuration config, String webViewData) {
            n.f(config, "config");
            n.f(webViewData, "webViewData");
            this.config = config;
            this.webViewData = webViewData;
        }

        public static /* synthetic */ Params copy$default(Params params, Configuration configuration, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                configuration = params.config;
            }
            if ((i10 & 2) != 0) {
                str = params.webViewData;
            }
            return params.copy(configuration, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Configuration getConfig() {
            return this.config;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getWebViewData() {
            return this.webViewData;
        }

        public final Params copy(Configuration config, String webViewData) {
            n.f(config, "config");
            n.f(webViewData, "webViewData");
            return new Params(config, webViewData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return n.a(this.config, params.config) && n.a(this.webViewData, params.webViewData);
        }

        public final Configuration getConfig() {
            return this.config;
        }

        public final String getWebViewData() {
            return this.webViewData;
        }

        public int hashCode() {
            return this.webViewData.hashCode() + (this.config.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Params(config=");
            sb2.append(this.config);
            sb2.append(", webViewData=");
            return d.k(sb2, this.webViewData, ')');
        }
    }

    public InitializeStateCreate(ISDKDispatchers dispatchers) {
        n.f(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    public String getMetricName() {
        return getMetricNameForInitializeTask("create_web_view");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name and merged with bridge method [inline-methods] */
    public Object mo3238doWorkgIAlus(Params params, f fVar) {
        InitializeStateCreate$doWork$1 initializeStateCreate$doWork$1;
        if (fVar instanceof InitializeStateCreate$doWork$1) {
            initializeStateCreate$doWork$1 = (InitializeStateCreate$doWork$1) fVar;
            int i10 = initializeStateCreate$doWork$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                initializeStateCreate$doWork$1.label = i10 - Integer.MIN_VALUE;
            } else {
                initializeStateCreate$doWork$1 = new InitializeStateCreate$doWork$1(this, fVar);
            }
        } else {
            initializeStateCreate$doWork$1 = new InitializeStateCreate$doWork$1(this, fVar);
        }
        Object objJ = initializeStateCreate$doWork$1.result;
        int i11 = initializeStateCreate$doWork$1.label;
        if (i11 == 0) {
            e.z(objJ);
            w wVar = this.dispatchers.getDefault();
            InitializeStateCreate$doWork$2 initializeStateCreate$doWork$2 = new InitializeStateCreate$doWork$2(params, null);
            initializeStateCreate$doWork$1.label = 1;
            objJ = d0.J(wVar, initializeStateCreate$doWork$2, initializeStateCreate$doWork$1);
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
