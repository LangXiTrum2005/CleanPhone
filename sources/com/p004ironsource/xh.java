package com.p004ironsource;

import android.app.Activity;
import androidx.media3.extractor.text.ttml.a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.sdk.IronSourceNetwork;
import com.p004ironsource.sdk.controller.e;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t*\u0002\u0006\t\u0018\u0000 42\u00020\u0001:\u0001\u0011B#\b\u0000\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001c¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR(\u0010$\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001f8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0019\u0010#R(\u0010'\u001a\u0004\u0018\u00010\u00152\b\u0010 \u001a\u0004\u0018\u00010\u00158\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b%\u0010&R(\u0010)\u001a\u0004\u0018\u00010\u00152\b\u0010 \u001a\u0004\u0018\u00010\u00158\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b(\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010*R$\u00100\u001a\u0004\u0018\u00010,8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010-\u001a\u0004\b\u0011\u0010.\"\u0004\b\u0011\u0010/R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00101¨\u00065"}, d2 = {"Lcom/ironsource/xh;", "Lcom/ironsource/bi;", "Lcom/ironsource/oh;", "c", "", i.f37957c, "com/ironsource/xh$b", "e", "()Lcom/ironsource/xh$b;", "com/ironsource/xh$c", f.j, "()Lcom/ironsource/xh$c;", "Landroid/app/Activity;", "activity", "Lorg/json/JSONObject;", "loadParams", "", "a", "Lcom/ironsource/ci;", "viewHolder", "destroy", "", "Ljava/lang/String;", "id", "Lcom/ironsource/xn;", "b", "Lcom/ironsource/xn;", "controller", "Lcom/ironsource/ph;", "Lcom/ironsource/ph;", "eventTracker", "Lcom/ironsource/zh;", "<set-?>", "d", "Lcom/ironsource/zh;", "()Lcom/ironsource/zh;", "adData", g.f40227p, "()Ljava/lang/String;", "demandSourceName", h.f36614b, "isBidding", "Ljava/lang/Long;", "startTime", "Lcom/ironsource/bi$a;", "Lcom/ironsource/bi$a;", "()Lcom/ironsource/bi$a;", "(Lcom/ironsource/bi$a;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ironsource/ci;", "<init>", "(Ljava/lang/String;Lcom/ironsource/xn;Lcom/ironsource/ph;)V", "j", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class xh implements bi {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xn controller;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ph eventTracker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private zh adData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String demandSourceName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String isBidding;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Long startTime;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private bi.a listener;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private ci viewHolder;

    /* JADX INFO: renamed from: com.ironsource.xh$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/ironsource/xh$a;", "", "Lcom/ironsource/xh;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final xh a() {
            String strM = a.m("randomUUID().toString()");
            e controllerManager = IronSourceNetwork.getControllerManager();
            Intrinsics.e(controllerManager, "controllerManager");
            return new xh(strM, new wn(strM, controllerManager, null, null, 12, null), new qh());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"com/ironsource/xh$b", "Lcom/ironsource/xn$a;", "Lcom/ironsource/zh;", "adData", "", "a", "", "reason", h.f36614b, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements xn.a {
        public b() {
        }

        @Override // com.ironsource.xn.a
        public void a() {
            bi.a listener = xh.this.getListener();
            if (listener != null) {
                listener.onNativeAdShown();
            }
        }

        @Override // com.ironsource.xn.a
        public void h() {
            bi.a listener = xh.this.getListener();
            if (listener != null) {
                listener.onNativeAdClicked();
            }
        }

        @Override // com.ironsource.xn.a
        public void a(zh adData) {
            Intrinsics.f(adData, "adData");
            xh.this.adData = adData;
            ph phVar = xh.this.eventTracker;
            hs.a loadAdSuccess = hs.f25280l;
            Intrinsics.e(loadAdSuccess, "loadAdSuccess");
            HashMap<String, Object> mapA = xh.this.c().a();
            Intrinsics.e(mapA, "baseEventParams().data");
            phVar.a(loadAdSuccess, mapA);
            bi.a listener = xh.this.getListener();
            if (listener != null) {
                listener.onNativeAdLoadSuccess(adData);
            }
        }

        @Override // com.ironsource.xn.a
        public void a(String reason) {
            Intrinsics.f(reason, "reason");
            oh ohVarA = xh.this.c().a(dc.f24769A, reason);
            ph phVar = xh.this.eventTracker;
            hs.a loadAdFailed = hs.g;
            Intrinsics.e(loadAdFailed, "loadAdFailed");
            HashMap<String, Object> mapA = ohVarA.a();
            Intrinsics.e(mapA, "eventParams.data");
            phVar.a(loadAdFailed, mapA);
            bi.a listener = xh.this.getListener();
            if (listener != null) {
                listener.onNativeAdLoadFailed(reason);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/ironsource/xh$c", "Lcom/ironsource/ci$a;", "Lcom/ironsource/ci$b;", "viewName", "", "a", "Lcom/ironsource/zw;", "viewVisibilityParams", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements ci.a {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f27718a;

            static {
                int[] iArr = new int[ci.b.values().length];
                try {
                    iArr[ci.b.PrivacyIcon.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f27718a = iArr;
            }
        }

        public c() {
        }

        @Override // com.ironsource.ci.a
        public void a(ci.b viewName) throws JSONException {
            Intrinsics.f(viewName, "viewName");
            if (a.f27718a[viewName.ordinal()] == 1) {
                xh.this.controller.b();
                return;
            }
            JSONObject clickParams = new JSONObject().put("viewName", viewName.getValue());
            xn xnVar = xh.this.controller;
            Intrinsics.e(clickParams, "clickParams");
            xnVar.a(clickParams);
        }

        @Override // com.ironsource.ci.a
        public void a(zw viewVisibilityParams) {
            Intrinsics.f(viewVisibilityParams, "viewVisibilityParams");
            xh.this.controller.a(viewVisibilityParams);
        }
    }

    public xh(String id, xn controller, ph eventTracker) {
        Intrinsics.f(id, "id");
        Intrinsics.f(controller, "controller");
        Intrinsics.f(eventTracker, "eventTracker");
        this.id = id;
        this.controller = controller;
        this.eventTracker = eventTracker;
        controller.a(e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oh c() {
        oh ohVarA = new oh().a(dc.x, this.isBidding).a(dc.v, this.demandSourceName).a(dc.f24790w, mh.e.NativeAd.toString()).a(dc.f24773I, Long.valueOf(i()));
        Intrinsics.e(ohVarA, "ISNEventParams()\n       …CUSTOM_C, loadDuration())");
        return ohVarA;
    }

    @JvmStatic
    public static final xh d() {
        return INSTANCE.a();
    }

    private final b e() {
        return new b();
    }

    private final c f() {
        return new c();
    }

    private final long i() {
        Long l2 = this.startTime;
        if (l2 == null) {
            return -1L;
        }
        return Calendar.getInstance().getTimeInMillis() - l2.longValue();
    }

    @Override // com.p004ironsource.bi
    /* JADX INFO: renamed from: a, reason: from getter */
    public bi.a getListener() {
        return this.listener;
    }

    @Override // com.p004ironsource.bi
    public void destroy() {
        ci ciVar = this.viewHolder;
        if (ciVar != null) {
            ciVar.a((ci.a) null);
        }
        this.controller.destroy();
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDemandSourceName() {
        return this.demandSourceName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getIsBidding() {
        return this.isBidding;
    }

    public /* synthetic */ xh(String str, xn xnVar, ph phVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? a.m("randomUUID().toString()") : str, xnVar, phVar);
    }

    @Override // com.p004ironsource.bi
    /* JADX INFO: renamed from: b, reason: from getter */
    public zh getAdData() {
        return this.adData;
    }

    @Override // com.p004ironsource.bi
    public void a(Activity activity, JSONObject loadParams) {
        Intrinsics.f(activity, "activity");
        Intrinsics.f(loadParams, "loadParams");
        this.startTime = Long.valueOf(Calendar.getInstance().getTimeInMillis());
        this.demandSourceName = loadParams.optString("demandSourceName");
        this.isBidding = loadParams.optString("inAppBidding");
        ph phVar = this.eventTracker;
        hs.a loadAd = hs.f;
        Intrinsics.e(loadAd, "loadAd");
        HashMap<String, Object> mapA = c().a();
        Intrinsics.e(mapA, "baseEventParams().data");
        phVar.a(loadAd, mapA);
        JSONObject jSONObject = new JSONObject(loadParams.toString());
        jSONObject.put(d9.h.y0, String.valueOf(this.startTime));
        this.controller.a(activity, jSONObject);
    }

    @Override // com.p004ironsource.bi
    public void a(bi.a aVar) {
        this.listener = aVar;
    }

    @Override // com.p004ironsource.bi
    public void a(ci viewHolder) {
        Intrinsics.f(viewHolder, "viewHolder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, Object> mapA = c().a();
        Intrinsics.e(mapA, "baseEventParams().data");
        linkedHashMap.putAll(mapA);
        String string = viewHolder.t().toString();
        Intrinsics.e(string, "viewHolder.viewsStatus().toString()");
        linkedHashMap.put(dc.y, string);
        ph phVar = this.eventTracker;
        hs.a registerAd = hs.f25281n;
        Intrinsics.e(registerAd, "registerAd");
        phVar.a(registerAd, linkedHashMap);
        this.viewHolder = viewHolder;
        viewHolder.a(f());
        this.controller.a(viewHolder);
    }
}
