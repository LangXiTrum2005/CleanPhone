package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.mf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3078mf extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AdConfig.OmidConfig c;
    public final /* synthetic */ Context d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3078mf(AdConfig.OmidConfig omidConfig, Context context, dern dernVar) {
        super(2, dernVar);
        this.c = omidConfig;
        this.d = context;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        C3078mf c3078mf = new C3078mf(this.c, this.d, dernVar);
        c3078mf.b = obj;
        return c3078mf;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3078mf) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (r15 == r1) goto L33;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r0 = r14.a
            r2 = 0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L24
            if (r0 == r5) goto L1d
            if (r0 != r4) goto L15
            p002kotlin.dern.saneness(r15)
            goto Lb6
        L15:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1d:
            p002kotlin.dern.saneness(r15)     // Catch: java.lang.Throwable -> L21
            goto L62
        L21:
            r0 = move-exception
            r15 = r0
            goto L69
        L24:
            p002kotlin.dern.saneness(r15)
            java.lang.Object r15 = r14.b
            kotlinx.coroutines.saran r15 = (kotlinx.coroutines.saran) r15
            com.inmobi.media.core.config.models.AdConfig$OmidConfig r15 = r14.c
            kotlin.Result$attabal r0 = p002kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L21
            r14.a = r5     // Catch: java.lang.Throwable -> L21
            java.lang.String r7 = r15.getUrl()     // Catch: java.lang.Throwable -> L21
            int r0 = r15.getMaxRetries()     // Catch: java.lang.Throwable -> L21
            int r15 = r15.getRetryInterval()     // Catch: java.lang.Throwable -> L21
            kotlin.ranges.IntRange r6 = com.inmobi.media.Se.a     // Catch: java.lang.Throwable -> L21
            int r15 = r15 * 1000
            long r8 = (long) r15     // Catch: java.lang.Throwable -> L21
            com.inmobi.media.Je r6 = new com.inmobi.media.Je     // Catch: java.lang.Throwable -> L21
            com.inmobi.media.Ai r11 = new com.inmobi.media.Ai     // Catch: java.lang.Throwable -> L21
            r11.<init>(r0, r8, r3)     // Catch: java.lang.Throwable -> L21
            r12 = 0
            r13 = 46
            r8 = 0
            r9 = 0
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L21
            kotlinx.coroutines.merc r15 = kotlinx.coroutines.premeiotic.saneness()     // Catch: java.lang.Throwable -> L21
            com.inmobi.media.tf r0 = new com.inmobi.media.tf     // Catch: java.lang.Throwable -> L21
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L21
            java.lang.Object r15 = kotlinx.coroutines.impromptu.competently(r15, r0, r14)     // Catch: java.lang.Throwable -> L21
            if (r15 != r1) goto L62
            goto Lb5
        L62:
            java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Throwable -> L21
            java.lang.Object r15 = p002kotlin.Result.m3351constructorimpl(r15)     // Catch: java.lang.Throwable -> L21
            goto L73
        L69:
            kotlin.Result$attabal r0 = p002kotlin.Result.INSTANCE
            java.lang.Object r15 = p002kotlin.dern.attabal(r15)
            java.lang.Object r15 = p002kotlin.Result.m3351constructorimpl(r15)
        L73:
            java.lang.Throwable r0 = p002kotlin.Result.m3354exceptionOrNullimpl(r15)
            if (r0 == 0) goto L7e
            java.util.concurrent.atomic.AtomicInteger r0 = com.inmobi.media.C3153pf.b
            r0.set(r3)
        L7e:
            android.content.Context r0 = r14.d
            boolean r3 = p002kotlin.Result.m3357isSuccessimpl(r15)
            if (r3 == 0) goto Lb6
            r3 = r15
            java.lang.String r3 = (java.lang.String) r3
            java.util.concurrent.atomic.AtomicInteger r6 = com.inmobi.media.C3153pf.b
            r6.set(r5)
            com.inmobi.media.sf r5 = com.inmobi.media.C3153pf.c
            if (r5 != 0) goto L99
            com.inmobi.media.sf r5 = new com.inmobi.media.sf
            r5.<init>(r0)
            com.inmobi.media.C3153pf.c = r5
        L99:
            r14.b = r15
            r14.a = r4
            kotlinx.coroutines.merc r15 = kotlinx.coroutines.premeiotic.saneness()
            com.inmobi.media.rf r0 = new com.inmobi.media.rf
            r0.<init>(r5, r3, r2)
            java.lang.Object r15 = kotlinx.coroutines.impromptu.competently(r15, r0, r14)
            java.lang.Object r0 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            if (r15 != r0) goto Lb1
            goto Lb3
        Lb1:
            kotlin.Unit r15 = p002kotlin.Unit.f29295attabal
        Lb3:
            if (r15 != r1) goto Lb6
        Lb5:
            return r1
        Lb6:
            kotlin.Unit r15 = p002kotlin.Unit.f29295attabal
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3078mf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
