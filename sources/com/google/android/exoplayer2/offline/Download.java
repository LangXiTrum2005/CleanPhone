package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.util.Assertions;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
public final class Download {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DownloadRequest f18255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18257c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18258e;
    public final int f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DownloadProgress f18259h;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FailureReason {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public Download(DownloadRequest downloadRequest, int i2, long j, long j2, int i3) {
        this(downloadRequest, i2, j, j2, -1L, i3, 0, new DownloadProgress());
    }

    public Download(DownloadRequest downloadRequest, int i2, long j, long j2, long j3, int i3, int i4, DownloadProgress downloadProgress) {
        downloadProgress.getClass();
        boolean z2 = false;
        Assertions.b((i4 == 0) == (i2 != 4));
        if (i3 != 0) {
            if (i2 != 2 && i2 != 0) {
                z2 = true;
            }
            Assertions.b(z2);
        }
        this.f18255a = downloadRequest;
        this.f18256b = i2;
        this.f18257c = j;
        this.d = j2;
        this.f18258e = j3;
        this.f = i3;
        this.g = i4;
        this.f18259h = downloadProgress;
    }
}
