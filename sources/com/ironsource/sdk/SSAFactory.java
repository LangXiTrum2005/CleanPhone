package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.InterfaceC0412je;
import com.ironsource.P9;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class SSAFactory {
    public static InterfaceC0412je getPublisherInstance(Activity activity) throws Exception {
        return P9.b((Context) activity);
    }

    public static InterfaceC0412je getPublisherTestInstance(Activity activity, int i10) throws Exception {
        return P9.a(activity, i10);
    }
}
