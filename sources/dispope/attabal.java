package dispope;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: CopyLock.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final Map<String, Lock> f25328marial = new HashMap();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final File f25329attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final boolean f25330dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Lock f25331saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public FileChannel f25332wireman;

    public attabal(String str, File file, boolean z) {
        File file2 = new File(file, str + ".lck");
        this.f25329attabal = file2;
        this.f25331saneness = attabal(file2.getAbsolutePath());
        this.f25330dern = z;
    }

    public static Lock attabal(String str) {
        Lock reentrantLock;
        Map<String, Lock> map = f25328marial;
        synchronized (map) {
            try {
                reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return reentrantLock;
    }

    public void dern() {
        FileChannel fileChannel = this.f25332wireman;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f25331saneness.unlock();
    }

    public void saneness() {
        this.f25331saneness.lock();
        if (this.f25330dern) {
            try {
                FileChannel channel = new FileOutputStream(this.f25329attabal).getChannel();
                this.f25332wireman = channel;
                channel.lock();
            } catch (IOException e) {
                throw new IllegalStateException("Unable to grab copy lock.", e);
            }
        }
    }
}
