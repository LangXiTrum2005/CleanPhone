package com.bytedance.sdk.component.JXs.lk.Lxb.Lxb;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class LD implements com.bytedance.sdk.component.JXs.lk {
    private Lxb LD;
    private long Lxb;

    public LD(File file, long j, ExecutorService executorService) {
        this.Lxb = j;
        try {
            this.LD = Lxb.Lxb(file, 20210302, 1, j, executorService);
        } catch (IOException e) {
            e.toString();
        }
    }

    @Override // com.bytedance.sdk.component.JXs.Lxb
    /* JADX INFO: renamed from: lk, reason: merged with bridge method [inline-methods] */
    public boolean LD(String str) {
        try {
            try {
                Lxb.lk lkVarLxb = this.LD.Lxb(str);
                boolean z = lkVarLxb != null;
                com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(lkVarLxb);
                return z;
            } catch (IOException e) {
                e.getMessage();
                com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(null);
                return false;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(null);
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
    @Override // com.bytedance.sdk.component.JXs.Lxb
    /* JADX INFO: renamed from: LD, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] Lxb(String str) throws Throwable {
        ?? r7;
        ByteArrayOutputStream byteArrayOutputStream;
        Lxb lxb = this.LD;
        ?? r1 = 0;
        if (lxb != null) {
            try {
                if (str != 0) {
                    try {
                        Lxb.lk lkVarLxb = lxb.Lxb((String) str);
                        if (lkVarLxb == null) {
                            com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(null);
                            com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(null);
                            return null;
                        }
                        str = lkVarLxb.Lxb(0);
                        if (str != 0) {
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        int i = str.read(bArr);
                                        if (i == -1) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(bArr, 0, i);
                                    }
                                } catch (IOException e) {
                                    e = e;
                                    r7 = str;
                                }
                            } catch (IOException e2) {
                                e = e2;
                                byteArrayOutputStream = null;
                                r7 = str;
                            } catch (Throwable th) {
                                th = th;
                                r1 = str;
                                com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(r1);
                                com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(0);
                                throw th;
                            }
                        } else {
                            byteArrayOutputStream = null;
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(str);
                        com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(byteArrayOutputStream);
                        return byteArray;
                    } catch (IOException e3) {
                        e = e3;
                        r7 = 0;
                        byteArrayOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(r1);
                        com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(0);
                        throw th;
                    }
                    e.toString();
                    com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(r7);
                    com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(byteArrayOutputStream);
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.JXs.lk
    public InputStream Lxb(String str) {
        Lxb lxb = this.LD;
        if (lxb == null) {
            return null;
        }
        try {
            Lxb.lk lkVarLxb = lxb.Lxb(str);
            if (lkVarLxb != null) {
                return lkVarLxb.Lxb(0);
            }
        } catch (IOException e) {
            e.getMessage();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.JXs.Lxb
    public boolean Lxb(String str, byte[] bArr) throws Throwable {
        OutputStream outputStream;
        Lxb lxb = this.LD;
        if (lxb == null || bArr == null || str == null) {
            return false;
        }
        OutputStream outputStreamLxb = null;
        outputStreamLxb = null;
        Lxb.C0044Lxb c0044Lxb = null;
        try {
            try {
                Lxb.C0044Lxb c0044LxbLD = lxb.LD(str);
                if (c0044LxbLD == null) {
                    com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(null);
                    return false;
                }
                try {
                    outputStreamLxb = c0044LxbLD.Lxb(0);
                    if (outputStreamLxb == Lxb.lk) {
                        com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(outputStreamLxb);
                        return false;
                    }
                    outputStreamLxb.write(bArr);
                    c0044LxbLD.Lxb();
                    this.LD.Lxb();
                    com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(outputStreamLxb);
                    return true;
                } catch (IOException e) {
                    e = e;
                    OutputStream outputStream2 = outputStreamLxb;
                    c0044Lxb = c0044LxbLD;
                    outputStream = outputStream2;
                    try {
                        e.toString();
                        if (c0044Lxb != null) {
                            try {
                                c0044Lxb.LD();
                            } catch (IOException unused) {
                            }
                        }
                        com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(outputStream);
                        return false;
                    } catch (Throwable th) {
                        outputStreamLxb = outputStream;
                        th = th;
                        com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(outputStreamLxb);
                        throw th;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                outputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
            com.bytedance.sdk.component.JXs.lk.lk.LD.Lxb(outputStreamLxb);
            throw th;
        }
    }
}
