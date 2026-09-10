package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3602hL implements InterfaceC5017xV {
    final /* synthetic */ String $deeplinkUrl;
    final /* synthetic */ C4304pL this$0;

    public C3602hL(String str, C4304pL c4304pL) {
        this.$deeplinkUrl = str;
        this.this$0 = c4304pL;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5017xV
    public void onDeeplinkClick(boolean z) {
        if (!z) {
            new C4916wI(EnumC4719u30.DEEPLINK_OPEN_FAILED, "Fail to open " + this.$deeplinkUrl).setLogEntry$vungle_ads_release(this.this$0.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        }
        List tpatUrls$default = C4980x2.getTpatUrls$default(this.this$0.advertisement, C2390Ej.DEEPLINK_CLICK, String.valueOf(z), null, 4, null);
        C3624hd0 c3624hd0 = new C3624hd0(this.this$0.getVungleApiClient$vungle_ads_release(), this.this$0.getLogEntry(), ((C4893w20) this.this$0.getExecutors()).getIoExecutor(), this.this$0.getPathProvider(), this.this$0.getSignalManager());
        if (tpatUrls$default != null) {
            C4304pL c4304pL = this.this$0;
            Iterator it = tpatUrls$default.iterator();
            while (it.hasNext()) {
                c3624hd0.sendTpat((String) it.next(), c4304pL.executor);
            }
        }
    }
}
