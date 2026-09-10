package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.vungle.ads.internal.network.VungleApiClient;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.aX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2996aX {
    public static final ZW Companion = new ZW(null);
    public static final String RTA_DEBUG_ENDPOINT = "https://events.ads.vungle.com/rtadebugging";
    private final VungleApiClient apiClient;

    public C2996aX(VungleApiClient vungleApiClient) {
        AbstractC2995aW.q(vungleApiClient, "apiClient");
        this.apiClient = vungleApiClient;
    }

    public final void reportAdMarkup(String str) {
        AbstractC2995aW.q(str, "adm");
        this.apiClient.sendAdMarkup(str, RTA_DEBUG_ENDPOINT);
    }
}
