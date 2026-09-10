package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class mj extends View implements com.bytedance.sdk.component.utils.igq.ri {
    private boolean aw;
    private final Runnable bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private boolean f18131co;
    private List<View> di;
    private List<View> fi;
    private ri ik;
    private final Handler jbs;
    private View ka;
    private boolean lr;
    private int mj;
    private final AtomicBoolean qt;
    private boolean ri;
    private ViewTreeObserver.OnGlobalLayoutListener sf;
    private boolean xha;

    public interface ri {
        void lr();

        void ri();

        void ri(View view);

        void ri(boolean z);
    }

    public mj(Context context, View view, boolean z) {
        super(nr.ri());
        this.jbs = new com.bytedance.sdk.component.utils.igq(vr.lr().getLooper(), this);
        this.qt = new AtomicBoolean(true);
        this.aw = false;
        this.bgr = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mj.3
            @Override // java.lang.Runnable
            public void run() {
                if (mj.this.ik != null) {
                    mj.this.ik.ri(mj.this.ka);
                }
            }
        };
        this.f18131co = z;
        this.ka = view;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        this.sf = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.mj.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (mj.this.aw) {
                    return;
                }
                mj.this.fi();
                mj.this.ka();
            }
        };
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.xha = false;
        lr();
        if (this.sf != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.sf);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fi();
        this.xha = true;
        ik();
        ri(false);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        lr();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        ik();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        ri riVar = this.ik;
        if (riVar != null) {
            riVar.ri(z);
        }
    }

    public void setAdType(int i) {
        this.mj = i;
    }

    public void setCallback(ri riVar) {
        this.ik = riVar;
    }

    public void setNeedCheckingShow(boolean z) {
        this.lr = z;
        if (!z && this.ri) {
            fi();
        } else {
            if (!z || this.ri) {
                return;
            }
            ka();
        }
    }

    public void setRefClickViews(List<View> list) {
        this.fi = list;
    }

    public void setRefCreativeViews(List<View> list) {
        this.di = list;
    }

    private boolean di() {
        View view = this.ka;
        if (view instanceof com.bytedance.sdk.openadsdk.core.jbs.ac) {
            return ((com.bytedance.sdk.openadsdk.core.jbs.ac) view).wjv();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fi() {
        if (this.ri) {
            this.jbs.removeCallbacksAndMessages(null);
            this.ri = false;
        }
    }

    private void ik() {
        ri riVar;
        if (this.qt.getAndSet(true) || (riVar = this.ik) == null) {
            return;
        }
        riVar.lr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ka() {
        if (!this.lr || this.ri) {
            return;
        }
        this.ri = true;
        this.jbs.sendEmptyMessage(1);
    }

    private void lr() {
        ri riVar;
        if (!this.qt.getAndSet(false) || (riVar = this.ik) == null) {
            return;
        }
        riVar.ri();
    }

    public void ri() {
        ri(this.fi, (com.bytedance.sdk.openadsdk.core.ik.ik) null);
        ri(this.di, (com.bytedance.sdk.openadsdk.core.ik.ik) null);
    }

    public void ri(List<View> list, com.bytedance.sdk.openadsdk.core.ik.ik ikVar) {
        if (com.bytedance.sdk.component.utils.aw.lr(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(ikVar);
                    view.setOnTouchListener(ikVar);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.igq.ri
    public void ri(Message message) {
        if (message.what == 1 && this.ri) {
            if (di() && pv.ri(this.ka, 20, this.mj, this.f18131co)) {
                fi();
                this.aw = true;
                vr.ik().post(this.bgr);
                ri(true);
                return;
            }
            this.jbs.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    private void ri(final boolean z) {
        final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        com.bytedance.sdk.component.utils.jbs.lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mj.2
            @Override // java.lang.Runnable
            public void run() {
                ViewTreeObserver viewTreeObserver2;
                if (mj.this.sf != null && (viewTreeObserver2 = viewTreeObserver) != null) {
                    try {
                        viewTreeObserver2.removeOnGlobalLayoutListener(mj.this.sf);
                    } catch (Exception unused) {
                    }
                }
                if (z) {
                    mj.this.sf = null;
                }
            }
        });
    }
}
