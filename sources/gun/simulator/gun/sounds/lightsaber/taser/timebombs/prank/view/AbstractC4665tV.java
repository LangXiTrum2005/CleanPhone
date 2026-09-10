package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.util.Predicate;
import java.util.Objects;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4665tV {
    public static Predicate a(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new C4489rV(predicate, predicate2, 1);
    }

    public static Predicate b(Predicate predicate) {
        return new C4577sV(predicate, 1);
    }

    public static Predicate c(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new C4489rV(predicate, predicate2, 0);
    }

    public static /* synthetic */ boolean d(Predicate predicate, Predicate predicate2, Object obj) {
        return predicate.test(obj) && predicate2.test(obj);
    }

    public static /* synthetic */ boolean e(Predicate predicate, Object obj) {
        return !predicate.test(obj);
    }

    public static /* synthetic */ boolean f(Predicate predicate, Predicate predicate2, Object obj) {
        return predicate.test(obj) || predicate2.test(obj);
    }

    public static Predicate g(Object obj) {
        return obj == null ? new FD(11) : new C4577sV(obj, 0);
    }

    public static /* synthetic */ boolean h(Object obj) {
        return obj == null;
    }

    public static Predicate j(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return predicate.negate();
    }
}
