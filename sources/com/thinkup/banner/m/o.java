package com.thinkup.banner.m;

import android.text.TextUtils;
import com.thinkup.banner.o.n;
import com.thinkup.banner.unitgroup.api.CustomBannerAdapter;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.oo.n0;
import com.thinkup.core.oo.nm;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class o {
    WeakReference<n> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    com.thinkup.core.common.o0n.n f41793n;
    String o;
    CustomBannerAdapter o0;
    private boolean om = false;
    private Runnable oo = new Runnable() { // from class: com.thinkup.banner.m.o.1
        @Override // java.lang.Runnable
        public final void run() {
            o.o(o.this);
            o.m(o.this);
        }
    };

    public o(n nVar) {
        this.m = new WeakReference<>(nVar);
    }

    public static /* synthetic */ boolean o(o oVar) {
        oVar.om = false;
        return false;
    }

    private void o0() {
        WeakReference<n> weakReference = this.m;
        n nVar = weakReference != null ? weakReference.get() : null;
        if (nVar != null) {
            nVar.timeUpRefreshView();
        } else {
            n();
        }
    }

    public final synchronized void m() {
        CustomBannerAdapter customBannerAdapter;
        o0mm unitGroupInfo;
        try {
            if (TextUtils.isEmpty(this.o)) {
                return;
            }
            n0 n0VarO = nm.o(o0n.m().on()).o(this.o);
            if (this.f41793n != null) {
                n();
            }
            if (n0VarO != null && n0VarO.o00o() == 1) {
                this.om = true;
                long jOomo = (n0VarO.mn() != 2 || (customBannerAdapter = this.o0) == null || (unitGroupInfo = customBannerAdapter.getUnitGroupInfo()) == null) ? 0L : unitGroupInfo.oomo();
                if (jOomo <= 0) {
                    jOomo = n0VarO.o00m();
                }
                if (jOomo <= 2000) {
                    jOomo = 2000;
                }
                com.thinkup.core.common.o0n.n nVar = new com.thinkup.core.common.o0n.n(jOomo, this.oo, (byte) 0);
                this.f41793n = nVar;
                nVar.o();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void n() {
        try {
            com.thinkup.core.common.o0n.n nVar = this.f41793n;
            if (nVar != null) {
                nVar.m();
            }
            this.f41793n = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void o(String str) {
        this.o = str;
    }

    public final boolean o() {
        return this.om;
    }

    public final void o(CustomBannerAdapter customBannerAdapter) {
        this.o0 = customBannerAdapter;
    }

    public static /* synthetic */ void m(o oVar) {
        WeakReference<n> weakReference = oVar.m;
        n nVar = weakReference != null ? weakReference.get() : null;
        if (nVar != null) {
            nVar.timeUpRefreshView();
        } else {
            oVar.n();
        }
    }
}
