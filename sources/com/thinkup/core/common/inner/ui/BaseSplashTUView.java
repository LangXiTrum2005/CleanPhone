package com.thinkup.core.common.inner.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.v0.k;
import com.thinkup.core.common.inner.oo.oo;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.ooo;
import com.thinkup.core.common.ooo.moo;
import com.thinkup.core.common.ooo.o.om;
import com.thinkup.core.common.ooo.o00;
import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseSplashTUView extends BaseTUView {
    private long m;
    protected TextView mm;
    protected CloseFrameLayout mn;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<String, Object> f41840n;
    protected CloseShadeView n0;
    protected Timer nm;
    protected volatile boolean nn;
    protected String no;
    private om.m o;
    protected com.thinkup.core.common.inner.oo.o o00;
    protected com.thinkup.core.common.inner.ui.oo.o o0m;
    protected int o0n;
    final long o0o;
    boolean oo0;
    boolean oom;
    boolean oon;
    boolean ooo;
    public int ranDom;

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.BaseSplashTUView$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (BaseSplashTUView.this.onn.oo0.mn() == 0 || BaseSplashTUView.this.oom) {
                BaseSplashTUView.this.oo();
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.BaseSplashTUView$2, reason: invalid class name */
    public class AnonymousClass2 implements ViewTreeObserver.OnGlobalLayoutListener {
        public AnonymousClass2() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ViewGroup.LayoutParams layoutParams;
            CloseShadeView closeShadeView = BaseSplashTUView.this.n0;
            if (closeShadeView != null && (layoutParams = closeShadeView.getLayoutParams()) != null) {
                layoutParams.width = BaseSplashTUView.this.mn.getWidth();
                layoutParams.height = BaseSplashTUView.this.mn.getHeight();
                BaseSplashTUView.this.n0.setLayoutParams(layoutParams);
            }
            BaseSplashTUView.this.mn.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.BaseSplashTUView$3, reason: invalid class name */
    public class AnonymousClass3 extends TimerTask {
        public AnonymousClass3() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            BaseSplashTUView baseSplashTUView = BaseSplashTUView.this;
            if (moo.o(baseSplashTUView, baseSplashTUView.o)) {
                BaseSplashTUView.this.post(new Runnable() { // from class: com.thinkup.core.common.inner.ui.BaseSplashTUView.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (BaseSplashTUView.this.m <= 0) {
                            BaseSplashTUView.n(BaseSplashTUView.this);
                            return;
                        }
                        BaseSplashTUView baseSplashTUView2 = BaseSplashTUView.this;
                        baseSplashTUView2.o(baseSplashTUView2.m);
                        BaseSplashTUView.this.m -= 1000;
                    }
                });
            }
        }
    }

    public BaseSplashTUView(Context context) {
        super(context);
        this.no = "Skip";
        this.o0o = 1000L;
        this.m = 5000L;
        this.oo0 = false;
        this.ooo = false;
        this.oom = false;
    }

    private void m0() {
        oo();
        this.mm.setText(this.no);
        this.oom = true;
    }

    private static boolean mm() {
        return false;
    }

    private static void mo() {
    }

    public static /* synthetic */ void n(BaseSplashTUView baseSplashTUView) {
        baseSplashTUView.oo();
        baseSplashTUView.mm.setText(baseSplashTUView.no);
        baseSplashTUView.oom = true;
    }

    private void o0() {
        if (this.ooo) {
            return;
        }
        this.ooo = true;
        if (this.oon) {
            return;
        }
        this.mn.setVisibility(0);
        this.mn.setOnClickListener(new AnonymousClass1());
        if (this.o0n >= this.ranDom) {
            CloseFrameLayout closeFrameLayout = this.mn;
            if (closeFrameLayout != null) {
                closeFrameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2());
            }
            CloseShadeView closeShadeView = this.n0;
            if (closeShadeView != null) {
                closeShadeView.setVisibility(0);
            }
        } else {
            CloseShadeView closeShadeView2 = this.n0;
            if (closeShadeView2 != null) {
                closeShadeView2.setVisibility(8);
            }
        }
        this.oom = false;
        Timer timer = new Timer();
        this.nm = timer;
        timer.schedule(new AnonymousClass3(), 1000L, 1000L);
        o(this.m);
        this.m -= 1000;
    }

    private void on() {
        this.mn.setVisibility(0);
        this.mn.setOnClickListener(new AnonymousClass1());
        if (this.o0n >= this.ranDom) {
            CloseFrameLayout closeFrameLayout = this.mn;
            if (closeFrameLayout != null) {
                closeFrameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2());
            }
            CloseShadeView closeShadeView = this.n0;
            if (closeShadeView != null) {
                closeShadeView.setVisibility(0);
            }
        } else {
            CloseShadeView closeShadeView2 = this.n0;
            if (closeShadeView2 != null) {
                closeShadeView2.setVisibility(8);
            }
        }
        this.oom = false;
        Timer timer = new Timer();
        this.nm = timer;
        timer.schedule(new AnonymousClass3(), 1000L, 1000L);
        o(this.m);
        this.m -= 1000;
    }

    @Override // com.thinkup.core.common.inner.ui.BaseTUView
    public final void a_() {
        this.oo0 = true;
        if (this.o00 != null) {
            new oo();
        }
    }

    public void checkSkipViewLocation() {
        try {
            ViewGroup.LayoutParams layoutParams = this.mm.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                int iM = ((FrameLayout.LayoutParams) layoutParams).topMargin + o00.m(getContext());
                int[] iArr = new int[2];
                this.mm.getLocationOnScreen(iArr);
                int i2 = iArr[1];
                if (i2 < iM) {
                    int i3 = iM - i2;
                    ViewParent parent = this.mm.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).setPadding(((ViewGroup) parent).getPaddingLeft(), ((ViewGroup) parent).getPaddingTop() + i3, ((ViewGroup) parent).getPaddingRight(), ((ViewGroup) parent).getPaddingBottom());
                    }
                    View viewFindViewById = findViewById(o00.o(getContext(), "myoffer_btn_mute_id", "id"));
                    if (viewFindViewById != null && (viewFindViewById.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) viewFindViewById.getLayoutParams();
                        layoutParams2.topMargin += i3;
                        viewFindViewById.setLayoutParams(layoutParams2);
                    }
                    View viewFindViewById2 = findViewById(o00.o(getContext(), "myoffer_feedback_ll_id", "id"));
                    if (viewFindViewById2 == null || !(viewFindViewById2.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
                        return;
                    }
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) viewFindViewById2.getLayoutParams();
                    layoutParams3.topMargin += i3;
                    viewFindViewById2.setLayoutParams(layoutParams3);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.thinkup.core.common.inner.ui.BaseTUView
    public final void o(boolean z2) {
    }

    public final void om() {
        Timer timer = this.nm;
        if (timer != null) {
            timer.cancel();
        }
        this.nm = null;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        checkSkipViewLocation();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        if (i2 != 0 || this.ooo) {
            return;
        }
        this.ooo = true;
        if (this.oon) {
            return;
        }
        this.mn.setVisibility(0);
        this.mn.setOnClickListener(new AnonymousClass1());
        if (this.o0n >= this.ranDom) {
            CloseFrameLayout closeFrameLayout = this.mn;
            if (closeFrameLayout != null) {
                closeFrameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2());
            }
            CloseShadeView closeShadeView = this.n0;
            if (closeShadeView != null) {
                closeShadeView.setVisibility(0);
            }
        } else {
            CloseShadeView closeShadeView2 = this.n0;
            if (closeShadeView2 != null) {
                closeShadeView2.setVisibility(8);
            }
        }
        this.oom = false;
        Timer timer = new Timer();
        this.nm = timer;
        timer.schedule(new AnonymousClass3(), 1000L, 1000L);
        o(this.m);
        this.m -= 1000;
    }

    public void oo() {
        om();
        if (this.nn) {
            return;
        }
        this.nn = true;
        com.thinkup.core.common.inner.oo.o oVar = this.o00;
        if (oVar != null) {
            oVar.m();
        }
    }

    public void setAdExtraInfoMap(Map<String, Object> map) {
        this.f41840n = map;
    }

    public void setDontCountDown(boolean z2) {
        this.oon = z2;
        if (z2) {
            CloseFrameLayout closeFrameLayout = this.mn;
            if (closeFrameLayout != null) {
                closeFrameLayout.setVisibility(8);
            }
            CloseShadeView closeShadeView = this.n0;
            if (closeShadeView != null) {
                closeShadeView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(long j) {
        if (this.onn.oo0.mn() == 0) {
            this.mm.setText((j / 1000) + "s | " + this.no);
            return;
        }
        this.mm.setText((j / 1000) + " s");
    }

    @Override // com.thinkup.core.common.inner.ui.BaseTUView
    public final void o(oo ooVar) {
        ooo oooVar = this.m00;
        if (oooVar == null || oooVar.on() == null || !this.m00.on().ono()) {
            return;
        }
        o0n.m().m(new Runnable() { // from class: com.thinkup.core.common.inner.ui.BaseSplashTUView.4
            @Override // java.lang.Runnable
            public final void run() {
                BaseSplashTUView.this.oo();
            }
        });
    }

    public BaseSplashTUView(Context context, oom oomVar, ooo oooVar, com.thinkup.core.common.inner.oo.o oVar) {
        super(context, oomVar, oooVar);
        this.no = "Skip";
        this.o0o = 1000L;
        this.m = 5000L;
        this.oo0 = false;
        this.ooo = false;
        this.oom = false;
        this.o = new om.m((oooVar == null || oooVar.on() == null) ? 1 : oooVar.on().nm0());
        this.o00 = oVar;
        this.no = getResources().getString(o00.o(getContext(), "myoffer_splash_skip_text", k.f38992h));
        this.mm = (TextView) findViewById(o00.o(getContext(), "myoffer_splash_skip", "id"));
        this.mn = (CloseFrameLayout) findViewById(o00.o(getContext(), "myoffer_splash_skip_area", "id"));
        this.n0 = (CloseShadeView) findViewById(o00.o(getContext(), "myoffer_splash_skip_shade_area", "id"));
        this.m = this.onn.oo0.mo();
        this.nn = false;
        com.thinkup.core.common.inner.ui.oo.o oVar2 = new com.thinkup.core.common.inner.ui.oo.o(this.m00, this.onn);
        this.o0m = oVar2;
        oVar2.m(this);
        this.ranDom = new Random().nextInt(100) + 1;
        this.o0n = this.onn.oo0.o();
        int i2 = this.onn.mm;
        if (i2 == 34 || i2 == 58 || i2 == 2 || i2 == 39) {
            this.o0n = -1;
        }
    }
}
