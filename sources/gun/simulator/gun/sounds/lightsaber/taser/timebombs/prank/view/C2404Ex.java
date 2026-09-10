package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.ads.initialization.InitializationStatus;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ex, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2404Ex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3047a = 1;
    public final boolean b;
    public final boolean c;
    public final Object d;

    public C2404Ex(boolean z, boolean z2, InitializationStatus initializationStatus) {
        this.b = z;
        this.c = z2;
        this.d = initializationStatus;
    }

    public final String toString() {
        switch (this.f3047a) {
            case 0:
                return "GestureBean{isGesture=" + this.b + ", checkNavigation=" + this.c + ", type=" + ((EnumC4485rR) this.d) + '}';
            default:
                return super.toString();
        }
    }
}
