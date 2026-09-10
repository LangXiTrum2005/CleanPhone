package dent;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: ContainerHelpers.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006\"\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"", "", "size", "value", "attabal", "([III)I", "[I", "EMPTY_INTS", "", "", "saneness", "[Ljava/lang/Object;", "EMPTY_OBJECTS", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final int[] f25206attabal = new int[0];

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Object[] f25207saneness = new Object[0];

    public static final int attabal(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }
}
