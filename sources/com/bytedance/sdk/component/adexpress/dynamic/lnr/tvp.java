package com.bytedance.sdk.component.adexpress.dynamic.lnr;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.mo.xmv;
import com.kochava.tracker.BuildConfig;
import com.smartdigimkt.f3.b;

/* JADX INFO: loaded from: classes.dex */
public class tvp extends FrameLayout implements jpc {
    private com.bytedance.sdk.component.adexpress.ud.exu fs;
    private View.OnTouchListener jpc;
    private com.bytedance.sdk.component.adexpress.dynamic.mml.wd lnr;
    private View mml;
    private String mo;
    private wd mzz;
    private Context qdl;
    private com.bytedance.sdk.component.adexpress.dynamic.mml.to rq;
    private boolean to;
    private int tvp;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz ud;
    private com.bytedance.sdk.component.adexpress.mo.jl wd;

    public tvp(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz mzzVar, com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar) {
        super(context);
        this.qdl = context;
        this.ud = mzzVar;
        this.lnr = wdVar;
        wd();
    }

    private boolean jpc() {
        return (this.lnr.tid() || TextUtils.equals(b.j, this.mo) || TextUtils.equals("16", this.mo) || TextUtils.equals("17", this.mo) || TextUtils.equals(BuildConfig.SDK_PROTOCOL, this.mo) || TextUtils.equals("20", this.mo) || TextUtils.equals("29", this.mo) || TextUtils.equals("10", this.mo)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tvp() {
        if (this.jpc != null) {
            setOnClickListener((View.OnClickListener) this.ud.getDynamicClickListener());
            performClick();
            if (this.lnr.fzn()) {
                return;
            }
            setVisibility(8);
        }
    }

    private void wd() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.mo = this.lnr.wc();
        this.tvp = this.lnr.yh();
        this.to = this.lnr.tid();
        wd wdVarQdl = to.qdl(this.qdl, this.ud, this.lnr, this.rq, this.fs);
        this.mzz = wdVarQdl;
        if (wdVarQdl != null) {
            this.mml = wdVarQdl.lnr();
            if (this.lnr.om()) {
                setBackgroundColor(Color.parseColor("#50000000"));
            }
            if (TextUtils.equals(this.mo, "6")) {
                if (!this.lnr.sy() || TextUtils.isEmpty(this.lnr.car())) {
                    this.wd = new com.bytedance.sdk.component.adexpress.mo.jl(this.qdl, Color.parseColor("#99000000"));
                } else {
                    this.wd = new com.bytedance.sdk.component.adexpress.mo.jl(this.qdl, com.bytedance.sdk.component.adexpress.dynamic.mml.wd.qdl(this.lnr.car()));
                }
                FrameLayout frameLayout = new FrameLayout(this.qdl);
                frameLayout.addView(this.wd, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setClipChildren(true);
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lnr.tvp.1
                    @Override // java.lang.Runnable
                    public void run() {
                        tvp.this.wd.ud();
                    }
                });
            }
            if (qdl(this.mo) && com.bytedance.sdk.component.adexpress.mml.ud()) {
                int color = Color.parseColor("#99000000");
                if (this.lnr.sy() && !TextUtils.isEmpty(this.lnr.car())) {
                    try {
                        color = com.bytedance.sdk.component.adexpress.dynamic.mml.wd.qdl(this.lnr.car());
                    } catch (Exception unused) {
                    }
                }
                View view = new View(this.qdl);
                view.setBackgroundColor(color);
                addView(view, new FrameLayout.LayoutParams(-1, -1));
            }
            addView(this.mzz.lnr());
            qdl(this.mzz.lnr());
            setVisibility(0);
        }
    }

    public void lnr() {
        wd wdVar = this.mzz;
        if (wdVar != null) {
            wdVar.qdl();
        }
    }

    public void mml() {
        wd wdVar = this.mzz;
        if (wdVar != null) {
            wdVar.ud();
        }
    }

    public void mo() {
        if (this.mml != null && TextUtils.equals(this.mo, "2")) {
            View view = this.mml;
            if (view instanceof com.bytedance.sdk.component.adexpress.mo.lnr) {
                ((com.bytedance.sdk.component.adexpress.mo.lnr) view).mml();
            }
        }
    }

