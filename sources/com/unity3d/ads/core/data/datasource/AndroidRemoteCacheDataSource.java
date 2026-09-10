package com.unity3d.ads.core.data.datasource;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import cn.w;
import com.ironsource.V5;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HttpClientProvider;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.File;
import jk.c;
import jk.d;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJk\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00132*\u0010\u001b\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u0016H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJk\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00132*\u0010\u001b\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;", "Lcom/unity3d/ads/core/data/datasource/CacheDataSource;", "Lcn/w;", "ioDispatcher", "Lcom/unity3d/ads/core/domain/CreateFile;", "createFile", "Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;", "getFileExtensionFromUrl", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "httpClientProvider", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "<init>", "(Lcn/w;Lcom/unity3d/ads/core/domain/CreateFile;Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;Lcom/unity3d/ads/core/domain/HttpClientProvider;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "Ljava/io/File;", "cachePath", "", V5.c.f27366b, "url", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "intervalMs", "Lkotlin/Function3;", "", "Lak/f;", "Lwj/r;", "", "onProgress", "Lcom/unity3d/ads/core/data/model/CacheResult;", "getFileInternal", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjk/d;Lak/f;)Ljava/lang/Object;", "getFile", "Lcn/w;", "Lcom/unity3d/ads/core/domain/CreateFile;", "Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidRemoteCacheDataSource implements CacheDataSource {
    private final CreateFile createFile;
    private final GetFileExtensionFromUrl getFileExtensionFromUrl;
    private final HttpClientProvider httpClientProvider;
    private final w ioDispatcher;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFileInternal$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lcom/unity3d/ads/core/data/model/CacheResult;", "<anonymous>", "(Lcn/a0;)Lcom/unity3d/ads/core/data/model/CacheResult;"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFileInternal$2", f = "AndroidRemoteCacheDataSource.kt", l = {78, 79, 132}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements c {
        final /* synthetic */ File $cachePath;
        final /* synthetic */ String $fileName;
        final /* synthetic */ int $intervalMs;
        final /* synthetic */ d $onProgress;
        final /* synthetic */ Integer $priority;
        final /* synthetic */ String $url;
        int I$0;
        long J$0;
        long J$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        final /* synthetic */ AndroidRemoteCacheDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, AndroidRemoteCacheDataSource androidRemoteCacheDataSource, File file, String str2, Integer num, int i10, d dVar, f fVar) {
            super(2, fVar);
            this.$url = str;
            this.this$0 = androidRemoteCacheDataSource;
            this.$cachePath = file;
            this.$fileName = str2;
            this.$priority = num;
            this.$intervalMs = i10;
            this.$onProgress = dVar;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$url, this.this$0, this.$cachePath, this.$fileName, this.$priority, this.$intervalMs, this.$onProgress, fVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass2) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        /* JADX WARN: Code duplicated, block: B:113:0x0387 A[Catch: all -> 0x047d, TRY_LEAVE, TryCatch #24 {all -> 0x047d, blocks: (B:111:0x037c, B:113:0x0387, B:128:0x03cb), top: B:309:0x037c }] */
        /* JADX WARN: Code duplicated, block: B:115:0x0396  */
        /* JADX WARN: Code duplicated, block: B:120:0x03a4  */
        /* JADX WARN: Code duplicated, block: B:121:0x03a6  */
        /* JADX WARN: Code duplicated, block: B:138:0x0403  */
        /* JADX WARN: Code duplicated, block: B:312:0x03aa A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r23v4 */
        /* JADX WARN: Type inference failed for: r23v5 */
        /* JADX WARN: Type inference failed for: r23v7 */
        /* JADX WARN: Type inference failed for: r31v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v12 */
        /* JADX WARN: Type inference failed for: r4v29 */
        /* JADX WARN: Type inference failed for: r4v30, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r4v36 */
        /* JADX WARN: Type inference failed for: r4v40 */
        /* JADX WARN: Type inference failed for: r9v11 */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v4 */
        /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, lo.f] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x0403 -> B:301:0x041a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // ck.a
        public final java.lang.Object invokeSuspend(java.lang.Object r46) {
            /*
                Method dump skipped, instruction units count: 1617
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public AndroidRemoteCacheDataSource(w ioDispatcher, CreateFile createFile, GetFileExtensionFromUrl getFileExtensionFromUrl, HttpClientProvider httpClientProvider, SessionRepository sessionRepository) {
        n.f(ioDispatcher, "ioDispatcher");
        n.f(createFile, "createFile");
        n.f(getFileExtensionFromUrl, "getFileExtensionFromUrl");
        n.f(httpClientProvider, "httpClientProvider");
        n.f(sessionRepository, "sessionRepository");
        this.ioDispatcher = ioDispatcher;
        this.createFile = createFile;
        this.getFileExtensionFromUrl = getFileExtensionFromUrl;
        this.httpClientProvider = httpClientProvider;
        this.sessionRepository = sessionRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFileInternal(File file, String str, String str2, Integer num, int i10, d dVar, f fVar) {
        return d0.J(this.ioDispatcher, new AnonymousClass2(str2, this, file, str, num, i10, dVar, null), fVar);
    }

    @Override // com.unity3d.ads.core.data.datasource.CacheDataSource
    public Object getFile(File file, String str, String str2, Integer num, int i10, d dVar, f fVar) {
        return getFileInternal(file, str, str2, num, i10, dVar, fVar);
    }
}
