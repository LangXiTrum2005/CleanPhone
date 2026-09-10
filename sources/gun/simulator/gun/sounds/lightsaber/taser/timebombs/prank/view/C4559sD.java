package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaPlayer;
import androidx.lifecycle.LifecycleOwnerKt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponSortActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4559sD implements InterfaceC4968wt, HS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4968a;

    public /* synthetic */ C4559sD(Object obj) {
        this.f4968a = obj;
    }

    public void a(String str, String str2) {
        BC bc = (BC) this.f4968a;
        String strB = S00.b(str.trim());
        String strTrim = str2.trim();
        bc.getClass();
        FW.k(strB, strTrim);
        C2698Qg c2698Qg = bc.f3208a;
        Collection arrayList = (Collection) c2698Qg.get(strB);
        if (arrayList == null) {
            arrayList = new ArrayList();
            c2698Qg.put(strB, arrayList);
        }
        arrayList.add(strTrim);
    }

    public void b(List list) {
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = Ug0.f3833a;
            String[] strArrSplit = str.split(":\\s?", 2);
            if (strArrSplit.length == 2) {
                a(strArrSplit[0], strArrSplit[1]);
            }
        }
    }

    public S00 c() {
        return new S00(this);
    }

    public void f() {
        Object obj = this.f4968a;
        ((Z00) obj).o = false;
        ((Z00) obj).v();
    }

    public void g(C3662i10 c3662i10) {
        Z00 z00 = (Z00) this.f4968a;
        long j = c3662i10.f4484a;
        long j2 = c3662i10.b;
        z00.n = Ug0.L(j2 - j);
        z00.o = !(j2 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
        z00.p = j2 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        z00.q = false;
        z00.v();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5194zW
    public Object get() {
        return this.f4968a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public void h(boolean z) {
        WeaponSortActivity weaponSortActivity = (WeaponSortActivity) this.f4968a;
        WD.D(LifecycleOwnerKt.getLifecycleScope(weaponSortActivity), null, 0, new C5131yk0(weaponSortActivity, null), 3);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public void onAdClosed() {
        C2498In c2498In = App.n;
        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new A8(2, null), 2);
        MediaPlayer mediaPlayer = BF.g;
        if (mediaPlayer != null) {
            MediaPlayer mediaPlayer2 = mediaPlayer.isPlaying() ^ true ? mediaPlayer : null;
            if (mediaPlayer2 != null) {
                mediaPlayer2.start();
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public void onAdShowed() {
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2 = BF.g;
        if (mediaPlayer2 == null || !mediaPlayer2.isPlaying() || (mediaPlayer = BF.g) == null) {
            return;
        }
        mediaPlayer.pause();
    }

    public C4559sD() {
        this.f4968a = new BC();
    }

    public C4559sD(String str, String str2, int i) {
        this();
        a("User-Agent", str);
        a("CSeq", String.valueOf(i));
        if (str2 != null) {
            a("Session", str2);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public /* synthetic */ void onAdClicked() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public /* synthetic */ void onAdImpression() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public void d(A70 a70) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public /* synthetic */ void e(InterfaceC3240dB interfaceC3240dB) {
    }
}
