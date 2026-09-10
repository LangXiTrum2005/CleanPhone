package com.thinkup.core.oo;

import android.util.Log;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.common.on.nnn;
import com.thinkup.core.common.ooo.onm;

/* JADX INFO: loaded from: classes6.dex */
public class no implements com.thinkup.core.common.n0.o0o {
    private static final String o = "no";
    private final nm m;
    private com.thinkup.core.common.o0n.m m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final nnn f42465n;
    private final nm.m o0;
    private com.thinkup.core.common.o0n.o om;
    private boolean[] on;
    private final n0 oo;

    public no(nm nmVar, nnn nnnVar, nm.m mVar, n0 n0Var) {
        this.m = nmVar;
        this.f42465n = nnnVar;
        this.o0 = mVar;
        this.oo = n0Var;
    }

    private void o() {
        com.thinkup.core.common.o0n.m mVar;
        com.thinkup.core.common.o0n.o oVar = this.om;
        if (oVar == null || (mVar = this.m0) == null) {
            return;
        }
        oVar.o(mVar);
    }

    @Override // com.thinkup.core.common.n0.o0o
    public void onLoadCanceled(int i2) {
        o();
        nm.m mVar = this.o0;
        if (mVar == null) {
            return;
        }
        n0 n0Var = this.oo;
        if (n0Var == null) {
            mVar.o(ErrorCode.getErrorCode(ErrorCode.exception, "", "by canceled"));
        } else {
            mVar.o(n0Var);
        }
    }

    @Override // com.thinkup.core.common.n0.o0o
    public void onLoadError(int i2, String str, AdError adError) {
        nm.m mVar;
        o();
        if (this.f42465n != null) {
            if (ErrorCode.statuError.equals(adError.getCode()) && ("10004".equals(adError.getPlatformCode()) || "10003".equals(adError.getPlatformCode()) || "10001".equals(adError.getPlatformCode()))) {
                String str2 = this.f42465n.m() + this.f42465n.o0() + this.f42465n.n();
                adError.getPlatformCode();
                adError.getPlatformMSG();
                onm.o(com.thinkup.core.common.n.o0n.m().on(), com.thinkup.core.common.n.oo0.m.mn, str2, System.currentTimeMillis());
                if (com.thinkup.core.common.n.o0n.m().m0o()) {
                    Log.e(com.thinkup.core.common.n.mo.oo0, "Please check these params in your code (AppId: " + this.f42465n.m() + ", AppKey: " + this.f42465n.n() + ", PlacementId: " + this.f42465n.o0() + ")");
                }
            }
            if ("699".equals(adError.getPlatformCode())) {
                this.m.o(this.f42465n.m(), this.f42465n.o0(), this.oo);
                nm.m mVar2 = this.o0;
                if (mVar2 != null) {
                    mVar2.o(adError);
                    return;
                }
                return;
            }
        }
        n0 n0Var = this.oo;
        if (n0Var == null && (mVar = this.o0) != null) {
            mVar.o(adError);
        } else if (this.o0 != null) {
            if (n0Var.on0o()) {
                this.o0.o(adError);
            } else {
                this.o0.o(this.oo);
            }
        }
    }

    @Override // com.thinkup.core.common.n0.o0o
    public void onLoadFinish(int i2, Object obj) {
        o();
        nm.m mVar = this.o0;
        if (mVar != null) {
            mVar.m();
        }
        nm nmVar = this.m;
        if (nmVar != null) {
            nmVar.o(obj, this.f42465n, this.o0, this.on, this.oo);
        }
    }

    @Override // com.thinkup.core.common.n0.o0o
    public void onLoadStart(int i2) {
        nm.m mVar = this.o0;
        if (mVar != null) {
            mVar.o();
        }
    }

    public no(nm nmVar, nnn nnnVar, nm.m mVar, n0 n0Var, com.thinkup.core.common.o0n.o oVar, com.thinkup.core.common.o0n.m mVar2, boolean[] zArr) {
        this.m = nmVar;
        this.f42465n = nnnVar;
        this.o0 = mVar;
        this.om = oVar;
        this.on = zArr;
        this.m0 = mVar2;
        this.oo = n0Var;
    }
}
