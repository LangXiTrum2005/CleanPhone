package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ro extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ vo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro(vo voVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = voVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new ro(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ro(this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:13:0x005f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005d -> B:14:0x0060). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r1 = r6.a
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            p002kotlin.dern.saneness(r7)
            goto L60
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            p002kotlin.dern.saneness(r7)
        L1a:
            ads_mobile_sdk.vo r7 = r6.b
            ads_mobile_sdk.jk0 r7 = r7.f
            r7.getClass()
            java.lang.String r1 = "gads:chrome_variations_refresh_enabled"
            java.lang.String r3 = "key"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            ads_mobile_sdk.jk r5 = ads_mobile_sdk.zk.b
            java.lang.Object r7 = r7.a(r1, r4, r5)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L66
            ads_mobile_sdk.vo r7 = r6.b
            ads_mobile_sdk.jk0 r7 = r7.f
            r7.getClass()
            kotlin.time.saneness$attabal r1 = p002kotlin.time.saneness.INSTANCE
            r1 = 30
            kotlin.time.DurationUnit r4 = p002kotlin.time.DurationUnit.MINUTES
            java.lang.String r5 = "gads:chrome_variations_refresh_interval_min"
            kotlin.time.saneness r1 = saneness.juju.attabal(r1, r4, r5, r3)
            ads_mobile_sdk.uk r3 = ads_mobile_sdk.zk.m
            java.lang.Object r7 = r7.a(r5, r1, r3)
            kotlin.time.saneness r7 = (p002kotlin.time.saneness) r7
            long r3 = r7.getRawValue()
            r6.a = r2
            java.lang.Object r7 = kotlinx.coroutines.splinterproof.saneness(r3, r6)
            if (r7 != r0) goto L60
            return r0
        L60:
            ads_mobile_sdk.vo r7 = r6.b
            ads_mobile_sdk.vo.a(r7)
            goto L1a
        L66:
            kotlin.Unit r7 = p002kotlin.Unit.f29295attabal
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ro.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
