package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.v0.k;

/* JADX INFO: loaded from: classes6.dex */
public class FeedbackTextView extends AutoResizeTextView {
    public FeedbackTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    private void a(Context context) {
        setBackgroundResource(h.a(context, "myoffer_bg_feedback_textview", k.d));
    }
}
