package androidx.sqlite.util;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/sqlite/util/ProcessLock;", "", "Companion", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProcessLock {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f8386e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f8388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lock f8389c;
    public FileChannel d;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/sqlite/util/ProcessLock$Companion;", "", "", "TAG", "Ljava/lang/String;", "", "Ljava/util/concurrent/locks/Lock;", "threadLocksMap", "Ljava/util/Map;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ProcessLock(File file, String str, boolean z2) {
        Lock lock;
        this.f8387a = z2;
        this.f8388b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = f8386e;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f8389c = lock;
    }

    public final void a(boolean z2) {
        this.f8389c.lock();
        if (z2) {
            File file = this.f8388b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.d = channel;
            } catch (IOException e2) {
                this.d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e2);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f8389c.unlock();
    }
}
