package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Zt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2945Zt implements InterfaceC3035au {
    public final void a(File file) throws IOException {
        AbstractC2995aW.q(file, "file");
        if (!file.delete() && file.exists()) {
            throw new IOException(AbstractC2995aW.v0(file, "failed to delete "));
        }
    }

    public final void b(File file) throws IOException {
        AbstractC2995aW.q(file, "directory");
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException(AbstractC2995aW.v0(file, "not a readable directory: "));
        }
        int length = fileArrListFiles.length;
        int i = 0;
        while (i < length) {
            File file2 = fileArrListFiles[i];
            i++;
            if (file2.isDirectory()) {
                b(file2);
            }
            if (!file2.delete()) {
                throw new IOException(AbstractC2995aW.v0(file2, "failed to delete "));
            }
        }
    }

    public final boolean c(File file) {
        AbstractC2995aW.q(file, "file");
        return file.exists();
    }

    public final void d(File file, File file2) throws IOException {
        AbstractC2995aW.q(file, TypedValues.TransitionType.S_FROM);
        AbstractC2995aW.q(file2, TypedValues.TransitionType.S_TO);
        a(file2);
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException("failed to rename " + file + " to " + file2);
    }

    public final C5076y6 e(File file) {
        AbstractC2995aW.q(file, "file");
        try {
            return AbstractC4496rb.w(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return AbstractC4496rb.w(file);
        }
    }

    public final String toString() {
        return "FileSystem.SYSTEM";
    }
}
