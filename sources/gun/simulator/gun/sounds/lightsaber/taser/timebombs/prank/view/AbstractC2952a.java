package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseSyncActivity;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2952a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f4102a = AbstractC2340Cl.K(AbstractC2340Cl.f2939a, AbstractC4496rb.f4935a);
    public static final List b = AbstractC2340Cl.K(BF.b, AbstractC3375el.f4334a);

    public static C3784jT a(C5 c5, BaseSyncActivity baseSyncActivity) {
        AbstractC2995aW.q(c5, "appInfo");
        AbstractC2995aW.q(baseSyncActivity, com.umeng.analytics.pro.f.X);
        C3784jT c3784jT = new C3784jT();
        C3844k50 c3844k50 = c3784jT.h;
        if (c3844k50 != null) {
            Integer num = c5.d;
            if (num != null) {
                c3844k50.c = baseSyncActivity.getString(num.intValue());
            }
            Integer num2 = c5.e;
            if (num2 != null) {
                c3844k50.d = baseSyncActivity.getString(num2.intValue());
            }
            c3844k50.e = baseSyncActivity.getString(R.string.Download);
        }
        c3784jT.f4554a = true;
        c3784jT.c = "";
        Integer num3 = c5.c;
        if (num3 != null) {
            c3784jT.b = AbstractC5044xl.m("android.resource://", baseSyncActivity.getPackageName(), "/drawable/", baseSyncActivity.getResources().getResourceEntryName(num3.intValue()));
        }
        c3784jT.e = "";
        c3784jT.d = "https://play.google.com/store/apps/details?id=" + c5.f2907a;
        c3784jT.f = false;
        return c3784jT;
    }

    public static C3784jT b(C5 c5, Context context) {
        AbstractC2995aW.q(c5, "appInfo");
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        C3784jT c3784jT = new C3784jT();
        C3844k50 c3844k50 = c3784jT.h;
        if (c3844k50 != null) {
            Integer num = c5.d;
            if (num != null) {
                c3844k50.c = context.getString(num.intValue());
            }
            Integer num2 = c5.e;
            if (num2 != null) {
                c3844k50.d = context.getString(num2.intValue());
            }
            c3844k50.e = context.getString(R.string.Download);
        }
        c3784jT.f4554a = true;
        Integer num3 = c5.b;
        if (num3 != null) {
            c3784jT.c = AbstractC5044xl.m("android.resource://", context.getPackageName(), "/drawable/", context.getResources().getResourceEntryName(num3.intValue()));
        }
        c3784jT.b = "";
        c3784jT.e = "";
        c3784jT.d = "https://play.google.com/store/apps/details?id=" + c5.f2907a;
        c3784jT.f = false;
        return c3784jT;
    }

    public static C3784jT c(C5 c5, Context context) {
        AbstractC2995aW.q(c5, "appInfo");
        C3784jT c3784jT = new C3784jT();
        C3844k50 c3844k50 = c3784jT.h;
        if (c3844k50 != null) {
            Integer num = c5.d;
            if (num != null) {
                c3844k50.c = context.getString(num.intValue());
            }
            Integer num2 = c5.e;
            if (num2 != null) {
                c3844k50.d = context.getString(num2.intValue());
            }
            c3844k50.e = context.getString(R.string.Download);
        }
        c3784jT.f4554a = true;
        Integer num3 = c5.b;
        if (num3 != null) {
            c3784jT.c = AbstractC5044xl.m("android.resource://", context.getPackageName(), "/drawable/", context.getResources().getResourceEntryName(num3.intValue()));
        }
        Integer num4 = c5.c;
        if (num4 != null) {
            c3784jT.b = AbstractC5044xl.m("android.resource://", context.getPackageName(), "/drawable/", context.getResources().getResourceEntryName(num4.intValue()));
        }
        c3784jT.e = "";
        c3784jT.d = "https://play.google.com/store/apps/details?id=" + c5.f2907a;
        c3784jT.f = false;
        return c3784jT;
    }
}
