package q7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.CustomTabActivity;
import com.facebook.CustomTabMainActivity;
import com.facebook.appevents.InternalAppEventsLogger;
import com.google.android.gms.internal.ads.bf;
import com.google.android.gms.internal.ads.bi;
import com.google.android.gms.internal.ads.cz0;
import com.google.android.gms.internal.ads.gm0;
import com.google.android.gms.internal.ads.jq;
import com.google.android.gms.internal.ads.kg;
import com.google.android.gms.internal.ads.l02;
import com.google.android.gms.internal.ads.ln0;
import com.google.android.gms.internal.ads.q00;
import com.google.android.gms.internal.ads.wo0;
import com.google.android.gms.internal.ads.ys0;
import com.google.android.gms.internal.ads.z80;
import com.google.android.gms.internal.ads.zw;
import com.google.android.gms.internal.measurement.v4;
import ea.j1;
import ea.m1;
import ea.s0;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends BroadcastReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static c f48670c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f48672b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f48671a = i10;
        this.f48672b = obj;
    }

    public static final /* synthetic */ c a() {
        if (v7.a.b(c.class)) {
            return null;
        }
        try {
            return f48670c;
        } catch (Throwable th2) {
            v7.a.a(c.class, th2);
            return null;
        }
    }

    public void finalize() throws Throwable {
        switch (this.f48671a) {
            case 0:
                if (!v7.a.b(this)) {
                    try {
                        if (!v7.a.b(this)) {
                            try {
                                LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance((Context) this.f48672b);
                                kotlin.jvm.internal.n.e(localBroadcastManager, "getInstance(applicationContext)");
                                localBroadcastManager.unregisterReceiver(this);
                            } catch (Throwable th2) {
                                v7.a.a(this, th2);
                                return;
                            }
                            break;
                        }
                    } catch (Throwable th3) {
                        v7.a.a(this, th3);
                        return;
                    }
                }
                break;
            default:
                super.finalize();
                break;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i10 = this.f48671a;
        int i11 = 1;
        Object obj = this.f48672b;
        switch (i10) {
            case 0:
                if (!v7.a.b(this)) {
                    try {
                        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(context);
                        StringBuilder sb2 = new StringBuilder("bf_");
                        sb2.append(intent != null ? intent.getStringExtra("event_name") : null);
                        String string = sb2.toString();
                        Bundle bundleExtra = intent != null ? intent.getBundleExtra("event_args") : null;
                        Bundle bundle = new Bundle();
                        Set<String> setKeySet = bundleExtra != null ? bundleExtra.keySet() : null;
                        if (setKeySet != null) {
                            for (String key : setKeySet) {
                                kotlin.jvm.internal.n.e(key, "key");
                                Pattern patternCompile = Pattern.compile("[^0-9a-zA-Z _-]");
                                kotlin.jvm.internal.n.e(patternCompile, "compile(...)");
                                String strReplaceAll = patternCompile.matcher(key).replaceAll("-");
                                kotlin.jvm.internal.n.e(strReplaceAll, "replaceAll(...)");
                                Pattern patternCompile2 = Pattern.compile("^[ -]*");
                                kotlin.jvm.internal.n.e(patternCompile2, "compile(...)");
                                String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("");
                                kotlin.jvm.internal.n.e(strReplaceAll2, "replaceAll(...)");
                                Pattern patternCompile3 = Pattern.compile("[ -]*$");
                                kotlin.jvm.internal.n.e(patternCompile3, "compile(...)");
                                String strReplaceAll3 = patternCompile3.matcher(strReplaceAll2).replaceAll("");
                                kotlin.jvm.internal.n.e(strReplaceAll3, "replaceAll(...)");
                                bundle.putString(strReplaceAll3, (String) bundleExtra.get(key));
                            }
                        }
                        internalAppEventsLogger.logEvent(string, bundle);
                    } catch (Throwable th2) {
                        v7.a.a(this, th2);
                        return;
                    }
                    break;
                }
                break;
            case 1:
                ((kg) obj).c();
                break;
            case 2:
                ((bi) obj).d(3);
                break;
            case 3:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    ((ys0) obj).e(new bf(i11));
                }
                break;
            case 4:
                ((wo0) obj).f21556a.execute(new gm0(4, this, context));
                break;
            case 5:
                cz0 cz0Var = (cz0) obj;
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    cz0Var.a(true, cz0Var.f13320c);
                    cz0Var.f13319b = true;
                } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    cz0Var.a(false, cz0Var.f13320c);
                    cz0Var.f13319b = false;
                }
                break;
            case 6:
                if (!isInitialStickyBroadcast()) {
                    zw zwVar = (zw) obj;
                    zwVar.k(l02.a(context, intent, (z80) zwVar.f22738k, (AudioDeviceInfo) zwVar.f22737j, zwVar.j()));
                }
                break;
            case 7:
                kotlin.jvm.internal.n.f(context, "context");
                kotlin.jvm.internal.n.f(intent, "intent");
                xi.g gVar = (xi.g) obj;
                String strB = di.a.b(intent.getIntExtra("status", -1));
                if (strB != null) {
                    gVar.b(strB);
                } else {
                    gVar.a("UNAVAILABLE", "Charging status unavailable");
                }
                break;
            case 8:
                m1 m1Var = (m1) obj;
                if (intent == null) {
                    s0 s0Var = m1Var.f39587f;
                    m1.h(s0Var);
                    s0Var.f39756i.b("App receiver called with null intent");
                } else {
                    String action = intent.getAction();
                    if (action == null) {
                        s0 s0Var2 = m1Var.f39587f;
                        m1.h(s0Var2);
                        s0Var2.f39756i.b("App receiver called with null action");
                    } else {
                        int iHashCode = action.hashCode();
                        if (iHashCode != -1928239649) {
                            if (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                                s0 s0Var3 = m1Var.f39587f;
                                m1.h(s0Var3);
                                s0Var3.f39760n.b("[sgtm] App Receiver notified batches are available");
                                j1 j1Var = m1Var.f39588g;
                                m1.h(j1Var);
                                j1Var.P0(new androidx.lifecycle.a0(this, 15));
                            }
                            break;
                        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                            v4.a();
                            if (m1Var.f39585d.R0(null, ea.d0.P0)) {
                                s0 s0Var4 = m1Var.f39587f;
                                m1.h(s0Var4);
                                s0Var4.f39760n.b("App receiver notified triggers are available");
                                j1 j1Var2 = m1Var.f39588g;
                                m1.h(j1Var2);
                                j1Var2.P0(new androidx.lifecycle.a0(m1Var, 16));
                                break;
                            }
                        }
                        s0 s0Var5 = m1Var.f39587f;
                        m1.h(s0Var5);
                        s0Var5.f39756i.b("App receiver called with unknown action");
                    }
                }
                break;
            case 9:
                ((q00) obj).m();
                break;
            case 10:
                if (intent != null) {
                    ((k5.c) obj).g(intent);
                }
                break;
            case 11:
                ((l1.p) obj).f44804a.execute(new com.unity3d.services.ads.operation.show.b(26, this, context));
                break;
            case 12:
                kotlin.jvm.internal.n.f(context, "context");
                kotlin.jvm.internal.n.f(intent, "intent");
                ((CustomTabActivity) obj).finish();
                break;
            case 13:
                kotlin.jvm.internal.n.f(context, "context");
                kotlin.jvm.internal.n.f(intent, "intent");
                CustomTabMainActivity customTabMainActivity = (CustomTabMainActivity) obj;
                Intent intent2 = new Intent(customTabMainActivity, (Class<?>) CustomTabMainActivity.class);
                int i12 = CustomTabMainActivity.f10565c;
                intent2.setAction("CustomTabMainActivity.action_refresh");
                intent2.putExtra("CustomTabMainActivity.extra_url", intent.getStringExtra("CustomTabMainActivity.extra_url"));
                intent2.addFlags(603979776);
                customTabMainActivity.startActivity(intent2);
                break;
            case 14:
                if ("close action".equals(intent.getAction())) {
                    ((WebViewActivity) obj).finish();
                }
                break;
            default:
                if (!isInitialStickyBroadcast()) {
                    ln0 ln0Var = (ln0) obj;
                    ln0Var.e(r1.b.b(context, intent, (i1.e) ln0Var.f17079j, (AudioDeviceInfo) ln0Var.f17078i));
                }
                break;
        }
    }

    public c() {
        this.f48671a = 5;
        this.f48672b = cz0.f13317d;
    }

    public /* synthetic */ c(jq jqVar, ys0 ys0Var) {
        this.f48671a = 3;
        this.f48672b = ys0Var;
    }

    public c(m1 m1Var) {
        this.f48671a = 8;
        this.f48672b = m1Var;
    }

    public c(Context context) {
        this.f48671a = 0;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.n.e(applicationContext, "context.applicationContext");
        this.f48672b = applicationContext;
    }

    public c(di.a aVar, xi.g gVar) {
        this.f48671a = 7;
        this.f48672b = gVar;
    }
}
