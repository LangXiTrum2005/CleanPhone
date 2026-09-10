package androidx.p001lifecycle;

import formularization.beachfront;
import igo.wireman;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.impassible;
import kotlinx.coroutines.impromptu;
import kotlinx.coroutines.kowloon;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.premeiotic;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.saran;
import kotlinx.coroutines.technofreak;
import org.objectweb.asm.Opcodes;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$ObjectRef;
import wretchedly.dern;

/* JADX INFO: compiled from: RepeatOnLifecycle.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 0, 0})
@wireman(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {83}, m = "invokeSuspend", v = 1)
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements Function2<saran, dern<? super Unit>, Object> {
    final /* synthetic */ Function2<saran, dern<? super Unit>, Object> $block;
    final /* synthetic */ Lifecycle.State $state;
    final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
    /* JADX INFO: compiled from: RepeatOnLifecycle.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 0, 0})
    @wireman(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {Opcodes.IF_ICMPLT}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<saran, dern<? super Unit>, Object> {
        final /* synthetic */ saran $$this$coroutineScope;
        final /* synthetic */ Function2<saran, dern<? super Unit>, Object> $block;
        final /* synthetic */ Lifecycle.State $state;
        final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, saran saranVar, Function2<? super saran, ? super dern<? super Unit>, ? extends Object> function2, dern<? super AnonymousClass1> dernVar) {
            super(2, dernVar);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$$this$coroutineScope = saranVar;
            this.$block = function2;
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final dern<Unit> create(Object obj, dern<?> dernVar) {
            return new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, dernVar);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00af  */
        /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:39:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:45:? A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r4v3, types: [T, androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, java.lang.Object] */
        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Ref$ObjectRef ref$ObjectRef;
            Throwable th;
            Ref$ObjectRef ref$ObjectRef2;
            monroe monroeVar;
            impassible impassibleVar;
            monroe monroeVar2;
            impassible impassibleVar2;
            Object objBeachfront = attabal.beachfront();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$ObjectRef = (Ref$ObjectRef) this.L$1;
                ref$ObjectRef2 = (Ref$ObjectRef) this.L$0;
                try {
                    p002kotlin.dern.saneness(obj);
                    monroeVar2 = (monroe) ref$ObjectRef2.element;
                    if (monroeVar2 != null) {
                        monroe.attabal.attabal(monroeVar2, null, 1, null);
                    }
                    impassibleVar2 = (impassible) ref$ObjectRef.element;
                    if (impassibleVar2 != null) {
                        this.$this_repeatOnLifecycle.wireman(impassibleVar2);
                    }
                    return Unit.f29295attabal;
                } catch (Throwable th2) {
                    th = th2;
                    monroeVar = (monroe) ref$ObjectRef2.element;
                    if (monroeVar != null) {
                        monroe.attabal.attabal(monroeVar, null, 1, null);
                    }
                    impassibleVar = (impassible) ref$ObjectRef.element;
                    if (impassibleVar != null) {
                        throw th;
                    }
                    this.$this_repeatOnLifecycle.wireman(impassibleVar);
                    throw th;
                }
            }
            p002kotlin.dern.saneness(obj);
            if (this.$this_repeatOnLifecycle.getState() == Lifecycle.State.DESTROYED) {
                return Unit.f29295attabal;
            }
            final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
            ref$ObjectRef = new Ref$ObjectRef();
            try {
                Lifecycle.State state = this.$state;
                Lifecycle lifecycle = this.$this_repeatOnLifecycle;
                final saran saranVar = this.$$this$coroutineScope;
                final Function2<saran, dern<? super Unit>, Object> function2 = this.$block;
                this.L$0 = ref$ObjectRef3;
                this.L$1 = ref$ObjectRef;
                this.L$2 = state;
                this.L$3 = lifecycle;
                this.L$4 = saranVar;
                this.L$5 = function2;
                this.label = 1;
                final kowloon kowloonVar = new kowloon(IntrinsicsKt__IntrinsicsJvmKt.dern(this), 1);
                kowloonVar.kattegat();
                Lifecycle.Event.Companion companion = Lifecycle.Event.INSTANCE;
                final Lifecycle.Event eventWireman = companion.wireman(state);
                final Lifecycle.Event eventAttabal = companion.attabal(state);
                final formularization.attabal attabalVarSaneness = beachfront.saneness(false, 1, null);
                ?? r4 = new impassible() { // from class: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1

                    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1, reason: invalid class name */
                    /* JADX INFO: compiled from: RepeatOnLifecycle.kt */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 0, 0})
                    @wireman(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {Opcodes.IF_ACMPNE, 110}, m = "invokeSuspend", v = 1)
                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<saran, dern<? super Unit>, Object> {
                        final /* synthetic */ Function2<saran, dern<? super Unit>, Object> $block;
                        final /* synthetic */ formularization.attabal $mutex;
                        Object L$0;
                        Object L$1;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public AnonymousClass1(formularization.attabal attabalVar, Function2<? super saran, ? super dern<? super Unit>, ? extends Object> function2, dern<? super AnonymousClass1> dernVar) {
                            super(2, dernVar);
                            this.$mutex = attabalVar;
                            this.$block = function2;
                        }

                        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final dern<Unit> create(Object obj, dern<?> dernVar) {
                            return new AnonymousClass1(this.$mutex, this.$block, dernVar);
                        }

                        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) throws Throwable {
                            formularization.attabal attabalVar;
                            Function2<saran, dern<? super Unit>, Object> function2;
                            formularization.attabal attabalVar2;
                            Throwable th;
                            Object objBeachfront = attabal.beachfront();
                            int i = this.label;
                            try {
                                if (i == 0) {
                                    p002kotlin.dern.saneness(obj);
                                    attabalVar = this.$mutex;
                                    function2 = this.$block;
                                    this.L$0 = attabalVar;
                                    this.L$1 = function2;
                                    this.label = 1;
                                    if (attabalVar.attabal(null, this) != objBeachfront) {
                                    }
                                    return objBeachfront;
                                }
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    attabalVar2 = (formularization.attabal) this.L$0;
                                    try {
                                        p002kotlin.dern.saneness(obj);
                                        Unit unit = Unit.f29295attabal;
                                        attabalVar2.wireman(null);
                                        return Unit.f29295attabal;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        attabalVar2.wireman(null);
                                        throw th;
                                    }
                                }
                                function2 = (Function2) this.L$1;
                                formularization.attabal attabalVar3 = (formularization.attabal) this.L$0;
                                p002kotlin.dern.saneness(obj);
                                attabalVar = attabalVar3;
                                RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(function2, null);
                                this.L$0 = attabalVar;
                                this.L$1 = null;
                                this.label = 2;
                                if (privatdozent.marial(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) != objBeachfront) {
                                    attabalVar2 = attabalVar;
                                    Unit unit2 = Unit.f29295attabal;
                                    attabalVar2.wireman(null);
                                    return Unit.f29295attabal;
                                }
                                return objBeachfront;
                            } catch (Throwable th3) {
                                attabalVar2 = attabalVar;
                                th = th3;
                                attabalVar2.wireman(null);
                                throw th;
                            }
                        }

                        @Override // p002kotlin.jvm.functions.Function2
                        public final Object invoke(saran saranVar, dern<? super Unit> dernVar) {
                            return ((AnonymousClass1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
                        }
                    }

                    /* JADX WARN: Type inference failed for: r9v5, types: [T, kotlinx.coroutines.monroe] */
                    @Override // androidx.p001lifecycle.impassible
                    public final void onStateChanged(arytenoidectomy arytenoidectomyVar, Lifecycle.Event event) {
                        Intrinsics.checkNotNullParameter(arytenoidectomyVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event == eventWireman) {
                            ref$ObjectRef3.element = cutely.wireman(saranVar, null, null, new AnonymousClass1(attabalVarSaneness, function2, null), 3, null);
                            return;
                        }
                        if (event == eventAttabal) {
                            monroe monroeVar3 = ref$ObjectRef3.element;
                            if (monroeVar3 != null) {
                                monroe.attabal.attabal(monroeVar3, null, 1, null);
                            }
                            ref$ObjectRef3.element = null;
                        }
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            impassible<Unit> impassibleVar3 = kowloonVar;
                            Result.Companion companion2 = Result.INSTANCE;
                            impassibleVar3.resumeWith(Result.m3351constructorimpl(Unit.f29295attabal));
                        }
                    }
                };
                ref$ObjectRef.element = r4;
                Intrinsics.competently(r4, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                lifecycle.attabal((impassible) r4);
                Object objCuirassed = kowloonVar.cuirassed();
                if (objCuirassed == attabal.beachfront()) {
                    igo.beachfront.dern(this);
                }
                if (objCuirassed == objBeachfront) {
                    return objBeachfront;
                }
                ref$ObjectRef2 = ref$ObjectRef3;
                monroeVar2 = (monroe) ref$ObjectRef2.element;
                if (monroeVar2 != null) {
                    monroe.attabal.attabal(monroeVar2, null, 1, null);
                }
                impassibleVar2 = (impassible) ref$ObjectRef.element;
                if (impassibleVar2 != null) {
                    this.$this_repeatOnLifecycle.wireman(impassibleVar2);
                }
                return Unit.f29295attabal;
            } catch (Throwable th3) {
                th = th3;
                ref$ObjectRef2 = ref$ObjectRef3;
                monroeVar = (monroe) ref$ObjectRef2.element;
                if (monroeVar != null) {
                    monroe.attabal.attabal(monroeVar, null, 1, null);
                }
                impassibleVar = (impassible) ref$ObjectRef.element;
                if (impassibleVar != null) {
                    throw th;
                }
                this.$this_repeatOnLifecycle.wireman(impassibleVar);
                throw th;
            }
        }

        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(saran saranVar, dern<? super Unit> dernVar) {
            return ((AnonymousClass1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, Function2<? super saran, ? super dern<? super Unit>, ? extends Object> function2, dern<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> dernVar) {
        super(2, dernVar);
        this.$this_repeatOnLifecycle = lifecycle;
        this.$state = state;
        this.$block = function2;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern<Unit> create(Object obj, dern<?> dernVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.$this_repeatOnLifecycle, this.$state, this.$block, dernVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.label;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            saran saranVar = (saran) this.L$0;
            technofreak technofreakVarPreterite = premeiotic.dern().preterite();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, saranVar, this.$block, null);
            this.label = 1;
            if (impromptu.competently(technofreakVarPreterite, anonymousClass1, this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, dern<? super Unit> dernVar) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
