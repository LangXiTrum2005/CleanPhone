package com.thinkup.core.common.mn.o0;

import android.content.Context;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.ITUBaseAdAdapter;
import com.thinkup.core.api.TUNativeAdCustomRender;
import com.thinkup.core.common.on.n0;

/* JADX INFO: loaded from: classes6.dex */
public final class o {
    private BaseAd m;
    private m m0;
    private int mm;
    private int mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private n0 f41874n;
    private Context o;
    private TUNativeAdCustomRender o0;
    private com.thinkup.core.common.mn.m.o.m om;
    private boolean on;
    private com.thinkup.core.common.mn.oo.o.m oo;

    /* JADX INFO: renamed from: com.thinkup.core.common.mn.o0.o$o, reason: collision with other inner class name */
    public static class C0664o {
        private BaseAd m;
        private int m0;
        private int mo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private n0 f41875n;
        private Context o;
        private TUNativeAdCustomRender o0;
        private com.thinkup.core.common.mn.m.o.m om;
        private boolean on;
        private com.thinkup.core.common.mn.oo.o.m oo;

        public final C0664o m(int i2) {
            this.mo = i2;
            return this;
        }

        public final C0664o o(Context context) {
            this.o = context;
            return this;
        }

        public final C0664o o(BaseAd baseAd) {
            this.m = baseAd;
            return this;
        }

        public final C0664o o(TUNativeAdCustomRender tUNativeAdCustomRender) {
            this.o0 = tUNativeAdCustomRender;
            return this;
        }

        public final C0664o o(com.thinkup.core.common.mn.oo.o.m mVar) {
            this.oo = mVar;
            return this;
        }

        public final C0664o o(n0 n0Var) {
            this.f41875n = n0Var;
            return this;
        }

        public final C0664o o(boolean z2) {
            this.on = z2;
            return this;
        }

        public final C0664o o(com.thinkup.core.common.mn.m.o.m mVar) {
            this.om = mVar;
            return this;
        }

        public final C0664o o(int i2) {
            this.m0 = i2;
            return this;
        }

        public final o o() {
            o oVar = new o((byte) 0);
            oVar.o = this.o;
            oVar.m = this.m;
            oVar.o0 = this.o0;
            oVar.oo = this.oo;
            oVar.om = this.om;
            oVar.f41874n = this.f41875n;
            oVar.on = this.on;
            oVar.mo = this.m0;
            oVar.mm = this.mo;
            return oVar;
        }
    }

    public /* synthetic */ o(byte b2) {
        this();
    }

    private int n0() {
        m mVar = this.m0;
        if (mVar != null) {
            return mVar.m();
        }
        return -1;
    }

    public final boolean m0() {
        return this.on;
    }

    public final int mm() {
        return this.mo;
    }

    public final int mn() {
        return this.mm;
    }

    public final com.thinkup.core.common.mn.m.o.m mo() {
        return this.om;
    }

    public final TUNativeAdCustomRender n() {
        return this.o0;
    }

    public final com.thinkup.core.common.mn.oo.o.m o0() {
        return this.oo;
    }

    public final ITUBaseAdAdapter om() {
        m mVar = this.m0;
        if (mVar != null) {
            return mVar.o0m();
        }
        return null;
    }

    public final n0 on() {
        return this.f41874n;
    }

    public final int oo() {
        m mVar = this.m0;
        if (mVar != null) {
            return mVar.oo();
        }
        return -1;
    }

    private o() {
    }

    public final BaseAd m() {
        return this.m;
    }

    public final Context o() {
        return this.o;
    }

    public final void o(m mVar) {
        this.m0 = mVar;
    }

    public final int o(String str) {
        m mVar = this.m0;
        return Math.max(mVar != null ? ((Integer) mVar.o(str, 5)).intValue() : 5, 3);
    }
}
