package com.facebook;

import android.os.Handler;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/ProgressOutputStream;", "Ljava/io/FilterOutputStream;", "Lcom/facebook/RequestOutputStream;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class ProgressOutputStream extends FilterOutputStream implements RequestOutputStream {
    public final long X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public long f15962Y;
    public long Z;
    public RequestProgress e0;
    public final GraphRequestBatch f0;
    public final HashMap g0;
    public final long h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressOutputStream(FilterOutputStream filterOutputStream, GraphRequestBatch requests, HashMap progressMap, long j) {
        super(filterOutputStream);
        Intrinsics.f(requests, "requests");
        Intrinsics.f(progressMap, "progressMap");
        this.f0 = requests;
        this.g0 = progressMap;
        this.h0 = j;
        HashSet hashSet = FacebookSdk.f15915a;
        Validate.h();
        this.X = FacebookSdk.g.get();
    }

    @Override // com.facebook.RequestOutputStream
    public final void a(GraphRequest graphRequest) {
        this.e0 = graphRequest != null ? (RequestProgress) this.g0.get(graphRequest) : null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        Iterator it = this.g0.values().iterator();
        while (it.hasNext()) {
            ((RequestProgress) it.next()).a();
        }
        k();
    }

    public final void h(long j) {
        RequestProgress requestProgress = this.e0;
        if (requestProgress != null) {
            long j2 = requestProgress.f15965b + j;
            requestProgress.f15965b = j2;
            if (j2 >= requestProgress.f15966c + requestProgress.f15964a || j2 >= requestProgress.d) {
                requestProgress.a();
            }
        }
        long j3 = this.f15962Y + j;
        this.f15962Y = j3;
        if (j3 >= this.Z + this.X || j3 >= this.h0) {
            k();
        }
    }

    public final void k() {
        if (this.f15962Y > this.Z) {
            GraphRequestBatch graphRequestBatch = this.f0;
            for (GraphRequestBatch.Callback callback : graphRequestBatch.e0) {
                if (callback instanceof GraphRequestBatch.OnProgressCallback) {
                    Handler handler = graphRequestBatch.X;
                    if (handler != null) {
                        final GraphRequestBatch.OnProgressCallback onProgressCallback = (GraphRequestBatch.OnProgressCallback) callback;
                        handler.post(new Runnable() { // from class: com.facebook.ProgressOutputStream$reportBatchProgress$1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (CrashShieldHandler.b(this)) {
                                    return;
                                }
                                try {
                                    GraphRequestBatch.OnProgressCallback onProgressCallback2 = onProgressCallback;
                                    GraphRequestBatch graphRequestBatch2 = this.X.f0;
                                    onProgressCallback2.b();
                                } catch (Throwable th) {
                                    CrashShieldHandler.a(this, th);
                                }
                            }
                        });
                    } else {
                        ((GraphRequestBatch.OnProgressCallback) callback).b();
                    }
                }
            }
            this.Z = this.f15962Y;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] buffer) throws IOException {
        Intrinsics.f(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer);
        h(buffer.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] buffer, int i2, int i3) throws IOException {
        Intrinsics.f(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer, i2, i3);
        h(i3);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i2) throws IOException {
        ((FilterOutputStream) this).out.write(i2);
        h(1L);
    }
}
