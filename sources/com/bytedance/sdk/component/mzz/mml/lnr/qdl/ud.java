package com.bytedance.sdk.component.mzz.mml.lnr.qdl;

import android.content.Context;
import com.smartdigimkt.x.d;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class ud implements com.bytedance.sdk.component.mzz.ud, Cloneable {
    private static volatile com.bytedance.sdk.component.mzz.ud tvp;
    private File jpc;
    private int lnr;
    private int mml;
    private boolean mo;
    private boolean mzz;
    private long qdl;
    private int ud;
    private boolean wd;

    public ud(int i2, int i3, int i4, long j, File file) {
        this(i2, i3, i4, j, i3 != 0, j != 0, file);
    }

    public static com.bytedance.sdk.component.mzz.ud to() {
        return tvp;
    }

    @Override // com.bytedance.sdk.component.mzz.ud
    public File jpc() {
        return this.jpc;
    }

    @Override // com.bytedance.sdk.component.mzz.ud
    public int lnr() {
        return this.lnr;
    }

    @Override // com.bytedance.sdk.component.mzz.ud
    public int mml() {
        return this.mml;
    }

    @Override // com.bytedance.sdk.component.mzz.ud
    public boolean mo() {
        return this.wd;
    }

    @Override // com.bytedance.sdk.component.mzz.ud
    public boolean mzz() {
        return this.mzz;
    }

    @Override // com.bytedance.sdk.component.mzz.ud
    public long qdl() {
        return this.qdl;
    }

    @Override // com.bytedance.sdk.component.mzz.ud
    public boolean tvp() {
        return true;
    }

    @Override // com.bytedance.sdk.component.mzz.ud
    public int ud() {
        return this.ud;
    }

    @Override // com.bytedance.sdk.component.mzz.ud
    public boolean wd() {
        return this.mo;
    }

    public ud(int i2, int i3, int i4, long j, boolean z2, boolean z3, File file) {
        this.qdl = j;
        this.ud = i2;
        this.lnr = i3;
        this.mml = i4;
        this.mzz = z2;
        this.mo = z3;
        this.jpc = file;
        this.wd = i4 != 0;
    }

    public static void qdl(Context context, com.bytedance.sdk.component.mzz.ud udVar) {
        if (udVar != null) {
            tvp = udVar;
        } else {
            tvp = qdl(new File(context.getCacheDir(), d.c.k));
        }
    }

    public static com.bytedance.sdk.component.mzz.ud qdl(File file) {
        long jQdl;
        int iLnr;
        int iMml;
        file.mkdirs();
        if (tvp == null) {
            iLnr = 10;
            iMml = 14;
            jQdl = 20;
        } else {
            jQdl = tvp.qdl();
            iLnr = tvp.lnr();
            iMml = tvp.mml();
        }
        return new ud(0, iLnr, iMml, jQdl, file);
    }
}
