package com.ironsource;

import android.app.Activity;
import com.ironsource.sdk.IronSourceNetwork;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.z8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3858z8 implements D8 {
    public static final a j = new a(null);
    private final String a;
    private final Pb b;
    private final InterfaceC3706q8 c;
    private B8 d;
    private String e;
    private String f;
    private Long g;
    private D8.a h;
    private E8 i;

    /* JADX INFO: renamed from: com.ironsource.z8$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3858z8 a() {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            com.ironsource.sdk.controller.e controllerManager = IronSourceNetwork.getControllerManager();
            Intrinsics.checkNotNullExpressionValue(controllerManager, "controllerManager");
            return new C3858z8(string, new Ob(string, controllerManager, null, null, 12, null), new C3722r8());
        }

        private a() {
        }
    }

    public C3858z8(String id, Pb controller, InterfaceC3706q8 eventTracker) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.a = id;
        this.b = controller;
        this.c = eventTracker;
        controller.a(f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3689p8 d() {
        C3689p8 c3689p8A = new C3689p8().a(A5.x, this.f).a(A5.v, this.e).a(A5.w, C3653n8.e.NativeAd.toString()).a(A5.I, Long.valueOf(j()));
        Intrinsics.checkNotNullExpressionValue(c3689p8A, "ISNEventParams()\n       …CUSTOM_C, loadDuration())");
        return c3689p8A;
    }

    public static final C3858z8 e() {
        return j.a();
    }

    private final b f() {
        return new b();
    }

    private final c g() {
        return new c();
    }

    private final long j() {
        Long l = this.g;
        if (l == null) {
            return -1L;
        }
        return Calendar.getInstance().getTimeInMillis() - l.longValue();
    }

    public final String h() {
        return this.e;
    }

    public final String i() {
        return this.f;
    }

    @Override // com.ironsource.D8
    public D8.a b() {
        return this.h;
    }

    @Override // com.ironsource.D8
    public B8 c() {
        return this.d;
    }

    /* JADX INFO: renamed from: com.ironsource.z8$b */
    public static final class b implements Pb.a {
        public b() {
        }

        @Override // com.ironsource.Pb.a
        public void a(B8 adData) {
            Intrinsics.checkNotNullParameter(adData, "adData");
            C3858z8.this.d = adData;
            InterfaceC3706q8 interfaceC3706q8 = C3858z8.this.c;
            Ud.a loadAdSuccess = Ud.l;
            Intrinsics.checkNotNullExpressionValue(loadAdSuccess, "loadAdSuccess");
            HashMap<String, Object> mapA = C3858z8.this.d().a();
            Intrinsics.checkNotNullExpressionValue(mapA, "baseEventParams().data");
            interfaceC3706q8.a(loadAdSuccess, mapA);
            D8.a aVarB = C3858z8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdLoadSuccess(adData);
            }
        }

        @Override // com.ironsource.Pb.a
        public void e() {
            D8.a aVarB = C3858z8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdClicked();
            }
        }

        @Override // com.ironsource.Pb.a
        public void a(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            C3689p8 c3689p8A = C3858z8.this.d().a(A5.A, reason);
            InterfaceC3706q8 interfaceC3706q8 = C3858z8.this.c;
            Ud.a loadAdFailed = Ud.g;
            Intrinsics.checkNotNullExpressionValue(loadAdFailed, "loadAdFailed");
            HashMap<String, Object> mapA = c3689p8A.a();
            Intrinsics.checkNotNullExpressionValue(mapA, "eventParams.data");
            interfaceC3706q8.a(loadAdFailed, mapA);
            D8.a aVarB = C3858z8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdLoadFailed(reason);
            }
        }

        @Override // com.ironsource.Pb.a
        public void a() {
            D8.a aVarB = C3858z8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdShown();
            }
        }
    }

    @Override // com.ironsource.D8
    public void a(D8.a aVar) {
        this.h = aVar;
    }

    /* JADX INFO: renamed from: com.ironsource.z8$c */
    public static final class c implements E8.a {

        /* JADX INFO: renamed from: com.ironsource.z8$c$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[E8.b.values().length];
                try {
                    iArr[E8.b.PrivacyIcon.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                a = iArr;
            }
        }

        public c() {
        }

        @Override // com.ironsource.E8.a
        public void a(E8.b viewName) throws JSONException {
            Intrinsics.checkNotNullParameter(viewName, "viewName");
            if (a.a[viewName.ordinal()] == 1) {
                C3858z8.this.b.c();
                return;
            }
            JSONObject clickParams = new JSONObject().put("viewName", viewName.b());
            Pb pb = C3858z8.this.b;
            Intrinsics.checkNotNullExpressionValue(clickParams, "clickParams");
            pb.a(clickParams);
        }

        @Override // com.ironsource.E8.a
        public void a(C3661ng viewVisibilityParams) {
            Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
            C3858z8.this.b.a(viewVisibilityParams);
        }
    }

    @Override // com.ironsource.D8
    public void a(Activity activity, JSONObject loadParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        this.g = Long.valueOf(Calendar.getInstance().getTimeInMillis());
        this.e = loadParams.optString("demandSourceName");
        this.f = loadParams.optString("inAppBidding");
        InterfaceC3706q8 interfaceC3706q8 = this.c;
        Ud.a loadAd = Ud.f;
        Intrinsics.checkNotNullExpressionValue(loadAd, "loadAd");
        HashMap<String, Object> mapA = d().a();
        Intrinsics.checkNotNullExpressionValue(mapA, "baseEventParams().data");
        interfaceC3706q8.a(loadAd, mapA);
        JSONObject jSONObject = new JSONObject(loadParams.toString());
        jSONObject.put(X3.i.y0, String.valueOf(this.g));
        this.b.a(activity, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C3858z8(String str, Pb pb, InterfaceC3706q8 interfaceC3706q8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        this(str, pb, interfaceC3706q8);
    }

    @Override // com.ironsource.D8
    public void a(E8 viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, Object> mapA = d().a();
        Intrinsics.checkNotNullExpressionValue(mapA, "baseEventParams().data");
        linkedHashMap.putAll(mapA);
        String string = viewHolder.t().toString();
        Intrinsics.checkNotNullExpressionValue(string, "viewHolder.viewsStatus().toString()");
        linkedHashMap.put(A5.y, string);
        InterfaceC3706q8 interfaceC3706q8 = this.c;
        Ud.a registerAd = Ud.n;
        Intrinsics.checkNotNullExpressionValue(registerAd, "registerAd");
        interfaceC3706q8.a(registerAd, linkedHashMap);
        this.i = viewHolder;
        viewHolder.a(g());
        this.b.a(viewHolder);
    }

    @Override // com.ironsource.D8
    public void a() {
        E8 e8 = this.i;
        if (e8 != null) {
            e8.a((E8.a) null);
        }
        this.b.a();
    }
}
