package com.codejoy.boom.clap.module.result;

import java.util.Objects;
import kotlinx.coroutines.flow.dovishness;
import kotlinx.coroutines.saran;
import org.objectweb.asm.Opcodes;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ActivateResultActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 2, 0})
@igo.wireman(c = "com.codejoy.boom.clap.module.result.ActivateResultActivity$observeUiState$1", f = "ActivateResultActivity.kt", l = {Opcodes.NEWARRAY}, m = "invokeSuspend", v = 1)
public final class ActivateResultActivity$observeUiState$1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivateResultActivity this$0;

    /* JADX INFO: compiled from: ActivateResultActivity.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class attabal<T> implements kotlinx.coroutines.flow.wireman {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ ActivateResultActivity f18400kowloon;

        public attabal(ActivateResultActivity activateResultActivity) {
            this.f18400kowloon = activateResultActivity;
        }

        @Override // kotlinx.coroutines.flow.wireman
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public final Object emit(cutely cutelyVar, wretchedly.dern<? super Unit> dernVar) {
            Objects.toString(cutelyVar);
            if (!(cutelyVar instanceof cutely.wireman)) {
                if (cutelyVar instanceof cutely.Countdown) {
                    this.f18400kowloon.technofreak(((cutely.Countdown) cutelyVar).getRemainingSeconds());
                } else if (cutelyVar instanceof cutely.attabal) {
                    this.f18400kowloon.outmarry(true);
                    this.f18400kowloon.nosophobia();
                } else {
                    if (!(cutelyVar instanceof cutely.dern)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f18400kowloon.outmarry(false);
                    this.f18400kowloon.nosophobia();
                }
            }
            return Unit.f29295attabal;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateResultActivity$observeUiState$1(ActivateResultActivity activateResultActivity, wretchedly.dern<? super ActivateResultActivity$observeUiState$1> dernVar) {
        super(2, dernVar);
        this.this$0 = activateResultActivity;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        return new ActivateResultActivity$observeUiState$1(this.this$0, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            dovishness<cutely> dovishnessVarImpromptu = this.this$0.czestochowa().impromptu();
            attabal attabalVar = new attabal(this.this$0);
            this.label = 1;
            if (dovishnessVarImpromptu.collect(attabalVar, this) == objBeachfront) {
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
        return ((ActivateResultActivity$observeUiState$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
