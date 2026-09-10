package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.util.Predicate;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4577sV implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4982a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C4577sV(Object obj, int i) {
        this.f4982a = i;
        this.b = obj;
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.f4982a;
        return AbstractC4665tV.a(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.f4982a) {
            case 0:
                break;
        }
        return AbstractC4665tV.b(this);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.f4982a;
        return AbstractC4665tV.c(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        int i = this.f4982a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return obj2.equals(obj);
            default:
                return AbstractC4665tV.e((Predicate) obj2, obj);
        }
    }
}
