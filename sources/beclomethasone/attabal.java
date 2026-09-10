package beclomethasone;

import java.io.File;

/* JADX INFO: compiled from: FileService.java */
/* JADX INFO: loaded from: classes2.dex */
public class attabal {
    public boolean attabal(File file) {
        return file.exists();
    }

    public long dern(File file) {
        return file.length();
    }

    public File saneness(String str) {
        return new File(str);
    }
}
