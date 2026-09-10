package com.inmobi.media;

import kotlinx.coroutines.monroe;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Ref$ObjectRef;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.j6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2994j6 extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ C3044l6 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Ref$ObjectRef d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2994j6(C3044l6 c3044l6, boolean z, Ref$ObjectRef ref$ObjectRef, dern dernVar) {
        super(1, dernVar);
        this.b = c3044l6;
        this.c = z;
        this.d = ref$ObjectRef;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(dern dernVar) {
        return new C2994j6(this.b, this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C2994j6) create((dern) obj)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        try {
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                C3044l6 c3044l6 = this.b;
                boolean z = this.c;
                this.a = 1;
                if (C3044l6.a(c3044l6, z, this) == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
            }
        } catch (Exception unused) {
            monroe monroeVar = (monroe) this.d.element;
            if (monroeVar != null) {
                monroe.attabal.attabal(monroeVar, null, 1, null);
            }
        }
        return Unit.f29295attabal;
    }
}
