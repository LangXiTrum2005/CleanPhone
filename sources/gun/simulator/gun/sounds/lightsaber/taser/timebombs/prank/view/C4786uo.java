package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.uo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4786uo implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5103a = -1;
    public int b;
    public int c;
    public C5175zD d;
    public int e;
    public final /* synthetic */ C4874vo f;

    public C4786uo(C4874vo c4874vo) {
        this.f = c4874vo;
        int iP = AbstractC3375el.p(c4874vo.b, c4874vo.f5154a.length());
        this.b = iP;
        this.c = iP;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:17:0x0075  */
    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public final void a() {
        C4839vT c4839vT;
        int i = this.c;
        if (i < 0) {
            this.f5103a = 0;
            this.d = null;
            return;
        }
        C4874vo c4874vo = this.f;
        int i2 = c4874vo.c;
        if (i2 > 0) {
            int i3 = this.e + 1;
            this.e = i3;
            if (i3 >= i2) {
                this.d = new C5175zD(this.b, AbstractC3089ba0.p0(c4874vo.f5154a), 1);
                this.c = -1;
            } else if (i > c4874vo.f5154a.length() && (c4839vT = (C4839vT) c4874vo.d.invoke(c4874vo.f5154a, Integer.valueOf(this.c))) != null) {
                int iIntValue = ((Number) c4839vT.f5132a).intValue();
                int iIntValue2 = ((Number) c4839vT.b).intValue();
                this.d = AbstractC3375el.f0(this.b, iIntValue);
                int i4 = iIntValue + iIntValue2;
                this.b = i4;
                this.c = i4 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.d = new C5175zD(this.b, AbstractC3089ba0.p0(c4874vo.f5154a), 1);
                this.c = -1;
            }
        } else if (i > c4874vo.f5154a.length()) {
            this.d = new C5175zD(this.b, AbstractC3089ba0.p0(c4874vo.f5154a), 1);
            this.c = -1;
        } else {
            int iIntValue3 = ((Number) c4839vT.f5132a).intValue();
            int iIntValue4 = ((Number) c4839vT.b).intValue();
            this.d = AbstractC3375el.f0(this.b, iIntValue3);
            int i5 = iIntValue3 + iIntValue4;
            this.b = i5;
            this.c = i5 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.f5103a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f5103a == -1) {
            a();
        }
        return this.f5103a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f5103a == -1) {
            a();
        }
        if (this.f5103a == 0) {
            throw new NoSuchElementException();
        }
        C5175zD c5175zD = this.d;
        AbstractC2995aW.o(c5175zD, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.d = null;
        this.f5103a = -1;
        return c5175zD;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
