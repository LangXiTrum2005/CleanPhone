package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3446fc0 {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(C3446fc0.class, "_size");
    private volatile int _size;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractRunnableC2943Zr[] f4373a;

    public final void a(AbstractRunnableC2943Zr abstractRunnableC2943Zr) {
        abstractRunnableC2943Zr.e((C3033as) this);
        AbstractRunnableC2943Zr[] abstractRunnableC2943ZrArr = this.f4373a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (abstractRunnableC2943ZrArr == null) {
            abstractRunnableC2943ZrArr = new AbstractRunnableC2943Zr[4];
            this.f4373a = abstractRunnableC2943ZrArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC2943ZrArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(abstractRunnableC2943ZrArr, atomicIntegerFieldUpdater.get(this) * 2);
            AbstractC2995aW.p(objArrCopyOf, "copyOf(this, newSize)");
            abstractRunnableC2943ZrArr = (AbstractRunnableC2943Zr[]) objArrCopyOf;
            this.f4373a = abstractRunnableC2943ZrArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        abstractRunnableC2943ZrArr[i] = abstractRunnableC2943Zr;
        abstractRunnableC2943Zr.b = i;
        e(i);
    }

    public final AbstractRunnableC2943Zr b() {
        AbstractRunnableC2943Zr abstractRunnableC2943Zr;
        synchronized (this) {
            AbstractRunnableC2943Zr[] abstractRunnableC2943ZrArr = this.f4373a;
            abstractRunnableC2943Zr = abstractRunnableC2943ZrArr != null ? abstractRunnableC2943ZrArr[0] : null;
        }
        return abstractRunnableC2943Zr;
    }

    public final void c(AbstractRunnableC2943Zr abstractRunnableC2943Zr) {
        synchronized (this) {
            if (abstractRunnableC2943Zr.b() != null) {
                d(abstractRunnableC2943Zr.b);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[LOOP:0: B:9:0x003a->B:21:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[EDGE_INSN: B:24:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[EDGE_INSN: B:25:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final AbstractRunnableC2943Zr d(int i) {
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.f4373a;
        AbstractC2995aW.n(objArr2);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            f(i, atomicIntegerFieldUpdater.get(this));
            int i5 = (i - 1) / 2;
            if (i > 0) {
                AbstractRunnableC2943Zr abstractRunnableC2943Zr = objArr2[i];
                AbstractC2995aW.n(abstractRunnableC2943Zr);
                Object obj2 = objArr2[i5];
                AbstractC2995aW.n(obj2);
                if (abstractRunnableC2943Zr.compareTo(obj2) < 0) {
                    f(i, i5);
                    e(i5);
                } else {
                    while (true) {
                        i2 = i * 2;
                        i3 = i2 + 1;
                        if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.f4373a;
                        AbstractC2995aW.n(objArr);
                        i4 = i2 + 2;
                        if (i4 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i4];
                            AbstractC2995aW.n(comparable3);
                            obj = objArr[i3];
                            AbstractC2995aW.n(obj);
                            if (comparable3.compareTo(obj) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        comparable = objArr[i];
                        AbstractC2995aW.n(comparable);
                        comparable2 = objArr[i4];
                        AbstractC2995aW.n(comparable2);
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        f(i, i4);
                        i = i4;
                    }
                }
            } else {
                while (true) {
                    i2 = i * 2;
                    i3 = i2 + 1;
                    if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.f4373a;
                    AbstractC2995aW.n(objArr);
                    i4 = i2 + 2;
                    if (i4 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i4];
                        AbstractC2995aW.n(comparable3);
                        obj = objArr[i3];
                        AbstractC2995aW.n(obj);
                        if (comparable3.compareTo(obj) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    comparable = objArr[i];
                    AbstractC2995aW.n(comparable);
                    comparable2 = objArr[i4];
                    AbstractC2995aW.n(comparable2);
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    f(i, i4);
                    i = i4;
                }
            }
        }
        AbstractRunnableC2943Zr abstractRunnableC2943Zr2 = objArr2[atomicIntegerFieldUpdater.get(this)];
        AbstractC2995aW.n(abstractRunnableC2943Zr2);
        abstractRunnableC2943Zr2.e(null);
        abstractRunnableC2943Zr2.b = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return abstractRunnableC2943Zr2;
    }

    public final void e(int i) {
        while (i > 0) {
            AbstractRunnableC2943Zr[] abstractRunnableC2943ZrArr = this.f4373a;
            AbstractC2995aW.n(abstractRunnableC2943ZrArr);
            int i2 = (i - 1) / 2;
            AbstractRunnableC2943Zr abstractRunnableC2943Zr = abstractRunnableC2943ZrArr[i2];
            AbstractC2995aW.n(abstractRunnableC2943Zr);
            AbstractRunnableC2943Zr abstractRunnableC2943Zr2 = abstractRunnableC2943ZrArr[i];
            AbstractC2995aW.n(abstractRunnableC2943Zr2);
            if (abstractRunnableC2943Zr.compareTo(abstractRunnableC2943Zr2) <= 0) {
                return;
            }
            f(i, i2);
            i = i2;
        }
    }

    public final void f(int i, int i2) {
        AbstractRunnableC2943Zr[] abstractRunnableC2943ZrArr = this.f4373a;
        AbstractC2995aW.n(abstractRunnableC2943ZrArr);
        AbstractRunnableC2943Zr abstractRunnableC2943Zr = abstractRunnableC2943ZrArr[i2];
        AbstractC2995aW.n(abstractRunnableC2943Zr);
        AbstractRunnableC2943Zr abstractRunnableC2943Zr2 = abstractRunnableC2943ZrArr[i];
        AbstractC2995aW.n(abstractRunnableC2943Zr2);
        abstractRunnableC2943ZrArr[i] = abstractRunnableC2943Zr;
        abstractRunnableC2943ZrArr[i2] = abstractRunnableC2943Zr2;
        abstractRunnableC2943Zr.b = i;
        abstractRunnableC2943Zr2.b = i2;
    }
}
