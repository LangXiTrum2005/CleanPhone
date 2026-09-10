package com.mbridge.msdk.foundation.download.download;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class DownLoadH5SourceListener implements H5DownLoadManager.IOnDownLoadH5Source {
    private static String TAG = "DownLoadH5SourceListener";
    private CopyOnWriteArrayList<H5DownLoadManager.ZipDownloadListener> listeners;
    private ConcurrentMap<String, DownLoadH5SourceListener> mResDownloadingMap;
    private String mUrl;
    private ResourceManager resourceManager;

    public DownLoadH5SourceListener(ConcurrentMap<String, DownLoadH5SourceListener> concurrentMap, ResourceManager resourceManager, H5DownLoadManager.ZipDownloadListener zipDownloadListener, String str) {
        CopyOnWriteArrayList<H5DownLoadManager.ZipDownloadListener> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.listeners = copyOnWriteArrayList;
        this.mResDownloadingMap = concurrentMap;
        this.resourceManager = resourceManager;
        copyOnWriteArrayList.add(zipDownloadListener);
        this.mUrl = str;
    }

    @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.IOnDownLoadH5Source
    public void onFailed(String str) {
        try {
            ConcurrentMap<String, DownLoadH5SourceListener> concurrentMap = this.mResDownloadingMap;
            if (concurrentMap == null) {
                for (H5DownLoadManager.ZipDownloadListener zipDownloadListener : this.listeners) {
                    if (zipDownloadListener != null) {
                        zipDownloadListener.onFailed(this.mUrl, "mResDownloadingMap  is null");
                        this.listeners.remove(zipDownloadListener);
                    }
                }
                return;
            }
            if (concurrentMap.containsKey(this.mUrl)) {
                this.mResDownloadingMap.remove(this.mUrl);
            }
            for (H5DownLoadManager.ZipDownloadListener zipDownloadListener2 : this.listeners) {
                if (zipDownloadListener2 != null) {
                    zipDownloadListener2.onFailed(this.mUrl, str);
                    this.listeners.remove(zipDownloadListener2);
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            try {
                str = e10.getMessage();
            } catch (Throwable th2) {
                q0.b(TAG, th2.getMessage(), th2);
            }
        }
    }

    @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.IOnDownLoadH5Source
    public void onSuccess(String str, byte[] bArr, String str2) {
        String message;
        String str3 = "";
        try {
            ConcurrentMap<String, DownLoadH5SourceListener> concurrentMap = this.mResDownloadingMap;
            if (concurrentMap == null) {
                for (H5DownLoadManager.ZipDownloadListener zipDownloadListener : this.listeners) {
                    if (zipDownloadListener != null) {
                        zipDownloadListener.onFailed(str2, "mResDownloadingMap  is null");
                        this.listeners.remove(zipDownloadListener);
                    }
                }
                return;
            }
            if (concurrentMap.containsKey(str2)) {
                this.mResDownloadingMap.remove(str2);
            }
            if (bArr == null || bArr.length <= 0) {
                message = "response data is error";
            } else {
                String strSaveResFile = this.resourceManager.saveResFile(str2, bArr);
                if (TextUtils.isEmpty(strSaveResFile)) {
                    for (H5DownLoadManager.ZipDownloadListener zipDownloadListener2 : this.listeners) {
                        if (zipDownloadListener2 != null) {
                            zipDownloadListener2.onSuccess(str2, "", false);
                            this.listeners.remove(zipDownloadListener2);
                        }
                    }
                    return;
                }
                message = "data save failed:" + strSaveResFile;
            }
            str3 = message;
            for (H5DownLoadManager.ZipDownloadListener zipDownloadListener3 : this.listeners) {
                if (zipDownloadListener3 != null) {
                    zipDownloadListener3.onFailed(str2, str3);
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            try {
                message = e10.getMessage();
            } catch (Throwable th2) {
                q0.b(TAG, th2.getMessage(), th2);
            }
        }
    }

    public void setZipDownloadListener(H5DownLoadManager.ZipDownloadListener zipDownloadListener) {
        this.listeners.add(zipDownloadListener);
    }

    @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.IOnDownLoadH5Source
    public void onStart() {
    }
}
