package com.bytedance.sdk.component.adexpress.dynamic.lk;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.badlogic.gdx.Input;
import com.bytedance.sdk.component.adexpress.lc.id;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.umeng.analytics.pro.cw;

/* JADX INFO: loaded from: classes2.dex */
public class QAg extends FrameLayout implements OY {
    private com.bytedance.sdk.component.adexpress.dynamic.ZU.nBu JVA;
    private ebl JXs;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs LD;
    private Context Lxb;
    private View.OnTouchListener OY;
    private int QAg;
    private View ZU;
    private com.bytedance.sdk.component.adexpress.lc.brP ebl;
    private String lc;
    private com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl lk;
    private boolean nBu;
    private com.bytedance.sdk.component.adexpress.LD.NXR sLN;

    public QAg(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs jXs, com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl eblVar) {
        super(context);
        this.Lxb = context;
        this.LD = jXs;
        this.lk = eblVar;
        ebl();
    }

    private boolean OY() {
        return (this.lk.Nu() || TextUtils.equals("9", this.lc) || TextUtils.equals("16", this.lc) || TextUtils.equals("17", this.lc) || TextUtils.equals("18", this.lc) || TextUtils.equals("20", this.lc) || TextUtils.equals("29", this.lc) || TextUtils.equals("10", this.lc)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void QAg() {
        if (this.OY != null) {
            setOnClickListener((View.OnClickListener) this.LD.getDynamicClickListener());
            performClick();
            if (this.lk.oc()) {
                return;
            }
            setVisibility(8);
        }
    }

    private void ebl() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.lc = this.lk.NDz();
        this.QAg = this.lk.sRq();
        this.nBu = this.lk.Nu();
        ebl eblVarLxb = nBu.Lxb(this.Lxb, this.LD, this.lk, this.JVA, this.sLN);
        this.JXs = eblVarLxb;
        if (eblVarLxb != null) {
            this.ZU = eblVarLxb.lk();
            if (this.lk.JJ()) {
                setBackgroundColor(Color.parseColor("#50000000"));
            }
            if (TextUtils.equals(this.lc, "6")) {
                if (!this.lk.SS() || TextUtils.isEmpty(this.lk.LXE())) {
                    this.ebl = new com.bytedance.sdk.component.adexpress.lc.brP(this.Lxb, Color.parseColor("#99000000"));
                } else {
                    this.ebl = new com.bytedance.sdk.component.adexpress.lc.brP(this.Lxb, com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl.Lxb(this.lk.LXE()));
                }
                FrameLayout frameLayout = new FrameLayout(this.Lxb);
                frameLayout.addView(this.ebl, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setClipChildren(true);
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lk.QAg.1
                    @Override // java.lang.Runnable
                    public void run() {
                        QAg.this.ebl.LD();
                    }
                });
            }
            if (Lxb(this.lc) && com.bytedance.sdk.component.adexpress.ZU.LD()) {
                int color = Color.parseColor("#99000000");
                if (this.lk.SS() && !TextUtils.isEmpty(this.lk.LXE())) {
                    try {
                        color = com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl.Lxb(this.lk.LXE());
                    } catch (Exception unused) {
                    }
                }
                View view = new View(this.Lxb);
                view.setBackgroundColor(color);
                addView(view, new FrameLayout.LayoutParams(-1, -1));
            }
            addView(this.JXs.lk());
            Lxb(this.JXs.lk());
            setVisibility(0);
        }
    }

    public void JXs() {
        if (this.ZU != null && TextUtils.equals(this.lc, "2")) {
            View view = this.ZU;
            if (view instanceof com.bytedance.sdk.component.adexpress.lc.lk) {
                ((com.bytedance.sdk.component.adexpress.lc.lk) view).lk();
            }
        }
    }

    public void ZU() {
        ebl eblVar = this.JXs;
        if (eblVar != null) {
            eblVar.LD();
        }
    }

    public void lc() {
        if (this.ZU != null && TextUtils.equals(this.lc, "2")) {
            View view = this.ZU;
            if (view instanceof com.bytedance.sdk.component.adexpress.lc.lk) {
                ((com.bytedance.sdk.component.adexpress.lc.lk) view).ZU();
            }
        }
    }

