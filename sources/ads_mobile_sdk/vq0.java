package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.tarantism;

/* JADX INFO: loaded from: classes.dex */
public final class vq0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ tarantism b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq0(tarantism tarantismVar, String str, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = tarantismVar;
        this.c = str;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new vq0(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new vq0(this.b, this.c, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (r1.a(r6, r5) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (ads_mobile_sdk.gk2.a(r6, r1, r3, r5) == r0) goto L24;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r1 = r5.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            p002kotlin.dern.saneness(r6)
            goto L7d
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            p002kotlin.dern.saneness(r6)
            goto L60
        L1e:
            p002kotlin.dern.saneness(r6)
            saneness.tarantism r6 = r5.b
            saneness.strother r6 = r6.c()
            if (r6 == 0) goto L38
            java.lang.String r1 = r5.c
            saneness.tarantism r4 = r5.b
            ads_mobile_sdk.gq0 r4 = r4.b()
            ads_mobile_sdk.gh1 r6 = (ads_mobile_sdk.gh1) r6
            java.lang.String r6 = r6.a(r4, r1)
            goto L39
        L38:
            r6 = 0
        L39:
            if (r6 == 0) goto L68
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "\n          let script = document.createElement('script');\n          script.type = 'text/javascript';\n          script.src = '"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = "';\n          if (document.head) {\n            document.head.appendChild(script);\n          } else {\n            document.addEventListener('DOMContentLoaded', function () {\n              document.head.appendChild(script);\n            });\n          }\n        "
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            saneness.tarantism r1 = r5.b
            ads_mobile_sdk.gq0 r1 = r1.b()
            r5.a = r3
            java.lang.Object r6 = r1.a(r6, r5)
            if (r6 != r0) goto L60
            goto L7c
        L60:
            saneness.tarantism r6 = r5.b
            r6.getClass()
            kotlin.Unit r6 = p002kotlin.Unit.f29295attabal
            return r6
        L68:
            saneness.tarantism r6 = r5.b
            ads_mobile_sdk.gk2 r6 = r6.d()
            if (r6 == 0) goto L7d
            java.lang.String r1 = r5.c
            ads_mobile_sdk.b10 r3 = ads_mobile_sdk.b10.AD_RESOURCE_CREATIVE
            r5.a = r2
            java.lang.Object r6 = ads_mobile_sdk.gk2.a(r6, r1, r3, r5)
            if (r6 != r0) goto L7d
        L7c:
            return r0
        L7d:
            kotlin.Unit r6 = p002kotlin.Unit.f29295attabal
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vq0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
