package com.unity3d.services.core.request.metrics;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.ironsource.X3;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.properties.InitializationStatusReader;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import j1.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import r9.b;
import wj.d;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010(\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/unity3d/services/core/request/metrics/MetricSenderWithBatch;", "Lcom/unity3d/services/core/request/metrics/MetricSenderBase;", "Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "_original", "Lcom/unity3d/services/core/properties/InitializationStatusReader;", "initializationStatusReader", "<init>", "(Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;Lcom/unity3d/services/core/properties/InitializationStatusReader;)V", "metrics", "Lwj/r;", "updateOriginal", "(Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;)V", "", NotificationCompat.CATEGORY_EVENT, X3.i.X, "", "tags", "sendEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lcom/unity3d/services/core/request/metrics/Metric;", "metric", "sendMetric", "(Lcom/unity3d/services/core/request/metrics/Metric;)V", "", "sendMetrics", "(Ljava/util/List;)V", "sendQueueIfNeeded", "()V", "Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "Ljava/util/concurrent/LinkedBlockingQueue;", "_queue", "Ljava/util/concurrent/LinkedBlockingQueue;", "Lcom/unity3d/ads/core/log/Logger;", "_logger$delegate", "Lwj/d;", "get_logger", "()Lcom/unity3d/ads/core/log/Logger;", "_logger", "getMetricEndPoint", "()Ljava/lang/String;", "metricEndPoint", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class MetricSenderWithBatch extends MetricSenderBase {

    /* JADX INFO: renamed from: _logger$delegate, reason: from kotlin metadata */
    private final d _logger;
    private SDKMetricsSender _original;
    private final LinkedBlockingQueue<Metric> _queue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSenderWithBatch(SDKMetricsSender _original, InitializationStatusReader initializationStatusReader) {
        super(initializationStatusReader);
        n.f(_original, "_original");
        n.f(initializationStatusReader, "initializationStatusReader");
        this._original = _original;
        this._queue = new LinkedBlockingQueue<>();
        this._logger = b.u(MetricSenderWithBatch$_logger$2.INSTANCE);
    }

    private final Logger get_logger() {
        Object value = this._logger.getValue();
        n.e(value, "<get-_logger>(...)");
        return (Logger) value;
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public String getMetricEndPoint() {
        return this._original.getMetricEndPoint();
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(String event, String value, Map<String, String> tags) {
        n.f(event, "event");
        n.f(tags, "tags");
        if (event.length() == 0) {
            get_logger().debug("Metric event not sent due to being empty: ".concat(event));
        } else {
            sendMetrics(f.C(new Metric(event, value, tags)));
        }
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetric(Metric metric) {
        n.f(metric, "metric");
        sendMetrics(f.C(metric));
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public synchronized void sendMetrics(List<Metric> metrics) {
        n.f(metrics, "metrics");
        this._queue.addAll(metrics);
        if (!TextUtils.isEmpty(this._original.getMetricEndPoint()) && this._queue.size() > 0) {
            ArrayList arrayList = new ArrayList();
            this._queue.drainTo(arrayList);
            this._original.sendMetrics(arrayList);
        }
    }

    public final void sendQueueIfNeeded() {
        sendMetrics(v.f53866a);
    }

    public final void updateOriginal(SDKMetricsSender metrics) {
        n.f(metrics, "metrics");
        this._original = metrics;
    }
}
