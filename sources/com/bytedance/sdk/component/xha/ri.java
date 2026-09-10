package com.bytedance.sdk.component.xha;

import android.os.Bundle;
import com.bytedance.sdk.component.lr.ri.mj;
import com.bytedance.sdk.component.lr.ri.ri.ri.fi;
import com.bytedance.sdk.component.lr.ri.sf;
import com.bytedance.sdk.component.xha.ik.ik;
import com.bytedance.sdk.component.xha.lr.ka;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private static lr lr;
    private static fi ri;
    private sf ik;

    public interface lr {
        boolean ri();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.xha.ri$ri, reason: collision with other inner class name */
    public static final class C0219ri {
        private Bundle di;
        private Set<String> fi;
        final List<mj> ka = new ArrayList();
        int ri = 10000;
        int lr = 10000;
        int ik = 10000;

        public C0219ri ik(long j, TimeUnit timeUnit) {
            this.ik = ri("timeout", j, timeUnit);
            return this;
        }

        public C0219ri ri(boolean z) {
            return this;
        }

        public C0219ri lr(long j, TimeUnit timeUnit) {
            this.lr = ri("timeout", j, timeUnit);
            return this;
        }

        public C0219ri ri(long j, TimeUnit timeUnit) {
            this.ri = ri("timeout", j, timeUnit);
            return this;
        }

        public C0219ri ri(mj mjVar) {
            this.ka.add(mjVar);
            return this;
        }

        private static int ri(String str, long j, TimeUnit timeUnit) {
            if (j < 0) {
                throw new IllegalArgumentException(str + " < 0");
            }
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis > 2147483647L) {
                    throw new IllegalArgumentException(str + " too large.");
                }
                if (millis != 0 || j <= 0) {
                    return (int) millis;
                }
                throw new IllegalArgumentException(str + " too small.");
            }
            throw new NullPointerException("unit == null");
        }

        public ri ri() {
            return new ri(this);
        }
    }

    public static boolean di() {
        lr lrVar = lr;
        if (lrVar == null) {
            return false;
        }
        return lrVar.ri();
    }

    public static boolean fi() {
        fi fiVar = ri;
        if (fiVar == null) {
            return false;
        }
        return fiVar.ri();
    }

    public static void ri() {
        ik.ri(ik.ri.DEBUG);
    }

    public com.bytedance.sdk.component.xha.lr.lr ik() {
        return new com.bytedance.sdk.component.xha.lr.lr(this.ik);
    }

    public com.bytedance.sdk.component.xha.lr.ri ka() {
        return new com.bytedance.sdk.component.xha.lr.ri(this.ik);
    }

    public ka lr() {
        return new ka(this.ik);
    }

    public sf xha() {
        return this.ik;
    }

    private ri(C0219ri c0219ri) {
        sf.ri riVar = new sf.ri();
        long j = c0219ri.ri;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        sf.ri riVarLr = riVar.ri(j, timeUnit).ik(c0219ri.ik, timeUnit).lr(c0219ri.lr, timeUnit);
        List<mj> list = c0219ri.ka;
        if (list != null && list.size() > 0) {
            Iterator<mj> it = c0219ri.ka.iterator();
            while (it.hasNext()) {
                riVarLr.ri(it.next());
            }
        }
        if (c0219ri.di != null) {
            Bundle unused = c0219ri.di;
        }
        Set unused2 = c0219ri.fi;
        this.ik = riVarLr.ri();
    }

    public static void ri(fi fiVar) {
        ri = fiVar;
    }

    public static void ri(lr lrVar) {
        lr = lrVar;
    }
}
