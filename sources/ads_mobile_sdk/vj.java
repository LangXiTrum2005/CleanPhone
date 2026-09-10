package ads_mobile_sdk;

import complexometry.formularize;
import java.io.Closeable;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.flow.marial;
import kotlinx.coroutines.impromptu;
import kotlinx.coroutines.saran;
import p002kotlin.collections.graveside;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$ObjectRef;
import saneness.adultoid;
import saneness.blindfish;
import saneness.bristol;
import saneness.coffeecake;
import saneness.evenfall;
import saneness.gerenuk;
import saneness.permanently;
import saneness.rotuma;
import saneness.sheafer;
import saneness.shimmery;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public abstract class vj extends l1 implements blindfish {
    public final adultoid k;
    public final u20 l;
    public final g83 m;
    public final saran n;
    public final rs0 o;
    public final wf p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj(coffeecake adComponentProvider, u20 csiTicker, g83 webViewFactory, saran uiScope, rs0 htmlUtil, wf appSettings, l13 traceMetaSet, formularize baseRequest, yf2 requestType, long j, int i, h1 adConfiguration, ur commonConfiguration, jm2 serverTransaction, String renderId, a22 placementIdWrapper) {
        super(traceMetaSet, baseRequest, requestType, j, i, adConfiguration, commonConfiguration, serverTransaction, renderId, placementIdWrapper);
        Intrinsics.checkNotNullParameter(adComponentProvider, "adComponentProvider");
        Intrinsics.checkNotNullParameter(csiTicker, "csiTicker");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
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
        Intrinsics.checkNotNullParameter(placementIdWrapper, "placementIdWrapper");
        this.k = adComponentProvider;
        this.l = csiTicker;
        this.m = webViewFactory;
        this.n = uiScope;
        this.o = htmlUtil;
        this.p = appSettings;
    }

    @Override // saneness.blindfish
    public final wf a() {
        return this.p;
    }

    @Override // saneness.idolatry
    public final boolean b() {
        wx0 wx0Var = this.f.H;
        return (wx0Var != null ? wx0Var.a : null) != null;
    }

    @Override // ads_mobile_sdk.l1
    public final Object a(boolean z, wretchedly.dern dernVar) {
        return a(this, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0289 A[Catch: all -> 0x0270, TRY_LEAVE, TryCatch #1 {all -> 0x0270, blocks: (B:84:0x0259, B:86:0x0260, B:88:0x0267, B:90:0x026b, B:92:0x026f, B:95:0x0273, B:96:0x0278, B:97:0x0279, B:98:0x0280, B:99:0x0281, B:100:0x0288, B:101:0x0289), top: B:132:0x0259 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x029a A[Catch: all -> 0x02aa, TryCatch #5 {all -> 0x02aa, blocks: (B:108:0x0293, B:110:0x029a, B:112:0x02a1, B:114:0x02a5, B:116:0x02a9, B:119:0x02ad, B:120:0x02b2, B:121:0x02b3, B:122:0x02ba, B:123:0x02bb, B:124:0x02c2, B:125:0x02c3), top: B:139:0x0293 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x02a1 A[Catch: all -> 0x02aa, TryCatch #5 {all -> 0x02aa, blocks: (B:108:0x0293, B:110:0x029a, B:112:0x02a1, B:114:0x02a5, B:116:0x02a9, B:119:0x02ad, B:120:0x02b2, B:121:0x02b3, B:122:0x02ba, B:123:0x02bb, B:124:0x02c2, B:125:0x02c3), top: B:139:0x0293 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x02a5 A[Catch: all -> 0x02aa, TryCatch #5 {all -> 0x02aa, blocks: (B:108:0x0293, B:110:0x029a, B:112:0x02a1, B:114:0x02a5, B:116:0x02a9, B:119:0x02ad, B:120:0x02b2, B:121:0x02b3, B:122:0x02ba, B:123:0x02bb, B:124:0x02c2, B:125:0x02c3), top: B:139:0x0293 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x02a9 A[Catch: all -> 0x02aa, TryCatch #5 {all -> 0x02aa, blocks: (B:108:0x0293, B:110:0x029a, B:112:0x02a1, B:114:0x02a5, B:116:0x02a9, B:119:0x02ad, B:120:0x02b2, B:121:0x02b3, B:122:0x02ba, B:123:0x02bb, B:124:0x02c2, B:125:0x02c3), top: B:139:0x0293 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x02ad A[Catch: all -> 0x02aa, TryCatch #5 {all -> 0x02aa, blocks: (B:108:0x0293, B:110:0x029a, B:112:0x02a1, B:114:0x02a5, B:116:0x02a9, B:119:0x02ad, B:120:0x02b2, B:121:0x02b3, B:122:0x02ba, B:123:0x02bb, B:124:0x02c2, B:125:0x02c3), top: B:139:0x0293 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x02b3 A[Catch: all -> 0x02aa, TryCatch #5 {all -> 0x02aa, blocks: (B:108:0x0293, B:110:0x029a, B:112:0x02a1, B:114:0x02a5, B:116:0x02a9, B:119:0x02ad, B:120:0x02b2, B:121:0x02b3, B:122:0x02ba, B:123:0x02bb, B:124:0x02c2, B:125:0x02c3), top: B:139:0x0293 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x02bb A[Catch: all -> 0x02aa, TryCatch #5 {all -> 0x02aa, blocks: (B:108:0x0293, B:110:0x029a, B:112:0x02a1, B:114:0x02a5, B:116:0x02a9, B:119:0x02ad, B:120:0x02b2, B:121:0x02b3, B:122:0x02ba, B:123:0x02bb, B:124:0x02c2, B:125:0x02c3), top: B:139:0x0293 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x02c3 A[Catch: all -> 0x02aa, TRY_LEAVE, TryCatch #5 {all -> 0x02aa, blocks: (B:108:0x0293, B:110:0x029a, B:112:0x02a1, B:114:0x02a5, B:116:0x02a9, B:119:0x02ad, B:120:0x02b2, B:121:0x02b3, B:122:0x02ba, B:123:0x02bb, B:124:0x02c2, B:125:0x02c3), top: B:139:0x0293 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x015e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0168  */
    /* JADX WARN: Code duplicated, block: B:54:0x0171  */
    /* JADX WARN: Code duplicated, block: B:56:0x017b  */
    /* JADX WARN: Code duplicated, block: B:59:0x019a  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:72:0x020c A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #7 {all -> 0x006d, blocks: (B:20:0x0062, B:70:0x0206, B:72:0x020c), top: B:142:0x0062 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0219 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x021a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0242  */
    /* JADX WARN: Code duplicated, block: B:86:0x0260 A[Catch: all -> 0x0270, TryCatch #1 {all -> 0x0270, blocks: (B:84:0x0259, B:86:0x0260, B:88:0x0267, B:90:0x026b, B:92:0x026f, B:95:0x0273, B:96:0x0278, B:97:0x0279, B:98:0x0280, B:99:0x0281, B:100:0x0288, B:101:0x0289), top: B:132:0x0259 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0267 A[Catch: all -> 0x0270, TryCatch #1 {all -> 0x0270, blocks: (B:84:0x0259, B:86:0x0260, B:88:0x0267, B:90:0x026b, B:92:0x026f, B:95:0x0273, B:96:0x0278, B:97:0x0279, B:98:0x0280, B:99:0x0281, B:100:0x0288, B:101:0x0289), top: B:132:0x0259 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:90:0x026b A[Catch: all -> 0x0270, TryCatch #1 {all -> 0x0270, blocks: (B:84:0x0259, B:86:0x0260, B:88:0x0267, B:90:0x026b, B:92:0x026f, B:95:0x0273, B:96:0x0278, B:97:0x0279, B:98:0x0280, B:99:0x0281, B:100:0x0288, B:101:0x0289), top: B:132:0x0259 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x026f A[Catch: all -> 0x0270, TryCatch #1 {all -> 0x0270, blocks: (B:84:0x0259, B:86:0x0260, B:88:0x0267, B:90:0x026b, B:92:0x026f, B:95:0x0273, B:96:0x0278, B:97:0x0279, B:98:0x0280, B:99:0x0281, B:100:0x0288, B:101:0x0289), top: B:132:0x0259 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0273 A[Catch: all -> 0x0270, TryCatch #1 {all -> 0x0270, blocks: (B:84:0x0259, B:86:0x0260, B:88:0x0267, B:90:0x026b, B:92:0x026f, B:95:0x0273, B:96:0x0278, B:97:0x0279, B:98:0x0280, B:99:0x0281, B:100:0x0288, B:101:0x0289), top: B:132:0x0259 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0279 A[Catch: all -> 0x0270, TryCatch #1 {all -> 0x0270, blocks: (B:84:0x0259, B:86:0x0260, B:88:0x0267, B:90:0x026b, B:92:0x026f, B:95:0x0273, B:96:0x0278, B:97:0x0279, B:98:0x0280, B:99:0x0281, B:100:0x0288, B:101:0x0289), top: B:132:0x0259 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0281 A[Catch: all -> 0x0270, TryCatch #1 {all -> 0x0270, blocks: (B:84:0x0259, B:86:0x0260, B:88:0x0267, B:90:0x026b, B:92:0x026f, B:95:0x0273, B:96:0x0278, B:97:0x0279, B:98:0x0280, B:99:0x0281, B:100:0x0288, B:101:0x0289), top: B:132:0x0259 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v3, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r4v32, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v33, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v37, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v42, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r8v3, types: [T, java.lang.String] */
    public static Object a(vj vjVar, wretchedly.dern dernVar) throws Throwable {
        tj tjVar;
        Closeable closeable;
        ?? r4;
        gq0 gq0Var;
        vj vjVar2;
        sheafer sheaferVar;
        xq0 xq0Var;
        wx0 wx0Var;
        Ref$ObjectRef ref$ObjectRef;
        ?? r8;
        Object objA;
        xq0 xq0Var2;
        vj vjVar3;
        gq0 gq0Var2;
        wx0 wx0Var2;
        sheafer sheaferVar2;
        Ref$ObjectRef ref$ObjectRef2;
        w03 w03VarA;
        Closeable closeable2;
        ?? r5;
        gq0 gq0Var3;
        Object objA2;
        sheafer sheaferVar3;
        gq0 gq0Var4;
        xq0 xq0Var3;
        vj vjVar4;
        String script;
        spartacist spartacistVar;
        CoroutineContext coroutineContext;
        uj ujVar;
        sheafer sheaferVar4;
        sheafer sheaferVar5;
        vj vjVar5 = vjVar;
        if (dernVar instanceof tj) {
            tjVar = (tj) dernVar;
            int i = tjVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                tjVar.i = i - Integer.MIN_VALUE;
            } else {
                tjVar = new tj(vjVar5, dernVar);
            }
        } else {
            tjVar = new tj(vjVar5, dernVar);
        }
        tj tjVar2 = tjVar;
        Object obj = tjVar2.g;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = tjVar2.i;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            no0 no0Var = no0.CUI_NAME_CREATIVE_WEBVIEW_INITIALIZATION;
            WeakHashMap weakHashMap = j13.a;
            w03 w03VarA2 = j13.a(no0Var, p002kotlin.collections.adultoid.formularize(), true);
            try {
                g83 g83Var = vjVar5.m;
                ia3 ia3Var = new ia3(ha3.FULLSCREEN, 0, 0, 14);
                l13 l13Var = vjVar5.a;
                u20 u20Var = vjVar5.l;
                a22 a22Var = vjVar5.j;
                tjVar2.a = vjVar5;
                tjVar2.b = w03VarA2;
                tjVar2.c = w03VarA2;
                tjVar2.i = 1;
                Object objA3 = g83Var.a.a(ia3Var, l13Var, u20Var, a22Var, tjVar2);
                tjVar2 = tjVar2;
                if (objA3 != objBeachfront) {
                    w03 w03Var = w03VarA2;
                    obj = objA3;
                    closeable = w03Var;
                    r4 = w03Var;
                }
                return objBeachfront;
            } catch (Throwable th) {
                th = th;
                closeable = w03VarA2;
                r4 = closeable;
                r4.b(th);
                if (!(th instanceof evenfall)) {
                    r4.a(th);
                    if (!(th instanceof TimeoutCancellationException)) {
                        if (!(th instanceof CancellationException)) {
                            if (th instanceof yn0) {
                                throw th;
                            }
                            throw new gn0(th);
                        }
                        throw new bn0(th);
                    }
                    throw new cp0(th);
                }
                throw th;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                sheaferVar = tjVar2.d;
                gq0Var = (gq0) tjVar2.c;
                xq0Var = (xq0) tjVar2.b;
                vjVar2 = (vj) tjVar2.a;
                p002kotlin.dern.saneness(obj);
                wx0Var = vjVar2.f.H;
                if (wx0Var == null) {
                    return new rn0("First party ad configuration has no inline ad field.", k41.INTERNAL_ERROR);
                }
                ref$ObjectRef = new Ref$ObjectRef();
                r8 = wx0Var.a;
                if (r8 == 0) {
                    return new rn0("First party ad configuration has no inline HTML field.", k41.INTERNAL_ERROR);
                }
                ref$ObjectRef.element = r8;
                xw1 xw1VarE = sheaferVar.e();
                tjVar2.a = vjVar2;
                tjVar2.b = xq0Var;
                tjVar2.c = gq0Var;
                tjVar2.d = sheaferVar;
                tjVar2.e = wx0Var;
                tjVar2.f = ref$ObjectRef;
                tjVar2.i = 3;
                xw1VarE.getClass();
                objA = xw1.a(xw1VarE, gq0Var, true, tjVar2);
                if (objA != objBeachfront) {
                    xq0Var2 = xq0Var;
                    vjVar3 = vjVar2;
                    gq0Var2 = gq0Var;
                    wx0Var2 = wx0Var;
                    sheaferVar2 = sheaferVar;
                    ref$ObjectRef2 = ref$ObjectRef;
                    if (((Boolean) objA).booleanValue()) {
                        rs0 rs0Var = vjVar3.o;
                        String html = (String) ref$ObjectRef2.element;
                        rs0Var.getClass();
                        Intrinsics.checkNotNullParameter(html, "html");
                        Intrinsics.checkNotNullParameter(script, "script");
                        ref$ObjectRef2.element = rs0.a(html, graveside.marial(script));
                    }
                    no0 no0Var2 = no0.CUI_NAME_CREATIVE_WEBVIEW_LOAD;
                    WeakHashMap weakHashMap2 = j13.a;
                    w03VarA = j13.a(no0Var2, p002kotlin.collections.adultoid.formularize(), true);
                    String str = (String) ref$ObjectRef2.element;
                    String str2 = wx0Var2.b;
                    tjVar2.a = vjVar3;
                    tjVar2.b = xq0Var2;
                    tjVar2.c = gq0Var2;
                    tjVar2.d = sheaferVar2;
                    tjVar2.e = w03VarA;
                    tjVar2.f = w03VarA;
                    tjVar2.i = 4;
                    gq0Var3 = gq0Var2;
                    objA2 = gq0.a(gq0Var3, str, str2, true, (wretchedly.dern) tjVar2, 12);
                    if (objA2 != objBeachfront) {
                        sheaferVar3 = sheaferVar2;
                        gq0Var4 = gq0Var3;
                        xq0Var3 = xq0Var2;
                        vjVar4 = vjVar3;
                        closeable2 = w03VarA;
                        r5 = closeable2;
                        obj = objA2;
                        spartacistVar = (spartacist) obj;
                        if (spartacistVar instanceof nn0) {
                            y13.a((nn0) spartacistVar, false);
                        }
                        interaction.saneness.attabal(closeable2, null);
                        if (spartacistVar instanceof nn0) {
                            return spartacistVar;
                        }
                        coroutineContext = vjVar4.n.getCoroutineContext();
                        ujVar = new uj(vjVar4, xq0Var3, sheaferVar3, gq0Var4, null);
                        sheaferVar4 = sheaferVar3;
                        tjVar2.a = sheaferVar4;
                        tjVar2.b = null;
                        tjVar2.c = null;
                        tjVar2.d = null;
                        tjVar2.e = null;
                        tjVar2.f = null;
                        tjVar2.i = 5;
                        if (impromptu.competently(coroutineContext, ujVar, tjVar2) != objBeachfront) {
                            sheaferVar5 = sheaferVar4;
                            return new tn0(marial.gintrap(new tn0(sheaferVar5.a())));
                        }
                    }
                }
                return objBeachfront;
            }
            if (i2 == 3) {
                ref$ObjectRef2 = (Ref$ObjectRef) tjVar2.f;
                wx0Var2 = (wx0) tjVar2.e;
                sheafer sheaferVar6 = tjVar2.d;
                gq0Var2 = (gq0) tjVar2.c;
                xq0 xq0Var4 = (xq0) tjVar2.b;
                vj vjVar6 = (vj) tjVar2.a;
                p002kotlin.dern.saneness(obj);
                xq0Var2 = xq0Var4;
                vjVar3 = vjVar6;
                objA = obj;
                sheaferVar2 = sheaferVar6;
                if (((Boolean) objA).booleanValue() && (script = vjVar3.o.a(vjVar3.f)) != null) {
                    rs0 rs0Var2 = vjVar3.o;
                    String html2 = (String) ref$ObjectRef2.element;
                    rs0Var2.getClass();
                    Intrinsics.checkNotNullParameter(html2, "html");
                    Intrinsics.checkNotNullParameter(script, "script");
                    ref$ObjectRef2.element = rs0.a(html2, graveside.marial(script));
                }
                no0 no0Var3 = no0.CUI_NAME_CREATIVE_WEBVIEW_LOAD;
                WeakHashMap weakHashMap3 = j13.a;
                w03VarA = j13.a(no0Var3, p002kotlin.collections.adultoid.formularize(), true);
                try {
                    String str3 = (String) ref$ObjectRef2.element;
                    String str4 = wx0Var2.b;
                    tjVar2.a = vjVar3;
                    tjVar2.b = xq0Var2;
                    tjVar2.c = gq0Var2;
                    tjVar2.d = sheaferVar2;
                    tjVar2.e = w03VarA;
                    tjVar2.f = w03VarA;
                    tjVar2.i = 4;
                    gq0Var3 = gq0Var2;
                    objA2 = gq0.a(gq0Var3, str3, str4, true, (wretchedly.dern) tjVar2, 12);
                    if (objA2 != objBeachfront) {
                        sheaferVar3 = sheaferVar2;
                        gq0Var4 = gq0Var3;
                        xq0Var3 = xq0Var2;
                        vjVar4 = vjVar3;
                        closeable2 = w03VarA;
                        r5 = closeable2;
                        obj = objA2;
                        spartacistVar = (spartacist) obj;
                        if (spartacistVar instanceof nn0) {
                            y13.a((nn0) spartacistVar, false);
                        }
                        interaction.saneness.attabal(closeable2, null);
                        if (spartacistVar instanceof nn0) {
                            return spartacistVar;
                        }
                        coroutineContext = vjVar4.n.getCoroutineContext();
                        ujVar = new uj(vjVar4, xq0Var3, sheaferVar3, gq0Var4, null);
                        sheaferVar4 = sheaferVar3;
                        tjVar2.a = sheaferVar4;
                        tjVar2.b = null;
                        tjVar2.c = null;
                        tjVar2.d = null;
                        tjVar2.e = null;
                        tjVar2.f = null;
                        tjVar2.i = 5;
                        if (impromptu.competently(coroutineContext, ujVar, tjVar2) != objBeachfront) {
                            sheaferVar5 = sheaferVar4;
                            return new tn0(marial.gintrap(new tn0(sheaferVar5.a())));
                        }
                    }
                    return objBeachfront;
                } catch (Throwable th2) {
                    th = th2;
                    closeable2 = w03VarA;
                    r5 = closeable2;
                    r5.b(th);
                    if (!(th instanceof evenfall)) {
                        r5.a(th);
                        if (!(th instanceof TimeoutCancellationException)) {
                            if (!(th instanceof CancellationException)) {
                                if (th instanceof yn0) {
                                    throw th;
                                }
                                throw new gn0(th);
                            }
                            throw new bn0(th);
                        }
                        throw new cp0(th);
                    }
                    throw th;
                }
            }
            if (i2 == 4) {
                closeable2 = (Closeable) tjVar2.f;
                r5 = (w03) tjVar2.e;
                sheafer sheaferVar7 = tjVar2.d;
                gq0 gq0Var5 = (gq0) tjVar2.c;
                xq0 xq0Var5 = (xq0) tjVar2.b;
                vjVar4 = (vj) tjVar2.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    sheaferVar3 = sheaferVar7;
                    gq0Var4 = gq0Var5;
                    xq0Var3 = xq0Var5;
                    r5 = r5;
                    spartacistVar = (spartacist) obj;
                    if (spartacistVar instanceof nn0) {
                        y13.a((nn0) spartacistVar, false);
                    }
                    interaction.saneness.attabal(closeable2, null);
                    if (spartacistVar instanceof nn0) {
                        return spartacistVar;
                    }
                    coroutineContext = vjVar4.n.getCoroutineContext();
                    ujVar = new uj(vjVar4, xq0Var3, sheaferVar3, gq0Var4, null);
                    sheaferVar4 = sheaferVar3;
                    tjVar2.a = sheaferVar4;
                    tjVar2.b = null;
                    tjVar2.c = null;
                    tjVar2.d = null;
                    tjVar2.e = null;
                    tjVar2.f = null;
                    tjVar2.i = 5;
                    if (impromptu.competently(coroutineContext, ujVar, tjVar2) != objBeachfront) {
                        sheaferVar5 = sheaferVar4;
                    }
                    return objBeachfront;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        r5.b(th);
                        if (!(th instanceof evenfall)) {
                            r5.a(th);
                            if (!(th instanceof TimeoutCancellationException)) {
                                if (!(th instanceof CancellationException)) {
                                    if (th instanceof yn0) {
                                        throw th;
                                    }
                                    throw new gn0(th);
                                }
                                throw new bn0(th);
                            }
                            throw new cp0(th);
                        }
                        throw th;
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            interaction.saneness.attabal(closeable2, th4);
                            throw th5;
                        }
                    }
                }
            }
            if (i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sheaferVar5 = (sheafer) tjVar2.a;
            p002kotlin.dern.saneness(obj);
            return new tn0(marial.gintrap(new tn0(sheaferVar5.a())));
        }
        closeable = (Closeable) tjVar2.c;
        r4 = (w03) tjVar2.b;
        vjVar5 = (vj) tjVar2.a;
        try {
            p002kotlin.dern.saneness(obj);
            closeable = closeable;
            r4 = r4;
        } catch (Throwable th6) {
            th = th6;
            try {
                r4.b(th);
                if (!(th instanceof evenfall)) {
                    r4.a(th);
                    if (!(th instanceof TimeoutCancellationException)) {
                        if (!(th instanceof CancellationException)) {
                            if (th instanceof yn0) {
                                throw th;
                            }
                            throw new gn0(th);
                        }
                        throw new bn0(th);
                    }
                    throw new cp0(th);
                }
                throw th;
            } catch (Throwable th7) {
                try {
                    throw th7;
                } catch (Throwable th8) {
                    interaction.saneness.attabal(closeable, th7);
                    throw th8;
                }
            }
        }
        xq0 xq0Var6 = (xq0) obj;
        interaction.saneness.attabal(closeable, null);
        gq0Var = xq0Var6.a;
        Object obj2 = vjVar5.k.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        sheafer sheaferVar8 = (sheafer) ((bristol) ((bristol) ((bristol) ((bristol) ((bristol) vjVar5.a((permanently) obj2, false)).a(gq0Var)).a(vjVar5.l)).b(xq0Var6)).a(xq0Var6)).a();
        shimmery shimmeryVarC = sheaferVar8.c();
        gerenuk gerenukVarC = gq0Var.c();
        rotuma bc0Var = gerenukVarC instanceof rotuma ? (rotuma) gerenukVarC : null;
        if (bc0Var == null) {
            bc0Var = new bc0(gq0Var);
        }
        tjVar2.a = vjVar5;
        tjVar2.b = xq0Var6;
        tjVar2.c = gq0Var;
        tjVar2.d = sheaferVar8;
        tjVar2.i = 2;
        if (shimmeryVarC.a(bc0Var, tjVar2) != objBeachfront) {
            vjVar2 = vjVar5;
            sheaferVar = sheaferVar8;
            xq0Var = xq0Var6;
            wx0Var = vjVar2.f.H;
            if (wx0Var == null) {
                return new rn0("First party ad configuration has no inline ad field.", k41.INTERNAL_ERROR);
            }
            ref$ObjectRef = new Ref$ObjectRef();
            r8 = wx0Var.a;
            if (r8 == 0) {
                return new rn0("First party ad configuration has no inline HTML field.", k41.INTERNAL_ERROR);
            }
            ref$ObjectRef.element = r8;
            xw1 xw1VarE2 = sheaferVar.e();
            tjVar2.a = vjVar2;
            tjVar2.b = xq0Var;
            tjVar2.c = gq0Var;
            tjVar2.d = sheaferVar;
            tjVar2.e = wx0Var;
            tjVar2.f = ref$ObjectRef;
            tjVar2.i = 3;
            xw1VarE2.getClass();
            objA = xw1.a(xw1VarE2, gq0Var, true, tjVar2);
            if (objA != objBeachfront) {
                xq0Var2 = xq0Var;
                vjVar3 = vjVar2;
                gq0Var2 = gq0Var;
                wx0Var2 = wx0Var;
                sheaferVar2 = sheaferVar;
                ref$ObjectRef2 = ref$ObjectRef;
                if (((Boolean) objA).booleanValue()) {
                    rs0 rs0Var3 = vjVar3.o;
                    String html3 = (String) ref$ObjectRef2.element;
                    rs0Var3.getClass();
                    Intrinsics.checkNotNullParameter(html3, "html");
                    Intrinsics.checkNotNullParameter(script, "script");
                    ref$ObjectRef2.element = rs0.a(html3, graveside.marial(script));
                }
                no0 no0Var4 = no0.CUI_NAME_CREATIVE_WEBVIEW_LOAD;
                WeakHashMap weakHashMap4 = j13.a;
                w03VarA = j13.a(no0Var4, p002kotlin.collections.adultoid.formularize(), true);
                String str5 = (String) ref$ObjectRef2.element;
                String str6 = wx0Var2.b;
                tjVar2.a = vjVar3;
                tjVar2.b = xq0Var2;
                tjVar2.c = gq0Var2;
                tjVar2.d = sheaferVar2;
                tjVar2.e = w03VarA;
                tjVar2.f = w03VarA;
                tjVar2.i = 4;
                gq0Var3 = gq0Var2;
                objA2 = gq0.a(gq0Var3, str5, str6, true, (wretchedly.dern) tjVar2, 12);
                if (objA2 != objBeachfront) {
                    sheaferVar3 = sheaferVar2;
                    gq0Var4 = gq0Var3;
                    xq0Var3 = xq0Var2;
                    vjVar4 = vjVar3;
                    closeable2 = w03VarA;
                    r5 = closeable2;
                    obj = objA2;
                    spartacistVar = (spartacist) obj;
                    if (spartacistVar instanceof nn0) {
                        y13.a((nn0) spartacistVar, false);
                    }
                    interaction.saneness.attabal(closeable2, null);
                    if (spartacistVar instanceof nn0) {
                        return spartacistVar;
                    }
                    coroutineContext = vjVar4.n.getCoroutineContext();
                    ujVar = new uj(vjVar4, xq0Var3, sheaferVar3, gq0Var4, null);
                    sheaferVar4 = sheaferVar3;
                    tjVar2.a = sheaferVar4;
                    tjVar2.b = null;
                    tjVar2.c = null;
                    tjVar2.d = null;
                    tjVar2.e = null;
                    tjVar2.f = null;
                    tjVar2.i = 5;
                    if (impromptu.competently(coroutineContext, ujVar, tjVar2) != objBeachfront) {
                        sheaferVar5 = sheaferVar4;
                        return new tn0(marial.gintrap(new tn0(sheaferVar5.a())));
                    }
                }
            }
        }
        return objBeachfront;
    }
}
