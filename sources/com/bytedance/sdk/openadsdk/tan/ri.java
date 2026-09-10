package com.bytedance.sdk.openadsdk.tan;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.ihz;
import com.ironsource.X3;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private static final AtomicBoolean lr = new AtomicBoolean(false);
    private static boolean ri = true;

    /* JADX WARN: Code duplicated, block: B:59:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[SYNTHETIC] */
    private static void lr(Context context) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel channel;
        Throwable th;
        String strLr = lr();
        File file = new File(context.getDir(TextUtils.isEmpty(strLr) ? X3.i.K : "webview_".concat(String.valueOf(strLr)), 0).getPath(), "webview_data.lock");
        file.getAbsolutePath();
        if (file.exists()) {
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
                                ri(file);
                                if (fileChannel != null) {
                                    try {
                                        fileChannel.close();
                                    } catch (Throwable th2) {
                                        th2.getMessage();
                                    }
                                }
                                if (randomAccessFile == null) {
                                    return;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (channel != null) {
                                    try {
                                        channel.close();
                                    } catch (Throwable th4) {
                                        th4.getMessage();
                                    }
                                }
                                if (randomAccessFile == null) {
                                    throw th;
                                }
                                try {
                                    randomAccessFile.close();
                                    throw th;
                                } catch (Throwable th5) {
                                    th5.getMessage();
                                    throw th;
                                }
                            }
                        }
                        if (fileLockTryLock != null) {
                            fileLockTryLock.close();
                        } else {
                            ri(file);
                        }
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (Throwable th6) {
                                th6.getMessage();
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
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
            } catch (Throwable th8) {
                th = th8;
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
            try {
                randomAccessFile.close();
            } catch (Throwable th9) {
                th9.getMessage();
            }
        }
    }

    public static void ri(Context context) {
        if (context != null && ri && lr.compareAndSet(false, true)) {
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    if (ihz.ri(context)) {
                        lr(context);
                        return;
                    }
                    String strLr = ihz.lr(context);
                    try {
                        if (TextUtils.isEmpty(strLr)) {
                            strLr = context.getPackageName() + Process.myPid();
                        }
                        WebView.setDataDirectorySuffix(strLr);
                        ac.ri("TTAD.TTMultiInitHelper", "init: WebView.setDataDirectorySuffix with ".concat(String.valueOf(strLr)));
                    } catch (IllegalStateException e) {
                        ac.ri("TTAD.TTMultiInitHelper", "init: ", e);
                        ri(strLr);
                    } catch (Exception e2) {
                        ac.ri("TTAD.TTMultiInitHelper", "init: ", e2);
                    }
                }
            } catch (Throwable th) {
                ac.ri("TTAD.TTMultiInitHelper", "init: ", th);
            }
        }
    }

    public static void ri() {
        ri = false;
    }

    private static void ri(String str) {
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

    private static String lr() {
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

    private static void ri(File file) {
        ri(file, file.exists() ? file.delete() : false);
    }

    private static void ri(File file, boolean z) {
        if (!z || file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            ac.ik("TTAD.TTMultiInitHelper", e.getMessage());
        }
    }
}
