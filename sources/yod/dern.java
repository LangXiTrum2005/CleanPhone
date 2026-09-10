package yod;

import java.util.HashMap;

/* JADX INFO: compiled from: RemoveRepeatsStrategy.java */
/* JADX INFO: loaded from: classes3.dex */
public class dern implements wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f39739attabal;

    public dern(int i) {
        this.f39739attabal = i;
    }

    public static StackTraceElement[] dern(StackTraceElement[] stackTraceElementArr, int i) {
        int i2;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i3 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i3];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null || !saneness(stackTraceElementArr, num.intValue(), i3)) {
                stackTraceElementArr2[i4] = stackTraceElementArr[i3];
                i4++;
                i5 = 1;
                i2 = i3;
            } else {
                int iIntValue = i3 - num.intValue();
                if (i5 < i) {
                    System.arraycopy(stackTraceElementArr, i3, stackTraceElementArr2, i4, iIntValue);
                    i4 += iIntValue;
                    i5++;
                }
                i2 = (iIntValue - 1) + i3;
            }
            map.put(stackTraceElement, Integer.valueOf(i3));
            i3 = i2 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i4];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i4);
        return stackTraceElementArr3;
    }

    public static boolean saneness(StackTraceElement[] stackTraceElementArr, int i, int i2) {
        int i3 = i2 - i;
        if (i2 + i3 > stackTraceElementArr.length) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!stackTraceElementArr[i + i4].equals(stackTraceElementArr[i2 + i4])) {
                return false;
            }
        }
        return true;
    }

    @Override // yod.wireman
    public StackTraceElement[] attabal(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] stackTraceElementArrDern = dern(stackTraceElementArr, this.f39739attabal);
        return stackTraceElementArrDern.length < stackTraceElementArr.length ? stackTraceElementArrDern : stackTraceElementArr;
    }
}
