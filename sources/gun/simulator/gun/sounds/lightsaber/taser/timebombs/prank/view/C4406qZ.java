package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import com.bumptech.glide.load.model.ModelLoaderFactory;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4406qZ implements ModelLoaderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4886a;
    public final Resources b;

    public /* synthetic */ C4406qZ(Resources resources, int i) {
        this.f4886a = i;
        this.b = resources;
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final FP z(C3166cQ c3166cQ) {
        int i = this.f4886a;
        Resources resources = this.b;
        switch (i) {
            case 0:
                return new C2862Wo(resources, c3166cQ.c(Uri.class, AssetFileDescriptor.class));
            default:
                return new C2862Wo(resources, Af0.f2827a);
        }
    }
}
