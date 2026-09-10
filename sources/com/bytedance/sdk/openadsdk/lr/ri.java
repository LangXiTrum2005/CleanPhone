package com.bytedance.sdk.openadsdk.lr;

import com.bytedance.sdk.component.utils.xha;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ri {
    protected boolean ri = false;
    private final ExecutorService lr = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.lr.ri$ri, reason: collision with other inner class name */
    public class CallableC0269ri implements Callable<Void> {
        private final File lr;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            ri.this.lr(this.lr);
            return null;
        }

        private CallableC0269ri(File file) {
            this.lr = file;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr(File file) throws IOException {
        if (!this.ri) {
            try {
                xha.lr(file);
            } catch (Throwable unused) {
            }
            ri(xha.ri(file.getParentFile()));
        } else {
            List<File> listRi = xha.ri(file);
            listRi.toString();
            ri(listRi);
        }
    }

    public abstract void ri(List<File> list);

    public abstract boolean ri(long j, int i);

    public abstract boolean ri(File file, long j, int i);

    public void ri(File file) throws IOException {
        this.lr.submit(new CallableC0269ri(file));
    }

    public long lr(List<File> list) {
        Iterator<File> it = list.iterator();
        long length = 0;
        while (it.hasNext()) {
            length += it.next().length();
        }
        return length;
    }
}
