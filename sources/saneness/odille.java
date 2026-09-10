package saneness;

import ads_mobile_sdk.ir;
import ads_mobile_sdk.w81;
import ads_mobile_sdk.x81;
import ads_mobile_sdk.z43;

/* JADX INFO: loaded from: classes.dex */
public abstract class odille {
    public abstract z43 attabal(Object obj);

    public final boolean dern(int i, gutturalization gutturalizationVar, Object obj) throws x81 {
        ir irVar = (ir) gutturalizationVar;
        int i2 = irVar.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            irVar.b(0);
            ((z43) obj).a(i3 << 3, Long.valueOf(irVar.a.k()));
            return true;
        }
        if (i4 == 1) {
            irVar.b(1);
            ((z43) obj).a((i3 << 3) | 1, Long.valueOf(irVar.a.h()));
            return true;
        }
        if (i4 == 2) {
            irVar.b(2);
            ((z43) obj).a((i3 << 3) | 2, irVar.a.d());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new x81("Protocol message end-group tag did not match expected tag.");
            }
            if (i4 != 5) {
                int i5 = x81.b;
                throw new w81();
            }
            irVar.b(5);
            ((z43) obj).a(5 | (i3 << 3), Integer.valueOf(irVar.a.g()));
            return true;
        }
        z43 z43VarB = z43.b();
        int i6 = i3 << 3;
        int i7 = i6 | 4;
        int i8 = i + 1;
        if (i8 >= 100) {
            throw new x81("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (irVar.a() != Integer.MAX_VALUE && dern(i8, irVar, z43VarB)) {
        }
        if (i7 != irVar.b) {
            throw new x81("Protocol message end-group tag did not match expected tag.");
        }
        if (z43VarB.e) {
            z43VarB.e = false;
        }
        ((z43) obj).a(i6 | 3, z43VarB);
        return true;
    }

    public abstract void saneness(Object obj, Object obj2);

    public abstract void wireman(Object obj);
}
