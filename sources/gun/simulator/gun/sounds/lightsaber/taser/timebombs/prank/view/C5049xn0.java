package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.UiModeManager;
import android.content.Context;
import android.content.IntentFilter;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5049xn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5246a;
    public boolean b;

    public /* synthetic */ C5049xn0(int i) {
        this.f5246a = i;
    }

    public final void a(Context context) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.f5246a;
        int i2 = 1;
        switch (i) {
            case 0:
                switch (i) {
                    case 0:
                        AbstractC2995aW.d(context, "Application Context cannot be null");
                        break;
                    case 1:
                        AbstractC2340Cl.d(context, "Application Context cannot be null");
                        break;
                    default:
                        AbstractC3375el.e(context, "Application Context cannot be null");
                        break;
                }
                if (!b()) {
                    switch (i) {
                        case 0:
                            this.b = true;
                            break;
                        case 1:
                            this.b = true;
                            break;
                        default:
                            this.b = true;
                            break;
                    }
                    C4523ro0.d().b(context);
                    C4346pn0.e.a(context);
                    if (context != null) {
                        AbstractC2995aW.e = (UiModeManager) context.getSystemService("uimode");
                    }
                    WindowManager windowManager = En0.f3039a;
                    if (context != null) {
                        En0.c = context.getResources().getDisplayMetrics().density;
                        En0.f3039a = (WindowManager) context.getSystemService("window");
                    }
                    context.registerReceiver(new C3558go0(0), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
                    C4260oo0.d.f4809a = context.getApplicationContext();
                    Mm0 mm0 = Mm0.f;
                    if (!mm0.c) {
                        Xn0 xn0 = mm0.d;
                        xn0.a(context);
                        xn0.d = mm0;
                        xn0.g();
                        switch (xn0.f3995a) {
                            case 0:
                                z = xn0.c;
                                break;
                            case 1:
                                z = xn0.c;
                                break;
                            default:
                                z = xn0.c;
                                break;
                        }
                        mm0.e = z;
                        mm0.c = true;
                    }
                    C4699to0 c4699to0 = C4699to0.d;
                    c4699to0.f5052a = new WeakReference(context);
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    context.registerReceiver(new C4024m70(c4699to0, 4), intentFilter);
                }
                break;
            case 1:
                switch (i) {
                    case 0:
                        AbstractC2995aW.d(context, "Application Context cannot be null");
                        break;
                    case 1:
                        AbstractC2340Cl.d(context, "Application Context cannot be null");
                        break;
                    default:
                        AbstractC3375el.e(context, "Application Context cannot be null");
                        break;
                }
                if (!b()) {
                    switch (i) {
                        case 0:
                            this.b = true;
                            break;
                        case 1:
                            this.b = true;
                            break;
                        default:
                            this.b = true;
                            break;
                    }
                    C4523ro0.e().b(context);
                    C4609sn0.e.a(context);
                    if (context != null) {
                        AbstractC2871Wx.k = (UiModeManager) context.getSystemService("uimode");
                    }
                    WindowManager windowManager2 = Gn0.f3140a;
                    if (context != null) {
                        Gn0.c = context.getResources().getDisplayMetrics().density;
                        Gn0.f3140a = (WindowManager) context.getSystemService("window");
                    }
                    context.registerReceiver(new C3558go0(i2), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
                    C4260oo0.b.f4809a = context.getApplicationContext();
                    C3115bn0 c3115bn0 = C3115bn0.f;
                    if (!c3115bn0.c) {
                        Xn0 xn1 = c3115bn0.d;
                        xn1.a(context);
                        xn1.d = c3115bn0;
                        xn1.g();
                        switch (xn1.f3995a) {
                            case 0:
                                z2 = xn1.c;
                                break;
                            case 1:
                                z2 = xn1.c;
                                break;
                            default:
                                z2 = xn1.c;
                                break;
                        }
                        c3115bn0.e = z2;
                        c3115bn0.c = true;
                    }
                }
                break;
            default:
                switch (i) {
                    case 0:
                        AbstractC2995aW.d(context, "Application Context cannot be null");
                        break;
                    case 1:
                        AbstractC2340Cl.d(context, "Application Context cannot be null");
                        break;
                    default:
                        AbstractC3375el.e(context, "Application Context cannot be null");
                        break;
                }
                if (!b()) {
                    switch (i) {
                        case 0:
                            this.b = true;
                            break;
                        case 1:
                            this.b = true;
                            break;
                        default:
                            this.b = true;
                            break;
                    }
                    C4523ro0.f().b(context);
                    C4873vn0.e.a(context);
                    if (context != null) {
                        WD.j = (UiModeManager) context.getSystemService("uimode");
                    }
                    WindowManager windowManager3 = In0.f3240a;
                    if (context != null) {
                        In0.c = context.getResources().getDisplayMetrics().density;
                        In0.f3240a = (WindowManager) context.getSystemService("window");
                    }
                    context.registerReceiver(new C3558go0(2), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
                    C4260oo0.c.f4809a = context.getApplicationContext();
                    Km0 km0 = Km0.f;
                    if (!km0.c) {
                        Xn0 xn2 = km0.d;
                        xn2.a(context);
                        xn2.d = km0;
                        xn2.g();
                        switch (xn2.f3995a) {
                            case 0:
                                z3 = xn2.c;
                                break;
                            case 1:
                                z3 = xn2.c;
                                break;
                            default:
                                z3 = xn2.c;
                                break;
                        }
                        km0.e = z3;
                        km0.c = true;
                    }
                    C4611so0 c4611so0 = C4611so0.d;
                    c4611so0.f5000a = new WeakReference(context);
                    IntentFilter intentFilter2 = new IntentFilter("android.intent.action.SCREEN_OFF");
                    intentFilter2.addAction("android.intent.action.SCREEN_ON");
                    context.registerReceiver(new C4024m70(c4611so0, 5), intentFilter2);
                }
                break;
        }
    }

    public final boolean b() {
        switch (this.f5246a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.b;
    }
}
