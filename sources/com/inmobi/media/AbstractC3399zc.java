package com.inmobi.media;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorEntity;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.sdk.AppLovinSdk;
import com.inmobi.media.AbstractC3399zc;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.signals.adinfo.SignalCollector;
import com.ironsource.C3414a2;
import com.unity3d.services.core.fid.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p002kotlin.Unit;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.zc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3399zc {
    public static final AtomicBoolean a = new AtomicBoolean(false);
    public static final SignalsConfig b;
    public static final String c;
    public static final taiyuan d;
    public static final taiyuan e;
    public static Boolean f;
    public static final Function2 g;

    static {
        C2968i4 c2968i4 = Y3.a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        SignalsConfig signalsConfig = (SignalsConfig) Y3.a.a(SignalsConfig.class);
        b = signalsConfig;
        String topic = signalsConfig.getPublisher().getAuto().getTopic();
        if (topic.length() == 0) {
            topic = "max_revenue_events";
        }
        c = topic;
        d = saneness.saneness(new Function0() { // from class: adsuki.eia
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC3399zc.d();
            }
        });
        e = saneness.saneness(new Function0() { // from class: adsuki.gelandelaufer
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(AbstractC3399zc.b());
            }
        });
        g = new Function2() { // from class: adsuki.arcticology
            @Override // p002kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC3399zc.a((Bundle) obj, (String) obj2);
            }
        };
    }

    public static final Unit a(Bundle bundle, String topic) {
        LinkedHashMap linkedHashMapA;
        Intrinsics.checkNotNullParameter(topic, "topic");
        if (bundle != null) {
            try {
                if (Intrinsics.wireman(topic, c) && (linkedHashMapA = a(bundle)) != null) {
                    Og.a.getClass();
                    Og.a(linkedHashMapA);
                    linkedHashMapA.toString();
                }
            } catch (Throwable unused) {
            }
        }
        return Unit.f29295attabal;
    }

    public static final boolean b() {
        try {
            int i = AppLovinCommunicator.f16578attabal;
            if (!Intrinsics.wireman(AppLovinCommunicator.class.getMethod(Constants.GET_INSTANCE, null).getReturnType(), AppLovinCommunicator.class)) {
                return false;
            }
            int i2 = AppLovinCommunicatorMessage.f16579kowloon;
            return Intrinsics.wireman(AppLovinCommunicatorSubscriber.class.getMethod("onMessageReceived", AppLovinCommunicatorMessage.class).getReturnType(), Void.TYPE) && Intrinsics.wireman(AppLovinCommunicatorEntity.class.getMethod("getCommunicatorId", null).getReturnType(), String.class);
        } catch (Error | Exception unused) {
            return false;
        }
    }

    public static boolean c() {
        String str;
        Boolean bool = f;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            String str2 = AppLovinSdk.VERSION;
            Object obj = AppLovinSdk.class.getField("VERSION").get(null);
            str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                str = C3414a2.f;
            }
        } catch (Throwable unused) {
        }
        List<String> incompatibleSdkVer = b.getPublisher().getAuto().getIncompatibleSdkVer();
        Objects.toString(incompatibleSdkVer);
        boolean z = Intrinsics.wireman(str, C3414a2.f) || incompatibleSdkVer.contains(str);
        f = Boolean.valueOf(z);
        return z;
    }

    public static final SignalCollector d() {
        return new SignalCollector(graveside.marial(c));
    }

    public static void a() {
        if (b.getPublisher().getAuto().getEnabled() && !c() && ((Boolean) e.getValue()).booleanValue() && c.length() != 0 && a.compareAndSet(false, true)) {
            ((SignalCollector) d.getValue()).setupAppLovinCommunicator(g);
        }
    }

    public static LinkedHashMap a(Bundle data) {
        boolean z;
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(data, "data");
        if (!a.get()) {
            return null;
        }
        SignalsConfig signalsConfig = b;
        if (!signalsConfig.getPublisher().getAuto().getEnabled()) {
            return null;
        }
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = signalsConfig.getPublisher().getAuto().getAllowedKeys();
        if (allowedKeys.isEmpty()) {
            return null;
        }
        Objects.toString(allowedKeys.keySet());
        Set<String> setKeySet = data.keySet();
        if (setKeySet.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Intrinsics.beachfront(setKeySet);
        if (setKeySet.contains("ad_format") && (obj2 = data.get("ad_format")) != null) {
            linkedHashMap.put("auto_type", obj2);
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        if (!z) {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            return null;
        }
        for (Map.Entry<String, SignalsConfig.PublisherConfig.KeyData> entry : allowedKeys.entrySet()) {
            String key = entry.getKey();
            SignalsConfig.PublisherConfig.KeyData value = entry.getValue();
            if (setKeySet.contains(key)) {
                String name = value.getName();
                if (F3.a(name) && (obj = data.get(key)) != null) {
                    linkedHashMap.put(name, obj);
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }
}
