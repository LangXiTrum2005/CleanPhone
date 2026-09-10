package com.inmobi.media;

import android.widget.ProgressBar;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.an, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2782an extends SuspendLambda implements Function2 {
    public int a;
    public int b;
    public int c;
    public long d;
    public float e;
    public ProgressBar f;
    public int g;
    public final /* synthetic */ ProgressBar h;
    public final /* synthetic */ C2808bn i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2782an(ProgressBar progressBar, C2808bn c2808bn, int i, dern dernVar) {
        super(2, dernVar);
        this.h = progressBar;
        this.i = c2808bn;
        this.j = i;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2782an(this.h, this.i, this.j, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2782an) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0068 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0066 -> B:13:0x0069). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r1 = r13.g
            r2 = 1
            if (r1 == 0) goto L23
            if (r1 != r2) goto L1b
            int r1 = r13.c
            int r3 = r13.b
            float r4 = r13.e
            long r5 = r13.d
            int r7 = r13.a
            android.widget.ProgressBar r8 = r13.f
            p002kotlin.dern.saneness(r14)
            goto L69
        L1b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L23:
            p002kotlin.dern.saneness(r14)
            android.widget.ProgressBar r14 = r13.h
            int r14 = r14.getProgress()
            com.inmobi.media.bn r1 = r13.i
            com.inmobi.media.Fg r1 = r1.c
            long r3 = r1.f
            r1 = 10
            long r5 = (long) r1
            long r3 = r3 / r5
            int r5 = r13.j
            int r5 = r5 - r14
            float r5 = (float) r5
            r6 = 1092616192(0x41200000, float:10.0)
            float r5 = r5 / r6
            android.widget.ProgressBar r6 = r13.h
            r7 = 0
            r8 = r6
            r10 = r7
            r7 = r14
            r11 = r3
            r3 = r1
            r4 = r5
            r1 = r10
            r5 = r11
        L48:
            if (r1 >= r3) goto L6b
            float r14 = (float) r7
            int r9 = r1 + 1
            float r9 = (float) r9
            float r9 = r9 * r4
            float r9 = r9 + r14
            int r14 = (int) r9
            com.inmobi.media.AbstractC3310vn.a(r8, r14)
            r13.f = r8
            r13.a = r7
            r13.d = r5
            r13.e = r4
            r13.b = r3
            r13.c = r1
            r13.g = r2
            java.lang.Object r14 = kotlinx.coroutines.splinterproof.attabal(r5, r13)
            if (r14 != r0) goto L69
            return r0
        L69:
            int r1 = r1 + r2
            goto L48
        L6b:
            kotlin.Unit r14 = p002kotlin.Unit.f29295attabal
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2782an.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
