package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class VN {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3203cn0 f3869a;

    public VN(C3203cn0 c3203cn0) {
        this.f3869a = c3203cn0;
    }

    public static VN e(N2 n2) {
        C3203cn0 c3203cn0 = (C3203cn0) n2;
        AbstractC2995aW.d(n2, "AdSession is null");
        if (EnumC3522gT.NATIVE != ((EnumC3522gT) c3203cn0.b.d)) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
        if (c3203cn0.f) {
            throw new IllegalStateException("AdSession is started");
        }
        AbstractC2995aW.l(c3203cn0);
        W2 w2 = c3203cn0.e;
        if (w2.d != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
        VN vn = new VN(c3203cn0);
        w2.d = vn;
        return vn;
    }

    public final void a() {
        HD hd = HD.CLICK;
        C3203cn0 c3203cn0 = this.f3869a;
        AbstractC2995aW.c(c3203cn0);
        JSONObject jSONObject = new JSONObject();
        En0.b(jSONObject, "interactionType", hd);
        c3203cn0.e.c("adUserInteraction", jSONObject);
    }

    public final void b() {
        C3203cn0 c3203cn0 = this.f3869a;
        AbstractC2995aW.c(c3203cn0);
        c3203cn0.e.c("bufferFinish", null);
    }

    public final void c() {
        C3203cn0 c3203cn0 = this.f3869a;
        AbstractC2995aW.c(c3203cn0);
        c3203cn0.e.c("bufferStart", null);
    }

    public final void d() {
        C3203cn0 c3203cn0 = this.f3869a;
        AbstractC2995aW.c(c3203cn0);
        c3203cn0.e.c(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, null);
    }

    public final void f() {
        C3203cn0 c3203cn0 = this.f3869a;
        AbstractC2995aW.c(c3203cn0);
        c3203cn0.e.c("firstQuartile", null);
    }

    public final void g() {
        C3203cn0 c3203cn0 = this.f3869a;
        AbstractC2995aW.c(c3203cn0);
        c3203cn0.e.c(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT, null);
    }

    public final void h() {
        C3203cn0 c3203cn0 = this.f3869a;
        AbstractC2995aW.c(c3203cn0);
        c3203cn0.e.c(CampaignEx.JSON_NATIVE_VIDEO_RESUME, null);
    }

    public final void i() {
        C3203cn0 c3203cn0 = this.f3869a;
        AbstractC2995aW.c(c3203cn0);
        c3203cn0.e.c("skipped", null);
    }

    public final void j(float f, float f2) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
        C3203cn0 c3203cn0 = this.f3869a;
        AbstractC2995aW.c(c3203cn0);
        JSONObject jSONObject = new JSONObject();
        En0.b(jSONObject, "duration", Float.valueOf(f));
        En0.b(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        En0.b(jSONObject, "deviceVolume", Float.valueOf(C4523ro0.d().c()));
        c3203cn0.e.c("start", jSONObject);
    }

    public final void k() {
        C3203cn0 c3203cn0 = this.f3869a;
        AbstractC2995aW.c(c3203cn0);
        c3203cn0.e.c("thirdQuartile", null);
    }

    public final void l(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
        C3203cn0 c3203cn0 = this.f3869a;
        AbstractC2995aW.c(c3203cn0);
        JSONObject jSONObject = new JSONObject();
        En0.b(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        En0.b(jSONObject, "deviceVolume", Float.valueOf(C4523ro0.d().c()));
        c3203cn0.e.c("volumeChange", jSONObject);
    }
}
