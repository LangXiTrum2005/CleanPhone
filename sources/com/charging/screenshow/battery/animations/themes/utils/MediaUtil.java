package com.charging.screenshow.battery.animations.themes.utils;

import android.content.ContentValues;
import android.os.Build;
import android.os.Environment;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.utils.ext.IntExt;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/utils/MediaUtil;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MediaUtil {
    public static void a(String str, OutputStream outputStream) {
        try {
            if (!new File(str).exists()) {
                String.format("文件(%s)不存在。", Arrays.copyOf(new Object[]{str}, 1));
                return;
            }
            FileInputStream fileInputStream = new FileInputStream(str);
            byte[] bArr = new byte[1444];
            int i2 = 0;
            while (true) {
                int i3 = fileInputStream.read(bArr);
                if (i3 == -1) {
                    fileInputStream.close();
                    Intrinsics.c(outputStream);
                    outputStream.close();
                    return;
                } else {
                    i2 += i3;
                    System.out.println(i2);
                    Intrinsics.c(outputStream);
                    outputStream.write(bArr, 0, i3);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static ContentValues b(File file) {
        System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", file.getName());
        contentValues.put("_display_name", file.getName());
        contentValues.put("mime_type", "image/jpeg");
        contentValues.put("relative_path", c());
        return contentValues;
    }

    public static String c() {
        if (Build.VERSION.SDK_INT < 29) {
            return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath() + File.separator + IntExt.c(R.string.app_name);
        }
        return Environment.DIRECTORY_PICTURES + File.separator + IntExt.c(R.string.app_name);
    }
}
