package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Be0 implements InterfaceC4211oG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3245dG f2882a;
    public final List b;
    public final InterfaceC4211oG c;
    public final int d;

    public Be0(InterfaceC3245dG interfaceC3245dG, List list, InterfaceC4211oG interfaceC4211oG, int i) {
        AbstractC2995aW.q(interfaceC3245dG, "classifier");
        AbstractC2995aW.q(list, "arguments");
        this.f2882a = interfaceC3245dG;
        this.b = list;
        this.c = interfaceC4211oG;
        this.d = i;
    }

    public final String a(boolean z) {
        String name;
        InterfaceC3245dG interfaceC3245dG = this.f2882a;
        InterfaceC3156cG interfaceC3156cG = interfaceC3245dG instanceof InterfaceC3156cG ? (InterfaceC3156cG) interfaceC3245dG : null;
        Class clsK = interfaceC3156cG != null ? AbstractC2995aW.K(interfaceC3156cG) : null;
        int i = this.d;
        if (clsK == null) {
            name = interfaceC3245dG.toString();
        } else if ((i & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsK.isArray()) {
            if (AbstractC2995aW.i(clsK, boolean[].class)) {
                name = "kotlin.BooleanArray";
            } else if (AbstractC2995aW.i(clsK, char[].class)) {
                name = "kotlin.CharArray";
            } else if (AbstractC2995aW.i(clsK, byte[].class)) {
                name = "kotlin.ByteArray";
            } else if (AbstractC2995aW.i(clsK, short[].class)) {
                name = "kotlin.ShortArray";
            } else if (AbstractC2995aW.i(clsK, int[].class)) {
                name = "kotlin.IntArray";
            } else if (AbstractC2995aW.i(clsK, float[].class)) {
                name = "kotlin.FloatArray";
            } else if (AbstractC2995aW.i(clsK, long[].class)) {
                name = "kotlin.LongArray";
            } else {
                name = AbstractC2995aW.i(clsK, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
            }
        } else if (z && clsK.isPrimitive()) {
            AbstractC2995aW.o(interfaceC3245dG, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = AbstractC2995aW.L((InterfaceC3156cG) interfaceC3245dG).getName();
        } else {
            name = clsK.getName();
        }
        List list = this.b;
        String strI = DM.i(name, list.isEmpty() ? "" : AbstractC2853Wf.l0(list, ", ", "<", ">", new C4140nX(this, 4), 24), (i & 1) != 0 ? "?" : "");
        InterfaceC4211oG interfaceC4211oG = this.c;
        if (!(interfaceC4211oG instanceof Be0)) {
            return strI;
        }
        String strA = ((Be0) interfaceC4211oG).a(true);
        if (AbstractC2995aW.i(strA, strI)) {
            return strI;
        }
        if (AbstractC2995aW.i(strA, strI + '?')) {
            return strI + '!';
        }
        return "(" + strI + ".." + strA + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Be0) {
            Be0 be0 = (Be0) obj;
            if (AbstractC2995aW.i(this.f2882a, be0.f2882a)) {
                if (AbstractC2995aW.i(this.b, be0.b) && AbstractC2995aW.i(this.c, be0.c) && this.d == be0.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.f2882a.hashCode() * 31)) * 31) + this.d;
    }

    public final String toString() {
        return a(false) + " (Kotlin reflection is not available)";
    }
}
