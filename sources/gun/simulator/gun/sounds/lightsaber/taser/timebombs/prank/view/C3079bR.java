package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3079bR implements InterfaceC5017xV {
    final /* synthetic */ String $deeplinkUrl;
    final /* synthetic */ C3624hd0 $tpatSender;
    final /* synthetic */ C3520gR this$0;

    public C3079bR(String str, C3520gR c3520gR, C3624hd0 c3624hd0) {
        this.$deeplinkUrl = str;
        this.this$0 = c3520gR;
        this.$tpatSender = c3624hd0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5017xV
    public void onDeeplinkClick(boolean z) {
        if (!z) {
            new C4916wI(EnumC4719u30.DEEPLINK_OPEN_FAILED, "Fail to open " + this.$deeplinkUrl).setLogEntry$vungle_ads_release(this.this$0.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        }
        C4980x2 c4980x2 = this.this$0.advertisement;
        List tpatUrls$default = c4980x2 != null ? C4980x2.getTpatUrls$default(c4980x2, C2390Ej.DEEPLINK_CLICK, String.valueOf(z), null, 4, null) : null;
        if (tpatUrls$default != null) {
            C3624hd0 c3624hd0 = this.$tpatSender;
            C3520gR c3520gR = this.this$0;
            Iterator it = tpatUrls$default.iterator();
            while (it.hasNext()) {
                c3624hd0.sendTpat((String) it.next(), c3520gR.executor);
            }
        }
    }
}
