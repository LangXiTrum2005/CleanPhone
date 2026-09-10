package com.p004ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.p004ironsource.environment.thread.IronSourceThreadManager;
import com.p004ironsource.mediationsdk.IronSourceSegment;
import com.p004ironsource.mediationsdk.p;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.y4.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010-J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fJ\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\b\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015J\b\u0010\n\u001a\u0004\u0018\u00010\u0017J\u000e\u0010\u0005\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u000fJ\u000e\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u001b\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u0010\u000e\u001a\u00020\u0018J\u0006\u0010 \u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004R\u0017\u0010$\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b\u0005\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&R\u0017\u0010+\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b\r\u0010*¨\u0006."}, d2 = {"Lcom/ironsource/ft;", "", "Ljava/lang/Runnable;", "runnable", "", "c", "", "delay", "a", "callback", "d", "Lcom/ironsource/ks;", "safeRunnable", "b", "e", "", "key", "value", "elapsedTime", "Lcom/ironsource/qt$a;", "responseOrigin", "Landroid/content/Context;", "context", "Lcom/ironsource/mediationsdk/IronSourceSegment;", "", "appKey", "Lcom/ironsource/qt;", f.j, "Lcom/ironsource/c4;", "reporterSettings", "Lcom/ironsource/dt;", "initStatus", g.f40227p, "Lcom/ironsource/hk;", "Lcom/ironsource/hk;", "()Lcom/ironsource/hk;", "globalDataWriter", "Lcom/ironsource/fj;", "Lcom/ironsource/fj;", "thread", "Lcom/ironsource/vf;", "Lcom/ironsource/vf;", "()Lcom/ironsource/vf;", "deviceInfoService", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ft {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final hk globalDataWriter = new hk();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fj thread = new fj(IronSourceThreadManager.INSTANCE.getInitHandler());

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final vf deviceInfoService = on.INSTANCE.d().f();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ironsource/ft$a", "Lcom/ironsource/ks;", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends ks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f25095a;

        public a(Runnable runnable) {
            this.f25095a = runnable;
        }

        @Override // com.p004ironsource.ks
        public void a() {
            this.f25095a.run();
        }
    }

    public final qt a(Context context, String appKey) {
        Intrinsics.f(context, "context");
        Intrinsics.f(appKey, "appKey");
        return p.j().a(context, appKey);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final vf getDeviceInfoService() {
        return this.deviceInfoService;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final hk getGlobalDataWriter() {
        return this.globalDataWriter;
    }

    public final IronSourceSegment d() {
        return p.j().q();
    }

    public final void e(Runnable callback) {
        Intrinsics.f(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new a(callback), 0L, 2, null);
    }

    public final void f() {
        p.j().S();
    }

    public final void g() {
        on.INSTANCE.d().z().a(new zb(ac.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.getMediationAdditionalData(false)));
    }

    public final String a(Context context) {
        Intrinsics.f(context, "context");
        String advertiserId = p.j().getAdvertiserId(context);
        Intrinsics.e(advertiserId, "getInstance().getAdvertiserId(context)");
        return advertiserId;
    }

    public final String b(Context context) {
        Intrinsics.f(context, "context");
        String strM = this.deviceInfoService.M(context);
        Intrinsics.e(strM, "deviceInfoService.getOrG…UniqueIdentifier(context)");
        return strM;
    }

    public final void c(Runnable runnable) {
        Intrinsics.f(runnable, "runnable");
        this.thread.b(runnable);
    }

    public final void d(Runnable callback) {
        Intrinsics.f(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }

    public final boolean e() {
        return IronSourceUtils.isEncryptedResponse();
    }

    public final void a() {
        er.c().a();
    }

    public final void b(ks safeRunnable) {
        Intrinsics.f(safeRunnable, "safeRunnable");
        this.thread.a(safeRunnable);
    }

    public final boolean c(Context context) {
        Intrinsics.f(context, "context");
        return IronSourceUtils.isNetworkConnected(context);
    }

    public final void a(long elapsedTime, qt.a responseOrigin) {
        Intrinsics.f(responseOrigin, "responseOrigin");
        p.j().a(elapsedTime, responseOrigin);
    }

    public final void b(Runnable runnable) {
        Intrinsics.f(runnable, "runnable");
        IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    public final void a(c4 reporterSettings) {
        Intrinsics.f(reporterSettings, "reporterSettings");
        q9.d().a(reporterSettings.b(), reporterSettings.getCom.ironsource.e4.c java.lang.String(), reporterSettings.getCom.ironsource.e4.d java.lang.String(), reporterSettings.getIsANRIncluded(), IronSourceUtils.getSessionId(), reporterSettings.getDefaultAnrTimeout(), reporterSettings.getIsIgnoreDebugger());
    }

    public final void a(dt initStatus) {
        Intrinsics.f(initStatus, "initStatus");
        et.f24941a.a(initStatus);
    }

    public static /* synthetic */ void a(ft ftVar, ks ksVar, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        ftVar.a(ksVar, j);
    }

    public static /* synthetic */ void a(ft ftVar, Runnable runnable, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        ftVar.a(runnable, j);
    }

    public final void a(ks safeRunnable) {
        Intrinsics.f(safeRunnable, "safeRunnable");
        a(this, safeRunnable, 0L, 2, (Object) null);
    }

    public final void a(ks safeRunnable, long delay) {
        Intrinsics.f(safeRunnable, "safeRunnable");
        this.thread.a(safeRunnable, delay);
    }

    public final void a(Runnable callback) {
        Intrinsics.f(callback, "callback");
        this.thread.a(callback);
    }

    public final void a(Runnable runnable, long delay) {
        Intrinsics.f(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(runnable, delay);
    }

    public final void a(String key, String value) {
        Intrinsics.f(key, "key");
        Intrinsics.f(value, "value");
        if (TextUtils.isEmpty(value)) {
            return;
        }
        ke.a().a(key, value);
    }
}
