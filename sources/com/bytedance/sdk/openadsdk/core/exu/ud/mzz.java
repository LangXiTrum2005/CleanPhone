package com.bytedance.sdk.openadsdk.core.exu.ud;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.media3.extractor.text.ttml.a;
import com.bytedance.sdk.component.jpc.jpc;
import com.bytedance.sdk.component.utils.koa;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.widget.aaj;
import com.bytedance.sdk.openadsdk.core.widget.exc;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.exc.qdl.qdl.wd;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.bytedance.sdk.openadsdk.utils.jtx;
import com.bytedance.sdk.openadsdk.utils.rq;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mzz implements com.bykv.vk.openvk.qdl.qdl.qdl.mml.ud<ljh>, com.bykv.vk.openvk.qdl.qdl.qdl.mo.qdl, koa.qdl, com.bytedance.sdk.openadsdk.core.lnr.qdl.InterfaceC0118qdl, aaj.ud, exc.qdl {
    int aaj;
    int bch;
    TextView bjy;
    aaj bqt;
    com.bytedance.sdk.openadsdk.core.lnr.qdl ekw;
    int exc;
    com.bytedance.sdk.openadsdk.core.widget.qdl exu;
    private mo.qdl fco;
    View fs;
    private final String gy;
    com.bytedance.sdk.openadsdk.core.lnr.qdl hkc;
    boolean hzv;
    int jl;
    ImageView jpc;
    TextView jtx;
    boolean jyq;
    com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr kdv;
    qdl koa;
    int ljh;
    ViewGroup lnr;
    com.bykv.vk.openvk.qdl.qdl.qdl.mo.ud mml;
    View mo;
    private long mrf;
    ImageView mzz;
    boolean oth;
    protected final int qdl;
    com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo rc;
    TextView rdp;
    ImageView rq;
    View to;
    View tvp;
    protected final int ud;
    ljh uw;
    boolean vu;
    View wd;
    Context xmv;
    int yt;

    public mzz(Context context, ViewGroup viewGroup, boolean z2, int i2, ljh ljhVar, com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar, boolean z3) {
        this.qdl = 228;
        this.ud = 160;
        this.jyq = true;
        this.vu = true;
        this.hzv = true;
        this.gy = Build.MODEL;
        if (this instanceof mml) {
            return;
        }
        this.xmv = yt.qdl().getApplicationContext();
        mml(z3);
        this.lnr = viewGroup;
        this.jyq = z2;
        this.bch = i2;
        this.kdv = lnrVar;
        this.uw = ljhVar;
        mml(8);
        qdl(context, this.lnr);
        mml();
        fs();
    }

    private boolean uw() {
        return ljh.mzz(this.uw) && (!com.bytedance.sdk.openadsdk.core.rq.mml.qdl(this.uw.ra()) ? this.uw.xdk() == null : this.uw.kr() == null) && this.uw.kab() == 1;
    }

    public void aaj() {
        ImageView imageView = this.rq;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        com.bytedance.sdk.openadsdk.core.widget.qdl qdlVar = this.exu;
        if (qdlVar != null) {
            qdlVar.setImageBitmap(null);
        }
    }

    public boolean bch() {
        return (this.bch & 4) != 4 || this.jyq;
    }

    public void bjy() {
        aaj aajVar = this.bqt;
        if (aajVar != null) {
            aajVar.qdl(false);
        }
    }

    public void exc() {
        try {
            ax.qdl(this.to, 8);
            ax.qdl((View) this.rq, 8);
            ax.qdl(this.fs, 8);
            ax.qdl((View) this.exu, 8);
            ax.qdl((View) this.rdp, 8);
            ax.qdl((View) this.bjy, 8);
            ax.qdl((View) this.jtx, 8);
        } catch (Exception unused) {
        }
    }

    public com.bykv.vk.openvk.qdl.qdl.qdl.mo.ud exu() {
        return this.mml;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cd  */
    public void fs() {
        String str;
        int i2;
        String str2;
        int i3;
        com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo moVar;
        com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo moVar2;
        com.bytedance.sdk.openadsdk.core.lnr.qdl qdlVar;
        String str3 = this.vu ? "embeded_ad" : "embeded_ad_landingpage";
        if (this.uw.mq()) {
            str2 = "rewarded_video";
            i3 = 7;
        } else {
            if (!this.uw.nni()) {
                if (this.uw.oy()) {
                    str2 = "banner_ad";
                    i3 = 2;
                } else {
                    str = str3;
                    i2 = 1;
                }
                if (this.uw.ygv() == 4) {
                    this.rc = wd.qdl(this.xmv, str);
                }
                com.bytedance.sdk.openadsdk.core.lnr.qdl qdlVar2 = new com.bytedance.sdk.openadsdk.core.lnr.qdl(this.xmv, this.uw, str, i2);
                this.ekw = qdlVar2;
                qdlVar2.qdl(this);
                this.ekw.ud(true);
                if (this.vu) {
                    this.ekw.qdl(true);
                } else {
                    this.ekw.qdl(false);
                    this.ekw.lnr(true);
                }
                this.ekw.qdl(this.kdv);
                this.ekw.mzz(true);
                this.ekw.qdl(new com.bytedance.sdk.openadsdk.core.lnr.ud.qdl() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.mzz.1
                    @Override // com.bytedance.sdk.openadsdk.core.lnr.ud.qdl
                    public void qdl(View view, int i4) {
                        if (mzz.this.fco != null) {
                            mzz.this.fco.qdl(view, i4);
                        }
                    }
                });
                moVar = this.rc;
                if (moVar != null && (qdlVar = this.ekw) != null) {
                    qdlVar.qdl(moVar);
                }
                if (uw()) {
                    com.bytedance.sdk.openadsdk.core.lnr.qdl qdlVar3 = new com.bytedance.sdk.openadsdk.core.lnr.qdl(this.xmv, this.uw, str, i2) { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.mzz.2
                        @Override // com.bytedance.sdk.openadsdk.core.lnr.qdl
                        public boolean lnr() {
                            View view = mzz.this.to;
                            if (view != null && view.getVisibility() == 0) {
                                return true;
                            }
                            View view2 = mzz.this.fs;
                            if (view2 != null && view2.getVisibility() == 0) {
                                return true;
                            }
                            com.bytedance.sdk.openadsdk.core.widget.qdl qdlVar4 = mzz.this.exu;
                            if (qdlVar4 != null && qdlVar4.getVisibility() == 0) {
                                return true;
                            }
                            TextView textView = mzz.this.rdp;
                            return textView != null && textView.getVisibility() == 0;
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.lnr.qdl
                        public boolean ud() {
                            aaj aajVar = mzz.this.bqt;
                            boolean zQdl = aajVar != null ? aajVar.qdl() : false;
                            mzz.this.mzz.getVisibility();
                            return zQdl || mzz.this.mzz.getVisibility() == 0;
                        }
                    };
                    this.hkc = qdlVar3;
                    qdlVar3.qdl(new com.bytedance.sdk.openadsdk.core.lnr.ud.qdl() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.mzz.3
                        @Override // com.bytedance.sdk.openadsdk.core.lnr.ud.qdl
                        public void qdl(View view, int i4) {
                            if (mzz.this.fco != null) {
                                mzz.this.fco.qdl(view, i4);
                            }
                        }
                    });
                    this.hkc.ud(true);
                    this.hkc.qdl(this.vu);
                    this.hkc.qdl(this.kdv);
                    this.hkc.mzz(true);
                    moVar2 = this.rc;
                    if (moVar2 != null) {
                        this.hkc.qdl(moVar2);
                    }
                    this.hkc.qdl(this);
                }
            }
            str2 = "fullscreen_interstitial_ad";
            i3 = 5;
        }
        str = str2;
        i2 = i3;
        if (this.uw.ygv() == 4) {
            this.rc = wd.qdl(this.xmv, str);
        }
        com.bytedance.sdk.openadsdk.core.lnr.qdl qdlVar4 = new com.bytedance.sdk.openadsdk.core.lnr.qdl(this.xmv, this.uw, str, i2);
        this.ekw = qdlVar4;
        qdlVar4.qdl(this);
        this.ekw.ud(true);
        if (this.vu) {
            this.ekw.qdl(true);
        } else {
            this.ekw.qdl(false);
            this.ekw.lnr(true);
        }
        this.ekw.qdl(this.kdv);
        this.ekw.mzz(true);
        this.ekw.qdl(new com.bytedance.sdk.openadsdk.core.lnr.ud.qdl() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.mzz.1
            @Override // com.bytedance.sdk.openadsdk.core.lnr.ud.qdl
            public void qdl(View view, int i4) {
                if (mzz.this.fco != null) {
                    mzz.this.fco.qdl(view, i4);
                }
            }
        });
        moVar = this.rc;
        if (moVar != null) {
            qdlVar.qdl(moVar);
        }
        if (uw()) {
            com.bytedance.sdk.openadsdk.core.lnr.qdl qdlVar5 = new com.bytedance.sdk.openadsdk.core.lnr.qdl(this.xmv, this.uw, str, i2) { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.mzz.2
                @Override // com.bytedance.sdk.openadsdk.core.lnr.qdl
                public boolean lnr() {
                    View view = mzz.this.to;
                    if (view != null && view.getVisibility() == 0) {
                        return true;
                    }
                    View view2 = mzz.this.fs;
                    if (view2 != null && view2.getVisibility() == 0) {
                        return true;
                    }
                    com.bytedance.sdk.openadsdk.core.widget.qdl qdlVar6 = mzz.this.exu;
                    if (qdlVar6 != null && qdlVar6.getVisibility() == 0) {
                        return true;
                    }
                    TextView textView = mzz.this.rdp;
                    return textView != null && textView.getVisibility() == 0;
                }

                @Override // com.bytedance.sdk.openadsdk.core.lnr.qdl
                public boolean ud() {
                    aaj aajVar = mzz.this.bqt;
                    boolean zQdl = aajVar != null ? aajVar.qdl() : false;
                    mzz.this.mzz.getVisibility();
                    return zQdl || mzz.this.mzz.getVisibility() == 0;
                }
            };
            this.hkc = qdlVar5;
            qdlVar5.qdl(new com.bytedance.sdk.openadsdk.core.lnr.ud.qdl() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.mzz.3
                @Override // com.bytedance.sdk.openadsdk.core.lnr.ud.qdl
                public void qdl(View view, int i4) {
                    if (mzz.this.fco != null) {
                        mzz.this.fco.qdl(view, i4);
                    }
                }
            });
            this.hkc.ud(true);
            this.hkc.qdl(this.vu);
            this.hkc.qdl(this.kdv);
            this.hkc.mzz(true);
            moVar2 = this.rc;
            if (moVar2 != null) {
                this.hkc.qdl(moVar2);
            }
            this.hkc.qdl(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.lnr.qdl.InterfaceC0118qdl
    public long getVideoProgress() {
        if (this.mrf <= 0) {
            ljh ljhVar = this.uw;
            if (ljhVar != null && ljhVar.tdy() != null) {
                this.mrf = (long) (this.uw.tdy().mo() * 1000.0d);
            }
            com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.kdv;
            if (lnrVar != null) {
                this.mrf = lnrVar.tvp();
            }
        }
        return this.mrf;
    }

    public void jl() {
        ax.qdl((View) this.lnr, 0);
        com.bykv.vk.openvk.qdl.qdl.qdl.mo.ud udVar = this.mml;
        if (udVar != null) {
            ax.qdl(udVar.getView(), 0);
        }
    }

    public void jpc() {
        ax.mzz(this.mo);
    }

    public boolean jtx() {
        return this.koa != null;
    }

    public boolean jyq() {
        return this.jyq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.exc.qdl
    public boolean ljh() {
        aaj aajVar = this.bqt;
        return aajVar != null && aajVar.qdl();
    }

    public void lnr(boolean z2) {
    }

    public void mml() {
        this.mml.qdl(this);
        this.mzz.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.mzz.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (mzz.this.jtx()) {
                    TextView textView = mzz.this.jtx;
                    if (textView == null || textView.getVisibility() != 0) {
                        mzz mzzVar = mzz.this;
                        mzzVar.koa.qdl(mzzVar, view);
                    }
                }
            }
        });
    }

    public void mo() {
    }

    public void mzz() {
    }

    public boolean oth() {
        return this.oth;
    }

    public void qdl(int i2) {
    }

    public void rdp() {
        if (this.koa == null || this.bqt != null) {
            return;
        }
        System.currentTimeMillis();
        aaj aajVar = new aaj();
        this.bqt = aajVar;
        aajVar.qdl(this.xmv, this.lnr);
        this.bqt.qdl(this.koa, this);
        System.currentTimeMillis();
    }

    public void rq() {
        qdl(true, false);
    }

    public boolean to() {
        return false;
    }

    public void tvp() {
        mml(8);
        if (bch()) {
            this.mml.setVisibility(8);
        }
        ImageView imageView = this.jpc;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        mml(8);
        ax.qdl(this.to, 8);
        ax.qdl((View) this.rq, 8);
        ax.qdl(this.fs, 8);
        ax.qdl((View) this.exu, 8);
        ax.qdl((View) this.rdp, 8);
        ax.qdl((View) this.bjy, 8);
        aaj aajVar = this.bqt;
        if (aajVar != null) {
            aajVar.qdl(true);
        }
    }

    public void ud(ViewGroup viewGroup) {
    }

    public void wd() {
        ljh ljhVar;
        ax.mo(this.mo);
        ax.mo(this.wd);
        if (this.jpc != null && (ljhVar = this.uw) != null && ljhVar.tdy() != null && this.uw.tdy().to() != null) {
            ax.mo(this.jpc);
            com.bytedance.sdk.openadsdk.jl.ud.ud().qdl(this.uw.tdy().to(), this.uw.tdy().lnr(), this.uw.tdy().ud(), this.jpc, this.uw);
        }
        if (this.mzz.getVisibility() == 0) {
            ax.qdl((View) this.mzz, 8);
        }
    }

    public void yt() {
        ax.mo(this.mo);
        ax.mo(this.wd);
        if (this.mzz.getVisibility() == 0) {
            ax.qdl((View) this.mzz, 8);
        }
    }

    private void mo(int i2) {
        ax.qdl(this.fs, i2);
    }

    private int mzz(int i2) {
        if (this.exc <= 0 || this.aaj <= 0) {
            return 0;
        }
        int iUd = ax.ud(this.xmv, 228.0f);
        int iUd2 = ax.ud(this.xmv, 160.0f);
        int i3 = (int) (this.aaj * ((i2 * 1.0f) / this.exc));
        if (i3 > iUd) {
            return iUd;
        }
        return i3 < iUd2 ? iUd2 : i3;
    }

    public void lnr(int i2) {
        ax.qdl((View) this.lnr, 0);
        com.bykv.vk.openvk.qdl.qdl.qdl.mo.ud udVar = this.mml;
        if (udVar != null) {
            udVar.setVisibility(i2);
        }
    }

    public void qdl(long j) {
    }

    public void ud(boolean z2) {
    }

    public void mml(boolean z2) {
        this.vu = z2;
        if (z2) {
            com.bytedance.sdk.openadsdk.core.lnr.qdl qdlVar = this.ekw;
            if (qdlVar != null) {
                qdlVar.qdl(true);
            }
            com.bytedance.sdk.openadsdk.core.lnr.qdl qdlVar2 = this.hkc;
            if (qdlVar2 != null) {
                qdlVar2.qdl(true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.lnr.qdl qdlVar3 = this.ekw;
        if (qdlVar3 != null) {
            qdlVar3.qdl(false);
        }
        com.bytedance.sdk.openadsdk.core.lnr.qdl qdlVar4 = this.hkc;
        if (qdlVar4 != null) {
            qdlVar4.qdl(false);
        }
    }

    public void qdl(long j, long j2) {
    }

    public boolean ud(int i2) {
        return false;
    }

    public void qdl(Message message) {
    }

    public void ud(boolean z2, boolean z3) {
        ImageView imageView = this.mzz;
        if (imageView != null) {
            if (z2) {
                imageView.setImageDrawable(rq.qdl(this.xmv, "tt_play_movebar_textpage"));
            } else {
                imageView.setImageDrawable(rq.qdl(this.xmv, "tt_stop_movebar_textpage"));
            }
        }
    }

    public void lnr(int i2, int i3) {
        this.exc = i2;
        this.aaj = i3;
    }

    public void qdl(View view, boolean z2) {
    }

    public void qdl(ViewGroup viewGroup) {
    }

    public void lnr(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        if (this.lnr.getParent() == null) {
            viewGroup.addView(this.lnr);
        }
        mml(0);
    }

    public void qdl(String str) {
    }

    public void ud(int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = this.lnr.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (i2 == -1 || i2 == -2 || i2 > 0) {
            layoutParams.width = i2;
        }
        if (i3 == -1 || i3 == -2 || i3 > 0) {
            layoutParams.height = i3;
        }
        this.lnr.setLayoutParams(layoutParams);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.ud
    public View lnr() {
        return this.lnr;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.ud
    public /* bridge */ /* synthetic */ void qdl(ljh ljhVar, WeakReference weakReference, boolean z2) {
        qdl(ljhVar, (WeakReference<Context>) weakReference, z2);
    }

    public void qdl(mo.qdl qdlVar) {
        this.fco = qdlVar;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.ud
    public void ud() {
        ax.mzz(this.mo);
        ax.mzz(this.wd);
        ImageView imageView = this.jpc;
        if (imageView != null) {
            ax.mzz(imageView);
        }
    }

    public void mml(int i2) {
        this.ljh = i2;
        ax.qdl((View) this.lnr, i2);
    }

    public void qdl(PAGNativeAd pAGNativeAd) {
        com.bytedance.sdk.openadsdk.core.lnr.qdl qdlVar = this.ekw;
        if (qdlVar != null) {
            qdlVar.qdl(pAGNativeAd);
        }
        com.bytedance.sdk.openadsdk.core.lnr.qdl qdlVar2 = this.hkc;
        if (qdlVar2 != null) {
            qdlVar2.qdl(pAGNativeAd);
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mo.qdl
    public void ud(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.mml.getHolder()) {
            return;
        }
        this.oth = false;
        if (jtx()) {
            this.koa.ud(this, surfaceHolder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.ViewGroup, android.widget.RelativeLayout] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.view.View, com.bykv.vk.openvk.qdl.qdl.qdl.mo.ud] */
    public void qdl(Context context, View view) {
        ?? lnrVar;
        System.currentTimeMillis();
        ljh ljhVar = this.uw;
        if ((ljhVar == null || ((!ljhVar.xa() && !this.uw.oy()) || com.bytedance.sdk.openadsdk.core.settings.rq.lnr().kr())) && view != null) {
            view.setKeepScreenOn(true);
        }
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar2 = this.kdv;
        if (lnrVar2 != null && lnrVar2.bjy()) {
            lnrVar = new com.bykv.vk.openvk.qdl.qdl.qdl.mo.mml(this.xmv);
        } else {
            lnrVar = new com.bykv.vk.openvk.qdl.qdl.qdl.mo.lnr(this.xmv);
        }
        if (view instanceof RelativeLayout) {
            ((RelativeLayout) view).addView(lnrVar, 0, a.f(-2, -2, 13));
        }
        ax.qdl((View) lnrVar, 8);
        this.mml = lnrVar;
        this.mzz = (ImageView) view.findViewById(jtx.hd);
        this.mo = view.findViewById(jtx.gsp);
        this.wd = view.findViewById(jtx.hr);
        this.jpc = (ImageView) view.findViewById(jtx.ygv);
        this.tvp = view.findViewById(jtx.syy);
        System.currentTimeMillis();
    }

    public mzz(Context context, ViewGroup viewGroup, boolean z2, int i2, ljh ljhVar, com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar) {
        this(context, viewGroup, z2, i2, ljhVar, lnrVar, true);
    }

    public void qdl(View view, Context context) {
        View view2;
        if (view == null || context == null || (view2 = this.tvp) == null || view2.getParent() == null || this.to != null) {
            return;
        }
        this.to = this.tvp;
        this.rq = (ImageView) view.findViewById(jtx.ca);
        this.fs = view.findViewById(jtx.tdy);
        this.exu = (com.bytedance.sdk.openadsdk.core.widget.qdl) view.findViewById(jtx.ax);
        this.rdp = (TextView) view.findViewById(jtx.ag);
        this.bjy = (TextView) view.findViewById(jtx.wc);
        this.jtx = (TextView) view.findViewById(jtx.om);
    }

    public boolean qdl(int i2, com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVar, boolean z2) {
        aaj aajVar = this.bqt;
        return aajVar == null || aajVar.qdl(i2, udVar, z2);
    }

    public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.mml.qdl qdlVar) {
        if (qdlVar instanceof qdl) {
            this.koa = (qdl) qdlVar;
            rdp();
        }
    }

    public void qdl(int i2, int i3) {
        if (i2 == -1) {
            i2 = ax.lnr(this.xmv);
        }
        if (i2 <= 0) {
            return;
        }
        this.yt = i2;
        if (!jyq() && !to() && (this.bch & 8) != 8) {
            this.jl = mzz(i2);
        } else {
            this.jl = i3;
        }
        ud(this.yt, this.jl);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.ud
    public void qdl() {
        qdl(false, this.jyq);
        exc();
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.ud
    public void qdl(boolean z2) {
        this.hzv = z2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code duplicated, block: B:93:0x021b  */
    public void qdl(ljh ljhVar, WeakReference<Context> weakReference, boolean z2) {
        final ljh ljhVar2;
        String strHvi;
        ljh ljhVar3;
        ljh ljhVar4;
        if (ljhVar == null) {
            return;
        }
        qdl(false, this.jyq);
        qdl(this.lnr, yt.qdl());
        View view = this.to;
        if (view != null) {
            ax.qdl(view, 0);
        }
        ImageView imageView = this.rq;
        if (imageView != null) {
            ax.qdl((View) imageView, 0);
        }
        ax.qdl(this.fs, 0);
        if (this.rq == null || (ljhVar4 = this.uw) == null || ljhVar4.tdy() == null || this.uw.tdy().to() == null) {
            ljhVar2 = ljhVar;
        } else {
            ljhVar2 = ljhVar;
            com.bytedance.sdk.openadsdk.jl.ud.ud().qdl(this.uw.tdy().to(), this.uw.tdy().lnr(), this.uw.tdy().ud(), this.rq, ljhVar2);
        }
        if (!TextUtils.isEmpty(ljhVar2.ca())) {
            strHvi = ljhVar2.ca();
        } else if (!TextUtils.isEmpty(ljhVar2.gsv())) {
            strHvi = ljhVar2.gsv();
        } else if (!TextUtils.isEmpty(ljhVar2.hvi())) {
            strHvi = ljhVar2.hvi();
        } else {
            strHvi = "";
        }
        if (this.exu != null && (ljhVar3 = this.uw) != null && ljhVar3.hcs() != null && this.uw.hcs().qdl() != null) {
            ax.qdl((View) this.exu, 0);
            ax.qdl((View) this.rdp, 4);
            ljh ljhVar5 = this.uw;
            if (ljhVar5 != null && ljhVar5.uj()) {
                com.bytedance.sdk.openadsdk.tvp.mml.qdl(this.uw.hcs()).lnr(1).qdl(new com.bytedance.sdk.openadsdk.tvp.ud(ljhVar2, this.uw.hcs().qdl(), new com.bytedance.sdk.component.mzz.jtx() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.mzz.5
                    @Override // com.bytedance.sdk.component.mzz.jtx
                    public void qdl(com.bytedance.sdk.component.mzz.rq rqVar) {
                        Object objUd = rqVar.ud();
                        if (objUd != null) {
                            if (objUd instanceof Bitmap) {
                                com.bytedance.sdk.openadsdk.core.widget.qdl qdlVar = mzz.this.exu;
                                if (qdlVar != null) {
                                    qdlVar.setImageBitmap((Bitmap) objUd);
                                }
                            } else if ((objUd instanceof Drawable) && mzz.this.exu != null) {
                                if (Build.VERSION.SDK_INT >= 28 && com.bumptech.glide.load.resource.bitmap.a.w(objUd)) {
                                    com.bumptech.glide.load.resource.bitmap.a.l(objUd).start();
                                }
                                mzz.this.exu.setImageDrawable((Drawable) objUd);
                            }
                            com.bytedance.sdk.openadsdk.mml.lnr.ud(mzz.this.uw, mzz.this.uw != null ? gy.lnr(ljhVar2.vz()) : null, "load_vast_icon_success", (JSONObject) null);
                        }
                    }

                    @Override // com.bytedance.sdk.component.mzz.jtx
                    public void qdl(int i2, String str, Throwable th) {
                        mzz.this.qdl(i2, str, ljhVar2);
                    }
                }));
                if (this.uw.aoy() != null && this.uw.aoy().ud() != null) {
                    this.uw.aoy().ud().ud(0L);
                }
            } else {
                com.bytedance.sdk.openadsdk.jl.ud.ud().qdl(this.uw.hcs(), this.exu, ljhVar2);
            }
            ljh ljhVar6 = this.uw;
            if (ljhVar6 != null && ljhVar6.uj()) {
                try {
                    this.exu.setTag(570425345, "VAST_ICON");
                } catch (Throwable unused) {
                }
            }
            ljh ljhVar7 = this.uw;
            if (ljhVar7 != null && ljhVar7.aoy() != null && this.uw.aoy().ud() != null) {
                final com.bytedance.sdk.openadsdk.core.fs.ud udVarUd = this.uw.aoy().ud();
                com.bytedance.sdk.openadsdk.core.widget.qdl qdlVar = this.exu;
                if (qdlVar != null) {
                    qdlVar.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.mzz.6
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.openadsdk.core.fs.ud udVar;
                            com.bytedance.sdk.openadsdk.core.widget.qdl qdlVar2 = mzz.this.exu;
                            if (qdlVar2 == null || !qdlVar2.isShown() || (udVar = udVarUd) == null) {
                                return;
                            }
                            udVar.ud(mzz.this.getVideoProgress());
                        }
                    });
                }
            }
            if (uw()) {
                this.exu.setOnClickListener(this.hkc);
                this.exu.setOnTouchListener(this.hkc);
            } else {
                this.exu.setOnClickListener(this.ekw);
                this.exu.setOnTouchListener(this.ekw);
            }
        } else if (!TextUtils.isEmpty(strHvi)) {
            ax.qdl((View) this.exu, 4);
            ax.qdl((View) this.rdp, 0);
            TextView textView = this.rdp;
            if (textView != null) {
                textView.setText(strHvi.substring(0, 1));
                if (uw()) {
                    this.rdp.setOnClickListener(this.hkc);
                    this.rdp.setOnTouchListener(this.hkc);
                } else {
                    this.rdp.setOnClickListener(this.ekw);
                    this.rdp.setOnTouchListener(this.ekw);
                }
            }
        }
        if (this.bjy != null && !TextUtils.isEmpty(strHvi)) {
            this.bjy.setText(strHvi);
            this.bjy.setTag(570425345, "VAST_TITLE");
        }
        ax.qdl((View) this.bjy, 0);
        ax.qdl((View) this.jtx, 0);
        String strUvi = ljhVar2.uvi();
        if (TextUtils.isEmpty(strUvi)) {
            int iYgv = ljhVar2.ygv();
            if (iYgv == 2 || iYgv == 3) {
                strUvi = com.bytedance.sdk.component.utils.ljh.qdl(this.xmv, "tt_video_mobile_go_detail");
            } else if (iYgv == 4) {
                strUvi = com.bytedance.sdk.component.utils.ljh.qdl(this.xmv, "tt_video_download_apk");
            } else if (iYgv == 5) {
                strUvi = com.bytedance.sdk.component.utils.ljh.qdl(this.xmv, "tt_video_dial_phone");
            } else if (iYgv != 8) {
                strUvi = com.bytedance.sdk.component.utils.ljh.qdl(this.xmv, "tt_video_mobile_go_detail");
            } else {
                strUvi = com.bytedance.sdk.component.utils.ljh.qdl(this.xmv, "tt_video_mobile_go_detail");
            }
        }
        TextView textView2 = this.jtx;
        if (textView2 != null) {
            textView2.setText(strUvi);
            this.jtx.setOnClickListener(this.ekw);
            this.jtx.setOnTouchListener(this.ekw);
        }
        if (this.hzv) {
            return;
        }
        mo(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(final int i2, final String str, final ljh ljhVar) {
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(new jpc("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.mzz.7
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i2);
                    jSONObject.put("description", i2 + ":" + str);
                    jSONObject.put("url", mzz.this.uw.hcs().qdl());
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.mml.lnr.ud(mzz.this.uw, mzz.this.uw != null ? gy.lnr(ljhVar.vz()) : null, "load_vast_icon_fail", jSONObject);
            }
        });
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mo.qdl
    public void qdl(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.mml.getHolder()) {
            return;
        }
        this.oth = true;
        if (jtx()) {
            this.koa.qdl(this, surfaceHolder);
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mo.qdl
    public void qdl(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        if (surfaceHolder != this.mml.getHolder()) {
            return;
        }
        jtx();
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mo.qdl
    public void qdl(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.oth = true;
        if (jtx()) {
            this.koa.qdl(this, surfaceTexture);
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mo.qdl
    public boolean qdl(SurfaceTexture surfaceTexture) {
        this.oth = false;
        if (!jtx()) {
            return true;
        }
        this.koa.ud(this, surfaceTexture);
        return true;
    }

    public void qdl(boolean z2, boolean z3, boolean z4) {
        ax.qdl((View) this.mzz, (!z2 || this.mo.getVisibility() == 0) ? 8 : 0);
    }

    public void qdl(boolean z2, boolean z3) {
        ax.qdl((View) this.mzz, 8);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.ud
    public void qdl(Drawable drawable) {
        ViewGroup viewGroup = this.lnr;
        if (viewGroup != null) {
            viewGroup.setBackgroundDrawable(drawable);
        }
    }
}
