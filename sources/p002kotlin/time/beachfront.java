package p002kotlin.time;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import tithonia.wireman;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlin/time/beachfront;", "Ltithonia/wireman;", "<init>", "()V", "Lkotlin/time/beachfront$attabal;", "saneness", "()J", "", "toString", "()Ljava/lang/String;", "attabal", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class beachfront implements wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final beachfront f32082attabal = new beachfront();

    @Override // tithonia.wireman
    public /* bridge */ /* synthetic */ p002kotlin.time.attabal attabal() {
        return attabal.dern(saneness());
    }

    public long saneness() {
        return marial.f32084attabal.wireman();
    }

    public String toString() {
        return marial.f32084attabal.toString();
    }

    /* JADX INFO: compiled from: TimeSource.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006\u001a"}, d2 = {"Lkotlin/time/beachfront$attabal;", "Lkotlin/time/attabal;", "", "Lkotlin/time/ValueTimeMarkReading;", "reading", "marial", "(J)J", "Lkotlin/time/saneness;", "taiyuan", C3414a2.d, "impassible", "(JLkotlin/time/attabal;)J", "formularize", "(JJ)J", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "kowloon", "J", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal implements p002kotlin.time.attabal {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final long reading;

        public /* synthetic */ attabal(long j) {
            this.reading = j;
        }

        public static int apical(long j) {
            return Long.hashCode(j);
        }

        public static boolean cutely(long j, Object obj) {
            return (obj instanceof attabal) && j == ((attabal) obj).getReading();
        }

        public static final /* synthetic */ attabal dern(long j) {
            return new attabal(j);
        }

        public static final long formularize(long j, long j2) {
            return marial.f32084attabal.saneness(j, j2);
        }

        public static long impassible(long j, p002kotlin.time.attabal other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof attabal) {
                return formularize(j, ((attabal) other).getReading());
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) triweekly(j)) + " and " + other);
        }

        public static long taiyuan(long j) {
            return marial.f32084attabal.dern(j);
        }

        public static String triweekly(long j) {
            return "ValueTimeMark(reading=" + j + ')';
        }

        @Override // p002kotlin.time.TimeMark
        public long attabal() {
            return taiyuan(this.reading);
        }

        public boolean equals(Object other) {
            return cutely(this.reading, other);
        }

        public int hashCode() {
            return apical(this.reading);
        }

        /* JADX INFO: renamed from: kowloon, reason: from getter */
        public final /* synthetic */ long getReading() {
            return this.reading;
        }

        @Override // p002kotlin.time.attabal
        public long saneness(p002kotlin.time.attabal other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return impassible(this.reading, other);
        }

        public String toString() {
            return triweekly(this.reading);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public /* bridge */ int compareTo(p002kotlin.time.attabal attabalVar) {
            return p002kotlin.time.attabal.C0711attabal.attabal(this, attabalVar);
        }

        public static long marial(long j) {
            return j;
        }
    }
}
