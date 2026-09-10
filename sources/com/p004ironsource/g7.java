package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: loaded from: classes5.dex */
class g7 extends o2 {
    public g7(m2 m2Var, hn hnVar) {
        super(m2Var, hnVar);
    }

    private boolean n() {
        return b().b() > 0;
    }

    private boolean p() {
        return b().d() >= 0;
    }

    public void l() {
        if (o()) {
            IronLog.INTERNAL.verbose();
            i();
        }
    }

    public void m() {
        if (o()) {
            IronLog.INTERNAL.verbose();
            i();
        }
    }

    public boolean o() {
        return b().a() == m2.a.MANUAL_WITH_LOAD_ON_SHOW;
    }

    public void q() {
        if (o() && d()) {
            IronLog.INTERNAL.verbose();
            a(b().c());
        }
    }

    public void r() {
        if (!n()) {
            IronLog.INTERNAL.verbose("banner reload interval is disabled");
        } else if (o() && p()) {
            IronLog.INTERNAL.verbose();
            a(b().d());
        }
    }
}
