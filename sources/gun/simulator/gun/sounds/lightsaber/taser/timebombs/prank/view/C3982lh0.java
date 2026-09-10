package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3982lh0 implements US {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4658a;
    public final ByteBuffer b;

    public C3982lh0(int i) {
        this.f4658a = i;
        if (i != 1) {
            this.b = ByteBuffer.allocate(8);
        } else {
            this.b = ByteBuffer.allocate(4);
        }
    }

    private void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l = (Long) obj;
        messageDigest.update(bArr);
        synchronized (this.b) {
            this.b.position(0);
            messageDigest.update(this.b.putLong(l.longValue()).array());
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.US
    public final void d(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.f4658a) {
            case 0:
                a(bArr, obj, messageDigest);
                return;
            default:
                Integer num = (Integer) obj;
                if (num == null) {
                    return;
                }
                messageDigest.update(bArr);
                synchronized (this.b) {
                    this.b.position(0);
                    messageDigest.update(this.b.putInt(num.intValue()).array());
                    break;
                }
                return;
        }
    }
}
