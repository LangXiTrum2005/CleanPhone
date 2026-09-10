package ads_mobile_sdk;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import saneness.attraction;
import saneness.dehydration;
import saneness.impromptu;
import saneness.monofuel;
import saneness.needler;
import saneness.odille;
import saneness.prescient;
import saneness.transpositive;
import saneness.twybill;
import saneness.vavasour;

/* JADX INFO: loaded from: classes.dex */
public abstract class yk2 {
    public static final Class a;
    public static final odille b;
    public static final impromptu c;

    static {
        Class<?> cls;
        Class<?> cls2;
        odille odilleVar = null;
        if (sb.b) {
            cls = null;
        } else {
            try {
                cls = Class.forName("com.google.protobuf.GeneratedMessage");
            } catch (Throwable unused) {
                cls = null;
            }
        }
        a = cls;
        try {
            if (sb.b) {
                cls2 = null;
            } else {
                try {
                    cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
                } catch (Throwable unused2) {
                    cls2 = null;
                }
            }
            if (cls2 != null) {
                odilleVar = (odille) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = odilleVar;
        c = new impromptu();
    }

    public static int a(int i, transpositive transpositiveVar, attraction attractionVar) {
        return ((g) transpositiveVar).a(attractionVar) + (mr.h(i) * 2);
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iH = mr.h(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iH += mr.a((kn) list.get(i2));
        }
        return iH;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (mr.h(i) * size) + b(list);
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (mr.h(i) + 4) * size;
    }

    public static int e(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (mr.h(i) + 8) * size;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (mr.h(i) * size) + e(list);
    }

    public static int g(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (mr.h(i) * list.size()) + f(list);
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (mr.h(i) * size) + g(list);
    }

    public static int i(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (mr.h(i) * size) + h(list);
    }

    public static int j(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iH = mr.h(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof kn) {
                iH = mr.a((kn) obj) + iH;
            } else {
                int iA = t63.a((String) obj);
                iH = mr.i(iA) + iA + iH;
            }
        }
        return iH;
    }

    public static int k(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (mr.h(i) * size) + i(list);
    }

    public static int l(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (mr.h(i) * size) + j(list);
    }

    public static void m(int i, List list, vavasour vavasourVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nr nrVar = (nr) vavasourVar;
        nrVar.getClass();
        int i2 = 0;
        if (!(list instanceof j21)) {
            if (!z) {
                while (i2 < list.size()) {
                    nrVar.a.h(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            nrVar.a.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += mr.i(((Integer) list.get(i4)).intValue());
            }
            nrVar.a.m(i3);
            while (i2 < list.size()) {
                nrVar.a.m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        j21 j21Var = (j21) list;
        if (!z) {
            while (i2 < j21Var.c) {
                mr mrVar = nrVar.a;
                j21Var.d(i2);
                mrVar.h(i, j21Var.b[i2]);
                i2++;
            }
            return;
        }
        nrVar.a.g(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < j21Var.c; i6++) {
            j21Var.d(i6);
            i5 += mr.i(j21Var.b[i6]);
        }
        nrVar.a.m(i5);
        while (i2 < j21Var.c) {
            mr mrVar2 = nrVar.a;
            j21Var.d(i2);
            mrVar2.m(j21Var.b[i2]);
            i2++;
        }
    }

    public static void n(int i, List list, vavasour vavasourVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nr nrVar = (nr) vavasourVar;
        nrVar.getClass();
        int i2 = 0;
        if (!(list instanceof qc1)) {
            if (!z) {
                while (i2 < list.size()) {
                    nrVar.a.e(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            nrVar.a.g(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iA += mr.a(((Long) list.get(i3)).longValue());
            }
            nrVar.a.m(iA);
            while (i2 < list.size()) {
                nrVar.a.d(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        qc1 qc1Var = (qc1) list;
        if (!z) {
            while (i2 < qc1Var.c) {
                mr mrVar = nrVar.a;
                qc1Var.c(i2);
                mrVar.e(i, qc1Var.b[i2]);
                i2++;
            }
            return;
        }
        nrVar.a.g(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < qc1Var.c; i4++) {
            qc1Var.c(i4);
            iA2 += mr.a(qc1Var.b[i4]);
        }
        nrVar.a.m(iA2);
        while (i2 < qc1Var.c) {
            mr mrVar2 = nrVar.a;
            qc1Var.c(i2);
            mrVar2.d(qc1Var.b[i2]);
            i2++;
        }
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (mr.h(i) + 1) * size;
    }

    public static int d(List list) {
        return list.size() * 8;
    }

    public static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j21)) {
            int iA = 0;
            while (i < size) {
                iA += mr.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iA;
        }
        j21 j21Var = (j21) list;
        int iA2 = 0;
        while (i < size) {
            j21Var.d(i);
            iA2 += mr.a(j21Var.b[i]);
            i++;
        }
        return iA2;
    }

    public static int c(List list) {
        return list.size() * 4;
    }

    public static void d(int i, List list, vavasour vavasourVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nr nrVar = (nr) vavasourVar;
        nrVar.getClass();
        int i2 = 0;
        if (!(list instanceof j21)) {
            if (z) {
                nrVar.a.g(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).getClass();
                    boolean z2 = mr.b;
                    i3 += 4;
                }
                nrVar.a.m(i3);
                while (i2 < list.size()) {
                    nrVar.a.k(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                nrVar.a.e(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        j21 j21Var = (j21) list;
        if (z) {
            nrVar.a.g(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < j21Var.c; i6++) {
                j21Var.d(i6);
                int i7 = j21Var.b[i6];
                boolean z3 = mr.b;
                i5 += 4;
            }
            nrVar.a.m(i5);
            while (i2 < j21Var.c) {
                mr mrVar = nrVar.a;
                j21Var.d(i2);
                mrVar.k(j21Var.b[i2]);
                i2++;
            }
            return;
        }
        while (i2 < j21Var.c) {
            mr mrVar2 = nrVar.a;
            j21Var.d(i2);
            mrVar2.e(i, j21Var.b[i2]);
            i2++;
        }
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof qc1)) {
            int iA = 0;
            while (i < size) {
                iA += mr.a(((Long) list.get(i)).longValue());
                i++;
            }
            return iA;
        }
        qc1 qc1Var = (qc1) list;
        int iA2 = 0;
        while (i < size) {
            qc1Var.c(i);
            iA2 += mr.a(qc1Var.b[i]);
            i++;
        }
        return iA2;
    }

    public static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j21)) {
            int i2 = 0;
            while (i < size) {
                i2 += mr.i(mr.j(((Integer) list.get(i)).intValue()));
                i++;
            }
            return i2;
        }
        j21 j21Var = (j21) list;
        int i3 = 0;
        while (i < size) {
            j21Var.d(i);
            i3 += mr.i(mr.j(j21Var.b[i]));
            i++;
        }
        return i3;
    }

    public static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof qc1)) {
            int iA = 0;
            while (i < size) {
                iA += mr.a(mr.b(((Long) list.get(i)).longValue()));
                i++;
            }
            return iA;
        }
        qc1 qc1Var = (qc1) list;
        int iA2 = 0;
        while (i < size) {
            qc1Var.c(i);
            iA2 += mr.a(mr.b(qc1Var.b[i]));
            i++;
        }
        return iA2;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j21)) {
            int i2 = 0;
            while (i < size) {
                i2 += mr.i(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        j21 j21Var = (j21) list;
        int i3 = 0;
        while (i < size) {
            j21Var.d(i);
            i3 += mr.i(j21Var.b[i]);
            i++;
        }
        return i3;
    }

    public static void k(int i, List list, vavasour vavasourVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nr nrVar = (nr) vavasourVar;
        nrVar.getClass();
        int i2 = 0;
        if (!(list instanceof j21)) {
            if (z) {
                nrVar.a.g(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += mr.i(mr.j(((Integer) list.get(i4)).intValue()));
                }
                nrVar.a.m(i3);
                while (i2 < list.size()) {
                    nrVar.a.m(mr.j(((Integer) list.get(i2)).intValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                nrVar.a.h(i, mr.j(((Integer) list.get(i2)).intValue()));
                i2++;
            }
            return;
        }
        j21 j21Var = (j21) list;
        if (z) {
            nrVar.a.g(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < j21Var.c; i6++) {
                j21Var.d(i6);
                i5 += mr.i(mr.j(j21Var.b[i6]));
            }
            nrVar.a.m(i5);
            while (i2 < j21Var.c) {
                mr mrVar = nrVar.a;
                j21Var.d(i2);
                mrVar.m(mr.j(j21Var.b[i2]));
                i2++;
            }
            return;
        }
        while (i2 < j21Var.c) {
            mr mrVar2 = nrVar.a;
            j21Var.d(i2);
            mrVar2.h(i, mr.j(j21Var.b[i2]));
            i2++;
        }
    }

    public static void l(int i, List list, vavasour vavasourVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nr nrVar = (nr) vavasourVar;
        nrVar.getClass();
        int i2 = 0;
        if (!(list instanceof qc1)) {
            if (z) {
                nrVar.a.g(i, 2);
                int iA = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    iA += mr.a(mr.b(((Long) list.get(i3)).longValue()));
                }
                nrVar.a.m(iA);
                while (i2 < list.size()) {
                    nrVar.a.d(mr.b(((Long) list.get(i2)).longValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                nrVar.a.e(i, mr.b(((Long) list.get(i2)).longValue()));
                i2++;
            }
            return;
        }
        qc1 qc1Var = (qc1) list;
        if (z) {
            nrVar.a.g(i, 2);
            int iA2 = 0;
            for (int i4 = 0; i4 < qc1Var.c; i4++) {
                qc1Var.c(i4);
                iA2 += mr.a(mr.b(qc1Var.b[i4]));
            }
            nrVar.a.m(iA2);
            while (i2 < qc1Var.c) {
                mr mrVar = nrVar.a;
                qc1Var.c(i2);
                mrVar.d(mr.b(qc1Var.b[i2]));
                i2++;
            }
            return;
        }
        while (i2 < qc1Var.c) {
            mr mrVar2 = nrVar.a;
            qc1Var.c(i2);
            mrVar2.e(i, mr.b(qc1Var.b[i2]));
            i2++;
        }
    }

    public static int a(List list) {
        return list.size();
    }

    public static int b(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j21)) {
            int iA = 0;
            while (i < size) {
                iA += mr.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iA;
        }
        j21 j21Var = (j21) list;
        int iA2 = 0;
        while (i < size) {
            j21Var.d(i);
            iA2 += mr.a(j21Var.b[i]);
            i++;
        }
        return iA2;
    }

    public static void c(int i, List list, vavasour vavasourVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nr nrVar = (nr) vavasourVar;
        nrVar.getClass();
        int i2 = 0;
        if (!(list instanceof j21)) {
            if (z) {
                nrVar.a.g(i, 2);
                int iA = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    iA += mr.a(((Integer) list.get(i3)).intValue());
                }
                nrVar.a.m(iA);
                while (i2 < list.size()) {
                    nrVar.a.l(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                nrVar.a.f(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        j21 j21Var = (j21) list;
        if (z) {
            nrVar.a.g(i, 2);
            int iA2 = 0;
            for (int i4 = 0; i4 < j21Var.c; i4++) {
                j21Var.d(i4);
                iA2 += mr.a(j21Var.b[i4]);
            }
            nrVar.a.m(iA2);
            while (i2 < j21Var.c) {
                mr mrVar = nrVar.a;
                j21Var.d(i2);
                mrVar.l(j21Var.b[i2]);
                i2++;
            }
            return;
        }
        while (i2 < j21Var.c) {
            mr mrVar2 = nrVar.a;
            j21Var.d(i2);
            mrVar2.f(i, j21Var.b[i2]);
            i2++;
        }
    }

    public static int a(int i, List list, attraction attractionVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iA += a(i, (transpositive) list.get(i2), attractionVar);
        }
        return iA;
    }

    public static int a(int i, attraction attractionVar, Object obj) {
        int iH = mr.h(i);
        int iA = ((g) obj).a(attractionVar);
        return mr.i(iA) + iA + iH;
    }

    public static int j(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof qc1)) {
            int iA = 0;
            while (i < size) {
                iA += mr.a(((Long) list.get(i)).longValue());
                i++;
            }
            return iA;
        }
        qc1 qc1Var = (qc1) list;
        int iA2 = 0;
        while (i < size) {
            qc1Var.c(i);
            iA2 += mr.a(qc1Var.b[i]);
            i++;
        }
        return iA2;
    }

    public static void e(int i, List list, vavasour vavasourVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nr nrVar = (nr) vavasourVar;
        nrVar.getClass();
        int i2 = 0;
        if (!(list instanceof qc1)) {
            if (z) {
                nrVar.a.g(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    boolean z2 = mr.b;
                    i3 += 8;
                }
                nrVar.a.m(i3);
                while (i2 < list.size()) {
                    nrVar.a.c(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                nrVar.a.d(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        qc1 qc1Var = (qc1) list;
        if (z) {
            nrVar.a.g(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < qc1Var.c; i6++) {
                qc1Var.c(i6);
                long j = qc1Var.b[i6];
                boolean z3 = mr.b;
                i5 += 8;
            }
            nrVar.a.m(i5);
            while (i2 < qc1Var.c) {
                mr mrVar = nrVar.a;
                qc1Var.c(i2);
                mrVar.c(qc1Var.b[i2]);
                i2++;
            }
            return;
        }
        while (i2 < qc1Var.c) {
            mr mrVar2 = nrVar.a;
            qc1Var.c(i2);
            mrVar2.d(i, qc1Var.b[i2]);
            i2++;
        }
    }

    public static void i(int i, List list, vavasour vavasourVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nr nrVar = (nr) vavasourVar;
        nrVar.getClass();
        int i2 = 0;
        if (!(list instanceof j21)) {
            if (z) {
                nrVar.a.g(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).getClass();
                    boolean z2 = mr.b;
                    i3 += 4;
                }
                nrVar.a.m(i3);
                while (i2 < list.size()) {
                    nrVar.a.k(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                nrVar.a.e(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        j21 j21Var = (j21) list;
        if (z) {
            nrVar.a.g(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < j21Var.c; i6++) {
                j21Var.d(i6);
                int i7 = j21Var.b[i6];
                boolean z3 = mr.b;
                i5 += 4;
            }
            nrVar.a.m(i5);
            while (i2 < j21Var.c) {
                mr mrVar = nrVar.a;
                j21Var.d(i2);
                mrVar.k(j21Var.b[i2]);
                i2++;
            }
            return;
        }
        while (i2 < j21Var.c) {
            mr mrVar2 = nrVar.a;
            j21Var.d(i2);
            mrVar2.e(i, j21Var.b[i2]);
            i2++;
        }
    }

    public static Object a(Object obj, int i, prescient prescientVar, monofuel monofuelVar, Object obj2, odille odilleVar) {
        if (monofuelVar == null) {
            return obj2;
        }
        if (prescientVar instanceof RandomAccess) {
            int size = prescientVar.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) prescientVar.get(i3);
                int iIntValue = num.intValue();
                if (monofuelVar.a(iIntValue)) {
                    if (i3 != i2) {
                        prescientVar.set(i2, num);
                    }
                    i2++;
                } else {
                    obj2 = a(obj, i, iIntValue, obj2, odilleVar);
                }
            }
            if (i2 != size) {
                prescientVar.subList(i2, size).clear();
            }
            return obj2;
        }
        Iterator it = prescientVar.iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((Integer) it.next()).intValue();
            if (!monofuelVar.a(iIntValue2)) {
                obj2 = a(obj, i, iIntValue2, obj2, odilleVar);
                it.remove();
            }
        }
        return obj2;
    }

    public static void f(int i, List list, vavasour vavasourVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nr nrVar = (nr) vavasourVar;
        nrVar.getClass();
        int i2 = 0;
        if (list instanceof needler) {
            if (z) {
                nrVar.a.g(i, 2);
                nrVar.a.m(0);
                return;
            }
            return;
        }
        if (z) {
            nrVar.a.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                boolean z2 = mr.b;
                i3 += 4;
            }
            nrVar.a.m(i3);
            while (i2 < list.size()) {
                mr mrVar = nrVar.a;
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                mrVar.getClass();
                mrVar.k(Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            mr mrVar2 = nrVar.a;
            float fFloatValue2 = ((Float) list.get(i2)).floatValue();
            mrVar2.getClass();
            mrVar2.e(i, Float.floatToRawIntBits(fFloatValue2));
            i2++;
        }
    }

    public static void g(int i, List list, vavasour vavasourVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nr nrVar = (nr) vavasourVar;
        nrVar.getClass();
        int i2 = 0;
        if (!(list instanceof j21)) {
            if (z) {
                nrVar.a.g(i, 2);
                int iA = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    iA += mr.a(((Integer) list.get(i3)).intValue());
                }
                nrVar.a.m(iA);
                while (i2 < list.size()) {
                    nrVar.a.l(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                nrVar.a.f(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        j21 j21Var = (j21) list;
        if (z) {
            nrVar.a.g(i, 2);
            int iA2 = 0;
            for (int i4 = 0; i4 < j21Var.c; i4++) {
                j21Var.d(i4);
                iA2 += mr.a(j21Var.b[i4]);
            }
            nrVar.a.m(iA2);
            while (i2 < j21Var.c) {
                mr mrVar = nrVar.a;
                j21Var.d(i2);
                mrVar.l(j21Var.b[i2]);
                i2++;
            }
            return;
        }
        while (i2 < j21Var.c) {
            mr mrVar2 = nrVar.a;
            j21Var.d(i2);
            mrVar2.f(i, j21Var.b[i2]);
            i2++;
        }
    }

    public static void h(int i, List list, vavasour vavasourVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nr nrVar = (nr) vavasourVar;
        nrVar.getClass();
        int i2 = 0;
        if (!(list instanceof qc1)) {
            if (z) {
                nrVar.a.g(i, 2);
                int iA = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    iA += mr.a(((Long) list.get(i3)).longValue());
                }
                nrVar.a.m(iA);
                while (i2 < list.size()) {
                    nrVar.a.d(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                nrVar.a.e(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        qc1 qc1Var = (qc1) list;
        if (z) {
            nrVar.a.g(i, 2);
            int iA2 = 0;
            for (int i4 = 0; i4 < qc1Var.c; i4++) {
                qc1Var.c(i4);
                iA2 += mr.a(qc1Var.b[i4]);
            }
            nrVar.a.m(iA2);
            while (i2 < qc1Var.c) {
                mr mrVar = nrVar.a;
                qc1Var.c(i2);
                mrVar.d(qc1Var.b[i2]);
                i2++;
            }
            return;
        }
        while (i2 < qc1Var.c) {
            mr mrVar2 = nrVar.a;
            qc1Var.c(i2);
            mrVar2.e(i, qc1Var.b[i2]);
            i2++;
        }
    }

    public static int b(int i, List list, attraction attractionVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iH = mr.h(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int iA = ((g) list.get(i2)).a(attractionVar);
            iH += mr.i(iA) + iA;
        }
        return iH;
    }

    public static void j(int i, List list, vavasour vavasourVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nr nrVar = (nr) vavasourVar;
        nrVar.getClass();
        int i2 = 0;
        if (!(list instanceof qc1)) {
            if (z) {
                nrVar.a.g(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    boolean z2 = mr.b;
                    i3 += 8;
                }
                nrVar.a.m(i3);
                while (i2 < list.size()) {
                    nrVar.a.c(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                nrVar.a.d(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        qc1 qc1Var = (qc1) list;
        if (z) {
            nrVar.a.g(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < qc1Var.c; i6++) {
                qc1Var.c(i6);
                long j = qc1Var.b[i6];
                boolean z3 = mr.b;
                i5 += 8;
            }
            nrVar.a.m(i5);
            while (i2 < qc1Var.c) {
                mr mrVar = nrVar.a;
                qc1Var.c(i2);
                mrVar.c(qc1Var.b[i2]);
                i2++;
            }
            return;
        }
        while (i2 < qc1Var.c) {
            mr mrVar2 = nrVar.a;
            qc1Var.c(i2);
            mrVar2.d(i, qc1Var.b[i2]);
            i2++;
        }
    }

    public static void b(int i, List list, vavasour vavasourVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nr nrVar = (nr) vavasourVar;
        nrVar.getClass();
        int i2 = 0;
        if (list instanceof dehydration) {
            if (z) {
                nrVar.a.g(i, 2);
                nrVar.a.m(0);
                return;
            }
            return;
        }
        if (z) {
            nrVar.a.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                boolean z2 = mr.b;
                i3 += 8;
            }
            nrVar.a.m(i3);
            while (i2 < list.size()) {
                mr mrVar = nrVar.a;
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                mrVar.getClass();
                mrVar.c(Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            mr mrVar2 = nrVar.a;
            double dDoubleValue2 = ((Double) list.get(i2)).doubleValue();
            mrVar2.getClass();
            mrVar2.d(i, Double.doubleToRawLongBits(dDoubleValue2));
            i2++;
        }
    }

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
    public static void a(odille odilleVar, Object obj, Object obj2) {
        ((impromptu) odilleVar).getClass();
        xm0 xm0Var = (xm0) obj;
        z43 z43VarA = xm0Var.b;
        z43 z43Var = ((xm0) obj2).b;
        z43 z43Var2 = z43.f;
        if (!z43Var2.equals(z43Var)) {
            if (z43Var2.equals(z43VarA)) {
                z43VarA = z43.a(z43VarA, z43Var);
            } else {
                z43VarA.getClass();
                if (!z43Var.equals(z43Var2)) {
                    if (z43VarA.e) {
                        int i = z43VarA.a + z43Var.a;
                        z43VarA.a(i);
                        System.arraycopy(z43Var.b, 0, z43VarA.b, z43VarA.a, z43Var.a);
                        System.arraycopy(z43Var.c, 0, z43VarA.c, z43VarA.a, z43Var.a);
                        z43VarA.a = i;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        xm0Var.b = z43VarA;
    }

    public static void b(int i, List list, vavasour vavasourVar, attraction attractionVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nr nrVar = (nr) vavasourVar;
        nrVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            nrVar.b(i, attractionVar, list.get(i2));
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void b(int i, List list, vavasour vavasourVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nr nrVar = (nr) vavasourVar;
        nrVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            nrVar.a.b((String) list.get(i2), i);
        }
    }

    public static Object a(Object obj, int i, int i2, Object obj2, odille odilleVar) {
        if (obj2 == null) {
            obj2 = odilleVar.attabal(obj);
        }
        ((impromptu) odilleVar).getClass();
        ((z43) obj2).a(i << 3, Long.valueOf(i2));
        return obj2;
    }

    public static void a(int i, List list, vavasour vavasourVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nr nrVar = (nr) vavasourVar;
        nrVar.getClass();
        int i2 = 0;
        if (list instanceof twybill) {
            if (z) {
                nrVar.a.g(i, 2);
                nrVar.a.m(0);
                return;
            }
            return;
        }
        if (z) {
            nrVar.a.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                boolean z2 = mr.b;
                i3++;
            }
            nrVar.a.m(i3);
            while (i2 < list.size()) {
                nrVar.a.a(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            nrVar.a.a(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    public static void a(int i, List list, vavasour vavasourVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nr nrVar = (nr) vavasourVar;
        nrVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            nrVar.a.b(i, (kn) list.get(i2));
        }
    }

    public static void a(int i, List list, vavasour vavasourVar, attraction attractionVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nr nrVar = (nr) vavasourVar;
        nrVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            nrVar.a(i, attractionVar, list.get(i2));
        }
    }
}
