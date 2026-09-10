package evaluating;

import java.util.Random;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Levaluating/saneness;", "Levaluating/attabal;", "<init>", "()V", "evaluating/saneness$attabal", "arytenoidectomy", "Levaluating/saneness$attabal;", "implStorage", "Ljava/util/Random;", "attabal", "()Ljava/util/Random;", "impl", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class saneness extends evaluating.attabal {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final attabal implStorage = new attabal();

    /* JADX INFO: compiled from: PlatformRandom.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"evaluating/saneness$attabal", "Ljava/lang/ThreadLocal;", "Ljava/util/Random;", "attabal", "()Ljava/util/Random;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // evaluating.attabal
    public Random attabal() {
        Random random = this.implStorage.get();
        Intrinsics.checkNotNullExpressionValue(random, "get(...)");
        return random;
    }
}
