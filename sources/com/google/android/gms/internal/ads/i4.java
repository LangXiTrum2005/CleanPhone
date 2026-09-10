package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.StringReader;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i4 implements m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o2 f15560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15563e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m4 f15565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n2 f15566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.recyclerview.widget.c f15567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r6 f15568j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final np0 f15559a = new np0(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f15564f = -1;

    public final void a() {
        o2 o2Var = this.f15560b;
        o2Var.getClass();
        o2Var.zzv();
        this.f15560b.o(new r2(C.TIME_UNSET, 0L));
        this.f15561c = 6;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean d(n2 n2Var) {
        String strM;
        np0 np0Var = this.f15559a;
        np0Var.y(2);
        n2Var.v(np0Var.f17880a, 0, 2);
        if (np0Var.L() == 65496) {
            while (true) {
                np0Var.y(2);
                n2Var.v(np0Var.f17880a, 0, 2);
                int iL = np0Var.L();
                this.f15562d = iL;
                if (iL == 65498) {
                    break;
                }
                np0Var.y(2);
                n2Var.v(np0Var.f17880a, 0, 2);
                int iL2 = np0Var.L() - 2;
                if (iL2 < 0) {
                    break;
                }
                if (this.f15562d != 65505) {
                    n2Var.b(iL2);
                } else {
                    np0Var.y(iL2);
                    n2Var.v(np0Var.f17880a, 0, iL2);
                    if (Objects.equals(np0Var.m(), "http://ns.adobe.com/xap/1.0/") && (strM = np0Var.m()) != null) {
                        String[] strArr = ps1.f18794b;
                        for (int i10 = 0; i10 < 4; i10++) {
                            if (strM.contains(String.valueOf(strArr[i10]).concat("=\"1\""))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void e(long j10, long j11) {
        if (j10 == 0) {
            this.f15561c = 0;
            this.f15568j = null;
        } else if (this.f15561c == 5) {
            r6 r6Var = this.f15568j;
            r6Var.getClass();
            r6Var.e(j10, j11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x020d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0225  */
    /* JADX WARN: Code duplicated, block: B:115:0x022a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0235  */
    /* JADX WARN: Code duplicated, block: B:123:0x0246  */
    /* JADX WARN: Code duplicated, block: B:125:0x024a  */
    /* JADX WARN: Code duplicated, block: B:170:0x024c A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.m2
    public final int f(n2 n2Var, q2 q2Var) throws ab {
        String strM;
        long j10;
        androidx.recyclerview.widget.c cVar;
        ya1 ya1Var;
        int i10;
        int i11;
        long j11;
        long j12;
        long j13;
        long j14;
        j4 j4Var;
        String str;
        boolean z10;
        long j15;
        long j16;
        int i12 = this.f15561c;
        np0 np0Var = this.f15559a;
        long j17 = -1;
        if (i12 == 0) {
            np0Var.y(2);
            n2Var.p(np0Var.f17880a, 0, 2);
            int iL = np0Var.L();
            this.f15562d = iL;
            if (iL == 65498) {
                if (this.f15564f != -1) {
                    this.f15561c = 4;
                    return 0;
                }
                a();
                return 0;
            }
            if ((iL < 65488 || iL > 65497) && iL != 65281) {
                this.f15561c = 1;
            }
            return 0;
        }
        if (i12 == 1) {
            np0Var.y(2);
            n2Var.v(np0Var.f17880a, 0, 2);
            this.f15563e = np0Var.L() - 2;
            n2Var.zzf(2);
            this.f15561c = 2;
            return 0;
        }
        if (i12 != 2) {
            if (i12 != 4) {
                if (i12 != 5) {
                    if (i12 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f15567i == null || n2Var != this.f15566h) {
                    this.f15566h = n2Var;
                    this.f15567i = new androidx.recyclerview.widget.c(n2Var, this.f15564f);
                }
                r6 r6Var = this.f15568j;
                r6Var.getClass();
                int iF = r6Var.f(this.f15567i, q2Var);
                if (iF == 1) {
                    q2Var.f18888a += this.f15564f;
                }
                return iF;
            }
            long jZzn = n2Var.zzn();
            long j18 = this.f15564f;
            if (jZzn != j18) {
                q2Var.f18888a = j18;
                return 1;
            }
            if (!n2Var.m(np0Var.f17880a, 0, 1, true)) {
                a();
                return 0;
            }
            n2Var.zzl();
            if (this.f15568j == null) {
                this.f15568j = new r6(p7.R8, 8);
            }
            androidx.recyclerview.widget.c cVar2 = new androidx.recyclerview.widget.c(n2Var, this.f15564f);
            this.f15567i = cVar2;
            if (!this.f15568j.d(cVar2)) {
                a();
                return 0;
            }
            r6 r6Var2 = this.f15568j;
            long j19 = this.f15564f;
            o2 o2Var = this.f15560b;
            o2Var.getClass();
            r6Var2.g(new androidx.recyclerview.widget.c(j19, o2Var, 2));
            m4 m4Var = this.f15565g;
            m4Var.getClass();
            o2 o2Var2 = this.f15560b;
            o2Var2.getClass();
            h3 h3VarE = o2Var2.e(1024, 4);
            i12 i12Var = new i12();
            i12Var.d("image/jpeg");
            i12Var.f15509k = new s8(m4Var);
            h3VarE.f(new g22(i12Var));
            this.f15561c = 5;
            return 0;
        }
        if (this.f15562d == 65505) {
            np0 np0Var2 = new np0(this.f15563e);
            n2Var.p(np0Var2.f17880a, 0, this.f15563e);
            if (this.f15565g == null && "http://ns.adobe.com/xap/1.0/".equals(np0Var2.m()) && (strM = np0Var2.m()) != null) {
                long jZzo = n2Var.zzo();
                m4 m4Var2 = null;
                if (jZzo != -1) {
                    try {
                        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                        xmlPullParserNewPullParser.setInput(new StringReader(strM));
                        xmlPullParserNewPullParser.next();
                        try {
                            if (!dv.t(xmlPullParserNewPullParser, "x:xmpmeta")) {
                                throw ab.a(null, "Couldn't find xmp metadata");
                            }
                            aa1 aa1Var = ca1.f13122b;
                            ya1 ya1VarV = ya1.f22208e;
                            long j20 = -9223372036854775807L;
                            loop0: while (true) {
                                xmlPullParserNewPullParser.next();
                                j10 = j17;
                                if (dv.t(xmlPullParserNewPullParser, "rdf:Description")) {
                                    String[] strArr = ps1.f18794b;
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 < 4) {
                                            String strX = dv.x(xmlPullParserNewPullParser, strArr[i13]);
                                            if (strX == null) {
                                                i13++;
                                            } else if (Integer.parseInt(strX) == 1) {
                                                String[] strArr2 = ps1.f18795c;
                                                int i14 = 0;
                                                while (true) {
                                                    if (i14 < 4) {
                                                        String strX2 = dv.x(xmlPullParserNewPullParser, strArr2[i14]);
                                                        if (strX2 != null) {
                                                            long j21 = Long.parseLong(strX2);
                                                            if (j21 != j10) {
                                                                j20 = j21;
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                        i14++;
                                                    }
                                                    j20 = -9223372036854775807L;
                                                    break;
                                                }
                                                String[] strArr3 = ps1.f18796d;
                                                int i15 = 0;
                                                while (true) {
                                                    if (i15 >= 2) {
                                                        ya1VarV = ya1.f22208e;
                                                        break;
                                                    }
                                                    String strX3 = dv.x(xmlPullParserNewPullParser, strArr3[i15]);
                                                    if (strX3 != null) {
                                                        ya1VarV = ca1.v(new j4("image/jpeg", 0L, 0L), new j4(MimeTypes.VIDEO_MP4, Long.parseLong(strX3), 0L));
                                                        break;
                                                    }
                                                    i15++;
                                                }
                                            }
                                        }
                                        cVar = null;
                                        break loop0;
                                    }
                                }
                                if (dv.t(xmlPullParserNewPullParser, "Container:Directory")) {
                                    ya1VarV = ps1.J(xmlPullParserNewPullParser, "Container", "Item");
                                } else if (dv.t(xmlPullParserNewPullParser, "GContainer:Directory")) {
                                    ya1VarV = ps1.J(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                                }
                                long j22 = j20;
                                if (dv.k(xmlPullParserNewPullParser, "x:xmpmeta")) {
                                    if (!ya1VarV.isEmpty()) {
                                        cVar = new androidx.recyclerview.widget.c(j22, ya1VarV, 3);
                                        break;
                                    }
                                    cVar = null;
                                    break loop0;
                                }
                                j20 = j22;
                                j17 = j10;
                            }
                            if (cVar != null && (i10 = (ya1Var = (ya1) cVar.f4729c).f22210d) >= 2) {
                                j11 = j10;
                                j12 = j11;
                                j13 = j12;
                                j14 = j13;
                                for (i11 = i10 - 1; i11 >= 0; i11--) {
                                    j4Var = (j4) ya1Var.get(i11);
                                    str = j4Var.f15962a;
                                    if (!str.equals(MimeTypes.VIDEO_MP4) || str.equals("video/quicktime")) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (i11 == 0) {
                                        jZzo -= j4Var.f15964c;
                                        j15 = 0;
                                    } else {
                                        j15 = jZzo - j4Var.f15963b;
                                    }
                                    long j23 = j15;
                                    j16 = jZzo;
                                    jZzo = j23;
                                    if (z10 && jZzo != j16) {
                                        j14 = j16 - jZzo;
                                        j13 = jZzo;
                                    }
                                    if (i11 == 0) {
                                        j12 = j16;
                                    }
                                    if (i11 == 0) {
                                        j11 = jZzo;
                                    }
                                }
                                if (j13 != j10 && j14 != j10 && j11 != j10 && j12 != j10) {
                                    m4Var2 = new m4(j11, j12, cVar.f4728b, j13, j14);
                                }
                            }
                        } catch (ab | NumberFormatException | XmlPullParserException unused) {
                            v71.y("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        }
                    } catch (ab | NumberFormatException | XmlPullParserException unused2) {
                        j10 = j17;
                    }
                    v71.y("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                    cVar = null;
                    if (cVar != null) {
                        j11 = j10;
                        j12 = j11;
                        j13 = j12;
                        j14 = j13;
                        while (i11 >= 0) {
                            j4Var = (j4) ya1Var.get(i11);
                            str = j4Var.f15962a;
                            if (str.equals(MimeTypes.VIDEO_MP4)) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            if (i11 == 0) {
                                jZzo -= j4Var.f15964c;
                                j15 = 0;
                            } else {
                                j15 = jZzo - j4Var.f15963b;
                            }
                            long j24 = j15;
                            j16 = jZzo;
                            jZzo = j24;
                            if (z10) {
                                j14 = j16 - jZzo;
                                j13 = jZzo;
                            }
                            if (i11 == 0) {
                                j12 = j16;
                            }
                            if (i11 == 0) {
                                j11 = jZzo;
                            }
                        }
                        if (j13 != j10) {
                            m4Var2 = new m4(j11, j12, cVar.f4728b, j13, j14);
                        }
                    }
                }
                this.f15565g = m4Var2;
                if (m4Var2 != null) {
                    this.f15564f = m4Var2.f17236d;
                }
            }
        } else {
            n2Var.zzf(this.f15563e);
        }
        this.f15561c = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void g(o2 o2Var) {
        this.f15560b = o2Var;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void zzf() {
    }
}
