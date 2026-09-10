package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public final class K20 implements InterfaceC2857Wj, InterfaceC4690tk {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(K20.class, Object.class, "result");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2857Wj f3295a;
    private volatile Object result;

    public K20(InterfaceC2857Wj interfaceC2857Wj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.b;
        this.f3295a = interfaceC2857Wj;
        this.result = enumC4602sk;
    }

    public final Object a() throws Throwable {
        Object obj = this.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.b;
        if (obj == enumC4602sk) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            EnumC4602sk enumC4602sk2 = EnumC4602sk.f4993a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC4602sk, enumC4602sk2)) {
                if (atomicReferenceFieldUpdater.get(this) != enumC4602sk) {
                    obj = this.result;
                }
            }
            return EnumC4602sk.f4993a;
        }
        if (obj == EnumC4602sk.c) {
            return EnumC4602sk.f4993a;
        }
        if (obj instanceof HZ) {
            throw ((HZ) obj).f3176a;
        }
        return obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4690tk
    public final InterfaceC4690tk getCallerFrame() {
        InterfaceC2857Wj interfaceC2857Wj = this.f3295a;
        if (interfaceC2857Wj instanceof InterfaceC4690tk) {
            return (InterfaceC4690tk) interfaceC2857Wj;
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj
    public final InterfaceC3549gk getContext() {
        return this.f3295a.getContext();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC4602sk enumC4602sk = EnumC4602sk.b;
            if (obj2 == enumC4602sk) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC4602sk, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != enumC4602sk) {
                    }
                }
                return;
            }
            EnumC4602sk enumC4602sk2 = EnumC4602sk.f4993a;
            if (obj2 != enumC4602sk2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b;
            EnumC4602sk enumC4602sk3 = EnumC4602sk.c;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, enumC4602sk2, enumC4602sk3)) {
                    this.f3295a.resumeWith(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == enumC4602sk2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f3295a;
    }
}
