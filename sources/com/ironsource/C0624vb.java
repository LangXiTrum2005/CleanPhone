package com.ironsource;

import android.content.Context;
import android.view.Choreographer;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.vb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0624vb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0568s9 f30850a = new C0568s9();

    /* JADX INFO: renamed from: com.ironsource.vb$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends AbstractRunnableC0430ke {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f30851b;

        public a(Runnable runnable) {
            this.f30851b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC0430ke
        public void a() {
            this.f30851b.run();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.vb$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b extends kotlin.jvm.internal.o implements jk.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f30852a = new b();

        public b() {
            super(1);
        }

        @Override // jk.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry<String, Boolean> entry) {
            kotlin.jvm.internal.n.f(entry, "<name for destructuring parameter 0>");
            return entry.getKey() + X3.j.f27830b + entry.getValue().booleanValue();
        }
    }

    public final void a(Runnable runnable) {
        kotlin.jvm.internal.n.f(runnable, "runnable");
        a(this, new pi(this, runnable, 0), 0L, 2, null);
    }

    public final void b(Runnable runnable) {
        kotlin.jvm.internal.n.f(runnable, "runnable");
        a(this, new pi(this, runnable, 1), 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0624vb this$0, Runnable runnable) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(runnable, "$runnable");
        this$0.f30850a.a(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final C0624vb this$0, final Runnable runnable) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(runnable, "$runnable");
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.ironsource.qi
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                C0624vb.a(this.f30122a, runnable, j10);
            }
        });
    }

    public final void c(Runnable runnable) {
        kotlin.jvm.internal.n.f(runnable, "runnable");
        this.f30850a.a(runnable);
    }

    public final void d(Runnable callback) {
        kotlin.jvm.internal.n.f(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0624vb this$0, Runnable runnable, long j10) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(runnable, "$runnable");
        this$0.a(runnable);
    }

    public final C0520pe b(C0520pe error) {
        kotlin.jvm.internal.n.f(error, "error");
        return error.c() == 2080 ? new C0520pe(error.c(), "serverResponseIsNotValid") : error;
    }

    public static /* synthetic */ void a(C0624vb c0624vb, Runnable runnable, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postOnUIThread");
        }
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c0624vb.a(runnable, j10);
    }

    public final void a(Runnable runnable, long j10) {
        kotlin.jvm.internal.n.f(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(runnable), j10);
    }

    public final void b(String adUnitId, int i10, String str) throws JSONException {
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i10);
        jSONObject.putOpt("reason", str);
        jSONObject.put("mediationAdUnitId", adUnitId);
        jSONObject.put("isMultipleAdUnits", 1);
        If.a(EnumC0672y5.TROUBLESHOOTING_AD_UNIT_REWARD_PARSE_ERROR, jSONObject);
    }

    public final void a(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        C0533q9.a aVar = C0533q9.f30115a;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.n.e(applicationContext, "context.applicationContext");
        aVar.a(applicationContext);
    }

    public final IronSource.a[] a(LevelPlay.AdFormat... adFormats) {
        kotlin.jvm.internal.n.f(adFormats, "adFormats");
        ArrayList arrayList = new ArrayList();
        for (LevelPlay.AdFormat adFormat : adFormats) {
            arrayList.add(a(adFormat));
        }
        return (IronSource.a[]) arrayList.toArray(new IronSource.a[0]);
    }

    public final IronSource.a a(LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        return com.unity3d.mediation.a.a(adFormat);
    }

    public final void b(boolean z10) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_EXT1, String.valueOf(z10));
        If.a(EnumC0672y5.SET_COPPA, jSONObject);
    }

    public final boolean a(AdapterBaseInterface networkAdapter, IronSource.a adFormat, String providerName) {
        kotlin.jvm.internal.n.f(networkAdapter, "networkAdapter");
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        kotlin.jvm.internal.n.f(providerName, "providerName");
        return If.a(networkAdapter, adFormat, providerName);
    }

    public static /* synthetic */ void a(C0624vb c0624vb, long j10, Ve.a aVar, long j11, JSONObject jSONObject, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendInitSuccessEvent");
        }
        if ((i10 & 8) != 0) {
            jSONObject = new JSONObject();
        }
        c0624vb.a(j10, aVar, j11, jSONObject);
    }

    public final void a(long j10, Ve.a responseOrigin, long j11, JSONObject data) {
        kotlin.jvm.internal.n.f(responseOrigin, "responseOrigin");
        kotlin.jvm.internal.n.f(data, "data");
        try {
            data.put("isMultipleAdUnits", 1);
            data.put(IronSourceConstants.EVENTS_DURATION, j10);
            String strB = responseOrigin.b();
            kotlin.jvm.internal.n.e(strB, "responseOrigin.value");
            data.put(IronSourceConstants.EVENTS_EXT1, a(strB, j11));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        If.a(EnumC0672y5.SDK_INIT_SUCCESS, data);
    }

    public final C0520pe a(C0520pe error) {
        kotlin.jvm.internal.n.f(error, "error");
        int iC = error.c();
        if (iC != 2070) {
            return iC != 2110 ? error : new C0520pe(error.c(), IronSourceConstants.FALSE_AVAILABILITY_REASON_BAD_REQUEST);
        }
        return new C0520pe(error.c(), "noServerResponse");
    }

    private final String a(String str, long j10) {
        return "responseOrigin=" + str + ";delayTimeAfterInitProcess=" + j10;
    }

    public static /* synthetic */ void a(C0624vb c0624vb, C0520pe c0520pe, long j10, JSONObject jSONObject, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendInitFailedEvent");
        }
        if ((i10 & 4) != 0) {
            jSONObject = new JSONObject();
        }
        c0624vb.a(c0520pe, j10, jSONObject);
    }

    public final void a(C0520pe error, long j10, JSONObject data) {
        kotlin.jvm.internal.n.f(error, "error");
        kotlin.jvm.internal.n.f(data, "data");
        try {
            data.put(IronSourceConstants.EVENTS_ERROR_CODE, error.c());
            data.put("reason", error.d());
            data.put("isMultipleAdUnits", 1);
            data.put(IronSourceConstants.EVENTS_DURATION, j10);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        If.a(EnumC0672y5.SDK_INIT_FAILED, data);
    }

    public final void a(String placementName, LevelPlay.AdFormat adFormat, int i10, String str) throws JSONException {
        kotlin.jvm.internal.n.f(placementName, "placementName");
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i10);
        jSONObject.putOpt("reason", str);
        jSONObject.put("placement", placementName);
        jSONObject.put(Wa.f27573f, adFormat.getValue());
        jSONObject.put("adf", If.c(com.unity3d.mediation.a.a(adFormat)));
        jSONObject.put("isMultipleAdUnits", 1);
        If.a(EnumC0672y5.TROUBLESHOOTING_PLACEMENT_CAPPING_PARSE_ERROR, jSONObject);
    }

    public final void a(String adUnitId, int i10, String str) throws JSONException {
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i10);
        jSONObject.putOpt("reason", str);
        jSONObject.put("mediationAdUnitId", adUnitId);
        jSONObject.put("isMultipleAdUnits", 1);
        If.a(EnumC0672y5.TROUBLESHOOTING_AD_UNIT_CAPPING_PARSE_ERROR, jSONObject);
    }

    public final void a(Map<String, Boolean> networkConsents) {
        kotlin.jvm.internal.n.f(networkConsents, "networkConsents");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_EXT1, xj.n.u0(networkConsents.entrySet(), ";", null, null, b.f30852a, 30));
        If.a(EnumC0672y5.GDPR_CONSENTS, jSONObject);
    }

    public final void a(boolean z10) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_EXT1, String.valueOf(z10));
        If.a(EnumC0672y5.SET_CCPA, jSONObject);
    }
}
