package patroclinal;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ULong.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087@\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Lpatroclinal/monoploid;", "", "", "data", "dern", "(J)J", "", "hashCode", "()I", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "cutely", "(J)Ljava/lang/String;", "kowloon", "J", "getData$annotations", "()V", "arytenoidectomy", "attabal", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class monoploid implements Comparable<monoploid> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final long data;

    /* JADX INFO: renamed from: patroclinal.monoploid$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ULong.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lpatroclinal/monoploid$attabal;", "", "<init>", "()V", "Lpatroclinal/monoploid;", "MIN_VALUE", "J", "MAX_VALUE", "", "SIZE_BYTES", "I", "SIZE_BITS", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ monoploid(long j) {
        this.data = j;
    }

    public static final /* synthetic */ monoploid attabal(long j) {
        return new monoploid(j);
    }

    public static String cutely(long j) {
        return dovishness.wireman(j, 10);
    }

    public static final boolean marial(long j, long j2) {
        return j == j2;
    }

    public static int taiyuan(long j) {
        return Long.hashCode(j);
    }

    public static boolean wireman(long j, Object obj) {
        return (obj instanceof monoploid) && j == ((monoploid) obj).getData();
    }

    /* JADX INFO: renamed from: apical, reason: from getter */
    public final /* synthetic */ long getData() {
        return this.data;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(monoploid monoploidVar) {
        return dovishness.saneness(getData(), monoploidVar.getData());
    }

    public boolean equals(Object other) {
        return wireman(this.data, other);
    }

    public int hashCode() {
        return taiyuan(this.data);
    }

    public String toString() {
        return cutely(this.data);
    }

    public static long dern(long j) {
        return j;
    }
}
