package com.startapp.sdk.internal;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class zc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f41780b;

    public zc(Context context) {
        Context contextA = x0.a(context);
        this.f41779a = contextA != null ? contextA : context;
        this.f41780b = new ArrayList();
    }
}
