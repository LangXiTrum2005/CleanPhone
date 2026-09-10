package com.facebook.internal;

import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/facebook/internal/FileLruCache$openPutStream$renameToTargetCallback$1", "Lcom/facebook/internal/FileLruCache$StreamCloseCallback;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class FileLruCache$openPutStream$renameToTargetCallback$1 implements FileLruCache.StreamCloseCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FileLruCache f16320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f16321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f16322c;
    public final /* synthetic */ String d;

    public FileLruCache$openPutStream$renameToTargetCallback$1(FileLruCache fileLruCache, long j, File file, String str) {
        this.f16320a = fileLruCache;
        this.f16321b = j;
        this.f16322c = file;
        this.d = str;
    }

    public final void a() {
        final FileLruCache fileLruCache = this.f16320a;
        long j = fileLruCache.f16314e.get();
        long j2 = this.f16321b;
        File file = this.f16322c;
        if (j2 < j) {
            file.delete();
            return;
        }
        if (!file.renameTo(new File(fileLruCache.f16311a, Utility.K(this.d)))) {
            file.delete();
        }
        ReentrantLock reentrantLock = fileLruCache.f16313c;
        reentrantLock.lock();
        try {
            if (!fileLruCache.f16312b) {
                fileLruCache.f16312b = true;
                FacebookSdk.e().execute(new Runnable() { // from class: com.facebook.internal.FileLruCache$postTrim$$inlined$withLock$lambda$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (CrashShieldHandler.b(this)) {
                            return;
                        }
                        try {
                            FileLruCache.a(fileLruCache);
                        } catch (Throwable th) {
                            CrashShieldHandler.a(this, th);
                        }
                    }
                });
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
