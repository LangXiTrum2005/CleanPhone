package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseAsyncActivity;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.g9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3501g9 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseAsyncActivity f4406a;
    public final /* synthetic */ View b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3501g9(BaseAsyncActivity baseAsyncActivity, View view, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4406a = baseAsyncActivity;
        this.b = view;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C3501g9(this.f4406a, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C3501g9 c3501g9 = (C3501g9) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c3501g9.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        View view = this.b;
        BaseAsyncActivity baseAsyncActivity = this.f4406a;
        baseAsyncActivity.initContentView(view);
        baseAsyncActivity.initView();
        baseAsyncActivity.initData();
        baseAsyncActivity.initListener();
        return C5033xf0.f5238a;
    }
}
