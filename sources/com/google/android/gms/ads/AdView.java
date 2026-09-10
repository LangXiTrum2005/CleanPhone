package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class AdView extends BaseAdView {
    public AdView(@NonNull Context context) {
        super(context);
        c0.i(context, "Context cannot be null");
    }

    @NonNull
    public final VideoController zza() {
        return this.f10646a.zzy();
    }

    public AdView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 0);
    }
}
