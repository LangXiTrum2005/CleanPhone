package sg.bigo.ads.core.player.b;

import android.content.Context;
import com.p004ironsource.sv;
import sg.bigo.ads.core.f.a.p;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends f implements sg.bigo.ads.core.g.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg.bigo.ads.core.g.a.a f48800a;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f48801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f48802i;
    private int j;
    private boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final sg.bigo.ads.core.g.e f48803l;
    private boolean m;

    public d(Context context, int i2, int i3, sg.bigo.ads.api.c.b bVar, sg.bigo.ads.core.a.a aVar) {
        super(context, bVar, aVar);
        this.g = 0;
        this.f48801h = false;
        this.f48802i = false;
        this.k = false;
        sg.bigo.ads.core.g.e eVar = new sg.bigo.ads.core.g.e() { // from class: sg.bigo.ads.core.player.b.d.1
            @Override // sg.bigo.ads.core.g.e
            public final void a() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdImpression");
                d.this.a("AdVPAIDImpression", (Object) null, (int[]) null);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void b() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdVideoStart");
                d.this.a("AdVideoStart", (Object) null, (int[]) null);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void c() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdVideoFirstQuartile");
                d.this.a("AdVideoFirstQuartile", (Object) null, (int[]) null);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void d() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdVideoMidpoint");
                d.this.a("AdVideoMidpoint", (Object) null, (int[]) null);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void e() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdVideoThirdQuartile");
                d.this.a("AdVideoThirdQuartile", (Object) null, (int[]) null);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void f() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdVideoComplete");
                d.this.g = 5;
                d.this.m = true;
                d dVar = d.this;
                dVar.setPlayOrPauseViewHidden(dVar.d.f47008b);
                d.this.c(true);
                d.this.d(false);
                d.this.a("AdVideoComplete", (int[]) null);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void g() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdSkippableStateChange");
            }

            @Override // sg.bigo.ads.core.g.e
            public final void h() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", sv.j);
                d.this.g = 1;
                d.this.f48801h = true;
                d dVar = d.this;
                dVar.setAdVolume(dVar.d.d ? 0.0f : 1.0f);
                if (d.this.n()) {
                    d.this.b(18);
                    d.this.setStatPrepareEventOnce(false);
                }
                if (d.this.k) {
                    d.b(d.this);
                    d.this.b();
                } else if (!d.this.q() && !d.this.m) {
                    d.this.d(true);
                }
                d.this.a("AdLoaded", (Object) null, (int[]) null);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void i() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdPlaying");
                d.this.g = 2;
                d.this.a("AdVideoPlaying", (int[]) null);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void j() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onStartAd");
                d.this.g = 2;
                d.this.m = false;
                d.this.a("AdVideoPlaying", (int[]) null);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void k() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onStopAd");
                d.this.g = 4;
                d.this.a("AdStopped", (int[]) null);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void l() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onSkipAd");
                d.this.b(10);
                d.this.a("AdSkipped", (int[]) null);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void m() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdPaused");
                d.this.g = 3;
                d.this.a("AdVideoPaused", (int[]) null);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void n() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdUserAcceptInvitation");
            }

            @Override // sg.bigo.ads.core.g.e
            public final void o() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdUserMinimize");
            }

            @Override // sg.bigo.ads.core.g.e
            public final void p() {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdUserClose");
                d.this.a("AdClosed", (int[]) null);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void a(float f) {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdVolumeChange, volume=".concat(String.valueOf(f)));
                d.this.f48802i = f <= 0.0f;
                d dVar = d.this;
                dVar.b(dVar.f48802i);
                d dVar2 = d.this;
                dVar2.a("AdVolumeChange", new int[]{dVar2.f48802i ? 0 : 100});
            }

            @Override // sg.bigo.ads.core.g.e
            public final void b(int i4) {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdRemainingTimeChange, remaining=".concat(String.valueOf(i4)));
            }

            @Override // sg.bigo.ads.core.g.e
            public final void c(String str) {
                p005e.a.d(0, 3, str, "onAdInteraction, id=", "VPAIDPlayView");
            }

            @Override // sg.bigo.ads.core.g.e
            public final void a(int i4) {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdDurationChange, duration=".concat(String.valueOf(i4)));
                d.this.j = i4;
            }

            @Override // sg.bigo.ads.core.g.e
            public final void b(String str) {
                p005e.a.d(0, 3, str, "onAdLog, message=", "VPAIDPlayView");
            }

            @Override // sg.bigo.ads.core.g.e
            public final void a(int i4, int i5) {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", android.support.v4.media.a.g(i4, i5, "onAdSizeChange, w=", ", h="));
                d.this.a("AdSizeChange", (int[]) null);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void b(boolean z2) {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdInteraction, adLinear=".concat(String.valueOf(z2)));
            }

            @Override // sg.bigo.ads.core.g.e
            public final void a(String str) {
                p005e.a.d(0, 3, str, "onAdError, message=", "VPAIDPlayView");
                d.this.a("AdError", str, new int[]{-1, -1});
            }

            @Override // sg.bigo.ads.core.g.e
            public final void a(String str, String str2, boolean z2) {
                StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("onAdClickThru, url=", str, ", id=", str2, ", playerHandles=");
                sbQ.append(z2);
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", sbQ.toString());
                d.a(d.this, str, z2);
            }

            @Override // sg.bigo.ads.core.g.e
            public final void a(boolean z2) {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "onAdExpandedChange, expanded=".concat(String.valueOf(z2)));
            }
        };
        this.f48803l = eVar;
        this.m = bVar.f47010e;
        p pVarBp = aVar.bp();
        sg.bigo.ads.core.f.a.a.a aVar2 = pVarBp != null ? pVarBp.f48527B : null;
        sg.bigo.ads.core.g.a.a aVar3 = new sg.bigo.ads.core.g.a.a(context, this, aVar.b(context), i2, i3, sg.bigo.ads.api.core.b.b(aVar.x()) ? sg.bigo.ads.core.g.f.FULLSCREEN : sg.bigo.ads.core.g.f.NORMAL, aVar2 != null ? aVar2.a().trim() : "", sg.bigo.ads.api.core.b.d(aVar.x()) ? 3 : bVar.f47007a, aVar.bo());
        this.f48800a = aVar3;
        aVar3.f48541b.setVPAIDEvenListener(eVar);
        aVar3.f48542c = new sg.bigo.ads.core.g.a.a.InterfaceC0870a() { // from class: sg.bigo.ads.core.player.b.d.2
            @Override // sg.bigo.ads.core.g.a.a.InterfaceC0870a
            public final void a() {
                sg.bigo.ads.common.t.a.b("VPAIDPlayView", "onVPAIDPlayerDestroy");
                d.this.f48801h = false;
                d.this.d(false);
                if (d.this.m) {
                    return;
                }
                d.this.r();
            }
        };
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final boolean c() {
        return this.f48802i;
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final void d() {
        d(false);
    }

    @Override // sg.bigo.ads.core.player.b.f
    public final boolean e() {
        return this.f48801h;
    }

    public final String getAdCompanions() {
        return this.f48800a.f48541b.getAdCompanions();
    }

    public final int getAdDuration() {
        return this.f48800a.f48541b.getAdDuration();
    }

    public final boolean getAdExpanded() {
        return this.f48800a.f48541b.getAdExpanded();
    }

    public final int getAdHeight() {
        return this.f48800a.f48541b.getAdHeight();
    }

    public final boolean getAdIcons() {
        return this.f48800a.f48541b.getAdIcons();
    }

    public final boolean getAdLinear() {
        return this.f48800a.f48541b.getAdLinear();
    }

    public final int getAdRemainingTime() {
        return this.f48800a.f48541b.getAdRemainingTime();
    }

    public final boolean getAdSkippableState() {
        return this.f48800a.f48541b.getAdSkippableState();
    }

    public final float getAdVolume() {
        return this.f48800a.f48541b.getAdVolume();
    }

    public final int getAdWidth() {
        return this.f48800a.f48541b.getAdWidth();
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final int getPlayStatus() {
        return this.g;
    }

    public final void setAdVolume(float f) {
        this.f48800a.f48541b.setAdVolume(f);
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final void setMute(boolean z2) {
        setAdVolume(z2 ? 0.0f : 1.0f);
    }

    public final void setVPAIDClickable(boolean z2) {
        this.f48800a.f48541b.setVPAIDClickable(z2);
    }

    @Override // sg.bigo.ads.api.c.a
    public final void a() {
        this.f48800a.f48541b.a("window.vpaidwrapper.pauseAd()");
        this.k = false;
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final void b() {
        if (q() || this.m) {
            if (this.m) {
                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "tryStartAd, video is completed play, unregister it from list");
                d(false);
                return;
            }
            return;
        }
        sg.bigo.ads.common.t.a.a(0, 3, "VPAIDPlayView", "try start play video ad");
        if (this.g == 1) {
            a(false);
        } else {
            this.f48800a.f48541b.a("window.vpaidwrapper.resumeAd()");
        }
    }

    public static /* synthetic */ void a(d dVar, String str, boolean z2) {
        if (sg.bigo.ads.core.g.d.d(str)) {
            sg.bigo.ads.core.a.a aVar = dVar.f48832e;
            sg.bigo.ads.api.core.c.b bVarN = aVar != null ? aVar.N() : null;
            if (bVarN != null) {
                bVarN.a(str);
            }
        }
        dVar.a("AdVPAIDClickThru", dVar.f48800a.f48541b.getClickPoints(), new int[]{z2 ? 1 : 0});
    }

    public static /* synthetic */ boolean b(d dVar) {
        dVar.k = false;
        return false;
    }

    @Override // sg.bigo.ads.core.player.b.f
    public final void a(boolean z2) {
        super.a(z2);
        if (!this.f48801h) {
            this.k = z2;
            return;
        }
        sg.bigo.ads.core.g.a.b bVar = this.f48800a.f48541b;
        bVar.d.a(3);
        bVar.a("window.vpaidwrapper.startAd()");
        if (!sg.bigo.ads.common.aa.b.a(getContext())) {
            sg.bigo.ads.common.t.a.b("VPAIDPlayView", "screen is off, start ad cancel");
        } else {
            setPlayOrPauseViewHidden(true);
            d(true);
        }
    }
}
