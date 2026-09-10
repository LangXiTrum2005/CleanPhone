package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.u9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3257u9 extends AbstractC3209r9 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D9 f24024e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3257u9(D9 d9) {
        super(d9);
        this.f24024e = d9;
    }

    @Override // com.inmobi.media.AbstractC3209r9
    public final View a(Context context) {
        Intrinsics.f(context, "context");
        return new K4(context.getApplicationContext());
    }

    @Override // com.inmobi.media.AbstractC3209r9
    public final void a(View view, C2984d8 asset, AdConfig adConfig) {
        Intrinsics.f(view, "view");
        Intrinsics.f(asset, "asset");
        Intrinsics.f(adConfig, "adConfig");
        super.a(view, asset, adConfig);
        if (view instanceof K4) {
            K4 k4 = (K4) view;
            this.f24024e.getClass();
            HashMap map = D9.f22775c;
            k4.setLayoutParams(new ViewGroup.LayoutParams(C3146n9.a(asset.d.f23552a.x), C3146n9.a(asset.d.f23552a.y)));
            k4.setContentMode(asset.d.g);
            k4.setGifImpl((I4) ((C3224s8) asset).y.getX());
            C3146n9.a(k4, asset.d);
        }
    }

    @Override // com.inmobi.media.AbstractC3209r9
    public final void a(View view) {
        Intrinsics.f(view, "view");
        if (view instanceof K4) {
            ((K4) view).setGifImpl(null);
            super.a(view);
        }
    }
}
