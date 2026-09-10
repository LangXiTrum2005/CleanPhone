package com.bytedance.sdk.component.adexpress.dynamic.ik;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.di.fr;
import com.ironsource.Bc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.jacoco.core.data.ExecutionDataWriter;

/* JADX INFO: loaded from: classes2.dex */
public class jbs extends FrameLayout implements mj {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.lr.aw f18036co;
    private String di;
    private xha fi;
    private com.bytedance.sdk.component.adexpress.dynamic.ka.xha ik;
    private int jbs;
    private View ka;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi lr;
    private View.OnTouchListener mj;
    private boolean qt;
    private Context ri;
    private com.bytedance.sdk.component.adexpress.dynamic.ka.qt sf;
    private com.bytedance.sdk.component.adexpress.di.bu xha;

    public jbs(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi fiVar, com.bytedance.sdk.component.adexpress.dynamic.ka.xha xhaVar) {
        super(context);
        this.ri = context;
        this.lr = fiVar;
        this.ik = xhaVar;
        xha();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jbs() {
        if (this.mj != null) {
            setOnClickListener((View.OnClickListener) this.lr.getDynamicClickListener());
            performClick();
            if (this.ik.hpn()) {
                return;
            }
            setVisibility(8);
        }
    }

    private boolean mj() {
        return (this.ik.qh() || TextUtils.equals("9", this.di) || TextUtils.equals("16", this.di) || TextUtils.equals("17", this.di) || TextUtils.equals("18", this.di) || TextUtils.equals("20", this.di) || TextUtils.equals("29", this.di) || TextUtils.equals("10", this.di)) ? false : true;
    }

    private void xha() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.di = this.ik.kt();
        this.jbs = this.ik.tnn();
        this.qt = this.ik.qh();
        xha xhaVarRi = qt.ri(this.ri, this.lr, this.ik, this.sf, this.f18036co);
        this.fi = xhaVarRi;
        if (xhaVarRi != null) {
            this.ka = xhaVarRi.ik();
            if (this.ik.feb()) {
                setBackgroundColor(Color.parseColor("#50000000"));
            }
            if (TextUtils.equals(this.di, "6")) {
                if (!this.ik.gcp() || TextUtils.isEmpty(this.ik.tw())) {
                    this.xha = new com.bytedance.sdk.component.adexpress.di.bu(this.ri, Color.parseColor("#99000000"));
                } else {
                    this.xha = new com.bytedance.sdk.component.adexpress.di.bu(this.ri, com.bytedance.sdk.component.adexpress.dynamic.ka.xha.ri(this.ik.tw()));
                }
                FrameLayout frameLayout = new FrameLayout(this.ri);
                frameLayout.addView(this.xha, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setClipChildren(true);
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ik.jbs.1
                    @Override // java.lang.Runnable
                    public void run() {
                        jbs.this.xha.lr();
                    }
                });
            }
            if (ri(this.di) && com.bytedance.sdk.component.adexpress.ka.lr()) {
                int color = Color.parseColor("#99000000");
                if (this.ik.gcp() && !TextUtils.isEmpty(this.ik.tw())) {
                    try {
                        color = com.bytedance.sdk.component.adexpress.dynamic.ka.xha.ri(this.ik.tw());
                    } catch (Exception unused) {
                    }
                }
                View view = new View(this.ri);
                view.setBackgroundColor(color);
                addView(view, new FrameLayout.LayoutParams(-1, -1));
            }
            addView(this.fi.ik());
            ri(this.fi.ik());
            setVisibility(0);
        }
    }

    public void di() {
        if (this.ka != null && TextUtils.equals(this.di, "2")) {
            View view = this.ka;
            if (view instanceof com.bytedance.sdk.component.adexpress.di.ik) {
                ((com.bytedance.sdk.component.adexpress.di.ik) view).ka();
            }
        }
    }

    public void fi() {
        if (this.ka != null && TextUtils.equals(this.di, "2")) {
            View view = this.ka;
            if (view instanceof com.bytedance.sdk.component.adexpress.di.ik) {
                ((com.bytedance.sdk.component.adexpress.di.ik) view).ik();
            }
        }
    }

    public void ik() {
        xha xhaVar = this.fi;
        if (xhaVar != null) {
            xhaVar.ri();
        }
    }

    public void ka() {
        xha xhaVar = this.fi;
        if (xhaVar != null) {
            xhaVar.lr();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            xha xhaVar = this.fi;
            if (xhaVar != null) {
                xhaVar.lr();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.mj instanceof com.bytedance.sdk.component.adexpress.dynamic.ik.ri.ik) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private boolean ri(String str) {
        return TextUtils.equals(str, "24") || TextUtils.equals(str, "23") || TextUtils.equals(str, "25") || TextUtils.equals(str, "22") || TextUtils.equals(str, "1");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.mj
    public void lr() {
        if (mj()) {
            setOnClickListener((View.OnClickListener) this.lr.getDynamicClickListener());
            performClick();
            if (this.ik.hpn()) {
                return;
            }
            setVisibility(8);
        }
    }

    public jbs(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi fiVar, com.bytedance.sdk.component.adexpress.dynamic.ka.xha xhaVar, com.bytedance.sdk.component.adexpress.dynamic.ka.qt qtVar, com.bytedance.sdk.component.adexpress.lr.aw awVar) {
        super(context);
        this.ri = context;
        this.lr = fiVar;
        this.ik = xhaVar;
        this.sf = qtVar;
        this.f18036co = awVar;
        xha();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void ri(ViewGroup viewGroup) {
        byte b = 2;
        if (this.ka == null) {
            return;
        }
        String str = this.di;
        str.getClass();
        switch (str.hashCode()) {
            case 48:
                b = !str.equals("0") ? (byte) -1 : (byte) 0;
                break;
            case 49:
                b = !str.equals("1") ? (byte) -1 : (byte) 1;
                break;
            case 50:
                if (!str.equals("2")) {
                    b = -1;
                }
                break;
            case 53:
                b = !str.equals(CampaignEx.CLICKMODE_ON) ? (byte) -1 : (byte) 3;
                break;
            case 54:
                b = !str.equals("6") ? (byte) -1 : (byte) 4;
                break;
            case 55:
                b = !str.equals(Bc.e) ? (byte) -1 : (byte) 5;
                break;
            case 56:
                b = !str.equals("8") ? (byte) -1 : (byte) 6;
                break;
            case 57:
                b = !str.equals("9") ? (byte) -1 : (byte) 7;
                break;
            case 1567:
                b = !str.equals("10") ? (byte) -1 : (byte) 8;
                break;
            case 1568:
                b = !str.equals("11") ? (byte) -1 : (byte) 9;
                break;
            case 1569:
                b = !str.equals("12") ? (byte) -1 : (byte) 10;
                break;
            case 1570:
                b = !str.equals("13") ? (byte) -1 : (byte) 11;
                break;
            case 1571:
                b = !str.equals("14") ? (byte) -1 : (byte) 12;
                break;
            case 1573:
                b = !str.equals("16") ? (byte) -1 : (byte) 13;
                break;
            case 1574:
                b = !str.equals("17") ? (byte) -1 : (byte) 14;
                break;
            case 1575:
                b = !str.equals("18") ? (byte) -1 : (byte) 15;
                break;
            case 1598:
                b = !str.equals("20") ? (byte) -1 : ExecutionDataWriter.BLOCK_SESSIONINFO;
                break;
            case 1600:
                b = !str.equals("22") ? (byte) -1 : ExecutionDataWriter.BLOCK_EXECUTIONDATA;
                break;
            case 1601:
                b = !str.equals("23") ? (byte) -1 : (byte) 18;
                break;
            case 1602:
                b = !str.equals("24") ? (byte) -1 : (byte) 19;
                break;
            case 1603:
                b = !str.equals("25") ? (byte) -1 : (byte) 20;
                break;
            case 1607:
                b = !str.equals("29") ? (byte) -1 : (byte) 21;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                this.mj = new com.bytedance.sdk.component.adexpress.dynamic.ik.ri.fi(this, this.jbs);
                setBackgroundColor(Color.parseColor("#80000000"));
                break;
            case 1:
            case 4:
                if (!this.ik.gcp() || TextUtils.isEmpty(this.ik.tw())) {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.mj = new com.bytedance.sdk.component.adexpress.dynamic.ik.ri.di(this);
                break;
            case 2:
            case 5:
                setBackgroundColor(Color.parseColor("#80000000"));
                this.mj = new com.bytedance.sdk.component.adexpress.dynamic.ik.ri.lr(this, this);
                break;
            case 3:
                if (this.ik.gcp() && !TextUtils.isEmpty(this.ik.tw())) {
                    setBackgroundColor(com.bytedance.sdk.component.adexpress.dynamic.ka.xha.ri(this.ik.tw()));
                } else {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.mj = new com.bytedance.sdk.component.adexpress.dynamic.ik.ri.ik(this);
                this.ka.setTag(2);
                break;
            case 6:
            case 9:
                this.lr.setClipChildren(false);
                this.lr.setClipChildren(false);
                ViewGroup viewGroup2 = (ViewGroup) this.lr.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                this.mj = new com.bytedance.sdk.component.adexpress.dynamic.ik.ri.di(this);
                break;
            case 7:
            case 14:
                this.ka.setTag(2);
                break;
            case 8:
                this.mj = new com.bytedance.sdk.component.adexpress.dynamic.ik.ri.ka(this, this.jbs, this.qt);
                break;
            case 10:
                this.mj = new com.bytedance.sdk.component.adexpress.dynamic.ik.ri.ik(this);
                this.ka.setTag(2);
                break;
            case 11:
            case 19:
                if (this.di.equals("24") && com.bytedance.sdk.component.adexpress.ka.lr()) {
                    this.lr.setClipChildren(false);
                    this.mj = new com.bytedance.sdk.component.adexpress.dynamic.ik.ri.di(this);
                } else {
                    this.mj = new com.bytedance.sdk.component.adexpress.dynamic.ik.ri.fi(this, this.jbs);
                }
                break;
            case 12:
                this.mj = new com.bytedance.sdk.component.adexpress.dynamic.ik.ri.lr(this, this);
                break;
            case 13:
                View view = this.ka;
                if (view != null && (view instanceof com.bytedance.sdk.component.adexpress.di.nr) && ((com.bytedance.sdk.component.adexpress.di.nr) view).getShakeLayout() != null) {
                    ((com.bytedance.sdk.component.adexpress.di.nr) this.ka).getShakeLayout().setTag(2);
                }
                this.ka.setTag(2);
                break;
            case 15:
                View view2 = this.ka;
                if (view2 != null && (view2 instanceof fr) && ((fr) view2).getWriggleLayout() != null) {
                    ((fr) this.ka).getWriggleLayout().setTag(2);
                }
                this.ka.setTag(2);
                break;
            case 16:
                this.mj = new com.bytedance.sdk.component.adexpress.dynamic.ik.ri.ri(this, this.jbs, viewGroup);
                break;
            case 17:
                if (com.bytedance.sdk.component.adexpress.ka.lr()) {
                    this.mj = new com.bytedance.sdk.component.adexpress.dynamic.ik.ri.mj(this, this.qt);
                } else {
                    this.mj = new com.bytedance.sdk.component.adexpress.dynamic.ik.ri.xha(this, this.jbs, viewGroup);
                }
                break;
            case 18:
                if (com.bytedance.sdk.component.adexpress.ka.lr()) {
                    this.mj = new com.bytedance.sdk.component.adexpress.dynamic.ik.ri.di(this);
                }
                break;
            case 20:
                if (com.bytedance.sdk.component.adexpress.ka.lr()) {
                    this.mj = new com.bytedance.sdk.component.adexpress.dynamic.ik.ri.mj(this, this.qt);
                }
                break;
            case 21:
                View view3 = this.ka;
                if (view3 != null && (view3 instanceof com.bytedance.sdk.component.adexpress.di.di) && ((com.bytedance.sdk.component.adexpress.di.di) view3).getShakeView() != null) {
                    ((com.bytedance.sdk.component.adexpress.di.di) this.ka).getShakeView().setTag(2);
                }
                this.mj = new com.bytedance.sdk.component.adexpress.dynamic.ik.ri.fi(this, this.jbs);
                break;
        }
        View.OnTouchListener onTouchListener = this.mj;
        if (onTouchListener != null) {
            setOnTouchListener(onTouchListener);
        }
        if (mj()) {
            this.ka.setTag(2);
            setOnClickListener((View.OnClickListener) this.lr.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.mj
    public void ri() {
        if (TextUtils.equals(this.di, "6")) {
            com.bytedance.sdk.component.adexpress.di.bu buVar = this.xha;
            if (buVar != null) {
                buVar.ik();
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ik.jbs.2
                    @Override // java.lang.Runnable
                    public void run() {
                        jbs.this.jbs();
                    }
                }, 300L);
                return;
            }
            return;
        }
        if (TextUtils.equals(this.di, "20")) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ik.jbs.3
                @Override // java.lang.Runnable
                public void run() {
                    jbs.this.jbs();
                }
            }, 400L);
        } else {
            jbs();
        }
    }
}
