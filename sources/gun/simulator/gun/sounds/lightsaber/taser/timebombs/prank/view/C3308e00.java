package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.e00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3308e00 extends BroadcastReceiver {
    private C5041xj0 webClient;

    public final C5041xj0 getWebClient() {
        return this.webClient;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        C5041xj0 c5041xj0;
        if (intent != null) {
            try {
                action = intent.getAction();
            } catch (Exception e) {
                String localizedMessage = e.getLocalizedMessage();
                if (localizedMessage != null) {
                    C4917wJ.Companion.e("RingerModeReceiver", localizedMessage);
                    return;
                }
                return;
            }
        } else {
            action = null;
        }
        if (AbstractC2995aW.i(action, "android.media.RINGER_MODE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", -1);
            C4917wJ.Companion.d("RingerModeReceiver", "receive ringermode: " + intExtra);
            if (intExtra == 0) {
                C5041xj0 c5041xj1 = this.webClient;
                if (c5041xj1 != null) {
                    c5041xj1.notifySilentModeChange(true);
                    return;
                }
                return;
            }
            if (intExtra != 1) {
                if (intExtra == 2 && (c5041xj0 = this.webClient) != null) {
                    c5041xj0.notifySilentModeChange(false);
                    return;
                }
                return;
            }
            C5041xj0 c5041xj2 = this.webClient;
            if (c5041xj2 != null) {
                c5041xj2.notifySilentModeChange(true);
            }
        }
    }

    public final void setWebClient(C5041xj0 c5041xj0) {
        this.webClient = c5041xj0;
    }
}
