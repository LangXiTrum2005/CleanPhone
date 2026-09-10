package com.unity3d.ads.adplayer;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4221oQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$1$1", f = "FullScreenWebViewDisplay.kt", l = {31}, m = "invokeSuspend")
public final class FullScreenWebViewDisplay$onCreate$1$1 extends Ea0 implements InterfaceC3567gx {
    final /* synthetic */ FullScreenWebViewDisplay $this_run;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$onCreate$1$1(FullScreenWebViewDisplay fullScreenWebViewDisplay, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.$this_run = fullScreenWebViewDisplay;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new FullScreenWebViewDisplay$onCreate$1$1(this.$this_run, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
        return ((FullScreenWebViewDisplay$onCreate$1$1) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.label;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            InterfaceC4221oQ displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
            DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(this.$this_run.opportunityId, "Opportunity ID not found");
            this.label = 1;
            if (displayMessages.emit(displayError, this) == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        return C5033xf0.f5238a;
    }
}
