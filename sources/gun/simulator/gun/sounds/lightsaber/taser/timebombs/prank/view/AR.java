package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class AR extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BR f2815a;

    public AR(BR br) {
        this.f2815a = br;
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        boolean z = overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5;
        BR.a(z ? 10 : 5, this.f2815a);
    }
}
