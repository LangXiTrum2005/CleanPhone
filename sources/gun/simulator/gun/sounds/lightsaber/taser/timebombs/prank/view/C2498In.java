package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.components.ComponentRegistrar;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.In, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2498In implements PI, LI, InterfaceC3893kh, BS {
    public static C2498In b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3239a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2498In() {
        this(3);
        this.f3239a = 3;
    }

    public static byte[] c(List list) {
        ArrayList<? extends Parcelable> arrayListG0 = FW.g0(list);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(com.umeng.analytics.pro.bc.aL, arrayListG0);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static InterfaceC4514rk g() {
        return (InterfaceC4514rk) App.p.getValue();
    }

    public static App i() {
        App app = App.o;
        if (app != null) {
            return app;
        }
        AbstractC2995aW.x0("sInstance");
        throw null;
    }

    public static void j(Runnable runnable) {
        WD.D(g(), AbstractC4437qp.b, 0, new C4371q5(runnable, null), 2);
    }

    public static void k(MainActivity mainActivity) {
        AbstractC2995aW.q(mainActivity, "activity");
        mainActivity.startActivity(new Intent(mainActivity, (Class<?>) RussianRouletteActivity.class), null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3893kh
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C3190ch c3190ch : componentRegistrar.getComponents()) {
            String str = c3190ch.f4237a;
            if (str != null) {
                C4475rH c4475rH = new C4475rH(str, c3190ch, 1);
                c3190ch = new C3190ch(str, c3190ch.b, c3190ch.c, c3190ch.d, c3190ch.e, c4475rH, c3190ch.g);
            }
            arrayList.add(c3190ch);
        }
        return arrayList;
    }

    public Date b() {
        switch (this.f3239a) {
            case 7:
                break;
            case 9:
                break;
        }
        return new Date();
    }

    public Context f() {
        AbstractApplicationC2673Ph abstractApplicationC2673Ph = AbstractApplicationC2673Ph.m;
        return abstractApplicationC2673Ph == null ? i() : abstractApplicationC2673Ph;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LI
    public void load() {
        synchronized (AbstractC3147c80.f4208a) {
            Object obj = AbstractC3147c80.b;
            synchronized (obj) {
                if (AbstractC3147c80.c) {
                    return;
                }
                long jA = AbstractC3147c80.a();
                synchronized (obj) {
                    AbstractC3147c80.d = jA;
                    AbstractC3147c80.c = true;
                }
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public void onAdClosed() {
        AbstractApplicationC2673Ph abstractApplicationC2673Ph = AbstractApplicationC2673Ph.m;
        AbstractC2995aW.q(abstractApplicationC2673Ph, com.umeng.analytics.pro.f.X);
        C2498In c2498In = App.n;
        WD.D(g(), AbstractC4437qp.b, 0, new B8(abstractApplicationC2673Ph, null), 2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public void onAdShowed() {
        MediaPlayer mediaPlayer = BF.g;
        if (mediaPlayer != null) {
            try {
                try {
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                    }
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                }
                mediaPlayer.release();
                BF.g = null;
            } catch (Throwable th) {
                mediaPlayer.release();
                BF.g = null;
                throw th;
            }
        }
        BF.g = null;
    }

    public /* synthetic */ C2498In(int i) {
        this.f3239a = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2498In(int i, int i2) {
        this(12);
        this.f3239a = i;
        switch (i) {
            case 13:
                this(13);
                break;
            case 14:
                this(14);
                break;
            case 15:
            default:
                break;
            case 16:
                this(16);
                break;
            case 17:
                this(17);
                break;
            case 18:
                this(18);
                break;
            case 19:
                this(19);
                break;
            case 20:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LI
    public void cancelLoad() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PI
    public void maybeThrowError() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public /* synthetic */ void onAdClicked() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public /* synthetic */ void onAdImpression() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public /* synthetic */ void d(A70 a70) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public /* synthetic */ void e(InterfaceC3240dB interfaceC3240dB) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public void h(boolean z) {
    }
}
