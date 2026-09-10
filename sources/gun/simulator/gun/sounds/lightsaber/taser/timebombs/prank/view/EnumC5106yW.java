package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC5106yW {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5279a;

    EnumC5106yW(String str) {
        this.f5279a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f5279a;
    }
}
