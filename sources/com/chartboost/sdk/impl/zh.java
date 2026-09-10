package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import com.p004ironsource.ko;
import com.smartdigimkt.sdk.basead.ui.BaseATView;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class zh extends f2 implements xe {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final a f15746A = new a(null);
    public final Context o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f15747p;
    public final vg q;
    public final jj r;
    public final tc s;
    public final zj t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Mediation f15748u;
    public pc v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ti f15749w;
    public final Lazy x;
    public final Lazy y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final d f15750z;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f15751b = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p2 invoke() {
            return w3.f15454b.a().p();
        }
    }

    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f15752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f15753c;
        public Object d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f15754e;
        public Object f;
        public Object g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f15755h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Object f15756i;
        public Object j;
        public Object k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f15757l;
        public /* synthetic */ Object m;
        public int o;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.m = obj;
            this.o |= Integer.MIN_VALUE;
            return zh.this.a(null, null, this);
        }
    }

    public static final class d implements m6 {
        public d() {
        }

        @Override // com.chartboost.sdk.impl.m6
        public void b(boolean z2) {
            pc pcVarZ = zh.this.z();
            if (pcVarZ != null) {
                pcVarZ.b(z2);
            }
        }
    }

    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f15760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f15761c;
        public Object d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f15762e;
        public int g;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15762e = obj;
            this.g |= Integer.MIN_VALUE;
            Object objA = zh.this.a((Context) null, this);
            return objA == CoroutineSingletons.X ? objA : new Result(objA);
        }
    }

    public static final class f extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f15763b = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final id invoke() {
            return w3.f15454b.j().a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh(Context context, String xml, ue renderableConfig, w adMarkupConfig, vg trackerComponent, jg telemetryManager, jj viewabilityComponent, tc okHttpNetworkClient, r adFormat, zj webViewFactory, Mediation mediation) {
        super(renderableConfig, adMarkupConfig, trackerComponent, telemetryManager, adFormat, mediation);
        Intrinsics.f(context, "context");
        Intrinsics.f(xml, "xml");
        Intrinsics.f(renderableConfig, "renderableConfig");
        Intrinsics.f(adMarkupConfig, "adMarkupConfig");
        Intrinsics.f(trackerComponent, "trackerComponent");
        Intrinsics.f(telemetryManager, "telemetryManager");
        Intrinsics.f(viewabilityComponent, "viewabilityComponent");
        Intrinsics.f(okHttpNetworkClient, "okHttpNetworkClient");
        Intrinsics.f(adFormat, "adFormat");
        Intrinsics.f(webViewFactory, "webViewFactory");
        this.o = context;
        this.f15747p = xml;
        this.q = trackerComponent;
        this.r = viewabilityComponent;
        this.s = okHttpNetworkClient;
        this.t = webViewFactory;
        this.f15748u = mediation;
        this.x = LazyKt.b(f.f15763b);
        this.y = LazyKt.b(b.f15751b);
        this.f15750z = new d();
    }

    private final id A() {
        return (id) this.x.getX();
    }

    private final p2 y() {
        return (p2) this.y.getX();
    }

    public final ti B() {
        return this.f15749w;
    }

    @Override // com.chartboost.sdk.impl.xe
    public void b(Throwable error) {
        Intrinsics.f(error, "error");
        xe xeVarI = i();
        if (xeVarI != null) {
            xeVarI.b(error);
        }
    }

    @Override // com.chartboost.sdk.impl.xe
    public void f() {
        xe xeVarI = i();
        if (xeVarI != null) {
            xeVarI.f();
        }
    }

    @Override // com.chartboost.sdk.impl.te
    public long g() {
        pc pcVar = this.v;
        if (pcVar != null) {
            return pcVar.g();
        }
        return 0L;
    }

    @Override // com.chartboost.sdk.impl.te
    public boolean h() {
        pc pcVar = this.v;
        return pcVar != null && pcVar.h();
    }

    @Override // com.chartboost.sdk.impl.te
    public float j() {
        pc pcVar = this.v;
        if (pcVar != null) {
            return pcVar.j();
        }
        return 1.0f;
    }

    @Override // com.chartboost.sdk.impl.te
    public View k() {
        pc pcVar = this.v;
        if (pcVar != null) {
            return pcVar.k();
        }
        return null;
    }

    @Override // com.chartboost.sdk.impl.te
    public void l() {
        pc pcVar = this.v;
        if (pcVar != null) {
            pcVar.l();
        }
    }

    @Override // com.chartboost.sdk.impl.te
    public void m() {
        pc pcVar = this.v;
        if (pcVar != null) {
            pcVar.m();
        }
    }

    @Override // com.chartboost.sdk.impl.te
    public void n() {
        pc pcVar = this.v;
        if (pcVar != null) {
            pcVar.n();
        }
    }

    @Override // com.chartboost.sdk.impl.te
    public void o() {
        pc pcVar = this.v;
        if (pcVar != null) {
            pcVar.o();
        }
    }

    @Override // com.chartboost.sdk.impl.f2
    public long s() {
        c5 c5VarB;
        pc pcVar = this.v;
        if (pcVar != null && pcVar.u() == 0) {
            return super.s();
        }
        xh xhVarO = v().o();
        if (xhVarO == null || (c5VarB = xhVarO.b()) == null) {
            return 0L;
        }
        return c5VarB.a();
    }

    @Override // com.chartboost.sdk.impl.f2
    public long t() {
        c5 c5VarB;
        pc pcVar = this.v;
        if (pcVar != null && pcVar.u() == 0) {
            return super.t();
        }
        xh xhVarO = v().o();
        if (xhVarO == null || (c5VarB = xhVarO.b()) == null) {
            return 0L;
        }
        return c5VarB.b();
    }

    @Override // com.chartboost.sdk.impl.f2
    public int u() {
        pc pcVar = this.v;
        if (pcVar != null && pcVar.u() == 0) {
            return super.u();
        }
        xh xhVarO = v().o();
        if (xhVarO != null) {
            return xhVarO.c();
        }
        return 0;
    }

    @Override // com.chartboost.sdk.impl.f2
    public void x() {
        pc pcVar = this.v;
        if (pcVar != null) {
            pcVar.x();
        }
    }

    public final pc z() {
        return this.v;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:145:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object a(Context context, ai aiVar, Continuation continuation) throws ChartboostError.Load.VastError, ChartboostError.Load.UnsupportedCodec, ChartboostError.Load.InvalidAssetUrl {
        c cVar;
        List arrayList;
        rd rdVar;
        n4 n4VarA;
        hb hbVarA;
        String strD;
        Object objC;
        URL url;
        zh zhVar;
        ai aiVar2;
        Context context2;
        ba baVarA;
        List<d5> listB;
        List list;
        List list2;
        String strA;
        URL url2;
        xj xjVar;
        String lowerCase;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.o = i2 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.m;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = cVar.o;
        boolean z2 = true;
        te b9Var = null;
        if (i3 == 0) {
            ResultKt.b(obj);
            arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (com.chartboost.sdk.impl.c cVar2 : aiVar.a()) {
                com.chartboost.sdk.impl.c.a aVar = cVar2 instanceof com.chartboost.sdk.impl.c.a ? (com.chartboost.sdk.impl.c.a) cVar2 : null;
                if (aVar != null && (baVarA = aVar.a()) != null && (listB = baVarA.b()) != null) {
                    for (d5 d5Var : listB) {
                        if (d5Var instanceof d5.a) {
                            arrayList3.addAll(((d5.a) d5Var).a().a());
                        } else if (d5Var instanceof d5.b) {
                            d5.b bVar = (d5.b) d5Var;
                            for (hb hbVar : bVar.a().a()) {
                                arrayList2.add(new hb(hbVar.c(), hbVar.e(), hbVar.b(), hbVar.a(), hbVar.d()));
                                arrayList4.add(bVar.a().c());
                            }
                        }
                    }
                }
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            af afVar = new af(displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.density, null, null, 24, null);
            rdVar = displayMetrics.widthPixels >= displayMetrics.heightPixels ? rd.LANDSCAPE_ONLY : rd.PORTRAIT_ONLY;
            xh xhVarO = v().o();
            n4VarA = (xhVarO == null || !xhVarO.e()) ? null : p4.f14816a.a(arrayList3, afVar);
            hbVarA = jb.f14246a.a(arrayList2, afVar);
            if (hbVarA == null) {
                throw new ChartboostError.Load.VastError("No suitable MediaFile found for Linear Ad. (VAST error 403)", new ei("No suitable MediaFile found for Linear Ad.", 403));
            }
            strD = hbVarA.d();
            try {
                URL url3 = new URL(hbVarA.d());
                cVar.f15752b = this;
                cVar.f15753c = context;
                cVar.d = aiVar;
                cVar.f15754e = arrayList;
                cVar.f = arrayList2;
                cVar.g = arrayList4;
                cVar.f15755h = rdVar;
                cVar.f15756i = n4VarA;
                cVar.j = hbVarA;
                cVar.k = strD;
                cVar.f15757l = url3;
                cVar.o = 1;
                objC = lb.c(url3, cVar);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
                url = url3;
                zhVar = this;
                aiVar2 = aiVar;
                context2 = context;
                list2 = arrayList4;
                list = arrayList2;
            } catch (MalformedURLException e2) {
                throw new ChartboostError.Load.InvalidAssetUrl(hbVarA.d(), "Invalid video URL format", e2);
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            URL url4 = (URL) cVar.f15757l;
            strD = (String) cVar.k;
            hbVarA = (hb) cVar.j;
            n4VarA = (n4) cVar.f15756i;
            rdVar = (rd) cVar.f15755h;
            List list3 = (List) cVar.g;
            List list4 = (List) cVar.f;
            arrayList = (List) cVar.f15754e;
            ai aiVar3 = (ai) cVar.d;
            context2 = (Context) cVar.f15753c;
            zh zhVar2 = (zh) cVar.f15752b;
            ResultKt.b(obj);
            url = url4;
            zhVar = zhVar2;
            objC = obj;
            aiVar2 = aiVar3;
            list2 = list3;
            list = list4;
        }
        rd rdVar2 = rdVar;
        List list5 = (List) objC;
        if (list5.isEmpty()) {
            ChartboostError.Load.UnsupportedCodec unsupportedCodec = new ChartboostError.Load.UnsupportedCodec(android.support.v4.media.a.n("No supported codecs found for media file: ", strD, " (VAST error 405)"), new ei(android.support.v4.media.a.C("No supported codecs found for media file: ", strD), 405));
            za.e(com.ironsource.d9.i.d + unsupportedCodec.getCode() + "] No codecs found for media file: " + strD, unsupportedCodec);
            throw unsupportedCodec;
        }
        za.a(android.support.v4.media.a.o("Supported codecs for ", strD, ": ", CollectionsKt.D(list5, ", ", null, null, null, 62)), (Throwable) null, 2, (Object) null);
        int iIndexOf = list.indexOf(hbVarA);
        zhVar.f15749w = (iIndexOf == -1 || iIndexOf >= list2.size()) ? null : (ti) list2.get(iIndexOf);
        f7 f7Var = new f7(new p5(), new q5(), null, 4, null);
        ue ueVarV = zhVar.v();
        w wVarQ = zhVar.q();
        l6 l6VarI = w3.f15454b.a().i();
        List<dh> listB2 = aiVar2.b();
        ArrayList arrayList5 = new ArrayList(CollectionsKt.n(listB2, 10));
        for (dh dhVar : listB2) {
            arrayList5.add(new dh(dhVar.a(), dhVar.e(), dhVar.c(), dhVar.d(), dhVar.b()));
        }
        cj cjVar = new cj(context2, url, ueVarV, wVarQ, l6VarI, f7Var, CollectionsKt.l0(arrayList5), zhVar.q, zhVar.w(), zhVar.r, aiVar2.c(), zhVar.p(), zhVar.f15748u, rdVar2);
        cjVar.a((xe) zhVar);
        arrayList.add(cjVar);
        if (n4VarA != null) {
            ji jiVarA = n4VarA.a();
            if (jiVarA == null) {
                za.e("Companion ad selected, but it has no resource content; skipping.", null, 2, null);
                return arrayList;
            }
            ArrayList arrayListJ0 = CollectionsKt.j0(zhVar.v().f());
            for (dh dhVar2 : n4VarA.h()) {
                String strE = dhVar2.e();
                if (strE != null) {
                    String strA2 = dhVar2.a();
                    if (strA2 == null) {
                        strA2 = "unknown";
                    }
                    arrayListJ0.add(new x6(strA2, ko.f25534a, strE, "", null));
                }
            }
            String strB = zhVar.v().b();
            String strL = zhVar.v().l();
            Map mapG = zhVar.v().g();
            long jC = zhVar.v().c();
            xh xhVarO2 = zhVar.v().o();
            c5 c5VarB = xhVarO2 != null ? xhVarO2.b() : null;
            xh xhVarO3 = zhVar.v().o();
            i8 i8VarJ = zhVar.v().j();
            int iK = zhVar.v().k();
            boolean zE = zhVar.v().e();
            xh xhVarO4 = zhVar.v().o();
            ue ueVar = new ue(strB, strL, mapG, jC, c5VarB, arrayListJ0, xhVarO3, i8VarJ, iK, zE, false, xhVarO4 != null ? xhVarO4.d() : true, null, null, null, 29696, null);
            if (jiVarA instanceof k8) {
                strA = ((k8) jiVarA).a();
            } else if (jiVarA instanceof r8) {
                strA = ((r8) jiVarA).a();
            } else if (jiVarA instanceof dg) {
                dg dgVar = (dg) jiVarA;
                String strB2 = dgVar.b();
                if ("application/x-javascript".equals(dgVar.a()) && strB2 != null && StringsKt.p(strB2, ".js", false)) {
                    strA = strB2;
                } else {
                    strA = strB2;
                }
                if (strA != null || StringsKt.w(strA)) {
                    za.e("Companion resource content string is null or blank; skipping.", null, 2, null);
                } else {
                    if (z2) {
                        xjVar = new xj(StringsKt.c0("\n                    <!DOCTYPE html>\n                    <html style=\"width: 100%; height: 100%; margin: 0; padding: 0;\">\n                    <head>\n                        <meta charset=\"UTF-8\">\n                        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n                        <style>\n                            /* Basic CSS Reset & Full-Screen Setup */\n                            html, body {\n                                width: 100%;\n                                height: 100%;\n                                margin: 0;\n                                padding: 0;\n                                overflow: hidden; /* Prevent unexpected scrollbars */\n                                box-sizing: border-box; /* Use border-box sizing globally */\n                                background-color: transparent; /* Start transparent */\n                            }\n                            /* Ensure all elements inherit border-box */\n                            *, *:before, *:after {\n                                box-sizing: inherit;\n                            }\n                        </style>\n                    </head>\n                    <body style=\"position: relative;\">\n                        <script id=\"vast-companion-script\" src=\"" + strA + "\" defer crossorigin=\"anonymous\"></script>\n                        </body>\n                    </html>\n                    "), null, zb.INTERSTITIAL, n4VarA, zhVar.t, ueVar, zhVar.q(), zhVar.q, zhVar.w(), zhVar.p(), zhVar.r, aiVar2.c(), zhVar.f15748u, 2, null);
                    } else {
                        n4 n4Var = n4VarA;
                        try {
                            url2 = new URL(strA);
                        } catch (MalformedURLException unused) {
                            za.a(android.support.v4.media.a.n("Companion content failed URL parsing. Assuming it's an HTML snippet or invalid. Content: \"", strA, "\""), (Throwable) null, 2, (Object) null);
                            url2 = null;
                        }
                        if (url2 != null) {
                            String path = url2.getPath();
                            if (path != null) {
                                lowerCase = path.toLowerCase(Locale.ROOT);
                                Intrinsics.e(lowerCase, "toLowerCase(...)");
                            } else {
                                lowerCase = "";
                            }
                            if (StringsKt.p(lowerCase, ".png", false) || StringsKt.p(lowerCase, ".jpg", false) || StringsKt.p(lowerCase, ".jpeg", false) || StringsKt.p(lowerCase, ".gif", false) || StringsKt.p(lowerCase, ".webp", false)) {
                                b9Var = new b9(context2, url2, n4Var, ueVar, zhVar.q(), zhVar.s, zhVar.q, zhVar.w(), zhVar.p(), zhVar.f15748u);
                            } else {
                                xjVar = new xj(null, url2, zb.INTERSTITIAL, n4Var, zhVar.t, ueVar, zhVar.q(), zhVar.q, zhVar.w(), zhVar.p(), zhVar.r, aiVar2.c(), zhVar.f15748u, 1, null);
                            }
                        } else {
                            RegexOption[] regexOptionArr = RegexOption.f44714Y;
                            if (new Regex("<\\s*(html|body|div|p|a|img|iframe|script|style)\\b", 0).X.matcher(strA).find()) {
                                xjVar = new xj(strA, null, zb.INTERSTITIAL, n4Var, zhVar.t, ueVar, zhVar.q(), zhVar.q, zhVar.w(), zhVar.p(), zhVar.r, aiVar2.c(), zhVar.f15748u, 2, null);
                            } else {
                                za.e(android.support.v4.media.a.n("Cannot determine renderable type from string content heuristics (Not URL, no common HTML tags found). Skipping content: \"", strA, "\""), null, 2, null);
                            }
                        }
                        if (b9Var != null) {
                            b9Var.a(zhVar);
                            arrayList.add(b9Var);
                        }
                    }
                    b9Var = xjVar;
                    if (b9Var != null) {
                        b9Var.a(zhVar);
                        arrayList.add(b9Var);
                    }
                }
            } else {
                za.e("Unknown VAST companion resource type encountered: ".concat(jiVarA.getClass().getSimpleName()), null, 2, null);
                strA = null;
            }
            z2 = false;
            if (strA != null) {
                za.e("Companion resource content string is null or blank; skipping.", null, 2, null);
            } else {
                za.e("Companion resource content string is null or blank; skipping.", null, 2, null);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:106:0x0205  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c7 A[RETURN] */
    @Override // com.chartboost.sdk.impl.te
    public Object a(Context context, Continuation continuation) {
        e eVar;
        Object objA;
        zh zhVar;
        Exception exc;
        ai aiVar;
        bi biVar;
        Context context2;
        Throwable vastError;
        zh zhVar2;
        Object objA2;
        Throwable unknown;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.g = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.f15762e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = eVar.g;
        if (i3 == 0) {
            ResultKt.b(obj);
            hi hiVar = new hi(new di(this.s), 0, 2, null);
            String str = this.f15747p;
            eVar.f15760b = this;
            eVar.f15761c = context;
            eVar.g = 1;
            objA = hiVar.a(str, eVar);
            if (objA != coroutineSingletons) {
                zhVar = this;
            }
            return coroutineSingletons;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    aiVar = (ai) eVar.f15761c;
                    zhVar2 = (zh) eVar.f15760b;
                    try {
                        ResultKt.b(obj);
                        return ((Result) obj).X;
                    } catch (bi e2) {
                        biVar = e2;
                        zhVar = zhVar2;
                        return zhVar.a(biVar, aiVar);
                    } catch (Exception e3) {
                        exc = e3;
                        zhVar = zhVar2;
                        if (exc instanceof IOException) {
                            unknown = new ChartboostError.Load.AssetUnavailable(null, android.support.v4.media.a.C("Asset unavailable during VAST processing: ", exc.getMessage()), exc);
                        } else if (exc instanceof SecurityException) {
                            unknown = new ChartboostError.Load.Internal(android.support.v4.media.a.C("Security error during VAST processing: ", exc.getMessage()), exc);
                        } else {
                            unknown = new ChartboostError.Load.Unknown(android.support.v4.media.a.C("Error during VAST renderable creation/load: ", exc.getMessage()), exc);
                        }
                        return zhVar.a(unknown, aiVar);
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aiVar = (ai) eVar.d;
            context2 = (Context) eVar.f15761c;
            zhVar = (zh) eVar.f15760b;
            try {
                ResultKt.b(obj);
                try {
                    pc pcVar = new pc((List) obj, zhVar.q());
                    pcVar.a(zhVar);
                    zhVar.v = pcVar;
                    eVar.f15760b = zhVar;
                    eVar.f15761c = aiVar;
                    eVar.d = null;
                    eVar.g = 3;
                    objA2 = pcVar.a(context2, eVar);
                    if (objA2 != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return objA2;
                } catch (bi e4) {
                    biVar = e4;
                    zhVar2 = zhVar;
                    zhVar = zhVar2;
                    return zhVar.a(biVar, aiVar);
                } catch (Exception e5) {
                    exc = e5;
                    zhVar2 = zhVar;
                    zhVar = zhVar2;
                    if (exc instanceof IOException) {
                        unknown = new ChartboostError.Load.AssetUnavailable(null, android.support.v4.media.a.C("Asset unavailable during VAST processing: ", exc.getMessage()), exc);
                    } else if (exc instanceof SecurityException) {
                        unknown = new ChartboostError.Load.Internal(android.support.v4.media.a.C("Security error during VAST processing: ", exc.getMessage()), exc);
                    } else {
                        unknown = new ChartboostError.Load.Unknown(android.support.v4.media.a.C("Error during VAST renderable creation/load: ", exc.getMessage()), exc);
                    }
                    return zhVar.a(unknown, aiVar);
                }
            } catch (bi e6) {
                biVar = e6;
                return zhVar.a(biVar, aiVar);
            } catch (Exception e7) {
                exc = e7;
                if (exc instanceof IOException) {
                    unknown = new ChartboostError.Load.AssetUnavailable(null, android.support.v4.media.a.C("Asset unavailable during VAST processing: ", exc.getMessage()), exc);
                } else if (exc instanceof SecurityException) {
                    unknown = new ChartboostError.Load.Internal(android.support.v4.media.a.C("Security error during VAST processing: ", exc.getMessage()), exc);
                } else {
                    unknown = new ChartboostError.Load.Unknown(android.support.v4.media.a.C("Error during VAST renderable creation/load: ", exc.getMessage()), exc);
                }
                return zhVar.a(unknown, aiVar);
            }
        }
        context = (Context) eVar.f15761c;
        zh zhVar3 = (zh) eVar.f15760b;
        ResultKt.b(obj);
        objA = ((Result) obj).X;
        zhVar = zhVar3;
        if (objA instanceof Result.Failure) {
            Throwable thA = Result.a(objA);
            if (thA == null) {
                thA = new IllegalStateException("Unknown VAST parsing error");
            }
            if (thA instanceof gi) {
                vastError = ChartboostError.Load.NoAd.INSTANCE;
            } else if (thA instanceof qa) {
                vastError = new ChartboostError.Load.InvalidAdm(thA.getMessage(), thA);
            } else if (thA instanceof ci) {
                vastError = new ChartboostError.Load.AssetUnavailable(null, thA.getMessage(), thA);
            } else if (thA instanceof gb) {
                vastError = new ChartboostError.Load.InvalidResponse(thA.getMessage(), thA);
            } else {
                vastError = thA instanceof bi ? new ChartboostError.Load.VastError(thA.getMessage(), thA) : new ChartboostError.Load.Unknown(thA.getMessage(), thA);
            }
            if (thA instanceof bi) {
                bi biVar2 = (bi) thA;
                if (biVar2.a() != null) {
                    zhVar.a(biVar2.a().intValue());
                }
            }
            return ResultKt.a(vastError);
        }
        ResultKt.b(objA);
        ai aiVar2 = (ai) objA;
        if (aiVar2.a().isEmpty()) {
            gi giVar = new gi("VAST response contained no ads.", BaseATView.g.f38290N);
            List listB = aiVar2.b();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listB) {
                dh dhVar = (dh) obj2;
                if (Intrinsics.a(dhVar.a(), "error") && Intrinsics.a(dhVar.b().get("VAST_ERROR_CODE"), new Integer(BaseATView.g.f38290N))) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    yh.f15659a.a(ki.f.f14374b, (dh) it.next(), zhVar.o, zhVar.A(), zhVar.y());
                }
            } else {
                zhVar.a(giVar, aiVar2);
            }
            return ResultKt.a(ChartboostError.Load.NoAd.INSTANCE);
        }
        try {
            eVar.f15760b = zhVar;
            eVar.f15761c = context;
            eVar.d = aiVar2;
            eVar.g = 2;
            Object objA3 = zhVar.a(context, aiVar2, eVar);
            if (objA3 != coroutineSingletons) {
                context2 = context;
                aiVar = aiVar2;
                obj = objA3;
                pc pcVar2 = new pc((List) obj, zhVar.q());
                pcVar2.a(zhVar);
                zhVar.v = pcVar2;
                eVar.f15760b = zhVar;
                eVar.f15761c = aiVar;
                eVar.d = null;
                eVar.g = 3;
                objA2 = pcVar2.a(context2, eVar);
                if (objA2 != coroutineSingletons) {
                    return objA2;
                }
            }
            return coroutineSingletons;
        } catch (bi e8) {
            biVar = e8;
            aiVar = aiVar2;
            return zhVar.a(biVar, aiVar);
        } catch (Exception e9) {
            exc = e9;
            aiVar = aiVar2;
            if (exc instanceof IOException) {
                unknown = new ChartboostError.Load.AssetUnavailable(null, android.support.v4.media.a.C("Asset unavailable during VAST processing: ", exc.getMessage()), exc);
            } else if (exc instanceof SecurityException) {
                unknown = new ChartboostError.Load.Internal(android.support.v4.media.a.C("Security error during VAST processing: ", exc.getMessage()), exc);
            } else {
                unknown = new ChartboostError.Load.Unknown(android.support.v4.media.a.C("Error during VAST renderable creation/load: ", exc.getMessage()), exc);
            }
            return zhVar.a(unknown, aiVar);
        }
    }

    @Override // com.chartboost.sdk.impl.xe
    public void a() {
        xe xeVarI = i();
        if (xeVarI != null) {
            xeVarI.a();
        }
    }

    @Override // com.chartboost.sdk.impl.xe
    public void a(rd request) {
        Intrinsics.f(request, "request");
        xe xeVarI = i();
        if (xeVarI != null) {
            xeVarI.a(request);
        }
    }

    @Override // com.chartboost.sdk.impl.te
    public void a(fg reason) {
        f2 f2VarT;
        Intrinsics.f(reason, "reason");
        if (reason == fg.CLOSE) {
            pc pcVar = this.v;
            if (pcVar != null) {
                pcVar.a(reason);
            }
            this.v = null;
            return;
        }
        pc pcVar2 = this.v;
        if (pcVar2 == null || (f2VarT = pcVar2.t()) == null) {
            return;
        }
        f2VarT.a(reason);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.ArrayList] */
    public final Object a(Throwable th, ai aiVar) {
        Throwable vastError;
        ?? arrayList;
        List listB;
        Integer numA;
        bi biVar = th instanceof bi ? (bi) th : null;
        int iIntValue = (biVar == null || (numA = biVar.a()) == null) ? com.smartdigimkt.o1.b.z1 : numA.intValue();
        String message = th.getMessage();
        if (message == null) {
            message = "Unknown VAST error";
        }
        if (th instanceof ChartboostError.Load) {
            vastError = (ChartboostError.Load) th;
        } else {
            vastError = new ChartboostError.Load.VastError(message, th);
        }
        za.b("VAST processing error (" + iIntValue + "): " + message, th);
        if (aiVar != null && (listB = aiVar.b()) != null) {
            arrayList = new ArrayList();
            for (Object obj : listB) {
                if (Intrinsics.a(((dh) obj).a(), "error")) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = EmptyList.X;
        }
        if (!arrayList.isEmpty()) {
            for (dh dhVar : arrayList) {
                yh.f15659a.a(ki.f.f14374b, dh.a(dhVar, null, null, 0, null, MapsKt.o(dhVar.b(), new Pair("VAST_ERROR_CODE", Integer.valueOf(iIntValue))), 15, null), this.o, A(), y());
            }
        } else {
            a(iIntValue);
            StringBuilder sb = new StringBuilder("VAST error ");
            sb.append(iIntValue);
            sb.append(" (");
            za.e(android.support.v4.media.a.r(sb, message, ") occurred, but no <Error> tracking URLs found in VAST."), null, 2, null);
        }
        return ResultKt.a(vastError);
    }

    @Override // com.chartboost.sdk.impl.te
    public void a(boolean z2) {
        List listB;
        Unit unit;
        xe xeVarI;
        f2 f2VarT;
        ti tiVar = this.f15749w;
        a(tiVar != null ? tiVar.a() : null, z2);
        ti tiVar2 = this.f15749w;
        if (tiVar2 == null || (listB = tiVar2.b()) == null) {
            listB = EmptyList.X;
        }
        boolean zA = r().a(new y3.d(listB), z2);
        pc pcVar = this.v;
        if (pcVar == null || (f2VarT = pcVar.t()) == null) {
            unit = null;
        } else {
            f2VarT.a(z2);
            unit = Unit.f43263a;
        }
        if (unit == null) {
            za.e("Failed to track a click for VAST because no current ad", null, 2, null);
        }
        if (!zA || (xeVarI = i()) == null) {
            return;
        }
        xeVarI.f();
    }

    @Override // com.chartboost.sdk.impl.te
    public void a(float f2) {
        pc pcVar = this.v;
        if (pcVar != null) {
            pcVar.a(f2);
        }
    }

    public final void a(int i2) {
        yh.f15659a.a(ki.f.f14374b, new dh("error", null, 0, null, MapsKt.i(new Pair("VAST_ERROR_CODE", Integer.valueOf(i2))), 8, null), this.o, A(), y());
    }
}
