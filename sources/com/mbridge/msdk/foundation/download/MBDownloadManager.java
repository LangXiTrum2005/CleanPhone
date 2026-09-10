package com.mbridge.msdk.foundation.download;

import android.content.Context;
import com.mbridge.msdk.foundation.download.core.DownloadRequestBuilder;
import com.mbridge.msdk.foundation.download.core.DownloadRequestQueue;
import com.mbridge.msdk.foundation.download.core.ExecutorManager;
import com.mbridge.msdk.foundation.download.core.GlobalComponent;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.download.resource.ResourceConfig;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class MBDownloadManager {
    private boolean initialize;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class ClassHolder {
        private static final MBDownloadManager MB_DOWNLOAD_MANAGER = new MBDownloadManager();

        private ClassHolder() {
        }
    }

    public static MBDownloadManager getInstance() {
        return ClassHolder.MB_DOWNLOAD_MANAGER;
    }

    public synchronized void cancel(String str) {
        DownloadRequestQueue.getInstance().cancel(str);
    }

    public synchronized void cancelAll() {
        DownloadRequestQueue.getInstance().cancelAll();
    }

    public synchronized DownloadRequestBuilder download(DownloadMessage<?> downloadMessage) {
        return new DownloadRequestBuilder(downloadMessage);
    }

    public synchronized String getDownloadId(String str) {
        return MBResourceManager.getInstance().getDownloadId(str);
    }

    public synchronized DownloadStatus getStatus(String str) {
        return DownloadRequestQueue.getInstance().getStatus(str);
    }

    public void initialize(Context context, MBDownloadConfig mBDownloadConfig, ResourceConfig resourceConfig) {
        if (this.initialize) {
            return;
        }
        GlobalComponent.getInstance().initialize(context, mBDownloadConfig);
        DownloadRequestQueue.getInstance().initialize();
        MBResourceManager.getInstance().executeResourceStrategy(resourceConfig);
        this.initialize = true;
    }

    public boolean isInitialize() {
        return this.initialize;
    }

    public synchronized void shutDown() {
        ExecutorManager.shutDown();
    }

    public synchronized void updateZipResource(String str, String str2, long j10) {
        GlobalComponent.getInstance().getDatabaseHelper().updateUnzipResource(str, str2, j10);
    }

    private MBDownloadManager() {
        this.initialize = false;
    }
}
