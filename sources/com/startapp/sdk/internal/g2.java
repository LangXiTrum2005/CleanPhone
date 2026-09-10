package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f40993a = new ConcurrentHashMap();

    public static boolean a(Context context, String str) {
        if (!str.endsWith(".png")) {
            str = str.concat(".png");
        }
        if (f40993a.containsKey(str)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().getPath());
        sb.append("/");
        sb.append(str);
        return new File(sb.toString()).exists();
    }

    public static Bitmap b(Context context, String str) throws Throwable {
        FileInputStream fileInputStream;
        ConcurrentHashMap concurrentHashMap = f40993a;
        Bitmap bitmap = (Bitmap) concurrentHashMap.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(context.getFilesDir().getPath() + "/" + str);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream);
                bitmapDecodeStream.setDensity(context.getResources() != null ? context.getResources().getDisplayMetrics().densityDpi : 160);
                concurrentHashMap.put(str, bitmapDecodeStream);
                vi.a(fileInputStream);
                return bitmapDecodeStream;
            } catch (Exception unused) {
                vi.a(fileInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                vi.a(fileInputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
