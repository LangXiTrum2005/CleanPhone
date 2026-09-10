package com.smartdigimkt.v5;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f39162a;

    public a(Context context) {
        this.f39162a = context;
    }

    public abstract Paint a();

    public abstract Path a(int i2);

    public abstract com.smartdigimkt.sdk.basead.ui.guidetoclickv2.picverify.a a(int i2, int i3, int i4);

    public void a(Context context, Canvas canvas, Path path) {
    }

    public abstract Paint b();

    public com.smartdigimkt.sdk.basead.ui.guidetoclickv2.picverify.a b(int i2, int i3, int i4) {
        return a(i2, i3, i4);
    }

    public Context c() {
        return this.f39162a;
    }
}
