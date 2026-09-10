package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.basify;
import saneness.hobby;

/* JADX INFO: loaded from: classes.dex */
public final class va0 implements basify {
    public final jk0 a;
    public final vg b;
    public final hobby c;
    public final ja0 d;

    public va0(jk0 flags, vg appState, hobby httpClient, ja0 debugDialogManager) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(appState, "appState");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(debugDialogManager, "debugDialogManager");
        this.a = flags;
        this.b = appState;
        this.c = httpClient;
        this.d = debugDialogManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
    
        if (saneness.hobby.attabal(r9, r12, null, r11, 14) == r0) goto L27;
     */
    @Override // saneness.basify
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.jm2 r9, ads_mobile_sdk.h1 r10, complexometry.ResponseInfo r11, wretchedly.dern r12) {
        /*
            r8 = this;
            boolean r11 = r12 instanceof ads_mobile_sdk.ua0
            if (r11 == 0) goto L13
            r11 = r12
            ads_mobile_sdk.ua0 r11 = (ads_mobile_sdk.ua0) r11
            int r0 = r11.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r11.d = r0
            goto L18
        L13:
            ads_mobile_sdk.ua0 r11 = new ads_mobile_sdk.ua0
            r11.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r11.b
            java.lang.Object r0 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r1 = r11.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            p002kotlin.dern.saneness(r12)
            goto La0
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            ads_mobile_sdk.va0 r9 = r11.a
            p002kotlin.dern.saneness(r12)
            goto L80
        L3b:
            p002kotlin.dern.saneness(r12)
            ads_mobile_sdk.vg r12 = r8.b
            java.util.concurrent.atomic.AtomicBoolean r12 = r12.g
            boolean r12 = r12.get()
            if (r12 == 0) goto La3
            com.google.gson.JsonObject r12 = r10.A
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L51
            goto La3
        L51:
            ads_mobile_sdk.ja0 r12 = r8.d
            ads_mobile_sdk.jk0 r1 = r8.a
            java.lang.String r4 = "key"
            java.lang.String r5 = "defaultValue"
            java.lang.String r6 = "gads:drx_debug:send_debug_data_url"
            java.lang.String r7 = "https://www.google.com/dfp/sendDebugData"
            saneness.grout.attabal(r1, r6, r4, r7, r5)
            ads_mobile_sdk.xk r4 = ads_mobile_sdk.zk.o
            java.lang.Object r1 = r1.a(r6, r7, r4)
            java.lang.String r1 = (java.lang.String) r1
            ads_mobile_sdk.bm2 r9 = r9.a
            complexometry.formularize r9 = r9.a
            java.lang.String r9 = r9.getAdUnitId()
            com.google.gson.JsonObject r10 = r10.A
            r11.a = r8
            r11.d = r3
            ads_mobile_sdk.wz0 r12 = r12.j
            java.lang.Object r12 = r12.a(r1, r9, r10, r11)
            if (r12 != r0) goto L7f
            goto L9f
        L7f:
            r9 = r8
        L80:
            android.net.Uri r12 = (android.net.Uri) r12
            java.lang.String r10 = r12.toString()
            java.lang.String r12 = "toString(...)"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r12)
            saneness.hobby r9 = r9.c
            java.net.URL r12 = new java.net.URL
            r12.<init>(r10)
            r10 = 0
            r11.a = r10
            r11.d = r2
            r1 = 14
            java.lang.Object r9 = saneness.hobby.attabal(r9, r12, r10, r11, r1)
            if (r9 != r0) goto La0
        L9f:
            return r0
        La0:
            kotlin.Unit r9 = p002kotlin.Unit.f29295attabal
            return r9
        La3:
            kotlin.Unit r9 = p002kotlin.Unit.f29295attabal
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.va0.a(ads_mobile_sdk.jm2, ads_mobile_sdk.h1, complexometry.molybdenite, wretchedly.dern):java.lang.Object");
    }
}
