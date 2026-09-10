package b2;

import cc.v1;
import com.applovin.impl.e8;
import com.applovin.impl.f8;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import oa.m1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5302a;

    public /* synthetic */ j(int i10) {
        this.f5302a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5302a) {
            case 0:
                return l.b(((k) obj).f5311a.f5296c, ((k) obj2).f5311a.f5296c);
            case 1:
                return e8.a((f8) obj, (f8) obj2);
            case 2:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 3:
                String name = ((File) obj).getName();
                int i10 = fc.d.f40770f;
                return name.substring(0, i10).compareTo(((File) obj2).getName().substring(0, i10));
            case 4:
                return ((i1.p) obj2).f42640j - ((i1.p) obj).f42640j;
            case 5:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 6:
                return Integer.compare(((i2.f) ((List) obj).get(0)).f42771f, ((i2.f) ((List) obj2).get(0)).f42771f);
            case 7:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i11 = 11;
                return oa.w.f(i2.o.c((i2.o) Collections.max(list, new j(10)), (i2.o) Collections.max(list2, new j(10)))).a(list.size(), list2.size()).b((i2.o) Collections.max(list, new j(i11)), (i2.o) Collections.max(list2, new j(i11)), new j(i11)).e();
            case 8:
                return ((i2.e) Collections.max((List) obj)).compareTo((i2.e) Collections.max((List) obj2));
            case 9:
                return ((i2.l) ((List) obj).get(0)).compareTo((i2.l) ((List) obj2).get(0));
            case 10:
                return i2.o.c((i2.o) obj, (i2.o) obj2);
            case 11:
                i2.o oVar = (i2.o) obj;
                i2.o oVar2 = (i2.o) obj2;
                boolean z10 = oVar.f42800e;
                int i12 = oVar.f42805j;
                m1 m1VarD = (z10 && oVar.f42803h) ? i2.p.f42818k : i2.p.f42818k.d();
                oVar.f42801f.getClass();
                return oa.y.f47346a.b(Integer.valueOf(oVar.f42806k), Integer.valueOf(oVar2.f42806k), m1VarD).b(Integer.valueOf(i12), Integer.valueOf(oVar2.f42805j), m1VarD).e();
            case 12:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i13 = 0; i13 < bArr.length; i13++) {
                    byte b10 = bArr[i13];
                    byte b11 = bArr2[i13];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 13:
                return ((j2.r) obj).f43684a - ((j2.r) obj2).f43684a;
            case 14:
                return Float.compare(((j2.r) obj).f43686c, ((j2.r) obj2).f43686c);
            case 15:
                return Integer.compare(((l3.d) obj2).f44976b, ((l3.d) obj).f44976b);
            case 16:
                t1.b bVar = (t1.b) obj;
                t1.b bVar2 = (t1.b) obj2;
                int iCompare = Integer.compare(bVar.f50337c, bVar2.f50337c);
                return iCompare != 0 ? iCompare : bVar.f50336b.compareTo(bVar2.f50336b);
            case 17:
                return Integer.compare(((t3.d) obj).f50466a.f50469b, ((t3.d) obj2).f50466a.f50469b);
            case 18:
                return Long.compare(((t3.c) obj).f50463b, ((t3.c) obj2).f50463b);
            case 19:
                s7.c cVar = (s7.c) obj;
                s7.c o6 = (s7.c) obj2;
                if (v7.a.b(t7.c.class)) {
                    return 0;
                }
                try {
                    kotlin.jvm.internal.n.e(o6, "o2");
                    cVar.getClass();
                    Long l = cVar.f50209g;
                    if (l != null) {
                        long jLongValue = l.longValue();
                        Long l10 = o6.f50209g;
                        if (l10 != null) {
                            long jLongValue2 = l10.longValue();
                            if (jLongValue2 >= jLongValue) {
                                if (jLongValue2 == jLongValue) {
                                    return 0;
                                }
                            }
                        }
                        return 1;
                    }
                    return -1;
                } catch (Throwable th2) {
                    v7.a.a(t7.c.class, th2);
                    return 0;
                }
            case 20:
                s7.c cVar2 = (s7.c) obj;
                s7.c o7 = (s7.c) obj2;
                kotlin.jvm.internal.n.e(o7, "o2");
                cVar2.getClass();
                Long l11 = cVar2.f50209g;
                if (l11 != null) {
                    long jLongValue3 = l11.longValue();
                    Long l12 = o7.f50209g;
                    if (l12 != null) {
                        long jLongValue4 = l12.longValue();
                        if (jLongValue4 >= jLongValue3) {
                            if (jLongValue4 == jLongValue3) {
                                return 0;
                            }
                        }
                    }
                    return 1;
                }
                return -1;
            case 21:
                return ((w1.e) obj).f52770a.compareTo(((w1.e) obj2).f52770a);
            case 22:
                w7.a aVar = (w7.a) obj;
                w7.a o10 = (w7.a) obj2;
                kotlin.jvm.internal.n.e(o10, "o2");
                aVar.getClass();
                Long l13 = aVar.f52993c;
                if (l13 == null) {
                    return -1;
                }
                long jLongValue5 = l13.longValue();
                Long l14 = o10.f52993c;
                if (l14 != null) {
                    long jLongValue6 = l14.longValue();
                    if (jLongValue6 < jLongValue5) {
                        return -1;
                    }
                    if (jLongValue6 == jLongValue5) {
                        return 0;
                    }
                }
                return 1;
            case 23:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            default:
                return ((cc.h0) ((v1) obj)).f6104a.compareTo(((cc.h0) ((v1) obj2)).f6104a);
        }
    }
}
