package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.SharedPreferences;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4392qL extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4878a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4392qL(MainActivity mainActivity, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4878a = mainActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C4392qL(this.f4878a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C4392qL) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        boolean z;
        AbstractC3375el.b0(obj);
        Object obj2 = C3850k80.f4589a;
        SharedPreferences sharedPreferencesB = C3850k80.b(this.f4878a, "SpHelper");
        long j = sharedPreferencesB.getLong("EXIT_RETAIN_DIALOG_LAST_SHOW_TIME", 1L);
        int i = sharedPreferencesB.getInt("EXIT_RETAIN_DIALOG_SHOW_COUNTS", 4);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j <= 0 || i <= 0 || jCurrentTimeMillis - j <= 86400000) {
            z = false;
        } else {
            SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
            editorEdit.putLong("EXIT_RETAIN_DIALOG_LAST_SHOW_TIME", jCurrentTimeMillis);
            z = true;
            editorEdit.putInt("EXIT_RETAIN_DIALOG_SHOW_COUNTS", i - 1);
            editorEdit.apply();
        }
        return Boolean.valueOf(z);
    }
}
