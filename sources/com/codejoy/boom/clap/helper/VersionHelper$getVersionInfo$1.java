package com.codejoy.boom.clap.helper;

import incidentally.VersionResponse;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import tetrahedral.triweekly;

/* JADX INFO: compiled from: VersionHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 2, 0})
@igo.wireman(c = "com.codejoy.boom.clap.helper.VersionHelper$getVersionInfo$1", f = "VersionHelper.kt", l = {35}, m = "invokeSuspend", v = 1)
public final class VersionHelper$getVersionInfo$1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
    Object L$0;
    int label;

    /* JADX INFO: renamed from: com.codejoy.boom.clap.helper.VersionHelper$getVersionInfo$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: VersionHelper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/wireman;", "Lincidentally/attabal;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/wireman;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 2, 0})
    @igo.wireman(c = "com.codejoy.boom.clap.helper.VersionHelper$getVersionInfo$1$1", f = "VersionHelper.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements triweekly<kotlinx.coroutines.flow.wireman<? super VersionResponse>, Throwable, wretchedly.dern<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(wretchedly.dern<? super AnonymousClass1> dernVar) {
            super(3, dernVar);
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th = (Throwable) this.L$0;
            p002kotlin.coroutines.intrinsics.attabal.beachfront();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
            dern dernVar = dern.f18260attabal;
            String str = VersionHelper.TAG;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            dernVar.saneness(str, "getVersionInfo  ex: " + th.getMessage());
            return Unit.f29295attabal;
        }

        @Override // tetrahedral.triweekly
        public final Object invoke(kotlinx.coroutines.flow.wireman<? super VersionResponse> wiremanVar, Throwable th, wretchedly.dern<? super Unit> dernVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dernVar);
            anonymousClass1.L$0 = th;
            return anonymousClass1.invokeSuspend(Unit.f29295attabal);
        }
    }

    /* JADX INFO: compiled from: VersionHelper.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class attabal<T> implements kotlinx.coroutines.flow.wireman {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final attabal<T> f18249kowloon = new attabal<>();

        @Override // kotlinx.coroutines.flow.wireman
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public final Object emit(VersionResponse versionResponse, wretchedly.dern<? super Unit> dernVar) {
            dern dernVar2 = dern.f18260attabal;
            String str = VersionHelper.TAG;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            dernVar2.saneness(str, "getVersionInfo, isNewVersion: " + versionResponse.getIsNew());
            tau.saneness.f38666attabal.creditor(versionResponse);
            VersionHelper.versionInfo = versionResponse;
            return Unit.f29295attabal;
        }
    }

    public VersionHelper$getVersionInfo$1(wretchedly.dern<? super VersionHelper$getVersionInfo$1> dernVar) {
        super(2, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        return new VersionHelper$getVersionInfo$1(dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            VersionResponse versionResponseMolybdenite = tau.saneness.f38666attabal.molybdenite();
            if (versionResponseMolybdenite != null) {
                VersionHelper.versionInfo = versionResponseMolybdenite;
                return Unit.f29295attabal;
            }
            kotlinx.coroutines.flow.dern dernVarBeachfront = kotlinx.coroutines.flow.marial.beachfront(spatterdash.attabal.Companion.saneness(spatterdash.attabal.INSTANCE, null, 1, null).dern(), new AnonymousClass1(null));
            kotlinx.coroutines.flow.wireman wiremanVar = attabal.f18249kowloon;
            this.L$0 = igo.impromptu.attabal(versionResponseMolybdenite);
            this.label = 1;
            if (dernVarBeachfront.collect(wiremanVar, this) == objBeachfront) {
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
        return ((VersionHelper$getVersionInfo$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
