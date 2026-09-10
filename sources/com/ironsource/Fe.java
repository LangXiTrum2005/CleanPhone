package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Fe implements Ge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U9 f26103a = new U9();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0568s9 f26104b = new C0568s9();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0674y7 f26105c = Kb.f26413u.d().a();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends AbstractRunnableC0430ke {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f26106b;

        public a(Runnable runnable) {
            this.f26106b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC0430ke
        public void a() {
            this.f26106b.run();
        }
    }

    @Override // com.ironsource.Ge
    public InterfaceC0674y7 a() {
        return this.f26105c;
    }

    @Override // com.ironsource.Ge
    public void b(Runnable callback) {
        kotlin.jvm.internal.n.f(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }

    @Override // com.ironsource.Ge
    public void c(Runnable runnable) {
        kotlin.jvm.internal.n.f(runnable, "runnable");
        this.f26104b.a(runnable);
    }

    @Override // com.ironsource.Ge
    public void d(Runnable runnable) {
        kotlin.jvm.internal.n.f(runnable, "runnable");
        IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    @Override // com.ironsource.Ge
    public void e() {
        com.ironsource.mediationsdk.p.h().I();
    }

    @Override // com.ironsource.Ge
    public void f() {
        Ld.c().a();
    }

    @Override // com.ironsource.Ge
    public U9 g() {
        return this.f26103a;
    }

    @Override // com.ironsource.Ge
    public void a(Runnable runnable, long j10) {
        kotlin.jvm.internal.n.f(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(runnable, j10);
    }

    @Override // com.ironsource.Ge
    public boolean b(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        return IronSourceUtils.f(context);
    }

    @Override // com.ironsource.Ge
    public String c(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        String strB = com.ironsource.mediationsdk.p.h().b(context);
        kotlin.jvm.internal.n.e(strB, "getInstance().getAdvertiserId(context)");
        return strB;
    }

    @Override // com.ironsource.Ge
    public boolean d() {
        return IronSourceUtils.g();
    }

    @Override // com.ironsource.Ge
    public void a(Runnable callback) {
        kotlin.jvm.internal.n.f(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new a(callback), 0L, 2, null);
    }

    @Override // com.ironsource.Ge
    public void b() {
        Kb.f26413u.d().q().a(new C0654x5(EnumC0672y5.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.b(false)));
    }

    @Override // com.ironsource.Ge
    public C0265ba c() {
        return com.ironsource.mediationsdk.p.h().n();
    }

    @Override // com.ironsource.Ge
    public void a(String key, String value) {
        kotlin.jvm.internal.n.f(key, "key");
        kotlin.jvm.internal.n.f(value, "value");
        if (TextUtils.isEmpty(value)) {
            return;
        }
        L6.a().a(key, value);
    }

    @Override // com.ironsource.Ge
    public void a(long j10, Ve.a responseOrigin) {
        kotlin.jvm.internal.n.f(responseOrigin, "responseOrigin");
        com.ironsource.mediationsdk.p.h().a(j10, responseOrigin);
    }

    @Override // com.ironsource.Ge
    public Ve a(Context context, String appKey) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(appKey, "appKey");
        return com.ironsource.mediationsdk.p.h().a(context, appKey);
    }

    @Override // com.ironsource.Ge
    public String a(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        String strA = a().a(context);
        kotlin.jvm.internal.n.e(strA, "deviceInfoService.getOrG…UniqueIdentifier(context)");
        return strA;
    }

    @Override // com.ironsource.Ge
    public void a(F1 reporterSettings) {
        kotlin.jvm.internal.n.f(reporterSettings, "reporterSettings");
        C0474n4.d().a(reporterSettings.b(), reporterSettings.d(), reporterSettings.c(), reporterSettings.e(), IronSourceUtils.d(), reporterSettings.a(), reporterSettings.g());
    }

    @Override // com.ironsource.Ge
    public void a(De initStatus) {
        kotlin.jvm.internal.n.f(initStatus, "initStatus");
        Ee.f26017a.a(initStatus);
    }
}
