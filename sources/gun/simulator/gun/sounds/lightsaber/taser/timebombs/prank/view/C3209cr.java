package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3209cr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3736ir f4247a;
    public final byte[] b;

    public C3209cr(C3736ir c3736ir, byte[] bArr) {
        if (c3736ir == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f4247a = c3736ir;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3209cr)) {
            return false;
        }
        C3209cr c3209cr = (C3209cr) obj;
        if (this.f4247a.equals(c3209cr.f4247a)) {
            return Arrays.equals(this.b, c3209cr.b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f4247a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f4247a + ", bytes=[...]}";
    }
}
