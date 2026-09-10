package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0748Gs {
    public static String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final Map<String, WeakReference<C0747Gr>> A01 = new HashMap();

    public static int A00() {
        Map<String, WeakReference<C0747Gr>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static C0747Gr A01(C1828k1 c1828k1, AbstractC1984md abstractC1984md, int i, InterfaceC0745Gp interfaceC0745Gp) {
        C0747Gr c0747Gr = new C0747Gr(c1828k1, abstractC1984md, c1828k1.A02().A0A(), i);
        c0747Gr.A0b(interfaceC0745Gp);
        c0747Gr.A0X();
        A01.put(abstractC1984md.A0r(), new WeakReference<>(c0747Gr));
        return c0747Gr;
    }

    public static C0747Gr A02(String str) {
        WeakReference<C0747Gr> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC1984md abstractC1984md, C0747Gr c0747Gr) {
        A01.put(abstractC1984md.A0r(), new WeakReference<>(c0747Gr));
    }

    public static void A04(String str) {
        A01.remove(str);
    }
}
