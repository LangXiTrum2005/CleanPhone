package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1916dD {
    public static String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final Map<String, WeakReference<C1915dC>> A01 = new HashMap();

    public static int A00() {
        Map<String, WeakReference<C1915dC>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static C1915dC A01(C2131gi c2131gi, AbstractC2296jd abstractC2296jd, int i, InterfaceC1913dA interfaceC1913dA) {
        C1915dC c1915dC = new C1915dC(c2131gi, abstractC2296jd, c2131gi.A02().A0A(), i);
        c1915dC.A0b(interfaceC1913dA);
        c1915dC.A0X();
        A01.put(abstractC2296jd.A1D(), new WeakReference<>(c1915dC));
        return c1915dC;
    }

    public static C1915dC A02(String str) {
        WeakReference<C1915dC> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC2296jd abstractC2296jd, C1915dC c1915dC) {
        A01.put(abstractC2296jd.A1D(), new WeakReference<>(c1915dC));
    }

    public static void A04(String str) {
        A01.remove(str);
    }
}
