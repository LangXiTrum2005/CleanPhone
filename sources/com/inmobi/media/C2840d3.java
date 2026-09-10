package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2840d3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ S2 b;
    public final /* synthetic */ HandlerC2917g3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2840d3(S2 s2, HandlerC2917g3 handlerC2917g3, dern dernVar) {
        super(2, dernVar);
        this.b = s2;
        this.c = handlerC2917g3;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2840d3(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C2840d3(this.b, this.c, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (r8 == r0) goto L20;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r1 = r7.a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            p002kotlin.dern.saneness(r8)
            goto L6e
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            p002kotlin.dern.saneness(r8)
            goto L4e
        L1f:
            p002kotlin.dern.saneness(r8)
            patroclinal.taiyuan r8 = com.inmobi.media.C3315w3.b
            java.lang.Object r8 = r8.getValue()
            com.inmobi.media.W2 r8 = (com.inmobi.media.W2) r8
            com.inmobi.media.S2 r1 = r7.b
            int r1 = r1.a
            r7.a = r4
            com.inmobi.media.g9 r8 = r8.a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.lang.String r5 = "click"
            java.lang.String r6 = "id=?"
            java.lang.Object r8 = r8.a(r5, r6, r1, r7)
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            if (r8 != r1) goto L49
            goto L4b
        L49:
            kotlin.Unit r8 = p002kotlin.Unit.f29295attabal
        L4b:
            if (r8 != r0) goto L4e
            goto L6d
        L4e:
            java.util.List r8 = com.inmobi.media.C3315w3.f
            com.inmobi.media.S2 r1 = r7.b
            r8.remove(r1)
            java.util.List r8 = com.inmobi.media.C3315w3.f
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L98
            patroclinal.taiyuan r8 = com.inmobi.media.C3315w3.b
            java.lang.Object r8 = r8.getValue()
            com.inmobi.media.W2 r8 = (com.inmobi.media.W2) r8
            r7.a = r3
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r0) goto L6e
        L6d:
            return r0
        L6e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L87
            android.os.Message r8 = android.os.Message.obtain()
            r8.what = r4
            com.inmobi.media.g3 r0 = r7.c
            boolean r8 = r0.sendMessage(r8)
            java.lang.Boolean r8 = igo.attabal.attabal(r8)
            return r8
        L87:
            com.inmobi.media.w3 r8 = com.inmobi.media.C3315w3.a
            java.lang.String r8 = "w3"
            java.lang.String r0 = "access$getTAG$p(...)"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            java.util.concurrent.atomic.AtomicBoolean r8 = com.inmobi.media.C3315w3.g
            r8.set(r2)
            kotlin.Unit r8 = p002kotlin.Unit.f29295attabal
            return r8
        L98:
            com.inmobi.media.g3 r8 = r7.c
            java.util.List r0 = com.inmobi.media.C3315w3.f
            java.lang.Object r0 = r0.get(r2)
            com.inmobi.media.S2 r0 = (com.inmobi.media.S2) r0
            int r1 = com.inmobi.media.HandlerC2917g3.a
            android.os.Message r1 = android.os.Message.obtain()
            if (r0 == 0) goto Laf
            boolean r2 = r0.e
            if (r2 != r4) goto Laf
            r3 = 3
        Laf:
            r1.what = r3
            r1.obj = r0
            r8.sendMessage(r1)
            kotlin.Unit r8 = p002kotlin.Unit.f29295attabal
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2840d3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
