package com.bytedance.sdk.openadsdk.core.ka;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.core.pv;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.utils.dzy;

/* JADX INFO: loaded from: classes2.dex */
public class di extends com.bytedance.adsdk.ugeno.di.ri<View> implements igq.ri {
    private boolean di;
    private long fi;
    private ri jbs;
    private final Handler ka;
    private lr mj;
    private final Runnable qt;
    private final ViewTreeObserver.OnScrollChangedListener sf;
    private boolean xha;

    public interface lr {
        void ri(boolean z);
    }

    public interface ri {
        void ri(boolean z);
    }

    public di(Context context) {
        super(context);
        this.ka = new igq(vr.lr().getLooper(), this);
        this.di = true;
        this.xha = true;
        this.qt = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ka.di.1
            @Override // java.lang.Runnable
            public void run() {
                if (di.this.jbs != null) {
                    di.this.jbs.ri(di.this.xha);
                }
            }
        };
        this.sf = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.ka.di.2
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jElapsedRealtime - di.this.fi > 500) {
                    di.this.fi = jElapsedRealtime;
                    di.this.ka.sendEmptyMessageDelayed(1, 500L);
                }
            }
        };
    }

    private void xha() {
        boolean zRi = pv.ri(this, 50, -1, false);
        this.xha = zRi;
        if (zRi == this.di) {
            return;
        }
        this.di = zRi;
        dzy.ri(this.qt);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.sf);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.sf);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        lr lrVar = this.mj;
        if (lrVar != null) {
            lrVar.ri(z);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.di.ri
    public View qt(int i) {
        return (View) this.ri.get(i);
    }

    public void setSwiperVisibleChangeListener(ri riVar) {
        this.jbs = riVar;
    }

    public void setSwiperWindowFocusChangedListener(lr lrVar) {
        this.mj = lrVar;
    }

    @Override // com.bytedance.sdk.component.utils.igq.ri
    public void ri(Message message) {
        if (message.what == 1) {
            xha();
        }
    }
}
