package h3;

import androidx.core.app.NotificationCompat;
import bc.s;
import com.google.android.gms.internal.ads.i3;
import com.google.android.gms.internal.ads.q2;
import com.google.android.gms.internal.ads.y2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import i1.b0;
import i1.c0;
import i1.d0;
import i1.e0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import n2.a0;
import n2.x;
import oa.f0;
import oa.j0;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements n2.k {
    public long A;
    public n2.m B;
    public j[] C;
    public long[][] D;
    public int E;
    public w2.b F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3.k f42147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f42149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l1.q f42150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l1.q f42151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l1.q f42152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l1.q f42153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayDeque f42154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n f42155i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f42156j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public n1 f42157k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f42158m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f42159n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f42160o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l1.q f42161p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f42162q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f42163r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f42164s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f42165t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f42166u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f42167v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f42168w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f42169x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f42170y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f42171z;

    public k(k3.k kVar, int i10) {
        this.f42147a = kVar;
        this.f42148b = i10;
        this.f42149c = (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        f0 f0Var = j0.f47265b;
        this.f42157k = n1.f47281e;
        this.l = (i10 & 4) != 0 ? 3 : 0;
        this.f42155i = new n();
        this.f42156j = new ArrayList();
        this.f42153g = new l1.q(16);
        this.f42154h = new ArrayDeque();
        this.f42150d = new l1.q(m1.n.f45820a);
        this.f42151e = new l1.q(6);
        this.f42152f = new l1.q();
        this.f42162q = -1;
        this.B = n2.m.f46479t9;
        this.C = new j[0];
    }

    @Override // n2.k
    public final boolean a(n2.l lVar) {
        n1 n1VarB;
        x xVarL = o.l(lVar, false, (this.f42148b & 2) != 0);
        if (xVarL != null) {
            n1VarB = j0.B(xVarL);
        } else {
            f0 f0Var = j0.f47265b;
            n1VarB = n1.f47281e;
        }
        this.f42157k = n1VarB;
        return xVarL == null;
    }

    /* JADX WARN: Code duplicated, block: B:273:0x056a  */
    /* JADX WARN: Code duplicated, block: B:278:0x057e  */
    /* JADX WARN: Code duplicated, block: B:299:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:300:0x0604  */
    /* JADX WARN: Code duplicated, block: B:302:0x060a  */
    /* JADX WARN: Code duplicated, block: B:309:0x0620  */
    /* JADX WARN: Code duplicated, block: B:312:0x0634  */
    /* JADX WARN: Code duplicated, block: B:334:0x0673  */
    /* JADX WARN: Code duplicated, block: B:386:0x073e  */
    /* JADX WARN: Code duplicated, block: B:391:0x076b  */
    /* JADX WARN: Code duplicated, block: B:392:0x076f  */
    /* JADX WARN: Code duplicated, block: B:402:0x0581 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:409:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:417:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x0166 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:69:0x010a  */
    /* JADX WARN: Code duplicated, block: B:71:0x011e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // n2.k
    public final int b(n2.l lVar, q2 q2Var) throws e0 {
        char c4;
        int i10;
        int i11;
        int i12;
        byte b10;
        char c5;
        int i13;
        ArrayList arrayList;
        List listD;
        int i14;
        List listD2;
        boolean z10;
        boolean z11;
        long j10;
        long length;
        m1.c cVar;
        long j11;
        long j12;
        int i15;
        boolean z12;
        long j13;
        long j14;
        long j15;
        boolean z13;
        if (!this.f42149c || !this.f42171z) {
            while (true) {
                int i16 = this.l;
                ArrayDeque arrayDeque = this.f42154h;
                int i17 = this.f42148b;
                l1.q qVar = this.f42152f;
                int i18 = 4;
                int i19 = 2;
                if (i16 == 0) {
                    int i20 = this.f42160o;
                    l1.q qVar2 = this.f42153g;
                    if (i20 != 0) {
                        j10 = this.f42159n;
                        if (j10 == 1) {
                            lVar.readFully(qVar2.f44813a, 8, 8);
                            this.f42160o += 8;
                            this.f42159n = qVar2.F();
                        } else if (j10 == 0) {
                            length = lVar.getLength();
                            if (length == -1 && (cVar = (m1.c) arrayDeque.peek()) != null) {
                                length = cVar.f45773c;
                            }
                            if (length != -1) {
                                this.f42159n = (length - lVar.getPosition()) + ((long) this.f42160o);
                            }
                        }
                        j11 = this.f42159n;
                        int i21 = this.f42160o;
                        j12 = i21;
                        if (j11 < j12) {
                            if (this.f42158m == 1718773093 || i21 != 8) {
                                throw e0.c("Atom size less than header length (unsupported).");
                            }
                            this.f42159n = j12;
                        }
                        i15 = this.f42158m;
                        if (i15 != 1836019574 || i15 == 1953653099 || i15 == 1835297121 || i15 == 1835626086 || i15 == 1937007212 || i15 == 1701082227 || i15 == 1835365473 || i15 == 1635284069) {
                            z12 = true;
                            long position = lVar.getPosition();
                            j13 = this.f42159n;
                            j14 = this.f42160o;
                            j15 = (position + j13) - j14;
                            if (j13 != j14 && this.f42158m == 1835365473) {
                                qVar.J(8);
                                lVar.peekFully(qVar.f44813a, 0, 8);
                                b.a(qVar);
                                lVar.skipFully(qVar.f44814b);
                                lVar.resetPeekPosition();
                            }
                            arrayDeque.push(new m1.c(this.f42158m, j15));
                            if (this.f42159n == this.f42160o) {
                                e(j15);
                            } else {
                                this.l = 0;
                                this.f42160o = 0;
                            }
                        } else if (i15 == 1835296868 || i15 == 1836476516 || i15 == 1751411826 || i15 == 1937011556 || i15 == 1937011827 || i15 == 1937011571 || i15 == 1668576371 || i15 == 1701606260 || i15 == 1937011555 || i15 == 1937011578 || i15 == 1937013298 || i15 == 1937007471 || i15 == 1668232756 || i15 == 1953196132 || i15 == 1718909296 || i15 == 1969517665 || i15 == 1801812339 || i15 == 1768715124) {
                            go.k.t(i21 == 8);
                            go.k.t(this.f42159n <= 2147483647L);
                            l1.q qVar3 = new l1.q((int) this.f42159n);
                            System.arraycopy(qVar2.f44813a, 0, qVar3.f44813a, 0, 8);
                            this.f42161p = qVar3;
                            z12 = true;
                            this.l = 1;
                        } else {
                            long position2 = lVar.getPosition();
                            long j16 = this.f42160o;
                            long j17 = position2 - j16;
                            if (this.f42158m == 1836086884) {
                                this.F = new w2.b(0L, j17, C.TIME_UNSET, j17 + j16, this.f42159n - j16);
                            }
                            this.f42161p = null;
                            this.l = 1;
                            z12 = true;
                        }
                        z13 = z12;
                    } else if (lVar.readFully(qVar2.f44813a, 0, 8, true)) {
                        this.f42160o = 8;
                        qVar2.M(0);
                        this.f42159n = qVar2.B();
                        this.f42158m = qVar2.m();
                        j10 = this.f42159n;
                        if (j10 == 1) {
                            lVar.readFully(qVar2.f44813a, 8, 8);
                            this.f42160o += 8;
                            this.f42159n = qVar2.F();
                        } else if (j10 == 0) {
                            length = lVar.getLength();
                            if (length == -1) {
                                length = cVar.f45773c;
                            }
                            if (length != -1) {
                                this.f42159n = (length - lVar.getPosition()) + ((long) this.f42160o);
                            }
                        }
                        j11 = this.f42159n;
                        int i22 = this.f42160o;
                        j12 = i22;
                        if (j11 < j12) {
                            if (this.f42158m == 1718773093) {
                            }
                            throw e0.c("Atom size less than header length (unsupported).");
                        }
                        i15 = this.f42158m;
                        if (i15 != 1836019574) {
                            z12 = true;
                            long position3 = lVar.getPosition();
                            j13 = this.f42159n;
                            j14 = this.f42160o;
                            j15 = (position3 + j13) - j14;
                            if (j13 != j14) {
                                qVar.J(8);
                                lVar.peekFully(qVar.f44813a, 0, 8);
                                b.a(qVar);
                                lVar.skipFully(qVar.f44814b);
                                lVar.resetPeekPosition();
                            }
                            arrayDeque.push(new m1.c(this.f42158m, j15));
                            if (this.f42159n == this.f42160o) {
                                e(j15);
                            } else {
                                this.l = 0;
                                this.f42160o = 0;
                            }
                        } else {
                            z12 = true;
                            long position4 = lVar.getPosition();
                            j13 = this.f42159n;
                            j14 = this.f42160o;
                            j15 = (position4 + j13) - j14;
                            if (j13 != j14) {
                                qVar.J(8);
                                lVar.peekFully(qVar.f44813a, 0, 8);
                                b.a(qVar);
                                lVar.skipFully(qVar.f44814b);
                                lVar.resetPeekPosition();
                            }
                            arrayDeque.push(new m1.c(this.f42158m, j15));
                            if (this.f42159n == this.f42160o) {
                                e(j15);
                            } else {
                                this.l = 0;
                                this.f42160o = 0;
                            }
                        }
                        z13 = z12;
                    } else {
                        if (this.E == 2 && (i17 & 2) != 0) {
                            a0 a0VarTrack = this.B.track(0, 4);
                            w2.b bVar = this.F;
                            c0 c0Var = bVar == null ? null : new c0(bVar);
                            i1.o oVar = new i1.o();
                            oVar.f42599k = c0Var;
                            q4.a.o(oVar, a0VarTrack);
                            this.B.endTracks();
                            this.B.u(new n2.o(C.TIME_UNSET));
                        }
                        z13 = false;
                    }
                    if (!z13) {
                    }
                } else {
                    if (i16 != 1) {
                        if (i16 == 2) {
                            long position5 = lVar.getPosition();
                            if (this.f42162q == -1) {
                                int i23 = 0;
                                int i24 = -1;
                                int i25 = -1;
                                boolean z14 = true;
                                boolean z15 = true;
                                long j18 = Long.MAX_VALUE;
                                long j19 = Long.MAX_VALUE;
                                long j20 = Long.MAX_VALUE;
                                while (true) {
                                    j[] jVarArr = this.C;
                                    if (i23 >= jVarArr.length) {
                                        break;
                                    }
                                    j jVar = jVarArr[i23];
                                    int i26 = jVar.f42145e;
                                    r rVar = jVar.f42142b;
                                    if (i26 != rVar.f42198b) {
                                        long j21 = rVar.f42199c[i26];
                                        long[][] jArr = this.D;
                                        jArr.getClass();
                                        long j22 = jArr[i23][i26];
                                        long j23 = j21 - position5;
                                        boolean z16 = j23 < 0 || j23 >= 262144;
                                        if ((!z16 && z15) || (z16 == z15 && j23 < j20)) {
                                            j19 = j22;
                                            i25 = i23;
                                            z15 = z16;
                                            j20 = j23;
                                        }
                                        if (j22 < j18) {
                                            j18 = j22;
                                            i24 = i23;
                                            z14 = z16;
                                        }
                                    }
                                    i23++;
                                }
                                if (j18 == Long.MAX_VALUE || !z14 || j19 < j18 + 10485760) {
                                    i24 = i25;
                                }
                                this.f42162q = i24;
                                if (i24 == -1) {
                                    return -1;
                                }
                            }
                            j jVar2 = this.C[this.f42162q];
                            a0 a0Var = jVar2.f42143c;
                            r rVar2 = jVar2.f42142b;
                            p pVar = jVar2.f42141a;
                            int i27 = jVar2.f42145e;
                            long[] jArr2 = rVar2.f42199c;
                            int[] iArr = rVar2.f42200d;
                            long j24 = jArr2[i27] + this.A;
                            int i28 = iArr[i27];
                            i3 i3Var = jVar2.f42144d;
                            long j25 = (j24 - position5) + ((long) this.f42163r);
                            if (j25 < 0 || j25 >= 262144) {
                                q2Var.f18888a = j24;
                                return 1;
                            }
                            int i29 = pVar.f42188h;
                            int i30 = pVar.f42191k;
                            i1.p pVar2 = pVar.f42187g;
                            if (i29 == 1) {
                                j25 += 8;
                                i28 -= 8;
                            }
                            lVar.skipFully((int) j25);
                            String str = pVar2.f42643n;
                            String str2 = pVar2.f42643n;
                            if (!Objects.equals(str, "video/avc") ? !Objects.equals(str2, "video/hevc") || (i17 & 128) == 0 : (i17 & 32) == 0) {
                                c4 = 1;
                                this.f42166u = true;
                            } else {
                                c4 = 1;
                            }
                            if (i30 == 0) {
                                if ("audio/ac4".equals(str2)) {
                                    if (this.f42164s == 0) {
                                        n2.b.i(i28, qVar);
                                        a0Var.g(7, qVar);
                                        this.f42164s += 7;
                                    }
                                    i28 += 7;
                                } else if (jVar2.f42146f != null && Objects.equals(str2, MimeTypes.AUDIO_MPEG)) {
                                    i1.p pVar3 = jVar2.f42146f;
                                    qVar.J(4);
                                    lVar.peekFully(qVar.f44813a, 0, 4);
                                    lVar.resetPeekPosition();
                                    y2 y2Var = new y2();
                                    a0 a0Var2 = jVar2.f42143c;
                                    if (y2Var.a(qVar.m()) && !Objects.equals(pVar3.f42643n, y2Var.f22083b)) {
                                        i1.o oVarA = pVar3.a();
                                        String str3 = y2Var.f22083b;
                                        str3.getClass();
                                        oVarA.f42600m = d0.n(str3);
                                        pVar3 = new i1.p(oVarA);
                                    }
                                    a0Var2.b(pVar3);
                                    jVar2.f42146f = null;
                                } else if (i3Var != null) {
                                    i3Var.c(lVar);
                                }
                                while (true) {
                                    int i31 = this.f42164s;
                                    if (i31 >= i28) {
                                        break;
                                    }
                                    int iC = a0Var.c(lVar, i28 - i31, false);
                                    this.f42163r += iC;
                                    this.f42164s += iC;
                                    this.f42165t -= iC;
                                }
                            } else {
                                l1.q qVar4 = this.f42151e;
                                byte[] bArr = qVar4.f44813a;
                                bArr[0] = 0;
                                bArr[c4] = 0;
                                bArr[2] = 0;
                                int i32 = 4 - i30;
                                i28 += i32;
                                while (this.f42164s < i28) {
                                    int i33 = this.f42165t;
                                    if (i33 == 0) {
                                        if (this.f42166u || m1.n.e(pVar2) + i30 > iArr[i27] - this.f42163r) {
                                            i10 = i30;
                                            i11 = 0;
                                        } else {
                                            int iE = m1.n.e(pVar2);
                                            i10 = i30 + iE;
                                            i11 = iE;
                                        }
                                        lVar.readFully(bArr, i32, i10);
                                        this.f42163r += i10;
                                        qVar4.M(0);
                                        int iM = qVar4.m();
                                        if (iM < 0) {
                                            throw e0.a(null, "Invalid NAL length");
                                        }
                                        this.f42165t = iM - i11;
                                        l1.q qVar5 = this.f42150d;
                                        qVar5.M(0);
                                        a0Var.g(4, qVar5);
                                        this.f42164s += 4;
                                        if (i11 > 0) {
                                            a0Var.g(i11, qVar4);
                                            this.f42164s += i11;
                                            if (m1.n.d(bArr, i11, pVar2)) {
                                                this.f42166u = true;
                                            }
                                        }
                                    } else {
                                        int iC2 = a0Var.c(lVar, i33, false);
                                        this.f42163r += iC2;
                                        this.f42164s += iC2;
                                        this.f42165t -= iC2;
                                    }
                                }
                            }
                            int i34 = i28;
                            long j26 = rVar2.f42202f[i27];
                            int i35 = rVar2.f42203g[i27];
                            if (!this.f42166u) {
                                i35 |= 67108864;
                            }
                            int i36 = i35;
                            if (i3Var != null) {
                                i3Var.b(a0Var, j26, i36, i34, 0, null);
                                if (i27 + 1 == rVar2.f42198b) {
                                    i3Var.a(a0Var, null);
                                }
                            } else {
                                a0Var.a(j26, i36, i34, 0, null);
                            }
                            jVar2.f42145e++;
                            this.f42162q = -1;
                            this.f42163r = 0;
                            this.f42164s = 0;
                            this.f42165t = 0;
                            this.f42166u = false;
                            return 0;
                        }
                        if (i16 != 3) {
                            throw new IllegalStateException();
                        }
                        n nVar = this.f42155i;
                        ArrayList arrayList2 = nVar.f42177a;
                        int i37 = nVar.f42178b;
                        if (i37 != 0) {
                            if (i37 != 1) {
                                short s10 = 2817;
                                int i38 = 8;
                                short s11 = 2192;
                                if (i37 == 2) {
                                    long length2 = lVar.getLength();
                                    int i39 = nVar.f42179c - 20;
                                    l1.q qVar6 = new l1.q(i39);
                                    lVar.readFully(qVar6.f44813a, 0, i39);
                                    int i40 = 0;
                                    while (i40 < i39 / 12) {
                                        qVar6.N(i19);
                                        qVar6.f(i19);
                                        byte[] bArr2 = qVar6.f44813a;
                                        int i41 = qVar6.f44814b;
                                        int i42 = i19;
                                        int i43 = i41 + 1;
                                        qVar6.f44814b = i43;
                                        int i44 = bArr2[i41] & 255;
                                        qVar6.f44814b = i41 + 2;
                                        short s12 = (short) (i44 | ((bArr2[i43] & 255) << 8));
                                        if (s12 != s11 && s12 != 2816 && s12 != s10) {
                                            if (s12 != 2819 && s12 != 2820) {
                                                qVar6.N(i38);
                                            }
                                            i40++;
                                            i39 = i39;
                                            i19 = i42;
                                            s10 = 2817;
                                            s11 = 2192;
                                            i38 = 8;
                                        }
                                        arrayList2.add(new m((length2 - ((long) nVar.f42179c)) - ((long) qVar6.o()), qVar6.o()));
                                        i40++;
                                        i39 = i39;
                                        i19 = i42;
                                        s10 = 2817;
                                        s11 = 2192;
                                        i38 = 8;
                                    }
                                    if (arrayList2.isEmpty()) {
                                        q2Var.f18888a = 0L;
                                    } else {
                                        nVar.f42178b = 3;
                                        q2Var.f18888a = ((m) arrayList2.get(0)).f42173a;
                                    }
                                } else {
                                    if (i37 != 3) {
                                        throw new IllegalStateException();
                                    }
                                    long position6 = lVar.getPosition();
                                    int length3 = (int) ((lVar.getLength() - lVar.getPosition()) - ((long) nVar.f42179c));
                                    l1.q qVar7 = new l1.q(length3);
                                    lVar.readFully(qVar7.f44813a, 0, length3);
                                    int i45 = 0;
                                    while (i45 < arrayList2.size()) {
                                        m mVar = (m) arrayList2.get(i45);
                                        qVar7.M((int) (mVar.f42173a - position6));
                                        qVar7.N(i18);
                                        int iO = qVar7.o();
                                        Charset charset = StandardCharsets.UTF_8;
                                        String strX = qVar7.x(iO, charset);
                                        switch (strX.hashCode()) {
                                            case -1711564334:
                                                if (strX.equals("SlowMotion_Data")) {
                                                    b10 = 0;
                                                }
                                                switch (b10) {
                                                    case 0:
                                                        c5 = 2192;
                                                        break;
                                                    case 1:
                                                        c5 = 2819;
                                                        break;
                                                    case 2:
                                                        c5 = 2816;
                                                        break;
                                                    case 3:
                                                        c5 = 2820;
                                                        break;
                                                    case 4:
                                                        c5 = 2817;
                                                        break;
                                                    default:
                                                        throw e0.a(null, "Invalid SEF name");
                                                }
                                                i13 = mVar.f42174b - (iO + 8);
                                                if (c5 != 2192) {
                                                    arrayList = new ArrayList();
                                                    listD = n.f42176e.d(qVar7.x(i13, charset));
                                                    for (i14 = 0; i14 < listD.size(); i14++) {
                                                        listD2 = n.f42175d.d((CharSequence) listD.get(i14));
                                                        if (listD2.size() == 3) {
                                                            throw e0.a(null, null);
                                                        }
                                                        try {
                                                            arrayList.add(new c3.a(Long.parseLong((String) listD2.get(0)), Long.parseLong((String) listD2.get(1)), 1 << (Integer.parseInt((String) listD2.get(2)) - 1)));
                                                        } catch (NumberFormatException e10) {
                                                            throw e0.a(e10, null);
                                                        }
                                                    }
                                                    this.f42156j.add(new c3.b(arrayList));
                                                } else if (c5 != 2816 && c5 != 2817 && c5 != 2819 && c5 != 2820) {
                                                    throw new IllegalStateException();
                                                }
                                                i45++;
                                                i18 = 4;
                                                break;
                                            case -1332107749:
                                                if (strX.equals("Super_SlowMotion_Edit_Data")) {
                                                    b10 = 1;
                                                }
                                                switch (b10) {
                                                    case 0:
                                                        c5 = 2192;
                                                        break;
                                                    case 1:
                                                        c5 = 2819;
                                                        break;
                                                    case 2:
                                                        c5 = 2816;
                                                        break;
                                                    case 3:
                                                        c5 = 2820;
                                                        break;
                                                    case 4:
                                                        c5 = 2817;
                                                        break;
                                                    default:
                                                        throw e0.a(null, "Invalid SEF name");
                                                }
                                                i13 = mVar.f42174b - (iO + 8);
                                                if (c5 != 2192) {
                                                    arrayList = new ArrayList();
                                                    listD = n.f42176e.d(qVar7.x(i13, charset));
                                                    while (i14 < listD.size()) {
                                                        listD2 = n.f42175d.d((CharSequence) listD.get(i14));
                                                        if (listD2.size() == 3) {
                                                            throw e0.a(null, null);
                                                        }
                                                        arrayList.add(new c3.a(Long.parseLong((String) listD2.get(0)), Long.parseLong((String) listD2.get(1)), 1 << (Integer.parseInt((String) listD2.get(2)) - 1)));
                                                    }
                                                    this.f42156j.add(new c3.b(arrayList));
                                                } else if (c5 != 2816) {
                                                    continue;
                                                }
                                                i45++;
                                                i18 = 4;
                                                break;
                                            case -1251387154:
                                                if (strX.equals("Super_SlowMotion_Data")) {
                                                    b10 = 2;
                                                }
                                                switch (b10) {
                                                    case 0:
                                                        c5 = 2192;
                                                        break;
                                                    case 1:
                                                        c5 = 2819;
                                                        break;
                                                    case 2:
                                                        c5 = 2816;
                                                        break;
                                                    case 3:
                                                        c5 = 2820;
                                                        break;
                                                    case 4:
                                                        c5 = 2817;
                                                        break;
                                                    default:
                                                        throw e0.a(null, "Invalid SEF name");
                                                }
                                                i13 = mVar.f42174b - (iO + 8);
                                                if (c5 != 2192) {
                                                    arrayList = new ArrayList();
                                                    listD = n.f42176e.d(qVar7.x(i13, charset));
                                                    while (i14 < listD.size()) {
                                                        listD2 = n.f42175d.d((CharSequence) listD.get(i14));
                                                        if (listD2.size() == 3) {
                                                            throw e0.a(null, null);
                                                        }
                                                        arrayList.add(new c3.a(Long.parseLong((String) listD2.get(0)), Long.parseLong((String) listD2.get(1)), 1 << (Integer.parseInt((String) listD2.get(2)) - 1)));
                                                    }
                                                    this.f42156j.add(new c3.b(arrayList));
                                                } else if (c5 != 2816) {
                                                    continue;
                                                }
                                                i45++;
                                                i18 = 4;
                                                break;
                                            case -830665521:
                                                if (strX.equals("Super_SlowMotion_Deflickering_On")) {
                                                    b10 = 3;
                                                }
                                                switch (b10) {
                                                    case 0:
                                                        c5 = 2192;
                                                        break;
                                                    case 1:
                                                        c5 = 2819;
                                                        break;
                                                    case 2:
                                                        c5 = 2816;
                                                        break;
                                                    case 3:
                                                        c5 = 2820;
                                                        break;
                                                    case 4:
                                                        c5 = 2817;
                                                        break;
                                                    default:
                                                        throw e0.a(null, "Invalid SEF name");
                                                }
                                                i13 = mVar.f42174b - (iO + 8);
                                                if (c5 != 2192) {
                                                    arrayList = new ArrayList();
                                                    listD = n.f42176e.d(qVar7.x(i13, charset));
                                                    while (i14 < listD.size()) {
                                                        listD2 = n.f42175d.d((CharSequence) listD.get(i14));
                                                        if (listD2.size() == 3) {
                                                            throw e0.a(null, null);
                                                        }
                                                        arrayList.add(new c3.a(Long.parseLong((String) listD2.get(0)), Long.parseLong((String) listD2.get(1)), 1 << (Integer.parseInt((String) listD2.get(2)) - 1)));
                                                    }
                                                    this.f42156j.add(new c3.b(arrayList));
                                                } else if (c5 != 2816) {
                                                    continue;
                                                }
                                                i45++;
                                                i18 = 4;
                                                break;
                                            case 1760745220:
                                                if (strX.equals("Super_SlowMotion_BGM")) {
                                                    b10 = 4;
                                                }
                                                switch (b10) {
                                                    case 0:
                                                        c5 = 2192;
                                                        break;
                                                    case 1:
                                                        c5 = 2819;
                                                        break;
                                                    case 2:
                                                        c5 = 2816;
                                                        break;
                                                    case 3:
                                                        c5 = 2820;
                                                        break;
                                                    case 4:
                                                        c5 = 2817;
                                                        break;
                                                    default:
                                                        throw e0.a(null, "Invalid SEF name");
                                                }
                                                i13 = mVar.f42174b - (iO + 8);
                                                if (c5 != 2192) {
                                                    arrayList = new ArrayList();
                                                    listD = n.f42176e.d(qVar7.x(i13, charset));
                                                    while (i14 < listD.size()) {
                                                        listD2 = n.f42175d.d((CharSequence) listD.get(i14));
                                                        if (listD2.size() == 3) {
                                                            throw e0.a(null, null);
                                                        }
                                                        arrayList.add(new c3.a(Long.parseLong((String) listD2.get(0)), Long.parseLong((String) listD2.get(1)), 1 << (Integer.parseInt((String) listD2.get(2)) - 1)));
                                                    }
                                                    this.f42156j.add(new c3.b(arrayList));
                                                } else if (c5 != 2816) {
                                                    continue;
                                                }
                                                i45++;
                                                i18 = 4;
                                                break;
                                        }
                                        b10 = -1;
                                        switch (b10) {
                                            case 0:
                                                c5 = 2192;
                                                break;
                                            case 1:
                                                c5 = 2819;
                                                break;
                                            case 2:
                                                c5 = 2816;
                                                break;
                                            case 3:
                                                c5 = 2820;
                                                break;
                                            case 4:
                                                c5 = 2817;
                                                break;
                                            default:
                                                throw e0.a(null, "Invalid SEF name");
                                        }
                                        i13 = mVar.f42174b - (iO + 8);
                                        if (c5 != 2192) {
                                            arrayList = new ArrayList();
                                            listD = n.f42176e.d(qVar7.x(i13, charset));
                                            while (i14 < listD.size()) {
                                                listD2 = n.f42175d.d((CharSequence) listD.get(i14));
                                                if (listD2.size() == 3) {
                                                    throw e0.a(null, null);
                                                }
                                                arrayList.add(new c3.a(Long.parseLong((String) listD2.get(0)), Long.parseLong((String) listD2.get(1)), 1 << (Integer.parseInt((String) listD2.get(2)) - 1)));
                                            }
                                            this.f42156j.add(new c3.b(arrayList));
                                        } else if (c5 != 2816) {
                                            continue;
                                        }
                                        i45++;
                                        i18 = 4;
                                    }
                                    q2Var.f18888a = 0L;
                                }
                            } else {
                                l1.q qVar8 = new l1.q(8);
                                lVar.readFully(qVar8.f44813a, 0, 8);
                                nVar.f42179c = qVar8.o() + 8;
                                if (qVar8.m() != 1397048916) {
                                    q2Var.f18888a = 0L;
                                } else {
                                    q2Var.f18888a = lVar.getPosition() - ((long) (nVar.f42179c - 12));
                                    nVar.f42178b = 2;
                                }
                            }
                            i12 = 1;
                        } else {
                            long length4 = lVar.getLength();
                            q2Var.f18888a = (length4 == -1 || length4 < 8) ? 0L : length4 - 8;
                            i12 = 1;
                            nVar.f42178b = 1;
                        }
                        if (q2Var.f18888a != 0) {
                            return i12;
                        }
                        this.l = 0;
                        this.f42160o = 0;
                        return i12;
                    }
                    long j27 = this.f42159n - ((long) this.f42160o);
                    long position7 = lVar.getPosition() + j27;
                    l1.q qVar9 = this.f42161p;
                    if (qVar9 != null) {
                        lVar.readFully(qVar9.f44813a, this.f42160o, (int) j27);
                        if (this.f42158m == 1718909296) {
                            this.f42167v = true;
                            qVar9.M(8);
                            int iM2 = qVar9.m();
                            int i46 = iM2 != 1751476579 ? iM2 != 1903435808 ? 0 : 1 : 2;
                            if (i46 == 0) {
                                qVar9.N(4);
                                do {
                                    if (qVar9.a() <= 0) {
                                        i46 = 0;
                                        break;
                                    }
                                    int iM3 = qVar9.m();
                                    i46 = iM3 != 1751476579 ? iM3 != 1903435808 ? 0 : 1 : 2;
                                } while (i46 == 0);
                            }
                            this.E = i46;
                        } else if (!arrayDeque.isEmpty()) {
                            ((m1.c) arrayDeque.peek()).f45774d.add(new m1.d(this.f42158m, qVar9));
                        }
                    } else {
                        if (!this.f42167v && this.f42158m == 1835295092) {
                            this.E = 1;
                        }
                        if (j27 < 262144) {
                            lVar.skipFully((int) j27);
                        } else {
                            q2Var.f18888a = lVar.getPosition() + j27;
                            z10 = true;
                        }
                        e(position7);
                        if (this.f42168w) {
                            this.f42170y = true;
                            q2Var.f18888a = this.f42169x;
                            this.f42168w = false;
                            z10 = true;
                        }
                        if (z10 || this.l == 2) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            return 1;
                        }
                    }
                    z10 = false;
                    e(position7);
                    if (this.f42168w) {
                        this.f42170y = true;
                        q2Var.f18888a = this.f42169x;
                        this.f42168w = false;
                        z10 = true;
                    }
                    if (z10) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        return 1;
                    }
                }
            }
        }
        return -1;
    }

    @Override // n2.k
    public final void c(n2.m mVar) {
        if ((this.f42148b & 16) == 0) {
            mVar = new s(mVar, this.f42147a);
        }
        this.B = mVar;
    }

    @Override // n2.k
    public final List d() {
        return this.f42157k;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x030b  */
    /* JADX WARN: Code duplicated, block: B:163:0x031b  */
    /* JADX WARN: Code duplicated, block: B:172:0x0336  */
    /* JADX WARN: Code duplicated, block: B:174:0x033c  */
    /* JADX WARN: Code duplicated, block: B:177:0x0359  */
    /* JADX WARN: Code duplicated, block: B:179:0x0362  */
    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:263:0x0134 A[EDGE_INSN: B:263:0x0134->B:74:0x0134 BREAK  A[LOOP:9: B:62:0x0102->B:72:0x012c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:72:0x012c A[LOOP:9: B:62:0x0102->B:72:0x012c, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void e(long j10) {
        int i10;
        ArrayList arrayList;
        c0 c0VarF;
        boolean z10;
        ArrayDeque arrayDeque;
        boolean z11;
        c0 c0VarK;
        long[][] jArr;
        int i11;
        String str;
        int i12;
        c0 c0Var;
        long j11;
        int i13;
        int i14;
        int i15;
        c0 c0Var2;
        ArrayList arrayList2;
        c0 c0Var3;
        c0 c0Var4;
        c0 c0Var5;
        c0 c0Var6;
        int i16;
        int i17;
        int i18;
        b0 b0Var;
        b0 b0Var2;
        b0 b0Var3;
        int i19;
        while (true) {
            ArrayDeque arrayDeque2 = this.f42154h;
            int i20 = 0;
            if (arrayDeque2.isEmpty() || ((m1.c) arrayDeque2.peek()).f45773c != j10) {
                break;
            }
            m1.c cVar = (m1.c) arrayDeque2.pop();
            if (cVar.f22444b == 1836019574) {
                m1.c cVarG = cVar.g(1835365473);
                ArrayList arrayList3 = new ArrayList();
                boolean z12 = this.f42149c;
                long j12 = 0;
                int i21 = this.f42148b;
                if (cVarG != null) {
                    c0VarF = b.f(cVarG);
                    if (this.f42170y) {
                        c0VarF.getClass();
                        b0[] b0VarArr = c0VarF.f42527a;
                        int length = b0VarArr.length;
                        int i22 = 0;
                        while (true) {
                            if (i22 >= length) {
                                b0Var2 = null;
                                break;
                            }
                            b0 b0Var4 = b0VarArr[i22];
                            if (m1.a.class.isAssignableFrom(b0Var4.getClass())) {
                                b0Var2 = (b0) m1.a.class.cast(b0Var4);
                                if (!((m1.a) b0Var2).f45768a.equals("auxiliary.tracks.interleaved")) {
                                    b0Var2 = null;
                                }
                            } else {
                                b0Var2 = null;
                            }
                            if (b0Var2 != null) {
                                break;
                            } else {
                                i22++;
                            }
                        }
                        m1.a aVar = (m1.a) b0Var2;
                        if (aVar != null && aVar.f45769b[0] == 0) {
                            this.A = this.f42169x + 16;
                        }
                        int length2 = b0VarArr.length;
                        int i23 = 0;
                        while (true) {
                            if (i23 >= length2) {
                                b0Var3 = null;
                                break;
                            }
                            b0 b0Var5 = b0VarArr[i23];
                            if (m1.a.class.isAssignableFrom(b0Var5.getClass())) {
                                b0Var3 = (b0) m1.a.class.cast(b0Var5);
                                if (!((m1.a) b0Var3).f45768a.equals("auxiliary.tracks.map")) {
                                    b0Var3 = null;
                                }
                            } else {
                                b0Var3 = null;
                            }
                            if (b0Var3 != null) {
                                break;
                            } else {
                                i23++;
                            }
                        }
                        m1.a aVar2 = (m1.a) b0Var3;
                        aVar2.getClass();
                        ArrayList arrayListD = aVar2.d();
                        ArrayList arrayList4 = new ArrayList(arrayListD.size());
                        for (int i24 = 0; i24 < arrayListD.size(); i24++) {
                            int iIntValue = ((Integer) arrayListD.get(i24)).intValue();
                            if (iIntValue == 0) {
                                i19 = 1;
                            } else if (iIntValue != 1) {
                                i19 = 3;
                                if (iIntValue != 2) {
                                    i19 = iIntValue != 3 ? 0 : 4;
                                }
                            } else {
                                i19 = 2;
                            }
                            arrayList4.add(Integer.valueOf(i19));
                        }
                        i10 = 0;
                        arrayList = arrayList4;
                    } else {
                        if (c0VarF == null || (i21 & 64) == 0) {
                            i10 = 0;
                        } else {
                            b0[] b0VarArr2 = c0VarF.f42527a;
                            int length3 = b0VarArr2.length;
                            int i25 = 0;
                            while (true) {
                                if (i25 >= length3) {
                                    i10 = i20;
                                    b0Var = null;
                                    break;
                                }
                                b0 b0Var6 = b0VarArr2[i25];
                                if (m1.a.class.isAssignableFrom(b0Var6.getClass())) {
                                    b0Var = (b0) m1.a.class.cast(b0Var6);
                                    i10 = i20;
                                    if (!((m1.a) b0Var).f45768a.equals("auxiliary.tracks.offset")) {
                                    }
                                    if (b0Var != null) {
                                        break;
                                    }
                                    i25++;
                                    i20 = i10;
                                } else {
                                    i10 = i20;
                                }
                                b0Var = null;
                                if (b0Var != null) {
                                    break;
                                    break;
                                } else {
                                    i25++;
                                    i20 = i10;
                                }
                            }
                            m1.a aVar3 = (m1.a) b0Var;
                            if (aVar3 != null) {
                                long jF = new l1.q(aVar3.f45769b).F();
                                if (jF > 0) {
                                    this.f42169x = jF;
                                    this.f42168w = true;
                                    arrayDeque = arrayDeque2;
                                    z11 = true;
                                    z10 = z12;
                                }
                                arrayDeque.clear();
                                this.f42171z = z11;
                                if (this.f42168w && !z10) {
                                    this.l = 2;
                                }
                            }
                        }
                        arrayList = arrayList3;
                    }
                } else {
                    i10 = 0;
                    arrayList = arrayList3;
                    c0VarF = null;
                }
                ArrayList arrayList5 = new ArrayList();
                boolean z13 = this.E == 1 ? 1 : i10;
                n2.q qVar = new n2.q();
                m1.d dVarH = cVar.h(1969517665);
                if (dVarH != null) {
                    c0VarK = b.k(dVarH);
                    qVar.b(c0VarK);
                } else {
                    c0VarK = null;
                }
                m1.d dVarH2 = cVar.h(1836476516);
                dVarH2.getClass();
                b0[] b0VarArr3 = new b0[1];
                b0VarArr3[i10] = b.g(dVarH2.f45776c);
                c0 c0Var7 = new c0(b0VarArr3);
                c0 c0Var8 = c0VarK;
                ArrayList arrayListJ = b.j(cVar, qVar, C.TIME_UNSET, null, (i21 & 1) != 0 ? 1 : i10, z13, new d2.c(6), this.f42149c);
                if (this.f42170y) {
                    boolean z14 = arrayList.size() == arrayListJ.size() ? 1 : i10;
                    Locale locale = Locale.US;
                    go.k.s(l1.d.f("The number of auxiliary track types from metadata (", arrayList.size(), ") is not same as the number of auxiliary tracks (", arrayListJ.size(), ")"), z14);
                }
                String strB = o.b(arrayListJ);
                int i26 = i10;
                int i27 = i26;
                long j13 = C.TIME_UNSET;
                int size = -1;
                while (i26 < arrayListJ.size()) {
                    r rVar = (r) arrayListJ.get(i26);
                    int i28 = rVar.f42198b;
                    ArrayDeque arrayDeque3 = arrayDeque2;
                    int i29 = rVar.f42201e;
                    p pVar = rVar.f42197a;
                    if (i28 == 0) {
                        arrayList = arrayList;
                        str = strB;
                        i12 = i26;
                        i11 = i27;
                        c0Var4 = c0Var8;
                        c0Var5 = c0Var7;
                        c0Var6 = c0VarF;
                    } else {
                        n2.m mVar = this.B;
                        i11 = i27 + 1;
                        str = strB;
                        int i30 = pVar.f42182b;
                        i1.p pVar2 = pVar.f42187g;
                        a0 a0VarTrack = mVar.track(i27, i30);
                        j jVar = new j(pVar, rVar, a0VarTrack);
                        c0 c0Var9 = c0VarF;
                        long j14 = pVar.f42185e;
                        if (j14 == C.TIME_UNSET) {
                            j14 = rVar.f42205i;
                        }
                        a0VarTrack.e(j14);
                        long jMax = Math.max(j13, j14);
                        String str2 = pVar2.f42643n;
                        String str3 = pVar2.f42643n;
                        int i31 = MimeTypes.AUDIO_TRUEHD.equals(str2) ? i29 * 16 : i29 + 30;
                        i1.o oVarA = pVar2.a();
                        oVarA.f42601n = i31;
                        if (i30 == 2) {
                            int i32 = pVar2.f42636f;
                            if ((i21 & 8) != 0) {
                                i32 |= size == -1 ? 1 : 2;
                            }
                            int i33 = i32;
                            if (this.f42170y) {
                                i18 = i33 | 32768;
                                oVarA.f42595g = ((Integer) arrayList.get(i26)).intValue();
                            } else {
                                i18 = i33;
                            }
                            oVarA.f42594f = i18;
                        } else {
                            arrayList = arrayList;
                        }
                        long[] jArr2 = rVar.f42202f;
                        int[] iArr = rVar.f42204h;
                        boolean z15 = rVar.f42206j;
                        if (d0.m(str3)) {
                            int iMin = Math.min(z15 ? rVar.f42198b : iArr.length, 20);
                            go.k.t(j14 != C.TIME_UNSET ? 1 : i10);
                            i12 = i26;
                            c0Var = c0Var9;
                            long jMin = Math.min(j14, 10000000L);
                            int i34 = i10;
                            int i35 = i34;
                            int i36 = -1;
                            while (i34 < iMin) {
                                int i37 = z15 ? i34 : iArr[i34];
                                long j15 = jArr2[i37];
                                if (j15 > jMin) {
                                    break;
                                }
                                if (j15 >= 0 && (i14 = rVar.f42200d[(i13 = i37)]) > i35) {
                                    i35 = i14;
                                    i36 = i13;
                                }
                                i34++;
                            }
                            if (i36 != -1) {
                                j11 = jArr2[i36];
                            }
                            if (j11 != C.TIME_UNSET) {
                                w2.c cVar2 = new w2.c(j11);
                                i15 = 1;
                                b0[] b0VarArr4 = new b0[1];
                                b0VarArr4[i10] = cVar2;
                                c0Var2 = new c0(b0VarArr4);
                            } else {
                                i15 = 1;
                                c0Var2 = null;
                            }
                            if (i30 == i15 && (i16 = qVar.f46485a) != -1 && (i17 = qVar.f46486b) != -1) {
                                oVarA.H = i16;
                                oVarA.I = i17;
                            }
                            c0 c0Var10 = pVar2.l;
                            arrayList2 = this.f42156j;
                            if (arrayList2.isEmpty()) {
                                c0Var3 = null;
                            } else {
                                c0Var3 = new c0(arrayList2);
                            }
                            c0Var4 = c0Var8;
                            c0Var5 = c0Var7;
                            c0[] c0VarArr = {c0Var3, c0Var4, c0Var5, c0Var2};
                            c0Var6 = c0Var;
                            o.k(i30, c0Var6, oVarA, c0Var10, c0VarArr);
                            oVarA.l = d0.n(str);
                            if (Objects.equals(str3, MimeTypes.AUDIO_MPEG)) {
                                jVar.f42146f = new i1.p(oVarA);
                            } else {
                                q4.a.o(oVarA, jVar.f42143c);
                            }
                            if (i30 == 2 && size == -1) {
                                size = arrayList5.size();
                            }
                            arrayList5.add(jVar);
                            j13 = jMax;
                        } else {
                            i12 = i26;
                            c0Var = c0Var9;
                        }
                        j11 = -9223372036854775807L;
                        if (j11 != C.TIME_UNSET) {
                            w2.c cVar3 = new w2.c(j11);
                            i15 = 1;
                            b0[] b0VarArr5 = new b0[1];
                            b0VarArr5[i10] = cVar3;
                            c0Var2 = new c0(b0VarArr5);
                        } else {
                            i15 = 1;
                            c0Var2 = null;
                        }
                        if (i30 == i15) {
                            oVarA.H = i16;
                            oVarA.I = i17;
                        }
                        c0 c0Var11 = pVar2.l;
                        arrayList2 = this.f42156j;
                        if (arrayList2.isEmpty()) {
                            c0Var3 = null;
                        } else {
                            c0Var3 = new c0(arrayList2);
                        }
                        c0Var4 = c0Var8;
                        c0Var5 = c0Var7;
                        c0[] c0VarArr2 = {c0Var3, c0Var4, c0Var5, c0Var2};
                        c0Var6 = c0Var;
                        o.k(i30, c0Var6, oVarA, c0Var11, c0VarArr2);
                        oVarA.l = d0.n(str);
                        if (Objects.equals(str3, MimeTypes.AUDIO_MPEG)) {
                            jVar.f42146f = new i1.p(oVarA);
                        } else {
                            q4.a.o(oVarA, jVar.f42143c);
                        }
                        if (i30 == 2) {
                            size = arrayList5.size();
                        }
                        arrayList5.add(jVar);
                        j13 = jMax;
                    }
                    int i38 = i12 + 1;
                    c0Var8 = c0Var4;
                    c0VarF = c0Var6;
                    c0Var7 = c0Var5;
                    arrayDeque2 = arrayDeque3;
                    arrayListJ = arrayListJ;
                    i27 = i11;
                    strB = str;
                    z12 = z12;
                    i26 = i38;
                    arrayList = arrayList;
                }
                arrayDeque = arrayDeque2;
                z10 = z12;
                boolean z16 = true;
                int i39 = -1;
                j[] jVarArr = (j[]) arrayList5.toArray(new j[i10]);
                this.C = jVarArr;
                if (z10) {
                    jArr = null;
                } else {
                    jArr = new long[jVarArr.length][];
                    int[] iArr2 = new int[jVarArr.length];
                    long[] jArr3 = new long[jVarArr.length];
                    boolean[] zArr = new boolean[jVarArr.length];
                    for (int i40 = 0; i40 < jVarArr.length; i40++) {
                        jArr[i40] = new long[jVarArr[i40].f42142b.f42198b];
                        jArr3[i40] = jVarArr[i40].f42142b.f42202f[0];
                    }
                    int i41 = 0;
                    while (i41 < jVarArr.length) {
                        long j16 = Long.MAX_VALUE;
                        int i42 = i39;
                        for (int i43 = 0; i43 < jVarArr.length; i43++) {
                            if (!zArr[i43]) {
                                long j17 = jArr3[i43];
                                if (j17 <= j16) {
                                    i42 = i43;
                                    j16 = j17;
                                }
                            }
                        }
                        int i44 = iArr2[i42];
                        long[] jArr4 = jArr[i42];
                        jArr4[i44] = j12;
                        r rVar2 = jVarArr[i42].f42142b;
                        boolean z17 = z16;
                        j12 += (long) rVar2.f42200d[i44];
                        int i45 = i44 + 1;
                        iArr2[i42] = i45;
                        if (i45 < jArr4.length) {
                            jArr3[i42] = rVar2.f42202f[i45];
                        } else {
                            zArr[i42] = z17;
                            i41++;
                        }
                        z16 = z17;
                        i39 = -1;
                    }
                }
                z11 = z16;
                this.D = jArr;
                this.B.endTracks();
                this.B.u(new i(j13, this.C, size));
                arrayDeque.clear();
                this.f42171z = z11;
                if (this.f42168w) {
                }
            } else if (!arrayDeque2.isEmpty()) {
                ((m1.c) arrayDeque2.peek()).f45775e.add(cVar);
            }
        }
        if (this.l != 2) {
            this.l = 0;
            this.f42160o = 0;
        }
    }

    @Override // n2.k
    public final void seek(long j10, long j11) {
        this.f42154h.clear();
        this.f42160o = 0;
        this.f42162q = -1;
        this.f42163r = 0;
        this.f42164s = 0;
        this.f42165t = 0;
        this.f42166u = false;
        this.f42171z = false;
        if (j10 == 0) {
            if (this.l != 3) {
                this.l = 0;
                this.f42160o = 0;
                return;
            } else {
                n nVar = this.f42155i;
                nVar.f42177a.clear();
                nVar.f42178b = 0;
                this.f42156j.clear();
                return;
            }
        }
        for (j jVar : this.C) {
            r rVar = jVar.f42142b;
            int iA = rVar.a(j11);
            if (iA == -1) {
                iA = rVar.b(j11);
            }
            jVar.f42145e = iA;
            i3 i3Var = jVar.f42144d;
            if (i3Var != null) {
                i3Var.f15549b = false;
                i3Var.f15550c = 0;
            }
        }
    }

    @Override // n2.k
    public final void release() {
    }
}
