package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.sdk.component.utils.ljh;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class wd extends Button {
    public wd(Context context) {
        super(context);
        qdl();
    }

    private void qdl() {
        setId(com.bytedance.sdk.openadsdk.utils.jtx.lq);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, ax.ud(context, 48.0f)));
        setBackground(com.bytedance.sdk.openadsdk.utils.rq.qdl(context, "tt_browser_download_selector"));
        setText(ljh.qdl(context, "tt_video_download_apk"));
        setTextColor(-1);
        setTextSize(2, 16.0f);
    }
}
