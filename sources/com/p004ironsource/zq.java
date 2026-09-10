package com.p004ironsource;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.p004ironsource.mediationsdk.c;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.LevelPlay;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010 J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0006\u0010\t\u001a\u00020\bR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/ironsource/zq;", "", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", xs.f27731b, "Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterBaseInterface;", "networkAdapter", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;", "adData", "", "a", "", PglCryptUtils.KEY_MESSAGE, "", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "adFormat", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "Lcom/ironsource/u2;", "Lcom/ironsource/u2;", "adUnitTools", "", "Lcom/ironsource/bp;", "b", "Ljava/util/List;", "providers", "Lcom/ironsource/u1;", "c", "Lcom/ironsource/u1;", "adUnitData", "d", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "legacyAdUnit", "<init>", "(Lcom/ironsource/u2;Lcom/unity3d/mediation/LevelPlay$AdFormat;Ljava/util/List;Lcom/ironsource/u1;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class zq {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u2 adUnitTools;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<bp> providers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u1 adUnitData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final IronSource.AD_UNIT legacyAdUnit;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27946a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f27946a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"com/ironsource/zq$b", "Lcom/ironsource/ks;", "", "a", "", "t", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends ks {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ NetworkSettings f27948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdapterBaseInterface f27949c;
        final /* synthetic */ AdData d;

        public b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface, AdData adData) {
            this.f27948b = networkSettings;
            this.f27949c = adapterBaseInterface;
            this.d = adData;
        }

        @Override // com.p004ironsource.ks
        public void a() {
            zq zqVar = zq.this;
            NetworkSettings networkSettings = this.f27948b;
            AdapterBaseInterface networkAdapter = this.f27949c;
            Intrinsics.e(networkAdapter, "networkAdapter");
            zqVar.a(networkSettings, networkAdapter, this.d);
        }

        @Override // com.p004ironsource.ks
        public void a(Throwable t) {
            Intrinsics.f(t, "t");
            zq.this.adUnitTools.getEventSender().getTroubleshoot().g("initProvider - exception while calling networkAdapter.init with " + this.f27948b.getProviderName() + " - " + t);
        }
    }

    public zq(u2 adUnitTools, LevelPlay.AdFormat adFormat, List<bp> providers, u1 adUnitData) {
        Intrinsics.f(adUnitTools, "adUnitTools");
        Intrinsics.f(adFormat, "adFormat");
        Intrinsics.f(providers, "providers");
        Intrinsics.f(adUnitData, "adUnitData");
        this.adUnitTools = adUnitTools;
        this.providers = providers;
        this.adUnitData = adUnitData;
        this.legacyAdUnit = a(adFormat);
    }

    public final void a() {
        IronLog.INTERNAL.verbose(m1.a(this.adUnitTools, (String) null, (String) null, 3, (Object) null));
        UUID uuidRandomUUID = UUID.randomUUID();
        Iterator<bp> it = this.providers.iterator();
        while (it.hasNext()) {
            NetworkSettings networkSettingsF = it.next().f();
            AdapterBaseInterface adapterBaseInterfaceB = c.b().b(networkSettingsF, this.legacyAdUnit, uuidRandomUUID);
            if (a(networkSettingsF, adapterBaseInterfaceB)) {
                bv.a(bv.f24465a, new b(networkSettingsF, adapterBaseInterfaceB, this.adUnitData.a(networkSettingsF)), 0L, 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(NetworkSettings providerSettings, AdapterBaseInterface networkAdapter, AdData adData) {
        a("Start initializing provider %s on thread %s", providerSettings);
        networkAdapter.init(adData, ContextProvider.getInstance().getApplicationContext(), null);
        a("Done initializing provider %s on thread %s", providerSettings);
    }

    private final void a(String message, NetworkSettings providerSettings) {
        IronLog.INTERNAL.verbose(m1.a(this.adUnitTools, String.format(message, Arrays.copyOf(new Object[]{providerSettings.getProviderInstanceName(), Thread.currentThread().getName()}, 2)), (String) null, 2, (Object) null));
    }

    private final boolean a(NetworkSettings providerSettings, AdapterBaseInterface networkAdapter) {
        if (networkAdapter == null) {
            return false;
        }
        u2 u2Var = this.adUnitTools;
        IronSource.AD_UNIT ad_unit = this.legacyAdUnit;
        String providerInstanceName = providerSettings.getProviderInstanceName();
        Intrinsics.e(providerInstanceName, "providerSettings.providerInstanceName");
        return !u2Var.a(networkAdapter, ad_unit, providerInstanceName) && (providerSettings.shouldEarlyInit() || providerSettings.isIronSource() || providerSettings.isBidder(this.legacyAdUnit));
    }

    private final IronSource.AD_UNIT a(LevelPlay.AdFormat adFormat) {
        int i2 = a.f27946a[adFormat.ordinal()];
        if (i2 == 1) {
            return IronSource.AD_UNIT.REWARDED_VIDEO;
        }
        if (i2 == 2) {
            return IronSource.AD_UNIT.INTERSTITIAL;
        }
        if (i2 == 3) {
            return IronSource.AD_UNIT.BANNER;
        }
        if (i2 == 4) {
            return IronSource.AD_UNIT.NATIVE_AD;
        }
        throw new NoWhenBranchMatchedException();
    }
}
