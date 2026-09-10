package com.inmobi.media;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Ge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f22851a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f22852b = Charset.forName("UTF-8");

    public static String a(InputStreamReader inputStreamReader) throws IOException {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int i2 = inputStreamReader.read(cArr);
                if (i2 == -1) {
                    return stringWriter.toString();
                }
                stringWriter.write(cArr, 0, i2);
            }
        } finally {
            inputStreamReader.close();
        }
    }

    public static void a(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    a(file2);
                }
                if (!file2.delete()) {
                    throw new IOException(android.support.v4.media.a.l(file2, "failed to delete file: "));
                }
            }
            return;
        }
        throw new IOException(android.support.v4.media.a.l(file, "not a readable directory: "));
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }
}