    public void lk() {
        ebl eblVar = this.JXs;
        if (eblVar != null) {
            eblVar.Lxb();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            ebl eblVar = this.JXs;
            if (eblVar != null) {
                eblVar.LD();
            }
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.sLN.LD(e.getMessage());
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.OY instanceof com.bytedance.sdk.component.adexpress.dynamic.lk.Lxb.lk) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private boolean Lxb(String str) {
        return TextUtils.equals(str, "24") || TextUtils.equals(str, "23") || TextUtils.equals(str, "25") || TextUtils.equals(str, "22") || TextUtils.equals(str, "1");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk.OY
    public void LD() {
        if (OY()) {
            setOnClickListener((View.OnClickListener) this.LD.getDynamicClickListener());
            performClick();
            if (this.lk.oc()) {
                return;
            }
            setVisibility(8);
        }
    }

    public QAg(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs jXs, com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl eblVar, com.bytedance.sdk.component.adexpress.dynamic.ZU.nBu nbu, com.bytedance.sdk.component.adexpress.LD.NXR nxr) {
        super(context);
        this.Lxb = context;
        this.LD = jXs;
        this.lk = eblVar;
        this.JVA = nbu;
        this.sLN = nxr;
        ebl();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void Lxb(ViewGroup viewGroup) {
        if (this.ZU == null) {
            return;
        }
        String str = this.lc;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    b = 0;
                }
                break;
            case 49:
                if (str.equals("1")) {
                    b = 1;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    b = 2;
                }
                break;
            case 53:
                if (str.equals(CampaignEx.CLICKMODE_ON)) {
                    b = 3;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    b = 4;
                }
                break;
            case 55:
                if (str.equals("7")) {
                    b = 5;
                }
                break;
            case Input.Keys.PERIOD /* 56 */:
                if (str.equals("8")) {
                    b = 6;
                }
                break;
            case Input.Keys.ALT_LEFT /* 57 */:
                if (str.equals("9")) {
                    b = 7;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    b = 8;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    b = 9;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    b = 10;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    b = 11;
                }
                break;
            case 1571:
                if (str.equals("14")) {
                    b = 12;
                }
                break;
            case 1573:
                if (str.equals("16")) {
                    b = cw.k;
                }
                break;
            case 1574:
                if (str.equals("17")) {
                    b = cw.l;
                }
                break;
            case 1575:
                if (str.equals("18")) {
                    b = cw.m;
                }
                break;
            case 1598:
                if (str.equals("20")) {
                    b = cw.n;
                }
                break;
            case 1600:
                if (str.equals("22")) {
                    b = 17;
                }
                break;
            case 1601:
                if (str.equals("23")) {
                    b = 18;
                }
                break;
            case 1602:
                if (str.equals("24")) {
                    b = 19;
                }
                break;
            case 1603:
                if (str.equals("25")) {
                    b = 20;
                }
                break;
            case 1607:
                if (str.equals("29")) {
                    b = 21;
                }
                break;
        }
        switch (b) {
            case 0:
                this.OY = new com.bytedance.sdk.component.adexpress.dynamic.lk.Lxb.JXs(this, this.QAg);
                setBackgroundColor(Color.parseColor("#80000000"));
                break;
            case 1:
            case 4:
                if (!this.lk.SS() || TextUtils.isEmpty(this.lk.LXE())) {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.OY = new com.bytedance.sdk.component.adexpress.dynamic.lk.Lxb.lc(this);
                break;
            case 2:
            case 5:
                setBackgroundColor(Color.parseColor("#80000000"));
                this.OY = new com.bytedance.sdk.component.adexpress.dynamic.lk.Lxb.LD(this, this);
                break;
            case 3:
                if (this.lk.SS() && !TextUtils.isEmpty(this.lk.LXE())) {
                    setBackgroundColor(com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl.Lxb(this.lk.LXE()));
                } else {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.OY = new com.bytedance.sdk.component.adexpress.dynamic.lk.Lxb.lk(this);
                this.ZU.setTag(2);
                break;
            case 6:
            case 9:
                this.LD.setClipChildren(false);
                this.LD.setClipChildren(false);
                ViewGroup viewGroup2 = (ViewGroup) this.LD.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                this.OY = new com.bytedance.sdk.component.adexpress.dynamic.lk.Lxb.lc(this);
                break;
            case 7:
            case 14:
                this.ZU.setTag(2);
                break;
            case 8:
                this.OY = new com.bytedance.sdk.component.adexpress.dynamic.lk.Lxb.ZU(this, this.QAg, this.nBu);
                break;
            case 10:
                this.OY = new com.bytedance.sdk.component.adexpress.dynamic.lk.Lxb.lk(this);
                this.ZU.setTag(2);
                break;
            case 11:
            case 19:
                if (this.lc.equals("24") && com.bytedance.sdk.component.adexpress.ZU.LD()) {
                    this.LD.setClipChildren(false);
                    this.OY = new com.bytedance.sdk.component.adexpress.dynamic.lk.Lxb.lc(this);
                } else {
                    this.OY = new com.bytedance.sdk.component.adexpress.dynamic.lk.Lxb.JXs(this, this.QAg);
                }
                break;
            case 12:
                this.OY = new com.bytedance.sdk.component.adexpress.dynamic.lk.Lxb.LD(this, this);
                break;
            case 13:
                View view = this.ZU;
                if (view != null && (view instanceof com.bytedance.sdk.component.adexpress.lc.tD) && ((com.bytedance.sdk.component.adexpress.lc.tD) view).getShakeLayout() != null) {
                    ((com.bytedance.sdk.component.adexpress.lc.tD) this.ZU).getShakeLayout().setTag(2);
                }
                this.ZU.setTag(2);
                break;
            case 15:
                View view2 = this.ZU;
                if (view2 != null && (view2 instanceof id) && ((id) view2).getWriggleLayout() != null) {
                    ((id) this.ZU).getWriggleLayout().setTag(2);
                }
                this.ZU.setTag(2);
                break;
            case 16:
                this.OY = new com.bytedance.sdk.component.adexpress.dynamic.lk.Lxb.Lxb(this, this.QAg, viewGroup);
                break;
            case 17:
                if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
                    this.OY = new com.bytedance.sdk.component.adexpress.dynamic.lk.Lxb.OY(this, this.nBu);
                } else {
                    this.OY = new com.bytedance.sdk.component.adexpress.dynamic.lk.Lxb.ebl(this, this.QAg, viewGroup);
                }
                break;
            case 18:
                if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
                    this.OY = new com.bytedance.sdk.component.adexpress.dynamic.lk.Lxb.lc(this);
                }
                break;
            case 20:
                if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
                    this.OY = new com.bytedance.sdk.component.adexpress.dynamic.lk.Lxb.OY(this, this.nBu);
                }
                break;
            case 21:
                View view3 = this.ZU;
                if (view3 != null && (view3 instanceof com.bytedance.sdk.component.adexpress.lc.lc) && ((com.bytedance.sdk.component.adexpress.lc.lc) view3).getShakeView() != null) {
                    ((com.bytedance.sdk.component.adexpress.lc.lc) this.ZU).getShakeView().setTag(2);
                }
                this.OY = new com.bytedance.sdk.component.adexpress.dynamic.lk.Lxb.JXs(this, this.QAg);
                break;
        }
        View.OnTouchListener onTouchListener = this.OY;
        if (onTouchListener != null) {
            setOnTouchListener(onTouchListener);
        }
        if (OY()) {
            this.ZU.setTag(2);
            setOnClickListener((View.OnClickListener) this.LD.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk.OY
    public void Lxb() {
        if (TextUtils.equals(this.lc, "6")) {
            com.bytedance.sdk.component.adexpress.lc.brP brp = this.ebl;
            if (brp != null) {
                brp.lk();
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lk.QAg.2
                    @Override // java.lang.Runnable
                    public void run() {
                        QAg.this.QAg();
                    }
                }, 300L);
                return;
            }
            return;
        }
        if (TextUtils.equals(this.lc, "20")) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lk.QAg.3
                @Override // java.lang.Runnable
                public void run() {
                    QAg.this.QAg();
                }
            }, 400L);
        } else {
            QAg();
        }
    }
}
