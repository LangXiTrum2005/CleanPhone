package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class MW extends LW {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MW(Context context, int i) {
        super(context, ParcelFileDescriptor.class);
        if (i != 1) {
        } else {
            super(context, InputStream.class);
        }
    }
}
