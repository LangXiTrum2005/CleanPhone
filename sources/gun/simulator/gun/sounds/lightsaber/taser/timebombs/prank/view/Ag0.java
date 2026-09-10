package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.ContentResolver;
import android.net.Uri;
import com.bumptech.glide.load.model.ModelLoaderFactory;

/* JADX INFO: loaded from: classes.dex */
public final class Ag0 implements ModelLoaderFactory, Bg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2828a;
    public final ContentResolver b;

    public /* synthetic */ Ag0(ContentResolver contentResolver, int i) {
        this.f2828a = i;
        this.b = contentResolver;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bg0
    public final InterfaceC3551gl i(Uri uri) {
        int i = this.f2828a;
        ContentResolver contentResolver = this.b;
        switch (i) {
            case 0:
                return new C4373q6(contentResolver, uri, 0);
            default:
                return new I90(contentResolver, uri, 1);
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final FP z(C3166cQ c3166cQ) {
        switch (this.f2828a) {
            case 0:
                break;
        }
        return new Cg0(this);
    }
}
