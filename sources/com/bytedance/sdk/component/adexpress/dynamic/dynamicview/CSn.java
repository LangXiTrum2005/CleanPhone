package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class CSn extends lc {
    public CSn(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        super(context, dynamicRootView, oy);
        this.OY += 6;
        if (this.sLN.rW()) {
            com.bytedance.sdk.component.adexpress.lc.Lxb lxb = new com.bytedance.sdk.component.adexpress.lc.Lxb(context, this.sLN.ebl(), this.sLN.JXs(), 1, this.sLN.OY());
            this.IeN = lxb;
            lxb.setMaxLines(1);
        } else {
            TextView textView = new TextView(context);
            this.IeN = textView;
            textView.setIncludeFontPadding(false);
        }
        this.IeN.setTag(Integer.valueOf(getClickArea()));
        addView(this.IeN, getWidgetLayoutParams());
    }

    private void JVA() {
        if (this.IeN instanceof com.bytedance.sdk.component.adexpress.lc.Lxb) {
            String text = getText();
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(text);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.optString(i));
                }
            } catch (JSONException unused) {
                arrayList.add(text);
            }
            ((com.bytedance.sdk.component.adexpress.lc.Lxb) this.IeN).setMaxLines(1);
            ((com.bytedance.sdk.component.adexpress.lc.Lxb) this.IeN).setTextColor(this.sLN.ebl());
            ((com.bytedance.sdk.component.adexpress.lc.Lxb) this.IeN).setTextSize(this.sLN.JXs());
            ((com.bytedance.sdk.component.adexpress.lc.Lxb) this.IeN).setAnimationText(arrayList);
            ((com.bytedance.sdk.component.adexpress.lc.Lxb) this.IeN).setAnimationType(this.sLN.dR());
            ((com.bytedance.sdk.component.adexpress.lc.Lxb) this.IeN).setAnimationDuration(this.sLN.Pw() * 1000);
            ((com.bytedance.sdk.component.adexpress.lc.Lxb) this.IeN).Lxb();
        }
    }

    private boolean Lxb() {
        DynamicRootView dynamicRootView = this.STP;
        return (dynamicRootView == null || dynamicRootView.getRenderRequest() == null || this.STP.getRenderRequest().nBu() == 4) ? false : true;
    }

    private void nBu() {
        int iLxb;
        if (AbstractC5044xl.u(this.NXR, "source") || AbstractC5044xl.u(this.NXR, CampaignEx.JSON_KEY_TITLE) || AbstractC5044xl.u(this.NXR, "text_star")) {
            int[] iArrLD = com.bytedance.sdk.component.adexpress.dynamic.JXs.JVA.LD(this.sLN.lc(), this.sLN.JXs(), true);
            int iLxb2 = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(getContext(), this.sLN.LD());
            int iLxb3 = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(getContext(), this.sLN.lk());
            int iLxb4 = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(getContext(), this.sLN.ZU());
            int iLxb5 = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(getContext(), this.sLN.Lxb());
            int iMin = Math.min(iLxb2, iLxb5);
            if (AbstractC5044xl.u(this.NXR, "source") && (iLxb = ((this.OY - ((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(getContext(), this.sLN.JXs()))) - iLxb2) - iLxb5) > 1 && iLxb <= iMin * 2) {
                int i = iLxb / 2;
                this.IeN.setPadding(iLxb3, iLxb2 - i, iLxb4, iLxb5 - (iLxb - i));
                return;
            }
            int i2 = (((iArrLD[1] + iLxb2) + iLxb5) - this.OY) - 2;
            if (i2 <= 1) {
                return;
            }
            if (i2 <= iMin * 2) {
                int i3 = i2 / 2;
                this.IeN.setPadding(iLxb3, iLxb2 - i3, iLxb4, iLxb5 - (i2 - i3));
            } else if (i2 > iLxb2 + iLxb5) {
                final int i4 = (i2 - iLxb2) - iLxb5;
                this.IeN.setPadding(iLxb3, 0, iLxb4, 0);
                if (i4 <= ((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(getContext(), 1.0f)) + 1) {
                    ((TextView) this.IeN).setTextSize(this.sLN.JXs() - 1.0f);
                } else if (i4 <= (((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(getContext(), 1.0f)) + 1) * 2) {
                    ((TextView) this.IeN).setTextSize(this.sLN.JXs() - 2.0f);
                } else {
                    post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.CSn.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                ViewGroup.LayoutParams layoutParams = CSn.this.IeN.getLayoutParams();
                                CSn cSn = CSn.this;
                                layoutParams.height = cSn.OY + i4;
                                cSn.IeN.setLayoutParams(layoutParams);
                                CSn.this.IeN.setTranslationY(-i4);
                                ((ViewGroup) CSn.this.IeN.getParent()).setClipChildren(false);
                                ((ViewGroup) CSn.this.IeN.getParent().getParent()).setClipChildren(false);
                            } catch (Throwable unused) {
                            }
                        }
                    });
                }
            } else if (iLxb2 > iLxb5) {
                this.IeN.setPadding(iLxb3, iLxb2 - (i2 - iMin), iLxb4, iLxb5 - iMin);
            } else {
                this.IeN.setPadding(iLxb3, iLxb2 - iMin, iLxb4, iLxb5 - (i2 - iMin));
            }
        }
        if (AbstractC5044xl.u(this.NXR, "fillButton")) {
            this.IeN.setTextAlignment(2);
            ((TextView) this.IeN).setGravity(17);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.CG
    public boolean QAg() {
        int i;
        double d;
        super.QAg();
        if (TextUtils.isEmpty(getText())) {
            this.IeN.setVisibility(4);
            return true;
        }
        if (this.sLN.rW()) {
            JVA();
            return true;
        }
        ((TextView) this.IeN).setText(this.sLN.lc());
        ((TextView) this.IeN).setTextDirection(5);
        this.IeN.setTextAlignment(this.sLN.OY());
        ((TextView) this.IeN).setTextColor(this.sLN.ebl());
        ((TextView) this.IeN).setTextSize(this.sLN.JXs());
        if (this.sLN.HD()) {
            int iEK = this.sLN.eK();
            if (iEK > 0) {
                ((TextView) this.IeN).setLines(iEK);
                ((TextView) this.IeN).setEllipsize(TextUtils.TruncateAt.END);
            }
        } else {
            ((TextView) this.IeN).setMaxLines(1);
            ((TextView) this.IeN).setGravity(17);
            ((TextView) this.IeN).setEllipsize(TextUtils.TruncateAt.END);
        }
        com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy = this.NXR;
        if (oy != null && oy.nBu() != null) {
            if (com.bytedance.sdk.component.adexpress.ZU.LD() && Lxb() && (AbstractC5044xl.u(this.NXR, "text_star") || AbstractC5044xl.u(this.NXR, "score-count") || AbstractC5044xl.u(this.NXR, "score-count-type-1") || AbstractC5044xl.u(this.NXR, "score-count-type-2"))) {
                setVisibility(8);
                return true;
            }
            if (AbstractC5044xl.u(this.NXR, "score-count") || AbstractC5044xl.u(this.NXR, "score-count-type-2")) {
                try {
                    try {
                        i = Integer.parseInt(getText());
                    } catch (Exception unused) {
                    }
                } catch (NumberFormatException unused2) {
                    i = -1;
                }
                if (i < 0) {
                    if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
                        setVisibility(8);
                        return true;
                    }
                    this.IeN.setVisibility(0);
                }
                if (TextUtils.equals(this.NXR.nBu().LD(), "score-count-type-2")) {
                    ((TextView) this.IeN).setText(String.format(new DecimalFormat("(###,###,###)").format(i), Integer.valueOf(i)));
                    ((TextView) this.IeN).setGravity(17);
                    return true;
                }
                Lxb((TextView) this.IeN, i, getContext(), "tt_comment_num");
            } else if (AbstractC5044xl.u(this.NXR, "text_star")) {
                try {
                    d = Double.parseDouble(getText());
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("DynamicStarView applyNativeStyle", e.toString());
                    d = -1.0d;
                }
                if (d < 0.0d || d > 5.0d) {
                    if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
                        setVisibility(8);
                        return true;
                    }
                    this.IeN.setVisibility(0);
                }
                ((TextView) this.IeN).setIncludeFontPadding(false);
                ((TextView) this.IeN).setText(String.format("%.1f", Double.valueOf(d)));
            } else if (TextUtils.equals("privacy-detail", this.NXR.nBu().LD())) {
                ((TextView) this.IeN).setText("Permission list | Privacy policy");
            } else if (AbstractC5044xl.u(this.NXR, "development-name")) {
                ((TextView) this.IeN).setText(com.bytedance.sdk.component.utils.tD.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), "tt_text_privacy_development") + getText());
            } else if (AbstractC5044xl.u(this.NXR, "app-version")) {
                ((TextView) this.IeN).setText(com.bytedance.sdk.component.utils.tD.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), "tt_text_privacy_app_version") + getText());
            } else {
                ((TextView) this.IeN).setText(getText());
            }
            this.IeN.setTextAlignment(this.sLN.OY());
            ((TextView) this.IeN).setGravity(this.sLN.QAg());
            if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
                nBu();
            }
        }
        return true;
    }

    public String getText() {
        String strLc = this.sLN.lc();
        if (TextUtils.isEmpty(strLc)) {
            if (!com.bytedance.sdk.component.adexpress.ZU.LD() && AbstractC5044xl.u(this.NXR, "text_star")) {
                strLc = CampaignEx.CLICKMODE_ON;
            }
            if (!com.bytedance.sdk.component.adexpress.ZU.LD() && AbstractC5044xl.u(this.NXR, "score-count")) {
                strLc = "6870";
            }
        }
        return (AbstractC5044xl.u(this.NXR, CampaignEx.JSON_KEY_TITLE) || AbstractC5044xl.u(this.NXR, "subtitle")) ? strLc.replace("\n", "") : strLc;
    }

    public void Lxb(TextView textView, int i, Context context, String str) {
        textView.setText("(" + String.format(com.bytedance.sdk.component.utils.tD.Lxb(context, str), Integer.valueOf(i)) + ")");
        if (i == -1) {
            textView.setVisibility(8);
        }
    }
}
