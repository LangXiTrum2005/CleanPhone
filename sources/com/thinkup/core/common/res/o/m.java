package com.thinkup.core.common.res.o;

import android.text.TextUtils;
import com.p004ironsource.mediationsdk.metadata.a;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.ooo.nm;
import com.thinkup.core.common.res.o0;
import com.thinkup.core.common.res.oo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends com.thinkup.core.common.res.image.m {
    o m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f42371n;
    oo o;

    public interface o {
        void o(oo ooVar);

        void o(oo ooVar, String str);
    }

    public m(oo ooVar) {
        super(ooVar.m0);
        this.o = ooVar;
        this.f42371n = o0.o(o0n.m().on()).m(ooVar.on, nm.o(ooVar.m0));
    }

    @Override // com.thinkup.core.common.res.image.m
    public final void m() {
    }

    @Override // com.thinkup.core.common.res.image.m
    public final void n() {
        o oVar = this.m;
        if (oVar != null) {
            oVar.o(this.o);
        }
    }

    @Override // com.thinkup.core.common.res.image.m
    public final Map<String, String> o() {
        return null;
    }

    private void o(o oVar) {
        this.m = oVar;
    }

    @Override // com.thinkup.core.common.res.image.m
    public final boolean o(InputStream inputStream) {
        if (TextUtils.isEmpty(this.f42371n)) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            String strO = o0.o(o0n.m().on()).o(this.o.on);
            if (TextUtils.isEmpty(strO)) {
                return false;
            }
            File file = new File(strO);
            if (!file.exists()) {
                file.mkdirs();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(this.f42371n);
            try {
                byte[] bArr = new byte[a.f25965n];
                while (true) {
                    int i2 = inputStream.read(bArr);
                    if (i2 == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, i2);
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                return true;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            th.printStackTrace();
            if (fileOutputStream == null) {
                return false;
            }
            try {
                return false;
            } catch (Throwable th4) {
                return false;
            }
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th5) {
                    th5.printStackTrace();
                }
            }
        }
    }

    @Override // com.thinkup.core.common.res.image.m
    public final void o(com.thinkup.core.common.ooo.m.o0 o0Var) {
        com.thinkup.core.common.ooo.m.m.o().o(o0Var, 4);
    }

    @Override // com.thinkup.core.common.res.image.m
    public final void o(String str, String str2) {
        o oVar = this.m;
        if (oVar != null) {
            oVar.o(this.o, str2);
        }
    }
}
