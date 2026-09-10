package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3401ze extends SuspendLambda implements Function2 {
    public final /* synthetic */ Ae a;
    public final /* synthetic */ AdSessionConfiguration b;
    public final /* synthetic */ AdSessionContext c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3401ze(Ae ae, AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, dern dernVar) {
        super(2, dernVar);
        this.a = ae;
        this.b = adSessionConfiguration;
        this.c = adSessionContext;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3401ze(this.a, this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3401ze) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        Ae ae = this.a;
        AdSessionConfiguration adSessionConfiguration = this.b;
        Intrinsics.beachfront(adSessionConfiguration);
        AdSessionContext adSessionContext = this.c;
        int i = Ae.i;
        ae.a(adSessionConfiguration, adSessionContext);
        this.a.b();
        this.a.c();
        return Unit.f29295attabal;
    }
}
