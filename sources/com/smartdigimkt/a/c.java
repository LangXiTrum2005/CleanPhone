package com.smartdigimkt.a;

import com.iab.omid.library.toponad.adsession.media.InteractionType;
import com.iab.omid.library.toponad.adsession.media.MediaEvents;

/* JADX INFO: loaded from: classes5.dex */
public class c implements com.smartdigimkt.k5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    MediaEvents f33565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f33566b = a.UNKNOWN;

    public enum a {
        UNKNOWN,
        START,
        FIRST,
        SECOND,
        THIRD
    }

    public c(MediaEvents mediaEvents) {
        this.f33565a = mediaEvents;
    }

    @Override // com.smartdigimkt.k5.c
    public void a(float f, float f2) {
        a aVar;
        if (this.f33565a == null || (aVar = a.START) == this.f33566b || aVar.ordinal() <= this.f33566b.ordinal()) {
            return;
        }
        this.f33565a.start(f, f2);
        this.f33566b = aVar;
    }

    @Override // com.smartdigimkt.k5.c
    public void b() {
        MediaEvents mediaEvents = this.f33565a;
        if (mediaEvents != null) {
            mediaEvents.bufferStart();
        }
    }

    @Override // com.smartdigimkt.k5.c
    public void c() {
        a aVar;
        if (this.f33565a == null || (aVar = a.FIRST) == this.f33566b || aVar.ordinal() <= this.f33566b.ordinal()) {
            return;
        }
        this.f33565a.firstQuartile();
        this.f33566b = aVar;
    }

    @Override // com.smartdigimkt.k5.c
    public void d() {
        MediaEvents mediaEvents = this.f33565a;
        if (mediaEvents != null) {
            mediaEvents.complete();
        }
    }

    @Override // com.smartdigimkt.k5.c
    public void e() {
        a aVar;
        if (this.f33565a == null || (aVar = a.SECOND) == this.f33566b || aVar.ordinal() <= this.f33566b.ordinal()) {
            return;
        }
        this.f33565a.midpoint();
        this.f33566b = aVar;
    }

    @Override // com.smartdigimkt.k5.c
    public void f() {
        a aVar;
        if (this.f33565a == null || (aVar = a.THIRD) == this.f33566b || aVar.ordinal() <= this.f33566b.ordinal()) {
            return;
        }
        this.f33565a.thirdQuartile();
        this.f33566b = aVar;
    }

    @Override // com.smartdigimkt.k5.c
    public void g() {
        MediaEvents mediaEvents = this.f33565a;
        if (mediaEvents != null) {
            mediaEvents.bufferFinish();
        }
    }

    @Override // com.smartdigimkt.k5.c
    public void h() {
        MediaEvents mediaEvents = this.f33565a;
        if (mediaEvents != null) {
            mediaEvents.adUserInteraction(InteractionType.CLICK);
        }
    }

    @Override // com.smartdigimkt.k5.c
    public void pause() {
        MediaEvents mediaEvents = this.f33565a;
        if (mediaEvents != null) {
            mediaEvents.pause();
        }
    }

    @Override // com.smartdigimkt.k5.c
    public void resume() {
        MediaEvents mediaEvents = this.f33565a;
        if (mediaEvents != null) {
            mediaEvents.resume();
        }
    }

    @Override // com.smartdigimkt.k5.c
    public void a() {
        MediaEvents mediaEvents = this.f33565a;
        if (mediaEvents != null) {
            mediaEvents.skipped();
        }
    }

    @Override // com.smartdigimkt.k5.c
    public void a(float f) {
        MediaEvents mediaEvents = this.f33565a;
        if (mediaEvents != null) {
            mediaEvents.volumeChange(f);
        }
    }
}
