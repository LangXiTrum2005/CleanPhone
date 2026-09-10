package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Dx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2378Dx implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Qm0 f2999a;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2378Dx clone() {
        try {
            return (C2378Dx) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean b(Object obj) {
        if (obj instanceof C2378Dx) {
            return Tg0.b(this.f2999a, ((C2378Dx) obj).f2999a);
        }
        return false;
    }

    public final int c() {
        Qm0 qm0 = this.f2999a;
        if (qm0 != null) {
            return qm0.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2378Dx) && b(obj);
    }

    public final int hashCode() {
        return c();
    }
}
