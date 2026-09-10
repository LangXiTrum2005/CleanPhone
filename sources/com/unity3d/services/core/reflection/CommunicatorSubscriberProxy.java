package com.unity3d.services.core.reflection;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.unity3d.ads.core.log.Logger;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wi.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\t\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J4\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0010\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/unity3d/services/core/reflection/CommunicatorSubscriberProxy;", "Lcom/unity3d/services/core/reflection/GenericListenerProxy;", "", "communicatorId", "topic", "Lcom/unity3d/services/core/reflection/CommunicatorSubscriberProxy$CommunicatorMessageListener;", "messageListener", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/services/core/reflection/CommunicatorSubscriberProxy$CommunicatorMessageListener;Lcom/unity3d/ads/core/log/Logger;)V", "", "message", "Lwj/r;", "handleMessage", "(Ljava/lang/Object;)V", "Ljava/lang/Class;", "getProxyClass", "()Ljava/lang/Class;", "proxy", "Ljava/lang/reflect/Method;", "m", "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/String;", "Lcom/unity3d/services/core/reflection/CommunicatorSubscriberProxy$CommunicatorMessageListener;", "Lcom/unity3d/ads/core/log/Logger;", "Companion", "CommunicatorMessageListener", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CommunicatorSubscriberProxy extends GenericListenerProxy {
    private static final String GET_COMMUNICATOR_ID = "getCommunicatorId";
    private static final String MESSAGE_CLASS = "com.applovin.communicator.AppLovinCommunicatorMessage";
    private static final String ON_MESSAGE_RECEIVED = "onMessageReceived";
    private static final String SUBSCRIBER_CLASS = "com.applovin.communicator.AppLovinCommunicatorSubscriber";
    private final String communicatorId;
    private final Logger logger;
    private final CommunicatorMessageListener messageListener;
    private final String topic;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/core/reflection/CommunicatorSubscriberProxy$CommunicatorMessageListener;", "", "Landroid/os/Bundle;", "messageData", "Lwj/r;", CommunicatorSubscriberProxy.ON_MESSAGE_RECEIVED, "(Landroid/os/Bundle;)V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public interface CommunicatorMessageListener {
        void onMessageReceived(Bundle messageData);
    }

    public CommunicatorSubscriberProxy(String communicatorId, String topic, CommunicatorMessageListener messageListener, Logger logger) {
        n.f(communicatorId, "communicatorId");
        n.f(topic, "topic");
        n.f(messageListener, "messageListener");
        n.f(logger, "logger");
        this.communicatorId = communicatorId;
        this.topic = topic;
        this.messageListener = messageListener;
        this.logger = logger;
    }

    private final void handleMessage(Object message) {
        try {
            int i10 = AppLovinCommunicatorMessage.f7333b;
            Object objInvoke = AppLovinCommunicatorMessage.class.getMethod("getTopic", null).invoke(message, null);
            if (n.a(this.topic, objInvoke instanceof String ? (String) objInvoke : null)) {
                Object objInvoke2 = AppLovinCommunicatorMessage.class.getMethod("getMessageData", null).invoke(message, null);
                if (objInvoke2 instanceof Bundle) {
                    this.messageListener.onMessageReceived((Bundle) objInvoke2);
                }
            }
        } catch (Exception e10) {
            this.logger.trace("Failed to handle proxy communicator message", e10);
        }
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy
    public Class<?> getProxyClass() throws ClassNotFoundException {
        return AppLovinCommunicatorSubscriber.class;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.unity3d.services.core.reflection.GenericListenerProxy, java.lang.reflect.InvocationHandler
    public Object invoke(Object proxy, Method m7, Object[] args) throws Throwable {
        n.f(proxy, "proxy");
        n.f(m7, "m");
        String name = m7.getName();
        if (name != null) {
            boolean z10 = false;
            switch (name.hashCode()) {
                case -1776922004:
                    if (name.equals(InAppPurchaseConstants.METHOD_TO_STRING)) {
                        return d.k(new StringBuilder("CommunicatorSubscriber("), this.communicatorId, ')');
                    }
                    break;
                case -1437096151:
                    if (name.equals(ON_MESSAGE_RECEIVED) && args != null && args.length != 0) {
                        handleMessage(args[0]);
                    }
                    return null;
                case -1295482945:
                    if (name.equals("equals")) {
                        if (args != null && args.length == 1 && proxy == args[0]) {
                            z10 = true;
                        }
                        return Boolean.valueOf(z10);
                    }
                    break;
                case 147696667:
                    if (name.equals("hashCode")) {
                        return Integer.valueOf(System.identityHashCode(proxy));
                    }
                    break;
                case 1974057286:
                    if (name.equals(GET_COMMUNICATOR_ID)) {
                        return this.communicatorId;
                    }
                    break;
            }
        }
        return null;
    }
}
