package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3179cb0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4229a;
    public int b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C3794jb0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3179cb0(C3794jb0 c3794jb0, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.e = c3794jb0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C3179cb0 c3179cb0 = new C3179cb0(this.e, interfaceC2857Wj);
        c3179cb0.d = obj;
        return c3179cb0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C3179cb0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007d -> B:28:0x007e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sk r0 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk.f4993a
            int r1 = r10.c
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xf0 r2 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0.f5238a
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 2
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jb0 r7 = r10.e
            if (r1 == 0) goto L2e
            if (r1 == r3) goto L26
            if (r1 != r6) goto L1e
            int r1 = r10.b
            int r3 = r10.f4229a
            java.lang.Object r8 = r10.d
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rk r8 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk) r8
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el.b0(r11)
            goto L7e
        L1e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L26:
            java.lang.Object r1 = r10.d
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rk r1 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk) r1
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el.b0(r11)
            goto L5e
        L2e:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el.b0(r11)
            java.lang.Object r11 = r10.d
            r1 = r11
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rk r1 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk) r1
            boolean r11 = r7.Q
            if (r11 == 0) goto L3b
            return r2
        L3b:
            r7.Q = r3
            java.util.concurrent.atomic.AtomicBoolean r11 = r7.R
            boolean r11 = r11.get()
            if (r11 == 0) goto L48
            r7.Q = r5
            return r2
        L48:
            r10.d = r1
            r10.c = r3
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.db0 r11 = new gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.db0
            r11.<init>(r7, r4)
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qn r8 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp.b
            java.lang.Object r11 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD.X(r11, r8, r10)
            if (r11 != r0) goto L5a
            goto L5b
        L5a:
            r11 = r2
        L5b:
            if (r11 != r0) goto L5e
            return r0
        L5e:
            r11 = 10
            r8 = r1
            r11 = 1
            r3 = 10
        L64:
            r7.p()
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bb0 r1 = new gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bb0
            r1.<init>(r7, r4)
            r10.d = r8
            r10.f4229a = r3
            r10.b = r11
            r10.c = r6
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qn r9 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp.b
            java.lang.Object r1 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD.X(r1, r9, r10)
            if (r1 != r0) goto L7d
            return r0
        L7d:
            r1 = r11
        L7e:
            if (r1 == r3) goto L83
            int r11 = r1 + 1
            goto L64
        L83:
            r7.q()
            r7.Q = r5
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3179cb0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
