package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.z9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3337z9 extends AbstractC3209r9 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D9 f24158e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3337z9(D9 d9) {
        super(d9);
        this.f24158e = d9;
    }

    @Override // com.inmobi.media.AbstractC3209r9
    public final View a(Context context) {
        Intrinsics.f(context, "context");
        return new T8(context.getApplicationContext());
    }

    @Override // com.inmobi.media.AbstractC3209r9
    public final void a(View view, C2984d8 asset, AdConfig adConfig) {
        Intrinsics.f(view, "view");
        Intrinsics.f(asset, "asset");
        Intrinsics.f(adConfig, "adConfig");
        super.a(view, asset, adConfig);
        if (view instanceof T8) {
            this.f24158e.getClass();
            D9.a((T8) view, asset);
        }
    }

    @Override // com.inmobi.media.AbstractC3209r9
    public final void a(View view) {
        Intrinsics.f(view, "view");
        if (view instanceof T8) {
            super.a(view);
        }
    }
}
