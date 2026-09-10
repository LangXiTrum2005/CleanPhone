package com.bykv.vk.openvk.preload.geckox.utils;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[] f13021a = {80, 75, 3, 4};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static byte[] f13022b = {80, 75, 5, 6};

    public static void a(InputStream inputStream, String str, String str2) throws Exception {
        Closeable closeable = null;
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            ZipInputStream zipInputStream = new ZipInputStream(inputStream);
            boolean z2 = false;
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        if (z2) {
                            CloseableUtils.close(zipInputStream);
                            return;
                        }
                        inputStream.reset();
                        if (!a(inputStream)) {
                            throw new RuntimeException("not zip file  channel:".concat(String.valueOf(str2)));
                        }
                        throw new RuntimeException("unzip file: channel:".concat(String.valueOf(str2)));
                    }
                    String name = nextEntry.getName();
                    if (!name.startsWith("__MACOSX/") && !name.equals(".DS_Store") && !name.contains("../")) {
                        if (!name.startsWith(str2 + File.separator)) {
                            throw new RuntimeException("the zip package outermost folder is not named by channel channel:".concat(String.valueOf(str2)));
                        }
                        if (nextEntry.isDirectory()) {
                            File file = new File(canonicalPath, name);
                            if (!file.getCanonicalPath().startsWith(canonicalPath)) {
                                throw new RuntimeException("directory traversal, dir:" + name + ", channel:" + str2);
                            }
                            file.mkdirs();
                        } else {
                            String canonicalPath2 = new File(canonicalPath, name).getCanonicalPath();
                            if (!canonicalPath2.startsWith(canonicalPath)) {
                                throw new RuntimeException("directory traversal, file name:".concat(name));
                            }
                            File file2 = new File(canonicalPath2);
                            file2.getParentFile().mkdirs();
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                try {
                                    b.a(zipInputStream, fileOutputStream);
                                    CloseableUtils.close(fileOutputStream);
                                } catch (Throwable th) {
                                    th = th;
                                    closeable = fileOutputStream;
                                    CloseableUtils.close(closeable);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                    z2 = true;
                } catch (Throwable th3) {
                    th = th3;
                    closeable = zipInputStream;
                    CloseableUtils.close(closeable);
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private static boolean a(InputStream inputStream) throws Exception {
        try {
            byte[] bArr = new byte[4];
            if (inputStream.read(bArr, 0, 4) == 4) {
                return Arrays.equals(f13021a, bArr) || Arrays.equals(f13022b, bArr);
            }
            return false;
        } finally {
            CloseableUtils.close(inputStream);
        }
    }
}
