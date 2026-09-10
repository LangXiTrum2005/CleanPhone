package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.applovin.impl.Z;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class uw extends mo {
    public uw(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        super(context, dynamicRootView, jpcVar);
        this.jpc += 6;
        if (this.fs.gy()) {
            com.bytedance.sdk.component.adexpress.mo.qdl qdlVar = new com.bytedance.sdk.component.adexpress.mo.qdl(context, this.fs.wd(), this.fs.mzz(), 1, this.fs.jpc());
            this.bjy = qdlVar;
            qdlVar.setMaxLines(1);
        } else {
            TextView textView = new TextView(context);
            this.bjy = textView;
            textView.setIncludeFontPadding(false);
        }
        this.bjy.setTag(Integer.valueOf(getClickArea()));
        addView(this.bjy, getWidgetLayoutParams());
    }

    private boolean qdl() {
        DynamicRootView dynamicRootView = this.rdp;
        return (dynamicRootView == null || dynamicRootView.getRenderRequest() == null || this.rdp.getRenderRequest().to() == 4) ? false : true;
    }

    private void rq() {
        if (this.bjy instanceof com.bytedance.sdk.component.adexpress.mo.qdl) {
            String text = getText();
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(text);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    arrayList.add(jSONArray.optString(i2));
                }
            } catch (JSONException unused) {
                arrayList.add(text);
            }
            ((com.bytedance.sdk.component.adexpress.mo.qdl) this.bjy).setMaxLines(1);
            ((com.bytedance.sdk.component.adexpress.mo.qdl) this.bjy).setTextColor(this.fs.wd());
            ((com.bytedance.sdk.component.adexpress.mo.qdl) this.bjy).setTextSize(this.fs.mzz());
            ((com.bytedance.sdk.component.adexpress.mo.qdl) this.bjy).setAnimationText(arrayList);
            ((com.bytedance.sdk.component.adexpress.mo.qdl) this.bjy).setAnimationType(this.fs.ag());
            ((com.bytedance.sdk.component.adexpress.mo.qdl) this.bjy).setAnimationDuration(this.fs.ax() * 1000);
            ((com.bytedance.sdk.component.adexpress.mo.qdl) this.bjy).qdl();
        }
    }

    private void to() {
        int iQdl;
        if (Z.y(this.exu, "source") || Z.y(this.exu, "title") || Z.y(this.exu, "text_star")) {
            int[] iArrUd = com.bytedance.sdk.component.adexpress.dynamic.mzz.rq.ud(this.fs.mo(), this.fs.mzz(), true);
            int iQdl2 = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), this.fs.ud());
            int iQdl3 = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), this.fs.lnr());
            int iQdl4 = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), this.fs.mml());
            int iQdl5 = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), this.fs.qdl());
            int iMin = Math.min(iQdl2, iQdl5);
            if (Z.y(this.exu, "source") && (iQdl = ((this.jpc - ((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), this.fs.mzz()))) - iQdl2) - iQdl5) > 1 && iQdl <= iMin * 2) {
                int i2 = iQdl / 2;
                this.bjy.setPadding(iQdl3, iQdl2 - i2, iQdl4, iQdl5 - (iQdl - i2));
                return;
            }
            int i3 = (((iArrUd[1] + iQdl2) + iQdl5) - this.jpc) - 2;
            if (i3 <= 1) {
                return;
            }
            if (i3 <= iMin * 2) {
                int i4 = i3 / 2;
                this.bjy.setPadding(iQdl3, iQdl2 - i4, iQdl4, iQdl5 - (i3 - i4));
            } else if (i3 > iQdl2 + iQdl5) {
                final int i5 = (i3 - iQdl2) - iQdl5;
                this.bjy.setPadding(iQdl3, 0, iQdl4, 0);
                if (i5 <= ((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), 1.0f)) + 1) {
                    ((TextView) this.bjy).setTextSize(this.fs.mzz() - 1.0f);
                } else if (i5 <= (((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), 1.0f)) + 1) * 2) {
                    ((TextView) this.bjy).setTextSize(this.fs.mzz() - 2.0f);
                } else {
                    post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.uw.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                ViewGroup.LayoutParams layoutParams = uw.this.bjy.getLayoutParams();
                                uw uwVar = uw.this;
                                layoutParams.height = uwVar.jpc + i5;
                                uwVar.bjy.setLayoutParams(layoutParams);
                                uw.this.bjy.setTranslationY(-i5);
                                ((ViewGroup) uw.this.bjy.getParent()).setClipChildren(false);
                                ((ViewGroup) uw.this.bjy.getParent().getParent()).setClipChildren(false);
                            } catch (Throwable unused) {
                            }
                        }
                    });
                }
            } else if (iQdl2 > iQdl5) {
                this.bjy.setPadding(iQdl3, iQdl2 - (i3 - iMin), iQdl4, iQdl5 - iMin);
            } else {
                this.bjy.setPadding(iQdl3, iQdl2 - iMin, iQdl4, iQdl5 - (i3 - iMin));
            }
        }
        if (Z.y(this.exu, "fillButton")) {
            this.bjy.setTextAlignment(2);
            ((TextView) this.bjy).setGravity(17);
        }
    }

    public String getText() {
        String strMo = this.fs.mo();
        if (TextUtils.isEmpty(strMo)) {
            if (!com.bytedance.sdk.component.adexpress.mml.ud() && Z.y(this.exu, "text_star")) {
                strMo = "5";
            }
            if (!com.bytedance.sdk.component.adexpress.mml.ud() && Z.y(this.exu, "score-count")) {
                strMo = "6870";
            }
        }
        return (Z.y(this.exu, "title") || Z.y(this.exu, "subtitle")) ? strMo.replace(IOUtils.LINE_SEPARATOR_UNIX, "") : strMo;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hkc
    public boolean tvp() {
        int i2;
        double d;
        super.tvp();
        if (TextUtils.isEmpty(getText())) {
            this.bjy.setVisibility(4);
            return true;
        }
        if (this.fs.gy()) {
            rq();
            return true;
        }
        ((TextView) this.bjy).setText(this.fs.mo());
        ((TextView) this.bjy).setTextDirection(5);
        this.bjy.setTextAlignment(this.fs.jpc());
        ((TextView) this.bjy).setTextColor(this.fs.wd());
        ((TextView) this.bjy).setTextSize(this.fs.mzz());
        if (this.fs.oth()) {
            int iLjh = this.fs.ljh();
            if (iLjh > 0) {
                ((TextView) this.bjy).setLines(iLjh);
                ((TextView) this.bjy).setEllipsize(TextUtils.TruncateAt.END);
            }
        } else {
            ((TextView) this.bjy).setMaxLines(1);
            ((TextView) this.bjy).setGravity(17);
            ((TextView) this.bjy).setEllipsize(TextUtils.TruncateAt.END);
        }
        com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar = this.exu;
        if (jpcVar != null && jpcVar.to() != null) {
            if (com.bytedance.sdk.component.adexpress.mml.ud() && qdl() && (Z.y(this.exu, "text_star") || Z.y(this.exu, "score-count") || Z.y(this.exu, "score-count-type-1") || Z.y(this.exu, "score-count-type-2"))) {
                setVisibility(8);
                return true;
            }
            if (Z.y(this.exu, "score-count") || Z.y(this.exu, "score-count-type-2")) {
                try {
                    try {
                        i2 = Integer.parseInt(getText());
                    } catch (Exception unused) {
                    }
                } catch (NumberFormatException unused2) {
                    i2 = -1;
                }
                if (i2 < 0) {
                    if (com.bytedance.sdk.component.adexpress.mml.ud()) {
                        setVisibility(8);
                        return true;
                    }
                    this.bjy.setVisibility(0);
                }
                if (TextUtils.equals(this.exu.to().ud(), "score-count-type-2")) {
                    ((TextView) this.bjy).setText(String.format(new DecimalFormat("(###,###,###)").format(i2), Integer.valueOf(i2)));
                    ((TextView) this.bjy).setGravity(17);
                    return true;
                }
                qdl((TextView) this.bjy, i2, getContext(), "tt_comment_num");
            } else if (Z.y(this.exu, "text_star")) {
                try {
                    d = Double.parseDouble(getText());
                } catch (Exception unused3) {
                    d = -1.0d;
                }
                if (d < 0.0d || d > 5.0d) {
                    if (com.bytedance.sdk.component.adexpress.mml.ud()) {
                        setVisibility(8);
                        return true;
                    }
                    this.bjy.setVisibility(0);
                }
                ((TextView) this.bjy).setIncludeFontPadding(false);
                ((TextView) this.bjy).setText(String.format("%.1f", Double.valueOf(d)));
            } else if (TextUtils.equals("privacy-detail", this.exu.to().ud())) {
                ((TextView) this.bjy).setText("Permission list | Privacy policy");
            } else if (Z.y(this.exu, "development-name")) {
                ((TextView) this.bjy).setText(com.bytedance.sdk.component.utils.ljh.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), "tt_text_privacy_development") + getText());
            } else if (Z.y(this.exu, "app-version")) {
                ((TextView) this.bjy).setText(com.bytedance.sdk.component.utils.ljh.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), "tt_text_privacy_app_version") + getText());
            } else {
                ((TextView) this.bjy).setText(getText());
            }
            this.bjy.setTextAlignment(this.fs.jpc());
            ((TextView) this.bjy).setGravity(this.fs.tvp());
            if (com.bytedance.sdk.component.adexpress.mml.ud()) {
                to();
            }
        }
        return true;
    }

    public void qdl(TextView textView, int i2, Context context, String str) {
        textView.setText("(" + String.format(com.bytedance.sdk.component.utils.ljh.qdl(context, str), Integer.valueOf(i2)) + ")");
        if (i2 == -1) {
            textView.setVisibility(8);
        }
    }
}
