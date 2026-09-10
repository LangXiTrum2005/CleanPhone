package com.inmobi.ads;

import android.content.Context;
import com.inmobi.media.AbstractC3048h7;
import com.inmobi.media.C3143n6;
import com.inmobi.media.C3159o6;
import com.inmobi.media.Wa;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements PreloadManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3143n6 f22655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InMobiInterstitial f22656b;

    public f(InMobiInterstitial inMobiInterstitial) {
        this.f22656b = inMobiInterstitial;
        this.f22655a = new C3143n6(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void load() {
        try {
            this.f22656b.getMAdManager$media_release().D();
        } catch (IllegalStateException e2) {
            String strAccess$getTAG$cp = InMobiInterstitial.access$getTAG$cp();
            Intrinsics.e(strAccess$getTAG$cp, "access$getTAG$cp(...)");
            AbstractC3048h7.a((byte) 1, strAccess$getTAG$cp, e2.getMessage());
            this.f22656b.getMPubListener$media_release().a(this.f22656b, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void preload() {
        this.f22656b.f22635b = true;
        this.f22656b.d.f23325e = "Preload";
        C3159o6 mAdManager$media_release = this.f22656b.getMAdManager$media_release();
        Wa wa = this.f22656b.d;
        Context context = this.f22656b.f22634a;
        if (context == null) {
            Intrinsics.m("mContext");
            throw null;
        }
        C3159o6.a(mAdManager$media_release, wa, context, false, null, 12, null);
        this.f22656b.getMAdManager$media_release().c(this.f22655a);
    }
}
