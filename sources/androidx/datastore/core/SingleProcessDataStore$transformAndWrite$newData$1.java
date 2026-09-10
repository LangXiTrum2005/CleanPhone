package androidx.datastore.core;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC2314Bl(c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f = "SingleProcessDataStore.kt", l = {402}, m = "invokeSuspend")
public final class SingleProcessDataStore$transformAndWrite$newData$1 extends Ea0 implements InterfaceC3567gx {
    final /* synthetic */ T $curData;
    final /* synthetic */ InterfaceC3567gx $transform;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$transformAndWrite$newData$1(InterfaceC3567gx interfaceC3567gx, T t, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.$transform = interfaceC3567gx;
        this.$curData = t;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new SingleProcessDataStore$transformAndWrite$newData$1(this.$transform, this.$curData, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
        return ((SingleProcessDataStore$transformAndWrite$newData$1) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.label;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            InterfaceC3567gx interfaceC3567gx = this.$transform;
            Object obj2 = this.$curData;
            this.label = 1;
            obj = interfaceC3567gx.invoke(obj2, this);
            if (obj == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        return obj;
    }
}
