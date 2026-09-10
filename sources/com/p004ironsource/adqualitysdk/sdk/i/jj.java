package com.p004ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.p004ironsource.adqualitysdk.sdk.i.jc.AnonymousClass3;
import com.p004ironsource.adqualitysdk.sdk.i.jc.AnonymousClass4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class jj {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static jj f2711;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<View> f2715 = new ArrayList();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private List<jn> f2714 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private List<View> f2712 = new ArrayList();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private il f2713 = new il() { // from class: com.ironsource.adqualitysdk.sdk.i.jj.5
        @Override // com.p004ironsource.adqualitysdk.sdk.i.il
        /* JADX INFO: renamed from: ｋ */
        public final void mo1780() {
            List<View> listM2682 = jx.m2682();
            jj.this.f2712.clear();
            jj.this.f2712.addAll(jj.this.f2715);
            for (int i2 = 0; i2 < listM2682.size(); i2++) {
                View view = listM2682.get(i2);
                jj.this.f2712.remove(view);
                if (!jj.this.f2715.contains(view)) {
                    jj.this.f2715.add(view);
                    jj.this.m2612(view);
                }
            }
            for (int i3 = 0; i3 < jj.this.f2712.size(); i3++) {
                View view2 = (View) jj.this.f2712.get(i3);
                jj.this.f2715.remove(view2);
                jj.this.m2609(view2);
            }
            jj.this.f2712.clear();
        }
    };

    private jj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public synchronized void m2612(View view) {
        Iterator<jn> it = this.f2714.iterator();
        while (it.hasNext()) {
            it.next().mo231(view);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static synchronized jj m2607() {
        try {
            if (f2711 == null) {
                f2711 = new jj();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2711;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public synchronized void m2609(View view) {
        Iterator<jn> it = this.f2714.iterator();
        while (it.hasNext()) {
            it.next().mo229(view);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2614(jn jnVar) {
        synchronized (this) {
            try {
                this.f2714.remove(jnVar);
                if (this.f2714.size() == 0) {
                    s.m2917(jc.m2538().new AnonymousClass3(this.f2713));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2613(final jn jnVar) {
        synchronized (this) {
            this.f2714.add(jnVar);
        }
        s.m2917(jc.m2538().new AnonymousClass4(this.f2713));
        s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.jj.4
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                Iterator it = jj.this.f2715.iterator();
                while (it.hasNext()) {
                    jnVar.mo231((View) it.next());
                }
            }
        });
    }
}
