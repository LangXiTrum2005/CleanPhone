package com.p004ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import com.p004ironsource.dk;
import com.p004ironsource.js;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class SSAFactory {
    public static js getPublisherInstance(Activity activity) throws Exception {
        return dk.b((Context) activity);
    }

    public static js getPublisherTestInstance(Activity activity, int i2) throws Exception {
        return dk.a(activity, i2);
    }
}
