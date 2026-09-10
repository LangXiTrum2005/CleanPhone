package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class Nl0 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3475a;
    public final Jl0 b;

    public Nl0(int i, Jl0 jl0) {
        this.f3475a = i;
        this.b = jl0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f3475a, ((Nl0) obj).f3475a);
    }
}
