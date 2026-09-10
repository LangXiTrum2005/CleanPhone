package com.unity3d.ads.core.data.repository;

import ak.f;
import com.ironsource.V5;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.d;
import kotlin.Metadata;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\bf\u0018\u00002\u00020\u0001Ji\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062,\b\u0002\u0010\r\u001a&\b\u0001\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tH¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/unity3d/ads/core/data/repository/CacheRepository;", "", "", "url", "Lorg/json/JSONArray;", "headers", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "intervalMs", "Lkotlin/Function3;", "", "Lak/f;", "Lwj/r;", "onProgress", "Lcom/unity3d/ads/core/data/model/CacheResult;", "getFile", "(Ljava/lang/String;Lorg/json/JSONArray;IILjk/d;Lak/f;)Ljava/lang/Object;", "type", "getWebviewFile", "(Ljava/lang/String;Ljava/lang/String;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/model/CachedFile;", "cachedFile", "", "removeFile", "(Lcom/unity3d/ads/core/data/model/CachedFile;)Z", V5.c.f27366b, "doesFileExist", "(Ljava/lang/String;Lak/f;)Ljava/lang/Object;", "retrieveFile", "clearCache", "(Lak/f;)Ljava/lang/Object;", "getCacheSize", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public interface CacheRepository {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheRepository cacheRepository, String str, JSONArray jSONArray, int i10, int i11, d dVar, f fVar, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
            }
            if ((i12 & 2) != 0) {
                jSONArray = null;
            }
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = Integer.MAX_VALUE;
            }
            if ((i12 & 16) != 0) {
                dVar = null;
            }
            return cacheRepository.getFile(str, jSONArray, i10, i11, dVar, fVar);
        }
    }

    Object clearCache(f fVar);

    Object doesFileExist(String str, f fVar);

    Object getCacheSize(f fVar);

    Object getFile(String str, JSONArray jSONArray, int i10, int i11, d dVar, f fVar);

    Object getWebviewFile(String str, String str2, f fVar);

    boolean removeFile(CachedFile cachedFile);

    Object retrieveFile(String str, f fVar);
}
