package com.bytedance.sdk.openadsdk.lk;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.le;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class lc extends ScrollView {
    private final com.bytedance.sdk.openadsdk.core.JXs.JXs LD;
    private final nBu Lxb;

    public lc(Context context, nBu nbu) {
        super(context);
        this.Lxb = nbu;
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        this.LD = jXs;
        jXs.setOrientation(1);
        addView(jXs, new FrameLayout.LayoutParams(-1, -2));
        if (nbu.OY() == 0) {
            Lxb();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setVerticalScrollBarEnabled(false);
    }

    private void LD(List<FilterWord> list) {
        this.LD.removeAllViews();
        for (int i = 0; i < list.size(); i++) {
            FilterWord filterWord = list.get(i);
            if (filterWord != null) {
                this.LD.addView(new ebl(getContext(), filterWord, this.Lxb));
            }
            if (i < list.size() - 1) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int iLk = le.lk(getContext(), this.Lxb.QAg() ? 16.0f : 8.0f);
                layoutParams.topMargin = iLk;
                layoutParams.bottomMargin = iLk;
                this.LD.addView(new JVA(getContext()), layoutParams);
            }
        }
    }

    private void Lxb() {
        if (this.Lxb.OY() != 0) {
            return;
        }
        this.Lxb.Lxb(le.lk(getContext()), le.ZU(getContext()));
    }

    private static List<FilterWord> lk(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i = 0;
        int i2 = -1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (list.get(i3).hasSecondOptions()) {
                i2 = i3;
            }
        }
        if (i2 != -1 && i2 <= list.size()) {
            i = i2;
        }
        FilterWord filterWord = list.get(i);
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            FilterWord next = it.next();
            if (!next.hasSecondOptions()) {
                filterWord.addOption(next);
                it.remove();
            }
        }
        return list;
    }

    public void Lxb(List<FilterWord> list) {
        List<FilterWord> listLk = lk(list);
        if (listLk == null) {
            return;
        }
        LD(listLk);
    }
}
