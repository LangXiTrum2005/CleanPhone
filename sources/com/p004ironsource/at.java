package com.p004ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ironsource/at;", "", "", "c", "Lcom/ironsource/ps;", "a", "Lcom/ironsource/ps;", "()Lcom/ironsource/ps;", "error", "Lcom/ironsource/ws;", "b", "Lcom/ironsource/ws;", "()Lcom/ironsource/ws;", "sdkInitResponse", "<init>", "(Lcom/ironsource/ps;)V", "(Lcom/ironsource/ws;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class at {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ps error;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ws sdkInitResponse;

    public at(ps error) {
        Intrinsics.f(error, "error");
        this.error = error;
        this.sdkInitResponse = null;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ps getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ws getSdkInitResponse() {
        return this.sdkInitResponse;
    }

    public final boolean c() {
        ws wsVar;
        if (this.error == null && (wsVar = this.sdkInitResponse) != null) {
            return wsVar.getFullResponse().p();
        }
        return false;
    }

    public at(ws sdkInitResponse) {
        Intrinsics.f(sdkInitResponse, "sdkInitResponse");
        this.sdkInitResponse = sdkInitResponse;
        this.error = null;
    }
}
