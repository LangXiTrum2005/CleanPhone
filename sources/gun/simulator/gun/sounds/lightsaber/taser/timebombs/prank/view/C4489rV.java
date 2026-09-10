package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4489rV implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4932a;
    public final /* synthetic */ Predicate b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C4489rV(Predicate predicate, Predicate predicate2, int i) {
        this.f4932a = i;
        this.b = predicate;
        this.c = predicate2;
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.f4932a;
        return AbstractC4665tV.a(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.f4932a) {
            case 0:
                break;
            case 1:
                break;
        }
        return AbstractC4665tV.b(this);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.f4932a;
        return AbstractC4665tV.c(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        int i = this.f4932a;
        Predicate predicate = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return AbstractC4665tV.f(predicate, (Predicate) obj2, obj);
            case 1:
                return AbstractC4665tV.d(predicate, (Predicate) obj2, obj);
            default:
                return IntentSanitizer.Builder.lambda$allowExtra$13((Class) obj2, predicate, obj);
        }
    }

    public /* synthetic */ C4489rV(Class cls, Predicate predicate) {
        this.f4932a = 2;
        this.c = cls;
        this.b = predicate;
    }
}
