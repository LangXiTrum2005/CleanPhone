package com.inmobi.media;

import igo.beachfront;
import kotlinx.coroutines.kowloon;
import okhttp3.marial;
import okhttp3.preprohormone;
import okhttp3.rotuma;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.w4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3316w4 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ rotuma b;
    public final /* synthetic */ preprohormone c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3316w4(rotuma rotumaVar, preprohormone preprohormoneVar, dern dernVar) {
        super(2, dernVar);
        this.b = rotumaVar;
        this.c = preprohormoneVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3316w4(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3316w4(this.b, this.c, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
            return obj;
        }
        p002kotlin.dern.saneness(obj);
        marial marialVarAttabal = this.b.attabal(this.c);
        Intrinsics.checkNotNullExpressionValue(marialVarAttabal, "newCall(...)");
        this.a = 1;
        kowloon kowloonVar = new kowloon(IntrinsicsKt__IntrinsicsJvmKt.dern(this), 1);
        kowloonVar.kattegat();
        kowloonVar.beachfront(new C2832cl(marialVarAttabal));
        marialVarAttabal.privatdozent(new C2858dl(kowloonVar));
        Object objCuirassed = kowloonVar.cuirassed();
        if (objCuirassed == attabal.beachfront()) {
            beachfront.dern(this);
        }
        return objCuirassed == objBeachfront ? objBeachfront : objCuirassed;
    }
}
