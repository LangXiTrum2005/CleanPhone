package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.MaxAdRevenueListener;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.reflection.AppLovinCommunicatorBridge;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/unity3d/ads/core/domain/events/MaxAdRevenueObserver;", "", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/log/Logger;", "logger", "Lcom/unity3d/services/core/reflection/AppLovinCommunicatorBridge;", "communicatorBridge", "Lcom/unity3d/ads/core/data/datasource/MaxAdRevenueListener;", "revenueListener", "Lcom/unity3d/ads/core/domain/events/MaxAdRevenueCommunicatorProxyFactory;", "communicatorProxyFactory", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/log/Logger;Lcom/unity3d/services/core/reflection/AppLovinCommunicatorBridge;Lcom/unity3d/ads/core/data/datasource/MaxAdRevenueListener;Lcom/unity3d/ads/core/domain/events/MaxAdRevenueCommunicatorProxyFactory;)V", "Lwj/r;", "invoke", "()V", "stop", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/log/Logger;", "Lcom/unity3d/services/core/reflection/AppLovinCommunicatorBridge;", "Lcom/unity3d/ads/core/data/datasource/MaxAdRevenueListener;", "Lcom/unity3d/ads/core/domain/events/MaxAdRevenueCommunicatorProxyFactory;", "communicatorSubscriber", "Ljava/lang/Object;", "", "isStarted", "Z", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class MaxAdRevenueObserver {
    private static final String COMMUNICATOR_ID = "ilrd_observer";
    private static final String MAX_REVENUE_EVENTS_TOPIC = "max_revenue_events";
    private final AppLovinCommunicatorBridge communicatorBridge;
    private final MaxAdRevenueCommunicatorProxyFactory communicatorProxyFactory;
    private Object communicatorSubscriber;
    private boolean isStarted;
    private final Logger logger;
    private final MaxAdRevenueListener revenueListener;
    private final SessionRepository sessionRepository;

    public MaxAdRevenueObserver(SessionRepository sessionRepository, Logger logger, AppLovinCommunicatorBridge communicatorBridge, MaxAdRevenueListener revenueListener, MaxAdRevenueCommunicatorProxyFactory communicatorProxyFactory) {
        n.f(sessionRepository, "sessionRepository");
        n.f(logger, "logger");
        n.f(communicatorBridge, "communicatorBridge");
        n.f(revenueListener, "revenueListener");
        n.f(communicatorProxyFactory, "communicatorProxyFactory");
        this.sessionRepository = sessionRepository;
        this.logger = logger;
        this.communicatorBridge = communicatorBridge;
        this.revenueListener = revenueListener;
        this.communicatorProxyFactory = communicatorProxyFactory;
    }

    public final void invoke() {
        synchronized (this) {
            try {
                boolean collectIlrData = this.sessionRepository.getNativeConfiguration().getFeatureFlags().getCollectIlrData();
                if (this.isStarted) {
                    if (collectIlrData) {
                        Logger.DefaultImpls.trace$default(this.logger, "ILRD observer already started", null, 2, null);
                    } else {
                        Logger.DefaultImpls.trace$default(this.logger, "ILRD collection feature flag changed to disabled, stopping", null, 2, null);
                        stop();
                    }
                    return;
                }
                if (!collectIlrData) {
                    Logger.DefaultImpls.trace$default(this.logger, "ILRD collection feature flag is disabled", null, 2, null);
                    return;
                }
                try {
                    try {
                        Object objSubscribe = this.communicatorBridge.subscribe(this.communicatorProxyFactory.create(COMMUNICATOR_ID, MAX_REVENUE_EVENTS_TOPIC, new MaxAdRevenueObserver$invoke$1$proxy$1(this.revenueListener)), MAX_REVENUE_EVENTS_TOPIC);
                        if (objSubscribe != null) {
                            this.communicatorSubscriber = objSubscribe;
                            this.isStarted = true;
                            Logger.DefaultImpls.trace$default(this.logger, "Successfully started ad revenue automatic collection", null, 2, null);
                        } else {
                            Logger.DefaultImpls.trace$default(this.logger, "Mediation SDK not available, automatic collection not started", null, 2, null);
                        }
                    } catch (NoSuchMethodException e10) {
                        this.logger.trace("Communicator method not found, SDK version may be incompatible", e10);
                    } catch (Exception e11) {
                        this.logger.trace("Failed to start ad revenue collection", e11);
                    }
                } catch (ClassNotFoundException unused) {
                    Logger.DefaultImpls.trace$default(this.logger, "Mediation SDK not found, skipping automatic collection", null, 2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void stop() {
        synchronized (this) {
            if (this.isStarted) {
                Object obj = this.communicatorSubscriber;
                if (obj != null) {
                    try {
                        this.communicatorBridge.unsubscribe(obj, MAX_REVENUE_EVENTS_TOPIC);
                        Logger.DefaultImpls.trace$default(this.logger, "Unsubscribed from revenue events", null, 2, null);
                    } catch (Exception e10) {
                        this.logger.trace("Failed to unsubscribe from revenue events", e10);
                    }
                    this.communicatorSubscriber = null;
                }
                this.isStarted = false;
            }
        }
    }
}
