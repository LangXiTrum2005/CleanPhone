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
import com.bumptech.glide.load.resource.bitmap.a;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.widget.jtx;
import com.bytedance.sdk.openadsdk.core.widget.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.gy;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mzz extends com.bytedance.sdk.openadsdk.core.mo.mzz {
    private com.bytedance.sdk.openadsdk.component.reward.qdl.qdl jpc;
    private TextView lnr;
    private yt mml;
    private TextView mo;
    private TextView mzz;
    private jtx qdl;
    private TextView ud;
    private boolean wd;

    public static class qdl implements com.bytedance.sdk.component.mzz.jtx {
        private final String lnr;
        private final WeakReference<ImageView> mml;
        private final ljh qdl;
        private final String ud;

        public qdl(ImageView imageView, ljh ljhVar, String str, String str2) {
            this.mml = new WeakReference<>(imageView);
            this.qdl = ljhVar;
            this.ud = str;
            this.lnr = str2;
        }

        @Override // com.bytedance.sdk.component.mzz.jtx
        public void qdl(com.bytedance.sdk.component.mzz.rq rqVar) {
            Object objUd = rqVar.ud();
            if (objUd != null) {
                ImageView imageView = this.mml.get();
                if (objUd instanceof Bitmap) {
                    if (imageView != null) {
                        imageView.setImageBitmap((Bitmap) objUd);
                    }
                } else if (objUd instanceof Drawable) {
                    if (Build.VERSION.SDK_INT >= 28 && a.w(objUd)) {
                        a.l(objUd).start();
                    }
                    if (imageView != null) {
                        imageView.setImageDrawable((Drawable) objUd);
                    }
                }
                com.bytedance.sdk.openadsdk.mml.lnr.ud(this.qdl, this.lnr, "load_vast_icon_success", (JSONObject) null);
            }
        }

        @Override // com.bytedance.sdk.component.mzz.jtx
        public void qdl(int i2, String str, Throwable th) {
            qdl(i2, str, this.ud);
        }

        private void qdl(final int i2, final String str, final String str2) {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(new com.bytedance.sdk.component.jpc.jpc("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.view.mzz.qdl.1
                @Override // java.lang.Runnable
                public void run() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("error_code", i2);
                        jSONObject.put("description", i2 + ":" + str);
                        jSONObject.put("url", str2);
                    } catch (Throwable unused) {
                    }
                    com.bytedance.sdk.openadsdk.mml.lnr.ud(qdl.this.qdl, qdl.this.lnr, "load_vast_icon_fail", jSONObject);
                }
            });
        }
    }

    public mzz(Context context) {
        super(context);
        setOrientation(1);
        setVisibility(8);
        setBackgroundColor(-1);
    }

    private String getCnOrEnBtnText() {
        return this.jpc.ud.ygv() != 4 ? "View" : "Install";
    }

    private void mml() {
        this.wd = true;
        ljh ljhVar = this.jpc.ud;
        int iTaz = ljhVar.taz();
        if ((iTaz == 43 || iTaz == 44) && vu.ud(ljhVar)) {
            lnr();
        } else if (this.jpc.zlt == 1) {
            mo();
        } else {
            mzz();
        }
        if (this.ud == null) {
            this.ud = (TextView) this.jpc.ax.findViewById(520093705);
        }
        TextView textView = this.ud;
        if (textView != null) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.mzz.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    int width = ((ViewGroup) mzz.this.ud.getParent()).getWidth();
                    if (width > 0) {
                        mzz.this.ud.setMaxWidth((int) (width * 0.45f));
                    }
                }
            });
            if (!ljhVar.uj()) {
                this.ud.setText(ljhVar.gg() == 3 ? getButtonTextForNewStyleBar() : ljhVar.uvi());
            } else if (ljhVar.aoy() != null && TextUtils.isEmpty(ljhVar.aoy().mo())) {
                ax.qdl((View) this.ud, 8);
            }
        }
        if (this.mml != null && ljhVar.hcs() != null && !TextUtils.isEmpty(ljhVar.hcs().qdl())) {
            String strQdl = ljhVar.hcs().qdl();
            if (ljhVar.uj()) {
                com.bytedance.sdk.openadsdk.tvp.mml.qdl(ljhVar.hcs()).lnr(1).qdl(new com.bytedance.sdk.openadsdk.tvp.ud(ljhVar, ljhVar.hcs().qdl(), new qdl(this.mml, ljhVar, strQdl, this.jpc.mzz)));
                if (ljhVar.aoy() != null && ljhVar.aoy().ud() != null) {
                    ljhVar.aoy().ud().ud(0L);
                }
            } else {
                com.bytedance.sdk.openadsdk.jl.ud.ud().qdl(ljhVar.hcs(), this.mml, ljhVar);
            }
        }
        TextView textView2 = this.mzz;
        if (textView2 != null) {
            textView2.setText(ljhVar.gsv());
        }
        TextView textView3 = this.mo;
        if (textView3 != null) {
            textView3.setText(qdl(ljhVar));
        }
        if (this.lnr != null) {
            String strLjh = vu.ljh(this.jpc.ud);
            if (TextUtils.isEmpty(strLjh)) {
                strLjh = "Play now";
            }
            this.lnr.setText(strLjh);
            this.lnr.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.mzz.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (mzz.this.jpc != null) {
                        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl(mzz.this.jpc);
                    }
                }
            });
        }
        jtx jtxVar = this.qdl;
        if (jtxVar != null) {
            ax.qdl((TextView) null, jtxVar, ljhVar);
        }
        if (this.jpc.zlt == 2 && ljhVar.gg() == 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.ud.getLayoutParams();
            layoutParams.height = ax.ud(this.jpc.om, 55.0f);
            layoutParams.topMargin = ax.ud(this.jpc.om, 20.0f);
            this.ud.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams2.bottomMargin = ax.ud(this.jpc.om, 12.0f);
            setLayoutParams(layoutParams2);
        }
        ud();
    }

    private void mo() {
        Context context = getContext();
        setPadding(ax.ud(context, 16.0f), ax.ud(context, 16.0f), ax.ud(context, 16.0f), ax.ud(context, 24.0f));
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar.setOrientation(0);
        mzzVar.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = ax.ud(context, 12.0f);
        addView(mzzVar, layoutParams);
        yt ytVar = new yt(context);
        this.mml = ytVar;
        ytVar.setBackgroundColor(0);
        this.mml.setId(com.bytedance.sdk.openadsdk.utils.jtx.ud);
        mzzVar.addView(this.mml, new LinearLayout.LayoutParams(ax.ud(context, 48.0f), ax.ud(context, 48.0f)));
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar2 = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = ax.ud(context, 12.0f);
        mzzVar.addView(mzzVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        this.mzz = jpcVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        jpcVar.setEllipsize(truncateAt);
        this.mzz.setGravity(16);
        this.mzz.setSingleLine(true);
        this.mzz.setTextSize(2, 17.0f);
        this.mzz.setId(com.bytedance.sdk.openadsdk.utils.jtx.lnr);
        this.mzz.setTextColor(-16777216);
        mzzVar2.addView(this.mzz, new LinearLayout.LayoutParams(-1, -2));
        jtx jtxVar = new jtx(context);
        this.qdl = jtxVar;
        jtxVar.setId(com.bytedance.sdk.openadsdk.utils.jtx.mzz);
        mzzVar2.addView(this.qdl, new LinearLayout.LayoutParams(-2, ax.ud(context, 14.0f)));
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar2 = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        this.ud = jpcVar2;
        jpcVar2.setGravity(17);
        this.ud.setEllipsize(truncateAt);
        this.ud.setSingleLine(true);
        this.ud.setTextColor(-1);
        this.ud.setTextSize(2, 16.0f);
        this.ud.setId(520093705);
        this.ud.setBackground(qdl(context));
        this.ud.setText(this.jpc.ud.uvi());
        addView(this.ud, new LinearLayout.LayoutParams(-1, ax.ud(context, 36.0f)));
    }

    private void mzz() {
        setOrientation(0);
        setGravity(16);
        Context context = getContext();
        setPadding(ax.ud(context, 16.0f), ax.ud(context, 12.0f), ax.ud(context, 16.0f), ax.ud(context, 12.0f));
        yt ytVar = new yt(context);
        this.mml = ytVar;
        ytVar.setBackgroundColor(0);
        this.mml.setId(com.bytedance.sdk.openadsdk.utils.jtx.ud);
        addView(this.mml, new LinearLayout.LayoutParams(ax.ud(context, 48.0f), ax.ud(context, 48.0f)));
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.leftMargin = ax.ud(context, 12.0f);
        layoutParams.weight = 1.0f;
        addView(mzzVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        this.mzz = jpcVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        jpcVar.setEllipsize(truncateAt);
        this.mzz.setGravity(16);
        this.mzz.setSingleLine(true);
        this.mzz.setTextSize(2, 17.0f);
        this.mzz.setId(com.bytedance.sdk.openadsdk.utils.jtx.lnr);
        this.mzz.setTextColor(-16777216);
        mzzVar.addView(this.mzz, new LinearLayout.LayoutParams(-1, -2));
        jtx jtxVar = new jtx(context);
        this.qdl = jtxVar;
        jtxVar.setId(com.bytedance.sdk.openadsdk.utils.jtx.mzz);
        mzzVar.addView(this.qdl, new LinearLayout.LayoutParams(-2, ax.ud(context, 14.0f)));
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar2 = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        this.ud = jpcVar2;
        jpcVar2.setGravity(17);
        this.ud.setEllipsize(truncateAt);
        this.ud.setSingleLine(true);
        this.ud.setTextColor(-1);
        this.ud.setTextSize(2, 16.0f);
        this.ud.setId(520093705);
        this.ud.setBackground(qdl(context));
        this.ud.setText(this.jpc.ud.uvi());
        addView(this.ud, new LinearLayout.LayoutParams(ax.ud(context, 164.0f), ax.ud(context, 36.0f)));
    }

    public String getButtonTextForNewStyleBar() {
        boolean zEquals;
        String strUvi;
        String strLnr = gy.lnr(this.jpc.om);
        if (strLnr == null) {
            strLnr = "";
        }
        try {
            zEquals = strLnr.equals(Locale.ENGLISH.getLanguage());
        } catch (Throwable unused) {
            zEquals = false;
        }
        if (TextUtils.isEmpty(this.jpc.ud.uvi())) {
            strUvi = this.jpc.ud.ygv() != 4 ? "View" : "Install";
        } else {
            strUvi = this.jpc.ud.uvi();
            if (strUvi == null || !gy.mo(strUvi) || strUvi.length() <= 2) {
                if (strUvi != null && !gy.mo(strUvi) && strUvi.length() > 7 && zEquals) {
                    strUvi = getCnOrEnBtnText();
                }
            } else if (zEquals) {
                strUvi = getCnOrEnBtnText();
            }
        }
        if (zEquals && !gy.mo(strUvi)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.ud.getLayoutParams();
            layoutParams.bottomMargin = ax.ud(this.jpc.om, 4.0f);
            this.ud.setLayoutParams(layoutParams);
        }
        return strUvi;
    }

    public void lnr() {
        Context context = getContext();
        int iUd = ax.ud(context, 12.0f);
        setPadding(iUd, iUd, iUd, iUd);
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        mzzVar.setOrientation(0);
        mzzVar.setGravity(16);
        addView(mzzVar, layoutParams);
        yt ytVar = new yt(context);
        this.mml = ytVar;
        ytVar.setBackgroundColor(0);
        this.mml.setId(com.bytedance.sdk.openadsdk.utils.jtx.ud);
        mzzVar.addView(this.mml, new LinearLayout.LayoutParams(ax.ud(context, 54.0f), ax.ud(context, 54.0f)));
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar2 = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = ax.ud(context, 12.0f);
        mzzVar.addView(mzzVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        this.mzz = jpcVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        jpcVar.setEllipsize(truncateAt);
        this.mzz.setGravity(16);
        this.mzz.setSingleLine(true);
        this.mzz.setTextSize(2, 17.0f);
        this.mzz.setId(com.bytedance.sdk.openadsdk.utils.jtx.lnr);
        this.mzz.setTextColor(-16777216);
        mzzVar2.addView(this.mzz, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar2 = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        this.mo = jpcVar2;
        jpcVar2.setTextColor(-16777216);
        this.mo.setTextSize(2, 13.0f);
        this.mo.setMaxLines(2);
        this.mo.setAlpha(0.8f);
        this.mo.setEllipsize(truncateAt);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = ax.ud(context, 4.0f);
        mzzVar2.addView(this.mo, layoutParams3);
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar3 = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = ax.ud(context, 12.0f);
        mzzVar3.setOrientation(0);
        addView(mzzVar3, layoutParams4);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar3 = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        this.lnr = jpcVar3;
        jpcVar3.setGravity(17);
        this.lnr.setEllipsize(truncateAt);
        this.lnr.setSingleLine(true);
        this.lnr.setTextColor(-16777216);
        this.lnr.setTextSize(2, 16.0f);
        this.lnr.setBackground(ud(context));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, ax.ud(context, 36.0f), 1.0f);
        layoutParams5.rightMargin = ax.ud(context, 3.0f);
        mzzVar3.addView(this.lnr, layoutParams5);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar4 = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        this.ud = jpcVar4;
        jpcVar4.setGravity(17);
        this.ud.setEllipsize(truncateAt);
        this.ud.setSingleLine(true);
        this.ud.setTextColor(-1);
        this.ud.setTextSize(2, 16.0f);
        this.ud.setId(520093705);
        this.ud.setBackground(lnr(context));
        this.ud.setText(this.jpc.ud.uvi());
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, ax.ud(context, 36.0f), 1.0f);
        layoutParams6.leftMargin = ax.ud(context, 3.0f);
        mzzVar3.addView(this.ud, layoutParams6);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        if (i2 != 0 || this.wd) {
            return;
        }
        mml();
    }

    private String qdl(ljh ljhVar) {
        if (TextUtils.isEmpty(ljhVar.gsv())) {
            return !TextUtils.isEmpty(ljhVar.hvi()) ? ljhVar.hvi() : "";
        }
        return ljhVar.gsv();
    }

    public void ud() {
        com.bytedance.sdk.openadsdk.core.lnr.mzz mzzVarMzz = this.jpc.vu.mzz();
        final com.bytedance.sdk.openadsdk.core.lnr.ud udVarMml = this.jpc.vu.mml();
        final ljh ljhVar = this.jpc.ud;
        if (ljhVar.rzg() == null) {
            return;
        }
        if (ljhVar.gg() != 5 && this.ud != null) {
            if (ljhVar.rzg().mzz) {
                this.ud.setOnClickListener(mzzVarMzz);
                this.ud.setOnTouchListener(mzzVarMzz);
            } else {
                this.ud.setOnClickListener(udVarMml);
            }
        }
        if (ljhVar.gg() == 1) {
            if (!ljhVar.rzg().qdl) {
                ax.qdl((View) this, (View.OnClickListener) udVarMml, "TTBaseVideoActivity#mRlDownloadBar");
                this.mzz.setOnClickListener(udVarMml);
                this.qdl.setOnClickListener(udVarMml);
                this.mml.setOnClickListener(udVarMml);
                return;
            }
            ax.qdl((View) this, (View.OnClickListener) mzzVarMzz, "TTBaseVideoActivity#mRlDownloadBar");
            ax.qdl((View) this, (View.OnTouchListener) mzzVarMzz, "TTBaseVideoActivity#mRlDownloadBar");
            this.mzz.setOnClickListener(mzzVarMzz);
            this.mzz.setOnTouchListener(mzzVarMzz);
            this.qdl.setOnClickListener(mzzVarMzz);
            this.qdl.setOnTouchListener(mzzVarMzz);
            this.mml.setOnClickListener(mzzVarMzz);
            this.mml.setOnTouchListener(mzzVarMzz);
            return;
        }
        if (ljhVar.gg() != 5) {
            if (!ljhVar.rzg().lnr) {
                ax.qdl((View) this, (View.OnClickListener) udVarMml, "TTBaseVideoActivity#mRlDownloadBar");
                return;
            } else {
                ax.qdl((View) this, (View.OnClickListener) mzzVarMzz, "TTBaseVideoActivity#mRlDownloadBar");
                ax.qdl((View) this, (View.OnTouchListener) mzzVarMzz, "TTBaseVideoActivity#mRlDownloadBar");
                return;
            }
        }
        String str = "VAST_ICON";
        if (!ljhVar.rzg().mzz) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.mzz.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    View.OnClickListener onClickListener2 = udVarMml;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(view);
                    }
                    if (view == null || !"VAST_ICON".equals(view.getTag(570425345))) {
                        if (ljhVar.aoy() != null) {
                            ljhVar.aoy().qdl().wd(mzz.this.jpc.bch.fs());
                        }
                    } else {
                        if (ljhVar.aoy() == null || ljhVar.aoy().ud() == null) {
                            return;
                        }
                        ljhVar.aoy().ud().qdl(mzz.this.jpc.bch.fs());
                    }
                }
            };
            TextView textView = this.ud;
            if (textView != null) {
                textView.setOnClickListener(onClickListener);
            }
            TextView textView2 = this.mzz;
            if (textView2 != null && !TextUtils.isEmpty(textView2.getText())) {
                this.mzz.setOnClickListener(onClickListener);
            }
            yt ytVar = this.mml;
            if (ytVar != null) {
                ytVar.setTag(570425345, "VAST_ICON");
                this.mml.setOnClickListener(udVarMml);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.lnr.wd wdVar = new com.bytedance.sdk.openadsdk.core.lnr.wd("VAST_ACTION_BUTTON", ljhVar.aoy(), mzzVarMzz) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.mzz.3
        };
        com.bytedance.sdk.openadsdk.core.lnr.wd wdVar2 = new com.bytedance.sdk.openadsdk.core.lnr.wd(str, ljhVar.aoy(), mzzVarMzz) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.mzz.4
        };
        TextView textView3 = this.ud;
        if (textView3 != null) {
            textView3.setOnClickListener(wdVar);
            this.ud.setOnTouchListener(wdVar);
        }
        yt ytVar2 = this.mml;
        if (ytVar2 != null) {
            ytVar2.setOnClickListener(wdVar2);
            this.mml.setOnTouchListener(wdVar2);
        }
        TextView textView4 = this.mzz;
        if (textView4 == null || TextUtils.isEmpty(textView4.getText())) {
            return;
        }
        this.mzz.setOnClickListener(wdVar);
        this.mzz.setOnTouchListener(wdVar);
    }

    public void qdl() {
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

    public void qdl(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        this.jpc = qdlVar;
        if (qdlVar.ud.gg() == 1) {
            mml();
        }
    }

    private static Drawable qdl(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#1A73E8"));
        gradientDrawable.setCornerRadius(ax.ud(context, 18.0f));
        return gradientDrawable;
    }

    private static Drawable ud(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#000000"));
        gradientDrawable.setAlpha(30);
        gradientDrawable.setCornerRadius(ax.ud(context, 8.0f));
        return gradientDrawable;
    }

    private static Drawable lnr(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#FE2C55"));
        gradientDrawable.setCornerRadius(ax.ud(context, 8.0f));
        return gradientDrawable;
    }
}
