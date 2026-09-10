package com.basic.lib.withbinding;

import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;
import com.basic.lib.basic.BasicFragmentNotBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasicFragment<A extends AppCompatActivity, VB extends ViewBinding> extends BasicFragmentNotBinding<A> {
    public ViewBinding f;

    @Override // com.basic.lib.basic.BasicFragmentNotBinding
    public final View b(LayoutInflater layoutInflater) {
        AbstractC2995aW.q(layoutInflater, "inflater");
        ViewBinding viewBindingD = d();
        AbstractC2995aW.q(viewBindingD, "<set-?>");
        this.f = viewBindingD;
        View root = viewBindingD.getRoot();
        AbstractC2995aW.p(root, "getRoot(...)");
        return root;
    }

    public abstract ViewBinding d();
}
