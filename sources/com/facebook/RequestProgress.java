package com.facebook;

import android.os.Handler;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/RequestProgress;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class RequestProgress {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f15966c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f15967e;
    public final GraphRequest f;

    public RequestProgress(Handler handler, GraphRequest request) {
        Intrinsics.f(request, "request");
        this.f15967e = handler;
        this.f = request;
        HashSet hashSet = FacebookSdk.f15915a;
        Validate.h();
        this.f15964a = FacebookSdk.g.get();
    }

    public final void a() {
        final long j = this.f15965b;
        if (j > this.f15966c) {
            final GraphRequest.Callback callback = this.f.f;
            final long j2 = this.d;
            if (j2 <= 0 || !(callback instanceof GraphRequest.OnProgressCallback)) {
                return;
            }
            Handler handler = this.f15967e;
            if (handler != null) {
                handler.post(new Runnable(j, j2) { // from class: com.facebook.RequestProgress$reportProgress$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (CrashShieldHandler.b(this)) {
                            return;
                        }
                        try {
                            ((GraphRequest.OnProgressCallback) this.X).getClass();
                        } catch (Throwable th) {
                            CrashShieldHandler.a(this, th);
                        }
                    }
                });
            } else {
                ((GraphRequest.OnProgressCallback) callback).getClass();
            }
            this.f15966c = this.f15965b;
        }
    }
}
