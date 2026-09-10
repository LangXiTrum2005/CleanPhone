package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityRussianRouletteBinding;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.s10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4539s10 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3086bY f4958a;
    public C3086bY b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ RussianRouletteActivity e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4539s10(RussianRouletteActivity russianRouletteActivity, int i, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.e = russianRouletteActivity;
        this.f = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C4539s10 c4539s10 = new C4539s10(this.e, this.f, interfaceC2857Wj);
        c4539s10.d = obj;
        return c4539s10;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C4539s10) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        C3086bY c3086bY;
        C3086bY c3086bY2;
        C3086bY c3086bY3;
        Bitmap bitmapDecodeResource;
        SurfaceHolder holder;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.c;
        RussianRouletteActivity russianRouletteActivity = this.e;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            ((ActivityRussianRouletteBinding) russianRouletteActivity.getMBinding()).surfaceRoot.setVisibility(0);
            russianRouletteActivity.g = new SurfaceView(russianRouletteActivity);
            ((ActivityRussianRouletteBinding) russianRouletteActivity.getMBinding()).surfaceRoot.addView(russianRouletteActivity.g, new ViewGroup.LayoutParams(-1, -1));
            C3086bY c3086bY4 = new C3086bY();
            try {
                C4364q10 c4364q10 = new C4364q10(russianRouletteActivity, this.f, null);
                this.d = c3086bY4;
                this.f4958a = c3086bY4;
                this.b = c3086bY4;
                this.c = 1;
                Object objX = WD.X(c4364q10, AbstractC4437qp.b, this);
                if (objX == enumC4602sk) {
                    return enumC4602sk;
                }
                c3086bY3 = c3086bY4;
                c3086bY2 = c3086bY3;
                obj = objX;
                c3086bY = c3086bY2;
            } catch (Exception unused) {
                c3086bY = c3086bY4;
                c3086bY2 = c3086bY;
                bitmapDecodeResource = BitmapFactory.decodeResource(russianRouletteActivity.getResources(), R.drawable.bg_scene_russain_roulette);
                c3086bY3 = c3086bY;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3086bY3 = this.b;
            c3086bY = this.f4958a;
            c3086bY2 = (C3086bY) this.d;
            try {
                AbstractC3375el.b0(obj);
            } catch (Exception unused2) {
                bitmapDecodeResource = BitmapFactory.decodeResource(russianRouletteActivity.getResources(), R.drawable.bg_scene_russain_roulette);
                c3086bY3 = c3086bY;
            }
        }
        bitmapDecodeResource = (Bitmap) obj;
        c3086bY3.f4172a = bitmapDecodeResource;
        SurfaceView surfaceView = russianRouletteActivity.g;
        if (surfaceView == null || (holder = surfaceView.getHolder()) == null) {
            return null;
        }
        holder.addCallback(new SurfaceHolderCallbackC4451r10(c3086bY2, russianRouletteActivity));
        return C5033xf0.f5238a;
    }
}
