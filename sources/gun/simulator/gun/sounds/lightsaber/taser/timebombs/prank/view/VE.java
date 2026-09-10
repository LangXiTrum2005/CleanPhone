package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes4.dex */
public abstract class VE {
    public static final UE d = new UE(new C3067bF(false, false, false, false, false, true, "    ", false, false, "type", false, true), T40.f3752a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3067bF f3865a;
    public final M40 b;
    public final C3568gy c = new C3568gy();

    public VE(C3067bF c3067bF, M40 m40) {
        this.f3865a = c3067bF;
        this.b = m40;
    }

    public final Object a(InterfaceC4123nG interfaceC4123nG, String str) {
        AbstractC2995aW.q(str, TypedValues.Custom.S_STRING);
        T90 t90 = new T90(str);
        Object objJ = new O90(this, 1, t90, interfaceC4123nG.getDescriptor(), null).j(interfaceC4123nG);
        if (t90.g() == 10) {
            return objJ;
        }
        T90.p(t90, "Expected EOF after parsing, but had " + t90.e.charAt(t90.f3759a - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final String b(InterfaceC4123nG interfaceC4123nG, Object obj) {
        char[] cArr;
        NF nf = new NF();
        synchronized (C4415qe.f4892a) {
            S5 s5 = C4415qe.b;
            cArr = null;
            char[] cArr2 = (char[]) (s5.isEmpty() ? null : s5.removeLast());
            if (cArr2 != null) {
                C4415qe.c -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        nf.f3448a = cArr;
        try {
            WD.p(this, nf, interfaceC4123nG, obj);
            return nf.toString();
        } finally {
            nf.b();
        }
    }
}
