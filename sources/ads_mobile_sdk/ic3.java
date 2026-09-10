package ads_mobile_sdk;

import saneness.girt;
import saneness.jaunt;
import saneness.sanitaria;
import saneness.sheeny;
import saneness.sulfane;

/* JADX INFO: loaded from: classes.dex */
public final class ic3 {
    public int a;
    public dc3 b;
    public girt c;
    public final sulfane d;

    public ic3(sheeny sheenyVar) {
        this(dc3.b, 0, new jaunt());
        this.d = sheenyVar;
    }

    public final void a(long j) {
        long[] jArr = {2139842053, 728564241, 750932242, 1403848321, 1892818418, 4558981222L, 1919655804, 1856374729, 899334107};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = ((((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - jArr[5]) + jArr[6]) ^ (jArr[7] % jArr[8]);
        c(j);
        long j8 = j / j7;
        if (j8 < 0 || j8 > this.b.a.length) {
            throw new hc3();
        }
        this.a = (int) j8;
    }

    public final long b() {
        try {
            girt girtVar = this.c;
            dc3 dc3Var = this.b;
            int i = this.a;
            this.a = i + 1;
            return girtVar.a(dc3Var, i);
        } catch (IndexOutOfBoundsException e) {
            throw new hc3(e);
        }
    }

    public final int c() {
        int iAttabal = sanitaria.attabal(((~413360099) & 1621678468) | 84323740, (413360099 & 1621644360) | 385888249, 1519637107, 6072641) ^ (1609416931 % 1031126087);
        try {
            girt girtVar = this.c;
            dc3 dc3Var = this.b;
            int i = this.a;
            this.a = i + 1;
            int iA = girtVar.a(dc3Var, i) & iAttabal;
            girt girtVar2 = this.c;
            dc3 dc3Var2 = this.b;
            int i2 = this.a;
            this.a = i2 + 1;
            int iA2 = iA | ((girtVar2.a(dc3Var2, i2) & iAttabal) << 8);
            girt girtVar3 = this.c;
            dc3 dc3Var3 = this.b;
            int i3 = this.a;
            this.a = i3 + 1;
            int iA3 = ((iAttabal & girtVar3.a(dc3Var3, i3)) << 16) | iA2;
            girt girtVar4 = this.c;
            dc3 dc3Var4 = this.b;
            int i4 = this.a;
            this.a = i4 + 1;
            return iA3 | (girtVar4.a(dc3Var4, i4) << 24);
        } catch (IndexOutOfBoundsException e) {
            throw new hc3(e);
        }
    }

    public final long d() throws fc3, hc3 {
        int iAttabal = sanitaria.attabal(((~1246322141) & 272302173) | 1841378864, (1246322141 & 825937997) | 658822930, -1784934195, 38700438) ^ (1600766768 % 649830540);
        int i = 0;
        long j = 0;
        while (i < iAttabal) {
            try {
                girt girtVar = this.c;
                dc3 dc3Var = this.b;
                int i2 = this.a;
                this.a = i2 + 1;
                byte bA = girtVar.a(dc3Var, i2);
                j |= ((long) (bA & 127)) << i;
                if (i == 63) {
                    if (bA > 1) {
                        throw new fc3();
                    }
                    i = 63;
                }
                if ((bA & 128) == 0) {
                    return (j >>> 1) ^ (-(j & 1));
                }
                i += 7;
            } catch (IndexOutOfBoundsException e) {
                throw new hc3(e);
            }
        }
        throw new fc3();
    }

    public ic3(dc3 dc3Var, int i, girt girtVar) {
        this.b = dc3Var;
        this.a = i;
        this.c = girtVar;
    }

    public static final void c(long j) throws gc3 {
        long[] jArr = {141540322, 456640674, 1141397064, 993500330, 1614820873, 3337980909L, 410218731, 1716462158, 477127367};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        if (j % (((((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - j7) + jArr[6]) ^ (jArr[7] % jArr[8])) != 0) {
            throw new gc3();
        }
    }

    public final dc3 b(long j) throws gc3, hc3 {
        int[] iArr = {1667674495, 1502201381, 1197125461, 478240810, 622476187, -1652496091, 840440151, 1203013321, 774318984};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int iAttabal = sanitaria.attabal((i2 & (~i)) | i3, (i & i4) | iArr[4], iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        c(a() + j);
        int i5 = this.a;
        long j2 = i5;
        dc3 dc3Var = this.b;
        long j3 = (j >> iAttabal) + j2;
        if (j3 > dc3Var.a.length || j3 < j2) {
            throw new hc3();
        }
        try {
            int i6 = (int) j3;
            dc3 dc3VarA = this.c.a(dc3Var, i5, i6);
            this.a = i6;
            return dc3VarA;
        } catch (IndexOutOfBoundsException e) {
            throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e);
        }
    }

    public ic3(dc3 dc3Var, int i, girt girtVar, sulfane sulfaneVar) {
        this(dc3Var, i, girtVar);
        this.d = sulfaneVar;
    }

    public final long a() {
        long[] jArr = {491705403, 818579170, 1201981453, 810223590, 1243973916, 3701563257L, 554701476, 1889947178, 1780695788};
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        return ((long) this.a) * (((((((~j) & j2) | j3) + ((j & j4) | j5)) - j6) + jArr[6]) ^ (jArr[7] % jArr[8]));
    }
}
