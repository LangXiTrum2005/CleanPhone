package com.charging.screenshow.battery.animations.themes.vm;

import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.entity.ChargingCategoryBean;
import com.charging.screenshow.battery.animations.themes.utils.ext.IntExt;
import com.thinkup.core.common.n.mo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.charging.screenshow.battery.animations.themes.vm.ChargingCategoryVM$refresh$1", f = "ChargingCategoryVM.kt", l = {mo.oom.ooo, mo.oom.oom, 76, mo.oom.ono}, m = "invokeSuspend")
final class ChargingCategoryVM$refresh$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Object f13346Y;
    public Object Z;
    public long e0;
    public int f0;
    public /* synthetic */ Object g0;
    public final /* synthetic */ ChargingCategoryVM h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargingCategoryVM$refresh$1(ChargingCategoryVM chargingCategoryVM, Continuation continuation) {
        super(2, continuation);
        this.h0 = chargingCategoryVM;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargingCategoryVM$refresh$1 chargingCategoryVM$refresh$1 = new ChargingCategoryVM$refresh$1(this.h0, continuation);
        chargingCategoryVM$refresh$1.g0 = obj;
        return chargingCategoryVM$refresh$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargingCategoryVM$refresh$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:29:0x0116  */
    /* JADX WARN: Code duplicated, block: B:32:0x012a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0148  */
    /* JADX WARN: Code duplicated, block: B:38:0x0166  */
    /* JADX WARN: Code duplicated, block: B:41:0x0184  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        Deferred deferredA;
        Deferred deferredA2;
        Object objR;
        ChargingCategoryVM chargingCategoryVM;
        Deferred deferred;
        Object objR2;
        Deferred deferred2;
        List list;
        ChargingCategoryVM chargingCategoryVM2;
        List list2;
        Object objR3;
        List list3;
        List list4;
        Deferred deferred3;
        List list5;
        Object objR4;
        List list6;
        List list7;
        List list8;
        boolean zIsEmpty;
        ArrayList arrayList;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.f0;
        ChargingCategoryVM chargingCategoryVM3 = this.h0;
        if (i2 == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.g0;
            jCurrentTimeMillis = System.currentTimeMillis();
            Deferred deferredA3 = BuildersKt.a(coroutineScope, null, new ChargingCategoryVM$refresh$1$time$1$deferred1$1(chargingCategoryVM3, null), 3);
            Deferred deferredA4 = BuildersKt.a(coroutineScope, null, new ChargingCategoryVM$refresh$1$time$1$deferred2$1(chargingCategoryVM3, null), 3);
            deferredA = BuildersKt.a(coroutineScope, null, new ChargingCategoryVM$refresh$1$time$1$deferred3$1(chargingCategoryVM3, null), 3);
            deferredA2 = BuildersKt.a(coroutineScope, null, new ChargingCategoryVM$refresh$1$time$1$deferred4$1(chargingCategoryVM3, null), 3);
            this.g0 = chargingCategoryVM3;
            this.X = deferredA4;
            this.f13346Y = deferredA;
            this.Z = deferredA2;
            this.e0 = jCurrentTimeMillis;
            this.f0 = 1;
            objR = deferredA3.r(this);
            if (objR != coroutineSingletons) {
                chargingCategoryVM = chargingCategoryVM3;
                deferred = deferredA4;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            jCurrentTimeMillis = this.e0;
            deferredA2 = (Deferred) this.Z;
            Deferred deferred4 = (Deferred) this.f13346Y;
            deferred = (Deferred) this.X;
            chargingCategoryVM = (ChargingCategoryVM) this.g0;
            ResultKt.b(obj);
            deferredA = deferred4;
            objR = obj;
        } else {
            if (i2 == 2) {
                long j = this.e0;
                list = (List) this.Z;
                Deferred deferred5 = (Deferred) this.f13346Y;
                Deferred deferred6 = (Deferred) this.X;
                chargingCategoryVM2 = (ChargingCategoryVM) this.g0;
                ResultKt.b(obj);
                deferredA = deferred6;
                objR2 = obj;
                deferred2 = deferred5;
                jCurrentTimeMillis = j;
                list2 = (List) objR2;
                this.g0 = chargingCategoryVM2;
                this.X = deferred2;
                this.f13346Y = list;
                this.Z = list2;
                this.e0 = jCurrentTimeMillis;
                this.f0 = 3;
                objR3 = deferredA.r(this);
                if (objR3 != coroutineSingletons) {
                    Deferred deferred7 = deferred2;
                    list3 = list;
                    list4 = list2;
                    deferred3 = deferred7;
                    list5 = (List) objR3;
                    this.g0 = chargingCategoryVM2;
                    this.X = list3;
                    this.f13346Y = list4;
                    this.Z = list5;
                    this.e0 = jCurrentTimeMillis;
                    this.f0 = 4;
                    objR4 = deferred3.r(this);
                    if (objR4 != coroutineSingletons) {
                        list6 = list5;
                        list7 = list3;
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                long j2 = this.e0;
                List list9 = (List) this.Z;
                list3 = (List) this.f13346Y;
                Deferred deferred8 = (Deferred) this.X;
                ChargingCategoryVM chargingCategoryVM4 = (ChargingCategoryVM) this.g0;
                ResultKt.b(obj);
                chargingCategoryVM2 = chargingCategoryVM4;
                objR3 = obj;
                list4 = list9;
                deferred3 = deferred8;
                jCurrentTimeMillis = j2;
                list5 = (List) objR3;
                this.g0 = chargingCategoryVM2;
                this.X = list3;
                this.f13346Y = list4;
                this.Z = list5;
                this.e0 = jCurrentTimeMillis;
                this.f0 = 4;
                objR4 = deferred3.r(this);
                if (objR4 != coroutineSingletons) {
                    list6 = list5;
                    list7 = list3;
                }
                return coroutineSingletons;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list6 = (List) this.Z;
            list4 = (List) this.f13346Y;
            list7 = (List) this.X;
            ChargingCategoryVM chargingCategoryVM5 = (ChargingCategoryVM) this.g0;
            ResultKt.b(obj);
            chargingCategoryVM2 = chargingCategoryVM5;
            objR4 = obj;
        }
        list8 = (List) objR4;
        chargingCategoryVM2.f13345e.clear();
        zIsEmpty = list6.isEmpty();
        arrayList = chargingCategoryVM2.f13345e;
        if (!zIsEmpty) {
            ChargingCategoryBean chargingCategoryBean = new ChargingCategoryBean();
            chargingCategoryBean.k(IntExt.c(R.string.cool));
            chargingCategoryBean.i(list6);
            arrayList.add(chargingCategoryBean);
        }
        if (!list4.isEmpty()) {
            ChargingCategoryBean chargingCategoryBean2 = new ChargingCategoryBean();
            chargingCategoryBean2.k(IntExt.c(R.string.three_d_charging));
            chargingCategoryBean2.i(list4);
            arrayList.add(chargingCategoryBean2);
        }
        if (!list7.isEmpty()) {
            ChargingCategoryBean chargingCategoryBean3 = new ChargingCategoryBean();
            chargingCategoryBean3.k(IntExt.c(R.string.recommend));
            chargingCategoryBean3.i(list7);
            arrayList.add(chargingCategoryBean3);
        }
        if (!list8.isEmpty()) {
            ChargingCategoryBean chargingCategoryBean4 = new ChargingCategoryBean();
            chargingCategoryBean4.k(IntExt.c(R.string.new_trending));
            chargingCategoryBean4.i(list8);
            arrayList.add(chargingCategoryBean4);
        }
        System.currentTimeMillis();
        chargingCategoryVM3.f.set(false);
        chargingCategoryVM3.d.k(chargingCategoryVM3.f13345e);
        return Unit.f43263a;
        List list10 = (List) objR;
        this.g0 = chargingCategoryVM;
        this.X = deferredA;
        this.f13346Y = deferredA2;
        this.Z = list10;
        this.e0 = jCurrentTimeMillis;
        this.f0 = 2;
        objR2 = deferred.r(this);
        if (objR2 != coroutineSingletons) {
            deferred2 = deferredA2;
            list = list10;
            chargingCategoryVM2 = chargingCategoryVM;
            list2 = (List) objR2;
            this.g0 = chargingCategoryVM2;
            this.X = deferred2;
            this.f13346Y = list;
            this.Z = list2;
            this.e0 = jCurrentTimeMillis;
            this.f0 = 3;
            objR3 = deferredA.r(this);
            if (objR3 != coroutineSingletons) {
                Deferred deferred9 = deferred2;
                list3 = list;
                list4 = list2;
                deferred3 = deferred9;
                list5 = (List) objR3;
                this.g0 = chargingCategoryVM2;
                this.X = list3;
                this.f13346Y = list4;
                this.Z = list5;
                this.e0 = jCurrentTimeMillis;
                this.f0 = 4;
                objR4 = deferred3.r(this);
                if (objR4 != coroutineSingletons) {
                    list6 = list5;
                    list7 = list3;
                    list8 = (List) objR4;
                    chargingCategoryVM2.f13345e.clear();
                    zIsEmpty = list6.isEmpty();
                    arrayList = chargingCategoryVM2.f13345e;
                    if (!zIsEmpty) {
                        ChargingCategoryBean chargingCategoryBean5 = new ChargingCategoryBean();
                        chargingCategoryBean5.k(IntExt.c(R.string.cool));
                        chargingCategoryBean5.i(list6);
                        arrayList.add(chargingCategoryBean5);
                    }
                    if (!list4.isEmpty()) {
                        ChargingCategoryBean chargingCategoryBean6 = new ChargingCategoryBean();
                        chargingCategoryBean6.k(IntExt.c(R.string.three_d_charging));
                        chargingCategoryBean6.i(list4);
                        arrayList.add(chargingCategoryBean6);
                    }
                    if (!list7.isEmpty()) {
                        ChargingCategoryBean chargingCategoryBean7 = new ChargingCategoryBean();
                        chargingCategoryBean7.k(IntExt.c(R.string.recommend));
                        chargingCategoryBean7.i(list7);
                        arrayList.add(chargingCategoryBean7);
                    }
                    if (!list8.isEmpty()) {
                        ChargingCategoryBean chargingCategoryBean8 = new ChargingCategoryBean();
                        chargingCategoryBean8.k(IntExt.c(R.string.new_trending));
                        chargingCategoryBean8.i(list8);
                        arrayList.add(chargingCategoryBean8);
                    }
                    System.currentTimeMillis();
                    chargingCategoryVM3.f.set(false);
                    chargingCategoryVM3.d.k(chargingCategoryVM3.f13345e);
                    return Unit.f43263a;
                }
            }
        }
        return coroutineSingletons;
    }
}
