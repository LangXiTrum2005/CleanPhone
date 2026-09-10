package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.LevelPlay;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Dd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V0 f25975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<C0679yc> f25976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC0649x0 f25977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IronSource.a f25978d;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25979a;

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
            f25979a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b extends AbstractRunnableC0430ke {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ NetworkSettings f25981c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AdapterBaseInterface f25982d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ AdData f25983e;

        public b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface, AdData adData) {
            this.f25981c = networkSettings;
            this.f25982d = adapterBaseInterface;
            this.f25983e = adData;
        }

        @Override // com.ironsource.AbstractRunnableC0430ke
        public void a() {
            Dd dd2 = Dd.this;
            NetworkSettings networkSettings = this.f25981c;
            AdapterBaseInterface networkAdapter = this.f25982d;
            kotlin.jvm.internal.n.e(networkAdapter, "networkAdapter");
            dd2.a(networkSettings, networkAdapter, this.f25983e);
        }

        @Override // com.ironsource.AbstractRunnableC0430ke
        public void a(Throwable t10) {
            kotlin.jvm.internal.n.f(t10, "t");
            Dd.this.f25975a.d().h().g("initProvider - exception while calling networkAdapter.init with " + this.f25981c.getProviderName() + " - " + t10);
        }
    }

    public Dd(V0 adUnitTools, LevelPlay.AdFormat adFormat, List<C0679yc> providers, AbstractC0649x0 adUnitData) {
        kotlin.jvm.internal.n.f(adUnitTools, "adUnitTools");
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        kotlin.jvm.internal.n.f(providers, "providers");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        this.f25975a = adUnitTools;
        this.f25976b = providers;
        this.f25977c = adUnitData;
        this.f25978d = a(adFormat);
    }

    public final void a() {
        IronLog.INTERNAL.verbose(C0506p0.a(this.f25975a, (String) null, (String) null, 3, (Object) null));
        UUID uuidRandomUUID = UUID.randomUUID();
        Iterator<C0679yc> it = this.f25976b.iterator();
        while (it.hasNext()) {
            NetworkSettings networkSettingsF = it.next().f();
            AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettingsF, this.f25978d, uuidRandomUUID);
            if (a(networkSettingsF, adapterBaseInterfaceB)) {
                Jf.f26356a.b(new b(networkSettingsF, adapterBaseInterfaceB, this.f25977c.a(networkSettingsF)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface, AdData adData) {
        a("Start initializing provider %s on thread %s", networkSettings);
        adapterBaseInterface.init(adData, ContextProvider.getInstance().getApplicationContext(), null);
        a("Done initializing provider %s on thread %s", networkSettings);
    }

    private final void a(String str, NetworkSettings networkSettings) {
        IronLog.INTERNAL.verbose(C0506p0.a(this.f25975a, String.format(str, Arrays.copyOf(new Object[]{networkSettings.getProviderInstanceName(), Thread.currentThread().getName()}, 2)), (String) null, 2, (Object) null));
    }

    private final boolean a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (adapterBaseInterface == null) {
            return false;
        }
        V0 v4 = this.f25975a;
        IronSource.a aVar = this.f25978d;
        String providerInstanceName = networkSettings.getProviderInstanceName();
        kotlin.jvm.internal.n.e(providerInstanceName, "providerSettings.providerInstanceName");
        if (v4.a(adapterBaseInterface, aVar, providerInstanceName)) {
            return false;
        }
        return networkSettings.shouldEarlyInit(networkSettings.isBidder(this.f25978d));
    }

    private final IronSource.a a(LevelPlay.AdFormat adFormat) {
        int i10 = a.f25979a[adFormat.ordinal()];
        if (i10 == 1) {
            return IronSource.a.REWARDED_VIDEO;
        }
        if (i10 == 2) {
            return IronSource.a.INTERSTITIAL;
        }
        if (i10 == 3) {
            return IronSource.a.BANNER;
        }
        if (i10 == 4) {
            return IronSource.a.NATIVE_AD;
        }
        throw new aa.b((byte) 0, 20);
    }
}
