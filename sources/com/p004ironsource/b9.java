package com.p004ironsource;

import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.mediationsdk.AbstractAdapter;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0005\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u000e\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004J.\u0010\u0005\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\u000bJ\u0018\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012J\"\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u000bR(\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006 "}, d2 = {"Lcom/ironsource/b9;", "", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", "settings", "", "a", "(Lcom/ironsource/mediationsdk/model/NetworkSettings;)Ljava/lang/Boolean;", "", PglCryptUtils.KEY_MESSAGE, "", "consentValue", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/ironsource/mediationsdk/AbstractAdapter;", "adapters", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterBaseWrapper;", "networkAdapters", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterBaseInterface;", ne.E1, "", "cmpId", xs.f27731b, "<set-?>", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", d9.i.f24748b0, "Lcom/ironsource/vf;", "b", "Lcom/ironsource/vf;", "()Lcom/ironsource/vf;", "deviceInfoService", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class b9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Boolean consent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final vf deviceInfoService = on.INSTANCE.d().f();

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getConsent() {
        return this.consent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final vf getDeviceInfoService() {
        return this.deviceInfoService;
    }

    private final Boolean a(NetworkSettings settings) {
        if (settings == null || settings.isCustomNetwork()) {
            return this.consent;
        }
        return settings.getApplicationSettings().has(c9.f24516a) ? Boolean.valueOf(settings.getApplicationSettings().optBoolean(c9.f24516a)) : this.consent;
    }

    public final void a(int cmpId) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_EXT1, cmpId + ';' + this.deviceInfoService.K(ContextProvider.getInstance().getApplicationContext()));
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(ExceptionsKt.b(e2));
        }
        on.INSTANCE.d().z().a(new zb(ac.CONSENT_TCF_CODE, mediationAdditionalData));
    }

    public final void a(int cmpId, ConcurrentHashMap<String, NetworkSettings> providerSettings) {
        JSONObject applicationSettings;
        Intrinsics.f(providerSettings, "providerSettings");
        String strK = this.deviceInfoService.K(ContextProvider.getInstance().getApplicationContext());
        IronLog ironLog = IronLog.API;
        ironLog.general("TCF Additional Consent: " + strK);
        ironLog.general("CMP ID: " + cmpId);
        ironLog.general("Network Consent Reporting:");
        ironLog.general("----------------------------");
        Collection<NetworkSettings> collectionValues = providerSettings.values();
        Intrinsics.e(collectionValues, "providerSettings.values");
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (networkSettings.getProviderDefaultInstance() != null && !Intrinsics.a(networkSettings.getProviderDefaultInstance(), IronSourceConstants.SUPERSONIC_CONFIG_NAME) && (applicationSettings = networkSettings.getApplicationSettings()) != null && applicationSettings.has(c9.f24516a)) {
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
            StringBuilder sb = new StringBuilder();
            sb.append(networkSettings2.getProviderDefaultInstance());
            sb.append(": ");
            JSONObject applicationSettings2 = networkSettings2.getApplicationSettings();
            sb.append(applicationSettings2 != null ? Boolean.valueOf(applicationSettings2.optBoolean(c9.f24516a)) : null);
            ironLog2.general(sb.toString());
        }
    }

    public final void a(AbstractAdapter adapter, NetworkSettings settings) {
        Intrinsics.f(adapter, "adapter");
        try {
            Boolean boolA = a(settings);
            if (boolA != null) {
                adapter.setNewConsent(boolA.booleanValue());
            }
        } catch (Throwable th) {
            StringBuilder sbP = a.p("error while setting consent of ", th);
            sbP.append(adapter.getProviderName());
            sbP.append(": ");
            sbP.append(th.getLocalizedMessage());
            String string = sbP.toString();
            a(string);
            IronLog.INTERNAL.error(string);
        }
    }

    public final void a(AdapterBaseInterface adapter, NetworkSettings settings) {
        Intrinsics.f(adapter, "adapter");
        try {
            Boolean boolA = a(settings);
            if (boolA == null || !(adapter instanceof AdapterConsentInterface)) {
                return;
            }
            ((AdapterConsentInterface) adapter).setConsent(boolA.booleanValue());
        } catch (Throwable th) {
            StringBuilder sbP = a.p("error while setting consent of ", th);
            sbP.append(settings != null ? settings.getProviderName() : null);
            sbP.append(": ");
            sbP.append(th.getLocalizedMessage());
            String string = sbP.toString();
            a(string);
            IronLog.INTERNAL.error(string);
        }
    }

    private final void a(String message) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(message)) {
                jSONObject.put("reason", message);
            }
            wj.i().a(new zb(ac.TROUBLESHOOTING_CONSENT_INTERNAL_ERROR, jSONObject));
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public final void a(ConcurrentHashMap<String, AbstractAdapter> adapters, ConcurrentHashMap<String, AdapterBaseWrapper> networkAdapters) {
        Unit unit;
        Intrinsics.f(adapters, "adapters");
        Intrinsics.f(networkAdapters, "networkAdapters");
        for (AbstractAdapter adapter : adapters.values()) {
            Intrinsics.e(adapter, "adapter");
            a(adapter, (NetworkSettings) null);
        }
        for (AdapterBaseWrapper adapterBaseWrapper : networkAdapters.values()) {
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
            if (adapterBaseInterface != null) {
                a(adapterBaseInterface, adapterBaseWrapper.getSettings());
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                IronLog.INTERNAL.error("adapter is null");
            }
        }
    }

    public final void a(boolean consentValue) {
        this.consent = Boolean.valueOf(consentValue);
    }
}
