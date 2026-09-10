package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import java.util.List;
import kotlinx.coroutines.channels.kowloon;
import kotlinx.coroutines.sakeen;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.yh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3379yh extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Bh d;
    public final /* synthetic */ String e;
    public final /* synthetic */ RootConfig f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3379yh(List list, Bh bh, String str, RootConfig rootConfig, dern dernVar) {
        super(2, dernVar);
        this.c = list;
        this.d = bh;
        this.e = str;
        this.f = rootConfig;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        C3379yh c3379yh = new C3379yh(this.c, this.d, this.e, this.f, dernVar);
        c3379yh.b = obj;
        return c3379yh;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3379yh) create((kowloon) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            C3354xh c3354xh = new C3354xh(this.c, this.d, this.e, this.f, (kowloon) this.b, null);
            this.a = 1;
            if (sakeen.dern(c3354xh, this) == objBeachfront) {
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
}
