package com.google.android.exoplayer2.text.cea;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.applovin.impl.Z;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Cea708Decoder extends CeaDecoder {
    public final ParsableByteArray g = new ParsableByteArray();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ParsableBitArray f18493h = new ParsableBitArray();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18494i = -1;
    public final int j;
    public final CueInfoBuilder[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CueInfoBuilder f18495l;
    public List m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f18496n;
    public DtvCcPacket o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f18497p;

    public static final class Cea708CueInfo {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f18498c = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Cue f18499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18500b;

        public Cea708CueInfo(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i2, float f2, int i3, boolean z2, int i4, int i5) {
            Cue.Builder builder = new Cue.Builder();
            builder.f18454a = spannableStringBuilder;
            builder.f18456c = alignment;
            builder.f18457e = f;
            builder.f = 0;
            builder.g = i2;
            builder.f18458h = f2;
            builder.f18459i = i3;
            builder.f18460l = -3.4028235E38f;
            if (z2) {
                builder.o = i4;
                builder.f18461n = true;
            }
            this.f18499a = builder.a();
            this.f18500b = i5;
        }
    }

    public static final class CueInfoBuilder {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final int[] f18501A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final boolean[] f18502B;
        public static final int[] C;
        public static final int[] D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final int[] f18503E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final int[] f18504F;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f18505w = c(2, 2, 2, 0);
        public static final int x;
        public static final int[] y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int[] f18506z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f18507a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SpannableStringBuilder f18508b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f18509c;
        public boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18510e;
        public boolean f;
        public int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f18511h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f18512i;
        public int j;
        public boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f18513l;
        public int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f18514n;
        public int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f18515p;
        public int q;
        public int r;
        public int s;
        public int t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f18516u;
        public int v;

        static {
            int iC = c(0, 0, 0, 0);
            x = iC;
            int iC2 = c(0, 0, 0, 3);
            y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f18506z = new int[]{0, 0, 0, 0, 0, 0, 2};
            f18501A = new int[]{3, 3, 3, 3, 3, 3, 1};
            f18502B = new boolean[]{false, false, false, true, true, true, false};
            C = new int[]{iC, iC2, iC, iC, iC2, iC, iC};
            D = new int[]{0, 1, 2, 3, 4, 3, 4};
            f18503E = new int[]{0, 0, 0, 0, 0, 3, 3};
            f18504F = new int[]{iC, iC, iC, iC, iC, iC2, iC2};
        }

        public CueInfoBuilder() {
            d();
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001b  */
        public static int c(int i2, int i3, int i4, int i5) {
            int i6;
            Assertions.c(i2, 4);
            Assertions.c(i3, 4);
            Assertions.c(i4, 4);
            Assertions.c(i5, 4);
            if (i5 == 0 || i5 == 1) {
                i6 = 255;
            } else if (i5 == 2) {
                i6 = 127;
            } else if (i5 != 3) {
                i6 = 255;
            } else {
                i6 = 0;
            }
            return Color.argb(i6, i2 > 1 ? 255 : 0, i3 > 1 ? 255 : 0, i4 > 1 ? 255 : 0);
        }

        public final void a(char c2) {
            SpannableStringBuilder spannableStringBuilder = this.f18508b;
            if (c2 != '\n') {
                spannableStringBuilder.append(c2);
                return;
            }
            ArrayList arrayList = this.f18507a;
            arrayList.add(b());
            spannableStringBuilder.clear();
            if (this.f18515p != -1) {
                this.f18515p = 0;
            }
            if (this.q != -1) {
                this.q = 0;
            }
            if (this.r != -1) {
                this.r = 0;
            }
            if (this.t != -1) {
                this.t = 0;
            }
            while (true) {
                if ((!this.k || arrayList.size() < this.j) && arrayList.size() < 15) {
                    return;
                } else {
                    arrayList.remove(0);
                }
            }
        }

        public final SpannableString b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f18508b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f18515p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f18515p, length, 33);
                }
                if (this.q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.q, length, 33);
                }
                if (this.r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.s), this.r, length, 33);
                }
                if (this.t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f18516u), this.t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final void d() {
            this.f18507a.clear();
            this.f18508b.clear();
            this.f18515p = -1;
            this.q = -1;
            this.r = -1;
            this.t = -1;
            this.v = 0;
            this.f18509c = false;
            this.d = false;
            this.f18510e = 4;
            this.f = false;
            this.g = 0;
            this.f18511h = 0;
            this.f18512i = 0;
            this.j = 15;
            this.k = true;
            this.f18513l = 0;
            this.m = 0;
            this.f18514n = 0;
            int i2 = x;
            this.o = i2;
            this.s = f18505w;
            this.f18516u = i2;
        }

        public final void e(boolean z2, boolean z3) {
            int i2 = this.f18515p;
            SpannableStringBuilder spannableStringBuilder = this.f18508b;
            if (i2 != -1) {
                if (!z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f18515p, spannableStringBuilder.length(), 33);
                    this.f18515p = -1;
                }
            } else if (z2) {
                this.f18515p = spannableStringBuilder.length();
            }
            if (this.q == -1) {
                if (z3) {
                    this.q = spannableStringBuilder.length();
                }
            } else {
                if (z3) {
                    return;
                }
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.q, spannableStringBuilder.length(), 33);
                this.q = -1;
            }
        }

        public final void f(int i2, int i3) {
            int i4 = this.r;
            SpannableStringBuilder spannableStringBuilder = this.f18508b;
            if (i4 != -1 && this.s != i2) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.s), this.r, spannableStringBuilder.length(), 33);
            }
            if (i2 != f18505w) {
                this.r = spannableStringBuilder.length();
                this.s = i2;
            }
            if (this.t != -1 && this.f18516u != i3) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f18516u), this.t, spannableStringBuilder.length(), 33);
            }
            if (i3 != x) {
                this.t = spannableStringBuilder.length();
                this.f18516u = i3;
            }
        }
    }

    public static final class DtvCcPacket {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f18519c;
        public int d = 0;

        public DtvCcPacket(int i2, int i3) {
            this.f18517a = i2;
            this.f18518b = i3;
            this.f18519c = new byte[(i3 * 2) - 1];
        }
    }

    public Cea708Decoder(int i2, List list) {
        this.j = i2 == -1 ? 1 : i2;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b2 = ((byte[]) list.get(0))[0];
        }
        this.k = new CueInfoBuilder[8];
        for (int i3 = 0; i3 < 8; i3++) {
            this.k[i3] = new CueInfoBuilder();
        }
        this.f18495l = this.k[0];
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public final Subtitle a() {
        List list = this.m;
        this.f18496n = list;
        list.getClass();
        return new CeaSubtitle(list);
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public final void b(SubtitleInputBuffer subtitleInputBuffer) {
        ByteBuffer byteBuffer = subtitleInputBuffer.Z;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        ParsableByteArray parsableByteArray = this.g;
        parsableByteArray.D(bArrArray, iLimit);
        while (parsableByteArray.a() >= 3) {
            int iU = parsableByteArray.u();
            int i2 = iU & 3;
            boolean z2 = (iU & 4) == 4;
            byte bU = (byte) parsableByteArray.u();
            byte bU2 = (byte) parsableByteArray.u();
            if (i2 == 2 || i2 == 3) {
                if (z2) {
                    if (i2 == 3) {
                        e();
                        int i3 = (bU & 192) >> 6;
                        int i4 = this.f18494i;
                        if (i4 != -1 && i3 != (i4 + 1) % 4) {
                            g();
                            Log.g("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f18494i + " current=" + i3);
                        }
                        this.f18494i = i3;
                        int i5 = bU & 63;
                        if (i5 == 0) {
                            i5 = 64;
                        }
                        DtvCcPacket dtvCcPacket = new DtvCcPacket(i3, i5);
                        this.o = dtvCcPacket;
                        dtvCcPacket.d = 1;
                        dtvCcPacket.f18519c[0] = bU2;
                    } else {
                        Assertions.b(i2 == 2);
                        DtvCcPacket dtvCcPacket2 = this.o;
                        if (dtvCcPacket2 == null) {
                            Log.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = dtvCcPacket2.f18519c;
                            int i6 = dtvCcPacket2.d;
                            int i7 = i6 + 1;
                            dtvCcPacket2.d = i7;
                            bArr[i6] = bU;
                            dtvCcPacket2.d = i6 + 2;
                            bArr[i7] = bU2;
                        }
                    }
                    DtvCcPacket dtvCcPacket3 = this.o;
                    if (dtvCcPacket3.d == (dtvCcPacket3.f18518b * 2) - 1) {
                        e();
                    }
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public final boolean d() {
        return this.m != this.f18496n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:233:0x0553  */
    public final void e() {
        boolean z2;
        char c2;
        DtvCcPacket dtvCcPacket = this.o;
        if (dtvCcPacket == null) {
            return;
        }
        int i2 = 2;
        if (dtvCcPacket.d != (dtvCcPacket.f18518b * 2) - 1) {
            Log.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.o.f18518b * 2) - 1) + ", but current index is " + this.o.d + " (sequence number " + this.o.f18517a + ");");
        }
        DtvCcPacket dtvCcPacket2 = this.o;
        byte[] bArr = dtvCcPacket2.f18519c;
        int i3 = dtvCcPacket2.d;
        ParsableBitArray parsableBitArray = this.f18493h;
        parsableBitArray.k(bArr, i3);
        boolean z3 = false;
        while (parsableBitArray.b() > 0) {
            int i4 = 3;
            int iG = parsableBitArray.g(3);
            int iG2 = parsableBitArray.g(5);
            if (iG == 7) {
                parsableBitArray.n(i2);
                iG = parsableBitArray.g(6);
                if (iG < 7) {
                    Z.s(iG, "Invalid extended service number: ", "Cea708Decoder");
                }
            }
            if (iG2 == 0) {
                if (iG != 0) {
                    Log.g("Cea708Decoder", "serviceNumber is non-zero (" + iG + ") when blockSize is 0");
                }
                if (z3) {
                    this.m = f();
                }
                this.o = null;
            }
            if (iG != this.j) {
                parsableBitArray.o(iG2);
            } else {
                int iE = (iG2 * 8) + parsableBitArray.e();
                while (parsableBitArray.e() < iE) {
                    int iG3 = parsableBitArray.g(8);
                    if (iG3 != 16) {
                        if (iG3 <= 31) {
                            if (iG3 != 0) {
                                if (iG3 == i4) {
                                    this.m = f();
                                } else if (iG3 != 8) {
                                    switch (iG3) {
                                        case 12:
                                            g();
                                            break;
                                        case 13:
                                            this.f18495l.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (iG3 >= 17 && iG3 <= 23) {
                                                Log.g("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + iG3);
                                                parsableBitArray.n(8);
                                            } else if (iG3 < 24 || iG3 > 31) {
                                                Z.s(iG3, "Invalid C0 command: ", "Cea708Decoder");
                                            } else {
                                                Log.g("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + iG3);
                                                parsableBitArray.n(16);
                                            }
                                            break;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.f18495l.f18508b;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                        } else if (iG3 <= 127) {
                            if (iG3 == 127) {
                                this.f18495l.a((char) 9835);
                            } else {
                                this.f18495l.a((char) (iG3 & 255));
                            }
                            z3 = true;
                        } else {
                            if (iG3 <= 159) {
                                CueInfoBuilder[] cueInfoBuilderArr = this.k;
                                switch (iG3) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                                    case OMSDK_JS_WRITE_FAILED_VALUE:
                                    case 134:
                                    case 135:
                                        z2 = true;
                                        int i5 = iG3 - 128;
                                        if (this.f18497p != i5) {
                                            this.f18497p = i5;
                                            this.f18495l = cueInfoBuilderArr[i5];
                                        }
                                        break;
                                    case PRIVACY_URL_ERROR_VALUE:
                                        z2 = true;
                                        for (int i6 = 1; i6 <= 8; i6++) {
                                            if (parsableBitArray.f()) {
                                                CueInfoBuilder cueInfoBuilder = cueInfoBuilderArr[8 - i6];
                                                cueInfoBuilder.f18507a.clear();
                                                cueInfoBuilder.f18508b.clear();
                                                cueInfoBuilder.f18515p = -1;
                                                cueInfoBuilder.q = -1;
                                                cueInfoBuilder.r = -1;
                                                cueInfoBuilder.t = -1;
                                                cueInfoBuilder.v = 0;
                                            }
                                        }
                                        break;
                                    case TPAT_RETRY_FAILED_VALUE:
                                        for (int i7 = 1; i7 <= 8; i7++) {
                                            if (parsableBitArray.f()) {
                                                cueInfoBuilderArr[8 - i7].d = true;
                                            }
                                        }
                                        z2 = true;
                                        break;
                                    case 138:
                                        for (int i8 = 1; i8 <= 8; i8++) {
                                            if (parsableBitArray.f()) {
                                                cueInfoBuilderArr[8 - i8].d = false;
                                            }
                                        }
                                        z2 = true;
                                        break;
                                    case 139:
                                        for (int i9 = 1; i9 <= 8; i9++) {
                                            if (parsableBitArray.f()) {
                                                CueInfoBuilder cueInfoBuilder2 = cueInfoBuilderArr[8 - i9];
                                                cueInfoBuilder2.d = !cueInfoBuilder2.d;
                                            }
                                        }
                                        z2 = true;
                                        break;
                                    case 140:
                                        for (int i10 = 1; i10 <= 8; i10++) {
                                            if (parsableBitArray.f()) {
                                                cueInfoBuilderArr[8 - i10].d();
                                            }
                                        }
                                        z2 = true;
                                        break;
                                    case 141:
                                        parsableBitArray.n(8);
                                        z2 = true;
                                        break;
                                    case 142:
                                        z2 = true;
                                        break;
                                    case 143:
                                        g();
                                        z2 = true;
                                        break;
                                    case 144:
                                        if (this.f18495l.f18509c) {
                                            parsableBitArray.g(4);
                                            parsableBitArray.g(2);
                                            parsableBitArray.g(2);
                                            boolean zF = parsableBitArray.f();
                                            boolean zF2 = parsableBitArray.f();
                                            parsableBitArray.g(3);
                                            parsableBitArray.g(3);
                                            this.f18495l.e(zF, zF2);
                                        } else {
                                            parsableBitArray.n(16);
                                        }
                                        z2 = true;
                                        break;
                                    case 145:
                                        if (this.f18495l.f18509c) {
                                            int iC = CueInfoBuilder.c(parsableBitArray.g(2), parsableBitArray.g(2), parsableBitArray.g(2), parsableBitArray.g(2));
                                            int iC2 = CueInfoBuilder.c(parsableBitArray.g(2), parsableBitArray.g(2), parsableBitArray.g(2), parsableBitArray.g(2));
                                            parsableBitArray.n(2);
                                            CueInfoBuilder.c(parsableBitArray.g(2), parsableBitArray.g(2), parsableBitArray.g(2), 0);
                                            this.f18495l.f(iC, iC2);
                                        } else {
                                            parsableBitArray.n(24);
                                        }
                                        z2 = true;
                                        break;
                                    case 146:
                                        if (this.f18495l.f18509c) {
                                            parsableBitArray.n(4);
                                            int iG4 = parsableBitArray.g(4);
                                            parsableBitArray.n(2);
                                            parsableBitArray.g(6);
                                            CueInfoBuilder cueInfoBuilder3 = this.f18495l;
                                            if (cueInfoBuilder3.v != iG4) {
                                                cueInfoBuilder3.a('\n');
                                            }
                                            cueInfoBuilder3.v = iG4;
                                        } else {
                                            parsableBitArray.n(16);
                                        }
                                        z2 = true;
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        Z.s(iG3, "Invalid C1 command: ", "Cea708Decoder");
                                        z2 = true;
                                        break;
                                    case 151:
                                        if (this.f18495l.f18509c) {
                                            int iC3 = CueInfoBuilder.c(parsableBitArray.g(2), parsableBitArray.g(2), parsableBitArray.g(2), parsableBitArray.g(2));
                                            parsableBitArray.g(2);
                                            CueInfoBuilder.c(parsableBitArray.g(2), parsableBitArray.g(2), parsableBitArray.g(2), 0);
                                            parsableBitArray.f();
                                            parsableBitArray.f();
                                            parsableBitArray.g(2);
                                            parsableBitArray.g(2);
                                            int iG5 = parsableBitArray.g(2);
                                            parsableBitArray.n(8);
                                            CueInfoBuilder cueInfoBuilder4 = this.f18495l;
                                            cueInfoBuilder4.o = iC3;
                                            cueInfoBuilder4.f18513l = iG5;
                                        } else {
                                            parsableBitArray.n(32);
                                        }
                                        z2 = true;
                                        break;
                                    case 152:
                                    case 153:
                                    case 154:
                                    case ModuleDescriptor.MODULE_VERSION /* 155 */:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i11 = iG3 - 152;
                                        CueInfoBuilder cueInfoBuilder5 = cueInfoBuilderArr[i11];
                                        parsableBitArray.n(i2);
                                        boolean zF3 = parsableBitArray.f();
                                        boolean zF4 = parsableBitArray.f();
                                        parsableBitArray.f();
                                        int iG6 = parsableBitArray.g(i4);
                                        boolean zF5 = parsableBitArray.f();
                                        int iG7 = parsableBitArray.g(7);
                                        int iG8 = parsableBitArray.g(8);
                                        int iG9 = parsableBitArray.g(4);
                                        int iG10 = parsableBitArray.g(4);
                                        parsableBitArray.n(i2);
                                        parsableBitArray.g(6);
                                        parsableBitArray.n(i2);
                                        int iG11 = parsableBitArray.g(3);
                                        int iG12 = parsableBitArray.g(3);
                                        cueInfoBuilder5.f18509c = true;
                                        cueInfoBuilder5.d = zF3;
                                        cueInfoBuilder5.k = zF4;
                                        cueInfoBuilder5.f18510e = iG6;
                                        cueInfoBuilder5.f = zF5;
                                        cueInfoBuilder5.g = iG7;
                                        cueInfoBuilder5.f18511h = iG8;
                                        cueInfoBuilder5.f18512i = iG9;
                                        int i12 = iG10 + 1;
                                        if (cueInfoBuilder5.j != i12) {
                                            cueInfoBuilder5.j = i12;
                                            while (true) {
                                                ArrayList arrayList = cueInfoBuilder5.f18507a;
                                                if ((zF4 && arrayList.size() >= cueInfoBuilder5.j) || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (iG11 != 0 && cueInfoBuilder5.m != iG11) {
                                            cueInfoBuilder5.m = iG11;
                                            int i13 = iG11 - 1;
                                            int i14 = CueInfoBuilder.C[i13];
                                            boolean z4 = CueInfoBuilder.f18502B[i13];
                                            int i15 = CueInfoBuilder.f18506z[i13];
                                            int i16 = CueInfoBuilder.f18501A[i13];
                                            int i17 = CueInfoBuilder.y[i13];
                                            cueInfoBuilder5.o = i14;
                                            cueInfoBuilder5.f18513l = i17;
                                        }
                                        if (iG12 != 0 && cueInfoBuilder5.f18514n != iG12) {
                                            cueInfoBuilder5.f18514n = iG12;
                                            int i18 = iG12 - 1;
                                            int i19 = CueInfoBuilder.f18503E[i18];
                                            int i20 = CueInfoBuilder.D[i18];
                                            cueInfoBuilder5.e(false, false);
                                            cueInfoBuilder5.f(CueInfoBuilder.f18505w, CueInfoBuilder.f18504F[i18]);
                                        }
                                        if (this.f18497p != i11) {
                                            this.f18497p = i11;
                                            this.f18495l = cueInfoBuilderArr[i11];
                                        }
                                        z2 = true;
                                        break;
                                }
                            } else {
                                z2 = true;
                                if (iG3 <= 255) {
                                    this.f18495l.a((char) (iG3 & 255));
                                } else {
                                    Z.s(iG3, "Invalid base command: ", "Cea708Decoder");
                                }
                                i2 = 2;
                                c2 = 7;
                            }
                            z3 = z2;
                            i2 = 2;
                            c2 = 7;
                        }
                        c2 = 7;
                        z2 = true;
                    } else {
                        z2 = true;
                        int iG13 = parsableBitArray.g(8);
                        if (iG13 <= 31) {
                            c2 = 7;
                            if (iG13 > 7) {
                                if (iG13 <= 15) {
                                    parsableBitArray.n(8);
                                } else if (iG13 <= 23) {
                                    parsableBitArray.n(16);
                                } else if (iG13 <= 31) {
                                    parsableBitArray.n(24);
                                }
                            }
                        } else {
                            c2 = 7;
                            if (iG13 <= 127) {
                                if (iG13 == 32) {
                                    this.f18495l.a(' ');
                                } else if (iG13 == 33) {
                                    this.f18495l.a((char) 160);
                                } else if (iG13 == 37) {
                                    this.f18495l.a((char) 8230);
                                } else if (iG13 == 42) {
                                    this.f18495l.a((char) 352);
                                } else if (iG13 == 44) {
                                    this.f18495l.a((char) 338);
                                } else if (iG13 == 63) {
                                    this.f18495l.a((char) 376);
                                } else if (iG13 == 57) {
                                    this.f18495l.a((char) 8482);
                                } else if (iG13 == 58) {
                                    this.f18495l.a((char) 353);
                                } else if (iG13 == 60) {
                                    this.f18495l.a((char) 339);
                                } else if (iG13 != 61) {
                                    switch (iG13) {
                                        case 48:
                                            this.f18495l.a((char) 9608);
                                            break;
                                        case 49:
                                            this.f18495l.a((char) 8216);
                                            break;
                                        case 50:
                                            this.f18495l.a((char) 8217);
                                            break;
                                        case AD_REWARD_USER_VALUE:
                                            this.f18495l.a((char) 8220);
                                            break;
                                        case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                                            this.f18495l.a((char) 8221);
                                            break;
                                        case 53:
                                            this.f18495l.a((char) 8226);
                                            break;
                                        default:
                                            switch (iG13) {
                                                case 118:
                                                    this.f18495l.a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.f18495l.a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.f18495l.a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.f18495l.a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.f18495l.a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.f18495l.a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.f18495l.a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.f18495l.a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.f18495l.a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.f18495l.a((char) 9484);
                                                    break;
                                                default:
                                                    Z.s(iG13, "Invalid G2 character: ", "Cea708Decoder");
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.f18495l.a((char) 8480);
                                }
                                z3 = true;
                            } else if (iG13 > 159) {
                                i2 = 2;
                                if (iG13 <= 255) {
                                    if (iG13 == 160) {
                                        this.f18495l.a((char) 13252);
                                    } else {
                                        Z.s(iG13, "Invalid G3 character: ", "Cea708Decoder");
                                        this.f18495l.a('_');
                                    }
                                    z3 = true;
                                } else {
                                    Z.s(iG13, "Invalid extended command: ", "Cea708Decoder");
                                }
                            } else if (iG13 <= 135) {
                                parsableBitArray.n(32);
                            } else if (iG13 <= 143) {
                                parsableBitArray.n(40);
                            } else if (iG13 <= 159) {
                                i2 = 2;
                                parsableBitArray.n(2);
                                parsableBitArray.n(parsableBitArray.g(6) * 8);
                            }
                        }
                        i2 = 2;
                    }
                    i4 = 3;
                    i2 = i2;
                }
            }
        }
        if (z3) {
            this.m = f();
        }
        this.o = null;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00eb  */
    public final List f() {
        Cea708CueInfo cea708CueInfo;
        Layout.Alignment alignment;
        float f;
        float f2;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 8; i2++) {
            CueInfoBuilder[] cueInfoBuilderArr = this.k;
            CueInfoBuilder cueInfoBuilder = cueInfoBuilderArr[i2];
            if (cueInfoBuilder.f18509c && (!cueInfoBuilder.f18507a.isEmpty() || cueInfoBuilder.f18508b.length() != 0)) {
                CueInfoBuilder cueInfoBuilder2 = cueInfoBuilderArr[i2];
                if (cueInfoBuilder2.d) {
                    if (cueInfoBuilder2.f18509c) {
                        ArrayList arrayList2 = cueInfoBuilder2.f18507a;
                        if (arrayList2.isEmpty() && cueInfoBuilder2.f18508b.length() == 0) {
                            cea708CueInfo = null;
                        } else {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                                spannableStringBuilder.append((CharSequence) arrayList2.get(i3));
                                spannableStringBuilder.append('\n');
                            }
                            spannableStringBuilder.append((CharSequence) cueInfoBuilder2.b());
                            int i4 = cueInfoBuilder2.f18513l;
                            if (i4 == 0) {
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            } else if (i4 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i4 != 2) {
                                if (i4 != 3) {
                                    throw new IllegalArgumentException("Unexpected justification value: " + cueInfoBuilder2.f18513l);
                                }
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            } else {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            }
                            Layout.Alignment alignment2 = alignment;
                            if (cueInfoBuilder2.f) {
                                f = cueInfoBuilder2.f18511h / 99.0f;
                                f2 = cueInfoBuilder2.g / 99.0f;
                            } else {
                                f = cueInfoBuilder2.f18511h / 209.0f;
                                f2 = cueInfoBuilder2.g / 74.0f;
                            }
                            float f3 = (f * 0.9f) + 0.05f;
                            float f4 = (f2 * 0.9f) + 0.05f;
                            int i5 = cueInfoBuilder2.f18512i;
                            int i6 = i5 / 3;
                            int i7 = i6 == 0 ? 0 : i6 == 1 ? 1 : 2;
                            int i8 = i5 % 3;
                            int i9 = i8 == 0 ? 0 : i8 == 1 ? 1 : 2;
                            int i10 = cueInfoBuilder2.o;
                            cea708CueInfo = new Cea708CueInfo(spannableStringBuilder, alignment2, f4, i7, f3, i9, i10 != CueInfoBuilder.x, i10, cueInfoBuilder2.f18510e);
                        }
                    } else {
                        cea708CueInfo = null;
                    }
                    if (cea708CueInfo != null) {
                        arrayList.add(cea708CueInfo);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, Cea708CueInfo.f18498c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList3.add(((Cea708CueInfo) arrayList.get(i11)).f18499a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public final void flush() {
        super.flush();
        this.m = null;
        this.f18496n = null;
        this.f18497p = 0;
        this.f18495l = this.k[0];
        g();
        this.o = null;
    }

    public final void g() {
        for (int i2 = 0; i2 < 8; i2++) {
            this.k[i2].d();
        }
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final String getName() {
        return "Cea708Decoder";
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public final /* bridge */ /* synthetic */ void release() {
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.text.SubtitleDecoder
    public final void setPositionUs(long j) {
        this.f18523e = j;
    }
}
