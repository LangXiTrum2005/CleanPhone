package com.bytedance.sdk.openadsdk.multipro;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.kqm;
import com.bytedance.sdk.component.utils.sLN;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    private static final AtomicBoolean LD = new AtomicBoolean(false);
    private static boolean Lxb = true;

    /* JADX WARN: Code duplicated, block: B:65:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[SYNTHETIC] */
    private static void LD(Context context) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel channel;
        Throwable th;
        String strLD = LD();
        File file = new File(context.getDir(TextUtils.isEmpty(strLD) ? "webview" : "webview_".concat(String.valueOf(strLD)), 0).getPath(), "webview_data.lock");
        file.getAbsolutePath();
        if (!file.exists()) {
            return;
        }
        FileChannel fileChannel = null;
        FileLock fileLockTryLock = null;
        fileChannel = null;
        fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                try {
                    channel = randomAccessFile.getChannel();
                    if (channel != null) {
                        try {
                            fileLockTryLock = channel.tryLock();
                        } catch (Exception unused) {
                            fileChannel = channel;
                            Lxb(file);
                            if (fileChannel != null) {
                                try {
                                    fileChannel.close();
                                } catch (Throwable th2) {
                                    th2.getMessage();
                                }
                            }
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                    return;
                                } catch (Throwable th3) {
                                    th3.getMessage();
                                    return;
                                }
                            }
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            if (channel != null) {
                                try {
                                    channel.close();
                                } catch (Throwable th5) {
                                    th5.getMessage();
                                }
                            }
                            if (randomAccessFile == null) {
                                throw th;
                            }
                            try {
                                randomAccessFile.close();
                                throw th;
                            } catch (Throwable th6) {
                                th6.getMessage();
                                throw th;
                            }
                        }
                    }
                    if (fileLockTryLock != null) {
                        fileLockTryLock.close();
                    } else {
                        Lxb(file);
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (Throwable th7) {
                            th7.getMessage();
                        }
                    }
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th8) {
                        th8.getMessage();
                    }
                } catch (Throwable th9) {
                    th = th9;
                    channel = fileChannel;
                    th = th;
                    if (channel != null) {
                        channel.close();
                    }
                    if (randomAccessFile == null) {
                        throw th;
                    }
                    randomAccessFile.close();
                    throw th;
                }
            } catch (Exception unused2) {
            }
        } catch (Exception unused3) {
            randomAccessFile = null;
        } catch (Throwable th10) {
            th = th10;
            randomAccessFile = null;
            channel = null;
            th = th;
            if (channel != null) {
                channel.close();
            }
            if (randomAccessFile == null) {
                throw th;
            }
            randomAccessFile.close();
            throw th;
        }
    }

    public static void Lxb(Context context) {
        if (context != null && Lxb && LD.compareAndSet(false, true)) {
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    if (kqm.Lxb(context)) {
                        LD(context);
                        return;
                    }
                    String strLD = kqm.LD(context);
                    try {
                        if (TextUtils.isEmpty(strLD)) {
                            strLD = context.getPackageName() + Process.myPid();
                        }
                        WebView.setDataDirectorySuffix(strLD);
                    } catch (IllegalStateException unused) {
                        Lxb(strLD);
                    } catch (Exception unused2) {
                    }
                }
            } catch (Throwable th) {
                sLN.LD(th.getMessage());
            }
        }
    }

    public static void Lxb() {
        Lxb = false;
    }

    private static void Lxb(String str) {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            Field field = (Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix");
            field.setAccessible(true);
            if (TextUtils.isEmpty((String) field.get(cls))) {
                field.set(cls, str);
            }
        } catch (Throwable unused) {
        }
    }

    private static void Lxb(File file) {
        Lxb(file, file.exists() ? file.delete() : false);
    }

    private static void Lxb(File file, boolean z) {
        if (!z || file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            sLN.Lxb("TTAD.TTMultiInitHelper", e.getMessage());
        }
    }

    private static String LD() {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            return (String) ((Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix")).get(cls);
        } catch (Throwable unused) {
            return null;
        }
    }
}
