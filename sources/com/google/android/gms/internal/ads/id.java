package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class id {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f15709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f15711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public qc f15712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f15713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public cd f15714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15715g = 1;

    public static id a(Object obj) {
        id idVar = new id();
        int[] iArr = {572660336, 1963204074, 810270723, 1168973800, 12304897, -1027511958, 1433925857, 2084420925, 1937477084};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int iG = com.applovin.impl.ca.g((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16);
        idVar.r();
        idVar.f15715g = (i17 % 1937477084) ^ iG;
        idVar.f15709a = obj;
        return idVar;
    }

    public static id b(long j10) {
        id idVar = new id();
        int[] iArr = {269455306, 1628467785, 508432336, 1769894153, 149815616, -1737813993, 468055906, 524872353, 327254586};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int iG = com.applovin.impl.ca.g((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16);
        idVar.r();
        idVar.f15715g = (i17 % 327254586) ^ iG;
        idVar.f15710b = j10;
        return idVar;
    }

    public static id c(double d10) {
        id idVar = new id();
        int[] iArr = {76065818, 1629326670, 912768099, 1092092300, 784816880, -1349977414, 434065736, 1884661237, 1605908235};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int iG = com.applovin.impl.ca.g((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16);
        idVar.r();
        idVar.f15715g = (i17 % 1605908235) ^ iG;
        idVar.f15711c = d10;
        return idVar;
    }

    public static id d(qc qcVar) {
        id idVar = new id();
        int[] iArr = {1143408282, 544368152, 1884037077, 79323401, 1472762119, -801477845, 201305624, 1470503465, 1402586708};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int iG = com.applovin.impl.ca.g((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16);
        idVar.r();
        idVar.f15715g = (i17 % 1402586708) ^ iG;
        idVar.f15712d = qcVar;
        return idVar;
    }

    public static id e(ArrayList arrayList) {
        id idVar = new id();
        int[] iArr = {231602422, 370241669, 619070592, 319896591, 694865338, 1425770340, 39950860, 555996658, 324763920};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int iG = com.applovin.impl.ca.g((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16);
        idVar.r();
        idVar.f15715g = (i17 % 324763920) ^ iG;
        idVar.f15713e = arrayList;
        return idVar;
    }

    public static id f(cd cdVar) {
        id idVar = new id();
        int[] iArr = {1315209188, 67133601, 1612794668, 612376713, 2023183116, -774012042, 5007439, 661761152, 474613996};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int iG = com.applovin.impl.ca.g((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16);
        idVar.r();
        idVar.f15715g = (i17 % 474613996) ^ iG;
        idVar.f15714f = cdVar;
        return idVar;
    }

    public static id g(Object obj) {
        if (obj instanceof Long) {
            return b(((Long) obj).longValue());
        }
        if (obj instanceof Boolean) {
            return b(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Integer) {
            return b(((Integer) obj).intValue());
        }
        if (obj instanceof Double) {
            return c(((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return c(((Float) obj).floatValue());
        }
        if (obj instanceof Short) {
            return b(((Short) obj).shortValue());
        }
        if (obj instanceof Byte) {
            return b(((Byte) obj).byteValue());
        }
        if (obj instanceof qc) {
            return d((qc) obj);
        }
        if (obj instanceof String) {
            return d(qc.e(((String) obj).getBytes(Charset.forName(pc.a("Hn2H4l0=")))));
        }
        if (!(obj instanceof ArrayList)) {
            return a(obj);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(g(arrayList2.get(i10)));
        }
        return e(arrayList);
    }

    public static id j(id idVar) {
        int[] iArr = {1154349542, 1365661854, 772762753, -35647458, -1399059520, 905919471, 65677639, 1759726503, 552812661};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int iG = com.applovin.impl.ca.g((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16);
        int i18 = i17 % 552812661;
        try {
            int i19 = idVar.f15715g;
            int i20 = (i18 ^ iG) + i19;
            if (i19 == 0) {
                throw null;
            }
            switch (i20) {
                case 0:
                    return new id();
                case 1:
                    return a(idVar.l());
                case 2:
                    return b(idVar.m());
                case 3:
                    return d(idVar.n());
                case 4:
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((ArrayList) idVar.o()).iterator();
                    while (it.hasNext()) {
                        arrayList.add(j((id) it.next()));
                    }
                    return e(arrayList);
                case 5:
                    return f(idVar.p());
                case 6:
                    return c(idVar.q());
                default:
                    throw new AssertionError(pc.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
            }
        } catch (gd e10) {
            throw new AssertionError(pc.a("CEiv6BFfPnitUE+D"), e10);
        }
    }

    public final Object h() throws gd {
        int[] iArr = {172154289, 1050326876, 843682288, -858640882, -228026365, 881347074, 13857144, 514820752, 473891334};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int iG = com.applovin.impl.ca.g((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16);
        int i18 = this.f15715g;
        int i19 = ((i17 % 473891334) ^ iG) + i18;
        if (i18 == 0) {
            throw null;
        }
        switch (i19) {
            case 0:
            case 5:
                throw new gd();
            case 1:
                return l();
            case 2:
                return Long.valueOf(m());
            case 3:
                return n().a();
            case 4:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) o()).iterator();
                while (it.hasNext()) {
                    arrayList.add(((id) it.next()).h());
                }
                return arrayList;
            case 6:
                return Double.valueOf(q());
            default:
                throw new AssertionError(pc.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x01f4, code lost:
    
        if (r18.equals(java.lang.Object.class) != false) goto L150;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(java.lang.Class r18) throws com.google.android.gms.internal.ads.gd {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.id.i(java.lang.Class):java.lang.Object");
    }

    public final void k(ByteArrayOutputStream byteArrayOutputStream) throws IOException, gd {
        long[] jArr = {1269833163, 1628598594, 308676977, 1629286434, 15633520, 3337700125L, 1402923307, 613197917, 297598514};
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        int i10 = 5;
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        long j18 = (((((~j10) & j11) | j12) + ((j10 & j13) | j14)) - j15) + j16;
        long j19 = j17 % 297598514;
        int i11 = this.f15715g;
        int i12 = i11 - 1;
        if (i11 == 0) {
            throw null;
        }
        switch (i12) {
            case 0:
            case 1:
            case 5:
                throw new gd();
            case 2:
                s6.r(m(), new x11(byteArrayOutputStream, i10), true);
                return;
            case 3:
                byte[] bArr = n().f19023a;
                s6.r(((long) bArr.length) * (j18 ^ j19), new x11(byteArrayOutputStream, i10), true);
                byteArrayOutputStream.write(bArr);
                return;
            case 4:
                ArrayList arrayList = (ArrayList) o();
                s6.r(arrayList.size(), new x11(byteArrayOutputStream, i10), true);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((id) it.next()).k(byteArrayOutputStream);
                }
                return;
            case 6:
                long jDoubleToRawLongBits = Double.doubleToRawLongBits(q());
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate.putLong(jDoubleToRawLongBits);
                for (byte b10 : byteBufferAllocate.array()) {
                    byteArrayOutputStream.write(b10);
                }
                int length = byteBufferAllocate.array().length;
                return;
            default:
                return;
        }
    }

    public final Object l() throws gd {
        int[] iArr = {427355115, 404248040, 1318670750, 874677346, 1819730563, -970011213, 126401947, 1858504292, 235745791};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        s((iArr[7] % 235745791) ^ com.applovin.impl.ca.g((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16));
        return this.f15709a;
    }

    public final long m() throws gd {
        int[] iArr = {1646478179, 763209928, 1529626135, 609321208, 1403807536, -1382063087, 25624641, 1388803074, 733327814};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        s((iArr[7] % 733327814) ^ com.applovin.impl.ca.g((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16));
        return this.f15710b;
    }

    public final qc n() throws gd {
        int[] iArr = {2059344234, 1917530355, 739411611, 1399403104, 95815174, 2094390031, 51245830, 1312994984, 1140384172};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        s((iArr[7] % 1140384172) ^ com.applovin.impl.ca.g((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16));
        return this.f15712d;
    }

    public final List o() throws gd {
        int[] iArr = {1435218189, 1093276829, 949583962, 1092752517, 575966040, -2054938211, 262178224, 1891252715, 1250801052};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        s((iArr[7] % 1250801052) ^ com.applovin.impl.ca.g((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16));
        return this.f15713e;
    }

    public final cd p() throws gd {
        int[] iArr = {672139932, 1821026951, 1629321417, 214090246, 828986457, -1439766056, 580508860, 1579068977, 395191309};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        s((iArr[7] % 395191309) ^ com.applovin.impl.ca.g((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16));
        return this.f15714f;
    }

    public final double q() throws gd {
        int[] iArr = {1714636915, 1758565445, 174653454, 1653642817, 38095532, -1976041400, 596516649, 1804289383, 846930886};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        s((iArr[7] % 846930886) ^ com.applovin.impl.ca.g((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16));
        return this.f15711c;
    }

    public final void r() {
        this.f15715g = 1;
        this.f15710b = 0L;
        this.f15709a = null;
        this.f15712d = null;
        this.f15713e = null;
        this.f15714f = null;
    }

    public final void s(int i10) throws gd {
        if (i10 != this.f15715g) {
            throw new gd();
        }
    }
}
