package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class L80 extends AbstractC5170z9 {
    public final PointF i;
    public final PointF j;
    public final AbstractC5170z9 k;
    public final AbstractC5170z9 l;
    public C4215oK m;
    public C4215oK n;

    public L80(C3915kv c3915kv, C3915kv c3915kv2) {
        super(Collections.emptyList());
        this.i = new PointF();
        this.j = new PointF();
        this.k = c3915kv;
        this.l = c3915kv2;
        i(this.d);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5170z9
    public final Object e() {
        return k();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5170z9
    public final /* bridge */ /* synthetic */ Object f(C5090yG c5090yG, float f) {
        return k();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5170z9
    public final void i(float f) {
        AbstractC5170z9 abstractC5170z9 = this.k;
        abstractC5170z9.i(f);
        AbstractC5170z9 abstractC5170z10 = this.l;
        abstractC5170z10.i(f);
        this.i.set(((Float) abstractC5170z9.e()).floatValue(), ((Float) abstractC5170z10.e()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5318a;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC4818v9) arrayList.get(i)).a();
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    public final PointF k() {
        Float f;
        Float f2 = null;
        if (this.m != null) {
            AbstractC5170z9 abstractC5170z9 = this.k;
            C5090yG c5090yGF = abstractC5170z9.c.f();
            if (c5090yGF != null) {
                Float f3 = c5090yGF.h;
                C4215oK c4215oK = this.m;
                float f4 = c5090yGF.g;
                f = (Float) c4215oK.b(f4, f3 == null ? f4 : f3.floatValue(), (Float) c5090yGF.b, (Float) c5090yGF.c, abstractC5170z9.c(), abstractC5170z9.d(), abstractC5170z9.d);
            } else {
                f = null;
            }
        } else {
            f = null;
        }
        if (this.n != null) {
            AbstractC5170z9 abstractC5170z10 = this.l;
            C5090yG c5090yGF2 = abstractC5170z10.c.f();
            if (c5090yGF2 != null) {
                Float f5 = c5090yGF2.h;
                C4215oK c4215oK2 = this.n;
                float f6 = c5090yGF2.g;
                f2 = (Float) c4215oK2.b(f6, f5 == null ? f6 : f5.floatValue(), (Float) c5090yGF2.b, (Float) c5090yGF2.c, abstractC5170z10.c(), abstractC5170z10.d(), abstractC5170z10.d);
            }
        }
        PointF pointF = this.i;
        PointF pointF2 = this.j;
        if (f == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(f.floatValue(), 0.0f);
        }
        if (f2 == null) {
            pointF2.set(pointF2.x, pointF.y);
        } else {
            pointF2.set(pointF2.x, f2.floatValue());
        }
        return pointF2;
    }
}
