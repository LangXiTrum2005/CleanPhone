package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Yg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2906Yg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4031a;
    public final AbstractC2746Sc b;
    public final InterfaceC2766Sw c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ C2906Yg(Object obj, AbstractC2746Sc abstractC2746Sc, InterfaceC2766Sw interfaceC2766Sw, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : abstractC2746Sc, (i & 4) != 0 ? null : interfaceC2766Sw, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }

    public static C2906Yg a(C2906Yg c2906Yg, AbstractC2746Sc abstractC2746Sc, CancellationException cancellationException, int i) {
        Object obj = c2906Yg.f4031a;
        if ((i & 2) != 0) {
            abstractC2746Sc = c2906Yg.b;
        }
        AbstractC2746Sc abstractC2746Sc2 = abstractC2746Sc;
        InterfaceC2766Sw interfaceC2766Sw = c2906Yg.c;
        Object obj2 = c2906Yg.d;
        Throwable th = cancellationException;
        if ((i & 16) != 0) {
            th = c2906Yg.e;
        }
        c2906Yg.getClass();
        return new C2906Yg(obj, abstractC2746Sc2, interfaceC2766Sw, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2906Yg)) {
            return false;
        }
        C2906Yg c2906Yg = (C2906Yg) obj;
        return AbstractC2995aW.i(this.f4031a, c2906Yg.f4031a) && AbstractC2995aW.i(this.b, c2906Yg.b) && AbstractC2995aW.i(this.c, c2906Yg.c) && AbstractC2995aW.i(this.d, c2906Yg.d) && AbstractC2995aW.i(this.e, c2906Yg.e);
    }

    public final int hashCode() {
        Object obj = this.f4031a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC2746Sc abstractC2746Sc = this.b;
        int iHashCode2 = (iHashCode + (abstractC2746Sc == null ? 0 : abstractC2746Sc.hashCode())) * 31;
        InterfaceC2766Sw interfaceC2766Sw = this.c;
        int iHashCode3 = (iHashCode2 + (interfaceC2766Sw == null ? 0 : interfaceC2766Sw.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f4031a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public C2906Yg(Object obj, AbstractC2746Sc abstractC2746Sc, InterfaceC2766Sw interfaceC2766Sw, Object obj2, Throwable th) {
        this.f4031a = obj;
        this.b = abstractC2746Sc;
        this.c = interfaceC2766Sw;
        this.d = obj2;
        this.e = th;
    }
}
