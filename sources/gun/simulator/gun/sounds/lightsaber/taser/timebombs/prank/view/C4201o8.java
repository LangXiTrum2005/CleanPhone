package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.o8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4201o8 extends Rd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f4780a;
    public byte[] b;
    public HV c;

    public final C4289p8 a() {
        String strConcat = this.f4780a == null ? " backendName" : "";
        if (this.c == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new C4289p8(this.f4780a, this.b, this.c);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public final C4201o8 b(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f4780a = str;
        return this;
    }

    public final C4201o8 c(HV hv) {
        if (hv == null) {
            throw new NullPointerException("Null priority");
        }
        this.c = hv;
        return this;
    }
}
