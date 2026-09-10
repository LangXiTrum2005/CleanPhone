package androidx.media3.extractor.text.pgs;

import android.graphics.Bitmap;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class PgsParser implements SubtitleParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f7316a = new ParsableByteArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f7317b = new ParsableByteArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CueBuilder f7318c = new CueBuilder();
    public Inflater d;

    public static final class CueBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ParsableByteArray f7319a = new ParsableByteArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f7320b = new int[256];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f7321c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7322e;
        public int f;
        public int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f7323h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f7324i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0083  */
    @Override // androidx.media3.extractor.text.SubtitleParser
    public final void a(byte[] bArr, int i2, int i3, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        ParsableByteArray parsableByteArray;
        ArrayList arrayList;
        char c2;
        Cue cueA;
        int i4;
        int iU;
        ParsableByteArray parsableByteArray2;
        int i5;
        int i6;
        int iX;
        ParsableByteArray parsableByteArray3 = this.f7316a;
        parsableByteArray3.E(bArr, i2 + i3);
        parsableByteArray3.G(i2);
        char c3 = 255;
        if (parsableByteArray3.a() > 0 && (parsableByteArray3.f5667a[parsableByteArray3.f5668b] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 120) {
            if (this.d == null) {
                this.d = new Inflater();
            }
            Inflater inflater = this.d;
            ParsableByteArray parsableByteArray4 = this.f7317b;
            if (Util.D(parsableByteArray3, parsableByteArray4, inflater)) {
                parsableByteArray3.E(parsableByteArray4.f5667a, parsableByteArray4.f5669c);
            }
        }
        CueBuilder cueBuilder = this.f7318c;
        cueBuilder.d = 0;
        cueBuilder.f7322e = 0;
        cueBuilder.f = 0;
        cueBuilder.g = 0;
        cueBuilder.f7323h = 0;
        cueBuilder.f7324i = 0;
        ParsableByteArray parsableByteArray5 = cueBuilder.f7319a;
        parsableByteArray5.D(0);
        cueBuilder.f7321c = false;
        ArrayList arrayList2 = new ArrayList();
        while (parsableByteArray3.a() >= 3) {
            int i7 = parsableByteArray3.f5669c;
            int iU2 = parsableByteArray3.u();
            int iA = parsableByteArray3.A();
            int i8 = parsableByteArray3.f5668b + iA;
            if (i8 > i7) {
                parsableByteArray3.G(i7);
                arrayList = arrayList2;
                cueA = null;
                c2 = c3;
                parsableByteArray2 = parsableByteArray3;
            } else {
                char c4 = 128;
                int[] iArr = cueBuilder.f7320b;
                if (iU2 != 128) {
                    switch (iU2) {
                        case 20:
                            if (iA % 5 == 2) {
                                parsableByteArray3.H(2);
                                Arrays.fill(iArr, 0);
                                int i9 = iA / 5;
                                int i10 = 0;
                                while (i10 < i9) {
                                    int iU3 = parsableByteArray3.u();
                                    int[] iArr2 = iArr;
                                    double dU = parsableByteArray3.u();
                                    char c5 = c4;
                                    double dU2 = parsableByteArray3.u() - 128;
                                    double dU3 = parsableByteArray3.u() - 128;
                                    iArr2[iU3] = Util.j((int) ((dU3 * 1.772d) + dU), 0, 255) | (parsableByteArray3.u() << 24) | (Util.j((int) ((1.402d * dU2) + dU), 0, 255) << 16) | (Util.j((int) ((dU - (0.34414d * dU3)) - (dU2 * 0.71414d)), 0, 255) << 8);
                                    i10++;
                                    iArr = iArr2;
                                    c4 = c5;
                                    c3 = 255;
                                    parsableByteArray3 = parsableByteArray3;
                                    arrayList2 = arrayList2;
                                }
                                parsableByteArray = parsableByteArray3;
                                arrayList = arrayList2;
                                c2 = c3;
                                cueBuilder.f7321c = true;
                            } else {
                                parsableByteArray = parsableByteArray3;
                                arrayList = arrayList2;
                                c2 = c3;
                            }
                            break;
                        case 21:
                            if (iA >= 4) {
                                parsableByteArray3.H(3);
                                int i11 = iA - 4;
                                if (!((128 & parsableByteArray3.u()) != 0)) {
                                    i5 = parsableByteArray5.f5668b;
                                    i6 = parsableByteArray5.f5669c;
                                    if (i5 < i6 && i11 > 0) {
                                        int iMin = Math.min(i11, i6 - i5);
                                        parsableByteArray3.e(parsableByteArray5.f5667a, i5, iMin);
                                        parsableByteArray5.G(i5 + iMin);
                                    }
                                } else if (i11 >= 7 && (iX = parsableByteArray3.x()) >= 4) {
                                    cueBuilder.f7323h = parsableByteArray3.A();
                                    cueBuilder.f7324i = parsableByteArray3.A();
                                    parsableByteArray5.D(iX - 4);
                                    i11 = iA - 11;
                                    i5 = parsableByteArray5.f5668b;
                                    i6 = parsableByteArray5.f5669c;
                                    if (i5 < i6) {
                                        int iMin2 = Math.min(i11, i6 - i5);
                                        parsableByteArray3.e(parsableByteArray5.f5667a, i5, iMin2);
                                        parsableByteArray5.G(i5 + iMin2);
                                    }
                                }
                            }
                            parsableByteArray = parsableByteArray3;
                            arrayList = arrayList2;
                            c2 = c3;
                            break;
                        case 22:
                            if (iA >= 19) {
                                cueBuilder.d = parsableByteArray3.A();
                                cueBuilder.f7322e = parsableByteArray3.A();
                                parsableByteArray3.H(11);
                                cueBuilder.f = parsableByteArray3.A();
                                cueBuilder.g = parsableByteArray3.A();
                            }
                            parsableByteArray = parsableByteArray3;
                            arrayList = arrayList2;
                            c2 = c3;
                            break;
                        default:
                            parsableByteArray = parsableByteArray3;
                            arrayList = arrayList2;
                            c2 = c3;
                            break;
                    }
                    cueA = null;
                } else {
                    parsableByteArray = parsableByteArray3;
                    arrayList = arrayList2;
                    c2 = c3;
                    if (cueBuilder.d == 0 || cueBuilder.f7322e == 0 || cueBuilder.f7323h == 0 || cueBuilder.f7324i == 0 || (i4 = parsableByteArray5.f5669c) == 0 || parsableByteArray5.f5668b != i4 || !cueBuilder.f7321c) {
                        cueA = null;
                    } else {
                        parsableByteArray5.G(0);
                        int i12 = cueBuilder.f7323h * cueBuilder.f7324i;
                        int[] iArr3 = new int[i12];
                        int i13 = 0;
                        while (i13 < i12) {
                            int iU4 = parsableByteArray5.u();
                            if (iU4 != 0) {
                                iU = i13 + 1;
                                iArr3[i13] = iArr[iU4];
                            } else {
                                int iU5 = parsableByteArray5.u();
                                if (iU5 != 0) {
                                    iU = ((iU5 & 64) == 0 ? iU5 & 63 : ((iU5 & 63) << 8) | parsableByteArray5.u()) + i13;
                                    Arrays.fill(iArr3, i13, iU, (iU5 & 128) == 0 ? iArr[0] : iArr[parsableByteArray5.u()]);
                                }
                            }
                            i13 = iU;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr3, cueBuilder.f7323h, cueBuilder.f7324i, Bitmap.Config.ARGB_8888);
                        Cue.Builder builder = new Cue.Builder();
                        builder.f5605b = bitmapCreateBitmap;
                        float f = cueBuilder.f;
                        float f2 = cueBuilder.d;
                        builder.f5608h = f / f2;
                        builder.f5609i = 0;
                        float f3 = cueBuilder.g;
                        float f4 = cueBuilder.f7322e;
                        builder.f5607e = f3 / f4;
                        builder.f = 0;
                        builder.g = 0;
                        builder.f5610l = cueBuilder.f7323h / f2;
                        builder.m = cueBuilder.f7324i / f4;
                        cueA = builder.a();
                    }
                    cueBuilder.d = 0;
                    cueBuilder.f7322e = 0;
                    cueBuilder.f = 0;
                    cueBuilder.g = 0;
                    cueBuilder.f7323h = 0;
                    cueBuilder.f7324i = 0;
                    parsableByteArray5.D(0);
                    cueBuilder.f7321c = false;
                }
                parsableByteArray2 = parsableByteArray;
                parsableByteArray2.G(i8);
            }
            ArrayList arrayList3 = arrayList;
            if (cueA != null) {
                arrayList3.add(cueA);
            }
            parsableByteArray3 = parsableByteArray2;
            c3 = c2;
            arrayList2 = arrayList3;
        }
        consumer.accept(new CuesWithTiming(arrayList2, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final int c() {
        return 2;
    }
}
