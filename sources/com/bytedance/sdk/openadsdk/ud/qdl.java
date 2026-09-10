package com.bytedance.sdk.openadsdk.ud;

import com.bytedance.sdk.component.utils.wd;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qdl {
    protected boolean qdl = false;
    private final ExecutorService ud = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ud.qdl$qdl, reason: collision with other inner class name */
    public class CallableC0156qdl implements Callable<Void> {
        private final File ud;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            qdl.this.ud(this.ud);
            return null;
        }

        private CallableC0156qdl(File file) {
            this.ud = file;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(File file) throws IOException {
        if (!this.qdl) {
            try {
                wd.ud(file);
            } catch (Throwable unused) {
            }
            qdl(wd.qdl(file.getParentFile()));
        } else {
            List<File> listQdl = wd.qdl(file);
            listQdl.toString();
            qdl(listQdl);
        }
    }

    public abstract void qdl(List<File> list);

    public abstract boolean qdl(long j, int i2);

    public abstract boolean qdl(File file, long j, int i2);

    public void qdl(File file) throws IOException {
        this.ud.submit(new CallableC0156qdl(file));
    }

    public long ud(List<File> list) {
        Iterator<File> it = list.iterator();
        long length = 0;
        while (it.hasNext()) {
            length += it.next().length();
        }
        return length;
    }
}
