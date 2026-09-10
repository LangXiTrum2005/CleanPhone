package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.scheduler.RequirementsWatcher;
import com.google.android.exoplayer2.upstream.cache.CacheWriter;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements CacheWriter.ProgressListener, RequirementsWatcher.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f18299a;

    public /* synthetic */ e(Object obj) {
        this.f18299a = obj;
    }

    public void a(long j, long j2, long j3) {
        Downloader.ProgressListener progressListener = ((ProgressiveDownloader) this.f18299a).f18296e;
        if (progressListener == null) {
            return;
        }
        float f = (j == -1 || j == 0) ? -1.0f : (j2 * 100.0f) / j;
        DownloadManager.Task task = (DownloadManager.Task) progressListener;
        task.Z.f18280a = j2;
        task.Z.f18281b = f;
        if (j != task.j0) {
            task.j0 = j;
            DownloadManager.InternalHandler internalHandler = task.g0;
            if (internalHandler != null) {
                internalHandler.obtainMessage(10, (int) (j >> 32), (int) j, task).sendToTarget();
            }
        }
    }
}
