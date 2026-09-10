package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2085dD {
    public static String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final Map<String, WeakReference<C2084dC>> A01 = new HashMap();

    public static int A00() {
        Map<String, WeakReference<C2084dC>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static C2084dC A01(C2300gi c2300gi, AbstractC2465jd abstractC2465jd, int i2, InterfaceC2082dA interfaceC2082dA) {
        C2084dC c2084dC = new C2084dC(c2300gi, abstractC2465jd, c2300gi.A02().A0A(), i2);
        c2084dC.A0b(interfaceC2082dA);
        c2084dC.A0X();
        A01.put(abstractC2465jd.A1D(), new WeakReference<>(c2084dC));
        return c2084dC;
    }

    public static C2084dC A02(String str) {
        WeakReference<C2084dC> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC2465jd abstractC2465jd, C2084dC c2084dC) {
        A01.put(abstractC2465jd.A1D(), new WeakReference<>(c2084dC));
    }

    public static void A04(String str) {
        A01.remove(str);
    }
}
