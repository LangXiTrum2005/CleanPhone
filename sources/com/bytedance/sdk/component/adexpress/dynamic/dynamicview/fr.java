package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class fr extends di {
    public fr(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        super(context, dynamicRootView, mjVar);
        this.mj += 6;
        if (this.f18035co.qd()) {
            com.bytedance.sdk.component.adexpress.di.ri riVar = new com.bytedance.sdk.component.adexpress.di.ri(context, this.f18035co.xha(), this.f18035co.fi(), 1, this.f18035co.mj());
            this.vr = riVar;
            riVar.setMaxLines(1);
        } else {
            TextView textView = new TextView(context);
            this.vr = textView;
            textView.setIncludeFontPadding(false);
        }
        this.vr.setTag(Integer.valueOf(getClickArea()));
        addView(this.vr, getWidgetLayoutParams());
    }

    private void qt() {
        int iRi;
        if (TextUtils.equals(this.aw.qt().lr(), "source") || TextUtils.equals(this.aw.qt().lr(), "title") || TextUtils.equals(this.aw.qt().lr(), "text_star")) {
            int[] iArrLr = com.bytedance.sdk.component.adexpress.dynamic.fi.sf.lr(this.f18035co.di(), this.f18035co.fi(), true);
            int iRi2 = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(getContext(), this.f18035co.lr());
            int iRi3 = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(getContext(), this.f18035co.ik());
            int iRi4 = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(getContext(), this.f18035co.ka());
            int iRi5 = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(getContext(), this.f18035co.ri());
            int iMin = Math.min(iRi2, iRi5);
            if (TextUtils.equals(this.aw.qt().lr(), "source") && (iRi = ((this.mj - ((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(getContext(), this.f18035co.fi()))) - iRi2) - iRi5) > 1 && iRi <= iMin * 2) {
                int i = iRi / 2;
                this.vr.setPadding(iRi3, iRi2 - i, iRi4, iRi5 - (iRi - i));
                return;
            }
            int i2 = (((iArrLr[1] + iRi2) + iRi5) - this.mj) - 2;
            if (i2 <= 1) {
                return;
            }
            if (i2 <= iMin * 2) {
                int i3 = i2 / 2;
                this.vr.setPadding(iRi3, iRi2 - i3, iRi4, iRi5 - (i2 - i3));
            } else if (i2 > iRi2 + iRi5) {
                final int i4 = (i2 - iRi2) - iRi5;
                this.vr.setPadding(iRi3, 0, iRi4, 0);
                if (i4 <= ((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(getContext(), 1.0f)) + 1) {
                    ((TextView) this.vr).setTextSize(this.f18035co.fi() - 1.0f);
                } else if (i4 <= (((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(getContext(), 1.0f)) + 1) * 2) {
                    ((TextView) this.vr).setTextSize(this.f18035co.fi() - 2.0f);
                } else {
                    post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fr.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                ViewGroup.LayoutParams layoutParams = fr.this.vr.getLayoutParams();
                                fr frVar = fr.this;
                                layoutParams.height = frVar.mj + i4;
                                frVar.vr.setLayoutParams(layoutParams);
                                fr.this.vr.setTranslationY(-i4);
                                ((ViewGroup) fr.this.vr.getParent()).setClipChildren(false);
                                ((ViewGroup) fr.this.vr.getParent().getParent()).setClipChildren(false);
                            } catch (Throwable unused) {
                            }
                        }
                    });
                }
            } else if (iRi2 > iRi5) {
                this.vr.setPadding(iRi3, iRi2 - (i2 - iMin), iRi4, iRi5 - iMin);
            } else {
                this.vr.setPadding(iRi3, iRi2 - iMin, iRi4, iRi5 - (i2 - iMin));
            }
        }
        if (TextUtils.equals(this.aw.qt().lr(), "fillButton")) {
            this.vr.setTextAlignment(2);
            ((TextView) this.vr).setGravity(17);
        }
    }

    private boolean ri() {
        DynamicRootView dynamicRootView = this.bgr;
        return (dynamicRootView == null || dynamicRootView.getRenderRequest() == null || this.bgr.getRenderRequest().qt() == 4) ? false : true;
    }

    private void sf() {
        if (this.vr instanceof com.bytedance.sdk.component.adexpress.di.ri) {
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
            ((com.bytedance.sdk.component.adexpress.di.ri) this.vr).setMaxLines(1);
            ((com.bytedance.sdk.component.adexpress.di.ri) this.vr).setTextColor(this.f18035co.xha());
            ((com.bytedance.sdk.component.adexpress.di.ri) this.vr).setTextSize(this.f18035co.fi());
            ((com.bytedance.sdk.component.adexpress.di.ri) this.vr).setAnimationText(arrayList);
            ((com.bytedance.sdk.component.adexpress.di.ri) this.vr).setAnimationType(this.f18035co.jc());
            ((com.bytedance.sdk.component.adexpress.di.ri) this.vr).setAnimationDuration(this.f18035co.srn() * 1000);
            ((com.bytedance.sdk.component.adexpress.di.ri) this.vr).ri();
        }
    }

    public String getText() {
        String strDi = this.f18035co.di();
        if (TextUtils.isEmpty(strDi)) {
            if (!com.bytedance.sdk.component.adexpress.ka.lr() && TextUtils.equals(this.aw.qt().lr(), "text_star")) {
                strDi = CampaignEx.CLICKMODE_ON;
            }
            if (!com.bytedance.sdk.component.adexpress.ka.lr() && TextUtils.equals(this.aw.qt().lr(), "score-count")) {
                strDi = "6870";
            }
        }
        return (TextUtils.equals(this.aw.qt().lr(), "title") || TextUtils.equals(this.aw.qt().lr(), "subtitle")) ? strDi.replace("\n", "") : strDi;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xd
    public boolean jbs() {
        int i;
        double d;
        super.jbs();
        if (TextUtils.isEmpty(getText())) {
            this.vr.setVisibility(4);
            return true;
        }
        if (this.f18035co.qd()) {
            sf();
            return true;
        }
        ((TextView) this.vr).setText(this.f18035co.di());
        ((TextView) this.vr).setTextDirection(5);
        this.vr.setTextAlignment(this.f18035co.mj());
        ((TextView) this.vr).setTextColor(this.f18035co.xha());
        ((TextView) this.vr).setTextSize(this.f18035co.fi());
        if (this.f18035co.uq()) {
            int iWjv = this.f18035co.wjv();
            if (iWjv > 0) {
                ((TextView) this.vr).setLines(iWjv);
                ((TextView) this.vr).setEllipsize(TextUtils.TruncateAt.END);
            }
        } else {
            ((TextView) this.vr).setMaxLines(1);
            ((TextView) this.vr).setGravity(17);
            ((TextView) this.vr).setEllipsize(TextUtils.TruncateAt.END);
        }
        com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar = this.aw;
        if (mjVar != null && mjVar.qt() != null) {
            if (com.bytedance.sdk.component.adexpress.ka.lr() && ri() && (TextUtils.equals(this.aw.qt().lr(), "text_star") || TextUtils.equals(this.aw.qt().lr(), "score-count") || TextUtils.equals(this.aw.qt().lr(), "score-count-type-1") || TextUtils.equals(this.aw.qt().lr(), "score-count-type-2"))) {
                setVisibility(8);
                return true;
            }
            if (TextUtils.equals(this.aw.qt().lr(), "score-count") || TextUtils.equals(this.aw.qt().lr(), "score-count-type-2")) {
                try {
                    try {
                        i = Integer.parseInt(getText());
                    } catch (Exception unused) {
                    }
                } catch (NumberFormatException unused2) {
                    i = -1;
                }
                if (i < 0) {
                    if (com.bytedance.sdk.component.adexpress.ka.lr()) {
                        setVisibility(8);
                        return true;
                    }
                    this.vr.setVisibility(0);
                }
                if (TextUtils.equals(this.aw.qt().lr(), "score-count-type-2")) {
                    ((TextView) this.vr).setText(String.format(new DecimalFormat("(###,###,###)").format(i), Integer.valueOf(i)));
                    ((TextView) this.vr).setGravity(17);
                    return true;
                }
                ri((TextView) this.vr, i, getContext(), "tt_comment_num");
            } else if (TextUtils.equals(this.aw.qt().lr(), "text_star")) {
                try {
                    d = Double.parseDouble(getText());
                } catch (Exception unused3) {
                    d = -1.0d;
                }
                if (d < 0.0d || d > 5.0d) {
                    if (com.bytedance.sdk.component.adexpress.ka.lr()) {
                        setVisibility(8);
                        return true;
                    }
                    this.vr.setVisibility(0);
                }
                ((TextView) this.vr).setIncludeFontPadding(false);
                ((TextView) this.vr).setText(String.format("%.1f", Double.valueOf(d)));
            } else if (TextUtils.equals("privacy-detail", this.aw.qt().lr())) {
                ((TextView) this.vr).setText("Permission list | Privacy policy");
            } else if (TextUtils.equals(this.aw.qt().lr(), "development-name")) {
                ((TextView) this.vr).setText(com.bytedance.sdk.component.utils.uq.ri(com.bytedance.sdk.component.adexpress.ka.ri(), "tt_text_privacy_development") + getText());
            } else if (TextUtils.equals(this.aw.qt().lr(), "app-version")) {
                ((TextView) this.vr).setText(com.bytedance.sdk.component.utils.uq.ri(com.bytedance.sdk.component.adexpress.ka.ri(), "tt_text_privacy_app_version") + getText());
            } else {
                ((TextView) this.vr).setText(getText());
            }
            this.vr.setTextAlignment(this.f18035co.mj());
            ((TextView) this.vr).setGravity(this.f18035co.jbs());
            if (com.bytedance.sdk.component.adexpress.ka.lr()) {
                qt();
            }
        }
        return true;
    }

    public void ri(TextView textView, int i, Context context, String str) {
        textView.setText("(" + String.format(com.bytedance.sdk.component.utils.uq.ri(context, str), Integer.valueOf(i)) + ")");
        if (i == -1) {
            textView.setVisibility(8);
        }
    }
}
