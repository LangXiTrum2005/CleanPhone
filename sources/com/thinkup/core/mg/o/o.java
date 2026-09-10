package com.thinkup.core.mg.o;

import android.os.SystemClock;
import com.thinkup.core.common.on.mmm;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.ooo.nn;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.mg.api.MgAdInfo;
import com.thinkup.core.mg.api.MgComparedResult;
import com.thinkup.core.mg.api.MgPreLoadAdRequest;
import com.thinkup.core.mg.api.MgPreLoadCallback;
import com.thinkup.core.mg.api.MgPreLoadCallbackRegister;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public class o {
    private static final String o = "o";
    private final AtomicBoolean m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f42397n = new Object();
    private final AtomicReference<MgComparedResult> oo = new AtomicReference<>();
    private final List<m> o0 = new ArrayList(2);

    private static boolean o(int i2) {
        return i2 == 0 || i2 == 9 || i2 == 8 || i2 == 5;
    }

    private static boolean m(mmm mmmVar, o0mm o0mmVar) {
        MgPreLoadAdRequest preLoadInfo;
        return (o0mmVar == null || mmmVar == null || mmmVar.m() == null || (preLoadInfo = mmmVar.m().getPreLoadInfo()) == null || !preLoadInfo.isEnableCpEcpm()) ? false : true;
    }

    public final void o(m mVar) {
        synchronized (this.f42397n) {
            this.o0.add(mVar);
        }
    }

    private o0mm m(o0mm o0mmVar) {
        MgComparedResult mgComparedResultO = o();
        if (nn.o(o0mmVar) > ((mgComparedResultO == null || mgComparedResultO.getMgAdInfo() == null) ? 0.0d : mgComparedResultO.getMgAdInfo().getUSDEcpm())) {
            return o0mmVar;
        }
        return null;
    }

    private void o(MgComparedResult mgComparedResult) {
        ArrayList<m> arrayList;
        this.oo.set(mgComparedResult);
        if (this.o0.isEmpty() || !this.m.compareAndSet(false, true)) {
            return;
        }
        o00.o(Thread.currentThread().getStackTrace());
        if (mgComparedResult == null) {
            mgComparedResult = MgComparedResult.create();
        }
        synchronized (this.f42397n) {
            arrayList = new ArrayList(this.o0);
            this.o0.clear();
        }
        if (arrayList.isEmpty()) {
            return;
        }
        for (m mVar : arrayList) {
            if (mVar != null) {
                mVar.o(mgComparedResult);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(MgPreLoadAdRequest mgPreLoadAdRequest, o0mm o0mmVar, MgAdInfo mgAdInfo, long j, boolean z2) {
        MgComparedResult mgComparedResultCreate = MgComparedResult.create(o0mmVar, mgAdInfo, j > 0 ? SystemClock.elapsedRealtime() - j : 0L, z2);
        if (mgPreLoadAdRequest != null) {
            mgPreLoadAdRequest.setMgComparedResult(mgComparedResultCreate);
        }
        o00.o(Thread.currentThread().getStackTrace());
        o(mgComparedResultCreate);
    }

    public final MgComparedResult o() {
        return this.oo.get();
    }

    private boolean o(o0mm o0mmVar) {
        MgComparedResult mgComparedResultO = o();
        if (mgComparedResultO != null && mgComparedResultO.isMgWin()) {
            double uSDEcpm = mgComparedResultO.getMgAdInfo() != null ? mgComparedResultO.getMgAdInfo().getUSDEcpm() : 0.0d;
            if (uSDEcpm > 0.0d && nn.o(o0mmVar) < uSDEcpm) {
                return true;
            }
        }
        return false;
    }

    public final void o(mmm mmmVar, final o0mm o0mmVar) {
        Throwable th;
        MgPreLoadAdRequest preLoadInfo;
        boolean z2 = false;
        if (o0mmVar != null && mmmVar != null) {
            try {
                if (mmmVar.m() != null && (preLoadInfo = mmmVar.m().getPreLoadInfo()) != null && preLoadInfo.isEnableCpEcpm()) {
                    z2 = true;
                }
            } catch (Throwable th2) {
                th = th2;
                th.getMessage();
                o(MgComparedResult.create());
            }
        }
        if (!z2) {
            o(MgComparedResult.create());
            return;
        }
        try {
            final MgPreLoadAdRequest preLoadInfo2 = mmmVar.m().getPreLoadInfo();
            MgPreLoadCallbackRegister preLoadCallbackRegister = preLoadInfo2 != null ? preLoadInfo2.getPreLoadCallbackRegister() : null;
            MgAdInfo mgAdInfo = preLoadCallbackRegister != null ? preLoadCallbackRegister.getMgAdInfo() : null;
            if (preLoadCallbackRegister != null && !MgAdInfo.isMgAdInfoValid(mgAdInfo)) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                preLoadCallbackRegister.registerPreLoadCallback(new MgPreLoadCallback() { // from class: com.thinkup.core.mg.o.o.1
                    @Override // com.thinkup.core.mg.api.MgPreLoadCallback
                    public final void onMgAdInfo(MgAdInfo mgAdInfo2, boolean z3) {
                        String unused = o.o;
                        o.this.o(preLoadInfo2, o0mmVar, mgAdInfo2, jElapsedRealtime, z3);
                    }
                });
                preLoadCallbackRegister.startTimeoutCountDown(preLoadInfo2.getCpEcpmTimeout());
            } else {
                try {
                    o(preLoadInfo2, o0mmVar, mgAdInfo, 0L, false);
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    th.getMessage();
                    o(MgComparedResult.create());
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
