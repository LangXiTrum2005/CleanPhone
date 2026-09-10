package com.google.android.exoplayer2.extractor.mkv;

import android.util.SparseArray;
import androidx.datastore.preferences.protobuf.a;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.TrueHdSampleRechunker;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.base.Charsets;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class MatroskaExtractor implements Extractor {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final byte[] f17671c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final byte[] f17672d0;
    public static final byte[] e0;
    public static final byte[] f0;
    public static final UUID g0;
    public static final Map h0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f17673A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f17674B;
    public LongArray C;
    public LongArray D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f17675E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f17676F;
    public int G;
    public long H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public long f17677I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f17678J;
    public int K;
    public int[] L;
    public int M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f17679N;
    public int O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f17680P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f17681Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public long f17682R;
    public int S;
    public int T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f17683U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f17684V;
    public boolean W;
    public boolean X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f17685Y;
    public byte Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultEbmlReader f17686a;
    public boolean a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VarintReader f17687b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ExtractorOutput f17688b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f17689c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ParsableByteArray f17690e;
    public final ParsableByteArray f;
    public final ParsableByteArray g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ParsableByteArray f17691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ParsableByteArray f17692i;
    public final ParsableByteArray j;
    public final ParsableByteArray k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ParsableByteArray f17693l;
    public final ParsableByteArray m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ParsableByteArray f17694n;
    public ByteBuffer o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f17695p;
    public long q;
    public long r;
    public long s;
    public long t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Track f17696u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17697w;
    public long x;
    public boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f17698z;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public final class InnerEbmlProcessor implements EbmlProcessor {
        public InnerEbmlProcessor() {
        }

        /* JADX WARN: Code duplicated, block: B:132:0x029c  */
        /* JADX WARN: Multi-variable type inference failed */
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
        public final void a(int i2, int i3, DefaultExtractorInput defaultExtractorInput) throws ParserException, EOFException, InterruptedIOException {
            int i4;
            int i5;
            int i6;
            long j;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            MatroskaExtractor matroskaExtractor = MatroskaExtractor.this;
            SparseArray sparseArray = matroskaExtractor.f17689c;
            int i12 = 0;
            int i13 = 1;
            if (i2 != 161 && i2 != 163) {
                if (i2 == 165) {
                    if (matroskaExtractor.G != 2) {
                        return;
                    }
                    Track track = (Track) sparseArray.get(matroskaExtractor.M);
                    if (matroskaExtractor.f17680P != 4 || !"V_VP9".equals(track.f17714b)) {
                        defaultExtractorInput.skipFully(i3);
                        return;
                    }
                    ParsableByteArray parsableByteArray = matroskaExtractor.f17694n;
                    parsableByteArray.C(i3);
                    defaultExtractorInput.readFully(parsableByteArray.f18956a, 0, i3, false);
                    return;
                }
                if (i2 == 16877) {
                    matroskaExtractor.e(i2);
                    Track track2 = matroskaExtractor.f17696u;
                    int i14 = track2.g;
                    if (i14 != 1685485123 && i14 != 1685480259) {
                        defaultExtractorInput.skipFully(i3);
                        return;
                    }
                    byte[] bArr = new byte[i3];
                    track2.f17706N = bArr;
                    defaultExtractorInput.readFully(bArr, 0, i3, false);
                    return;
                }
                if (i2 == 16981) {
                    matroskaExtractor.e(i2);
                    Track track3 = matroskaExtractor.f17696u;
                    byte[] bArr2 = new byte[i3];
                    track3.f17718i = bArr2;
                    defaultExtractorInput.readFully(bArr2, 0, i3, false);
                    return;
                }
                if (i2 == 18402) {
                    byte[] bArr3 = new byte[i3];
                    defaultExtractorInput.readFully(bArr3, 0, i3, false);
                    matroskaExtractor.e(i2);
                    matroskaExtractor.f17696u.j = new TrackOutput.CryptoData(1, bArr3, 0, 0);
                    return;
                }
                if (i2 == 21419) {
                    ParsableByteArray parsableByteArray2 = matroskaExtractor.f17692i;
                    Arrays.fill(parsableByteArray2.f18956a, (byte) 0);
                    defaultExtractorInput.readFully(parsableByteArray2.f18956a, 4 - i3, i3, false);
                    parsableByteArray2.F(0);
                    matroskaExtractor.f17697w = (int) parsableByteArray2.v();
                    return;
                }
                if (i2 == 25506) {
                    matroskaExtractor.e(i2);
                    Track track4 = matroskaExtractor.f17696u;
                    byte[] bArr4 = new byte[i3];
                    track4.k = bArr4;
                    defaultExtractorInput.readFully(bArr4, 0, i3, false);
                    return;
                }
                if (i2 != 30322) {
                    throw ParserException.a(null, "Unexpected id: " + i2);
                }
                matroskaExtractor.e(i2);
                Track track5 = matroskaExtractor.f17696u;
                byte[] bArr5 = new byte[i3];
                track5.v = bArr5;
                defaultExtractorInput.readFully(bArr5, 0, i3, false);
                return;
            }
            int i15 = matroskaExtractor.G;
            ParsableByteArray parsableByteArray3 = matroskaExtractor.g;
            if (i15 == 0) {
                VarintReader varintReader = matroskaExtractor.f17687b;
                matroskaExtractor.M = (int) varintReader.c(defaultExtractorInput, false, true, 8);
                matroskaExtractor.f17679N = varintReader.f17729c;
                matroskaExtractor.f17677I = -9223372036854775807L;
                matroskaExtractor.G = 1;
                parsableByteArray3.C(0);
            }
            Track track6 = (Track) sparseArray.get(matroskaExtractor.M);
            if (track6 == null) {
                defaultExtractorInput.skipFully(i3 - matroskaExtractor.f17679N);
                matroskaExtractor.G = 0;
                return;
            }
            track6.X.getClass();
            if (matroskaExtractor.G == 1) {
                matroskaExtractor.h(defaultExtractorInput, 3);
                int i16 = (parsableByteArray3.f18956a[2] & 6) >> 1;
                int i17 = 255;
                if (i16 == 0) {
                    matroskaExtractor.K = 1;
                    int[] iArr = matroskaExtractor.L;
                    if (iArr == null) {
                        iArr = new int[1];
                    } else if (iArr.length < 1) {
                        iArr = new int[Math.max(iArr.length * 2, 1)];
                    }
                    matroskaExtractor.L = iArr;
                    iArr[0] = (i3 - matroskaExtractor.f17679N) - 3;
                } else {
                    matroskaExtractor.h(defaultExtractorInput, 4);
                    int i18 = (parsableByteArray3.f18956a[3] & 255) + 1;
                    matroskaExtractor.K = i18;
                    int[] iArr2 = matroskaExtractor.L;
                    if (iArr2 == null) {
                        iArr2 = new int[i18];
                    } else if (iArr2.length < i18) {
                        iArr2 = new int[Math.max(iArr2.length * 2, i18)];
                    }
                    matroskaExtractor.L = iArr2;
                    if (i16 == 2) {
                        int i19 = (i3 - matroskaExtractor.f17679N) - 4;
                        int i20 = matroskaExtractor.K;
                        Arrays.fill(iArr2, 0, i20, i19 / i20);
                    } else {
                        if (i16 == 1) {
                            int i21 = 0;
                            int i22 = 0;
                            int i23 = 4;
                            while (true) {
                                i8 = matroskaExtractor.K - 1;
                                if (i21 >= i8) {
                                    break;
                                }
                                matroskaExtractor.L[i21] = 0;
                                while (true) {
                                    i9 = i23 + 1;
                                    matroskaExtractor.h(defaultExtractorInput, i9);
                                    int i24 = parsableByteArray3.f18956a[i23] & 255;
                                    int[] iArr3 = matroskaExtractor.L;
                                    i10 = iArr3[i21] + i24;
                                    iArr3[i21] = i10;
                                    if (i24 != 255) {
                                        break;
                                    } else {
                                        i23 = i9;
                                    }
                                }
                                i22 += i10;
                                i21++;
                                i23 = i9;
                            }
                            matroskaExtractor.L[i8] = ((i3 - matroskaExtractor.f17679N) - i23) - i22;
                        } else {
                            if (i16 != 3) {
                                throw ParserException.a(null, "Unexpected lacing value: " + i16);
                            }
                            int i25 = 0;
                            int i26 = 0;
                            int i27 = 4;
                            while (true) {
                                int i28 = matroskaExtractor.K - i13;
                                if (i25 >= i28) {
                                    i5 = i12;
                                    i4 = i13;
                                    matroskaExtractor.L[i28] = ((i3 - matroskaExtractor.f17679N) - i27) - i26;
                                    break;
                                }
                                matroskaExtractor.L[i25] = i12;
                                int i29 = i27 + 1;
                                matroskaExtractor.h(defaultExtractorInput, i29);
                                if (parsableByteArray3.f18956a[i27] == 0) {
                                    throw ParserException.a(null, "No valid varint length mask found");
                                }
                                int i30 = i13;
                                int i31 = i12;
                                while (true) {
                                    if (i31 >= 8) {
                                        i6 = i12;
                                        j = 0;
                                        i7 = i29;
                                        break;
                                    }
                                    int i32 = i30 << (7 - i31);
                                    i6 = i12;
                                    if ((parsableByteArray3.f18956a[i27] & i32) != 0) {
                                        int i33 = i29 + i31;
                                        matroskaExtractor.h(defaultExtractorInput, i33);
                                        j = parsableByteArray3.f18956a[i27] & i17 & (~i32);
                                        while (i29 < i33) {
                                            j = (j << 8) | ((long) (parsableByteArray3.f18956a[i29] & i17));
                                            i29++;
                                            i33 = i33;
                                            i17 = 255;
                                        }
                                        i7 = i33;
                                        if (i25 <= 0) {
                                            break;
                                        }
                                        j -= (1 << ((i31 * 7) + 6)) - 1;
                                        break;
                                    }
                                    i31++;
                                    i12 = i6;
                                    i17 = 255;
                                }
                                if (j < -2147483648L || j > 2147483647L) {
                                    throw ParserException.a(null, "EBML lacing sample size out of range.");
                                }
                                int i34 = (int) j;
                                int[] iArr4 = matroskaExtractor.L;
                                if (i25 != 0) {
                                    i34 += iArr4[i25 - 1];
                                }
                                iArr4[i25] = i34;
                                i26 += i34;
                                i25++;
                                i13 = i30;
                                i12 = i6;
                                i27 = i7;
                                i17 = 255;
                            }
                        }
                        byte[] bArr6 = parsableByteArray3.f18956a;
                        matroskaExtractor.H = matroskaExtractor.j((bArr6[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr6[i5] << 8)) + matroskaExtractor.f17674B;
                        if (track6.d != 2 || (i2 == 163 && (parsableByteArray3.f18956a[2] & 128) == 128)) {
                            i11 = i4;
                        } else {
                            i11 = i5;
                        }
                        matroskaExtractor.O = i11;
                        matroskaExtractor.G = 2;
                        matroskaExtractor.f17678J = i5;
                    }
                }
                i5 = 0;
                i4 = 1;
                byte[] bArr7 = parsableByteArray3.f18956a;
                matroskaExtractor.H = matroskaExtractor.j((bArr7[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr7[i5] << 8)) + matroskaExtractor.f17674B;
                if (track6.d != 2) {
                    i11 = i4;
                } else {
                    i11 = i4;
                }
                matroskaExtractor.O = i11;
                matroskaExtractor.G = 2;
                matroskaExtractor.f17678J = i5;
            } else {
                i4 = 1;
            }
            if (i2 == 163) {
                while (true) {
                    int i35 = matroskaExtractor.f17678J;
                    if (i35 >= matroskaExtractor.K) {
                        matroskaExtractor.G = 0;
                        return;
                    }
                    matroskaExtractor.f(track6, ((long) ((matroskaExtractor.f17678J * track6.f17716e) / 1000)) + matroskaExtractor.H, matroskaExtractor.O, matroskaExtractor.k(defaultExtractorInput, track6, matroskaExtractor.L[i35], false), 0);
                    matroskaExtractor.f17678J++;
                }
            } else {
                while (true) {
                    int i36 = matroskaExtractor.f17678J;
                    if (i36 >= matroskaExtractor.K) {
                        return;
                    }
                    int[] iArr5 = matroskaExtractor.L;
                    boolean z2 = i4;
                    iArr5[i36] = matroskaExtractor.k(defaultExtractorInput, track6, iArr5[i36], z2);
                    matroskaExtractor.f17678J += z2 ? 1 : 0;
                }
            }
        }

        public final void b(int i2, long j) throws ParserException {
            MatroskaExtractor matroskaExtractor = MatroskaExtractor.this;
            matroskaExtractor.getClass();
            if (i2 == 20529) {
                if (j == 0) {
                    return;
                }
                throw ParserException.a(null, "ContentEncodingOrder " + j + " not supported");
            }
            if (i2 == 20530) {
                if (j == 1) {
                    return;
                }
                throw ParserException.a(null, "ContentEncodingScope " + j + " not supported");
            }
            switch (i2) {
                case 131:
                    matroskaExtractor.e(i2);
                    matroskaExtractor.f17696u.d = (int) j;
                    return;
                case PRIVACY_URL_ERROR_VALUE:
                    matroskaExtractor.e(i2);
                    matroskaExtractor.f17696u.f17711V = j == 1;
                    return;
                case ModuleDescriptor.MODULE_VERSION /* 155 */:
                    matroskaExtractor.f17677I = matroskaExtractor.j(j);
                    return;
                case 159:
                    matroskaExtractor.e(i2);
                    matroskaExtractor.f17696u.O = (int) j;
                    return;
                case 176:
                    matroskaExtractor.e(i2);
                    matroskaExtractor.f17696u.m = (int) j;
                    return;
                case 179:
                    matroskaExtractor.a(i2);
                    matroskaExtractor.C.a(matroskaExtractor.j(j));
                    return;
                case 186:
                    matroskaExtractor.e(i2);
                    matroskaExtractor.f17696u.f17720n = (int) j;
                    return;
                case AD_RESPONSE_EMPTY_VALUE:
                    matroskaExtractor.e(i2);
                    matroskaExtractor.f17696u.f17715c = (int) j;
                    return;
                case 231:
                    matroskaExtractor.f17674B = matroskaExtractor.j(j);
                    return;
                case 238:
                    matroskaExtractor.f17680P = (int) j;
                    return;
                case 241:
                    if (matroskaExtractor.f17675E) {
                        return;
                    }
                    matroskaExtractor.a(i2);
                    matroskaExtractor.D.a(j);
                    matroskaExtractor.f17675E = true;
                    return;
                case 251:
                    matroskaExtractor.f17681Q = true;
                    return;
                case 16871:
                    matroskaExtractor.e(i2);
                    matroskaExtractor.f17696u.g = (int) j;
                    return;
                case 16980:
                    if (j == 3) {
                        return;
                    }
                    throw ParserException.a(null, "ContentCompAlgo " + j + " not supported");
                case 17029:
                    if (j < 1 || j > 2) {
                        throw ParserException.a(null, "DocTypeReadVersion " + j + " not supported");
                    }
                    return;
                case 17143:
                    if (j == 1) {
                        return;
                    }
                    throw ParserException.a(null, "EBMLReadVersion " + j + " not supported");
                case 18401:
                    if (j == 5) {
                        return;
                    }
                    throw ParserException.a(null, "ContentEncAlgo " + j + " not supported");
                case 18408:
                    if (j == 1) {
                        return;
                    }
                    throw ParserException.a(null, "AESSettingsCipherMode " + j + " not supported");
                case 21420:
                    matroskaExtractor.x = j + matroskaExtractor.q;
                    return;
                case 21432:
                    int i3 = (int) j;
                    matroskaExtractor.e(i2);
                    if (i3 == 0) {
                        matroskaExtractor.f17696u.f17723w = 0;
                        return;
                    }
                    if (i3 == 1) {
                        matroskaExtractor.f17696u.f17723w = 2;
                        return;
                    } else if (i3 == 3) {
                        matroskaExtractor.f17696u.f17723w = 1;
                        return;
                    } else {
                        if (i3 != 15) {
                            return;
                        }
                        matroskaExtractor.f17696u.f17723w = 3;
                        return;
                    }
                case 21680:
                    matroskaExtractor.e(i2);
                    matroskaExtractor.f17696u.o = (int) j;
                    return;
                case 21682:
                    matroskaExtractor.e(i2);
                    matroskaExtractor.f17696u.q = (int) j;
                    return;
                case 21690:
                    matroskaExtractor.e(i2);
                    matroskaExtractor.f17696u.f17721p = (int) j;
                    return;
                case 21930:
                    matroskaExtractor.e(i2);
                    matroskaExtractor.f17696u.f17710U = j == 1;
                    return;
                case 21998:
                    matroskaExtractor.e(i2);
                    matroskaExtractor.f17696u.f = (int) j;
                    return;
                case 22186:
                    matroskaExtractor.e(i2);
                    matroskaExtractor.f17696u.f17709R = j;
                    return;
                case 22203:
                    matroskaExtractor.e(i2);
                    matroskaExtractor.f17696u.S = j;
                    return;
                case 25188:
                    matroskaExtractor.e(i2);
                    matroskaExtractor.f17696u.f17707P = (int) j;
                    return;
                case 30114:
                    matroskaExtractor.f17682R = j;
                    return;
                case 30321:
                    matroskaExtractor.e(i2);
                    int i4 = (int) j;
                    if (i4 == 0) {
                        matroskaExtractor.f17696u.r = 0;
                        return;
                    }
                    if (i4 == 1) {
                        matroskaExtractor.f17696u.r = 1;
                        return;
                    } else if (i4 == 2) {
                        matroskaExtractor.f17696u.r = 2;
                        return;
                    } else {
                        if (i4 != 3) {
                            return;
                        }
                        matroskaExtractor.f17696u.r = 3;
                        return;
                    }
                case 2352003:
                    matroskaExtractor.e(i2);
                    matroskaExtractor.f17696u.f17716e = (int) j;
                    return;
                case 2807729:
                    matroskaExtractor.r = j;
                    return;
                default:
                    switch (i2) {
                        case 21945:
                            matroskaExtractor.e(i2);
                            int i5 = (int) j;
                            if (i5 == 1) {
                                matroskaExtractor.f17696u.f17700A = 2;
                                return;
                            } else {
                                if (i5 != 2) {
                                    return;
                                }
                                matroskaExtractor.f17696u.f17700A = 1;
                                return;
                            }
                        case 21946:
                            matroskaExtractor.e(i2);
                            int iB = ColorInfo.b((int) j);
                            if (iB != -1) {
                                matroskaExtractor.f17696u.f17724z = iB;
                                return;
                            }
                            return;
                        case 21947:
                            matroskaExtractor.e(i2);
                            matroskaExtractor.f17696u.x = true;
                            int iA = ColorInfo.a((int) j);
                            if (iA != -1) {
                                matroskaExtractor.f17696u.y = iA;
                                return;
                            }
                            return;
                        case 21948:
                            matroskaExtractor.e(i2);
                            matroskaExtractor.f17696u.f17701B = (int) j;
                            return;
                        case 21949:
                            matroskaExtractor.e(i2);
                            matroskaExtractor.f17696u.C = (int) j;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    public static final class Track {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f17700A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f17701B;
        public int C;
        public float D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public float f17702E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public float f17703F;
        public float G;
        public float H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public float f17704I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public float f17705J;
        public float K;
        public float L;
        public float M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public byte[] f17706N;
        public int O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public int f17707P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public int f17708Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public long f17709R;
        public long S;
        public TrueHdSampleRechunker T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public boolean f17710U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public boolean f17711V;
        public String W;
        public TrackOutput X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f17712Y;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f17713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f17714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17715c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17716e;
        public int f;
        public int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f17717h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public byte[] f17718i;
        public TrackOutput.CryptoData j;
        public byte[] k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public DrmInitData f17719l;
        public int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f17720n;
        public int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f17721p;
        public int q;
        public int r;
        public float s;
        public float t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f17722u;
        public byte[] v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f17723w;
        public boolean x;
        public int y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f17724z;

        public final byte[] a(String str) throws ParserException {
            byte[] bArr = this.k;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.a(null, "Missing CodecPrivate for codec " + str);
        }
    }

    static {
        int i2 = Util.f18979a;
        f17672d0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(Charsets.f19705c);
        e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        a.v(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        a.v(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        h0 = Collections.unmodifiableMap(map);
    }

    public MatroskaExtractor() {
        DefaultEbmlReader defaultEbmlReader = new DefaultEbmlReader();
        this.q = -1L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.f17698z = -1L;
        this.f17673A = -1L;
        this.f17674B = -9223372036854775807L;
        this.f17686a = defaultEbmlReader;
        defaultEbmlReader.d = new InnerEbmlProcessor();
        this.d = true;
        this.f17687b = new VarintReader();
        this.f17689c = new SparseArray();
        this.g = new ParsableByteArray(4);
        this.f17691h = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
        this.f17692i = new ParsableByteArray(4);
        this.f17690e = new ParsableByteArray(NalUnitUtil.f18927a);
        this.f = new ParsableByteArray(4);
        this.j = new ParsableByteArray();
        this.k = new ParsableByteArray();
        this.f17693l = new ParsableByteArray(8);
        this.m = new ParsableByteArray();
        this.f17694n = new ParsableByteArray();
        this.L = new int[1];
    }

    public static byte[] g(long j, long j2, String str) {
        Assertions.b(j != -9223372036854775807L);
        int i2 = (int) (j / 3600000000L);
        long j3 = j - (((long) i2) * 3600000000L);
        int i3 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i3) * 60000000);
        int i4 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j4 - (((long) i4) * 1000000)) / j2)));
        int i5 = Util.f18979a;
        return str2.getBytes(Charsets.f19705c);
    }

    public final void a(int i2) throws ParserException {
        if (this.C == null || this.D == null) {
            throw ParserException.a(null, "Element " + i2 + " must be in a Cues");
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean b(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
        Sniffer sniffer = new Sniffer();
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        long j = defaultExtractorInput.f17527c;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i2 = (int) j2;
        ParsableByteArray parsableByteArray = sniffer.f17725a;
        defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, 4, false);
        sniffer.f17726b = 4;
        for (long jV = parsableByteArray.v(); jV != 440786851; jV = ((jV << 8) & (-256)) | ((long) (parsableByteArray.f18956a[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED))) {
            int i3 = sniffer.f17726b + 1;
            sniffer.f17726b = i3;
            if (i3 == i2) {
                return false;
            }
            defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, 1, false);
        }
        long jA = sniffer.a(defaultExtractorInput);
        long j3 = sniffer.f17726b;
        if (jA != Long.MIN_VALUE && (j == -1 || j3 + jA < j)) {
            while (true) {
                long j4 = sniffer.f17726b;
                long j5 = j3 + jA;
                if (j4 < j5) {
                    if (sniffer.a(defaultExtractorInput) == Long.MIN_VALUE) {
                        break;
                    }
                    long jA2 = sniffer.a(defaultExtractorInput);
                    if (jA2 < 0 || jA2 > 2147483647L) {
                        break;
                    }
                    if (jA2 != 0) {
                        int i4 = (int) jA2;
                        defaultExtractorInput.c(i4, false);
                        sniffer.f17726b += i4;
                    }
                } else if (j4 == j5) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int c(ExtractorInput extractorInput, PositionHolder positionHolder) {
        int i2 = 0;
        this.f17676F = false;
        boolean z2 = true;
        while (z2 && !this.f17676F) {
            DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
            boolean zA = this.f17686a.a(defaultExtractorInput);
            if (zA) {
                long j = defaultExtractorInput.d;
                if (this.y) {
                    this.f17673A = j;
                    positionHolder.f17554a = this.f17698z;
                    this.y = false;
                    return 1;
                }
                if (this.v) {
                    long j2 = this.f17673A;
                    if (j2 != -1) {
                        positionHolder.f17554a = j2;
                        this.f17673A = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            }
            z2 = zA;
        }
        if (z2) {
            return 0;
        }
        while (true) {
            SparseArray sparseArray = this.f17689c;
            if (i2 >= sparseArray.size()) {
                return -1;
            }
            Track track = (Track) sparseArray.valueAt(i2);
            track.X.getClass();
            TrueHdSampleRechunker trueHdSampleRechunker = track.T;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.a(track.X, track.j);
            }
            i2++;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.f17688b0 = extractorOutput;
    }

    public final void e(int i2) throws ParserException {
        if (this.f17696u != null) {
            return;
        }
        throw ParserException.a(null, "Element " + i2 + " must be in a TrackEntry");
    }

    public final void f(Track track, long j, int i2, int i3, int i4) {
        byte[] bArrG;
        int i5;
        int i6;
        TrueHdSampleRechunker trueHdSampleRechunker = track.T;
        if (trueHdSampleRechunker != null) {
            trueHdSampleRechunker.b(track.X, j, i2, i3, i4, track.j);
        } else {
            if ("S_TEXT/UTF8".equals(track.f17714b) || "S_TEXT/ASS".equals(track.f17714b) || "S_TEXT/WEBVTT".equals(track.f17714b)) {
                if (this.K > 1) {
                    Log.g("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.f17677I;
                    if (j2 == -9223372036854775807L) {
                        Log.g("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = track.f17714b;
                        ParsableByteArray parsableByteArray = this.k;
                        byte[] bArr = parsableByteArray.f18956a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                                bArrG = g(j2, 10000L, "%01d:%02d:%02d:%02d");
                                i5 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrG = g(j2, 1000L, "%02d:%02d:%02d.%03d");
                                i5 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrG = g(j2, 1000L, "%02d:%02d:%02d,%03d");
                                i5 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(bArrG, 0, bArr, i5, bArrG.length);
                        for (int i7 = parsableByteArray.f18957b; i7 < parsableByteArray.f18958c; i7++) {
                            if (parsableByteArray.f18956a[i7] == 0) {
                                parsableByteArray.E(i7);
                                track.X.e(parsableByteArray.f18958c, parsableByteArray);
                                i6 = i3 + parsableByteArray.f18958c;
                            }
                        }
                        track.X.e(parsableByteArray.f18958c, parsableByteArray);
                        i6 = i3 + parsableByteArray.f18958c;
                    }
                }
                i6 = i3;
            } else {
                i6 = i3;
            }
            if ((i2 & 268435456) != 0) {
                int i8 = this.K;
                ParsableByteArray parsableByteArray2 = this.f17694n;
                if (i8 > 1) {
                    parsableByteArray2.C(0);
                } else {
                    int i9 = parsableByteArray2.f18958c;
                    track.X.b(i9, parsableByteArray2);
                    i6 += i9;
                }
            }
            track.X.f(j, i2, i6, i4, track.j);
        }
        this.f17676F = true;
    }

    public final void h(DefaultExtractorInput defaultExtractorInput, int i2) throws EOFException, InterruptedIOException {
        ParsableByteArray parsableByteArray = this.g;
        if (parsableByteArray.f18958c >= i2) {
            return;
        }
        byte[] bArr = parsableByteArray.f18956a;
        if (bArr.length < i2) {
            parsableByteArray.b(Math.max(bArr.length * 2, i2));
        }
        byte[] bArr2 = parsableByteArray.f18956a;
        int i3 = parsableByteArray.f18958c;
        defaultExtractorInput.readFully(bArr2, i3, i2 - i3, false);
        parsableByteArray.E(i2);
    }

    public final void i() {
        this.S = 0;
        this.T = 0;
        this.f17683U = 0;
        this.f17684V = false;
        this.W = false;
        this.X = false;
        this.f17685Y = 0;
        this.Z = (byte) 0;
        this.a0 = false;
        this.j.C(0);
    }

    public final long j(long j) throws ParserException {
        long j2 = this.r;
        if (j2 != -9223372036854775807L) {
            return Util.F(j, j2, 1000L);
        }
        throw ParserException.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    public final int k(DefaultExtractorInput defaultExtractorInput, Track track, int i2, boolean z2) throws ParserException, EOFException, InterruptedIOException {
        int iD;
        int iD2;
        boolean z3;
        int i3;
        if ("S_TEXT/UTF8".equals(track.f17714b)) {
            l(defaultExtractorInput, f17671c0, i2);
            int i4 = this.T;
            i();
            return i4;
        }
        if ("S_TEXT/ASS".equals(track.f17714b)) {
            l(defaultExtractorInput, e0, i2);
            int i5 = this.T;
            i();
            return i5;
        }
        if ("S_TEXT/WEBVTT".equals(track.f17714b)) {
            l(defaultExtractorInput, f0, i2);
            int i6 = this.T;
            i();
            return i6;
        }
        TrackOutput trackOutput = track.X;
        boolean z4 = this.f17684V;
        ParsableByteArray parsableByteArray = this.j;
        if (!z4) {
            boolean z5 = track.f17717h;
            ParsableByteArray parsableByteArray2 = this.g;
            if (z5) {
                this.O &= -1073741825;
                if (!this.W) {
                    defaultExtractorInput.readFully(parsableByteArray2.f18956a, 0, 1, false);
                    this.S++;
                    byte b2 = parsableByteArray2.f18956a[0];
                    if ((b2 & 128) == 128) {
                        throw ParserException.a(null, "Extension bit is set in signal byte");
                    }
                    this.Z = b2;
                    this.W = true;
                }
                byte b3 = this.Z;
                if ((b3 & 1) == 1) {
                    boolean z6 = (b3 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.a0) {
                        ParsableByteArray parsableByteArray3 = this.f17693l;
                        defaultExtractorInput.readFully(parsableByteArray3.f18956a, 0, 8, false);
                        this.S += 8;
                        this.a0 = true;
                        parsableByteArray2.f18956a[0] = (byte) ((z6 ? 128 : 0) | 8);
                        parsableByteArray2.F(0);
                        trackOutput.b(1, parsableByteArray2);
                        this.T++;
                        parsableByteArray3.F(0);
                        trackOutput.b(8, parsableByteArray3);
                        this.T += 8;
                    }
                    if (z6) {
                        if (!this.X) {
                            defaultExtractorInput.readFully(parsableByteArray2.f18956a, 0, 1, false);
                            this.S++;
                            parsableByteArray2.F(0);
                            this.f17685Y = parsableByteArray2.u();
                            this.X = true;
                        }
                        int i7 = this.f17685Y * 4;
                        parsableByteArray2.C(i7);
                        defaultExtractorInput.readFully(parsableByteArray2.f18956a, 0, i7, false);
                        this.S += i7;
                        short s = (short) ((this.f17685Y / 2) + 1);
                        int i8 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.o;
                        if (byteBuffer == null || byteBuffer.capacity() < i8) {
                            this.o = ByteBuffer.allocate(i8);
                        }
                        this.o.position(0);
                        this.o.putShort(s);
                        int i9 = 0;
                        int i10 = 0;
                        while (true) {
                            i3 = this.f17685Y;
                            if (i9 >= i3) {
                                break;
                            }
                            int iX = parsableByteArray2.x();
                            if (i9 % 2 == 0) {
                                this.o.putShort((short) (iX - i10));
                            } else {
                                this.o.putInt(iX - i10);
                            }
                            i9++;
                            i10 = iX;
                        }
                        int i11 = (i2 - this.S) - i10;
                        if (i3 % 2 == 1) {
                            this.o.putInt(i11);
                        } else {
                            this.o.putShort((short) i11);
                            this.o.putInt(0);
                        }
                        byte[] bArrArray = this.o.array();
                        ParsableByteArray parsableByteArray4 = this.m;
                        parsableByteArray4.D(bArrArray, i8);
                        trackOutput.b(i8, parsableByteArray4);
                        this.T += i8;
                    }
                }
            } else {
                byte[] bArr = track.f17718i;
                if (bArr != null) {
                    parsableByteArray.D(bArr, bArr.length);
                }
            }
            if ("A_OPUS".equals(track.f17714b)) {
                z3 = z2;
            } else {
                z3 = track.f > 0;
            }
            if (z3) {
                this.O |= 268435456;
                this.f17694n.C(0);
                int i12 = (parsableByteArray.f18958c + i2) - this.S;
                parsableByteArray2.C(4);
                byte[] bArr2 = parsableByteArray2.f18956a;
                bArr2[0] = (byte) ((i12 >> 24) & 255);
                bArr2[1] = (byte) ((i12 >> 16) & 255);
                bArr2[2] = (byte) ((i12 >> 8) & 255);
                bArr2[3] = (byte) (i12 & 255);
                trackOutput.b(4, parsableByteArray2);
                this.T += 4;
            }
            this.f17684V = true;
        }
        int i13 = i2 + parsableByteArray.f18958c;
        if (!"V_MPEG4/ISO/AVC".equals(track.f17714b) && !"V_MPEGH/ISO/HEVC".equals(track.f17714b)) {
            if (track.T != null) {
                Assertions.d(parsableByteArray.f18958c == 0);
                track.T.c(defaultExtractorInput);
            }
            while (true) {
                int i14 = this.S;
                if (i14 >= i13) {
                    break;
                }
                int i15 = i13 - i14;
                int iA = parsableByteArray.a();
                if (iA > 0) {
                    iD2 = Math.min(i15, iA);
                    trackOutput.e(iD2, parsableByteArray);
                } else {
                    iD2 = trackOutput.d(defaultExtractorInput, i15, false);
                }
                this.S += iD2;
                this.T += iD2;
            }
        } else {
            ParsableByteArray parsableByteArray5 = this.f;
            byte[] bArr3 = parsableByteArray5.f18956a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i16 = track.f17712Y;
            int i17 = 4 - i16;
            while (this.S < i13) {
                int i18 = this.f17683U;
                if (i18 == 0) {
                    int iMin = Math.min(i16, parsableByteArray.a());
                    defaultExtractorInput.readFully(bArr3, i17 + iMin, i16 - iMin, false);
                    if (iMin > 0) {
                        parsableByteArray.e(bArr3, i17, iMin);
                    }
                    this.S += i16;
                    parsableByteArray5.F(0);
                    this.f17683U = parsableByteArray5.x();
                    ParsableByteArray parsableByteArray6 = this.f17690e;
                    parsableByteArray6.F(0);
                    trackOutput.e(4, parsableByteArray6);
                    this.T += 4;
                } else {
                    int iA2 = parsableByteArray.a();
                    if (iA2 > 0) {
                        iD = Math.min(i18, iA2);
                        trackOutput.e(iD, parsableByteArray);
                    } else {
                        iD = trackOutput.d(defaultExtractorInput, i18, false);
                    }
                    this.S += iD;
                    this.T += iD;
                    this.f17683U -= iD;
                }
            }
        }
        if ("A_VORBIS".equals(track.f17714b)) {
            ParsableByteArray parsableByteArray7 = this.f17691h;
            parsableByteArray7.F(0);
            trackOutput.e(4, parsableByteArray7);
            this.T += 4;
        }
        int i19 = this.T;
        i();
        return i19;
    }

    public final void l(DefaultExtractorInput defaultExtractorInput, byte[] bArr, int i2) throws EOFException, InterruptedIOException {
        int length = bArr.length + i2;
        ParsableByteArray parsableByteArray = this.k;
        byte[] bArr2 = parsableByteArray.f18956a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i2);
            parsableByteArray.D(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        defaultExtractorInput.readFully(parsableByteArray.f18956a, bArr.length, i2, false);
        parsableByteArray.F(0);
        parsableByteArray.E(length);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void seek(long j, long j2) {
        this.f17674B = -9223372036854775807L;
        this.G = 0;
        DefaultEbmlReader defaultEbmlReader = this.f17686a;
        defaultEbmlReader.f17668e = 0;
        defaultEbmlReader.f17666b.clear();
        VarintReader varintReader = defaultEbmlReader.f17667c;
        varintReader.f17728b = 0;
        varintReader.f17729c = 0;
        VarintReader varintReader2 = this.f17687b;
        varintReader2.f17728b = 0;
        varintReader2.f17729c = 0;
        i();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f17689c;
            if (i2 >= sparseArray.size()) {
                return;
            }
            TrueHdSampleRechunker trueHdSampleRechunker = ((Track) sparseArray.valueAt(i2)).T;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.f17566b = false;
                trueHdSampleRechunker.f17567c = 0;
            }
            i2++;
        }
    }
}
