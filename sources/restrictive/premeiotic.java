package restrictive;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: Float16.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0005\b\u0081@\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u0088\u0001\u0007\u0092\u0001\u00020\u0006¨\u0006\u000b"}, d2 = {"Lrestrictive/premeiotic;", "", "", "value", "attabal", "(F)S", "", "halfValue", "dern", "(S)S", "kowloon", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class premeiotic implements Comparable<premeiotic> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final short f36300arytenoidectomy = dern(5120);

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final short f36306monoploid = dern(-1025);

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final short f36307polloi = dern(31743);

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final short f36305molybdenite = dern(1024);

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final short f36303graveside = dern(1);

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final short f36299adultoid = dern(32256);

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public static final short f36301dovishness = dern(-1024);

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public static final short f36302gintrap = dern(Short.MIN_VALUE);

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public static final short f36309rotuma = dern(31744);

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public static final short f36308preprohormone = dern(0);

    public static short attabal(float f) {
        int i;
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        int i2 = iFloatToRawIntBits >>> 31;
        int i3 = (iFloatToRawIntBits >>> 23) & 255;
        int i4 = 8388607 & iFloatToRawIntBits;
        int i5 = 31;
        int i6 = 0;
        if (i3 != 255) {
            int i7 = i3 - 112;
            if (i7 >= 31) {
                i5 = 49;
            } else {
                if (i7 > 0) {
                    i6 = i4 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i = (((i7 << 10) | i6) + 1) | (i2 << 15);
                    } else {
                        i5 = i7;
                    }
                    return dern((short) i);
                }
                if (i7 >= -10) {
                    int i8 = (8388608 | i4) >> (1 - i7);
                    if ((i8 & 4096) != 0) {
                        i8 += 8192;
                    }
                    i5 = 0;
                    i6 = i8 >> 13;
                } else {
                    i5 = 0;
                }
            }
        } else if (i4 != 0) {
            i6 = 512;
        }
        i = (i2 << 15) | (i5 << 10) | i6;
        return dern((short) i);
    }

    public static short dern(short s) {
        return s;
    }
}
