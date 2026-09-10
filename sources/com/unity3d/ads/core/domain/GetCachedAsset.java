package com.unity3d.ads.core.domain;

import ak.l;
import an.h;
import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import cn.d0;
import com.ironsource.B5;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import t9.e;
import wj.f;
import wj.g;
import xj.b0;
import xj.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003J\b\u0010\u0012\u001a\u00020\u000eH\u0003J\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0087\u0002J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/core/domain/GetCachedAsset;", "", "cacheRepository", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "context", "Landroid/content/Context;", "cacheWebViewAssets", "Lcom/unity3d/ads/core/domain/CacheWebViewAssets;", "getAssetFileName", "Lcom/unity3d/ads/core/domain/GetAssetFileName;", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Landroid/content/Context;Lcom/unity3d/ads/core/domain/CacheWebViewAssets;Lcom/unity3d/ads/core/domain/GetAssetFileName;)V", "getBundledAsset", "Landroid/webkit/WebResourceResponse;", "uri", "Landroid/net/Uri;", "getLegacyCachedAsset", "getNotFoundResponse", "invoke", "webviewType", "", "tryGetWebViewAsset", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class GetCachedAsset {
    private final CacheRepository cacheRepository;
    private final CacheWebViewAssets cacheWebViewAssets;
    private final Context context;
    private final GetAssetFileName getAssetFileName;
    private final SessionRepository sessionRepository;

    public GetCachedAsset(CacheRepository cacheRepository, SessionRepository sessionRepository, Context context, CacheWebViewAssets cacheWebViewAssets, GetAssetFileName getAssetFileName) {
        n.f(cacheRepository, "cacheRepository");
        n.f(sessionRepository, "sessionRepository");
        n.f(context, "context");
        n.f(cacheWebViewAssets, "cacheWebViewAssets");
        n.f(getAssetFileName, "getAssetFileName");
        this.cacheRepository = cacheRepository;
        this.sessionRepository = sessionRepository;
        this.context = context;
        this.cacheWebViewAssets = cacheWebViewAssets;
        this.getAssetFileName = getAssetFileName;
    }

    private final WebResourceResponse getBundledAsset(Uri uri) {
        String strValueOf = String.valueOf(uri.getPath());
        String strM0 = h.M0(strValueOf, "/", strValueOf);
        try {
            InputStream inputStreamOpen = this.context.getAssets().open(strM0);
            n.e(inputStreamOpen, "context.assets.open(fileName)");
            return new WebResourceResponse(StringExtensionsKt.guessMimeType(strM0), null, inputStreamOpen);
        } catch (Exception unused) {
            return getNotFoundResponse();
        }
    }

    private final WebResourceResponse getLegacyCachedAsset(Uri uri) {
        Object objC;
        String string = uri.toString();
        n.e(string, "uri.toString()");
        CacheResult cacheResult = (CacheResult) d0.C(l.f3620a, new GetCachedAsset$getLegacyCachedAsset$result$1(this, h.O0(string, "/"), null));
        if (!(cacheResult instanceof CacheResult.Success)) {
            return getNotFoundResponse();
        }
        File file = ((CacheResult.Success) cacheResult).getCachedFile().getFile();
        if (file != null) {
            try {
                objC = new FileInputStream(file);
            } catch (Throwable th2) {
                objC = e.c(th2);
            }
            if (objC instanceof g) {
                objC = null;
            }
            FileInputStream fileInputStream = (FileInputStream) objC;
            if (fileInputStream != null) {
                String filePath = file.getAbsolutePath();
                n.e(filePath, "filePath");
                return new WebResourceResponse(StringExtensionsKt.guessMimeType(filePath), null, fileInputStream);
            }
        }
        return null;
    }

    private final WebResourceResponse getNotFoundResponse() {
        return new WebResourceResponse("text/html", B5.O, InterfaceC0435l1.a.b.f29084d, "Not Found", w.f53867a, new ByteArrayInputStream(new byte[0]));
    }

    public static /* synthetic */ WebResourceResponse invoke$default(GetCachedAsset getCachedAsset, Uri uri, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        return getCachedAsset.invoke(uri, str);
    }

    private final WebResourceResponse tryGetWebViewAsset(Uri uri, String webviewType) {
        Object objC;
        File file;
        Object objC2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(webviewType);
        sb2.append('/');
        String string = uri.toString();
        n.e(string, "uri.toString()");
        sb2.append(h.O0(h.Q0(string, "?"), "/"));
        String string2 = sb2.toString();
        File file2 = this.cacheWebViewAssets.getCached().get(string2);
        if (file2 != null) {
            try {
                objC = new FileInputStream(file2);
            } catch (Throwable th2) {
                objC = e.c(th2);
            }
            if (objC instanceof g) {
                objC = null;
            }
            FileInputStream fileInputStream = (FileInputStream) objC;
            if (fileInputStream != null) {
                return new WebResourceResponse(StringExtensionsKt.guessMimeType(string2), null, fileInputStream);
            }
        } else {
            String string3 = uri.toString();
            n.e(string3, "uri.toString()");
            CacheResult cacheResult = (CacheResult) d0.C(l.f3620a, new GetCachedAsset$tryGetWebViewAsset$result$1(this, this.getAssetFileName.invoke(string3), null));
            if ((cacheResult instanceof CacheResult.Success) && (file = ((CacheResult.Success) cacheResult).getCachedFile().getFile()) != null) {
                try {
                    objC2 = new FileInputStream(file);
                } catch (Throwable th3) {
                    objC2 = e.c(th3);
                }
                if (objC2 instanceof g) {
                    objC2 = null;
                }
                FileInputStream fileInputStream2 = (FileInputStream) objC2;
                if (fileInputStream2 != null) {
                    String filePath = file.getAbsolutePath();
                    n.e(filePath, "filePath");
                    return new WebResourceResponse(StringExtensionsKt.guessMimeType(filePath), null, 200, "OK", b0.P(new f("Access-Control-Allow-Origin", "*")), fileInputStream2);
                }
            }
        }
        return null;
    }

    public final WebResourceResponse invoke(Uri uri, String webviewType) {
        n.f(uri, "uri");
        n.f(webviewType, "webviewType");
        boolean disableCustomScheme = this.sessionRepository.getFeatureFlags().getDisableCustomScheme();
        String host = uri.getHost();
        if (host != null) {
            int iHashCode = host.hashCode();
            if (iHashCode != -1921537799) {
                if (iHashCode == -1920242293 && host.equals(UnityAdsConstants.DefaultUrls.AD_CACHE_DOMAIN)) {
                    return disableCustomScheme ? tryGetWebViewAsset(uri, webviewType) : getLegacyCachedAsset(uri);
                }
            } else if (host.equals(UnityAdsConstants.DefaultUrls.AD_ASSET_DOMAIN)) {
                return getBundledAsset(uri);
            }
        }
        return tryGetWebViewAsset(uri, webviewType);
    }
}
