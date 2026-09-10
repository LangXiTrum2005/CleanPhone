package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g7 {
    public static boolean a(int i2) {
        try {
            AnalyticsConfig analyticsConfigH = MetaData.E().h();
            return analyticsConfigH != null && (analyticsConfigH.c() & i2) == i2;
        } catch (Throwable unused) {
        }
    }

    public static void b(Context context, String str, Serializable serializable) {
        try {
            ((Executor) com.startapp.sdk.components.a.a(context).C.a()).execute(new f7(context, str, serializable));
        } catch (Throwable th) {
            if (a(1)) {
                g9.a(th);
            }
        }
    }

    public static Object c(Context context, String str) {
        try {
            File file = new File(b(context, null));
            if (file.exists() && file.isDirectory()) {
                File file2 = new File(file, str);
                if (file2.exists()) {
                    FileInputStream fileInputStream = new FileInputStream(file2);
                    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                    Object object = objectInputStream.readObject();
                    objectInputStream.close();
                    fileInputStream.close();
                    return object;
                }
            }
            return null;
        } catch (Throwable th) {
            if (a(2)) {
                g9.a(th);
            }
            return null;
        }
    }

    public static ArrayList d(Context context, String str) {
        String[] list;
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(a(context, str));
            if (!file.exists() || !file.isDirectory() || (list = file.list()) == null) {
                return null;
            }
            for (String str2 : list) {
                FileInputStream fileInputStream = new FileInputStream(new File(file, str2));
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                Object object = objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
                arrayList.add(object);
            }
        } catch (Throwable th) {
            if (a(2)) {
                g9.a(th);
            }
        }
        return arrayList;
    }

    public static void a(Context context, String str, Serializable serializable) {
        try {
            File file = new File(b(context, null));
            if (file.exists() || file.mkdirs()) {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(file, str));
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(serializable);
                objectOutputStream.close();
                fileOutputStream.close();
            }
        } catch (Throwable th) {
            if (a(4)) {
                g9.a(th);
            }
        }
    }

    public static String b(Context context, String str) {
        String strR;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().toString());
        if (str != null) {
            strR = android.support.v4.media.a.r(new StringBuilder(), File.separator, str);
        } else {
            strR = "";
        }
        sb.append(strR);
        return sb.toString();
    }

    public static String a(Context context, String str) {
        String strR;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getCacheDir().toString());
        if (str != null) {
            strR = android.support.v4.media.a.r(new StringBuilder(), File.separator, str);
        } else {
            strR = "";
        }
        sb.append(strR);
        return sb.toString();
    }

    public static void a(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                a(file2);
            }
        }
        file.delete();
    }
}
