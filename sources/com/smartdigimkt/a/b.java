package com.smartdigimkt.a;

import android.view.View;
import com.iab.omid.library.toponad.adsession.AdEvents;
import com.iab.omid.library.toponad.adsession.AdSession;
import com.iab.omid.library.toponad.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.toponad.adsession.media.MediaEvents;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class b implements com.smartdigimkt.k5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33562a = "b";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AdSession f33563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AdEvents f33564c;
    private MediaEvents d;

    public b(AdSession adSession, boolean z2) {
        this.f33563b = adSession;
        this.f33564c = AdEvents.createAdEvents(adSession);
        if (z2) {
            this.d = MediaEvents.createMediaEvents(this.f33563b);
        }
    }

    @Override // com.smartdigimkt.k5.b
    public void a() {
        AdSession adSession = this.f33563b;
        if (adSession != null) {
            adSession.finish();
        }
    }

    @Override // com.smartdigimkt.k5.b
    public void b(View view) {
        AdSession adSession = this.f33563b;
        if (adSession == null || view == null) {
            return;
        }
        adSession.registerAdView(view);
    }

    @Override // com.smartdigimkt.k5.b
    public com.smartdigimkt.k5.a c() {
        AdEvents adEvents;
        if (this.f33563b == null || (adEvents = this.f33564c) == null) {
            return null;
        }
        return new a(adEvents);
    }

    @Override // com.smartdigimkt.k5.b
    public void start() {
        AdSession adSession = this.f33563b;
        if (adSession != null) {
            adSession.start();
        }
    }

    @Override // com.smartdigimkt.k5.b
    public void a(View view) {
        AdSession adSession = this.f33563b;
        if (adSession == null || view == null) {
            return;
        }
        adSession.addFriendlyObstruction(view, FriendlyObstructionPurpose.CLOSE_AD, null);
    }

    @Override // com.smartdigimkt.k5.b
    public com.smartdigimkt.k5.c b() {
        MediaEvents mediaEvents;
        if (this.f33563b == null || (mediaEvents = this.d) == null) {
            return null;
        }
        return new c(mediaEvents);
    }

    @Override // com.smartdigimkt.k5.b
    public void a(List<View> list) {
        if (list != null) {
            list.size();
        }
        if (this.f33563b == null || list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f33563b.addFriendlyObstruction(list.get(i2), FriendlyObstructionPurpose.OTHER, null);
        }
    }
}
