package com.unity3d.ads.core.data.repository;

import ak.f;
import android.content.Context;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import cn.u1;
import cn.w;
import cn.z;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.V5;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetAssetFileName;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import fn.a1;
import fn.g;
import fn.n0;
import fn.q;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import hk.j;
import java.io.File;
import java.util.Map;
import jk.b;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import wj.d;
import wj.r;
import xj.b0;
import zm.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018Jm\u0010)\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2,\b\u0002\u0010'\u001a&\b\u0001\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010\"H\u0082@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u001bH\u0002¢\u0006\u0004\b,\u0010-Ja\u0010.\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2*\u0010'\u001a&\b\u0001\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010\"H\u0096@ø\u0001\u0000¢\u0006\u0004\b.\u0010/J#\u00101\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u001b\u00104\u001a\u00020(2\u0006\u00103\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0017\u00109\u001a\u0002082\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b9\u0010:J\u001b\u0010;\u001a\u0002082\u0006\u00103\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0004\b;\u00105J\u0015\u0010<\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b<\u0010=J\u0013\u0010>\u001a\u00020%H\u0096@ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u0013\u0010@\u001a\u00020#H\u0096@ø\u0001\u0000¢\u0006\u0004\b@\u0010?R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010BR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010BR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010CR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010DR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010ER\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010FR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010GR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010HR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001b\u0010Q\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001b\u0010T\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010N\u001a\u0004\bS\u0010P\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006U"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidCacheRepository;", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "Lcn/w;", "ioDispatcher", "Lcom/unity3d/ads/core/domain/GetCacheDirectory;", "getCacheDirectory", "Lcom/unity3d/ads/core/data/datasource/CacheDataSource;", "localCacheDataSource", "remoteCacheDataSource", "Landroid/content/Context;", "context", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/services/core/network/domain/CleanupDirectory;", "cleanupDirectory", "Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue;", "downloadPriorityQueue", "Lcom/unity3d/ads/core/domain/CreateFile;", "createFile", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/GetAssetFileName;", "getAssetFileName", "<init>", "(Lcn/w;Lcom/unity3d/ads/core/domain/GetCacheDirectory;Lcom/unity3d/ads/core/data/datasource/CacheDataSource;Lcom/unity3d/ads/core/data/datasource/CacheDataSource;Landroid/content/Context;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/services/core/network/domain/CleanupDirectory;Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue;Lcom/unity3d/ads/core/domain/CreateFile;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/GetAssetFileName;)V", "Ljava/io/File;", "cacheDirectory", "", "url", "Lorg/json/JSONArray;", "headers", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "intervalMs", "Lkotlin/Function3;", "", "Lak/f;", "Lwj/r;", "", "onProgress", "Lcom/unity3d/ads/core/data/model/CacheResult;", "getFileInternal", "(Ljava/io/File;Ljava/lang/String;Lorg/json/JSONArray;IILjk/d;Lak/f;)Ljava/lang/Object;", "dirName", "initCacheDir", "(Ljava/lang/String;)Ljava/io/File;", "getFile", "(Ljava/lang/String;Lorg/json/JSONArray;IILjk/d;Lak/f;)Ljava/lang/Object;", "type", "getWebviewFile", "(Ljava/lang/String;Ljava/lang/String;Lak/f;)Ljava/lang/Object;", V5.c.f27366b, "retrieveFile", "(Ljava/lang/String;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/model/CachedFile;", "cachedFile", "", "removeFile", "(Lcom/unity3d/ads/core/data/model/CachedFile;)Z", "doesFileExist", "getFilename", "(Ljava/lang/String;)Ljava/lang/String;", "clearCache", "(Lak/f;)Ljava/lang/Object;", "getCacheSize", "Lcom/unity3d/ads/core/domain/GetCacheDirectory;", "Lcom/unity3d/ads/core/data/datasource/CacheDataSource;", "Landroid/content/Context;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/services/core/network/domain/CleanupDirectory;", "Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue;", "Lcom/unity3d/ads/core/domain/CreateFile;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/domain/GetAssetFileName;", "Lcn/a0;", "scope", "Lcn/a0;", "cacheDir$delegate", "Lwj/d;", "getCacheDir", "()Ljava/io/File;", "cacheDir", "webviewCacheDir$delegate", "getWebviewCacheDir", "webviewCacheDir", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidCacheRepository implements CacheRepository {

    /* JADX INFO: renamed from: cacheDir$delegate, reason: from kotlin metadata */
    private final d cacheDir;
    private final CleanupDirectory cleanupDirectory;
    private final Context context;
    private final CreateFile createFile;
    private final DownloadPriorityQueue downloadPriorityQueue;
    private final GetAssetFileName getAssetFileName;
    private final GetCacheDirectory getCacheDirectory;
    private final CacheDataSource localCacheDataSource;
    private final CacheDataSource remoteCacheDataSource;
    private final a0 scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: webviewCacheDir$delegate, reason: from kotlin metadata */
    private final d webviewCacheDir;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2", f = "AndroidCacheRepository.kt", l = {124}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements c {
        long J$0;
        boolean Z$0;
        int label;

        public AnonymousClass2(f fVar) {
            super(2, fVar);
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return AndroidCacheRepository.this.new AnonymousClass2(fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass2) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0068  */
        /* JADX WARN: Code duplicated, block: B:27:0x00a2 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:20:0x0089, B:30:0x00ae, B:25:0x0096, B:27:0x00a2, B:29:0x00a6), top: B:57:0x0056 }] */
        /* JADX WARN: Code duplicated, block: B:29:0x00a6 A[Catch: all -> 0x0091, LOOP:0: B:28:0x00a4->B:29:0x00a6, LOOP_END, TryCatch #0 {all -> 0x0091, blocks: (B:20:0x0089, B:30:0x00ae, B:25:0x0096, B:27:0x00a2, B:29:0x00a6), top: B:57:0x0056 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x0191 A[Catch: Exception -> 0x0183, TryCatch #2 {Exception -> 0x0183, blocks: (B:38:0x014c, B:41:0x015d, B:49:0x019c, B:44:0x0185, B:46:0x0191, B:48:0x0194), top: B:61:0x014c }] */
        /* JADX WARN: Code duplicated, block: B:48:0x0194 A[Catch: Exception -> 0x0183, LOOP:1: B:47:0x0192->B:48:0x0194, LOOP_END, TryCatch #2 {Exception -> 0x0183, blocks: (B:38:0x014c, B:41:0x015d, B:49:0x019c, B:44:0x0185, B:46:0x0191, B:48:0x0194), top: B:61:0x014c }] */
        /* JADX WARN: Instruction removed from duplicated block: B:27:0x00a2, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:46:0x0191, please report this as an issue */
        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            boolean cleanCache;
            Object cacheSize;
            long j10;
            Object obj2;
            File[] fileArrListFiles;
            File[] fileArrListFiles2;
            int i10;
            int i11 = this.label;
            if (i11 == 0) {
                t9.e.z(obj);
                cleanCache = AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().getDebugSettings().getCleanCache();
                long jB = bn.d.b();
                AndroidCacheRepository androidCacheRepository = AndroidCacheRepository.this;
                this.Z$0 = cleanCache;
                this.J$0 = jB;
                this.label = 1;
                cacheSize = androidCacheRepository.getCacheSize(this);
                bk.a aVar = bk.a.f5708a;
                if (cacheSize == aVar) {
                    return aVar;
                }
                j10 = jB;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j11 = this.J$0;
                cleanCache = this.Z$0;
                t9.e.z(obj);
                j10 = j11;
                cacheSize = obj;
            }
            boolean z10 = cleanCache;
            long jLongValue = ((Number) cacheSize).longValue();
            try {
                if (z10) {
                    obj2 = "size_kb";
                    fileArrListFiles2 = AndroidCacheRepository.this.getCacheDir().listFiles();
                    if (fileArrListFiles2 != null) {
                        for (File file : fileArrListFiles2) {
                            file.delete();
                        }
                    }
                } else {
                    try {
                        if (AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().hasCachedAssetsConfiguration()) {
                            NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().getCachedAssetsConfiguration();
                            obj2 = "size_kb";
                            AndroidCacheRepository.this.cleanupDirectory.invoke(AndroidCacheRepository.this.getCacheDir(), cachedAssetsConfiguration.getMaxCachedAssetSizeMb(), cachedAssetsConfiguration.getMaxCachedAssetAgeMs());
                        } else {
                            obj2 = "size_kb";
                            fileArrListFiles2 = AndroidCacheRepository.this.getCacheDir().listFiles();
                            if (fileArrListFiles2 != null) {
                                while (i10 < r9) {
                                    file.delete();
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj2 = "size_kb";
                        SendDiagnosticEvent sendDiagnosticEvent = AndroidCacheRepository.this.sendDiagnosticEvent;
                        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_ASSETS_FAILURE_TIME;
                        double dElapsedMillis = TimeExtensionsKt.elapsedMillis(new bn.f(j10));
                        Map mapP = b0.P(new wj.f(obj2, new Integer((int) (jLongValue / ((long) 1024)))));
                        wj.f fVar = new wj.f("reason", th.getClass().getSimpleName());
                        String message = th.getMessage();
                        if (message == null) {
                            message = th.getClass().getSimpleName();
                        }
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, new Double(dElapsedMillis), b0.Q(fVar, new wj.f("reason_debug", message)), mapP, (AdObject) null, (Integer) null, 48, (Object) null);
                    }
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidCacheRepository.this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_ASSETS_SUCCESS_TIME, new Double(TimeExtensionsKt.elapsedMillis(new bn.f(j10))), (Map) null, b0.P(new wj.f(obj2, new Integer((int) (jLongValue / ((long) 1024))))), (AdObject) null, (Integer) null, 52, (Object) null);
            } catch (Throwable th3) {
                th = th3;
            }
            long jB2 = bn.d.b();
            if (z10) {
                fileArrListFiles = AndroidCacheRepository.this.getWebviewCacheDir().listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        file2.delete();
                    }
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidCacheRepository.this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_SUCCESS_TIME, new Double(TimeExtensionsKt.elapsedMillis(new bn.f(jB2))), (Map) null, (Map) null, (AdObject) null, (Integer) null, 60, (Object) null);
            } else {
                try {
                    if (AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().hasCachedWebviewFilesConfiguration()) {
                        NativeConfigurationOuterClass.CachedAssetsConfiguration cachedWebviewFilesConfiguration = AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().getCachedWebviewFilesConfiguration();
                        AndroidCacheRepository.this.cleanupDirectory.invoke(AndroidCacheRepository.this.getWebviewCacheDir(), cachedWebviewFilesConfiguration.getMaxCachedAssetSizeMb(), cachedWebviewFilesConfiguration.getMaxCachedAssetAgeMs());
                    } else {
                        fileArrListFiles = AndroidCacheRepository.this.getWebviewCacheDir().listFiles();
                        if (fileArrListFiles != null) {
                            while (i < r3) {
                                file2.delete();
                            }
                        }
                    }
                    SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidCacheRepository.this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_SUCCESS_TIME, new Double(TimeExtensionsKt.elapsedMillis(new bn.f(jB2))), (Map) null, (Map) null, (AdObject) null, (Integer) null, 60, (Object) null);
                } catch (Exception e10) {
                    SendDiagnosticEvent sendDiagnosticEvent2 = AndroidCacheRepository.this.sendDiagnosticEvent;
                    DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType2 = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_FAILURE_TIME;
                    Double d10 = new Double(TimeExtensionsKt.elapsedMillis(new bn.f(jB2)));
                    wj.f fVar2 = new wj.f("reason", e10.getClass().getSimpleName());
                    String message2 = e10.getMessage();
                    if (message2 == null) {
                        message2 = e10.getClass().getSimpleName();
                    }
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, diagnosticEventType2, d10, b0.Q(fVar2, new wj.f("reason_debug", message2)), (Map) null, (AdObject) null, (Integer) null, 56, (Object) null);
                }
            }
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository", f = "AndroidCacheRepository.kt", l = {115}, m = "doesFileExist")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends ck.c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidCacheRepository.this.doesFileExist(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "", "<anonymous>", "(Lcn/a0;)J"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2", f = "AndroidCacheRepository.kt", l = {}, m = "invokeSuspend")
    public static final class C07502 extends i implements c {
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public /* synthetic */ class AnonymousClass1 extends k implements b {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1, File.class, "isFile", "isFile()Z", 0);
            }

            @Override // jk.b
            public final Boolean invoke(File p10) {
                n.f(p10, "p0");
                return Boolean.valueOf(p10.isFile());
            }
        }

        public C07502(f fVar) {
            super(2, fVar);
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return AndroidCacheRepository.this.new C07502(fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((C07502) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            File cacheDir = AndroidCacheRepository.this.getCacheDir();
            n.f(cacheDir, "<this>");
            zm.e eVar = new zm.e(l.P(new hk.i(cacheDir, j.f42398a), AnonymousClass1.INSTANCE));
            long length = 0;
            while (eVar.hasNext()) {
                length += ((File) eVar.next()).length();
            }
            return new Long(length);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lcom/unity3d/ads/core/data/model/CacheResult;", "<anonymous>", "(Lcn/a0;)Lcom/unity3d/ads/core/data/model/CacheResult;"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2", f = "AndroidCacheRepository.kt", l = {85, 92, InterfaceC0435l1.d.b.f29108e}, m = "invokeSuspend")
    public static final class C07512 extends i implements c {
        final /* synthetic */ File $cacheDirectory;
        final /* synthetic */ int $intervalMs;
        final /* synthetic */ jk.d $onProgress;
        final /* synthetic */ int $priority;
        final /* synthetic */ String $url;
        Object L$0;
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lwj/r;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
        @e(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1", f = "AndroidCacheRepository.kt", l = {MBSupportMuteAdType.REWARD_VIDEO, 100}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends i implements b {
            final /* synthetic */ File $cacheDirectory;
            final /* synthetic */ n0 $fileResult;
            final /* synthetic */ String $filename;
            final /* synthetic */ int $intervalMs;
            final /* synthetic */ jk.d $onProgress;
            final /* synthetic */ int $priority;
            final /* synthetic */ String $url;
            int label;
            final /* synthetic */ AndroidCacheRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidCacheRepository androidCacheRepository, File file, String str, String str2, int i10, n0 n0Var, int i11, jk.d dVar, f fVar) {
                super(1, fVar);
                this.this$0 = androidCacheRepository;
                this.$cacheDirectory = file;
                this.$filename = str;
                this.$url = str2;
                this.$priority = i10;
                this.$fileResult = n0Var;
                this.$intervalMs = i11;
                this.$onProgress = dVar;
            }

            @Override // ck.a
            public final f create(f fVar) {
                return new AnonymousClass1(this.this$0, this.$cacheDirectory, this.$filename, this.$url, this.$priority, this.$fileResult, this.$intervalMs, this.$onProgress, fVar);
            }

            @Override // jk.b
            public final Object invoke(f fVar) {
                return ((AnonymousClass1) create(fVar)).invokeSuspend(r.f53297a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
            
                if (r0 == r12) goto L21;
             */
            @Override // ck.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    r13 = this;
                    int r0 = r13.label
                    wj.r r10 = wj.r.f53297a
                    r11 = 2
                    r1 = 1
                    bk.a r12 = bk.a.f5708a
                    if (r0 == 0) goto L21
                    if (r0 == r1) goto L1c
                    if (r0 != r11) goto L14
                    t9.e.z(r14)
                    r0 = r14
                    goto L85
                L14:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L1c:
                    t9.e.z(r14)
                    r0 = r14
                    goto L4a
                L21:
                    t9.e.z(r14)
                    com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = r13.this$0
                    com.unity3d.ads.core.data.datasource.CacheDataSource r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getLocalCacheDataSource$p(r0)
                    java.io.File r2 = r13.$cacheDirectory
                    r3 = r2
                    java.lang.String r2 = r13.$filename
                    r4 = r3
                    java.lang.String r3 = r13.$url
                    int r5 = r13.$priority
                    r6 = r4
                    java.lang.Integer r4 = new java.lang.Integer
                    r4.<init>(r5)
                    r13.label = r1
                    r5 = 0
                    r1 = r6
                    r6 = 0
                    r8 = 48
                    r9 = 0
                    r7 = r13
                    java.lang.Object r0 = com.unity3d.ads.core.data.datasource.CacheDataSource.DefaultImpls.getFile$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                    if (r0 != r12) goto L4a
                    goto L84
                L4a:
                    com.unity3d.ads.core.data.model.CacheResult r0 = (com.unity3d.ads.core.data.model.CacheResult) r0
                    boolean r1 = r0 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
                    if (r1 == 0) goto L63
                    fn.n0 r1 = r13.$fileResult
                L52:
                    r2 = r1
                    fn.a1 r2 = (fn.a1) r2
                    java.lang.Object r3 = r2.getValue()
                    r4 = r3
                    com.unity3d.ads.core.data.model.CacheResult r4 = (com.unity3d.ads.core.data.model.CacheResult) r4
                    boolean r2 = r2.c0(r3, r0)
                    if (r2 == 0) goto L52
                    return r10
                L63:
                    com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = r13.this$0
                    com.unity3d.ads.core.data.datasource.CacheDataSource r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getRemoteCacheDataSource$p(r0)
                    java.io.File r1 = r13.$cacheDirectory
                    java.lang.String r2 = r13.$filename
                    java.lang.String r3 = r13.$url
                    int r4 = r13.$priority
                    java.lang.Integer r5 = new java.lang.Integer
                    r5.<init>(r4)
                    r4 = r5
                    int r5 = r13.$intervalMs
                    jk.d r6 = r13.$onProgress
                    r13.label = r11
                    r7 = r13
                    java.lang.Object r0 = r0.getFile(r1, r2, r3, r4, r5, r6, r7)
                    if (r0 != r12) goto L85
                L84:
                    return r12
                L85:
                    com.unity3d.ads.core.data.model.CacheResult r0 = (com.unity3d.ads.core.data.model.CacheResult) r0
                    fn.n0 r1 = r13.$fileResult
                L89:
                    r2 = r1
                    fn.a1 r2 = (fn.a1) r2
                    java.lang.Object r3 = r2.getValue()
                    r4 = r3
                    com.unity3d.ads.core.data.model.CacheResult r4 = (com.unity3d.ads.core.data.model.CacheResult) r4
                    boolean r2 = r2.c0(r3, r0)
                    if (r2 == 0) goto L89
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository.C07512.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07512(String str, File file, int i10, int i11, jk.d dVar, f fVar) {
            super(2, fVar);
            this.$url = str;
            this.$cacheDirectory = file;
            this.$priority = i10;
            this.$intervalMs = i11;
            this.$onProgress = dVar;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return AndroidCacheRepository.this.new C07512(this.$url, this.$cacheDirectory, this.$priority, this.$intervalMs, this.$onProgress, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((C07512) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00b3 A[RETURN] */
        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            Object file$default;
            String str;
            n0 n0Var;
            Object objK;
            int i10 = this.label;
            bk.a aVar = bk.a.f5708a;
            if (i10 == 0) {
                t9.e.z(obj);
                String filename = AndroidCacheRepository.this.getFilename(this.$url);
                CacheDataSource cacheDataSource = AndroidCacheRepository.this.localCacheDataSource;
                File file = this.$cacheDirectory;
                String str2 = this.$url;
                Integer num = new Integer(this.$priority);
                this.L$0 = filename;
                this.label = 1;
                file$default = CacheDataSource.DefaultImpls.getFile$default(cacheDataSource, file, filename, str2, num, 0, null, this, 48, null);
                if (file$default != aVar) {
                    str = filename;
                }
                return aVar;
            }
            if (i10 == 1) {
                String str3 = (String) this.L$0;
                t9.e.z(obj);
                str = str3;
                file$default = obj;
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                    return obj;
                }
                n0Var = (n0) this.L$0;
                t9.e.z(obj);
            }
            q qVar = new q(n0Var, 2);
            this.L$0 = null;
            this.label = 3;
            objK = g.k(qVar, this);
            if (objK != aVar) {
                return aVar;
            }
            return objK;
            CacheResult cacheResult = (CacheResult) file$default;
            if (cacheResult instanceof CacheResult.Success) {
                return cacheResult;
            }
            a1 a1VarC = g.c(null);
            DownloadPriorityQueue downloadPriorityQueue = AndroidCacheRepository.this.downloadPriorityQueue;
            int i11 = this.$priority;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(AndroidCacheRepository.this, this.$cacheDirectory, str, this.$url, i11, a1VarC, this.$intervalMs, this.$onProgress, null);
            this.L$0 = a1VarC;
            this.label = 2;
            if (downloadPriorityQueue.invoke(i11, anonymousClass1, this) != aVar) {
                n0Var = a1VarC;
                q qVar2 = new q(n0Var, 2);
                this.L$0 = null;
                this.label = 3;
                objK = g.k(qVar2, this);
                if (objK != aVar) {
                    return objK;
                }
            }
            return aVar;
        }
    }

    public AndroidCacheRepository(w ioDispatcher, GetCacheDirectory getCacheDirectory, CacheDataSource localCacheDataSource, CacheDataSource remoteCacheDataSource, Context context, SessionRepository sessionRepository, CleanupDirectory cleanupDirectory, DownloadPriorityQueue downloadPriorityQueue, CreateFile createFile, SendDiagnosticEvent sendDiagnosticEvent, GetAssetFileName getAssetFileName) {
        n.f(ioDispatcher, "ioDispatcher");
        n.f(getCacheDirectory, "getCacheDirectory");
        n.f(localCacheDataSource, "localCacheDataSource");
        n.f(remoteCacheDataSource, "remoteCacheDataSource");
        n.f(context, "context");
        n.f(sessionRepository, "sessionRepository");
        n.f(cleanupDirectory, "cleanupDirectory");
        n.f(downloadPriorityQueue, "downloadPriorityQueue");
        n.f(createFile, "createFile");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(getAssetFileName, "getAssetFileName");
        this.getCacheDirectory = getCacheDirectory;
        this.localCacheDataSource = localCacheDataSource;
        this.remoteCacheDataSource = remoteCacheDataSource;
        this.context = context;
        this.sessionRepository = sessionRepository;
        this.cleanupDirectory = cleanupDirectory;
        this.downloadPriorityQueue = downloadPriorityQueue;
        this.createFile = createFile;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getAssetFileName = getAssetFileName;
        this.scope = d0.y(d0.y(d0.b(ioDispatcher), new z("CacheRepository")), u1.f6774a);
        this.cacheDir = r9.b.u(new AndroidCacheRepository$cacheDir$2(this));
        this.webviewCacheDir = r9.b.u(new AndroidCacheRepository$webviewCacheDir$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getCacheDir() {
        return (File) this.cacheDir.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFileInternal(File file, String str, JSONArray jSONArray, int i10, int i11, jk.d dVar, f fVar) {
        return d0.J(this.scope.getCoroutineContext(), new C07512(str, file, i10, i11, dVar, null), fVar);
    }

    public static /* synthetic */ Object getFileInternal$default(AndroidCacheRepository androidCacheRepository, File file, String str, JSONArray jSONArray, int i10, int i11, jk.d dVar, f fVar, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        int i13 = i11;
        if ((i12 & 32) != 0) {
            dVar = null;
        }
        return androidCacheRepository.getFileInternal(file, str, jSONArray, i10, i13, dVar, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getWebviewCacheDir() {
        return (File) this.webviewCacheDir.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File initCacheDir(String dirName) {
        File baseDir = this.sessionRepository.getFeatureFlags().getUseFilesDir() ? this.context.getFilesDir() : this.context.getCacheDir();
        GetCacheDirectory getCacheDirectory = this.getCacheDirectory;
        n.e(baseDir, "baseDir");
        File fileInvoke = getCacheDirectory.invoke(baseDir, dirName);
        fileInvoke.mkdirs();
        return fileInvoke;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object clearCache(f fVar) throws Throwable {
        Object objJ = d0.J(this.scope.getCoroutineContext(), new AnonymousClass2(null), fVar);
        return objJ == bk.a.f5708a ? objJ : r.f53297a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object doesFileExist(String str, f fVar) {
        AnonymousClass1 anonymousClass1;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(fVar);
        }
        Object objRetrieveFile = anonymousClass1.result;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            t9.e.z(objRetrieveFile);
            anonymousClass1.label = 1;
            objRetrieveFile = retrieveFile(str, anonymousClass1);
            Object obj = bk.a.f5708a;
            if (objRetrieveFile == obj) {
                return obj;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(objRetrieveFile);
        }
        return Boolean.valueOf(objRetrieveFile instanceof CacheResult.Success);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getCacheSize(f fVar) {
        return d0.J(this.scope.getCoroutineContext(), new C07502(null), fVar);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getFile(String str, JSONArray jSONArray, int i10, int i11, jk.d dVar, f fVar) {
        return getFileInternal(getCacheDir(), str, jSONArray, i10, i11, dVar, fVar);
    }

    public final String getFilename(String url) {
        n.f(url, "url");
        return this.getAssetFileName.invoke(url);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getWebviewFile(String str, String str2, f fVar) {
        File fileInvoke = this.createFile.invoke(getWebviewCacheDir(), str2);
        fileInvoke.mkdirs();
        return getFileInternal$default(this, fileInvoke, str, null, 0, 0, null, fVar, 48, null);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public boolean removeFile(CachedFile cachedFile) {
        n.f(cachedFile, "cachedFile");
        File file = cachedFile.getFile();
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            file = null;
        }
        if (file != null) {
            return file.delete();
        }
        return false;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object retrieveFile(String str, f fVar) {
        return CacheDataSource.DefaultImpls.getFile$default(this.localCacheDataSource, getCacheDir(), str, null, null, 0, null, fVar, 60, null);
    }
}
