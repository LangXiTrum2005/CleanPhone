package com.basic.lib.basic;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.mbridge.msdk.MBridgeConstans;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4124nH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3265da;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X9;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasicActivityNotBinding extends AppCompatActivity implements InterfaceC3265da {
    public BasicActivityNotBinding() {
        AbstractC2340Cl.H(EnumC4124nH.b, new X9(this, 0));
    }

    public abstract void h();

    public abstract void initData();

    public abstract void initView();

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (Build.VERSION.SDK_INT == 29) {
            finishAfterTransition();
        } else {
            super.onBackPressed();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3265da
    public void onClickView(View view) {
        AbstractC2995aW.q(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h();
        initView();
        initData();
    }
}
