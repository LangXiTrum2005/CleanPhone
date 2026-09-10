package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.load.resource.bitmap.a;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.mo.jpc;
import com.bytedance.sdk.openadsdk.core.model.jl;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.jtx;
import com.bytedance.sdk.openadsdk.core.widget.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class lnr {
    private jpc aaj;
    private com.bytedance.sdk.openadsdk.component.jpc.lnr bch;
    private PAGLogoView bjy;
    private jtx bqt;
    private jpc exc;
    private RelativeLayout exu;
    protected final com.bytedance.sdk.openadsdk.component.jpc.qdl fs;
    private yt jl;
    protected FrameLayout jpc;
    private jpc jtx;
    private float jyq;
    private View koa;
    private final com.bytedance.sdk.openadsdk.component.tvp.jpc ljh = new com.bytedance.sdk.openadsdk.component.tvp.jpc();
    protected final boolean lnr;
    protected final FrameLayout mml;
    protected final int mo;
    protected final com.bytedance.sdk.openadsdk.component.qdl mzz;
    private float oth;
    protected final Activity qdl;
    private ImageView rdp;
    protected jpc rq;
    protected com.bytedance.sdk.openadsdk.core.mo.mml to;
    protected View tvp;
    protected final ljh ud;
    private jpc uw;
    protected int wd;
    private com.bytedance.sdk.openadsdk.core.mo.mml xmv;
    private ImageView yt;

    public static class qdl implements mo.lnr {
        WeakReference<Activity> qdl;
        private final WeakReference<lnr> ud;

        public qdl(Activity activity, lnr lnrVar) {
            this.qdl = new WeakReference<>(activity);
            this.ud = new WeakReference<>(lnrVar);
        }

        @Override // com.bytedance.sdk.openadsdk.component.mo.lnr
        public void qdl(Object obj) {
            lnr lnrVar;
            if (this.qdl.get() == null || this.qdl.get().isFinishing() || (lnrVar = this.ud.get()) == null) {
                return;
            }
            lnrVar.qdl(obj);
        }
    }

    public static class ud implements com.bytedance.sdk.openadsdk.utils.yt.qdl {
        private final WeakReference<lnr> qdl;

        public ud(lnr lnrVar) {
            this.qdl = new WeakReference<>(lnrVar);
        }

        @Override // com.bytedance.sdk.openadsdk.utils.yt.qdl
        public void qdl() {
        }

        @Override // com.bytedance.sdk.openadsdk.utils.yt.qdl
        public void qdl(com.bytedance.sdk.openadsdk.jl.qdl.ud udVar) {
            lnr lnrVar;
            if (!udVar.mzz() || (lnrVar = this.qdl.get()) == null) {
                return;
            }
            lnrVar.qdl(udVar);
            if (udVar.ud() != null) {
                lnrVar.qdl(udVar.qdl());
            }
        }
    }

    public lnr(Activity activity, ljh ljhVar, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.qdl qdlVar, int i2, boolean z2, com.bytedance.sdk.openadsdk.component.jpc.qdl qdlVar2) {
        this.qdl = activity;
        this.ud = ljhVar;
        this.mml = frameLayout;
        this.wd = i2;
        this.lnr = z2;
        this.mzz = qdlVar;
        this.mo = ljhVar.fz();
        this.fs = qdlVar2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    private void jpc() {
        boolean z2;
        this.ljh.qdl();
        this.jtx.setText(this.ud.uvi());
        if (this.ud.xmv()) {
            tvp();
            return;
        }
        if (this.lnr) {
            ud(0);
            qdl(8);
            if (qdl(this.jpc)) {
                this.mzz.lnr();
            } else {
                this.mzz.mml();
            }
            mo.qdl(this.ud, new qdl(this.qdl, this), 25);
        } else {
            ud(8);
            qdl(0);
            to();
            this.mzz.lnr();
        }
        boolean z3 = true;
        if (this.uw == null) {
            z2 = false;
        } else {
            if (!TextUtils.isEmpty(this.ud.ca())) {
                this.uw.setText(this.ud.ca());
            } else if (this.ud.fhs() != null) {
                this.uw.setText(this.ud.fhs().ud());
            } else {
                z2 = false;
            }
            z2 = true;
        }
        if (this.xmv != null) {
            com.bytedance.sdk.openadsdk.jl.ud.ud().qdl(this.ud.hcs(), this.xmv, this.ud);
        }
        jtx jtxVar = this.bqt;
        if (jtxVar != null) {
            ax.qdl((TextView) null, jtxVar, this.ud);
            if (this.ud.fhs() == null || this.ud.fhs().mml() < 0.0d) {
                this.bqt.setVisibility(8);
                z3 = z2;
            }
        } else {
            z3 = z2;
        }
        View view = this.koa;
        if (view != null) {
            view.setVisibility(z3 ? 0 : 8);
        }
    }

    private void to() {
        jl jlVar = this.ud.vm().get(0);
        com.bytedance.sdk.openadsdk.utils.yt.qdl(new com.bytedance.sdk.openadsdk.jl.qdl(jlVar.qdl(), jlVar.wd()), jlVar.ud(), jlVar.lnr(), new ud(this), com.bytedance.sdk.openadsdk.component.wd.qdl.ud(TextUtils.isEmpty(jlVar.wd()) ? com.bytedance.sdk.component.utils.mzz.qdl(jlVar.qdl()) : jlVar.wd()).getParent(), 25);
    }

    private void tvp() {
        if (this.exc != null) {
            if (this.ud.fhs() != null && !TextUtils.isEmpty(this.ud.fhs().ud())) {
                this.exc.setText(this.ud.fhs().ud());
            } else if (TextUtils.isEmpty(this.ud.ca())) {
                this.exc.setVisibility(8);
            } else {
                this.exc.setText(this.ud.ca());
            }
        }
        if (this.aaj != null) {
            if (TextUtils.isEmpty(this.ud.gsv())) {
                this.aaj.setVisibility(8);
            } else {
                this.aaj.setText(this.ud.gsv());
            }
        }
        if (this.jl != null && this.ud.hcs() != null && !TextUtils.isEmpty(this.ud.hcs().qdl())) {
            com.bytedance.sdk.openadsdk.jl.ud.ud().qdl(this.ud.hcs().qdl(), this.ud.hcs().ud(), this.ud.hcs().lnr(), this.jl, this.ud);
        }
        this.mzz.lnr();
    }

    public void lnr() {
        com.bytedance.sdk.openadsdk.component.jpc.lnr lnrVar = this.bch;
        if (lnrVar != null) {
            lnrVar.fs();
        }
    }

    public int mml() {
        return -1;
    }

    public void mo() {
        this.tvp.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.lnr.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.bytedance.sdk.openadsdk.component.qdl qdlVar = lnr.this.mzz;
                if (qdlVar != null) {
                    qdlVar.ud(view);
                }
            }
        });
        this.to.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.lnr.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.bytedance.sdk.openadsdk.component.qdl qdlVar = lnr.this.mzz;
                if (qdlVar != null) {
                    qdlVar.qdl(view);
                }
            }
        });
    }

    public void mzz() {
    }

    public JSONObject qdl(JSONObject jSONObject) {
        return null;
    }

    public void ud() {
        if (this.ud.vxm()) {
            this.mzz.lnr();
        } else {
            jpc();
        }
    }

    public com.bytedance.sdk.openadsdk.component.jpc.lnr wd() {
        return this.bch;
    }

    public void qdl(ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.component.tvp.lnr mmlVar = new com.bytedance.sdk.openadsdk.component.tvp.mml(this.qdl, this.ud);
        int iXi = this.ud.xi();
        if (iXi == 5) {
            mmlVar = new com.bytedance.sdk.openadsdk.component.tvp.mo(this.qdl, this.ud);
        } else if (iXi == 4) {
            mmlVar = new com.bytedance.sdk.openadsdk.component.tvp.mzz(this.qdl, this.ud);
        }
        com.bytedance.sdk.openadsdk.component.tvp.lnr lnrVar = mmlVar;
        this.exu = lnrVar;
        viewGroup.addView(lnrVar);
        this.yt = lnrVar.getBackImage();
        this.jpc = lnrVar.getVideoContainer();
        this.rdp = lnrVar.getImageView();
        this.jtx = lnrVar.getClickButton();
        this.bjy = lnrVar.getAdLogo();
        this.uw = lnrVar.getAdTitleTextView();
        this.xmv = lnrVar.getAdIconView();
        this.bqt = lnrVar.getScoreBar();
        this.koa = lnrVar.getOverlayLayout();
        if (this.ud.xmv()) {
            this.jl = lnrVar.getIconOnlyView();
            this.exc = lnrVar.getTitle();
            this.aaj = lnrVar.getContent();
        }
        if (lnrVar.getDspAdChoice() != null) {
            lnrVar.getDspAdChoice().qdl(14, this.ud);
        }
        if (!this.ud.vxm()) {
            this.ljh.qdl(lnrVar, this.ud, this.oth, this.jyq, this.lnr);
        }
        this.tvp = lnrVar.getTopDisLike();
        this.to = lnrVar.getTopSkip();
        this.rq = lnrVar.getTopCountDown();
        if (lnrVar instanceof com.bytedance.sdk.openadsdk.component.tvp.mzz) {
            ((com.bytedance.sdk.openadsdk.component.tvp.mzz) lnrVar).setRenderListener(new com.bytedance.sdk.openadsdk.component.tvp.mzz.qdl() { // from class: com.bytedance.sdk.openadsdk.component.lnr.1
                @Override // com.bytedance.sdk.openadsdk.component.tvp.mzz.qdl
                public void qdl(View view, int i2) {
                    lnr.this.mzz.mzz();
                }
            });
        }
    }

    private void ud(int i2) {
        ax.qdl((View) this.jpc, i2);
    }

    public void qdl() {
        this.bjy.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.lnr.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    lnr lnrVar = lnr.this;
                    TTWebsiteActivity.qdl(lnrVar.qdl, lnrVar.ud, "open_ad");
                } catch (Throwable th) {
                    aaj.lnr("AppOpenAdNativeManager", th.getMessage());
                }
            }
        });
        mo();
        if (this.ud.vxm()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.qdl.qdl qdlVarQdl = com.bytedance.sdk.openadsdk.component.qdl.ud.qdl(this.ud, this.qdl, this.fs);
        qdlVarQdl.qdl(new com.bytedance.sdk.openadsdk.core.lnr.ud.qdl() { // from class: com.bytedance.sdk.openadsdk.component.lnr.3
            @Override // com.bytedance.sdk.openadsdk.core.lnr.ud.qdl
            public void qdl(View view, int i2) {
                lnr.this.mzz.mzz();
            }
        });
        qdlVarQdl.qdl(this.bch);
        if (this.ud.irn() == 1) {
            this.exu.setOnClickListener(qdlVarQdl);
            this.exu.setOnTouchListener(qdlVarQdl);
        }
        this.jtx.setOnClickListener(qdlVarQdl);
        this.jtx.setOnTouchListener(qdlVarQdl);
    }

    public boolean qdl(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.jpc.lnr lnrVar = new com.bytedance.sdk.openadsdk.component.jpc.lnr(this.qdl);
        this.bch = lnrVar;
        return lnrVar.qdl(frameLayout, this.mzz, this.ud);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(Object obj) {
        try {
            if (obj instanceof Bitmap) {
                this.yt.setImageDrawable(new BitmapDrawable(com.bytedance.sdk.openadsdk.core.yt.qdl().getResources(), (Bitmap) obj));
            }
        } catch (Throwable unused) {
            aaj.lnr("AppOpenAdNativeManager", "open_ad", "bindBackGroundImage error");
        }
    }

    public void qdl(com.bytedance.sdk.openadsdk.jl.qdl.ud udVar) {
        if (this.rdp == null) {
            return;
        }
        if (udVar.ud() != null) {
            this.rdp.setImageBitmap(udVar.ud());
            return;
        }
        Drawable drawableMml = udVar.mml();
        if (drawableMml != null) {
            this.rdp.setScaleType(ImageView.ScaleType.FIT_CENTER);
            if (Build.VERSION.SDK_INT >= 28 && a.v(drawableMml)) {
                a.k(drawableMml).start();
            }
            this.rdp.setImageDrawable(drawableMml);
            return;
        }
        if (this.ud.vm() == null || this.ud.vm().get(0) == null) {
            return;
        }
        Drawable drawableQdl = com.bytedance.sdk.openadsdk.utils.yt.qdl(udVar.lnr(), this.ud.vm().get(0).ud());
        this.rdp.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.rdp.setImageDrawable(drawableQdl);
    }

    public void qdl(int i2) {
        ax.qdl((View) this.rdp, i2);
    }

    public void qdl(float f, float f2) {
        this.oth = f;
        this.jyq = f2;
    }

    public void qdl(int i2, boolean z2) {
        jpc jpcVar;
        if (this.to == null || (jpcVar = this.rq) == null) {
            return;
        }
        if (z2) {
            if (jpcVar.getVisibility() != 8) {
                this.rq.setVisibility(8);
            }
            if (this.to.getVisibility() != 0) {
                this.to.setVisibility(0);
                return;
            }
            return;
        }
        this.rq.setText(androidx.datastore.preferences.protobuf.a.f(i2, "s"));
        if (this.rq.getVisibility() != 0) {
            this.rq.setVisibility(0);
        }
    }
}
