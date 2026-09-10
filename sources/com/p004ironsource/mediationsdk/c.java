package com.p004ironsource.mediationsdk;

import android.text.TextUtils;
import com.applovin.impl.Z;
import com.p004ironsource.ac;
import com.p004ironsource.b9;
import com.p004ironsource.environment.StringUtils;
import com.p004ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceLogger;
import com.p004ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.p004ironsource.no;
import com.p004ironsource.q9;
import com.p004ironsource.wj;
import com.p004ironsource.zb;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.thinkup.core.common.n.mo;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class c {
    private static final String k = "IronSource";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f25757l = "com.ironsource.adapters";
    private static final String m = "aps";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final c f25758n = new c();
    private static final Object o = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f25761c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f25762e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f25763h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b9 f25764i = new b9();
    private final no j = new no();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, AbstractAdapter> f25759a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, AdapterBaseWrapper> f25760b = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, List<String>> f = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<IronSource.AD_UNIT, JSONObject> g = new ConcurrentHashMap<>();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25765a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            f25765a = iArr;
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25765a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25765a[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25765a[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public AbstractAdapter a(NetworkSettings networkSettings) {
        return a(b(networkSettings), networkSettings.getProviderTypeForReflection());
    }

    public AdapterBaseInterface b(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, UUID uuid) {
        String strB = networkSettings.isCustomNetwork() ? b(networkSettings) : c(networkSettings, ad_unit, uuid);
        if (this.f25760b.containsKey(strB)) {
            return this.f25760b.get(strB).getAdapterBaseInterface();
        }
        AdapterBaseInterface adapterBaseInterfaceA = a(strB, networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkAdapterName(null) : networkSettings.getProviderTypeForReflection(), networkSettings);
        return (adapterBaseInterfaceA != null || networkSettings.isCustomNetwork()) ? adapterBaseInterfaceA : a(networkSettings, ad_unit, strB);
    }

    public static c b() {
        return f25758n;
    }

    private String c(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, UUID uuid) {
        StringBuilder sbX = android.support.v4.media.a.x(uuid != null ? uuid.toString() : "", TokenBuilder.TOKEN_DELIMITER);
        sbX.append(ad_unit.toString());
        sbX.append(TokenBuilder.TOKEN_DELIMITER);
        sbX.append(networkSettings.getProviderName());
        return sbX.toString();
    }

    public AbstractAdapter a(NetworkSettings networkSettings, JSONObject jSONObject, boolean z2) {
        String coreSDKVersion;
        String strB = b(networkSettings);
        String providerTypeForReflection = z2 ? "IronSource" : networkSettings.getProviderTypeForReflection();
        synchronized (o) {
            try {
                if (this.f25759a.containsKey(strB)) {
                    return this.f25759a.get(strB);
                }
                AbstractAdapter abstractAdapterA = a(strB, providerTypeForReflection);
                if (abstractAdapterA == null) {
                    b(strB + " adapter was not loaded");
                    return null;
                }
                abstractAdapterA.setProviderNetworkKey(networkSettings.getProviderNetworkKey());
                try {
                    coreSDKVersion = abstractAdapterA.getCoreSDKVersion();
                } catch (Throwable th) {
                    q9.d().a(th);
                    String str = "error while retrieving coreSDKVersion " + abstractAdapterA.getProviderName() + ": " + th.getLocalizedMessage();
                    a(ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                    IronLog.INTERNAL.error(str);
                    coreSDKVersion = "Unknown";
                }
                c(strB + " was allocated (adapter version: " + abstractAdapterA.getVersion() + ", sdk version: " + coreSDKVersion + ")");
                c(abstractAdapterA);
                this.j.a(abstractAdapterA);
                a(abstractAdapterA);
                this.f25764i.a(abstractAdapterA, networkSettings);
                b(abstractAdapterA);
                a(jSONObject, abstractAdapterA, providerTypeForReflection);
                this.f25759a.put(strB, abstractAdapterA);
                return abstractAdapterA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ConcurrentHashMap<String, List<String>> d() {
        return this.f;
    }

    public ConcurrentHashMap<String, AdapterBaseWrapper> e() {
        return this.f25760b;
    }

    public void f() {
        this.f25759a.clear();
        this.f25760b.clear();
    }

    private AbstractAdapter a(String str, String str2) {
        try {
            Class<?> cls = Class.forName(a(str2));
            return (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, String.class).invoke(cls, str);
        } catch (Exception e2) {
            String str3 = "Error while loading adapter - exception = " + e2.getLocalizedMessage();
            a(ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
            b(str3);
            return null;
        }
    }

    private String b(NetworkSettings networkSettings) {
        return networkSettings.isMultipleInstances() ? networkSettings.getProviderDefaultInstance() : networkSettings.getProviderName();
    }

    private AdapterBaseInterface a(String str, String str2, NetworkSettings networkSettings) {
        String strA;
        if (networkSettings.isCustomNetwork() && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            IronLog.INTERNAL.error("missing package definition for " + str);
            return null;
        }
        if (networkSettings.isCustomNetwork()) {
            strA = networkSettings.getCustomNetworkPackage() + mo.ono + str2;
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
                String strC = android.support.v4.media.a.C("failed to load ", strA);
                IronLog.INTERNAL.error(strC);
                a(ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, strC);
            }
            return null;
        }
    }

    private JSONObject b(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        int i2 = a.f25765a[ad_unit.ordinal()];
        if (i2 == 1) {
            return networkSettings.getRewardedVideoSettings();
        }
        if (i2 == 2) {
            return networkSettings.getInterstitialSettings();
        }
        if (i2 == 3) {
            return networkSettings.getBannerSettings();
        }
        if (i2 != 4) {
            return null;
        }
        return networkSettings.getNativeAdSettings();
    }

    private void b(AbstractAdapter abstractAdapter) {
        Boolean bool = this.f25762e;
        if (bool != null) {
            try {
                abstractAdapter.setAdapterDebug(bool);
            } catch (Throwable th) {
                StringBuilder sbP = com.google.firebase.crashlytics.internal.model.a.p("error while setting adapterDebug of ", th);
                sbP.append(abstractAdapter.getProviderName());
                sbP.append(": ");
                sbP.append(th.getLocalizedMessage());
                String string = sbP.toString();
                a(ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, string);
                c(string);
            }
        }
    }

    public ConcurrentHashMap<String, LevelPlayBaseAdapter> c() {
        ConcurrentHashMap<String, LevelPlayBaseAdapter> concurrentHashMap = new ConcurrentHashMap<>();
        for (String str : this.f25760b.keySet()) {
            AdapterBaseWrapper adapterBaseWrapper = this.f25760b.get(str);
            if (adapterBaseWrapper != null && (adapterBaseWrapper.getAdapterBaseInterface() instanceof LevelPlayBaseAdapter)) {
                concurrentHashMap.put(str, (LevelPlayBaseAdapter) adapterBaseWrapper.getAdapterBaseInterface());
            }
        }
        return concurrentHashMap;
    }

    private void c(AbstractAdapter abstractAdapter) {
        if (abstractAdapter == null) {
            return;
        }
        for (String str : this.f.keySet()) {
            List<String> list = this.f.get(str);
            if (list != null) {
                a(new A(abstractAdapter, str, list, 1), abstractAdapter.getProviderName());
            }
        }
    }

    private BaseAdAdapter<?, ?> a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        boolean zIsCustomNetwork = networkSettings.isCustomNetwork();
        if (zIsCustomNetwork && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            c(networkSettings);
            return null;
        }
        String strA = a(networkSettings, ad_unit, zIsCustomNetwork, a(networkSettings, ad_unit, zIsCustomNetwork));
        try {
            return a(strA, networkSettings);
        } catch (Exception e2) {
            if (zIsCustomNetwork) {
                a(e2, strA);
            }
            return null;
        }
    }

    private void c(AdapterBaseInterface adapterBaseInterface) {
        if (adapterBaseInterface == null) {
            return;
        }
        for (String str : this.f.keySet()) {
            List<String> list = this.f.get(str);
            if (list != null && (adapterBaseInterface instanceof AdapterMetaDataInterface)) {
                a(new B(adapterBaseInterface, str, list, 1), adapterBaseInterface.getClass().getSimpleName());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(AbstractAdapter abstractAdapter, String str, List list) {
        abstractAdapter.setMetaData(str, list);
        IronSourceUtils.sendAutomationLog(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    private void c(NetworkSettings networkSettings) {
        IronLog.INTERNAL.error(android.support.v4.media.a.C("Missing package definition for ", networkSettings.getProviderTypeForReflection()));
    }

    public BaseAdAdapter<?, ?> a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, UUID uuid) {
        BaseAdAdapter<?, ?> baseAdAdapterA = a(networkSettings, ad_unit);
        if (baseAdAdapterA != null || networkSettings.isCustomNetwork()) {
            return baseAdAdapterA;
        }
        AbstractAdapter abstractAdapterA = a(networkSettings);
        if (abstractAdapterA != null) {
            return AbstractC3370a.a(abstractAdapterA, networkSettings, ad_unit, uuid);
        }
        String str = "error creating ad adapter " + networkSettings.getProviderName();
        a(ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
        IronLog.INTERNAL.error(str);
        return null;
    }

    private BaseAdAdapter<?, ?> a(String str, NetworkSettings networkSettings) throws Exception {
        return (BaseAdAdapter) Class.forName(str).getConstructor(NetworkSettings.class).newInstance(networkSettings);
    }

    private void b(AdapterBaseInterface adapterBaseInterface) {
        Boolean bool = this.f25762e;
        if (bool == null || !(adapterBaseInterface instanceof AdapterDebugInterface)) {
            return;
        }
        try {
            ((AdapterDebugInterface) adapterBaseInterface).setAdapterDebug(bool.booleanValue());
        } catch (Exception e2) {
            StringBuilder sbO = com.google.firebase.crashlytics.internal.model.a.o(e2, "error while setting adapterDebug of ");
            sbO.append(adapterBaseInterface.getClass().getSimpleName());
            sbO.append(": ");
            sbO.append(e2.getLocalizedMessage());
            String string = sbO.toString();
            a(ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, string);
            c(string);
        }
    }

    private u a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, String str) {
        AbstractAdapter abstractAdapterA = a(networkSettings, b(networkSettings, ad_unit), false);
        if (abstractAdapterA != null) {
            u uVar = new u(abstractAdapterA);
            this.f25760b.put(str, new AdapterBaseWrapper(uVar, networkSettings));
            return uVar;
        }
        String str2 = "error creating network adapter " + networkSettings.getProviderName();
        a(ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
        IronLog.INTERNAL.error(str2);
        return null;
    }

    private String a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == null) {
            return null;
        }
        int i2 = a.f25765a[ad_unit.ordinal()];
        if (i2 == 1) {
            return "Rewarded";
        }
        if (i2 == 2) {
            return "Interstitial";
        }
        if (i2 == 3) {
            return "Banner";
        }
        if (i2 != 4) {
            return null;
        }
        return "NativeAd";
    }

    private String a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, boolean z2) {
        return z2 ? networkSettings.getCustomNetworkAdapterName(ad_unit) : networkSettings.getProviderTypeForReflection();
    }

    private String a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, boolean z2, String str) {
        if (!z2) {
            return a(str, ad_unit);
        }
        return networkSettings.getCustomNetworkPackage() + mo.ono + str;
    }

    private static String a(String str) {
        return "com.ironsource.adapters." + StringUtils.toLowerCase(str) + mo.ono + str + "Adapter";
    }

    private void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "AdapterRepository: " + str, 0);
    }

    private String a(String str, IronSource.AD_UNIT ad_unit) {
        StringBuilder sb = new StringBuilder("com.ironsource.adapters.");
        sb.append(StringUtils.toLowerCase(str));
        sb.append(mo.ono);
        sb.append(str);
        return android.support.v4.media.a.r(sb, a(ad_unit), "Adapter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(AdapterBaseInterface adapterBaseInterface, String str, List list) {
        ((AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
        IronSourceUtils.sendAutomationLog(adapterBaseInterface.getClass().getSimpleName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    public void c(String str, List<String> list) {
        synchronized (o) {
            try {
                this.f.put(str, list);
                if (!this.f25759a.isEmpty()) {
                    IronSourceUtils.sendAutomationLog("setMetaData key = " + str + ", values = " + list);
                    b(str, list);
                }
                a(str, list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(v vVar) {
        if (a(vVar)) {
            this.j.a(vVar);
            vVar.a(this.f25759a.values(), this.f25760b.values());
            vVar.b();
            if (StringUtils.toLowerCase(vVar.getNetworkName()).equals(m)) {
                a(vVar.getNetworkData());
            }
        }
    }

    private void b(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "AdapterRepository: " + str, 3);
    }

    public void b(String str, String str2) {
        this.f25761c = str;
        this.d = str2;
    }

    private void b(String str, List<String> list) {
        for (AbstractAdapter abstractAdapter : this.f25759a.values()) {
            a(new A(abstractAdapter, str, list, 0), abstractAdapter.getProviderName());
        }
    }

    public ConcurrentHashMap<String, AbstractAdapter> a() {
        return this.f25759a;
    }

    private void a(ac acVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("reason", str);
            }
            wj.i().a(new zb(acVar, jSONObject));
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public void b(boolean z2) {
        synchronized (o) {
            this.f25764i.a(z2);
            this.f25764i.a(this.f25759a, this.f25760b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(AbstractAdapter abstractAdapter) {
        if (!StringUtils.toLowerCase(abstractAdapter.getProviderName()).equals(m) || this.g.size() == 0) {
            return;
        }
        for (IronSource.AD_UNIT ad_unit : this.g.keySet()) {
            try {
                JSONObject jSONObject = this.g.get(ad_unit);
                if (jSONObject != null && jSONObject.length() > 0 && (abstractAdapter instanceof SetAPSInterface)) {
                    ((SetAPSInterface) abstractAdapter).setAPSData(ad_unit, jSONObject);
                }
            } catch (Exception e2) {
                StringBuilder sbO = com.google.firebase.crashlytics.internal.model.a.o(e2, "error while setting aps data: ");
                sbO.append(e2.getLocalizedMessage());
                String string = sbO.toString();
                a(ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, string);
                c(string);
            }
        }
        this.g.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(AbstractAdapter abstractAdapter, String str, List list) {
        abstractAdapter.setMetaData(str, list);
        IronSourceUtils.sendAutomationLog(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            a(ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "APSData is empty");
            b("APSData is empty");
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
            if (!this.f25759a.isEmpty()) {
                for (AbstractAdapter abstractAdapter : this.f25759a.values()) {
                    if (StringUtils.toLowerCase(abstractAdapter.getProviderName()).equals(m) && (abstractAdapter instanceof SetAPSInterface)) {
                        ((SetAPSInterface) abstractAdapter).setAPSData(ad_unit, jSONObject2);
                        return;
                    }
                }
            }
            for (AdapterBaseWrapper adapterBaseWrapper : this.f25760b.values()) {
                if (StringUtils.toLowerCase(adapterBaseWrapper.getSettings().getProviderTypeForReflection()).equals(m)) {
                    AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
                    if (adapterBaseInterface != null) {
                        ((AdapterAPSDataInterface) adapterBaseInterface).setAPSData(ad_unit, jSONObject2);
                        return;
                    }
                    return;
                }
            }
            synchronized (o) {
                this.g.put(ad_unit, jSONObject2);
            }
        } catch (Exception e2) {
            StringBuilder sbO = com.google.firebase.crashlytics.internal.model.a.o(e2, "error while setting APSData: ");
            sbO.append(e2.getLocalizedMessage());
            String string = sbO.toString();
            a(ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, string);
            b(string);
        }
    }

    private void a(AdapterBaseInterface adapterBaseInterface) {
        if (!(adapterBaseInterface instanceof SetAPSInterface) || this.g.size() == 0) {
            return;
        }
        for (IronSource.AD_UNIT ad_unit : this.g.keySet()) {
            try {
                JSONObject jSONObject = this.g.get(ad_unit);
                if (jSONObject != null && jSONObject.length() > 0) {
                    ((SetAPSInterface) adapterBaseInterface).setAPSData(ad_unit, jSONObject);
                }
            } catch (Exception e2) {
                StringBuilder sbO = com.google.firebase.crashlytics.internal.model.a.o(e2, "error while setting aps data: ");
                sbO.append(e2.getLocalizedMessage());
                String string = sbO.toString();
                a(ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, string);
                c(string);
            }
        }
        this.g.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(AdapterBaseInterface adapterBaseInterface, String str, List list) {
        ((AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
        IronSourceUtils.sendAutomationLog(adapterBaseInterface.getClass().getSimpleName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    private void a(Exception exc, String str) {
        String strC = android.support.v4.media.a.C("Failed to load adapter class: ", str);
        IronLog.INTERNAL.error(strC);
        a(ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, Z.m(exc, android.support.v4.media.a.x(strC, " - ")));
    }

    private void a(Runnable runnable, String str) {
        try {
            runnable.run();
        } catch (Throwable th) {
            q9.d().a(th);
            String str2 = "Error while setting meta-data for adapter " + str + ": " + th.getLocalizedMessage();
            a(ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
            c(str2);
        }
    }

    private void a(String str, AdapterBaseInterface adapterBaseInterface, NetworkSettings networkSettings) {
        if (!networkSettings.isCustomNetwork()) {
            c(adapterBaseInterface);
            a(adapterBaseInterface);
        }
        this.f25764i.a(adapterBaseInterface, networkSettings);
        b(adapterBaseInterface);
        this.j.a(new AdapterBaseWrapper(adapterBaseInterface, networkSettings));
        this.f25760b.put(str, new AdapterBaseWrapper(adapterBaseInterface, networkSettings));
    }

    private void a(String str, List<String> list) {
        for (AdapterBaseWrapper adapterBaseWrapper : this.f25760b.values()) {
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
            if (!adapterBaseWrapper.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterMetaDataInterface)) {
                a(new B(adapterBaseInterface, str, list, 0), adapterBaseInterface.getClass().getSimpleName());
            }
        }
    }

    private void a(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
            if (!next.equalsIgnoreCase(ad_unit.toString())) {
                ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
                if (!next.equalsIgnoreCase(ad_unit.toString())) {
                    ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
                    if (next.equalsIgnoreCase(ad_unit.toString())) {
                    }
                }
            }
            a(ad_unit, jSONObjectOptJSONObject);
        }
    }

    private void a(JSONObject jSONObject, AbstractAdapter abstractAdapter, String str) {
        if (str.equalsIgnoreCase("IronSource") && this.f25763h.compareAndSet(false, true)) {
            c(android.support.v4.media.a.n("SDK5 earlyInit  <", str, ">"));
            try {
                abstractAdapter.earlyInit(this.f25761c, this.d, jSONObject);
            } catch (Exception e2) {
                StringBuilder sbO = com.google.firebase.crashlytics.internal.model.a.o(e2, "error while calling early init for ");
                sbO.append(abstractAdapter.getProviderName());
                sbO.append(": ");
                sbO.append(e2.getLocalizedMessage());
                String string = sbO.toString();
                a(ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, string);
                IronLog.INTERNAL.error(string);
            }
        }
    }

    public void a(boolean z2) {
        synchronized (o) {
            try {
                this.f25762e = Boolean.valueOf(z2);
                Iterator<AbstractAdapter> it = this.f25759a.values().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
                Iterator<AdapterBaseWrapper> it2 = this.f25760b.values().iterator();
                while (it2.hasNext()) {
                    b(it2.next().getAdapterBaseInterface());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean a(v vVar) {
        ac acVar;
        String str;
        if (vVar.getNetworkData().length() == 0) {
            acVar = ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR;
            str = "empty network data";
        } else {
            if (!TextUtils.isEmpty(vVar.getNetworkName())) {
                return true;
            }
            acVar = ac.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR;
            str = "empty network key";
        }
        a(acVar, str);
        b(str);
        return false;
    }

    public static boolean a(String str, AbstractAdapter abstractAdapter) {
        return (abstractAdapter == null || abstractAdapter.getProviderNetworkKey() == null || !abstractAdapter.getProviderNetworkKey().equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean a(String str, AdapterBaseWrapper adapterBaseWrapper) {
        return (adapterBaseWrapper == null || adapterBaseWrapper.getSettings().getProviderNetworkKey() == null || !adapterBaseWrapper.getSettings().getProviderNetworkKey().equalsIgnoreCase(str)) ? false : true;
    }
}
