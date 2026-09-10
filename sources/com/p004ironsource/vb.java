package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ironsource/vb;", "Lcom/ironsource/dn;", "", "start", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "a", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "Lcom/ironsource/e7;", "b", "Lcom/ironsource/e7;", "adLoadTaskListener", "Lcom/ironsource/o3;", "c", "Lcom/ironsource/o3;", "analytics", "<init>", "(Lcom/ironsource/mediationsdk/logger/IronSourceError;Lcom/ironsource/e7;Lcom/ironsource/o3;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class vb implements dn {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final IronSourceError error;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e7 adLoadTaskListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final o3 analytics;

    public vb(IronSourceError error, e7 adLoadTaskListener, o3 analytics) {
        Intrinsics.f(error, "error");
        Intrinsics.f(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.f(analytics, "analytics");
        this.error = error;
        this.adLoadTaskListener = adLoadTaskListener;
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final IronSourceError getError() {
        return this.error;
    }

    @Override // com.p004ironsource.dn
    public void start() {
        h3.c.Companion companion = h3.c.INSTANCE;
        companion.a().a(this.analytics);
        companion.a(new k3.j(this.error.getErrorCode()), new k3.k(this.error.getErrorMessage()), new k3.f(0L)).a(this.analytics);
        this.adLoadTaskListener.onAdLoadFailed(this.error);
    }
}
