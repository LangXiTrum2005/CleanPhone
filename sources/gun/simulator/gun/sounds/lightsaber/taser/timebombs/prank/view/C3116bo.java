package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.Spatializer;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3116bo implements Spatializer.OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3557go f4191a;

    public C3116bo(C3557go c3557go) {
        this.f4191a = c3557go;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        C3557go c3557go = this.f4191a;
        AbstractC2992aT abstractC2992aT = C3557go.j;
        c3557go.g();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        C3557go c3557go = this.f4191a;
        AbstractC2992aT abstractC2992aT = C3557go.j;
        c3557go.g();
    }
}
