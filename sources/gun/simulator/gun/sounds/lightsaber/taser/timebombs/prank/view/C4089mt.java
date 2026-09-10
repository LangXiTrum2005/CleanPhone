package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.net.URISyntaxException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4089mt {
    public static final C4089mt INSTANCE = new C4089mt();
    private static final String TAG = "ExternalRouter";

    private C4089mt() {
    }

    private final Intent getIntentFromUrl(String str, boolean z) {
        Intent uri = null;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    uri = Intent.parseUri(str, 0);
                }
                if (uri != null && z) {
                    uri.setFlags(268435456);
                }
            } catch (URISyntaxException e) {
                C4917wJ.Companion.e(TAG, "url format is not correct " + e.getLocalizedMessage());
            }
        } else if (uri != null) {
            uri.setFlags(268435456);
        }
        return uri;
    }

    public static final boolean launch(String str, String str2, Context context, C4126nJ c4126nJ, InterfaceC5017xV interfaceC5017xV) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        if ((str != null && str.length() != 0) || (str2 != null && str2.length() != 0)) {
            boolean z = !(context instanceof Activity);
            try {
                C4089mt c4089mt = INSTANCE;
                return C5064y0.Companion.startWhenForeground(context, c4089mt.getIntentFromUrl(str, z), c4089mt.getIntentFromUrl(str2, z), interfaceC5017xV);
            } catch (Exception e) {
                if (str == null || str.length() == 0) {
                    new C4916wI(EnumC4719u30.LINK_COMMAND_OPEN_FAILED, AbstractC3888ke0.i("Fail to open ", str2)).setLogEntry$vungle_ads_release(c4126nJ).logErrorNoReturnValue$vungle_ads_release();
                } else {
                    new C4916wI(EnumC4719u30.DEEPLINK_OPEN_FAILED, AbstractC3888ke0.i("Fail to open ", str)).setLogEntry$vungle_ads_release(c4126nJ).logErrorNoReturnValue$vungle_ads_release();
                }
                C4829vJ c4829vJ = C4917wJ.Companion;
                c4829vJ.e(TAG, "Error while opening url" + e.getLocalizedMessage());
                c4829vJ.d(TAG, "Cannot open url " + str2);
            }
        }
        return false;
    }

    public static /* synthetic */ boolean launch$default(String str, String str2, Context context, C4126nJ c4126nJ, InterfaceC5017xV interfaceC5017xV, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            c4126nJ = null;
        }
        if ((i & 16) != 0) {
            interfaceC5017xV = null;
        }
        return launch(str, str2, context, c4126nJ, interfaceC5017xV);
    }
}
