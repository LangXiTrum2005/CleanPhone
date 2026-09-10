package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C2947b5 f22691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static F3 f22692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f22693c = new AtomicBoolean(false);

    public static void a() {
        LinkedHashMap linkedHashMap = O2.f23027a;
        if (((AdConfig) AbstractC3174p5.a("ads", "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null)).getPingV2().getEnabled() && f22693c.compareAndSet(false, true)) {
            Pa pa = new Pa();
            f22691a = new C2947b5(pa);
            f22692b = new F3(pa);
            C2947b5 c2947b5 = f22691a;
            if (c2947b5 != null) {
                O4 o4 = c2947b5.f23460e;
                o4.getClass();
                Ca ca = Ca.STARTED;
                if (o4.a(ca)) {
                    o4.d = ca;
                    o4.a();
                    o4.c();
                    o4.d();
                }
            }
            F3 f3 = f22692b;
            if (f3 != null) {
                W9 w9 = f3.f22807e;
                w9.getClass();
                Ca ca2 = Ca.STARTED;
                if (w9.a(ca2)) {
                    w9.d = ca2;
                    w9.a();
                }
            }
        }
    }
}
