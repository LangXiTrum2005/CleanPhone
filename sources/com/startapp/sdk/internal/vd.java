package com.startapp.sdk.internal;

import android.content.Context;
import android.webkit.WebView;
import com.iab.omid.library.startio.Omid;
import com.iab.omid.library.startio.adsession.AdEvents;
import com.iab.omid.library.startio.adsession.AdSession;
import com.iab.omid.library.startio.adsession.AdSessionConfiguration;
import com.iab.omid.library.startio.adsession.AdSessionContext;
import com.iab.omid.library.startio.adsession.CreativeType;
import com.iab.omid.library.startio.adsession.ImpressionType;
import com.iab.omid.library.startio.adsession.Owner;
import com.iab.omid.library.startio.adsession.Partner;
import com.iab.omid.library.startio.adsession.media.MediaEvents;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class vd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdSession f41579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdEvents f41580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaEvents f41581c;
    public final AtomicBoolean d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f41582e = new AtomicBoolean();

    public vd(WebView webView) {
        AdSession adSessionCreateAdSession;
        AdEvents adEventsCreateAdEvents;
        try {
            Context context = webView.getContext();
            try {
                if (!Omid.isActive()) {
                    Omid.activate(context);
                }
                adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.VIEWABLE, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(Partner.createPartner("Startio", "5.2.4"), webView, null, ""));
            } catch (Throwable th) {
                g9.a(th);
                adSessionCreateAdSession = null;
            }
        } catch (Throwable th2) {
            g9.a(th2);
            adSessionCreateAdSession = null;
        }
        this.f41579a = adSessionCreateAdSession;
        webView.getContext();
        if (adSessionCreateAdSession != null) {
            try {
                adEventsCreateAdEvents = AdEvents.createAdEvents(adSessionCreateAdSession);
            } catch (Throwable th3) {
                g9.a(th3);
                adEventsCreateAdEvents = null;
            }
        } else {
            adEventsCreateAdEvents = null;
        }
        this.f41580b = adEventsCreateAdEvents;
        this.f41581c = null;
    }

    public final void a() {
        if (this.f41580b == null || !this.d.compareAndSet(false, true)) {
            return;
        }
        this.f41580b.impressionOccurred();
    }

    public vd(Context context, List list, boolean z2) {
        AdSession adSessionA;
        AdEvents adEventsCreateAdEvents;
        MediaEvents mediaEventsCreateMediaEvents = null;
        try {
            adSessionA = e0.a(context, list, z2);
        } catch (Throwable th) {
            g9.a(th);
            adSessionA = null;
        }
        this.f41579a = adSessionA;
        if (adSessionA != null) {
            try {
                adEventsCreateAdEvents = AdEvents.createAdEvents(adSessionA);
            } catch (Throwable th2) {
                g9.a(th2);
                adEventsCreateAdEvents = null;
            }
        } else {
            adEventsCreateAdEvents = null;
        }
        this.f41580b = adEventsCreateAdEvents;
        if (z2 && adSessionA != null) {
            try {
                mediaEventsCreateMediaEvents = MediaEvents.createMediaEvents(adSessionA);
            } catch (Throwable th3) {
                g9.a(th3);
            }
        }
        this.f41581c = mediaEventsCreateMediaEvents;
    }
}
