package com.bytedance.sdk.component.fi.lr.ik.ri;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class lr implements com.bytedance.sdk.component.fi.lr, Cloneable {
    private static volatile com.bytedance.sdk.component.fi.lr jbs;
    private boolean di;
    private boolean fi;
    private int ik;
    private int ka;
    private int lr;
    private File mj;
    private long ri;
    private boolean xha;

    public lr(int i, int i2, int i3, long j, File file) {
        this(i, i2, i3, j, i2 != 0, j != 0, file);
    }

    public static com.bytedance.sdk.component.fi.lr jbs() {
        return jbs;
    }

    @Override // com.bytedance.sdk.component.fi.lr
    public boolean di() {
        return this.xha;
    }

    @Override // com.bytedance.sdk.component.fi.lr
    public boolean fi() {
        return this.fi;
    }

    @Override // com.bytedance.sdk.component.fi.lr
    public int ik() {
        return this.ik;
    }

    @Override // com.bytedance.sdk.component.fi.lr
    public int ka() {
        return this.ka;
    }

    @Override // com.bytedance.sdk.component.fi.lr
    public int lr() {
        return this.lr;
    }

    @Override // com.bytedance.sdk.component.fi.lr
    public File mj() {
        return this.mj;
    }

    @Override // com.bytedance.sdk.component.fi.lr
    public long ri() {
        return this.ri;
    }

    @Override // com.bytedance.sdk.component.fi.lr
    public boolean xha() {
        return this.di;
    }

    public lr(int i, int i2, int i3, long j, boolean z, boolean z2, File file) {
        this.ri = j;
        this.lr = i;
        this.ik = i2;
        this.ka = i3;
        this.fi = z;
        this.di = z2;
        this.mj = file;
        this.xha = i3 != 0;
    }

    public static void ri(Context context, com.bytedance.sdk.component.fi.lr lrVar) {
        if (lrVar != null) {
            jbs = lrVar;
        } else {
            jbs = ri(new File(context.getCacheDir(), "image"));
        }
    }

    public static com.bytedance.sdk.component.fi.lr ri(File file) {
        long jRi;
        int iIk;
        int iKa;
        file.mkdirs();
        if (jbs == null) {
            iIk = 10;
            iKa = 14;
            jRi = 20;
        } else {
            jRi = jbs.ri();
            iIk = jbs.ik();
            iKa = jbs.ka();
        }
        return new lr(0, iIk, iKa, jRi, file);
    }
}
