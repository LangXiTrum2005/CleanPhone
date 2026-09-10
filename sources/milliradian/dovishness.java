package milliradian;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TextUnit.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Lmilliradian/dovishness;", "", "", "type", "marial", "(J)J", "", "taiyuan", "(J)Ljava/lang/String;", "", "impromptu", "(J)I", C3414a2.d, "", "beachfront", "(JLjava/lang/Object;)Z", "attabal", "J", "saneness", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class dovishness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final long type;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final long f33463dern = marial(0);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final long f33466wireman = marial(4294967296L);

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final long f33464marial = marial(8589934592L);

    /* JADX INFO: renamed from: milliradian.dovishness$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: TextUnit.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lmilliradian/dovishness$attabal;", "", "<init>", "()V", "Lmilliradian/dovishness;", "Unspecified", "J", "dern", "()J", "Sp", "saneness", "Em", "attabal", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long attabal() {
            return dovishness.f33464marial;
        }

        public final long dern() {
            return dovishness.f33463dern;
        }

        public final long saneness() {
            return dovishness.f33466wireman;
        }

        public Companion() {
        }
    }

    public /* synthetic */ dovishness(long j) {
        this.type = j;
    }

    public static boolean beachfront(long j, Object obj) {
        return (obj instanceof dovishness) && j == ((dovishness) obj).getType();
    }

    public static final boolean competently(long j, long j2) {
        return j == j2;
    }

    public static int impromptu(long j) {
        return Long.hashCode(j);
    }

    public static String taiyuan(long j) {
        if (competently(j, f33463dern)) {
            return "Unspecified";
        }
        if (competently(j, f33466wireman)) {
            return "Sp";
        }
        return competently(j, f33464marial) ? "Em" : "Invalid";
    }

    public static final /* synthetic */ dovishness wireman(long j) {
        return new dovishness(j);
    }

    /* JADX INFO: renamed from: cutely, reason: from getter */
    public final /* synthetic */ long getType() {
        return this.type;
    }

    public boolean equals(Object obj) {
        return beachfront(this.type, obj);
    }

    public int hashCode() {
        return impromptu(this.type);
    }

    public String toString() {
        return taiyuan(this.type);
    }

    public static long marial(long j) {
        return j;
    }
}
