package com.unity3d.services.core.request.metrics;

import ak.f;
import an.h;
import androidx.core.app.NotificationCompat;
import ck.e;
import ck.i;
import cn.a0;
import cn.x;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.di.IServicesRegistry;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.properties.InitializationStatusReader;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import java.util.Map;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010$\u001a\n #*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/unity3d/services/core/request/metrics/MetricSender;", "Lcom/unity3d/services/core/request/metrics/MetricSenderBase;", "Lcom/unity3d/services/core/di/IServiceComponent;", "Lcom/unity3d/services/core/configuration/Configuration;", "configuration", "Lcom/unity3d/services/core/properties/InitializationStatusReader;", "initializationStatusReader", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/services/core/configuration/Configuration;Lcom/unity3d/services/core/properties/InitializationStatusReader;Lcom/unity3d/ads/core/log/Logger;)V", "", NotificationCompat.CATEGORY_EVENT, X3.i.X, "", "tags", "Lwj/r;", "sendEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lcom/unity3d/services/core/request/metrics/Metric;", "metric", "sendMetric", "(Lcom/unity3d/services/core/request/metrics/Metric;)V", "", "metrics", "sendMetrics", "(Ljava/util/List;)V", "shutdown", "()V", "Lcom/unity3d/ads/core/log/Logger;", "Lcom/unity3d/services/core/request/metrics/MetricCommonTags;", "commonTags", "Lcom/unity3d/services/core/request/metrics/MetricCommonTags;", "metricSampleRate", "Ljava/lang/String;", "kotlin.jvm.PlatformType", "sessionToken", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "httpClientProvider", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "Lcn/a0;", "scope", "Lcn/a0;", "metricEndPoint", "getMetricEndPoint", "()Ljava/lang/String;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public class MetricSender extends MetricSenderBase implements IServiceComponent {
    private final MetricCommonTags commonTags;
    private final ISDKDispatchers dispatchers;
    private final HttpClientProvider httpClientProvider;
    private final Logger logger;
    private final String metricEndPoint;
    private final String metricSampleRate;
    private final a0 scope;
    private final String sessionToken;

    /* JADX INFO: renamed from: com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$1", f = "MetricSender.kt", l = {66, 66}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements c {
        final /* synthetic */ List<Metric> $metrics;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<Metric> list, f fVar) {
            super(2, fVar);
            this.$metrics = list;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return MetricSender.this.new AnonymousClass1(this.$metrics, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00a6, code lost:
        
            if (r0 == r8) goto L19;
         */
        @Override // ck.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r30) {
            /*
                Method dump skipped, instruction units count: 257
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.request.metrics.MetricSender.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSender(Configuration configuration, InitializationStatusReader initializationStatusReader, Logger logger) {
        super(initializationStatusReader);
        n.f(configuration, "configuration");
        n.f(initializationStatusReader, "initializationStatusReader");
        n.f(logger, "logger");
        this.logger = logger;
        MetricCommonTags metricCommonTags = new MetricCommonTags();
        metricCommonTags.updateWithConfig(configuration);
        this.commonTags = metricCommonTags;
        double metricSampleRate = configuration.getMetricSampleRate();
        if (Double.isNaN(metricSampleRate)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        this.metricSampleRate = String.valueOf(metricSampleRate > 2.147483647E9d ? Integer.MAX_VALUE : metricSampleRate < -2.147483648E9d ? Integer.MIN_VALUE : (int) Math.round(metricSampleRate));
        this.sessionToken = configuration.getSessionToken();
        IServicesRegistry registry = getServiceProvider().getRegistry();
        e0 e0Var = d0.f44761a;
        ISDKDispatchers iSDKDispatchers = (ISDKDispatchers) registry.getService("", e0Var.b(ISDKDispatchers.class));
        this.dispatchers = iSDKDispatchers;
        this.httpClientProvider = (HttpClientProvider) getServiceProvider().getRegistry().getService("", e0Var.b(HttpClientProvider.class));
        this.scope = cn.d0.b(iSDKDispatchers.getIo());
        this.metricEndPoint = configuration.getMetricsUrl();
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public String getMetricEndPoint() {
        return this.metricEndPoint;
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(String event, String value, Map<String, String> tags) {
        n.f(event, "event");
        n.f(tags, "tags");
        if (event.length() == 0) {
            Logger.DefaultImpls.trace$default(this.logger, "Metric event not sent due to being null or empty: ".concat(event), null, 2, null);
        } else {
            sendMetrics(j1.f.C(new Metric(event, value, tags)));
        }
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetric(Metric metric) {
        n.f(metric, "metric");
        sendMetrics(j1.f.C(metric));
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetrics(List<Metric> metrics) {
        n.f(metrics, "metrics");
        if (metrics.isEmpty()) {
            Logger.DefaultImpls.trace$default(this.logger, "Metrics event not send due to being empty", null, 2, null);
            return;
        }
        String metricEndPoint = getMetricEndPoint();
        if (metricEndPoint != null && !h.y0(metricEndPoint)) {
            cn.d0.w(this.scope, new MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1(x.f6783a, this, metrics), new AnonymousClass1(metrics, null), 2);
            return;
        }
        Logger.DefaultImpls.trace$default(this.logger, "Metrics: " + metrics + " was not sent to null or empty endpoint: " + getMetricEndPoint(), null, 2, null);
    }

    public final void shutdown() {
        this.commonTags.shutdown();
    }
}
