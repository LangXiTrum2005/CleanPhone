package com.unity3d.ads.core.domain;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$config$1", f = "AndroidHttpClientProvider.kt", l = {53}, m = "invokeSuspend")
public final class AndroidHttpClientProvider$invoke$config$1 extends Ea0 implements InterfaceC3567gx {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidHttpClientProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHttpClientProvider$invoke$config$1(AndroidHttpClientProvider androidHttpClientProvider, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.this$0 = androidHttpClientProvider;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        AndroidHttpClientProvider$invoke$config$1 androidHttpClientProvider$invoke$config$1 = new AndroidHttpClientProvider$invoke$config$1(this.this$0, interfaceC2857Wj);
        androidHttpClientProvider$invoke$config$1.L$0 = obj;
        return androidHttpClientProvider$invoke$config$1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
        return ((AndroidHttpClientProvider$invoke$config$1) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        Object objV;
        Object objMo81invokegIAlus;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC3375el.b0(obj);
                ConfigFileFromLocalStorage configFileFromLocalStorage = this.this$0.configFileFromLocalStorage;
                ConfigFileFromLocalStorage.Params params = new ConfigFileFromLocalStorage.Params(null, 1, null);
                this.label = 1;
                objMo81invokegIAlus = configFileFromLocalStorage.mo81invokegIAlus(params, this);
                if (objMo81invokegIAlus == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
                objMo81invokegIAlus = ((IZ) obj).f3222a;
            }
            objV = new IZ(objMo81invokegIAlus);
        } catch (Throwable th) {
            objV = AbstractC3375el.v(th);
        }
        if (objV instanceof HZ) {
            objV = null;
        }
        IZ iz = (IZ) objV;
        if (iz == null) {
            return null;
        }
        Object obj2 = iz.f3222a;
        return (Configuration) (obj2 instanceof HZ ? null : obj2);
    }
}
