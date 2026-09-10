package moresque;

import androidx.media3.common.PlaybackException;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.google.common.base.formularize;
import com.google.common.primitives.Ints;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.math.RoundingMode;
import org.objectweb.asm.Opcodes;

/* JADX INFO: compiled from: IntMath.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final byte[] f33616attabal = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final int[] f33619saneness = {1, 10, 100, 1000, 10000, DefaultOggSeeker.MATCH_BYTE_RANGE, PlaybackException.CUSTOM_ERROR_CODE_BASE, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int[] f33617dern = {3, 31, Sdk$SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final int[] f33620wireman = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static int[] f33618marial = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, Opcodes.INSTANCEOF, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* JADX INFO: compiled from: IntMath.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f33621attabal;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f33621attabal = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33621attabal[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33621attabal[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33621attabal[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33621attabal[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33621attabal[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33621attabal[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f33621attabal[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static int attabal(int i, int i2) {
        long j = ((long) i) + ((long) i2);
        int i3 = (int) j;
        marial.saneness(j == ((long) i3), "checkedAdd", i, i2);
        return i3;
    }

    public static int beachfront(int i, RoundingMode roundingMode) {
        marial.marial("x", i);
        switch (attabal.f33621attabal[roundingMode.ordinal()]) {
            case 1:
                marial.beachfront(wireman(i));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + marial((-1257966797) >>> iNumberOfLeadingZeros, i);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static int competently(int i, int i2) {
        return Ints.formularize(((long) i) + ((long) i2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int dern(int i, int i2, RoundingMode roundingMode) {
        formularize.triweekly(roundingMode);
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (attabal.f33621attabal[roundingMode.ordinal()]) {
            case 1:
                marial.beachfront(i4 == 0);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                return i3 + i5;
            case 4:
                return i3 + i5;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                return i3 + i5;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i3 & 1) != 0))) {
                            return i3;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i3;
                }
                return i3 + i5;
            default:
                throw new AssertionError();
        }
    }

    public static int impromptu(int i, int i2) {
        return Ints.formularize(((long) i) * ((long) i2));
    }

    public static int marial(int i, int i2) {
        return (~(~(i - i2))) >>> 31;
    }

    public static int saneness(int i, int i2) {
        long j = ((long) i) * ((long) i2);
        int i3 = (int) j;
        marial.saneness(j == ((long) i3), "checkedMultiply", i, i2);
        return i3;
    }

    public static boolean wireman(int i) {
        return (i > 0) & ((i & (i + (-1))) == 0);
    }
}
