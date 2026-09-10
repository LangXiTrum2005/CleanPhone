package milliradian;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: Constraints.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\f\u001a\u001e\u0010\u0012\u001a\u00020\u0000*\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001e\u0010\u0015\u001a\u00020\u0000*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"", "widthVal", "heightVal", "", "competently", "(II)V", "minWidth", "maxWidth", "minHeight", "maxHeight", "Lmilliradian/saneness;", "beachfront", "(IIII)J", "size", "dern", "(I)I", "attabal", "width", "marial", "(JI)I", "height", "wireman", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class dern {
    public static final long attabal(int i, int i2, int i3, int i4) {
        boolean z = false;
        if (!(i2 >= i)) {
            formularize.attabal("maxWidth(" + i2 + ") must be >= than minWidth(" + i + ')');
        }
        if (!(i4 >= i3)) {
            formularize.attabal("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + ')');
        }
        if (i >= 0 && i3 >= 0) {
            z = true;
        }
        if (!z) {
            formularize.attabal("minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0");
        }
        return beachfront(i, i2, i3, i4);
    }

    public static final long beachfront(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int iDern = dern(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iDern2 = dern(i6);
        if (iDern + iDern2 > 31) {
            competently(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i7 & (~(i7 >> 31));
        int i9 = i4 + 1;
        int i10 = i9 & (~(i9 >> 31));
        int i11 = 0;
        if (iDern2 != 13) {
            if (iDern2 == 18) {
                i11 = 3;
            } else if (iDern2 == 15) {
                i11 = 1;
            } else if (iDern2 == 16) {
                i11 = 2;
            }
        }
        int i12 = ((i11 & 1) << 1) + (((i11 & 2) >> 1) * 3);
        return saneness.saneness((((long) i8) << 33) | ((long) i11) | (((long) i) << 2) | (((long) i3) << (i12 + 15)) | (((long) i10) << (i12 + 46)));
    }

    public static final void competently(int i, int i2) {
        throw new IllegalArgumentException("Can't represent a width of " + i + " and height of " + i2 + " in Constraints");
    }

    public static final int dern(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    public static final int marial(long j, int i) {
        return p002kotlin.ranges.wireman.apical(i, saneness.cutely(j), saneness.impromptu(j));
    }

    public static /* synthetic */ long saneness(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return attabal(i, i2, i3, i4);
    }

    public static final int wireman(long j, int i) {
        return p002kotlin.ranges.wireman.apical(i, saneness.taiyuan(j), saneness.competently(j));
    }
}
