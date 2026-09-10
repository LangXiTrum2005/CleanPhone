package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4149nd implements InterfaceC4583sa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f4751a = new ArrayDeque();
    public final ArrayDeque b;
    public final PriorityQueue c;
    public C3973ld d;
    public long e;
    public long f;

    public AbstractC4149nd() {
        for (int i = 0; i < 10; i++) {
            this.f4751a.add(new C3973ld(1));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            Md0 md0 = new Md0(this, 23);
            C4061md c4061md = new C4061md();
            c4061md.f = md0;
            arrayDeque.add(c4061md);
        }
        this.c = new PriorityQueue();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2574Ll
    public final void a(C4935wa0 c4935wa0) {
        FW.h(c4935wa0 == this.d);
        C3973ld c3973ld = (C3973ld) c4935wa0;
        if (c3973ld.c(Integer.MIN_VALUE)) {
            c3973ld.e();
            this.f4751a.add(c3973ld);
        } else {
            long j = this.f;
            this.f = 1 + j;
            c3973ld.k = j;
            this.c.add(c3973ld);
        }
        this.d = null;
    }

    public abstract C4237od b();

    public abstract void c(C3973ld c3973ld);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2574Ll
    /* JADX INFO: renamed from: d */
    public AbstractC5023xa0 dequeueOutputBuffer() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.c;
            if (!priorityQueue.isEmpty()) {
                C3973ld c3973ld = (C3973ld) priorityQueue.peek();
                int i = Ug0.f3833a;
                if (c3973ld.f > this.e) {
                    break;
                }
                C3973ld c3973ld2 = (C3973ld) priorityQueue.poll();
                boolean zC = c3973ld2.c(4);
                ArrayDeque arrayDeque2 = this.f4751a;
                if (zC) {
                    AbstractC5023xa0 abstractC5023xa0 = (AbstractC5023xa0) arrayDeque.pollFirst();
                    abstractC5023xa0.a(4);
                    c3973ld2.e();
                    arrayDeque2.add(c3973ld2);
                    return abstractC5023xa0;
                }
                c(c3973ld2);
                if (e()) {
                    C4237od c4237odB = b();
                    AbstractC5023xa0 abstractC5023xa1 = (AbstractC5023xa0) arrayDeque.pollFirst();
                    abstractC5023xa1.f(c3973ld2.f, c4237odB, Long.MAX_VALUE);
                    c3973ld2.e();
                    arrayDeque2.add(c3973ld2);
                    return abstractC5023xa1;
                }
                c3973ld2.e();
                arrayDeque2.add(c3973ld2);
            } else {
                break;
            }
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2574Ll
    public final Object dequeueInputBuffer() {
        FW.s(this.d == null);
        ArrayDeque arrayDeque = this.f4751a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C3973ld c3973ld = (C3973ld) arrayDeque.pollFirst();
        this.d = c3973ld;
        return c3973ld;
    }

    public abstract boolean e();

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2574Ll
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.c;
            boolean zIsEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f4751a;
            if (zIsEmpty) {
                break;
            }
            C3973ld c3973ld = (C3973ld) priorityQueue.poll();
            int i = Ug0.f3833a;
            c3973ld.e();
            arrayDeque.add(c3973ld);
        }
        C3973ld c3973ld2 = this.d;
        if (c3973ld2 != null) {
            c3973ld2.e();
            arrayDeque.add(c3973ld2);
            this.d = null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4583sa0
    public final void setPositionUs(long j) {
        this.e = j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2574Ll
    public void release() {
    }
}
