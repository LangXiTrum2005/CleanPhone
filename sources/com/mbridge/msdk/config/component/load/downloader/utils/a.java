package com.mbridge.msdk.config.component.load.downloader.utils;

import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import java.io.File;
import java.io.FileFilter;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.utils.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0107a implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.exists();
        }
    }

    public static void a(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (Exception e10) {
            q0.a("closeStream", e10.getLocalizedMessage());
        }
    }

    public static boolean b(Object obj) {
        return obj == null;
    }

    public static boolean b(File file) {
        if (file == null) {
            return false;
        }
        boolean zExists = file.exists();
        return !zExists ? a(file) : zExists;
    }

    public static void a(com.mbridge.msdk.config.component.load.downloader.resource.stream.a aVar) {
        if (aVar == null) {
            return;
        }
        try {
            aVar.close();
        } catch (Exception e10) {
            q0.a("closeStream", e10.getLocalizedMessage());
        }
    }

    public static void a(a0 a0Var) {
        if (a0Var == null) {
            return;
        }
        try {
            if (a0Var.d() != null) {
                a0Var.d().close();
            }
            a0Var.close();
        } catch (Exception e10) {
            q0.a("closeStream", e10.getLocalizedMessage());
        }
    }

    public static void a(b0 b0Var) {
        if (b0Var == null) {
            return;
        }
        try {
            b0Var.close();
        } catch (Exception e10) {
            q0.a("closeStream", e10.getLocalizedMessage());
        }
    }

    private static boolean a(File file) {
        File[] fileArrListFiles;
        try {
            fileArrListFiles = file.getParentFile().listFiles(new C0107a());
        } catch (Exception e10) {
            q0.a("doubleCheckExists", e10.getLocalizedMessage());
            fileArrListFiles = null;
        }
        return fileArrListFiles != null && file.length() > 0;
    }

    public static boolean a(Object obj) {
        return !b(obj);
    }
}
