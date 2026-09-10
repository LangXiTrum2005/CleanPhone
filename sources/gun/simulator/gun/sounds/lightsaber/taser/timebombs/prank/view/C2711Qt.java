package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Qt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2711Qt extends AbstractC4460r6 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2711Qt(AssetManager assetManager, String str, int i) {
        super(assetManager, str, 0);
        this.e = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final Class a() {
        switch (this.e) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4460r6
    public final void d(Object obj) throws IOException {
        switch (this.e) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((InputStream) obj).close();
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4460r6
    public final Closeable f(AssetManager assetManager, String str) {
        switch (this.e) {
            case 0:
                return assetManager.openFd(str);
            default:
                return assetManager.open(str);
        }
    }
}
