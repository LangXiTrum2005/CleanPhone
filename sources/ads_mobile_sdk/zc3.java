package ads_mobile_sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import saneness.anthropography;
import saneness.phraseological;
import saneness.sanitaria;

/* JADX INFO: loaded from: classes.dex */
public final class zc3 {
    public Object a;
    public long b;
    public double c;
    public dc3 d;
    public List e;
    public anthropography f;
    public int g = 1;

    public static zc3 a(Object obj) {
        zc3 zc3Var = new zc3();
        int[] iArr = {572660336, 1963204074, 810270723, 1168973800, 12304897, -1027511958, 1433925857, 2084420925, 1937477084};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int iAttabal = sanitaria.attabal((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        zc3Var.h();
        zc3Var.g = iAttabal;
        zc3Var.a = obj;
        return zc3Var;
    }

    public static zc3 b(Object obj) {
        if (obj instanceof Long) {
            return a(((Long) obj).longValue());
        }
        if (obj instanceof Boolean) {
            return a(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Integer) {
            return a(((Integer) obj).intValue());
        }
        if (obj instanceof Double) {
            return a(((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return a(((Float) obj).floatValue());
        }
        if (obj instanceof Short) {
            return a(((Short) obj).shortValue());
        }
        if (obj instanceof Byte) {
            return a(((Byte) obj).byteValue());
        }
        if (obj instanceof dc3) {
            return a((dc3) obj);
        }
        if (obj instanceof String) {
            return a(dc3.a((String) obj));
        }
        if (!(obj instanceof ArrayList)) {
            return a(obj);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(b(arrayList2.get(i)));
        }
        return a(arrayList);
    }

    public final long c() throws wc3 {
        int[] iArr = {1646478179, 763209928, 1529626135, 609321208, 1403807536, -1382063087, 25624641, 1388803074, 733327814};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        a(sanitaria.attabal((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]));
        return this.b;
    }

    public final dc3 d() throws wc3 {
        int[] iArr = {2059344234, 1917530355, 739411611, 1399403104, 95815174, 2094390031, 51245830, 1312994984, 1140384172};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        a(sanitaria.attabal((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]));
        return this.d;
    }

    public final List e() throws wc3 {
        int[] iArr = {1435218189, 1093276829, 949583962, 1092752517, 575966040, -2054938211, 262178224, 1891252715, 1250801052};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        a(sanitaria.attabal((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]));
        return this.e;
    }

    public final anthropography f() throws wc3 {
        int[] iArr = {672139932, 1821026951, 1629321417, 214090246, 828986457, -1439766056, 580508860, 1579068977, 395191309};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        a(sanitaria.attabal((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]));
        return this.f;
    }

    public final double g() throws wc3 {
        int[] iArr = {1714636915, 1758565445, 174653454, 1653642817, 38095532, -1976041400, 596516649, 1804289383, 846930886};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        a(sanitaria.attabal((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]));
        return this.c;
    }

    public final void h() {
        this.g = 1;
        this.b = 0L;
        this.a = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public static zc3 a(long j) {
        zc3 zc3Var = new zc3();
        int[] iArr = {269455306, 1628467785, 508432336, 1769894153, 149815616, -1737813993, 468055906, 524872353, 327254586};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int iAttabal = sanitaria.attabal((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        zc3Var.h();
        zc3Var.g = iAttabal;
        zc3Var.b = j;
        return zc3Var;
    }

    public final Object b() throws wc3 {
        int[] iArr = {427355115, 404248040, 1318670750, 874677346, 1819730563, -970011213, 126401947, 1858504292, 235745791};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        a(sanitaria.attabal((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]));
        return this.a;
    }

    public static zc3 a(double d) {
        zc3 zc3Var = new zc3();
        int[] iArr = {76065818, 1629326670, 912768099, 1092092300, 784816880, -1349977414, 434065736, 1884661237, 1605908235};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int iAttabal = sanitaria.attabal((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        zc3Var.h();
        zc3Var.g = iAttabal;
        zc3Var.c = d;
        return zc3Var;
    }

    public static zc3 a(dc3 dc3Var) {
        zc3 zc3Var = new zc3();
        int[] iArr = {1143408282, 544368152, 1884037077, 79323401, 1472762119, -801477845, 201305624, 1470503465, 1402586708};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int iAttabal = sanitaria.attabal((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        zc3Var.h();
        zc3Var.g = iAttabal;
        zc3Var.d = dc3Var;
        return zc3Var;
    }

    public static zc3 a(ArrayList arrayList) {
        zc3 zc3Var = new zc3();
        int[] iArr = {231602422, 370241669, 619070592, 319896591, 694865338, 1425770340, 39950860, 555996658, 324763920};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int iAttabal = sanitaria.attabal((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        zc3Var.h();
        zc3Var.g = iAttabal;
        zc3Var.e = arrayList;
        return zc3Var;
    }

    public static zc3 a(anthropography anthropographyVar) {
        zc3 zc3Var = new zc3();
        int[] iArr = {1315209188, 67133601, 1612794668, 612376713, 2023183116, -774012042, 5007439, 661761152, 474613996};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int iAttabal = sanitaria.attabal((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        zc3Var.h();
        zc3Var.g = iAttabal;
        zc3Var.f = anthropographyVar;
        return zc3Var;
    }

    public final Object a() throws wc3 {
        int[] iArr = {172154289, 1050326876, 843682288, -858640882, -228026365, 881347074, 13857144, 514820752, 473891334};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int iAttabal = sanitaria.attabal((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        int i6 = this.g;
        int i7 = iAttabal + i6;
        if (i6 == 0) {
            throw null;
        }
        switch (i7) {
            case 0:
            case 5:
                throw new wc3();
            case 1:
                return b();
            case 2:
                return Long.valueOf(c());
            case 3:
                return d().a();
            case 4:
                ArrayList arrayList = new ArrayList();
                Iterator it = e().iterator();
                while (it.hasNext()) {
                    arrayList.add(((zc3) it.next()).a());
                }
                return arrayList;
            case 6:
                return Double.valueOf(g());
            default:
                throw new AssertionError(bc3.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
        }
    }

    public final Object a(Class cls) throws wc3 {
        int iAttabal = sanitaria.attabal(((~849876229) & 176298782) | 901785696, (849876229 & 1241658174) | 1140858976, -1634246151, 697652827) ^ (1297046355 % 1049561859);
        int i = this.g;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        Class cls2 = Double.TYPE;
        Class cls3 = Short.TYPE;
        Class cls4 = Byte.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        Class cls7 = Float.TYPE;
        switch (i2) {
            case 0:
                throw new wc3();
            case 1:
                return b();
            case 2:
                long jC = c();
                if (cls.equals(Byte.class) || cls.equals(cls4)) {
                    return Byte.valueOf((byte) ((((int) jC) << 24) >> 24));
                }
                if (cls.equals(Short.class) || cls.equals(cls3)) {
                    return Short.valueOf((short) ((((int) jC) << iAttabal) >> iAttabal));
                }
                if (cls.equals(Integer.class) || cls.equals(cls6)) {
                    return Integer.valueOf(Math.toIntExact(jC));
                }
                if (cls.equals(Long.class) || cls.equals(cls5)) {
                    return Long.valueOf(jC);
                }
                if (cls.equals(Float.class) || cls.equals(cls7)) {
                    return Float.valueOf(jC);
                }
                if (cls.equals(Double.class) || cls.equals(cls2)) {
                    return Double.valueOf(jC);
                }
                if (cls.equals(Boolean.class) || cls.equals(Boolean.TYPE)) {
                    return Boolean.valueOf(jC != 0);
                }
                if (cls.equals(Character.class) || cls.equals(Character.TYPE)) {
                    return Byte.valueOf((byte) ((((int) jC) << 24) >> 24));
                }
                if (cls.equals(Object.class)) {
                    return Long.valueOf(jC);
                }
                throw new wc3();
            case 3:
                dc3 dc3VarD = d();
                if (cls.equals(dc3.class)) {
                    return dc3VarD;
                }
                if (cls.equals(Object.class)) {
                    dc3VarD.getClass();
                    Charset charsetForName = Charset.forName(bc3.a("Hn2H4l0="));
                    byte[] bArr = dc3VarD.a;
                    return new String(bArr, 0, bArr.length, charsetForName);
                }
                if (cls.equals(String.class)) {
                    dc3VarD.getClass();
                    Charset charsetForName2 = Charset.forName(bc3.a("Hn2H4l0="));
                    byte[] bArr2 = dc3VarD.a;
                    return new String(bArr2, 0, bArr2.length, charsetForName2);
                }
                if (cls.equals(byte[].class)) {
                    return dc3VarD.a();
                }
                throw new wc3();
            case 4:
                if (cls.equals(ArrayList.class) || cls.equals(Object.class) || cls.equals(AbstractList.class) || cls.equals(AbstractCollection.class) || cls.equals(Serializable.class) || cls.equals(Cloneable.class) || cls.equals(Iterable.class) || cls.equals(Collection.class) || cls.equals(List.class) || cls.equals(RandomAccess.class)) {
                    return a();
                }
                if (!cls.isArray()) {
                    throw new wc3();
                }
                List listE = e();
                Class<?> componentType = cls.getComponentType();
                Object objNewInstance = Array.newInstance(componentType, listE.size());
                for (int i3 = 0; i3 < listE.size(); i3++) {
                    Array.set(objNewInstance, i3, ((zc3) listE.get(i3)).a((Class) componentType));
                }
                return objNewInstance;
            case 5:
                return f();
            case 6:
                double dG = g();
                if (cls.equals(Float.class) || cls.equals(cls7)) {
                    return Float.valueOf((float) dG);
                }
                if (cls.equals(Integer.class) || cls.equals(cls6)) {
                    return Integer.valueOf((int) dG);
                }
                if (cls.equals(Long.class) || cls.equals(cls5)) {
                    return Long.valueOf((long) dG);
                }
                if (cls.equals(Byte.class) || cls.equals(cls4)) {
                    return Byte.valueOf((byte) ((((int) dG) << 24) >> 24));
                }
                if (cls.equals(Short.class) || cls.equals(cls3)) {
                    return Short.valueOf((short) ((((int) dG) << iAttabal) >> iAttabal));
                }
                if (cls.equals(Double.class) || cls.equals(cls2)) {
                    return Double.valueOf(dG);
                }
                if (cls.equals(Object.class)) {
                    return Double.valueOf(dG);
                }
                throw new wc3();
            default:
                throw new AssertionError(bc3.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
        }
    }

    public static zc3 a(zc3 zc3Var) {
        int[] iArr = {1154349542, 1365661854, 772762753, -35647458, -1399059520, 905919471, 65677639, 1759726503, 552812661};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int iAttabal = sanitaria.attabal((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        try {
            int i6 = zc3Var.g;
            int i7 = iAttabal + i6;
            if (i6 == 0) {
                throw null;
            }
            switch (i7) {
                case 0:
                    return new zc3();
                case 1:
                    return a(zc3Var.b());
                case 2:
                    return a(zc3Var.c());
                case 3:
                    return a(zc3Var.d());
                case 4:
                    ArrayList arrayList = new ArrayList();
                    Iterator it = zc3Var.e().iterator();
                    while (it.hasNext()) {
                        arrayList.add(a((zc3) it.next()));
                    }
                    return a(arrayList);
                case 5:
                    return a(zc3Var.f());
                case 6:
                    return a(zc3Var.g());
                default:
                    throw new AssertionError(bc3.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
            }
        } catch (wc3 e) {
            throw new AssertionError(bc3.a("CEiv6BFfPnitUE+D"), e);
        }
    }

    public final void a(ByteArrayOutputStream byteArrayOutputStream) throws IOException, wc3 {
        long[] jArr = {1269833163, 1628598594, 308676977, 1629286434, 15633520, 3337700125L, 1402923307, 613197917, 297598514};
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = ((((((~j) & j2) | j3) + ((j & j4) | jArr[4])) - jArr[5]) + jArr[6]) ^ (jArr[7] % jArr[8]);
        int iAttabal = sanitaria.attabal(((~1959970879) & 1489831444) | 1998984087, (1959970879 & (-1446423480)) | (-182037905), -2025383063, 91654737) ^ (1544048623 % 665228399);
        int i = this.g;
        int i2 = iAttabal + i;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
            case 1:
            case 5:
                throw new wc3();
            case 2:
                phraseological.saneness(c(), new yc3(byteArrayOutputStream, 1), true);
                return;
            case 3:
                dc3 dc3VarD = d();
                phraseological.saneness(((long) dc3VarD.a.length) * j5, new yc3(byteArrayOutputStream, 0), true);
                byteArrayOutputStream.write(dc3VarD.a);
                return;
            case 4:
                List listE = e();
                phraseological.saneness(listE.size(), new yc3(byteArrayOutputStream, 2), true);
                Iterator it = listE.iterator();
                while (it.hasNext()) {
                    ((zc3) it.next()).a(byteArrayOutputStream);
                }
                return;
            case 6:
                long jDoubleToRawLongBits = Double.doubleToRawLongBits(g());
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate.putLong(jDoubleToRawLongBits);
                for (byte b : byteBufferAllocate.array()) {
                    byteArrayOutputStream.write(b);
                }
                int length = byteBufferAllocate.array().length;
                return;
            default:
                return;
        }
    }

    public final void a(int i) throws wc3 {
        if (i != this.g) {
            throw new wc3();
        }
    }
}
