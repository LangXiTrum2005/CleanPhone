package ne;

import com.ironsource.InterfaceC0435l1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f[] f46719i = {new f(3, 5, 8, 8, 1, 3, 5, false), new f(5, 7, 10, 10, 1, 5, 7, false), new f(5, 7, 16, 6, 1, 5, 7, true), new f(8, 10, 12, 12, 1, 8, 10, false), new f(10, 11, 14, 6, 2, 10, 11, true), new f(12, 12, 14, 14, 1, 12, 12, false), new f(16, 14, 24, 10, 1, 16, 14, true), new f(18, 14, 16, 16, 1, 18, 14, false), new f(22, 18, 18, 18, 1, 22, 18, false), new f(22, 18, 16, 10, 2, 22, 18, true), new f(30, 20, 20, 20, 1, 30, 20, false), new f(32, 24, 16, 14, 2, 32, 24, true), new f(36, 24, 22, 22, 1, 36, 24, false), new f(44, 28, 24, 24, 1, 44, 28, false), new f(49, 28, 22, 14, 2, 49, 28, true), new f(62, 36, 14, 14, 4, 62, 36, false), new f(86, 42, 16, 16, 4, 86, 42, false), new f(114, 48, 18, 18, 4, 114, 48, false), new f(144, 56, 20, 20, 4, 144, 56, false), new f(174, 68, 22, 22, 4, 174, 68, false), new f(204, 84, 24, 24, 4, InterfaceC0435l1.d.b.f29106c, 42, false), new f(280, InterfaceC0435l1.d.b.f29113j, 14, 14, 16, 140, 56, false), new f(368, 144, 16, 16, 16, 92, 36, false), new f(456, PsExtractor.AUDIO_STREAM, 18, 18, 16, 114, 48, false), new f(576, 224, 20, 20, 16, 144, 56, false), new f(696, 272, 22, 22, 16, 174, 68, false), new f(816, 336, 24, 24, 16, 136, 56, false), new f(1050, InterfaceC0435l1.a.b.f29088h, 18, 18, 36, 175, 68, false), new f(1304, 496, 20, 20, 36, 163, 62, false), new b(1558, IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW, 22, 22, 36, -1, 62, false)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f46724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f46725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f46726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f46727h;

    public f(int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10) {
        this.f46720a = z10;
        this.f46721b = i10;
        this.f46722c = i11;
        this.f46723d = i12;
        this.f46724e = i13;
        this.f46725f = i14;
        this.f46726g = i15;
        this.f46727h = i16;
    }

    public static f e(int i10, g gVar) {
        for (int i11 = 0; i11 < 30; i11++) {
            f fVar = f46719i[i11];
            if (!(gVar == g.f46729b && fVar.f46720a) && ((gVar != g.f46730c || fVar.f46720a) && i10 <= fVar.f46721b)) {
                return fVar;
            }
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i10)));
    }

    public int a(int i10) {
        return this.f46726g;
    }

    public final int b() {
        int i10 = this.f46725f;
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2 && i10 != 4) {
                if (i10 == 16) {
                    return 4;
                }
                if (i10 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i11;
    }

    public int c() {
        return this.f46721b / this.f46726g;
    }

    public final int d() {
        int i10 = this.f46725f;
        if (i10 == 1 || i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f46720a ? "Rectangular Symbol:" : "Square Symbol:");
        sb2.append(" data region ");
        int i10 = this.f46723d;
        sb2.append(i10);
        sb2.append('x');
        int i11 = this.f46724e;
        sb2.append(i11);
        sb2.append(", symbol size ");
        sb2.append((b() * i10) + (b() << 1));
        sb2.append('x');
        sb2.append((d() * i11) + (d() << 1));
        sb2.append(", symbol data size ");
        sb2.append(b() * i10);
        sb2.append('x');
        sb2.append(d() * i11);
        sb2.append(", codewords ");
        sb2.append(this.f46721b);
        sb2.append('+');
        sb2.append(this.f46722c);
        return sb2.toString();
    }
}
