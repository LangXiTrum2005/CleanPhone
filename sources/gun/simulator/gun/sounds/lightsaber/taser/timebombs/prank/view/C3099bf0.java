package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3099bf0 implements Comparable {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f4180a;

    public /* synthetic */ C3099bf0(short s) {
        this.f4180a = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC2995aW.s(this.f4180a & 65535, ((C3099bf0) obj).f4180a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3099bf0) {
            return this.f4180a == ((C3099bf0) obj).f4180a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4180a;
    }

    public final String toString() {
        return String.valueOf(65535 & this.f4180a);
    }
}