    public void mzz() {
        if (this.mml != null && TextUtils.equals(this.mo, "2")) {
            View view = this.mml;
            if (view instanceof com.bytedance.sdk.component.adexpress.mo.lnr) {
                ((com.bytedance.sdk.component.adexpress.mo.lnr) view).lnr();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            wd wdVar = this.mzz;
            if (wdVar != null) {
                wdVar.ud();
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.jpc instanceof com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl.lnr) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private boolean qdl(String str) {
        return TextUtils.equals(str, "24") || TextUtils.equals(str, "23") || TextUtils.equals(str, "25") || TextUtils.equals(str, "22") || TextUtils.equals(str, "1");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc
    public void ud() {
        if (jpc()) {
            setOnClickListener((View.OnClickListener) this.ud.getDynamicClickListener());
            performClick();
            if (this.lnr.fzn()) {
                return;
            }
            setVisibility(8);
        }
    }

    public tvp(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz mzzVar, com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar, com.bytedance.sdk.component.adexpress.dynamic.mml.to toVar, com.bytedance.sdk.component.adexpress.ud.exu exuVar) {
        super(context);
        this.qdl = context;
        this.ud = mzzVar;
        this.lnr = wdVar;
        this.rq = toVar;
        this.fs = exuVar;
        wd();
    }

    private void qdl(ViewGroup viewGroup) {
        if (this.mml == null) {
            return;
        }
        String str = this.mo;
        str.getClass();
        switch (str) {
            case "0":
                this.jpc = new com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl.mzz(this, this.tvp);
                setBackgroundColor(Color.parseColor("#80000000"));
                break;
            case "1":
            case "6":
                if (!this.lnr.sy() || TextUtils.isEmpty(this.lnr.car())) {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.jpc = new com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl.mo(this);
                break;
            case "2":
            case "7":
                setBackgroundColor(Color.parseColor("#80000000"));
                this.jpc = new com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl.ud(this, this);
                break;
            case "5":
                if (this.lnr.sy() && !TextUtils.isEmpty(this.lnr.car())) {
                    setBackgroundColor(com.bytedance.sdk.component.adexpress.dynamic.mml.wd.qdl(this.lnr.car()));
                } else {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.jpc = new com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl.lnr(this);
                this.mml.setTag(2);
                break;
            case "8":
            case "11":
                this.ud.setClipChildren(false);
                this.ud.setClipChildren(false);
                ViewGroup viewGroup2 = (ViewGroup) this.ud.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                this.jpc = new com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl.mo(this);
                break;
            case "9":
            case "17":
                this.mml.setTag(2);
                break;
            case "10":
                this.jpc = new com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl.mml(this, this.tvp, this.to);
                break;
            case "12":
                this.jpc = new com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl.lnr(this);
                this.mml.setTag(2);
                break;
            case "13":
            case "24":
                if (this.mo.equals("24") && com.bytedance.sdk.component.adexpress.mml.ud()) {
                    this.ud.setClipChildren(false);
                    this.jpc = new com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl.mo(this);
                    break;
                } else {
                    this.jpc = new com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl.mzz(this, this.tvp);
                    break;
                }
                break;
            case "14":
                this.jpc = new com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl.ud(this, this);
                break;
            case "16":
                View view = this.mml;
                if (view != null && (view instanceof com.bytedance.sdk.component.adexpress.mo.exc) && ((com.bytedance.sdk.component.adexpress.mo.exc) view).getShakeLayout() != null) {
                    ((com.bytedance.sdk.component.adexpress.mo.exc) this.mml).getShakeLayout().setTag(2);
                }
                this.mml.setTag(2);
                break;
            case "18":
                View view2 = this.mml;
                if (view2 != null && (view2 instanceof xmv) && ((xmv) view2).getWriggleLayout() != null) {
                    ((xmv) this.mml).getWriggleLayout().setTag(2);
                }
                this.mml.setTag(2);
                break;
            case "20":
                this.jpc = new com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl.qdl(this, this.tvp, viewGroup);
                break;
            case "22":
                if (com.bytedance.sdk.component.adexpress.mml.ud()) {
                    this.jpc = new com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl.jpc(this, this.to);
                    break;
                } else {
                    this.jpc = new com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl.wd(this, this.tvp, viewGroup);
                    break;
                }
                break;
            case "23":
                if (com.bytedance.sdk.component.adexpress.mml.ud()) {
                    this.jpc = new com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl.mo(this);
                    break;
                }
                break;
            case "25":
                if (com.bytedance.sdk.component.adexpress.mml.ud()) {
                    this.jpc = new com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl.jpc(this, this.to);
                    break;
                }
                break;
            case "29":
                View view3 = this.mml;
                if (view3 != null && (view3 instanceof com.bytedance.sdk.component.adexpress.mo.mo) && ((com.bytedance.sdk.component.adexpress.mo.mo) view3).getShakeView() != null) {
                    ((com.bytedance.sdk.component.adexpress.mo.mo) this.mml).getShakeView().setTag(2);
                }
                this.jpc = new com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl.mzz(this, this.tvp);
                break;
        }
        View.OnTouchListener onTouchListener = this.jpc;
        if (onTouchListener != null) {
            setOnTouchListener(onTouchListener);
        }
        if (jpc()) {
            this.mml.setTag(2);
            setOnClickListener((View.OnClickListener) this.ud.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc
    public void qdl() {
        if (TextUtils.equals(this.mo, "6")) {
            com.bytedance.sdk.component.adexpress.mo.jl jlVar = this.wd;
            if (jlVar != null) {
                jlVar.lnr();
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lnr.tvp.2
                    @Override // java.lang.Runnable
                    public void run() {
                        tvp.this.tvp();
                    }
                }, 300L);
                return;
            }
            return;
        }
        if (TextUtils.equals(this.mo, "20")) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lnr.tvp.3
                @Override // java.lang.Runnable
                public void run() {
                    tvp.this.tvp();
                }
            }, 400L);
        } else {
            tvp();
        }
    }
}
