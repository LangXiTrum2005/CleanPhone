package ads_mobile_sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import saneness.vicissitude;

/* JADX INFO: loaded from: classes.dex */
public final class vx1 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
            int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
            if (intExtra == 0) {
                vicissitude.f37361attabal = 1;
            } else if (intExtra == 1) {
                vicissitude.f37361attabal = 2;
            }
        }
    }
}
