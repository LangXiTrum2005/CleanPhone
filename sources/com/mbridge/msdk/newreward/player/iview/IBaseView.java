package com.mbridge.msdk.newreward.player.iview;

import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.newreward.function.command.retention.ReportAnnotation;

/* JADX INFO: loaded from: classes2.dex */
public interface IBaseView {
    void addViewToCurrentViewGroup(View view);

    boolean initViews(boolean z);

    void onActivityLifeCycleCallback(String str);

    void removeTempleFromSuperView(ViewGroup viewGroup);

    @ReportAnnotation.MethodInfo(className = "IBaseView.show", reportType = "2")
    void show(ViewGroup viewGroup);
}
