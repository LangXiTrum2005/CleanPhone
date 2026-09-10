package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class M00 implements K00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J00 f3385a;
    public InterfaceC4326pd0 b;
    public long c = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    public int d = -1;
    public int e = -1;
    public long f = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    public long g = 0;
    public boolean h;
    public boolean i;
    public boolean j;

    public M00(J00 j00) {
        this.f3385a = j00;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void a(InterfaceC4353pt interfaceC4353pt, int i) {
        InterfaceC4326pd0 interfaceC4326pd0Track = interfaceC4353pt.track(i, 2);
        this.b = interfaceC4326pd0Track;
        interfaceC4326pd0Track.e(this.f3385a.c);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void b(long j) {
        FW.s(this.c == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
        this.c = j;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void c(int i, long j, JT jt, boolean z) {
        FW.t(this.b);
        int iT = jt.t();
        if ((iT & 16) == 16 && (iT & 7) == 0) {
            if (this.h && this.e > 0) {
                InterfaceC4326pd0 interfaceC4326pd0 = this.b;
                interfaceC4326pd0.getClass();
                interfaceC4326pd0.a(this.f, this.i ? 1 : 0, this.e, 0, null);
                this.e = -1;
                this.f = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                this.h = false;
            }
            this.h = true;
        } else if (!this.h) {
            AbstractC4038mJ.f();
            return;
        } else if (i < G00.a(this.d)) {
            int i2 = Ug0.f3833a;
            Locale locale = Locale.US;
            AbstractC4038mJ.f();
            return;
        }
        if ((iT & 128) != 0) {
            int iT2 = jt.t();
            if ((iT2 & 128) != 0 && (jt.t() & 128) != 0) {
                jt.F(1);
            }
            if ((iT2 & 64) != 0) {
                jt.F(1);
            }
            if ((iT2 & 32) != 0 || (iT2 & 16) != 0) {
                jt.F(1);
            }
        }
        if (this.e == -1 && this.h) {
            this.i = (jt.c() & 1) == 0;
        }
        if (!this.j) {
            int i3 = jt.b;
            jt.E(i3 + 6);
            int iM = jt.m() & 16383;
            int iM2 = jt.m() & 16383;
            jt.E(i3);
            C4619sw c4619sw = this.f3385a.c;
            if (iM != c4619sw.q || iM2 != c4619sw.r) {
                InterfaceC4326pd0 interfaceC4326pd1 = this.b;
                C4531rw c4531rwA = c4619sw.a();
                c4531rwA.p = iM;
                c4531rwA.q = iM2;
                interfaceC4326pd1.e(new C4619sw(c4531rwA));
            }
            this.j = true;
        }
        int iA = jt.a();
        this.b.d(iA, jt);
        int i4 = this.e;
        if (i4 == -1) {
            this.e = iA;
        } else {
            this.e = i4 + iA;
        }
        this.f = FW.i0(this.g, j, this.c, 90000);
        if (z) {
            InterfaceC4326pd0 interfaceC4326pd2 = this.b;
            interfaceC4326pd2.getClass();
            interfaceC4326pd2.a(this.f, this.i ? 1 : 0, this.e, 0, null);
            this.e = -1;
            this.f = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            this.h = false;
        }
        this.d = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void seek(long j, long j2) {
        this.c = j;
        this.e = -1;
        this.g = j2;
    }
}
