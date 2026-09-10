package webby;

import android.webkit.WebView;
import com.iab.omid.library.vungle.Omid;
import com.iab.omid.library.vungle.adsession.AdSession;
import com.iab.omid.library.vungle.adsession.AdSessionConfiguration;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.CreativeType;
import com.iab.omid.library.vungle.adsession.ImpressionType;
import com.iab.omid.library.vungle.adsession.Owner;
import com.iab.omid.library.vungle.adsession.Partner;
import com.ironsource.L6;
import com.ironsource.X3;
import com.vungle.ads.cutely;
import java.util.concurrent.TimeUnit;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OMTracker.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0017B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lwebby/dern;", "Lwebby/wireman;", "", "enabled", "<init>", "(Z)V", "", "start", "()V", "", "stop", "()J", "Landroid/webkit/WebView;", "webView", "onPageFinished", "(Landroid/webkit/WebView;)V", "Z", X3.i.d0, "Lcom/iab/omid/library/vungle/adsession/AdSession;", "adSession", "Lcom/iab/omid/library/vungle/adsession/AdSession;", "Companion", "attabal", "saneness", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class dern implements wireman {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long DESTROY_DELAY_MS = TimeUnit.SECONDS.toMillis(1);
    private AdSession adSession;
    private final boolean enabled;
    private boolean started;

    /* JADX INFO: renamed from: webby.dern$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: OMTracker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lwebby/dern$attabal;", "", "<init>", "()V", "", "DESTROY_DELAY_MS", "J", "getDESTROY_DELAY_MS", "()J", "getDESTROY_DELAY_MS$annotations", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getDESTROY_DELAY_MS() {
            return dern.DESTROY_DELAY_MS;
        }

        private Companion() {
        }

        public static /* synthetic */ void getDESTROY_DELAY_MS$annotations() {
        }
    }

    /* JADX INFO: compiled from: OMTracker.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwebby/dern$saneness;", "", "<init>", "()V", "", "enabled", "Lwebby/dern;", L6.t, "(Z)Lwebby/dern;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class saneness {
        public final dern make(boolean enabled) {
            return new dern(enabled, null);
        }
    }

    public /* synthetic */ dern(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    @Override // webby.wireman
    public void onPageFinished(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        if (this.started && this.adSession == null) {
            CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
            ImpressionType impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
            Owner owner = Owner.JAVASCRIPT;
            AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false), AdSessionContext.createHtmlAdSessionContext(Partner.createPartner(cutely.OMSDK_PARTNER_NAME, cutely.VERSION_NAME), webView, null, null));
            this.adSession = adSessionCreateAdSession;
            if (adSessionCreateAdSession != null) {
                adSessionCreateAdSession.registerAdView(webView);
            }
            AdSession adSession = this.adSession;
            if (adSession != null) {
                adSession.start();
            }
        }
    }

    public final void start() {
        if (this.enabled && Omid.isActive()) {
            this.started = true;
        }
    }

    public final long stop() {
        long j;
        AdSession adSession;
        if (!this.started || (adSession = this.adSession) == null) {
            j = 0;
        } else {
            if (adSession != null) {
                adSession.finish();
            }
            j = DESTROY_DELAY_MS;
        }
        this.started = false;
        this.adSession = null;
        return j;
    }

    private dern(boolean z) {
        this.enabled = z;
    }
}
