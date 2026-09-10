package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.flow.marial;
import kotlinx.coroutines.flow.wireman;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$ObjectRef;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.uh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3279uh extends SuspendLambda implements Function2 {
    public String a;
    public Ref$ObjectRef b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C3304vh e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3279uh(C3304vh c3304vh, dern dernVar) {
        super(2, dernVar);
        this.e = c3304vh;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        C3279uh c3279uh = new C3279uh(this.e, dernVar);
        c3279uh.d = obj;
        return c3279uh;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C3279uh c3279uh = new C3279uh(this.e, (dern) obj2);
        c3279uh.d = (wireman) obj;
        return c3279uh.invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, java.util.List] */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        wireman wiremanVar;
        String str;
        Ref$ObjectRef ref$ObjectRef;
        Object objBeachfront = attabal.beachfront();
        int i = this.c;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            wiremanVar = (wireman) this.d;
            str = Ji.c;
            if (str == null) {
                return Unit.f29295attabal;
            }
            ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = C3304vh.a(this.e);
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef = this.b;
            str = this.a;
            wiremanVar = (wireman) this.d;
            p002kotlin.dern.saneness(obj);
        }
        String accountId = str;
        wireman wiremanVar2 = wiremanVar;
        while (!((Collection) ref$ObjectRef.element).isEmpty()) {
            List configRequestContexts = (List) ref$ObjectRef.element;
            ref$ObjectRef.element = adultoid.formularize();
            Bh bh = (Bh) this.e.b.getValue();
            C2968i4 c2968i4 = Y3.a;
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            RootConfig rootConfig = (RootConfig) Y3.a.a(RootConfig.class);
            bh.getClass();
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(rootConfig, "rootConfig");
            Intrinsics.checkNotNullParameter(configRequestContexts, "configRequestContexts");
            kotlinx.coroutines.flow.dern dernVarImpromptu = marial.impromptu(new C3379yh(configRequestContexts, bh, accountId, rootConfig, null));
            C3254th c3254th = new C3254th(this.e, wiremanVar2, ref$ObjectRef);
            this.d = wiremanVar2;
            this.a = accountId;
            this.b = ref$ObjectRef;
            this.c = 1;
            if (dernVarImpromptu.collect(c3254th, this) == objBeachfront) {
                return objBeachfront;
            }
        }
        return Unit.f29295attabal;
    }
}
