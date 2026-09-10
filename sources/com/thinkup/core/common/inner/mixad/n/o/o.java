package com.thinkup.core.common.inner.mixad.n.o;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.thinkup.core.api.TUNativeAdInfo;
import com.thinkup.core.common.mn.oo.o.m;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.ooo;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class o {
    private oom m;
    private int m0;
    private m mm;
    private View mn;
    private boolean mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ooo<?> f41817n;
    private int n0;
    private int no;
    private TUNativeAdInfo o;
    private Context o0;
    private boolean om;
    private String on;
    private WeakReference<Context> oo;

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.mixad.n.o.o$o, reason: collision with other inner class name */
    public static class C0658o {
        private TUNativeAdInfo m;
        private boolean m0;
        private View mm;
        private int mn;
        private m mo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private oom f41818n;
        private int n0;
        private Context o;
        private ooo<?> o0;
        private String om;
        private int on;
        private boolean oo;

        private m m() {
            return this.mo;
        }

        public final C0658o n(int i2) {
            this.n0 = i2;
            return this;
        }

        public final C0658o o(o oVar) {
            if (oVar != null) {
                this.o = oVar.mm();
                this.o0 = oVar.n();
                this.f41818n = oVar.m();
                this.mo = oVar.m0();
                this.m = oVar.o();
                this.mm = oVar.mo();
                this.m0 = oVar.on();
                this.oo = oVar.o0();
                this.on = oVar.om();
                this.om = oVar.oo();
                this.mn = oVar.mn();
                this.n0 = oVar.n0();
            }
            return this;
        }

        public final C0658o m(boolean z2) {
            this.m0 = z2;
            return this;
        }

        public final C0658o m(int i2) {
            this.mn = i2;
            return this;
        }

        public final C0658o o(TUNativeAdInfo tUNativeAdInfo) {
            this.m = tUNativeAdInfo;
            return this;
        }

        public final C0658o o(m mVar) {
            this.mo = mVar;
            return this;
        }

        public final C0658o o(oom oomVar) {
            this.f41818n = oomVar;
            return this;
        }

        public final C0658o o(ooo<?> oooVar) {
            this.o0 = oooVar;
            return this;
        }

        public final C0658o o(boolean z2) {
            this.oo = z2;
            return this;
        }

        public final C0658o o(String str) {
            this.om = str;
            return this;
        }

        public final C0658o o(int i2) {
            this.on = i2;
            return this;
        }

        public final C0658o o(Context context) {
            this.o = context;
            return this;
        }

        private C0658o o(View view) {
            this.mm = view;
            return this;
        }

        public final o o() {
            o oVar = new o((byte) 0);
            Context context = this.o;
            if (!(context instanceof Activity)) {
                oVar.o0 = context;
            } else {
                oVar.oo = new WeakReference(this.o);
            }
            oVar.o = this.m;
            oVar.mn = this.mm;
            oVar.mo = this.m0;
            oVar.mm = this.mo;
            oVar.f41817n = this.o0;
            oVar.m = this.f41818n;
            oVar.om = this.oo;
            oVar.m0 = this.on;
            oVar.on = this.om;
            oVar.n0 = this.mn;
            oVar.no = this.n0;
            return oVar;
        }
    }

    public /* synthetic */ o(byte b2) {
        this();
    }

    public final m m0() {
        return this.mm;
    }

    public final Context mm() {
        Context context = this.o0;
        WeakReference<Context> weakReference = this.oo;
        if (weakReference != null && weakReference.get() != null) {
            context = this.oo.get();
        }
        return context == null ? o0n.m().on() : context;
    }

    public final int mn() {
        return this.n0;
    }

    public final View mo() {
        return this.mn;
    }

    public final int n0() {
        return this.no;
    }

    public final boolean o0() {
        return this.om;
    }

    public final int om() {
        return this.m0;
    }

    public final boolean on() {
        return this.mo;
    }

    public final String oo() {
        return this.on;
    }

    private o() {
    }

    public final ooo<?> n() {
        return this.f41817n;
    }

    public final oom m() {
        return this.m;
    }

    public final TUNativeAdInfo o() {
        return this.o;
    }

    public final void o(View view) {
        this.mn = view;
    }
}
