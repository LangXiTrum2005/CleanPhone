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
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.qd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3711qd {
    private final V0 a;
    private final List<C3760tc> b;
    private final AbstractC3816x0 c;
    private final IronSource.a d;

    /* JADX INFO: renamed from: com.ironsource.qd$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

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
            a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.qd$b */
    public static final class b extends Xd {
        final /* synthetic */ NetworkSettings c;
        final /* synthetic */ AdapterBaseInterface d;
        final /* synthetic */ AdData e;

        public b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface, AdData adData) {
            this.c = networkSettings;
            this.d = adapterBaseInterface;
            this.e = adData;
        }

        @Override // com.ironsource.Xd
        public void a() {
            C3711qd c3711qd = C3711qd.this;
            NetworkSettings networkSettings = this.c;
            AdapterBaseInterface networkAdapter = this.d;
            Intrinsics.checkNotNullExpressionValue(networkAdapter, "networkAdapter");
            c3711qd.a(networkSettings, networkAdapter, this.e);
        }

        @Override // com.ironsource.Xd
        public void a(Throwable t) {
            Intrinsics.checkNotNullParameter(t, "t");
            C3711qd.this.a.e().h().g("initProvider - exception while calling networkAdapter.init with " + this.c.getProviderName() + " - " + t);
        }
    }

    public C3711qd(V0 adUnitTools, LevelPlay.AdFormat adFormat, List<C3760tc> providers, AbstractC3816x0 adUnitData) {
        Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.a = adUnitTools;
        this.b = providers;
        this.c = adUnitData;
        this.d = a(adFormat);
    }

    public final void a() {
        IronLog.INTERNAL.verbose(C3681p0.a(this.a, (String) null, (String) null, 3, (Object) null));
        UUID uuidRandomUUID = UUID.randomUUID();
        Iterator<C3760tc> it = this.b.iterator();
        while (it.hasNext()) {
            NetworkSettings networkSettingsF = it.next().f();
            AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettingsF, this.d, uuidRandomUUID);
            if (a(networkSettingsF, adapterBaseInterfaceB)) {
                C3763tf.a(C3763tf.a, new b(networkSettingsF, adapterBaseInterfaceB, this.c.a(networkSettingsF)), 0L, 2, null);
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
        IronLog ironLog = IronLog.INTERNAL;
        V0 v0 = this.a;
        p002kotlin.jvm.internal.gintrap gintrapVar = p002kotlin.jvm.internal.gintrap.f29390attabal;
        String str2 = String.format(str, Arrays.copyOf(new Object[]{networkSettings.getProviderInstanceName(), Thread.currentThread().getName()}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        ironLog.verbose(C3681p0.a(v0, str2, (String) null, 2, (Object) null));
    }

    private final boolean a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (adapterBaseInterface == null) {
            return false;
        }
        V0 v0 = this.a;
        IronSource.a aVar = this.d;
        String providerInstanceName = networkSettings.getProviderInstanceName();
        Intrinsics.checkNotNullExpressionValue(providerInstanceName, "providerSettings.providerInstanceName");
        if (v0.a(adapterBaseInterface, aVar, providerInstanceName)) {
            return false;
        }
        return networkSettings.shouldEarlyInit(networkSettings.isBidder(this.d));
    }

    private final IronSource.a a(LevelPlay.AdFormat adFormat) {
        int i = a.a[adFormat.ordinal()];
        if (i == 1) {
            return IronSource.a.REWARDED_VIDEO;
        }
        if (i == 2) {
            return IronSource.a.INTERSTITIAL;
        }
        if (i == 3) {
            return IronSource.a.BANNER;
        }
        if (i == 4) {
            return IronSource.a.NATIVE_AD;
        }
        throw new NoWhenBranchMatchedException();
    }
}
