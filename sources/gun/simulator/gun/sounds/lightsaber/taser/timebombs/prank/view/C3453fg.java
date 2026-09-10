package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3453fg extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC2851Wd f4378a;
    public byte[] b;
    public int c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ InterfaceC4443qv[] g;
    public final /* synthetic */ InterfaceC2714Qw h;
    public final /* synthetic */ InterfaceC3655hx i;
    public final /* synthetic */ InterfaceC4530rv j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3453fg(InterfaceC2857Wj interfaceC2857Wj, InterfaceC2714Qw interfaceC2714Qw, InterfaceC3655hx interfaceC3655hx, InterfaceC4530rv interfaceC4530rv, InterfaceC4443qv[] interfaceC4443qvArr) {
        super(2, interfaceC2857Wj);
        this.g = interfaceC4443qvArr;
        this.h = interfaceC2714Qw;
        this.i = interfaceC3655hx;
        this.j = interfaceC4530rv;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C3453fg c3453fg = new C3453fg(interfaceC2857Wj, this.h, this.i, this.j, this.g);
        c3453fg.f = obj;
        return c3453fg;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C3453fg) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e3 A[DONT_INVERT, EDGE_INSN: B:40:0x00e3->B:19:0x009f BREAK  A[LOOP:0: B:29:0x00bf->B:52:?]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:45:0x0106 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x0107  */
    /* JADX WARN: Code duplicated, block: B:48:0x011e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[LOOP:0: B:29:0x00bf->B:52:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0104 -> B:19:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x011c -> B:49:0x011f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:48:0x011e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3453fg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
