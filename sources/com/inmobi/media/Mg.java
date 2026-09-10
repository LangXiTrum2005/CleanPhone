package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Mg extends SuspendLambda implements Function2 {
    public Map a;
    public int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ SignalsConfig.PublisherConfig d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mg(Map map, SignalsConfig.PublisherConfig publisherConfig, dern dernVar) {
        super(2, dernVar);
        this.c = map;
        this.d = publisherConfig;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new Mg(this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Mg(this.c, this.d, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0178, code lost:
    
        if (com.inmobi.media.Og.b(r13, r2, r0, r12) == r1) goto L70;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Mg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
