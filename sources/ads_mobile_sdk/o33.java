package ads_mobile_sdk;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.ironsource.X3;
import java.io.Closeable;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.impromptu;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.connector;
import saneness.evenfall;
import saneness.extinctive;
import saneness.gerenuk;
import saneness.homozygous;
import saneness.loun;
import saneness.rotuma;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class o33 extends hm0 {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final /* synthetic */ int f3289attabal = 0;
    public final u20 P;
    public final l13 Q;
    public final g83 R;
    public final extinctive S;
    public final ri2 T;
    public gq0 U;
    public String V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o33(Context applicationContext, saran uiScope, CoroutineContext uiContext, saran backgroundScope, jk0 flags, loun traceLogger, String afmaVersion, yf2 requestType, h1 adConfiguration, x activityTracker, e2 adEventEmitter, homozygous omidMonitor, ip0 gmaUtil, u20 csiTicker, l13 traceMetaSet, g83 webViewFactory, extinctive twoPieceExpandedWebViewConfigurator, connector backButtonStateDelegate, ri2 rootTraceCreator) {
        super(applicationContext, uiScope, uiContext, backgroundScope, flags, traceLogger, afmaVersion, requestType, adConfiguration, activityTracker, adEventEmitter, omidMonitor, gmaUtil, backButtonStateDelegate);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(omidMonitor, "omidMonitor");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(csiTicker, "csiTicker");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(twoPieceExpandedWebViewConfigurator, "twoPieceExpandedWebViewConfigurator");
        Intrinsics.checkNotNullParameter(backButtonStateDelegate, "backButtonStateDelegate");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        this.P = csiTicker;
        this.Q = traceMetaSet;
        this.R = webViewFactory;
        this.S = twoPieceExpandedWebViewConfigurator;
        this.T = rootTraceCreator;
    }

    @Override // ads_mobile_sdk.hm0, ads_mobile_sdk.bm0
    public final Object a(wretchedly.dern dernVar) {
        return a(this, dernVar);
    }

    @Override // ads_mobile_sdk.bm0
    public final Object b(wretchedly.dern dernVar) {
        return b(this, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r5.a(r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.o33 r5, wretchedly.dern r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.e33
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.e33 r0 = (ads_mobile_sdk.e33) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.e33 r0 = new ads_mobile_sdk.e33
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
            goto L5f
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            ads_mobile_sdk.o33 r5 = r0.a
            p002kotlin.dern.saneness(r6)
            goto L4b
        L3a:
            p002kotlin.dern.saneness(r6)
            r0.a = r5
            r0.d = r4
            r5.getClass()
            java.lang.Object r6 = ads_mobile_sdk.hm0.a(r5, r0)
            if (r6 != r1) goto L4b
            goto L5e
        L4b:
            patroclinal.taiyuan r5 = r5.G
            java.lang.Object r5 = r5.getValue()
            ads_mobile_sdk.gq0 r5 = (ads_mobile_sdk.gq0) r5
            r6 = 0
            r0.a = r6
            r0.d = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L5f
        L5e:
            return r1
        L5f:
            kotlin.Unit r5 = p002kotlin.Unit.f29295attabal
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.o33.a(ads_mobile_sdk.o33, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if (r5.a(r6, (wretchedly.dern) r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object b(ads_mobile_sdk.o33 r5, wretchedly.dern r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.f33
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.f33 r0 = (ads_mobile_sdk.f33) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.f33 r0 = new ads_mobile_sdk.f33
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
            goto L6a
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            ads_mobile_sdk.o33 r5 = r0.a
            p002kotlin.dern.saneness(r6)
            goto L4b
        L3a:
            p002kotlin.dern.saneness(r6)
            r0.a = r5
            r0.d = r4
            r5.getClass()
            java.lang.Object r6 = ads_mobile_sdk.hm0.b(r5, r0)
            if (r6 != r1) goto L4b
            goto L68
        L4b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L69
            ads_mobile_sdk.gq0 r6 = r5.U
            r2 = 0
            if (r6 != 0) goto L5e
            java.lang.String r6 = "previousWebView"
            p002kotlin.jvm.internal.Intrinsics.preprohormone(r6)
            r6 = r2
        L5e:
            r0.a = r2
            r0.d = r3
            java.lang.Object r5 = r5.a(r6, r0)
            if (r5 != r1) goto L6a
        L68:
            return r1
        L69:
            r4 = 0
        L6a:
            java.lang.Boolean r5 = igo.attabal.attabal(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.o33.b(ads_mobile_sdk.o33, wretchedly.dern):java.lang.Object");
    }

    @Override // ads_mobile_sdk.bm0
    public final Toolbar a(RelativeLayout expandableLayout) {
        Intrinsics.checkNotNullParameter(expandableLayout, "expandableLayout");
        return a(expandableLayout, this.V);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017f A[Catch: all -> 0x0180, TryCatch #0 {all -> 0x0180, blocks: (B:93:0x0169, B:95:0x0170, B:97:0x0177, B:99:0x017b, B:101:0x017f, B:104:0x0183, B:105:0x0188, B:106:0x0189, B:107:0x0190, B:108:0x0191, B:109:0x0198, B:110:0x0199), top: B:188:0x0169 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0183 A[Catch: all -> 0x0180, TryCatch #0 {all -> 0x0180, blocks: (B:93:0x0169, B:95:0x0170, B:97:0x0177, B:99:0x017b, B:101:0x017f, B:104:0x0183, B:105:0x0188, B:106:0x0189, B:107:0x0190, B:108:0x0191, B:109:0x0198, B:110:0x0199), top: B:188:0x0169 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0189 A[Catch: all -> 0x0180, TryCatch #0 {all -> 0x0180, blocks: (B:93:0x0169, B:95:0x0170, B:97:0x0177, B:99:0x017b, B:101:0x017f, B:104:0x0183, B:105:0x0188, B:106:0x0189, B:107:0x0190, B:108:0x0191, B:109:0x0198, B:110:0x0199), top: B:188:0x0169 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0191 A[Catch: all -> 0x0180, TryCatch #0 {all -> 0x0180, blocks: (B:93:0x0169, B:95:0x0170, B:97:0x0177, B:99:0x017b, B:101:0x017f, B:104:0x0183, B:105:0x0188, B:106:0x0189, B:107:0x0190, B:108:0x0191, B:109:0x0198, B:110:0x0199), top: B:188:0x0169 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0199 A[Catch: all -> 0x0180, TRY_LEAVE, TryCatch #0 {all -> 0x0180, blocks: (B:93:0x0169, B:95:0x0170, B:97:0x0177, B:99:0x017b, B:101:0x017f, B:104:0x0183, B:105:0x0188, B:106:0x0189, B:107:0x0190, B:108:0x0191, B:109:0x0198, B:110:0x0199), top: B:188:0x0169 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x01f7 A[Catch: all -> 0x0204, TRY_LEAVE, TryCatch #5 {all -> 0x0204, blocks: (B:133:0x01f1, B:134:0x01f3, B:136:0x01f7, B:138:0x01fc, B:148:0x0212, B:150:0x021f), top: B:195:0x01f1 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x020c A[Catch: all -> 0x020a, TRY_ENTER, TryCatch #9 {all -> 0x020a, blocks: (B:137:0x01f9, B:145:0x020c, B:147:0x0210, B:149:0x021b), top: B:200:0x01f5 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x0210 A[Catch: all -> 0x020a, TRY_LEAVE, TryCatch #9 {all -> 0x020a, blocks: (B:137:0x01f9, B:145:0x020c, B:147:0x0210, B:149:0x021b), top: B:200:0x01f5 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x0228  */
    /* JADX WARN: Code duplicated, block: B:155:0x022c  */
    /* JADX WARN: Code duplicated, block: B:168:0x0251 A[Catch: all -> 0x0261, TryCatch #2 {all -> 0x0261, blocks: (B:166:0x024a, B:168:0x0251, B:170:0x0258, B:172:0x025c, B:174:0x0260, B:177:0x0264, B:178:0x0269, B:179:0x026a, B:180:0x0271, B:181:0x0272, B:182:0x0279, B:183:0x027a), top: B:190:0x024a }] */
    /* JADX WARN: Code duplicated, block: B:170:0x0258 A[Catch: all -> 0x0261, TryCatch #2 {all -> 0x0261, blocks: (B:166:0x024a, B:168:0x0251, B:170:0x0258, B:172:0x025c, B:174:0x0260, B:177:0x0264, B:178:0x0269, B:179:0x026a, B:180:0x0271, B:181:0x0272, B:182:0x0279, B:183:0x027a), top: B:190:0x024a }] */
    /* JADX WARN: Code duplicated, block: B:172:0x025c A[Catch: all -> 0x0261, TryCatch #2 {all -> 0x0261, blocks: (B:166:0x024a, B:168:0x0251, B:170:0x0258, B:172:0x025c, B:174:0x0260, B:177:0x0264, B:178:0x0269, B:179:0x026a, B:180:0x0271, B:181:0x0272, B:182:0x0279, B:183:0x027a), top: B:190:0x024a }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0260 A[Catch: all -> 0x0261, TryCatch #2 {all -> 0x0261, blocks: (B:166:0x024a, B:168:0x0251, B:170:0x0258, B:172:0x025c, B:174:0x0260, B:177:0x0264, B:178:0x0269, B:179:0x026a, B:180:0x0271, B:181:0x0272, B:182:0x0279, B:183:0x027a), top: B:190:0x024a }] */
    /* JADX WARN: Code duplicated, block: B:177:0x0264 A[Catch: all -> 0x0261, TryCatch #2 {all -> 0x0261, blocks: (B:166:0x024a, B:168:0x0251, B:170:0x0258, B:172:0x025c, B:174:0x0260, B:177:0x0264, B:178:0x0269, B:179:0x026a, B:180:0x0271, B:181:0x0272, B:182:0x0279, B:183:0x027a), top: B:190:0x024a }] */
    /* JADX WARN: Code duplicated, block: B:179:0x026a A[Catch: all -> 0x0261, TryCatch #2 {all -> 0x0261, blocks: (B:166:0x024a, B:168:0x0251, B:170:0x0258, B:172:0x025c, B:174:0x0260, B:177:0x0264, B:178:0x0269, B:179:0x026a, B:180:0x0271, B:181:0x0272, B:182:0x0279, B:183:0x027a), top: B:190:0x024a }] */
    /* JADX WARN: Code duplicated, block: B:181:0x0272 A[Catch: all -> 0x0261, TryCatch #2 {all -> 0x0261, blocks: (B:166:0x024a, B:168:0x0251, B:170:0x0258, B:172:0x025c, B:174:0x0260, B:177:0x0264, B:178:0x0269, B:179:0x026a, B:180:0x0271, B:181:0x0272, B:182:0x0279, B:183:0x027a), top: B:190:0x024a }] */
    /* JADX WARN: Code duplicated, block: B:183:0x027a A[Catch: all -> 0x0261, TRY_LEAVE, TryCatch #2 {all -> 0x0261, blocks: (B:166:0x024a, B:168:0x0251, B:170:0x0258, B:172:0x025c, B:174:0x0260, B:177:0x0264, B:178:0x0269, B:179:0x026a, B:180:0x0271, B:181:0x0272, B:182:0x0279, B:183:0x027a), top: B:190:0x024a }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0114 A[Catch: all -> 0x0121, TRY_LEAVE, TryCatch #1 {all -> 0x0121, blocks: (B:59:0x010e, B:60:0x0110, B:62:0x0114, B:64:0x0119, B:74:0x012f, B:77:0x013d), top: B:189:0x010e }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0129 A[Catch: all -> 0x0127, TRY_ENTER, TryCatch #7 {all -> 0x0127, blocks: (B:63:0x0116, B:71:0x0129, B:73:0x012d, B:75:0x0138), top: B:198:0x0112 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x012d A[Catch: all -> 0x0127, TRY_LEAVE, TryCatch #7 {all -> 0x0127, blocks: (B:63:0x0116, B:71:0x0129, B:73:0x012d, B:75:0x0138), top: B:198:0x0112 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0147  */
    /* JADX WARN: Code duplicated, block: B:82:0x014b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:95:0x0170 A[Catch: all -> 0x0180, TryCatch #0 {all -> 0x0180, blocks: (B:93:0x0169, B:95:0x0170, B:97:0x0177, B:99:0x017b, B:101:0x017f, B:104:0x0183, B:105:0x0188, B:106:0x0189, B:107:0x0190, B:108:0x0191, B:109:0x0198, B:110:0x0199), top: B:188:0x0169 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0177 A[Catch: all -> 0x0180, TryCatch #0 {all -> 0x0180, blocks: (B:93:0x0169, B:95:0x0170, B:97:0x0177, B:99:0x017b, B:101:0x017f, B:104:0x0183, B:105:0x0188, B:106:0x0189, B:107:0x0190, B:108:0x0191, B:109:0x0198, B:110:0x0199), top: B:188:0x0169 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x017b A[Catch: all -> 0x0180, TryCatch #0 {all -> 0x0180, blocks: (B:93:0x0169, B:95:0x0170, B:97:0x0177, B:99:0x017b, B:101:0x017f, B:104:0x0183, B:105:0x0188, B:106:0x0189, B:107:0x0190, B:108:0x0191, B:109:0x0198, B:110:0x0199), top: B:188:0x0169 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v40, types: [ads_mobile_sdk.gq0] */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v59, types: [ads_mobile_sdk.gq0] */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r15v0, types: [ads_mobile_sdk.gq0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v34, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v50, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v59 */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v4, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v24, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v35, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    public final Object a(gq0 gq0Var, String str, String str2, String str3, wretchedly.dern dernVar) {
        g33 g33Var;
        ?? r2;
        ?? r3;
        TimeoutCancellationException timeoutCancellationException;
        ?? r4;
        ?? r1;
        TimeoutCancellationException timeoutCancellationException2;
        ?? r5;
        ?? r6;
        o33 o33Var;
        ?? r0;
        w03 w03Var;
        Object objB;
        w03 w03Var2;
        o33 o33Var2;
        ?? r7;
        w03 w03Var3;
        Object objB2;
        w03 w03Var4;
        ?? r15;
        w03 w03Var5;
        w03 w03Var6;
        ?? r8;
        w03 w03Var7;
        spartacist spartacistVar;
        w03 w03Var8;
        w03 w03Var9;
        Toolbar toolbar;
        ?? r9;
        w03 w03Var10;
        ?? r16;
        ?? r17;
        w03 w03Var11;
        w03 w03Var12;
        ?? r10;
        w03 w03Var13;
        spartacist spartacistVar2;
        w03 w03Var14;
        w03 w03Var15;
        Toolbar toolbar2;
        ?? r11;
        w03 w03Var16;
        ?? r18;
        if (dernVar instanceof g33) {
            g33Var = (g33) dernVar;
            int i = g33Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                g33Var.g = i - Integer.MIN_VALUE;
            } else {
                g33Var = new g33(this, dernVar);
            }
        } else {
            g33Var = new g33(this, dernVar);
        }
        g33 g33Var2 = g33Var;
        Object objCompetently = g33Var2.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        ?? r12 = g33Var2.g;
        try {
            try {
                switch (r12) {
                    case 0:
                        p002kotlin.dern.saneness(objCompetently);
                        ri2 ri2Var = this.T;
                        no0 no0Var = no0.CUI_NAME_TWO_PIECE_EXPANDABLE_LOAD;
                        l13 l13Var = this.Q;
                        List listFormularize = adultoid.formularize();
                        if (j13.b().a == null) {
                            v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                            try {
                                if (str != null) {
                                    g33Var2.a = this;
                                    g33Var2.b = gq0Var;
                                    g33Var2.c = v62VarA;
                                    g33Var2.d = v62VarA;
                                    g33Var2.g = 1;
                                    objB2 = gq0Var.b(str, g33Var2);
                                    if (objB2 != objBeachfront) {
                                        o33Var2 = this;
                                        w03Var4 = v62VarA;
                                        w03Var5 = v62VarA;
                                        r15 = gq0Var;
                                        try {
                                            spartacist spartacistVar3 = (spartacist) objB2;
                                            r8 = r15;
                                            w03Var7 = w03Var5;
                                            spartacistVar = spartacistVar3;
                                            w03Var9 = w03Var4;
                                            try {
                                                if (spartacistVar instanceof nn0) {
                                                    y13.a((nn0) spartacistVar, false);
                                                    Boolean boolAttabal = igo.attabal.attabal(false);
                                                    interaction.saneness.attabal(w03Var7, null);
                                                    return boolAttabal;
                                                }
                                                toolbar = o33Var2.x;
                                                if (toolbar != null) {
                                                    CoroutineContext coroutineContext = o33Var2.c;
                                                    h33 h33Var = new h33(r8, toolbar, null);
                                                    g33Var2.a = w03Var9;
                                                    g33Var2.b = w03Var7;
                                                    g33Var2.c = null;
                                                    g33Var2.d = null;
                                                    g33Var2.g = 3;
                                                    objCompetently = impromptu.competently(coroutineContext, h33Var, g33Var2);
                                                    if (objCompetently != objBeachfront) {
                                                        r9 = w03Var9;
                                                        r16 = w03Var7;
                                                        r3 = r9;
                                                        gq0Var = r16;
                                                    }
                                                } else {
                                                    r3 = w03Var9;
                                                    gq0Var = w03Var7;
                                                }
                                                Boolean boolAttabal2 = igo.attabal.attabal(true);
                                                interaction.saneness.attabal(gq0Var, null);
                                                return boolAttabal2;
                                            } catch (Throwable th) {
                                                w03Var6 = w03Var7;
                                                timeoutCancellationException = th;
                                                w03Var8 = w03Var9;
                                                r1 = w03Var8;
                                                r4 = w03Var6;
                                                try {
                                                    r1.b(timeoutCancellationException);
                                                    if (!(timeoutCancellationException instanceof evenfall)) {
                                                        r1.a(timeoutCancellationException);
                                                        if (!(timeoutCancellationException instanceof TimeoutCancellationException)) {
                                                            if (!(timeoutCancellationException instanceof CancellationException)) {
                                                                if (timeoutCancellationException instanceof yn0) {
                                                                    throw timeoutCancellationException;
                                                                }
                                                                throw new gn0(timeoutCancellationException);
                                                            }
                                                            throw new bn0(timeoutCancellationException);
                                                        }
                                                        throw new cp0(timeoutCancellationException);
                                                    }
                                                    throw timeoutCancellationException;
                                                } catch (Throwable th2) {
                                                    try {
                                                        throw th2;
                                                    } catch (Throwable th3) {
                                                        interaction.saneness.attabal(r4, th2);
                                                        throw th3;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            timeoutCancellationException = th4;
                                            w03Var6 = w03Var5;
                                            w03Var8 = w03Var4;
                                            r1 = w03Var8;
                                            r4 = w03Var6;
                                            r1.b(timeoutCancellationException);
                                            if (!(timeoutCancellationException instanceof evenfall)) {
                                                r1.a(timeoutCancellationException);
                                                if (!(timeoutCancellationException instanceof TimeoutCancellationException)) {
                                                    if (!(timeoutCancellationException instanceof CancellationException)) {
                                                        if (timeoutCancellationException instanceof yn0) {
                                                            throw timeoutCancellationException;
                                                        }
                                                        throw new gn0(timeoutCancellationException);
                                                    }
                                                    throw new bn0(timeoutCancellationException);
                                                }
                                                throw new cp0(timeoutCancellationException);
                                            }
                                            throw timeoutCancellationException;
                                        }
                                    }
                                } else if (str2 != null) {
                                    g33Var2.a = this;
                                    g33Var2.b = gq0Var;
                                    g33Var2.c = v62VarA;
                                    g33Var2.d = v62VarA;
                                    g33Var2.g = 2;
                                    Object objA = gq0.a((gq0) gq0Var, str2, str3, false, (wretchedly.dern) g33Var2, 12);
                                    if (objA != objBeachfront) {
                                        o33Var2 = this;
                                        v62 v62Var = v62VarA;
                                        objCompetently = objA;
                                        r7 = gq0Var;
                                        w03Var3 = v62Var;
                                        w03Var10 = v62Var;
                                        try {
                                            spartacistVar = (spartacist) objCompetently;
                                            r8 = r7;
                                            w03Var9 = w03Var10;
                                            w03Var7 = w03Var3;
                                            if (spartacistVar instanceof nn0) {
                                                y13.a((nn0) spartacistVar, false);
                                                Boolean boolAttabal3 = igo.attabal.attabal(false);
                                                interaction.saneness.attabal(w03Var7, null);
                                                return boolAttabal3;
                                            }
                                            toolbar = o33Var2.x;
                                            if (toolbar != null) {
                                                CoroutineContext coroutineContext2 = o33Var2.c;
                                                h33 h33Var2 = new h33(r8, toolbar, null);
                                                g33Var2.a = w03Var9;
                                                g33Var2.b = w03Var7;
                                                g33Var2.c = null;
                                                g33Var2.d = null;
                                                g33Var2.g = 3;
                                                objCompetently = impromptu.competently(coroutineContext2, h33Var2, g33Var2);
                                                if (objCompetently != objBeachfront) {
                                                    r9 = w03Var9;
                                                    r16 = w03Var7;
                                                    r3 = r9;
                                                    gq0Var = r16;
                                                }
                                            } else {
                                                r3 = w03Var9;
                                                gq0Var = w03Var7;
                                            }
                                            Boolean boolAttabal4 = igo.attabal.attabal(true);
                                            interaction.saneness.attabal(gq0Var, null);
                                            return boolAttabal4;
                                        } catch (Throwable th5) {
                                            w03 w03Var17 = w03Var3;
                                            timeoutCancellationException = th5;
                                            r1 = w03Var10;
                                            r4 = w03Var17;
                                            r1.b(timeoutCancellationException);
                                            if (!(timeoutCancellationException instanceof evenfall)) {
                                                r1.a(timeoutCancellationException);
                                                if (!(timeoutCancellationException instanceof TimeoutCancellationException)) {
                                                    if (!(timeoutCancellationException instanceof CancellationException)) {
                                                        if (timeoutCancellationException instanceof yn0) {
                                                            throw timeoutCancellationException;
                                                        }
                                                        throw new gn0(timeoutCancellationException);
                                                    }
                                                    throw new bn0(timeoutCancellationException);
                                                }
                                                throw new cp0(timeoutCancellationException);
                                            }
                                            throw timeoutCancellationException;
                                        }
                                    }
                                } else {
                                    y13.a("Cannot open two piece expandable with no url or html", null, 6);
                                    Boolean boolAttabal5 = igo.attabal.attabal(false);
                                    interaction.saneness.attabal(v62VarA, null);
                                    return boolAttabal5;
                                }
                            } catch (Throwable th6) {
                                timeoutCancellationException = th6;
                                r4 = v62VarA;
                                r1 = v62VarA;
                                r1.b(timeoutCancellationException);
                                if (!(timeoutCancellationException instanceof evenfall)) {
                                    r1.a(timeoutCancellationException);
                                    if (!(timeoutCancellationException instanceof TimeoutCancellationException)) {
                                        if (!(timeoutCancellationException instanceof CancellationException)) {
                                            if (timeoutCancellationException instanceof yn0) {
                                                throw timeoutCancellationException;
                                            }
                                            throw new gn0(timeoutCancellationException);
                                        }
                                        throw new bn0(timeoutCancellationException);
                                    }
                                    throw new cp0(timeoutCancellationException);
                                }
                                throw timeoutCancellationException;
                            }
                        } else {
                            w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
                            try {
                                if (str != null) {
                                    g33Var2.a = this;
                                    g33Var2.b = gq0Var;
                                    g33Var2.c = w03VarA;
                                    g33Var2.d = w03VarA;
                                    g33Var2.g = 4;
                                    objB = gq0Var.b(str, g33Var2);
                                    if (objB != objBeachfront) {
                                        o33Var = this;
                                        w03Var2 = w03VarA;
                                        w03Var11 = w03VarA;
                                        r17 = gq0Var;
                                        try {
                                            spartacist spartacistVar4 = (spartacist) objB;
                                            r10 = r17;
                                            w03Var13 = w03Var11;
                                            spartacistVar2 = spartacistVar4;
                                            w03Var15 = w03Var2;
                                            try {
                                                if (spartacistVar2 instanceof nn0) {
                                                    y13.a((nn0) spartacistVar2, false);
                                                    Boolean boolAttabal6 = igo.attabal.attabal(false);
                                                    interaction.saneness.attabal(w03Var13, null);
                                                    return boolAttabal6;
                                                }
                                                toolbar2 = o33Var.x;
                                                if (toolbar2 != null) {
                                                    CoroutineContext coroutineContext3 = o33Var.c;
                                                    h33 h33Var3 = new h33(r10, toolbar2, null);
                                                    g33Var2.a = w03Var15;
                                                    g33Var2.b = w03Var13;
                                                    g33Var2.c = null;
                                                    g33Var2.d = null;
                                                    g33Var2.g = 6;
                                                    objCompetently = impromptu.competently(coroutineContext3, h33Var3, g33Var2);
                                                    if (objCompetently != objBeachfront) {
                                                        r11 = w03Var15;
                                                        r18 = w03Var13;
                                                        r2 = r11;
                                                        gq0Var = r18;
                                                    }
                                                } else {
                                                    r2 = w03Var15;
                                                    gq0Var = w03Var13;
                                                }
                                                Boolean boolAttabal7 = igo.attabal.attabal(true);
                                                interaction.saneness.attabal(gq0Var, null);
                                                return boolAttabal7;
                                            } catch (Throwable th7) {
                                                w03Var12 = w03Var13;
                                                timeoutCancellationException2 = th7;
                                                w03Var14 = w03Var15;
                                                r6 = w03Var14;
                                                r5 = w03Var12;
                                                try {
                                                    r6.b(timeoutCancellationException2);
                                                    if (!(timeoutCancellationException2 instanceof evenfall)) {
                                                        r6.a(timeoutCancellationException2);
                                                        if (!(timeoutCancellationException2 instanceof TimeoutCancellationException)) {
                                                            if (!(timeoutCancellationException2 instanceof CancellationException)) {
                                                                if (timeoutCancellationException2 instanceof yn0) {
                                                                    throw timeoutCancellationException2;
                                                                }
                                                                throw new gn0(timeoutCancellationException2);
                                                            }
                                                            throw new bn0(timeoutCancellationException2);
                                                        }
                                                        throw new cp0(timeoutCancellationException2);
                                                    }
                                                    throw timeoutCancellationException2;
                                                } catch (Throwable th8) {
                                                    try {
                                                        throw th8;
                                                    } catch (Throwable th9) {
                                                        interaction.saneness.attabal(r5, th8);
                                                        throw th9;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th10) {
                                            timeoutCancellationException2 = th10;
                                            w03Var12 = w03Var11;
                                            w03Var14 = w03Var2;
                                            r6 = w03Var14;
                                            r5 = w03Var12;
                                            r6.b(timeoutCancellationException2);
                                            if (!(timeoutCancellationException2 instanceof evenfall)) {
                                                r6.a(timeoutCancellationException2);
                                                if (!(timeoutCancellationException2 instanceof TimeoutCancellationException)) {
                                                    if (!(timeoutCancellationException2 instanceof CancellationException)) {
                                                        if (timeoutCancellationException2 instanceof yn0) {
                                                            throw timeoutCancellationException2;
                                                        }
                                                        throw new gn0(timeoutCancellationException2);
                                                    }
                                                    throw new bn0(timeoutCancellationException2);
                                                }
                                                throw new cp0(timeoutCancellationException2);
                                            }
                                            throw timeoutCancellationException2;
                                        }
                                    }
                                } else if (str2 != null) {
                                    g33Var2.a = this;
                                    g33Var2.b = gq0Var;
                                    g33Var2.c = w03VarA;
                                    g33Var2.d = w03VarA;
                                    g33Var2.g = 5;
                                    Object objA2 = gq0.a((gq0) gq0Var, str2, str3, false, (wretchedly.dern) g33Var2, 12);
                                    if (objA2 != objBeachfront) {
                                        o33Var = this;
                                        w03 w03Var18 = w03VarA;
                                        objCompetently = objA2;
                                        r0 = gq0Var;
                                        w03Var = w03Var18;
                                        w03Var16 = w03Var18;
                                        try {
                                            spartacistVar2 = (spartacist) objCompetently;
                                            r10 = r0;
                                            w03Var15 = w03Var16;
                                            w03Var13 = w03Var;
                                            if (spartacistVar2 instanceof nn0) {
                                                y13.a((nn0) spartacistVar2, false);
                                                Boolean boolAttabal8 = igo.attabal.attabal(false);
                                                interaction.saneness.attabal(w03Var13, null);
                                                return boolAttabal8;
                                            }
                                            toolbar2 = o33Var.x;
                                            if (toolbar2 != null) {
                                                CoroutineContext coroutineContext4 = o33Var.c;
                                                h33 h33Var4 = new h33(r10, toolbar2, null);
                                                g33Var2.a = w03Var15;
                                                g33Var2.b = w03Var13;
                                                g33Var2.c = null;
                                                g33Var2.d = null;
                                                g33Var2.g = 6;
                                                objCompetently = impromptu.competently(coroutineContext4, h33Var4, g33Var2);
                                                if (objCompetently != objBeachfront) {
                                                    r11 = w03Var15;
                                                    r18 = w03Var13;
                                                    r2 = r11;
                                                    gq0Var = r18;
                                                }
                                            } else {
                                                r2 = w03Var15;
                                                gq0Var = w03Var13;
                                            }
                                            Boolean boolAttabal9 = igo.attabal.attabal(true);
                                            interaction.saneness.attabal(gq0Var, null);
                                            return boolAttabal9;
                                        } catch (Throwable th11) {
                                            w03 w03Var19 = w03Var;
                                            timeoutCancellationException2 = th11;
                                            r6 = w03Var16;
                                            r5 = w03Var19;
                                            r6.b(timeoutCancellationException2);
                                            if (!(timeoutCancellationException2 instanceof evenfall)) {
                                                r6.a(timeoutCancellationException2);
                                                if (!(timeoutCancellationException2 instanceof TimeoutCancellationException)) {
                                                    if (!(timeoutCancellationException2 instanceof CancellationException)) {
                                                        if (timeoutCancellationException2 instanceof yn0) {
                                                            throw timeoutCancellationException2;
                                                        }
                                                        throw new gn0(timeoutCancellationException2);
                                                    }
                                                    throw new bn0(timeoutCancellationException2);
                                                }
                                                throw new cp0(timeoutCancellationException2);
                                            }
                                            throw timeoutCancellationException2;
                                        }
                                    }
                                } else {
                                    y13.a("Cannot open two piece expandable with no url or html", null, 6);
                                    Boolean boolAttabal10 = igo.attabal.attabal(false);
                                    interaction.saneness.attabal(w03VarA, null);
                                    return boolAttabal10;
                                }
                            } catch (Throwable th12) {
                                timeoutCancellationException2 = th12;
                                r5 = w03VarA;
                                r6 = w03VarA;
                                r6.b(timeoutCancellationException2);
                                if (!(timeoutCancellationException2 instanceof evenfall)) {
                                    r6.a(timeoutCancellationException2);
                                    if (!(timeoutCancellationException2 instanceof TimeoutCancellationException)) {
                                        if (!(timeoutCancellationException2 instanceof CancellationException)) {
                                            if (timeoutCancellationException2 instanceof yn0) {
                                                throw timeoutCancellationException2;
                                            }
                                            throw new gn0(timeoutCancellationException2);
                                        }
                                        throw new bn0(timeoutCancellationException2);
                                    }
                                    throw new cp0(timeoutCancellationException2);
                                }
                                throw timeoutCancellationException2;
                            }
                        }
                        return objBeachfront;
                    case 1:
                        w03 w03Var20 = g33Var2.d;
                        w03 w03Var21 = g33Var2.c;
                        gq0 gq0Var2 = (gq0) g33Var2.b;
                        o33Var2 = (o33) g33Var2.a;
                        p002kotlin.dern.saneness(objCompetently);
                        w03Var5 = w03Var20;
                        r15 = gq0Var2;
                        objB2 = objCompetently;
                        w03Var4 = w03Var21;
                        spartacist spartacistVar5 = (spartacist) objB2;
                        r8 = r15;
                        w03Var7 = w03Var5;
                        spartacistVar = spartacistVar5;
                        w03Var9 = w03Var4;
                        if (spartacistVar instanceof nn0) {
                            y13.a((nn0) spartacistVar, false);
                            Boolean boolAttabal11 = igo.attabal.attabal(false);
                            interaction.saneness.attabal(w03Var7, null);
                            return boolAttabal11;
                        }
                        toolbar = o33Var2.x;
                        if (toolbar != null) {
                            CoroutineContext coroutineContext5 = o33Var2.c;
                            h33 h33Var5 = new h33(r8, toolbar, null);
                            g33Var2.a = w03Var9;
                            g33Var2.b = w03Var7;
                            g33Var2.c = null;
                            g33Var2.d = null;
                            g33Var2.g = 3;
                            objCompetently = impromptu.competently(coroutineContext5, h33Var5, g33Var2);
                            if (objCompetently != objBeachfront) {
                                r9 = w03Var9;
                                r16 = w03Var7;
                                r3 = r9;
                                gq0Var = r16;
                            }
                            return objBeachfront;
                        }
                        r3 = w03Var9;
                        gq0Var = w03Var7;
                        Boolean boolAttabal12 = igo.attabal.attabal(true);
                        interaction.saneness.attabal(gq0Var, null);
                        return boolAttabal12;
                    case 2:
                        w03 w03Var22 = g33Var2.d;
                        w03 w03Var23 = g33Var2.c;
                        gq0 gq0Var3 = (gq0) g33Var2.b;
                        o33Var2 = (o33) g33Var2.a;
                        p002kotlin.dern.saneness(objCompetently);
                        r7 = gq0Var3;
                        w03Var10 = w03Var23;
                        w03Var3 = w03Var22;
                        spartacistVar = (spartacist) objCompetently;
                        r8 = r7;
                        w03Var9 = w03Var10;
                        w03Var7 = w03Var3;
                        if (spartacistVar instanceof nn0) {
                            y13.a((nn0) spartacistVar, false);
                            Boolean boolAttabal13 = igo.attabal.attabal(false);
                            interaction.saneness.attabal(w03Var7, null);
                            return boolAttabal13;
                        }
                        toolbar = o33Var2.x;
                        if (toolbar != null) {
                            CoroutineContext coroutineContext6 = o33Var2.c;
                            h33 h33Var6 = new h33(r8, toolbar, null);
                            g33Var2.a = w03Var9;
                            g33Var2.b = w03Var7;
                            g33Var2.c = null;
                            g33Var2.d = null;
                            g33Var2.g = 3;
                            objCompetently = impromptu.competently(coroutineContext6, h33Var6, g33Var2);
                            if (objCompetently != objBeachfront) {
                                r9 = w03Var9;
                                r16 = w03Var7;
                                r3 = r9;
                                gq0Var = r16;
                            }
                            return objBeachfront;
                        }
                        r3 = w03Var9;
                        gq0Var = w03Var7;
                        Boolean boolAttabal14 = igo.attabal.attabal(true);
                        interaction.saneness.attabal(gq0Var, null);
                        return boolAttabal14;
                    case 3:
                        gq0Var = (Closeable) g33Var2.b;
                        r3 = (w03) g33Var2.a;
                        try {
                            p002kotlin.dern.saneness(objCompetently);
                            r9 = r3;
                            r16 = gq0Var;
                            r3 = r9;
                            gq0Var = r16;
                            Boolean boolAttabal15 = igo.attabal.attabal(true);
                            interaction.saneness.attabal(gq0Var, null);
                            return boolAttabal15;
                        } catch (Throwable th13) {
                            th = th13;
                            r1 = r3;
                            r4 = gq0Var;
                            timeoutCancellationException = th;
                            r1.b(timeoutCancellationException);
                            if (!(timeoutCancellationException instanceof evenfall)) {
                                r1.a(timeoutCancellationException);
                                if (!(timeoutCancellationException instanceof TimeoutCancellationException)) {
                                    if (!(timeoutCancellationException instanceof CancellationException)) {
                                        if (timeoutCancellationException instanceof yn0) {
                                            throw timeoutCancellationException;
                                        }
                                        throw new gn0(timeoutCancellationException);
                                    }
                                    throw new bn0(timeoutCancellationException);
                                }
                                throw new cp0(timeoutCancellationException);
                            }
                            throw timeoutCancellationException;
                        }
                    case 4:
                        w03 w03Var24 = g33Var2.d;
                        w03 w03Var25 = g33Var2.c;
                        gq0 gq0Var4 = (gq0) g33Var2.b;
                        o33Var = (o33) g33Var2.a;
                        p002kotlin.dern.saneness(objCompetently);
                        w03Var11 = w03Var24;
                        r17 = gq0Var4;
                        objB = objCompetently;
                        w03Var2 = w03Var25;
                        spartacist spartacistVar6 = (spartacist) objB;
                        r10 = r17;
                        w03Var13 = w03Var11;
                        spartacistVar2 = spartacistVar6;
                        w03Var15 = w03Var2;
                        if (spartacistVar2 instanceof nn0) {
                            y13.a((nn0) spartacistVar2, false);
                            Boolean boolAttabal16 = igo.attabal.attabal(false);
                            interaction.saneness.attabal(w03Var13, null);
                            return boolAttabal16;
                        }
                        toolbar2 = o33Var.x;
                        if (toolbar2 != null) {
                            CoroutineContext coroutineContext7 = o33Var.c;
                            h33 h33Var7 = new h33(r10, toolbar2, null);
                            g33Var2.a = w03Var15;
                            g33Var2.b = w03Var13;
                            g33Var2.c = null;
                            g33Var2.d = null;
                            g33Var2.g = 6;
                            objCompetently = impromptu.competently(coroutineContext7, h33Var7, g33Var2);
                            if (objCompetently != objBeachfront) {
                                r11 = w03Var15;
                                r18 = w03Var13;
                                r2 = r11;
                                gq0Var = r18;
                            }
                            return objBeachfront;
                        }
                        r2 = w03Var15;
                        gq0Var = w03Var13;
                        Boolean boolAttabal17 = igo.attabal.attabal(true);
                        interaction.saneness.attabal(gq0Var, null);
                        return boolAttabal17;
                    case 5:
                        w03 w03Var26 = g33Var2.d;
                        w03 w03Var27 = g33Var2.c;
                        gq0 gq0Var5 = (gq0) g33Var2.b;
                        o33Var = (o33) g33Var2.a;
                        p002kotlin.dern.saneness(objCompetently);
                        r0 = gq0Var5;
                        w03Var16 = w03Var27;
                        w03Var = w03Var26;
                        spartacistVar2 = (spartacist) objCompetently;
                        r10 = r0;
                        w03Var15 = w03Var16;
                        w03Var13 = w03Var;
                        if (spartacistVar2 instanceof nn0) {
                            y13.a((nn0) spartacistVar2, false);
                            Boolean boolAttabal18 = igo.attabal.attabal(false);
                            interaction.saneness.attabal(w03Var13, null);
                            return boolAttabal18;
                        }
                        toolbar2 = o33Var.x;
                        if (toolbar2 != null) {
                            CoroutineContext coroutineContext8 = o33Var.c;
                            h33 h33Var8 = new h33(r10, toolbar2, null);
                            g33Var2.a = w03Var15;
                            g33Var2.b = w03Var13;
                            g33Var2.c = null;
                            g33Var2.d = null;
                            g33Var2.g = 6;
                            objCompetently = impromptu.competently(coroutineContext8, h33Var8, g33Var2);
                            if (objCompetently != objBeachfront) {
                                r11 = w03Var15;
                                r18 = w03Var13;
                                r2 = r11;
                                gq0Var = r18;
                            }
                            return objBeachfront;
                        }
                        r2 = w03Var15;
                        gq0Var = w03Var13;
                        Boolean boolAttabal19 = igo.attabal.attabal(true);
                        interaction.saneness.attabal(gq0Var, null);
                        return boolAttabal19;
                    case 6:
                        gq0Var = (Closeable) g33Var2.b;
                        r2 = (w03) g33Var2.a;
                        try {
                            p002kotlin.dern.saneness(objCompetently);
                            r11 = r2;
                            r18 = gq0Var;
                            r2 = r11;
                            gq0Var = r18;
                            Boolean boolAttabal110 = igo.attabal.attabal(true);
                            interaction.saneness.attabal(gq0Var, null);
                            return boolAttabal110;
                        } catch (Throwable th14) {
                            th = th14;
                            r6 = r2;
                            r5 = gq0Var;
                            timeoutCancellationException2 = th;
                            r6.b(timeoutCancellationException2);
                            if (!(timeoutCancellationException2 instanceof evenfall)) {
                                r6.a(timeoutCancellationException2);
                                if (!(timeoutCancellationException2 instanceof TimeoutCancellationException)) {
                                    if (!(timeoutCancellationException2 instanceof CancellationException)) {
                                        if (timeoutCancellationException2 instanceof yn0) {
                                            throw timeoutCancellationException2;
                                        }
                                        throw new gn0(timeoutCancellationException2);
                                    }
                                    throw new bn0(timeoutCancellationException2);
                                }
                                throw new cp0(timeoutCancellationException2);
                            }
                            throw timeoutCancellationException2;
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th15) {
                th = th15;
                r2 = r12;
            }
        } catch (Throwable th16) {
            th = th16;
            r3 = r12;
        }
    }

    @Override // ads_mobile_sdk.hm0, ads_mobile_sdk.bm0
    public final Object a(View view, wretchedly.dern dernVar) {
        return a(this, view, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (kotlinx.coroutines.impromptu.competently(r11, r2, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.o33 r10, android.view.View r11, wretchedly.dern r12) {
        /*
            boolean r0 = r12 instanceof ads_mobile_sdk.i33
            if (r0 == 0) goto L13
            r0 = r12
            ads_mobile_sdk.i33 r0 = (ads_mobile_sdk.i33) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.i33 r0 = new ads_mobile_sdk.i33
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.b
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p002kotlin.dern.saneness(r12)
            goto L81
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            ads_mobile_sdk.o33 r10 = r0.a
            p002kotlin.dern.saneness(r12)
            goto L4b
        L3a:
            p002kotlin.dern.saneness(r12)
            r0.a = r10
            r0.d = r4
            r10.getClass()
            java.lang.Object r11 = ads_mobile_sdk.hm0.a(r10, r11, r0)
            if (r11 != r1) goto L4b
            goto L80
        L4b:
            kotlinx.coroutines.saran r4 = r10.d
            ads_mobile_sdk.j33 r11 = new ads_mobile_sdk.j33
            r12 = 0
            r11.<init>(r10, r12)
            kotlin.coroutines.EmptyCoroutineContext r5 = p002kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            java.lang.String r2 = "<this>"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            java.lang.String r2 = "context"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            java.lang.String r2 = "block"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
            ads_mobile_sdk.x13 r7 = new ads_mobile_sdk.x13
            r7.<init>(r11, r12)
            r8 = 2
            r9 = 0
            r6 = 0
            kotlinx.coroutines.impromptu.wireman(r4, r5, r6, r7, r8, r9)
            kotlin.coroutines.CoroutineContext r11 = r10.c
            ads_mobile_sdk.k33 r2 = new ads_mobile_sdk.k33
            r2.<init>(r10, r12)
            r0.a = r12
            r0.d = r3
            java.lang.Object r10 = kotlinx.coroutines.impromptu.competently(r11, r2, r0)
            if (r10 != r1) goto L81
        L80:
            return r1
        L81:
            kotlin.Unit r10 = p002kotlin.Unit.f29295attabal
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.o33.a(ads_mobile_sdk.o33, android.view.View, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0155  */
    /* JADX WARN: Code duplicated, block: B:41:0x0196  */
    /* JADX WARN: Code duplicated, block: B:44:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:47:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:49:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:52:0x01de  */
    /* JADX WARN: Code duplicated, block: B:54:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:61:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:64:0x0203  */
    /* JADX WARN: Code duplicated, block: B:66:0x0207  */
    /* JADX WARN: Code duplicated, block: B:69:0x021f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0221  */
    /* JADX WARN: Code duplicated, block: B:75:0x0236  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object a(boolean z, int i, boolean z2, String str, String str2, String str3, gq0 gq0Var, boolean z3, wretchedly.dern dernVar) {
        l33 l33Var;
        boolean z4;
        Object objA;
        boolean z5;
        int i2;
        String str4;
        String str5;
        o33 o33Var;
        String str6;
        boolean z6;
        xq0 xq0Var;
        int i3;
        String str7;
        boolean z7;
        String str8;
        o33 o33Var2;
        String str9;
        jk0 jk0Var;
        xq0 xq0Var2;
        o33 o33Var3;
        boolean z8;
        boolean z9;
        gq0 gq0Var2;
        boolean z10;
        boolean z11;
        Context contextB;
        gq0 gq0Var3;
        gq0 gq0Var4;
        if (dernVar instanceof l33) {
            l33Var = (l33) dernVar;
            int i4 = l33Var.l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                l33Var.l = i4 - Integer.MIN_VALUE;
            } else {
                l33Var = new l33(this, dernVar);
            }
        } else {
            l33Var = new l33(this, dernVar);
        }
        l33 l33Var2 = l33Var;
        Object objA2 = l33Var2.j;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i5 = l33Var2.l;
        String str10 = "block";
        String str11 = "context";
        if (i5 == 0) {
            p002kotlin.dern.saneness(objA2);
            this.V = str;
            this.U = gq0Var;
            g83 g83Var = this.R;
            ia3 ia3Var = new ia3(ha3.FULLSCREEN, 0, 0, 14);
            l13 l13Var = this.Q;
            u20 u20Var = this.P;
            l33Var2.a = this;
            l33Var2.b = str;
            l33Var2.c = str2;
            l33Var2.d = str3;
            l33Var2.f = z;
            l33Var2.i = i;
            z4 = z2;
            l33Var2.g = z4;
            l33Var2.h = z3;
            l33Var2.l = 1;
            objA = g83Var.a.a(ia3Var, l13Var, u20Var, (a22) null, l33Var2);
            if (objA != objBeachfront) {
                z5 = z;
                i2 = i;
                str4 = str2;
                str5 = str3;
                o33Var = this;
                str6 = str;
                z6 = z3;
            }
            return objBeachfront;
        }
        if (i5 == 1) {
            z6 = l33Var2.h;
            boolean z12 = l33Var2.g;
            i2 = l33Var2.i;
            z5 = l33Var2.f;
            str5 = l33Var2.d;
            str4 = l33Var2.c;
            str6 = (String) l33Var2.b;
            o33Var = l33Var2.a;
            p002kotlin.dern.saneness(objA2);
            z4 = z12;
            objA = objA2;
        } else {
            if (i5 == 2) {
                z6 = l33Var2.h;
                boolean z13 = l33Var2.g;
                int i6 = l33Var2.i;
                boolean z14 = l33Var2.f;
                xq0Var = l33Var2.e;
                str9 = l33Var2.d;
                str7 = l33Var2.c;
                str8 = (String) l33Var2.b;
                o33Var2 = l33Var2.a;
                p002kotlin.dern.saneness(objA2);
                z4 = z13;
                i3 = i6;
                z7 = z14;
                if (str8 != null && str7 == null) {
                    y13.a("Cannot open two piece expandable with no url or html", null, 6);
                    return Unit.f29295attabal;
                }
                jk0Var = o33Var2.e;
                jk0Var.getClass();
                Intrinsics.checkNotNullParameter("gads:should_show_two_piece_activity_before_load", X3.i.W);
                if (((Boolean) jk0Var.a("gads:should_show_two_piece_activity_before_load", Boolean.TRUE, zk.b)).booleanValue()) {
                    saran saranVar = o33Var2.d;
                    xq0 xq0Var3 = xq0Var;
                    m33 m33Var = new m33(o33Var2, xq0Var3, str8, str7, str9, null);
                    xq0Var2 = xq0Var3;
                    EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                    Intrinsics.checkNotNullParameter(saranVar, "<this>");
                    str11 = str11;
                    Intrinsics.checkNotNullParameter(emptyCoroutineContext, str11);
                    str10 = str10;
                    Intrinsics.checkNotNullParameter(m33Var, str10);
                    cutely.wireman(saranVar, emptyCoroutineContext, null, new x13(m33Var, null), 2, null);
                } else {
                    String str12 = str9;
                    xq0Var2 = xq0Var;
                    gq0 gq0Var5 = xq0Var2.a;
                    l33Var2.a = o33Var2;
                    l33Var2.b = xq0Var2;
                    l33Var2.c = null;
                    l33Var2.d = null;
                    l33Var2.e = null;
                    l33Var2.f = z7;
                    l33Var2.i = i3;
                    l33Var2.g = z4;
                    l33Var2.h = z6;
                    l33Var2.l = 3;
                    objA2 = o33Var2.a(gq0Var5, str8, str7, str12, l33Var2);
                    if (objA2 != objBeachfront) {
                        o33Var3 = o33Var2;
                        z8 = z4;
                    }
                    return objBeachfront;
                }
                xq0 xq0Var4 = xq0Var2;
                if (z4) {
                    gq0Var4 = o33Var2.U;
                    if (gq0Var4 == null) {
                        Intrinsics.preprohormone("previousWebView");
                        gq0Var4 = null;
                    }
                    if (gq0Var4.l.get()) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                } else {
                    z9 = false;
                }
                o33Var2.N = z9;
                gq0Var2 = o33Var2.U;
                if (gq0Var2 == null) {
                    Intrinsics.preprohormone("previousWebView");
                    gq0Var2 = null;
                }
                if (!gq0Var2.l.get()) {
                    gq0Var3 = o33Var2.U;
                    if (gq0Var3 == null) {
                        Intrinsics.preprohormone("previousWebView");
                        gq0Var3 = null;
                    }
                    z10 = false;
                    if (!Intrinsics.wireman(gq0Var3.e(), new ia3(ha3.FULLSCREEN, 0, 0, 14))) {
                        z11 = true;
                    }
                    o33Var2.O = z11;
                    o33Var2.s = z7;
                    o33Var2.I = i3;
                    o33Var2.u = z10;
                    o33Var2.w = z6;
                    contextB = o33Var2.L.b();
                    if (contextB == null) {
                        contextB = o33Var2.a;
                    }
                    Intrinsics.checkNotNullParameter(xq0Var4, "<set-?>");
                    o33Var2.q = xq0Var4;
                    Intrinsics.checkNotNullParameter(xq0Var4, "<set-?>");
                    o33Var2.F = xq0Var4;
                    saran saranVar2 = o33Var2.b;
                    n33 n33Var = new n33(o33Var2, contextB, null);
                    EmptyCoroutineContext emptyCoroutineContext2 = EmptyCoroutineContext.INSTANCE;
                    Intrinsics.checkNotNullParameter(saranVar2, "<this>");
                    Intrinsics.checkNotNullParameter(emptyCoroutineContext2, str11);
                    Intrinsics.checkNotNullParameter(n33Var, str10);
                    cutely.wireman(saranVar2, emptyCoroutineContext2, null, new x13(n33Var, null), 2, null);
                    return Unit.f29295attabal;
                }
                z10 = false;
                z11 = z10;
                o33Var2.O = z11;
                o33Var2.s = z7;
                o33Var2.I = i3;
                o33Var2.u = z10;
                o33Var2.w = z6;
                contextB = o33Var2.L.b();
                if (contextB == null) {
                    contextB = o33Var2.a;
                }
                Intrinsics.checkNotNullParameter(xq0Var4, "<set-?>");
                o33Var2.q = xq0Var4;
                Intrinsics.checkNotNullParameter(xq0Var4, "<set-?>");
                o33Var2.F = xq0Var4;
                saran saranVar3 = o33Var2.b;
                n33 n33Var2 = new n33(o33Var2, contextB, null);
                EmptyCoroutineContext emptyCoroutineContext3 = EmptyCoroutineContext.INSTANCE;
                Intrinsics.checkNotNullParameter(saranVar3, "<this>");
                Intrinsics.checkNotNullParameter(emptyCoroutineContext3, str11);
                Intrinsics.checkNotNullParameter(n33Var2, str10);
                cutely.wireman(saranVar3, emptyCoroutineContext3, null, new x13(n33Var2, null), 2, null);
                return Unit.f29295attabal;
            }
            if (i5 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z6 = l33Var2.h;
            z8 = l33Var2.g;
            i3 = l33Var2.i;
            z7 = l33Var2.f;
            xq0Var2 = (xq0) l33Var2.b;
            o33Var3 = l33Var2.a;
            p002kotlin.dern.saneness(objA2);
        }
        if (!((Boolean) objA2).booleanValue()) {
            return Unit.f29295attabal;
        }
        z4 = z8;
        o33Var2 = o33Var3;
        xq0 xq0Var5 = xq0Var2;
        if (z4) {
            z9 = false;
        } else {
            gq0Var4 = o33Var2.U;
            if (gq0Var4 == null) {
                Intrinsics.preprohormone("previousWebView");
                gq0Var4 = null;
            }
            if (gq0Var4.l.get()) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        o33Var2.N = z9;
        gq0Var2 = o33Var2.U;
        if (gq0Var2 == null) {
            Intrinsics.preprohormone("previousWebView");
            gq0Var2 = null;
        }
        if (!gq0Var2.l.get()) {
            gq0Var3 = o33Var2.U;
            if (gq0Var3 == null) {
                Intrinsics.preprohormone("previousWebView");
                gq0Var3 = null;
            }
            z10 = false;
            if (!Intrinsics.wireman(gq0Var3.e(), new ia3(ha3.FULLSCREEN, 0, 0, 14))) {
                z11 = true;
            }
            o33Var2.O = z11;
            o33Var2.s = z7;
            o33Var2.I = i3;
            o33Var2.u = z10;
            o33Var2.w = z6;
            contextB = o33Var2.L.b();
            if (contextB == null) {
                contextB = o33Var2.a;
            }
            Intrinsics.checkNotNullParameter(xq0Var5, "<set-?>");
            o33Var2.q = xq0Var5;
            Intrinsics.checkNotNullParameter(xq0Var5, "<set-?>");
            o33Var2.F = xq0Var5;
            saran saranVar4 = o33Var2.b;
            n33 n33Var3 = new n33(o33Var2, contextB, null);
            EmptyCoroutineContext emptyCoroutineContext4 = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar4, "<this>");
            Intrinsics.checkNotNullParameter(emptyCoroutineContext4, str11);
            Intrinsics.checkNotNullParameter(n33Var3, str10);
            cutely.wireman(saranVar4, emptyCoroutineContext4, null, new x13(n33Var3, null), 2, null);
            return Unit.f29295attabal;
        }
        z10 = false;
        z11 = z10;
        o33Var2.O = z11;
        o33Var2.s = z7;
        o33Var2.I = i3;
        o33Var2.u = z10;
        o33Var2.w = z6;
        contextB = o33Var2.L.b();
        if (contextB == null) {
            contextB = o33Var2.a;
        }
        Intrinsics.checkNotNullParameter(xq0Var5, "<set-?>");
        o33Var2.q = xq0Var5;
        Intrinsics.checkNotNullParameter(xq0Var5, "<set-?>");
        o33Var2.F = xq0Var5;
        saran saranVar5 = o33Var2.b;
        n33 n33Var4 = new n33(o33Var2, contextB, null);
        EmptyCoroutineContext emptyCoroutineContext5 = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar5, "<this>");
        Intrinsics.checkNotNullParameter(emptyCoroutineContext5, str11);
        Intrinsics.checkNotNullParameter(n33Var4, str10);
        cutely.wireman(saranVar5, emptyCoroutineContext5, null, new x13(n33Var4, null), 2, null);
        return Unit.f29295attabal;
        xq0 xq0Var6 = (xq0) objA;
        gq0 gq0Var6 = xq0Var6.a;
        extinctive extinctiveVar = o33Var.S;
        gerenuk gerenukVarC = gq0Var6.c();
        rotuma bc0Var = gerenukVarC instanceof rotuma ? (rotuma) gerenukVarC : null;
        if (bc0Var == null) {
            bc0Var = new bc0(gq0Var6);
        }
        l33Var2.a = o33Var;
        l33Var2.b = str6;
        l33Var2.c = str4;
        l33Var2.d = str5;
        l33Var2.e = xq0Var6;
        l33Var2.f = z5;
        l33Var2.i = i2;
        l33Var2.g = z4;
        l33Var2.h = z6;
        l33Var2.l = 2;
        if (extinctiveVar.a(bc0Var, l33Var2) != objBeachfront) {
            String str13 = str5;
            xq0Var = xq0Var6;
            i3 = i2;
            str7 = str4;
            z7 = z5;
            str8 = str6;
            o33Var2 = o33Var;
            str9 = str13;
            if (str8 != null) {
            }
            jk0Var = o33Var2.e;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:should_show_two_piece_activity_before_load", X3.i.W);
            if (((Boolean) jk0Var.a("gads:should_show_two_piece_activity_before_load", Boolean.TRUE, zk.b)).booleanValue()) {
                saran saranVar6 = o33Var2.d;
                xq0 xq0Var7 = xq0Var;
                m33 m33Var2 = new m33(o33Var2, xq0Var7, str8, str7, str9, null);
                xq0Var2 = xq0Var7;
                EmptyCoroutineContext emptyCoroutineContext6 = EmptyCoroutineContext.INSTANCE;
                Intrinsics.checkNotNullParameter(saranVar6, "<this>");
                str11 = str11;
                Intrinsics.checkNotNullParameter(emptyCoroutineContext6, str11);
                str10 = str10;
                Intrinsics.checkNotNullParameter(m33Var2, str10);
                cutely.wireman(saranVar6, emptyCoroutineContext6, null, new x13(m33Var2, null), 2, null);
            } else {
                String str14 = str9;
                xq0Var2 = xq0Var;
                gq0 gq0Var7 = xq0Var2.a;
                l33Var2.a = o33Var2;
                l33Var2.b = xq0Var2;
                l33Var2.c = null;
                l33Var2.d = null;
                l33Var2.e = null;
                l33Var2.f = z7;
                l33Var2.i = i3;
                l33Var2.g = z4;
                l33Var2.h = z6;
                l33Var2.l = 3;
                objA2 = o33Var2.a(gq0Var7, str8, str7, str14, l33Var2);
                if (objA2 != objBeachfront) {
                    o33Var3 = o33Var2;
                    z8 = z4;
                    if (!((Boolean) objA2).booleanValue()) {
                        return Unit.f29295attabal;
                    }
                    z4 = z8;
                    o33Var2 = o33Var3;
                }
            }
            xq0 xq0Var8 = xq0Var2;
            if (z4) {
                z9 = false;
            } else {
                gq0Var4 = o33Var2.U;
                if (gq0Var4 == null) {
                    Intrinsics.preprohormone("previousWebView");
                    gq0Var4 = null;
                }
                if (gq0Var4.l.get()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            o33Var2.N = z9;
            gq0Var2 = o33Var2.U;
            if (gq0Var2 == null) {
                Intrinsics.preprohormone("previousWebView");
                gq0Var2 = null;
            }
            if (!gq0Var2.l.get()) {
                gq0Var3 = o33Var2.U;
                if (gq0Var3 == null) {
                    Intrinsics.preprohormone("previousWebView");
                    gq0Var3 = null;
                }
                z10 = false;
                if (!Intrinsics.wireman(gq0Var3.e(), new ia3(ha3.FULLSCREEN, 0, 0, 14))) {
                    z11 = true;
                }
                o33Var2.O = z11;
                o33Var2.s = z7;
                o33Var2.I = i3;
                o33Var2.u = z10;
                o33Var2.w = z6;
                contextB = o33Var2.L.b();
                if (contextB == null) {
                    contextB = o33Var2.a;
                }
                Intrinsics.checkNotNullParameter(xq0Var8, "<set-?>");
                o33Var2.q = xq0Var8;
                Intrinsics.checkNotNullParameter(xq0Var8, "<set-?>");
                o33Var2.F = xq0Var8;
                saran saranVar7 = o33Var2.b;
                n33 n33Var5 = new n33(o33Var2, contextB, null);
                EmptyCoroutineContext emptyCoroutineContext7 = EmptyCoroutineContext.INSTANCE;
                Intrinsics.checkNotNullParameter(saranVar7, "<this>");
                Intrinsics.checkNotNullParameter(emptyCoroutineContext7, str11);
                Intrinsics.checkNotNullParameter(n33Var5, str10);
                cutely.wireman(saranVar7, emptyCoroutineContext7, null, new x13(n33Var5, null), 2, null);
                return Unit.f29295attabal;
            }
            z10 = false;
            z11 = z10;
            o33Var2.O = z11;
            o33Var2.s = z7;
            o33Var2.I = i3;
            o33Var2.u = z10;
            o33Var2.w = z6;
            contextB = o33Var2.L.b();
            if (contextB == null) {
                contextB = o33Var2.a;
            }
            Intrinsics.checkNotNullParameter(xq0Var8, "<set-?>");
            o33Var2.q = xq0Var8;
            Intrinsics.checkNotNullParameter(xq0Var8, "<set-?>");
            o33Var2.F = xq0Var8;
            saran saranVar8 = o33Var2.b;
            n33 n33Var6 = new n33(o33Var2, contextB, null);
            EmptyCoroutineContext emptyCoroutineContext8 = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar8, "<this>");
            Intrinsics.checkNotNullParameter(emptyCoroutineContext8, str11);
            Intrinsics.checkNotNullParameter(n33Var6, str10);
            cutely.wireman(saranVar8, emptyCoroutineContext8, null, new x13(n33Var6, null), 2, null);
            return Unit.f29295attabal;
        }
        return objBeachfront;
    }
}
