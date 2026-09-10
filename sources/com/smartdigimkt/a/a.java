package com.smartdigimkt.a;

import com.iab.omid.library.toponad.adsession.AdEvents;
import com.iab.omid.library.toponad.adsession.media.Position;
import com.iab.omid.library.toponad.adsession.media.VastProperties;

/* JADX INFO: loaded from: classes5.dex */
public class a implements com.smartdigimkt.k5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33560a = "a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AdEvents f33561b;

    public a(AdEvents adEvents) {
        this.f33561b = adEvents;
    }

    @Override // com.smartdigimkt.k5.a
    public void a() {
        AdEvents adEvents = this.f33561b;
        if (adEvents != null) {
            adEvents.impressionOccurred();
        }
    }

    @Override // com.smartdigimkt.k5.a
    public void a(boolean z2) {
        AdEvents adEvents = this.f33561b;
        if (adEvents != null) {
            if (z2) {
                this.f33561b.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
            } else {
                adEvents.loaded();
            }
        }
    }
}
