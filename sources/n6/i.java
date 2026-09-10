package n6;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.dm0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements e6.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f46587a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f46588b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int e(h hVar, dm0 dm0Var) {
        try {
            int iC = hVar.c();
            if ((iC & 65496) == 65496 || iC == 19789 || iC == 18761) {
                int iG = g(hVar);
                if (iG != -1) {
                    byte[] bArr = (byte[]) dm0Var.d(byte[].class, iG);
                    try {
                        return h(hVar, bArr, iG);
                    } finally {
                        dm0Var.h(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iC);
                return -1;
            }
        } catch (g unused) {
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType f(h hVar) {
        try {
            int iC = hVar.c();
            if (iC == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int i10 = (iC << 8) | hVar.i();
            if (i10 == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int i11 = (i10 << 8) | hVar.i();
            if (i11 == -1991225785) {
                hVar.skip(21L);
                try {
                    return hVar.i() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (g unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (i11 == 1380533830) {
                hVar.skip(4L);
                if (((hVar.c() << 16) | hVar.c()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iC2 = (hVar.c() << 16) | hVar.c();
                if ((iC2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i12 = iC2 & 255;
                if (i12 != 88) {
                    if (i12 != 76) {
                        return ImageHeaderParser$ImageType.WEBP;
                    }
                    hVar.skip(4L);
                    return (hVar.i() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                hVar.skip(4L);
                short sI = hVar.i();
                if ((sI & 2) != 0) {
                    return ImageHeaderParser$ImageType.ANIMATED_WEBP;
                }
                return (sI & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((hVar.c() << 16) | hVar.c()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iC3 = (hVar.c() << 16) | hVar.c();
            if (iC3 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i13 = 0;
            boolean z10 = iC3 == 1635150182;
            hVar.skip(4L);
            int i14 = i11 - 16;
            if (i14 % 4 == 0) {
                while (i13 < 5 && i14 > 0) {
                    int iC4 = (hVar.c() << 16) | hVar.c();
                    if (iC4 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (iC4 == 1635150182) {
                        z10 = true;
                    }
                    i13++;
                    i14 -= 4;
                }
            }
            return z10 ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (g unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static int g(h hVar) {
        short sI;
        int iC;
        long j10;
        long jSkip;
        do {
            short sI2 = hVar.i();
            if (sI2 == 255) {
                sI = hVar.i();
                if (sI != 218) {
                    if (sI != 217) {
                        iC = hVar.c() - 2;
                        if (sI == 225) {
                            return iC;
                        }
                        j10 = iC;
                        jSkip = hVar.skip(j10);
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                        return -1;
                    }
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sI2));
                return -1;
            }
            return -1;
        } while (jSkip == j10);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder sbL = l1.d.l("Unable to skip enough data, type: ", sI, ", wanted to skip: ", iC, ", but actually skipped: ");
            sbL.append(jSkip);
            Log.d("DfltImageHeaderParser", sbL.toString());
        }
        return -1;
    }

    public static int h(h hVar, byte[] bArr, int i10) {
        ByteOrder byteOrder;
        int iH = hVar.h(i10, bArr);
        short s10 = -1;
        if (iH == i10) {
            int i11 = 0;
            byte[] bArr2 = f46587a;
            boolean z10 = bArr != null && i10 > bArr2.length;
            if (z10) {
                for (int i12 = 0; i12 < bArr2.length; i12++) {
                    if (bArr[i12] != bArr2[i12]) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (!z10) {
                if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                }
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
                return -1;
            }
            ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
            short s11 = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
            if (s11 != 18761) {
                if (s11 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) s11));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            byteBuffer.order(byteOrder);
            int i13 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
            int i14 = i13 + 6;
            short s12 = byteBuffer.remaining() - i14 >= 2 ? byteBuffer.getShort(i14) : (short) -1;
            while (i11 < s12) {
                int i15 = (i11 * 12) + i13 + 8;
                short s13 = byteBuffer.remaining() - i15 >= 2 ? byteBuffer.getShort(i15) : s10;
                if (s13 != 274) {
                    s10 = s10;
                } else {
                    int i16 = i15 + 2;
                    short s14 = byteBuffer.remaining() - i16 >= 2 ? byteBuffer.getShort(i16) : s10;
                    if (s14 < 1 || s14 > 12) {
                        s10 = s10;
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) s14));
                        }
                    } else {
                        int i17 = i15 + 4;
                        int i18 = byteBuffer.remaining() - i17 >= 4 ? byteBuffer.getInt(i17) : s10;
                        if (i18 < 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Negative tiff component count");
                            }
                            s10 = s10;
                        } else {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder sbL = l1.d.l("Got tagIndex=", i11, " tagType=", s13, " formatCode=");
                                sbL.append((int) s14);
                                sbL.append(" componentCount=");
                                sbL.append(i18);
                                Log.d("DfltImageHeaderParser", sbL.toString());
                            }
                            int i19 = i18 + f46588b[s14];
                            if (i19 <= 4) {
                                int i20 = i15 + 8;
                                if (i20 >= 0 && i20 <= byteBuffer.remaining()) {
                                    if (i19 >= 0 && i19 + i20 <= byteBuffer.remaining()) {
                                        return byteBuffer.remaining() - i20 >= 2 ? byteBuffer.getShort(i20) : s10;
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) s13));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i20 + " tagType=" + ((int) s13));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) s14));
                            }
                        }
                    }
                }
                i11++;
                s10 = s10;
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + iH);
            return -1;
        }
        return s10;
    }

    @Override // e6.e
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        a7.h.c(byteBuffer, "Argument must not be null");
        return f(new n5.f(byteBuffer));
    }

    @Override // e6.e
    public final int b(InputStream inputStream, dm0 dm0Var) {
        am.e eVar = new am.e(inputStream, 21);
        a7.h.c(dm0Var, "Argument must not be null");
        return e(eVar, dm0Var);
    }

    @Override // e6.e
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        return f(new am.e(inputStream, 21));
    }

    @Override // e6.e
    public final int d(ByteBuffer byteBuffer, dm0 dm0Var) {
        n5.f fVar = new n5.f(byteBuffer);
        a7.h.c(dm0Var, "Argument must not be null");
        return e(fVar, dm0Var);
    }
}
