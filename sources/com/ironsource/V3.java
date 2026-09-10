package com.ironsource;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class V3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U9 f27340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f27341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, Boolean> f27342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0674y7 f27343d;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends kotlin.jvm.internal.o implements jk.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27344a = new a();

        public a() {
            super(1);
        }

        @Override // jk.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(AdapterBaseWrapper it) {
            kotlin.jvm.internal.n.f(it, "it");
            return it.getSettings().getProviderTypeForReflection();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b extends kotlin.jvm.internal.o implements jk.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ConcurrentHashMap<String, Boolean> f27345a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ConcurrentHashMap<String, Boolean> concurrentHashMap) {
            super(1);
            this.f27345a = concurrentHashMap;
        }

        @Override // jk.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String provider) {
            kotlin.jvm.internal.n.f(provider, "provider");
            return Boolean.valueOf(kotlin.jvm.internal.n.a(this.f27345a.get(provider), Boolean.TRUE));
        }
    }

    public V3() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final Boolean c(NetworkSettings networkSettings) {
        ConcurrentHashMap<String, Boolean> concurrentHashMap;
        String providerTypeForReflection = networkSettings != null ? networkSettings.getProviderTypeForReflection() : null;
        if (providerTypeForReflection == null || providerTypeForReflection.length() == 0 || (concurrentHashMap = this.f27342c) == null) {
            return null;
        }
        return concurrentHashMap.get(providerTypeForReflection);
    }

    private final void d() {
        this.f27342c = null;
        this.f27340a.b();
    }

    public final Boolean a() {
        return this.f27341b;
    }

    public final InterfaceC0674y7 b() {
        return this.f27343d;
    }

    public V3(U9 globalDataWriter) {
        kotlin.jvm.internal.n.f(globalDataWriter, "globalDataWriter");
        this.f27340a = globalDataWriter;
        this.f27343d = Kb.f26413u.d().a();
    }

    private final Boolean b(NetworkSettings networkSettings) {
        if (networkSettings == null || networkSettings.isCustomNetwork() || !networkSettings.getApplicationSettings().has(W3.f27524a)) {
            return null;
        }
        return Boolean.valueOf(networkSettings.getApplicationSettings().optBoolean(W3.f27524a));
    }

    public final void a(boolean z10) {
        d();
        this.f27341b = Boolean.valueOf(z10);
    }

    private final void a(Map<String, Boolean> map) {
        c();
        this.f27342c = new ConcurrentHashMap<>(map);
    }

    private final void c() {
        this.f27341b = null;
        this.f27340a.a();
    }

    public /* synthetic */ V3(U9 u10, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? new U9() : u10);
    }

    public final void b(Map<String, ? extends AdapterBaseWrapper> networkAdapters) {
        kotlin.jvm.internal.n.f(networkAdapters, "networkAdapters");
        ConcurrentHashMap<String, Boolean> concurrentHashMap = this.f27342c;
        if (concurrentHashMap == null) {
            return;
        }
        if (networkAdapters.isEmpty()) {
            this.f27340a.b();
        } else {
            this.f27340a.a(xj.n.N0(zm.l.X(zm.l.P(zm.l.V(xj.n.g0(networkAdapters.values()), a.f27344a), new b(concurrentHashMap)))));
        }
    }

    public final void a(Map<String, ? extends AbstractAdapter> adapters, Map<String, ? extends AdapterBaseWrapper> networkAdapters) {
        wj.r rVar;
        kotlin.jvm.internal.n.f(adapters, "adapters");
        kotlin.jvm.internal.n.f(networkAdapters, "networkAdapters");
        Iterator<? extends AbstractAdapter> it = adapters.values().iterator();
        while (it.hasNext()) {
            a(it.next(), (NetworkSettings) null);
        }
        for (AdapterBaseWrapper adapterBaseWrapper : networkAdapters.values()) {
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
            if (adapterBaseInterface != null) {
                a(adapterBaseInterface, adapterBaseWrapper.getSettings());
                rVar = wj.r.f53297a;
            } else {
                rVar = null;
            }
            if (rVar == null) {
                IronLog.INTERNAL.error("adapter is null");
            }
        }
    }

    public final void a(AdapterBaseInterface adapter, NetworkSettings networkSettings) {
        kotlin.jvm.internal.n.f(adapter, "adapter");
        try {
            Boolean boolA = a(networkSettings);
            if (boolA == null || !(adapter instanceof AdapterConsentInterface)) {
                return;
            }
            ((AdapterConsentInterface) adapter).setConsent(boolA.booleanValue());
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            String strG = l1.d.g("error while setting consent of ", networkSettings != null ? networkSettings.getProviderName() : null, ": ", th2.getLocalizedMessage());
            a(strG);
            IronLog.INTERNAL.error(strG);
        }
    }

    public final void a(AbstractAdapter adapter, NetworkSettings networkSettings) {
        kotlin.jvm.internal.n.f(adapter, "adapter");
        try {
            Boolean boolA = a(networkSettings);
            if (boolA != null) {
                adapter.setNewConsent(boolA.booleanValue());
            }
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            String strG = l1.d.g("error while setting consent of ", adapter.getProviderName(), ": ", th2.getLocalizedMessage());
            a(strG);
            IronLog.INTERNAL.error(strG);
        }
    }

    private final Boolean a(NetworkSettings networkSettings) {
        Boolean boolB = b(networkSettings);
        if (boolB != null) {
            return boolB;
        }
        Boolean boolC = c(networkSettings);
        return boolC == null ? this.f27341b : boolC;
    }

    public final void a(Map<String, Boolean> networkConsents, Map<String, ? extends AbstractAdapter> adapters, Map<String, ? extends AdapterBaseWrapper> networkAdapters) {
        kotlin.jvm.internal.n.f(networkConsents, "networkConsents");
        kotlin.jvm.internal.n.f(adapters, "adapters");
        kotlin.jvm.internal.n.f(networkAdapters, "networkAdapters");
        a(networkConsents);
        a(adapters, networkAdapters);
        b(networkAdapters);
    }

    private final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("reason", str);
            }
            G9.i().a(new C0654x5(EnumC0672y5.TROUBLESHOOTING_CONSENT_INTERNAL_ERROR, jSONObject));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public final void a(int i10) {
        JSONObject jSONObjectB = IronSourceUtils.b(false);
        try {
            jSONObjectB.put(IronSourceConstants.EVENTS_EXT1, i10 + ";" + this.f27343d.G(ContextProvider.getInstance().getApplicationContext()));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(qk.i0.m0(e10));
        }
        Kb.f26413u.d().q().a(new C0654x5(EnumC0672y5.CONSENT_TCF_CODE, jSONObjectB));
    }

    public final void a(int i10, Map<String, ? extends NetworkSettings> providerSettings) {
        JSONObject applicationSettings;
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        String strG = this.f27343d.G(ContextProvider.getInstance().getApplicationContext());
        IronLog ironLog = IronLog.API;
        ironLog.general("TCF Additional Consent: " + strG);
        ironLog.general("CMP ID: " + i10);
        ironLog.general("Network Consent Reporting:");
        ironLog.general("----------------------------");
        Collection<? extends NetworkSettings> collectionValues = providerSettings.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (networkSettings.getProviderDefaultInstance() != null && !kotlin.jvm.internal.n.a(networkSettings.getProviderDefaultInstance(), IronSourceConstants.SUPERSONIC_CONFIG_NAME) && (applicationSettings = networkSettings.getApplicationSettings()) != null && applicationSettings.has(W3.f27524a)) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList<NetworkSettings> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((NetworkSettings) obj2).getProviderDefaultInstance())) {
                arrayList2.add(obj2);
            }
        }
        for (NetworkSettings networkSettings2 : arrayList2) {
            IronLog ironLog2 = IronLog.API;
            String providerDefaultInstance = networkSettings2.getProviderDefaultInstance();
            JSONObject applicationSettings2 = networkSettings2.getApplicationSettings();
            ironLog2.general(providerDefaultInstance + ": " + (applicationSettings2 != null ? Boolean.valueOf(applicationSettings2.optBoolean(W3.f27524a)) : null));
        }
    }
}
