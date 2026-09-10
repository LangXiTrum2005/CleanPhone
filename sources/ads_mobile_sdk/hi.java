package ads_mobile_sdk;

import android.content.Context;
import complexometry.formularize;
import kotlinx.coroutines.saran;
import liquory.beachfront;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.adultoid;
import saneness.blindfish;
import saneness.coffeecake;
import saneness.phytopathogen;

/* JADX INFO: loaded from: classes.dex */
public final class hi extends l1 implements blindfish {
    public final Context k;
    public final adultoid l;
    public final u20 m;
    public final g83 n;
    public final phytopathogen o;
    public final saran p;
    public final rs0 q;
    public final wf r;
    public final beachfront s;

    /* JADX WARN: Illegal instructions before constructor call */
    public hi(Context context, coffeecake adComponentProvider, u20 csiTicker, g83 webViewFactory, phytopathogen refreshListener, saran uiScope, rs0 htmlUtil, wf appSettings, l13 traceMetaSet, formularize baseRequest, yf2 requestType, long j, int i, h1 adConfiguration, ur commonConfiguration, jm2 serverTransaction, String renderId, beachfront bannerRequest, coffeecake placementIdWrapperProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adComponentProvider, "adComponentProvider");
        Intrinsics.checkNotNullParameter(csiTicker, "csiTicker");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(refreshListener, "refreshListener");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(htmlUtil, "htmlUtil");
        Intrinsics.checkNotNullParameter(appSettings, "appSettings");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(renderId, "renderId");
        Intrinsics.checkNotNullParameter(bannerRequest, "bannerRequest");
        Intrinsics.checkNotNullParameter(placementIdWrapperProvider, "placementIdWrapperProvider");
        Object obj = placementIdWrapperProvider.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        super(traceMetaSet, baseRequest, requestType, j, i, adConfiguration, commonConfiguration, serverTransaction, renderId, (a22) obj);
        this.k = context;
        this.l = adComponentProvider;
        this.m = csiTicker;
        this.n = webViewFactory;
        this.o = refreshListener;
        this.p = uiScope;
        this.q = htmlUtil;
        this.r = appSettings;
        this.s = bannerRequest;
    }

    @Override // saneness.blindfish
    public final wf a() {
        return this.r;
    }

    @Override // saneness.idolatry
    public final boolean b() {
        wx0 wx0Var = this.f.H;
        return (wx0Var != null ? wx0Var.a : null) != null;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02fe A[Catch: all -> 0x030e, TryCatch #6 {all -> 0x030e, blocks: (B:103:0x02f7, B:105:0x02fe, B:107:0x0305, B:109:0x0309, B:111:0x030d, B:114:0x0311, B:115:0x0316, B:116:0x0317, B:117:0x031e, B:118:0x031f, B:119:0x0326, B:120:0x0327), top: B:160:0x02f7 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0305 A[Catch: all -> 0x030e, TryCatch #6 {all -> 0x030e, blocks: (B:103:0x02f7, B:105:0x02fe, B:107:0x0305, B:109:0x0309, B:111:0x030d, B:114:0x0311, B:115:0x0316, B:116:0x0317, B:117:0x031e, B:118:0x031f, B:119:0x0326, B:120:0x0327), top: B:160:0x02f7 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0309 A[Catch: all -> 0x030e, TryCatch #6 {all -> 0x030e, blocks: (B:103:0x02f7, B:105:0x02fe, B:107:0x0305, B:109:0x0309, B:111:0x030d, B:114:0x0311, B:115:0x0316, B:116:0x0317, B:117:0x031e, B:118:0x031f, B:119:0x0326, B:120:0x0327), top: B:160:0x02f7 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x030d A[Catch: all -> 0x030e, TryCatch #6 {all -> 0x030e, blocks: (B:103:0x02f7, B:105:0x02fe, B:107:0x0305, B:109:0x0309, B:111:0x030d, B:114:0x0311, B:115:0x0316, B:116:0x0317, B:117:0x031e, B:118:0x031f, B:119:0x0326, B:120:0x0327), top: B:160:0x02f7 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0311 A[Catch: all -> 0x030e, TryCatch #6 {all -> 0x030e, blocks: (B:103:0x02f7, B:105:0x02fe, B:107:0x0305, B:109:0x0309, B:111:0x030d, B:114:0x0311, B:115:0x0316, B:116:0x0317, B:117:0x031e, B:118:0x031f, B:119:0x0326, B:120:0x0327), top: B:160:0x02f7 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0317 A[Catch: all -> 0x030e, TryCatch #6 {all -> 0x030e, blocks: (B:103:0x02f7, B:105:0x02fe, B:107:0x0305, B:109:0x0309, B:111:0x030d, B:114:0x0311, B:115:0x0316, B:116:0x0317, B:117:0x031e, B:118:0x031f, B:119:0x0326, B:120:0x0327), top: B:160:0x02f7 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x031f A[Catch: all -> 0x030e, TryCatch #6 {all -> 0x030e, blocks: (B:103:0x02f7, B:105:0x02fe, B:107:0x0305, B:109:0x0309, B:111:0x030d, B:114:0x0311, B:115:0x0316, B:116:0x0317, B:117:0x031e, B:118:0x031f, B:119:0x0326, B:120:0x0327), top: B:160:0x02f7 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0327 A[Catch: all -> 0x030e, TRY_LEAVE, TryCatch #6 {all -> 0x030e, blocks: (B:103:0x02f7, B:105:0x02fe, B:107:0x0305, B:109:0x0309, B:111:0x030d, B:114:0x0311, B:115:0x0316, B:116:0x0317, B:117:0x031e, B:118:0x031f, B:119:0x0326, B:120:0x0327), top: B:160:0x02f7 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x033b A[Catch: all -> 0x034b, TryCatch #5 {all -> 0x034b, blocks: (B:127:0x0334, B:129:0x033b, B:131:0x0342, B:133:0x0346, B:135:0x034a, B:138:0x034e, B:139:0x0353, B:140:0x0354, B:141:0x035b, B:142:0x035c, B:143:0x0363, B:144:0x0364), top: B:159:0x0334 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0342 A[Catch: all -> 0x034b, TryCatch #5 {all -> 0x034b, blocks: (B:127:0x0334, B:129:0x033b, B:131:0x0342, B:133:0x0346, B:135:0x034a, B:138:0x034e, B:139:0x0353, B:140:0x0354, B:141:0x035b, B:142:0x035c, B:143:0x0363, B:144:0x0364), top: B:159:0x0334 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0346 A[Catch: all -> 0x034b, TryCatch #5 {all -> 0x034b, blocks: (B:127:0x0334, B:129:0x033b, B:131:0x0342, B:133:0x0346, B:135:0x034a, B:138:0x034e, B:139:0x0353, B:140:0x0354, B:141:0x035b, B:142:0x035c, B:143:0x0363, B:144:0x0364), top: B:159:0x0334 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x034a A[Catch: all -> 0x034b, TryCatch #5 {all -> 0x034b, blocks: (B:127:0x0334, B:129:0x033b, B:131:0x0342, B:133:0x0346, B:135:0x034a, B:138:0x034e, B:139:0x0353, B:140:0x0354, B:141:0x035b, B:142:0x035c, B:143:0x0363, B:144:0x0364), top: B:159:0x0334 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x034e A[Catch: all -> 0x034b, TryCatch #5 {all -> 0x034b, blocks: (B:127:0x0334, B:129:0x033b, B:131:0x0342, B:133:0x0346, B:135:0x034a, B:138:0x034e, B:139:0x0353, B:140:0x0354, B:141:0x035b, B:142:0x035c, B:143:0x0363, B:144:0x0364), top: B:159:0x0334 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0354 A[Catch: all -> 0x034b, TryCatch #5 {all -> 0x034b, blocks: (B:127:0x0334, B:129:0x033b, B:131:0x0342, B:133:0x0346, B:135:0x034a, B:138:0x034e, B:139:0x0353, B:140:0x0354, B:141:0x035b, B:142:0x035c, B:143:0x0363, B:144:0x0364), top: B:159:0x0334 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x035c A[Catch: all -> 0x034b, TryCatch #5 {all -> 0x034b, blocks: (B:127:0x0334, B:129:0x033b, B:131:0x0342, B:133:0x0346, B:135:0x034a, B:138:0x034e, B:139:0x0353, B:140:0x0354, B:141:0x035b, B:142:0x035c, B:143:0x0363, B:144:0x0364), top: B:159:0x0334 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0364 A[Catch: all -> 0x034b, TRY_LEAVE, TryCatch #5 {all -> 0x034b, blocks: (B:127:0x0334, B:129:0x033b, B:131:0x0342, B:133:0x0346, B:135:0x034a, B:138:0x034e, B:139:0x0353, B:140:0x0354, B:141:0x035b, B:142:0x035c, B:143:0x0363, B:144:0x0364), top: B:159:0x0334 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:51:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:53:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:60:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:66:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:69:0x021a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0227  */
    /* JADX WARN: Code duplicated, block: B:80:0x027d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0289 A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #4 {all -> 0x006a, blocks: (B:16:0x0063, B:81:0x0283, B:83:0x0289), top: B:157:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0296 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x0297  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code duplicated, block: B:90:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:93:0x02c0  */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02d5, code lost:
    
        if (r13.a(r1, r5) == r14) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v37, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r4v8, types: [T, java.lang.String] */
    @Override // ads_mobile_sdk.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r13, wretchedly.dern r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 894
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.hi.a(boolean, wretchedly.dern):java.lang.Object");
    }
}
