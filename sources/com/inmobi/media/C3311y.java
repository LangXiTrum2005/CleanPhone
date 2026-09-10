package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3311y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdEvents f24111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaEvents f24112b;

    public C3311y(AdSession adSession, String str) {
        Intrinsics.f(adSession, "adSession");
        if (!Intrinsics.a(str, "native_video_ad")) {
            this.f24111a = AdEvents.createAdEvents(adSession);
        } else {
            this.f24112b = MediaEvents.createMediaEvents(adSession);
            this.f24111a = AdEvents.createAdEvents(adSession);
        }
    }
}
