package p002kotlin.time;

import p002kotlin.Metadata;
import tithonia.wireman;

/* JADX INFO: compiled from: MonoTimeSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Lkotlin/time/marial;", "Ltithonia/wireman;", "<init>", "()V", "", "marial", "()J", "", "toString", "()Ljava/lang/String;", "Lkotlin/time/beachfront$attabal;", "wireman", "timeMark", "Lkotlin/time/saneness;", "dern", "(J)J", "one", "another", "saneness", "(JJ)J", "J", "zero", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class marial implements wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final marial f32084attabal = new marial();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final long zero = System.nanoTime();

    private final long marial() {
        return System.nanoTime() - zero;
    }

    @Override // tithonia.wireman
    public /* bridge */ /* synthetic */ attabal attabal() {
        return beachfront.attabal.dern(wireman());
    }

    public final long dern(long timeMark) {
        return wireman.saneness(marial(), timeMark, DurationUnit.NANOSECONDS);
    }

    public final long saneness(long one, long another) {
        return wireman.wireman(one, another, DurationUnit.NANOSECONDS);
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }

    public long wireman() {
        return beachfront.attabal.marial(marial());
    }
}
