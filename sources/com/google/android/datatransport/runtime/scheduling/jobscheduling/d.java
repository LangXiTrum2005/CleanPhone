package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements SynchronizationGuard.CriticalSection, Deferred.DeferredHandler, Continuation {
    public final /* synthetic */ long X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f16943Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ d(Uploader uploader, TransportContext transportContext, long j) {
        this.f16943Y = uploader;
        this.Z = transportContext;
        this.X = j;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void c(Provider provider) {
        ((CrashlyticsNativeComponent) provider.get()).c((String) this.f16943Y, this.X, (StaticSessionData) this.Z);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        Uploader uploader = (Uploader) this.f16943Y;
        uploader.f16926c.A0(uploader.g.a() + this.X, (TransportContext) this.Z);
        return null;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int[] iArr = ConfigFetchHandler.k;
        return ((ConfigFetchHandler) this.f16943Y).b(task, this.X, (HashMap) this.Z);
    }

    public /* synthetic */ d(Object obj, long j, Object obj2) {
        this.f16943Y = obj;
        this.X = j;
        this.Z = obj2;
    }
}
