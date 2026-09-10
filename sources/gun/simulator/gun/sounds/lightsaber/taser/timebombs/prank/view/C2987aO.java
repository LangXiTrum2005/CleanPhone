package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.aO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2987aO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f4120a;
    public final Uri b;
    public final FC c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final AC g;
    public final byte[] h;

    public C2987aO(ZN zn) {
        boolean z = zn.f;
        Uri uri = zn.b;
        FW.s((z && uri == null) ? false : true);
        UUID uuid = zn.f4068a;
        uuid.getClass();
        this.f4120a = uuid;
        this.b = uri;
        this.c = zn.c;
        this.d = zn.d;
        this.f = zn.f;
        this.e = zn.e;
        this.g = zn.g;
        byte[] bArr = zn.h;
        this.h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2987aO)) {
            return false;
        }
        C2987aO c2987aO = (C2987aO) obj;
        return this.f4120a.equals(c2987aO.f4120a) && Ug0.a(this.b, c2987aO.b) && Ug0.a(this.c, c2987aO.c) && this.d == c2987aO.d && this.f == c2987aO.f && this.e == c2987aO.e && this.g.equals(c2987aO.g) && Arrays.equals(this.h, c2987aO.h);
    }

    public final int hashCode() {
        int iHashCode = this.f4120a.hashCode() * 31;
        Uri uri = this.b;
        return Arrays.hashCode(this.h) + ((this.g.hashCode() + ((((((((this.c.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
