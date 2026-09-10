package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes2.dex */
public class nr extends di {
    public lr ri;

    public nr(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        super(context, dynamicRootView, mjVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi
    public GradientDrawable getDrawable() {
        lr lrVar = new lr();
        this.ri = lrVar;
        return lrVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xd
    public boolean jbs() {
        return super.jbs();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi
    public lr ri(Bitmap bitmap) {
        ri riVar = new ri(bitmap, this.ri);
        this.ri = riVar;
        return riVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi
    public GradientDrawable ri(GradientDrawable.Orientation orientation, int[] iArr) {
        lr lrVar = new lr(orientation, iArr);
        this.ri = lrVar;
        return lrVar;
    }
}
