package com.basic.lib.basic;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.mbridge.msdk.MBridgeConstans;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4124nH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3265da;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X9;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasicFragmentNotBinding<A extends AppCompatActivity> extends Fragment implements InterfaceC3265da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AppCompatActivity f206a;
    public View b;
    public boolean c;
    public boolean d;
    public boolean e;

    public BasicFragmentNotBinding() {
        AbstractC2340Cl.H(EnumC4124nH.b, new X9(this, 1));
    }

    public abstract void a();

    public abstract View b(LayoutInflater layoutInflater);

    public abstract void c();

    @Override // androidx.fragment.app.Fragment, com.badlogic.gdx.backends.android.AndroidApplicationBase
    public final Context getContext() {
        AppCompatActivity appCompatActivity = this.f206a;
        if (appCompatActivity != null) {
            return appCompatActivity;
        }
        AbstractC2995aW.x0("mActivity");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.e) {
            if (this.c) {
                return;
            }
            this.c = true;
            a();
            return;
        }
        if (!this.d || this.c) {
            return;
        }
        this.c = true;
        a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        AbstractC2995aW.q(context, f.X);
        super.onAttach(context);
        this.f206a = (AppCompatActivity) context;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3265da
    public final void onClickView(View view) {
        AbstractC2995aW.q(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewParent parent;
        AbstractC2995aW.q(layoutInflater, "inflater");
        if (this.b == null) {
            this.b = b(layoutInflater);
        }
        View view = this.b;
        if (view != null && (parent = view.getParent()) != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(view);
        }
        c();
        if (this.c) {
            a();
        }
        return this.b;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.d = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        boolean z;
        super.onResume();
        this.e = true;
        this.d = true;
        if (this.b == null || (z = this.c) || z) {
            return;
        }
        this.c = true;
        a();
    }
}
