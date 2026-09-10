package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.SplashActivity;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeObserverOnPreDrawListenerC3292dn0 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f4292a;
    public final /* synthetic */ Activity b;

    public ViewTreeObserverOnPreDrawListenerC3292dn0(View view, Activity activity) {
        this.f4292a = view;
        this.b = activity;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f4292a.getViewTreeObserver().removeOnPreDrawListener(this);
        X0 x0 = X0.j;
        x0.h();
        boolean z = x0.f4299a.get();
        C3044b1 c3044b1 = C3044b1.b;
        Activity activity = this.b;
        if (z) {
            SplashActivity splashActivity = (SplashActivity) ((InterfaceC3766jB) activity);
            splashActivity.getClass();
            c3044b1.l(new E80(splashActivity));
        } else if (((Om0) x0.k()).v) {
            if (XI.b(activity)) {
                AbstractApplicationC2673Ph abstractApplicationC2673Ph = x0.d;
                FS fs = x0.i;
                zzj zzjVarZzb = zza.zza(abstractApplicationC2673Ph.getApplicationContext()).zzb();
                if (activity != 0 && (activity instanceof InterfaceC3766jB)) {
                    x0.k();
                    C4288p70 c4288p70 = new C4288p70(6);
                    c4288p70.c = ((Om0) x0.k()).k;
                    C2312Bj c2312Bj = new C2312Bj(c4288p70);
                    try {
                        byte[] bArr = {57, -69, 111, 80, 29, -102, 53, 72, 36, -80, 109, 64, 22, -99, 8, 101, 45, -79, 95, 75, 28, -96, 47, 98, 63};
                        byte[] bArr2 = {75, -34, 30, 37, 120, -23, 65, 11};
                        int i = 0;
                        int i2 = 0;
                        while (i < 25) {
                            if (i2 >= 8) {
                                i2 = 0;
                            }
                            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                            i++;
                            i2++;
                        }
                        new String(bArr, StandardCharsets.UTF_8);
                        zzjVarZzb.requestConsentInfoUpdate(activity, c2312Bj, new O0(x0, activity, fs), new O0(x0, activity, fs));
                        if (zzjVarZzb.canRequestAds()) {
                            x0.u(x0.d, activity, fs);
                        }
                    } catch (Exception e) {
                        x0.u(x0.d, activity, fs);
                        e.printStackTrace();
                    }
                } else if (zzjVarZzb.canRequestAds()) {
                    x0.u(x0.d, activity, fs);
                }
            } else {
                x0.k();
                if (!x0.c.getAndSet(true)) {
                    SplashActivity splashActivity2 = (SplashActivity) ((InterfaceC3766jB) activity);
                    splashActivity2.getClass();
                    c3044b1.l(new E80(splashActivity2));
                }
            }
        } else if (!x0.c.getAndSet(true)) {
            SplashActivity splashActivity3 = (SplashActivity) ((InterfaceC3766jB) activity);
            splashActivity3.getClass();
            c3044b1.l(new E80(splashActivity3));
        }
        return false;
    }
}
