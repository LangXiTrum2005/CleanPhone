package com.p004ironsource;

import android.content.Context;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.model.BasePlacement;

/* JADX INFO: loaded from: classes5.dex */
public interface jg {

    public interface a {
        void a(Context context, String str, IronSource.AD_UNIT ad_unit);

        void c(Context context, BasePlacement basePlacement, IronSource.AD_UNIT ad_unit);
    }

    qq.b a(Context context, BasePlacement basePlacement, IronSource.AD_UNIT ad_unit);

    boolean b(Context context, BasePlacement basePlacement, IronSource.AD_UNIT ad_unit);
}
