package p002kotlin.time;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.wireman;
import tithonia.dern;

/* JADX INFO: compiled from: TimeSources.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0001\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H$¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\u00020\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource;", "Ltithonia/wireman;", "", "dern", "()D", "Lkotlin/time/attabal;", "attabal", "()Lkotlin/time/attabal;", "Lkotlin/time/DurationUnit;", "Lkotlin/time/DurationUnit;", "saneness", "()Lkotlin/time/DurationUnit;", "unit", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@wireman
public abstract class AbstractDoubleTimeSource implements tithonia.wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final DurationUnit unit;

    /* JADX INFO: renamed from: kotlin.time.AbstractDoubleTimeSource$attabal, reason: from toString */
    /* JADX INFO: compiled from: TimeSources.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource$attabal;", "Lkotlin/time/attabal;", "", "startedAt", "Lkotlin/time/AbstractDoubleTimeSource;", "timeSource", "Lkotlin/time/saneness;", "offset", "<init>", "(DLkotlin/time/AbstractDoubleTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "attabal", "()J", C3414a2.d, "saneness", "(Lkotlin/time/attabal;)J", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "kowloon", "D", "arytenoidectomy", "Lkotlin/time/AbstractDoubleTimeSource;", "monoploid", "J", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DoubleTimeMark implements attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public final AbstractDoubleTimeSource timeSource;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final double startedAt;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public final long offset;

        public /* synthetic */ DoubleTimeMark(double d, AbstractDoubleTimeSource abstractDoubleTimeSource, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(d, abstractDoubleTimeSource, j);
        }

        @Override // p002kotlin.time.TimeMark
        public long attabal() {
            return saneness.merc(dern.polloi(this.timeSource.dern() - this.startedAt, this.timeSource.getUnit()), this.offset);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public /* bridge */ int compareTo(attabal attabalVar) {
            return attabal.C0711attabal.attabal(this, attabalVar);
        }

        public boolean equals(Object other) {
            return (other instanceof DoubleTimeMark) && Intrinsics.wireman(this.timeSource, ((DoubleTimeMark) other).timeSource) && saneness.kowloon(saneness((attabal) other), saneness.INSTANCE.dern());
        }

        public int hashCode() {
            return saneness.trm(saneness.polder(dern.polloi(this.startedAt, this.timeSource.getUnit()), this.offset));
        }

        @Override // p002kotlin.time.attabal
        public long saneness(attabal other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof DoubleTimeMark) {
                DoubleTimeMark doubleTimeMark = (DoubleTimeMark) other;
                if (Intrinsics.wireman(this.timeSource, doubleTimeMark.timeSource)) {
                    if (saneness.kowloon(this.offset, doubleTimeMark.offset) && saneness.kattegat(this.offset)) {
                        return saneness.INSTANCE.dern();
                    }
                    long jMerc = saneness.merc(this.offset, doubleTimeMark.offset);
                    long jPolloi = dern.polloi(this.startedAt - doubleTimeMark.startedAt, this.timeSource.getUnit());
                    return saneness.kowloon(jPolloi, saneness.hydrovane(jMerc)) ? saneness.INSTANCE.dern() : saneness.polder(jPolloi, jMerc);
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        public String toString() {
            return "DoubleTimeMark(" + this.startedAt + dern.beachfront(this.timeSource.getUnit()) + " + " + ((Object) saneness.starveling(this.offset)) + ", " + this.timeSource + ')';
        }

        public DoubleTimeMark(double d, AbstractDoubleTimeSource timeSource, long j) {
            Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.startedAt = d;
            this.timeSource = timeSource;
            this.offset = j;
        }
    }

    @Override // tithonia.wireman
    public attabal attabal() {
        return new DoubleTimeMark(dern(), this, saneness.INSTANCE.dern(), null);
    }

    public abstract double dern();

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final DurationUnit getUnit() {
        return this.unit;
    }
}
