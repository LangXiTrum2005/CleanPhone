package com.smartdigimkt.s;

import android.text.TextUtils;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f38149a;

    private a() {
    }

    public static a a() {
        if (f38149a == null) {
            synchronized (a.class) {
                try {
                    if (f38149a == null) {
                        f38149a = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f38149a;
    }

    public void a(String str, String str2) throws Throwable {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            new c().a(str, str2);
            return;
        }
        throw new IOException("zipFilePath or destDirectory is null");
    }

    public void a(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        for (File file2 : file.listFiles()) {
            a(new File(file2.getAbsolutePath()));
        }
        file.delete();
    }
}
