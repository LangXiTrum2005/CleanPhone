package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3751j3 implements DZ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4533a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C3751j3(Object obj, int i) {
        this.f4533a = i;
        this.b = obj;
    }

    public final void a() {
        Object obj = this.b;
        C3927l3 c3927l3 = (C3927l3) obj;
        DialogC3665i3 dialogC3665i3 = c3927l3.v;
        if (dialogC3665i3 != null) {
            dialogC3665i3.setCancelable(true);
            c3927l3.v.setCanceledOnTouchOutside(true);
            try {
                Context context = ((C3927l3) obj).v.getContext();
                if (context != null && !context.isRestricted() && ((C3927l3) obj).v.isShowing()) {
                    ((C3927l3) obj).v.dismiss();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            c3927l3.v = null;
        }
    }

    public final void b() {
        Object obj = this.b;
        C3927l3 c3927l3 = (C3927l3) obj;
        DialogC3665i3 dialogC3665i3 = c3927l3.w;
        if (dialogC3665i3 != null) {
            dialogC3665i3.setCancelable(true);
            c3927l3.w.setCanceledOnTouchOutside(true);
            try {
                Context context = ((C3927l3) obj).w.getContext();
                if (context != null && !context.isRestricted() && ((C3927l3) obj).w.isShowing()) {
                    ((C3927l3) obj).w.dismiss();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            c3927l3.w = null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DZ
    public final String p() {
        AppOpenAd appOpenAd = ((Tm0) this.b).f3792a;
        if (appOpenAd != null) {
            return appOpenAd.getResponseInfo().getMediationAdapterClassName();
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DZ
    public final String toString() {
        switch (this.f4533a) {
            case 1:
                AppOpenAd appOpenAd = ((Tm0) this.b).f3792a;
                return appOpenAd != null ? appOpenAd.getResponseInfo().toString() : "";
            default:
                return super.toString();
        }
    }
}
