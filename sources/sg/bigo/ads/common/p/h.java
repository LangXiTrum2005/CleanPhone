package sg.bigo.ads.common.p;

import android.content.Context;
import java.io.File;
import sg.bigo.ads.common.o;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends sg.bigo.ads.common.p.a {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final h f47427a = new h(0);
    }

    private h() {
        this.f47365b = new sg.bigo.ads.common.h.a.a();
    }

    @Override // sg.bigo.ads.common.p.a
    public final String a() {
        return "ImageLoader";
    }

    @Override // sg.bigo.ads.common.p.a
    public final int b() {
        return this.f47365b.a();
    }

    @Override // sg.bigo.ads.common.p.a
    public final String c(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(o.e(context));
        return android.support.v4.media.a.r(sb, File.separator, str);
    }

    public /* synthetic */ h(byte b2) {
        this();
    }

    @Override // sg.bigo.ads.common.p.a
    public final sg.bigo.ads.common.c a(Context context, String str) {
        return c.a(context).f47414b.get(str);
    }

    @Override // sg.bigo.ads.common.p.a
    public final String b(Context context) {
        return o.e(context);
    }

    @Override // sg.bigo.ads.common.p.a
    public final void a(Context context) {
        c.a(context).f47414b.evictAll();
    }

    @Override // sg.bigo.ads.common.p.a
    public final void b(Context context, String str) {
        c.a(context).f47414b.remove(str);
    }

    @Override // sg.bigo.ads.common.p.a
    public final void a(Context context, String str, sg.bigo.ads.common.c cVar) {
        c cVarA = c.a(context);
        if (cVar.f47116a.isRecycled()) {
            return;
        }
        cVarA.f47414b.put(str, cVar);
        sg.bigo.ads.common.t.a.a(0, 3, "BitmapCacheManager", "The left cache size: " + (c.f47413a.get() - cVarA.f47414b.size()));
    }
}
