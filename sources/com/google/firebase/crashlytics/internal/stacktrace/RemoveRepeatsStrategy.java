package com.google.firebase.crashlytics.internal.stacktrace;

import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class RemoveRepeatsStrategy implements StackTraceTrimmingStrategy {
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    @Override // com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy
    public final StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int i2;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i4];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null) {
                stackTraceElementArr2[i5] = stackTraceElementArr[i4];
                i5++;
                i3 = 1;
                i2 = i4;
                break;
                break;
            }
            int iIntValue = num.intValue();
            int i6 = i4 - iIntValue;
            if (i4 + i6 <= stackTraceElementArr.length) {
                int i7 = 0;
                while (true) {
                    if (i7 >= i6) {
                        int iIntValue2 = i4 - num.intValue();
                        if (i3 < 10) {
                            System.arraycopy(stackTraceElementArr, i4, stackTraceElementArr2, i5, iIntValue2);
                            i5 += iIntValue2;
                            i3++;
                        }
                        i2 = (iIntValue2 - 1) + i4;
                        break;
                    }
                    if (!stackTraceElementArr[iIntValue + i7].equals(stackTraceElementArr[i4 + i7])) {
                        stackTraceElementArr2[i5] = stackTraceElementArr[i4];
                        i5++;
                        i3 = 1;
                        i2 = i4;
                        break;
                        break;
                    }
                    i7++;
                }
            } else {
                stackTraceElementArr2[i5] = stackTraceElementArr[i4];
                i5++;
                i3 = 1;
                i2 = i4;
                break;
            }
            map.put(stackTraceElement, Integer.valueOf(i4));
            i4 = i2 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i5];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i5);
        return i5 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }
}
