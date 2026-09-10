package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.SplashActivity;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.s5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4546s5 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ App f4961a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4546s5(App app, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4961a = app;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C4546s5(this.f4961a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C4546s5 c4546s5 = (C4546s5) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c4546s5.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        C2498In c2498In = App.n;
        C2498In.i();
        if (WD.i == null) {
            WD.i = X0.j;
        }
        X0 x0 = WD.i;
        if (x0 != null) {
            C3044b1 c3044b1 = C3044b1.b;
            c3044b1.f4152a = x0;
            App appI = C2498In.i();
            InterfaceC3854kB interfaceC3854kBE = c3044b1.e();
            C3491g4 c3491g4 = AbstractC3485g1.b;
            C2346Cr c2346Cr = new C2346Cr();
            c2346Cr.h = c3491g4;
            c2346Cr.i = 1;
            c2346Cr.g = 3000000L;
            InterfaceC3854kB interfaceC3854kBB = interfaceC3854kBE != null ? interfaceC3854kBE.b(c2346Cr) : null;
            LD ld = new LD();
            ld.d = AbstractC3485g1.c;
            InterfaceC3854kB interfaceC3854kBD = interfaceC3854kBB.d(ld);
            H5 h5 = new H5();
            h5.d = AbstractC3485g1.f4396a;
            h5.e = "OpenAd_Switch";
            h5.h = true;
            h5.m = true;
            h5.o = new C2443Gk(15);
            h5.n = new C2498In(15);
            Class[] clsArr = {SplashActivity.class};
            ArrayList arrayList = h5.c;
            arrayList.removeAll(Arrays.asList(clsArr));
            arrayList.addAll(Arrays.asList(clsArr));
            InterfaceC3854kB interfaceC3854kBQ = interfaceC3854kBD.q(h5);
            L8 l8 = new L8();
            l8.c.addAll(Arrays.asList(new R8(AbstractC3485g1.e, G7.b, false)));
            l8.f5021a = true;
            l8.f = true;
            InterfaceC3854kB interfaceC3854kBH = interfaceC3854kBQ.h(l8);
            QQ qq = new QQ();
            C3491g4 c3491g5 = AbstractC3485g1.f;
            C2498In c2498In2 = new C2498In(1);
            C3958lR c3958lR = new C3958lR();
            c3958lR.c = c3491g5;
            c3958lR.d = false;
            c3958lR.e = c2498In2;
            qq.c.addAll(Arrays.asList(c3958lR));
            x0.q(appI, interfaceC3854kBH.o(qq).k().g().m().c().a().j(new C2443Gk(14)).build());
        }
        UMConfigure.setLogEnabled(false);
        S3.b = false;
        Context contextF = c2498In.f();
        MobclickAgent.PageMode pageMode = MobclickAgent.PageMode.AUTO;
        S3.f3697a = contextF;
        UMConfigure.init(contextF, S3.b ? "0123456789012345679" : "679095ee8f232a05f1015673", "GP", 1, "");
        MobclickAgent.setPageCollectionMode(pageMode);
        this.f4961a.getClass();
        C4458r5 c4458r5 = new C4458r5();
        String str = AbstractC4969wu.f5203a;
        synchronized (AbstractC4969wu.class) {
            AbstractC4969wu.a(c4458r5);
        }
        return C5033xf0.f5238a;
    }
}
