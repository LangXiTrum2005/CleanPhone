package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/ProgressNoopOutputStream;", "Ljava/io/OutputStream;", "Lcom/facebook/RequestOutputStream;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class ProgressNoopOutputStream extends OutputStream implements RequestOutputStream {
    public final HashMap X = new HashMap();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public GraphRequest f15961Y;
    public RequestProgress Z;
    public int e0;
    public final Handler f0;

    public ProgressNoopOutputStream(Handler handler) {
        this.f0 = handler;
    }

    @Override // com.facebook.RequestOutputStream
    public final void a(GraphRequest graphRequest) {
        this.f15961Y = graphRequest;
        this.Z = graphRequest != null ? (RequestProgress) this.X.get(graphRequest) : null;
    }

    public final void h(long j) {
        GraphRequest graphRequest = this.f15961Y;
        if (graphRequest != null) {
            if (this.Z == null) {
                RequestProgress requestProgress = new RequestProgress(this.f0, graphRequest);
                this.Z = requestProgress;
                this.X.put(graphRequest, requestProgress);
            }
            RequestProgress requestProgress2 = this.Z;
            if (requestProgress2 != null) {
                requestProgress2.d += j;
            }
            this.e0 += (int) j;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] buffer) {
        Intrinsics.f(buffer, "buffer");
        h(buffer.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] buffer, int i2, int i3) {
        Intrinsics.f(buffer, "buffer");
        h(i3);
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
        h(1L);
    }
}
