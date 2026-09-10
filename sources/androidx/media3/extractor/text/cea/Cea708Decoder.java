package androidx.media3.extractor.text.cea;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleInputBuffer;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Cea708Decoder extends CeaDecoder {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ParsableByteArray f7250h = new ParsableByteArray();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ParsableBitArray f7251i = new ParsableBitArray();
    public int j = -1;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CueInfoBuilder[] f7252l;
    public CueInfoBuilder m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f7253n;
    public List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public DtvCcPacket f7254p;
    public int q;

    public static final class Cea708CueInfo {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f7255c = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Cue f7256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7257b;

        public Cea708CueInfo(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i2, float f2, int i3, boolean z2, int i4, int i5) {
            Cue.Builder builder = new Cue.Builder();
            builder.f5604a = spannableStringBuilder;
            builder.f5606c = alignment;
            builder.f5607e = f;
            builder.f = 0;
            builder.g = i2;
            builder.f5608h = f2;
            builder.f5609i = i3;
            builder.f5610l = -3.4028235E38f;
            if (z2) {
                builder.o = i4;
                builder.f5611n = true;
            }
            this.f7256a = builder.a();
            this.f7257b = i5;
        }
    }

    public static final class CueInfoBuilder {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final boolean[] f7258A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final int[] f7259B;
        public static final int[] C;
        public static final int[] D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final int[] f7260E;
        public static final int v = c(2, 2, 2, 0);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f7261w;
        public static final int[] x;
        public static final int[] y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int[] f7262z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f7263a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SpannableStringBuilder f7264b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f7265c;
        public boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7266e;
        public boolean f;
        public int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f7267h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f7268i;
        public int j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f7269l;
        public int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f7270n;
        public int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f7271p;
        public int q;
        public int r;
        public int s;
        public int t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f7272u;

        static {
            int iC = c(0, 0, 0, 0);
            f7261w = iC;
            int iC2 = c(0, 0, 0, 3);
            x = new int[]{0, 0, 0, 0, 0, 2, 0};
            y = new int[]{0, 0, 0, 0, 0, 0, 2};
            f7262z = new int[]{3, 3, 3, 3, 3, 3, 1};
            f7258A = new boolean[]{false, false, false, true, true, true, false};
            f7259B = new int[]{iC, iC2, iC, iC, iC2, iC, iC};
            C = new int[]{0, 1, 2, 3, 4, 3, 4};
            D = new int[]{0, 0, 0, 0, 0, 3, 3};
            f7260E = new int[]{iC, iC, iC, iC, iC, iC2, iC2};
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
            SpannableStringBuilder spannableStringBuilder = this.f7264b;
            if (c2 != '\n') {
                spannableStringBuilder.append(c2);
                return;
            }
            ArrayList arrayList = this.f7263a;
            arrayList.add(b());
            spannableStringBuilder.clear();
            if (this.o != -1) {
                this.o = 0;
            }
            if (this.f7271p != -1) {
                this.f7271p = 0;
            }
            if (this.q != -1) {
                this.q = 0;
            }
            if (this.s != -1) {
                this.s = 0;
            }
            while (true) {
                if (arrayList.size() < this.j && arrayList.size() < 15) {
                    this.f7272u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        }

        public final SpannableString b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f7264b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.o, length, 33);
                }
                if (this.f7271p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f7271p, length, 33);
                }
                if (this.q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.r), this.q, length, 33);
                }
                if (this.s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.t), this.s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final void d() {
            this.f7263a.clear();
            this.f7264b.clear();
            this.o = -1;
            this.f7271p = -1;
            this.q = -1;
            this.s = -1;
            this.f7272u = 0;
            this.f7265c = false;
            this.d = false;
            this.f7266e = 4;
            this.f = false;
            this.g = 0;
            this.f7267h = 0;
            this.f7268i = 0;
            this.j = 15;
            this.k = 0;
            this.f7269l = 0;
            this.m = 0;
            int i2 = f7261w;
            this.f7270n = i2;
            this.r = v;
            this.t = i2;
        }

        public final void e(boolean z2, boolean z3) {
            int i2 = this.o;
            SpannableStringBuilder spannableStringBuilder = this.f7264b;
            if (i2 != -1) {
                if (!z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.o, spannableStringBuilder.length(), 33);
                    this.o = -1;
                }
            } else if (z2) {
                this.o = spannableStringBuilder.length();
            }
            if (this.f7271p == -1) {
                if (z3) {
                    this.f7271p = spannableStringBuilder.length();
                }
            } else {
                if (z3) {
                    return;
                }
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f7271p, spannableStringBuilder.length(), 33);
                this.f7271p = -1;
            }
        }

        public final void f(int i2, int i3) {
            int i4 = this.q;
            SpannableStringBuilder spannableStringBuilder = this.f7264b;
            if (i4 != -1 && this.r != i2) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.r), this.q, spannableStringBuilder.length(), 33);
            }
            if (i2 != v) {
                this.q = spannableStringBuilder.length();
                this.r = i2;
            }
            if (this.s != -1 && this.t != i3) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.t), this.s, spannableStringBuilder.length(), 33);
            }
            if (i3 != f7261w) {
                this.s = spannableStringBuilder.length();
                this.t = i3;
            }
        }
    }

    public static final class DtvCcPacket {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f7275c;
        public int d = 0;

        public DtvCcPacket(int i2, int i3) {
            this.f7273a = i2;
            this.f7274b = i3;
            this.f7275c = new byte[(i3 * 2) - 1];
        }
    }

    public Cea708Decoder(int i2, List list) {
        this.k = i2 == -1 ? 1 : i2;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b2 = ((byte[]) list.get(0))[0];
        }
        this.f7252l = new CueInfoBuilder[8];
        for (int i3 = 0; i3 < 8; i3++) {
            this.f7252l[i3] = new CueInfoBuilder();
        }
        this.m = this.f7252l[0];
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public final Subtitle c() {
        List list = this.f7253n;
        this.o = list;
        list.getClass();
        return new CeaSubtitle(list);
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public final void d(SubtitleInputBuffer subtitleInputBuffer) {
        ByteBuffer byteBuffer = subtitleInputBuffer.e0;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        ParsableByteArray parsableByteArray = this.f7250h;
        parsableByteArray.E(bArrArray, iLimit);
        while (parsableByteArray.a() >= 3) {
            int iU = parsableByteArray.u();
            int i2 = iU & 3;
            boolean z2 = (iU & 4) == 4;
            byte bU = (byte) parsableByteArray.u();
            byte bU2 = (byte) parsableByteArray.u();
            if (i2 == 2 || i2 == 3) {
                if (z2) {
                    if (i2 == 3) {
                        g();
                        int i3 = (bU & 192) >> 6;
                        int i4 = this.j;
                        if (i4 != -1 && i3 != (i4 + 1) % 4) {
                            i();
                            Log.g("Cea708Decoder", "Sequence number discontinuity. previous=" + this.j + " current=" + i3);
                        }
                        this.j = i3;
                        int i5 = bU & 63;
                        if (i5 == 0) {
                            i5 = 64;
                        }
                        DtvCcPacket dtvCcPacket = new DtvCcPacket(i3, i5);
                        this.f7254p = dtvCcPacket;
                        dtvCcPacket.d = 1;
                        dtvCcPacket.f7275c[0] = bU2;
                    } else {
                        Assertions.b(i2 == 2);
                        DtvCcPacket dtvCcPacket2 = this.f7254p;
                        if (dtvCcPacket2 == null) {
                            Log.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = dtvCcPacket2.f7275c;
                            int i6 = dtvCcPacket2.d;
                            int i7 = i6 + 1;
                            dtvCcPacket2.d = i7;
                            bArr[i6] = bU;
                            dtvCcPacket2.d = i6 + 2;
                            bArr[i7] = bU2;
                        }
                    }
                    DtvCcPacket dtvCcPacket3 = this.f7254p;
                    if (dtvCcPacket3.d == (dtvCcPacket3.f7274b * 2) - 1) {
                        g();
                    }
                }
            }
        }
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public final boolean f() {
        return this.f7253n != this.o;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public final void flush() {
        super.flush();
        this.f7253n = null;
        this.o = null;
        this.q = 0;
        this.m = this.f7252l[0];
        i();
        this.f7254p = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:228:0x0539  */
    public final void g() {
        boolean z2;
        char c2;
        boolean z3;
        DtvCcPacket dtvCcPacket = this.f7254p;
        if (dtvCcPacket == null) {
            return;
        }
        int i2 = 2;
        if (dtvCcPacket.d != (dtvCcPacket.f7274b * 2) - 1) {
            Log.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f7254p.f7274b * 2) - 1) + ", but current index is " + this.f7254p.d + " (sequence number " + this.f7254p.f7273a + ");");
        }
        DtvCcPacket dtvCcPacket2 = this.f7254p;
        byte[] bArr = dtvCcPacket2.f7275c;
        int i3 = dtvCcPacket2.d;
        ParsableBitArray parsableBitArray = this.f7251i;
        parsableBitArray.l(bArr, i3);
        boolean z4 = false;
        while (parsableBitArray.b() > 0) {
            int i4 = 3;
            int iG = parsableBitArray.g(3);
            int iG2 = parsableBitArray.g(5);
            if (iG == 7) {
                parsableBitArray.o(i2);
                iG = parsableBitArray.g(6);
                if (iG < 7) {
                    androidx.datastore.preferences.protobuf.a.C(iG, "Invalid extended service number: ", "Cea708Decoder");
                }
            }
            if (iG2 == 0) {
                if (iG != 0) {
                    Log.g("Cea708Decoder", "serviceNumber is non-zero (" + iG + ") when blockSize is 0");
                }
                if (z4) {
                    this.f7253n = h();
                }
                this.f7254p = null;
            }
            if (iG != this.k) {
                parsableBitArray.p(iG2);
            } else {
                int iE = (iG2 * 8) + parsableBitArray.e();
                while (parsableBitArray.e() < iE) {
                    int iG3 = parsableBitArray.g(8);
                    if (iG3 != 16) {
                        if (iG3 <= 31) {
                            if (iG3 != 0) {
                                if (iG3 == i4) {
                                    this.f7253n = h();
                                } else if (iG3 != 8) {
                                    switch (iG3) {
                                        case 12:
                                            i();
                                            break;
                                        case 13:
                                            this.m.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (iG3 >= 17 && iG3 <= 23) {
                                                Log.g("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + iG3);
                                                parsableBitArray.o(8);
                                            } else if (iG3 < 24 || iG3 > 31) {
                                                androidx.datastore.preferences.protobuf.a.C(iG3, "Invalid C0 command: ", "Cea708Decoder");
                                            } else {
                                                Log.g("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + iG3);
                                                parsableBitArray.o(16);
                                            }
                                            break;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.m.f7264b;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                        } else if (iG3 <= 127) {
                            if (iG3 == 127) {
                                this.m.a((char) 9835);
                            } else {
                                this.m.a((char) (iG3 & 255));
                            }
                            z4 = true;
                        } else {
                            if (iG3 <= 159) {
                                CueInfoBuilder[] cueInfoBuilderArr = this.f7252l;
                                switch (iG3) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                                    case OMSDK_JS_WRITE_FAILED_VALUE:
                                    case 134:
                                    case 135:
                                        z3 = false;
                                        z2 = true;
                                        int i5 = iG3 - 128;
                                        if (this.q != i5) {
                                            this.q = i5;
                                            this.m = cueInfoBuilderArr[i5];
                                        }
                                        break;
                                    case PRIVACY_URL_ERROR_VALUE:
                                        z2 = true;
                                        for (int i6 = 1; i6 <= 8; i6++) {
                                            if (parsableBitArray.f()) {
                                                CueInfoBuilder cueInfoBuilder = cueInfoBuilderArr[8 - i6];
                                                cueInfoBuilder.f7263a.clear();
                                                cueInfoBuilder.f7264b.clear();
                                                cueInfoBuilder.o = -1;
                                                cueInfoBuilder.f7271p = -1;
                                                cueInfoBuilder.q = -1;
                                                cueInfoBuilder.s = -1;
                                                cueInfoBuilder.f7272u = 0;
                                            }
                                        }
                                        z3 = false;
                                        break;
                                    case TPAT_RETRY_FAILED_VALUE:
                                        for (int i7 = 1; i7 <= 8; i7++) {
                                            if (parsableBitArray.f()) {
                                                cueInfoBuilderArr[8 - i7].d = true;
                                            }
                                        }
                                        z2 = true;
                                        z3 = false;
                                        break;
                                    case 138:
                                        for (int i8 = 1; i8 <= 8; i8++) {
                                            if (parsableBitArray.f()) {
                                                cueInfoBuilderArr[8 - i8].d = false;
                                            }
                                        }
                                        z3 = false;
                                        z2 = true;
                                        break;
                                    case 139:
                                        for (int i9 = 1; i9 <= 8; i9++) {
                                            if (parsableBitArray.f()) {
                                                CueInfoBuilder cueInfoBuilder2 = cueInfoBuilderArr[8 - i9];
                                                cueInfoBuilder2.d = !cueInfoBuilder2.d;
                                            }
                                        }
                                        z3 = false;
                                        z2 = true;
                                        break;
                                    case 140:
                                        for (int i10 = 1; i10 <= 8; i10++) {
                                            if (parsableBitArray.f()) {
                                                cueInfoBuilderArr[8 - i10].d();
                                            }
                                        }
                                        z3 = false;
                                        z2 = true;
                                        break;
                                    case 141:
                                        parsableBitArray.o(8);
                                        z3 = false;
                                        z2 = true;
                                        break;
                                    case 142:
                                        z3 = false;
                                        z2 = true;
                                        break;
                                    case 143:
                                        i();
                                        z3 = false;
                                        z2 = true;
                                        break;
                                    case 144:
                                        if (this.m.f7265c) {
                                            parsableBitArray.g(4);
                                            parsableBitArray.g(2);
                                            parsableBitArray.g(2);
                                            boolean zF = parsableBitArray.f();
                                            boolean zF2 = parsableBitArray.f();
                                            i4 = 3;
                                            parsableBitArray.g(3);
                                            parsableBitArray.g(3);
                                            this.m.e(zF, zF2);
                                            z3 = false;
                                            z2 = true;
                                        } else {
                                            parsableBitArray.o(16);
                                            z3 = false;
                                            i4 = 3;
                                            z2 = true;
                                        }
                                        break;
                                    case 145:
                                        if (this.m.f7265c) {
                                            int iC = CueInfoBuilder.c(parsableBitArray.g(2), parsableBitArray.g(2), parsableBitArray.g(2), parsableBitArray.g(2));
                                            int iC2 = CueInfoBuilder.c(parsableBitArray.g(2), parsableBitArray.g(2), parsableBitArray.g(2), parsableBitArray.g(2));
                                            parsableBitArray.o(2);
                                            CueInfoBuilder.c(parsableBitArray.g(2), parsableBitArray.g(2), parsableBitArray.g(2), 0);
                                            this.m.f(iC, iC2);
                                        } else {
                                            parsableBitArray.o(24);
                                        }
                                        z3 = false;
                                        i4 = 3;
                                        z2 = true;
                                        break;
                                    case 146:
                                        if (this.m.f7265c) {
                                            parsableBitArray.o(4);
                                            int iG4 = parsableBitArray.g(4);
                                            parsableBitArray.o(2);
                                            parsableBitArray.g(6);
                                            CueInfoBuilder cueInfoBuilder3 = this.m;
                                            if (cueInfoBuilder3.f7272u != iG4) {
                                                cueInfoBuilder3.a('\n');
                                            }
                                            cueInfoBuilder3.f7272u = iG4;
                                        } else {
                                            parsableBitArray.o(16);
                                        }
                                        z3 = false;
                                        i4 = 3;
                                        z2 = true;
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        androidx.datastore.preferences.protobuf.a.C(iG3, "Invalid C1 command: ", "Cea708Decoder");
                                        z3 = false;
                                        z2 = true;
                                        break;
                                    case 151:
                                        if (this.m.f7265c) {
                                            int iC3 = CueInfoBuilder.c(parsableBitArray.g(2), parsableBitArray.g(2), parsableBitArray.g(2), parsableBitArray.g(2));
                                            parsableBitArray.g(2);
                                            CueInfoBuilder.c(parsableBitArray.g(2), parsableBitArray.g(2), parsableBitArray.g(2), 0);
                                            parsableBitArray.f();
                                            parsableBitArray.f();
                                            parsableBitArray.g(2);
                                            parsableBitArray.g(2);
                                            int iG5 = parsableBitArray.g(2);
                                            parsableBitArray.o(8);
                                            CueInfoBuilder cueInfoBuilder4 = this.m;
                                            cueInfoBuilder4.f7270n = iC3;
                                            cueInfoBuilder4.k = iG5;
                                        } else {
                                            parsableBitArray.o(32);
                                        }
                                        z3 = false;
                                        i4 = 3;
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
                                        parsableBitArray.o(i2);
                                        boolean zF3 = parsableBitArray.f();
                                        parsableBitArray.o(i2);
                                        int iG6 = parsableBitArray.g(i4);
                                        boolean zF4 = parsableBitArray.f();
                                        int iG7 = parsableBitArray.g(7);
                                        int iG8 = parsableBitArray.g(8);
                                        int iG9 = parsableBitArray.g(4);
                                        int iG10 = parsableBitArray.g(4);
                                        parsableBitArray.o(i2);
                                        parsableBitArray.o(6);
                                        parsableBitArray.o(i2);
                                        int iG11 = parsableBitArray.g(3);
                                        int iG12 = parsableBitArray.g(3);
                                        cueInfoBuilder5.f7265c = true;
                                        cueInfoBuilder5.d = zF3;
                                        cueInfoBuilder5.f7266e = iG6;
                                        cueInfoBuilder5.f = zF4;
                                        cueInfoBuilder5.g = iG7;
                                        cueInfoBuilder5.f7267h = iG8;
                                        cueInfoBuilder5.f7268i = iG9;
                                        int i12 = iG10 + 1;
                                        if (cueInfoBuilder5.j != i12) {
                                            cueInfoBuilder5.j = i12;
                                            while (true) {
                                                ArrayList arrayList = cueInfoBuilder5.f7263a;
                                                if (arrayList.size() >= cueInfoBuilder5.j || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (iG11 != 0 && cueInfoBuilder5.f7269l != iG11) {
                                            cueInfoBuilder5.f7269l = iG11;
                                            int i13 = iG11 - 1;
                                            int i14 = CueInfoBuilder.f7259B[i13];
                                            boolean z5 = CueInfoBuilder.f7258A[i13];
                                            int i15 = CueInfoBuilder.y[i13];
                                            int i16 = CueInfoBuilder.f7262z[i13];
                                            int i17 = CueInfoBuilder.x[i13];
                                            cueInfoBuilder5.f7270n = i14;
                                            cueInfoBuilder5.k = i17;
                                        }
                                        if (iG12 != 0 && cueInfoBuilder5.m != iG12) {
                                            cueInfoBuilder5.m = iG12;
                                            int i18 = iG12 - 1;
                                            int i19 = CueInfoBuilder.D[i18];
                                            int i20 = CueInfoBuilder.C[i18];
                                            cueInfoBuilder5.e(false, false);
                                            cueInfoBuilder5.f(CueInfoBuilder.v, CueInfoBuilder.f7260E[i18]);
                                        }
                                        if (this.q != i11) {
                                            this.q = i11;
                                            this.m = cueInfoBuilderArr[i11];
                                        }
                                        z3 = false;
                                        i4 = 3;
                                        z2 = true;
                                        break;
                                }
                            } else {
                                z3 = false;
                                z2 = true;
                                if (iG3 <= 255) {
                                    this.m.a((char) (iG3 & 255));
                                } else {
                                    androidx.datastore.preferences.protobuf.a.C(iG3, "Invalid base command: ", "Cea708Decoder");
                                }
                                i2 = 2;
                                c2 = 7;
                            }
                            z4 = z2;
                            i2 = 2;
                            c2 = 7;
                        }
                        z2 = true;
                        c2 = 7;
                    } else {
                        z2 = true;
                        int iG13 = parsableBitArray.g(8);
                        if (iG13 <= 31) {
                            c2 = 7;
                            if (iG13 > 7) {
                                if (iG13 <= 15) {
                                    parsableBitArray.o(8);
                                } else if (iG13 <= 23) {
                                    parsableBitArray.o(16);
                                } else if (iG13 <= 31) {
                                    parsableBitArray.o(24);
                                }
                            }
                        } else {
                            c2 = 7;
                            if (iG13 <= 127) {
                                if (iG13 == 32) {
                                    this.m.a(' ');
                                } else if (iG13 == 33) {
                                    this.m.a((char) 160);
                                } else if (iG13 == 37) {
                                    this.m.a((char) 8230);
                                } else if (iG13 == 42) {
                                    this.m.a((char) 352);
                                } else if (iG13 == 44) {
                                    this.m.a((char) 338);
                                } else if (iG13 == 63) {
                                    this.m.a((char) 376);
                                } else if (iG13 == 57) {
                                    this.m.a((char) 8482);
                                } else if (iG13 == 58) {
                                    this.m.a((char) 353);
                                } else if (iG13 == 60) {
                                    this.m.a((char) 339);
                                } else if (iG13 != 61) {
                                    switch (iG13) {
                                        case 48:
                                            this.m.a((char) 9608);
                                            break;
                                        case 49:
                                            this.m.a((char) 8216);
                                            break;
                                        case 50:
                                            this.m.a((char) 8217);
                                            break;
                                        case AD_REWARD_USER_VALUE:
                                            this.m.a((char) 8220);
                                            break;
                                        case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                                            this.m.a((char) 8221);
                                            break;
                                        case 53:
                                            this.m.a((char) 8226);
                                            break;
                                        default:
                                            switch (iG13) {
                                                case 118:
                                                    this.m.a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.m.a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.m.a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.m.a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.m.a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.m.a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.m.a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.m.a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.m.a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.m.a((char) 9484);
                                                    break;
                                                default:
                                                    androidx.datastore.preferences.protobuf.a.C(iG13, "Invalid G2 character: ", "Cea708Decoder");
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.m.a((char) 8480);
                                }
                                z4 = true;
                            } else if (iG13 > 159) {
                                i2 = 2;
                                if (iG13 <= 255) {
                                    if (iG13 == 160) {
                                        this.m.a((char) 13252);
                                    } else {
                                        androidx.datastore.preferences.protobuf.a.C(iG13, "Invalid G3 character: ", "Cea708Decoder");
                                        this.m.a('_');
                                    }
                                    z4 = true;
                                } else {
                                    androidx.datastore.preferences.protobuf.a.C(iG13, "Invalid extended command: ", "Cea708Decoder");
                                }
                            } else if (iG13 <= 135) {
                                parsableBitArray.o(32);
                            } else if (iG13 <= 143) {
                                parsableBitArray.o(40);
                            } else if (iG13 <= 159) {
                                i2 = 2;
                                parsableBitArray.o(2);
                                parsableBitArray.o(parsableBitArray.g(6) * 8);
                            }
                        }
                        i2 = 2;
                    }
                    i2 = i2;
                }
            }
        }
        if (z4) {
            this.f7253n = h();
        }
        this.f7254p = null;
    }

    @Override // androidx.media3.decoder.Decoder
    public final String getName() {
        return "Cea708Decoder";
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00eb  */
    public final List h() {
        Cea708CueInfo cea708CueInfo;
        Layout.Alignment alignment;
        float f;
        float f2;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 8; i2++) {
            CueInfoBuilder[] cueInfoBuilderArr = this.f7252l;
            CueInfoBuilder cueInfoBuilder = cueInfoBuilderArr[i2];
            if (cueInfoBuilder.f7265c && (!cueInfoBuilder.f7263a.isEmpty() || cueInfoBuilder.f7264b.length() != 0)) {
                CueInfoBuilder cueInfoBuilder2 = cueInfoBuilderArr[i2];
                if (cueInfoBuilder2.d) {
                    if (cueInfoBuilder2.f7265c) {
                        ArrayList arrayList2 = cueInfoBuilder2.f7263a;
                        if (arrayList2.isEmpty() && cueInfoBuilder2.f7264b.length() == 0) {
                            cea708CueInfo = null;
                        } else {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                                spannableStringBuilder.append((CharSequence) arrayList2.get(i3));
                                spannableStringBuilder.append('\n');
                            }
                            spannableStringBuilder.append((CharSequence) cueInfoBuilder2.b());
                            int i4 = cueInfoBuilder2.k;
                            if (i4 == 0) {
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            } else if (i4 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i4 != 2) {
                                if (i4 != 3) {
                                    throw new IllegalArgumentException("Unexpected justification value: " + cueInfoBuilder2.k);
                                }
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            } else {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            }
                            Layout.Alignment alignment2 = alignment;
                            if (cueInfoBuilder2.f) {
                                f = cueInfoBuilder2.f7267h / 99.0f;
                                f2 = cueInfoBuilder2.g / 99.0f;
                            } else {
                                f = cueInfoBuilder2.f7267h / 209.0f;
                                f2 = cueInfoBuilder2.g / 74.0f;
                            }
                            float f3 = (f * 0.9f) + 0.05f;
                            float f4 = (f2 * 0.9f) + 0.05f;
                            int i5 = cueInfoBuilder2.f7268i;
                            int i6 = i5 / 3;
                            int i7 = i6 == 0 ? 0 : i6 == 1 ? 1 : 2;
                            int i8 = i5 % 3;
                            int i9 = i8 == 0 ? 0 : i8 == 1 ? 1 : 2;
                            int i10 = cueInfoBuilder2.f7270n;
                            cea708CueInfo = new Cea708CueInfo(spannableStringBuilder, alignment2, f4, i7, f3, i9, i10 != CueInfoBuilder.f7261w, i10, cueInfoBuilder2.f7266e);
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
        Collections.sort(arrayList, Cea708CueInfo.f7255c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList3.add(((Cea708CueInfo) arrayList.get(i11)).f7256a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void i() {
        for (int i2 = 0; i2 < 8; i2++) {
            this.f7252l[i2].d();
        }
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public final /* bridge */ /* synthetic */ void release() {
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.extractor.text.SubtitleDecoder
    public final void setPositionUs(long j) {
        this.f7279e = j;
    }
}
