package ne;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f46715a = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[][] f46716b = {new int[]{228, 48, 15, InterfaceC0435l1.d.b.f29112i, 62}, new int[]{23, 68, 144, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, PsExtractor.VIDEO_STREAM_MASK, 92, 254}, new int[]{28, 24, ModuleDescriptor.MODULE_VERSION, 166, 223, 248, 116, 255, InterfaceC0435l1.d.b.f29111h, 61}, new int[]{175, TsExtractor.TS_STREAM_TYPE_DTS, InterfaceC0435l1.c.b.f29100f, 12, 194, 168, 39, 245, 60, 97, 120}, new int[]{41, 153, 158, 91, 61, 42, 142, 213, 97, 178, 100, 242}, new int[]{156, 97, PsExtractor.AUDIO_STREAM, 252, 95, 9, 157, 119, TsExtractor.TS_STREAM_TYPE_DTS, 45, 18, 186, 83, ModuleDescriptor.MODULE_VERSION}, new int[]{83, 195, 100, 39, 188, 75, 66, 61, 241, 213, InterfaceC0435l1.d.b.f29110g, TsExtractor.TS_STREAM_TYPE_AC3, 94, 254, 225, 48, 90, 188}, new int[]{15, 195, 244, 9, 233, 71, 168, 2, 188, 160, 153, 145, 253, 79, 108, 82, 27, 174, 186, 172}, new int[]{52, 190, 88, InterfaceC0435l1.c.b.f29100f, InterfaceC0435l1.d.b.f29110g, 39, 176, 21, 155, 197, 251, 223, 155, 21, 5, 172, 254, 124, 12, 181, 184, 96, 50, 193}, new int[]{211, 231, 43, 97, 71, 96, InterfaceC0435l1.d.b.f29107d, 174, 37, 151, 170, 53, 75, 34, 249, 121, 17, TsExtractor.TS_STREAM_TYPE_DTS, InterfaceC0435l1.d.b.f29111h, 213, 141, 136, 120, 151, 233, 168, 93, 255}, new int[]{245, 127, 242, 218, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 250, 162, 181, InterfaceC0435l1.d.b.f29106c, 120, 84, 179, 220, 251, 80, 182, 229, 18, 2, 4, 68, 33, InterfaceC0435l1.d.b.f29105b, 137, 95, 119, 115, 44, 175, 184, 59, 25, 225, 98, 81, InterfaceC0435l1.d.b.f29113j}, new int[]{77, 193, 137, 31, 19, 38, 22, 153, 247, InterfaceC0435l1.d.b.f29109f, 122, 2, 245, 133, 242, 8, 175, 95, 100, 9, 167, InterfaceC0435l1.d.b.f29109f, 214, InterfaceC0435l1.d.b.f29112i, 57, 121, 21, 1, 253, 57, 54, InterfaceC0435l1.d.b.f29105b, 248, InterfaceC0435l1.c.b.f29097c, 69, 50, 150, 177, 226, 5, 9, 5}, new int[]{245, 132, 172, 223, 96, 32, 117, 22, 238, 133, 238, 231, InterfaceC0435l1.c.b.f29100f, 188, 237, 87, 191, 106, 16, 147, 118, 23, 37, 90, 170, InterfaceC0435l1.c.b.f29100f, 131, 88, 120, 100, 66, TsExtractor.TS_STREAM_TYPE_DTS, 186, PsExtractor.VIDEO_STREAM_MASK, 82, 44, 176, 87, 187, 147, 160, 175, 69, 213, 92, 253, 225, 19}, new int[]{175, 9, 223, 238, 12, 17, 220, 208, 100, 29, 175, 170, 230, PsExtractor.AUDIO_STREAM, 215, 235, 150, 159, 36, 223, 38, 200, 132, 54, 228, 146, 218, 234, 117, InterfaceC0435l1.c.b.f29098d, 29, 232, 144, 238, 22, 150, InterfaceC0435l1.c.b.f29096b, 117, 62, InterfaceC0435l1.c.b.f29102h, 164, 13, 137, 245, 127, 67, 247, 28, 155, 43, InterfaceC0435l1.c.b.f29098d, 107, 233, 53, 143, 46}, new int[]{242, 93, 169, 50, 144, 210, 39, 118, InterfaceC0435l1.c.b.f29097c, 188, InterfaceC0435l1.c.b.f29096b, PsExtractor.PRIVATE_STREAM_1, 143, 108, 196, 37, ModuleDescriptor.MODULE_VERSION, InterfaceC0435l1.d.b.f29113j, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 230, 245, 63, 197, 190, 250, 106, ModuleDescriptor.MODULE_VERSION, 221, 175, 64, 114, 71, 161, 44, 147, 6, 27, 218, 51, 63, 87, 10, 40, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 188, 17, 163, 31, 176, 170, 4, 107, 232, 7, 94, 166, 224, 124, 86, 47, 11, 204}, new int[]{220, 228, 173, 89, 251, 149, 159, 56, 89, 33, 147, 244, 154, 36, 73, 127, 213, 136, 248, 180, 234, 197, 158, 177, 68, 122, 93, 213, 15, 160, 227, 236, 66, 139, 153, ModuleDescriptor.MODULE_VERSION, InterfaceC0435l1.c.b.f29097c, 167, 179, 25, 220, 232, 96, 210, 231, 136, 223, 239, 181, 241, 59, 52, 172, 25, 49, 232, 211, PsExtractor.PRIVATE_STREAM_1, 64, 54, 108, 153, 132, 63, 96, InterfaceC0435l1.d.b.f29107d, 82, 186}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f46717c = new int[NotificationCompat.FLAG_LOCAL_ONLY];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f46718d = new int[255];

    static {
        int i10 = 1;
        for (int i11 = 0; i11 < 255; i11++) {
            f46718d[i11] = i10;
            f46717c[i10] = i11;
            i10 <<= 1;
            if (i10 >= 256) {
                i10 ^= 301;
            }
        }
    }

    public static String a(int i10, String str) {
        int[] iArr;
        int[] iArr2;
        int i11;
        int i12;
        int length = str.length();
        int i13 = 0;
        while (true) {
            if (i13 >= 16) {
                i13 = -1;
                break;
            }
            if (f46715a[i13] == i10) {
                break;
            }
            i13++;
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf(i10)));
        }
        int[] iArr3 = f46716b[i13];
        char[] cArr = new char[i10];
        for (int i14 = 0; i14 < i10; i14++) {
            cArr[i14] = 0;
        }
        for (int i15 = 0; i15 < length; i15++) {
            int i16 = i10 - 1;
            int iCharAt = cArr[i16] ^ str.charAt(i15);
            while (true) {
                iArr = f46717c;
                iArr2 = f46718d;
                if (i16 <= 0) {
                    break;
                }
                if (iCharAt == 0 || (i12 = iArr3[i16]) == 0) {
                    cArr[i16] = cArr[i16 - 1];
                } else {
                    cArr[i16] = (char) (iArr2[(iArr[iCharAt] + iArr[i12]) % 255] ^ cArr[i16 - 1]);
                }
                i16--;
            }
            if (iCharAt == 0 || (i11 = iArr3[0]) == 0) {
                cArr[0] = 0;
            } else {
                cArr[0] = (char) iArr2[(iArr[iCharAt] + iArr[i11]) % 255];
            }
        }
        char[] cArr2 = new char[i10];
        for (int i17 = 0; i17 < i10; i17++) {
            cArr2[i17] = cArr[(i10 - i17) - 1];
        }
        return String.valueOf(cArr2);
    }
}
