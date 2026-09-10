package sg.bigo.ads.a;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsIntent;
import com.thinkup.core.common.n.mo;
import com.vungle.ads.internal.presenter.MRAIDPresenter;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f45373a = true;

    private static void a() {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Chrome tabs libs does not exist.");
        f45373a = false;
    }

    public static void a(final Context context) {
        a(context, "", null, "warmup", new Runnable() { // from class: sg.bigo.ads.a.c.3
            @Override // java.lang.Runnable
            public final void run() {
                b bVarA = b.a();
                Context context2 = context;
                if (context2 != null) {
                    sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Chrome tabs warming up.");
                    bVarA.a(context2.getApplicationContext());
                }
            }
        });
    }

    public static void a(final Context context, final String str, final int i2, final int i3, final boolean z2, final Bitmap bitmap, final a.c cVar, final a.b bVar) {
        a(context, str, bVar, MRAIDPresenter.OPEN, new Runnable() { // from class: sg.bigo.ads.a.c.2
            @Override // java.lang.Runnable
            public final void run() {
                Uri uri;
                final b bVarA = b.a();
                Context context2 = context;
                final String str2 = str;
                int i4 = i2;
                int i5 = i3;
                boolean z3 = z2;
                Bitmap bitmap2 = bitmap;
                final a.c cVar2 = cVar;
                final a.b bVar2 = bVar;
                if (!TextUtils.isEmpty(str2)) {
                    bVarA.f45361b.remove(str2);
                }
                StringBuilder sbY = android.support.v4.media.a.y("Start load url: ", str2, " with chrome tab current thread: ");
                sbY.append(Thread.currentThread().getName());
                sbY.append(mo.ono);
                sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", sbY.toString());
                try {
                    uri = Uri.parse(str2);
                } catch (Exception unused) {
                    uri = null;
                }
                if (uri == null) {
                    sg.bigo.ads.common.t.a.a(0, "ChromeTabsStatic", "Stop open chrome tab with error url.");
                    if (bVar2 != null) {
                        bVar2.a(context2, str2, 3, "Invalid url");
                        return;
                    }
                    return;
                }
                bVarA.a(context2);
                bVarA.f45360a.d = new CustomTabsCallback() { // from class: sg.bigo.ads.a.b.1
                    @Override // androidx.browser.customtabs.CustomTabsCallback
                    public final void onNavigationEvent(int i6, Bundle bundle) {
                        if (cVar2 == null) {
                            return;
                        }
                        p005e.a.f(new StringBuilder("Receive custom tab event: "), 0, b.a(i6), 3, "ChromeTabsStatic");
                        if (i6 == 5) {
                            cVar2.a();
                            return;
                        }
                        if (i6 == 1) {
                            cVar2.b();
                            return;
                        }
                        if (i6 == 3) {
                            cVar2.d();
                            return;
                        }
                        if (i6 == 4) {
                            cVar2.c();
                            return;
                        }
                        if (i6 == 2) {
                            cVar2.e();
                        } else if (i6 == 6) {
                            cVar2.f();
                            b.this.f45360a.d = null;
                        }
                    }
                };
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(bVarA.f45360a.a());
                CustomTabColorSchemeParams.Builder builder2 = builder.f3709b;
                if (i4 != 0) {
                    builder2.f3690a = Integer.valueOf(i4 | (-16777216));
                }
                if (i5 != 0) {
                    builder2.f3691b = Integer.valueOf(i5);
                }
                Intent intent = builder.f3708a;
                if (bitmap2 != null) {
                    intent.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", bitmap2);
                }
                intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z3 ? 1 : 0);
                CustomTabsIntent customTabsIntentA = builder.a();
                try {
                    Context contextB = sg.bigo.ads.common.f.b.b();
                    if (contextB == null) {
                        contextB = context2;
                    }
                    sg.bigo.ads.a.a.a.b bVar3 = new sg.bigo.ads.a.a.a.b() { // from class: sg.bigo.ads.a.b.2
                        @Override // sg.bigo.ads.a.a.a.b
                        public final void a(Context context3, sg.bigo.ads.a.a.b.a aVar) {
                            a.b bVar4 = bVar2;
                            if (bVar4 != null) {
                                bVar4.a(context3, str2, 2, aVar == null ? "" : aVar.f45355b);
                            }
                        }

                        @Override // sg.bigo.ads.a.a.a.b
                        public final void a(sg.bigo.ads.a.a.b.a aVar) {
                            a.b bVar4 = bVar2;
                            if (bVar4 == null || aVar == null) {
                                return;
                            }
                            bVar4.a(aVar.f45357e, aVar.d, aVar.f45356c);
                        }
                    };
                    sg.bigo.ads.a.a.b.a aVarA = sg.bigo.ads.a.a.b.a(contextB);
                    if (aVarA == null || !aVarA.f45354a) {
                        bVar3.a(contextB, aVarA);
                    } else {
                        customTabsIntentA.f3706a.setPackage(aVarA.f45357e);
                        customTabsIntentA.a(contextB, uri);
                        bVar3.a(aVarA);
                    }
                } catch (Exception e2) {
                    if (bVar2 != null) {
                        bVar2.a(context2, str2, 4, e2.toString());
                    }
                    bVarA.f45360a.d = null;
                }
            }
        });
    }

    public static void a(final Context context, final String str, final a.b bVar) {
        a(context, str, bVar, "preload", new Runnable() { // from class: sg.bigo.ads.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                b bVarA = b.a();
                Context context2 = context;
                String str2 = str;
                a.b bVar2 = bVar;
                StringBuilder sbY = android.support.v4.media.a.y("Start preload url: ", str2, " with chrome tab current thread: ");
                sbY.append(Thread.currentThread().getName());
                sbY.append(mo.ono);
                sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", sbY.toString());
                if (context2 == null) {
                    sg.bigo.ads.common.t.a.a(0, "ChromeTabsStatic", "Preload: empty context!");
                    if (bVar2 != null) {
                        bVar2.a(context2, str2, 3, "Invalid context");
                        return;
                    }
                    return;
                }
                Context applicationContext = context2.getApplicationContext();
                if (TextUtils.isEmpty(str2)) {
                    sg.bigo.ads.common.t.a.a(0, "ChromeTabsStatic", "Preload: empty url!");
                    if (bVar2 != null) {
                        bVar2.a(applicationContext, str2, 3, "Invalid url");
                        return;
                    }
                    return;
                }
                bVarA.f45361b.add(str2);
                if (bVarA.a(applicationContext)) {
                    sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Meet the conditions for connection of Chrome service.");
                    bVarA.b();
                    if (bVar2 != null) {
                        bVar2.a("", "0", "");
                        return;
                    }
                    return;
                }
                sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Failed to make connection of Chrome service.");
                bVarA.f45361b.remove(str2);
                if (bVar2 != null) {
                    bVar2.a(applicationContext, str2, 2, "Failed to make connection of Chrome service.");
                }
            }
        });
    }

    private static void a(Context context, String str, a.b bVar, String str2, Runnable runnable) {
        p005e.a.d(0, 3, str2, "start ", "ChromeTabsStatic");
        if (!f45373a) {
            sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", android.support.v4.media.a.n("Failed to ", str2, " with not exists chrome tab libs"));
            if (context == null || bVar == null) {
                return;
            }
            bVar.a(context, str, 1, "NoClassDefFoundError");
            return;
        }
        try {
            runnable.run();
        } catch (NoClassDefFoundError e2) {
            sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", android.support.v4.media.a.n("Failed to ", str2, " with not exists chrome tab libs"));
            a();
            if (context == null || bVar == null) {
                return;
            }
            bVar.a(context, str, 1, e2.toString());
        } catch (Throwable th) {
            StringBuilder sbY = android.support.v4.media.a.y("Failed to ", str2, " with unknown reason: ");
            sbY.append(th.toString());
            sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", sbY.toString());
            if (context == null || bVar == null) {
                return;
            }
            bVar.a(context, str, 4, th.toString());
        }
    }
}
