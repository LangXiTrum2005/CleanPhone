package androidx.media3.extractor.ts;

import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.extractor.ExtractorOutput;

/* JADX INFO: loaded from: classes.dex */
public final class PesReader implements TsPayloadReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ElementaryStreamReader f7592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableBitArray f7593b = new ParsableBitArray(new byte[10], 10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7594c = 0;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TimestampAdjuster f7595e;
    public boolean f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7597i;
    public int j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f7598l;

    public PesReader(ElementaryStreamReader elementaryStreamReader) {
        this.f7592a = elementaryStreamReader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [androidx.media3.common.util.ParsableBitArray] */
    /* JADX WARN: Type inference failed for: r11v3, types: [int] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.media3.extractor.ts.ElementaryStreamReader] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public final void a(int i2, ParsableByteArray parsableByteArray) {
        int i3;
        ?? r8;
        int i4;
        int i5;
        ?? r11;
        Assertions.f(this.f7595e);
        int i6 = i2 & 1;
        ?? r3 = this.f7592a;
        int i7 = 2;
        ?? r9 = 0;
        if (i6 != 0) {
            int i8 = this.f7594c;
            if (i8 != 0 && i8 != 1) {
                if (i8 == 2) {
                    Log.g("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i8 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        Log.g("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    r3.d(parsableByteArray.f5669c == 0);
                }
            }
            this.f7594c = 1;
            this.d = 0;
        }
        int i9 = i2;
        while (parsableByteArray.a() > 0) {
            int i10 = this.f7594c;
            if (i10 != 0) {
                ?? r12 = this.f7593b;
                if (i10 != 1) {
                    if (i10 == i7) {
                        if (c(parsableByteArray, r12.f5663a, Math.min(10, this.f7597i)) && c(parsableByteArray, null, this.f7597i)) {
                            r12.m(r9);
                            this.f7598l = -9223372036854775807L;
                            if (this.f) {
                                r12.o(4);
                                long jG = ((long) r12.g(3)) << 30;
                                r12.o(1);
                                long jG2 = ((long) (r12.g(15) << 15)) | jG;
                                r12.o(1);
                                long jG3 = jG2 | ((long) r12.g(15));
                                r12.o(1);
                                if (!this.f7596h && this.g) {
                                    r12.o(4);
                                    long jG4 = ((long) r12.g(3)) << 30;
                                    r12.o(1);
                                    long jG5 = jG4 | ((long) (r12.g(15) << 15));
                                    r12.o(1);
                                    long jG6 = jG5 | ((long) r12.g(15));
                                    r12.o(1);
                                    this.f7595e.b(jG6);
                                    this.f7596h = true;
                                }
                                this.f7598l = this.f7595e.b(jG3);
                            }
                            i9 |= this.k ? 4 : 0;
                            r3.c(i9, this.f7598l);
                            this.f7594c = 3;
                            this.d = 0;
                            r9 = 0;
                            i7 = 2;
                        }
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = parsableByteArray.a();
                        int i11 = this.j;
                        if (i11 == -1) {
                            r11 = r9;
                        } else {
                            i5 = iA - i11;
                        }
                        if (r11 > 0) {
                            r11 = i5;
                            iA -= r11;
                            parsableByteArray.F(parsableByteArray.f5668b + iA);
                        }
                        r11 = i5;
                        r3.a(parsableByteArray);
                        int i12 = this.j;
                        if (i12 != -1) {
                            int i13 = i12 - iA;
                            this.j = i13;
                            if (i13 == 0) {
                                r3.d(r9);
                                this.f7594c = 1;
                                this.d = r9;
                            }
                        }
                    }
                    i3 = i7;
                    r8 = r9;
                } else {
                    ?? r10 = r9;
                    if (c(parsableByteArray, r12.f5663a, 9)) {
                        r12.m(r10 == true ? 1 : 0);
                        int iG = r12.g(24);
                        if (iG != 1) {
                            a.C(iG, "Unexpected start code prefix: ", "PesReader");
                            this.j = -1;
                            i4 = 0;
                            i3 = 2;
                        } else {
                            r12.o(8);
                            int iG2 = r12.g(16);
                            r12.o(5);
                            this.k = r12.f();
                            i3 = 2;
                            r12.o(2);
                            this.f = r12.f();
                            this.g = r12.f();
                            r12.o(6);
                            int iG3 = r12.g(8);
                            this.f7597i = iG3;
                            if (iG2 == 0) {
                                this.j = -1;
                            } else {
                                int i14 = (iG2 - 3) - iG3;
                                this.j = i14;
                                if (i14 < 0) {
                                    Log.g("PesReader", "Found negative packet payload size: " + this.j);
                                    this.j = -1;
                                }
                            }
                            i4 = 2;
                        }
                        this.f7594c = i4;
                        r8 = 0;
                        this.d = 0;
                    } else {
                        i3 = 2;
                        r8 = r10;
                    }
                }
            } else {
                i3 = i7;
                r8 = r9;
                parsableByteArray.H(parsableByteArray.a());
            }
            r9 = r8;
            i7 = i3;
        }
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public final void b(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.f7595e = timestampAdjuster;
        this.f7592a.e(extractorOutput, trackIdGenerator);
    }

    public final boolean c(ParsableByteArray parsableByteArray, byte[] bArr, int i2) {
        int iMin = Math.min(parsableByteArray.a(), i2 - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            parsableByteArray.H(iMin);
        } else {
            parsableByteArray.e(bArr, this.d, iMin);
        }
        int i3 = this.d + iMin;
        this.d = i3;
        return i3 == i2;
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public final void seek() {
        this.f7594c = 0;
        this.d = 0;
        this.f7596h = false;
        this.f7592a.seek();
    }
}
