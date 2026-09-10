package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.annotation.VisibleForTesting;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3542gg0 {
    private static final int BUFFER_SIZE = 4096;
    public static final C3542gg0 INSTANCE = new C3542gg0();
    private static final String TAG = C3542gg0.class.getCanonicalName();

    private C3542gg0() {
    }

    public static /* synthetic */ List unzip$default(C3542gg0 c3542gg0, String str, String str2, InterfaceC3366eg0 interfaceC3366eg0, int i, Object obj) throws IOException {
        if ((i & 4) != 0) {
            interfaceC3366eg0 = null;
        }
        return c3542gg0.unzip(str, str2, interfaceC3366eg0);
    }

    private final String validateFilename(String str, String str2) throws IOException {
        String canonicalPath = new File(str).getCanonicalPath();
        String canonicalPath2 = new File(str2).getCanonicalPath();
        AbstractC2995aW.p(canonicalPath, "canonicalPath");
        AbstractC2995aW.p(canonicalPath2, "canonicalID");
        if (AbstractC3089ba0.N0(canonicalPath, canonicalPath2, false)) {
            return canonicalPath;
        }
        C4829vJ c4829vJ = C4917wJ.Companion;
        String str3 = TAG;
        AbstractC2995aW.p(str3, "TAG");
        c4829vJ.e(str3, "File is outside extraction target directory.");
        throw new C3454fg0("File is outside extraction target directory.");
    }

    @VisibleForTesting
    public final void extractFile(InputStream inputStream, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        AbstractC2995aW.q(inputStream, "zipIn");
        File file = new File(str);
        C3300du.delete(file);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            fileOutputStream = new FileOutputStream(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            C3300du c3300du = C3300du.INSTANCE;
                            c3300du.closeQuietly(inputStream);
                            c3300du.closeQuietly(bufferedOutputStream);
                            c3300du.closeQuietly(fileOutputStream);
                            return;
                        }
                        bufferedOutputStream.write(bArr, 0, i);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C3300du c3300du2 = C3300du.INSTANCE;
                    c3300du2.closeQuietly(inputStream);
                    c3300du2.closeQuietly(bufferedOutputStream);
                    c3300du2.closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = null;
            }
        } catch (Throwable th4) {
            fileOutputStream = null;
            th = th4;
            bufferedOutputStream = null;
        }
    }

    public final List<File> unzip(String str, String str2) throws IOException {
        AbstractC2995aW.q(str2, "destDirectory");
        return unzip$default(this, str, str2, null, 4, null);
    }

    public final List<File> unzip(String str, String str2, InterfaceC3366eg0 interfaceC3366eg0) throws IOException {
        AbstractC2995aW.q(str2, "destDirectory");
        if (str == null || str.length() == 0) {
            throw new IOException("Path is empty");
        }
        File file = new File(str);
        if (!file.exists()) {
            throw new IOException("File does not exist");
        }
        File file2 = new File(str2);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = null;
        try {
            ZipFile zipFile2 = new ZipFile(file);
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile2.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    String str3 = str2 + File.separator + zipEntryNextElement.getName();
                    if (interfaceC3366eg0 == null || ((C3237d9) interfaceC3366eg0).matches(str3)) {
                        validateFilename(str3, str2);
                        if (zipEntryNextElement.isDirectory()) {
                            File file3 = new File(str3);
                            if (!file3.exists()) {
                                file3.mkdirs();
                            }
                        } else {
                            InputStream inputStream = zipFile2.getInputStream(zipEntryNextElement);
                            AbstractC2995aW.p(inputStream, "zipFile.getInputStream(entry)");
                            extractFile(inputStream, str3);
                            arrayList.add(new File(str3));
                        }
                    }
                }
                try {
                    zipFile2.close();
                } catch (IOException unused) {
                }
                return arrayList;
            } catch (Throwable th) {
                th = th;
                zipFile = zipFile2;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
