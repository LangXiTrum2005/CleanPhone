package com.kochava.core.downloader.internal;

import android.graphics.Bitmap;
import com.kochava.core.job.internal.Job;
import com.kochava.core.network.image.internal.NetworkImageRequest;
import com.kochava.core.network.image.internal.NetworkImageResponse;
import com.kochava.core.network.image.internal.NetworkImageValidateListener;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.smartdigimkt.u2.m;

/* JADX INFO: loaded from: classes5.dex */
public final class ImageDownloadJob extends Job implements ImageDownloadJobApi, NetworkImageValidateListener, Runnable {
    public Bitmap n0;

    @Override // com.kochava.core.job.internal.Job
    public final void p() {
        NetworkImageResponse networkImageResponseI;
        long j;
        NetworkImageRequest networkImageRequest = new NetworkImageRequest(null, null, null);
        int i2 = this.j0;
        synchronized (networkImageRequest) {
            networkImageResponseI = networkImageRequest.i(i2, this);
        }
        l();
        if (networkImageResponseI.f28045b) {
            synchronized (this) {
                try {
                    Bitmap bitmap = networkImageResponseI.f;
                    if (bitmap == null || !networkImageResponseI.f28045b) {
                        throw new IllegalStateException("Data not accessible on failure.");
                    }
                    this.n0 = bitmap;
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (!networkImageResponseI.f28046c) {
            q();
            throw null;
        }
        int iMax = Math.max(1, this.j0);
        if (iMax == 1) {
            j = 2000;
        } else if (iMax == 2) {
            j = m.D0;
        } else if (iMax != 3) {
            j = iMax != 4 ? 300000L : ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        } else {
            j = 10000;
        }
        r(j);
        throw null;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        throw null;
    }

    @Override // com.kochava.core.job.internal.Job
    public final long t() {
        return 0L;
    }

    @Override // com.kochava.core.job.internal.Job
    public final boolean v() {
        return this.n0 == null;
    }
}
