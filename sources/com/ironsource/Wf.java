package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Wf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Wf f27610a = new Wf();

    private Wf() {
    }

    public final String a(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        return E1.a(context, c(context));
    }

    public final String b(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        return E1.b(context, c(context));
    }

    public final String c(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        return E1.g(context);
    }

    public final ConcurrentHashMap<String, List<String>> d() {
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.putAll(com.ironsource.mediationsdk.c.b().d());
        concurrentHashMap.putAll(C0462ma.b().c());
        return concurrentHashMap;
    }

    public final void e() {
        com.ironsource.mediationsdk.p.h().H();
    }

    public final JSONObject a(boolean z10) {
        JSONObject jSONObjectB = IronSourceUtils.b(z10);
        kotlin.jvm.internal.n.e(jSONObjectB, "getMediationAdditionalData(isDemandOnlyMode)");
        return jSONObjectB;
    }

    public final JSONObject b() throws JSONException {
        JSONObject jSONObjectB = L6.a().b();
        kotlin.jvm.internal.n.e(jSONObjectB, "getProperties().toJSON()");
        return jSONObjectB;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            ConcurrentHashMap<String, AdapterBaseWrapper> networkAdaptersMap = com.ironsource.mediationsdk.c.b().e();
            kotlin.jvm.internal.n.e(networkAdaptersMap, "networkAdaptersMap");
            for (Map.Entry<String, AdapterBaseWrapper> entry : networkAdaptersMap.entrySet()) {
                if (entry.getValue().getAdapterBaseInterface() != null) {
                    Wf wf2 = f27610a;
                    String key = entry.getKey();
                    kotlin.jvm.internal.n.e(key, "entry.key");
                    String strA = wf2.a(key);
                    AdapterBaseInterface adapterBaseInterface = entry.getValue().getAdapterBaseInterface();
                    kotlin.jvm.internal.n.e(adapterBaseInterface, "entry.value.adapterBaseInterface");
                    String adapterVersion = adapterBaseInterface.getAdapterVersion();
                    kotlin.jvm.internal.n.e(adapterVersion, "adapterBaseInterface.adapterVersion");
                    jSONObject.putOpt(strA, wf2.a(adapterVersion, adapterBaseInterface.getNetworkSDKVersion()));
                }
            }
            return jSONObject;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            return jSONObject;
        }
    }

    public final void a(InterfaceC0338fb interfaceC0338fb) {
        C0299d8.a().b(interfaceC0338fb);
    }

    public final LevelPlayAdSize b(String str, int i10, int i11) {
        if (str != null && str.length() != 0 && !str.equals(com.ironsource.mediationsdk.j.f29558f)) {
            if (str.equals(com.ironsource.mediationsdk.j.f29555c)) {
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            }
            return LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(str);
        }
        return LevelPlayAdSize.Companion.createCustomSize(i10, i11);
    }

    public final void a(InterfaceC0552rb interfaceC0552rb) {
        Md.a().b(interfaceC0552rb);
    }

    public final void a(Ba ba2) {
        C0651x2.a().b(ba2);
    }

    public final int a() {
        return Kb.f26413u.d().a().c();
    }

    public final String a(C0358gd c0358gd) {
        String strC;
        return (c0358gd == null || (strC = c0358gd.c()) == null) ? new String() : strC;
    }

    public final String a(NetworkSettings networkSettings) {
        kotlin.jvm.internal.n.f(networkSettings, "networkSettings");
        String providerDefaultInstance = networkSettings.getProviderDefaultInstance();
        return providerDefaultInstance == null ? new String() : providerDefaultInstance;
    }

    public final boolean a(NetworkSettings networkSettings, IronSource.a adUnit) {
        kotlin.jvm.internal.n.f(networkSettings, "networkSettings");
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        return networkSettings.isBidder(adUnit);
    }

    public final ISBannerSize a(String str, int i10, int i11) {
        return new ISBannerSize(str, i10, i11);
    }

    public final void b(String message) {
        kotlin.jvm.internal.n.f(message, "message");
        IronLog.INTERNAL.error(message);
    }

    public final com.ironsource.mediationsdk.o a(Activity activity, ISBannerSize size) {
        kotlin.jvm.internal.n.f(activity, "activity");
        kotlin.jvm.internal.n.f(size, "size");
        com.ironsource.mediationsdk.o oVarB = com.ironsource.mediationsdk.p.h().b(activity, size);
        kotlin.jvm.internal.n.e(oVarB, "getInstance().createBanner(activity, size)");
        return oVarB;
    }

    public final void a(EnumC0672y5 event, JSONObject data) {
        kotlin.jvm.internal.n.f(event, "event");
        kotlin.jvm.internal.n.f(data, "data");
        C0359ge.i().a(new C0654x5(event, data));
    }

    private final JSONObject a(String str, String str2) {
        return new JSONObject(xj.b0.Q(new wj.f(Pf.f27049b, str), new wj.f("sdkVersion", str2)));
    }

    public final String a(String key) {
        kotlin.jvm.internal.n.f(key, "key");
        try {
            if (!an.h.q0(key, "-", false)) {
                return !an.h.q0(key, "_", false) ? key : (String) xj.n.o0(an.h.I0(key, new String[]{"_"}, 0, 6));
            }
            String str = (String) xj.n.w0(an.h.I0(key, new String[]{"-"}, 0, 6));
            return !an.h.q0(str, "_", false) ? str : (String) xj.n.o0(an.h.I0(str, new String[]{"_"}, 0, 6));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.getMessage());
            return key;
        }
    }
}
