package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.airbnb.lottie.LottieAnimationView;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class GJ implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3116a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ GJ(int i, Object obj, Object obj2) {
        this.f3116a = i;
        this.c = obj;
        this.b = obj2;
    }

    private final Integer a() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i;
        Context context = (Context) this.c;
        Intent intent = (Intent) this.b;
        Object obj = C2478Ht.c;
        C3844k50 c3844k50I = C3844k50.i();
        ((Queue) c3844k50I.e).offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        synchronized (c3844k50I) {
            try {
                Object obj2 = c3844k50I.b;
                if (((String) obj2) != null) {
                    str = (String) obj2;
                } else {
                    ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                    if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null || !context.getPackageName().equals(serviceInfo.packageName) || (str2 = serviceInfo.name) == null) {
                        str = null;
                    } else {
                        if (str2.startsWith(".")) {
                            c3844k50I.b = context.getPackageName() + serviceInfo.name;
                        } else {
                            c3844k50I.b = serviceInfo.name;
                        }
                        str = (String) c3844k50I.b;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (str != null) {
            intent2.setClassName(context.getPackageName(), str);
        }
        try {
            i = (c3844k50I.l(context) ? Aj0.c(context, intent2) : context.startService(intent2)) == null ? 404 : -1;
        } catch (IllegalStateException e) {
            e.toString();
            i = 402;
        } catch (SecurityException unused) {
            i = 401;
        }
        return Integer.valueOf(i);
    }

    private final void b() {
        C2375Du c2375Du = (C2375Du) this.c;
        D90 d90 = (D90) this.b;
        C3633hi c3633hi = c2375Du.h;
        synchronized (c3633hi.b) {
            c3633hi.f4465a.edit().putLong("fetch_timeout_in_seconds", d90.f2959a).putLong("minimum_fetch_interval_in_seconds", d90.b).commit();
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f3116a) {
            case 0:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.c;
                String str = (String) this.b;
                if (!lottieAnimationView.j) {
                    return RJ.b(lottieAnimationView.getContext(), str, null);
                }
                Context context = lottieAnimationView.getContext();
                HashMap map = RJ.f3654a;
                return RJ.b(context, str, "asset_" + str);
            case 1:
                return RJ.c((InputStream) this.c, (String) this.b);
            case 2:
                return a();
            case 3:
                b();
                return null;
            case 4:
                C2777Th c2777Th = (C2777Th) this.c;
                C2803Uh c2803Uh = (C2803Uh) this.b;
                C2726Ri c2726Ri = c2777Th.b;
                synchronized (c2726Ri) {
                    FileOutputStream fileOutputStreamOpenFileOutput = c2726Ri.f3673a.openFileOutput(c2726Ri.b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(c2803Uh.f3834a.toString().getBytes(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Throwable th) {
                        fileOutputStreamOpenFileOutput.close();
                        throw th;
                    }
                }
                return null;
            default:
                return C4426qj0.m271getWrappedCallableWithFallback$lambda0((Callable) this.c, (InterfaceC2714Qw) this.b);
        }
    }
}
