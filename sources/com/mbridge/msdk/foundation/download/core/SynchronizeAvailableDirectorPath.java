package com.mbridge.msdk.foundation.download.core;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.DownloadResponse;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class SynchronizeAvailableDirectorPath implements IDownloadTask {
    private int cacheDirectorPathType;
    private String cacheDirectoryPath;
    private String cacheDirectoryPathExternal;
    private String cacheDirectoryPathInternal;
    private DownloadRequest downloadRequest;

    public SynchronizeAvailableDirectorPath(DownloadRequest downloadRequest) {
        this.downloadRequest = downloadRequest;
    }

    public static IDownloadTask create(DownloadRequest downloadRequest) {
        return new SynchronizeAvailableDirectorPath(downloadRequest);
    }

    @Override // com.mbridge.msdk.foundation.download.core.IDownloadTask
    public DownloadResponse run() {
        this.cacheDirectoryPathExternal = this.downloadRequest.getDirectoryPathExternal();
        String directoryPathInternal = this.downloadRequest.getDirectoryPathInternal();
        this.cacheDirectoryPathInternal = directoryPathInternal;
        if (TextUtils.isEmpty(directoryPathInternal)) {
            throw new RuntimeException("必须指定 cacheDirectoryPathInternal");
        }
        try {
            try {
                if (TextUtils.isEmpty(this.cacheDirectoryPathExternal)) {
                    this.cacheDirectoryPath = this.cacheDirectoryPathInternal;
                    this.cacheDirectorPathType = 0;
                } else {
                    this.cacheDirectoryPath = this.cacheDirectoryPathInternal;
                    this.cacheDirectorPathType = 0;
                }
                this.downloadRequest.setCacheDirectoryPath(this.cacheDirectoryPath);
                this.downloadRequest.setCacheDirectorPathType(this.cacheDirectorPathType);
                return null;
            } catch (Exception unused) {
                String str = this.cacheDirectoryPathInternal;
                this.cacheDirectoryPath = str;
                this.cacheDirectorPathType = 0;
                this.downloadRequest.setCacheDirectoryPath(str);
                this.downloadRequest.setCacheDirectorPathType(this.cacheDirectorPathType);
                return null;
            }
        } catch (Throwable th2) {
            this.downloadRequest.setCacheDirectoryPath(this.cacheDirectoryPath);
            this.downloadRequest.setCacheDirectorPathType(this.cacheDirectorPathType);
            throw th2;
        }
    }
}
