package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.eu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3388eu extends WD {
    public static void Z(File file, File file2) {
        if (!file.exists()) {
            throw new C2581Lt(file, null, "The source file doesn't exist.", 1);
        }
        if (file2.exists() && !file2.delete()) {
            throw new C2581Lt(file, file2, "Tried to overwrite the destination, but failed to delete it.", 0);
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new C3124bu(file, file2, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                byte[] bArr = new byte[8192];
                for (int i = fileInputStream.read(bArr); i >= 0; i = fileInputStream.read(bArr)) {
                    fileOutputStream.write(bArr, 0, i);
                }
                AbstractC3375el.n(fileOutputStream, null);
                AbstractC3375el.n(fileInputStream, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3375el.n(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC3375el.n(fileInputStream, th3);
                throw th4;
            }
        }
    }
}
