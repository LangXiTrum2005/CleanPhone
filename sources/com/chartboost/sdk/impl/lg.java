package com.chartboost.sdk.impl;

import java.io.File;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes3.dex */
public final class lg {
    public final RandomAccessFile a(File file) {
        if (file != null) {
            return new RandomAccessFile(file, "rwd");
        }
        return null;
    }

    public final boolean b(File file, String str) {
        if (file != null && str != null) {
            try {
                File fileA = a(file, str);
                if (fileA != null) {
                    return fileA.exists();
                }
                return false;
            } catch (Exception e2) {
                za.a(e2.toString(), (Throwable) null, 2, (Object) null);
            }
        }
        return false;
    }

    public final File a(File file, String str) {
        if (file == null || str == null) {
            return null;
        }
        return new File(file, str.concat(".tmp"));
    }
}
