package com.chartboost.sdk.impl;

import java.io.File;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ri {
    public static final ne b(oi oiVar, lg lgVar, a8 a8Var) {
        File fileA;
        RandomAccessFile randomAccessFileA;
        if (a8Var != null) {
            try {
                fileA = a8Var.a(a8Var.b(), oiVar.d());
            } catch (Exception e2) {
                za.b(e2.toString(), (Throwable) null, 2, (Object) null);
            }
        } else {
            fileA = null;
        }
        if (fileA == null || !fileA.exists()) {
            File fileA2 = lgVar.a(oiVar.b(), oiVar.d());
            randomAccessFileA = fileA2 != null ? lgVar.a(fileA2) : null;
        } else {
            randomAccessFileA = lgVar.a(fileA);
        }
        if (randomAccessFileA != null) {
            return new ne(randomAccessFileA);
        }
        return null;
    }
}
