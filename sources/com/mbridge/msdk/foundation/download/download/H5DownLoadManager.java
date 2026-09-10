package com.mbridge.msdk.foundation.download.download;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class H5DownLoadManager {
    public static final String SP_ENDING_PAGE_SAVE_TIME = "ending_page_save_time";
    public static final String SP_ENDING_PAGE_SOURCE = "ending_page_source";
    private static final String TAG = "H5DownLoadManager";
    private static volatile H5DownLoadManager sH5Manager;
    private final String DOWN_TYPE = "down_type";
    private final String LOCAL_RID = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;
    private HTMLResourceManager htmlResourceManager;
    private boolean isUseDownloadModule;
    private CopyOnWriteArrayList<String> mResDownloadingList;
    private ConcurrentMap<String, DownLoadH5SourceListener> mResDownloadingMap;
    private ResourceManager resourceManager;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface H5ResDownloadListerInter {
        void onFailed(String str, String str2);

        void onSuccess(String str, String str2, boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface IH5SourceDownloadListener extends H5ResDownloadListerInter {
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface IOnDownLoadH5Source {
        void onFailed(String str);

        void onStart();

        void onSuccess(String str, byte[] bArr, String str2);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface ZipDownloadListener extends H5ResDownloadListerInter {
    }

    private H5DownLoadManager() {
        this.isUseDownloadModule = false;
        try {
            this.resourceManager = ResourceManager.getinstance();
            this.htmlResourceManager = HTMLResourceManager.getInstance();
            this.mResDownloadingList = new CopyOnWriteArrayList<>();
            this.mResDownloadingMap = new ConcurrentHashMap();
            g gVarF = i.b().f(c.n().b());
            if (gVarF != null) {
                this.isUseDownloadModule = gVarF.b(1);
            }
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage(), th2);
        }
    }

    private void downloadHTML(final com.mbridge.msdk.foundation.same.report.metrics.c cVar, final String str, final H5ResDownloadListerInter h5ResDownloadListerInter) {
        try {
            q0.b(TAG, "download url:" + str);
            final e eVar = new e();
            eVar.a("scenes", "1");
            eVar.a("url", str);
            if (cVar != null) {
                eVar.a("resource_type", Integer.valueOf(cVar.q()));
            }
            if (this.mResDownloadingList.contains(str)) {
                return;
            }
            this.mResDownloadingList.add(str);
            DownloadTask.getInstance().runTask(new a() { // from class: com.mbridge.msdk.foundation.download.download.H5DownLoadManager.2
                @Override // com.mbridge.msdk.foundation.same.task.a
                public void runTask() {
                    if (TextUtils.isEmpty(H5DownLoadManager.this.htmlResourceManager.getHtmlContentFromUrl(str))) {
                        DownLoadUtils.getSourceCodeFromNetUrl(str, new IOnDownLoadH5Source() { // from class: com.mbridge.msdk.foundation.download.download.H5DownLoadManager.2.1
                            @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.IOnDownLoadH5Source
                            public void onFailed(String str2) {
                                try {
                                    H5DownLoadManager.this.mResDownloadingList.remove(str);
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    H5ResDownloadListerInter h5ResDownloadListerInter2 = h5ResDownloadListerInter;
                                    if (h5ResDownloadListerInter2 != null) {
                                        h5ResDownloadListerInter2.onFailed(str, str2);
                                    }
                                } catch (Exception e10) {
                                    if (MBridgeConstans.DEBUG) {
                                        e10.printStackTrace();
                                    }
                                    AnonymousClass2 anonymousClass3 = AnonymousClass2.this;
                                    H5ResDownloadListerInter h5ResDownloadListerInter3 = h5ResDownloadListerInter;
                                    if (h5ResDownloadListerInter3 != null) {
                                        h5ResDownloadListerInter3.onFailed(str, str2);
                                    }
                                }
                                AnonymousClass2 anonymousClass4 = AnonymousClass2.this;
                                if (h5ResDownloadListerInter == null) {
                                    eVar.a("result", 3);
                                    AnonymousClass2 anonymousClass5 = AnonymousClass2.this;
                                    cVar.a("m_download_end", eVar);
                                    d.b().b("m_download_end", cVar, null);
                                }
                            }

                            @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.IOnDownLoadH5Source
                            public void onSuccess(String str2, byte[] bArr, String str3) {
                                try {
                                    H5DownLoadManager.this.mResDownloadingList.remove(str3);
                                    if (bArr == null || bArr.length <= 0) {
                                        return;
                                    }
                                    if (H5DownLoadManager.this.htmlResourceManager.saveResHtmlFile(str3, bArr)) {
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        H5ResDownloadListerInter h5ResDownloadListerInter2 = h5ResDownloadListerInter;
                                        if (h5ResDownloadListerInter2 != null) {
                                            h5ResDownloadListerInter2.onSuccess(str3, "", false);
                                            return;
                                        }
                                        eVar.a("result", 3);
                                        AnonymousClass2 anonymousClass3 = AnonymousClass2.this;
                                        cVar.a("m_download_end", eVar);
                                        d.b().b("m_download_end", cVar, null);
                                        return;
                                    }
                                    AnonymousClass2 anonymousClass4 = AnonymousClass2.this;
                                    H5ResDownloadListerInter h5ResDownloadListerInter3 = h5ResDownloadListerInter;
                                    if (h5ResDownloadListerInter3 != null) {
                                        h5ResDownloadListerInter3.onFailed(str3, "save file failed");
                                        return;
                                    }
                                    eVar.a("result", 3);
                                    AnonymousClass2 anonymousClass5 = AnonymousClass2.this;
                                    cVar.a("m_download_end", eVar);
                                    d.b().b("m_download_end", cVar, null);
                                } catch (Exception e10) {
                                    if (MBridgeConstans.DEBUG) {
                                        e10.printStackTrace();
                                    }
                                    AnonymousClass2 anonymousClass6 = AnonymousClass2.this;
                                    H5ResDownloadListerInter h5ResDownloadListerInter4 = h5ResDownloadListerInter;
                                    if (h5ResDownloadListerInter4 != null) {
                                        h5ResDownloadListerInter4.onFailed(str3, e10.getMessage());
                                        return;
                                    }
                                    eVar.a("result", 3);
                                    AnonymousClass2 anonymousClass7 = AnonymousClass2.this;
                                    cVar.a("m_download_end", eVar);
                                    d.b().b("m_download_end", cVar, null);
                                }
                            }

                            @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.IOnDownLoadH5Source
                            public void onStart() {
                            }
                        }, true);
                        eVar.a("cache", 1);
                        cVar.a("m_download_start", eVar);
                        d.b().b("m_download_start", cVar, null);
                        return;
                    }
                    eVar.a("cache", 2);
                    H5DownLoadManager.this.mResDownloadingList.remove(str);
                    H5ResDownloadListerInter h5ResDownloadListerInter2 = h5ResDownloadListerInter;
                    if (h5ResDownloadListerInter2 != null) {
                        h5ResDownloadListerInter2.onSuccess(str, "", true);
                    }
                    cVar.a("m_download_start", eVar);
                    d.b().b("m_download_start", cVar, null);
                }

                @Override // com.mbridge.msdk.foundation.same.task.a
                public void cancelTask() {
                }

                @Override // com.mbridge.msdk.foundation.same.task.a
                public void pauseTask(boolean z10) {
                }
            });
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
            }
        }
    }

    private void downloadHTMLByDownloadModule(final String str, final H5ResDownloadListerInter h5ResDownloadListerInter) {
        if (TextUtils.isEmpty(str)) {
            if (h5ResDownloadListerInter != null) {
                h5ResDownloadListerInter.onFailed("zip url is null", str);
                return;
            }
            return;
        }
        try {
            new URL(str);
            MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str, wi.d.h(SameMD5.getMD5(c1.b(str)), ".html"), 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_HTML)).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).withReadTimeout(30000L).withConnectTimeout(20000L).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML) + "/").withDownloadStateListener(new OnDownloadStateListener() { // from class: com.mbridge.msdk.foundation.download.download.H5DownLoadManager.1
                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onCancelDownload(DownloadMessage downloadMessage) {
                    q0.a(H5DownLoadManager.TAG, "下载取消： ");
                    H5ResDownloadListerInter h5ResDownloadListerInter2 = h5ResDownloadListerInter;
                    if (h5ResDownloadListerInter2 != null) {
                        h5ResDownloadListerInter2.onFailed(str, "task cancel");
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadComplete(DownloadMessage downloadMessage) {
                    q0.a(H5DownLoadManager.TAG, "下载结束： " + downloadMessage.getDownloadUrl() + " " + downloadMessage.getDownloadResourceType() + " " + downloadMessage.getSaveFilePath());
                    H5ResDownloadListerInter h5ResDownloadListerInter2 = h5ResDownloadListerInter;
                    if (h5ResDownloadListerInter2 != null) {
                        h5ResDownloadListerInter2.onSuccess(str, "", false);
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
                    q0.a(H5DownLoadManager.TAG, "下载结束失败： " + downloadError.getException().getMessage());
                    H5ResDownloadListerInter h5ResDownloadListerInter2 = h5ResDownloadListerInter;
                    if (h5ResDownloadListerInter2 != null) {
                        h5ResDownloadListerInter2.onFailed(str, downloadError.getException().getMessage());
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadStart(DownloadMessage downloadMessage) {
                    q0.a(H5DownLoadManager.TAG, "开始下载 html： " + downloadMessage.getDownloadUrl() + " " + downloadMessage.getDownloadResourceType());
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onResponseStart(DownloadMessage downloadMessage) {
                }
            }).build().start();
        } catch (Exception unused) {
            if (h5ResDownloadListerInter != null) {
                h5ResDownloadListerInter.onFailed("zip url is unlawful", str);
            }
        }
    }

    private void downloadZipByDownloadModule(final com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str, final ZipDownloadListener zipDownloadListener) {
        if (TextUtils.isEmpty(str)) {
            if (zipDownloadListener != null) {
                zipDownloadListener.onFailed(str, "zip url is null");
                return;
            }
            return;
        }
        try {
            new URL(str);
            final e eVar = new e();
            eVar.a("scenes", "1");
            eVar.a("url", str);
            if (cVar != null) {
                eVar.a("resource_type", Integer.valueOf(cVar.q()));
            }
            String strB = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_RES);
            String md5 = SameMD5.getMD5(c1.b(str));
            String strH = wi.d.h(strB, "/");
            final String strI = wi.d.i(strB, "/", md5);
            DownloadMessage<?> downloadMessage = new DownloadMessage<>(cVar, str, wi.d.h(md5, ".zip"), 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_ZIP);
            if (cVar != null) {
                downloadMessage.setUseCronetDownload(cVar.r());
            }
            MBDownloadManager.getInstance().download(downloadMessage).withReadTimeout(30000L).withConnectTimeout(20000L).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(strH).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).withDownloadStateListener(new OnDownloadStateListener() { // from class: com.mbridge.msdk.foundation.download.download.H5DownLoadManager.3
                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onCancelDownload(DownloadMessage downloadMessage2) {
                    q0.a(H5DownLoadManager.TAG, "下载取消： " + downloadMessage2.getDownloadUrl() + " " + downloadMessage2.getDownloadResourceType());
                    e eVar2 = eVar;
                    if (eVar2 != null) {
                        eVar2.a("cache", Integer.valueOf(downloadMessage2.isCache() ? 1 : 2));
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = cVar;
                    if (cVar2 != null) {
                        cVar2.a("m_download_start", eVar);
                    }
                    d.b().b("m_download_start", cVar, null);
                    if (TextUtils.isEmpty(ResourceManager.getinstance().getResDirFromCampaign(downloadMessage2.getDownloadUrl()))) {
                        ZipDownloadListener zipDownloadListener2 = zipDownloadListener;
                        if (zipDownloadListener2 != null) {
                            zipDownloadListener2.onFailed(downloadMessage2.getDownloadUrl(), "task cancel");
                            return;
                        }
                        return;
                    }
                    ZipDownloadListener zipDownloadListener3 = zipDownloadListener;
                    if (zipDownloadListener3 != null) {
                        zipDownloadListener3.onSuccess(downloadMessage2.getDownloadUrl(), "", downloadMessage2.isCache());
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadComplete(DownloadMessage downloadMessage2) {
                    q0.a(H5DownLoadManager.TAG, "下载结束，开始解压缩文件： " + downloadMessage2.getDownloadUrl() + " " + downloadMessage2.getDownloadResourceType() + " " + downloadMessage2.getSaveFilePath());
                    try {
                        e eVar2 = eVar;
                        if (eVar2 != null) {
                            eVar2.a("cache", Integer.valueOf(downloadMessage2.isCache() ? 1 : 2));
                        }
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = cVar;
                        if (cVar2 != null) {
                            cVar2.a("m_download_start", eVar);
                        }
                        d.b().b("m_download_start", cVar, null);
                        if (TextUtils.isEmpty(ResourceManager.getinstance().getResDirFromCampaign(downloadMessage2.getDownloadUrl()))) {
                            MBResourceManager.getInstance().unZip(downloadMessage2.getSaveFilePath(), strI);
                        }
                        String str2 = "";
                        try {
                            str2 = (String) downloadMessage2.getExtra("responseHeaders");
                        } catch (Throwable th2) {
                            q0.b(H5DownLoadManager.TAG, th2.getMessage());
                        }
                        q0.a(H5DownLoadManager.TAG, "下载结束，开始解压缩文件，文件解压成功： " + strI);
                        ZipDownloadListener zipDownloadListener2 = zipDownloadListener;
                        if (zipDownloadListener2 != null) {
                            zipDownloadListener2.onSuccess(downloadMessage2.getDownloadUrl(), str2, downloadMessage2.isCache());
                        }
                    } catch (IOException e10) {
                        q0.a(H5DownLoadManager.TAG, "下载结束，开始解压缩文件，文件解压失败： " + e10.getMessage());
                        ZipDownloadListener zipDownloadListener3 = zipDownloadListener;
                        if (zipDownloadListener3 != null) {
                            zipDownloadListener3.onFailed(downloadMessage2.getDownloadUrl(), e10.getMessage());
                        }
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadError(DownloadMessage downloadMessage2, DownloadError downloadError) {
                    q0.a(H5DownLoadManager.TAG, "下载错误： " + downloadMessage2.getDownloadUrl() + " " + downloadMessage2.getDownloadResourceType() + "  " + downloadError.getException().getMessage());
                    e eVar2 = eVar;
                    if (eVar2 != null) {
                        eVar2.a("cache", Integer.valueOf(downloadMessage2.isCache() ? 1 : 2));
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = cVar;
                    if (cVar2 != null) {
                        cVar2.a("m_download_start", eVar);
                    }
                    d.b().b("m_download_start", cVar, null);
                    if (TextUtils.isEmpty(ResourceManager.getinstance().getResDirFromCampaign(downloadMessage2.getDownloadUrl()))) {
                        ZipDownloadListener zipDownloadListener2 = zipDownloadListener;
                        if (zipDownloadListener2 != null) {
                            zipDownloadListener2.onFailed(downloadMessage2.getDownloadUrl(), downloadError.getException().getMessage());
                            return;
                        }
                        return;
                    }
                    ZipDownloadListener zipDownloadListener3 = zipDownloadListener;
                    if (zipDownloadListener3 != null) {
                        zipDownloadListener3.onSuccess(downloadMessage2.getDownloadUrl(), "", downloadMessage2.isCache());
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadStart(DownloadMessage downloadMessage2) {
                    q0.a(H5DownLoadManager.TAG, "开始下载 zip： " + downloadMessage2.getDownloadUrl() + " " + downloadMessage2.getDownloadResourceType());
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onResponseStart(DownloadMessage downloadMessage2) {
                }
            }).build().start();
        } catch (Exception unused) {
            if (zipDownloadListener != null) {
                zipDownloadListener.onFailed(str, "zip url is unlawful");
            }
        }
    }

    private void downloadZipByOldDownloadModule(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str, ZipDownloadListener zipDownloadListener) {
        e eVar = new e();
        eVar.a("scenes", "1");
        eVar.a("url", str);
        if (cVar != null) {
            eVar.a("resource_type", Integer.valueOf(cVar.q()));
        }
        try {
            if (TextUtils.isEmpty(this.resourceManager.getResDirFromCampaign(str))) {
                eVar.a("cache", 2);
                if (this.mResDownloadingMap.containsKey(str)) {
                    DownLoadH5SourceListener downLoadH5SourceListener = this.mResDownloadingMap.get(str);
                    if (downLoadH5SourceListener != null) {
                        downLoadH5SourceListener.setZipDownloadListener(zipDownloadListener);
                    }
                    if (cVar == null || cVar.G()) {
                        return;
                    }
                    cVar.a("m_download_start", eVar);
                    d.b().b("m_download_start", cVar, null);
                    return;
                }
                DownLoadH5SourceListener downLoadH5SourceListener2 = new DownLoadH5SourceListener(this.mResDownloadingMap, this.resourceManager, zipDownloadListener, str);
                this.mResDownloadingMap.put(str, downLoadH5SourceListener2);
                DownLoadUtils.getSourceCodeFromNetUrl(str, downLoadH5SourceListener2, true);
            } else {
                eVar.a("cache", 1);
                if (zipDownloadListener != null) {
                    zipDownloadListener.onSuccess(str, "", true);
                }
            }
            if (cVar == null || cVar.G()) {
                return;
            }
            cVar.a("m_download_start", eVar);
            d.b().b("m_download_start", cVar, null);
        } catch (Exception e10) {
            if (zipDownloadListener != null) {
                zipDownloadListener.onFailed(str, "downloadzip failed");
            }
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    private String getHtmlAddress(String str) {
        HTMLResourceManager hTMLResourceManager = this.htmlResourceManager;
        return hTMLResourceManager != null ? hTMLResourceManager.getHtmlPathFromUrl(str) : str;
    }

    public static H5DownLoadManager getInstance() {
        if (sH5Manager == null) {
            synchronized (H5DownLoadManager.class) {
                try {
                    if (sH5Manager == null) {
                        sH5Manager = new H5DownLoadManager();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return sH5Manager;
    }

    private long getPreSaveTimeFromSp(String str) {
        try {
            Object objA = y0.a(c.n().d(), SP_ENDING_PAGE_SAVE_TIME + str, 0L);
            if (objA != null && (objA instanceof Long)) {
                return ((Long) objA).longValue();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return 0L;
    }

    private void saveSourceContent(String str, String str2) {
        try {
            q0.c(TAG, "sourceContent:" + str);
            y0.b(c.n().d(), SP_ENDING_PAGE_SOURCE + str2, str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void updateEndingPageSaveTime(String str) {
        try {
            y0.b(c.n().d(), SP_ENDING_PAGE_SAVE_TIME + str, Long.valueOf(System.currentTimeMillis()));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void download(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
        download(cVar, str, null);
    }

    public void downloadH5Res(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
        downloadH5Res(cVar, str, null);
    }

    public void downloadZip(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str, ZipDownloadListener zipDownloadListener) {
        if (this.isUseDownloadModule) {
            downloadZipByDownloadModule(cVar, str, zipDownloadListener);
        } else {
            downloadZipByOldDownloadModule(cVar, str, zipDownloadListener);
        }
    }

    public String getH5ResAddress(String str) {
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                Uri uri = Uri.parse(str);
                String path = uri.getPath();
                if (!TextUtils.isEmpty(path) && TextUtils.isEmpty(uri.getQueryParameter("urlDebug"))) {
                    return path.toLowerCase().endsWith(".zip") ? getResAddress(str) : getHtmlAddress(str);
                }
            }
            return str;
        } catch (Exception e10) {
            e10.printStackTrace();
            return str;
        }
    }

    public String getResAddress(String str) {
        ResourceManager resourceManager = this.resourceManager;
        if (resourceManager != null) {
            return resourceManager.getResDirFromCampaign(str);
        }
        return null;
    }

    public String getSourceContentFromSp(String str) {
        try {
            Object objA = y0.a(c.n().d(), SP_ENDING_PAGE_SOURCE + str, "");
            if (objA == null || !(objA instanceof String)) {
                return null;
            }
            String str2 = (String) objA;
            if (a1.b(str2)) {
                return str2;
            }
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public void download(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str, H5ResDownloadListerInter h5ResDownloadListerInter) {
        if (this.isUseDownloadModule) {
            downloadHTMLByDownloadModule(str, h5ResDownloadListerInter);
        } else {
            downloadHTML(cVar, str, h5ResDownloadListerInter);
        }
    }

    public void downloadH5Res(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str, H5ResDownloadListerInter h5ResDownloadListerInter) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = d.b().a(cVar);
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                String path = Uri.parse(str).getPath();
                if (!TextUtils.isEmpty(path)) {
                    if (path.toLowerCase().endsWith(".zip")) {
                        downloadZip(cVarA, str, (ZipDownloadListener) h5ResDownloadListerInter);
                        return;
                    } else {
                        download(cVarA, str, h5ResDownloadListerInter);
                        return;
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (h5ResDownloadListerInter != null) {
            h5ResDownloadListerInter.onFailed(str, "The URL does not contain a path ");
        }
    }

    public void downloadH5Res(String str, H5ResDownloadListerInter h5ResDownloadListerInter) {
        downloadH5Res(new com.mbridge.msdk.foundation.same.report.metrics.c(), str, h5ResDownloadListerInter);
    }
}
