package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.vungle.ads.internal.network.VungleApiClient;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4407qa extends WG implements InterfaceC2714Qw {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4407qa(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final VungleApiClient invoke() {
        return C3756j50.Companion.getInstance(this.$context).getService(VungleApiClient.class);
    }
}
