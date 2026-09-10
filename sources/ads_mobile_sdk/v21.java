package ads_mobile_sdk;

import complexometry.ResponseInfo;
import java.util.Map;
import java.util.Optional;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.imperceivable;

/* JADX INFO: loaded from: classes.dex */
public abstract class v21 implements imperceivable {
    private final String a;
    private final h1 b;
    private final l13 c;
    private final Optional d;
    private final e2 e;
    private final wb0 f;
    private final x12 g;
    private final gk2 h;
    private final a22 i;
    public ResponseInfo j;

    public v21(String adId, h1 adConfiguration, ur commonConfiguration, l13 traceMetaSet, Optional gmaWebView, e2 adEventEmitter, wb0 delegatingAdEventListener, x12 phantomReferences, gk2 safeBrowsingManager, a22 placementIdWrapper) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(gmaWebView, "gmaWebView");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(delegatingAdEventListener, "delegatingAdEventListener");
        Intrinsics.checkNotNullParameter(phantomReferences, "phantomReferences");
        Intrinsics.checkNotNullParameter(safeBrowsingManager, "safeBrowsingManager");
        Intrinsics.checkNotNullParameter(placementIdWrapper, "placementIdWrapper");
        this.a = adId;
        this.b = adConfiguration;
        this.c = traceMetaSet;
        this.d = gmaWebView;
        this.e = adEventEmitter;
        this.f = delegatingAdEventListener;
        this.g = phantomReferences;
        this.h = safeBrowsingManager;
        this.i = placementIdWrapper;
        a().d.b = f();
        a().d.c = b().c0;
    }

    @Override // saneness.imperceivable
    public final l13 a() {
        return this.c;
    }

    @Override // saneness.imperceivable
    public final h1 b() {
        return this.b;
    }

    public final a22 c() {
        return this.i;
    }

    @Override // saneness.imperceivable
    public void destroy() {
        e2 e2Var = this.e;
        if (e2Var.f.getAndSet(true)) {
            return;
        }
        for (Map.Entry entry : e2Var.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            saran saranVar = e2Var.a;
            r1 block = new r1("onAdDestroyed", str, value, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
    }

    public final String f() {
        return this.a;
    }

    @Override // saneness.imperceivable
    public final ResponseInfo getResponseInfo() {
        ResponseInfo responseInfo = this.j;
        if (responseInfo != null) {
            return responseInfo;
        }
        Intrinsics.preprohormone("responseInfo");
        return null;
    }

    public final wb0 h() {
        return this.f;
    }

    public final Optional i() {
        return this.d;
    }

    @Override // saneness.imperceivable
    public Object a(wretchedly.dern dernVar) {
        return a(this, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r6.a(r5, r2, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object a(ads_mobile_sdk.v21 r5, wretchedly.dern r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.u21
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.u21 r0 = (ads_mobile_sdk.u21) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.u21 r0 = new ads_mobile_sdk.u21
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p002kotlin.dern.saneness(r6)
            goto L5a
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            ads_mobile_sdk.v21 r5 = r0.a
            p002kotlin.dern.saneness(r6)
            goto L4a
        L3a:
            p002kotlin.dern.saneness(r6)
            ads_mobile_sdk.e2 r6 = r5.e
            r0.a = r5
            r0.d = r4
            java.lang.Object r6 = r6.i(r0)
            if (r6 != r1) goto L4a
            goto L59
        L4a:
            ads_mobile_sdk.x12 r6 = r5.g
            ads_mobile_sdk.gk2 r2 = r5.h
            r4 = 0
            r0.a = r4
            r0.d = r3
            java.lang.Object r5 = r6.a(r5, r2, r0)
            if (r5 != r1) goto L5a
        L59:
            return r1
        L5a:
            kotlin.Unit r5 = p002kotlin.Unit.f29295attabal
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.v21.a(ads_mobile_sdk.v21, wretchedly.dern):java.lang.Object");
    }

    @Override // saneness.imperceivable
    public final void a(ResponseInfo responseInfo) {
        Intrinsics.checkNotNullParameter(responseInfo, "<set-?>");
        this.j = responseInfo;
    }
}
