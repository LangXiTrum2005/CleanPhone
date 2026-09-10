package com.bytedance.sdk.openadsdk.LD;

import com.bytedance.sdk.component.utils.lc;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Lxb {
    protected boolean Lxb = false;
    private final ExecutorService LD = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.LD.Lxb$Lxb, reason: collision with other inner class name */
    public class CallableC0073Lxb implements Callable<Void> {
        private final File LD;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            Lxb.this.LD(this.LD);
            return null;
        }

        private CallableC0073Lxb(File file) {
            this.LD = file;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(File file) throws IOException {
        if (!this.Lxb) {
            try {
                lc.LD(file);
            } catch (Throwable unused) {
            }
            Lxb(lc.Lxb(file.getParentFile()));
        } else {
            List<File> listLxb = lc.Lxb(file);
            listLxb.toString();
            Lxb(listLxb);
        }
    }

    public abstract void Lxb(List<File> list);

    public abstract boolean Lxb(long j, int i);

    public abstract boolean Lxb(File file, long j, int i);

    public void Lxb(File file) throws IOException {
        this.LD.submit(new CallableC0073Lxb(file));
    }

    public long LD(List<File> list) {
        Iterator<File> it = list.iterator();
        long length = 0;
        while (it.hasNext()) {
            length += it.next().length();
        }
        return length;
    }
}
