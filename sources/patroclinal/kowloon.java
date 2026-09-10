package patroclinal;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: UInt.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087@\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0016"}, d2 = {"Lpatroclinal/kowloon;", "", "", "data", "dern", "(I)I", "hashCode", "()I", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "taiyuan", "(I)Ljava/lang/String;", "kowloon", "I", "getData$annotations", "()V", "arytenoidectomy", "attabal", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class kowloon implements Comparable<kowloon> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final int data;

    /* JADX INFO: renamed from: patroclinal.kowloon$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: UInt.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lpatroclinal/kowloon$attabal;", "", "<init>", "()V", "Lpatroclinal/kowloon;", "MIN_VALUE", "I", "MAX_VALUE", "", "SIZE_BYTES", "SIZE_BITS", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ kowloon(int i) {
        this.data = i;
    }

    public static final /* synthetic */ kowloon attabal(int i) {
        return new kowloon(i);
    }

    public static int marial(int i) {
        return Integer.hashCode(i);
    }

    public static String taiyuan(int i) {
        return String.valueOf(((long) i) & 4294967295L);
    }

    public static boolean wireman(int i, Object obj) {
        return (obj instanceof kowloon) && i == ((kowloon) obj).getData();
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(kowloon kowloonVar) {
        return dovishness.attabal(getData(), kowloonVar.getData());
    }

    /* JADX INFO: renamed from: cutely, reason: from getter */
    public final /* synthetic */ int getData() {
        return this.data;
    }

    public boolean equals(Object other) {
        return wireman(this.data, other);
    }

    public int hashCode() {
        return marial(this.data);
    }

    public String toString() {
        return taiyuan(this.data);
    }

    public static int dern(int i) {
        return i;
    }
}
