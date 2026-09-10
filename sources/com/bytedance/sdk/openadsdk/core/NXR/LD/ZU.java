package com.bytedance.sdk.openadsdk.core.NXR.LD;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.aH;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.widget.brP;
import com.bytedance.sdk.openadsdk.utils.QAg;
import com.bytedance.sdk.openadsdk.utils.STP;
import com.bytedance.sdk.openadsdk.utils.le;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class ZU extends JXs {
    private float AcC;
    private ImageView BcA;
    private int FD;
    private final int FGm;
    private float FV;
    private ColorStateList Hu;
    private final Rect JD;
    private ImageView JJ;
    private SeekBar JZE;
    private int LXE;
    private View Ld;
    private TextView Lpq;
    private int Lv;
    private float MGT;
    private TextView NDz;
    private TextView Ns;
    private boolean Nu;
    private TextView Of;
    private TextView Pw;
    private boolean SS;
    private ImageView Sv;
    private View VU;
    private final int Wi;
    private float Za;
    private int ae;
    private final Rect bG;
    private TextView dR;
    private float gS;
    private final Rect iC;
    private ColorStateList jeq;
    private TextView le;
    private final Rect nTb;
    private final brP oc;
    private View rW;
    private final View.OnTouchListener ro;
    private ImageView sRq;
    private final aH uxf;
    private final Rect wCT;
    private ColorStateList wPa;
    private int wbY;
    private int xr;

    public ZU(Context context, ViewGroup viewGroup, boolean z, int i, tD tDVar, So0 so0, boolean z2) {
        super(context, viewGroup, z, i, tDVar, so0, z2);
        this.uxf = new aH(this);
        this.Nu = false;
        this.SS = false;
        this.LXE = 0;
        this.wbY = 0;
        this.FD = 0;
        this.ae = 0;
        this.xr = 0;
        this.bG = new Rect();
        this.nTb = new Rect();
        this.Lv = 0;
        this.ro = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.ZU.7
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                } else if (actionMasked == 3) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
                return false;
            }
        };
        this.wCT = new Rect();
        this.JD = new Rect();
        this.iC = new Rect();
        this.id = kqm.Lxb().getApplicationContext();
        ZU(z2);
        this.lk = viewGroup;
        this.Sfi = z;
        brP brp = new brP(this);
        this.oc = brp;
        brp.Lxb(this.Sfi);
        DisplayMetrics displayMetrics = this.id.getResources().getDisplayMetrics();
        this.FGm = displayMetrics.widthPixels;
        this.Wi = displayMetrics.heightPixels;
        this.aH = i;
        this.xan = so0;
        this.CSn = tDVar;
        ZU(8);
        Lxb(context, this.lk);
        ZU();
        sLN();
    }

    private void CSn() {
        DisplayMetrics displayMetrics = this.id.getResources().getDisplayMetrics();
        TextView textView = this.Ns;
        if (textView != null) {
            this.gS = textView.getTextSize();
            this.Ns.setTextSize(2, 14.0f);
            ColorStateList textColors = this.Ns.getTextColors();
            this.Hu = textColors;
            if (textColors != null) {
                this.Ns.setTextColor(-1);
            }
            this.AcC = this.Ns.getAlpha();
            this.Ns.setAlpha(0.85f);
            this.Ns.setShadowLayer(0.0f, le.lk(this.id, 0.5f), le.lk(this.id, 0.5f), com.bytedance.sdk.component.utils.tD.ebl(this.id, "tt_b2000000"));
            ViewGroup.LayoutParams layoutParams = this.Ns.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.wCT.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                le.Lxb(this.Ns, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.wCT.top, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), this.wCT.bottom);
            }
        }
        TextView textView2 = this.Lpq;
        if (textView2 != null) {
            this.Za = textView2.getTextSize();
            this.Lpq.setTextSize(2, 14.0f);
            ColorStateList textColors2 = this.Lpq.getTextColors();
            this.wPa = textColors2;
            if (textColors2 != null) {
                this.Lpq.setTextColor(-1);
            }
            this.FV = this.Lpq.getAlpha();
            this.Lpq.setAlpha(0.85f);
            this.Lpq.setShadowLayer(0.0f, le.lk(this.id, 0.5f), le.lk(this.id, 0.5f), com.bytedance.sdk.component.utils.tD.ebl(this.id, "tt_b2000000"));
            ViewGroup.LayoutParams layoutParams2 = this.Lpq.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                this.JD.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                TextView textView3 = this.Lpq;
                int iApplyDimension = (int) TypedValue.applyDimension(1, 14.0f, displayMetrics);
                Rect rect = this.JD;
                le.Lxb(textView3, iApplyDimension, rect.top, rect.right, rect.bottom);
            }
        }
        ImageView imageView = this.Sv;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                this.iC.set(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                ImageView imageView2 = this.Sv;
                Rect rect2 = this.iC;
                le.Lxb(imageView2, rect2.left, rect2.top, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.iC.bottom);
            }
        }
        ImageView imageView3 = this.Sv;
        if (imageView3 != null) {
            imageView3.setImageDrawable(com.bytedance.sdk.component.utils.tD.lk(this.id, "tt_shrink_fullscreen"));
        }
        TextView textView4 = this.dR;
        if (textView4 != null) {
            ColorStateList textColors3 = textView4.getTextColors();
            this.jeq = textColors3;
            if (textColors3 != null) {
                this.dR.setTextColor(-1);
            }
            this.MGT = this.dR.getAlpha();
            this.dR.setAlpha(0.85f);
            ViewGroup.LayoutParams layoutParams4 = this.dR.getLayoutParams();
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                this.nTb.set(marginLayoutParams4.leftMargin, marginLayoutParams4.topMargin, marginLayoutParams4.rightMargin, marginLayoutParams4.bottomMargin);
                TextView textView5 = this.dR;
                int iApplyDimension2 = (int) TypedValue.applyDimension(1, 1.0f, displayMetrics);
                Rect rect3 = this.JD;
                le.Lxb(textView5, iApplyDimension2, rect3.top, rect3.right, rect3.bottom);
            }
        }
        View view = this.rW;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            this.Lv = layoutParams5.height;
            layoutParams5.height = (int) TypedValue.applyDimension(1, 49.0f, displayMetrics);
            this.rW.setLayoutParams(layoutParams5);
            this.rW.setBackgroundResource(com.bytedance.sdk.component.utils.tD.ZU(this.id, "tt_shadow_fullscreen_top"));
        }
        LD(false, true);
    }

    private void id() {
        TextView textView = this.Ns;
        if (textView != null) {
            textView.setTextSize(0, this.gS);
            ColorStateList colorStateList = this.Hu;
            if (colorStateList != null) {
                this.Ns.setTextColor(colorStateList);
            }
            this.Ns.setAlpha(this.AcC);
            this.Ns.setShadowLayer(le.lk(this.id, 1.0f), 0.0f, 0.0f, com.bytedance.sdk.component.utils.tD.ebl(this.id, "tt_72000000"));
            TextView textView2 = this.Ns;
            Rect rect = this.wCT;
            le.Lxb(textView2, rect.left, rect.top, rect.right, rect.bottom);
        }
        TextView textView3 = this.Lpq;
        if (textView3 != null) {
            textView3.setTextSize(0, this.Za);
            ColorStateList colorStateList2 = this.wPa;
            if (colorStateList2 != null) {
                this.Lpq.setTextColor(colorStateList2);
            }
            this.Lpq.setAlpha(this.FV);
            this.Lpq.setShadowLayer(le.lk(this.id, 1.0f), 0.0f, 0.0f, com.bytedance.sdk.component.utils.tD.ebl(this.id, "tt_72000000"));
            TextView textView4 = this.Lpq;
            Rect rect2 = this.JD;
            le.Lxb(textView4, rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        ImageView imageView = this.Sv;
        if (imageView != null) {
            Rect rect3 = this.iC;
            le.Lxb(imageView, rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        ImageView imageView2 = this.Sv;
        if (imageView2 != null) {
            imageView2.setImageDrawable(com.bytedance.sdk.component.utils.tD.lk(this.id, "tt_enlarge_video"));
        }
        TextView textView5 = this.dR;
        if (textView5 != null) {
            ColorStateList colorStateList3 = this.jeq;
            if (colorStateList3 != null) {
                textView5.setTextColor(colorStateList3);
            }
            this.dR.setAlpha(this.MGT);
            TextView textView6 = this.dR;
            Rect rect4 = this.JD;
            le.Lxb(textView6, rect4.left, rect4.top, rect4.right, rect4.bottom);
        }
        View view = this.rW;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = this.Lv;
            this.rW.setLayoutParams(layoutParams);
            this.rW.setBackground(QAg.Lxb(this.id, "tt_video_black_desc_gradient"));
        }
        LD(false, true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.JXs, com.bytedance.sdk.openadsdk.core.widget.tD.LD
    public void JVA() {
        Lxb(true, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.JXs
    public void JXs() {
        this.uxf.removeMessages(1);
        this.uxf.sendMessageDelayed(this.uxf.obtainMessage(1), 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.JXs
    public void LD(boolean z) {
        int i = nBu() ? this.Wi : this.kqm;
        int iLk = nBu() ? this.FGm : this.brP;
        if (this.DY <= 0 || this.tD <= 0 || i <= 0) {
            return;
        }
        if (!Sfi() && !nBu() && (this.aH & 8) != 8) {
            iLk = le.lk(this.id, 228.0f);
        }
        int i2 = this.tD;
        int i3 = this.DY;
        int i4 = (int) (i3 * ((i * 1.0f) / i2));
        if (i4 > iLk) {
            i = (int) (i2 * ((iLk * 1.0f) / i3));
        } else {
            iLk = i4;
        }
        if (!z && !nBu()) {
            i = this.kqm;
            iLk = this.brP;
        }
        this.ZU.Lxb(i, iLk);
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.JXs, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RG
    @SuppressLint({"ClickableViewAccessibility"})
    public /* bridge */ /* synthetic */ void Lxb(Object obj, WeakReference weakReference, boolean z) {
        Lxb((tD) obj, (WeakReference<Context>) weakReference, z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.JXs
    public void OY() {
        le.JXs(this.lc);
        le.JXs(this.VU);
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.JXs
    public void QAg() {
        this.JZE.setProgress(0);
        this.JZE.setSecondaryProgress(0);
        this.Lpq.setText(com.bytedance.sdk.component.utils.tD.Lxb(this.id, "tt_00_00"));
        this.Ns.setText(com.bytedance.sdk.component.utils.tD.Lxb(this.id, "tt_00_00"));
        ZU(8);
        if (aH()) {
            this.ZU.setVisibility(8);
        }
        ImageView imageView = this.OY;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        ZU(8);
        le.Lxb(this.Ld, 8);
        le.Lxb(this.nBu, 8);
        le.Lxb((View) this.JVA, 8);
        le.Lxb(this.sLN, 8);
        le.Lxb((View) this.NXR, 8);
        le.Lxb((View) this.STP, 8);
        le.Lxb((View) this.IeN, 8);
        com.bytedance.sdk.openadsdk.core.widget.tD tDVar = this.foI;
        if (tDVar != null) {
            tDVar.Lxb(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.JXs
    @SuppressLint({"ClickableViewAccessibility"})
    public void ZU() {
        super.ZU();
        this.oc.Lxb(this.lk);
        le.Lxb((View) this.BcA, (this.Sfi || (this.aH & 1) == 1) ? 8 : 0);
        this.BcA.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.ZU.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ZU.this.VVE()) {
                    ZU zu = ZU.this;
                    zu.KPU.lk(zu, view);
                }
            }
        });
        le.Lxb((View) this.le, (!this.Sfi || (this.aH & 2) == 2) ? 0 : 8);
        this.le.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.ZU.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ZU.this.VVE()) {
                    ZU zu = ZU.this;
                    zu.KPU.ZU(zu, view);
                }
            }
        });
        this.JJ.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.ZU.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ZU.this.VVE()) {
                    ZU zu = ZU.this;
                    zu.KPU.JXs(zu, view);
                }
            }
        });
        this.sRq.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.ZU.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ZU.this.LD(false, true);
                ZU.this.OY();
                ZU.this.ebl();
                ZU.this.VVE();
            }
        });
        this.Sv.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.ZU.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ZU.this.VVE()) {
                    ZU zu = ZU.this;
                    zu.KPU.LD(zu, view);
                }
            }
        });
        this.JZE.setThumbOffset(0);
        this.JZE.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.ZU.6
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (ZU.this.VVE()) {
                    ZU zu = ZU.this;
                    zu.KPU.Lxb(zu, i, z);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                if (!ZU.this.Nu && ZU.this.id != null) {
                    seekBar.setThumb(QAg.Lxb(kqm.Lxb(), "tt_seek_thumb_press"));
                }
                if (ZU.this.VVE()) {
                    seekBar.setThumbOffset(0);
                    ZU zu = ZU.this;
                    zu.KPU.LD(zu, seekBar.getProgress());
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (!ZU.this.Nu && ZU.this.id != null) {
                    seekBar.setThumb(QAg.Lxb(kqm.Lxb(), "tt_seek_thumb_normal"));
                }
                if (ZU.this.VVE()) {
                    seekBar.setThumbOffset(0);
                    ZU zu = ZU.this;
                    zu.KPU.Lxb(zu, seekBar.getProgress());
                }
            }
        });
        this.JZE.setOnTouchListener(this.ro);
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.JXs
    public void ebl() {
        tD tDVar;
        le.lc(this.lc);
        le.lc(this.ebl);
        le.JXs(this.VU);
        if (this.OY != null && (tDVar = this.CSn) != null && tDVar.JJ() != null && this.CSn.JJ().f != null) {
            le.lc(this.OY);
            com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(this.CSn.JJ().f, this.CSn.JJ().b, this.CSn.JJ().f3307a, this.OY, this.CSn);
        }
        if (this.JXs.getVisibility() == 0) {
            le.Lxb((View) this.JXs, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.JXs
    public void lc() {
        this.uxf.removeMessages(1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.JXs
    public void lk(boolean z) {
        TextView textView = this.Pw;
        if (textView != null) {
            le.Lxb((View) textView, (!this.Sfi && z) ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.JXs, com.bytedance.sdk.openadsdk.core.widget.tD.LD
    public boolean nBu() {
        return this.Nu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.JXs
    public void Lxb(Context context, View view) {
        super.Lxb(context, view);
        this.le = (TextView) view.findViewById(STP.Vs);
        this.BcA = (ImageView) view.findViewById(STP.Bg);
        this.rW = view.findViewById(STP.Zg);
        this.JJ = (ImageView) view.findViewById(STP.HN);
        this.Pw = (TextView) view.findViewById(STP.tv);
        this.dR = (TextView) view.findViewById(STP.rK);
        this.NDz = (TextView) view.findViewById(STP.fG);
        this.VU = view.findViewById(STP.VB);
        this.sRq = (ImageView) view.findViewById(STP.KOQ);
        TextView textView = (TextView) view.findViewById(STP.LRt);
        this.Of = textView;
        textView.setText(com.bytedance.sdk.component.utils.tD.Lxb(context, "tt_video_retry_des_txt"));
        this.JZE = (SeekBar) view.findViewById(STP.lJ);
        this.Lpq = (TextView) view.findViewById(STP.op);
        this.Ns = (TextView) view.findViewById(STP.Mvg);
        this.Ld = view.findViewById(STP.mOF);
        this.Sv = (ImageView) view.findViewById(STP.Pd);
        this.QAg = view.findViewById(STP.owi);
    }

    private void JXs(boolean z) {
        if (z) {
            CSn();
        } else {
            id();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.JXs
    public void LD(@Nullable ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        sLN.Lxb("FullScreen", "Detail exitFullScreen.....");
        if (viewGroup == null || (viewGroup2 = this.lk) == null || !(viewGroup2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        this.Nu = false;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.lk.getLayoutParams();
        marginLayoutParams.width = this.FD;
        marginLayoutParams.height = this.ae;
        marginLayoutParams.leftMargin = this.wbY;
        marginLayoutParams.topMargin = this.LXE;
        this.lk.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(3, this.xr);
            viewGroup.setLayoutParams(layoutParams2);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            Rect rect = this.bG;
            le.Lxb(viewGroup, rect.left, rect.top, rect.right, rect.bottom);
        }
        LD(true);
        this.Sv.setImageDrawable(com.bytedance.sdk.component.utils.tD.lk(this.id, "tt_enlarge_video"));
        this.JZE.setThumb(QAg.Lxb(this.id, "tt_seek_thumb_normal"));
        this.JZE.setThumbOffset(0);
        IK.c(this.lk, true);
        JXs(this.Nu);
        le.Lxb(this.rW, 8);
        if ((this.aH & 2) == 2) {
            le.Lxb((View) this.le, 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.JXs
    public void Lxb(String str) {
        TextView textView = this.Pw;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.dR;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.JXs
    public void Lxb(int i) {
        View view = this.Ld;
        if (view == null || view.getVisibility() != 0) {
            this.JZE.setProgress(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.JXs
    public void Lxb(long j, long j2) {
        this.Lpq.setText(IK.b(j2));
        this.Ns.setText(IK.b(j));
        this.JZE.setProgress(IK.a(j, j2));
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.JXs, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RG
    public void Lxb() {
        Lxb(false, this.Sfi);
        tD();
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.JXs
    public void Lxb(long j) {
        this.Ns.setText(IK.b(j));
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.JXs
    @SuppressLint({"ClickableViewAccessibility"})
    public void Lxb(tD tDVar, WeakReference<Context> weakReference, boolean z) {
        String strAe;
        String strLxb;
        tD tDVar2;
        if (tDVar == null) {
            return;
        }
        Lxb(this.lk, kqm.Lxb());
        Lxb(false, this.Sfi);
        le.Lxb(this.nBu, 0);
        le.Lxb((View) this.JVA, 0);
        le.Lxb(this.sLN, 0);
        if (this.JVA != null && (tDVar2 = this.CSn) != null && tDVar2.JJ() != null && this.CSn.JJ().f != null) {
            com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(this.CSn.JJ().f, this.CSn.JJ().b, this.CSn.JJ().f3307a, this.JVA, this.CSn);
        }
        if (!TextUtils.isEmpty(tDVar.VU())) {
            strAe = tDVar.VU();
        } else if (!TextUtils.isEmpty(tDVar.FD())) {
            strAe = tDVar.FD();
        } else if (!TextUtils.isEmpty(tDVar.ae())) {
            strAe = tDVar.ae();
        } else {
            strAe = "";
        }
        tD tDVar3 = this.CSn;
        if (tDVar3 != null && tDVar3.Lpq() != null && this.CSn.Lpq().Lxb() != null) {
            le.Lxb((View) this.NXR, 0);
            le.Lxb((View) this.STP, 4);
            if (this.NXR != null) {
                com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(this.CSn.Lpq(), this.NXR, tDVar);
                this.NXR.setOnClickListener(this.hg);
                this.NXR.setOnTouchListener(this.hg);
            }
        } else if (!TextUtils.isEmpty(strAe)) {
            le.Lxb((View) this.NXR, 4);
            le.Lxb((View) this.STP, 0);
            TextView textView = this.STP;
            if (textView != null) {
                textView.setText(strAe.substring(0, 1));
                this.STP.setOnClickListener(this.hg);
                this.STP.setOnTouchListener(this.hg);
            }
        }
        if (this.IeN != null && !TextUtils.isEmpty(strAe)) {
            this.IeN.setText(strAe);
        }
        le.Lxb((View) this.IeN, 0);
        le.Lxb((View) this.VVE, 0);
        int iSRq = tDVar.sRq();
        if (iSRq == 4) {
            strLxb = com.bytedance.sdk.component.utils.tD.Lxb(this.id, "tt_video_download_apk");
        } else if (iSRq != 5) {
            strLxb = com.bytedance.sdk.component.utils.tD.Lxb(this.id, "tt_video_mobile_go_detail");
        } else {
            strLxb = com.bytedance.sdk.component.utils.tD.Lxb(this.id, "tt_video_dial_phone");
        }
        TextView textView2 = this.VVE;
        if (textView2 != null) {
            textView2.setText(strLxb);
            this.VVE.setOnClickListener(this.hg);
            this.VVE.setOnTouchListener(this.hg);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.JXs
    public boolean LD(int i) {
        SeekBar seekBar = this.JZE;
        return seekBar != null && i > seekBar.getSecondaryProgress();
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.JXs
    public void Lxb(@Nullable ViewGroup viewGroup) {
        if (viewGroup != null && (this.lk.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            this.Nu = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.lk.getLayoutParams();
            this.wbY = marginLayoutParams.leftMargin;
            this.LXE = marginLayoutParams.topMargin;
            this.FD = marginLayoutParams.width;
            this.ae = marginLayoutParams.height;
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            this.lk.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int[] rules = layoutParams2.getRules();
                this.xr = rules.length > 0 ? rules[3] : 0;
                layoutParams2.addRule(3, 0);
                viewGroup.setLayoutParams(layoutParams2);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                this.bG.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                le.Lxb(viewGroup, 0, 0, 0, 0);
            }
            LD(true);
            this.Sv.setImageDrawable(com.bytedance.sdk.component.utils.tD.lk(this.id, "tt_shrink_video"));
            this.JZE.setThumb(QAg.Lxb(this.id, "tt_seek_thumb_fullscreen_selector"));
            this.JZE.setThumbOffset(0);
            IK.c(this.lk, false);
            JXs(this.Nu);
            le.Lxb(this.rW, 8);
            if (!this.Sfi) {
                le.Lxb((View) this.BcA, 8);
                le.Lxb((View) this.le, 8);
            } else if ((this.aH & 1) == 1) {
                le.Lxb((View) this.BcA, 8);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.JXs, com.bytedance.sdk.component.utils.aH.Lxb
    public void Lxb(Message message) {
        if (message.what != 1) {
            return;
        }
        JVA();
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.JXs
    public void Lxb(boolean z, boolean z2, boolean z3) {
        le.Lxb(this.Ld, 0);
        if (this.Nu) {
            le.Lxb(this.rW, 0);
            le.Lxb((View) this.dR, 0);
        } else if (z3) {
            le.Lxb(this.rW, 8);
        }
        le.Lxb((View) this.JXs, (!z || this.lc.getVisibility() == 0) ? 8 : 0);
        if (!this.Sfi && !this.Nu) {
            if ((this.aH & 1) != 1 && !z3) {
                le.Lxb((View) this.BcA, 0);
            }
            le.Lxb((View) this.le, z3 ? 8 : 0);
        }
        le.Lxb((View) this.Lpq, 0);
        le.Lxb((View) this.Ns, 0);
        le.Lxb((View) this.JZE, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.JXs
    public void Lxb(boolean z, boolean z2) {
        le.Lxb(this.Ld, 8);
        le.Lxb(this.rW, 8);
        le.Lxb((View) this.JXs, 8);
        if (!this.Sfi && !this.Nu) {
            le.Lxb((View) this.BcA, 8);
            if ((this.aH & 2) != 2) {
                le.Lxb((View) this.le, 8);
            }
        } else if ((this.aH & 1) == 1) {
            le.Lxb((View) this.BcA, 8);
        }
        if (z2) {
            le.Lxb((View) this.BcA, 8);
            le.Lxb((View) this.le, 8);
        }
        lk(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.JXs, com.bytedance.sdk.openadsdk.core.widget.brP.Lxb
    public void Lxb(View view, boolean z) {
        if (nBu()) {
            String str = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
            tD tDVar = this.CSn;
            if (tDVar != null && !TextUtils.isEmpty(tDVar.FD())) {
                Lxb(this.CSn.FD());
            }
            this.NDz.setText(str);
        } else {
            Lxb("");
            this.NDz.setText("");
        }
        if (this.Ivz) {
            return;
        }
        lk(this.Sfi && !this.Nu);
        if (VVE()) {
            this.KPU.Lxb(this, view, true, this.lc.getVisibility() != 0);
        }
    }
}
