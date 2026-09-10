package com.ironsource;

import android.app.Activity;
import com.ironsource.sdk.IronSourceNetwork;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class B8 implements F8 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f25716j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ub f25718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0567s8 f25719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private D8 f25720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f25721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f25722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Long f25723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private F8.a f25724h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private G8 f25725i;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final B8 a() {
            String string = UUID.randomUUID().toString();
            kotlin.jvm.internal.n.e(string, "randomUUID().toString()");
            com.ironsource.sdk.controller.e controllerManager = IronSourceNetwork.getControllerManager();
            kotlin.jvm.internal.n.e(controllerManager, "controllerManager");
            return new B8(string, new Tb(string, controllerManager, null, null, 12, null), new C0585t8());
        }

        private a() {
        }
    }

    public B8(String id2, Ub controller, InterfaceC0567s8 eventTracker) {
        kotlin.jvm.internal.n.f(id2, "id");
        kotlin.jvm.internal.n.f(controller, "controller");
        kotlin.jvm.internal.n.f(eventTracker, "eventTracker");
        this.f25717a = id2;
        this.f25718b = controller;
        this.f25719c = eventTracker;
        controller.a(f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0549r8 d() {
        C0549r8 c0549r8A = new C0549r8().a(B5.f25710x, this.f25722f).a(B5.f25708v, this.f25721e).a(B5.f25709w, C0514p8.e.NativeAd.toString()).a(B5.I, Long.valueOf(j()));
        kotlin.jvm.internal.n.e(c0549r8A, "ISNEventParams()\n       …CUSTOM_C, loadDuration())");
        return c0549r8A;
    }

    public static final B8 e() {
        return f25716j.a();
    }

    private final b f() {
        return new b();
    }

    private final c g() {
        return new c();
    }

    private final long j() {
        Long l = this.f25723g;
        if (l == null) {
            return -1L;
        }
        return Calendar.getInstance().getTimeInMillis() - l.longValue();
    }

    public final String h() {
        return this.f25721e;
    }

    public final String i() {
        return this.f25722f;
    }

    @Override // com.ironsource.F8
    public F8.a b() {
        return this.f25724h;
    }

    @Override // com.ironsource.F8
    public D8 c() {
        return this.f25720d;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b implements Ub.a {
        public b() {
        }

        @Override // com.ironsource.Ub.a
        public void a(D8 adData) {
            kotlin.jvm.internal.n.f(adData, "adData");
            B8.this.f25720d = adData;
            InterfaceC0567s8 interfaceC0567s8 = B8.this.f25719c;
            C0377he.a loadAdSuccess = C0377he.l;
            kotlin.jvm.internal.n.e(loadAdSuccess, "loadAdSuccess");
            HashMap<String, Object> mapA = B8.this.d().a();
            kotlin.jvm.internal.n.e(mapA, "baseEventParams().data");
            interfaceC0567s8.a(loadAdSuccess, mapA);
            F8.a aVarB = B8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdLoadSuccess(adData);
            }
        }

        @Override // com.ironsource.Ub.a
        public void e() {
            F8.a aVarB = B8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdClicked();
            }
        }

        @Override // com.ironsource.Ub.a
        public void a(String reason) {
            kotlin.jvm.internal.n.f(reason, "reason");
            C0549r8 c0549r8A = B8.this.d().a(B5.A, reason);
            InterfaceC0567s8 interfaceC0567s8 = B8.this.f25719c;
            C0377he.a loadAdFailed = C0377he.f28808g;
            kotlin.jvm.internal.n.e(loadAdFailed, "loadAdFailed");
            HashMap<String, Object> mapA = c0549r8A.a();
            kotlin.jvm.internal.n.e(mapA, "eventParams.data");
            interfaceC0567s8.a(loadAdFailed, mapA);
            F8.a aVarB = B8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdLoadFailed(reason);
            }
        }

        @Override // com.ironsource.Ub.a
        public void a() {
            F8.a aVarB = B8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdShown();
            }
        }
    }

    @Override // com.ironsource.F8
    public void a(F8.a aVar) {
        this.f25724h = aVar;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c implements G8.a {

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f25728a;

            static {
                int[] iArr = new int[G8.b.values().length];
                try {
                    iArr[G8.b.PrivacyIcon.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f25728a = iArr;
            }
        }

        public c() {
        }

        @Override // com.ironsource.G8.a
        public void a(G8.b viewName) throws JSONException {
            kotlin.jvm.internal.n.f(viewName, "viewName");
            if (a.f25728a[viewName.ordinal()] == 1) {
                B8.this.f25718b.c();
                return;
            }
            JSONObject clickParams = new JSONObject().put("viewName", viewName.b());
            Ub ub2 = B8.this.f25718b;
            kotlin.jvm.internal.n.e(clickParams, "clickParams");
            ub2.a(clickParams);
        }

        @Override // com.ironsource.G8.a
        public void a(Gg viewVisibilityParams) {
            kotlin.jvm.internal.n.f(viewVisibilityParams, "viewVisibilityParams");
            B8.this.f25718b.a(viewVisibilityParams);
        }
    }

    @Override // com.ironsource.F8
    public void a(Activity activity, JSONObject loadParams) {
        kotlin.jvm.internal.n.f(activity, "activity");
        kotlin.jvm.internal.n.f(loadParams, "loadParams");
        this.f25723g = Long.valueOf(Calendar.getInstance().getTimeInMillis());
        this.f25721e = loadParams.optString("demandSourceName");
        this.f25722f = loadParams.optString("inAppBidding");
        InterfaceC0567s8 interfaceC0567s8 = this.f25719c;
        C0377he.a loadAd = C0377he.f28807f;
        kotlin.jvm.internal.n.e(loadAd, "loadAd");
        HashMap<String, Object> mapA = d().a();
        kotlin.jvm.internal.n.e(mapA, "baseEventParams().data");
        interfaceC0567s8.a(loadAd, mapA);
        JSONObject jSONObject = new JSONObject(loadParams.toString());
        jSONObject.put(X3.i.f27825y0, String.valueOf(this.f25723g));
        this.f25718b.a(activity, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ B8(String str, Ub ub2, InterfaceC0567s8 interfaceC0567s8, int i10, kotlin.jvm.internal.g gVar) {
        if ((i10 & 1) != 0) {
            str = UUID.randomUUID().toString();
            kotlin.jvm.internal.n.e(str, "randomUUID().toString()");
        }
        this(str, ub2, interfaceC0567s8);
    }

    @Override // com.ironsource.F8
    public void a(G8 viewHolder) {
        kotlin.jvm.internal.n.f(viewHolder, "viewHolder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, Object> mapA = d().a();
        kotlin.jvm.internal.n.e(mapA, "baseEventParams().data");
        linkedHashMap.putAll(mapA);
        String string = viewHolder.t().toString();
        kotlin.jvm.internal.n.e(string, "viewHolder.viewsStatus().toString()");
        linkedHashMap.put(B5.f25711y, string);
        InterfaceC0567s8 interfaceC0567s8 = this.f25719c;
        C0377he.a registerAd = C0377he.f28814n;
        kotlin.jvm.internal.n.e(registerAd, "registerAd");
        interfaceC0567s8.a(registerAd, linkedHashMap);
        this.f25725i = viewHolder;
        viewHolder.a(g());
        this.f25718b.a(viewHolder);
    }

    @Override // com.ironsource.F8
    public void a() {
        G8 g10 = this.f25725i;
        if (g10 != null) {
            g10.a((G8.a) null);
        }
        this.f25718b.a();
    }
}
