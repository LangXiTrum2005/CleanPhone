package com.thinkup.core.common.o0m.o;

import androidx.datastore.preferences.protobuf.a;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
final class oo {
    private final Map<String, m> o = a.r();

    /* JADX INFO: renamed from: com.thinkup.core.common.o0m.o.oo$1, reason: invalid class name */
    public class AnonymousClass1 extends m {
        public AnonymousClass1(String str, o oVar) {
            super(str, oVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f42158n.o(this.o0);
            } finally {
                oo.this.o.remove(this.m);
            }
        }
    }

    public static abstract class m implements Runnable {
        final String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final o f42158n;
        AtomicBoolean o0 = new AtomicBoolean();

        public m(String str, o oVar) {
            this.m = str;
            this.f42158n = oVar;
        }
    }

    public interface o {
        void o(AtomicBoolean atomicBoolean);
    }

    private m m(String str, o oVar) {
        return new AnonymousClass1(str, oVar);
    }

    public final boolean o() {
        return !this.o.isEmpty();
    }

    public final boolean o(String str) {
        m mVar = this.o.get(str);
        if (mVar == null) {
            return false;
        }
        mVar.o0.set(true);
        return true;
    }

    public final void o(String str, o oVar) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(str, oVar);
        this.o.put(str, anonymousClass1);
        m0.o().execute(anonymousClass1);
    }
}
