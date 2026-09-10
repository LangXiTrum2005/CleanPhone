package androidx.media3.extractor.ts;

import android.util.Pair;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class H262Reader implements ElementaryStreamReader {
    public static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TrackOutput f7482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UserDataReader f7483c;
    public final ParsableByteArray d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final NalUnitTargetBuffer f7484e;
    public final boolean[] f = new boolean[4];
    public final CsdBuffer g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f7485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7486i;
    public boolean j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f7487l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f7488n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7489p;

    public static final class CsdBuffer {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final byte[] f7490e = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7493c;
        public byte[] d;

        public final void a(byte[] bArr, int i2, int i3) {
            if (this.f7491a) {
                int i4 = i3 - i2;
                byte[] bArr2 = this.d;
                int length = bArr2.length;
                int i5 = this.f7492b + i4;
                if (length < i5) {
                    this.d = Arrays.copyOf(bArr2, i5 * 2);
                }
                System.arraycopy(bArr, i2, this.d, this.f7492b, i4);
                this.f7492b += i4;
            }
        }
    }

    public H262Reader(UserDataReader userDataReader) {
        this.f7483c = userDataReader;
        CsdBuffer csdBuffer = new CsdBuffer();
        csdBuffer.d = new byte[128];
        this.g = csdBuffer;
        if (userDataReader != null) {
            this.f7484e = new NalUnitTargetBuffer(178);
            this.d = new ParsableByteArray();
        } else {
            this.f7484e = null;
            this.d = null;
        }
        this.f7487l = -9223372036854775807L;
        this.f7488n = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0197  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void a(ParsableByteArray parsableByteArray) {
        CsdBuffer csdBuffer;
        NalUnitTargetBuffer nalUnitTargetBuffer;
        char c2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        float f;
        long j;
        float f2;
        int i3;
        char c3 = 3;
        Assertions.f(this.f7482b);
        int i4 = parsableByteArray.f5668b;
        int i5 = parsableByteArray.f5669c;
        byte[] bArr = parsableByteArray.f5667a;
        this.f7485h += (long) parsableByteArray.a();
        this.f7482b.e(parsableByteArray.a(), parsableByteArray);
        while (true) {
            int iB = NalUnitUtil.b(bArr, i4, i5, this.f);
            csdBuffer = this.g;
            nalUnitTargetBuffer = this.f7484e;
            if (iB == i5) {
                break;
            }
            int i6 = iB + 3;
            int i7 = parsableByteArray.f5667a[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i8 = iB - i4;
            if (this.j) {
                c2 = c3;
            } else {
                if (i8 > 0) {
                    csdBuffer.a(bArr, i4, iB);
                }
                int i9 = i8 < 0 ? -i8 : 0;
                if (csdBuffer.f7491a) {
                    int i10 = csdBuffer.f7492b - i9;
                    csdBuffer.f7492b = i10;
                    if (csdBuffer.f7493c == 0 && i7 == 181) {
                        csdBuffer.f7493c = i10;
                    } else {
                        csdBuffer.f7491a = false;
                        String str = this.f7481a;
                        str.getClass();
                        byte[] bArrCopyOf = Arrays.copyOf(csdBuffer.d, csdBuffer.f7492b);
                        int i11 = bArrCopyOf[4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        byte b2 = bArrCopyOf[5];
                        int i12 = (i11 << 4) | ((b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4);
                        int i13 = ((b2 & 15) << 8) | (bArrCopyOf[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                        int i14 = (bArrCopyOf[7] & 240) >> 4;
                        if (i14 != 2) {
                            if (i14 == 3) {
                                f2 = i13 * 16;
                                i3 = i12 * 9;
                            } else if (i14 != 4) {
                                f = 1.0f;
                            } else {
                                f2 = i13 * 121;
                                i3 = i12 * 100;
                            }
                            f = f2 / i3;
                        } else {
                            f = (i13 * 4) / (i12 * 3);
                        }
                        Format.Builder builder = new Format.Builder();
                        builder.f5423a = str;
                        builder.f5429l = MimeTypes.l("video/mpeg2");
                        builder.r = i12;
                        builder.s = i13;
                        builder.v = f;
                        builder.o = Collections.singletonList(bArrCopyOf);
                        Format format = new Format(builder);
                        int i15 = (bArrCopyOf[7] & 15) - 1;
                        if (i15 < 0 || i15 >= 8) {
                            j = 0;
                        } else {
                            double d = q[i15];
                            byte b3 = bArrCopyOf[csdBuffer.f7493c + 9];
                            int i16 = (b3 & 96) >> 5;
                            int i17 = b3 & 31;
                            if (i16 != i17) {
                                d = ((((double) i16) + 1.0d) / ((double) (i17 + 1))) * d;
                            }
                            j = (long) (1000000.0d / d);
                        }
                        Pair pairCreate = Pair.create(format, Long.valueOf(j));
                        this.f7482b.b((Format) pairCreate.first);
                        this.k = ((Long) pairCreate.second).longValue();
                        this.j = true;
                        c2 = 3;
                    }
                } else if (i7 == 179) {
                    csdBuffer.f7491a = true;
                }
                c2 = 3;
                csdBuffer.a(CsdBuffer.f7490e, 0, 3);
            }
            if (nalUnitTargetBuffer == null) {
                z2 = true;
            } else {
                if (i8 > 0) {
                    nalUnitTargetBuffer.a(bArr, i4, iB);
                    i2 = 0;
                } else {
                    i2 = -i8;
                }
                if (nalUnitTargetBuffer.b(i2)) {
                    int iF = NalUnitUtil.f(nalUnitTargetBuffer.d, nalUnitTargetBuffer.f7588e);
                    int i18 = Util.f5683a;
                    byte[] bArr2 = nalUnitTargetBuffer.d;
                    ParsableByteArray parsableByteArray2 = this.d;
                    parsableByteArray2.E(bArr2, iF);
                    this.f7483c.a(this.f7488n, parsableByteArray2);
                }
                if (i7 == 178) {
                    z2 = true;
                    if (parsableByteArray.f5667a[iB + 2] == 1) {
                        nalUnitTargetBuffer.d(i7);
                    }
                } else {
                    z2 = true;
                }
            }
            if (i7 == 0 || i7 == 179) {
                int i19 = i5 - iB;
                if (this.f7489p && this.j) {
                    long j2 = this.f7488n;
                    if (j2 != -9223372036854775807L) {
                        this.f7482b.f(j2, this.o ? 1 : 0, ((int) (this.f7485h - this.m)) - i19, i19, null);
                    }
                }
                if (!this.f7486i || this.f7489p) {
                    this.m = this.f7485h - ((long) i19);
                    long j3 = this.f7487l;
                    if (j3 == -9223372036854775807L) {
                        long j4 = this.f7488n;
                        j3 = j4 != -9223372036854775807L ? j4 + this.k : -9223372036854775807L;
                    }
                    this.f7488n = j3;
                    z3 = false;
                    this.o = false;
                    this.f7487l = -9223372036854775807L;
                    z4 = true;
                    this.f7486i = true;
                } else {
                    z4 = true;
                    z3 = false;
                }
                if (i7 == 0) {
                    z3 = z4;
                }
                this.f7489p = z3;
            } else if (i7 == 184) {
                this.o = z2;
            }
            c3 = c2;
            i4 = i6;
        }
        if (!this.j) {
            csdBuffer.a(bArr, i4, i5);
        }
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.a(bArr, i4, i5);
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void c(int i2, long j) {
        this.f7487l = j;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void d(boolean z2) {
        Assertions.f(this.f7482b);
        if (z2) {
            boolean z3 = this.o;
            this.f7482b.f(this.f7488n, z3 ? 1 : 0, (int) (this.f7485h - this.m), 0, null);
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void e(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.f7481a = trackIdGenerator.f7653e;
        trackIdGenerator.b();
        this.f7482b = extractorOutput.track(trackIdGenerator.d, 2);
        UserDataReader userDataReader = this.f7483c;
        if (userDataReader != null) {
            userDataReader.b(extractorOutput, trackIdGenerator);
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void seek() {
        NalUnitUtil.a(this.f);
        CsdBuffer csdBuffer = this.g;
        csdBuffer.f7491a = false;
        csdBuffer.f7492b = 0;
        csdBuffer.f7493c = 0;
        NalUnitTargetBuffer nalUnitTargetBuffer = this.f7484e;
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.c();
        }
        this.f7485h = 0L;
        this.f7486i = false;
        this.f7487l = -9223372036854775807L;
        this.f7488n = -9223372036854775807L;
    }
}
