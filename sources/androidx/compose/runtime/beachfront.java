package androidx.compose.runtime;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Composition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final beachfront f5829attabal = new beachfront();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static Function2<taiyuan, Integer, Unit> f5831saneness = cuirassed.wireman.saneness(954879418, false, saneness.f5833kowloon);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static Function2<taiyuan, Integer, Unit> f5830dern = cuirassed.wireman.saneness(1918065384, false, attabal.f5832kowloon);

    /* JADX INFO: compiled from: Composition.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class attabal implements Function2<taiyuan, Integer, Unit> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final attabal f5832kowloon = new attabal();

        public final void attabal(taiyuan taiyuanVar, int i) {
            if (!taiyuanVar.marial((i & 3) != 2, i & 1)) {
                taiyuanVar.kowloon();
                return;
            }
            if (polloi.grimness()) {
                polloi.mathsort(1918065384, i, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda$1918065384.<anonymous> (Composition.kt:854)");
            }
            if (polloi.grimness()) {
                polloi.peridotite();
            }
        }

        @Override // p002kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(taiyuan taiyuanVar, Integer num) {
            attabal(taiyuanVar, num.intValue());
            return Unit.f29295attabal;
        }
    }

    /* JADX INFO: compiled from: Composition.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class saneness implements Function2<taiyuan, Integer, Unit> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final saneness f5833kowloon = new saneness();

        public final void attabal(taiyuan taiyuanVar, int i) {
            if (!taiyuanVar.marial((i & 3) != 2, i & 1)) {
                taiyuanVar.kowloon();
                return;
            }
            if (polloi.grimness()) {
                polloi.mathsort(954879418, i, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda$954879418.<anonymous> (Composition.kt:620)");
            }
            if (polloi.grimness()) {
                polloi.peridotite();
            }
        }

        @Override // p002kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(taiyuan taiyuanVar, Integer num) {
            attabal(taiyuanVar, num.intValue());
            return Unit.f29295attabal;
        }
    }

    public final Function2<taiyuan, Integer, Unit> attabal() {
        return f5830dern;
    }

    public final Function2<taiyuan, Integer, Unit> saneness() {
        return f5831saneness;
    }
}
