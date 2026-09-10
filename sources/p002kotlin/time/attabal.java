package p002kotlin.time;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/time/attabal;", "Lkotlin/time/TimeMark;", "", C3414a2.d, "Lkotlin/time/saneness;", "saneness", "(Lkotlin/time/attabal;)J", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface attabal extends TimeMark, Comparable<attabal> {

    /* JADX INFO: renamed from: kotlin.time.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TimeSource.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C0711attabal {
        public static int attabal(attabal attabalVar, attabal other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return saneness.formularize(attabalVar.saneness(other), saneness.INSTANCE.dern());
        }
    }

    long saneness(attabal other);
}
