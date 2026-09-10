package com.vungle.ads.internal.downloader;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.datastore.preferences.protobuf.a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.d9;
import com.smartdigimkt.o1.b;
import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.AssetRequestError;
import com.vungle.ads.AssetWriteError;
import com.vungle.ads.InvalidAssetUrlError;
import com.vungle.ads.NoSpaceError;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.task.PriorityRunnable;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import java.io.File;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.RealResponseBody;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
import okio.RealBufferedSink;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 )2\u00020\u0001:\u0002)*B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J$\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\"\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0002J\u001c\u0010$\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010%\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\"\u0010&\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020(2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/vungle/ads/internal/downloader/AssetDownloader;", "Lcom/vungle/ads/internal/downloader/Downloader;", "downloadExecutor", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "(Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;Lcom/vungle/ads/internal/util/PathProvider;)V", "okHttpClient", "Lokhttp3/OkHttpClient;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "okHttpClient$delegate", "Lkotlin/Lazy;", "transitioning", "", "Lcom/vungle/ads/internal/downloader/DownloadRequest;", b.P3, "", "request", "cancelAll", "checkSpaceAvailable", "", "downloadRequest", "decodeGzipIfNeeded", "Lokhttp3/ResponseBody;", "networkResponse", "Lokhttp3/Response;", "deliverError", "downloadListener", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener;", "downloadError", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$DownloadError;", "deliverSuccess", d9.h.f24719b, "Ljava/io/File;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, NativeAdPresenter.DOWNLOAD, "launchRequest", "onProgressChanged", "progress", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$Progress;", "Companion", "OkHttpSingleton", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AssetDownloader implements Downloader {
    private static final String CONTENT_ENCODING = "Content-Encoding";
    private static final String CONTENT_TYPE = "Content-Type";
    private static final int DOWNLOAD_CHUNK_SIZE = 2048;
    private static final String GZIP = "gzip";
    private static final int MAX_PERCENT = 100;
    private static final int MINIMUM_SPACE_REQUIRED_MB = 20971520;
    private static final int PROGRESS_STEP = 1;
    private static final String TAG = "AssetDownloader";
    private final VungleThreadPoolExecutor downloadExecutor;

    /* JADX INFO: renamed from: okHttpClient$delegate, reason: from kotlin metadata */
    private final Lazy okHttpClient;
    private final PathProvider pathProvider;
    private final List<DownloadRequest> transitioning;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/vungle/ads/internal/downloader/AssetDownloader$OkHttpSingleton;", "", "()V", "client", "Lokhttp3/OkHttpClient;", "createOkHttpClient", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class OkHttpSingleton {
        public static final OkHttpSingleton INSTANCE = new OkHttpSingleton();
        private static OkHttpClient client;

        private OkHttpSingleton() {
        }

        public final OkHttpClient createOkHttpClient(PathProvider pathProvider) {
            Intrinsics.f(pathProvider, "pathProvider");
            OkHttpClient okHttpClient = client;
            if (okHttpClient != null) {
                return okHttpClient;
            }
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            OkHttpClient.Builder builderFollowSslRedirects = builder.readTimeout(60L, timeUnit).connectTimeout(60L, timeUnit).cache(null).followRedirects(true).followSslRedirects(true);
            ConfigManager configManager = ConfigManager.INSTANCE;
            if (configManager.isCleverCacheEnabled()) {
                long cleverCacheDiskSize = configManager.getCleverCacheDiskSize();
                int cleverCacheDiskPercentage = configManager.getCleverCacheDiskPercentage();
                String absolutePath = pathProvider.getCleverCacheDir().getAbsolutePath();
                Intrinsics.e(absolutePath, "pathProvider.getCleverCacheDir().absolutePath");
                long jMin = Math.min(cleverCacheDiskSize, (pathProvider.getAvailableBytes(absolutePath) * ((long) cleverCacheDiskPercentage)) / ((long) 100));
                if (jMin > 0) {
                    builderFollowSslRedirects.cache(new Cache(pathProvider.getCleverCacheDir(), jMin));
                } else {
                    Logger.INSTANCE.w("OkHttpClientWrapper", "cache disk capacity size <=0, no clever cache active.");
                }
            }
            OkHttpClient okHttpClientBuild = builderFollowSslRedirects.build();
            client = okHttpClientBuild;
            return okHttpClientBuild;
        }
    }

    public AssetDownloader(VungleThreadPoolExecutor downloadExecutor, PathProvider pathProvider) {
        Intrinsics.f(downloadExecutor, "downloadExecutor");
        Intrinsics.f(pathProvider, "pathProvider");
        this.downloadExecutor = downloadExecutor;
        this.pathProvider = pathProvider;
        this.okHttpClient = LazyKt.b(new Function0<OkHttpClient>() { // from class: com.vungle.ads.internal.downloader.AssetDownloader$okHttpClient$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final OkHttpClient invoke() {
                return AssetDownloader.OkHttpSingleton.INSTANCE.createOkHttpClient(this.this$0.pathProvider);
            }
        });
        this.transitioning = new ArrayList();
    }

    private final boolean checkSpaceAvailable(DownloadRequest downloadRequest) {
        PathProvider pathProvider = this.pathProvider;
        String absolutePath = pathProvider.getVungleDir().getAbsolutePath();
        Intrinsics.e(absolutePath, "pathProvider.getVungleDir().absolutePath");
        long availableBytes = pathProvider.getAvailableBytes(absolutePath);
        if (availableBytes >= ServiceProvider.HTTP_CACHE_DISK_SIZE) {
            return true;
        }
        new NoSpaceError(a.i(availableBytes, "Insufficient space ")).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        return false;
    }

    private final ResponseBody decodeGzipIfNeeded(Response networkResponse) {
        ResponseBody responseBodyBody = networkResponse.body();
        if (!"gzip".equalsIgnoreCase(Response.header$default(networkResponse, CONTENT_ENCODING, null, 2, null)) || responseBodyBody == null) {
            return responseBodyBody;
        }
        return new RealResponseBody(Response.header$default(networkResponse, "Content-Type", null, 2, null), -1L, Okio.d(new GzipSource(responseBodyBody.getDelegateSource())));
    }

    private final void deliverError(DownloadRequest downloadRequest, AssetDownloadListener downloadListener, AssetDownloadListener.DownloadError downloadError) {
        if (downloadListener != null) {
            downloadListener.onError(downloadError, downloadRequest);
        }
    }

    private final void deliverSuccess(File file, DownloadRequest downloadRequest, AssetDownloadListener listener) {
        Logger.INSTANCE.d(TAG, "On success " + downloadRequest);
        if (listener != null) {
            listener.onSuccess(file, downloadRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: download$lambda-0, reason: not valid java name */
    public static final void m3208download$lambda0(DownloadRequest downloadRequest, AssetDownloader this$0, AssetDownloadListener assetDownloadListener) {
        Intrinsics.f(this$0, "this$0");
        this$0.deliverError(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new OutOfMemory("Failed to execute download request: " + downloadRequest.getAsset().getServerPath()), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getINTERNAL_ERROR()));
    }

    private final OkHttpClient getOkHttpClient() {
        return (OkHttpClient) this.okHttpClient.getX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:102:0x0263 A[Catch: all -> 0x020b, Exception -> 0x0214, TRY_ENTER, TRY_LEAVE, TryCatch #24 {all -> 0x020b, blocks: (B:81:0x01fe, B:96:0x023a, B:102:0x0263), top: B:281:0x01fe }] */
    /* JADX WARN: Code duplicated, block: B:104:0x026c A[Catch: Exception -> 0x0214, all -> 0x02b1, TRY_ENTER, TryCatch #11 {all -> 0x02b1, blocks: (B:92:0x022e, B:94:0x0234, B:98:0x0249, B:100:0x0255, B:105:0x0271, B:109:0x027b, B:111:0x027f, B:104:0x026c), top: B:272:0x022e }] */
    /* JADX WARN: Code duplicated, block: B:124:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:127:0x02c4 A[Catch: all -> 0x02a3, Exception -> 0x02ae, TryCatch #36 {Exception -> 0x02ae, all -> 0x02a3, blocks: (B:113:0x0286, B:127:0x02c4, B:129:0x02cc, B:131:0x02d8, B:133:0x02f0, B:134:0x02f7, B:140:0x030c, B:141:0x0338, B:145:0x0348), top: B:289:0x0286 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:131:0x02d8 A[Catch: all -> 0x02a3, Exception -> 0x02ae, TryCatch #36 {Exception -> 0x02ae, all -> 0x02a3, blocks: (B:113:0x0286, B:127:0x02c4, B:129:0x02cc, B:131:0x02d8, B:133:0x02f0, B:134:0x02f7, B:140:0x030c, B:141:0x0338, B:145:0x0348), top: B:289:0x0286 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02f0 A[Catch: all -> 0x02a3, Exception -> 0x02ae, TryCatch #36 {Exception -> 0x02ae, all -> 0x02a3, blocks: (B:113:0x0286, B:127:0x02c4, B:129:0x02cc, B:131:0x02d8, B:133:0x02f0, B:134:0x02f7, B:140:0x030c, B:141:0x0338, B:145:0x0348), top: B:289:0x0286 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0348 A[Catch: all -> 0x02a3, Exception -> 0x02ae, TRY_ENTER, TRY_LEAVE, TryCatch #36 {Exception -> 0x02ae, all -> 0x02a3, blocks: (B:113:0x0286, B:127:0x02c4, B:129:0x02cc, B:131:0x02d8, B:133:0x02f0, B:134:0x02f7, B:140:0x030c, B:141:0x0338, B:145:0x0348), top: B:289:0x0286 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:163:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:198:0x043a  */
    /* JADX WARN: Code duplicated, block: B:219:0x0496 A[Catch: all -> 0x04c3, TRY_LEAVE, TryCatch #19 {all -> 0x04c3, blocks: (B:217:0x0489, B:219:0x0496), top: B:279:0x0489 }] */
    /* JADX WARN: Code duplicated, block: B:226:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:229:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:230:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:232:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:236:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:240:0x051c  */
    /* JADX WARN: Code duplicated, block: B:245:0x052c  */
    /* JADX WARN: Code duplicated, block: B:246:0x053f  */
    /* JADX WARN: Code duplicated, block: B:249:0x0545  */
    /* JADX WARN: Code duplicated, block: B:250:0x054a  */
    /* JADX WARN: Code duplicated, block: B:252:0x054d  */
    /* JADX WARN: Code duplicated, block: B:256:0x0558  */
    /* JADX WARN: Code duplicated, block: B:259:0x0584  */
    /* JADX WARN: Code duplicated, block: B:265:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:272:0x022e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x01c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x0243 A[EDGE_INSN: B:310:0x0243->B:97:0x0243 BREAK  A[LOOP:0: B:79:0x01fa->B:135:0x02fb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x030c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x023a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x02f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x015a A[Catch: all -> 0x0424, Exception -> 0x042d, TRY_LEAVE, TryCatch #5 {Exception -> 0x042d, blocks: (B:38:0x0154, B:40:0x015a), top: B:267:0x0154 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0160  */
    /* JADX WARN: Code duplicated, block: B:59:0x019e  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a8 A[Catch: all -> 0x0175, Exception -> 0x017f, TRY_ENTER, TRY_LEAVE, TryCatch #33 {Exception -> 0x017f, all -> 0x0175, blocks: (B:45:0x0168, B:62:0x01a8), top: B:294:0x0168 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x0223  */
    /* JADX WARN: Code duplicated, block: B:94:0x0234 A[Catch: Exception -> 0x0214, all -> 0x02b1, TRY_LEAVE, TryCatch #11 {all -> 0x02b1, blocks: (B:92:0x022e, B:94:0x0234, B:98:0x0249, B:100:0x0255, B:105:0x0271, B:109:0x027b, B:111:0x027f, B:104:0x026c), top: B:272:0x022e }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0249 A[Catch: Exception -> 0x0214, all -> 0x02b1, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x02b1, blocks: (B:92:0x022e, B:94:0x0234, B:98:0x0249, B:100:0x0255, B:105:0x0271, B:109:0x027b, B:111:0x027f, B:104:0x026c), top: B:272:0x022e }] */
    /* JADX WARN: Instruction removed from duplicated block: B:161:0x03a0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:245:0x052c, please report this as an issue */
    public final void launchRequest(DownloadRequest downloadRequest, AssetDownloadListener downloadListener) throws Throwable {
        RealBufferedSink realBufferedSinkC;
        Call callNewCall;
        Response responseExecute;
        BufferedSource bufferedSourceSource;
        ResponseBody responseBodyBody;
        int status;
        AssetDownloadListener.Progress.ProgressStatus.Companion companion;
        ResponseBody responseBodyBody2;
        Logger.Companion companion2;
        Call call;
        AssetDownloadListener.Progress.ProgressStatus.Companion companion3;
        ResponseBody responseBodyBody3;
        int status2;
        ResponseBody responseBodyBody4;
        Call call2;
        ResponseBody responseBodyDecodeGzipIfNeeded;
        long jContentLength;
        int i2;
        long j;
        long j2;
        int status3;
        AssetDownloadListener.Progress.ProgressStatus.Companion companion4;
        Logger.Companion companion5;
        int status4;
        ResponseBody responseBodyBody5;
        Long rangeEnd;
        long rangeStart;
        long j3;
        AssetDownloadListener.Progress.ProgressStatus.Companion companion6;
        String str = "On cancel ";
        String str2 = "download status: ";
        AdAsset asset = downloadRequest.getAsset();
        Logger.Companion companion7 = Logger.INSTANCE;
        companion7.d(TAG, "launch request in thread: " + Thread.currentThread().getId() + " request: " + asset.getServerPath());
        if (downloadRequest.isCancelled()) {
            companion7.d(TAG, "Request " + asset.getServerPath() + " is cancelled before starting");
            new AssetDownloadListener.Progress().setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED());
            return;
        }
        AssetDownloadListener.Progress progress = new AssetDownloadListener.Progress();
        progress.setTimestampDownloadStart(System.currentTimeMillis());
        String serverPath = asset.getServerPath();
        String localPath = asset.getLocalPath();
        int iCode = -1;
        if (serverPath.length() == 0 || !FileUtility.INSTANCE.isValidUrl(serverPath)) {
            deliverError(downloadRequest, downloadListener, new AssetDownloadListener.DownloadError(-1, new InvalidAssetUrlError("invalid url: ".concat(serverPath)).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logError$vungle_ads_release(), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getINTERNAL_ERROR()));
            return;
        }
        if (localPath.length() == 0) {
            deliverError(downloadRequest, downloadListener, new AssetDownloadListener.DownloadError(-1, new AssetWriteError("invalid path: ".concat(localPath)).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logError$vungle_ads_release(), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getFILE_NOT_FOUND_ERROR()));
            return;
        }
        int i3 = 1;
        String str3 = null;
        byte b2 = 0;
        if (!checkSpaceAvailable(downloadRequest)) {
            deliverError(downloadRequest, downloadListener, new AssetDownloadListener.DownloadError(-1, new NoSpaceError(str3, i3, b2 == true ? 1 : 0).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logError$vungle_ads_release(), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getDISK_ERROR()));
            return;
        }
        File file = new File(localPath);
        if (downloadListener != null) {
            downloadListener.onStart(downloadRequest);
        }
        try {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                callNewCall = getOkHttpClient().newCall(new Request.Builder().url(serverPath).build());
                responseExecute = callNewCall.execute();
                iCode = responseExecute.code();
                if (responseExecute.isSuccessful()) {
                    call2 = callNewCall;
                    file = file;
                    responseExecute = responseExecute;
                    str2 = "download status: ";
                    str = "On cancel ";
                    throw new Downloader.RequestException(responseExecute.message());
                }
                if (responseExecute.cacheResponse() != null) {
                    call2 = callNewCall;
                    AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.CACHED_ASSETS_USED), downloadRequest.getLogEntry(), serverPath);
                } else {
                    call2 = callNewCall;
                }
                responseBodyDecodeGzipIfNeeded = decodeGzipIfNeeded(responseExecute);
                if (responseBodyDecodeGzipIfNeeded != null) {
                    bufferedSourceSource = responseBodyDecodeGzipIfNeeded.getDelegateSource();
                } else {
                    bufferedSourceSource = null;
                }
                companion7.d(TAG, "Start download from url: ".concat(serverPath));
                realBufferedSinkC = Okio.c(Okio.g(file));
                file = file;
                if (responseBodyDecodeGzipIfNeeded != null) {
                    jContentLength = responseBodyDecodeGzipIfNeeded.getContentLength();
                } else {
                    jContentLength = 0;
                }
                progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getSTARTED());
                progress.setSizeBytes(jContentLength);
                progress.setReadBytes(0L);
                i2 = 0;
                progress.setProgressPercent(0);
                asset.setContentLength(jContentLength);
                onProgressChanged(downloadRequest, progress, downloadListener);
                j = 0;
                while (true) {
                    if (bufferedSourceSource != null) {
                        j2 = bufferedSourceSource.read(realBufferedSinkC.f45155Y, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH);
                    } else {
                        j2 = -1;
                    }
                    if (j2 > 0) {
                        break;
                        break;
                    }
                    if (file.exists()) {
                        new AssetWriteError("Asset save error " + serverPath).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                        throw new Downloader.RequestException("File is not existing");
                    }
                    if (downloadRequest.isCancelled()) {
                        progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED());
                        break;
                    }
                    progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getIN_PROGRESS());
                    realBufferedSinkC.emit();
                    realBufferedSinkC.flush();
                    j += j2;
                    progress.setReadBytes(j);
                    rangeEnd = asset.getRangeEnd();
                    if (rangeEnd != null) {
                        rangeStart = rangeEnd.longValue();
                    } else {
                        rangeStart = asset.getRangeStart();
                    }
                    j3 = jContentLength;
                    long j4 = rangeStart;
                    if (asset.isWaitingForDownload()) {
                        asset = asset;
                        responseExecute = responseExecute;
                    } else {
                        asset = asset;
                        responseExecute = responseExecute;
                    }
                    if (j3 > 0) {
                        i2 = (int) ((((long) 100) * j) / j3);
                    } else {
                        i2 = i2;
                    }
                    while (progress.getProgressPercent() + 1 <= Math.min(i2, 100)) {
                        companion6 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                        progress.setStatus(companion6.getIN_PROGRESS());
                        progress.setProgressPercent(progress.getProgressPercent() + 1);
                        if (progress.getProgressPercent() >= 100) {
                            progress.setStatus(companion6.getDONE());
                        }
                        onProgressChanged(downloadRequest, progress, downloadListener);
                    }
                    asset = asset;
                    responseExecute = responseExecute;
                    jContentLength = j3;
                    responseExecute = responseExecute;
                }
                asset = asset;
                responseExecute = responseExecute;
                realBufferedSinkC.flush();
                status3 = progress.getStatus();
                companion4 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                if (status3 == companion4.getIN_PROGRESS()) {
                    progress.setStatus(companion4.getDONE());
                    onProgressChanged(downloadRequest, progress, downloadListener);
                }
                if (responseExecute.body() != null) {
                    responseBodyBody5.close();
                }
                call2.cancel();
                FileUtility fileUtility = FileUtility.INSTANCE;
                fileUtility.closeQuietly(realBufferedSinkC);
                fileUtility.closeQuietly(bufferedSourceSource);
                companion5 = Logger.INSTANCE;
                companion5.d(TAG, "download status: " + progress.getStatus());
                status4 = progress.getStatus();
                if (status4 == companion4.getERROR()) {
                    if (status4 == companion4.getCANCELLED()) {
                        deliverSuccess(file, downloadRequest, downloadListener);
                        return;
                    }
                    companion5.d(TAG, "On cancel " + downloadRequest);
                    onProgressChanged(downloadRequest, progress, downloadListener);
                    return;
                }
                deliverError(downloadRequest, downloadListener, null);
                return;
                companion2 = Logger.INSTANCE;
                companion2.e(TAG, String.valueOf(e));
                if (e instanceof ProtocolException) {
                    StringBuilder sb = new StringBuilder();
                    call = callNewCall;
                    sb.append("Failed to load asset: ");
                    sb.append(asset.getServerPath());
                    new AssetRequestError(sb.toString()).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                } else {
                    call = callNewCall;
                }
                companion3 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                progress.setStatus(companion3.getERROR());
                AssetDownloadListener.DownloadError downloadError = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                if (responseExecute != null) {
                    responseBodyBody3 = responseExecute.body();
                } else {
                    responseBodyBody3 = null;
                }
                if (responseBodyBody3 != null) {
                    responseBodyBody4.close();
                }
                if (call != null) {
                    call.cancel();
                }
                FileUtility fileUtility2 = FileUtility.INSTANCE;
                fileUtility2.closeQuietly(realBufferedSinkC);
                fileUtility2.closeQuietly(bufferedSourceSource);
                companion2.d(TAG, str2 + progress.getStatus());
                status2 = progress.getStatus();
                if (status2 == companion3.getERROR()) {
                    if (status2 == companion3.getCANCELLED()) {
                        deliverSuccess(file, downloadRequest, downloadListener);
                        return;
                    }
                    companion2.d(TAG, str + downloadRequest);
                    onProgressChanged(downloadRequest, progress, downloadListener);
                    return;
                }
                deliverError(downloadRequest, downloadListener, downloadError);
                return;
            }
            try {
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                callNewCall = getOkHttpClient().newCall(new Request.Builder().url(serverPath).build());
                try {
                    responseExecute = callNewCall.execute();
                    try {
                        try {
                            iCode = responseExecute.code();
                            try {
                                if (responseExecute.isSuccessful()) {
                                    call2 = callNewCall;
                                    file = file;
                                    responseExecute = responseExecute;
                                    str2 = "download status: ";
                                    str = "On cancel ";
                                    try {
                                        throw new Downloader.RequestException(responseExecute.message());
                                    } catch (Exception e2) {
                                        e = e2;
                                        callNewCall = call2;
                                        realBufferedSinkC = null;
                                        bufferedSourceSource = null;
                                        companion2 = Logger.INSTANCE;
                                        companion2.e(TAG, String.valueOf(e));
                                        if (e instanceof ProtocolException) {
                                            StringBuilder sb2 = new StringBuilder();
                                            call = callNewCall;
                                            sb2.append("Failed to load asset: ");
                                            sb2.append(asset.getServerPath());
                                            new AssetRequestError(sb2.toString()).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                                        } else {
                                            call = callNewCall;
                                        }
                                        companion3 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                        progress.setStatus(companion3.getERROR());
                                        AssetDownloadListener.DownloadError downloadError2 = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                        if (responseExecute != null) {
                                            responseBodyBody3 = responseExecute.body();
                                        } else {
                                            responseBodyBody3 = null;
                                        }
                                        if (responseBodyBody3 != null) {
                                            responseBodyBody4.close();
                                        }
                                        if (call != null) {
                                            call.cancel();
                                        }
                                        FileUtility fileUtility3 = FileUtility.INSTANCE;
                                        fileUtility3.closeQuietly(realBufferedSinkC);
                                        fileUtility3.closeQuietly(bufferedSourceSource);
                                        companion2.d(TAG, str2 + progress.getStatus());
                                        status2 = progress.getStatus();
                                        if (status2 == companion3.getERROR()) {
                                            if (status2 == companion3.getCANCELLED()) {
                                                deliverSuccess(file, downloadRequest, downloadListener);
                                                return;
                                            }
                                            companion2.d(TAG, str + downloadRequest);
                                            onProgressChanged(downloadRequest, progress, downloadListener);
                                            return;
                                        }
                                        deliverError(downloadRequest, downloadListener, downloadError2);
                                        return;
                                    } catch (Throwable th) {
                                        th = th;
                                        callNewCall = call2;
                                        responseExecute = responseExecute;
                                        realBufferedSinkC = null;
                                        bufferedSourceSource = null;
                                        if (responseExecute != null) {
                                            responseBodyBody = responseExecute.body();
                                        } else {
                                            responseBodyBody = null;
                                        }
                                        if (responseBodyBody != null) {
                                            responseBodyBody2.close();
                                        }
                                        if (callNewCall != null) {
                                            callNewCall.cancel();
                                        }
                                        FileUtility fileUtility4 = FileUtility.INSTANCE;
                                        fileUtility4.closeQuietly(realBufferedSinkC);
                                        fileUtility4.closeQuietly(bufferedSourceSource);
                                        Logger.Companion companion8 = Logger.INSTANCE;
                                        companion8.d(TAG, str2 + progress.getStatus());
                                        status = progress.getStatus();
                                        companion = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                        if (status != companion.getERROR()) {
                                            deliverError(downloadRequest, downloadListener, null);
                                        } else {
                                            deliverError(downloadRequest, downloadListener, null);
                                        }
                                        throw th;
                                    }
                                }
                                if (responseExecute.cacheResponse() != null) {
                                    try {
                                        call2 = callNewCall;
                                        try {
                                            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.CACHED_ASSETS_USED), downloadRequest.getLogEntry(), serverPath);
                                        } catch (Exception e3) {
                                            e = e3;
                                            callNewCall = call2;
                                            realBufferedSinkC = null;
                                            bufferedSourceSource = null;
                                            str = "On cancel ";
                                            companion2 = Logger.INSTANCE;
                                            companion2.e(TAG, String.valueOf(e));
                                            if (e instanceof ProtocolException) {
                                                StringBuilder sb3 = new StringBuilder();
                                                call = callNewCall;
                                                try {
                                                    sb3.append("Failed to load asset: ");
                                                    sb3.append(asset.getServerPath());
                                                    new AssetRequestError(sb3.toString()).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    callNewCall = call;
                                                }
                                            } else {
                                                call = callNewCall;
                                            }
                                            companion3 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                            progress.setStatus(companion3.getERROR());
                                            AssetDownloadListener.DownloadError downloadError3 = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                            if (responseExecute != null) {
                                                responseBodyBody3 = responseExecute.body();
                                            } else {
                                                responseBodyBody3 = null;
                                            }
                                            if (responseBodyBody3 != null) {
                                                responseBodyBody4.close();
                                            }
                                            if (call != null) {
                                                call.cancel();
                                            }
                                            FileUtility fileUtility5 = FileUtility.INSTANCE;
                                            fileUtility5.closeQuietly(realBufferedSinkC);
                                            fileUtility5.closeQuietly(bufferedSourceSource);
                                            companion2.d(TAG, str2 + progress.getStatus());
                                            status2 = progress.getStatus();
                                            if (status2 == companion3.getERROR()) {
                                                if (status2 == companion3.getCANCELLED()) {
                                                    deliverSuccess(file, downloadRequest, downloadListener);
                                                    return;
                                                }
                                                companion2.d(TAG, str + downloadRequest);
                                                onProgressChanged(downloadRequest, progress, downloadListener);
                                                return;
                                            }
                                            deliverError(downloadRequest, downloadListener, downloadError3);
                                            return;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            callNewCall = call2;
                                            realBufferedSinkC = null;
                                            bufferedSourceSource = null;
                                            str = "On cancel ";
                                            if (responseExecute != null) {
                                                responseBodyBody = responseExecute.body();
                                            } else {
                                                responseBodyBody = null;
                                            }
                                            if (responseBodyBody != null) {
                                                responseBodyBody2.close();
                                            }
                                            if (callNewCall != null) {
                                                callNewCall.cancel();
                                            }
                                            FileUtility fileUtility6 = FileUtility.INSTANCE;
                                            fileUtility6.closeQuietly(realBufferedSinkC);
                                            fileUtility6.closeQuietly(bufferedSourceSource);
                                            Logger.Companion companion9 = Logger.INSTANCE;
                                            companion9.d(TAG, str2 + progress.getStatus());
                                            status = progress.getStatus();
                                            companion = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                            if (status != companion.getERROR()) {
                                                deliverError(downloadRequest, downloadListener, null);
                                            } else {
                                                deliverError(downloadRequest, downloadListener, null);
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        realBufferedSinkC = null;
                                        bufferedSourceSource = null;
                                        str = "On cancel ";
                                        companion2 = Logger.INSTANCE;
                                        companion2.e(TAG, String.valueOf(e));
                                        if (e instanceof ProtocolException) {
                                            StringBuilder sb4 = new StringBuilder();
                                            call = callNewCall;
                                            sb4.append("Failed to load asset: ");
                                            sb4.append(asset.getServerPath());
                                            new AssetRequestError(sb4.toString()).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                                        } else {
                                            call = callNewCall;
                                        }
                                        companion3 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                        progress.setStatus(companion3.getERROR());
                                        AssetDownloadListener.DownloadError downloadError4 = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                        if (responseExecute != null) {
                                            responseBodyBody3 = responseExecute.body();
                                        } else {
                                            responseBodyBody3 = null;
                                        }
                                        if (responseBodyBody3 != null) {
                                            responseBodyBody4.close();
                                        }
                                        if (call != null) {
                                            call.cancel();
                                        }
                                        FileUtility fileUtility7 = FileUtility.INSTANCE;
                                        fileUtility7.closeQuietly(realBufferedSinkC);
                                        fileUtility7.closeQuietly(bufferedSourceSource);
                                        companion2.d(TAG, str2 + progress.getStatus());
                                        status2 = progress.getStatus();
                                        if (status2 == companion3.getERROR()) {
                                            if (status2 == companion3.getCANCELLED()) {
                                                deliverSuccess(file, downloadRequest, downloadListener);
                                                return;
                                            }
                                            companion2.d(TAG, str + downloadRequest);
                                            onProgressChanged(downloadRequest, progress, downloadListener);
                                            return;
                                        }
                                        deliverError(downloadRequest, downloadListener, downloadError4);
                                        return;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        realBufferedSinkC = null;
                                        bufferedSourceSource = null;
                                        str = "On cancel ";
                                        if (responseExecute != null) {
                                            responseBodyBody = responseExecute.body();
                                        } else {
                                            responseBodyBody = null;
                                        }
                                        if (responseBodyBody != null) {
                                            responseBodyBody2.close();
                                        }
                                        if (callNewCall != null) {
                                            callNewCall.cancel();
                                        }
                                        FileUtility fileUtility8 = FileUtility.INSTANCE;
                                        fileUtility8.closeQuietly(realBufferedSinkC);
                                        fileUtility8.closeQuietly(bufferedSourceSource);
                                        Logger.Companion companion10 = Logger.INSTANCE;
                                        companion10.d(TAG, str2 + progress.getStatus());
                                        status = progress.getStatus();
                                        companion = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                        if (status != companion.getERROR()) {
                                            deliverError(downloadRequest, downloadListener, null);
                                        } else {
                                            deliverError(downloadRequest, downloadListener, null);
                                        }
                                        throw th;
                                    }
                                } else {
                                    call2 = callNewCall;
                                }
                                try {
                                    responseBodyDecodeGzipIfNeeded = decodeGzipIfNeeded(responseExecute);
                                    if (responseBodyDecodeGzipIfNeeded != null) {
                                        bufferedSourceSource = responseBodyDecodeGzipIfNeeded.getDelegateSource();
                                    } else {
                                        bufferedSourceSource = null;
                                    }
                                    try {
                                        companion7.d(TAG, "Start download from url: ".concat(serverPath));
                                        realBufferedSinkC = Okio.c(Okio.g(file));
                                        file = file;
                                        if (responseBodyDecodeGzipIfNeeded != null) {
                                            try {
                                                jContentLength = responseBodyDecodeGzipIfNeeded.getContentLength();
                                            } catch (Exception e5) {
                                                e = e5;
                                                asset = asset;
                                                responseExecute = responseExecute;
                                                iCode = iCode;
                                                callNewCall = call2;
                                                str = "On cancel ";
                                            } catch (Throwable th5) {
                                                th = th5;
                                                str2 = "download status: ";
                                                callNewCall = call2;
                                                str = "On cancel ";
                                            }
                                        } else {
                                            jContentLength = 0;
                                        }
                                        try {
                                            progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getSTARTED());
                                            progress.setSizeBytes(jContentLength);
                                            try {
                                                progress.setReadBytes(0L);
                                                i2 = 0;
                                                progress.setProgressPercent(0);
                                                asset.setContentLength(jContentLength);
                                                onProgressChanged(downloadRequest, progress, downloadListener);
                                                j = 0;
                                                while (true) {
                                                    if (bufferedSourceSource != null) {
                                                        try {
                                                            try {
                                                                j2 = bufferedSourceSource.read(realBufferedSinkC.f45155Y, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH);
                                                            } catch (Exception e6) {
                                                                e = e6;
                                                                asset = asset;
                                                                responseExecute = responseExecute;
                                                                iCode = iCode;
                                                                callNewCall = call2;
                                                                str = "On cancel ";
                                                                str2 = "download status: ";
                                                                companion2 = Logger.INSTANCE;
                                                                companion2.e(TAG, String.valueOf(e));
                                                                if (e instanceof ProtocolException) {
                                                                    StringBuilder sb5 = new StringBuilder();
                                                                    call = callNewCall;
                                                                    sb5.append("Failed to load asset: ");
                                                                    sb5.append(asset.getServerPath());
                                                                    new AssetRequestError(sb5.toString()).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                                                                } else {
                                                                    call = callNewCall;
                                                                }
                                                                companion3 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                                progress.setStatus(companion3.getERROR());
                                                                AssetDownloadListener.DownloadError downloadError5 = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                                                if (responseExecute != null) {
                                                                    responseBodyBody3 = responseExecute.body();
                                                                } else {
                                                                    responseBodyBody3 = null;
                                                                }
                                                                if (responseBodyBody3 != null) {
                                                                    responseBodyBody4.close();
                                                                }
                                                                if (call != null) {
                                                                    call.cancel();
                                                                }
                                                                FileUtility fileUtility9 = FileUtility.INSTANCE;
                                                                fileUtility9.closeQuietly(realBufferedSinkC);
                                                                fileUtility9.closeQuietly(bufferedSourceSource);
                                                                companion2.d(TAG, str2 + progress.getStatus());
                                                                status2 = progress.getStatus();
                                                                if (status2 == companion3.getERROR()) {
                                                                    if (status2 == companion3.getCANCELLED()) {
                                                                        deliverSuccess(file, downloadRequest, downloadListener);
                                                                        return;
                                                                    }
                                                                    companion2.d(TAG, str + downloadRequest);
                                                                    onProgressChanged(downloadRequest, progress, downloadListener);
                                                                    return;
                                                                }
                                                                deliverError(downloadRequest, downloadListener, downloadError5);
                                                                return;
                                                            }
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            callNewCall = call2;
                                                            str = "On cancel ";
                                                            str2 = "download status: ";
                                                            if (responseExecute != null) {
                                                                responseBodyBody = responseExecute.body();
                                                            } else {
                                                                responseBodyBody = null;
                                                            }
                                                            if (responseBodyBody != null) {
                                                                responseBodyBody2.close();
                                                            }
                                                            if (callNewCall != null) {
                                                                callNewCall.cancel();
                                                            }
                                                            FileUtility fileUtility10 = FileUtility.INSTANCE;
                                                            fileUtility10.closeQuietly(realBufferedSinkC);
                                                            fileUtility10.closeQuietly(bufferedSourceSource);
                                                            Logger.Companion companion11 = Logger.INSTANCE;
                                                            companion11.d(TAG, str2 + progress.getStatus());
                                                            status = progress.getStatus();
                                                            companion = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                            if (status != companion.getERROR()) {
                                                                deliverError(downloadRequest, downloadListener, null);
                                                            } else {
                                                                deliverError(downloadRequest, downloadListener, null);
                                                            }
                                                            throw th;
                                                        }
                                                    } else {
                                                        j2 = -1;
                                                    }
                                                    if (j2 > 0) {
                                                        break;
                                                    }
                                                    try {
                                                        if (file.exists()) {
                                                            new AssetWriteError("Asset save error " + serverPath).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                                                            throw new Downloader.RequestException("File is not existing");
                                                        }
                                                        if (downloadRequest.isCancelled()) {
                                                            progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED());
                                                            break;
                                                        }
                                                        progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getIN_PROGRESS());
                                                        try {
                                                            realBufferedSinkC.emit();
                                                            realBufferedSinkC.flush();
                                                            j += j2;
                                                            progress.setReadBytes(j);
                                                            rangeEnd = asset.getRangeEnd();
                                                            if (rangeEnd != null) {
                                                                rangeStart = rangeEnd.longValue();
                                                            } else {
                                                                rangeStart = asset.getRangeStart();
                                                            }
                                                            j3 = jContentLength;
                                                            long j5 = rangeStart;
                                                            if (asset.isWaitingForDownload() || j < j5) {
                                                                asset = asset;
                                                                responseExecute = responseExecute;
                                                            } else {
                                                                Logger.Companion companion12 = Logger.INSTANCE;
                                                                asset = asset;
                                                                try {
                                                                    StringBuilder sb6 = new StringBuilder();
                                                                    responseExecute = responseExecute;
                                                                    try {
                                                                        sb6.append("Downloader totalRead=");
                                                                        sb6.append(j);
                                                                        sb6.append(" requiredBytes=");
                                                                        sb6.append(j5);
                                                                        companion12.e(TAG, sb6.toString());
                                                                        asset.notifyDownloadEnough();
                                                                    } catch (Exception e7) {
                                                                        e = e7;
                                                                        iCode = iCode;
                                                                        callNewCall = call2;
                                                                        str = "On cancel ";
                                                                        str2 = "download status: ";
                                                                        companion2 = Logger.INSTANCE;
                                                                        companion2.e(TAG, String.valueOf(e));
                                                                        if (e instanceof ProtocolException) {
                                                                            StringBuilder sb7 = new StringBuilder();
                                                                            call = callNewCall;
                                                                            sb7.append("Failed to load asset: ");
                                                                            sb7.append(asset.getServerPath());
                                                                            new AssetRequestError(sb7.toString()).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                                                                        } else {
                                                                            call = callNewCall;
                                                                        }
                                                                        companion3 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                                        progress.setStatus(companion3.getERROR());
                                                                        AssetDownloadListener.DownloadError downloadError6 = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                                                        if (responseExecute != null) {
                                                                            responseBodyBody3 = responseExecute.body();
                                                                        } else {
                                                                            responseBodyBody3 = null;
                                                                        }
                                                                        if (responseBodyBody3 != null) {
                                                                            responseBodyBody4.close();
                                                                        }
                                                                        if (call != null) {
                                                                            call.cancel();
                                                                        }
                                                                        FileUtility fileUtility11 = FileUtility.INSTANCE;
                                                                        fileUtility11.closeQuietly(realBufferedSinkC);
                                                                        fileUtility11.closeQuietly(bufferedSourceSource);
                                                                        companion2.d(TAG, str2 + progress.getStatus());
                                                                        status2 = progress.getStatus();
                                                                        if (status2 == companion3.getERROR()) {
                                                                            if (status2 == companion3.getCANCELLED()) {
                                                                                deliverSuccess(file, downloadRequest, downloadListener);
                                                                                return;
                                                                            }
                                                                            companion2.d(TAG, str + downloadRequest);
                                                                            onProgressChanged(downloadRequest, progress, downloadListener);
                                                                            return;
                                                                        }
                                                                        deliverError(downloadRequest, downloadListener, downloadError6);
                                                                        return;
                                                                    } catch (Throwable th7) {
                                                                        th = th7;
                                                                        callNewCall = call2;
                                                                        str = "On cancel ";
                                                                        str2 = "download status: ";
                                                                        responseExecute = responseExecute;
                                                                        if (responseExecute != null) {
                                                                            responseBodyBody = responseExecute.body();
                                                                        } else {
                                                                            responseBodyBody = null;
                                                                        }
                                                                        if (responseBodyBody != null) {
                                                                            responseBodyBody2.close();
                                                                        }
                                                                        if (callNewCall != null) {
                                                                            callNewCall.cancel();
                                                                        }
                                                                        FileUtility fileUtility12 = FileUtility.INSTANCE;
                                                                        fileUtility12.closeQuietly(realBufferedSinkC);
                                                                        fileUtility12.closeQuietly(bufferedSourceSource);
                                                                        Logger.Companion companion13 = Logger.INSTANCE;
                                                                        companion13.d(TAG, str2 + progress.getStatus());
                                                                        status = progress.getStatus();
                                                                        companion = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                                        if (status != companion.getERROR()) {
                                                                            deliverError(downloadRequest, downloadListener, null);
                                                                        } else {
                                                                            deliverError(downloadRequest, downloadListener, null);
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } catch (Exception e8) {
                                                                    e = e8;
                                                                    responseExecute = responseExecute;
                                                                    iCode = iCode;
                                                                    callNewCall = call2;
                                                                    str = "On cancel ";
                                                                    str2 = "download status: ";
                                                                    companion2 = Logger.INSTANCE;
                                                                    companion2.e(TAG, String.valueOf(e));
                                                                    if (e instanceof ProtocolException) {
                                                                        StringBuilder sb8 = new StringBuilder();
                                                                        call = callNewCall;
                                                                        sb8.append("Failed to load asset: ");
                                                                        sb8.append(asset.getServerPath());
                                                                        new AssetRequestError(sb8.toString()).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                                                                    } else {
                                                                        call = callNewCall;
                                                                    }
                                                                    companion3 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                                    progress.setStatus(companion3.getERROR());
                                                                    AssetDownloadListener.DownloadError downloadError7 = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                                                    if (responseExecute != null) {
                                                                        responseBodyBody3 = responseExecute.body();
                                                                    } else {
                                                                        responseBodyBody3 = null;
                                                                    }
                                                                    if (responseBodyBody3 != null) {
                                                                        responseBodyBody4.close();
                                                                    }
                                                                    if (call != null) {
                                                                        call.cancel();
                                                                    }
                                                                    FileUtility fileUtility13 = FileUtility.INSTANCE;
                                                                    fileUtility13.closeQuietly(realBufferedSinkC);
                                                                    fileUtility13.closeQuietly(bufferedSourceSource);
                                                                    companion2.d(TAG, str2 + progress.getStatus());
                                                                    status2 = progress.getStatus();
                                                                    if (status2 == companion3.getERROR()) {
                                                                        if (status2 == companion3.getCANCELLED()) {
                                                                            deliverSuccess(file, downloadRequest, downloadListener);
                                                                            return;
                                                                        }
                                                                        companion2.d(TAG, str + downloadRequest);
                                                                        onProgressChanged(downloadRequest, progress, downloadListener);
                                                                        return;
                                                                    }
                                                                    deliverError(downloadRequest, downloadListener, downloadError7);
                                                                    return;
                                                                }
                                                            }
                                                            if (j3 > 0) {
                                                                i2 = (int) ((((long) 100) * j) / j3);
                                                            } else {
                                                                i2 = i2;
                                                            }
                                                            while (progress.getProgressPercent() + 1 <= Math.min(i2, 100)) {
                                                                companion6 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                                progress.setStatus(companion6.getIN_PROGRESS());
                                                                progress.setProgressPercent(progress.getProgressPercent() + 1);
                                                                if (progress.getProgressPercent() >= 100) {
                                                                    progress.setStatus(companion6.getDONE());
                                                                }
                                                                onProgressChanged(downloadRequest, progress, downloadListener);
                                                            }
                                                            asset = asset;
                                                            responseExecute = responseExecute;
                                                            jContentLength = j3;
                                                        } catch (Exception e9) {
                                                            e = e9;
                                                            asset = asset;
                                                        } catch (Throwable th8) {
                                                            th = th8;
                                                            responseExecute = responseExecute;
                                                        }
                                                        responseExecute = responseExecute;
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                        callNewCall = call2;
                                                        str = "On cancel ";
                                                        str2 = "download status: ";
                                                        if (responseExecute != null) {
                                                            responseBodyBody = responseExecute.body();
                                                        } else {
                                                            responseBodyBody = null;
                                                        }
                                                        if (responseBodyBody != null) {
                                                            responseBodyBody2.close();
                                                        }
                                                        if (callNewCall != null) {
                                                            callNewCall.cancel();
                                                        }
                                                        FileUtility fileUtility14 = FileUtility.INSTANCE;
                                                        fileUtility14.closeQuietly(realBufferedSinkC);
                                                        fileUtility14.closeQuietly(bufferedSourceSource);
                                                        Logger.Companion companion14 = Logger.INSTANCE;
                                                        companion14.d(TAG, str2 + progress.getStatus());
                                                        status = progress.getStatus();
                                                        companion = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                        if (status != companion.getERROR()) {
                                                            deliverError(downloadRequest, downloadListener, null);
                                                        } else {
                                                            deliverError(downloadRequest, downloadListener, null);
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                asset = asset;
                                                responseExecute = responseExecute;
                                                try {
                                                    try {
                                                        realBufferedSinkC.flush();
                                                        try {
                                                            status3 = progress.getStatus();
                                                            companion4 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                            if (status3 == companion4.getIN_PROGRESS()) {
                                                                progress.setStatus(companion4.getDONE());
                                                                onProgressChanged(downloadRequest, progress, downloadListener);
                                                            }
                                                            if (responseExecute.body() != null && (responseBodyBody5 = responseExecute.body()) != null) {
                                                                responseBodyBody5.close();
                                                            }
                                                            call2.cancel();
                                                            FileUtility fileUtility15 = FileUtility.INSTANCE;
                                                            fileUtility15.closeQuietly(realBufferedSinkC);
                                                            fileUtility15.closeQuietly(bufferedSourceSource);
                                                            companion5 = Logger.INSTANCE;
                                                            companion5.d(TAG, "download status: " + progress.getStatus());
                                                            status4 = progress.getStatus();
                                                            if (status4 == companion4.getERROR() || status4 == companion4.getSTARTED()) {
                                                                deliverError(downloadRequest, downloadListener, null);
                                                                return;
                                                            }
                                                            if (status4 == companion4.getCANCELLED()) {
                                                                deliverSuccess(file, downloadRequest, downloadListener);
                                                                return;
                                                            }
                                                            companion5.d(TAG, "On cancel " + downloadRequest);
                                                            onProgressChanged(downloadRequest, progress, downloadListener);
                                                            return;
                                                        } catch (Exception e10) {
                                                            e = e10;
                                                            str = "On cancel ";
                                                            str2 = "download status: ";
                                                            iCode = iCode;
                                                            callNewCall = call2;
                                                            companion2 = Logger.INSTANCE;
                                                            companion2.e(TAG, String.valueOf(e));
                                                            if (e instanceof ProtocolException) {
                                                                StringBuilder sb9 = new StringBuilder();
                                                                call = callNewCall;
                                                                sb9.append("Failed to load asset: ");
                                                                sb9.append(asset.getServerPath());
                                                                new AssetRequestError(sb9.toString()).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                                                            } else {
                                                                call = callNewCall;
                                                            }
                                                            companion3 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                                                            progress.setStatus(companion3.getERROR());
                                                            AssetDownloadListener.DownloadError downloadError8 = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                                            if (responseExecute != null) {
                                                                responseBodyBody3 = responseExecute.body();
                                                            } else {
                                                                responseBodyBody3 = null;
                                                            }
                                                            if (responseBodyBody3 != null) {
                                                                responseBodyBody4.close();
                                                            }
                                                            if (call != null) {
                                                                call.cancel();
                                                            }
                                                            FileUtility fileUtility16 = FileUtility.INSTANCE;
                                                            fileUtility16.closeQuietly(realBufferedSinkC);
                                                            fileUtility16.closeQuietly(bufferedSourceSource);
                                                            companion2.d(TAG, str2 + progress.getStatus());
                                                            status2 = progress.getStatus();
                                                            if (status2 == companion3.getERROR()) {
                                                                if (status2 == companion3.getCANCELLED()) {
                                                                    deliverSuccess(file, downloadRequest, downloadListener);
                                                                    return;
                                                                }
                                                                companion2.d(TAG, str + downloadRequest);
                                                                onProgressChanged(downloadRequest, progress, downloadListener);
                                                                return;
                                                            }
                                                            deliverError(downloadRequest, downloadListener, downloadError8);
                                                            return;
                                                        }
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                    }
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    str = "On cancel ";
                                                    str2 = "download status: ";
                                                    callNewCall = call2;
                                                }
                                            } catch (Exception e12) {
                                                e = e12;
                                                asset = asset;
                                                responseExecute = responseExecute;
                                            } catch (Throwable th11) {
                                                th = th11;
                                                str = "On cancel ";
                                                str2 = "download status: ";
                                                callNewCall = call2;
                                            }
                                        } catch (Exception e13) {
                                            e = e13;
                                            asset = asset;
                                            responseExecute = responseExecute;
                                            str2 = "download status: ";
                                            str = "On cancel ";
                                        } catch (Throwable th12) {
                                            th = th12;
                                            str2 = "download status: ";
                                            str = "On cancel ";
                                        }
                                    } catch (Exception e14) {
                                        e = e14;
                                        asset = asset;
                                        file = file;
                                        responseExecute = responseExecute;
                                        str2 = "download status: ";
                                        str = "On cancel ";
                                        iCode = iCode;
                                        callNewCall = call2;
                                        realBufferedSinkC = null;
                                    } catch (Throwable th13) {
                                        th = th13;
                                        str2 = "download status: ";
                                        file = file;
                                        str = "On cancel ";
                                        callNewCall = call2;
                                        realBufferedSinkC = null;
                                    }
                                } catch (Exception e15) {
                                    e = e15;
                                    file = file;
                                    responseExecute = responseExecute;
                                    str2 = "download status: ";
                                    str = "On cancel ";
                                    callNewCall = call2;
                                    realBufferedSinkC = null;
                                    bufferedSourceSource = null;
                                } catch (Throwable th14) {
                                    th = th14;
                                    str2 = "download status: ";
                                    file = file;
                                    str = "On cancel ";
                                    callNewCall = call2;
                                    realBufferedSinkC = null;
                                    bufferedSourceSource = null;
                                }
                            } catch (Exception e16) {
                                e = e16;
                                asset = asset;
                                file = file;
                                responseExecute = responseExecute;
                                str2 = "download status: ";
                                str = "On cancel ";
                            }
                        } catch (Exception e17) {
                            e = e17;
                            asset = asset;
                            file = file;
                            responseExecute = responseExecute;
                            str2 = "download status: ";
                            str = "On cancel ";
                            realBufferedSinkC = null;
                            iCode = -1;
                        }
                    } catch (Throwable th15) {
                        th = th15;
                        str2 = "download status: ";
                        file = file;
                        str = "On cancel ";
                    }
                } catch (Exception e18) {
                    e = e18;
                    realBufferedSinkC = null;
                    iCode = -1;
                    bufferedSourceSource = null;
                    responseExecute = null;
                } catch (Throwable th16) {
                    th = th16;
                    realBufferedSinkC = null;
                    responseExecute = null;
                    bufferedSourceSource = null;
                    if (responseExecute != null) {
                        responseBodyBody = responseExecute.body();
                    } else {
                        responseBodyBody = null;
                    }
                    if (responseBodyBody != null) {
                        responseBodyBody2.close();
                    }
                    if (callNewCall != null) {
                        callNewCall.cancel();
                    }
                    FileUtility fileUtility17 = FileUtility.INSTANCE;
                    fileUtility17.closeQuietly(realBufferedSinkC);
                    fileUtility17.closeQuietly(bufferedSourceSource);
                    Logger.Companion companion15 = Logger.INSTANCE;
                    companion15.d(TAG, str2 + progress.getStatus());
                    status = progress.getStatus();
                    companion = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                    if (status != companion.getERROR()) {
                        deliverError(downloadRequest, downloadListener, null);
                    } else {
                        deliverError(downloadRequest, downloadListener, null);
                    }
                    throw th;
                }
            } catch (Exception e19) {
                e = e19;
                asset = asset;
                realBufferedSinkC = null;
                callNewCall = null;
                bufferedSourceSource = null;
                responseExecute = null;
                file = file;
                str = "On cancel ";
                companion2 = Logger.INSTANCE;
                companion2.e(TAG, String.valueOf(e));
                if (e instanceof ProtocolException) {
                    StringBuilder sb10 = new StringBuilder();
                    call = callNewCall;
                    sb10.append("Failed to load asset: ");
                    sb10.append(asset.getServerPath());
                    new AssetRequestError(sb10.toString()).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                } else {
                    call = callNewCall;
                }
                companion3 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                progress.setStatus(companion3.getERROR());
                AssetDownloadListener.DownloadError downloadError9 = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                if (responseExecute != null) {
                    responseBodyBody3 = responseExecute.body();
                } else {
                    responseBodyBody3 = null;
                }
                if (responseBodyBody3 != null) {
                    responseBodyBody4.close();
                }
                if (call != null) {
                    call.cancel();
                }
                FileUtility fileUtility18 = FileUtility.INSTANCE;
                fileUtility18.closeQuietly(realBufferedSinkC);
                fileUtility18.closeQuietly(bufferedSourceSource);
                companion2.d(TAG, str2 + progress.getStatus());
                status2 = progress.getStatus();
                if (status2 == companion3.getERROR()) {
                    if (status2 == companion3.getCANCELLED()) {
                        deliverSuccess(file, downloadRequest, downloadListener);
                        return;
                    }
                    companion2.d(TAG, str + downloadRequest);
                    onProgressChanged(downloadRequest, progress, downloadListener);
                    return;
                }
                deliverError(downloadRequest, downloadListener, downloadError9);
                return;
            } catch (Throwable th17) {
                th = th17;
                str2 = "download status: ";
                realBufferedSinkC = null;
                callNewCall = null;
                responseExecute = null;
                bufferedSourceSource = null;
                str = "On cancel ";
                file = file;
            }
            try {
                companion2 = Logger.INSTANCE;
                companion2.e(TAG, String.valueOf(e));
                if (e instanceof ProtocolException) {
                    StringBuilder sb11 = new StringBuilder();
                    call = callNewCall;
                    sb11.append("Failed to load asset: ");
                    sb11.append(asset.getServerPath());
                    new AssetRequestError(sb11.toString()).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                } else {
                    call = callNewCall;
                }
                companion3 = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
                progress.setStatus(companion3.getERROR());
                AssetDownloadListener.DownloadError downloadError10 = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                if (responseExecute != null) {
                    responseBodyBody3 = responseExecute.body();
                } else {
                    responseBodyBody3 = null;
                }
                if (responseBodyBody3 != null && (responseBodyBody4 = responseExecute.body()) != null) {
                    responseBodyBody4.close();
                }
                if (call != null) {
                    call.cancel();
                }
                FileUtility fileUtility19 = FileUtility.INSTANCE;
                fileUtility19.closeQuietly(realBufferedSinkC);
                fileUtility19.closeQuietly(bufferedSourceSource);
                companion2.d(TAG, str2 + progress.getStatus());
                status2 = progress.getStatus();
                if (status2 == companion3.getERROR() || status2 == companion3.getSTARTED()) {
                    deliverError(downloadRequest, downloadListener, downloadError10);
                    return;
                }
                if (status2 == companion3.getCANCELLED()) {
                    deliverSuccess(file, downloadRequest, downloadListener);
                    return;
                }
                companion2.d(TAG, str + downloadRequest);
                onProgressChanged(downloadRequest, progress, downloadListener);
                return;
            } catch (Throwable th18) {
                th = th18;
            }
        } catch (Exception e20) {
            e = e20;
            realBufferedSinkC = null;
            callNewCall = null;
        } catch (Throwable th19) {
            th = th19;
            realBufferedSinkC = null;
            callNewCall = null;
        }
        if (responseExecute != null) {
            responseBodyBody = responseExecute.body();
        } else {
            responseBodyBody = null;
        }
        if (responseBodyBody != null && (responseBodyBody2 = responseExecute.body()) != null) {
            responseBodyBody2.close();
        }
        if (callNewCall != null) {
            callNewCall.cancel();
        }
        FileUtility fileUtility110 = FileUtility.INSTANCE;
        fileUtility110.closeQuietly(realBufferedSinkC);
        fileUtility110.closeQuietly(bufferedSourceSource);
        Logger.Companion companion16 = Logger.INSTANCE;
        companion16.d(TAG, str2 + progress.getStatus());
        status = progress.getStatus();
        companion = AssetDownloadListener.Progress.ProgressStatus.INSTANCE;
        if (status != companion.getERROR() || status == companion.getSTARTED()) {
            deliverError(downloadRequest, downloadListener, null);
        } else if (status == companion.getCANCELLED()) {
            companion16.d(TAG, str + downloadRequest);
            onProgressChanged(downloadRequest, progress, downloadListener);
        } else {
            deliverSuccess(file, downloadRequest, downloadListener);
        }
        throw th;
    }

    private final void onProgressChanged(DownloadRequest downloadRequest, AssetDownloadListener.Progress progress, AssetDownloadListener downloadListener) {
        if (downloadListener != null) {
            downloadListener.onProgress(progress, downloadRequest);
        }
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancel(DownloadRequest request) {
        if (request == null || request.isCancelled()) {
            return;
        }
        request.cancel();
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancelAll() {
        Iterator<T> it = this.transitioning.iterator();
        while (it.hasNext()) {
            cancel((DownloadRequest) it.next());
        }
        this.transitioning.clear();
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void download(final DownloadRequest downloadRequest, final AssetDownloadListener downloadListener) {
        if (downloadRequest == null) {
            return;
        }
        this.transitioning.add(downloadRequest);
        this.downloadExecutor.execute(new PriorityRunnable() { // from class: com.vungle.ads.internal.downloader.AssetDownloader.download.1
            @Override // com.vungle.ads.internal.task.PriorityRunnable
            public int getPriority() {
                return downloadRequest.getPriority();
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                AssetDownloader.this.launchRequest(downloadRequest, downloadListener);
            }
        }, new com.unity3d.services.ads.operation.load.b(downloadRequest, this, downloadListener, 4));
    }
}
