package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class A10 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public YX f2796a;
    public int b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A10(boolean z, ViewGroup viewGroup, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.e = z;
        this.f = viewGroup;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        A10 a10 = new A10(this.e, this.f, interfaceC2857Wj);
        a10.d = obj;
        return a10;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((A10) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    /* JADX WARN: Code duplicated, block: B:32:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00af -> B:8:0x001e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sk r0 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk.f4993a
            int r1 = r13.c
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xf0 r2 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0.f5238a
            boolean r3 = r13.e
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L3a
            if (r1 == r6) goto L36
            if (r1 == r5) goto L29
            if (r1 != r4) goto L21
            int r1 = r13.b
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.YX r7 = r13.f2796a
            java.lang.Object r8 = r13.d
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rk r8 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk) r8
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el.b0(r14)
        L1e:
            r14 = r8
            goto Lb2
        L21:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L29:
            int r1 = r13.b
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.YX r7 = r13.f2796a
            java.lang.Object r8 = r13.d
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rk r8 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk) r8
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el.b0(r14)
            goto La1
        L36:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el.b0(r14)
            goto L88
        L3a:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el.b0(r14)
            java.lang.Object r14 = r13.d
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rk r14 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk) r14
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.YX r1 = new gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.YX
            r1.<init>()
            if (r3 == 0) goto L4a
            r7 = 0
            goto L4d
        L4a:
            r7 = 1032805417(0x3d8f5c29, float:0.07)
        L4d:
            r8 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 + r8
            r1.f4021a = r7
            r7 = 0
        L53:
            r8 = 31
            if (r7 >= r8) goto Lb7
            r8 = 4567526722881144401(0x3f631d5acb6f4651, double:0.0023333333333333335)
            if (r3 == 0) goto L66
            float r10 = r1.f4021a
            double r10 = (double) r10
            double r10 = r10 + r8
            float r8 = (float) r10
            r1.f4021a = r8
            goto L6d
        L66:
            float r10 = r1.f4021a
            double r10 = (double) r10
            double r10 = r10 - r8
            float r8 = (float) r10
            r1.f4021a = r8
        L6d:
            boolean r8 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD.x(r14)
            android.view.ViewGroup r9 = r13.f
            r10 = 0
            if (r8 != 0) goto L89
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.y10 r14 = new gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.y10
            r14.<init>(r9, r10)
            r13.d = r10
            r13.f2796a = r10
            r13.c = r6
            java.lang.Object r14 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3651ht.d(r14, r13)
            if (r14 != r0) goto L88
            return r0
        L88:
            return r2
        L89:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.z10 r8 = new gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.z10
            r8.<init>(r9, r1, r10)
            r13.d = r14
            r13.f2796a = r1
            r13.b = r7
            r13.c = r5
            java.lang.Object r8 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3651ht.d(r8, r13)
            if (r8 != r0) goto L9d
            return r0
        L9d:
            r8 = r14
            r12 = r7
            r7 = r1
            r1 = r12
        La1:
            r13.d = r8
            r13.f2796a = r7
            r13.b = r1
            r13.c = r4
            r9 = 10
            java.lang.Object r14 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.v(r9, r13)
            if (r14 != r0) goto L1e
            return r0
        Lb2:
            int r1 = r1 + r6
            r12 = r7
            r7 = r1
            r1 = r12
            goto L53
        Lb7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A10.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
