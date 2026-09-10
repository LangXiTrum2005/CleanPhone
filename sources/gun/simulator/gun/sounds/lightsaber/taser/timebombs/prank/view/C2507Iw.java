package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.UUID;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Iw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2507Iw implements InterfaceC2287Ak {
    public static final boolean d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f3247a;
    public final byte[] b;
    public final boolean c;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z;
        if ("Amazon".equals(Ug0.c)) {
            String str = Ug0.d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        d = z;
    }

    public C2507Iw(UUID uuid, byte[] bArr, boolean z) {
        this.f3247a = uuid;
        this.b = bArr;
        this.c = z;
    }
}
