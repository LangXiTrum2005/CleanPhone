package com.google.android.exoplayer2.text.pgs;

import android.graphics.Bitmap;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class PgsDecoder extends SimpleSubtitleDecoder {
    public final ParsableByteArray o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ParsableByteArray f18560p;
    public final CueBuilder q;
    public Inflater r;

    public static final class CueBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ParsableByteArray f18561a = new ParsableByteArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f18562b = new int[256];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f18563c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18564e;
        public int f;
        public int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f18565h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f18566i;
    }

    public PgsDecoder() {
        super("PgsDecoder");
        this.o = new ParsableByteArray();
        this.f18560p = new ParsableByteArray();
        this.q = new CueBuilder();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x007c  */
    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public final Subtitle e(byte[] bArr, int i2, boolean z2) {
        char c2;
        Cue cueA;
        int i3;
        int i4;
        int iU;
        int i5;
        int i6;
        int iW;
        ParsableByteArray parsableByteArray = this.o;
        parsableByteArray.D(bArr, i2);
        char c3 = 255;
        if (parsableByteArray.a() > 0 && (parsableByteArray.f18956a[parsableByteArray.f18957b] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 120) {
            if (this.r == null) {
                this.r = new Inflater();
            }
            Inflater inflater = this.r;
            ParsableByteArray parsableByteArray2 = this.f18560p;
            if (Util.y(parsableByteArray, parsableByteArray2, inflater)) {
                parsableByteArray.D(parsableByteArray2.f18956a, parsableByteArray2.f18958c);
            }
        }
        CueBuilder cueBuilder = this.q;
        int i7 = 0;
        cueBuilder.d = 0;
        cueBuilder.f18564e = 0;
        cueBuilder.f = 0;
        cueBuilder.g = 0;
        cueBuilder.f18565h = 0;
        cueBuilder.f18566i = 0;
        ParsableByteArray parsableByteArray3 = cueBuilder.f18561a;
        parsableByteArray3.C(0);
        cueBuilder.f18563c = false;
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.a() >= 3) {
            int i8 = parsableByteArray.f18958c;
            int iU2 = parsableByteArray.u();
            int iZ = parsableByteArray.z();
            int i9 = parsableByteArray.f18957b + iZ;
            if (i9 > i8) {
                parsableByteArray.F(i8);
                c2 = c3;
                i3 = i7;
                cueA = null;
            } else {
                char c4 = 128;
                int[] iArr = cueBuilder.f18562b;
                if (iU2 != 128) {
                    switch (iU2) {
                        case 20:
                            if (iZ % 5 == 2) {
                                parsableByteArray.G(2);
                                Arrays.fill(iArr, i7);
                                int i10 = iZ / 5;
                                int i11 = i7;
                                while (i11 < i10) {
                                    int iU3 = parsableByteArray.u();
                                    char c5 = c4;
                                    double dU = parsableByteArray.u();
                                    int[] iArr2 = iArr;
                                    double dU2 = parsableByteArray.u() - 128;
                                    double dU3 = parsableByteArray.u() - 128;
                                    iArr2[iU3] = Util.j((int) ((dU3 * 1.772d) + dU), 0, 255) | (parsableByteArray.u() << 24) | (Util.j((int) ((1.402d * dU2) + dU), 0, 255) << 16) | (Util.j((int) ((dU - (0.34414d * dU3)) - (dU2 * 0.71414d)), 0, 255) << 8);
                                    i11++;
                                    c3 = 255;
                                    iArr = iArr2;
                                    c4 = c5;
                                }
                                c2 = c3;
                                cueBuilder.f18563c = true;
                            } else {
                                c2 = c3;
                            }
                            break;
                        case 21:
                            if (iZ >= 4) {
                                parsableByteArray.G(3);
                                int i12 = iZ - 4;
                                if (((128 & parsableByteArray.u()) != 0 ? 1 : i7) == 0) {
                                    i5 = parsableByteArray3.f18957b;
                                    i6 = parsableByteArray3.f18958c;
                                    if (i5 < i6 && i12 > 0) {
                                        int iMin = Math.min(i12, i6 - i5);
                                        parsableByteArray.e(parsableByteArray3.f18956a, i5, iMin);
                                        parsableByteArray3.F(i5 + iMin);
                                    }
                                } else if (i12 >= 7 && (iW = parsableByteArray.w()) >= 4) {
                                    cueBuilder.f18565h = parsableByteArray.z();
                                    cueBuilder.f18566i = parsableByteArray.z();
                                    parsableByteArray3.C(iW - 4);
                                    i12 = iZ - 11;
                                    i5 = parsableByteArray3.f18957b;
                                    i6 = parsableByteArray3.f18958c;
                                    if (i5 < i6) {
                                        int iMin2 = Math.min(i12, i6 - i5);
                                        parsableByteArray.e(parsableByteArray3.f18956a, i5, iMin2);
                                        parsableByteArray3.F(i5 + iMin2);
                                    }
                                }
                            }
                            c2 = c3;
                            break;
                        case 22:
                            if (iZ >= 19) {
                                cueBuilder.d = parsableByteArray.z();
                                cueBuilder.f18564e = parsableByteArray.z();
                                parsableByteArray.G(11);
                                cueBuilder.f = parsableByteArray.z();
                                cueBuilder.g = parsableByteArray.z();
                            }
                            c2 = c3;
                            break;
                        default:
                            c2 = c3;
                            break;
                    }
                    i3 = 0;
                    cueA = null;
                } else {
                    c2 = c3;
                    if (cueBuilder.d == 0 || cueBuilder.f18564e == 0 || cueBuilder.f18565h == 0 || cueBuilder.f18566i == 0 || (i4 = parsableByteArray3.f18958c) == 0 || parsableByteArray3.f18957b != i4 || !cueBuilder.f18563c) {
                        cueA = null;
                    } else {
                        parsableByteArray3.F(0);
                        int i13 = cueBuilder.f18565h * cueBuilder.f18566i;
                        int[] iArr3 = new int[i13];
                        int i14 = 0;
                        while (i14 < i13) {
                            int iU4 = parsableByteArray3.u();
                            if (iU4 != 0) {
                                iU = i14 + 1;
                                iArr3[i14] = iArr[iU4];
                            } else {
                                int iU5 = parsableByteArray3.u();
                                if (iU5 != 0) {
                                    iU = ((iU5 & 64) == 0 ? iU5 & 63 : ((iU5 & 63) << 8) | parsableByteArray3.u()) + i14;
                                    Arrays.fill(iArr3, i14, iU, (iU5 & 128) == 0 ? 0 : iArr[parsableByteArray3.u()]);
                                }
                            }
                            i14 = iU;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr3, cueBuilder.f18565h, cueBuilder.f18566i, Bitmap.Config.ARGB_8888);
                        Cue.Builder builder = new Cue.Builder();
                        builder.f18455b = bitmapCreateBitmap;
                        float f = cueBuilder.f;
                        float f2 = cueBuilder.d;
                        builder.f18458h = f / f2;
                        builder.f18459i = 0;
                        float f3 = cueBuilder.g;
                        float f4 = cueBuilder.f18564e;
                        builder.f18457e = f3 / f4;
                        builder.f = 0;
                        builder.g = 0;
                        builder.f18460l = cueBuilder.f18565h / f2;
                        builder.m = cueBuilder.f18566i / f4;
                        cueA = builder.a();
                    }
                    i3 = 0;
                    cueBuilder.d = 0;
                    cueBuilder.f18564e = 0;
                    cueBuilder.f = 0;
                    cueBuilder.g = 0;
                    cueBuilder.f18565h = 0;
                    cueBuilder.f18566i = 0;
                    parsableByteArray3.C(0);
                    cueBuilder.f18563c = false;
                }
                parsableByteArray.F(i9);
            }
            if (cueA != null) {
                arrayList.add(cueA);
            }
            c3 = c2;
            i7 = i3;
        }
        return new PgsSubtitle(Collections.unmodifiableList(arrayList));
    }
}
