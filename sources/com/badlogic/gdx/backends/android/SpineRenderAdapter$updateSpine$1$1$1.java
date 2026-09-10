package com.badlogic.gdx.backends.android;

import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.badlogic.gdx.Input;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC2314Bl(c = "com.badlogic.gdx.backends.android.SpineRenderAdapter$updateSpine$1$1$1", f = "SpineRenderAdapter.kt", l = {Input.Keys.NUM_LOCK}, m = "invokeSuspend")
public final class SpineRenderAdapter$updateSpine$1$1$1 extends Ea0 implements InterfaceC3567gx {
    final /* synthetic */ SpineActivity<?> $spineActivity;
    int label;
    final /* synthetic */ SpineRenderAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpineRenderAdapter$updateSpine$1$1$1(SpineActivity<?> spineActivity, SpineRenderAdapter spineRenderAdapter, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.$spineActivity = spineActivity;
        this.this$0 = spineRenderAdapter;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new SpineRenderAdapter$updateSpine$1$1$1(this.$spineActivity, this.this$0, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
        return ((SpineRenderAdapter$updateSpine$1$1$1) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC3375el.b0(obj);
                SpineActivity<?> spineActivity = this.$spineActivity;
                this.label = 1;
                obj = SpineActivity.updateConfig$default(spineActivity, null, null, false, this, 7, null);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            View view = (View) obj;
            this.this$0.builder.setSpineView(view);
            if (view instanceof SurfaceView) {
                SurfaceView surfaceView = (SurfaceView) view;
                surfaceView.getHolder().setFormat(-3);
                surfaceView.setZOrderMediaOverlay(true);
            }
            ViewGroup parentView = this.this$0.builder.getParentView();
            if (parentView != null) {
                parentView.removeAllViews();
            }
            ViewGroup parentView2 = this.this$0.builder.getParentView();
            if (parentView2 != null) {
                parentView2.addView(view, this.this$0.builder.getLayoutParams());
            }
            this.this$0.isPause = false;
            return C5033xf0.f5238a;
        } catch (Throwable th) {
            this.this$0.isPause = false;
            throw th;
        }
    }
}
