package http;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebSettings;
import android.webkit.WebView;
import energid.adultoid;
import energid.dovishness;
import energid.gintrap;
import energid.rotuma;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: compiled from: WebViewCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class kowloon {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Uri f28007attabal = Uri.parse("*");

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Uri f28009saneness = Uri.parse("");

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final WeakHashMap<WebView, gintrap> f28008dern = new WeakHashMap<>();

    /* JADX INFO: compiled from: WebViewCompat.java */
    public static class attabal implements polloi {
        public attabal() {
        }

        @Override // http.polloi
        public List<beachfront> attabal() {
            return null;
        }

        @Override // http.polloi
        public Long getMaxTimePerTaskInUiThreadMillis() {
            return null;
        }

        @Override // http.polloi
        public Long getTotalTimeInUiThreadMillis() {
            return null;
        }

        @Override // http.polloi
        public List<beachfront> saneness() {
            return null;
        }

        public /* synthetic */ attabal(triweekly triweeklyVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: WebViewCompat.java */
    public interface dern {
        void onSuccess(polloi polloiVar);
    }

    /* JADX INFO: compiled from: WebViewCompat.java */
    public interface saneness {
        void onPostMessage(WebView webView, competently competentlyVar, Uri uri, boolean z, http.attabal attabalVar);
    }

    public static String apical() {
        if (adultoid.f25757dent.dern()) {
            return impromptu().getStatics().getVariationsHeader();
        }
        throw adultoid.attabal();
    }

    public static void arytenoidectomy(final Context context, final monoploid monoploidVar, final dern dernVar) {
        monoploidVar.attabal().execute(new Runnable() { // from class: http.cutely
            @Override // java.lang.Runnable
            public final void run() {
                kowloon.saneness(monoploidVar, dernVar, context);
            }
        });
    }

    public static WebViewProviderBoundaryInterface beachfront(WebView webView) {
        return impromptu().createWebView(webView);
    }

    public static PackageInfo competently() {
        if (Build.VERSION.SDK_INT >= 26) {
            return energid.dern.attabal();
        }
        try {
            return taiyuan();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static gintrap cutely(WebView webView) {
        if (!adultoid.f25778lightstruck.dern()) {
            return new gintrap(beachfront(webView));
        }
        WeakHashMap<WebView, gintrap> weakHashMap = f28008dern;
        gintrap gintrapVar = weakHashMap.get(webView);
        if (gintrapVar != null) {
            return gintrapVar;
        }
        gintrap gintrapVar2 = new gintrap(beachfront(webView));
        weakHashMap.put(webView, gintrapVar2);
        return gintrapVar2;
    }

    public static boolean formularize() {
        if (adultoid.f25823walach.dern()) {
            return impromptu().getStatics().isMultiProcessEnabled();
        }
        throw adultoid.attabal();
    }

    public static void impassible(WebView webView, String str) {
        if (!adultoid.f25810splinterproof.dern()) {
            throw adultoid.attabal();
        }
        cutely(webView).saneness(str);
    }

    public static rotuma impromptu() {
        return dovishness.wireman();
    }

    public static void kowloon(WebView webView, String str) {
        if (!adultoid.f25817treadless.dern()) {
            throw adultoid.attabal();
        }
        cutely(webView).wireman(str);
    }

    public static void marial(WebView webView, String str, Set<String> set, saneness sanenessVar) {
        if (!adultoid.f25810splinterproof.dern()) {
            throw adultoid.attabal();
        }
        cutely(webView).attabal(str, (String[]) set.toArray(new String[0]), sanenessVar);
    }

    public static /* synthetic */ void saneness(monoploid monoploidVar, final dern dernVar, Context context) {
        dovishness.marial();
        if (adultoid.f25808sensatory.dern()) {
            impromptu().attabal(monoploidVar, new dern() { // from class: http.apical
                @Override // http.kowloon.dern
                public final void onSuccess(polloi polloiVar) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: http.impassible
                        @Override // java.lang.Runnable
                        public final void run() {
                            dernVar.onSuccess(polloiVar);
                        }
                    });
                }
            });
            return;
        }
        if (monoploidVar.dern()) {
            WebSettings.getDefaultUserAgent(context.getApplicationContext());
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: http.formularize
            @Override // java.lang.Runnable
            public final void run() {
                dernVar.onSuccess(new kowloon.attabal(null));
            }
        });
    }

    public static PackageInfo taiyuan() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static void triweekly(WebView webView, boolean z) {
        if (!adultoid.f25777lerp.dern()) {
            throw adultoid.attabal();
        }
        cutely(webView).dern(z);
    }
}
