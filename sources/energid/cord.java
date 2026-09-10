package energid;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: compiled from: WebViewStartUpCallbackAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class cord implements WebViewStartUpCallbackBoundaryInterface {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final http.kowloon.dern f25836attabal;

    /* JADX INFO: compiled from: WebViewStartUpCallbackAdapter.java */
    public class attabal implements http.polloi {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final List<http.beachfront> f25837attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ List f25839dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final /* synthetic */ WebViewStartUpResultBoundaryInterface f25840marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final List<http.beachfront> f25841saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ List f25842wireman;

        public attabal(List list, List list2, WebViewStartUpResultBoundaryInterface webViewStartUpResultBoundaryInterface) {
            this.f25839dern = list;
            this.f25842wireman = list2;
            this.f25840marial = webViewStartUpResultBoundaryInterface;
            this.f25837attabal = list;
            this.f25841saneness = list2;
        }

        @Override // http.polloi
        public List<http.beachfront> attabal() {
            return this.f25837attabal;
        }

        @Override // http.polloi
        public Long getMaxTimePerTaskInUiThreadMillis() {
            return this.f25840marial.getMaxTimePerTaskInUiThreadMillis();
        }

        @Override // http.polloi
        public Long getTotalTimeInUiThreadMillis() {
            return this.f25840marial.getTotalTimeInUiThreadMillis();
        }

        @Override // http.polloi
        public List<http.beachfront> saneness() {
            return this.f25841saneness;
        }
    }

    /* JADX INFO: compiled from: WebViewStartUpCallbackAdapter.java */
    public static class saneness implements http.beachfront {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Throwable f25843attabal;

        public saneness(Throwable th) {
            this.f25843attabal = th;
        }

        @Override // http.beachfront
        public String attabal() {
            StringWriter stringWriter = new StringWriter();
            this.f25843attabal.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }
    }

    public cord(http.kowloon.dern dernVar) {
        this.f25836attabal = dernVar;
    }

    public final List<http.beachfront> attabal(List<Throwable> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Throwable> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new saneness(it.next()));
        }
        return arrayList;
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface
    public void onSuccess(InvocationHandler invocationHandler) {
        WebViewStartUpResultBoundaryInterface webViewStartUpResultBoundaryInterface = (WebViewStartUpResultBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewStartUpResultBoundaryInterface.class, invocationHandler);
        Objects.requireNonNull(webViewStartUpResultBoundaryInterface);
        this.f25836attabal.onSuccess(saneness(webViewStartUpResultBoundaryInterface));
    }

    public final http.polloi saneness(WebViewStartUpResultBoundaryInterface webViewStartUpResultBoundaryInterface) {
        return new attabal(attabal(webViewStartUpResultBoundaryInterface.getBlockingStartUpLocations()), adultoid.f25821underbelly.dern() ? attabal(webViewStartUpResultBoundaryInterface.getAsyncStartUpLocations()) : null, webViewStartUpResultBoundaryInterface);
    }
}
