package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import java.util.LinkedHashSet;
import java.util.Objects;
import kotlinx.coroutines.walach;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Jk {
    public static final Jk a = new Jk();
    public static final C3180qh b = new C3180qh();
    public static final LinkedHashSet c = new LinkedHashSet();
    public static walach d;
    public static Mk e;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (a((wretchedly.dern) r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p002kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.inmobi.media.Fk
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.Fk r0 = (com.inmobi.media.Fk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            com.inmobi.media.Fk r0 = new com.inmobi.media.Fk
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p002kotlin.dern.saneness(r7)
            goto L55
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            p002kotlin.dern.saneness(r7)
            goto L4c
        L38:
            p002kotlin.dern.saneness(r7)
            com.inmobi.media.qh r7 = com.inmobi.media.Jk.b
            com.inmobi.media.Gk r2 = new com.inmobi.media.Gk
            r5 = 0
            r2.<init>(r5)
            r0.c = r4
            java.lang.Object r7 = com.inmobi.media.F3.a(r7, r2, r0)
            if (r7 != r1) goto L4c
            goto L54
        L4c:
            r0.c = r3
            java.lang.Object r7 = a(r0)
            if (r7 != r1) goto L55
        L54:
            return r1
        L55:
            kotlin.Unit r7 = p002kotlin.Unit.f29295attabal
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Jk.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static Object a(dern dernVar) {
        C3180qh c3180qh = Yi.a;
        C2968i4 c2968i4 = Y3.a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        SignalsConfig.UnifiedIdServiceConfig unifiedIdServiceConfig = ((SignalsConfig) Y3.a.a(SignalsConfig.class)).getUnifiedIdServiceConfig();
        unifiedIdServiceConfig.getUrl();
        Object objA = F3.a(b, new Hk(unifiedIdServiceConfig, null), dernVar);
        return objA == attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    public static Object a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, dern dernVar) {
        if (inMobiUnifiedIdInterface != null) {
            igo.attabal.attabal(c.add(inMobiUnifiedIdInterface));
        }
        if (b.b.get() != null) {
            Objects.toString(inMobiUnifiedIdInterface);
            return Unit.f29295attabal;
        }
        Object objA = a(dernVar);
        return objA == attabal.beachfront() ? objA : Unit.f29295attabal;
    }
}
