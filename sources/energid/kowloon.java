package energid;

import android.webkit.SafeBrowsingResponse;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: compiled from: SafeBrowsingResponseImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class kowloon extends http.marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public SafeBrowsingResponse f25853attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public SafeBrowsingResponseBoundaryInterface f25854saneness;

    public kowloon(InvocationHandler invocationHandler) {
        this.f25854saneness = (SafeBrowsingResponseBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    @Override // http.marial
    public void attabal(boolean z) {
        attabal.beachfront beachfrontVar = adultoid.f25751cord;
        if (beachfrontVar.saneness()) {
            marial.attabal(dern(), z);
        } else {
            if (!beachfrontVar.dern()) {
                throw adultoid.attabal();
            }
            saneness().showInterstitial(z);
        }
    }

    public final SafeBrowsingResponse dern() {
        if (this.f25853attabal == null) {
            this.f25853attabal = dovishness.dern().attabal(Proxy.getInvocationHandler(this.f25854saneness));
        }
        return this.f25853attabal;
    }

    public final SafeBrowsingResponseBoundaryInterface saneness() {
        if (this.f25854saneness == null) {
            this.f25854saneness = (SafeBrowsingResponseBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(SafeBrowsingResponseBoundaryInterface.class, dovishness.dern().saneness(this.f25853attabal));
        }
        return this.f25854saneness;
    }

    public kowloon(SafeBrowsingResponse safeBrowsingResponse) {
        this.f25853attabal = safeBrowsingResponse;
    }
}
