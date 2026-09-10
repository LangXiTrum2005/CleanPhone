package com.smartdigimkt.f0;

import android.text.TextUtils;
import com.smartdigimkt.h0.f;
import com.smartdigimkt.h0.l;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class d extends com.smartdigimkt.s0.a {
    private static final String j0 = "ImageWorker";
    private String e0;
    private String f0;
    private String g0;
    private boolean h0 = false;
    private b i0;

    public class a extends f<Void> {
        public a() {
        }

        @Override // com.smartdigimkt.h0.f, com.smartdigimkt.h0.e
        public void a() {
        }

        @Override // com.smartdigimkt.h0.f, com.smartdigimkt.h0.e
        public void a(long j, long j2) {
        }

        @Override // com.smartdigimkt.h0.f, com.smartdigimkt.h0.e
        public void a(l lVar) {
            d dVar = d.this;
            dVar.a(dVar.g0);
            d.this.m();
        }

        @Override // com.smartdigimkt.h0.f, com.smartdigimkt.h0.e
        public void a(com.smartdigimkt.i0.a aVar) {
            d dVar = d.this;
            dVar.a(dVar.f0, "load image from http faild because http return code: " + aVar.f35790a + ".image url is " + d.this.f0);
        }
    }

    public interface b {
        void a(String str, String str2);

        void b(String str, String str2);
    }

    public d(String str, String str2, String str3) {
        this.e0 = str;
        this.f0 = str2;
        this.g0 = str3;
    }

    private void g() {
        try {
            File file = new File(this.g0);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (file.exists()) {
                file.delete();
            }
            com.smartdigimkt.p0.a.a(file, this.f0, new a());
        } catch (Exception e2) {
            a(this.f0, e2.getMessage());
            if (com.smartdigimkt.b.b.f33800a) {
                e2.printStackTrace();
            }
        } catch (OutOfMemoryError e3) {
            a(this.f0, e3.getMessage());
        }
    }

    public void a(String str) {
    }

    @Override // com.smartdigimkt.s0.a
    public void c() {
    }

    @Override // com.smartdigimkt.s0.a
    public void f() {
        if (this.h0) {
            g();
            return;
        }
        if (TextUtils.isEmpty(this.g0)) {
            a(this.f0, "save path is null.");
            return;
        }
        File file = new File(this.g0);
        if (!file.exists() || file.length() <= 0) {
            g();
        } else {
            m();
        }
    }

    public String h() {
        return this.f0;
    }

    public b i() {
        return this.i0;
    }

    public String j() {
        return this.e0;
    }

    public String k() {
        return this.g0;
    }

    public boolean l() {
        return this.h0;
    }

    public void m() {
        if (new File(this.g0).length() > 0) {
            b(this.f0, this.g0);
        } else {
            a(this.f0, android.support.v4.media.a.r(new StringBuilder("load image faild.because file["), this.g0, "] is not exist!"));
        }
    }

    private void b(String str, String str2) {
        b bVar = this.i0;
        if (bVar != null) {
            bVar.a(str, str2);
        }
    }

    @Override // com.smartdigimkt.s0.a
    public void a(boolean z2) {
    }

    public void c(boolean z2) {
        this.h0 = z2;
    }

    public void a(b bVar) {
        this.i0 = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        b bVar = this.i0;
        if (bVar != null) {
            bVar.b(str, str2);
        }
    }
}
