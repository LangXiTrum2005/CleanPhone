package com.inmobi.media;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: com.inmobi.media.m7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3128m7 {
    public static final boolean a(String tag, String data, String filePath) {
        Intrinsics.f(tag, "tag");
        Intrinsics.f(data, "data");
        Intrinsics.f(filePath, "filePath");
        try {
            a(filePath);
            File file = new File(filePath);
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bytes = data.getBytes(Charsets.f44691a);
            Intrinsics.e(bytes, "this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
            return true;
        } catch (IOException | RuntimeException unused) {
            return false;
        }
    }

    public static final void a(String filePath) {
        Intrinsics.f(filePath, "filePath");
        File file = new File(filePath);
        if (file.exists() && file.delete()) {
            file.getName();
        }
    }
}
