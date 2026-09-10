package com.bytedance.sdk.component.wd;

import android.os.Bundle;
import android.support.v4.media.a;
import com.bytedance.sdk.component.ud.qdl.jpc;
import com.bytedance.sdk.component.ud.qdl.qdl.qdl.mzz;
import com.bytedance.sdk.component.ud.qdl.rq;
import com.bytedance.sdk.component.wd.lnr.lnr;
import com.bytedance.sdk.component.wd.ud.mml;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class qdl {
    private static mzz qdl;
    private rq ud;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.wd.qdl$qdl, reason: collision with other inner class name */
    public static final class C0097qdl {
        private Bundle mo;
        private Set<String> mzz;
        final List<jpc> mml = new ArrayList();
        int qdl = 10000;
        int ud = 10000;
        int lnr = 10000;

        public C0097qdl lnr(long j, TimeUnit timeUnit) {
            this.lnr = qdl("timeout", j, timeUnit);
            return this;
        }

        public C0097qdl qdl(boolean z2) {
            return this;
        }

        public C0097qdl ud(long j, TimeUnit timeUnit) {
            this.ud = qdl("timeout", j, timeUnit);
            return this;
        }

        public C0097qdl qdl(long j, TimeUnit timeUnit) {
            this.qdl = qdl("timeout", j, timeUnit);
            return this;
        }

        public C0097qdl qdl(jpc jpcVar) {
            this.mml.add(jpcVar);
            return this;
        }

        private static int qdl(String str, long j, TimeUnit timeUnit) {
            if (j < 0) {
                throw new IllegalArgumentException(a.m(str, " < 0"));
            }
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis > 2147483647L) {
                    throw new IllegalArgumentException(a.m(str, " too large."));
                }
                if (millis != 0 || j <= 0) {
                    return (int) millis;
                }
                throw new IllegalArgumentException(a.m(str, " too small."));
            }
            throw new NullPointerException("unit == null");
        }

        public qdl qdl() {
            return new qdl(this);
        }
    }

    public static boolean mzz() {
        mzz mzzVar = qdl;
        if (mzzVar == null) {
            return false;
        }
        return mzzVar.qdl();
    }

    public static void qdl() {
        lnr.qdl(lnr.qdl.DEBUG);
    }

    public com.bytedance.sdk.component.wd.ud.ud lnr() {
        return new com.bytedance.sdk.component.wd.ud.ud(this.ud);
    }

    public com.bytedance.sdk.component.wd.ud.qdl mml() {
        return new com.bytedance.sdk.component.wd.ud.qdl(this.ud);
    }

    public rq mo() {
        return this.ud;
    }

    public mml ud() {
        return new mml(this.ud);
    }

    private qdl(C0097qdl c0097qdl) {
        rq.qdl qdlVar = new rq.qdl();
        long j = c0097qdl.qdl;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        rq.qdl qdlVarUd = qdlVar.qdl(j, timeUnit).lnr(c0097qdl.lnr, timeUnit).ud(c0097qdl.ud, timeUnit);
        List<jpc> list = c0097qdl.mml;
        if (list != null && list.size() > 0) {
            Iterator<jpc> it = c0097qdl.mml.iterator();
            while (it.hasNext()) {
                qdlVarUd.qdl(it.next());
            }
        }
        if (c0097qdl.mo != null) {
            Bundle unused = c0097qdl.mo;
        }
        Set unused2 = c0097qdl.mzz;
        this.ud = qdlVarUd.qdl();
    }

    public static void qdl(mzz mzzVar) {
        qdl = mzzVar;
    }
}
