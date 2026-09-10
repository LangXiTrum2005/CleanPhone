package com.bytedance.sdk.component.mzz.mml.lnr.qdl.qdl;

import com.bytedance.sdk.component.mzz.lnr;
import com.bytedance.sdk.component.utils.to;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class ud implements lnr {
    private int qdl;
    private qdl ud;

    public ud(File file, long j) {
        int i2 = (int) j;
        this.qdl = i2;
        this.ud = qdl.qdl(i2, file);
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    /* JADX INFO: renamed from: lnr, reason: merged with bridge method [inline-methods] */
    public boolean ud(String str) {
        try {
            InputStream inputStreamQdl = this.ud.qdl(str);
            boolean z2 = inputStreamQdl != null;
            to.qdl(inputStreamQdl);
            return z2;
        } catch (Throwable th) {
            try {
                th.getMessage();
                return false;
            } finally {
                to.qdl(null);
            }
        }
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    /* JADX INFO: renamed from: ud, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] qdl(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        InputStream inputStreamQdl;
        qdl qdlVar = this.ud;
        if (qdlVar != null && str != null) {
            try {
                inputStreamQdl = qdlVar.qdl(str);
                if (inputStreamQdl != null) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i2 = inputStreamQdl.read(bArr);
                                if (i2 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i2);
                            }
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            th = th2;
                            to.qdl(inputStreamQdl);
                            to.qdl(byteArrayOutputStream);
                            throw th;
                        }
                    } catch (IOException unused2) {
                        byteArrayOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayOutputStream = null;
                        to.qdl(inputStreamQdl);
                        to.qdl(byteArrayOutputStream);
                        throw th;
                    }
                } else {
                    byteArrayOutputStream = null;
                }
                if (byteArrayOutputStream != null) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    to.qdl(inputStreamQdl);
                    to.qdl(byteArrayOutputStream);
                    return byteArray;
                }
            } catch (IOException unused3) {
                inputStreamQdl = null;
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                byteArrayOutputStream = null;
                th = th4;
                inputStreamQdl = null;
            }
            to.qdl(inputStreamQdl);
            to.qdl(byteArrayOutputStream);
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.mzz.lnr
    public InputStream qdl(String str) {
        qdl qdlVar = this.ud;
        if (qdlVar == null) {
            return null;
        }
        return qdlVar.qdl(str);
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public boolean qdl(String str, byte[] bArr) {
        qdl qdlVar = this.ud;
        if (qdlVar == null || bArr == null || str == null) {
            return false;
        }
        return qdlVar.qdl(str, bArr);
    }
}
