package androidx.collection;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: FloatFloatPair.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0088\u0001\b\u0092\u0001\u00020\u0007¨\u0006\u0017"}, d2 = {"Landroidx/collection/competently;", "", "", "first", "second", "saneness", "(FF)J", "", "packedValue", "dern", "(J)J", "", "beachfront", "(J)Ljava/lang/String;", "", "marial", "(J)I", C3414a2.d, "", "wireman", "(JLjava/lang/Object;)Z", "attabal", "J", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final long packedValue;

    public /* synthetic */ competently(long j) {
        this.packedValue = j;
    }

    public static final /* synthetic */ competently attabal(long j) {
        return new competently(j);
    }

    public static String beachfront(long j) {
        return '(' + Float.intBitsToFloat((int) (j >> 32)) + ", " + Float.intBitsToFloat((int) (j & 4294967295L)) + ')';
    }

    public static int marial(long j) {
        return Long.hashCode(j);
    }

    public static long saneness(float f, float f2) {
        return dern((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    public static boolean wireman(long j, Object obj) {
        return (obj instanceof competently) && j == ((competently) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public boolean equals(Object obj) {
        return wireman(this.packedValue, obj);
    }

    public int hashCode() {
        return marial(this.packedValue);
    }

    public String toString() {
        return beachfront(this.packedValue);
    }

    public static long dern(long j) {
        return j;
    }
}
