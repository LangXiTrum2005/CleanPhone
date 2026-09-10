package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.OutcomeReceiver;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Od {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C7 f26792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jk.a f26793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final I7 f26794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f26795d;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class a extends kotlin.jvm.internal.k implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26796a = new a();

        public a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // jk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b implements OutcomeReceiver {
        public b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception error) {
            kotlin.jvm.internal.n.f(error, "error");
            Od.this.a(error.getMessage());
        }

        public void onResult(Object obj) {
            Od.this.c();
        }
    }

    public Od() {
        this(null, null, null, null, 15, null);
    }

    private final boolean b(Context context) {
        return IronSourceUtils.c(context);
    }

    private final void d() {
        this.f26792a.a(new C0654x5(EnumC0672y5.REGISTER_TRIGGER, (JSONObject) null));
    }

    @SuppressLint({"NewApi"})
    public final void c(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        d();
        try {
            MeasurementManager measurementManagerA = C0434l0.a(context);
            if (measurementManagerA == null) {
                a("could not obtain measurement manager");
            } else {
                measurementManagerA.registerTrigger(a(context), this.f26795d, a());
            }
        } catch (Exception e10) {
            a(e10.getMessage());
            C0474n4.d().a(e10);
        }
    }

    public Od(C7 eventManager, jk.a getTimeFunction, I7 serviceProvider, Executor executor) {
        kotlin.jvm.internal.n.f(eventManager, "eventManager");
        kotlin.jvm.internal.n.f(getTimeFunction, "getTimeFunction");
        kotlin.jvm.internal.n.f(serviceProvider, "serviceProvider");
        kotlin.jvm.internal.n.f(executor, "executor");
        this.f26792a = eventManager;
        this.f26793b = getTimeFunction;
        this.f26794c = serviceProvider;
        this.f26795d = executor;
    }

    private final String b() {
        ConcurrentHashMap<String, List<String>> concurrentHashMapC = C0462ma.b().c();
        List<String> list = concurrentHashMapC != null ? concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f29605b) : null;
        String str = list != null ? (String) xj.n.o0(list) : null;
        return str == null ? "" : str;
    }

    private final Uri a(Context context) {
        InterfaceC0674y7 interfaceC0674y7A = this.f26794c.a();
        String strA = IronSourceUtils.a(context);
        Uri uriBuild = new Uri.Builder().scheme("https").authority("android-att.ironsrc.mobi").path("register_trigger").appendQueryParameter("osVersion", Build.VERSION.RELEASE).appendQueryParameter("apiLevel", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter("deviceModel", Build.MODEL).appendQueryParameter("sdkVersion", LevelPlay.getSdkVersion()).appendQueryParameter("bundleID", context.getPackageName()).appendQueryParameter(O6.X0, interfaceC0674y7A.I(context)).appendQueryParameter(O6.M0, interfaceC0674y7A.z(context)).appendQueryParameter("auid", interfaceC0674y7A.e(context)).appendQueryParameter("isFirstSession", String.valueOf(b(context))).appendQueryParameter("coppa", b()).appendQueryParameter(O6.f26722j0, String.valueOf(C0434l0.a())).appendQueryParameter("origin", "1").appendQueryParameter("timestamp", String.valueOf(((Number) this.f26793b.invoke()).longValue())).appendQueryParameter(X3.j.f27866x, interfaceC0674y7A.d(context)).appendQueryParameter("deviceCarrier", interfaceC0674y7A.v(context)).appendQueryParameter("connectionType", strA).appendQueryParameter(T3.f27210b, String.valueOf(an.p.i0(strA, T3.f27210b))).build();
        kotlin.jvm.internal.n.e(uriBuild, "Builder()\n        .schem…arameter\n        .build()");
        return uriBuild;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Od(C7 c10, jk.a aVar, I7 i10, Executor executor, int i11, kotlin.jvm.internal.g gVar) {
        c10 = (i11 & 1) != 0 ? Kb.f26413u.d().q() : c10;
        aVar = (i11 & 2) != 0 ? a.f26796a : aVar;
        i10 = (i11 & 4) != 0 ? Kb.f26413u.d() : i10;
        if ((i11 & 8) != 0) {
            executor = Executors.newSingleThreadExecutor();
            kotlin.jvm.internal.n.e(executor, "newSingleThreadExecutor()");
        }
        this(c10, aVar, i10, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        this.f26792a.a(new C0654x5(EnumC0672y5.REGISTER_TRIGGER_SUCCESS, (JSONObject) null));
    }

    @SuppressLint({"NewApi"})
    private final OutcomeReceiver a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        this.f26792a.a(new C0654x5(EnumC0672y5.REGISTER_TRIGGER_FAIL, new JSONObject().put("reason", str)));
    }
}
