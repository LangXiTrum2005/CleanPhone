package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.vm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3309vm extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ double d;
    public final /* synthetic */ AdConfig.VastVideoConfig e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3309vm(ArrayList arrayList, double d, AdConfig.VastVideoConfig vastVideoConfig, dern dernVar) {
        super(2, dernVar);
        this.c = arrayList;
        this.d = d;
        this.e = vastVideoConfig;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        C3309vm c3309vm = new C3309vm(this.c, this.d, this.e, dernVar);
        c3309vm.b = obj;
        return c3309vm;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3309vm) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objAttabal;
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            saran saranVar = (saran) this.b;
            if (this.c.isEmpty()) {
                return adultoid.formularize();
            }
            int iA = AbstractC3367y5.a();
            Pe peA = AbstractC3366y4.a();
            ArrayList arrayList = this.c;
            double d = this.d;
            AdConfig.VastVideoConfig vastVideoConfig = this.e;
            ArrayList arrayList2 = new ArrayList(dovishness.gintrap(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(cutely.saneness(saranVar, null, null, new C3259tm((C3159pl) it.next(), d, peA, iA, vastVideoConfig, null), 3, null));
                peA = peA;
                vastVideoConfig = vastVideoConfig;
                d = d;
            }
            this.a = 1;
            objAttabal = AwaitKt.attabal(arrayList2, this);
            if (objAttabal == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
            objAttabal = obj;
        }
        List list = CollectionsKt.setterwort((Iterable) objAttabal, new C3284um());
        ArrayList arrayList3 = new ArrayList(dovishness.gintrap(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add((C3159pl) ((Pair) it2.next()).getFirst());
        }
        return arrayList3;
    }
}
