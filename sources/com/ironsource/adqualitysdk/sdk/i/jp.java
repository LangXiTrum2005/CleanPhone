package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.ironsource.adqualitysdk.sdk.i.jo.AnonymousClass1;
import com.ironsource.adqualitysdk.sdk.i.jo.AnonymousClass2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class jp {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static jp f2843;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<View> f2845 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private List<jv> f2844 = new ArrayList();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private List<View> f2847 = new ArrayList();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private iw f2846 = new iw() { // from class: com.ironsource.adqualitysdk.sdk.i.jp.4
        @Override // com.ironsource.adqualitysdk.sdk.i.iw
        /* JADX INFO: renamed from: ｋ */
        public final void mo1852() {
            List<View> listM2839 = ki.m2839();
            jp.this.f2847.clear();
            jp.this.f2847.addAll(jp.this.f2845);
            for (int i10 = 0; i10 < listM2839.size(); i10++) {
                View view = listM2839.get(i10);
                jp.this.f2847.remove(view);
                if (!jp.this.f2845.contains(view)) {
                    jp.this.f2845.add(view);
                    jp.this.m2704(view);
                }
            }
            for (int i11 = 0; i11 < jp.this.f2847.size(); i11++) {
                View view2 = (View) jp.this.f2847.get(i11);
                jp.this.f2845.remove(view2);
                jp.this.m2708(view2);
            }
            jp.this.f2847.clear();
        }
    };

    private jp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public synchronized void m2704(View view) {
        Iterator<jv> it = this.f2844.iterator();
        while (it.hasNext()) {
            it.next().mo213(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public synchronized void m2708(View view) {
        Iterator<jv> it = this.f2844.iterator();
        while (it.hasNext()) {
            it.next().mo210(view);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static synchronized jp m2705() {
        try {
            if (f2843 == null) {
                f2843 = new jp();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f2843;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2709(jv jvVar) {
        synchronized (this) {
            try {
                this.f2844.remove(jvVar);
                if (this.f2844.size() == 0) {
                    p.m3001(jo.m2696().new AnonymousClass2(this.f2846));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2710(final jv jvVar) {
        synchronized (this) {
            this.f2844.add(jvVar);
        }
        p.m3001(jo.m2696().new AnonymousClass1(this.f2846));
        p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jp.2
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                Iterator it = jp.this.f2845.iterator();
                while (it.hasNext()) {
                    jvVar.mo213((View) it.next());
                }
            }
        });
    }
}
