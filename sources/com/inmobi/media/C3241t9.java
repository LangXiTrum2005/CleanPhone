package com.inmobi.media;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.t9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3241t9 extends AbstractC3209r9 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D9 f24009e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3241t9(D9 d9) {
        super(d9);
        this.f24009e = d9;
    }

    @Override // com.inmobi.media.AbstractC3209r9
    public final View a(Context context) {
        Intrinsics.f(context, "context");
        return new Button(context.getApplicationContext());
    }

    @Override // com.inmobi.media.AbstractC3209r9
    public final void a(View view, C2984d8 asset, AdConfig adConfig) {
        Intrinsics.f(view, "view");
        Intrinsics.f(asset, "asset");
        Intrinsics.f(adConfig, "adConfig");
        super.a(view, asset, adConfig);
        if (view instanceof Button) {
            D9.a(this.f24009e, (Button) view, asset);
        }
    }

    @Override // com.inmobi.media.AbstractC3209r9
    public final void a(View view) {
        Intrinsics.f(view, "view");
        if (view instanceof Button) {
            HashMap map = D9.f22775c;
            TextView textView = (TextView) view;
            textView.setTypeface(Typeface.DEFAULT, 0);
            textView.setPaintFlags(textView.getPaintFlags() & (-17));
            textView.setPaintFlags(textView.getPaintFlags() & (-9));
            super.a(view);
        }
    }
}
