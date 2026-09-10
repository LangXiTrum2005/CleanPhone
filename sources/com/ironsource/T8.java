package com.ironsource;

import android.graphics.drawable.Drawable;
import android.webkit.URLUtil;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class T8 implements U8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q3 f27230a;

    public T8() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final Object b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return t9.e.c(new Exception("file does not exists"));
        }
        Drawable drawableCreateFromPath = Drawable.createFromPath(file.getPath());
        return drawableCreateFromPath == null ? t9.e.c(new Exception("failed to create a drawable")) : drawableCreateFromPath;
    }

    private final Object c(String str) {
        InputStream inputStreamA = this.f27230a.a(str);
        try {
            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamA, new File(str).getName());
            qk.i0.j(inputStreamA, null);
            return drawableCreateFromStream == null ? t9.e.c(new Exception("failed to create a drawable")) : drawableCreateFromStream;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                qk.i0.j(inputStreamA, th2);
                throw th3;
            }
        }
    }

    private final boolean d(String str) {
        return URLUtil.isHttpsUrl(str);
    }

    @Override // com.ironsource.U8
    public Object a(String url) {
        kotlin.jvm.internal.n.f(url, "url");
        try {
            return d(url) ? c(url) : b(url);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            return t9.e.c(e10);
        }
    }

    public T8(Q3 connectionFactory) {
        kotlin.jvm.internal.n.f(connectionFactory, "connectionFactory");
        this.f27230a = connectionFactory;
    }

    public /* synthetic */ T8(Q3 q6, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? H4.f26232a : q6);
    }
}
