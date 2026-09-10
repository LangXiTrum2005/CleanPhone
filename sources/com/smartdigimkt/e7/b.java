package com.smartdigimkt.e7;

import android.text.TextUtils;
import com.smartdigimkt.d7.d;
import com.smartdigimkt.d7.e;
import com.smartdigimkt.n8.l;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class b extends com.smartdigimkt.f7.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    e f34646i;
    a j;
    String k;

    public interface a {
        void a(e eVar);

        void a(e eVar, String str);
    }

    public b(e eVar) {
        super(eVar.f34508b);
        this.f34646i = eVar;
        this.k = d.c().d(eVar.f34507a, l.b(eVar.f34508b));
    }

    @Override // com.smartdigimkt.f7.b
    public void a(String str, String str2) {
    }

    @Override // com.smartdigimkt.f7.b
    public void b(String str, String str2) {
        a aVar = this.j;
        if (aVar != null) {
            aVar.a(this.f34646i, str2);
        }
    }

    @Override // com.smartdigimkt.f7.b
    public void d() {
        a aVar = this.j;
        if (aVar != null) {
            aVar.a(this.f34646i);
        }
    }

    @Override // com.smartdigimkt.f7.b
    public Map<String, String> e() {
        return null;
    }

    public void a(a aVar) {
        this.j = aVar;
    }

    @Override // com.smartdigimkt.f7.b
    public boolean a(InputStream inputStream) {
        FileOutputStream fileOutputStream;
        try {
            if (TextUtils.isEmpty(this.k)) {
                return false;
            }
            try {
                String strB = d.c().b(this.f34646i.f34507a);
                if (TextUtils.isEmpty(strB)) {
                    return false;
                }
                File file = new File(strB);
                if (!file.exists()) {
                    file.mkdirs();
                }
                fileOutputStream = new FileOutputStream(this.k);
                try {
                    byte[] bArr = new byte[com.p004ironsource.mediationsdk.metadata.a.f25965n];
                    while (true) {
                        int i2 = inputStream.read(bArr);
                        if (i2 != -1) {
                            fileOutputStream.write(bArr, 0, i2);
                        } else {
                            fileOutputStream.close();
                            fileOutputStream.close();
                            return true;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
            try {
                th.printStackTrace();
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                return false;
            } catch (Throwable th3) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th4) {
                        th4.printStackTrace();
                    }
                }
                throw th3;
            }
        } catch (Throwable th5) {
            th5.printStackTrace();
        }
    }

    @Override // com.smartdigimkt.f7.b
    public void a(com.smartdigimkt.l7.d dVar) {
        com.smartdigimkt.l7.b.a().a(dVar, 4);
    }
}
