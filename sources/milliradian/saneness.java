package milliradian;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: Constraints.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087@\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u0012\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\u0011\u0010\u0016\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000bR\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000bR\u0011\u0010\u001a\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u001e\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u0012\u001a\u0004\b\u001f\u0010\u001c\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006#"}, d2 = {"Lmilliradian/saneness;", "", "", "value", "saneness", "(J)J", "", "formularize", "(J)Ljava/lang/String;", "", "apical", "(J)I", C3414a2.d, "", "dern", "(JLjava/lang/Object;)Z", "J", "getValue$annotations", "()V", "cutely", "minWidth", "impromptu", "maxWidth", "taiyuan", "minHeight", "competently", "maxHeight", "beachfront", "(J)Z", "getHasFixedWidth$annotations", "hasFixedWidth", "marial", "getHasFixedHeight$annotations", "hasFixedHeight", "attabal", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class saneness {
    private final long value;

    public /* synthetic */ saneness(long j) {
        this.value = j;
    }

    public static int apical(long j) {
        return Long.hashCode(j);
    }

    public static final /* synthetic */ saneness attabal(long j) {
        return new saneness(j);
    }

    public static final boolean beachfront(long j) {
        int i = (int) (3 & j);
        int i2 = (1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1;
        int i3 = ((int) (j >> 2)) & i2;
        int i4 = ((int) (j >> 33)) & i2;
        return i3 == (i4 == 0 ? Integer.MAX_VALUE : i4 - 1);
    }

    public static final int competently(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    public static final int cutely(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1);
    }

    public static boolean dern(long j, Object obj) {
        return (obj instanceof saneness) && j == ((saneness) obj).getValue();
    }

    public static String formularize(long j) {
        int iImpromptu = impromptu(j);
        String strValueOf = iImpromptu == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iImpromptu);
        int iCompetently = competently(j);
        return "Constraints(minWidth = " + cutely(j) + ", maxWidth = " + strValueOf + ", minHeight = " + taiyuan(j) + ", maxHeight = " + (iCompetently != Integer.MAX_VALUE ? String.valueOf(iCompetently) : "Infinity") + ')';
    }

    public static final int impromptu(long j) {
        int i = (int) (3 & j);
        int i2 = ((int) (j >> 33)) & ((1 << ((((i & 1) << 1) + (((i & 2) >> 1) * 3)) + 13)) - 1);
        if (i2 == 0) {
            return Integer.MAX_VALUE;
        }
        return i2 - 1;
    }

    public static final boolean marial(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    public static final int taiyuan(long j) {
        int i = (int) (3 & j);
        int i2 = ((i & 1) << 1) + (((i & 2) >> 1) * 3);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    public static final boolean wireman(long j, long j2) {
        return j == j2;
    }

    public boolean equals(Object obj) {
        return dern(this.value, obj);
    }

    public int hashCode() {
        return apical(this.value);
    }

    /* JADX INFO: renamed from: impassible, reason: from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    public String toString() {
        return formularize(this.value);
    }

    public static long saneness(long j) {
        return j;
    }
}
