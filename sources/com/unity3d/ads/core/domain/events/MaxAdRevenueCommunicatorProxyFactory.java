package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.reflection.CommunicatorSubscriberProxy;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/events/MaxAdRevenueCommunicatorProxyFactory;", "", "logger", "Lcom/unity3d/ads/core/log/Logger;", "(Lcom/unity3d/ads/core/log/Logger;)V", "create", "Lcom/unity3d/services/core/reflection/CommunicatorSubscriberProxy;", "communicatorId", "", "topic", "messageListener", "Lcom/unity3d/services/core/reflection/CommunicatorSubscriberProxy$CommunicatorMessageListener;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class MaxAdRevenueCommunicatorProxyFactory {
    private final Logger logger;

    public MaxAdRevenueCommunicatorProxyFactory(Logger logger) {
        n.f(logger, "logger");
        this.logger = logger;
    }

    public final CommunicatorSubscriberProxy create(String communicatorId, String topic, CommunicatorSubscriberProxy.CommunicatorMessageListener messageListener) {
        n.f(communicatorId, "communicatorId");
        n.f(topic, "topic");
        n.f(messageListener, "messageListener");
        return new CommunicatorSubscriberProxy(communicatorId, topic, messageListener, this.logger);
    }
}
