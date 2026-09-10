package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3745se implements InterfaceC3762te {
    private final R9 a = new R9();
    private final C3690p9 b = new C3690p9(IronSourceThreadManager.INSTANCE.getInitHandler());
    private final InterfaceC3806w7 c = Gb.s.d().a();

    /* JADX INFO: renamed from: com.ironsource.se$a */
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

    @Override // com.ironsource.InterfaceC3762te
    public InterfaceC3806w7 a() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC3762te
    public void b(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC3762te
    public void c(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.b.a(callback);
    }

    @Override // com.ironsource.InterfaceC3762te
    public void d(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.b.b(runnable);
    }

    @Override // com.ironsource.InterfaceC3762te
    public void e(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC3762te
    public void f() {
        C3846yd.c().a();
    }

    @Override // com.ironsource.InterfaceC3762te
    public R9 g() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC3762te
    public void a(Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(runnable, j);
    }

    @Override // com.ironsource.InterfaceC3762te
    public boolean b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return IronSourceUtils.g(context);
    }

    @Override // com.ironsource.InterfaceC3762te
    public String c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String strB = com.ironsource.mediationsdk.p.h().b(context);
        Intrinsics.checkNotNullExpressionValue(strB, "getInstance().getAdvertiserId(context)");
        return strB;
    }

    @Override // com.ironsource.InterfaceC3762te
    public boolean d() {
        return IronSourceUtils.g();
    }

    @Override // com.ironsource.InterfaceC3762te
    public void e() {
        com.ironsource.mediationsdk.p.h().I();
    }

    @Override // com.ironsource.InterfaceC3762te
    public void a(Xd safeRunnable, long j) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.b.a(safeRunnable, j);
    }

    @Override // com.ironsource.InterfaceC3762te
    public void b() {
        Gb.s.d().q().a(new C3804w5(EnumC3821x5.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.b(false)));
    }

    @Override // com.ironsource.InterfaceC3762te
    public Y9 c() {
        return com.ironsource.mediationsdk.p.h().n();
    }

    @Override // com.ironsource.InterfaceC3762te
    public void a(Xd safeRunnable) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.b.a(safeRunnable);
    }

    @Override // com.ironsource.InterfaceC3762te
    public void a(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new a(callback), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC3762te
    public void a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (TextUtils.isEmpty(value)) {
            return;
        }
        I6.a().a(key, value);
    }

    @Override // com.ironsource.InterfaceC3762te
    public void a(long j, Ie.a responseOrigin) {
        Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        com.ironsource.mediationsdk.p.h().a(j, responseOrigin);
    }

    @Override // com.ironsource.InterfaceC3762te
    public Ie a(Context context, String appKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        return com.ironsource.mediationsdk.p.h().a(context, appKey);
    }

    @Override // com.ironsource.InterfaceC3762te
    public String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String strA = a().a(context);
        Intrinsics.checkNotNullExpressionValue(strA, "deviceInfoService.getOrG…UniqueIdentifier(context)");
        return strA;
    }

    @Override // com.ironsource.InterfaceC3762te
    public void a(F1 reporterSettings) {
        Intrinsics.checkNotNullParameter(reporterSettings, "reporterSettings");
        C3631m4.d().a(reporterSettings.b(), reporterSettings.d(), reporterSettings.c(), reporterSettings.e(), IronSourceUtils.d(), reporterSettings.a(), reporterSettings.g());
    }

    @Override // com.ironsource.InterfaceC3762te
    public void a(EnumC3712qe initStatus) {
        Intrinsics.checkNotNullParameter(initStatus, "initStatus");
        C3728re.a.a(initStatus);
    }

    @Override // com.ironsource.InterfaceC3762te
    public void a(C3462ce error, String str, String str2) {
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObjectB = IronSourceUtils.b(false);
        try {
            jSONObjectB.put(IronSourceConstants.EVENTS_ERROR_CODE, error.c());
            jSONObjectB.put("reason", error.d());
            String str3 = "";
            if (!TextUtils.isEmpty(str)) {
                str3 = "request=" + str + ";";
            }
            if (!TextUtils.isEmpty(str2)) {
                str3 = str3 + "body=" + str2;
            }
            if (str3.length() > 0) {
                jSONObjectB.put(IronSourceConstants.EVENTS_EXT1, str3);
            }
        } catch (Exception e) {
            C3631m4.d().a(e);
            IronLog.INTERNAL.error(e.getMessage());
        }
        Gb.s.d().q().a(new C3804w5(EnumC3821x5.TROUBLESHOOTING_SERVER_INIT_FAILED, jSONObjectB));
    }
}
