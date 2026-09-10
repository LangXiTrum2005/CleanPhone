package com.bytedance.adsdk.lr.ik.ik;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.adsdk.lr.ac;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ik extends ka {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private String f17990co;
    private final LinearLayout.LayoutParams jbs;
    private LinearLayout mj;
    private final List<String> qt;
    private final List<TextView> sf;

    public ik(com.bytedance.adsdk.lr.jbs jbsVar, fi fiVar, Context context) {
        List<com.bytedance.adsdk.lr.qt.ri> listIk;
        super(jbsVar, fiVar);
        this.jbs = new LinearLayout.LayoutParams(-2, -2);
        this.qt = new ArrayList();
        this.sf = new ArrayList();
        com.bytedance.adsdk.lr.qt qtVar = ((ka) this).xha;
        if (qtVar == null || (listIk = qtVar.ik()) == null || listIk.size() <= 0) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.mj = linearLayout;
        int i = 0;
        linearLayout.setOrientation(0);
        lr(listIk.get(0).xha);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(80);
        this.mj.addView(linearLayout2);
        List<String> listCo = co();
        while (i < listIk.size()) {
            com.bytedance.adsdk.lr.qt.ri riVar = listIk.get(i);
            TextView textView = new TextView(context);
            ri(textView, riVar, (listCo == null || i >= listCo.size()) ? "" : listCo.get(i));
            int i2 = riVar.di;
            if (i2 != 0) {
                this.jbs.bottomMargin = (int) (i2 * com.bytedance.adsdk.lr.di.di.ri());
                linearLayout2.addView(textView, this.jbs);
            } else {
                linearLayout2.addView(textView);
            }
            i++;
        }
        float fRi = com.bytedance.adsdk.lr.di.di.ri();
        ri(this.mj, (int) (((ka) this).xha.ri() * fRi), (int) (((ka) this).xha.lr() * fRi));
    }

    private List<String> co() {
        com.bytedance.adsdk.lr.jbs jbsVar;
        ac acVarAy;
        List<com.bytedance.adsdk.lr.qt.ri> listIk;
        if (((ka) this).xha == null || (jbsVar = this.lr) == null || (acVarAy = jbsVar.ay()) == null) {
            return null;
        }
        String strKa = ((ka) this).xha.ka();
        if ((!TextUtils.isEmpty(strKa) || !TextUtils.isEmpty(this.f17990co)) && (listIk = ((ka) this).xha.ik()) != null) {
            String strRi = this.f17990co;
            if (TextUtils.isEmpty(strRi)) {
                strRi = acVarAy.ri(strKa);
            }
            if (!TextUtils.isEmpty(strRi)) {
                int length = strRi.length();
                this.qt.clear();
                for (int i = 0; i < listIk.size(); i++) {
                    com.bytedance.adsdk.lr.qt.ri riVar = listIk.get(i);
                    int iMax = riVar.ri;
                    int iMax2 = riVar.lr;
                    if (iMax < 0) {
                        iMax = Math.max(iMax + length, 0);
                    }
                    if (iMax2 < 0) {
                        iMax2 = Math.max(iMax2 + length, 0);
                    }
                    if (iMax + iMax2 > length) {
                        this.qt.add("");
                    } else {
                        if (listIk.size() == 1 && iMax == 0 && iMax2 == 0) {
                            iMax2 = length;
                        }
                        this.qt.add(strRi.substring(iMax, iMax2 + iMax));
                    }
                }
                return this.qt;
            }
        }
        return null;
    }

    private void ik(float f) {
        List<com.bytedance.adsdk.lr.qt.ri> listIk;
        com.bytedance.adsdk.lr.qt qtVar = ((ka) this).xha;
        if (qtVar == null || (listIk = qtVar.ik()) == null || listIk.size() <= 0) {
            return;
        }
        this.mj.setOrientation(0);
        this.mj.setGravity(17);
        if (this.mj.getChildCount() <= 0) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) this.mj.getChildAt(0);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(80);
        this.mj.removeAllViews();
        if (linearLayout.getChildCount() != listIk.size()) {
            return;
        }
        List<String> listCo = co();
        this.sf.clear();
        int i = 0;
        while (i < listIk.size()) {
            com.bytedance.adsdk.lr.qt.ri riVar = listIk.get(i);
            TextView textView = (TextView) linearLayout.getChildAt(i);
            this.sf.add(textView);
            ri(textView, riVar, (listCo == null || i >= listCo.size()) ? "" : listCo.get(i));
            i++;
        }
        linearLayout.removeAllViews();
        for (int i2 = 0; i2 < listIk.size(); i2++) {
            com.bytedance.adsdk.lr.qt.ri riVar2 = listIk.get(i2);
            TextView textView2 = this.sf.get(i2);
            textView2.setAlpha(f);
            linearLayout.setAlpha(f);
            int i3 = riVar2.di;
            if (i3 != 0) {
                this.jbs.bottomMargin = (int) (i3 * com.bytedance.adsdk.lr.di.di.ri());
                linearLayout.addView(textView2, this.jbs);
            } else {
                linearLayout.addView(textView2);
            }
        }
        this.mj.setAlpha(f);
        this.mj.addView(linearLayout);
        float fRi = com.bytedance.adsdk.lr.di.di.ri();
        ri(this.mj, (int) (((ka) this).xha.ri() * fRi), (int) (((ka) this).xha.lr() * fRi));
    }

    private void lr(String str) {
        if (TextUtils.isEmpty(str)) {
            this.mj.setGravity(17);
            return;
        }
        str.getClass();
        if (str.equals(TtmlNode.LEFT)) {
            this.mj.setGravity(3);
        } else if (str.equals(TtmlNode.RIGHT)) {
            this.mj.setGravity(5);
        } else {
            this.mj.setGravity(17);
        }
    }

    private void ri(TextView textView, com.bytedance.adsdk.lr.qt.ri riVar, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setText("");
        } else {
            textView.setText(str);
        }
        if (!TextUtils.isEmpty(riVar.ik)) {
            textView.setTextColor(Color.parseColor(riVar.ik));
        }
        if (!TextUtils.isEmpty(riVar.ka)) {
            textView.setBackgroundColor(Color.parseColor(riVar.ka));
        }
        textView.setGravity(17);
        textView.setTextSize(riVar.fi);
    }

    @Override // com.bytedance.adsdk.lr.ik.ik.ka, com.bytedance.adsdk.lr.ik.ik.ri
    public void lr(Canvas canvas, Matrix matrix, int i) {
        if (this.mj != null) {
            canvas.save();
            canvas.concat(matrix);
            ri(i);
            ik(di());
            this.mj.draw(canvas);
            canvas.restore();
            return;
        }
        super.lr(canvas, matrix, i);
    }

    private static void ri(View view, int i, int i2) {
        view.layout(0, 0, i, i2);
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void ri(String str) {
        this.f17990co = str;
    }
}
