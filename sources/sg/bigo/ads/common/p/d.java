package sg.bigo.ads.common.p;

import android.content.Context;
import java.io.File;
import sg.bigo.ads.common.o;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends sg.bigo.ads.common.p.a {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f47419a = new d(0);
    }

    private d() {
        this.f47365b = new sg.bigo.ads.common.h.a.a();
    }

    @Override // sg.bigo.ads.common.p.a
    public final String a() {
        return "IconLoader";
    }

    @Override // sg.bigo.ads.common.p.a
    public final int b() {
        sg.bigo.ads.common.h.a.a aVar = this.f47365b;
        if (aVar.f47263b == 0) {
            return Integer.MAX_VALUE;
        }
        return aVar.f47264c;
    }

    @Override // sg.bigo.ads.common.p.a
    public final String c(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(o.f(context));
        return android.support.v4.media.a.r(sb, File.separator, str);
    }

    public /* synthetic */ d(byte b2) {
        this();
    }

    @Override // sg.bigo.ads.common.p.a
    public final sg.bigo.ads.common.c a(Context context, String str) {
        return c.a(context).f47415c.get(str);
    }

    @Override // sg.bigo.ads.common.p.a
    public final String b(Context context) {
        return o.f(context);
    }

    @Override // sg.bigo.ads.common.p.a
    public final void a(Context context) {
        c.a(context).f47415c.evictAll();
    }

    @Override // sg.bigo.ads.common.p.a
    public final void b(Context context, String str) {
        c.a(context).f47415c.remove(str);
    }

    @Override // sg.bigo.ads.common.p.a
    public final void a(Context context, String str, sg.bigo.ads.common.c cVar) {
        c cVarA = c.a(context);
        if (cVar.f47116a.isRecycled()) {
            return;
        }
        cVarA.f47415c.put(str, cVar);
        sg.bigo.ads.common.t.a.a(0, 3, "BitmapCacheManager", "The left cache size: " + (c.f47413a.get() - cVarA.f47414b.size()));
    }
}
