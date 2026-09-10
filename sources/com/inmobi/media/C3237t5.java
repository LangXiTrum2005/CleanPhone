package com.inmobi.media;

import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.controllers.PublisherCallbacks;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.t5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3237t5 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InMobiBanner f24005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PublisherCallbacks f24006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f24007c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3237t5(InMobiBanner inMobiBanner, PublisherCallbacks publisherCallbacks, boolean z2) {
        super(0);
        this.f24005a = inMobiBanner;
        this.f24006b = publisherCallbacks;
        this.f24007c = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        R1 mAdManager;
        this.f24005a.a();
        if (InMobiBanner.access$checkForRefreshRate(this.f24005a) && (mAdManager = this.f24005a.getMAdManager()) != null) {
            mAdManager.a(this.f24006b, this.f24005a.getFrameSizeString(), this.f24007c);
        }
        return Unit.f43263a;
    }
}
