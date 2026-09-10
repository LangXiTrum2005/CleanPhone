package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r extends BQ implements InterfaceC3858kF {
    public final VE c;
    public final C3067bF d;

    public r(VE ve) {
        this.c = ve;
        this.d = ve.f3865a;
    }

    public static C5001xF Q(IF r1, String str) {
        C5001xF c5001xF = r1 instanceof C5001xF ? (C5001xF) r1 : null;
        if (c5001xF != null) {
            return c5001xF;
        }
        throw AbstractC2871Wx.I(-1, "Unexpected 'null' when " + str + " was expected");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BQ, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public boolean C() {
        return !(S() instanceof DF);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BQ
    public final boolean F(Object obj) {
        String str = (String) obj;
        AbstractC2995aW.q(str, "tag");
        IF ifT = T(str);
        if (!this.c.f3865a.c && Q(ifT, TypedValues.Custom.S_BOOLEAN).f5213a) {
            throw AbstractC2871Wx.J(-1, S().toString(), DM.B("Boolean literal for key '", str, "' should be unquoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON."));
        }
        try {
            Boolean boolP = AbstractC4496rb.p(ifT);
            if (boolP != null) {
                return boolP.booleanValue();
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException unused) {
            V(TypedValues.Custom.S_BOOLEAN);
            throw null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BQ
    public final byte G(Object obj) {
        String str = (String) obj;
        AbstractC2995aW.q(str, "tag");
        try {
            int i = Integer.parseInt(T(str).a());
            Byte bValueOf = (-128 > i || i > 127) ? null : Byte.valueOf((byte) i);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            V("byte");
            throw null;
        } catch (IllegalArgumentException unused) {
            V("byte");
            throw null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BQ
    public final char H(Object obj) {
        String str = (String) obj;
        AbstractC2995aW.q(str, "tag");
        try {
            String strA = T(str).a();
            AbstractC2995aW.q(strA, "<this>");
            int length = strA.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strA.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            V("char");
            throw null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BQ
    public final double I(Object obj) {
        String str = (String) obj;
        AbstractC2995aW.q(str, "tag");
        try {
            double d = Double.parseDouble(T(str).a());
            if (this.c.f3865a.k || !(Double.isInfinite(d) || Double.isNaN(d))) {
                return d;
            }
            Double dValueOf = Double.valueOf(d);
            String string = S().toString();
            AbstractC2995aW.q(string, "output");
            throw AbstractC2871Wx.I(-1, AbstractC2871Wx.u0(dValueOf, str, string));
        } catch (IllegalArgumentException unused) {
            V("double");
            throw null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BQ
    public final float J(Object obj) {
        String str = (String) obj;
        AbstractC2995aW.q(str, "tag");
        try {
            float f = Float.parseFloat(T(str).a());
            if (this.c.f3865a.k || !(Float.isInfinite(f) || Float.isNaN(f))) {
                return f;
            }
            Float fValueOf = Float.valueOf(f);
            String string = S().toString();
            AbstractC2995aW.q(string, "output");
            throw AbstractC2871Wx.I(-1, AbstractC2871Wx.u0(fValueOf, str, string));
        } catch (IllegalArgumentException unused) {
            V(TypedValues.Custom.S_FLOAT);
            throw null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BQ
    public final InterfaceC2548Kl K(Object obj, D40 d40) {
        String str = (String) obj;
        AbstractC2995aW.q(str, "tag");
        AbstractC2995aW.q(d40, "inlineDescriptor");
        if (Q90.a(d40)) {
            return new C3946lF(new T90(T(str).a()), this.c);
        }
        this.f2871a.add(str);
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BQ
    public final short L(Object obj) {
        String str = (String) obj;
        AbstractC2995aW.q(str, "tag");
        try {
            int i = Integer.parseInt(T(str).a());
            Short shValueOf = (-32768 > i || i > 32767) ? null : Short.valueOf((short) i);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            V("short");
            throw null;
        } catch (IllegalArgumentException unused) {
            V("short");
            throw null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BQ
    public final String M(Object obj) {
        String str = (String) obj;
        AbstractC2995aW.q(str, "tag");
        IF ifT = T(str);
        if (!this.c.f3865a.c && !Q(ifT, TypedValues.Custom.S_STRING).f5213a) {
            throw AbstractC2871Wx.J(-1, S().toString(), DM.B("String literal for key '", str, "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON."));
        }
        if (ifT instanceof DF) {
            throw AbstractC2871Wx.J(-1, S().toString(), "Unexpected 'null' value instead of string literal");
        }
        return ifT.a();
    }

    public abstract AbstractC4122nF R(String str);

    public final AbstractC4122nF S() {
        AbstractC4122nF abstractC4122nFR;
        String str = (String) AbstractC2853Wf.n0(this.f2871a);
        return (str == null || (abstractC4122nFR = R(str)) == null) ? U() : abstractC4122nFR;
    }

    public final IF T(String str) {
        AbstractC2995aW.q(str, "tag");
        AbstractC4122nF abstractC4122nFR = R(str);
        IF r1 = abstractC4122nFR instanceof IF ? (IF) abstractC4122nFR : null;
        if (r1 != null) {
            return r1;
        }
        throw AbstractC2871Wx.J(-1, S().toString(), "Expected JsonPrimitive at " + str + ", found " + abstractC4122nFR);
    }

    public abstract AbstractC4122nF U();

    public final void V(String str) {
        throw AbstractC2871Wx.J(-1, S().toString(), AbstractC3950lJ.r("Failed to parse '", str, '\''));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public final M40 a() {
        return this.c.b;
    }

    public void b(D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public InterfaceC4421qh c(D40 d40) {
        InterfaceC4421qh qf;
        AbstractC2995aW.q(d40, "descriptor");
        AbstractC4122nF abstractC4122nFS = S();
        L40 kind = d40.getKind();
        boolean zI = AbstractC2995aW.i(kind, C3442fa0.b);
        VE ve = this.c;
        if (zI || (kind instanceof AbstractC3786jV)) {
            if (!(abstractC4122nFS instanceof WE)) {
                throw AbstractC2871Wx.I(-1, "Expected " + AbstractC3263dY.a(WE.class) + " as the serialized body of " + d40.h() + ", but had " + AbstractC3263dY.a(abstractC4122nFS.getClass()));
            }
            qf = new QF(ve, (WE) abstractC4122nFS);
        } else if (AbstractC2995aW.i(kind, C3442fa0.c)) {
            D40 d40G = AbstractC4496rb.g(d40.g(0), ve.b);
            L40 kind2 = d40G.getKind();
            if ((kind2 instanceof DV) || AbstractC2995aW.i(kind2, K40.f3299a)) {
                if (!(abstractC4122nFS instanceof FF)) {
                    throw AbstractC2871Wx.I(-1, "Expected " + AbstractC3263dY.a(FF.class) + " as the serialized body of " + d40.h() + ", but had " + AbstractC3263dY.a(abstractC4122nFS.getClass()));
                }
                qf = new RF(ve, (FF) abstractC4122nFS);
            } else {
                if (!ve.f3865a.d) {
                    throw AbstractC2871Wx.H(d40G);
                }
                if (!(abstractC4122nFS instanceof WE)) {
                    throw AbstractC2871Wx.I(-1, "Expected " + AbstractC3263dY.a(WE.class) + " as the serialized body of " + d40.h() + ", but had " + AbstractC3263dY.a(abstractC4122nFS.getClass()));
                }
                qf = new QF(ve, (WE) abstractC4122nFS);
            }
        } else {
            if (!(abstractC4122nFS instanceof FF)) {
                throw AbstractC2871Wx.I(-1, "Expected " + AbstractC3263dY.a(FF.class) + " as the serialized body of " + d40.h() + ", but had " + AbstractC3263dY.a(abstractC4122nFS.getClass()));
            }
            qf = new PF(ve, (FF) abstractC4122nFS, null, null);
        }
        return qf;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3858kF
    public final VE d() {
        return this.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3858kF
    public final AbstractC4122nF g() {
        return S();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final Object j(InterfaceC2369Do interfaceC2369Do) {
        AbstractC2995aW.q(interfaceC2369Do, "deserializer");
        return AbstractC4496rb.m(this, interfaceC2369Do);
    }
}
