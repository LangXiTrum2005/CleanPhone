package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.f70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC3410f70 {
    BombBtnC4("weaponsound/bomb/bomb_btn_c4.ogg"),
    BombBtn("weaponsound/bomb/bomb_btn.ogg"),
    BombVirtualBtn("weaponsound/bomb/bomb_virtual_btn.ogg"),
    BombByoyomi("weaponsound/bomb/bomb_byoyomi.MP3"),
    BombFastByoyomi("weaponsound/bomb/bomb_fast_byoyomi.MP3"),
    EmptyAudio("weaponsound/empty_audio.MP3");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4353a;
    public int b = -1;

    EnumC3410f70(String str) {
        this.f4353a = str;
    }

    public static Object b(EnumC3410f70 enumC3410f70, InterfaceC2857Wj interfaceC2857Wj) {
        return WD.X(new C3145c70(enumC3410f70, 0, null), AbstractC4437qp.b, interfaceC2857Wj);
    }

    public static void c(EnumC3410f70 enumC3410f70) throws Throwable {
        enumC3410f70.getClass();
        WD.R(C2734Rq.f3684a, new C3322e70(enumC3410f70, 0, null));
    }

    public final Object a(InterfaceC2857Wj interfaceC2857Wj) {
        return WD.X(new C3057b70(this, null), AbstractC4437qp.b, interfaceC2857Wj);
    }
}
