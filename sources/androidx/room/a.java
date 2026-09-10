package androidx.room;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ InvalidationTracker f8275Y;

    public /* synthetic */ a(InvalidationTracker invalidationTracker, int i2) {
        this.X = i2;
        this.f8275Y = invalidationTracker;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.X) {
            case 0:
                this.f8275Y.getClass();
                return Unit.f43263a;
            case 1:
                this.f8275Y.getClass();
                return Unit.f43263a;
            default:
                InvalidationTracker invalidationTracker = this.f8275Y;
                return Boolean.valueOf(!invalidationTracker.f8181a.i() || invalidationTracker.f8181a.k());
        }
    }
}
