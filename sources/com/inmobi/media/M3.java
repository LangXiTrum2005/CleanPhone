package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class M3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S3 f22967a;

    public M3(S3 s3) {
        this.f22967a = s3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f22967a) {
            try {
                S3 s3 = this.f22967a;
                if (s3.j == null) {
                    return null;
                }
                while (s3.f23158i > s3.f) {
                    s3.d((String) ((Map.Entry) s3.k.entrySet().iterator().next()).getKey());
                }
                if (this.f22967a.a()) {
                    this.f22967a.d();
                    this.f22967a.f23159l = 0;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
