package com.bytedance.sdk.openadsdk.core.bgr.lr;

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
import benzoyl.saneness;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.widget.ac;
import com.bytedance.sdk.openadsdk.core.widget.tan;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.sf;
import com.bytedance.sdk.openadsdk.utils.slm;
import com.unity3d.services.UnityAdsConstants;
import euthanasia.attabal;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends fi {
    private int aac;
    private final Rect ajz;
    private SeekBar bnj;
    private final Rect che;
    private float eb;
    private TextView fe;
    private ImageView feb;
    private boolean gcp;
    private final tan hpn;
    private ColorStateList hws;
    private float id;
    private ImageView ig;
    private float iph;
    private TextView jc;
    private float jxw;
    private TextView kt;
    private final int luy;
    private int nd;
    private final Rect nh;
    private float pc;
    private final Rect pu;
    private TextView pv;
    private View qd;
    private boolean qh;
    private final View.OnTouchListener qmx;
    private final igq rzk;
    private ColorStateList saa;
    private TextView siy;
    private TextView srn;
    private View ta;
    private ImageView tnn;
    private int tw;
    private final int ud;
    private ColorStateList vt;
    private TextView whw;
    private int xe;
    private ImageView xm;
    private final Rect yjm;
    private int zb;
    private int zk;
    private View zyn;

    public ka(Context context, ViewGroup viewGroup, boolean z, int i, wjv wjvVar, attabal attabalVar, boolean z2) {
        super(context, viewGroup, z, i, wjvVar, attabalVar, z2);
        this.rzk = new igq(this);
        this.qh = false;
        this.gcp = false;
        this.tw = 0;
        this.nd = 0;
        this.zb = 0;
        this.aac = 0;
        this.xe = 0;
        this.yjm = new Rect();
        this.ajz = new Rect();
        this.zk = 0;
        this.qmx = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ka.7
            @Override // android.view.View.OnTouchListener
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
        this.nh = new Rect();
        this.pu = new Rect();
        this.che = new Rect();
        this.su = nr.ri().getApplicationContext();
        ka(z2);
        this.ik = viewGroup;
        this.ihz = z;
        tan tanVar = new tan(this);
        this.hpn = tanVar;
        tanVar.ri(this.ihz);
        DisplayMetrics displayMetrics = this.su.getResources().getDisplayMetrics();
        this.luy = displayMetrics.widthPixels;
        this.ud = displayMetrics.heightPixels;
        this.ay = i;
        this.hcw = attabalVar;
        this.fr = wjvVar;
        ka(8);
        ri(context, this.ik);
        ka();
        co();
    }

    private void fr() {
        DisplayMetrics displayMetrics = this.su.getResources().getDisplayMetrics();
        TextView textView = this.whw;
        if (textView != null) {
            this.id = textView.getTextSize();
            this.whw.setTextSize(2, 14.0f);
            ColorStateList textColors = this.whw.getTextColors();
            this.hws = textColors;
            if (textColors != null) {
                this.whw.setTextColor(-1);
            }
            this.jxw = this.whw.getAlpha();
            this.whw.setAlpha(0.85f);
            this.whw.setShadowLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, qd.lr(this.su, 0.5f), qd.lr(this.su, 0.5f), uq.xha(this.su, "tt_b2000000"));
            ViewGroup.LayoutParams layoutParams = this.whw.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.nh.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                qd.ri(this.whw, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.nh.top, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), this.nh.bottom);
            }
        }
        TextView textView2 = this.siy;
        if (textView2 != null) {
            this.eb = textView2.getTextSize();
            this.siy.setTextSize(2, 14.0f);
            ColorStateList textColors2 = this.siy.getTextColors();
            this.vt = textColors2;
            if (textColors2 != null) {
                this.siy.setTextColor(-1);
            }
            this.iph = this.siy.getAlpha();
            this.siy.setAlpha(0.85f);
            this.siy.setShadowLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, qd.lr(this.su, 0.5f), qd.lr(this.su, 0.5f), uq.xha(this.su, "tt_b2000000"));
            ViewGroup.LayoutParams layoutParams2 = this.siy.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                this.pu.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                TextView textView3 = this.siy;
                int iApplyDimension = (int) TypedValue.applyDimension(1, 14.0f, displayMetrics);
                Rect rect = this.pu;
                qd.ri(textView3, iApplyDimension, rect.top, rect.right, rect.bottom);
            }
        }
        ImageView imageView = this.xm;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                this.che.set(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                ImageView imageView2 = this.xm;
                Rect rect2 = this.che;
                qd.ri(imageView2, rect2.left, rect2.top, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.che.bottom);
            }
        }
        ImageView imageView3 = this.xm;
        if (imageView3 != null) {
            imageView3.setImageDrawable(uq.ik(this.su, "tt_shrink_fullscreen"));
        }
        TextView textView4 = this.jc;
        if (textView4 != null) {
            ColorStateList textColors3 = textView4.getTextColors();
            this.saa = textColors3;
            if (textColors3 != null) {
                this.jc.setTextColor(-1);
            }
            this.pc = this.jc.getAlpha();
            this.jc.setAlpha(0.85f);
            ViewGroup.LayoutParams layoutParams4 = this.jc.getLayoutParams();
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                this.ajz.set(marginLayoutParams4.leftMargin, marginLayoutParams4.topMargin, marginLayoutParams4.rightMargin, marginLayoutParams4.bottomMargin);
                TextView textView5 = this.jc;
                int iApplyDimension2 = (int) TypedValue.applyDimension(1, 1.0f, displayMetrics);
                Rect rect3 = this.pu;
                qd.ri(textView5, iApplyDimension2, rect3.top, rect3.right, rect3.bottom);
            }
        }
        View view = this.qd;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            this.zk = layoutParams5.height;
            layoutParams5.height = (int) TypedValue.applyDimension(1, 49.0f, displayMetrics);
            this.qd.setLayoutParams(layoutParams5);
            this.qd.setBackgroundResource(uq.ka(this.su, "tt_shadow_fullscreen_top"));
        }
        lr(false, true);
    }

    private void su() {
        TextView textView = this.whw;
        if (textView != null) {
            textView.setTextSize(0, this.id);
            ColorStateList colorStateList = this.hws;
            if (colorStateList != null) {
                this.whw.setTextColor(colorStateList);
            }
            this.whw.setAlpha(this.jxw);
            this.whw.setShadowLayer(qd.lr(this.su, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, uq.xha(this.su, "tt_72000000"));
            TextView textView2 = this.whw;
            Rect rect = this.nh;
            qd.ri(textView2, rect.left, rect.top, rect.right, rect.bottom);
        }
        TextView textView3 = this.siy;
        if (textView3 != null) {
            textView3.setTextSize(0, this.eb);
            ColorStateList colorStateList2 = this.vt;
            if (colorStateList2 != null) {
                this.siy.setTextColor(colorStateList2);
            }
            this.siy.setAlpha(this.iph);
            this.siy.setShadowLayer(qd.lr(this.su, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, uq.xha(this.su, "tt_72000000"));
            TextView textView4 = this.siy;
            Rect rect2 = this.pu;
            qd.ri(textView4, rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        ImageView imageView = this.xm;
        if (imageView != null) {
            Rect rect3 = this.che;
            qd.ri(imageView, rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        ImageView imageView2 = this.xm;
        if (imageView2 != null) {
            imageView2.setImageDrawable(uq.ik(this.su, "tt_enlarge_video"));
        }
        TextView textView5 = this.jc;
        if (textView5 != null) {
            ColorStateList colorStateList3 = this.saa;
            if (colorStateList3 != null) {
                textView5.setTextColor(colorStateList3);
            }
            this.jc.setAlpha(this.pc);
            TextView textView6 = this.jc;
            Rect rect4 = this.pu;
            qd.ri(textView6, rect4.left, rect4.top, rect4.right, rect4.bottom);
        }
        View view = this.qd;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = this.zk;
            this.qd.setLayoutParams(layoutParams);
            this.qd.setBackground(sf.ri(this.su, "tt_video_black_desc_gradient"));
        }
        lr(false, true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.fi
    public void di() {
        this.rzk.removeMessages(1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.fi
    public void fi() {
        this.rzk.removeMessages(1);
        this.rzk.sendMessageDelayed(this.rzk.obtainMessage(1), 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.fi
    public void ik(boolean z) {
        TextView textView = this.srn;
        if (textView != null) {
            qd.ri((View) textView, (!this.ihz && z) ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.fi
    public void jbs() {
        this.bnj.setProgress(0);
        this.bnj.setSecondaryProgress(0);
        this.siy.setText(uq.ri(this.su, "tt_00_00"));
        this.whw.setText(uq.ri(this.su, "tt_00_00"));
        ka(8);
        if (ay()) {
            this.ka.setVisibility(8);
        }
        ImageView imageView = this.mj;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        ka(8);
        qd.ri(this.ta, 8);
        qd.ri(this.qt, 8);
        qd.ri((View) this.sf, 8);
        qd.ri(this.f18104co, 8);
        qd.ri((View) this.aw, 8);
        qd.ri((View) this.bgr, 8);
        qd.ri((View) this.vr, 8);
        ac acVar = this.igq;
        if (acVar != null) {
            acVar.ri(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.fi
    public void ka() {
        super.ka();
        this.hpn.ri(this.ik);
        qd.ri((View) this.ig, (this.ihz || (this.ay & 1) == 1) ? 8 : 0);
        this.ig.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ka.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ka.this.slm()) {
                    ka kaVar = ka.this;
                    kaVar.zf.ik(kaVar, view);
                }
            }
        });
        qd.ri((View) this.pv, (!this.ihz || (this.ay & 2) == 2) ? 0 : 8);
        this.pv.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ka.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ka.this.slm()) {
                    ka kaVar = ka.this;
                    kaVar.zf.ka(kaVar, view);
                }
            }
        });
        this.feb.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ka.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ka.this.slm()) {
                    ka kaVar = ka.this;
                    kaVar.zf.fi(kaVar, view);
                }
            }
        });
        this.tnn.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ka.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ka.this.lr(false, true);
                ka.this.mj();
                ka.this.xha();
                ka.this.slm();
            }
        });
        this.xm.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ka.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ka.this.slm()) {
                    ka kaVar = ka.this;
                    kaVar.zf.lr(kaVar, view);
                }
            }
        });
        this.bnj.setThumbOffset(0);
        this.bnj.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ka.6
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (ka.this.slm()) {
                    ka kaVar = ka.this;
                    kaVar.zf.ri(kaVar, i, z);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                if (!ka.this.qh && ka.this.su != null) {
                    seekBar.setThumb(sf.ri(nr.ri(), "tt_seek_thumb_press"));
                }
                if (ka.this.slm()) {
                    seekBar.setThumbOffset(0);
                    ka kaVar = ka.this;
                    kaVar.zf.lr(kaVar, seekBar.getProgress());
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (!ka.this.qh && ka.this.su != null) {
                    seekBar.setThumb(sf.ri(nr.ri(), "tt_seek_thumb_normal"));
                }
                if (ka.this.slm()) {
                    seekBar.setThumbOffset(0);
                    ka kaVar = ka.this;
                    kaVar.zf.ri(kaVar, seekBar.getProgress());
                }
            }
        });
        this.bnj.setOnTouchListener(this.qmx);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.fi
    public void lr(boolean z) {
        int i = qt() ? this.ud : this.bu;
        int iLr = qt() ? this.luy : this.nr;
        if (this.ac <= 0 || this.tan <= 0 || i <= 0) {
            return;
        }
        if (!ihz() && !qt() && (this.ay & 8) != 8) {
            iLr = qd.lr(this.su, 228.0f);
        }
        int i2 = this.tan;
        int i3 = this.ac;
        int i4 = (int) (i3 * ((i * 1.0f) / i2));
        if (i4 > iLr) {
            i = (int) (i2 * ((iLr * 1.0f) / i3));
        } else {
            iLr = i4;
        }
        if (!z && !qt()) {
            i = this.bu;
            iLr = this.nr;
        }
        this.ka.ri(i, iLr);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.fi
    public void mj() {
        qd.fi(this.di);
        qd.fi(this.zyn);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.fi, com.bytedance.sdk.openadsdk.core.widget.ac.lr
    public boolean qt() {
        return this.qh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.fi, euthanasia.saneness
    public /* bridge */ /* synthetic */ void ri(wjv wjvVar, WeakReference weakReference, boolean z) {
        ri(wjvVar, (WeakReference<Context>) weakReference, z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.fi, com.bytedance.sdk.openadsdk.core.widget.ac.lr
    public void sf() {
        ri(true, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.fi
    public void xha() {
        wjv wjvVar;
        qd.di(this.di);
        qd.di(this.xha);
        qd.fi(this.zyn);
        if (this.mj != null && (wjvVar = this.fr) != null && wjvVar.eu() != null && this.fr.eu().cuirassed() != null) {
            qd.di(this.mj);
            com.bytedance.sdk.openadsdk.ac.lr.lr().ri(this.fr.eu().cuirassed(), this.fr.eu().impassible(), this.fr.eu().adultoid(), this.mj, this.fr);
        }
        if (this.fi.getVisibility() == 0) {
            qd.ri((View) this.fi, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.fi
    public void ri(Context context, View view) {
        super.ri(context, view);
        this.pv = (TextView) view.findViewById(slm.yjg);
        this.ig = (ImageView) view.findViewById(slm.amj);
        this.qd = view.findViewById(slm.fn);
        this.feb = (ImageView) view.findViewById(slm.xh);
        this.srn = (TextView) view.findViewById(slm.bfa);
        this.jc = (TextView) view.findViewById(slm.tq);
        this.kt = (TextView) view.findViewById(slm.jg);
        this.zyn = view.findViewById(slm.smj);
        this.tnn = (ImageView) view.findViewById(slm.rbz);
        TextView textView = (TextView) view.findViewById(slm.eqw);
        this.fe = textView;
        textView.setText(uq.ri(context, "tt_video_retry_des_txt"));
        this.bnj = (SeekBar) view.findViewById(slm.klz);
        this.siy = (TextView) view.findViewById(slm.tyz);
        this.whw = (TextView) view.findViewById(slm.tyc);
        this.ta = view.findViewById(slm.tn);
        this.xm = (ImageView) view.findViewById(slm.lau);
        this.jbs = view.findViewById(slm.jm);
    }

    private void fi(boolean z) {
        if (z) {
            fr();
        } else {
            su();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.fi
    public void lr(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = this.ik) == null || !(viewGroup2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        this.qh = false;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.ik.getLayoutParams();
        marginLayoutParams.width = this.zb;
        marginLayoutParams.height = this.aac;
        marginLayoutParams.leftMargin = this.nd;
        marginLayoutParams.topMargin = this.tw;
        this.ik.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(3, this.xe);
            viewGroup.setLayoutParams(layoutParams2);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            Rect rect = this.yjm;
            qd.ri(viewGroup, rect.left, rect.top, rect.right, rect.bottom);
        }
        lr(true);
        this.xm.setImageDrawable(uq.ik(this.su, "tt_enlarge_video"));
        this.bnj.setThumb(sf.ri(this.su, "tt_seek_thumb_normal"));
        this.bnj.setThumbOffset(0);
        saneness.dern(this.ik, true);
        fi(this.qh);
        qd.ri(this.qd, 8);
        if ((this.ay & 2) == 2) {
            qd.ri((View) this.pv, 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.fi
    public void ri(String str) {
        TextView textView = this.srn;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.jc;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.fi
    public void ri(int i) {
        View view = this.ta;
        if (view == null || view.getVisibility() != 0) {
            this.bnj.setProgress(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.fi
    public void ri(long j, long j2) {
        this.siy.setText(saneness.saneness(j2));
        this.whw.setText(saneness.saneness(j));
        this.bnj.setProgress(saneness.attabal(j, j2));
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.fi, euthanasia.saneness
    public void ri() {
        ri(false, this.ihz);
        tan();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.fi
    public void ri(long j) {
        this.whw.setText(saneness.saneness(j));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.fi
    public void ri(wjv wjvVar, WeakReference<Context> weakReference, boolean z) {
        String strTq;
        String strRi;
        wjv wjvVar2;
        if (wjvVar == null) {
            return;
        }
        ri(this.ik, nr.ri());
        ri(false, this.ihz);
        qd.ri(this.qt, 0);
        qd.ri((View) this.sf, 0);
        qd.ri(this.f18104co, 0);
        if (this.sf != null && (wjvVar2 = this.fr) != null && wjvVar2.eu() != null && this.fr.eu().cuirassed() != null) {
            com.bytedance.sdk.openadsdk.ac.lr.lr().ri(this.fr.eu().cuirassed(), this.fr.eu().impassible(), this.fr.eu().adultoid(), this.sf, this.fr);
        }
        if (!TextUtils.isEmpty(wjvVar.tpb())) {
            strTq = wjvVar.tpb();
        } else if (!TextUtils.isEmpty(wjvVar.xh())) {
            strTq = wjvVar.xh();
        } else if (!TextUtils.isEmpty(wjvVar.tq())) {
            strTq = wjvVar.tq();
        } else {
            strTq = "";
        }
        wjv wjvVar3 = this.fr;
        if (wjvVar3 != null && wjvVar3.fb() != null && this.fr.fb().ri() != null) {
            qd.ri((View) this.aw, 0);
            qd.ri((View) this.bgr, 4);
            if (this.aw != null) {
                com.bytedance.sdk.openadsdk.ac.lr.lr().ri(this.fr.fb(), this.aw, wjvVar);
                this.aw.setOnClickListener(this.oh);
                this.aw.setOnTouchListener(this.oh);
            }
        } else if (!TextUtils.isEmpty(strTq)) {
            qd.ri((View) this.aw, 4);
            qd.ri((View) this.bgr, 0);
            TextView textView = this.bgr;
            if (textView != null) {
                textView.setText(strTq.substring(0, 1));
                this.bgr.setOnClickListener(this.oh);
                this.bgr.setOnTouchListener(this.oh);
            }
        }
        if (this.vr != null && !TextUtils.isEmpty(strTq)) {
            this.vr.setText(strTq);
        }
        qd.ri((View) this.vr, 0);
        qd.ri((View) this.slm, 0);
        int iAdz = wjvVar.adz();
        if (iAdz == 4) {
            strRi = uq.ri(this.su, "tt_video_download_apk");
        } else if (iAdz != 5) {
            strRi = uq.ri(this.su, "tt_video_mobile_go_detail");
        } else {
            strRi = uq.ri(this.su, "tt_video_dial_phone");
        }
        TextView textView2 = this.slm;
        if (textView2 != null) {
            textView2.setText(strRi);
            this.slm.setOnClickListener(this.oh);
            this.slm.setOnTouchListener(this.oh);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.fi
    public boolean lr(int i) {
        SeekBar seekBar = this.bnj;
        return seekBar != null && i > seekBar.getSecondaryProgress();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.fi
    public void ri(ViewGroup viewGroup) {
        if (viewGroup != null && (this.ik.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            this.qh = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.ik.getLayoutParams();
            this.nd = marginLayoutParams.leftMargin;
            this.tw = marginLayoutParams.topMargin;
            this.zb = marginLayoutParams.width;
            this.aac = marginLayoutParams.height;
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            this.ik.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int[] rules = layoutParams2.getRules();
                this.xe = rules.length > 0 ? rules[3] : 0;
                layoutParams2.addRule(3, 0);
                viewGroup.setLayoutParams(layoutParams2);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                this.yjm.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                qd.ri(viewGroup, 0, 0, 0, 0);
            }
            lr(true);
            this.xm.setImageDrawable(uq.ik(this.su, "tt_shrink_video"));
            this.bnj.setThumb(sf.ri(this.su, "tt_seek_thumb_fullscreen_selector"));
            this.bnj.setThumbOffset(0);
            saneness.dern(this.ik, false);
            fi(this.qh);
            qd.ri(this.qd, 8);
            if (!this.ihz) {
                qd.ri((View) this.ig, 8);
                qd.ri((View) this.pv, 8);
            } else if ((this.ay & 1) == 1) {
                qd.ri((View) this.ig, 8);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.fi, com.bytedance.sdk.component.utils.igq.ri
    public void ri(Message message) {
        if (message.what != 1) {
            return;
        }
        sf();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.fi
    public void ri(boolean z, boolean z2, boolean z3) {
        qd.ri(this.ta, 0);
        if (this.qh) {
            qd.ri(this.qd, 0);
            qd.ri((View) this.jc, 0);
        } else if (z3) {
            qd.ri(this.qd, 8);
        }
        qd.ri((View) this.fi, (!z || this.di.getVisibility() == 0) ? 8 : 0);
        if (!this.ihz && !this.qh) {
            if ((this.ay & 1) != 1 && !z3) {
                qd.ri((View) this.ig, 0);
            }
            qd.ri((View) this.pv, z3 ? 8 : 0);
        }
        qd.ri((View) this.siy, 0);
        qd.ri((View) this.whw, 0);
        qd.ri((View) this.bnj, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.fi
    public void ri(boolean z, boolean z2) {
        qd.ri(this.ta, 8);
        qd.ri(this.qd, 8);
        qd.ri((View) this.fi, 8);
        if (!this.ihz && !this.qh) {
            qd.ri((View) this.ig, 8);
            if ((this.ay & 2) != 2) {
                qd.ri((View) this.pv, 8);
            }
        } else if ((this.ay & 1) == 1) {
            qd.ri((View) this.ig, 8);
        }
        if (z2) {
            qd.ri((View) this.ig, 8);
            qd.ri((View) this.pv, 8);
        }
        ik(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.fi, com.bytedance.sdk.openadsdk.core.widget.tan.ri
    public void ri(View view, boolean z) {
        if (qt()) {
            String str = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
            wjv wjvVar = this.fr;
            if (wjvVar != null && !TextUtils.isEmpty(wjvVar.xh())) {
                ri(this.fr.xh());
            }
            this.kt.setText(str);
        } else {
            ri("");
            this.kt.setText("");
        }
        if (this.dw) {
            return;
        }
        ik(this.ihz && !this.qh);
        if (slm()) {
            this.zf.ri(this, view, true, this.di.getVisibility() != 0);
        }
    }
}
