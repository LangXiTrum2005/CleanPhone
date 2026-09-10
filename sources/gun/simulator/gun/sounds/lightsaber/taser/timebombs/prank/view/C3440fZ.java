package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.os.Bundle;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.internal.network.VungleApiClient;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3440fZ implements InterfaceC5088yE {
    public static final C3175cZ Companion = new C3175cZ(null);
    public static final String TAG = "ResendTpatJob";
    private final Context context;
    private final ZT pathProvider;

    public C3440fZ(Context context, ZT zt) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(zt, "pathProvider");
        this.context = context;
        this.pathProvider = zt;
    }

    /* JADX INFO: renamed from: onRunJob$lambda-0, reason: not valid java name */
    private static final VungleApiClient m237onRunJob$lambda0(InterfaceC3069bH interfaceC3069bH) {
        return (VungleApiClient) interfaceC3069bH.getValue();
    }

    /* JADX INFO: renamed from: onRunJob$lambda-1, reason: not valid java name */
    private static final InterfaceC4615ss m238onRunJob$lambda1(InterfaceC3069bH interfaceC3069bH) {
        return (InterfaceC4615ss) interfaceC3069bH.getValue();
    }

    public final Context getContext() {
        return this.context;
    }

    public final ZT getPathProvider() {
        return this.pathProvider;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5088yE
    public int onRunJob(Bundle bundle, JE je) {
        AbstractC2995aW.q(bundle, "bundle");
        AbstractC2995aW.q(je, "jobRunner");
        ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
        Context context = this.context;
        EnumC4124nH enumC4124nH = EnumC4124nH.f4736a;
        InterfaceC3069bH interfaceC3069bHH = AbstractC2340Cl.H(enumC4124nH, new C3264dZ(context));
        InterfaceC3069bH interfaceC3069bHH2 = AbstractC2340Cl.H(enumC4124nH, new C3352eZ(this.context));
        new C3624hd0(m237onRunJob$lambda0(interfaceC3069bHH), null, ((C4893w20) m238onRunJob$lambda1(interfaceC3069bHH2)).getIoExecutor(), this.pathProvider, null, 18, null).resendStoredTpats$vungle_ads_release(((C4893w20) m238onRunJob$lambda1(interfaceC3069bHH2)).getJobExecutor());
        return 0;
    }
}
