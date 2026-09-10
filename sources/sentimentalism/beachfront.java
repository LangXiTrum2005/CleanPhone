package sentimentalism;

import android.util.Pair;
import com.airbnb.lottie.network.FileExtension;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: NetworkCache.java */
/* JADX INFO: loaded from: classes.dex */
public class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final wireman f37513attabal;

    public beachfront(wireman wiremanVar) {
        this.f37513attabal = wiremanVar;
    }

    public static String saneness(String str, FileExtension fileExtension, boolean z) {
        String strTempExtension = z ? fileExtension.tempExtension() : fileExtension.extension;
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strTempExtension.length();
        if (strReplaceAll.length() > length) {
            strReplaceAll = wireman(strReplaceAll, length);
        }
        return "lottie_cache_" + strReplaceAll + strTempExtension;
    }

    public static String wireman(String str, int i) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return str.substring(0, i);
        }
    }

    public Pair<FileExtension, InputStream> attabal(String str) {
        FileExtension fileExtension;
        try {
            File fileDern = dern(str);
            if (fileDern == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileDern);
            if (fileDern.getAbsolutePath().endsWith(".zip")) {
                fileExtension = FileExtension.ZIP;
            } else {
                fileExtension = fileDern.getAbsolutePath().endsWith(".gz") ? FileExtension.GZIP : FileExtension.JSON;
            }
            utwa.beachfront.attabal("Cache hit for " + str + " at " + fileDern.getAbsolutePath());
            return new Pair<>(fileExtension, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public void beachfront(String str, FileExtension fileExtension) {
        File file = new File(marial(), saneness(str, fileExtension, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        utwa.beachfront.attabal("Copying temp file to real file (" + file2 + ")");
        if (zRenameTo) {
            return;
        }
        utwa.beachfront.dern("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    public File competently(String str, InputStream inputStream, FileExtension fileExtension) throws IOException {
        File file = new File(marial(), saneness(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }

    public final File dern(String str) throws FileNotFoundException {
        File file = new File(marial(), saneness(str, FileExtension.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(marial(), saneness(str, FileExtension.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(marial(), saneness(str, FileExtension.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    public final File marial() {
        File fileAttabal = this.f37513attabal.attabal();
        if (fileAttabal.isFile()) {
            fileAttabal.delete();
        }
        if (!fileAttabal.exists()) {
            fileAttabal.mkdirs();
        }
        return fileAttabal;
    }
}
