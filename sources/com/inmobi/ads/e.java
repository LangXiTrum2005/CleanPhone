package com.inmobi.ads;

import com.inmobi.media.AbstractC3048h7;
import com.inmobi.media.H1;
import com.inmobi.media.O1;
import com.inmobi.media.R1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements PreloadManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O1 f22653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InMobiBanner f22654b;

    public e(InMobiBanner inMobiBanner) {
        this.f22654b = inMobiBanner;
        this.f22653a = new O1(inMobiBanner);
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void load() {
        try {
            R1 mAdManager = this.f22654b.getMAdManager();
            if (mAdManager != null) {
                mAdManager.G();
            }
        } catch (IllegalStateException e2) {
            String strAccess$getTAG$cp = InMobiBanner.access$getTAG$cp();
            Intrinsics.e(strAccess$getTAG$cp, "access$getTAG$cp(...)");
            AbstractC3048h7.a((byte) 1, strAccess$getTAG$cp, e2.getMessage());
            H1 mPubListener = this.f22654b.getMPubListener();
            if (mPubListener != null) {
                mPubListener.a(this.f22654b, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        }
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void preload() {
        this.f22654b.setEnableAutoRefresh(false);
        this.f22654b.a(this.f22653a, "Preload", false);
    }
}
