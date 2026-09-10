package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3376ye implements InterfaceC2830cj, InterfaceC3204rh, InterfaceC2887f {
    public final View a;
    public final MediaView b;
    public final C3230si c;
    public final AbstractC2863e1 d;
    public final D4 e;
    public final Nc f;
    public final Ec g;
    public final Jc h;

    public C3376ye(View view, MediaView mediaView, C3230si renderedStateCache, AbstractC2863e1 adSessionManager, D4 contextualDataHandler, Nc nativeBeaconProcessor, Ec nativeAdUnitComponent, Jc stateMachine) {
        Intrinsics.checkNotNullParameter(renderedStateCache, "renderedStateCache");
        Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        Intrinsics.checkNotNullParameter(contextualDataHandler, "contextualDataHandler");
        Intrinsics.checkNotNullParameter(nativeBeaconProcessor, "nativeBeaconProcessor");
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.a = view;
        this.b = mediaView;
        this.c = renderedStateCache;
        this.d = adSessionManager;
        this.e = contextualDataHandler;
        this.f = nativeBeaconProcessor;
        this.g = nativeAdUnitComponent;
        this.h = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC2830cj
    public final void a() {
        Gh gh;
        C3097n9 c3097n9 = this.g.a.a.c;
        if (c3097n9 == null || (gh = c3097n9.a) == null) {
            return;
        }
        gh.a();
    }

    @Override // com.inmobi.media.InterfaceC3204rh
    public final void a(InMobiNativeViewData nativeViewData) {
        Intrinsics.checkNotNullParameter(nativeViewData, "nativeViewData");
        this.h.a(new C3251te(new C3276ue(this.c, new Sg(nativeViewData, this.b, this.a), this.e, this.d, this.f, this.g), this.h), this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (r9.a(r2, r8, r0) == r1) goto L33;
     */
    @Override // com.inmobi.media.InterfaceC2887f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(wretchedly.dern r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.inmobi.media.C3326we
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.we r0 = (com.inmobi.media.C3326we) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L1a
        L13:
            com.inmobi.media.we r0 = new com.inmobi.media.we
            kotlin.coroutines.jvm.internal.ContinuationImpl r9 = (p002kotlin.coroutines.jvm.internal.ContinuationImpl) r9
            r0.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r0.a
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            p002kotlin.dern.saneness(r9)
            goto La7
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            p002kotlin.dern.saneness(r9)
            goto L92
        L3b:
            p002kotlin.dern.saneness(r9)
            com.inmobi.media.e1 r9 = r8.d
            com.iab.omid.library.inmobi.adsession.AdSession r2 = r9.c
            r5 = 0
            if (r2 != 0) goto L53
            com.inmobi.media.m9 r9 = r9.b
            if (r9 == 0) goto L6a
            java.lang.String r2 = com.inmobi.media.AbstractC2863e1.f
            com.inmobi.media.n9 r9 = (com.inmobi.media.C3097n9) r9
            java.lang.String r6 = "Failed to stopAdSession. adSession is null"
            r9.a(r2, r6)
            goto L6a
        L53:
            com.inmobi.media.m9 r2 = r9.b
            if (r2 == 0) goto L60
            java.lang.String r6 = com.inmobi.media.AbstractC2863e1.f
            com.inmobi.media.n9 r2 = (com.inmobi.media.C3097n9) r2
            java.lang.String r7 = "stopAdSession"
            r2.a(r6, r7)
        L60:
            kotlinx.coroutines.saran r2 = r9.a
            com.inmobi.media.c1 r6 = new com.inmobi.media.c1
            r6.<init>(r9, r5)
            com.inmobi.media.P4.a(r2, r6)
        L6a:
            com.inmobi.media.Ec r9 = r8.g
            patroclinal.taiyuan r9 = r9.g
            java.lang.Object r9 = r9.getValue()
            com.inmobi.media.lc r9 = (com.inmobi.media.C3050lc) r9
            r0.c = r4
            r9.getClass()
            kotlinx.coroutines.technofreak r2 = kotlinx.coroutines.premeiotic.dern()
            com.inmobi.media.jc r4 = new com.inmobi.media.jc
            r4.<init>(r9, r5)
            java.lang.Object r9 = kotlinx.coroutines.impromptu.competently(r2, r4, r0)
            java.lang.Object r2 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            if (r9 != r2) goto L8d
            goto L8f
        L8d:
            kotlin.Unit r9 = p002kotlin.Unit.f29295attabal
        L8f:
            if (r9 != r1) goto L92
            goto La6
        L92:
            com.inmobi.media.D4 r9 = r8.e
            r9.b()
            com.inmobi.media.Jc r9 = r8.h
            com.inmobi.media.Vc r2 = new com.inmobi.media.Vc
            r2.<init>()
            r0.c = r3
            java.lang.Object r9 = r9.a(r2, r8, r0)
            if (r9 != r1) goto La7
        La6:
            return r1
        La7:
            kotlin.Unit r9 = p002kotlin.Unit.f29295attabal
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3376ye.a(wretchedly.dern):java.lang.Object");
    }

    @Override // com.inmobi.media.InterfaceC2830cj
    public final void c() {
    }
}
