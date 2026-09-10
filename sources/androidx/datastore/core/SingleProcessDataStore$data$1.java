package androidx.datastore.core;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2506Iv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3710ic0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3770jF;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4907w90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC2314Bl(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", l = {EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE}, m = "invokeSuspend")
public final class SingleProcessDataStore$data$1 extends Ea0 implements InterfaceC3567gx {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ State<T> $currentDownStreamFlowState;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(State<T> state, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$currentDownStreamFlowState = state;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentDownStreamFlowState, interfaceC2857Wj);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(State<T> state, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass1) create(state, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            State state = (State) this.L$0;
            State state2 = this.$currentDownStreamFlowState;
            boolean z = false;
            if (!(state2 instanceof Data) && !(state2 instanceof Final) && state == state2) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$data$1(SingleProcessDataStore<T> singleProcessDataStore, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.this$0 = singleProcessDataStore;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        SingleProcessDataStore$data$1 singleProcessDataStore$data$1 = new SingleProcessDataStore$data$1(this.this$0, interfaceC2857Wj);
        singleProcessDataStore$data$1.L$0 = obj;
        return singleProcessDataStore$data$1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
        return ((SingleProcessDataStore$data$1) create(interfaceC4530rv, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.label;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            InterfaceC4530rv interfaceC4530rv = (InterfaceC4530rv) this.L$0;
            State state = (State) ((C4907w90) ((SingleProcessDataStore) this.this$0).downstreamFlow).getValue();
            if (!(state instanceof Data)) {
                ((SingleProcessDataStore) this.this$0).actor.offer(new SingleProcessDataStore.Message.Read(state));
            }
            final C2506Iv c2506Iv = new C2506Iv(((SingleProcessDataStore) this.this$0).downstreamFlow, new AnonymousClass1(state, null), 0);
            InterfaceC4443qv interfaceC4443qv = new InterfaceC4443qv() { // from class: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2 implements InterfaceC4530rv {
                    final /* synthetic */ InterfaceC4530rv $this_unsafeFlow$inlined;

                    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @InterfaceC2314Bl(c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f = "SingleProcessDataStore.kt", l = {137}, m = "emit")
                    public static final class AnonymousClass1 extends AbstractC2883Xj {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
                            super(interfaceC2857Wj);
                        }

                        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC4530rv interfaceC4530rv) {
                        this.$this_unsafeFlow$inlined = interfaceC4530rv;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
                    public Object emit(Object obj, InterfaceC2857Wj interfaceC2857Wj) throws Throwable {
                        AnonymousClass1 anonymousClass1;
                        if (interfaceC2857Wj instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) interfaceC2857Wj;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC2857Wj);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC2857Wj);
                        }
                        Object obj2 = anonymousClass1.result;
                        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            AbstractC3375el.b0(obj2);
                            InterfaceC4530rv interfaceC4530rv = this.$this_unsafeFlow$inlined;
                            State state = (State) obj;
                            if (state instanceof ReadException) {
                                throw ((ReadException) state).getReadException();
                            }
                            if (state instanceof Final) {
                                throw ((Final) state).getFinalException();
                            }
                            if (!(state instanceof Data)) {
                                if (state instanceof UnInitialized) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542".toString());
                                }
                                throw new C3770jF(7, 0);
                            }
                            Object value = ((Data) state).getValue();
                            anonymousClass1.label = 1;
                            if (interfaceC4530rv.emit(value, anonymousClass1) == enumC4602sk) {
                                return enumC4602sk;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC3375el.b0(obj2);
                        }
                        return C5033xf0.f5238a;
                    }
                }

                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv
                public Object collect(InterfaceC4530rv interfaceC4530rv2, InterfaceC2857Wj interfaceC2857Wj) {
                    Object objCollect = c2506Iv.collect(new AnonymousClass2(interfaceC4530rv2), interfaceC2857Wj);
                    return objCollect == EnumC4602sk.f4993a ? objCollect : C5033xf0.f5238a;
                }
            };
            this.label = 1;
            if (interfaceC4530rv instanceof C3710ic0) {
                throw ((C3710ic0) interfaceC4530rv).f4510a;
            }
            Object objCollect = interfaceC4443qv.collect(interfaceC4530rv, this);
            if (objCollect != enumC4602sk) {
                objCollect = c5033xf0;
            }
            if (objCollect == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        return c5033xf0;
    }
}
