package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.w9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3289w9 extends AbstractC3209r9 {
    public C3289w9(D9 d9) {
        super(d9);
    }

    @Override // com.inmobi.media.AbstractC3209r9
    public final View a(Context context) {
        Intrinsics.f(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.e(applicationContext, "getApplicationContext(...)");
        return new J8(applicationContext);
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
}
