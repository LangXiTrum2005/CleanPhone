package umbriferous;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: FileBackedNativeSessionFile.java */
/* JADX INFO: loaded from: classes3.dex */
public class yemenite implements merc {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final File f39221attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f39222dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f39223saneness;

    public yemenite(String str, String str2, File file) {
        this.f39223saneness = str;
        this.f39222dern = str2;
        this.f39221attabal = file;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private byte[] dern() {
        byte[] bArr = new byte[8192];
        try {
            InputStream stream = getStream();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (stream == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (stream != null) {
                            stream.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int i = stream.read(bArr);
                            if (i <= 0) {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                stream.close();
                                return byteArray;
                            }
                            gZIPOutputStream.write(bArr, 0, i);
                        } catch (Throwable th) {
                            try {
                                gZIPOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    byteArrayOutputStream.close();
                    throw th4;
                }
            } catch (Throwable th5) {
                if (stream != null) {
                    try {
                        stream.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
            if (stream != null) {
                stream.close();
            }
            throw th5;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // umbriferous.merc
    public amount.sealless.wireman.saneness attabal() {
        byte[] bArrDern = dern();
        if (bArrDern != null) {
            return amount.sealless.wireman.saneness.attabal().saneness(bArrDern).dern(this.f39223saneness).attabal();
        }
        return null;
    }

    @Override // umbriferous.merc
    public InputStream getStream() {
        if (this.f39221attabal.exists() && this.f39221attabal.isFile()) {
            try {
                return new FileInputStream(this.f39221attabal);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // umbriferous.merc
    public String saneness() {
        return this.f39222dern;
    }
}
