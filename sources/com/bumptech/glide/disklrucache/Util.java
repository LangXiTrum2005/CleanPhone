package com.bumptech.glide.disklrucache;

import android.support.v4.media.a;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
final class Util {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f12325a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    public static void a(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException(a.l(file, "not a readable directory: "));
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                throw new IOException(a.l(file2, "failed to delete file: "));
            }
        }
    }
}
