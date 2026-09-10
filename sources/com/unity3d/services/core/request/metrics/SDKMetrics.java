package com.unity3d.services.core.request.metrics;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.InitializationStatusReader;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class SDKMetrics {
    private static final String NULL_INSTANCE_METRICS_URL = "nullInstanceMetricsUrl";
    private static MetricSenderWithBatch _batchedSender;
    private static final AtomicBoolean _configurationIsSet = new AtomicBoolean(false);
    private static SDKMetricsSender _instance;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class NullInstance implements SDKMetricsSender {
        private Logger _logger;
        private final String _metricEndpoint;

        public NullInstance(String str) {
            this._metricEndpoint = str;
        }

        private Logger getLogger() {
            if (this._logger == null) {
                this._logger = (Logger) Utilities.getService(Logger.class);
            }
            return this._logger;
        }

        @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public String getMetricEndPoint() {
            return this._metricEndpoint;
        }

        @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public void sendEvent(@NonNull String str) {
            getLogger().debug("Metric " + str + " was skipped from being sent");
        }

        @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public void sendMetric(@NonNull Metric metric) {
            getLogger().debug("Metric " + metric + " was skipped from being sent");
        }

        @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public void sendMetricWithInitState(Metric metric) {
            sendMetric(metric);
        }

        @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public void sendMetrics(@NonNull List<Metric> list) {
            getLogger().debug("Metrics: " + list + " was skipped from being sent");
        }

        @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public void sendEvent(@NonNull String str, String str2, Map<String, String> map) {
            sendEvent(str);
        }

        public void sendEvent(@NonNull String str, Map<String, String> map) {
            sendEvent(str);
        }
    }

    public static synchronized SDKMetricsSender getInstance() {
        try {
            if (_instance == null) {
                _instance = new NullInstance(null);
            }
            if (_batchedSender == null) {
                _batchedSender = new MetricSenderWithBatch(_instance, new InitializationStatusReader());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return _batchedSender;
    }

    private static boolean isAllowedToSetConfiguration(Configuration configuration) {
        return !TextUtils.isEmpty(configuration.getMetricsUrl()) && _configurationIsSet.compareAndSet(false, true);
    }

    public static void setConfiguration(Configuration configuration) {
        Logger logger = (Logger) Utilities.getService(Logger.class);
        if (configuration == null) {
            logger.debug("Metrics will not be sent from the device for this session due to misconfiguration");
            return;
        }
        if (isAllowedToSetConfiguration(configuration)) {
            SDKMetricsSender sDKMetricsSender = _instance;
            if (sDKMetricsSender instanceof MetricSender) {
                ((MetricSender) sDKMetricsSender).shutdown();
            }
            if (configuration.areMetricsEnabledForCurrentSession().booleanValue()) {
                _instance = new MetricSender(configuration, new InitializationStatusReader(), logger);
            } else {
                logger.debug("Metrics will not be sent from the device for this session");
                _instance = new NullInstance(NULL_INSTANCE_METRICS_URL);
            }
            MetricSenderWithBatch metricSenderWithBatch = _batchedSender;
            if (metricSenderWithBatch == null) {
                _batchedSender = new MetricSenderWithBatch(_instance, new InitializationStatusReader());
            } else {
                metricSenderWithBatch.updateOriginal(_instance);
            }
            _batchedSender.sendQueueIfNeeded();
        }
    }
}
