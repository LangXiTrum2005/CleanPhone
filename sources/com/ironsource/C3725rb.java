package com.ironsource;

import android.content.Context;
import android.os.Handler;
import android.view.Choreographer;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.rb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3725rb {
    private final C3690p9 a = new C3690p9(null, 1, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: com.ironsource.rb$a */
    public static final class a extends Xd {
        final /* synthetic */ Runnable b;

        public a(Runnable runnable) {
            this.b = runnable;
        }

        @Override // com.ironsource.Xd
        public void a() {
            this.b.run();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.rb$b */
    public static final class b extends Xd {
        final /* synthetic */ Function0<Unit> b;

        public b(Function0<Unit> function0) {
            this.b = function0;
        }

        @Override // com.ironsource.Xd
        public void a() {
            this.b.invoke();
        }
    }

    public final void a(Xd safeRunnable) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        a(this, safeRunnable, 0L, 2, (Object) null);
    }

    public final void b(final Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        a(this, new Runnable() { // from class: com.ironsource.bluecoat
            @Override // java.lang.Runnable
            public final void run() {
                C3725rb.a(this.f23158kowloon, runnable);
            }
        }, 0L, 2, (Object) null);
    }

    public final void c(final Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        a(this, new Runnable() { // from class: com.ironsource.polyfoil
            @Override // java.lang.Runnable
            public final void run() {
                C3725rb.b(this.f23381kowloon, runnable);
            }
        }, 0L, 2, (Object) null);
    }

    public final void d(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.a.b(runnable);
    }

    public final void e(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3725rb this$0, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        this$0.a.b(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final C3725rb this$0, final Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.ironsource.hydromechanics
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                C3725rb.a(this.f23260kowloon, runnable, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3725rb this$0, Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        this$0.b(runnable);
    }

    public final void b(Xd safeRunnable) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.a.a(safeRunnable);
    }

    public static /* synthetic */ void a(C3725rb c3725rb, Runnable runnable, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postOnUIThread");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        c3725rb.a(runnable, j);
    }

    public final C3462ce b(C3462ce error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return error.c() == 2080 ? new C3462ce(error.c(), "serverResponseIsNotValid") : error;
    }

    public final void a(Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(runnable), j);
    }

    public final void a(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.a.a(callback);
    }

    public final void b(String adUnitId, int i, String str) throws JSONException {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
        jSONObject.putOpt("reason", str);
        jSONObject.put("mediationAdUnitId", adUnitId);
        jSONObject.put("isMultipleAdUnits", 1);
        C3746sf.a(EnumC3821x5.TROUBLESHOOTING_AD_UNIT_REWARD_PARSE_ERROR, jSONObject);
    }

    public final void a(Xd safeRunnable, long j) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.a.a(safeRunnable, j);
    }

    public static /* synthetic */ void a(C3725rb c3725rb, Xd xd, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        c3725rb.a(xd, j);
    }

    public static /* synthetic */ void a(C3725rb c3725rb, Function0 function0, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        c3725rb.a((Function0<Unit>) function0, j);
    }

    public final void a(Function0<Unit> action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        a((Xd) new b(action), j);
    }

    public final Handler a() {
        return this.a.a();
    }

    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C3654n9.a aVar = C3654n9.a;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        aVar.a(applicationContext);
    }

    public final IronSource.a[] a(LevelPlay.AdFormat... adFormats) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        ArrayList arrayList = new ArrayList();
        for (LevelPlay.AdFormat adFormat : adFormats) {
            arrayList.add(a(adFormat));
        }
        return (IronSource.a[]) arrayList.toArray(new IronSource.a[0]);
    }

    public final IronSource.a a(LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        return com.unity3d.mediation.a.a(adFormat);
    }

    public final boolean a(AdapterBaseInterface networkAdapter, IronSource.a adFormat, String providerName) {
        Intrinsics.checkNotNullParameter(networkAdapter, "networkAdapter");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        return C3746sf.a(networkAdapter, adFormat, providerName);
    }

    public static /* synthetic */ void a(C3725rb c3725rb, long j, Ie.a aVar, long j2, JSONObject jSONObject, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendInitSuccessEvent");
        }
        if ((i & 8) != 0) {
            jSONObject = new JSONObject();
        }
        c3725rb.a(j, aVar, j2, jSONObject);
    }

    public final void a(long j, Ie.a responseOrigin, long j2, JSONObject data) {
        Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            data.put("isMultipleAdUnits", 1);
            data.put(IronSourceConstants.EVENTS_DURATION, j);
            String strB = responseOrigin.b();
            Intrinsics.checkNotNullExpressionValue(strB, "responseOrigin.value");
            data.put(IronSourceConstants.EVENTS_EXT1, a(strB, j2));
        } catch (Exception e) {
            C3631m4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        C3746sf.a(EnumC3821x5.SDK_INIT_SUCCESS, data);
    }

    public final C3462ce a(C3462ce error) {
        Intrinsics.checkNotNullParameter(error, "error");
        int iC = error.c();
        if (iC != 2070) {
            return iC != 2110 ? error : new C3462ce(error.c(), IronSourceConstants.FALSE_AVAILABILITY_REASON_BAD_REQUEST);
        }
        return new C3462ce(error.c(), "noServerResponse");
    }

    private final String a(String str, long j) {
        return "responseOrigin=" + str + ";delayTimeAfterInitProcess=" + j;
    }

    public static /* synthetic */ void a(C3725rb c3725rb, C3462ce c3462ce, long j, JSONObject jSONObject, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendInitFailedEvent");
        }
        if ((i & 4) != 0) {
            jSONObject = new JSONObject();
        }
        c3725rb.a(c3462ce, j, jSONObject);
    }

    public final void a(C3462ce error, long j, JSONObject data) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            data.put(IronSourceConstants.EVENTS_ERROR_CODE, error.c());
            data.put("reason", error.d());
            data.put("isMultipleAdUnits", 1);
            data.put(IronSourceConstants.EVENTS_DURATION, j);
        } catch (Exception e) {
            C3631m4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        C3746sf.a(EnumC3821x5.SDK_INIT_FAILED, data);
    }

    public final void a(String placementName, LevelPlay.AdFormat adFormat, int i, String str) throws JSONException {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
        jSONObject.putOpt("reason", str);
        jSONObject.put("placement", placementName);
        jSONObject.put(Ta.f, adFormat.getValue());
        jSONObject.put("adf", C3746sf.c(com.unity3d.mediation.a.a(adFormat)));
        jSONObject.put("isMultipleAdUnits", 1);
        C3746sf.a(EnumC3821x5.TROUBLESHOOTING_PLACEMENT_CAPPING_PARSE_ERROR, jSONObject);
    }

    public final void a(String adUnitId, int i, String str) throws JSONException {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
        jSONObject.putOpt("reason", str);
        jSONObject.put("mediationAdUnitId", adUnitId);
        jSONObject.put("isMultipleAdUnits", 1);
        C3746sf.a(EnumC3821x5.TROUBLESHOOTING_AD_UNIT_CAPPING_PARSE_ERROR, jSONObject);
    }
}
