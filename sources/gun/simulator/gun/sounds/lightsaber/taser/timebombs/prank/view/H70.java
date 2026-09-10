package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class H70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3156a;
    public String b;
    public AbstractC3413f9 c;
    public int d;

    public H70(int i, String str, AbstractC3413f9 abstractC3413f9) {
        a(i, str);
        this.c = abstractC3413f9;
    }

    public final void a(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException("slotIndex must be >= 0.");
        }
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null.");
        }
        this.f3156a = i;
        this.b = str;
        this.d = (i * 37) + str.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        H70 h70 = (H70) obj;
        if (this.f3156a != h70.f3156a) {
            return false;
        }
        return this.b.equals(h70.b);
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return this.f3156a + ":" + this.b;
    }
}
