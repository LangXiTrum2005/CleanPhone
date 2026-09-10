package com.bytedance.sdk.openadsdk.LD;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class LD extends Lxb {
    private int LD;
    private volatile boolean ZU;
    private int lk;

    public LD(int i, int i2) {
        this.LD = 15;
        this.lk = 3;
        if (i <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.LD = i;
        this.lk = i2;
    }

    private void ZU(List<File> list) {
        long jLD;
        int size;
        boolean zLxb;
        if (list != null) {
            try {
                if (list.size() == 0 || (zLxb = Lxb((jLD = LD(list)), (size = list.size())))) {
                    return;
                }
                TreeMap treeMap = new TreeMap();
                for (File file : list) {
                    treeMap.put(Long.valueOf(file.lastModified()), file);
                }
                for (Map.Entry entry : treeMap.entrySet()) {
                    if (entry != null && !zLxb) {
                        ((Long) entry.getKey()).getClass();
                        File file2 = (File) entry.getValue();
                        long length = file2.length();
                        if (file2.delete()) {
                            size--;
                            jLD -= length;
                        }
                        if (Lxb(file2, jLD, size)) {
                            return;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void lk(List<File> list) {
        long jLD = LD(list);
        int size = list.size();
        if (Lxb(jLD, size)) {
            return;
        }
        for (File file : list) {
            long length = file.length();
            if (file.delete()) {
                size--;
                jLD -= length;
            }
            if (Lxb(file, jLD, size)) {
                return;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.LD.Lxb
    public boolean Lxb(long j, int i) {
        return i <= this.LD;
    }

    @Override // com.bytedance.sdk.openadsdk.LD.Lxb
    public boolean Lxb(File file, long j, int i) {
        return i <= this.lk;
    }

    @Override // com.bytedance.sdk.openadsdk.LD.Lxb
    public void Lxb(List<File> list) {
        if (this.ZU) {
            ZU(list);
            this.ZU = false;
        } else {
            lk(list);
        }
    }

    public LD(int i, int i2, boolean z) {
        this.LD = 15;
        this.lk = 3;
        if (i > 0) {
            this.LD = i;
            this.lk = i2;
            this.ZU = z;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }
}
