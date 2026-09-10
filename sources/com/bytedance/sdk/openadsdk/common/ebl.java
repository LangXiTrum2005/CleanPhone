package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.sdk.component.utils.tD;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class ebl extends Button {
    public ebl(Context context) {
        super(context);
        Lxb();
    }

    private void Lxb() {
        setId(com.bytedance.sdk.openadsdk.utils.STP.gS);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, le.lk(context, 48.0f)));
        setBackground(com.bytedance.sdk.openadsdk.utils.QAg.Lxb(context, "tt_browser_download_selector"));
        setText(tD.Lxb(context, "tt_video_download_apk"));
        setTextColor(-1);
        setTextSize(2, 16.0f);
    }
}
