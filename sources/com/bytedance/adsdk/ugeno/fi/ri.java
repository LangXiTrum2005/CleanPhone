package com.bytedance.adsdk.ugeno.fi;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
interface ri {
    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<ik> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    int lr(int i, int i2, int i3);

    View lr(int i);

    int ri(int i, int i2, int i3);

    int ri(View view);

    int ri(View view, int i, int i2);

    View ri(int i);

    void ri(View view, int i, int i2, ik ikVar);

    void ri(ik ikVar);

    boolean ri();

    void setFlexLines(List<ik> list);
}
