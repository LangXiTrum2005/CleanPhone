package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.go0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3558go0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4433a;

    public /* synthetic */ C3558go0(int i) {
        this.f4433a = i;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f4433a) {
            case 0:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra == 0) {
                        FW.f = 1;
                    } else if (intExtra == 1) {
                        FW.f = 2;
                    }
                }
                break;
            case 1:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra2 = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra2 == 0) {
                        BF.j = 1;
                    } else if (intExtra2 == 1) {
                        BF.j = 2;
                    }
                }
                break;
            default:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra3 = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra3 == 0) {
                        AbstractC4496rb.p = 1;
                    } else if (intExtra3 == 1) {
                        AbstractC4496rb.p = 2;
                    }
                }
                break;
        }
    }
}
