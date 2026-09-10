package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.TrackOutput;
import com.inmobi.commons.core.configs.AdConfig;

/* JADX INFO: loaded from: classes.dex */
public final class MpegAudioReader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f7565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MpegAudioUtil.Header f7566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7567c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TrackOutput f7568e;
    public String f;
    public int g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7569h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7570i;
    public boolean j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7571l;
    public long m;

    public MpegAudioReader(String str, int i2) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(4);
        this.f7565a = parsableByteArray;
        parsableByteArray.f5667a[0] = -1;
        this.f7566b = new MpegAudioUtil.Header();
        this.m = -9223372036854775807L;
        this.f7567c = str;
        this.d = i2;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void a(ParsableByteArray parsableByteArray) {
        Assertions.f(this.f7568e);
        while (parsableByteArray.a() > 0) {
            int i2 = this.g;
            ParsableByteArray parsableByteArray2 = this.f7565a;
            if (i2 == 0) {
                byte[] bArr = parsableByteArray.f5667a;
                int i3 = parsableByteArray.f5668b;
                int i4 = parsableByteArray.f5669c;
                while (true) {
                    if (i3 >= i4) {
                        parsableByteArray.G(i4);
                        break;
                    }
                    byte b2 = bArr[i3];
                    boolean z2 = (b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255;
                    boolean z3 = this.j && (b2 & 224) == 224;
                    this.j = z2;
                    if (z3) {
                        parsableByteArray.G(i3 + 1);
                        this.j = false;
                        parsableByteArray2.f5667a[1] = bArr[i3];
                        this.f7569h = 2;
                        this.g = 1;
                        break;
                    }
                    i3++;
                }
            } else if (i2 == 1) {
                int iMin = Math.min(parsableByteArray.a(), 4 - this.f7569h);
                parsableByteArray.e(parsableByteArray2.f5667a, this.f7569h, iMin);
                int i5 = this.f7569h + iMin;
                this.f7569h = i5;
                if (i5 >= 4) {
                    parsableByteArray2.G(0);
                    int iG = parsableByteArray2.g();
                    MpegAudioUtil.Header header = this.f7566b;
                    if (header.a(iG)) {
                        this.f7571l = header.f6791c;
                        if (!this.f7570i) {
                            this.k = (((long) header.g) * 1000000) / ((long) header.d);
                            Format.Builder builder = new Format.Builder();
                            builder.f5423a = this.f;
                            builder.f5429l = MimeTypes.l(header.f6790b);
                            builder.m = 4096;
                            builder.f5434z = header.f6792e;
                            builder.f5418A = header.d;
                            builder.d = this.f7567c;
                            builder.f = this.d;
                            this.f7568e.b(new Format(builder));
                            this.f7570i = true;
                        }
                        parsableByteArray2.G(0);
                        this.f7568e.e(4, parsableByteArray2);
                        this.g = 2;
                    } else {
                        this.f7569h = 0;
                        this.g = 1;
                    }
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(parsableByteArray.a(), this.f7571l - this.f7569h);
                this.f7568e.e(iMin2, parsableByteArray);
                int i6 = this.f7569h + iMin2;
                this.f7569h = i6;
                if (i6 >= this.f7571l) {
                    Assertions.e(this.m != -9223372036854775807L);
                    this.f7568e.f(this.m, 1, this.f7571l, 0, null);
                    this.m += this.k;
                    this.f7569h = 0;
                    this.g = 0;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void c(int i2, long j) {
        this.m = j;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void d(boolean z2) {
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void e(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.f = trackIdGenerator.f7653e;
        trackIdGenerator.b();
        this.f7568e = extractorOutput.track(trackIdGenerator.d, 1);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.g = 0;
        this.f7569h = 0;
        this.j = false;
        this.m = -9223372036854775807L;
    }
}
