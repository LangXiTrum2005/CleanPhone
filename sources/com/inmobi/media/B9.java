package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class B9 extends AbstractC3209r9 {
    public B9(D9 d9) {
        super(d9);
    }

    @Override // com.inmobi.media.AbstractC3209r9
    public final View a(Context context) {
        Intrinsics.f(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.e(applicationContext, "getApplicationContext(...)");
        return new Sc(applicationContext);
    }

    @Override // com.inmobi.media.AbstractC3209r9
    public final void a(View view, C2984d8 asset, AdConfig adConfig) {
        Intrinsics.f(view, "view");
        Intrinsics.f(asset, "asset");
        Intrinsics.f(adConfig, "adConfig");
        super.a(view, asset, adConfig);
        HashMap map = D9.f22775c;
        C3146n9.a(view, asset.d);
    }

    @Override // com.inmobi.media.AbstractC3209r9
    public final void a(View view) {
        Intrinsics.f(view, "view");
        ((Sc) view).g = null;
        super.a(view);
    }
}
