package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3306e implements InterfaceC3328eB {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f4299a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public AbstractApplicationC2673Ph d = null;
    public Om0 e = null;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3328eB
    public final C3872kT d() {
        return ((Om0) k()).i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3328eB
    public final AbstractApplicationC2673Ph g() {
        return this.d;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3328eB
    public final boolean h() {
        if (((Om0) k()).u == null) {
            return true;
        }
        ((Om0) k()).u.getClass();
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3328eB
    public final Context j() {
        AbstractApplicationC2673Ph abstractApplicationC2673Ph = this.d;
        if (abstractApplicationC2673Ph != null) {
            return abstractApplicationC2673Ph.getApplicationContext();
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3328eB
    public final InterfaceC3416fB k() {
        Om0 om0 = this.e;
        if (om0 != null) {
            return om0;
        }
        byte[] bArr = {0, -29, -27, 57, -104, -73, -25, 17, 53, -24, -80, 124, -109, -70, -21, 17, 45, -23, -80, 59, -87, -66, -5, 1, 24, -24, -46, 108, -126, -77, -20, 34, 56, -17, -28, 118, -103, -90, -90, 3, 60, -8, -47, 125, -87, -86, -31, 8, 61, -23, -30, 49, -62, -15, -22, 17, 48, -32, -12, 49, -118, -81, -8, 72, 121, -19, -12, 91, -98, -74, -28, 0, 60, -2, -71, 59, -53, -71, -31, 22, 42, -8, -4, 96, -54};
        byte[] bArr2 = {89, -116, -112, 25, -21, -33, -120, 100};
        int i = 0;
        int i2 = 0;
        while (i < 85) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        throw null;
    }

    public final LD n() {
        return ((Om0) k()).d;
    }

    public final UZ o() {
        return ((Om0) k()).e;
    }
}
