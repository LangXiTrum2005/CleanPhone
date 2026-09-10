package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2749Sf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3089ba0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5073y40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2827Vf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3738iu;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4140nX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5161z40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4545s40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ld0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bg implements Serializable {
    public static final a d = new a(0);
    private static final long serialVersionUID = -6315725584154386429L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f602a;
    public final List<bk> b;
    public final bi c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String a(bg bgVar, bk bkVar, int i, boolean z) {
            String str = "    ↓" + (bkVar.b == bk.b.STATIC_FIELD ? " static" : "") + ' ' + bkVar.a() + '.' + bkVar.b();
            if (!z || !bgVar.a(i)) {
                return AbstractC3888ke0.i("\n│", str);
            }
            int iW0 = AbstractC3089ba0.w0(str, '.', 0, 6) + 1;
            return AbstractC5044xl.n("\n│", str, "\n│", AbstractC3089ba0.F0(" ", iW0), AbstractC3089ba0.F0("~", str.length() - iW0));
        }
    }

    public enum b {
        JNI_GLOBAL("Global variable in native code"),
        JNI_LOCAL("Local variable in native code"),
        JAVA_FRAME("Java local variable"),
        NATIVE_STACK("Input or output parameters in native code"),
        STICKY_CLASS("System class"),
        THREAD_BLOCK("Thread block"),
        MONITOR_USED("Monitor (anything that called the wait() or notify() methods, or that is synchronized.)"),
        THREAD_OBJECT("Thread object"),
        JNI_MONITOR("Root JNI monitor");

        public static final a k = new a(0);
        public final String j;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }

            public final b a(ap apVar) {
                AbstractC2995aW.q(apVar, "gcRoot");
                if (apVar instanceof ap.e) {
                    return b.JNI_GLOBAL;
                }
                if (apVar instanceof ap.f) {
                    return b.JNI_LOCAL;
                }
                if (apVar instanceof ap.d) {
                    return b.JAVA_FRAME;
                }
                if (apVar instanceof ap.i) {
                    return b.NATIVE_STACK;
                }
                if (apVar instanceof ap.k) {
                    return b.STICKY_CLASS;
                }
                if (apVar instanceof ap.l) {
                    return b.THREAD_BLOCK;
                }
                if (apVar instanceof ap.h) {
                    return b.MONITOR_USED;
                }
                if (apVar instanceof ap.m) {
                    return b.THREAD_OBJECT;
                }
                if (apVar instanceof ap.g) {
                    return b.JNI_MONITOR;
                }
                throw new IllegalStateException("Unexpected gc root " + apVar);
            }
        }

        b(String str) {
            this.j = str;
        }
    }

    public static final class c extends WG implements InterfaceC2766Sw {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f604a = new c();

        public c() {
            super(1);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(bk bkVar) {
            AbstractC2995aW.q(bkVar, "element");
            return bkVar.f611a.b + bkVar.c();
        }
    }

    public static final class d extends WG implements InterfaceC3567gx {
        public d() {
            super(2);
        }

        public final boolean a(int i, bk bkVar) {
            AbstractC2995aW.q(bkVar, "<anonymous parameter 1>");
            return bg.this.a(i);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(a(((Number) obj).intValue(), (bk) obj2));
        }
    }

    public bg(b bVar, List<bk> list, bi biVar) {
        AbstractC2995aW.q(bVar, "gcRootType");
        AbstractC2995aW.q(list, "referencePath");
        AbstractC2995aW.q(biVar, "leakingObject");
        this.f602a = bVar;
        this.b = list;
        this.c = biVar;
    }

    public final Integer a() {
        List listJ = AbstractC2340Cl.J(this.c);
        List<bk> list = this.b;
        ArrayList arrayList = new ArrayList(AbstractC2749Sf.Y(10, list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((bk) it.next()).f611a);
        }
        ArrayList arrayListP0 = AbstractC2853Wf.p0(arrayList, listJ);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListP0) {
            if (((bi) obj).d == bi.b.LEAKING) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Integer num = ((bi) it2.next()).f;
            if (num != null) {
                arrayList3.add(num);
            }
        }
        return (Integer) AbstractC2853Wf.o0(arrayList3);
    }

    public final InterfaceC4545s40 b() {
        return new Ld0(new C3738iu(new C2827Vf(AbstractC2853Wf.c0(this.b)), true, new C4140nX(new d(), 6)), C5161z40.h);
    }

    public final String c() {
        return ct.a(AbstractC5073y40.L0(b(), "", c.f604a, 30));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg)) {
            return false;
        }
        bg bgVar = (bg) obj;
        return AbstractC2995aW.i(this.f602a, bgVar.f602a) && AbstractC2995aW.i(this.b, bgVar.b) && AbstractC2995aW.i(this.c, bgVar.c);
    }

    public int hashCode() {
        b bVar = this.f602a;
        int iHashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        List<bk> list = this.b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        bi biVar = this.c;
        return iHashCode2 + (biVar != null ? biVar.hashCode() : 0);
    }

    public String toString() {
        return a(true);
    }

    public final boolean a(int i) {
        int i2 = bh.f606a[this.b.get(i).f611a.d.ordinal()];
        if (i2 != 1) {
            return i2 == 2 && (i == AbstractC2340Cl.y(this.b) || this.b.get(i + 1).f611a.d != bi.b.NOT_LEAKING);
        }
        return true;
    }

    private final String a(boolean z) {
        String strB;
        String strD0 = AbstractC3375el.d0("\n        ┬───\n        │ GC Root: " + this.f602a.j + "\n        │\n      ");
        int i = 0;
        for (Object obj : this.b) {
            int i2 = i + 1;
            if (i >= 0) {
                bk bkVar = (bk) obj;
                bi biVar = bkVar.f611a;
                StringBuilder sbO = DM.o(DM.h(strD0, "\n"));
                if (i == 0 && this.f602a == b.JAVA_FRAME) {
                    strB = "thread";
                } else {
                    strB = biVar.b();
                }
                sbO.append(biVar.a("├─ ", "│    ", z, strB));
                StringBuilder sbO2 = DM.o(sbO.toString());
                sbO2.append(d.a(this, bkVar, i, z));
                strD0 = sbO2.toString();
                i = i2;
            } else {
                AbstractC2340Cl.S();
                throw null;
            }
        }
        StringBuilder sbO3 = DM.o(DM.h(strD0, "\n"));
        sbO3.append(bi.a(this.c, "╰→ ", "\u200b     ", z, null, 8));
        return sbO3.toString();
    }
}
