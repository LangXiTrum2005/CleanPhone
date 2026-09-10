package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class Wg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f3932a = Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.ASCII_NAME);

    static {
        Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
    }

    public static void a(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }
}
