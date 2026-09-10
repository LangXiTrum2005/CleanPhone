package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C4999xD implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5212a;
    public final int b;
    public final int c;

    public C4999xD(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f5212a = i;
        this.b = AbstractC2995aW.M(i, i2, i3);
        this.c = i3;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5087yD iterator() {
        return new C5087yD(this.f5212a, this.b, this.c);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4999xD) {
            if (!isEmpty() || !((C4999xD) obj).isEmpty()) {
                C4999xD c4999xD = (C4999xD) obj;
                if (this.f5212a != c4999xD.f5212a || this.b != c4999xD.b || this.c != c4999xD.c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f5212a * 31) + this.b) * 31) + this.c;
    }

    public boolean isEmpty() {
        int i = this.c;
        int i2 = this.b;
        int i3 = this.f5212a;
        if (i > 0) {
            if (i3 <= i2) {
                return false;
            }
        } else if (i3 >= i2) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb;
        int i = this.b;
        int i2 = this.f5212a;
        int i3 = this.c;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
