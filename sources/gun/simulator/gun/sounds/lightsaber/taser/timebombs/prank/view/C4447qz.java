package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4447qz implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f4910a;

    public C4447qz(String[] strArr) {
        this.f4910a = strArr;
    }

    public final String a(String str) {
        AbstractC2995aW.q(str, "name");
        String[] strArr = this.f4910a;
        int length = strArr.length - 2;
        int iM = AbstractC2995aW.M(length, 0, -2);
        if (iM <= length) {
            while (true) {
                int i = length - 2;
                if (AbstractC3089ba0.o0(str, strArr[length])) {
                    return strArr[length + 1];
                }
                if (length != iM) {
                    length = i;
                }
            }
        }
        return null;
    }

    public final String b(int i) {
        return this.f4910a[i * 2];
    }

    public final C5036xh c() {
        C5036xh c5036xh = new C5036xh();
        ArrayList arrayList = c5036xh.f5240a;
        AbstractC2995aW.q(arrayList, "<this>");
        String[] strArr = this.f4910a;
        AbstractC2995aW.q(strArr, "elements");
        arrayList.addAll(U5.h0(strArr));
        return c5036xh;
    }

    public final TreeMap d() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        AbstractC2995aW.p(comparator, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(comparator);
        int size = size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            String strB = b(i);
            Locale locale = Locale.US;
            AbstractC2995aW.p(locale, "US");
            String lowerCase = strB.toLowerCase(locale);
            AbstractC2995aW.p(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(e(i));
            i = i2;
        }
        return treeMap;
    }

    public final String e(int i) {
        return this.f4910a[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4447qz) {
            if (Arrays.equals(this.f4910a, ((C4447qz) obj).f4910a)) {
                return true;
            }
        }
        return false;
    }

    public final List f(String str) {
        AbstractC2995aW.q(str, "name");
        int size = size();
        ArrayList arrayList = null;
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (AbstractC3089ba0.o0(str, b(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(e(i));
            }
            i = i2;
        }
        if (arrayList == null) {
            return C2812Uq.f3846a;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        AbstractC2995aW.p(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4910a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C4839vT[] c4839vTArr = new C4839vT[size];
        for (int i = 0; i < size; i++) {
            c4839vTArr[i] = new C4839vT(b(i), e(i));
        }
        return WD.B(c4839vTArr);
    }

    public final int size() {
        return this.f4910a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            String strB = b(i);
            String strE = e(i);
            sb.append(strB);
            sb.append(": ");
            if (Vg0.p(strB)) {
                strE = "██";
            }
            sb.append(strE);
            sb.append("\n");
            i = i2;
        }
        String string = sb.toString();
        AbstractC2995aW.p(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
