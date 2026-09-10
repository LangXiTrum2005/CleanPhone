package glutethimide;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: StreamEncoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class dovishness implements maggot.attabal<InputStream> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final trawler.saneness f27231attabal;

    public dovishness(trawler.saneness sanenessVar) {
        this.f27231attabal = sanenessVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // maggot.attabal
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public boolean attabal(InputStream inputStream, File file, maggot.wireman wiremanVar) throws Throwable {
        byte[] bArr = (byte[]) this.f27231attabal.dern(65536, byte[].class);
        boolean z = false;
        ?? r1 = 0;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i = inputStream.read(bArr);
                        r1 = -1;
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    } catch (IOException unused) {
                        fileOutputStream = fileOutputStream2;
                        Log.isLoggable("StreamEncoder", 3);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        this.f27231attabal.put(bArr);
                        r1 = fileOutputStream;
                    } catch (Throwable th) {
                        th = th;
                        r1 = fileOutputStream2;
                        if (r1 != 0) {
                            try {
                                r1.close();
                            } catch (IOException unused3) {
                            }
                        }
                        this.f27231attabal.put(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused4) {
                }
                this.f27231attabal.put(bArr);
                z = true;
            } catch (IOException unused5) {
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
