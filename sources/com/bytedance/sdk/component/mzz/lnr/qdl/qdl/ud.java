package com.bytedance.sdk.component.mzz.lnr.qdl.qdl;

import android.util.Log;
import com.bytedance.sdk.component.utils.to;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class ud implements com.bytedance.sdk.component.mzz.lnr {
    private long qdl;
    private qdl ud;

    public ud(File file, long j, ExecutorService executorService) {
        this.qdl = j;
        try {
            this.ud = qdl.qdl(file, 20210302, 1, j, executorService);
        } catch (IOException e2) {
            Log.w("LruCountDiskCache", e2.toString());
        }
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    /* JADX INFO: renamed from: lnr, reason: merged with bridge method [inline-methods] */
    public boolean ud(String str) {
        try {
            try {
                qdl.lnr lnrVarQdl = this.ud.qdl(str);
                boolean z2 = lnrVarQdl != null;
                to.qdl(lnrVarQdl);
                return z2;
            } catch (IOException e2) {
                Log.w("LruCountDiskCache", e2.getMessage());
                to.qdl(null);
                return false;
            }
        } catch (Throwable th) {
            to.qdl(null);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // com.bytedance.sdk.component.mzz.qdl
    /* JADX INFO: renamed from: ud, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] qdl(String str) throws Throwable {
        ?? r7;
        ByteArrayOutputStream byteArrayOutputStream;
        qdl qdlVar = this.ud;
        ?? r1 = 0;
        if (qdlVar != null) {
            try {
                if (str != 0) {
                    try {
                        qdl.lnr lnrVarQdl = qdlVar.qdl((String) str);
                        if (lnrVarQdl == null) {
                            to.qdl(null);
                            to.qdl(null);
                            return null;
                        }
                        str = lnrVarQdl.qdl(0);
                        if (str != 0) {
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        int i2 = str.read(bArr);
                                        if (i2 == -1) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(bArr, 0, i2);
                                    }
                                } catch (IOException e2) {
                                    e = e2;
                                    r7 = str;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                byteArrayOutputStream = null;
                                r7 = str;
                            } catch (Throwable th) {
                                th = th;
                                r1 = str;
                                to.qdl(r1);
                                to.qdl(0);
                                throw th;
                            }
                        } else {
                            byteArrayOutputStream = null;
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        to.qdl(str);
                        to.qdl(byteArrayOutputStream);
                        return byteArray;
                    } catch (IOException e4) {
                        e = e4;
                        r7 = 0;
                        byteArrayOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        to.qdl(r1);
                        to.qdl(0);
                        throw th;
                    }
                    Log.w("LruCountDiskCache", e.toString());
                    to.qdl(r7);
                    to.qdl(byteArrayOutputStream);
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.mzz.lnr
    public InputStream qdl(String str) throws Throwable {
        qdl qdlVar = this.ud;
        if (qdlVar == null) {
            return null;
        }
        try {
            qdl.lnr lnrVarQdl = qdlVar.qdl(str);
            if (lnrVarQdl != null) {
                return lnrVarQdl.qdl(0);
            }
        } catch (IOException e2) {
            Log.w("LruCountDiskCache", e2.getMessage());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public boolean qdl(String str, byte[] bArr) throws Throwable {
        qdl qdlVar = this.ud;
        if (qdlVar == null || bArr == null || str == null) {
            return false;
        }
        Closeable closeable = null;
        qdl.C0087qdl c0087qdl = null;
        try {
            try {
                qdl.C0087qdl c0087qdlUd = qdlVar.ud(str);
                try {
                    if (c0087qdlUd == null) {
                        Log.w("LruCountDiskCache", "save " + str + " failed for edit null");
                        to.qdl(null);
                        return false;
                    }
                    OutputStream outputStreamQdl = c0087qdlUd.qdl(0);
                    if (outputStreamQdl == qdl.lnr) {
                        Log.w("LruCountDiskCache", "save " + str + " failed for null OutputStream");
                        to.qdl(outputStreamQdl);
                        return false;
                    }
                    outputStreamQdl.write(bArr);
                    c0087qdlUd.qdl();
                    this.ud.qdl();
                    to.qdl(outputStreamQdl);
                    return true;
                } catch (IOException e2) {
                    e = e2;
                    c0087qdl = c0087qdlUd;
                    try {
                        Log.w("LruCountDiskCache", e.toString());
                        if (c0087qdl != null) {
                            try {
                                c0087qdl.ud();
                            } catch (IOException unused) {
                            }
                        }
                        to.qdl(0);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        closeable = closeable;
                        to.qdl(closeable);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                to.qdl(closeable);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }
}
