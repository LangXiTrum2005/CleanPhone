package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.utils.qd;

/* JADX INFO: loaded from: classes2.dex */
public class mj extends Button {
    public mj(Context context) {
        super(context);
        ri();
    }

    private void ri() {
        setId(com.bytedance.sdk.openadsdk.utils.slm.hws);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, qd.lr(context, 48.0f)));
        setBackground(com.bytedance.sdk.openadsdk.utils.sf.ri(context, "tt_browser_download_selector"));
        setText(uq.ri(context, "tt_video_download_apk"));
        setTextColor(-1);
        setTextSize(2, 16.0f);
    }
}
