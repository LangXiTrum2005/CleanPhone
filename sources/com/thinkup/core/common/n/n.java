package com.thinkup.core.common.n;

import android.util.Log;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdSourceStatusListener;
import com.thinkup.core.api.TUBaseAdAdapter;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class n {
    WeakReference<TUAdSourceStatusListener> adSourceEventListenerRef;

    /* JADX INFO: Access modifiers changed from: private */
    public TUAdSourceStatusListener getAdSourceStatusListener() {
        WeakReference<TUAdSourceStatusListener> weakReference = this.adSourceEventListenerRef;
        if (weakReference == null) {
            return null;
        }
        TUAdSourceStatusListener tUAdSourceStatusListener = weakReference.get();
        if (tUAdSourceStatusListener == null) {
            Log.e(mo.oo0, "TUAdSourceStatusListener had been released.");
        }
        return tUAdSourceStatusListener;
    }

    public void onAdSourceAttempt(com.thinkup.core.common.on.n0 n0Var) {
        final mn mnVarO = mn.o(n0Var, (TUBaseAdAdapter) null, 2);
        o0n.m().m(new Runnable() { // from class: com.thinkup.core.common.n.n.4
            @Override // java.lang.Runnable
            public final void run() {
                TUAdSourceStatusListener adSourceStatusListener = n.this.getAdSourceStatusListener();
                if (adSourceStatusListener != null) {
                    adSourceStatusListener.onAdSourceAttempt(mnVarO);
                }
            }
        });
    }

    public void onAdSourceBiddingAttempt(com.thinkup.core.common.on.n0 n0Var) {
        final mn mnVarO = mn.o(n0Var, (TUBaseAdAdapter) null);
        o0n.m().m(new Runnable() { // from class: com.thinkup.core.common.n.n.1
            @Override // java.lang.Runnable
            public final void run() {
                TUAdSourceStatusListener adSourceStatusListener = n.this.getAdSourceStatusListener();
                if (adSourceStatusListener != null) {
                    adSourceStatusListener.onAdSourceBiddingAttempt(mnVarO);
                }
            }
        });
    }

    public void onAdSourceBiddingFail(com.thinkup.core.common.on.n0 n0Var, final AdError adError) {
        final mn mnVarO = mn.o(n0Var, (TUBaseAdAdapter) null);
        o0n.m().m(new Runnable() { // from class: com.thinkup.core.common.n.n.3
            @Override // java.lang.Runnable
            public final void run() {
                TUAdSourceStatusListener adSourceStatusListener = n.this.getAdSourceStatusListener();
                if (adSourceStatusListener != null) {
                    adSourceStatusListener.onAdSourceBiddingFail(mnVarO, adError);
                }
            }
        });
    }

    public void onAdSourceBiddingFilled(com.thinkup.core.common.on.n0 n0Var) {
        final mn mnVarO = mn.o(n0Var, (TUBaseAdAdapter) null, 1);
        o0n.m().m(new Runnable() { // from class: com.thinkup.core.common.n.n.2
            @Override // java.lang.Runnable
            public final void run() {
                TUAdSourceStatusListener adSourceStatusListener = n.this.getAdSourceStatusListener();
                if (adSourceStatusListener != null) {
                    adSourceStatusListener.onAdSourceBiddingFilled(mnVarO);
                }
            }
        });
    }

    public void onAdSourceLoadFail(com.thinkup.core.common.on.n0 n0Var, final AdError adError) {
        final mn mnVarO = mn.o(n0Var, (TUBaseAdAdapter) null, 3);
        o0n.m().m(new Runnable() { // from class: com.thinkup.core.common.n.n.6
            @Override // java.lang.Runnable
            public final void run() {
                TUAdSourceStatusListener adSourceStatusListener = n.this.getAdSourceStatusListener();
                if (adSourceStatusListener != null) {
                    adSourceStatusListener.onAdSourceLoadFail(mnVarO, adError);
                }
            }
        });
    }

    public void onAdSourceLoadFilled(com.thinkup.core.common.on.n0 n0Var) {
        final mn mnVarO = mn.o(n0Var, (TUBaseAdAdapter) null, 3);
        o0n.m().m(new Runnable() { // from class: com.thinkup.core.common.n.n.5
            @Override // java.lang.Runnable
            public final void run() {
                TUAdSourceStatusListener adSourceStatusListener = n.this.getAdSourceStatusListener();
                if (adSourceStatusListener != null) {
                    adSourceStatusListener.onAdSourceLoadFilled(mnVarO);
                }
            }
        });
    }

    public void setAdSourceStatusListener(TUAdSourceStatusListener tUAdSourceStatusListener) {
        if (tUAdSourceStatusListener == null) {
            return;
        }
        this.adSourceEventListenerRef = new WeakReference<>(tUAdSourceStatusListener);
    }
}
