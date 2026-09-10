package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.asynclayoutinflater.view.AsyncLayoutInflater;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.mbridge.msdk.MBridgeConstans;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseAsyncActivity;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C4808v4 implements OnSuccessListener, AsyncLayoutInflater.OnInflateFinishedListener, InterfaceC2839Vr, InterfaceC3718ih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f5116a;

    public /* synthetic */ C4808v4(Object obj) {
        this.f5116a = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3718ih
    public Object c(C3274de0 c3274de0) {
        return this.f5116a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2839Vr
    public AbstractC2865Wr create(InterfaceC2409Fc interfaceC2409Fc) {
        AbstractC2865Wr abstractC2865Wr = (AbstractC2865Wr) this.f5116a;
        byte[] bArr = Vg0.f3884a;
        AbstractC2995aW.q(abstractC2865Wr, "$this_asFactory");
        AbstractC2995aW.q(interfaceC2409Fc, "it");
        return abstractC2865Wr;
    }

    @Override // androidx.asynclayoutinflater.view.AsyncLayoutInflater.OnInflateFinishedListener
    public void onInflateFinished(View view, int i, ViewGroup viewGroup) throws Throwable {
        BaseAsyncActivity baseAsyncActivity = (BaseAsyncActivity) this.f5116a;
        int i2 = BaseAsyncActivity.f2788a;
        AbstractC2995aW.q(baseAsyncActivity, "this$0");
        AbstractC2995aW.q(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        WD.R(C2734Rq.f3684a, new C3501g9(baseAsyncActivity, view, null));
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        C5160z4.m289updateAppSetID$lambda2((C5160z4) this.f5116a, (AppSetIdInfo) obj);
    }

    public /* synthetic */ C4808v4(Object obj, int i) {
        this.f5116a = obj;
    }
}
