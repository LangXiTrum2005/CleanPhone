package org.chromium.support_lib_boundary;

import android.os.CancellationSignal;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public interface ProfileBoundaryInterface {
    void addOriginMatchedHeader(String str, String str2, Set<String> set);

    void addQuicHints(Set<String> set);

    void clearAllOriginMatchedHeaders();

    @Deprecated
    void clearOriginMatchedHeader(String str);

    void clearOriginMatchedHeader(String str, String str2);

    void clearPrefetch(String str, Executor executor, InvocationHandler invocationHandler);

    CookieManager getCookieManager();

    GeolocationPermissions getGeoLocationPermissions();

    String getName();

    List<InvocationHandler> getOriginMatchedHeaders(String str, String str2);

    ServiceWorkerController getServiceWorkerController();

    WebStorage getWebStorage();

    boolean hasOriginMatchedHeader(String str);

    void preconnect(String str);

    void prefetchUrl(String str, CancellationSignal cancellationSignal, Executor executor, InvocationHandler invocationHandler);

    void prefetchUrl(String str, CancellationSignal cancellationSignal, Executor executor, InvocationHandler invocationHandler, InvocationHandler invocationHandler2);

    @Deprecated
    void setOriginMatchedHeader(String str, String str2, Set<String> set);

    void setSpeculativeLoadingConfig(InvocationHandler invocationHandler);

    void warmUpRendererProcess();
}
