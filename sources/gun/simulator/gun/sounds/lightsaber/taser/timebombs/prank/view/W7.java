package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class W7 extends AbstractC4778uk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3910a;
    public final InterfaceC2438Gf b;
    public final InterfaceC2438Gf c;
    public final String d;

    public W7(Context context, InterfaceC2438Gf interfaceC2438Gf, InterfaceC2438Gf interfaceC2438Gf2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f3910a = context;
        if (interfaceC2438Gf == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.b = interfaceC2438Gf;
        if (interfaceC2438Gf2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.c = interfaceC2438Gf2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4778uk)) {
            return false;
        }
        AbstractC4778uk abstractC4778uk = (AbstractC4778uk) obj;
        if (this.f3910a.equals(((W7) abstractC4778uk).f3910a)) {
            W7 w7 = (W7) abstractC4778uk;
            if (this.b.equals(w7.b) && this.c.equals(w7.c) && this.d.equals(w7.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f3910a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f3910a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return DM.m(sb, this.d, "}");
    }
}
