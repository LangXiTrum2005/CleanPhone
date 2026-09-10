package com.codejoy.boom.clap.module.fragment;

import androidx.p001lifecycle.Lifecycle;
import androidx.p001lifecycle.RepeatOnLifecycleKt;
import com.codejoy.boom.clap.service.AntiPickPocketService;
import kotlinx.coroutines.saran;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AntiPocketFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 2, 0})
@igo.wireman(c = "com.codejoy.boom.clap.module.fragment.AntiPocketFragment$initData$1", f = "AntiPocketFragment.kt", l = {38}, m = "invokeSuspend", v = 1)
public final class AntiPocketFragment$initData$1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
    int label;
    final /* synthetic */ AntiPocketFragment this$0;

    /* JADX INFO: renamed from: com.codejoy.boom.clap.module.fragment.AntiPocketFragment$initData$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: AntiPocketFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 2, 0})
    @igo.wireman(c = "com.codejoy.boom.clap.module.fragment.AntiPocketFragment$initData$1$1", f = "AntiPocketFragment.kt", l = {39}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
        int label;
        final /* synthetic */ AntiPocketFragment this$0;

        /* JADX INFO: renamed from: com.codejoy.boom.clap.module.fragment.AntiPocketFragment$initData$1$1$attabal */
        /* JADX INFO: compiled from: AntiPocketFragment.kt */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class attabal<T> implements kotlinx.coroutines.flow.wireman {

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final /* synthetic */ AntiPocketFragment f18343kowloon;

            public attabal(AntiPocketFragment antiPocketFragment) {
                this.f18343kowloon = antiPocketFragment;
            }

            @Override // kotlinx.coroutines.flow.wireman
            public /* bridge */ /* synthetic */ Object emit(Object obj, wretchedly.dern dernVar) {
                return saneness(((Boolean) obj).booleanValue(), dernVar);
            }

            public final Object saneness(boolean z, wretchedly.dern<? super Unit> dernVar) {
                if (z) {
                    this.f18343kowloon.arytenoidectomy().f38007wireman.onActivated();
                } else {
                    this.f18343kowloon.arytenoidectomy().f38007wireman.onUnActivated();
                }
                return Unit.f29295attabal;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AntiPocketFragment antiPocketFragment, wretchedly.dern<? super AnonymousClass1> dernVar) {
            super(2, dernVar);
            this.this$0 = antiPocketFragment;
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
            return new AnonymousClass1(this.this$0, dernVar);
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
            int i = this.label;
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                kotlinx.coroutines.flow.formularize<Boolean> formularizeVarAttabal = AntiPickPocketService.INSTANCE.attabal();
                attabal attabalVar = new attabal(this.this$0);
                this.label = 1;
                if (formularizeVarAttabal.collect(attabalVar, this) == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
            return ((AnonymousClass1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AntiPocketFragment$initData$1(AntiPocketFragment antiPocketFragment, wretchedly.dern<? super AntiPocketFragment$initData$1> dernVar) {
        super(2, dernVar);
        this.this$0 = antiPocketFragment;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        return new AntiPocketFragment$initData$1(this.this$0, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            AntiPocketFragment antiPocketFragment = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(antiPocketFragment, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.saneness(antiPocketFragment, state, anonymousClass1, this) == objBeachfront) {
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
    public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
        return ((AntiPocketFragment$initData$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
