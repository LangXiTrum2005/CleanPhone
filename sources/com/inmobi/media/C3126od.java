package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.od, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3126od extends SuspendLambda implements Function2 {
    public final /* synthetic */ C3151pd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3126od(C3151pd c3151pd, dern dernVar) {
        super(2, dernVar);
        this.a = c3151pd;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3126od(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3126od(this.a, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        InterfaceC3072m9 interfaceC3072m9L = this.a.l();
        if (interfaceC3072m9L != null) {
            ((C3097n9) interfaceC3072m9L).a("AUM-NativeLoadedState", "Initialize - notifying publisher of load success");
        }
        C3151pd c3151pd = this.a;
        Hc hc = c3151pd.i;
        C2799be c2799be = c3151pd.f;
        G g = c3151pd.a.b;
        hc.a(c2799be, new AdMetaInfo(g.e, g.l));
        return Unit.f29295attabal;
    }
}
