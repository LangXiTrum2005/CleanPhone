package com.p004ironsource;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.OutcomeReceiver;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\fj\u0002`\r0\u000bH\u0003J\b\u0010\u000e\u001a\u00020\tH\u0002J\u0012\u0010\u0005\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/ironsource/gr;", "", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "a", "", "b", "", "", "d", "Landroid/os/OutcomeReceiver;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "c", "reason", "Lcom/ironsource/zf;", "Lcom/ironsource/zf;", "eventManager", "Lkotlin/Function0;", "", "Lkotlin/jvm/functions/Function0;", "getTimeFunction", "Lcom/ironsource/fg;", "Lcom/ironsource/fg;", "serviceProvider", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Lcom/ironsource/zf;Lkotlin/jvm/functions/Function0;Lcom/ironsource/fg;Ljava/util/concurrent/Executor;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class gr {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final zf eventManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function0<Long> getTimeFunction;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final fg serviceProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Executor executor;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25165a = new a();

        public a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0014\u0010\t\u001a\u00020\u00062\n\u0010\b\u001a\u00060\u0003j\u0002`\u0004H\u0016¨\u0006\n"}, d2 = {"com/ironsource/gr$b", "Landroid/os/OutcomeReceiver;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "result", "", "onResult", "error", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements OutcomeReceiver {
        public b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception error) {
            Intrinsics.f(error, "error");
            gr.this.a(error.getMessage());
        }

        public void onResult(Object result) {
            gr.this.c();
        }
    }

    public gr() {
        this(null, null, null, null, 15, null);
    }

    private final Uri a(Context context) {
        vf vfVarF = this.serviceProvider.f();
        String connectionType = IronSourceUtils.getConnectionType(context);
        Uri uriBuild = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority("android-att.ironsrc.mobi").path("register_trigger").appendQueryParameter("osVersion", Build.VERSION.RELEASE).appendQueryParameter("apiLevel", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter(d9.i.f24755l, Build.MODEL).appendQueryParameter("sdkVersion", LevelPlay.getSdkVersion()).appendQueryParameter("bundleID", context.getPackageName()).appendQueryParameter("gaid", vfVarF.p(context)).appendQueryParameter("asid", vfVarF.G(context)).appendQueryParameter("auid", vfVarF.t(context)).appendQueryParameter("isFirstSession", String.valueOf(b(context))).appendQueryParameter("coppa", b()).appendQueryParameter(ne.h0, String.valueOf(i1.a())).appendQueryParameter("origin", "1").appendQueryParameter("timestamp", String.valueOf(((Number) this.getTimeFunction.invoke()).longValue())).appendQueryParameter(d9.i.x, vfVarF.b(context)).appendQueryParameter("deviceCarrier", vfVarF.j(context)).appendQueryParameter(d9.i.t, connectionType).appendQueryParameter(z8.f27869b, String.valueOf(StringsKt.r(connectionType, z8.f27869b, true))).build();
        Intrinsics.e(uriBuild, "Builder()\n        .schem…arameter\n        .build()");
        return uriBuild;
    }

    private final String b() {
        ConcurrentHashMap<String, List<String>> concurrentHashMapC = xk.b().c();
        List<String> list = concurrentHashMapC != null ? concurrentHashMapC.get(com.p004ironsource.mediationsdk.metadata.a.f25959b) : null;
        String str = list != null ? (String) CollectionsKt.w(list) : null;
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        this.eventManager.a(new zb(ac.REGISTER_TRIGGER_SUCCESS, (JSONObject) null));
    }

    private final void d() {
        this.eventManager.a(new zb(ac.REGISTER_TRIGGER, (JSONObject) null));
    }

    public gr(zf eventManager, Function0<Long> getTimeFunction, fg serviceProvider, Executor executor) {
        Intrinsics.f(eventManager, "eventManager");
        Intrinsics.f(getTimeFunction, "getTimeFunction");
        Intrinsics.f(serviceProvider, "serviceProvider");
        Intrinsics.f(executor, "executor");
        this.eventManager = eventManager;
        this.getTimeFunction = getTimeFunction;
        this.serviceProvider = serviceProvider;
        this.executor = executor;
    }

    private final OutcomeReceiver a() {
        return new b();
    }

    private final boolean b(Context context) {
        return IronSourceUtils.getFirstSession(context);
    }

    public final void c(Context context) {
        Intrinsics.f(context, "context");
        d();
        try {
            MeasurementManager measurementManagerA = i1.a(context);
            if (measurementManagerA == null) {
                a("could not obtain measurement manager");
            } else {
                measurementManagerA.registerTrigger(a(context), this.executor, a());
            }
        } catch (Exception e2) {
            a(e2.getMessage());
            q9.d().a(e2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ gr(zf zfVar, Function0 function0, fg fgVar, Executor executor, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        zfVar = (i2 & 1) != 0 ? on.INSTANCE.d().z() : zfVar;
        function0 = (i2 & 2) != 0 ? a.f25165a : function0;
        fgVar = (i2 & 4) != 0 ? on.INSTANCE.d() : fgVar;
        if ((i2 & 8) != 0) {
            executor = Executors.newSingleThreadExecutor();
            Intrinsics.e(executor, "newSingleThreadExecutor()");
        }
        this(zfVar, function0, fgVar, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String reason) {
        this.eventManager.a(new zb(ac.REGISTER_TRIGGER_FAIL, new JSONObject().put("reason", reason)));
    }
}
