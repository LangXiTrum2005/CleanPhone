package com.bytedance.sdk.component.JXs.lk.Lxb;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb implements com.bytedance.sdk.component.JXs.LD, Cloneable {
    private static volatile com.bytedance.sdk.component.JXs.LD lc;
    private File JXs;
    private int LD;
    private long Lxb;
    private boolean ZU;
    private boolean lk;

    public Lxb(int i, long j, File file) {
        this(i, j, i != 0, j != 0, file);
    }

    private static long OY() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    public static com.bytedance.sdk.component.JXs.LD ebl() {
        return lc;
    }

    @Override // com.bytedance.sdk.component.JXs.LD
    public File JXs() {
        return this.JXs;
    }

    @Override // com.bytedance.sdk.component.JXs.LD
    public int LD() {
        return this.LD;
    }

    @Override // com.bytedance.sdk.component.JXs.LD
    public long Lxb() {
        return this.Lxb;
    }

    @Override // com.bytedance.sdk.component.JXs.LD
    public boolean ZU() {
        return this.ZU;
    }

    @Override // com.bytedance.sdk.component.JXs.LD
    public boolean lc() {
        return true;
    }

    @Override // com.bytedance.sdk.component.JXs.LD
    public boolean lk() {
        return this.lk;
    }

    public Lxb(int i, long j, boolean z, boolean z2, File file) {
        this.Lxb = j;
        this.LD = i;
        this.lk = z;
        this.ZU = z2;
        this.JXs = file;
    }

    public static void Lxb(Context context, com.bytedance.sdk.component.JXs.LD ld) {
        if (ld != null) {
            lc = ld;
        } else {
            lc = Lxb(new File(context.getCacheDir(), "image"));
        }
    }

    public static com.bytedance.sdk.component.JXs.LD Lxb(File file) {
        int iMin;
        long jMin;
        file.mkdirs();
        if (lc == null) {
            iMin = Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 31457280);
            jMin = Math.min(OY() / 16, 41943040L);
        } else {
            iMin = Math.min(lc.LD() / 2, 31457280);
            jMin = Math.min(lc.Lxb() / 2, 41943040L);
        }
        return new Lxb(Math.max(iMin, 26214400), Math.max(jMin, ServiceProvider.HTTP_CACHE_DISK_SIZE), file);
    }
}
