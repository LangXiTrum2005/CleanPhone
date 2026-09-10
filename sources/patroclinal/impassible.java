package patroclinal;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UByte.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087@\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Lpatroclinal/impassible;", "", "", "data", "dern", "(B)B", "", "hashCode", "()I", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "taiyuan", "(B)Ljava/lang/String;", "kowloon", "B", "getData$annotations", "()V", "arytenoidectomy", "attabal", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class impassible implements Comparable<impassible> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final byte data;

    /* JADX INFO: renamed from: patroclinal.impassible$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: UByte.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lpatroclinal/impassible$attabal;", "", "<init>", "()V", "Lpatroclinal/impassible;", "MIN_VALUE", "B", "MAX_VALUE", "", "SIZE_BYTES", "I", "SIZE_BITS", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ impassible(byte b) {
        this.data = b;
    }

    public static final /* synthetic */ impassible attabal(byte b) {
        return new impassible(b);
    }

    public static int marial(byte b) {
        return Byte.hashCode(b);
    }

    public static String taiyuan(byte b) {
        return String.valueOf(b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public static boolean wireman(byte b, Object obj) {
        return (obj instanceof impassible) && b == ((impassible) obj).getData();
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(impassible impassibleVar) {
        return Intrinsics.taiyuan(getData() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, impassibleVar.getData() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    /* JADX INFO: renamed from: cutely, reason: from getter */
    public final /* synthetic */ byte getData() {
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

    public static byte dern(byte b) {
        return b;
    }
}
