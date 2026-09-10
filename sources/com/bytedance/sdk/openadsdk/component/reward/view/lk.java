package com.bytedance.sdk.openadsdk.component.reward.view;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.widget.VVE;
import com.bytedance.sdk.openadsdk.core.widget.kqm;
import com.bytedance.sdk.openadsdk.utils.STP;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.nJ;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lk extends com.bytedance.sdk.openadsdk.core.JXs.JXs {
    private boolean JXs;
    private TextView LD;
    private VVE Lxb;
    private TextView ZU;
    private com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lc;
    private kqm lk;

    public static class Lxb implements com.bytedance.sdk.component.JXs.VVE<Bitmap> {
        private final String LD;
        private final tD Lxb;
        private final WeakReference<ImageView> ZU;
        private final String lk;

        public Lxb(ImageView imageView, tD tDVar, String str, String str2) {
            this.ZU = new WeakReference<>(imageView);
            this.Lxb = tDVar;
            this.LD = str;
            this.lk = str2;
        }

        @Override // com.bytedance.sdk.component.JXs.VVE
        public void Lxb(com.bytedance.sdk.component.JXs.JVA<Bitmap> jva) {
            if (jva == null || jva.LD() == null) {
                return;
            }
            ImageView imageView = this.ZU.get();
            if (imageView != null) {
                imageView.setImageBitmap(jva.LD());
            }
            com.bytedance.sdk.openadsdk.ZU.lk.LD(this.Lxb, this.lk, "load_vast_icon_success", (JSONObject) null);
        }

        @Override // com.bytedance.sdk.component.JXs.VVE
        public void Lxb(int i, String str, @Nullable Throwable th) {
            Lxb(i, str, this.LD);
        }

        private void Lxb(final int i, final String str, final String str2) {
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(new com.bytedance.sdk.component.OY.OY("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.view.lk.Lxb.1
                @Override // java.lang.Runnable
                public void run() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("error_code", i);
                        jSONObject.put("description", i + ":" + str);
                        jSONObject.put("url", str2);
                    } catch (Throwable unused) {
                    }
                    com.bytedance.sdk.openadsdk.ZU.lk.LD(Lxb.this.Lxb, Lxb.this.lk, "load_vast_icon_fail", jSONObject);
                }
            });
        }
    }

    public lk(@NonNull Context context) {
        super(context);
        setOrientation(1);
        setVisibility(8);
        setBackgroundColor(-1);
    }

    private void JXs() {
        Context context = getContext();
        setPadding(le.lk(context, 16.0f), le.lk(context, 16.0f), le.lk(context, 16.0f), le.lk(context, 24.0f));
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs.setOrientation(0);
        jXs.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = le.lk(context, 12.0f);
        addView(jXs, layoutParams);
        kqm kqmVar = new kqm(context);
        this.lk = kqmVar;
        kqmVar.setBackgroundColor(0);
        this.lk.setId(STP.LD);
        jXs.addView(this.lk, new LinearLayout.LayoutParams(le.lk(context, 48.0f), le.lk(context, 48.0f)));
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs2 = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = le.lk(context, 12.0f);
        jXs.addView(jXs2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        this.ZU = oy;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        oy.setEllipsize(truncateAt);
        this.ZU.setGravity(16);
        this.ZU.setSingleLine(true);
        this.ZU.setTextSize(2, 17.0f);
        this.ZU.setId(STP.lk);
        this.ZU.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        jXs2.addView(this.ZU, new LinearLayout.LayoutParams(-1, -2));
        VVE vve = new VVE(context);
        this.Lxb = vve;
        vve.setId(STP.JXs);
        jXs2.addView(this.Lxb, new LinearLayout.LayoutParams(-2, le.lk(context, 14.0f)));
        com.bytedance.sdk.openadsdk.core.JXs.OY oy2 = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        this.LD = oy2;
        oy2.setGravity(17);
        this.LD.setEllipsize(truncateAt);
        this.LD.setSingleLine(true);
        this.LD.setTextColor(-1);
        this.LD.setTextSize(2, 16.0f);
        this.LD.setId(520093705);
        this.LD.setBackground(Lxb(context));
        this.LD.setText(this.lc.LD.xr());
        addView(this.LD, new LinearLayout.LayoutParams(-1, le.lk(context, 36.0f)));
    }

    private void ZU() {
        setOrientation(0);
        setGravity(16);
        Context context = getContext();
        setPadding(le.lk(context, 16.0f), le.lk(context, 12.0f), le.lk(context, 16.0f), le.lk(context, 12.0f));
        kqm kqmVar = new kqm(context);
        this.lk = kqmVar;
        kqmVar.setBackgroundColor(0);
        this.lk.setId(STP.LD);
        addView(this.lk, new LinearLayout.LayoutParams(le.lk(context, 48.0f), le.lk(context, 48.0f)));
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.leftMargin = le.lk(context, 12.0f);
        layoutParams.weight = 1.0f;
        addView(jXs, layoutParams);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        this.ZU = oy;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        oy.setEllipsize(truncateAt);
        this.ZU.setGravity(16);
        this.ZU.setSingleLine(true);
        this.ZU.setTextSize(2, 17.0f);
        this.ZU.setId(STP.lk);
        this.ZU.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        jXs.addView(this.ZU, new LinearLayout.LayoutParams(-1, -2));
        VVE vve = new VVE(context);
        this.Lxb = vve;
        vve.setId(STP.JXs);
        jXs.addView(this.Lxb, new LinearLayout.LayoutParams(-2, le.lk(context, 14.0f)));
        com.bytedance.sdk.openadsdk.core.JXs.OY oy2 = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        this.LD = oy2;
        oy2.setGravity(17);
        this.LD.setEllipsize(truncateAt);
        this.LD.setSingleLine(true);
        this.LD.setTextColor(-1);
        this.LD.setTextSize(2, 16.0f);
        this.LD.setId(520093705);
        this.LD.setBackground(Lxb(context));
        this.LD.setText(this.lc.LD.xr());
        addView(this.LD, new LinearLayout.LayoutParams(le.lk(context, 164.0f), le.lk(context, 36.0f)));
    }

    private String getCnOrEnBtnText() {
        return this.lc.LD.sRq() != 4 ? "View" : "Install";
    }

    private void lk() {
        this.JXs = true;
        if (this.lc.Ns == 1) {
            JXs();
        } else {
            ZU();
        }
        if (this.LD == null) {
            this.LD = (TextView) this.lc.rW.findViewById(520093705);
        }
        tD tDVar = this.lc.LD;
        TextView textView = this.LD;
        if (textView != null) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.lk.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    int width = ((ViewGroup) lk.this.LD.getParent()).getWidth();
                    if (width > 0) {
                        lk.this.LD.setMaxWidth((int) (width * 0.45f));
                    }
                }
            });
            if (!tDVar.chu()) {
                this.LD.setText(tDVar.nE() == 3 ? getButtonTextForNewStyleBar() : tDVar.xr());
            } else if (tDVar.SlV() != null && TextUtils.isEmpty(tDVar.SlV().lc())) {
                le.Lxb((View) this.LD, 8);
            }
        }
        if (this.lk != null && tDVar.Lpq() != null && !TextUtils.isEmpty(tDVar.Lpq().Lxb())) {
            String strLxb = tDVar.Lpq().Lxb();
            if (tDVar.chu()) {
                com.bytedance.sdk.openadsdk.QAg.ZU.Lxb(tDVar.Lpq()).lk(2).Lxb(new com.bytedance.sdk.openadsdk.QAg.LD(tDVar, tDVar.Lpq().Lxb(), new Lxb(this.lk, tDVar, strLxb, this.lc.JXs)));
                if (tDVar.SlV() != null && tDVar.SlV().LD() != null) {
                    tDVar.SlV().LD().LD(0L);
                }
            } else {
                com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(tDVar.Lpq(), this.lk, tDVar);
            }
        }
        TextView textView2 = this.ZU;
        if (textView2 != null) {
            textView2.setText(tDVar.FD());
        }
        VVE vve = this.Lxb;
        if (vve != null) {
            le.Lxb((TextView) null, vve, tDVar);
        }
        if (this.lc.Ns == 2 && tDVar.nE() == 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.LD.getLayoutParams();
            layoutParams.height = le.lk(this.lc.NDz, 55.0f);
            layoutParams.topMargin = le.lk(this.lc.NDz, 20.0f);
            this.LD.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams2.bottomMargin = le.lk(this.lc.NDz, 12.0f);
            setLayoutParams(layoutParams2);
        }
        LD();
    }

    public String getButtonTextForNewStyleBar() {
        boolean zEquals;
        String strXr;
        String strEbl = nJ.ebl(this.lc.NDz);
        if (strEbl == null) {
            strEbl = "";
        }
        try {
            zEquals = strEbl.equals(Locale.ENGLISH.getLanguage());
        } catch (Throwable unused) {
            zEquals = false;
        }
        if (TextUtils.isEmpty(this.lc.LD.xr())) {
            strXr = this.lc.LD.sRq() != 4 ? "View" : "Install";
        } else {
            strXr = this.lc.LD.xr();
            if (strXr == null || !nJ.lc(strXr) || strXr.length() <= 2) {
                if (strXr != null && !nJ.lc(strXr) && strXr.length() > 7 && zEquals) {
                    strXr = getCnOrEnBtnText();
                }
            } else if (zEquals) {
                strXr = getCnOrEnBtnText();
            }
        }
        if (zEquals && !nJ.lc(strXr)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.LD.getLayoutParams();
            layoutParams.bottomMargin = le.lk(this.lc.NDz, 4.0f);
            this.LD.setLayoutParams(layoutParams);
        }
        return strXr;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0 || this.JXs) {
            return;
        }
        lk();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void LD() {
        com.bytedance.sdk.openadsdk.core.LD.JXs JXs = this.lc.KPU.JXs();
        final com.bytedance.sdk.openadsdk.core.LD.LD ldZU = this.lc.KPU.ZU();
        final tD tDVar = this.lc.LD;
        if (tDVar.xan() == null) {
            return;
        }
        if (tDVar.nE() != 5 && this.LD != null) {
            if (tDVar.xan().JXs) {
                this.LD.setOnClickListener(JXs);
                this.LD.setOnTouchListener(JXs);
            } else {
                this.LD.setOnClickListener(ldZU);
            }
        }
        if (tDVar.nE() != 5) {
            this.LD.setOnClickListener(JXs);
            this.ZU.setOnClickListener(JXs);
            this.Lxb.setOnClickListener(JXs);
            this.lk.setOnClickListener(JXs);
            return;
        }
        String str = "VAST_ICON";
        if (!tDVar.xan().JXs) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.lk.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    View.OnClickListener onClickListener2 = ldZU;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(view);
                    }
                    if (view == null || !"VAST_ICON".equals(view.getTag(570425345))) {
                        if (tDVar.SlV() != null) {
                            tDVar.SlV().Lxb().ebl(lk.this.lc.eK.ebl());
                        }
                    } else {
                        if (tDVar.SlV() == null || tDVar.SlV().LD() == null) {
                            return;
                        }
                        tDVar.SlV().LD().Lxb(lk.this.lc.eK.ebl());
                    }
                }
            };
            TextView textView = this.LD;
            if (textView != null) {
                textView.setOnClickListener(onClickListener);
            }
            TextView textView2 = this.ZU;
            if (textView2 != null && !TextUtils.isEmpty(textView2.getText())) {
                this.ZU.setOnClickListener(onClickListener);
            }
            kqm kqmVar = this.lk;
            if (kqmVar != null) {
                kqmVar.setTag(570425345, "VAST_ICON");
                this.lk.setOnClickListener(ldZU);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.LD.ebl eblVar = new com.bytedance.sdk.openadsdk.core.LD.ebl("VAST_ACTION_BUTTON", tDVar.SlV(), JXs) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.lk.2
        };
        com.bytedance.sdk.openadsdk.core.LD.ebl eblVar2 = new com.bytedance.sdk.openadsdk.core.LD.ebl(str, tDVar.SlV(), JXs) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.lk.3
        };
        TextView textView3 = this.LD;
        if (textView3 != null) {
            textView3.setOnClickListener(eblVar);
            this.LD.setOnTouchListener(eblVar);
        }
        kqm kqmVar2 = this.lk;
        if (kqmVar2 != null) {
            kqmVar2.setOnClickListener(eblVar2);
            this.lk.setOnTouchListener(eblVar2);
        }
        TextView textView4 = this.ZU;
        if (textView4 == null || TextUtils.isEmpty(textView4.getText())) {
            return;
        }
        this.ZU.setOnClickListener(eblVar);
        this.ZU.setOnTouchListener(eblVar);
    }

    public void Lxb() {
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.65f, 1.0f);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(0.765f, 0.9f);
        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(0.88f, 1.0f);
        Keyframe keyframeOfFloat5 = Keyframe.ofFloat(0.95f, 0.95f);
        Keyframe keyframeOfFloat6 = Keyframe.ofFloat(1.0f, 1.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("scaleX", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6), PropertyValuesHolder.ofKeyframe("scaleY", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6));
        objectAnimatorOfPropertyValuesHolder.setDuration(1000L);
        objectAnimatorOfPropertyValuesHolder.start();
    }

    public void Lxb(com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb) {
        this.lc = lxb;
        if (lxb.LD.nE() == 1) {
            lk();
        }
    }

    private static Drawable Lxb(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#1A73E8"));
        gradientDrawable.setCornerRadius(le.lk(context, 18.0f));
        return gradientDrawable;
    }
}
