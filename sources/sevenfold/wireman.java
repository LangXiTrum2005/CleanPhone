package sevenfold;

import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: GifDrawableEncoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class wireman implements maggot.beachfront<dern> {
    @Override // maggot.attabal
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public boolean attabal(endosteum.cutely<dern> cutelyVar, File file, maggot.wireman wiremanVar) throws Throwable {
        try {
            com.bumptech.glide.util.attabal.beachfront(cutelyVar.get().dern(), file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("GifEncoder", 5);
            return false;
        }
    }

    @Override // maggot.beachfront
    public EncodeStrategy saneness(maggot.wireman wiremanVar) {
        return EncodeStrategy.SOURCE;
    }
}
