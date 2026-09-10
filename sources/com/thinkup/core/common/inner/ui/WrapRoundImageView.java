package com.thinkup.core.common.inner.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.thinkup.core.common.ooo.moo;
import com.thinkup.core.common.ui.component.RoundImageView;

/* JADX INFO: loaded from: classes6.dex */
public class WrapRoundImageView extends RoundImageView {
    public WrapRoundImageView(Context context) {
        super(context);
    }

    public int[] setBitmapAndResize(Bitmap bitmap, int i2, int i3) {
        if (bitmap == null) {
            return null;
        }
        setImageBitmap(bitmap);
        if (i2 > 0 && i3 > 0) {
            try {
                int[] iArrO = moo.o(i2, i3, bitmap.getWidth() / bitmap.getHeight());
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = iArrO[0];
                    layoutParams.height = iArrO[1];
                    setLayoutParams(layoutParams);
                    return iArrO;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    public WrapRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
