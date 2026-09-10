package com.unity3d.ads.core.data.datasource;

import ak.f;
import an.p;
import com.ironsource.V5;
import com.unity3d.ads.core.data.model.CacheError;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CacheSource;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.File;
import jk.d;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Jk\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\r2*\u0010\u0015\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidLocalCacheDataSource;", "Lcom/unity3d/ads/core/data/datasource/CacheDataSource;", "Lcom/unity3d/ads/core/domain/CreateFile;", "createFile", "Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;", "getFileExtensionFromUrl", "<init>", "(Lcom/unity3d/ads/core/domain/CreateFile;Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;)V", "Ljava/io/File;", "cachePath", "", V5.c.f27366b, "url", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "intervalMs", "Lkotlin/Function3;", "", "Lak/f;", "Lwj/r;", "", "onProgress", "Lcom/unity3d/ads/core/data/model/CacheResult;", "getFile", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjk/d;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/CreateFile;", "getCreateFile", "()Lcom/unity3d/ads/core/domain/CreateFile;", "Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;", "getGetFileExtensionFromUrl", "()Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidLocalCacheDataSource implements CacheDataSource {
    private final CreateFile createFile;
    private final GetFileExtensionFromUrl getFileExtensionFromUrl;

    public AndroidLocalCacheDataSource(CreateFile createFile, GetFileExtensionFromUrl getFileExtensionFromUrl) {
        n.f(createFile, "createFile");
        n.f(getFileExtensionFromUrl, "getFileExtensionFromUrl");
        this.createFile = createFile;
        this.getFileExtensionFromUrl = getFileExtensionFromUrl;
    }

    public final CreateFile getCreateFile() {
        return this.createFile;
    }

    @Override // com.unity3d.ads.core.data.datasource.CacheDataSource
    public Object getFile(File file, String str, String str2, Integer num, int i10, d dVar, f fVar) {
        File fileInvoke = this.createFile.invoke(file, str);
        if (fileInvoke.exists()) {
            String name = fileInvoke.getName();
            n.e(name, "file.name");
            if (!p.h0(name, ".part", false)) {
                String strInvoke = (str2 == null || str2.length() == 0) ? null : this.getFileExtensionFromUrl.invoke(str2);
                return new CacheResult.Success(new CachedFile(str2 == null ? "" : str2, str, fileInvoke, strInvoke == null ? "" : strInvoke, fileInvoke.length(), null, num != null ? num.intValue() : Integer.MAX_VALUE, 32, null), CacheSource.LOCAL);
            }
        }
        return new CacheResult.Failure(CacheError.FILE_NOT_FOUND, CacheSource.LOCAL, null, 4, null);
    }

    public final GetFileExtensionFromUrl getGetFileExtensionFromUrl() {
        return this.getFileExtensionFromUrl;
    }
}
