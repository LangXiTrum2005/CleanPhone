package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class og extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ug b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og(ug ugVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = ugVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new og(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new og(this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bd, code lost:
    
        if (r3.a(r7, r1, r6) == r0) goto L37;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r1 = r6.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            p002kotlin.dern.saneness(r7)
            goto Lc0
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            p002kotlin.dern.saneness(r7)
            goto L3c
        L1f:
            p002kotlin.dern.saneness(r7)
            ads_mobile_sdk.ug r7 = r6.b
            ads_mobile_sdk.yf r7 = r7.b
            saneness.delouse r7 = r7.a
            java.lang.Object r7 = r7.get()
            androidx.datastore.core.competently r7 = (androidx.datastore.core.competently) r7
            kotlinx.coroutines.flow.dern r7 = r7.getData()
            r6.a = r3
            java.lang.Object r7 = kotlinx.coroutines.flow.marial.graveside(r7, r6)
            if (r7 != r0) goto L3c
            goto Lbf
        L3c:
            ads_mobile_sdk.vf r7 = (ads_mobile_sdk.vf) r7
            if (r7 != 0) goto L43
            kotlin.Unit r7 = p002kotlin.Unit.f29295attabal
            return r7
        L43:
            java.lang.String r1 = r7.u()
            java.lang.String r3 = "getAppSettingsJson(...)"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            int r1 = r1.length()
            if (r1 != 0) goto L55
            kotlin.Unit r7 = p002kotlin.Unit.f29295attabal
            return r7
        L55:
            ads_mobile_sdk.ug r1 = r6.b
            ads_mobile_sdk.jk0 r1 = r1.d
            r1.getClass()
            java.lang.String r3 = "key"
            java.lang.String r4 = "gads:app_settings_expiry_check_on_init:enabled"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            ads_mobile_sdk.jk r5 = ads_mobile_sdk.zk.b
            java.lang.Object r1 = r1.a(r4, r3, r5)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L7e
            ads_mobile_sdk.ug r1 = r6.b
            boolean r1 = r1.a(r7)
            if (r1 != 0) goto L7e
            kotlin.Unit r7 = p002kotlin.Unit.f29295attabal
            return r7
        L7e:
            com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L95
            r1.<init>()     // Catch: java.lang.Exception -> L95
            java.lang.String r3 = r7.u()     // Catch: java.lang.Exception -> L95
            java.lang.Class<com.google.gson.JsonObject> r4 = com.google.gson.JsonObject.class
            java.lang.Object r1 = r1.fromJson(r3, r4)     // Catch: java.lang.Exception -> L95
            java.lang.String r3 = "fromJson(...)"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)     // Catch: java.lang.Exception -> L95
            com.google.gson.JsonObject r1 = (com.google.gson.JsonObject) r1     // Catch: java.lang.Exception -> L95
            goto Lb3
        L95:
            r1 = move-exception
            java.lang.String r3 = "t"
            ads_mobile_sdk.o12 r3 = saneness.rajahmundry.attabal(r1, r3, r1)
            java.util.List r3 = r3.s
            java.lang.String r4 = r1.getMessage()
            if (r4 != 0) goto Lac
            java.lang.Class r1 = r1.getClass()
            java.lang.String r4 = r1.getName()
        Lac:
            p002kotlin.jvm.internal.Intrinsics.beachfront(r4)
            r3.add(r4)
            r1 = 0
        Lb3:
            if (r1 == 0) goto Lc0
            ads_mobile_sdk.ug r3 = r6.b
            r6.a = r2
            java.lang.Object r7 = r3.a(r7, r1, r6)
            if (r7 != r0) goto Lc0
        Lbf:
            return r0
        Lc0:
            kotlin.Unit r7 = p002kotlin.Unit.f29295attabal
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.og.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
