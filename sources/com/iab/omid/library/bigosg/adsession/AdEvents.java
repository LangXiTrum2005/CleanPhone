package com.iab.omid.library.bigosg.adsession;

import com.iab.omid.library.bigosg.adsession.media.VastProperties;
import com.iab.omid.library.bigosg.d.e;

/* JADX INFO: loaded from: classes3.dex */
public final class AdEvents {
    private final a adSession;

    private AdEvents(a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession) {
        a aVar = (a) adSession;
        e.a(adSession, "AdSession is null");
        e.d(aVar);
        e.b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().a(adEvents);
        return adEvents;
    }

    public final void impressionOccurred() {
        e.b(this.adSession);
        e.f(this.adSession);
        if (!this.adSession.e()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.e()) {
            this.adSession.b();
        }
    }

    public final void loaded() {
        e.c(this.adSession);
        e.f(this.adSession);
        this.adSession.c();
    }

    public final void loaded(VastProperties vastProperties) {
        e.c(this.adSession);
        e.f(this.adSession);
        this.adSession.a(vastProperties.a());
    }
}
