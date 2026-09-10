package com.badlogic.gdx.backends.android;

import android.content.Context;
import android.os.Environment;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public class APKExpansionSupport {
    private static final String EXP_PATH = "/Android/obb/";

    public static String[] getAPKExpansionFiles(Context context, int i, int i2) {
        String packageName = context.getPackageName();
        Vector vector = new Vector();
        if (Environment.getExternalStorageState().equals("mounted")) {
            File file = new File(Environment.getExternalStorageDirectory().toString() + EXP_PATH + packageName);
            if (file.exists()) {
                if (i > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(file);
                    sb.append(File.separator);
                    sb.append("main.");
                    sb.append(i);
                    sb.append(".");
                    String strM = DM.m(sb, packageName, ".obb");
                    if (new File(strM).isFile()) {
                        vector.add(strM);
                    }
                }
                if (i2 > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(file);
                    sb2.append(File.separator);
                    sb2.append("patch.");
                    sb2.append(i2);
                    sb2.append(".");
                    String strM2 = DM.m(sb2, packageName, ".obb");
                    if (new File(strM2).isFile()) {
                        vector.add(strM2);
                    }
                }
            }
        }
        String[] strArr = new String[vector.size()];
        vector.toArray(strArr);
        return strArr;
    }

    public static ZipResourceFile getAPKExpansionZipFile(Context context, int i, int i2) throws IOException {
        return getResourceZipFile(getAPKExpansionFiles(context, i, i2));
    }

    public static ZipResourceFile getResourceZipFile(String[] strArr) throws IOException {
        ZipResourceFile zipResourceFile = null;
        for (String str : strArr) {
            if (zipResourceFile == null) {
                zipResourceFile = new ZipResourceFile(str);
            } else {
                zipResourceFile.addPatchFile(str);
            }
        }
        return zipResourceFile;
    }
}
