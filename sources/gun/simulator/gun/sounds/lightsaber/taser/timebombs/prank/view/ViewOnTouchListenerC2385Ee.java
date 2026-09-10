package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.MotionEvent;
import android.view.View;
import com.efs.sdk.base.core.util.NetworkUtil;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.DialogCheckNetworkBinding;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnTouchListenerC2385Ee implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogC2411Fe f3031a;

    public ViewOnTouchListenerC2385Ee(DialogC2411Fe dialogC2411Fe) {
        this.f3031a = dialogC2411Fe;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        DialogC2411Fe dialogC2411Fe = this.f3031a;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            ((DialogCheckNetworkBinding) dialogC2411Fe.a()).btTryAgain.setBackgroundResource(R.drawable.bt_network_bg_feedback);
            return true;
        }
        if ((numValueOf == null || numValueOf.intValue() != 1) && (numValueOf == null || numValueOf.intValue() != 3)) {
            return false;
        }
        ((DialogCheckNetworkBinding) dialogC2411Fe.a()).btTryAgain.setBackgroundResource(R.drawable.bt_rate_bg_light);
        if (!NetworkUtil.isConnected(dialogC2411Fe.getContext())) {
            S3.b("no_internet_click", "try_fail");
            return false;
        }
        S3.b("no_internet_click", "try_success");
        C2359De c2359De = new C2359De(dialogC2411Fe, 2);
        dialogC2411Fe.dismiss();
        c2359De.invoke();
        return true;
    }
}
