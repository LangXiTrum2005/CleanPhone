package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C4099n1 {
    public static final C4011m1 Companion = new C4011m1(null);
    private static final String TAG = "AdEventListener";
    private boolean adRewarded;
    private C4664tU placement;
    private final InterfaceC5156z2 playAdCallback;

    public C4099n1(InterfaceC5156z2 interfaceC5156z2, C4664tU c4664tU) {
        this.playAdCallback = interfaceC5156z2;
        this.placement = c4664tU;
    }

    public final void onError(Ei0 ei0, String str) {
        AbstractC2995aW.q(ei0, "error");
        InterfaceC5156z2 interfaceC5156z2 = this.playAdCallback;
        if (interfaceC5156z2 != null) {
            interfaceC5156z2.onFailure(ei0);
            C4917wJ.Companion.e(TAG, "AdEventListener#PlayAdCallback " + str, ei0);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void onNext(String str, String str2, String str3) {
        C4664tU c4664tU;
        InterfaceC5156z2 interfaceC5156z2;
        InterfaceC5156z2 interfaceC5156z3;
        InterfaceC5156z2 interfaceC5156z4;
        InterfaceC5156z2 interfaceC5156z5;
        AbstractC2995aW.q(str, com.umeng.analytics.pro.bc.aH);
        C4829vJ c4829vJ = C4917wJ.Companion;
        StringBuilder sbR = DM.r("s=", str, ", value=", str2, ", id=");
        sbR.append(str3);
        c4829vJ.d(TAG, sbR.toString());
        switch (str.hashCode()) {
            case -1912374177:
                if (str.equals(C4304pL.SUCCESSFUL_VIEW) && (c4664tU = this.placement) != null && c4664tU.isRewardedVideo() && !this.adRewarded) {
                    this.adRewarded = true;
                    InterfaceC5156z2 interfaceC5156z6 = this.playAdCallback;
                    if (interfaceC5156z6 != null) {
                        interfaceC5156z6.onAdRewarded(str3);
                    }
                }
                break;
            case -1627831289:
                if (str.equals("adViewed") && (interfaceC5156z2 = this.playAdCallback) != null) {
                    interfaceC5156z2.onAdImpression(str3);
                }
                break;
            case 100571:
                if (str.equals(TtmlNode.END) && (interfaceC5156z3 = this.playAdCallback) != null) {
                    interfaceC5156z3.onAdEnd(str3);
                }
                break;
            case 3417674:
                if (str.equals(C4304pL.OPEN)) {
                    if (AbstractC2995aW.i(str2, "adClick")) {
                        InterfaceC5156z2 interfaceC5156z7 = this.playAdCallback;
                        if (interfaceC5156z7 != null) {
                            interfaceC5156z7.onAdClick(str3);
                        }
                        break;
                    } else if (AbstractC2995aW.i(str2, "adLeftApplication") && (interfaceC5156z4 = this.playAdCallback) != null) {
                        interfaceC5156z4.onAdLeftApplication(str3);
                        break;
                    }
                }
                break;
            case 109757538:
                if (str.equals("start") && (interfaceC5156z5 = this.playAdCallback) != null) {
                    interfaceC5156z5.onAdStart(str3);
                }
                break;
        }
    }
}
