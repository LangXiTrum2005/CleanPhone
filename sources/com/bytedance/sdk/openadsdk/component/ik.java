package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdTransActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.di.mj;
import com.bytedance.sdk.openadsdk.core.model.nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.bu;
import com.bytedance.sdk.openadsdk.core.widget.slm;
import com.bytedance.sdk.openadsdk.utils.qd;
import dumb.dern;
import dumb.saneness;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private mj ac;
    private RelativeLayout aw;
    private com.bytedance.sdk.openadsdk.component.mj.ik ay;
    private ImageView bgr;
    private ImageView bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    protected final com.bytedance.sdk.openadsdk.component.mj.ri f18091co;
    protected final int di;
    protected final com.bytedance.sdk.openadsdk.component.ri fi;
    private mj fr;
    private slm igq;
    private float ihz;
    protected final boolean ik;
    protected View jbs;
    protected final FrameLayout ka;
    protected final wjv lr;
    protected FrameLayout mj;
    private bu nr;
    protected com.bytedance.sdk.openadsdk.core.di.ka qt;
    protected final Activity ri;
    protected mj sf;
    private mj slm;
    private com.bytedance.sdk.openadsdk.core.di.ka su;
    private mj tan;
    private float uq;
    private PAGLogoView vr;
    private final com.bytedance.sdk.openadsdk.component.jbs.mj wjv = new com.bytedance.sdk.openadsdk.component.jbs.mj();
    protected int xha;
    private View zf;

    public static class lr implements com.bytedance.sdk.openadsdk.utils.bu.ri {
        private final WeakReference<ik> ri;

        public lr(ik ikVar) {
            this.ri = new WeakReference<>(ikVar);
        }

        @Override // com.bytedance.sdk.openadsdk.utils.bu.ri
        public void ri() {
        }

        @Override // com.bytedance.sdk.openadsdk.utils.bu.ri
        public void ri(com.bytedance.sdk.openadsdk.ac.ri.lr lrVar) {
            ik ikVar;
            if (!lrVar.fi() || (ikVar = this.ri.get()) == null) {
                return;
            }
            ikVar.ri(lrVar);
            if (lrVar.lr() != null) {
                ikVar.ri(lrVar.ri());
            }
        }
    }

    public static class ri implements di.ik {
        private final WeakReference<ik> lr;
        WeakReference<Activity> ri;

        public ri(Activity activity, ik ikVar) {
            this.ri = new WeakReference<>(activity);
            this.lr = new WeakReference<>(ikVar);
        }

        @Override // com.bytedance.sdk.openadsdk.component.di.ik
        public void ri(Object obj) {
            ik ikVar;
            if (this.ri.get() == null || this.ri.get().isFinishing() || (ikVar = this.lr.get()) == null) {
                return;
            }
            ikVar.ri(obj);
        }
    }

    public ik(Activity activity, wjv wjvVar, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.ri riVar, int i, boolean z, com.bytedance.sdk.openadsdk.component.mj.ri riVar2) {
        this.ri = activity;
        this.lr = wjvVar;
        this.ka = frameLayout;
        this.xha = i;
        this.ik = z;
        this.fi = riVar;
        this.di = wjvVar.ur();
        this.f18091co = riVar2;
    }

    private void jbs() {
        if (this.tan != null) {
            if (this.lr.tyz() != null && !TextUtils.isEmpty(this.lr.tyz().lr())) {
                this.tan.setText(this.lr.tyz().lr());
            } else if (TextUtils.isEmpty(this.lr.tpb())) {
                this.tan.setVisibility(8);
            } else {
                this.tan.setText(this.lr.tpb());
            }
        }
        if (this.ac != null) {
            if (TextUtils.isEmpty(this.lr.xh())) {
                this.ac.setVisibility(8);
            } else {
                this.ac.setText(this.lr.xh());
            }
        }
        if (this.nr != null && this.lr.fb() != null && !TextUtils.isEmpty(this.lr.fb().ri())) {
            com.bytedance.sdk.openadsdk.ac.lr.lr().ri(this.lr.fb().ri(), this.lr.fb().lr(), this.lr.fb().ik(), this.nr, this.lr);
        }
        this.fi.ik();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    private void mj() {
        boolean z;
        this.wjv.ri();
        this.slm.setText(this.lr.skk());
        if (this.lr.ory()) {
            jbs();
            return;
        }
        if (this.ik) {
            lr(0);
            ri(8);
            if (ri(this.mj)) {
                this.fi.ik();
            } else {
                this.fi.ka();
            }
            di.ri(this.lr, new ri(this.ri, this), 25);
        } else {
            lr(8);
            ri(0);
            qt();
            this.fi.ik();
        }
        boolean z2 = true;
        if (this.fr == null) {
            z = false;
        } else {
            if (!TextUtils.isEmpty(this.lr.tpb())) {
                this.fr.setText(this.lr.tpb());
            } else if (this.lr.tyz() != null) {
                this.fr.setText(this.lr.tyz().lr());
            } else {
                z = false;
            }
            z = true;
        }
        if (this.su != null) {
            com.bytedance.sdk.openadsdk.ac.lr.lr().ri(this.lr.fb(), this.su, this.lr);
        }
        slm slmVar = this.igq;
        if (slmVar != null) {
            qd.ri((TextView) null, slmVar, this.lr);
            if (this.lr.tyz() == null || this.lr.tyz().ka() < 0.0d) {
                this.igq.setVisibility(8);
                z2 = z;
            }
        } else {
            z2 = z;
        }
        View view = this.zf;
        if (view != null) {
            view.setVisibility(z2 ? 0 : 8);
        }
    }

    private void qt() {
        nr nrVar = this.lr.rbz().get(0);
        com.bytedance.sdk.openadsdk.utils.bu.ri(new com.bytedance.sdk.openadsdk.ac.ri(nrVar.ri(), nrVar.xha()), nrVar.lr(), nrVar.ik(), new lr(this), com.bytedance.sdk.openadsdk.component.xha.ri.lr(TextUtils.isEmpty(nrVar.xha()) ? com.bytedance.sdk.component.utils.fi.ri(nrVar.ri()) : nrVar.xha()).getParent(), 25);
    }

    public void di() {
        View view = this.jbs;
        if (view == null || this.qt == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.ik.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                com.bytedance.sdk.openadsdk.component.ri riVar = ik.this.fi;
                if (riVar != null) {
                    riVar.lr(view2);
                }
            }
        });
        this.qt.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.ik.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                com.bytedance.sdk.openadsdk.component.ri riVar = ik.this.fi;
                if (riVar != null) {
                    riVar.ri(view2);
                }
            }
        });
    }

    public void ik() {
        com.bytedance.sdk.openadsdk.component.mj.ik ikVar = this.ay;
        if (ikVar != null) {
            ikVar.co();
        }
    }

    public int ka() {
        return -1;
    }

    public void lr() {
        Window window;
        if (this.lr.zyu()) {
            this.fi.ik();
        } else {
            mj();
        }
        Activity activity = this.ri;
        if (!(activity instanceof TTAppOpenAdTransActivity) || (window = activity.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1E1E1E")));
    }

    public JSONObject ri(JSONObject jSONObject) {
        return null;
    }

    public com.bytedance.sdk.openadsdk.component.mj.ik xha() {
        return this.ay;
    }

    public void ri(ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.component.jbs.ik kaVar = new com.bytedance.sdk.openadsdk.component.jbs.ka(this.ri, this.lr);
        int iQh = this.lr.qh();
        if (iQh == 5) {
            kaVar = new com.bytedance.sdk.openadsdk.component.jbs.di(this.ri, this.lr);
        } else if (iQh == 4) {
            kaVar = new com.bytedance.sdk.openadsdk.component.jbs.fi(this.ri, this.lr);
        }
        com.bytedance.sdk.openadsdk.component.jbs.ik ikVar = kaVar;
        this.aw = ikVar;
        viewGroup.addView(ikVar);
        this.bu = ikVar.getBackImage();
        this.mj = ikVar.getVideoContainer();
        this.bgr = ikVar.getImageView();
        this.slm = ikVar.getClickButton();
        this.vr = ikVar.getAdLogo();
        this.fr = ikVar.getAdTitleTextView();
        this.su = ikVar.getAdIconView();
        this.igq = ikVar.getScoreBar();
        this.zf = ikVar.getOverlayLayout();
        if (this.lr.ory()) {
            this.nr = ikVar.getIconOnlyView();
            this.tan = ikVar.getTitle();
            this.ac = ikVar.getContent();
        }
        if (ikVar.getDspAdChoice() != null) {
            ikVar.getDspAdChoice().ri(14, this.lr);
        }
        if (!this.lr.zyu()) {
            this.wjv.ri(ikVar, this.lr, this.uq, this.ihz, this.ik);
        }
        this.jbs = ikVar.getTopDisLike();
        this.qt = ikVar.getTopSkip();
        this.sf = ikVar.getTopCountDown();
        if (ikVar instanceof com.bytedance.sdk.openadsdk.component.jbs.fi) {
            ((com.bytedance.sdk.openadsdk.component.jbs.fi) ikVar).setRenderListener(new com.bytedance.sdk.openadsdk.component.jbs.fi.ri() { // from class: com.bytedance.sdk.openadsdk.component.ik.1
                @Override // com.bytedance.sdk.openadsdk.component.jbs.fi.ri
                public void ri(View view, int i) {
                    ik.this.fi.fi();
                }
            });
        }
    }

    private void lr(int i) {
        qd.ri((View) this.mj, i);
    }

    public void fi() {
    }

    public void ri() {
        this.vr.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.ik.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    ik ikVar = ik.this;
                    TTWebsiteActivity.ri(ikVar.ri, ikVar.lr, "open_ad");
                } catch (Throwable th) {
                    ac.ik("AppOpenAdNativeManager", th.getMessage());
                }
            }
        });
        di();
        if (this.lr.zyu()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.ri.ri riVarRi = com.bytedance.sdk.openadsdk.component.ri.lr.ri(this.lr, this.ri, this.f18091co);
        riVarRi.ri(new com.bytedance.sdk.openadsdk.core.ik.lr.ri() { // from class: com.bytedance.sdk.openadsdk.component.ik.3
            @Override // com.bytedance.sdk.openadsdk.core.ik.lr.ri
            public void ri(View view, int i) {
                ik.this.fi.fi();
            }
        });
        riVarRi.ri(this.ay);
        if (this.lr.rzk() == 1) {
            this.aw.setOnClickListener(riVarRi);
            this.aw.setOnTouchListener(riVarRi);
        }
        this.slm.setOnClickListener(riVarRi);
        this.slm.setOnTouchListener(riVarRi);
    }

    public boolean ri(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.mj.ik ikVar = new com.bytedance.sdk.openadsdk.component.mj.ik(this.ri);
        this.ay = ikVar;
        return ikVar.ri(frameLayout, this.fi, this.lr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(Object obj) {
        try {
            if (obj instanceof Bitmap) {
                this.bu.setImageDrawable(new BitmapDrawable(com.bytedance.sdk.openadsdk.core.nr.ri().getResources(), (Bitmap) obj));
            }
        } catch (Throwable unused) {
            ac.ik("AppOpenAdNativeManager", "open_ad", "bindBackGroundImage error");
        }
    }

    public void ri(com.bytedance.sdk.openadsdk.ac.ri.lr lrVar) {
        if (this.bgr == null) {
            return;
        }
        if (lrVar.lr() != null) {
            this.bgr.setImageBitmap(lrVar.lr());
            return;
        }
        Drawable drawableKa = lrVar.ka();
        if (drawableKa != null) {
            this.bgr.setScaleType(ImageView.ScaleType.FIT_CENTER);
            if (Build.VERSION.SDK_INT >= 28 && saneness.attabal(drawableKa)) {
                dern.attabal(drawableKa).start();
            }
            this.bgr.setImageDrawable(drawableKa);
            return;
        }
        if (this.lr.rbz() == null || this.lr.rbz().get(0) == null) {
            return;
        }
        Drawable drawableRi = com.bytedance.sdk.openadsdk.utils.bu.ri(lrVar.ik(), this.lr.rbz().get(0).lr());
        this.bgr.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.bgr.setImageDrawable(drawableRi);
    }

    public void ri(int i) {
        qd.ri((View) this.bgr, i);
    }

    public void ri(float f, float f2) {
        this.uq = f;
        this.ihz = f2;
    }

    public void ri(int i, boolean z) {
        mj mjVar;
        if (this.qt == null || (mjVar = this.sf) == null) {
            return;
        }
        if (z) {
            if (mjVar.getVisibility() != 8) {
                this.sf.setVisibility(8);
            }
            if (this.qt.getVisibility() != 0) {
                this.qt.setVisibility(0);
                return;
            }
            return;
        }
        this.sf.setText(i + "s");
        if (this.sf.getVisibility() != 0) {
            this.sf.setVisibility(0);
        }
    }
}
