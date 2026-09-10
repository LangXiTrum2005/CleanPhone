package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.adultoid;
import saneness.coffeecake;
import saneness.rockless;

/* JADX INFO: loaded from: classes.dex */
public final class jr1 implements rockless {
    public final jk0 a;
    public final adultoid b;

    public jr1(jk0 flags, coffeecake singletonEngineProvider) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(singletonEngineProvider, "singletonEngineProvider");
        this.a = flags;
        this.b = singletonEngineProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (r8.d(r0) == r1) goto L26;
     */
    @Override // saneness.rockless
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(complexometry.formularize r8, wretchedly.dern r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.ir1
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.ir1 r0 = (ads_mobile_sdk.ir1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.ir1 r0 = new ads_mobile_sdk.ir1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p002kotlin.dern.saneness(r9)
            goto L7d
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            ads_mobile_sdk.jr1 r8 = r0.a
            p002kotlin.dern.saneness(r9)
            goto L69
        L3a:
            p002kotlin.dern.saneness(r9)
            ads_mobile_sdk.jk0 r9 = r7.a
            r9.getClass()
            java.lang.String r2 = "key"
            java.lang.String r5 = "gads:preload_native_singleton:enabled"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            ads_mobile_sdk.jk r6 = ads_mobile_sdk.zk.b
            java.lang.Object r9 = r9.a(r5, r2, r6)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L80
            boolean r8 = r8 instanceof com.google.android.libraries.ads.mobile.sdk.nativead.dern
            if (r8 == 0) goto L80
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = kotlinx.coroutines.cosy.attabal(r0)
            if (r8 != r1) goto L68
            goto L7c
        L68:
            r8 = r7
        L69:
            saneness.adultoid r8 = r8.b
            java.lang.Object r8 = r8.get()
            ads_mobile_sdk.bu2 r8 = (ads_mobile_sdk.bu2) r8
            r9 = 0
            r0.a = r9
            r0.d = r3
            java.lang.Object r8 = r8.d(r0)
            if (r8 != r1) goto L7d
        L7c:
            return r1
        L7d:
            kotlin.Unit r8 = p002kotlin.Unit.f29295attabal
            return r8
        L80:
            kotlin.Unit r8 = p002kotlin.Unit.f29295attabal
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jr1.a(complexometry.formularize, wretchedly.dern):java.lang.Object");
    }
}
