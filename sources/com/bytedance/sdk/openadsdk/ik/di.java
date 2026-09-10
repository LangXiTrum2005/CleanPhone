package com.bytedance.sdk.openadsdk.ik;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.qd;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class di extends ScrollView {
    private final com.bytedance.sdk.openadsdk.core.di.fi lr;
    private final qt ri;

    public di(Context context, qt qtVar) {
        super(context);
        this.ri = qtVar;
        com.bytedance.sdk.openadsdk.core.di.fi fiVar = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        this.lr = fiVar;
        fiVar.setOrientation(1);
        addView(fiVar, new FrameLayout.LayoutParams(-1, -2));
        if (qtVar.mj() == 0) {
            ri();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setVerticalScrollBarEnabled(false);
    }

    private static List<FilterWord> ik(List<FilterWord> list) {
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

    private void lr(List<FilterWord> list) {
        this.lr.removeAllViews();
        for (int i = 0; i < list.size(); i++) {
            FilterWord filterWord = list.get(i);
            if (filterWord != null) {
                this.lr.addView(new xha(getContext(), filterWord, this.ri));
            }
            if (i < list.size() - 1) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int iLr = qd.lr(getContext(), this.ri.jbs() ? 16.0f : 8.0f);
                layoutParams.topMargin = iLr;
                layoutParams.bottomMargin = iLr;
                this.lr.addView(new sf(getContext()), layoutParams);
            }
        }
    }

    private void ri() {
        if (this.ri.mj() != 0) {
            return;
        }
        this.ri.ri(qd.ik(getContext()), qd.fi(getContext()));
    }

    public void ri(List<FilterWord> list) {
        List<FilterWord> listIk = ik(list);
        if (listIk == null) {
            return;
        }
        lr(listIk);
    }
}
