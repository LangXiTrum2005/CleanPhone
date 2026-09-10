package com.thinkup.core.common.on;

import android.os.Looper;
import android.util.Log;
import androidx.media3.extractor.text.ttml.a;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUBaseAdAdapter;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class o implements Comparable<o> {
    private int m;
    private int m0;
    private boolean mm;
    private long mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f42221n;
    private boolean n0;
    private TUBaseAdAdapter o0;
    private int om;
    private long on;
    private BaseAd oo;
    private String o = getClass().getSimpleName();
    private String mn = "1";

    private long o0m() {
        return this.on;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(o oVar) {
        o oVar2 = oVar;
        o0mm unitGroupInfo = this.o0.getUnitGroupInfo();
        o0mm unitGroupInfo2 = oVar2.o0.getUnitGroupInfo();
        int iM = com.thinkup.core.common.ooo.mn.m(unitGroupInfo, unitGroupInfo2);
        if (iM < 0) {
            return -1;
        }
        if (iM > 0) {
            return 1;
        }
        int i2 = unitGroupInfo.no;
        int i3 = unitGroupInfo2.no;
        if (i2 < i3) {
            return -1;
        }
        if (i2 != i3) {
            return 1;
        }
        if (m() < oVar2.m()) {
            return -1;
        }
        return m() != oVar2.m() ? 1 : 0;
    }

    public final boolean m0() {
        return this.mm;
    }

    public final boolean mm() {
        return this.f42221n + this.on > System.currentTimeMillis();
    }

    public final boolean mn() {
        return mm() && on();
    }

    public final n0 mo() {
        BaseAd baseAd = this.oo;
        return baseAd != null ? baseAd.getDetail() : this.o0.getTrackingInfo();
    }

    public final String n0() {
        return this.mn;
    }

    public final double nm() {
        return com.thinkup.core.common.ooo.nn.o(this.o0.getUnitGroupInfo());
    }

    public final o0mm nn() {
        return this.o0.getUnitGroupInfo();
    }

    public final synchronized void no() {
        if (this.mm) {
            return;
        }
        this.mm = true;
        if (this.om <= 0) {
            com.thinkup.core.common.n.o0n.m().m(new Runnable() { // from class: com.thinkup.core.common.on.o.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (o.this.om <= 0) {
                            if (o.this.o0 != null) {
                                o.this.o0.internalDestory();
                            }
                            if (o.this.oo != null) {
                                o.this.oo.destroy();
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    public final long o0() {
        return this.f42221n;
    }

    public final TUAdInfo o00() {
        BaseAd baseAd = this.oo;
        TUBaseAdAdapter tUBaseAdAdapter = this.o0;
        if (baseAd != null) {
            return com.thinkup.core.common.n.mn.o(baseAd, tUBaseAdAdapter, 4);
        }
        if (tUBaseAdAdapter != null) {
            return com.thinkup.core.common.n.mn.o(tUBaseAdAdapter, 4);
        }
        return null;
    }

    public final boolean o0o() {
        return this.n0;
    }

    public final BaseAd om() {
        return this.oo;
    }

    public final boolean on() {
        BaseAd baseAd;
        o0mm unitGroupInfo;
        on0 on0VarN0n;
        try {
            if (this.mm || this.om > 0) {
                return false;
            }
            TUBaseAdAdapter tUBaseAdAdapter = this.o0;
            if (tUBaseAdAdapter != null && (unitGroupInfo = tUBaseAdAdapter.getUnitGroupInfo()) != null && (on0VarN0n = unitGroupInfo.n0n()) != null && on0VarN0n.omo()) {
                this.n0 = true;
                return false;
            }
            if (this.o0 != null && (baseAd = this.oo) != null && baseAd.isValid()) {
                return true;
            }
            try {
                if (Looper.myLooper() == null) {
                    Looper.prepare();
                }
            } catch (Throwable unused) {
            }
            TUBaseAdAdapter tUBaseAdAdapter2 = this.o0;
            if (tUBaseAdAdapter2 != null) {
                return tUBaseAdAdapter2.internalIsAdReady();
            }
            return false;
        } catch (Exception e2) {
            Log.e("AdCacheInfo", "isNetworkAdReady()  >>> " + e2.getMessage());
        }
    }

    public final TUBaseAdAdapter oo() {
        return this.o0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdCacheInfo{UnitGroupInfo:");
        sb.append(this.o0.getUnitGroupInfo().toString());
        sb.append(", showTime=");
        sb.append(this.om);
        sb.append(", cacheTime=");
        sb.append(this.on);
        sb.append(", upStatus=");
        sb.append(this.m0);
        sb.append(", upStatusOutDateTime=");
        sb.append(this.f42221n + this.mo);
        sb.append(", hasDestroy=");
        return a.r(sb, this.mm, AbstractJsonLexerKt.END_OBJ);
    }

    private int o0(o oVar) {
        o0mm unitGroupInfo = this.o0.getUnitGroupInfo();
        o0mm unitGroupInfo2 = oVar.o0.getUnitGroupInfo();
        int iM = com.thinkup.core.common.ooo.mn.m(unitGroupInfo, unitGroupInfo2);
        if (iM < 0) {
            return -1;
        }
        if (iM > 0) {
            return 1;
        }
        int i2 = unitGroupInfo.no;
        int i3 = unitGroupInfo2.no;
        if (i2 < i3) {
            return -1;
        }
        if (i2 != i3) {
            return 1;
        }
        if (m() < oVar.m()) {
            return -1;
        }
        return m() != oVar.m() ? 1 : 0;
    }

    public final long m() {
        return this.f42221n + this.mo;
    }

    public final int n() {
        return this.om;
    }

    public final boolean o() {
        return this.m0 == 1 && System.currentTimeMillis() - this.f42221n < this.mo;
    }

    public final void m(long j) {
        this.on = j;
    }

    public final void n(long j) {
        this.m0 = 1;
        this.f42221n = j;
    }

    public final void o(long j) {
        this.mo = j;
    }

    public final void o(int i2) {
        o0mm unitGroupInfo;
        on0 on0VarN0n;
        this.om = i2;
        if (i2 > 0) {
            this.m0 = 0;
            TUBaseAdAdapter tUBaseAdAdapter = this.o0;
            if (tUBaseAdAdapter == null || (unitGroupInfo = tUBaseAdAdapter.getUnitGroupInfo()) == null || (on0VarN0n = unitGroupInfo.n0n()) == null) {
                return;
            }
            on0VarN0n.o00();
        }
    }

    public final void o(TUBaseAdAdapter tUBaseAdAdapter) {
        this.o0 = tUBaseAdAdapter;
    }

    public final void o(BaseAd baseAd) {
        this.oo = baseAd;
        TUBaseAdAdapter tUBaseAdAdapter = this.o0;
        if ((!(tUBaseAdAdapter != null) || !(tUBaseAdAdapter.getUnitGroupInfo() != null)) || this.o0.getUnitGroupInfo().omn0() != null) {
            return;
        }
        this.o0.getUnitGroupInfo().o(baseAd);
    }

    public final void o(String str) {
        this.mn = str;
    }
}
