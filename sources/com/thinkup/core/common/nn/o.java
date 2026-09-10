package com.thinkup.core.common.nn;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.p004ironsource.x4;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.om;
import com.thinkup.core.common.on.mmm;
import com.thinkup.core.common.ooo;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class o implements o0 {
    String m;
    private TUAdRequest mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f41986n;
    m o0;
    long om;
    String o = "o";
    AtomicBoolean oo = new AtomicBoolean(false);
    long on = 2000;
    com.thinkup.core.common.o0n.m m0 = new com.thinkup.core.common.o0n.m() { // from class: com.thinkup.core.common.nn.o.1
        @Override // java.lang.Runnable
        public final void run() {
            o.this.oo();
        }
    };

    public o(String str, String str2) {
        this.m = str;
        this.f41986n = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void oo() {
        if (m()) {
            if (this.oo.get()) {
                this.oo.set(false);
                if (this.om == 0 || SystemClock.elapsedRealtime() - this.om > this.on) {
                    this.om = SystemClock.elapsedRealtime();
                    o(o0n.m().mm0(), this.mo, 4);
                }
            }
        }
    }

    @Override // com.thinkup.core.common.nn.o0
    public final boolean m() {
        return ooo.o().oo(this.m);
    }

    @Override // com.thinkup.core.common.nn.o0
    public final void n() {
        m mVar;
        if (!m() || (mVar = this.o0) == null) {
            return;
        }
        mVar.o(this.m);
    }

    @Override // com.thinkup.core.common.nn.o0
    public final synchronized void o0() {
        this.oo.set(false);
        com.thinkup.core.common.o0n.o0.o().o(this.m0);
    }

    @Override // com.thinkup.core.common.nn.o0
    public final synchronized void o(int i2) {
        if (this.oo.get()) {
            return;
        }
        this.oo.set(true);
        com.thinkup.core.common.o0n.o0.o().o(this.m0, ((long) Math.pow(2.0d, i2)) * 1000, false);
    }

    public final TUAdRequest o() {
        return this.mo;
    }

    @Override // com.thinkup.core.common.nn.o0
    public final void o(Context context, TUAdRequest tUAdRequest, int i2) {
        this.mo = tUAdRequest;
        mmm mmmVar = new mmm();
        mmmVar.o(context);
        mmmVar.o(tUAdRequest);
        mmmVar.f42198n = i2;
        om.o(context, this.m, this.f41986n).m(context, this.f41986n, this.m, mmmVar, null);
    }

    @Override // com.thinkup.core.common.nn.o0
    public final void o(AdError adError, int i2, boolean z2) {
        if (m()) {
            if (z2) {
                o(i2);
            }
            m mVar = this.o0;
            if (mVar != null) {
                mVar.o(this.m, adError);
            }
        }
    }

    @Override // com.thinkup.core.common.nn.o0
    public final void o(m mVar) {
        this.o0 = mVar;
    }

    @Override // com.thinkup.core.common.nn.o0
    public final boolean o(int i2, List<String> list) {
        String str;
        if (list == null) {
            return true;
        }
        if (i2 == 4) {
            str = "1";
        } else if (i2 == 5) {
            str = "2";
        } else if (i2 == 6) {
            str = "3";
        } else if (i2 != 7) {
            str = x4.DISABLED_AUCTION_FALLBACK_ID;
        } else {
            str = "4";
        }
        if (TextUtils.equals(str, x4.DISABLED_AUCTION_FALLBACK_ID)) {
            list.toString();
            return true;
        }
        if (list.contains(str)) {
            list.toString();
            return true;
        }
        list.toString();
        return false;
    }
}
