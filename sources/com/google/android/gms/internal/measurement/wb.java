package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q6 f24117a;

    static {
        Object qVar;
        ((i) d.f23368a).getClass();
        AtomicReference atomicReference = m.f23715f;
        String strReplace = "Phlogger";
        if (atomicReference.get() != null) {
            o oVar = (o) atomicReference.get();
            qVar = new q("Phlogger", oVar.f23791a, oVar.f23792b, oVar.f23793c);
        } else {
            for (int i10 = 7; i10 >= 0; i10--) {
                char cCharAt = "Phlogger".charAt(i10);
                if (cCharAt == '$') {
                    strReplace = "Phlogger".replace('$', '.');
                    break;
                } else {
                    if (cCharAt == '.') {
                        break;
                    }
                }
            }
            m mVar = new m(strReplace);
            if (m.f23712c || m.f23713d) {
                mVar.f23718b = new p(strReplace);
            } else if (m.f23714e) {
                o oVar2 = q.f23872h;
                mVar.f23718b = new q(strReplace, Level.OFF, oVar2.f23792b, oVar2.f23793c);
            } else {
                mVar.f23718b = null;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = k.f23630a;
            concurrentLinkedQueue.offer(mVar);
            qVar = mVar;
            if (atomicReference.get() != null) {
                while (true) {
                    m mVar2 = (m) concurrentLinkedQueue.poll();
                    if (mVar2 == null) {
                        break;
                    }
                    o oVar3 = (o) atomicReference.get();
                    mVar2.f23718b = new q((String) mVar2.f24166a, oVar3.f23791a, oVar3.f23792b, oVar3.f23793c);
                }
                m.m();
                qVar = mVar;
            }
        }
        f24117a = new q6(qVar, 2);
    }
}
