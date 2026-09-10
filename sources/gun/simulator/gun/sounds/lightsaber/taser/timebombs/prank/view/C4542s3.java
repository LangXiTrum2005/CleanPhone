package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import com.google.android.gms.ads.rewarded.RewardedAd;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4542s3 implements NS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ XZ f4960a;
    public final /* synthetic */ InterfaceC4821vB b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ AbstractC4630t3 d;

    public C4542s3(AbstractC4630t3 abstractC4630t3, XZ xz, InterfaceC4821vB interfaceC4821vB, Activity activity) {
        this.d = abstractC4630t3;
        this.f4960a = xz;
        this.b = interfaceC4821vB;
        this.c = activity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5085yB
    public final void a(A70 a70) {
        AbstractC4630t3 abstractC4630t3 = this.d;
        XZ xz = abstractC4630t3.m;
        if (xz == null || !xz.g) {
            return;
        }
        abstractC4630t3.m = null;
        XZ xz2 = this.f4960a;
        Dialog dialog = xz2.f;
        if (dialog != null) {
            try {
                Context context = dialog.getContext();
                if (xz2.f.isShowing()) {
                    if (context == null || context.isRestricted()) {
                        xz2.f.setCancelable(true);
                        xz2.f.setCanceledOnTouchOutside(true);
                    } else {
                        xz2.f.dismiss();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        InterfaceC4821vB interfaceC4821vB = this.b;
        if (interfaceC4821vB != null) {
            interfaceC4821vB.d(null);
            interfaceC4821vB.h(false);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5085yB
    public final void b(InterfaceC3240dB interfaceC3240dB) {
        RewardedAd rewardedAd;
        Bn0 bn0 = (Bn0) interfaceC3240dB;
        AbstractC4630t3 abstractC4630t3 = this.d;
        XZ xz = abstractC4630t3.m;
        if (xz == null || !xz.g) {
            return;
        }
        abstractC4630t3.m = null;
        XZ xz2 = this.f4960a;
        Dialog dialog = xz2.f;
        if (dialog != null) {
            try {
                Context context = dialog.getContext();
                if (dialog.isShowing()) {
                    if (context == null || context.isRestricted()) {
                        dialog.setCancelable(true);
                        dialog.setCanceledOnTouchOutside(true);
                    } else {
                        dialog.dismiss();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        InterfaceC4821vB interfaceC4821vB = this.b;
        if (bn0 != null && (rewardedAd = bn0.k) != null) {
            abstractC4630t3.V(this.c, rewardedAd, xz2, interfaceC4821vB);
        } else if (interfaceC4821vB != null) {
            interfaceC4821vB.d(null);
            interfaceC4821vB.h(false);
        }
    }
}
