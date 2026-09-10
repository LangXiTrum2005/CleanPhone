package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.internal.network.VungleApiClient;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class PX extends AbstractC3325e9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PX(Context context, VungleApiClient vungleApiClient, InterfaceC4615ss interfaceC4615ss, C3080bS c3080bS, InterfaceC2526Jp interfaceC2526Jp, ZT zt, F2 f2) {
        super(context, vungleApiClient, interfaceC4615ss, c3080bS, interfaceC2526Jp, zt, f2);
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(vungleApiClient, "vungleApiClient");
        AbstractC2995aW.q(interfaceC4615ss, "sdkExecutors");
        AbstractC2995aW.q(c3080bS, "omInjector");
        AbstractC2995aW.q(interfaceC2526Jp, "downloader");
        AbstractC2995aW.q(zt, "pathProvider");
        AbstractC2995aW.q(f2, "adRequest");
    }

    /* JADX INFO: renamed from: requestAd$lambda-0, reason: not valid java name */
    private static final VungleApiClient m188requestAd$lambda0(InterfaceC3069bH interfaceC3069bH) {
        return (VungleApiClient) interfaceC3069bH.getValue();
    }

    private final void sendWinNotification(List<String> list) {
        if (list == null || !list.isEmpty()) {
            ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
            C3624hd0 c3624hd0 = new C3624hd0(getVungleApiClient(), getLogEntry$vungle_ads_release(), ((C4893w20) getSdkExecutors()).getIoExecutor(), getPathProvider(), m189sendWinNotification$lambda2(AbstractC2340Cl.H(EnumC4124nH.f4736a, new OX(getContext()))));
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    c3624hd0.sendWinNotification((String) it.next(), ((C4893w20) getSdkExecutors()).getJobExecutor());
                }
            }
        }
    }

    /* JADX INFO: renamed from: sendWinNotification$lambda-2, reason: not valid java name */
    private static final L60 m189sendWinNotification$lambda2(InterfaceC3069bH interfaceC3069bH) {
        return (L60) interfaceC3069bH.getValue();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3325e9
    public void onAdLoadReady() {
        C4980x2 advertisement$vungle_ads_release = getAdvertisement$vungle_ads_release();
        sendWinNotification(advertisement$vungle_ads_release != null ? advertisement$vungle_ads_release.getWinNotifications() : null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3325e9
    public void requestAd() {
        C3967la adMarkup = getAdRequest().getAdMarkup();
        if (adMarkup == null) {
            onAdLoadFailed(new C3154cE().setLogEntry$vungle_ads_release(getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
            return;
        }
        if (C3457fi.INSTANCE.rtaDebuggingEnabled()) {
            try {
                String decodedAdsResponse = adMarkup.getDecodedAdsResponse();
                C4917wJ.Companion.d("RTA_DEBUGGER", String.valueOf(decodedAdsResponse));
                ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
                InterfaceC3069bH interfaceC3069bHH = AbstractC2340Cl.H(EnumC4124nH.f4736a, new NX(getContext()));
                if (decodedAdsResponse != null) {
                    new C2996aX(m188requestAd$lambda0(interfaceC3069bHH)).reportAdMarkup(decodedAdsResponse);
                }
            } catch (Throwable unused) {
            }
        }
        C4980x2 adPayload = adMarkup.getAdPayload();
        Integer version = adMarkup.getVersion();
        if (version == null || version.intValue() != 2 || adPayload == null) {
            onAdLoadFailed(new S1("The ad response did not contain valid ad markup").setLogEntry$vungle_ads_release(getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
        } else {
            handleAdMetaData$vungle_ads_release(adPayload, new C3586h70(B30.CONFIG_LOADED_FROM_ADM_LOAD));
        }
    }
}
