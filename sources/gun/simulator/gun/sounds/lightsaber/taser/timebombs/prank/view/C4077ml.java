package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4077ml implements InterfaceC3901kl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4712a;

    public /* synthetic */ C4077ml(int i) {
        this.f4712a = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3901kl
    public final Class a() {
        switch (this.f4712a) {
            case 0:
                throw new UnsupportedOperationException("Not implemented");
            case 1:
                return ParcelFileDescriptor.class;
            default:
                return ByteBuffer.class;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3901kl
    public final InterfaceC3989ll b(Object obj) {
        switch (this.f4712a) {
            case 0:
                return new com.bumptech.glide.load.data.a(obj);
            case 1:
                return new com.bumptech.glide.load.data.a((ParcelFileDescriptor) obj);
            default:
                return new C4081mn((ByteBuffer) obj);
        }
    }
}
