package com.iab.omid.library.bigosg.adsession.video;

import com.iab.omid.library.bigosg.d.e;

/* JADX INFO: loaded from: classes3.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f21645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f21646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21647c;
    private final Position d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.bigosg.adsession.media.VastProperties f21648e;

    private VastProperties(boolean z2, Float f, boolean z3, Position position, com.iab.omid.library.bigosg.adsession.media.VastProperties vastProperties) {
        this.f21645a = z2;
        this.f21646b = f;
        this.f21647c = z3;
        this.d = position;
        this.f21648e = vastProperties;
    }

    public static VastProperties createVastPropertiesForNonSkippableVideo(boolean z2, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(false, null, z2, position, com.iab.omid.library.bigosg.adsession.media.VastProperties.createVastPropertiesForNonSkippableMedia(z2, com.iab.omid.library.bigosg.adsession.media.Position.valueOf(position.toString().toUpperCase())));
    }

    public static VastProperties createVastPropertiesForSkippableVideo(float f, boolean z2, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z2, position, com.iab.omid.library.bigosg.adsession.media.VastProperties.createVastPropertiesForSkippableMedia(f, z2, com.iab.omid.library.bigosg.adsession.media.Position.valueOf(position.toString().toUpperCase())));
    }

    public final com.iab.omid.library.bigosg.adsession.media.VastProperties a() {
        return this.f21648e;
    }

    public final Position getPosition() {
        return this.d;
    }

    public final Float getSkipOffset() {
        return this.f21646b;
    }

    public final boolean isAutoPlay() {
        return this.f21647c;
    }

    public final boolean isSkippable() {
        return this.f21645a;
    }
}
