package com.thinkup.core.common.on;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class o0o0 {
    private List<o> m;
    private String o;

    public o0o0(String str, List<o> list) {
        this.o = str;
        this.m = list;
    }

    private synchronized double m0() {
        try {
            List<o> list = this.m;
            o oVar = (list == null || list.size() <= 0) ? null : this.m.get(0);
            if (oVar != null) {
                return com.thinkup.core.common.ooo.nn.o(oVar.oo().getUnitGroupInfo());
            }
            return 0.0d;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized int m() {
        List<o> list = this.m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final synchronized o n() {
        List<o> list = this.m;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.m.get(0);
    }

    public final String o() {
        return this.o;
    }

    public final synchronized boolean o0() {
        try {
            List<o> list = this.m;
            o oVar = (list == null || list.size() <= 0) ? null : this.m.get(0);
            if (oVar != null) {
                return oVar.o();
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long om() {
        try {
            List<o> list = this.m;
            o oVar = (list == null || list.size() <= 0) ? null : this.m.get(0);
            if (oVar != null) {
                return oVar.m();
            }
            return 0L;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void on() {
        List<o> list = this.m;
        if (list == null) {
            return;
        }
        for (o oVar : list) {
            if (oVar != null) {
                com.thinkup.core.n.o0.n.o(oVar, true, 26);
                oVar.no();
            }
        }
    }

    public final synchronized o0mm oo() {
        try {
            List<o> list = this.m;
            o oVar = (list == null || list.size() <= 0) ? null : this.m.get(0);
            if (oVar != null) {
                return oVar.oo().getUnitGroupInfo();
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void o(o oVar) {
        List<o> list = this.m;
        if (list != null) {
            list.remove(oVar);
        }
    }

    public final synchronized void o(int i2) {
        List<o> list = this.m;
        if (list != null) {
            Iterator<o> it = list.iterator();
            while (it.hasNext()) {
                it.next().oo().getUnitGroupInfo().no = i2;
            }
        }
    }
}
