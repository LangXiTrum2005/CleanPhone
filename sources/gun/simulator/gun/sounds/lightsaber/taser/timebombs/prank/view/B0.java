package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.internal.ui.VungleActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class B0 {
    private B0() {
    }

    public /* synthetic */ B0(AbstractC2471Hm abstractC2471Hm) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getEventId(Intent intent) {
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                return extras.getString(J0.REQUEST_KEY_EVENT_ID_EXTRA);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getPlacement(Intent intent) {
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                return extras.getString(J0.REQUEST_KEY_EXTRA);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public final Intent createIntent(Context context, String str, String str2) {
        AbstractC2995aW.q(str, "placement");
        Intent intent = new Intent(context, (Class<?>) VungleActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        Bundle bundle = new Bundle();
        bundle.putString(J0.REQUEST_KEY_EXTRA, str);
        bundle.putString(J0.REQUEST_KEY_EVENT_ID_EXTRA, str2);
        intent.putExtras(bundle);
        return intent;
    }

    public final C4980x2 getAdvertisement$vungle_ads_release() {
        return J0.advertisement;
    }

    public final C3967la getBidPayload$vungle_ads_release() {
        return J0.bidPayload;
    }

    @VisibleForTesting
    public final C4099n1 getEventListener$vungle_ads_release() {
        return J0.eventListener;
    }

    public final InterfaceC5105yV getPresenterDelegate$vungle_ads_release() {
        return J0.presenterDelegate;
    }

    public final void setAdvertisement$vungle_ads_release(C4980x2 c4980x2) {
        J0.advertisement = c4980x2;
    }

    public final void setBidPayload$vungle_ads_release(C3967la c3967la) {
        J0.bidPayload = c3967la;
    }

    public final void setEventListener$vungle_ads_release(C4099n1 c4099n1) {
        J0.eventListener = c4099n1;
    }

    public final void setPresenterDelegate$vungle_ads_release(InterfaceC5105yV interfaceC5105yV) {
        J0.presenterDelegate = interfaceC5105yV;
    }

    @VisibleForTesting
    public static /* synthetic */ void getREQUEST_KEY_EVENT_ID_EXTRA$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getREQUEST_KEY_EXTRA$vungle_ads_release$annotations() {
    }
}
