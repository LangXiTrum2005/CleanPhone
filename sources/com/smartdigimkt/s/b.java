package com.smartdigimkt.s;

import com.smartdigimkt.l7.d;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class b extends com.smartdigimkt.f7.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    String f38150i;

    public b(String str, String str2) {
        super(str);
        this.f38150i = str2;
    }

    @Override // com.smartdigimkt.f7.b
    public void a(String str, String str2) {
    }

    @Override // com.smartdigimkt.f7.b
    public void b(String str, String str2) {
    }

    @Override // com.smartdigimkt.f7.b
    public void d() {
    }

    @Override // com.smartdigimkt.f7.b
    public Map<String, String> e() {
        return null;
    }

    @Override // com.smartdigimkt.f7.b
    public boolean a(InputStream inputStream) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.f38150i);
            byte[] bArr = new byte[com.p004ironsource.mediationsdk.metadata.a.f25965n];
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    fileOutputStream.close();
                    return true;
                }
                fileOutputStream.write(bArr, 0, i2);
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.smartdigimkt.f7.b
    public void a(d dVar) {
        com.smartdigimkt.l7.b.a().a(dVar, 2);
    }
}
