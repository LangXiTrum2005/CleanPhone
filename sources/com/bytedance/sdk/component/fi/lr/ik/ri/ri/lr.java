package com.bytedance.sdk.component.fi.lr.ik.ri.ri;

import com.bytedance.sdk.component.fi.ik;
import com.bytedance.sdk.component.utils.qt;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class lr implements ik {
    private ri lr;
    private int ri;

    public lr(File file, long j) {
        int i = (int) j;
        this.ri = i;
        this.lr = ri.ri(i, file);
    }

    @Override // com.bytedance.sdk.component.fi.ri
    /* JADX INFO: renamed from: ik, reason: merged with bridge method [inline-methods] */
    public boolean lr(String str) {
        try {
            InputStream inputStreamRi = this.lr.ri(str);
            boolean z = inputStreamRi != null;
            qt.ri(inputStreamRi);
            return z;
        } catch (Throwable th) {
            try {
                th.getMessage();
                return false;
            } finally {
                qt.ri(null);
            }
        }
    }

    @Override // com.bytedance.sdk.component.fi.ri
    /* JADX INFO: renamed from: lr, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] ri(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        InputStream inputStreamRi;
        ri riVar = this.lr;
        if (riVar != null && str != null) {
            try {
                inputStreamRi = riVar.ri(str);
                if (inputStreamRi != null) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i = inputStreamRi.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i);
                            }
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            th = th2;
                            qt.ri(inputStreamRi);
                            qt.ri(byteArrayOutputStream);
                            throw th;
                        }
                    } catch (IOException unused2) {
                        byteArrayOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayOutputStream = null;
                        qt.ri(inputStreamRi);
                        qt.ri(byteArrayOutputStream);
                        throw th;
                    }
                } else {
                    byteArrayOutputStream = null;
                }
                if (byteArrayOutputStream != null) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    qt.ri(inputStreamRi);
                    qt.ri(byteArrayOutputStream);
                    return byteArray;
                }
            } catch (IOException unused3) {
                inputStreamRi = null;
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                byteArrayOutputStream = null;
                th = th4;
                inputStreamRi = null;
            }
            qt.ri(inputStreamRi);
            qt.ri(byteArrayOutputStream);
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.fi.ik
    public InputStream ri(String str) {
        ri riVar = this.lr;
        if (riVar == null) {
            return null;
        }
        return riVar.ri(str);
    }

    @Override // com.bytedance.sdk.component.fi.ri
    public boolean ri(String str, byte[] bArr) {
        ri riVar = this.lr;
        if (riVar == null || bArr == null || str == null) {
            return false;
        }
        return riVar.ri(str, bArr);
    }
}
