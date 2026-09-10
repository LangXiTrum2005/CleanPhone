package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.TextUtils;
import android.webkit.WebView;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.eS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3345eS implements Al0 {
    public static final C3168cS Companion = new C3168cS(null);
    private static final long DESTROY_DELAY_MS = TimeUnit.SECONDS.toMillis(1);
    private M2 adSession;
    private final boolean enabled;
    private boolean started;

    public /* synthetic */ C3345eS(boolean z, AbstractC2471Hm abstractC2471Hm) {
        this(z);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Al0
    public void onPageFinished(WebView webView) {
        AbstractC2995aW.q(webView, "webView");
        if (this.started && this.adSession == null) {
            EnumC5130yk enumC5130yk = EnumC5130yk.DEFINED_BY_JAVASCRIPT;
            SC sc = SC.DEFINED_BY_JAVASCRIPT;
            EnumC3434fT enumC3434fT = EnumC3434fT.JAVASCRIPT;
            Y60 y60A = Y60.a(enumC5130yk, sc, enumC3434fT, enumC3434fT);
            if (TextUtils.isEmpty("Vungle")) {
                throw new IllegalArgumentException("Name is null or empty");
            }
            if (TextUtils.isEmpty("7.4.3")) {
                throw new IllegalArgumentException("Version is null or empty");
            }
            Jm0 jm0A = M2.a(y60A, new TN(new Ig0("Vungle", "7.4.3", 3), webView, null, null, R2.HTML));
            this.adSession = jm0A;
            jm0A.c(webView);
            M2 m2 = this.adSession;
            if (m2 != null) {
                m2.d();
            }
        }
    }

    public final void start() {
        if (this.enabled && AbstractC2340Cl.e.b()) {
            this.started = true;
        }
    }

    public final long stop() {
        long j;
        M2 m2;
        if (!this.started || (m2 = this.adSession) == null) {
            j = 0;
        } else {
            if (m2 != null) {
                m2.b();
            }
            j = DESTROY_DELAY_MS;
        }
        this.started = false;
        this.adSession = null;
        return j;
    }

    private C3345eS(boolean z) {
        this.enabled = z;
    }
}
