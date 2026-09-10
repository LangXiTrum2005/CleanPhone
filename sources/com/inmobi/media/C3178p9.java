package com.inmobi.media;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.TextView;

/* JADX INFO: renamed from: com.inmobi.media.p9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3178p9 extends TextView {
    public C3178p9(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        int lineHeight = getLineHeight() > 0 ? i3 / getLineHeight() : 0;
        if (lineHeight > 0) {
            setSingleLine(false);
            setLines(lineHeight);
        }
        if (lineHeight == 1) {
            setSingleLine();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
