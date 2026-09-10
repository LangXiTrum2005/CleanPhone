package androidx.datastore.core;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC2314Bl(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", l = {239, 242}, m = "invokeSuspend")
public final class SingleProcessDataStore$actor$3 extends Ea0 implements InterfaceC3567gx {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$actor$3(SingleProcessDataStore<T> singleProcessDataStore, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.this$0 = singleProcessDataStore;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        SingleProcessDataStore$actor$3 singleProcessDataStore$actor$3 = new SingleProcessDataStore$actor$3(this.this$0, interfaceC2857Wj);
        singleProcessDataStore$actor$3.L$0 = obj;
        return singleProcessDataStore$actor$3;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(SingleProcessDataStore.Message<T> message, InterfaceC2857Wj interfaceC2857Wj) {
        return ((SingleProcessDataStore$actor$3) create(message, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.label;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            SingleProcessDataStore.Message message = (SingleProcessDataStore.Message) this.L$0;
            if (message instanceof SingleProcessDataStore.Message.Read) {
                this.label = 1;
                if (this.this$0.handleRead((SingleProcessDataStore.Message.Read) message, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else if (message instanceof SingleProcessDataStore.Message.Update) {
                this.label = 2;
                if (this.this$0.handleUpdate((SingleProcessDataStore.Message.Update) message, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        return C5033xf0.f5238a;
    }
}
