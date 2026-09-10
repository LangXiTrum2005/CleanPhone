package com.bytedance.adsdk.LD.lk.lk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.adsdk.LD.DY;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class lk extends ZU {
    private final List<TextView> JVA;
    private LinearLayout OY;
    private final LinearLayout.LayoutParams QAg;
    private final List<String> nBu;
    private String sLN;

    public lk(com.bytedance.adsdk.LD.QAg qAg, JXs jXs, Context context) {
        List<com.bytedance.adsdk.LD.nBu.Lxb> listLk;
        super(qAg, jXs);
        this.QAg = new LinearLayout.LayoutParams(-2, -2);
        this.nBu = new ArrayList();
        this.JVA = new ArrayList();
        com.bytedance.adsdk.LD.nBu nbu = ((ZU) this).ebl;
        if (nbu == null || (listLk = nbu.lk()) == null || listLk.size() <= 0) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.OY = linearLayout;
        int i = 0;
        linearLayout.setOrientation(0);
        LD(listLk.get(0).ebl);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(80);
        this.OY.addView(linearLayout2);
        List<String> listSLN = sLN();
        while (i < listLk.size()) {
            com.bytedance.adsdk.LD.nBu.Lxb lxb = listLk.get(i);
            TextView textView = new TextView(context);
            Lxb(textView, lxb, (listSLN == null || i >= listSLN.size()) ? "" : listSLN.get(i));
            int i2 = lxb.lc;
            if (i2 != 0) {
                this.QAg.bottomMargin = (int) (com.bytedance.adsdk.LD.lc.lc.Lxb() * i2);
                linearLayout2.addView(textView, this.QAg);
            } else {
                linearLayout2.addView(textView);
            }
            i++;
        }
        float fLxb = com.bytedance.adsdk.LD.lc.lc.Lxb();
        Lxb(this.OY, (int) (((ZU) this).ebl.Lxb() * fLxb), (int) (((ZU) this).ebl.LD() * fLxb));
    }

    private void LD(String str) {
        if (TextUtils.isEmpty(str)) {
            this.OY.setGravity(17);
            return;
        }
        str.getClass();
        if (str.equals(TtmlNode.LEFT)) {
            this.OY.setGravity(3);
        } else if (str.equals(TtmlNode.RIGHT)) {
            this.OY.setGravity(5);
        } else {
            this.OY.setGravity(17);
        }
    }

    private void Lxb(TextView textView, com.bytedance.adsdk.LD.nBu.Lxb lxb, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setText("");
        } else {
            textView.setText(str);
        }
        if (!TextUtils.isEmpty(lxb.lk)) {
            textView.setTextColor(Color.parseColor(lxb.lk));
        }
        if (!TextUtils.isEmpty(lxb.ZU)) {
            textView.setBackgroundColor(Color.parseColor(lxb.ZU));
        }
        textView.setGravity(17);
        textView.setTextSize(lxb.JXs);
    }

    private void lk(float f) {
        List<com.bytedance.adsdk.LD.nBu.Lxb> listLk;
        com.bytedance.adsdk.LD.nBu nbu = ((ZU) this).ebl;
        if (nbu == null || (listLk = nbu.lk()) == null || listLk.size() <= 0) {
            return;
        }
        this.OY.setOrientation(0);
        this.OY.setGravity(17);
        if (this.OY.getChildCount() <= 0) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) this.OY.getChildAt(0);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(80);
        this.OY.removeAllViews();
        if (linearLayout.getChildCount() != listLk.size()) {
            return;
        }
        List<String> listSLN = sLN();
        this.JVA.clear();
        int i = 0;
        while (i < listLk.size()) {
            com.bytedance.adsdk.LD.nBu.Lxb lxb = listLk.get(i);
            TextView textView = (TextView) linearLayout.getChildAt(i);
            this.JVA.add(textView);
            Lxb(textView, lxb, (listSLN == null || i >= listSLN.size()) ? "" : listSLN.get(i));
            i++;
        }
        linearLayout.removeAllViews();
        for (int i2 = 0; i2 < listLk.size(); i2++) {
            com.bytedance.adsdk.LD.nBu.Lxb lxb2 = listLk.get(i2);
            TextView textView2 = this.JVA.get(i2);
            textView2.setAlpha(f);
            linearLayout.setAlpha(f);
            int i3 = lxb2.lc;
            if (i3 != 0) {
                this.QAg.bottomMargin = (int) (com.bytedance.adsdk.LD.lc.lc.Lxb() * i3);
                linearLayout.addView(textView2, this.QAg);
            } else {
                linearLayout.addView(textView2);
            }
        }
        this.OY.setAlpha(f);
        this.OY.addView(linearLayout);
        float fLxb = com.bytedance.adsdk.LD.lc.lc.Lxb();
        Lxb(this.OY, (int) (((ZU) this).ebl.Lxb() * fLxb), (int) (((ZU) this).ebl.LD() * fLxb));
    }

    private List<String> sLN() {
        com.bytedance.adsdk.LD.QAg qAg;
        DY dyAH;
        List<com.bytedance.adsdk.LD.nBu.Lxb> listLk;
        if (((ZU) this).ebl == null || (qAg = this.LD) == null || (dyAH = qAg.aH()) == null) {
            return null;
        }
        String strZU = ((ZU) this).ebl.ZU();
        if ((!TextUtils.isEmpty(strZU) || !TextUtils.isEmpty(this.sLN)) && (listLk = ((ZU) this).ebl.lk()) != null) {
            String strLxb = this.sLN;
            if (TextUtils.isEmpty(strLxb)) {
                strLxb = dyAH.Lxb(strZU);
            }
            if (!TextUtils.isEmpty(strLxb)) {
                int length = strLxb.length();
                this.nBu.clear();
                for (int i = 0; i < listLk.size(); i++) {
                    com.bytedance.adsdk.LD.nBu.Lxb lxb = listLk.get(i);
                    int iMax = lxb.Lxb;
                    int iMax2 = lxb.LD;
                    if (iMax < 0) {
                        iMax = Math.max(iMax + length, 0);
                    }
                    if (iMax2 < 0) {
                        iMax2 = Math.max(iMax2 + length, 0);
                    }
                    if (iMax + iMax2 > length) {
                        this.nBu.add("");
                    } else {
                        if (listLk.size() == 1 && iMax == 0 && iMax2 == 0) {
                            iMax2 = length;
                        }
                        this.nBu.add(strLxb.substring(iMax, iMax2 + iMax));
                    }
                }
                return this.nBu;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.LD.lk.lk.ZU, com.bytedance.adsdk.LD.lk.lk.Lxb
    public void LD(Canvas canvas, Matrix matrix, int i) {
        if (this.OY != null) {
            canvas.save();
            canvas.concat(matrix);
            Lxb(i);
            lk(lc());
            this.OY.draw(canvas);
            canvas.restore();
            return;
        }
        super.LD(canvas, matrix, i);
    }

    private static void Lxb(View view, int i, int i2) {
        view.layout(0, 0, i, i2);
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void Lxb(String str) {
        this.sLN = str;
    }
}
