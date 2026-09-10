package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzbk;
import com.google.android.gms.internal.consent_sdk.zzco;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4444qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5040xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Q0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class O0 implements InterfaceC5216zj, InterfaceC5128yj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X0 f3487a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ FS c;

    public /* synthetic */ O0(X0 x0, Activity activity, FS fs) {
        this.f3487a = x0;
        this.b = activity;
        this.c = fs;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5128yj
    public final void onConsentInfoUpdateFailure(C4444qw c4444qw) {
        X0 x0 = this.f3487a;
        x0.u(x0.d, this.b, this.c);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5216zj
    public final void onConsentInfoUpdateSuccess() {
        X0 x0 = this.f3487a;
        x0.getClass();
        FS fs = this.c;
        final Activity activity = this.b;
        final Q0 q0 = new Q0(x0, activity, fs);
        if (zza.zza(activity).zzb().canRequestAds()) {
            q0.a();
            return;
        }
        zzbk zzbkVarZzc = zza.zza(activity).zzc();
        zzco.zza();
        zzbkVarZzc.zzb(new Hg0() { // from class: com.google.android.gms.internal.consent_sdk.zzbi
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hg0
            public final void onConsentFormLoadSuccess(InterfaceC5040xj interfaceC5040xj) {
                interfaceC5040xj.show(activity, q0);
            }
        }, new Gg0() { // from class: com.google.android.gms.internal.consent_sdk.zzbj
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gg0
            public final void onConsentFormLoadFailure(C4444qw c4444qw) {
                ((Q0) q0).a();
            }
        });
    }
}
