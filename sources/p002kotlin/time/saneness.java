package p002kotlin.time;

import androidx.media3.common.PlaybackException;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.ironsource.C3414a2;
import org.objectweb.asm.signature.SignatureVisitor;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.dern;
import p002kotlin.ranges.wireman;
import p002kotlin.text.StringsKt;
import tithonia.attabal;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b(\b\u0087@\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001[B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u0018\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001cH\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010\u000fJ\r\u0010 \u001a\u00020\u000b¢\u0006\u0004\b \u0010\u000fJ\r\u0010!\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\u000fJ\r\u0010\"\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010\u000fJ\u0018\u0010#\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J?\u00105\u001a\u000204*\u00060.j\u0002`/2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u00062\u0006\u0010&\u001a\u00020+2\u0006\u00103\u001a\u00020\u000bH\u0002¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020+¢\u0006\u0004\b7\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0005R\u0014\u0010>\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010@\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b?\u0010\u0005R\u001a\u0010E\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\bC\u0010D\u001a\u0004\bA\u0010BR\u001a\u0010H\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\bG\u0010D\u001a\u0004\bF\u0010BR\u001a\u0010K\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\bJ\u0010D\u001a\u0004\bI\u0010BR\u001a\u0010N\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\bM\u0010D\u001a\u0004\bL\u0010BR\u0011\u0010P\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bO\u0010\u0005R\u0011\u0010R\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bQ\u0010\u0005R\u0011\u0010T\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bS\u0010\u0005R\u0011\u0010V\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bU\u0010\u0005R\u0011\u0010X\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bW\u0010\u0005R\u0011\u0010Z\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bY\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\\"}, d2 = {"Lkotlin/time/saneness;", "", "", "rawValue", "impassible", "(J)J", "", "hashCode", "()I", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "sealless", "(J)Z", "yemenite", "hydrovane", "polder", "(JJ)J", "thisMillis", "otherNanos", "marial", "(JJJ)J", "merc", "scale", "grimness", "(JI)J", "", "seminary", "(JD)J", "supplicat", "restrictive", "kattegat", "oilcan", "formularize", "(JJ)I", "Lkotlin/time/DurationUnit;", "unit", "saran", "(JLkotlin/time/DurationUnit;)D", "creditor", "(JLkotlin/time/DurationUnit;)J", "", "starveling", "(J)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "", "taiyuan", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "privatdozent", "kowloon", "J", "stratoscope", "value", "cuirassed", "(J)Lkotlin/time/DurationUnit;", "storageUnit", "arytenoidectomy", "absoluteValue", "monoploid", "(J)I", "getHoursComponent$annotations", "()V", "hoursComponent", "rotuma", "getMinutesComponent$annotations", "minutesComponent", "cord", "getSecondsComponent$annotations", "secondsComponent", "preprohormone", "getNanosecondsComponent$annotations", "nanosecondsComponent", "polloi", "inWholeDays", "molybdenite", "inWholeHours", "dovishness", "inWholeMinutes", "gintrap", "inWholeSeconds", "adultoid", "inWholeMilliseconds", "graveside", "inWholeMicroseconds", "attabal", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class saneness implements Comparable<saneness> {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final long rawValue;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final long f32088monoploid = impassible(0);

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final long f32089polloi = dern.cutely(4611686018427387903L);

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final long f32087molybdenite = dern.cutely(-4611686018427387903L);

    /* JADX INFO: renamed from: kotlin.time.saneness$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Duration.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lkotlin/time/saneness$attabal;", "", "<init>", "()V", "", "value", "Lkotlin/time/saneness;", "wireman", "(Ljava/lang/String;)J", "ZERO", "J", "dern", "()J", "INFINITE", "attabal", "NEG_INFINITE", "saneness", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long attabal() {
            return saneness.f32089polloi;
        }

        public final long dern() {
            return saneness.f32088monoploid;
        }

        public final long saneness() {
            return saneness.f32087molybdenite;
        }

        public final long wireman(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return dern.arytenoidectomy(value, true);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e);
            }
        }

        public Companion() {
        }
    }

    public /* synthetic */ saneness(long j) {
        this.rawValue = j;
    }

    public static final long adultoid(long j) {
        return (yemenite(j) && oilcan(j)) ? stratoscope(j) : creditor(j, DurationUnit.MILLISECONDS);
    }

    public static final long arytenoidectomy(long j) {
        return supplicat(j) ? hydrovane(j) : j;
    }

    public static final int cord(long j) {
        if (kattegat(j)) {
            return 0;
        }
        return (int) (gintrap(j) % ((long) 60));
    }

    public static final long creditor(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == f32089polloi) {
            return Long.MAX_VALUE;
        }
        if (j == f32087molybdenite) {
            return Long.MIN_VALUE;
        }
        return tithonia.saneness.saneness(stratoscope(j), cuirassed(j), unit);
    }

    public static final DurationUnit cuirassed(long j) {
        return sealless(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    public static final /* synthetic */ saneness cutely(long j) {
        return new saneness(j);
    }

    public static final long dovishness(long j) {
        return creditor(j, DurationUnit.MINUTES);
    }

    public static int formularize(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.cutely(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return supplicat(j) ? -i : i;
    }

    public static final long gintrap(long j) {
        return creditor(j, DurationUnit.SECONDS);
    }

    public static final long graveside(long j) {
        return creditor(j, DurationUnit.MICROSECONDS);
    }

    public static final long grimness(long j, int i) {
        if (kattegat(j)) {
            if (i != 0) {
                return i > 0 ? j : hydrovane(j);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i == 0) {
            return f32088monoploid;
        }
        long jStratoscope = stratoscope(j);
        long j2 = i;
        long j3 = jStratoscope * j2;
        if (!sealless(j)) {
            if (j3 / j2 == jStratoscope) {
                return dern.cutely(wireman.impassible(j3, new dern(-4611686018427387903L, 4611686018427387903L)));
            }
            return pastie.dern.saneness(jStratoscope) * pastie.dern.attabal(i) > 0 ? f32089polloi : f32087molybdenite;
        }
        if (-2147483647L <= jStratoscope && jStratoscope < 2147483648L) {
            return dern.formularize(j3);
        }
        if (j3 / j2 == jStratoscope) {
            return dern.impassible(j3);
        }
        long jKowloon = dern.kowloon(jStratoscope);
        long j4 = jKowloon * j2;
        long jKowloon2 = dern.kowloon((jStratoscope - dern.triweekly(jKowloon)) * j2) + j4;
        if (j4 / j2 != jKowloon || (jKowloon2 ^ j4) < 0) {
            return pastie.dern.saneness(jStratoscope) * pastie.dern.attabal(i) > 0 ? f32089polloi : f32087molybdenite;
        }
        return dern.cutely(wireman.impassible(jKowloon2, new dern(-4611686018427387903L, 4611686018427387903L)));
    }

    public static final long hydrovane(long j) {
        return dern.taiyuan(-stratoscope(j), ((int) j) & 1);
    }

    public static long impassible(long j) {
        if (!attabal.attabal()) {
            return j;
        }
        if (sealless(j)) {
            long jStratoscope = stratoscope(j);
            if (-4611686018426999999L <= jStratoscope && jStratoscope < 4611686018427000000L) {
                return j;
            }
            throw new AssertionError(stratoscope(j) + " ns is out of nanoseconds range");
        }
        long jStratoscope2 = stratoscope(j);
        if (-4611686018427387903L > jStratoscope2 || jStratoscope2 >= 4611686018427387904L) {
            throw new AssertionError(stratoscope(j) + " ms is out of milliseconds range");
        }
        long jStratoscope3 = stratoscope(j);
        if (-4611686018426L > jStratoscope3 || jStratoscope3 >= 4611686018427L) {
            return j;
        }
        throw new AssertionError(stratoscope(j) + " ms is denormalized");
    }

    public static final boolean kattegat(long j) {
        return j == f32089polloi || j == f32087molybdenite;
    }

    public static final boolean kowloon(long j, long j2) {
        return j == j2;
    }

    public static final long marial(long j, long j2, long j3) {
        long jKowloon = dern.kowloon(j3);
        long j4 = j2 + jKowloon;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return dern.cutely(wireman.formularize(j4, -4611686018427387903L, 4611686018427387903L));
        }
        return dern.formularize(dern.triweekly(j4) + (j3 - dern.triweekly(jKowloon)));
    }

    public static final long merc(long j, long j2) {
        return polder(j, hydrovane(j2));
    }

    public static final long molybdenite(long j) {
        return creditor(j, DurationUnit.HOURS);
    }

    public static final int monoploid(long j) {
        if (kattegat(j)) {
            return 0;
        }
        return (int) (molybdenite(j) % ((long) 24));
    }

    public static final boolean oilcan(long j) {
        return !kattegat(j);
    }

    public static final long polder(long j, long j2) {
        if (kattegat(j)) {
            if (oilcan(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (kattegat(j2)) {
            return j2;
        }
        if ((((int) j) & 1) != (((int) j2) & 1)) {
            return yemenite(j) ? marial(j, stratoscope(j), stratoscope(j2)) : marial(j, stratoscope(j2), stratoscope(j));
        }
        long jStratoscope = stratoscope(j) + stratoscope(j2);
        return sealless(j) ? dern.impassible(jStratoscope) : dern.apical(jStratoscope);
    }

    public static final long polloi(long j) {
        return creditor(j, DurationUnit.DAYS);
    }

    public static final int preprohormone(long j) {
        if (kattegat(j)) {
            return 0;
        }
        return (int) (yemenite(j) ? dern.triweekly(stratoscope(j) % ((long) 1000)) : stratoscope(j) % ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS));
    }

    public static final String privatdozent(long j) {
        StringBuilder sb = new StringBuilder();
        if (supplicat(j)) {
            sb.append(SignatureVisitor.SUPER);
        }
        sb.append("PT");
        long jArytenoidectomy = arytenoidectomy(j);
        long jMolybdenite = molybdenite(jArytenoidectomy);
        int iRotuma = rotuma(jArytenoidectomy);
        int iCord = cord(jArytenoidectomy);
        int iPreprohormone = preprohormone(jArytenoidectomy);
        long j2 = kattegat(j) ? 9999999999999L : jMolybdenite;
        boolean z = false;
        boolean z2 = j2 != 0;
        boolean z3 = (iCord == 0 && iPreprohormone == 0) ? false : true;
        if (iRotuma != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(j2);
            sb.append('H');
        }
        if (z) {
            sb.append(iRotuma);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            taiyuan(j, sb, iCord, iPreprohormone, 9, "S", true);
        }
        return sb.toString();
    }

    public static final boolean restrictive(long j) {
        return j > 0;
    }

    public static final int rotuma(long j) {
        if (kattegat(j)) {
            return 0;
        }
        return (int) (dovishness(j) % ((long) 60));
    }

    public static final double saran(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == f32089polloi) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == f32087molybdenite) {
            return Double.NEGATIVE_INFINITY;
        }
        return tithonia.saneness.attabal(stratoscope(j), cuirassed(j), unit);
    }

    public static final boolean sealless(long j) {
        return (((int) j) & 1) == 0;
    }

    public static final long seminary(long j, double d) {
        int iDern = pastie.dern.dern(d);
        if (iDern == d) {
            return grimness(j, iDern);
        }
        DurationUnit durationUnitCuirassed = cuirassed(j);
        return dern.polloi(saran(j, durationUnitCuirassed) * d, durationUnitCuirassed);
    }

    public static String starveling(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == f32089polloi) {
            return "Infinity";
        }
        if (j == f32087molybdenite) {
            return "-Infinity";
        }
        boolean zSupplicat = supplicat(j);
        StringBuilder sb = new StringBuilder();
        if (zSupplicat) {
            sb.append(SignatureVisitor.SUPER);
        }
        long jArytenoidectomy = arytenoidectomy(j);
        long jPolloi = polloi(jArytenoidectomy);
        int iMonoploid = monoploid(jArytenoidectomy);
        int iRotuma = rotuma(jArytenoidectomy);
        int iCord = cord(jArytenoidectomy);
        int iPreprohormone = preprohormone(jArytenoidectomy);
        int i = 0;
        boolean z = jPolloi != 0;
        boolean z2 = iMonoploid != 0;
        boolean z3 = iRotuma != 0;
        boolean z4 = (iCord == 0 && iPreprohormone == 0) ? false : true;
        if (z) {
            sb.append(jPolloi);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iMonoploid);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iRotuma);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iCord != 0 || z || z2 || z3) {
                taiyuan(j, sb, iCord, iPreprohormone, 9, "s", false);
            } else if (iPreprohormone >= 1000000) {
                taiyuan(j, sb, iPreprohormone / PlaybackException.CUSTOM_ERROR_CODE_BASE, iPreprohormone % PlaybackException.CUSTOM_ERROR_CODE_BASE, 6, "ms", false);
            } else if (iPreprohormone >= 1000) {
                taiyuan(j, sb, iPreprohormone / 1000, iPreprohormone % 1000, 3, "us", false);
            } else {
                sb.append(iPreprohormone);
                sb.append("ns");
            }
            i = i4;
        }
        if (zSupplicat && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long stratoscope(long j) {
        return j >> 1;
    }

    public static final boolean supplicat(long j) {
        return j < 0;
    }

    public static final void taiyuan(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strPicketboat = StringsKt.picketboat(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = strPicketboat.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strPicketboat.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strPicketboat, 0, ((i4 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            } else {
                sb.append((CharSequence) strPicketboat, 0, i6);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    public static boolean triweekly(long j, Object obj) {
        return (obj instanceof saneness) && j == ((saneness) obj).getRawValue();
    }

    public static int trm(long j) {
        return Long.hashCode(j);
    }

    public static final boolean yemenite(long j) {
        return (((int) j) & 1) == 1;
    }

    public int apical(long j) {
        return formularize(this.rawValue, j);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(saneness sanenessVar) {
        return apical(sanenessVar.getRawValue());
    }

    public boolean equals(Object other) {
        return triweekly(this.rawValue, other);
    }

    public int hashCode() {
        return trm(this.rawValue);
    }

    public String toString() {
        return starveling(this.rawValue);
    }

    /* JADX INFO: renamed from: walach, reason: from getter */
    public final /* synthetic */ long getRawValue() {
        return this.rawValue;
    }
}
