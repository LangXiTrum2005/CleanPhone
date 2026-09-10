package com.p004ironsource;

import android.content.Context;
import android.os.Handler;
import android.view.Choreographer;
import com.p004ironsource.environment.thread.IronSourceThreadManager;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.p004ironsource.mediationsdk.integration.IntegrationHelper;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b-\u0010.J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u0018\u0010\u0006\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0007J\u001a\u0010\u0006\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007J\u001e\u0010\u0006\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00122\b\b\u0002\u0010\r\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0006\u001a\u00020\u0014J\u000e\u0010\u0006\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015J'\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00172\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017\"\u00020\u0018¢\u0006\u0004\b\u0006\u0010\u001bJ\u000e\u0010\u0006\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0018J\u001e\u0010\u0006\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0002J\u001e\u0010\u0006\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u0006\u001a\u00020\t2\u0006\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020\u0004J(\u0010\u0006\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\u0002J \u0010\u0006\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\u0002J \u0010\u000b\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\u0002R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+¨\u0006/"}, d2 = {"Lcom/ironsource/xm;", "", "", "responseOrigin", "", "delayTimeAfterInitProcessInMS", "a", "Ljava/lang/Runnable;", "runnable", "", "d", "b", "c", "delay", "callback", "e", "Lcom/ironsource/ks;", "safeRunnable", "Lkotlin/Function0;", "action", "Landroid/os/Handler;", "Landroid/content/Context;", "context", "", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "adFormats", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "([Lcom/unity3d/mediation/LevelPlay$AdFormat;)[Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adFormat", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterBaseInterface;", "networkAdapter", "providerName", "", "duration", "Lcom/ironsource/qt$a;", "Lcom/ironsource/ps;", "error", "placementName", "", "errorCode", "errorMessage", "adUnitId", "Lcom/ironsource/fj;", "Lcom/ironsource/fj;", "thread", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public class xm {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final fj thread = new fj(null, 1, 0 == true ? 1 : 0);

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ironsource/xm$a", "Lcom/ironsource/ks;", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends ks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f27727a;

        public a(Runnable runnable) {
            this.f27727a = runnable;
        }

        @Override // com.p004ironsource.ks
        public void a() {
            this.f27727a.run();
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ironsource/xm$b", "Lcom/ironsource/ks;", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends ks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f27728a;

        public b(Function0<Unit> function0) {
            this.f27728a = function0;
        }

        @Override // com.p004ironsource.ks
        public void a() {
            this.f27728a.invoke();
        }
    }

    public final Handler a() {
        return this.thread.getHandler();
    }

    public final void b(ks safeRunnable) {
        Intrinsics.f(safeRunnable, "safeRunnable");
        this.thread.a(safeRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final xm this$0, final Runnable runnable) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(runnable, "$runnable");
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.ironsource.Q0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                xm.a(this.X, runnable, j);
            }
        });
    }

    public final IronSource.AD_UNIT a(LevelPlay.AdFormat adFormat) {
        Intrinsics.f(adFormat, "adFormat");
        return com.unity3d.mediation.a.a(adFormat);
    }

    public final void c(Runnable runnable) {
        Intrinsics.f(runnable, "runnable");
        a(this, new P0(this, runnable, 1), 0L, 2, (Object) null);
    }

    public final void d(Runnable runnable) {
        Intrinsics.f(runnable, "runnable");
        this.thread.b(runnable);
    }

    public final void e(Runnable callback) {
        Intrinsics.f(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }

    private final String a(String responseOrigin, long delayTimeAfterInitProcessInMS) {
        return "responseOrigin=" + responseOrigin + ";delayTimeAfterInitProcess=" + delayTimeAfterInitProcessInMS;
    }

    public final void b(Runnable runnable) {
        Intrinsics.f(runnable, "runnable");
        a(this, new P0(this, runnable, 0), 0L, 2, (Object) null);
    }

    public final void a(long duration, qt.a responseOrigin, long delayTimeAfterInitProcessInMS) throws JSONException {
        Intrinsics.f(responseOrigin, "responseOrigin");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isMultipleAdUnits", 1);
        jSONObject.put("duration", duration);
        String strA = responseOrigin.a();
        Intrinsics.e(strA, "responseOrigin.value");
        jSONObject.put(IronSourceConstants.EVENTS_EXT1, a(strA, delayTimeAfterInitProcessInMS));
        av.a(ac.SDK_INIT_SUCCESS, jSONObject);
    }

    public final void b(String adUnitId, int errorCode, String errorMessage) throws JSONException {
        Intrinsics.f(adUnitId, "adUnitId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", errorCode);
        jSONObject.putOpt("reason", errorMessage);
        jSONObject.put("mediationAdUnitId", adUnitId);
        jSONObject.put("isMultipleAdUnits", 1);
        av.a(ac.TROUBLESHOOTING_AD_UNIT_REWARD_PARSE_ERROR, jSONObject);
    }

    public final void a(Context context) {
        Intrinsics.f(context, "context");
        IntegrationHelper.validateIntegration(context.getApplicationContext());
    }

    public final void a(ks safeRunnable) {
        Intrinsics.f(safeRunnable, "safeRunnable");
        a(this, safeRunnable, 0L, 2, (Object) null);
    }

    public final void a(ks safeRunnable, long delay) {
        Intrinsics.f(safeRunnable, "safeRunnable");
        this.thread.a(safeRunnable, delay);
    }

    public final void a(ps error, long duration) throws JSONException {
        Intrinsics.f(error, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", error.c());
        jSONObject.put("reason", error.d());
        jSONObject.put("isMultipleAdUnits", 1);
        jSONObject.put("duration", duration);
        av.a(ac.SDK_INIT_FAILED, jSONObject);
    }

    public static /* synthetic */ void a(xm xmVar, ks ksVar, long j, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i2 & 2) != 0) {
            j = 0;
        }
        xmVar.a(ksVar, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(xm this$0, Runnable runnable) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(runnable, "$runnable");
        this$0.thread.b(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(xm this$0, Runnable runnable, long j) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(runnable, "$runnable");
        this$0.b(runnable);
    }

    public static /* synthetic */ void a(xm xmVar, Runnable runnable, long j, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postOnUIThread");
        }
        if ((i2 & 2) != 0) {
            j = 0;
        }
        xmVar.a(runnable, j);
    }

    public static /* synthetic */ void a(xm xmVar, Function0 function0, long j, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i2 & 2) != 0) {
            j = 0;
        }
        xmVar.a((Function0<Unit>) function0, j);
    }

    public final void a(Runnable callback) {
        Intrinsics.f(callback, "callback");
        this.thread.a(callback);
    }

    public final void a(Runnable runnable, long delay) {
        Intrinsics.f(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(runnable), delay);
    }

    public final void a(String adUnitId, int errorCode, String errorMessage) throws JSONException {
        Intrinsics.f(adUnitId, "adUnitId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", errorCode);
        jSONObject.putOpt("reason", errorMessage);
        jSONObject.put("mediationAdUnitId", adUnitId);
        jSONObject.put("isMultipleAdUnits", 1);
        av.a(ac.TROUBLESHOOTING_AD_UNIT_CAPPING_PARSE_ERROR, jSONObject);
    }

    public final void a(String placementName, LevelPlay.AdFormat adFormat, int errorCode, String errorMessage) throws JSONException {
        Intrinsics.f(placementName, "placementName");
        Intrinsics.f(adFormat, "adFormat");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", errorCode);
        jSONObject.putOpt("reason", errorMessage);
        jSONObject.put("placement", placementName);
        jSONObject.put(gm.EVENTS_LEVEL_PLAY_AD_FORMAT_NAME, adFormat.getValue());
        jSONObject.put("adf", av.b(com.unity3d.mediation.a.a(adFormat)));
        jSONObject.put("isMultipleAdUnits", 1);
        av.a(ac.TROUBLESHOOTING_PLACEMENT_CAPPING_PARSE_ERROR, jSONObject);
    }

    public final void a(Function0<Unit> action, long delay) {
        Intrinsics.f(action, "action");
        a((ks) new b(action), delay);
    }

    public final boolean a(AdapterBaseInterface networkAdapter, IronSource.AD_UNIT adFormat, String providerName) {
        Intrinsics.f(networkAdapter, "networkAdapter");
        Intrinsics.f(adFormat, "adFormat");
        Intrinsics.f(providerName, "providerName");
        return av.a(networkAdapter, adFormat, providerName);
    }

    public final IronSource.AD_UNIT[] a(LevelPlay.AdFormat... adFormats) {
        Intrinsics.f(adFormats, "adFormats");
        ArrayList arrayList = new ArrayList();
        for (LevelPlay.AdFormat adFormat : adFormats) {
            arrayList.add(a(adFormat));
        }
        return (IronSource.AD_UNIT[]) arrayList.toArray(new IronSource.AD_UNIT[0]);
    }
}
