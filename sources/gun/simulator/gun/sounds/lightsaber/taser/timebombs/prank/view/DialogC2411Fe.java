package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import androidx.viewbinding.ViewBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.DialogCheckNetworkBinding;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogC2411Fe extends AbstractDialogC3851k9 {
    public static final /* synthetic */ int d = 0;
    public boolean b;
    public final C4568sM c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC2411Fe(Context context) {
        super(context, R.style.FullScreenDimEnabledStyle);
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        this.c = new C4568sM(context);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractDialogC3851k9
    public final ViewBinding b() {
        DialogCheckNetworkBinding dialogCheckNetworkBindingInflate = DialogCheckNetworkBinding.inflate(getLayoutInflater());
        AbstractC2995aW.p(dialogCheckNetworkBindingInflate, "inflate(...)");
        return dialogCheckNetworkBindingInflate;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractDialogC3851k9
    public final void c() {
        S3.a("no_internet_display");
        C2359De c2359De = new C2359De(this, 1);
        C4568sM c4568sM = this.c;
        c4568sM.getClass();
        c4568sM.d = new C3936l70(c2359De, 1);
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().build();
        ConnectivityManager connectivityManager = (ConnectivityManager) c4568sM.c;
        ConnectivityManager.NetworkCallback networkCallback = (ConnectivityManager.NetworkCallback) c4568sM.d;
        AbstractC2995aW.n(networkCallback);
        connectivityManager.registerNetworkCallback(networkRequestBuild, networkCallback);
        ((DialogCheckNetworkBinding) a()).btTryAgain.setOnTouchListener(new ViewOnTouchListenerC2385Ee(this));
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
    }
}
