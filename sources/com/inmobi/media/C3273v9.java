package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.inmobi.commons.core.configs.AdConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.v9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3273v9 extends AbstractC3209r9 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D9 f24059e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3273v9(D9 d9) {
        super(d9);
        this.f24059e = d9;
    }

    @Override // com.inmobi.media.AbstractC3209r9
    public final View a(Context context) {
        Intrinsics.f(context, "context");
        return new ImageView(context.getApplicationContext());
    }

    @Override // com.inmobi.media.AbstractC3209r9
    public final void a(View view, C2984d8 asset, AdConfig adConfig) {
        Intrinsics.f(view, "view");
        Intrinsics.f(asset, "asset");
        Intrinsics.f(adConfig, "adConfig");
        super.a(view, asset, adConfig);
        if (view instanceof ImageView) {
            D9.a(this.f24059e, (ImageView) view, asset);
        }
    }

    @Override // com.inmobi.media.AbstractC3209r9
    public final void a(View view) {
        Intrinsics.f(view, "view");
        if (view instanceof ImageView) {
            ((ImageView) view).setImageDrawable(null);
            super.a(view);
        }
    }
}
