package com.ironsource.mediationsdk;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.C0428kc;
import com.ironsource.C0474n4;
import com.ironsource.C0654x5;
import com.ironsource.EnumC0672y5;
import com.ironsource.G9;
import com.ironsource.If;
import com.ironsource.V3;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface;
import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterTestModeInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f29317k = "IronSource";
    private static final String l = "com.ironsource.adapters";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f29318m = "aps";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final c f29319n = new c();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Object f29320o = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f29324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f29325e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f29328h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private V3 f29329i = new V3();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C0428kc f29330j = new C0428kc();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, AbstractAdapter> f29321a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, AdapterBaseWrapper> f29322b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ConcurrentHashMap<String, List<String>> f29326f = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConcurrentHashMap<IronSource.a, JSONObject> f29327g = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29331a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            f29331a = iArr;
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29331a[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29331a[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29331a[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static c b() {
        return f29319n;
    }

    public void a(Map<String, Boolean> map) {
        synchronized (f29320o) {
            this.f29329i.a(map, this.f29321a, this.f29322b);
        }
    }

    public void g() {
        synchronized (f29320o) {
            this.f29329i.b(this.f29322b);
        }
    }

    public void b(String str, String str2) {
        this.f29323c = str;
        this.f29324d = str2;
    }

    public void c(boolean z10) {
        Iterator<AdapterBaseWrapper> it = this.f29322b.values().iterator();
        while (it.hasNext()) {
            a(it.next().getAdapterBaseInterface(), z10);
        }
    }

    public ConcurrentHashMap<String, List<String>> d() {
        return this.f29326f;
    }

    public ConcurrentHashMap<String, AdapterBaseWrapper> e() {
        return this.f29322b;
    }

    public void f() {
        this.f29321a.clear();
        this.f29322b.clear();
    }

    public void b(boolean z10) {
        synchronized (f29320o) {
            this.f29329i.a(z10);
            this.f29329i.a(this.f29321a, this.f29322b);
        }
    }

    public void c(String str, List<String> list) {
        synchronized (f29320o) {
            try {
                this.f29326f.put(str, list);
                if (!this.f29321a.isEmpty()) {
                    IronSourceUtils.i("setMetaData key = " + str + ", values = " + list);
                    b(str, list);
                }
                a(str, list);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public AbstractAdapter a(NetworkSettings networkSettings) {
        return a(b(networkSettings), networkSettings.getProviderTypeForReflection());
    }

    public AbstractAdapter a(NetworkSettings networkSettings, JSONObject jSONObject, boolean z10) {
        String coreSDKVersion;
        String strB = b(networkSettings);
        String providerTypeForReflection = z10 ? "IronSource" : networkSettings.getProviderTypeForReflection();
        synchronized (f29320o) {
            try {
                if (this.f29321a.containsKey(strB)) {
                    return this.f29321a.get(strB);
                }
                AbstractAdapter abstractAdapterA = a(strB, providerTypeForReflection);
                if (abstractAdapterA == null) {
                    b(strB + " adapter was not loaded");
                    return null;
                }
                abstractAdapterA.setProviderNetworkKey(networkSettings.getProviderNetworkKey());
                try {
                    coreSDKVersion = abstractAdapterA.getCoreSDKVersion();
                } catch (Throwable th2) {
                    C0474n4.d().a(th2);
                    String str = "error while retrieving coreSDKVersion " + abstractAdapterA.getProviderName() + ": " + th2.getLocalizedMessage();
                    a(EnumC0672y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                    IronLog.INTERNAL.error(str);
                    coreSDKVersion = "Unknown";
                }
                c(strB + " was allocated (adapter version: " + abstractAdapterA.getVersion() + ", sdk version: " + coreSDKVersion + ")");
                c(abstractAdapterA);
                this.f29330j.a(abstractAdapterA);
                a(abstractAdapterA);
                this.f29329i.a(abstractAdapterA, networkSettings);
                b(abstractAdapterA);
                a(jSONObject, abstractAdapterA, providerTypeForReflection);
                this.f29321a.put(strB, abstractAdapterA);
                return abstractAdapterA;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private void b(AdapterBaseInterface adapterBaseInterface) {
        Boolean bool = this.f29325e;
        if (bool == null || !(adapterBaseInterface instanceof AdapterDebugInterface)) {
            return;
        }
        try {
            ((AdapterDebugInterface) adapterBaseInterface).setAdapterDebug(bool.booleanValue());
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            String str = "error while setting adapterDebug of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e10.getLocalizedMessage();
            a(EnumC0672y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
            c(str);
        }
    }

    private void c(AdapterBaseInterface adapterBaseInterface) {
        if (adapterBaseInterface == null) {
            return;
        }
        for (String str : this.f29326f.keySet()) {
            List<String> list = this.f29326f.get(str);
            if (list != null && (adapterBaseInterface instanceof AdapterMetaDataInterface)) {
                a(new x(adapterBaseInterface, str, list, 1), adapterBaseInterface.getClass().getSimpleName());
            }
        }
    }

    private void b(AbstractAdapter abstractAdapter) {
        Boolean bool = this.f29325e;
        if (bool != null) {
            try {
                abstractAdapter.setAdapterDebug(bool);
            } catch (Throwable th2) {
                C0474n4.d().a(th2);
                String str = "error while setting adapterDebug of " + abstractAdapter.getProviderName() + ": " + th2.getLocalizedMessage();
                a(EnumC0672y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                c(str);
            }
        }
    }

    private void c(AbstractAdapter abstractAdapter) {
        if (abstractAdapter == null) {
            return;
        }
        for (String str : this.f29326f.keySet()) {
            List<String> list = this.f29326f.get(str);
            if (list != null) {
                a(new w(abstractAdapter, str, list, 1), abstractAdapter.getProviderName());
            }
        }
    }

    private String c(NetworkSettings networkSettings, IronSource.a aVar, UUID uuid) {
        StringBuilder sbJ = d5.u.j(uuid != null ? uuid.toString() : "", "-");
        sbJ.append(aVar.toString());
        sbJ.append("-");
        sbJ.append(networkSettings.getProviderName());
        return sbJ.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(AdapterBaseInterface adapterBaseInterface, String str, List list) {
        ((AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
        IronSourceUtils.i(adapterBaseInterface.getClass().getSimpleName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(AbstractAdapter abstractAdapter, String str, List list) {
        abstractAdapter.setMetaData(str, list);
        IronSourceUtils.i(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    private void c(NetworkSettings networkSettings) {
        IronLog.INTERNAL.error(defpackage.e.n("Missing package definition for ", networkSettings.getProviderTypeForReflection()));
    }

    private void b(String str, List<String> list) {
        for (AbstractAdapter abstractAdapter : this.f29321a.values()) {
            a(new w(abstractAdapter, str, list, 0), abstractAdapter.getProviderName());
        }
    }

    private void a(JSONObject jSONObject, AbstractAdapter abstractAdapter, String str) {
        if (str.equalsIgnoreCase("IronSource") && this.f29328h.compareAndSet(false, true)) {
            c(defpackage.e.o("SDK5 earlyInit  <", str, ">"));
            try {
                abstractAdapter.earlyInit(this.f29323c, this.f29324d, jSONObject);
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                String str2 = "error while calling early init for " + abstractAdapter.getProviderName() + ": " + e10.getLocalizedMessage();
                a(EnumC0672y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                IronLog.INTERNAL.error(str2);
            }
        }
    }

    private String b(NetworkSettings networkSettings) {
        if (networkSettings.isMultipleInstances()) {
            return networkSettings.getProviderDefaultInstance();
        }
        return networkSettings.getProviderName();
    }

    private void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "AdapterRepository: " + str, 0);
    }

    public AdapterBaseInterface b(NetworkSettings networkSettings, IronSource.a aVar, UUID uuid) {
        String strC;
        String providerTypeForReflection;
        if (networkSettings.isCustomNetwork()) {
            strC = b(networkSettings);
        } else {
            strC = c(networkSettings, aVar, uuid);
        }
        if (this.f29322b.containsKey(strC)) {
            return this.f29322b.get(strC).getAdapterBaseInterface();
        }
        if (networkSettings.isCustomNetwork()) {
            providerTypeForReflection = networkSettings.getCustomNetworkAdapterName(null);
        } else {
            providerTypeForReflection = networkSettings.getProviderTypeForReflection();
        }
        AdapterBaseInterface adapterBaseInterfaceA = a(strC, providerTypeForReflection, networkSettings);
        return (adapterBaseInterfaceA != null || networkSettings.isCustomNetwork()) ? adapterBaseInterfaceA : a(networkSettings, aVar, strC);
    }

    public ConcurrentHashMap<String, LevelPlayBaseAdapter> c() {
        ConcurrentHashMap<String, LevelPlayBaseAdapter> concurrentHashMap = new ConcurrentHashMap<>();
        for (String str : this.f29322b.keySet()) {
            AdapterBaseWrapper adapterBaseWrapper = this.f29322b.get(str);
            if (adapterBaseWrapper != null && (adapterBaseWrapper.getAdapterBaseInterface() instanceof LevelPlayBaseAdapter)) {
                concurrentHashMap.put(str, (LevelPlayBaseAdapter) adapterBaseWrapper.getAdapterBaseInterface());
            }
        }
        return concurrentHashMap;
    }

    private JSONObject b(NetworkSettings networkSettings, IronSource.a aVar) {
        int i10 = a.f29331a[aVar.ordinal()];
        if (i10 == 1) {
            return networkSettings.getRewardedVideoSettings();
        }
        if (i10 == 2) {
            return networkSettings.getInterstitialSettings();
        }
        if (i10 == 3) {
            return networkSettings.getBannerSettings();
        }
        if (i10 != 4) {
            return null;
        }
        return networkSettings.getNativeAdSettings();
    }

    private AbstractAdapter a(String str, String str2) {
        try {
            Class<?> cls = Class.forName(a(str2));
            return (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, String.class).invoke(cls, str);
        } catch (Exception e10) {
            String str3 = "Error while loading adapter - exception = " + e10.getLocalizedMessage();
            a(EnumC0672y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
            b(str3);
            return null;
        }
    }

    public void b(t tVar) {
        if (a(tVar)) {
            this.f29330j.a(tVar);
            tVar.a(this.f29321a.values(), this.f29322b.values());
            tVar.b();
            if (StringUtils.toLowerCase(tVar.a()).equals(f29318m)) {
                a(tVar.allData());
            }
        }
    }

    private static String a(String str) {
        return "com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter";
    }

    private String a(String str, IronSource.a aVar) {
        StringBuilder sb2 = new StringBuilder("com.ironsource.adapters.");
        sb2.append(StringUtils.toLowerCase(str));
        sb2.append(".");
        sb2.append(StringUtils.toLowerCase(a(aVar)));
        sb2.append(".");
        sb2.append(str);
        return defpackage.e.q(a(aVar), "Adapter", sb2);
    }

    private void b(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "AdapterRepository: " + str, 3);
    }

    private String a(IronSource.a aVar) {
        if (aVar == null) {
            return null;
        }
        int i10 = a.f29331a[aVar.ordinal()];
        if (i10 == 1) {
            return "Rewarded";
        }
        if (i10 == 2) {
            return "Interstitial";
        }
        if (i10 == 3) {
            return "Banner";
        }
        if (i10 != 4) {
            return null;
        }
        return "NativeAd";
    }

    public void a(boolean z10) {
        synchronized (f29320o) {
            try {
                this.f29325e = Boolean.valueOf(z10);
                Iterator<AbstractAdapter> it = this.f29321a.values().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
                Iterator<AdapterBaseWrapper> it2 = this.f29322b.values().iterator();
                while (it2.hasNext()) {
                    b(it2.next().getAdapterBaseInterface());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(boolean z10, String str) {
        for (AdapterBaseWrapper adapterBaseWrapper : this.f29322b.values()) {
            if (adapterBaseWrapper.getSettings().getProviderTypeForReflection().equalsIgnoreCase(str)) {
                a(adapterBaseWrapper.getAdapterBaseInterface(), z10);
            }
        }
    }

    private void a(AdapterBaseInterface adapterBaseInterface, boolean z10) {
        if (adapterBaseInterface instanceof AdapterTestModeInterface) {
            try {
                ((AdapterTestModeInterface) adapterBaseInterface).setTestMode(z10);
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                String str = "error while setting testMode of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e10.getLocalizedMessage();
                a(EnumC0672y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                c(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(AbstractAdapter abstractAdapter, String str, List list) {
        abstractAdapter.setMetaData(str, list);
        IronSourceUtils.i(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    private void a(String str, List<String> list) {
        for (AdapterBaseWrapper adapterBaseWrapper : this.f29322b.values()) {
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
            if (!adapterBaseWrapper.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterMetaDataInterface)) {
                a(new x(adapterBaseInterface, str, list, 0), adapterBaseInterface.getClass().getSimpleName());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(AdapterBaseInterface adapterBaseInterface, String str, List list) {
        ((AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
        IronSourceUtils.i(adapterBaseInterface.getClass().getSimpleName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    private void a(Runnable runnable, String str) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            String str2 = "Error while setting meta-data for adapter " + str + ": " + th2.getLocalizedMessage();
            a(EnumC0672y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
            c(str2);
        }
    }

    private void a(AdapterBaseInterface adapterBaseInterface) {
        if (!(adapterBaseInterface instanceof SetAPSInterface) || this.f29327g.size() == 0) {
            return;
        }
        for (IronSource.a aVar : this.f29327g.keySet()) {
            try {
                JSONObject jSONObject = this.f29327g.get(aVar);
                if (jSONObject != null && jSONObject.length() > 0) {
                    ((SetAPSInterface) adapterBaseInterface).setAPSData(If.a(aVar), jSONObject);
                }
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                String str = "error while setting aps data: " + e10.getLocalizedMessage();
                a(EnumC0672y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
                c(str);
            }
        }
        this.f29327g.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(AbstractAdapter abstractAdapter) {
        if (!StringUtils.toLowerCase(abstractAdapter.getProviderName()).equals(f29318m) || this.f29327g.size() == 0) {
            return;
        }
        for (IronSource.a aVar : this.f29327g.keySet()) {
            try {
                JSONObject jSONObject = this.f29327g.get(aVar);
                if (jSONObject != null && jSONObject.length() > 0 && (abstractAdapter instanceof SetAPSInterface)) {
                    ((SetAPSInterface) abstractAdapter).setAPSData(If.a(aVar), jSONObject);
                }
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                String str = "error while setting aps data: " + e10.getLocalizedMessage();
                a(EnumC0672y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
                c(str);
            }
        }
        this.f29327g.clear();
    }

    @Nullable
    private s a(NetworkSettings networkSettings, IronSource.a aVar, String str) {
        AbstractAdapter abstractAdapterA = a(networkSettings, b(networkSettings, aVar), false);
        if (abstractAdapterA != null) {
            s sVar = new s(abstractAdapterA);
            this.f29322b.put(str, new AdapterBaseWrapper(sVar, networkSettings));
            return sVar;
        }
        String str2 = "error creating network adapter " + networkSettings.getProviderName();
        a(EnumC0672y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
        IronLog.INTERNAL.error(str2);
        return null;
    }

    private void a(String str, AdapterBaseInterface adapterBaseInterface, NetworkSettings networkSettings) {
        if (!networkSettings.isCustomNetwork()) {
            c(adapterBaseInterface);
            a(adapterBaseInterface);
        }
        this.f29329i.a(adapterBaseInterface, networkSettings);
        b(adapterBaseInterface);
        this.f29330j.a(new AdapterBaseWrapper(adapterBaseInterface, networkSettings));
        this.f29322b.put(str, new AdapterBaseWrapper(adapterBaseInterface, networkSettings));
    }

    private AdapterBaseInterface a(String str, String str2, NetworkSettings networkSettings) {
        String strA;
        if (networkSettings.isCustomNetwork() && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            IronLog.INTERNAL.error("missing package definition for " + str);
            return null;
        }
        if (networkSettings.isCustomNetwork()) {
            strA = networkSettings.getCustomNetworkPackage() + "." + str2;
        } else {
            strA = a(str2);
        }
        try {
            BaseAdapter baseAdapter = (BaseAdapter) Class.forName(strA).newInstance();
            IronLog.INTERNAL.info(strA + " was allocated (adapter version: " + baseAdapter.getAdapterVersion() + ", sdk version: " + baseAdapter.getNetworkSDKVersion() + ")");
            a(str, baseAdapter, networkSettings);
            return baseAdapter;
        } catch (Exception unused) {
            if (networkSettings.isCustomNetwork()) {
                String strN = defpackage.e.n("failed to load ", strA);
                IronLog.INTERNAL.error(strN);
                a(EnumC0672y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, strN);
            }
            return null;
        }
    }

    public BaseAdAdapter<?, ?> a(NetworkSettings networkSettings, IronSource.a aVar, UUID uuid) {
        BaseAdAdapter<?, ?> baseAdAdapterA = a(networkSettings, aVar);
        if (baseAdAdapterA != null || networkSettings.isCustomNetwork()) {
            return baseAdAdapterA;
        }
        AbstractAdapter abstractAdapterA = a(networkSettings);
        if (abstractAdapterA != null) {
            return com.ironsource.mediationsdk.a.a(abstractAdapterA, networkSettings, aVar, uuid);
        }
        String str = "error creating ad adapter " + networkSettings.getProviderName();
        a(EnumC0672y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
        IronLog.INTERNAL.error(str);
        return null;
    }

    private BaseAdAdapter<?, ?> a(NetworkSettings networkSettings, IronSource.a aVar) {
        boolean zIsCustomNetwork = networkSettings.isCustomNetwork();
        if (zIsCustomNetwork && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            c(networkSettings);
            return null;
        }
        String strA = a(networkSettings, aVar, zIsCustomNetwork, a(networkSettings, aVar, zIsCustomNetwork));
        try {
            return a(strA, networkSettings);
        } catch (Exception e10) {
            if (zIsCustomNetwork) {
                a(e10, strA);
            }
            return null;
        }
    }

    private String a(NetworkSettings networkSettings, IronSource.a aVar, boolean z10) {
        if (z10) {
            return networkSettings.getCustomNetworkAdapterName(aVar);
        }
        return networkSettings.getProviderTypeForReflection();
    }

    private String a(NetworkSettings networkSettings, IronSource.a aVar, boolean z10, String str) {
        if (z10) {
            return networkSettings.getCustomNetworkPackage() + "." + str;
        }
        return a(str, aVar);
    }

    private BaseAdAdapter<?, ?> a(String str, NetworkSettings networkSettings) throws Exception {
        return (BaseAdAdapter) Class.forName(str).getConstructor(NetworkSettings.class).newInstance(networkSettings);
    }

    private void a(Exception exc, String str) {
        String strN = defpackage.e.n("Failed to load adapter class: ", str);
        IronLog.INTERNAL.error(strN);
        EnumC0672y5 enumC0672y5 = EnumC0672y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        StringBuilder sbJ = d5.u.j(strN, " - ");
        sbJ.append(exc.getMessage());
        a(enumC0672y5, sbJ.toString());
    }

    private void a(EnumC0672y5 enumC0672y5, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("reason", str);
            }
            G9.i().a(new C0654x5(enumC0672y5, jSONObject));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private boolean a(t tVar) {
        if (tVar.allData().length() == 0) {
            a(EnumC0672y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "empty network data");
            b("empty network data");
            return false;
        }
        if (!TextUtils.isEmpty(tVar.a())) {
            return true;
        }
        a(EnumC0672y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "empty network key");
        b("empty network key");
        return false;
    }

    private void a(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
            if (next.equalsIgnoreCase(IronSource.a.BANNER.toString())) {
                a(LevelPlay.AdFormat.BANNER, jSONObjectOptJSONObject);
            } else if (next.equalsIgnoreCase(IronSource.a.INTERSTITIAL.toString())) {
                a(LevelPlay.AdFormat.INTERSTITIAL, jSONObjectOptJSONObject);
            } else if (next.equalsIgnoreCase(IronSource.a.REWARDED_VIDEO.toString())) {
                a(LevelPlay.AdFormat.REWARDED, jSONObjectOptJSONObject);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(LevelPlay.AdFormat adFormat, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                if (!this.f29321a.isEmpty()) {
                    for (AbstractAdapter abstractAdapter : this.f29321a.values()) {
                        if (StringUtils.toLowerCase(abstractAdapter.getProviderName()).equals(f29318m) && (abstractAdapter instanceof SetAPSInterface)) {
                            ((SetAPSInterface) abstractAdapter).setAPSData(adFormat, jSONObject2);
                            return;
                        }
                    }
                }
                for (AdapterBaseWrapper adapterBaseWrapper : this.f29322b.values()) {
                    if (StringUtils.toLowerCase(adapterBaseWrapper.getSettings().getProviderTypeForReflection()).equals(f29318m)) {
                        AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
                        if (adapterBaseInterface != null) {
                            ((AdapterAPSDataInterface) adapterBaseInterface).setAPSData(adFormat, jSONObject2);
                            return;
                        }
                        return;
                    }
                }
                synchronized (f29320o) {
                    this.f29327g.put(If.b(adFormat), jSONObject2);
                }
                return;
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                String str = "error while setting APSData: " + e10.getLocalizedMessage();
                a(EnumC0672y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
                b(str);
                return;
            }
        }
        a(EnumC0672y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "APSData is empty");
        b("APSData is empty");
    }

    public ConcurrentHashMap<String, AbstractAdapter> a() {
        return this.f29321a;
    }

    public static boolean a(String str, AdapterBaseWrapper adapterBaseWrapper) {
        return (adapterBaseWrapper == null || adapterBaseWrapper.getSettings().getProviderNetworkKey() == null || !adapterBaseWrapper.getSettings().getProviderNetworkKey().equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean a(String str, AbstractAdapter abstractAdapter) {
        return (abstractAdapter == null || abstractAdapter.getProviderNetworkKey() == null || !abstractAdapter.getProviderNetworkKey().equalsIgnoreCase(str)) ? false : true;
    }
}
