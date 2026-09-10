package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class A9 extends AbstractC3209r9 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D9 f22690e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A9(D9 d9) {
        super(d9);
        this.f22690e = d9;
    }

    @Override // com.inmobi.media.AbstractC3209r9
    public final View a(Context context) {
        Intrinsics.f(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.e(applicationContext, "getApplicationContext(...)");
        return new C3130m9(applicationContext);
    }

    @Override // com.inmobi.media.AbstractC3209r9
    public final void a(View view, C2984d8 asset, AdConfig adConfig) {
        Intrinsics.f(view, "view");
        Intrinsics.f(asset, "asset");
        Intrinsics.f(adConfig, "adConfig");
        super.a(view, asset, adConfig);
        if (view instanceof C3130m9) {
            C3130m9 c3130m9 = (C3130m9) view;
            this.f22690e.getClass();
            HashMap map = D9.f22775c;
            C3146n9.a(c3130m9, asset.d);
            Object obj = asset.f23522u;
            if (obj instanceof Bitmap) {
                c3130m9.setPosterImage((Bitmap) obj);
            }
            c3130m9.getProgressBar().setVisibility(0);
        }
    }

    @Override // com.inmobi.media.AbstractC3209r9
    public final void a(View view) {
        Intrinsics.f(view, "view");
        if (view instanceof C3130m9) {
            C3130m9 c3130m9 = (C3130m9) view;
            c3130m9.getProgressBar().setVisibility(8);
            c3130m9.setPosterImage((Bitmap) null);
            c3130m9.getVideoView().f();
            super.a(view);
        }
    }
}
