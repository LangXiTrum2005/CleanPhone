package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC4302pJ implements InterfaceC4578sW {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4830a;

    EnumC4302pJ(int i2) {
        this.f4830a = i2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4578sW
    public final int getNumber() {
        return this.f4830a;
    }
}
