package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class LW implements ModelLoaderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f3354a;
    public Serializable b;

    public LW() {
        this.f3354a = null;
        this.b = null;
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final FP z(C3166cQ c3166cQ) {
        return new OW((Context) this.f3354a, c3166cQ.c(File.class, (Class) this.b), c3166cQ.c(Uri.class, (Class) this.b), (Class) this.b);
    }

    public LW(Context context, Class cls) {
        this.f3354a = context;
        this.b = cls;
    }
}
