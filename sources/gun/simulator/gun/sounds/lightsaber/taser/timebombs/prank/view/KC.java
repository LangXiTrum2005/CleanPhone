package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class KC extends AbstractC4822vC implements Set {
    public transient AC b;

    public static int h(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static KC i(int i, Object... objArr) {
        if (i == 0) {
            return C4492rY.i;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C4376q70(obj);
        }
        int iH = h(i);
        Object[] objArr2 = new Object[iH];
        int i2 = iH - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i5);
                throw new NullPointerException(sb.toString());
            }
            int iHashCode = obj2.hashCode();
            int iB0 = FW.b0(iHashCode);
            while (true) {
                int i6 = iB0 & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iB0++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C4376q70(obj4);
        }
        if (h(i4) < iH / 2) {
            return i(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new C4492rY(objArr, i3, objArr2, i2, i4);
    }

    public static KC j(Set set) {
        if ((set instanceof KC) && !(set instanceof SortedSet)) {
            KC kc = (KC) set;
            if (!kc.f()) {
                return kc;
            }
        }
        Object[] array = set.toArray();
        return i(array.length, array);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    public AC a() {
        AC ac = this.b;
        if (ac != null) {
            return ac;
        }
        AC acK = k();
        this.b = acK;
        return acK;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof KC) && (this instanceof C4492rY)) {
            KC kc = (KC) obj;
            kc.getClass();
            if ((kc instanceof C4492rY) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return AbstractC2995aW.x(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC2995aW.R(this);
    }

    public AC k() {
        Object[] array = toArray(AbstractC4822vC.f5124a);
        C5086yC c5086yC = AC.b;
        return AC.h(array.length, array);
    }
}
