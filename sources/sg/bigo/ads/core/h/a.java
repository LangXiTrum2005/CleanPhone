package sg.bigo.ads.core.h;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.o;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends sg.bigo.ads.common.h.d {
    private static final a g = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f48570e;
    public AtomicBoolean f = new AtomicBoolean(false);

    private a() {
    }

    public static a f() {
        return g;
    }

    @Override // sg.bigo.ads.common.h.d
    public final String a() {
        return "BannerJsManager";
    }

    @Override // sg.bigo.ads.common.h.d
    public final String b() {
        return "banner_insert_js.js";
    }

    @Override // sg.bigo.ads.common.h.d
    public final String c() {
        return null;
    }

    @Override // sg.bigo.ads.common.h.d
    public final String d() {
        return this.f48570e;
    }

    @Override // sg.bigo.ads.common.h.d
    public final String e() {
        return sg.bigo.ads.common.x.a.h();
    }

    @Override // sg.bigo.ads.common.h.d
    public final String a(Context context) {
        return o.h(context);
    }

    @Override // sg.bigo.ads.common.h.d
    public final boolean b(String str) {
        return true;
    }

    @Override // sg.bigo.ads.common.h.d
    public final void a(String str) {
        sg.bigo.ads.common.x.a.c(str);
    }

    public static /* synthetic */ void a(a aVar, Context context) {
        if (aVar.e(context)) {
            String strD = aVar.d(context);
            aVar.f47301a = strD;
            if (!TextUtils.isEmpty(strD)) {
                sg.bigo.ads.common.t.a.a("BannerJsManager", "Fetch banner js from file successfully.");
                aVar.f47302b = true;
            }
        }
        aVar.b(context);
    }

    @Override // sg.bigo.ads.common.h.d
    public final boolean a(String str, String str2) {
        return (TextUtils.isEmpty(str) || TextUtils.equals(str, str2)) ? false : true;
    }
}
