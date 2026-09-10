package com.google.firebase.crashlytics.internal;

import A.C0880a0;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.d;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class CrashlyticsNativeComponentDeferredProxy implements CrashlyticsNativeComponent {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final NativeSessionFileProvider f20281c = new MissingNativeSessionFileProvider();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Deferred f20282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f20283b = new AtomicReference(null);

    public static final class MissingNativeSessionFileProvider implements NativeSessionFileProvider {
    }

    public CrashlyticsNativeComponentDeferredProxy(Deferred deferred) {
        this.f20282a = deferred;
        deferred.a(new C0880a0(this, 18));
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public final NativeSessionFileProvider a(String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = (CrashlyticsNativeComponent) this.f20283b.get();
        return crashlyticsNativeComponent == null ? f20281c : crashlyticsNativeComponent.a(str);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public final boolean b() {
        CrashlyticsNativeComponent crashlyticsNativeComponent = (CrashlyticsNativeComponent) this.f20283b.get();
        return crashlyticsNativeComponent != null && crashlyticsNativeComponent.b();
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public final void c(String str, long j, StaticSessionData staticSessionData) {
        Logger.f20289a.e("Deferring native open session: " + str);
        this.f20282a.a(new d(str, j, staticSessionData));
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public final boolean d(String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = (CrashlyticsNativeComponent) this.f20283b.get();
        return crashlyticsNativeComponent != null && crashlyticsNativeComponent.d(str);
    }
}
