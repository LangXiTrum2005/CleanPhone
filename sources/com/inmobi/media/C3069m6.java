package com.inmobi.media;

import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.m6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3069m6 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Le c;
    public final /* synthetic */ int d;
    public final /* synthetic */ C2868e6 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ int g;
    public final /* synthetic */ long h;
    public final /* synthetic */ Ak i;
    public final /* synthetic */ C3044l6 j;
    public final /* synthetic */ boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3069m6(long j, Le le, int i, C2868e6 c2868e6, String str, int i2, long j2, Ak ak, C3044l6 c3044l6, boolean z, dern dernVar) {
        super(2, dernVar);
        this.b = j;
        this.c = le;
        this.d = i;
        this.e = c2868e6;
        this.f = str;
        this.g = i2;
        this.h = j2;
        this.i = ak;
        this.j = c3044l6;
        this.k = z;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3069m6(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3069m6) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r14 == r0) goto L15;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3069m6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
