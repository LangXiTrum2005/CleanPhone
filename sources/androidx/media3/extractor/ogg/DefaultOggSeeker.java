package androidx.media3.extractor.ogg;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import com.inmobi.commons.core.configs.CrashConfig;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
final class DefaultOggSeeker implements OggSeeker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OggPageHeader f7163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7165c;
    public final StreamReader d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7166e;
    public long f;
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f7167h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f7168i;
    public long j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f7169l;

    public final class OggSeekMap implements SeekMap {
        public OggSeekMap() {
        }

        @Override // androidx.media3.extractor.SeekMap
        public final long getDurationUs() {
            DefaultOggSeeker defaultOggSeeker = DefaultOggSeeker.this;
            return (defaultOggSeeker.f * 1000000) / ((long) defaultOggSeeker.d.f7193i);
        }

        @Override // androidx.media3.extractor.SeekMap
        public final SeekMap.SeekPoints getSeekPoints(long j) {
            DefaultOggSeeker defaultOggSeeker = DefaultOggSeeker.this;
            BigInteger bigIntegerValueOf = BigInteger.valueOf((((long) defaultOggSeeker.d.f7193i) * j) / 1000000);
            long j2 = defaultOggSeeker.f7165c;
            long j3 = defaultOggSeeker.f7164b;
            SeekPoint seekPoint = new SeekPoint(j, Util.k((bigIntegerValueOf.multiply(BigInteger.valueOf(j2 - j3)).divide(BigInteger.valueOf(defaultOggSeeker.f)).longValue() + j3) - CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, defaultOggSeeker.f7164b, j2 - 1));
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }

        @Override // androidx.media3.extractor.SeekMap
        public final boolean isSeekable() {
            return true;
        }
    }

    public DefaultOggSeeker(StreamReader streamReader, long j, long j2, long j3, long j4, boolean z2) {
        Assertions.b(j >= 0 && j2 > j);
        this.d = streamReader;
        this.f7164b = j;
        this.f7165c = j2;
        if (j3 == j2 - j || z2) {
            this.f = j4;
            this.f7166e = 4;
        } else {
            this.f7166e = 0;
        }
        this.f7163a = new OggPageHeader();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // androidx.media3.extractor.ogg.OggSeeker
    public final long a(DefaultExtractorInput defaultExtractorInput) throws IOException {
        long j;
        ?? r4;
        long j2;
        long j3;
        long jK;
        int i2 = this.f7166e;
        long j4 = this.f7165c;
        OggPageHeader oggPageHeader = this.f7163a;
        if (i2 == 0) {
            j = 0;
            long j5 = defaultExtractorInput.d;
            this.g = j5;
            this.f7166e = 1;
            long j6 = j4 - 65307;
            if (j6 > j5) {
                return j6;
            }
            r4 = 0;
        } else if (i2 != 1) {
            if (i2 == 2) {
                j2 = 2;
                long j7 = this.f7168i;
                long j8 = this.j;
                if (j7 == j8) {
                    jK = -1;
                    j3 = -1;
                } else {
                    long j9 = defaultExtractorInput.d;
                    if (oggPageHeader.b(defaultExtractorInput, j8)) {
                        oggPageHeader.a(defaultExtractorInput, false);
                        defaultExtractorInput.f = 0;
                        long j10 = this.f7167h;
                        long j11 = oggPageHeader.f7183b;
                        long j12 = j10 - j11;
                        int i3 = oggPageHeader.d + oggPageHeader.f7185e;
                        if (0 > j12 || j12 >= 72000) {
                            if (j12 < 0) {
                                this.j = j9;
                                this.f7169l = j11;
                            } else {
                                this.f7168i = defaultExtractorInput.d + ((long) i3);
                                this.k = j11;
                            }
                            long j13 = this.j;
                            long j14 = this.f7168i;
                            if (j13 - j14 < 100000) {
                                this.j = j14;
                                j3 = -1;
                                jK = j14;
                            } else {
                                j3 = -1;
                                jK = Util.k((((j13 - j14) * j12) / (this.f7169l - this.k)) + (defaultExtractorInput.d - (((long) i3) * (j12 <= 0 ? 2L : 1L))), j14, j13 - 1);
                            }
                        } else {
                            jK = -1;
                            j3 = -1;
                        }
                    } else {
                        jK = this.f7168i;
                        if (jK == j9) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j3 = -1;
                    }
                }
                if (jK != j3) {
                    return jK;
                }
                this.f7166e = 3;
            } else {
                if (i2 != 3) {
                    if (i2 == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j3 = -1;
                oggPageHeader = oggPageHeader;
                j2 = 2;
            }
            long j15 = j3;
            while (true) {
                oggPageHeader.b(defaultExtractorInput, j15);
                oggPageHeader.a(defaultExtractorInput, false);
                if (oggPageHeader.f7183b > this.f7167h) {
                    defaultExtractorInput.f = 0;
                    this.f7166e = 4;
                    return -(this.k + j2);
                }
                defaultExtractorInput.skipFully(oggPageHeader.d + oggPageHeader.f7185e);
                this.f7168i = defaultExtractorInput.d;
                this.k = oggPageHeader.f7183b;
                j15 = -1;
            }
        } else {
            j = 0;
            r4 = 0;
        }
        oggPageHeader.f7182a = r4;
        oggPageHeader.f7183b = j;
        oggPageHeader.f7184c = r4;
        oggPageHeader.d = r4;
        oggPageHeader.f7185e = r4;
        if (!oggPageHeader.b(defaultExtractorInput, -1L)) {
            throw new EOFException();
        }
        oggPageHeader.a(defaultExtractorInput, r4);
        defaultExtractorInput.skipFully(oggPageHeader.d + oggPageHeader.f7185e);
        long j16 = oggPageHeader.f7183b;
        while ((oggPageHeader.f7182a & 4) != 4 && oggPageHeader.b(defaultExtractorInput, -1L) && defaultExtractorInput.d < j4 && oggPageHeader.a(defaultExtractorInput, true)) {
            try {
                defaultExtractorInput.skipFully(oggPageHeader.d + oggPageHeader.f7185e);
                j16 = oggPageHeader.f7183b;
            } catch (EOFException unused) {
            }
        }
        this.f = j16;
        this.f7166e = 4;
        return this.g;
    }

    @Override // androidx.media3.extractor.ogg.OggSeeker
    public final SeekMap createSeekMap() {
        if (this.f != 0) {
            return new OggSeekMap();
        }
        return null;
    }

    @Override // androidx.media3.extractor.ogg.OggSeeker
    public final void startSeek(long j) {
        this.f7167h = Util.k(j, 0L, this.f - 1);
        this.f7166e = 2;
        this.f7168i = this.f7164b;
        this.j = this.f7165c;
        this.k = 0L;
        this.f7169l = this.f;
    }
}
