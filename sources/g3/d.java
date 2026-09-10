package g3;

import b3.o;
import com.google.android.gms.internal.ads.q2;
import com.google.android.gms.internal.ads.y2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.services.UnityAdsConstants;
import i1.b0;
import i1.c0;
import i1.d0;
import i1.p;
import java.io.EOFException;
import java.math.RoundingMode;
import l1.q;
import l1.y;
import n2.a0;
import n2.k;
import n2.l;
import n2.m;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f41435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y2 f41436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n2.q f41437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final am.e f41438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n2.j f41439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m f41440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a0 f41441h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a0 f41442i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f41443j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c0 f41444k;
    public c0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f41445m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f41446n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f41447o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f41448p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f41449q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h f41450r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f41451s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f41452t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f41453u;

    public d(int i10) {
        this(C.TIME_UNSET);
    }

    @Override // n2.k
    public final boolean a(l lVar) {
        return g(lVar, true);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0233 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x023d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0248  */
    /* JADX WARN: Code duplicated, block: B:109:0x0259  */
    /* JADX WARN: Code duplicated, block: B:114:0x028e  */
    /* JADX WARN: Code duplicated, block: B:117:0x029a  */
    /* JADX WARN: Code duplicated, block: B:119:0x029e  */
    /* JADX WARN: Code duplicated, block: B:11:0x0043  */
    /* JADX WARN: Code duplicated, block: B:123:0x02af  */
    /* JADX WARN: Code duplicated, block: B:126:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:127:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:128:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:130:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:134:0x02de  */
    /* JADX WARN: Code duplicated, block: B:138:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    /* JADX WARN: Code duplicated, block: B:140:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:142:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:144:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:148:0x032e  */
    /* JADX WARN: Code duplicated, block: B:149:0x0332  */
    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    /* JADX WARN: Code duplicated, block: B:151:0x0339  */
    /* JADX WARN: Code duplicated, block: B:153:0x0347  */
    /* JADX WARN: Code duplicated, block: B:156:0x0356  */
    /* JADX WARN: Code duplicated, block: B:159:0x035b A[LOOP:0: B:150:0x0337->B:159:0x035b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:164:0x0365  */
    /* JADX WARN: Code duplicated, block: B:166:0x036d  */
    /* JADX WARN: Code duplicated, block: B:168:0x037b  */
    /* JADX WARN: Code duplicated, block: B:171:0x038f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0394 A[LOOP:1: B:165:0x036b->B:174:0x0394, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:178:0x039d  */
    /* JADX WARN: Code duplicated, block: B:179:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:182:0x03c2 A[LOOP:2: B:181:0x03c0->B:182:0x03c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:186:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:187:0x0400  */
    /* JADX WARN: Code duplicated, block: B:189:0x0404  */
    /* JADX WARN: Code duplicated, block: B:190:0x0407 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:192:0x040a  */
    /* JADX WARN: Code duplicated, block: B:194:0x040e  */
    /* JADX WARN: Code duplicated, block: B:195:0x043f  */
    /* JADX WARN: Code duplicated, block: B:199:0x0462  */
    /* JADX WARN: Code duplicated, block: B:201:0x0466  */
    /* JADX WARN: Code duplicated, block: B:202:0x046b  */
    /* JADX WARN: Code duplicated, block: B:205:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:207:0x04be  */
    /* JADX WARN: Code duplicated, block: B:209:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:20:0x0066  */
    /* JADX WARN: Code duplicated, block: B:211:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:214:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:217:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:234:0x0560  */
    /* JADX WARN: Code duplicated, block: B:236:0x056b  */
    /* JADX WARN: Code duplicated, block: B:237:0x056e  */
    /* JADX WARN: Code duplicated, block: B:240:0x0576  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:252:0x035e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x0360 A[EDGE_INSN: B:253:0x0360->B:161:0x0360 BREAK  A[LOOP:0: B:150:0x0337->B:159:0x035b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x0397 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x0399 A[EDGE_INSN: B:255:0x0399->B:176:0x0399 BREAK  A[LOOP:1: B:165:0x036b->B:174:0x0394], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:32:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:43:0x0106  */
    /* JADX WARN: Code duplicated, block: B:45:0x0109  */
    /* JADX WARN: Code duplicated, block: B:47:0x010c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0115  */
    /* JADX WARN: Code duplicated, block: B:51:0x011a  */
    /* JADX WARN: Code duplicated, block: B:52:0x011f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0124  */
    /* JADX WARN: Code duplicated, block: B:60:0x015a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0160  */
    /* JADX WARN: Code duplicated, block: B:64:0x017c  */
    /* JADX WARN: Code duplicated, block: B:69:0x019c  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:79:0x01bb A[LOOP:4: B:78:0x01b9->B:79:0x01bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:87:0x01da  */
    /* JADX WARN: Code duplicated, block: B:89:0x01fc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x0204  */
    /* JADX WARN: Code duplicated, block: B:95:0x021a  */
    /* JADX WARN: Code duplicated, block: B:98:0x022e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
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
    @Override // n2.k
    public final int b(l lVar, q2 q2Var) throws Throwable {
        y2 y2Var;
        Throwable th2;
        int i10;
        long j10;
        h hVar;
        q qVar;
        boolean z10;
        long j11;
        long j12;
        long position;
        long j13;
        ?? r10;
        int iC;
        int i11;
        int iM;
        q qVar2;
        int i12;
        int i13;
        int i14;
        int iM2;
        n2.q qVar3;
        y2 y2Var2;
        int i15;
        int iM3;
        int iD;
        long jB;
        long[] jArr;
        f fVar;
        int i16;
        int i17;
        long j14;
        int i18;
        int i19;
        c0 c0Var;
        long position2;
        long j15;
        long length;
        long jS;
        long j16;
        h aVar;
        long jS2;
        float fIntBitsToFloat;
        e eVarA;
        e eVarA2;
        long[] jArr2;
        int i20;
        c0 c0Var2;
        long position3;
        b0[] b0VarArr;
        int length2;
        int i21;
        b0 b0Var;
        b3.m mVar;
        int[] iArr;
        b0[] b0VarArr2;
        int length3;
        int i22;
        b0 b0Var2;
        o oVar;
        char c4;
        long jM;
        int length4;
        long[] jArr3;
        long[] jArr4;
        long j17;
        int i23;
        c cVar;
        b0 b0Var3;
        b0 b0Var4;
        boolean z11;
        h gVar;
        boolean z12;
        c0 c0VarB;
        i1.o oVar2;
        c0 c0Var3;
        long length5;
        long position4;
        long j18;
        long j19;
        int iM4;
        long jS3;
        int iG;
        int iG2;
        int iG3;
        long[] jArr5;
        long[] jArr6;
        y2 y2Var3;
        long j20;
        int i24;
        long j21;
        long jMax;
        y2 y2Var4;
        int iZ;
        this.f41441h.getClass();
        String str = y.f44830a;
        int i25 = this.f41443j;
        int i26 = 0;
        y2 y2Var5 = this.f41436c;
        if (i25 == 0) {
            try {
                g(lVar, false);
                hVar = this.f41450r;
                qVar = this.f41435b;
                if (hVar == null) {
                    qVar2 = new q(y2Var5.f22084c);
                    th2 = null;
                    lVar.peekFully(qVar2.f44813a, 0, y2Var5.f22084c);
                    i12 = 21;
                    j10 = 1000000;
                    if ((y2Var5.f22082a & 1) != 0) {
                        if (y2Var5.f22086e != 1) {
                            i12 = 36;
                        }
                    } else if (y2Var5.f22086e == 1) {
                        i12 = 13;
                    }
                    i13 = qVar2.f44815c;
                    i14 = i12 + 4;
                    j11 = C.TIME_UNSET;
                    if (i13 >= i14) {
                        qVar2.M(i12);
                        iM2 = qVar2.m();
                        if (iM2 != 1483304551 && iM2 != 1231971951) {
                            if (qVar2.f44815c >= 40) {
                                qVar2.M(36);
                                if (qVar2.m() == 1447187017) {
                                    iM2 = 1447187017;
                                } else {
                                    iM2 = 0;
                                }
                            } else {
                                iM2 = 0;
                            }
                        }
                    } else if (qVar2.f44815c >= 40) {
                        qVar2.M(36);
                        if (qVar2.m() == 1447187017) {
                            iM2 = 1447187017;
                        } else {
                            iM2 = 0;
                        }
                    } else {
                        iM2 = 0;
                    }
                    qVar3 = this.f41437d;
                    if (iM2 == 1231971951) {
                        y2Var2 = y2Var5;
                        i15 = 0;
                        iM3 = qVar2.m();
                        if ((iM3 & 1) != 0) {
                            iD = qVar2.D();
                        } else {
                            iD = -1;
                        }
                        if ((iM3 & 2) != 0) {
                            jB = qVar2.B();
                        } else {
                            jB = -1;
                        }
                        if ((iM3 & 4) == 4) {
                            jArr2 = new long[100];
                            for (i20 = 0; i20 < 100; i20++) {
                                jArr2[i20] = qVar2.z();
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        if ((iM3 & 8) != 0) {
                            qVar2.N(4);
                        }
                        if (qVar2.a() >= 24) {
                            qVar2.N(11);
                            fIntBitsToFloat = Float.intBitsToFloat(qVar2.m());
                            int iG4 = qVar2.G();
                            int iG5 = qVar2.G();
                            eVarA = e.a(iG4);
                            eVarA2 = e.a(iG5);
                            if (fIntBitsToFloat > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && eVarA == null && eVarA2 == null) {
                                fVar = null;
                            } else {
                                fVar = new f(fIntBitsToFloat, eVarA, eVarA2);
                            }
                            qVar2.N(2);
                            int iC2 = qVar2.C();
                            i17 = (16773120 & iC2) >> 12;
                            i16 = iC2 & 4095;
                        } else {
                            fVar = null;
                            i16 = -1;
                            i17 = -1;
                        }
                        j14 = iD;
                        i18 = y2Var2.f22084c;
                        int i27 = y2Var2.f22085d;
                        i19 = y2Var2.f22087f;
                        int i28 = y2Var2.f22088g;
                        if ((qVar3.f46485a != -1 || qVar3.f46486b == -1) && i17 != -1 && i16 != -1) {
                            qVar3.f46485a = i17;
                            qVar3.f46486b = i16;
                        }
                        if (fVar != null) {
                            c0Var = new c0(fVar);
                        } else {
                            c0Var = null;
                        }
                        this.l = c0Var;
                        position2 = lVar.getPosition();
                        if (lVar.getLength() != -1 || jB == -1) {
                            j15 = j14;
                        } else {
                            j15 = j14;
                            long j22 = position2 + jB;
                            if (lVar.getLength() != j22) {
                                l1.a.j("Mp3Extractor", "Data size mismatch between stream (" + lVar.getLength() + ") and Xing frame (" + j22 + "), using Xing value.");
                            }
                        }
                        lVar.skipFully(y2Var2.f22084c);
                        if (iM2 == 1483304551) {
                            if (j15 != -1 || j15 == 0) {
                                jS2 = -9223372036854775807L;
                            } else {
                                jS2 = y.S(i27, (j15 * ((long) i28)) - 1);
                            }
                            if (jS2 == C.TIME_UNSET) {
                                aVar = null;
                            } else {
                                aVar = new j(position2, i18, jS2, i19, jB, jArr);
                            }
                        } else {
                            length = lVar.getLength();
                            if (j15 != -1 || j15 == 0) {
                                jS = -9223372036854775807L;
                            } else {
                                jS = y.S(i27, (((long) i28) * j15) - 1);
                            }
                            if (jS != C.TIME_UNSET) {
                                if (jB != -1) {
                                    length = position2 + jB;
                                    j16 = jB - ((long) i18);
                                } else if (length != -1) {
                                    j16 = (length - position2) - ((long) i18);
                                } else {
                                    aVar = null;
                                }
                                long j23 = length;
                                long j24 = j16;
                                RoundingMode roundingMode = RoundingMode.HALF_UP;
                                aVar = new a(j23, position2 + ((long) i18), com.bumptech.glide.c.c(y.U(j24, 8000000L, jS, roundingMode)), com.bumptech.glide.c.c(com.bumptech.glide.c.j(j24, j15, roundingMode)), false, true);
                            } else {
                                aVar = null;
                            }
                        }
                    } else if (iM2 != 1447187017) {
                        length5 = lVar.getLength();
                        position4 = lVar.getPosition();
                        qVar2.N(6);
                        int iM5 = qVar2.m();
                        i15 = 0;
                        j18 = position4 + ((long) y2Var5.f22084c);
                        j19 = j18 + ((long) iM5);
                        iM4 = qVar2.m();
                        if (iM4 <= 0) {
                            jS3 = y.S(y2Var5.f22085d, (((long) iM4) * ((long) y2Var5.f22088g)) - 1);
                            iG = qVar2.G();
                            iG2 = qVar2.G();
                            iG3 = qVar2.G();
                            qVar2.N(2);
                            jArr5 = new long[iG];
                            jArr6 = new long[iG];
                            y2Var3 = y2Var5;
                            j20 = position4 + ((long) y2Var5.f22084c);
                            i24 = 0;
                            while (true) {
                                if (i24 < iG) {
                                    long[] jArr7 = jArr5;
                                    long[] jArr8 = jArr6;
                                    y2 y2Var6 = y2Var3;
                                    if (length5 != -1 || length5 == j19) {
                                        j21 = j19;
                                    } else {
                                        StringBuilder sbL = wi.d.l(length5, "VBRI data size mismatch: ", ", ");
                                        j21 = j19;
                                        sbL.append(j21);
                                        l1.a.s("VbriSeeker", sbL.toString());
                                    }
                                    if (j21 != j20) {
                                        StringBuilder sbL2 = wi.d.l(j21, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                        sbL2.append(j20);
                                        sbL2.append("\nSeeking will be inaccurate.");
                                        l1.a.s("VbriSeeker", sbL2.toString());
                                        jMax = Math.max(j21, j20);
                                    } else {
                                        jMax = j21;
                                    }
                                    y2Var2 = y2Var6;
                                    aVar = new i(jArr7, jArr8, jS3, j18, jMax, y2Var2.f22087f);
                                    break;
                                }
                                long[] jArr9 = jArr6;
                                y2Var4 = y2Var3;
                                int i29 = i24;
                                long[] jArr10 = jArr5;
                                jArr10[i29] = (((long) i24) * jS3) / ((long) iG);
                                jArr9[i29] = j20;
                                if (iG3 != 1) {
                                    iZ = qVar2.z();
                                } else if (iG3 != 2) {
                                    iZ = qVar2.G();
                                } else if (iG3 != 3) {
                                    iZ = qVar2.C();
                                } else {
                                    if (iG3 != 4) {
                                        aVar = null;
                                        y2Var2 = y2Var4;
                                        break;
                                    }
                                    iZ = qVar2.D();
                                }
                                j20 += ((long) iZ) * ((long) iG2);
                                i24 = i29 + 1;
                                jArr6 = jArr9;
                                y2Var3 = y2Var4;
                                jArr5 = jArr10;
                            }
                        } else {
                            aVar = null;
                            y2Var2 = y2Var5;
                        }
                        lVar.skipFully(y2Var2.f22084c);
                    } else if (iM2 != 1483304551) {
                        lVar.resetPeekPosition();
                        aVar = null;
                        y2Var2 = y2Var5;
                        i15 = 0;
                    } else {
                        y2Var2 = y2Var5;
                        i15 = 0;
                        iM3 = qVar2.m();
                        if ((iM3 & 1) != 0) {
                            iD = qVar2.D();
                        } else {
                            iD = -1;
                        }
                        if ((iM3 & 2) != 0) {
                            jB = qVar2.B();
                        } else {
                            jB = -1;
                        }
                        if ((iM3 & 4) == 4) {
                            jArr2 = new long[100];
                            while (i20 < 100) {
                                jArr2[i20] = qVar2.z();
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        if ((iM3 & 8) != 0) {
                            qVar2.N(4);
                        }
                        if (qVar2.a() >= 24) {
                            qVar2.N(11);
                            fIntBitsToFloat = Float.intBitsToFloat(qVar2.m());
                            int iG6 = qVar2.G();
                            int iG7 = qVar2.G();
                            eVarA = e.a(iG6);
                            eVarA2 = e.a(iG7);
                            if (fIntBitsToFloat > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                fVar = new f(fIntBitsToFloat, eVarA, eVarA2);
                            } else {
                                fVar = new f(fIntBitsToFloat, eVarA, eVarA2);
                            }
                            qVar2.N(2);
                            int iC3 = qVar2.C();
                            i17 = (16773120 & iC3) >> 12;
                            i16 = iC3 & 4095;
                        } else {
                            fVar = null;
                            i16 = -1;
                            i17 = -1;
                        }
                        j14 = iD;
                        i18 = y2Var2.f22084c;
                        int i210 = y2Var2.f22085d;
                        i19 = y2Var2.f22087f;
                        int i211 = y2Var2.f22088g;
                        if (qVar3.f46485a != -1) {
                            qVar3.f46485a = i17;
                            qVar3.f46486b = i16;
                        } else {
                            qVar3.f46485a = i17;
                            qVar3.f46486b = i16;
                        }
                        if (fVar != null) {
                            c0Var = new c0(fVar);
                        } else {
                            c0Var = null;
                        }
                        this.l = c0Var;
                        position2 = lVar.getPosition();
                        if (lVar.getLength() != -1) {
                            j15 = j14;
                        } else {
                            j15 = j14;
                        }
                        lVar.skipFully(y2Var2.f22084c);
                        if (iM2 == 1483304551) {
                            if (j15 != -1) {
                                jS2 = -9223372036854775807L;
                            } else {
                                jS2 = -9223372036854775807L;
                            }
                            if (jS2 == C.TIME_UNSET) {
                                aVar = null;
                            } else {
                                aVar = new j(position2, i18, jS2, i19, jB, jArr);
                            }
                        } else {
                            length = lVar.getLength();
                            if (j15 != -1) {
                                jS = -9223372036854775807L;
                            } else {
                                jS = -9223372036854775807L;
                            }
                            if (jS != C.TIME_UNSET) {
                                if (jB != -1) {
                                    length = position2 + jB;
                                    j16 = jB - ((long) i18);
                                } else if (length != -1) {
                                    j16 = (length - position2) - ((long) i18);
                                } else {
                                    aVar = null;
                                }
                                long j25 = length;
                                long j26 = j16;
                                RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                                aVar = new a(j25, position2 + ((long) i18), com.bumptech.glide.c.c(y.U(j26, 8000000L, jS, roundingMode2)), com.bumptech.glide.c.c(com.bumptech.glide.c.j(j26, j15, roundingMode2)), false, true);
                            } else {
                                aVar = null;
                            }
                        }
                    }
                    c0Var2 = this.f41444k;
                    position3 = lVar.getPosition();
                    if (c0Var2 == null) {
                        cVar = null;
                    } else {
                        b0VarArr = c0Var2.f42527a;
                        length2 = b0VarArr.length;
                        i21 = i15;
                        while (true) {
                            if (i21 < length2) {
                                b0Var = null;
                                break;
                            }
                            b0Var4 = b0VarArr[i21];
                            if (b3.m.class.isAssignableFrom(b0Var4.getClass())) {
                                b0Var = (b0) b3.m.class.cast(b0Var4);
                                if (!na.o.f46633a.apply(b0Var)) {
                                    b0Var = null;
                                }
                            } else {
                                b0Var = null;
                            }
                            if (b0Var != null) {
                                break;
                            }
                            i21++;
                        }
                        mVar = (b3.m) b0Var;
                        if (mVar == null) {
                            cVar = null;
                        } else {
                            iArr = mVar.f5470e;
                            b0VarArr2 = c0Var2.f42527a;
                            length3 = b0VarArr2.length;
                            i22 = 0;
                            while (true) {
                                if (i22 < length3) {
                                    b0Var2 = null;
                                    break;
                                }
                                b0Var3 = b0VarArr2[i22];
                                if (o.class.isAssignableFrom(b0Var3.getClass())) {
                                    b0Var2 = (b0) o.class.cast(b0Var3);
                                    if (!((o) b0Var2).f5462a.equals("TLEN")) {
                                        b0Var2 = null;
                                    }
                                } else {
                                    b0Var2 = null;
                                }
                                if (b0Var2 != null) {
                                    break;
                                }
                                i22++;
                            }
                            oVar = (o) b0Var2;
                            if (oVar == null) {
                                jM = -9223372036854775807L;
                                c4 = 0;
                            } else {
                                c4 = 0;
                                jM = y.M(Long.parseLong((String) oVar.f5475c.get(0)));
                            }
                            length4 = iArr.length;
                            int i30 = length4 + 1;
                            jArr3 = new long[i30];
                            jArr4 = new long[i30];
                            jArr3[c4] = position3;
                            jArr4[c4] = 0;
                            j17 = 0;
                            i23 = 1;
                            while (i23 <= length4) {
                                int i31 = i23 - 1;
                                long j27 = position3 + ((long) (mVar.f5468c + iArr[i31]));
                                j17 += (long) (mVar.f5469d + mVar.f5471f[i31]);
                                jArr3[i23] = j27;
                                jArr4[i23] = j17;
                                i23++;
                                length4 = length4;
                                position3 = j27;
                            }
                            cVar = new c(jArr3, jArr4, jM);
                        }
                    }
                    if (this.f41451s) {
                        gVar = new g(C.TIME_UNSET);
                        qVar = qVar;
                        qVar3 = qVar3;
                        y2Var = y2Var2;
                        z12 = true;
                        i26 = 0;
                    } else {
                        j11 = -9223372036854775807L;
                        if (cVar != null) {
                            aVar = cVar;
                        } else if (aVar == null) {
                            aVar = null;
                        }
                        if (aVar == null) {
                            int i32 = i15;
                            lVar.peekFully(qVar.f44813a, i32, 4);
                            qVar.M(i32);
                            y2Var2.a(qVar.m());
                            y2Var = y2Var2;
                            z11 = true;
                            i26 = 0;
                            aVar = new a(lVar.getLength(), lVar.getPosition(), y2Var2.f22087f, y2Var2.f22084c, false, true);
                        } else {
                            y2Var = y2Var2;
                            z11 = true;
                            i26 = 0;
                        }
                        aVar.isSeekable();
                        aVar.isSeekable();
                        this.f41441h.e(aVar.getDurationUs());
                        gVar = aVar;
                        z12 = z11;
                    }
                    this.f41450r = gVar;
                    this.f41440g.u(gVar);
                    c0VarB = this.f41444k;
                    if (c0VarB != null) {
                        c0Var3 = this.l;
                        if (c0Var3 != null) {
                            c0VarB = c0VarB.b(c0Var3);
                        }
                    } else {
                        c0VarB = this.l;
                    }
                    oVar2 = new i1.o();
                    oVar2.l = d0.n(MimeTypes.AUDIO_MPEG);
                    oVar2.f42600m = d0.n(y2Var.f22083b);
                    oVar2.f42601n = 4096;
                    oVar2.E = y2Var.f22086e;
                    oVar2.F = y2Var.f22085d;
                    oVar2.H = qVar3.f46485a;
                    oVar2.I = qVar3.f46486b;
                    oVar2.f42599k = c0VarB;
                    if (this.f41450r.c() != -2147483647) {
                        oVar2.f42596h = this.f41450r.c();
                    }
                    this.f41442i.b(new p(oVar2));
                    this.f41447o = lVar.getPosition();
                    j12 = 0;
                    r10 = z12;
                } else {
                    y2Var = y2Var5;
                    qVar = qVar;
                    z10 = true;
                    th2 = null;
                    j10 = 1000000;
                    j11 = C.TIME_UNSET;
                    j12 = 0;
                    if (this.f41447o != 0) {
                        position = lVar.getPosition();
                        j13 = this.f41447o;
                        if (position < j13) {
                            r10 = z10;
                            r10 = z10;
                            lVar.skipFully((int) (j13 - position));
                            r10 = z10;
                        }
                    }
                }
                r10 = z10;
                r10 = z10;
                r10 = z10;
                if (this.f41449q == 0) {
                    lVar.resetPeekPosition();
                    if (f(lVar)) {
                        i10 = -1;
                        i26 = -1;
                    } else {
                        qVar.M(i26);
                        iM = qVar.m();
                        if (((-128000) & iM) == (((long) this.f41443j) & (-128000)) || n2.b.k(iM) == -1) {
                            lVar.skipFully(r10);
                            this.f41443j = i26;
                        } else {
                            y2Var.a(iM);
                            if (this.f41445m == j11) {
                                this.f41445m = this.f41450r.getTimeUs(lVar.getPosition());
                                long j28 = this.f41434a;
                                if (j28 != j11) {
                                    this.f41445m = (j28 - this.f41450r.getTimeUs(j12)) + this.f41445m;
                                }
                            }
                            this.f41449q = y2Var.f22084c;
                            this.f41448p = lVar.getPosition() + ((long) y2Var.f22084c);
                            if (this.f41450r instanceof b) {
                                long j29 = ((this.f41446n + ((long) y2Var.f22088g)) * j10) / ((long) y2Var.f22085d);
                                throw th2;
                            }
                            iC = this.f41442i.c(lVar, this.f41449q, r10);
                            if (iC == -1) {
                                i10 = -1;
                                i26 = -1;
                            } else {
                                i11 = this.f41449q - iC;
                                this.f41449q = i11;
                                if (i11 <= 0) {
                                    this.f41442i.a(this.f41445m + ((this.f41446n * j10) / ((long) y2Var.f22085d)), 1, y2Var.f22084c, 0, null);
                                    this.f41446n += (long) y2Var.f22088g;
                                    this.f41449q = i26;
                                }
                            }
                        }
                        i10 = -1;
                    }
                } else {
                    iC = this.f41442i.c(lVar, this.f41449q, r10);
                    if (iC == -1) {
                        i10 = -1;
                        i26 = -1;
                    } else {
                        i11 = this.f41449q - iC;
                        this.f41449q = i11;
                        if (i11 <= 0) {
                            this.f41442i.a(this.f41445m + ((this.f41446n * j10) / ((long) y2Var.f22085d)), 1, y2Var.f22084c, 0, null);
                            this.f41446n += (long) y2Var.f22088g;
                            this.f41449q = i26;
                        }
                        i10 = -1;
                    }
                }
            } catch (EOFException unused) {
                y2Var = y2Var5;
                th2 = null;
                i10 = -1;
                i26 = -1;
                j10 = 1000000;
            }
        } else {
            hVar = this.f41450r;
            qVar = this.f41435b;
            if (hVar == null) {
                qVar2 = new q(y2Var5.f22084c);
                th2 = null;
                lVar.peekFully(qVar2.f44813a, 0, y2Var5.f22084c);
                i12 = 21;
                j10 = 1000000;
                if ((y2Var5.f22082a & 1) != 0) {
                    if (y2Var5.f22086e != 1) {
                        i12 = 36;
                    }
                } else if (y2Var5.f22086e == 1) {
                    i12 = 13;
                }
                i13 = qVar2.f44815c;
                i14 = i12 + 4;
                j11 = C.TIME_UNSET;
                if (i13 >= i14) {
                    qVar2.M(i12);
                    iM2 = qVar2.m();
                    if (iM2 != 1483304551) {
                        if (qVar2.f44815c >= 40) {
                            qVar2.M(36);
                            if (qVar2.m() == 1447187017) {
                                iM2 = 1447187017;
                            } else {
                                iM2 = 0;
                            }
                        } else {
                            iM2 = 0;
                        }
                    }
                } else if (qVar2.f44815c >= 40) {
                    qVar2.M(36);
                    if (qVar2.m() == 1447187017) {
                        iM2 = 1447187017;
                    } else {
                        iM2 = 0;
                    }
                } else {
                    iM2 = 0;
                }
                qVar3 = this.f41437d;
                if (iM2 == 1231971951) {
                    y2Var2 = y2Var5;
                    i15 = 0;
                    iM3 = qVar2.m();
                    if ((iM3 & 1) != 0) {
                        iD = qVar2.D();
                    } else {
                        iD = -1;
                    }
                    if ((iM3 & 2) != 0) {
                        jB = qVar2.B();
                    } else {
                        jB = -1;
                    }
                    if ((iM3 & 4) == 4) {
                        jArr2 = new long[100];
                        while (i20 < 100) {
                            jArr2[i20] = qVar2.z();
                        }
                        jArr = jArr2;
                    } else {
                        jArr = null;
                    }
                    if ((iM3 & 8) != 0) {
                        qVar2.N(4);
                    }
                    if (qVar2.a() >= 24) {
                        qVar2.N(11);
                        fIntBitsToFloat = Float.intBitsToFloat(qVar2.m());
                        int iG8 = qVar2.G();
                        int iG9 = qVar2.G();
                        eVarA = e.a(iG8);
                        eVarA2 = e.a(iG9);
                        if (fIntBitsToFloat > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            fVar = new f(fIntBitsToFloat, eVarA, eVarA2);
                        } else {
                            fVar = new f(fIntBitsToFloat, eVarA, eVarA2);
                        }
                        qVar2.N(2);
                        int iC4 = qVar2.C();
                        i17 = (16773120 & iC4) >> 12;
                        i16 = iC4 & 4095;
                    } else {
                        fVar = null;
                        i16 = -1;
                        i17 = -1;
                    }
                    j14 = iD;
                    i18 = y2Var2.f22084c;
                    int i212 = y2Var2.f22085d;
                    i19 = y2Var2.f22087f;
                    int i213 = y2Var2.f22088g;
                    if (qVar3.f46485a != -1) {
                        qVar3.f46485a = i17;
                        qVar3.f46486b = i16;
                    } else {
                        qVar3.f46485a = i17;
                        qVar3.f46486b = i16;
                    }
                    if (fVar != null) {
                        c0Var = new c0(fVar);
                    } else {
                        c0Var = null;
                    }
                    this.l = c0Var;
                    position2 = lVar.getPosition();
                    if (lVar.getLength() != -1) {
                        j15 = j14;
                    } else {
                        j15 = j14;
                    }
                    lVar.skipFully(y2Var2.f22084c);
                    if (iM2 == 1483304551) {
                        if (j15 != -1) {
                            jS2 = -9223372036854775807L;
                        } else {
                            jS2 = -9223372036854775807L;
                        }
                        if (jS2 == C.TIME_UNSET) {
                            aVar = null;
                        } else {
                            aVar = new j(position2, i18, jS2, i19, jB, jArr);
                        }
                    } else {
                        length = lVar.getLength();
                        if (j15 != -1) {
                            jS = -9223372036854775807L;
                        } else {
                            jS = -9223372036854775807L;
                        }
                        if (jS != C.TIME_UNSET) {
                            if (jB != -1) {
                                length = position2 + jB;
                                j16 = jB - ((long) i18);
                            } else if (length != -1) {
                                j16 = (length - position2) - ((long) i18);
                            } else {
                                aVar = null;
                            }
                            long j210 = length;
                            long j211 = j16;
                            RoundingMode roundingMode3 = RoundingMode.HALF_UP;
                            aVar = new a(j210, position2 + ((long) i18), com.bumptech.glide.c.c(y.U(j211, 8000000L, jS, roundingMode3)), com.bumptech.glide.c.c(com.bumptech.glide.c.j(j211, j15, roundingMode3)), false, true);
                        } else {
                            aVar = null;
                        }
                    }
                } else if (iM2 != 1447187017) {
                    length5 = lVar.getLength();
                    position4 = lVar.getPosition();
                    qVar2.N(6);
                    int iM6 = qVar2.m();
                    i15 = 0;
                    j18 = position4 + ((long) y2Var5.f22084c);
                    j19 = j18 + ((long) iM6);
                    iM4 = qVar2.m();
                    if (iM4 <= 0) {
                        jS3 = y.S(y2Var5.f22085d, (((long) iM4) * ((long) y2Var5.f22088g)) - 1);
                        iG = qVar2.G();
                        iG2 = qVar2.G();
                        iG3 = qVar2.G();
                        qVar2.N(2);
                        jArr5 = new long[iG];
                        jArr6 = new long[iG];
                        y2Var3 = y2Var5;
                        j20 = position4 + ((long) y2Var5.f22084c);
                        i24 = 0;
                        while (true) {
                            if (i24 < iG) {
                                long[] jArr11 = jArr5;
                                long[] jArr12 = jArr6;
                                y2 y2Var7 = y2Var3;
                                if (length5 != -1) {
                                    j21 = j19;
                                } else {
                                    j21 = j19;
                                }
                                if (j21 != j20) {
                                    StringBuilder sbL3 = wi.d.l(j21, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                    sbL3.append(j20);
                                    sbL3.append("\nSeeking will be inaccurate.");
                                    l1.a.s("VbriSeeker", sbL3.toString());
                                    jMax = Math.max(j21, j20);
                                } else {
                                    jMax = j21;
                                }
                                y2Var2 = y2Var7;
                                aVar = new i(jArr11, jArr12, jS3, j18, jMax, y2Var2.f22087f);
                                break;
                            }
                            long[] jArr13 = jArr6;
                            y2Var4 = y2Var3;
                            int i214 = i24;
                            long[] jArr14 = jArr5;
                            jArr14[i214] = (((long) i24) * jS3) / ((long) iG);
                            jArr13[i214] = j20;
                            if (iG3 != 1) {
                                iZ = qVar2.z();
                            } else if (iG3 != 2) {
                                iZ = qVar2.G();
                            } else if (iG3 != 3) {
                                iZ = qVar2.C();
                            } else {
                                if (iG3 != 4) {
                                    aVar = null;
                                    y2Var2 = y2Var4;
                                    break;
                                }
                                iZ = qVar2.D();
                            }
                            j20 += ((long) iZ) * ((long) iG2);
                            i24 = i214 + 1;
                            jArr6 = jArr13;
                            y2Var3 = y2Var4;
                            jArr5 = jArr14;
                        }
                    } else {
                        aVar = null;
                        y2Var2 = y2Var5;
                    }
                    lVar.skipFully(y2Var2.f22084c);
                } else if (iM2 != 1483304551) {
                    lVar.resetPeekPosition();
                    aVar = null;
                    y2Var2 = y2Var5;
                    i15 = 0;
                } else {
                    y2Var2 = y2Var5;
                    i15 = 0;
                    iM3 = qVar2.m();
                    if ((iM3 & 1) != 0) {
                        iD = qVar2.D();
                    } else {
                        iD = -1;
                    }
                    if ((iM3 & 2) != 0) {
                        jB = qVar2.B();
                    } else {
                        jB = -1;
                    }
                    if ((iM3 & 4) == 4) {
                        jArr2 = new long[100];
                        while (i20 < 100) {
                            jArr2[i20] = qVar2.z();
                        }
                        jArr = jArr2;
                    } else {
                        jArr = null;
                    }
                    if ((iM3 & 8) != 0) {
                        qVar2.N(4);
                    }
                    if (qVar2.a() >= 24) {
                        qVar2.N(11);
                        fIntBitsToFloat = Float.intBitsToFloat(qVar2.m());
                        int iG10 = qVar2.G();
                        int iG11 = qVar2.G();
                        eVarA = e.a(iG10);
                        eVarA2 = e.a(iG11);
                        if (fIntBitsToFloat > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            fVar = new f(fIntBitsToFloat, eVarA, eVarA2);
                        } else {
                            fVar = new f(fIntBitsToFloat, eVarA, eVarA2);
                        }
                        qVar2.N(2);
                        int iC5 = qVar2.C();
                        i17 = (16773120 & iC5) >> 12;
                        i16 = iC5 & 4095;
                    } else {
                        fVar = null;
                        i16 = -1;
                        i17 = -1;
                    }
                    j14 = iD;
                    i18 = y2Var2.f22084c;
                    int i215 = y2Var2.f22085d;
                    i19 = y2Var2.f22087f;
                    int i216 = y2Var2.f22088g;
                    if (qVar3.f46485a != -1) {
                        qVar3.f46485a = i17;
                        qVar3.f46486b = i16;
                    } else {
                        qVar3.f46485a = i17;
                        qVar3.f46486b = i16;
                    }
                    if (fVar != null) {
                        c0Var = new c0(fVar);
                    } else {
                        c0Var = null;
                    }
                    this.l = c0Var;
                    position2 = lVar.getPosition();
                    if (lVar.getLength() != -1) {
                        j15 = j14;
                    } else {
                        j15 = j14;
                    }
                    lVar.skipFully(y2Var2.f22084c);
                    if (iM2 == 1483304551) {
                        if (j15 != -1) {
                            jS2 = -9223372036854775807L;
                        } else {
                            jS2 = -9223372036854775807L;
                        }
                        if (jS2 == C.TIME_UNSET) {
                            aVar = null;
                        } else {
                            aVar = new j(position2, i18, jS2, i19, jB, jArr);
                        }
                    } else {
                        length = lVar.getLength();
                        if (j15 != -1) {
                            jS = -9223372036854775807L;
                        } else {
                            jS = -9223372036854775807L;
                        }
                        if (jS != C.TIME_UNSET) {
                            if (jB != -1) {
                                length = position2 + jB;
                                j16 = jB - ((long) i18);
                            } else if (length != -1) {
                                j16 = (length - position2) - ((long) i18);
                            } else {
                                aVar = null;
                            }
                            long j212 = length;
                            long j213 = j16;
                            RoundingMode roundingMode4 = RoundingMode.HALF_UP;
                            aVar = new a(j212, position2 + ((long) i18), com.bumptech.glide.c.c(y.U(j213, 8000000L, jS, roundingMode4)), com.bumptech.glide.c.c(com.bumptech.glide.c.j(j213, j15, roundingMode4)), false, true);
                        } else {
                            aVar = null;
                        }
                    }
                }
                c0Var2 = this.f41444k;
                position3 = lVar.getPosition();
                if (c0Var2 == null) {
                    cVar = null;
                } else {
                    b0VarArr = c0Var2.f42527a;
                    length2 = b0VarArr.length;
                    i21 = i15;
                    while (true) {
                        if (i21 < length2) {
                            b0Var = null;
                            break;
                        }
                        b0Var4 = b0VarArr[i21];
                        if (b3.m.class.isAssignableFrom(b0Var4.getClass())) {
                            b0Var = (b0) b3.m.class.cast(b0Var4);
                            if (!na.o.f46633a.apply(b0Var)) {
                                b0Var = null;
                            }
                        } else {
                            b0Var = null;
                        }
                        if (b0Var != null) {
                            break;
                            break;
                        }
                        i21++;
                    }
                    mVar = (b3.m) b0Var;
                    if (mVar == null) {
                        cVar = null;
                    } else {
                        iArr = mVar.f5470e;
                        b0VarArr2 = c0Var2.f42527a;
                        length3 = b0VarArr2.length;
                        i22 = 0;
                        while (true) {
                            if (i22 < length3) {
                                b0Var2 = null;
                                break;
                            }
                            b0Var3 = b0VarArr2[i22];
                            if (o.class.isAssignableFrom(b0Var3.getClass())) {
                                b0Var2 = (b0) o.class.cast(b0Var3);
                                if (!((o) b0Var2).f5462a.equals("TLEN")) {
                                    b0Var2 = null;
                                }
                            } else {
                                b0Var2 = null;
                            }
                            if (b0Var2 != null) {
                                break;
                                break;
                            }
                            i22++;
                        }
                        oVar = (o) b0Var2;
                        if (oVar == null) {
                            jM = -9223372036854775807L;
                            c4 = 0;
                        } else {
                            c4 = 0;
                            jM = y.M(Long.parseLong((String) oVar.f5475c.get(0)));
                        }
                        length4 = iArr.length;
                        int i33 = length4 + 1;
                        jArr3 = new long[i33];
                        jArr4 = new long[i33];
                        jArr3[c4] = position3;
                        jArr4[c4] = 0;
                        j17 = 0;
                        i23 = 1;
                        while (i23 <= length4) {
                            int i34 = i23 - 1;
                            long j214 = position3 + ((long) (mVar.f5468c + iArr[i34]));
                            j17 += (long) (mVar.f5469d + mVar.f5471f[i34]);
                            jArr3[i23] = j214;
                            jArr4[i23] = j17;
                            i23++;
                            length4 = length4;
                            position3 = j214;
                        }
                        cVar = new c(jArr3, jArr4, jM);
                    }
                }
                if (this.f41451s) {
                    gVar = new g(C.TIME_UNSET);
                    qVar = qVar;
                    qVar3 = qVar3;
                    y2Var = y2Var2;
                    z12 = true;
                    i26 = 0;
                } else {
                    j11 = -9223372036854775807L;
                    if (cVar != null) {
                        aVar = cVar;
                    } else if (aVar == null) {
                        aVar = null;
                    }
                    if (aVar == null) {
                        int i35 = i15;
                        lVar.peekFully(qVar.f44813a, i35, 4);
                        qVar.M(i35);
                        y2Var2.a(qVar.m());
                        y2Var = y2Var2;
                        z11 = true;
                        i26 = 0;
                        aVar = new a(lVar.getLength(), lVar.getPosition(), y2Var2.f22087f, y2Var2.f22084c, false, true);
                    } else {
                        y2Var = y2Var2;
                        z11 = true;
                        i26 = 0;
                    }
                    aVar.isSeekable();
                    aVar.isSeekable();
                    this.f41441h.e(aVar.getDurationUs());
                    gVar = aVar;
                    z12 = z11;
                }
                this.f41450r = gVar;
                this.f41440g.u(gVar);
                c0VarB = this.f41444k;
                if (c0VarB != null) {
                    c0Var3 = this.l;
                    if (c0Var3 != null) {
                        c0VarB = c0VarB.b(c0Var3);
                    }
                } else {
                    c0VarB = this.l;
                }
                oVar2 = new i1.o();
                oVar2.l = d0.n(MimeTypes.AUDIO_MPEG);
                oVar2.f42600m = d0.n(y2Var.f22083b);
                oVar2.f42601n = 4096;
                oVar2.E = y2Var.f22086e;
                oVar2.F = y2Var.f22085d;
                oVar2.H = qVar3.f46485a;
                oVar2.I = qVar3.f46486b;
                oVar2.f42599k = c0VarB;
                if (this.f41450r.c() != -2147483647) {
                    oVar2.f42596h = this.f41450r.c();
                }
                this.f41442i.b(new p(oVar2));
                this.f41447o = lVar.getPosition();
                j12 = 0;
                r10 = z12;
            } else {
                y2Var = y2Var5;
                qVar = qVar;
                z10 = true;
                th2 = null;
                j10 = 1000000;
                j11 = C.TIME_UNSET;
                j12 = 0;
                if (this.f41447o != 0) {
                    position = lVar.getPosition();
                    j13 = this.f41447o;
                    if (position < j13) {
                        r10 = z10;
                        r10 = z10;
                        lVar.skipFully((int) (j13 - position));
                        r10 = z10;
                    }
                }
            }
            r10 = z10;
            r10 = z10;
            r10 = z10;
            if (this.f41449q == 0) {
                lVar.resetPeekPosition();
                if (f(lVar)) {
                    i10 = -1;
                    i26 = -1;
                } else {
                    qVar.M(i26);
                    iM = qVar.m();
                    if (((-128000) & iM) == (((long) this.f41443j) & (-128000))) {
                    }
                    lVar.skipFully(r10);
                    this.f41443j = i26;
                    i10 = -1;
                }
            } else {
                iC = this.f41442i.c(lVar, this.f41449q, r10);
                if (iC == -1) {
                    i10 = -1;
                    i26 = -1;
                } else {
                    i11 = this.f41449q - iC;
                    this.f41449q = i11;
                    if (i11 <= 0) {
                        this.f41442i.a(this.f41445m + ((this.f41446n * j10) / ((long) y2Var.f22085d)), 1, y2Var.f22084c, 0, null);
                        this.f41446n += (long) y2Var.f22088g;
                        this.f41449q = i26;
                    }
                    i10 = -1;
                }
            }
        }
        if (i26 == i10) {
            h hVar2 = this.f41450r;
            if (hVar2 instanceof b) {
                if (hVar2.getDurationUs() != ((this.f41446n * j10) / ((long) y2Var.f22085d)) + this.f41445m) {
                    ((b) this.f41450r).getClass();
                    throw th2;
                }
            }
        }
        return i26;
    }

    @Override // n2.k
    public final void c(m mVar) {
        this.f41440g = mVar;
        a0 a0VarTrack = mVar.track(0, 1);
        this.f41441h = a0VarTrack;
        this.f41442i = a0VarTrack;
        this.f41440g.endTracks();
    }

    public final void e() {
        h hVar = this.f41450r;
        if ((hVar instanceof a) && ((a) hVar).isSeekable()) {
            long j10 = this.f41448p;
            if (j10 == -1 || j10 == this.f41450r.b()) {
                return;
            }
            a aVar = (a) this.f41450r;
            this.f41450r = new a(this.f41448p, aVar.f41427i, aVar.f41428j, aVar.f41429k, aVar.l, false);
            m mVar = this.f41440g;
            mVar.getClass();
            mVar.u(this.f41450r);
            a0 a0Var = this.f41441h;
            a0Var.getClass();
            a0Var.e(this.f41450r.getDurationUs());
        }
    }

    public final boolean f(l lVar) {
        h hVar = this.f41450r;
        if (hVar != null) {
            long jB = hVar.b();
            if (jB == -1 || lVar.getPeekPosition() <= jB - 4) {
            }
            return true;
        }
        try {
            return !lVar.peekFully(this.f41435b.f44813a, 0, 4, true);
        } catch (EOFException unused) {
        }
    }

    public final boolean g(l lVar, boolean z10) throws EOFException {
        int peekPosition;
        int i10;
        int iK;
        lVar.resetPeekPosition();
        if (lVar.getPosition() == 0) {
            c0 c0VarA = this.f41438e.A(lVar, null, 131072);
            this.f41444k = c0VarA;
            if (c0VarA != null) {
                this.f41437d.b(c0VarA);
            }
            peekPosition = (int) lVar.getPeekPosition();
            if (!z10) {
                lVar.skipFully(peekPosition);
            }
            i10 = 0;
        } else {
            peekPosition = 0;
            i10 = 0;
        }
        int i11 = i10;
        int i12 = i11;
        while (true) {
            if (f(lVar)) {
                if (i11 > 0) {
                    break;
                }
                e();
                throw new EOFException();
            }
            q qVar = this.f41435b;
            qVar.M(0);
            int iM = qVar.m();
            if ((i10 == 0 || ((-128000) & iM) == (((long) i10) & (-128000))) && (iK = n2.b.k(iM)) != -1) {
                i11++;
                if (i11 != 1) {
                    if (i11 == 4) {
                        break;
                    }
                } else {
                    this.f41436c.a(iM);
                    i10 = iM;
                }
                lVar.advancePeekPosition(iK - 4);
            } else {
                int i13 = i12 + 1;
                if (i12 == 131072) {
                    if (z10) {
                        return false;
                    }
                    e();
                    throw new EOFException();
                }
                if (z10) {
                    lVar.resetPeekPosition();
                    lVar.advancePeekPosition(peekPosition + i13);
                } else {
                    lVar.skipFully(1);
                }
                i11 = 0;
                i12 = i13;
                i10 = 0;
            }
        }
        if (z10) {
            lVar.skipFully(peekPosition + i12);
        } else {
            lVar.resetPeekPosition();
        }
        this.f41443j = i10;
        return true;
    }

    @Override // n2.k
    public final void seek(long j10, long j11) {
        this.f41443j = 0;
        this.f41445m = C.TIME_UNSET;
        this.f41446n = 0L;
        this.f41449q = 0;
        this.f41448p = -1L;
        this.f41453u = j11;
        if (this.f41450r instanceof b) {
            throw null;
        }
    }

    public d(long j10) {
        this.f41434a = j10;
        this.f41435b = new q(10);
        this.f41436c = new y2();
        this.f41437d = new n2.q();
        this.f41445m = C.TIME_UNSET;
        this.f41438e = new am.e(20);
        n2.j jVar = new n2.j();
        this.f41439f = jVar;
        this.f41442i = jVar;
        this.f41448p = -1L;
    }

    @Override // n2.k
    public final void release() {
    }
}
