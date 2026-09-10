package com.unity3d.services.core.reflection;

import android.content.Context;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import wj.f;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/unity3d/services/core/reflection/AppLovinCommunicatorBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "getCommunicatorInstance", "()Ljava/lang/Object;", "", "getClassName", "()Ljava/lang/String;", "Lcom/unity3d/services/core/reflection/CommunicatorSubscriberProxy;", "proxy", "topic", AppLovinCommunicatorBridge.SUBSCRIBE, "(Lcom/unity3d/services/core/reflection/CommunicatorSubscriberProxy;Ljava/lang/String;)Ljava/lang/Object;", "subscriber", "Lwj/r;", AppLovinCommunicatorBridge.UNSUBSCRIBE, "(Ljava/lang/Object;Ljava/lang/String;)V", "Landroid/content/Context;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AppLovinCommunicatorBridge extends GenericBridge {
    private static final String CLASS_NAME = "com.applovin.communicator.AppLovinCommunicator";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String GET_INSTANCE = "getInstance";
    private static final String SUBSCRIBE = "subscribe";
    private static final String UNSUBSCRIBE = "unsubscribe";
    private final Context context;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\n0\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/unity3d/services/core/reflection/AppLovinCommunicatorBridge$Companion;", "", "()V", "CLASS_NAME", "", "GET_INSTANCE", "SUBSCRIBE", "UNSUBSCRIBE", "buildFunctionMap", "", "", "Ljava/lang/Class;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, Class<?>[]> buildFunctionMap() {
            LinkedHashMap linkedHashMapR = b0.R(new f("getInstance", new Class[]{Context.class}));
            try {
                linkedHashMapR.put(AppLovinCommunicatorBridge.SUBSCRIBE, new Class[]{AppLovinCommunicatorSubscriber.class, String.class});
                linkedHashMapR.put(AppLovinCommunicatorBridge.UNSUBSCRIBE, new Class[]{AppLovinCommunicatorSubscriber.class, String.class});
            } catch (ClassNotFoundException unused) {
            }
            return linkedHashMapR;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLovinCommunicatorBridge(Context context) {
        super(INSTANCE.buildFunctionMap(), false);
        n.f(context, "context");
        this.context = context;
    }

    private final Object getCommunicatorInstance() {
        return callNonVoidMethod("getInstance", null, this.context);
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return CLASS_NAME;
    }

    public final Object subscribe(CommunicatorSubscriberProxy proxy, String topic) {
        n.f(proxy, "proxy");
        n.f(topic, "topic");
        Object communicatorInstance = getCommunicatorInstance();
        if (communicatorInstance == null) {
            return null;
        }
        try {
            Object proxyInstance = proxy.getProxyInstance();
            callVoidMethod(SUBSCRIBE, communicatorInstance, proxyInstance, topic);
            return proxyInstance;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final void unsubscribe(Object subscriber, String topic) {
        n.f(subscriber, "subscriber");
        n.f(topic, "topic");
        Object communicatorInstance = getCommunicatorInstance();
        if (communicatorInstance == null) {
            return;
        }
        callVoidMethod(UNSUBSCRIBE, communicatorInstance, subscriber, topic);
    }
}
