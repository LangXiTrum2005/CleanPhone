package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class ebl extends View implements com.bytedance.sdk.component.utils.aH.Lxb {
    private ViewTreeObserver.OnGlobalLayoutListener JVA;
    private List<View> JXs;
    private boolean LD;
    private boolean Lxb;
    private final Runnable NXR;
    private int OY;
    private final Handler QAg;
    private View ZU;
    private boolean ebl;

    @Nullable
    private List<View> lc;
    private Lxb lk;
    private final AtomicBoolean nBu;
    private boolean sLN;

    public interface Lxb {
        void LD();

        void Lxb();

        void Lxb(View view);

        void Lxb(boolean z);
    }

    public ebl(Context context, View view) {
        super(kqm.Lxb());
        this.QAg = new com.bytedance.sdk.component.utils.aH(STP.LD().getLooper(), this);
        this.nBu = new AtomicBoolean(true);
        this.sLN = false;
        this.NXR = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ebl.3
            @Override // java.lang.Runnable
            public void run() {
                if (ebl.this.lk != null) {
                    ebl.this.lk.Lxb(ebl.this.ZU);
                }
            }
        };
        this.ZU = view;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        this.JVA = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.ebl.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (ebl.this.sLN) {
                    return;
                }
                ebl.this.JXs();
                ebl.this.ZU();
            }
        };
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.ebl = false;
        LD();
        if (this.JVA != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.JVA);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        JXs();
        this.ebl = true;
        lk();
        Lxb(false);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        LD();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        lk();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Lxb lxb = this.lk;
        if (lxb != null) {
            lxb.Lxb(z);
        }
    }

    public void setAdType(int i) {
        this.OY = i;
    }

    public void setCallback(Lxb lxb) {
        this.lk = lxb;
    }

    public void setNeedCheckingShow(boolean z) {
        this.LD = z;
        if (!z && this.Lxb) {
            JXs();
        } else {
            if (!z || this.Lxb) {
                return;
            }
            ZU();
        }
    }

    public void setRefClickViews(List<View> list) {
        this.JXs = list;
    }

    public void setRefCreativeViews(@Nullable List<View> list) {
        this.lc = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void JXs() {
        if (this.Lxb) {
            this.QAg.removeCallbacksAndMessages(null);
            this.Lxb = false;
        }
    }

    private void LD() {
        Lxb lxb;
        if (!this.nBu.getAndSet(false) || (lxb = this.lk) == null) {
            return;
        }
        lxb.Lxb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZU() {
        if (!this.LD || this.Lxb) {
            return;
        }
        this.Lxb = true;
        this.QAg.sendEmptyMessage(1);
    }

    private boolean lc() {
        View view = this.ZU;
        if (view instanceof com.bytedance.sdk.openadsdk.core.OY.tD) {
            return ((com.bytedance.sdk.openadsdk.core.OY.tD) view).IeN();
        }
        return true;
    }

    private void lk() {
        Lxb lxb;
        if (this.nBu.getAndSet(true) || (lxb = this.lk) == null) {
            return;
        }
        lxb.LD();
    }

    public void Lxb() {
        Lxb(this.JXs, (com.bytedance.sdk.openadsdk.core.LD.lk) null);
        Lxb(this.lc, (com.bytedance.sdk.openadsdk.core.LD.lk) null);
    }

    public void Lxb(List<View> list, com.bytedance.sdk.openadsdk.core.LD.lk lkVar) {
        if (com.bytedance.sdk.component.utils.nBu.LD(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(lkVar);
                    view.setOnTouchListener(lkVar);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.aH.Lxb
    public void Lxb(Message message) {
        if (message.what == 1 && this.Lxb) {
            if (lc() && nE.Lxb(this.ZU, 20, this.OY)) {
                JXs();
                this.sLN = true;
                STP.lk().post(this.NXR);
                Lxb(true);
                return;
            }
            this.QAg.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    private void Lxb(final boolean z) {
        final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        com.bytedance.sdk.component.utils.ebl.LD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ebl.2
            @Override // java.lang.Runnable
            public void run() {
                ViewTreeObserver viewTreeObserver2;
                if (ebl.this.JVA != null && (viewTreeObserver2 = viewTreeObserver) != null) {
                    try {
                        viewTreeObserver2.removeOnGlobalLayoutListener(ebl.this.JVA);
                    } catch (Exception unused) {
                    }
                }
                if (z) {
                    ebl.this.JVA = null;
                }
            }
        });
    }
}
