package androidx.media3.extractor.mkv;

import android.util.SparseArray;
import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.LongArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.TrueHdSampleRechunker;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
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
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class MatroskaExtractor implements Extractor {
    public static final byte[] e0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] f0;
    public static final byte[] g0;
    public static final byte[] h0;
    public static final UUID i0;
    public static final Map j0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f6969A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f6970B;
    public long C;
    public long D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public LongArray f6971E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public LongArray f6972F;
    public boolean G;
    public boolean H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f6973I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f6974J;
    public long K;
    public int L;
    public int M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int[] f6975N;
    public int O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f6976P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f6977Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f6978R;
    public boolean S;
    public long T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f6979U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f6980V;
    public int W;
    public boolean X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f6981Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultEbmlReader f6982a;
    public int a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VarintReader f6983b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public byte f6984b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f6985c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f6986c0;
    public final boolean d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ExtractorOutput f6987d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6988e;
    public final SubtitleParser.Factory f;
    public final ParsableByteArray g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ParsableByteArray f6989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ParsableByteArray f6990i;
    public final ParsableByteArray j;
    public final ParsableByteArray k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ParsableByteArray f6991l;
    public final ParsableByteArray m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ParsableByteArray f6992n;
    public final ParsableByteArray o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ParsableByteArray f6993p;
    public ByteBuffer q;
    public long r;
    public long s;
    public long t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f6994u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Track f6995w;
    public boolean x;
    public int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f6996z;

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
            SparseArray sparseArray = matroskaExtractor.f6985c;
            int i12 = 0;
            int i13 = 1;
            if (i2 != 161 && i2 != 163) {
                if (i2 == 165) {
                    if (matroskaExtractor.f6973I != 2) {
                        return;
                    }
                    Track track = (Track) sparseArray.get(matroskaExtractor.O);
                    if (matroskaExtractor.f6978R != 4 || !"V_VP9".equals(track.f7012b)) {
                        defaultExtractorInput.skipFully(i3);
                        return;
                    }
                    ParsableByteArray parsableByteArray = matroskaExtractor.f6993p;
                    parsableByteArray.D(i3);
                    defaultExtractorInput.readFully(parsableByteArray.f5667a, 0, i3, false);
                    return;
                }
                if (i2 == 16877) {
                    matroskaExtractor.g(i2);
                    Track track2 = matroskaExtractor.f6995w;
                    int i14 = track2.g;
                    if (i14 != 1685485123 && i14 != 1685480259) {
                        defaultExtractorInput.skipFully(i3);
                        return;
                    }
                    byte[] bArr = new byte[i3];
                    track2.O = bArr;
                    defaultExtractorInput.readFully(bArr, 0, i3, false);
                    return;
                }
                if (i2 == 16981) {
                    matroskaExtractor.g(i2);
                    Track track3 = matroskaExtractor.f6995w;
                    byte[] bArr2 = new byte[i3];
                    track3.f7016i = bArr2;
                    defaultExtractorInput.readFully(bArr2, 0, i3, false);
                    return;
                }
                if (i2 == 18402) {
                    byte[] bArr3 = new byte[i3];
                    defaultExtractorInput.readFully(bArr3, 0, i3, false);
                    matroskaExtractor.g(i2);
                    matroskaExtractor.f6995w.j = new TrackOutput.CryptoData(1, bArr3, 0, 0);
                    return;
                }
                if (i2 == 21419) {
                    ParsableByteArray parsableByteArray2 = matroskaExtractor.k;
                    Arrays.fill(parsableByteArray2.f5667a, (byte) 0);
                    defaultExtractorInput.readFully(parsableByteArray2.f5667a, 4 - i3, i3, false);
                    parsableByteArray2.G(0);
                    matroskaExtractor.y = (int) parsableByteArray2.w();
                    return;
                }
                if (i2 == 25506) {
                    matroskaExtractor.g(i2);
                    Track track4 = matroskaExtractor.f6995w;
                    byte[] bArr4 = new byte[i3];
                    track4.k = bArr4;
                    defaultExtractorInput.readFully(bArr4, 0, i3, false);
                    return;
                }
                if (i2 != 30322) {
                    throw ParserException.a(null, "Unexpected id: " + i2);
                }
                matroskaExtractor.g(i2);
                Track track5 = matroskaExtractor.f6995w;
                byte[] bArr5 = new byte[i3];
                track5.f7021w = bArr5;
                defaultExtractorInput.readFully(bArr5, 0, i3, false);
                return;
            }
            int i15 = matroskaExtractor.f6973I;
            ParsableByteArray parsableByteArray3 = matroskaExtractor.f6990i;
            if (i15 == 0) {
                VarintReader varintReader = matroskaExtractor.f6983b;
                matroskaExtractor.O = (int) varintReader.c(defaultExtractorInput, false, true, 8);
                matroskaExtractor.f6976P = varintReader.f7027c;
                matroskaExtractor.K = -9223372036854775807L;
                matroskaExtractor.f6973I = 1;
                parsableByteArray3.D(0);
            }
            Track track6 = (Track) sparseArray.get(matroskaExtractor.O);
            if (track6 == null) {
                defaultExtractorInput.skipFully(i3 - matroskaExtractor.f6976P);
                matroskaExtractor.f6973I = 0;
                return;
            }
            track6.f7010Y.getClass();
            if (matroskaExtractor.f6973I == 1) {
                matroskaExtractor.j(defaultExtractorInput, 3);
                int i16 = (parsableByteArray3.f5667a[2] & 6) >> 1;
                int i17 = 255;
                if (i16 == 0) {
                    matroskaExtractor.M = 1;
                    int[] iArr = matroskaExtractor.f6975N;
                    if (iArr == null) {
                        iArr = new int[1];
                    } else if (iArr.length < 1) {
                        iArr = new int[Math.max(iArr.length * 2, 1)];
                    }
                    matroskaExtractor.f6975N = iArr;
                    iArr[0] = (i3 - matroskaExtractor.f6976P) - 3;
                } else {
                    matroskaExtractor.j(defaultExtractorInput, 4);
                    int i18 = (parsableByteArray3.f5667a[3] & 255) + 1;
                    matroskaExtractor.M = i18;
                    int[] iArr2 = matroskaExtractor.f6975N;
                    if (iArr2 == null) {
                        iArr2 = new int[i18];
                    } else if (iArr2.length < i18) {
                        iArr2 = new int[Math.max(iArr2.length * 2, i18)];
                    }
                    matroskaExtractor.f6975N = iArr2;
                    if (i16 == 2) {
                        int i19 = (i3 - matroskaExtractor.f6976P) - 4;
                        int i20 = matroskaExtractor.M;
                        Arrays.fill(iArr2, 0, i20, i19 / i20);
                    } else {
                        if (i16 == 1) {
                            int i21 = 0;
                            int i22 = 0;
                            int i23 = 4;
                            while (true) {
                                i8 = matroskaExtractor.M - 1;
                                if (i21 >= i8) {
                                    break;
                                }
                                matroskaExtractor.f6975N[i21] = 0;
                                while (true) {
                                    i9 = i23 + 1;
                                    matroskaExtractor.j(defaultExtractorInput, i9);
                                    int i24 = parsableByteArray3.f5667a[i23] & 255;
                                    int[] iArr3 = matroskaExtractor.f6975N;
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
                            matroskaExtractor.f6975N[i8] = ((i3 - matroskaExtractor.f6976P) - i23) - i22;
                        } else {
                            if (i16 != 3) {
                                throw ParserException.a(null, "Unexpected lacing value: " + i16);
                            }
                            int i25 = 0;
                            int i26 = 0;
                            int i27 = 4;
                            while (true) {
                                int i28 = matroskaExtractor.M - i13;
                                if (i25 >= i28) {
                                    i5 = i12;
                                    i4 = i13;
                                    matroskaExtractor.f6975N[i28] = ((i3 - matroskaExtractor.f6976P) - i27) - i26;
                                    break;
                                }
                                matroskaExtractor.f6975N[i25] = i12;
                                int i29 = i27 + 1;
                                matroskaExtractor.j(defaultExtractorInput, i29);
                                if (parsableByteArray3.f5667a[i27] == 0) {
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
                                    if ((parsableByteArray3.f5667a[i27] & i32) != 0) {
                                        int i33 = i29 + i31;
                                        matroskaExtractor.j(defaultExtractorInput, i33);
                                        j = parsableByteArray3.f5667a[i27] & i17 & (~i32);
                                        while (i29 < i33) {
                                            j = (j << 8) | ((long) (parsableByteArray3.f5667a[i29] & i17));
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
                                int[] iArr4 = matroskaExtractor.f6975N;
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
                        byte[] bArr6 = parsableByteArray3.f5667a;
                        matroskaExtractor.f6974J = matroskaExtractor.l((bArr6[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr6[i5] << 8)) + matroskaExtractor.D;
                        if (track6.d != 2 || (i2 == 163 && (parsableByteArray3.f5667a[2] & 128) == 128)) {
                            i11 = i4;
                        } else {
                            i11 = i5;
                        }
                        matroskaExtractor.f6977Q = i11;
                        matroskaExtractor.f6973I = 2;
                        matroskaExtractor.L = i5;
                    }
                }
                i5 = 0;
                i4 = 1;
                byte[] bArr7 = parsableByteArray3.f5667a;
                matroskaExtractor.f6974J = matroskaExtractor.l((bArr7[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr7[i5] << 8)) + matroskaExtractor.D;
                if (track6.d != 2) {
                    i11 = i4;
                } else {
                    i11 = i4;
                }
                matroskaExtractor.f6977Q = i11;
                matroskaExtractor.f6973I = 2;
                matroskaExtractor.L = i5;
            } else {
                i4 = 1;
            }
            if (i2 == 163) {
                while (true) {
                    int i35 = matroskaExtractor.L;
                    if (i35 >= matroskaExtractor.M) {
                        matroskaExtractor.f6973I = 0;
                        return;
                    }
                    matroskaExtractor.h(track6, ((long) ((matroskaExtractor.L * track6.f7014e) / 1000)) + matroskaExtractor.f6974J, matroskaExtractor.f6977Q, matroskaExtractor.m(defaultExtractorInput, track6, matroskaExtractor.f6975N[i35], false), 0);
                    matroskaExtractor.L++;
                }
            } else {
                while (true) {
                    int i36 = matroskaExtractor.L;
                    if (i36 >= matroskaExtractor.M) {
                        return;
                    }
                    int[] iArr5 = matroskaExtractor.f6975N;
                    boolean z2 = i4;
                    iArr5[i36] = matroskaExtractor.m(defaultExtractorInput, track6, iArr5[i36], z2);
                    matroskaExtractor.L += z2 ? 1 : 0;
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
                    matroskaExtractor.g(i2);
                    matroskaExtractor.f6995w.d = (int) j;
                    return;
                case PRIVACY_URL_ERROR_VALUE:
                    matroskaExtractor.g(i2);
                    matroskaExtractor.f6995w.W = j == 1;
                    return;
                case ModuleDescriptor.MODULE_VERSION /* 155 */:
                    matroskaExtractor.K = matroskaExtractor.l(j);
                    return;
                case 159:
                    matroskaExtractor.g(i2);
                    matroskaExtractor.f6995w.f7005P = (int) j;
                    return;
                case 176:
                    matroskaExtractor.g(i2);
                    matroskaExtractor.f6995w.m = (int) j;
                    return;
                case 179:
                    matroskaExtractor.a(i2);
                    matroskaExtractor.f6971E.a(matroskaExtractor.l(j));
                    return;
                case 186:
                    matroskaExtractor.g(i2);
                    matroskaExtractor.f6995w.f7018n = (int) j;
                    return;
                case AD_RESPONSE_EMPTY_VALUE:
                    matroskaExtractor.g(i2);
                    matroskaExtractor.f6995w.f7013c = (int) j;
                    return;
                case 231:
                    matroskaExtractor.D = matroskaExtractor.l(j);
                    return;
                case 238:
                    matroskaExtractor.f6978R = (int) j;
                    return;
                case 241:
                    if (matroskaExtractor.G) {
                        return;
                    }
                    matroskaExtractor.a(i2);
                    matroskaExtractor.f6972F.a(j);
                    matroskaExtractor.G = true;
                    return;
                case 251:
                    matroskaExtractor.S = true;
                    return;
                case 16871:
                    matroskaExtractor.g(i2);
                    matroskaExtractor.f6995w.g = (int) j;
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
                    matroskaExtractor.f6996z = j + matroskaExtractor.s;
                    return;
                case 21432:
                    int i3 = (int) j;
                    matroskaExtractor.g(i2);
                    if (i3 == 0) {
                        matroskaExtractor.f6995w.x = 0;
                        return;
                    }
                    if (i3 == 1) {
                        matroskaExtractor.f6995w.x = 2;
                        return;
                    } else if (i3 == 3) {
                        matroskaExtractor.f6995w.x = 1;
                        return;
                    } else {
                        if (i3 != 15) {
                            return;
                        }
                        matroskaExtractor.f6995w.x = 3;
                        return;
                    }
                case 21680:
                    matroskaExtractor.g(i2);
                    matroskaExtractor.f6995w.f7019p = (int) j;
                    return;
                case 21682:
                    matroskaExtractor.g(i2);
                    matroskaExtractor.f6995w.r = (int) j;
                    return;
                case 21690:
                    matroskaExtractor.g(i2);
                    matroskaExtractor.f6995w.q = (int) j;
                    return;
                case 21930:
                    matroskaExtractor.g(i2);
                    matroskaExtractor.f6995w.f7009V = j == 1;
                    return;
                case 21938:
                    matroskaExtractor.g(i2);
                    Track track = matroskaExtractor.f6995w;
                    track.y = true;
                    track.o = (int) j;
                    return;
                case 21998:
                    matroskaExtractor.g(i2);
                    matroskaExtractor.f6995w.f = (int) j;
                    return;
                case 22186:
                    matroskaExtractor.g(i2);
                    matroskaExtractor.f6995w.S = j;
                    return;
                case 22203:
                    matroskaExtractor.g(i2);
                    matroskaExtractor.f6995w.T = j;
                    return;
                case 25188:
                    matroskaExtractor.g(i2);
                    matroskaExtractor.f6995w.f7006Q = (int) j;
                    return;
                case 30114:
                    matroskaExtractor.T = j;
                    return;
                case 30321:
                    matroskaExtractor.g(i2);
                    int i4 = (int) j;
                    if (i4 == 0) {
                        matroskaExtractor.f6995w.s = 0;
                        return;
                    }
                    if (i4 == 1) {
                        matroskaExtractor.f6995w.s = 1;
                        return;
                    } else if (i4 == 2) {
                        matroskaExtractor.f6995w.s = 2;
                        return;
                    } else {
                        if (i4 != 3) {
                            return;
                        }
                        matroskaExtractor.f6995w.s = 3;
                        return;
                    }
                case 2352003:
                    matroskaExtractor.g(i2);
                    matroskaExtractor.f6995w.f7014e = (int) j;
                    return;
                case 2807729:
                    matroskaExtractor.t = j;
                    return;
                default:
                    switch (i2) {
                        case 21945:
                            matroskaExtractor.g(i2);
                            int i5 = (int) j;
                            if (i5 == 1) {
                                matroskaExtractor.f6995w.f6999B = 2;
                                return;
                            } else {
                                if (i5 != 2) {
                                    return;
                                }
                                matroskaExtractor.f6995w.f6999B = 1;
                                return;
                            }
                        case 21946:
                            matroskaExtractor.g(i2);
                            int iG = ColorInfo.g((int) j);
                            if (iG != -1) {
                                matroskaExtractor.f6995w.f6998A = iG;
                                return;
                            }
                            return;
                        case 21947:
                            matroskaExtractor.g(i2);
                            matroskaExtractor.f6995w.y = true;
                            int iF = ColorInfo.f((int) j);
                            if (iF != -1) {
                                matroskaExtractor.f6995w.f7022z = iF;
                                return;
                            }
                            return;
                        case 21948:
                            matroskaExtractor.g(i2);
                            matroskaExtractor.f6995w.C = (int) j;
                            return;
                        case 21949:
                            matroskaExtractor.g(i2);
                            matroskaExtractor.f6995w.D = (int) j;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    public static final class Track {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f6998A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f6999B;
        public int C;
        public int D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public float f7000E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public float f7001F;
        public float G;
        public float H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public float f7002I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public float f7003J;
        public float K;
        public float L;
        public float M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public float f7004N;
        public byte[] O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public int f7005P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public int f7006Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public int f7007R;
        public long S;
        public long T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public TrueHdSampleRechunker f7008U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public boolean f7009V;
        public boolean W;
        public String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public TrackOutput f7010Y;
        public int Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f7011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f7012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7013c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7014e;
        public int f;
        public int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f7015h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public byte[] f7016i;
        public TrackOutput.CryptoData j;
        public byte[] k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public DrmInitData f7017l;
        public int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f7018n;
        public int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f7019p;
        public int q;
        public int r;
        public int s;
        public float t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f7020u;
        public float v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public byte[] f7021w;
        public int x;
        public boolean y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f7022z;

        public final byte[] a(String str) throws ParserException {
            byte[] bArr = this.k;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.a(null, "Missing CodecPrivate for codec " + str);
        }
    }

    static {
        int i2 = Util.f5683a;
        f0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(Charsets.f19705c);
        g0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        h0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        i0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        a.v(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        a.v(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        j0 = Collections.unmodifiableMap(map);
    }

    public MatroskaExtractor(SubtitleParser.Factory factory, int i2) {
        DefaultEbmlReader defaultEbmlReader = new DefaultEbmlReader();
        this.s = -1L;
        this.t = -9223372036854775807L;
        this.f6994u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.f6970B = -1L;
        this.C = -1L;
        this.D = -9223372036854775807L;
        this.f6982a = defaultEbmlReader;
        defaultEbmlReader.d = new InnerEbmlProcessor();
        this.f = factory;
        this.d = (i2 & 1) == 0;
        this.f6988e = (i2 & 2) == 0;
        this.f6983b = new VarintReader();
        this.f6985c = new SparseArray();
        this.f6990i = new ParsableByteArray(4);
        this.j = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
        this.k = new ParsableByteArray(4);
        this.g = new ParsableByteArray(NalUnitUtil.f5695a);
        this.f6989h = new ParsableByteArray(4);
        this.f6991l = new ParsableByteArray();
        this.m = new ParsableByteArray();
        this.f6992n = new ParsableByteArray(8);
        this.o = new ParsableByteArray();
        this.f6993p = new ParsableByteArray();
        this.f6975N = new int[1];
    }

    public static byte[] i(long j, long j2, String str) {
        Assertions.b(j != -9223372036854775807L);
        int i2 = (int) (j / 3600000000L);
        long j3 = j - (((long) i2) * 3600000000L);
        int i3 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i3) * 60000000);
        int i4 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j4 - (((long) i4) * 1000000)) / j2)));
        int i5 = Util.f5683a;
        return str2.getBytes(Charsets.f19705c);
    }

    public final void a(int i2) throws ParserException {
        if (this.f6971E == null || this.f6972F == null) {
            throw ParserException.a(null, "Element " + i2 + " must be in a Cues");
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean c(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
        Sniffer sniffer = new Sniffer();
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        long j = defaultExtractorInput.f6741c;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i2 = (int) j2;
        ParsableByteArray parsableByteArray = sniffer.f7023a;
        defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, 4, false);
        sniffer.f7024b = 4;
        for (long jW = parsableByteArray.w(); jW != 440786851; jW = ((jW << 8) & (-256)) | ((long) (parsableByteArray.f5667a[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED))) {
            int i3 = sniffer.f7024b + 1;
            sniffer.f7024b = i3;
            if (i3 == i2) {
                return false;
            }
            defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, 1, false);
        }
        long jA = sniffer.a(defaultExtractorInput);
        long j3 = sniffer.f7024b;
        if (jA != Long.MIN_VALUE && (j == -1 || j3 + jA < j)) {
            while (true) {
                long j4 = sniffer.f7024b;
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
                        sniffer.f7024b += i4;
                    }
                } else if (j4 == j5) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.f6987d0 = extractorOutput;
        if (this.f6988e) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.f);
        }
        this.f6987d0 = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) {
        int i2 = 0;
        this.H = false;
        boolean z2 = true;
        while (z2 && !this.H) {
            DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
            boolean zA = this.f6982a.a(defaultExtractorInput);
            if (zA) {
                long j = defaultExtractorInput.d;
                if (this.f6969A) {
                    this.C = j;
                    positionHolder.f6793a = this.f6970B;
                    this.f6969A = false;
                    return 1;
                }
                if (this.x) {
                    long j2 = this.C;
                    if (j2 != -1) {
                        positionHolder.f6793a = j2;
                        this.C = -1L;
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
            SparseArray sparseArray = this.f6985c;
            if (i2 >= sparseArray.size()) {
                return -1;
            }
            Track track = (Track) sparseArray.valueAt(i2);
            track.f7010Y.getClass();
            TrueHdSampleRechunker trueHdSampleRechunker = track.f7008U;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.a(track.f7010Y, track.j);
            }
            i2++;
        }
    }

    public final void g(int i2) throws ParserException {
        if (this.f6995w != null) {
            return;
        }
        throw ParserException.a(null, "Element " + i2 + " must be in a TrackEntry");
    }

    public final void h(Track track, long j, int i2, int i3, int i4) {
        byte[] bArrI;
        int i5;
        int i6;
        TrueHdSampleRechunker trueHdSampleRechunker = track.f7008U;
        if (trueHdSampleRechunker != null) {
            trueHdSampleRechunker.b(track.f7010Y, j, i2, i3, i4, track.j);
        } else {
            if ("S_TEXT/UTF8".equals(track.f7012b) || "S_TEXT/ASS".equals(track.f7012b) || "S_TEXT/WEBVTT".equals(track.f7012b)) {
                if (this.M > 1) {
                    Log.g("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.K;
                    if (j2 == -9223372036854775807L) {
                        Log.g("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = track.f7012b;
                        ParsableByteArray parsableByteArray = this.m;
                        byte[] bArr = parsableByteArray.f5667a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                                bArrI = i(j2, 10000L, "%01d:%02d:%02d:%02d");
                                i5 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrI = i(j2, 1000L, "%02d:%02d:%02d.%03d");
                                i5 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrI = i(j2, 1000L, "%02d:%02d:%02d,%03d");
                                i5 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(bArrI, 0, bArr, i5, bArrI.length);
                        for (int i7 = parsableByteArray.f5668b; i7 < parsableByteArray.f5669c; i7++) {
                            if (parsableByteArray.f5667a[i7] == 0) {
                                parsableByteArray.F(i7);
                                track.f7010Y.e(parsableByteArray.f5669c, parsableByteArray);
                                i6 = i3 + parsableByteArray.f5669c;
                            }
                        }
                        track.f7010Y.e(parsableByteArray.f5669c, parsableByteArray);
                        i6 = i3 + parsableByteArray.f5669c;
                    }
                }
                i6 = i3;
            } else {
                i6 = i3;
            }
            if ((i2 & 268435456) != 0) {
                int i8 = this.M;
                ParsableByteArray parsableByteArray2 = this.f6993p;
                if (i8 > 1) {
                    parsableByteArray2.D(0);
                } else {
                    int i9 = parsableByteArray2.f5669c;
                    track.f7010Y.a(parsableByteArray2, i9, 2);
                    i6 += i9;
                }
            }
            track.f7010Y.f(j, i2, i6, i4, track.j);
        }
        this.H = true;
    }

    public final void j(DefaultExtractorInput defaultExtractorInput, int i2) throws EOFException, InterruptedIOException {
        ParsableByteArray parsableByteArray = this.f6990i;
        if (parsableByteArray.f5669c >= i2) {
            return;
        }
        byte[] bArr = parsableByteArray.f5667a;
        if (bArr.length < i2) {
            parsableByteArray.b(Math.max(bArr.length * 2, i2));
        }
        byte[] bArr2 = parsableByteArray.f5667a;
        int i3 = parsableByteArray.f5669c;
        defaultExtractorInput.readFully(bArr2, i3, i2 - i3, false);
        parsableByteArray.F(i2);
    }

    public final void k() {
        this.f6979U = 0;
        this.f6980V = 0;
        this.W = 0;
        this.X = false;
        this.f6981Y = false;
        this.Z = false;
        this.a0 = 0;
        this.f6984b0 = (byte) 0;
        this.f6986c0 = false;
        this.f6991l.D(0);
    }

    public final long l(long j) throws ParserException {
        long j2 = this.t;
        if (j2 == -9223372036854775807L) {
            throw ParserException.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        int i2 = Util.f5683a;
        return Util.O(j, j2, 1000L, RoundingMode.FLOOR);
    }

    public final int m(DefaultExtractorInput defaultExtractorInput, Track track, int i2, boolean z2) throws ParserException, EOFException, InterruptedIOException {
        int iC;
        int iC2;
        boolean z3;
        int i3;
        if ("S_TEXT/UTF8".equals(track.f7012b)) {
            n(defaultExtractorInput, e0, i2);
            int i4 = this.f6980V;
            k();
            return i4;
        }
        if ("S_TEXT/ASS".equals(track.f7012b)) {
            n(defaultExtractorInput, g0, i2);
            int i5 = this.f6980V;
            k();
            return i5;
        }
        if ("S_TEXT/WEBVTT".equals(track.f7012b)) {
            n(defaultExtractorInput, h0, i2);
            int i6 = this.f6980V;
            k();
            return i6;
        }
        TrackOutput trackOutput = track.f7010Y;
        boolean z4 = this.X;
        ParsableByteArray parsableByteArray = this.f6991l;
        if (!z4) {
            boolean z5 = track.f7015h;
            ParsableByteArray parsableByteArray2 = this.f6990i;
            if (z5) {
                this.f6977Q &= -1073741825;
                if (!this.f6981Y) {
                    defaultExtractorInput.readFully(parsableByteArray2.f5667a, 0, 1, false);
                    this.f6979U++;
                    byte b2 = parsableByteArray2.f5667a[0];
                    if ((b2 & 128) == 128) {
                        throw ParserException.a(null, "Extension bit is set in signal byte");
                    }
                    this.f6984b0 = b2;
                    this.f6981Y = true;
                }
                byte b3 = this.f6984b0;
                if ((b3 & 1) == 1) {
                    boolean z6 = (b3 & 2) == 2;
                    this.f6977Q |= 1073741824;
                    if (!this.f6986c0) {
                        ParsableByteArray parsableByteArray3 = this.f6992n;
                        defaultExtractorInput.readFully(parsableByteArray3.f5667a, 0, 8, false);
                        this.f6979U += 8;
                        this.f6986c0 = true;
                        parsableByteArray2.f5667a[0] = (byte) ((z6 ? 128 : 0) | 8);
                        parsableByteArray2.G(0);
                        trackOutput.a(parsableByteArray2, 1, 1);
                        this.f6980V++;
                        parsableByteArray3.G(0);
                        trackOutput.a(parsableByteArray3, 8, 1);
                        this.f6980V += 8;
                    }
                    if (z6) {
                        if (!this.Z) {
                            defaultExtractorInput.readFully(parsableByteArray2.f5667a, 0, 1, false);
                            this.f6979U++;
                            parsableByteArray2.G(0);
                            this.a0 = parsableByteArray2.u();
                            this.Z = true;
                        }
                        int i7 = this.a0 * 4;
                        parsableByteArray2.D(i7);
                        defaultExtractorInput.readFully(parsableByteArray2.f5667a, 0, i7, false);
                        this.f6979U += i7;
                        short s = (short) ((this.a0 / 2) + 1);
                        int i8 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.q;
                        if (byteBuffer == null || byteBuffer.capacity() < i8) {
                            this.q = ByteBuffer.allocate(i8);
                        }
                        this.q.position(0);
                        this.q.putShort(s);
                        int i9 = 0;
                        int i10 = 0;
                        while (true) {
                            i3 = this.a0;
                            if (i9 >= i3) {
                                break;
                            }
                            int iY = parsableByteArray2.y();
                            if (i9 % 2 == 0) {
                                this.q.putShort((short) (iY - i10));
                            } else {
                                this.q.putInt(iY - i10);
                            }
                            i9++;
                            i10 = iY;
                        }
                        int i11 = (i2 - this.f6979U) - i10;
                        if (i3 % 2 == 1) {
                            this.q.putInt(i11);
                        } else {
                            this.q.putShort((short) i11);
                            this.q.putInt(0);
                        }
                        byte[] bArrArray = this.q.array();
                        ParsableByteArray parsableByteArray4 = this.o;
                        parsableByteArray4.E(bArrArray, i8);
                        trackOutput.a(parsableByteArray4, i8, 1);
                        this.f6980V += i8;
                    }
                }
            } else {
                byte[] bArr = track.f7016i;
                if (bArr != null) {
                    parsableByteArray.E(bArr, bArr.length);
                }
            }
            if ("A_OPUS".equals(track.f7012b)) {
                z3 = z2;
            } else {
                z3 = track.f > 0;
            }
            if (z3) {
                this.f6977Q |= 268435456;
                this.f6993p.D(0);
                int i12 = (parsableByteArray.f5669c + i2) - this.f6979U;
                parsableByteArray2.D(4);
                byte[] bArr2 = parsableByteArray2.f5667a;
                bArr2[0] = (byte) ((i12 >> 24) & 255);
                bArr2[1] = (byte) ((i12 >> 16) & 255);
                bArr2[2] = (byte) ((i12 >> 8) & 255);
                bArr2[3] = (byte) (i12 & 255);
                trackOutput.a(parsableByteArray2, 4, 2);
                this.f6980V += 4;
            }
            this.X = true;
        }
        int i13 = i2 + parsableByteArray.f5669c;
        if (!"V_MPEG4/ISO/AVC".equals(track.f7012b) && !"V_MPEGH/ISO/HEVC".equals(track.f7012b)) {
            if (track.f7008U != null) {
                Assertions.e(parsableByteArray.f5669c == 0);
                track.f7008U.c(defaultExtractorInput);
            }
            while (true) {
                int i14 = this.f6979U;
                if (i14 >= i13) {
                    break;
                }
                int i15 = i13 - i14;
                int iA = parsableByteArray.a();
                if (iA > 0) {
                    iC2 = Math.min(i15, iA);
                    trackOutput.e(iC2, parsableByteArray);
                } else {
                    iC2 = trackOutput.c(defaultExtractorInput, i15, false);
                }
                this.f6979U += iC2;
                this.f6980V += iC2;
            }
        } else {
            ParsableByteArray parsableByteArray5 = this.f6989h;
            byte[] bArr3 = parsableByteArray5.f5667a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i16 = track.Z;
            int i17 = 4 - i16;
            while (this.f6979U < i13) {
                int i18 = this.W;
                if (i18 == 0) {
                    int iMin = Math.min(i16, parsableByteArray.a());
                    defaultExtractorInput.readFully(bArr3, i17 + iMin, i16 - iMin, false);
                    if (iMin > 0) {
                        parsableByteArray.e(bArr3, i17, iMin);
                    }
                    this.f6979U += i16;
                    parsableByteArray5.G(0);
                    this.W = parsableByteArray5.y();
                    ParsableByteArray parsableByteArray6 = this.g;
                    parsableByteArray6.G(0);
                    trackOutput.e(4, parsableByteArray6);
                    this.f6980V += 4;
                } else {
                    int iA2 = parsableByteArray.a();
                    if (iA2 > 0) {
                        iC = Math.min(i18, iA2);
                        trackOutput.e(iC, parsableByteArray);
                    } else {
                        iC = trackOutput.c(defaultExtractorInput, i18, false);
                    }
                    this.f6979U += iC;
                    this.f6980V += iC;
                    this.W -= iC;
                }
            }
        }
        if ("A_VORBIS".equals(track.f7012b)) {
            ParsableByteArray parsableByteArray7 = this.j;
            parsableByteArray7.G(0);
            trackOutput.e(4, parsableByteArray7);
            this.f6980V += 4;
        }
        int i19 = this.f6980V;
        k();
        return i19;
    }

    public final void n(DefaultExtractorInput defaultExtractorInput, byte[] bArr, int i2) throws EOFException, InterruptedIOException {
        int length = bArr.length + i2;
        ParsableByteArray parsableByteArray = this.m;
        byte[] bArr2 = parsableByteArray.f5667a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i2);
            parsableByteArray.E(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        defaultExtractorInput.readFully(parsableByteArray.f5667a, bArr.length, i2, false);
        parsableByteArray.G(0);
        parsableByteArray.F(length);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        this.D = -9223372036854775807L;
        this.f6973I = 0;
        DefaultEbmlReader defaultEbmlReader = this.f6982a;
        defaultEbmlReader.f6966e = 0;
        defaultEbmlReader.f6964b.clear();
        VarintReader varintReader = defaultEbmlReader.f6965c;
        varintReader.f7026b = 0;
        varintReader.f7027c = 0;
        VarintReader varintReader2 = this.f6983b;
        varintReader2.f7026b = 0;
        varintReader2.f7027c = 0;
        k();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f6985c;
            if (i2 >= sparseArray.size()) {
                return;
            }
            TrueHdSampleRechunker trueHdSampleRechunker = ((Track) sparseArray.valueAt(i2)).f7008U;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.f6809b = false;
                trueHdSampleRechunker.f6810c = 0;
            }
            i2++;
        }
    }
}
