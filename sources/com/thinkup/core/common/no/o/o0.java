package com.thinkup.core.common.no.o;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o0 implements mo {
    protected final int m;
    protected final long o;
    private final String om;
    private final int oo;

    public static class o {
        Queue<Runnable> o = new ConcurrentLinkedQueue();

        private void o(Runnable runnable) {
            this.o.add(runnable);
        }

        private void o() {
            for (Runnable runnable : this.o) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    private o0(String str) {
        this(str, (byte) 0);
    }

    public abstract oo o(o oVar, String str, String str2, int i2);

    @Override // com.thinkup.core.common.no.o.mo
    public final n0[] o(m0 m0Var) {
        String str = m0Var.o;
        int i2 = this.oo;
        if (TextUtils.isEmpty(this.om)) {
            throw new IllegalArgumentException("server can not empty");
        }
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("host can not empty");
        }
        List<n0> listO = o(new o(), this.om, str, i2).o();
        if (listO == null || listO.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (n0 n0Var : listO) {
            if (n0Var.o() || n0Var.m0 == 5 || n0Var.m() || n0Var.m0 == this.oo) {
                arrayList.add(n0Var);
            }
        }
        return (n0[]) arrayList.toArray(new n0[0]);
    }

    private o0(String str, byte b2) {
        this(str, 53, 500L);
    }

    public o0(String str, int i2, long j) {
        this(str, i2, j, 1);
    }

    public o0(String str, int i2, long j, int i3) {
        this.om = str;
        this.m = i2;
        this.o = j <= 0 ? 500L : j;
        this.oo = i3;
    }

    @Override // com.thinkup.core.common.no.o.mo
    public final om o() {
        return new om(this.om, this.m, this.o);
    }

    private oo o(String str) {
        int i2 = this.oo;
        if (!TextUtils.isEmpty(this.om)) {
            if (str != null && !str.isEmpty()) {
                return o(new o(), this.om, str, i2);
            }
            throw new IllegalArgumentException("host can not empty");
        }
        throw new IllegalArgumentException("server can not empty");
    }

    private oo o(String str, int i2) {
        if (!TextUtils.isEmpty(this.om)) {
            if (str != null && !str.isEmpty()) {
                return o(new o(), this.om, str, i2);
            }
            throw new IllegalArgumentException("host can not empty");
        }
        throw new IllegalArgumentException("server can not empty");
    }
}
