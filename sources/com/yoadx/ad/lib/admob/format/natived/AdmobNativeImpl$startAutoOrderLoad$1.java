package com.yoadx.ad.lib.admob.format.natived;

import androidx.p001lifecycle.Lifecycle;
import androidx.p001lifecycle.RepeatOnLifecycleKt;
import androidx.p001lifecycle.trm;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.yoadx.ad.lib.bean.AdUnitConfig;
import com.yoadx.ad.lib.bean.LoadedAdObject;
import igo.wireman;
import java.util.List;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.flow.formularize;
import kotlinx.coroutines.saran;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: compiled from: AdmobNativeImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 0, 0})
@wireman(c = "com.yoadx.ad.lib.admob.format.natived.AdmobNativeImpl$startAutoOrderLoad$1", f = "AdmobNativeImpl.kt", l = {97}, m = "invokeSuspend")
public final class AdmobNativeImpl$startAutoOrderLoad$1 extends SuspendLambda implements Function2<saran, dern<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdmobNativeImpl this$0;

    /* JADX INFO: renamed from: com.yoadx.ad.lib.admob.format.natived.AdmobNativeImpl$startAutoOrderLoad$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: AdmobNativeImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 0, 0})
    @wireman(c = "com.yoadx.ad.lib.admob.format.natived.AdmobNativeImpl$startAutoOrderLoad$1$1", f = "AdmobNativeImpl.kt", l = {88}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<saran, dern<? super Unit>, Object> {
        int label;
        final /* synthetic */ AdmobNativeImpl this$0;

        /* JADX INFO: renamed from: com.yoadx.ad.lib.admob.format.natived.AdmobNativeImpl$startAutoOrderLoad$1$1$attabal */
        /* JADX INFO: compiled from: AdmobNativeImpl.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class attabal<T> implements kotlinx.coroutines.flow.wireman {

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final /* synthetic */ AdmobNativeImpl f23847kowloon;

            public attabal(AdmobNativeImpl admobNativeImpl) {
                this.f23847kowloon = admobNativeImpl;
            }

            @Override // kotlinx.coroutines.flow.wireman
            /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<? extends LoadedAdObject<NativeAd>> list, dern<? super Unit> dernVar) {
                dustman.attabal.f25384attabal.attabal(this.f23847kowloon.TAG, "cache ad size: " + list.size());
                return Unit.f29295attabal;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdmobNativeImpl admobNativeImpl, dern<? super AnonymousClass1> dernVar) {
            super(2, dernVar);
            this.this$0 = admobNativeImpl;
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final dern<Unit> create(Object obj, dern<?> dernVar) {
            return new AnonymousClass1(this.this$0, dernVar);
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
            int i = this.label;
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                formularize<List<LoadedAdObject<NativeAd>>> formularizeVarTaiyuan = this.this$0.taiyuan();
                attabal attabalVar = new attabal(this.this$0);
                this.label = 1;
                if (formularizeVarTaiyuan.collect(attabalVar, this) == objBeachfront) {
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
        public final Object invoke(saran saranVar, dern<? super Unit> dernVar) {
            return ((AnonymousClass1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
        }
    }

    /* JADX INFO: renamed from: com.yoadx.ad.lib.admob.format.natived.AdmobNativeImpl$startAutoOrderLoad$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: AdmobNativeImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 0, 0})
    @wireman(c = "com.yoadx.ad.lib.admob.format.natived.AdmobNativeImpl$startAutoOrderLoad$1$3", f = "AdmobNativeImpl.kt", l = {98, 107, 114, 116}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<saran, dern<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ AdmobNativeImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AdmobNativeImpl admobNativeImpl, dern<? super AnonymousClass3> dernVar) {
            super(2, dernVar);
            this.this$0 = admobNativeImpl;
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final dern<Unit> create(Object obj, dern<?> dernVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, dernVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:38:0x00da  */
        /* JADX WARN: Code duplicated, block: B:41:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:42:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:45:0x0104  */
        /* JADX WARN: Code duplicated, block: B:49:0x00bb A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:50:0x00d8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:27:0x00a4->B:51:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d6 -> B:19:0x0074). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f2 -> B:16:0x005c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0104 -> B:46:0x0105). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 268
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yoadx.ad.lib.admob.format.natived.AdmobNativeImpl$startAutoOrderLoad$1.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(saran saranVar, dern<? super Unit> dernVar) {
            return ((AnonymousClass3) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdmobNativeImpl$startAutoOrderLoad$1(AdmobNativeImpl admobNativeImpl, dern<? super AdmobNativeImpl$startAutoOrderLoad$1> dernVar) {
        super(2, dernVar);
        this.this$0 = admobNativeImpl;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern<Unit> create(Object obj, dern<?> dernVar) {
        AdmobNativeImpl$startAutoOrderLoad$1 admobNativeImpl$startAutoOrderLoad$1 = new AdmobNativeImpl$startAutoOrderLoad$1(this.this$0, dernVar);
        admobNativeImpl$startAutoOrderLoad$1.L$0 = obj;
        return admobNativeImpl$startAutoOrderLoad$1;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            cutely.wireman((saran) this.L$0, null, null, new AnonymousClass1(this.this$0, null), 3, null);
            for (AdUnitConfig adUnitConfig : this.this$0.impromptu()) {
                adUnitConfig.setColdNoFillTime((((long) adUnitConfig.getMinColdNoFillSec()) * 1000) / ((long) 2));
            }
            Lifecycle lifecycle = trm.INSTANCE.attabal().getLifecycle();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.attabal(lifecycle, state, anonymousClass3, this) == objBeachfront) {
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
        return ((AdmobNativeImpl$startAutoOrderLoad$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
