package androidx.datastore.core;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3086bY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4660tQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4397qQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WX;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
public final class SingleProcessDataStore$readAndInit$api$1<T> implements InitializerApi<T> {
    final /* synthetic */ C3086bY $initData;
    final /* synthetic */ WX $initializationComplete;
    final /* synthetic */ InterfaceC4397qQ $updateLock;
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    public SingleProcessDataStore$readAndInit$api$1(InterfaceC4397qQ interfaceC4397qQ, WX wx, C3086bY c3086bY, SingleProcessDataStore<T> singleProcessDataStore) {
        this.$updateLock = interfaceC4397qQ;
        this.$initializationComplete = wx;
        this.$initData = c3086bY;
        this.this$0 = singleProcessDataStore;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ba A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.InitializerApi
    public Object updateData(InterfaceC3567gx interfaceC3567gx, InterfaceC2857Wj interfaceC2857Wj) throws Throwable {
        SingleProcessDataStore$readAndInit$api$1$updateData$1 singleProcessDataStore$readAndInit$api$1$updateData$1;
        SingleProcessDataStore singleProcessDataStore;
        WX wx;
        C3086bY c3086bY;
        InterfaceC4397qQ interfaceC4397qQ;
        InterfaceC4397qQ interfaceC4397qQ2;
        InterfaceC4397qQ interfaceC4397qQ3;
        SingleProcessDataStore singleProcessDataStore2;
        Object obj;
        C3086bY c3086bY2;
        InterfaceC4397qQ interfaceC4397qQ4;
        if (interfaceC2857Wj instanceof SingleProcessDataStore$readAndInit$api$1$updateData$1) {
            singleProcessDataStore$readAndInit$api$1$updateData$1 = (SingleProcessDataStore$readAndInit$api$1$updateData$1) interfaceC2857Wj;
            int i = singleProcessDataStore$readAndInit$api$1$updateData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInit$api$1$updateData$1.label = i - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$readAndInit$api$1$updateData$1 = new SingleProcessDataStore$readAndInit$api$1$updateData$1(this, interfaceC2857Wj);
            }
        } else {
            singleProcessDataStore$readAndInit$api$1$updateData$1 = new SingleProcessDataStore$readAndInit$api$1$updateData$1(this, interfaceC2857Wj);
        }
        Object obj2 = singleProcessDataStore$readAndInit$api$1$updateData$1.result;
        Object obj3 = EnumC4602sk.f4993a;
        int i2 = singleProcessDataStore$readAndInit$api$1$updateData$1.label;
        try {
            if (i2 == 0) {
                AbstractC3375el.b0(obj2);
                InterfaceC4397qQ interfaceC4397qQ5 = this.$updateLock;
                WX wx2 = this.$initializationComplete;
                C3086bY c3086bY3 = this.$initData;
                singleProcessDataStore = this.this$0;
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$0 = interfaceC3567gx;
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$1 = interfaceC4397qQ5;
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$2 = wx2;
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$3 = c3086bY3;
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$4 = singleProcessDataStore;
                singleProcessDataStore$readAndInit$api$1$updateData$1.label = 1;
                C4660tQ c4660tQ = (C4660tQ) interfaceC4397qQ5;
                if (c4660tQ.d(null, singleProcessDataStore$readAndInit$api$1$updateData$1) == obj3) {
                    return obj3;
                }
                wx = wx2;
                c3086bY = c3086bY3;
                interfaceC4397qQ = c4660tQ;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = singleProcessDataStore$readAndInit$api$1$updateData$1.L$2;
                        c3086bY2 = (C3086bY) singleProcessDataStore$readAndInit$api$1$updateData$1.L$1;
                        interfaceC4397qQ2 = (InterfaceC4397qQ) singleProcessDataStore$readAndInit$api$1$updateData$1.L$0;
                        try {
                            AbstractC3375el.b0(obj2);
                            interfaceC4397qQ4 = interfaceC4397qQ2;
                            c3086bY2.f4172a = obj;
                            c3086bY = c3086bY2;
                            interfaceC4397qQ2 = interfaceC4397qQ4;
                            Object obj4 = c3086bY.f4172a;
                            ((C4660tQ) interfaceC4397qQ2).e(null);
                            return obj4;
                        } catch (Throwable th) {
                            th = th;
                            ((C4660tQ) interfaceC4397qQ2).e(null);
                            throw th;
                        }
                    }
                    SingleProcessDataStore singleProcessDataStore3 = (SingleProcessDataStore) singleProcessDataStore$readAndInit$api$1$updateData$1.L$2;
                    c3086bY = (C3086bY) singleProcessDataStore$readAndInit$api$1$updateData$1.L$1;
                    interfaceC4397qQ3 = (InterfaceC4397qQ) singleProcessDataStore$readAndInit$api$1$updateData$1.L$0;
                    try {
                        AbstractC3375el.b0(obj2);
                        interfaceC4397qQ3 = interfaceC4397qQ3;
                        singleProcessDataStore2 = singleProcessDataStore3;
                        if (AbstractC2995aW.i(obj2, c3086bY.f4172a)) {
                            interfaceC4397qQ2 = interfaceC4397qQ3;
                        } else {
                            singleProcessDataStore$readAndInit$api$1$updateData$1.L$0 = interfaceC4397qQ3;
                            singleProcessDataStore$readAndInit$api$1$updateData$1.L$1 = c3086bY;
                            singleProcessDataStore$readAndInit$api$1$updateData$1.L$2 = obj2;
                            singleProcessDataStore$readAndInit$api$1$updateData$1.label = 3;
                            if (singleProcessDataStore2.writeData$datastore_core(obj2, singleProcessDataStore$readAndInit$api$1$updateData$1) == obj3) {
                                return obj3;
                            }
                            obj = obj2;
                            c3086bY2 = c3086bY;
                            interfaceC4397qQ4 = interfaceC4397qQ3;
                            c3086bY2.f4172a = obj;
                            c3086bY = c3086bY2;
                            interfaceC4397qQ2 = interfaceC4397qQ4;
                        }
                        Object obj5 = c3086bY.f4172a;
                        ((C4660tQ) interfaceC4397qQ2).e(null);
                        return obj5;
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC4397qQ2 = interfaceC4397qQ3;
                        ((C4660tQ) interfaceC4397qQ2).e(null);
                        throw th;
                    }
                }
                SingleProcessDataStore singleProcessDataStore4 = (SingleProcessDataStore) singleProcessDataStore$readAndInit$api$1$updateData$1.L$4;
                c3086bY = (C3086bY) singleProcessDataStore$readAndInit$api$1$updateData$1.L$3;
                wx = (WX) singleProcessDataStore$readAndInit$api$1$updateData$1.L$2;
                InterfaceC4397qQ interfaceC4397qQ6 = (InterfaceC4397qQ) singleProcessDataStore$readAndInit$api$1$updateData$1.L$1;
                InterfaceC3567gx interfaceC3567gx2 = (InterfaceC3567gx) singleProcessDataStore$readAndInit$api$1$updateData$1.L$0;
                AbstractC3375el.b0(obj2);
                interfaceC4397qQ = interfaceC4397qQ6;
                singleProcessDataStore = singleProcessDataStore4;
                interfaceC3567gx = interfaceC3567gx2;
            }
            if (wx.f3924a) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj6 = c3086bY.f4172a;
            singleProcessDataStore$readAndInit$api$1$updateData$1.L$0 = interfaceC4397qQ;
            singleProcessDataStore$readAndInit$api$1$updateData$1.L$1 = c3086bY;
            singleProcessDataStore$readAndInit$api$1$updateData$1.L$2 = singleProcessDataStore;
            singleProcessDataStore$readAndInit$api$1$updateData$1.L$3 = null;
            singleProcessDataStore$readAndInit$api$1$updateData$1.L$4 = null;
            singleProcessDataStore$readAndInit$api$1$updateData$1.label = 2;
            Object objInvoke = interfaceC3567gx.invoke(obj6, singleProcessDataStore$readAndInit$api$1$updateData$1);
            if (objInvoke == obj3) {
                return obj3;
            }
            interfaceC4397qQ3 = interfaceC4397qQ;
            obj2 = objInvoke;
            singleProcessDataStore2 = singleProcessDataStore;
            if (AbstractC2995aW.i(obj2, c3086bY.f4172a)) {
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$0 = interfaceC4397qQ3;
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$1 = c3086bY;
                singleProcessDataStore$readAndInit$api$1$updateData$1.L$2 = obj2;
                singleProcessDataStore$readAndInit$api$1$updateData$1.label = 3;
                if (singleProcessDataStore2.writeData$datastore_core(obj2, singleProcessDataStore$readAndInit$api$1$updateData$1) == obj3) {
                    return obj3;
                }
                obj = obj2;
                c3086bY2 = c3086bY;
                interfaceC4397qQ4 = interfaceC4397qQ3;
                c3086bY2.f4172a = obj;
                c3086bY = c3086bY2;
                interfaceC4397qQ2 = interfaceC4397qQ4;
            } else {
                interfaceC4397qQ2 = interfaceC4397qQ3;
            }
            Object obj7 = c3086bY.f4172a;
            ((C4660tQ) interfaceC4397qQ2).e(null);
            return obj7;
        } catch (Throwable th3) {
            th = th3;
            interfaceC4397qQ2 = interfaceC4397qQ;
            ((C4660tQ) interfaceC4397qQ2).e(null);
            throw th;
        }
    }
}
