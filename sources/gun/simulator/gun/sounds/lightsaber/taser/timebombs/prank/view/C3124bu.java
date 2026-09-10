package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3124bu extends IOException {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3124bu(int i, int i2) {
        this(i, "Http request failed", (IOException) null);
        if (i2 != 1) {
        }
    }

    public C3124bu(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": ".concat(str));
        }
        String string = sb.toString();
        AbstractC2995aW.p(string, "sb.toString()");
        super(string);
    }

    public C3124bu(int i, String str, IOException iOException) {
        super(str + ", status code: " + i, iOException);
    }

    public C3124bu(Exception exc) {
        super(exc);
    }
}
