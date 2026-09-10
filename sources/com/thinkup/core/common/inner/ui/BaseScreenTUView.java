package com.thinkup.core.common.inner.ui;

import android.content.Context;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.thinkup.core.basead.ui.web.WebProgressBarView;
import com.thinkup.core.common.inner.oo.o0;
import com.thinkup.core.common.inner.oo.oo;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.oon;
import com.thinkup.core.common.on.ooo;
import com.thinkup.core.common.ooo.o00;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseScreenTUView extends BaseTUView {
    public static final int FORMAT_INTERSTITIAL = 3;
    public static final int FORMAT_REWARD_VIDEO = 1;
    public static final String TAG = "BaseScreenTUView";
    public boolean hasClick;
    protected int m;
    protected boolean m0;
    protected long mm;
    private CountDownView mm0;
    private WebProgressBarView mmo;
    protected int mn;
    protected int mo;
    private long mom;
    private long mon;
    private long moo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f41837n;
    protected boolean n0;
    protected boolean nm;
    protected RelativeLayout nn;
    protected boolean no;
    protected int o;
    protected int o0;
    protected PanelView o00;
    protected CloseImageView o0m;
    protected CloseShadeView o0n;
    protected BaseEndCardView o0o;
    protected int om;
    protected o0 om0;
    protected int omm;
    protected int omn;
    protected boolean omo;
    protected int on;
    protected int on0;
    protected int ono;
    protected int oo;
    protected ViewGroup oo0;
    com.thinkup.core.common.inner.ui.oo.o oom;
    protected com.thinkup.core.common.inner.ui.component.o oon;
    protected MuteImageView ooo;
    public int ranDom;

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.BaseScreenTUView$1, reason: invalid class name */
    public class AnonymousClass1 implements BaseEndCardView.o {
        public AnonymousClass1() {
        }

        @Override // com.thinkup.core.common.inner.ui.BaseEndCardView.o
        public final void m() {
        }

        @Override // com.thinkup.core.common.inner.ui.BaseEndCardView.o
        public final void o() {
            String str = BaseScreenTUView.TAG;
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.BaseScreenTUView$2, reason: invalid class name */
    public class AnonymousClass2 implements View.OnClickListener {
        public AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BaseScreenTUView.this.n0();
        }
    }

    public BaseScreenTUView(Context context) {
        super(context);
        this.hasClick = false;
    }

    private void m00() {
        CloseImageView closeImageView = this.o0m;
        if (closeImageView != null) {
            closeImageView.setVisibility(8);
            this.o0m.setOnClickListener(new AnonymousClass2());
        }
    }

    private void m0m() {
        com.thinkup.core.common.inner.ui.component.o oVar = this.oon;
        if (oVar != null) {
            oVar.o();
        }
    }

    private void m0n() {
        if (1 == this.o) {
            o00();
            if (this.no) {
                return;
            }
            this.no = true;
            o0 o0Var = this.om0;
            if (o0Var != null) {
                o0Var.n();
            }
        }
    }

    private void m0o() {
        MuteImageView muteImageView = this.ooo;
        if (muteImageView == null || muteImageView.getVisibility() == 0) {
            return;
        }
        this.ooo.setVisibility(0);
    }

    private void omm() {
        com.thinkup.core.common.inner.ui.oo.o oVar = new com.thinkup.core.common.inner.ui.oo.o(this.m00, this.onn);
        this.oom = oVar;
        oVar.m(this);
    }

    private void omn() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        this.f41837n = i2;
        int i3 = displayMetrics.heightPixels;
        this.o0 = i3;
        this.omm = i2;
        this.omn = i3;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    private void omo() {
        this.moo = this.onn.oo0.nn() > 0 ? this.onn.oo0.nn() * 1000 : this.onn.oo0.nn();
        long jO00 = this.onn.oo0.o00() > 0 ? this.onn.oo0.o00() * 1000 : this.onn.oo0.o00();
        this.mom = jO00;
        if (jO00 > 0) {
            long j = this.moo;
            if (j >= 0) {
                this.mon = j + jO00;
            } else {
                this.mon = jO00;
            }
        } else {
            this.mon = jO00;
        }
        this.on = this.onn.oo0.o0n() * 1000;
        this.mn = this.onn.oo0.o();
        this.nm = this.onn.oo0.o0m() == 0;
        int i2 = this.onn.mm;
        if (i2 == 34 || i2 == 58 || i2 == 2 || i2 == 39) {
            this.mn = -1;
        }
    }

    private static void on0() {
    }

    private void onm() {
        destroy();
    }

    private void onn() {
        m(4);
    }

    private void ono() {
        this.mo = on();
        EndCardView endCardView = new EndCardView(getContext(), this.m00, this.onn);
        endCardView.setSize(this.f41837n, this.o0);
        endCardView.init(false, false, new AnonymousClass1());
        this.o0o = endCardView;
        o0o();
        endCardView.load();
        if (o(this.mo)) {
            nn();
        }
        o0m();
    }

    @Override // com.thinkup.core.common.inner.ui.BaseTUView
    public final void a_() {
        o0 o0Var = this.om0;
        if (o0Var != null) {
            o0Var.o(new oo());
        }
    }

    @Override // com.thinkup.core.common.inner.ui.BaseTUView
    public void b_() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        this.f41837n = i2;
        int i3 = displayMetrics.heightPixels;
        this.o0 = i3;
        this.omm = i2;
        this.omn = i3;
        m0();
    }

    @Override // com.thinkup.core.common.inner.ui.BaseTUView
    public void destroy() {
        super.destroy();
        this.om0 = null;
    }

    public long getHideBannerTime() {
        return this.mon;
    }

    public long getShowBannerTime() {
        return this.moo;
    }

    public void handleFullScreenClick(ViewGroup viewGroup) {
    }

    public boolean hasReward() {
        return this.no;
    }

    public void init() {
        o0();
    }

    public boolean isShowEndCard() {
        return this.n0;
    }

    public boolean isVideoMute() {
        return this.nm;
    }

    public final void m(int i2) {
        com.thinkup.core.common.inner.ui.component.o oVar = this.oon;
        if (oVar != null) {
            oVar.o(i2);
        }
    }

    public void m0() {
    }

    public void mm() {
    }

    public void mn() {
    }

    public void mo() {
    }

    public abstract void n0();

    public void nm() {
        m(0);
        MuteImageView muteImageView = this.ooo;
        if (muteImageView == null || muteImageView.getVisibility() == 0) {
            return;
        }
        this.ooo.setVisibility(0);
    }

    public final void nn() {
        PanelView panelView = this.o00;
        if (panelView != null) {
            if (panelView.getVisibility() != 0) {
                panelView.setVisibility(0);
            }
            if (panelView.getCTAButton() == null || panelView.getCTAButton().getVisibility() != 0) {
                return;
            }
            ScanningAnimButton scanningAnimButton = this.mo0;
            if (scanningAnimButton == null || !scanningAnimButton.equals(panelView.getCTAButton())) {
                this.mo0 = (ScanningAnimButton) panelView.getCTAButton();
            }
        }
    }

    public final void no() {
        o0 o0Var = this.om0;
        if (o0Var != null) {
            o0Var.o0();
        }
    }

    public final void o(com.thinkup.core.common.inner.m.o oVar) {
        o0 o0Var = this.om0;
        if (o0Var != null) {
            o0Var.o(oVar);
        }
    }

    public abstract boolean o(int i2);

    public void o0() {
        this.nn = (RelativeLayout) findViewById(o00.o(getContext(), "myoffer_rl_root", "id"));
        this.o0m = (CloseImageView) findViewById(o00.o(getContext(), "myoffer_btn_close_id", "id"));
        this.o0n = (CloseShadeView) findViewById(o00.o(getContext(), "myoffer_btn_close_shade_id", "id"));
        this.o00 = (PanelView) findViewById(o00.o(getContext(), "myoffer_banner_view_id", "id"));
        this.mm0 = (CountDownView) findViewById(o00.o(getContext(), "myoffer_count_down_view_id", "id"));
        this.ooo = (MuteImageView) findViewById(o00.o(getContext(), "myoffer_btn_mute_id", "id"));
        this.oo0 = (ViewGroup) findViewById(o00.o(getContext(), "myoffer_feedback_ll_id", "id"));
        WebProgressBarView webProgressBarView = (WebProgressBarView) findViewById(o00.o(getContext(), "myoffer_player_view_progress_bar_id", "id"));
        this.mmo = webProgressBarView;
        this.oon = new com.thinkup.core.common.inner.ui.component.o(this.onn.oo0, this.mm0, webProgressBarView);
        com.thinkup.core.common.inner.ui.oo.o oVar = new com.thinkup.core.common.inner.ui.oo.o(this.m00, this.onn);
        this.oom = oVar;
        oVar.m(this);
        m(4);
        mn();
        CloseImageView closeImageView = this.o0m;
        if (closeImageView != null) {
            closeImageView.setVisibility(8);
            this.o0m.setOnClickListener(new AnonymousClass2());
        }
        mo();
        mm();
        this.m0 = o(this.mo);
    }

    public void o00() {
        CloseImageView closeImageView = this.o0m;
        if (closeImageView == null || closeImageView.getVisibility() == 0) {
            return;
        }
        this.o0m.setVisibility(0);
    }

    public void o0m() {
    }

    public final CloseImageView o0n() {
        return this.o0m;
    }

    public abstract void o0o();

    public void om() {
        this.n0 = true;
        this.mo = on();
        EndCardView endCardView = new EndCardView(getContext(), this.m00, this.onn);
        endCardView.setSize(this.f41837n, this.o0);
        endCardView.init(false, false, new AnonymousClass1());
        this.o0o = endCardView;
        o0o();
        endCardView.load();
        if (o(this.mo)) {
            nn();
        }
        o0m();
    }

    public final boolean om0() {
        oon oonVar;
        oom oomVar = this.onn;
        return (oomVar == null || (oonVar = oomVar.oo0) == null || oonVar.o0o() == 0) ? false : true;
    }

    public abstract int on();

    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    public void oo() {
    }

    public final PanelView oo0() {
        return this.o00;
    }

    public final boolean oom() {
        oom oomVar = this.onn;
        return oomVar != null && oomVar.mm == 2;
    }

    public final boolean oon() {
        oom oomVar = this.onn;
        return oomVar != null && oomVar.mm == 39;
    }

    public final boolean ooo() {
        oom oomVar = this.onn;
        return oomVar != null && oomVar.mm == 59;
    }

    public void setHasReward(boolean z2) {
        this.no = z2;
    }

    public void setHideBannerTime(long j) {
        this.mon = j;
    }

    public void setIsShowEndCard(boolean z2) {
        this.n0 = z2;
    }

    public void setListener(o0 o0Var) {
        this.om0 = o0Var;
    }

    public void setShowBannerTime(long j) {
        this.moo = j;
    }

    public void setVideoMute(boolean z2) {
        this.nm = z2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006d  */
    public BaseScreenTUView(Context context, oom oomVar, ooo oooVar, String str, int i2, int i3) {
        super(context, oomVar, oooVar, str);
        this.hasClick = false;
        this.o = i2;
        this.m = i3;
        this.omo = false;
        this.ranDom = new Random().nextInt(100) + 1;
        this.moo = this.onn.oo0.nn() > 0 ? this.onn.oo0.nn() * 1000 : this.onn.oo0.nn();
        long jO00 = this.onn.oo0.o00() > 0 ? this.onn.oo0.o00() * 1000 : this.onn.oo0.o00();
        this.mom = jO00;
        if (jO00 > 0) {
            long j = this.moo;
            if (j >= 0) {
                this.mon = j + jO00;
            } else {
                this.mon = jO00;
            }
        } else {
            this.mon = jO00;
        }
        this.on = this.onn.oo0.o0n() * 1000;
        this.mn = this.onn.oo0.o();
        this.nm = this.onn.oo0.o0m() == 0;
        int i4 = this.onn.mm;
        if (i4 == 34 || i4 == 58 || i4 == 2 || i4 == 39) {
            this.mn = -1;
        }
    }

    public final void m(long j) {
        com.thinkup.core.common.inner.ui.component.o oVar = this.oon;
        if (oVar != null) {
            oVar.o(j);
        }
    }

    @Override // com.thinkup.core.common.inner.ui.BaseTUView
    public final void o(oo ooVar) {
        o0 o0Var = this.om0;
        if (o0Var != null) {
            o0Var.m(ooVar);
        }
    }

    @Override // com.thinkup.core.common.inner.ui.BaseTUView
    public final void o(boolean z2) {
        o0 o0Var = this.om0;
        if (o0Var != null) {
            o0Var.o(z2);
        }
    }

    public final void o(long j) {
        com.thinkup.core.common.inner.ui.component.o oVar = this.oon;
        if (oVar != null) {
            oVar.m(j);
        }
    }
}
