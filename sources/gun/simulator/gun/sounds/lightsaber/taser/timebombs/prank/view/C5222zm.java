package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.AudioTrack;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5222zm extends AudioTrack.StreamEventCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2289Am f5340a;

    public C5222zm(C2289Am c2289Am) {
        this.f5340a = c2289Am;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        C2315Bm c2315Bm;
        Wm0 wm0;
        C2788Ts c2788Ts;
        if (audioTrack.equals(this.f5340a.c.u) && (wm0 = (c2315Bm = this.f5340a.c).r) != null && c2315Bm.U && (c2788Ts = ((C4481rN) wm0.b).M0) != null) {
            c2788Ts.f3798a.h.d(2);
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        C2315Bm c2315Bm;
        Wm0 wm0;
        C2788Ts c2788Ts;
        if (audioTrack.equals(this.f5340a.c.u) && (wm0 = (c2315Bm = this.f5340a.c).r) != null && c2315Bm.U && (c2788Ts = ((C4481rN) wm0.b).M0) != null) {
            c2788Ts.f3798a.h.d(2);
        }
    }
}
