package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class VF {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T90 f3866a;
    public final boolean b;
    public int c;

    public VF(C3067bF c3067bF, T90 t90) {
        AbstractC2995aW.q(c3067bF, "configuration");
        AbstractC2995aW.q(t90, "lexer");
        this.f3866a = t90;
        this.b = c3067bF.c;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(VF vf, C2755Sl c2755Sl, InterfaceC2857Wj interfaceC2857Wj) {
        UF uf;
        byte bH;
        C2755Sl c2755Sl2;
        LinkedHashMap linkedHashMap;
        VF vf2;
        byte bG;
        T90 t90;
        vf.getClass();
        if (interfaceC2857Wj instanceof UF) {
            uf = (UF) interfaceC2857Wj;
            int i = uf.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                uf.g = i - Integer.MIN_VALUE;
            } else {
                uf = new UF(vf, interfaceC2857Wj);
            }
        } else {
            uf = new UF(vf, interfaceC2857Wj);
        }
        Object obj = uf.e;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = uf.g;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = uf.d;
            linkedHashMap = uf.c;
            vf2 = uf.b;
            c2755Sl2 = uf.f3816a;
            AbstractC3375el.b0(obj);
            linkedHashMap.put(str, (AbstractC4122nF) obj);
            bG = vf2.f3866a.g();
            if (bG == 4) {
                bH = bG;
                vf = vf2;
            } else if (bG != 7) {
                T90.p(vf2.f3866a, "Expected end of the object or comma", 0, null, 6);
                throw null;
            }
            t90 = vf2.f3866a;
            if (bG == 6) {
                t90.h((byte) 7);
            } else if (bG == 4) {
                T90.p(t90, "Unexpected trailing comma", 0, null, 6);
                throw null;
            }
            return new FF(linkedHashMap);
        }
        AbstractC3375el.b0(obj);
        T90 t91 = vf.f3866a;
        bH = t91.h((byte) 6);
        if (t91.s() == 4) {
            T90.p(t91, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        c2755Sl2 = c2755Sl;
        linkedHashMap = new LinkedHashMap();
        T90 t92 = vf.f3866a;
        if (!t92.b()) {
            byte b = bH;
            vf2 = vf;
            bG = b;
            t90 = vf2.f3866a;
            if (bG == 6) {
                t90.h((byte) 7);
            } else if (bG == 4) {
                T90.p(t90, "Unexpected trailing comma", 0, null, 6);
                throw null;
            }
            return new FF(linkedHashMap);
        }
        String strL = vf.b ? t92.l() : t92.k();
        t92.h((byte) 5);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        uf.f3816a = c2755Sl2;
        uf.b = vf;
        uf.c = linkedHashMap;
        uf.d = strL;
        uf.g = 1;
        c2755Sl2.getClass();
        c2755Sl2.c = uf;
        c2755Sl2.b = c5033xf0;
        return enumC4602sk;
    }

    public final AbstractC4122nF b() {
        AbstractC4122nF ff;
        Object obj;
        Object objInvoke;
        T90 t90 = this.f3866a;
        byte bS = t90.s();
        if (bS == 1) {
            return d(true);
        }
        if (bS == 0) {
            return d(false);
        }
        if (bS != 6) {
            if (bS == 8) {
                return c();
            }
            T90.p(t90, AbstractC3950lJ.p("Cannot begin reading element, unexpected token: ", bS), 0, null, 6);
            throw null;
        }
        int i = this.c + 1;
        this.c = i;
        if (i == 200) {
            TF tf = new TF(this, null);
            C5033xf0 c5033xf0 = C5033xf0.f5238a;
            C2755Sl c2755Sl = new C2755Sl();
            c2755Sl.f3733a = tf;
            c2755Sl.b = c5033xf0;
            c2755Sl.c = c2755Sl;
            EnumC4602sk enumC4602sk = AbstractC4496rb.b;
            c2755Sl.d = enumC4602sk;
            while (true) {
                obj = c2755Sl.d;
                InterfaceC2857Wj interfaceC2857Wj = c2755Sl.c;
                if (interfaceC2857Wj == null) {
                    break;
                }
                if (AbstractC2995aW.i(enumC4602sk, obj)) {
                    try {
                        InterfaceC3655hx interfaceC3655hx = c2755Sl.f3733a;
                        Object obj2 = c2755Sl.b;
                        if (interfaceC3655hx instanceof AbstractC3677i9) {
                            WD.h(3, interfaceC3655hx);
                            objInvoke = interfaceC3655hx.invoke(c2755Sl, obj2, interfaceC2857Wj);
                        } else {
                            AbstractC2995aW.q(interfaceC3655hx, "<this>");
                            InterfaceC3549gk context = interfaceC2857Wj.getContext();
                            Object ud = context == C2734Rq.f3684a ? new UD(interfaceC2857Wj) : new VD(interfaceC2857Wj, context);
                            WD.h(3, interfaceC3655hx);
                            objInvoke = interfaceC3655hx.invoke(c2755Sl, obj2, ud);
                        }
                        if (objInvoke != EnumC4602sk.f4993a) {
                            interfaceC2857Wj.resumeWith(objInvoke);
                        }
                    } catch (Throwable th) {
                        interfaceC2857Wj.resumeWith(AbstractC3375el.v(th));
                    }
                } else {
                    c2755Sl.d = enumC4602sk;
                    interfaceC2857Wj.resumeWith(obj);
                }
            }
            AbstractC3375el.b0(obj);
            ff = (AbstractC4122nF) obj;
        } else {
            byte bH = t90.h((byte) 6);
            if (t90.s() == 4) {
                T90.p(t90, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (t90.b()) {
                String strL = this.b ? t90.l() : t90.k();
                t90.h((byte) 5);
                linkedHashMap.put(strL, b());
                bH = t90.g();
                if (bH != 4) {
                    if (bH == 7) {
                        break;
                    }
                    T90.p(t90, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bH == 6) {
                t90.h((byte) 7);
            } else if (bH == 4) {
                T90.p(t90, "Unexpected trailing comma", 0, null, 6);
                throw null;
            }
            ff = new FF(linkedHashMap);
        }
        this.c--;
        return ff;
    }

    public final WE c() {
        T90 t90 = this.f3866a;
        byte bG = t90.g();
        if (t90.s() == 4) {
            T90.p(t90, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (t90.b()) {
            arrayList.add(b());
            bG = t90.g();
            if (bG != 4) {
                boolean z = bG == 9;
                int i = t90.f3759a;
                if (!z) {
                    T90.p(t90, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bG == 8) {
            t90.h((byte) 9);
        } else if (bG == 4) {
            T90.p(t90, "Unexpected trailing comma", 0, null, 6);
            throw null;
        }
        return new WE(arrayList);
    }

    public final IF d(boolean z) {
        boolean z2 = this.b;
        T90 t90 = this.f3866a;
        String strL = (z2 || !z) ? t90.l() : t90.k();
        return (z || !AbstractC2995aW.i(strL, "null")) ? new C5001xF(strL, z) : DF.f2962a;
    }
}
