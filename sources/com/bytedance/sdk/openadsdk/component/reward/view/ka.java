package com.bytedance.sdk.openadsdk.component.reward.view;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.widget.bu;
import com.bytedance.sdk.openadsdk.core.widget.slm;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.unity3d.services.UnityAdsConstants;
import dumb.dern;
import dumb.saneness;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends com.bytedance.sdk.openadsdk.core.di.fi {
    private TextView di;
    private TextView fi;
    private TextView ik;
    private bu ka;
    private TextView lr;
    private com.bytedance.sdk.openadsdk.component.reward.ri.ri mj;
    private slm ri;
    private boolean xha;

    public static class ri implements com.bytedance.sdk.component.fi.slm {
        private final String ik;
        private final WeakReference<ImageView> ka;
        private final String lr;
        private final wjv ri;

        public ri(ImageView imageView, wjv wjvVar, String str, String str2) {
            this.ka = new WeakReference<>(imageView);
            this.ri = wjvVar;
            this.lr = str;
            this.ik = str2;
        }

        @Override // com.bytedance.sdk.component.fi.slm
        public void ri(com.bytedance.sdk.component.fi.sf sfVar) {
            Object objLr = sfVar.lr();
            if (objLr != null) {
                ImageView imageView = this.ka.get();
                if (objLr instanceof Bitmap) {
                    if (imageView != null) {
                        imageView.setImageBitmap((Bitmap) objLr);
                    }
                } else if (objLr instanceof Drawable) {
                    if (Build.VERSION.SDK_INT >= 28 && saneness.attabal(objLr)) {
                        dern.attabal(objLr).start();
                    }
                    if (imageView != null) {
                        imageView.setImageDrawable((Drawable) objLr);
                    }
                }
                com.bytedance.sdk.openadsdk.ka.ik.lr(this.ri, this.ik, "load_vast_icon_success", (JSONObject) null);
            }
        }

        @Override // com.bytedance.sdk.component.fi.slm
        public void ri(int i, String str, Throwable th) {
            ri(i, str, this.lr);
        }

        private void ri(final int i, final String str, final String str2) {
            com.bytedance.sdk.openadsdk.ka.ik.ri(new com.bytedance.sdk.component.mj.lr.ik("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ka.ri.1
                @Override // java.lang.Runnable
                public void run() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("error_code", i);
                        jSONObject.put(InMobiNetworkValues.DESCRIPTION, i + ":" + str);
                        jSONObject.put("url", str2);
                    } catch (Throwable unused) {
                    }
                    com.bytedance.sdk.openadsdk.ka.ik.lr(ri.this.ri, ri.this.ik, "load_vast_icon_fail", jSONObject);
                }
            });
        }
    }

    public ka(Context context) {
        super(context);
        setOrientation(1);
        setVisibility(8);
        setBackgroundColor(-1);
    }

    private void di() {
        Context context = getContext();
        setPadding(qd.lr(context, 16.0f), qd.lr(context, 16.0f), qd.lr(context, 16.0f), qd.lr(context, 24.0f));
        com.bytedance.sdk.openadsdk.core.di.fi fiVar = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        fiVar.setOrientation(0);
        fiVar.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = qd.lr(context, 12.0f);
        addView(fiVar, layoutParams);
        bu buVar = new bu(context);
        this.ka = buVar;
        buVar.setBackgroundColor(0);
        this.ka.setId(com.bytedance.sdk.openadsdk.utils.slm.ka);
        fiVar.addView(this.ka, new LinearLayout.LayoutParams(qd.lr(context, 48.0f), qd.lr(context, 48.0f)));
        com.bytedance.sdk.openadsdk.core.di.fi fiVar2 = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        fiVar2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = qd.lr(context, 12.0f);
        fiVar.addView(fiVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.di.mj mjVar = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        this.fi = mjVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        mjVar.setEllipsize(truncateAt);
        this.fi.setGravity(16);
        this.fi.setSingleLine(true);
        this.fi.setTextSize(2, 17.0f);
        this.fi.setId(com.bytedance.sdk.openadsdk.utils.slm.fi);
        this.fi.setTextColor(-16777216);
        fiVar2.addView(this.fi, new LinearLayout.LayoutParams(-1, -2));
        slm slmVar = new slm(context);
        this.ri = slmVar;
        slmVar.setId(com.bytedance.sdk.openadsdk.utils.slm.xha);
        fiVar2.addView(this.ri, new LinearLayout.LayoutParams(-2, qd.lr(context, 14.0f)));
        com.bytedance.sdk.openadsdk.core.di.mj mjVar2 = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        this.lr = mjVar2;
        mjVar2.setGravity(17);
        this.lr.setEllipsize(truncateAt);
        this.lr.setSingleLine(true);
        this.lr.setTextColor(-1);
        this.lr.setTextSize(2, 16.0f);
        this.lr.setId(520093705);
        this.lr.setBackground(ri(context));
        this.lr.setText(this.mj.lr.skk());
        addView(this.lr, new LinearLayout.LayoutParams(-1, qd.lr(context, 36.0f)));
    }

    private void fi() {
        setOrientation(0);
        setGravity(16);
        Context context = getContext();
        setPadding(qd.lr(context, 16.0f), qd.lr(context, 12.0f), qd.lr(context, 16.0f), qd.lr(context, 12.0f));
        bu buVar = new bu(context);
        this.ka = buVar;
        buVar.setBackgroundColor(0);
        this.ka.setId(com.bytedance.sdk.openadsdk.utils.slm.ka);
        addView(this.ka, new LinearLayout.LayoutParams(qd.lr(context, 48.0f), qd.lr(context, 48.0f)));
        com.bytedance.sdk.openadsdk.core.di.fi fiVar = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        fiVar.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.leftMargin = qd.lr(context, 12.0f);
        layoutParams.weight = 1.0f;
        addView(fiVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.di.mj mjVar = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        this.fi = mjVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        mjVar.setEllipsize(truncateAt);
        this.fi.setGravity(16);
        this.fi.setSingleLine(true);
        this.fi.setTextSize(2, 17.0f);
        this.fi.setId(com.bytedance.sdk.openadsdk.utils.slm.fi);
        this.fi.setTextColor(-16777216);
        fiVar.addView(this.fi, new LinearLayout.LayoutParams(-1, -2));
        slm slmVar = new slm(context);
        this.ri = slmVar;
        slmVar.setId(com.bytedance.sdk.openadsdk.utils.slm.xha);
        fiVar.addView(this.ri, new LinearLayout.LayoutParams(-2, qd.lr(context, 14.0f)));
        com.bytedance.sdk.openadsdk.core.di.mj mjVar2 = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        this.lr = mjVar2;
        mjVar2.setGravity(17);
        this.lr.setEllipsize(truncateAt);
        this.lr.setSingleLine(true);
        this.lr.setTextColor(-1);
        this.lr.setTextSize(2, 16.0f);
        this.lr.setId(520093705);
        this.lr.setBackground(ri(context));
        this.lr.setText(this.mj.lr.skk());
        addView(this.lr, new LinearLayout.LayoutParams(qd.lr(context, 164.0f), qd.lr(context, 36.0f)));
    }

    private String getCnOrEnBtnText() {
        return this.mj.lr.adz() != 4 ? "View" : "Install";
    }

    private void ka() {
        this.xha = true;
        wjv wjvVar = this.mj.lr;
        int iNd = wjvVar.nd();
        if ((iNd == 43 || iNd == 44) && dw.lr(wjvVar)) {
            ik();
        } else if (this.mj.bnj == 1) {
            di();
        } else {
            fi();
        }
        if (this.lr == null) {
            this.lr = (TextView) this.mj.pv.findViewById(520093705);
        }
        TextView textView = this.lr;
        if (textView != null) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ka.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    int width = ((ViewGroup) ka.this.lr.getParent()).getWidth();
                    if (width > 0) {
                        ka.this.lr.setMaxWidth((int) (width * 0.45f));
                    }
                }
            });
            if (!wjvVar.zz()) {
                this.lr.setText(wjvVar.jxw() == 3 ? getButtonTextForNewStyleBar() : wjvVar.skk());
            } else if (wjvVar.sr() != null && TextUtils.isEmpty(wjvVar.sr().di())) {
                qd.ri((View) this.lr, 8);
            }
        }
        if (this.ka != null && wjvVar.fb() != null && !TextUtils.isEmpty(wjvVar.fb().ri())) {
            String strRi = wjvVar.fb().ri();
            if (wjvVar.zz()) {
                com.bytedance.sdk.openadsdk.qt.ka.ri(wjvVar.fb()).ik(1).ri(new com.bytedance.sdk.openadsdk.qt.lr(wjvVar, wjvVar.fb().ri(), new ri(this.ka, wjvVar, strRi, this.mj.fi)));
                if (wjvVar.sr() != null && wjvVar.sr().lr() != null) {
                    wjvVar.sr().lr().lr(0L);
                }
            } else {
                com.bytedance.sdk.openadsdk.ac.lr.lr().ri(wjvVar.fb(), this.ka, wjvVar);
            }
        }
        TextView textView2 = this.fi;
        if (textView2 != null) {
            textView2.setText(wjvVar.xh());
        }
        TextView textView3 = this.di;
        if (textView3 != null) {
            textView3.setText(ri(wjvVar));
        }
        if (this.ik != null) {
            String strWjv = dw.wjv(this.mj.lr);
            if (TextUtils.isEmpty(strWjv)) {
                strWjv = "Play now";
            }
            this.ik.setText(strWjv);
            this.ik.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ka.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (ka.this.mj != null) {
                        com.bytedance.sdk.openadsdk.component.reward.lr.ri(ka.this.mj);
                    }
                }
            });
        }
        slm slmVar = this.ri;
        if (slmVar != null) {
            qd.ri((TextView) null, slmVar, wjvVar);
        }
        if (this.mj.bnj == 2 && wjvVar.jxw() == 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.lr.getLayoutParams();
            layoutParams.height = qd.lr(this.mj.srn, 55.0f);
            layoutParams.topMargin = qd.lr(this.mj.srn, 20.0f);
            this.lr.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams2.bottomMargin = qd.lr(this.mj.srn, 12.0f);
            setLayoutParams(layoutParams2);
        }
        lr();
    }

    public String getButtonTextForNewStyleBar() {
        boolean zEquals;
        String strSkk;
        String strIk = ig.ik(this.mj.srn);
        if (strIk == null) {
            strIk = "";
        }
        try {
            zEquals = strIk.equals(Locale.ENGLISH.getLanguage());
        } catch (Throwable unused) {
            zEquals = false;
        }
        if (TextUtils.isEmpty(this.mj.lr.skk())) {
            strSkk = this.mj.lr.adz() != 4 ? "View" : "Install";
        } else {
            strSkk = this.mj.lr.skk();
            if (strSkk == null || !ig.xha(strSkk) || strSkk.length() <= 2) {
                if (strSkk != null && !ig.xha(strSkk) && strSkk.length() > 7 && zEquals) {
                    strSkk = getCnOrEnBtnText();
                }
            } else if (zEquals) {
                strSkk = getCnOrEnBtnText();
            }
        }
        if (zEquals && !ig.xha(strSkk)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.lr.getLayoutParams();
            layoutParams.bottomMargin = qd.lr(this.mj.srn, 4.0f);
            this.lr.setLayoutParams(layoutParams);
        }
        return strSkk;
    }

    public void ik() {
        Context context = getContext();
        int iLr = qd.lr(context, 12.0f);
        setPadding(iLr, iLr, iLr, iLr);
        com.bytedance.sdk.openadsdk.core.di.fi fiVar = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        fiVar.setOrientation(0);
        fiVar.setGravity(16);
        addView(fiVar, layoutParams);
        bu buVar = new bu(context);
        this.ka = buVar;
        buVar.setBackgroundColor(0);
        this.ka.setId(com.bytedance.sdk.openadsdk.utils.slm.ka);
        fiVar.addView(this.ka, new LinearLayout.LayoutParams(qd.lr(context, 54.0f), qd.lr(context, 54.0f)));
        com.bytedance.sdk.openadsdk.core.di.fi fiVar2 = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        fiVar2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = qd.lr(context, 12.0f);
        fiVar.addView(fiVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.di.mj mjVar = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        this.fi = mjVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        mjVar.setEllipsize(truncateAt);
        this.fi.setGravity(16);
        this.fi.setSingleLine(true);
        this.fi.setTextSize(2, 17.0f);
        this.fi.setId(com.bytedance.sdk.openadsdk.utils.slm.fi);
        this.fi.setTextColor(-16777216);
        fiVar2.addView(this.fi, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.di.mj mjVar2 = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        this.di = mjVar2;
        mjVar2.setTextColor(-16777216);
        this.di.setTextSize(2, 13.0f);
        this.di.setMaxLines(2);
        this.di.setAlpha(0.8f);
        this.di.setEllipsize(truncateAt);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = qd.lr(context, 4.0f);
        fiVar2.addView(this.di, layoutParams3);
        com.bytedance.sdk.openadsdk.core.di.fi fiVar3 = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = qd.lr(context, 12.0f);
        fiVar3.setOrientation(0);
        addView(fiVar3, layoutParams4);
        com.bytedance.sdk.openadsdk.core.di.mj mjVar3 = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        this.ik = mjVar3;
        mjVar3.setGravity(17);
        this.ik.setEllipsize(truncateAt);
        this.ik.setSingleLine(true);
        this.ik.setTextColor(-16777216);
        this.ik.setTextSize(2, 16.0f);
        this.ik.setBackground(lr(context));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, qd.lr(context, 36.0f), 1.0f);
        layoutParams5.rightMargin = qd.lr(context, 3.0f);
        fiVar3.addView(this.ik, layoutParams5);
        com.bytedance.sdk.openadsdk.core.di.mj mjVar4 = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        this.lr = mjVar4;
        mjVar4.setGravity(17);
        this.lr.setEllipsize(truncateAt);
        this.lr.setSingleLine(true);
        this.lr.setTextColor(-1);
        this.lr.setTextSize(2, 16.0f);
        this.lr.setId(520093705);
        this.lr.setBackground(ik(context));
        this.lr.setText(this.mj.lr.skk());
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, qd.lr(context, 36.0f), 1.0f);
        layoutParams6.leftMargin = qd.lr(context, 3.0f);
        fiVar3.addView(this.lr, layoutParams6);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0 || this.xha) {
            return;
        }
        ka();
    }

    private String ri(wjv wjvVar) {
        if (TextUtils.isEmpty(wjvVar.xh())) {
            return !TextUtils.isEmpty(wjvVar.tq()) ? wjvVar.tq() : "";
        }
        return wjvVar.xh();
    }

    public void lr() {
        com.bytedance.sdk.openadsdk.core.ik.fi fiVarFi = this.mj.su.fi();
        final com.bytedance.sdk.openadsdk.core.ik.lr lrVarKa = this.mj.su.ka();
        final wjv wjvVar = this.mj.lr;
        if (wjvVar.nh() == null) {
            return;
        }
        if (wjvVar.jxw() != 5 && this.lr != null) {
            if (wjvVar.nh().fi) {
                this.lr.setOnClickListener(fiVarFi);
                this.lr.setOnTouchListener(fiVarFi);
            } else {
                this.lr.setOnClickListener(lrVarKa);
            }
        }
        if (wjvVar.jxw() == 1) {
            if (!wjvVar.nh().ri) {
                qd.ri((View) this, (View.OnClickListener) lrVarKa, "TTBaseVideoActivity#mRlDownloadBar");
                this.fi.setOnClickListener(lrVarKa);
                this.ri.setOnClickListener(lrVarKa);
                this.ka.setOnClickListener(lrVarKa);
                return;
            }
            qd.ri((View) this, (View.OnClickListener) fiVarFi, "TTBaseVideoActivity#mRlDownloadBar");
            qd.ri((View) this, (View.OnTouchListener) fiVarFi, "TTBaseVideoActivity#mRlDownloadBar");
            this.fi.setOnClickListener(fiVarFi);
            this.fi.setOnTouchListener(fiVarFi);
            this.ri.setOnClickListener(fiVarFi);
            this.ri.setOnTouchListener(fiVarFi);
            this.ka.setOnClickListener(fiVarFi);
            this.ka.setOnTouchListener(fiVarFi);
            return;
        }
        if (wjvVar.jxw() != 5) {
            if (!wjvVar.nh().ik) {
                qd.ri((View) this, (View.OnClickListener) lrVarKa, "TTBaseVideoActivity#mRlDownloadBar");
                return;
            } else {
                qd.ri((View) this, (View.OnClickListener) fiVarFi, "TTBaseVideoActivity#mRlDownloadBar");
                qd.ri((View) this, (View.OnTouchListener) fiVarFi, "TTBaseVideoActivity#mRlDownloadBar");
                return;
            }
        }
        String str = "VAST_ICON";
        if (!wjvVar.nh().fi) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ka.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    View.OnClickListener onClickListener2 = lrVarKa;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(view);
                    }
                    if (view == null || !"VAST_ICON".equals(view.getTag(570425345))) {
                        if (wjvVar.sr() != null) {
                            wjvVar.sr().ri().xha(ka.this.mj.ihz.aw());
                        }
                    } else {
                        if (wjvVar.sr() == null || wjvVar.sr().lr() == null) {
                            return;
                        }
                        wjvVar.sr().lr().ri(ka.this.mj.ihz.aw());
                    }
                }
            };
            TextView textView = this.lr;
            if (textView != null) {
                textView.setOnClickListener(onClickListener);
            }
            TextView textView2 = this.fi;
            if (textView2 != null && !TextUtils.isEmpty(textView2.getText())) {
                this.fi.setOnClickListener(onClickListener);
            }
            bu buVar = this.ka;
            if (buVar != null) {
                buVar.setTag(570425345, "VAST_ICON");
                this.ka.setOnClickListener(lrVarKa);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.ik.xha xhaVar = new com.bytedance.sdk.openadsdk.core.ik.xha("VAST_ACTION_BUTTON", wjvVar.sr(), fiVarFi) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ka.3
        };
        com.bytedance.sdk.openadsdk.core.ik.xha xhaVar2 = new com.bytedance.sdk.openadsdk.core.ik.xha(str, wjvVar.sr(), fiVarFi) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ka.4
        };
        TextView textView3 = this.lr;
        if (textView3 != null) {
            textView3.setOnClickListener(xhaVar);
            this.lr.setOnTouchListener(xhaVar);
        }
        bu buVar2 = this.ka;
        if (buVar2 != null) {
            buVar2.setOnClickListener(xhaVar2);
            this.ka.setOnTouchListener(xhaVar2);
        }
        TextView textView4 = this.fi;
        if (textView4 == null || TextUtils.isEmpty(textView4.getText())) {
            return;
        }
        this.fi.setOnClickListener(xhaVar);
        this.fi.setOnTouchListener(xhaVar);
    }

    public void ri() {
        Keyframe keyframeOfFloat = Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.65f, 1.0f);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(0.765f, 0.9f);
        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(0.88f, 1.0f);
        Keyframe keyframeOfFloat5 = Keyframe.ofFloat(0.95f, 0.95f);
        Keyframe keyframeOfFloat6 = Keyframe.ofFloat(1.0f, 1.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("scaleX", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6), PropertyValuesHolder.ofKeyframe("scaleY", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6));
        objectAnimatorOfPropertyValuesHolder.setDuration(1000L);
        objectAnimatorOfPropertyValuesHolder.start();
    }

    public void ri(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        this.mj = riVar;
        if (riVar.lr.jxw() == 1) {
            ka();
        }
    }

    private static Drawable ri(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#1A73E8"));
        gradientDrawable.setCornerRadius(qd.lr(context, 18.0f));
        return gradientDrawable;
    }

    private static Drawable lr(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#000000"));
        gradientDrawable.setAlpha(30);
        gradientDrawable.setCornerRadius(qd.lr(context, 8.0f));
        return gradientDrawable;
    }

    private static Drawable ik(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#FE2C55"));
        gradientDrawable.setCornerRadius(qd.lr(context, 8.0f));
        return gradientDrawable;
    }
}
