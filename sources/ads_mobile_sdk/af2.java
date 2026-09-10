package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class af2 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bf2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af2(bf2 bf2Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.c = bf2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        af2 af2Var = new af2(this.c, dernVar);
        af2Var.b = obj;
        return af2Var;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        af2 af2Var = new af2(this.c, (wretchedly.dern) obj2);
        af2Var.b = (saran) obj;
        return af2Var.invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e A[PHI: r1
  0x002e: PHI (r1v4 kotlinx.coroutines.saran) = (r1v2 kotlinx.coroutines.saran), (r1v3 kotlinx.coroutines.saran), (r1v8 kotlinx.coroutines.saran) binds: [B:10:0x0026, B:17:0x0073, B:6:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Code duplicated, block: B:16:0x0069 A[PHI: r1
  0x0069: PHI (r1v3 kotlinx.coroutines.saran) = (r1v4 kotlinx.coroutines.saran), (r1v6 kotlinx.coroutines.saran) binds: [B:14:0x0066, B:9:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0073 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r1 = r9.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r1 = r9.b
            kotlinx.coroutines.saran r1 = (kotlinx.coroutines.saran) r1
            p002kotlin.dern.saneness(r10)
            goto L2e
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            java.lang.Object r1 = r9.b
            kotlinx.coroutines.saran r1 = (kotlinx.coroutines.saran) r1
            p002kotlin.dern.saneness(r10)
            goto L69
        L26:
            p002kotlin.dern.saneness(r10)
            java.lang.Object r10 = r9.b
            r1 = r10
            kotlinx.coroutines.saran r1 = (kotlinx.coroutines.saran) r1
        L2e:
            boolean r10 = kotlinx.coroutines.privatdozent.competently(r1)
            if (r10 == 0) goto L76
            ads_mobile_sdk.bf2 r10 = r9.c
            kotlinx.coroutines.selects.SelectImplementation r4 = new kotlinx.coroutines.selects.SelectImplementation
            kotlin.coroutines.CoroutineContext r5 = r9.getContext()
            r4.<init>(r5)
            long r5 = r10.b()
            long r5 = p002kotlin.time.saneness.adultoid(r5)
            ads_mobile_sdk.ye2 r7 = new ads_mobile_sdk.ye2
            r8 = 0
            r7.<init>(r8)
            kotlinx.coroutines.selects.saneness.attabal(r4, r5, r7)
            kotlinx.coroutines.channels.wireman r10 = r10.i
            kotlinx.coroutines.selects.beachfront r10 = r10.monoploid()
            ads_mobile_sdk.ze2 r5 = new ads_mobile_sdk.ze2
            r5.<init>(r8)
            r4.marial(r10, r5)
            r9.b = r1
            r9.a = r3
            java.lang.Object r10 = r4.kowloon(r9)
            if (r10 != r0) goto L69
            goto L75
        L69:
            ads_mobile_sdk.bf2 r10 = r9.c
            r9.b = r1
            r9.a = r2
            java.lang.Object r10 = r10.a(r9)
            if (r10 != r0) goto L2e
        L75:
            return r0
        L76:
            kotlin.Unit r10 = p002kotlin.Unit.f29295attabal
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.af2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
