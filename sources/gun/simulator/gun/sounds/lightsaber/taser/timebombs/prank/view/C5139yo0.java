package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import androidx.work.WorkRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5139yo0 extends com.bytedance.sdk.component.OY.OY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5300a;
    public final /* synthetic */ No0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5139yo0(No0 no0, String str, int i, int i2) {
        super(str, i);
        this.f5300a = i2;
        this.b = no0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5300a;
        No0 no0 = this.b;
        switch (i) {
            case 0:
                ReentrantReadWriteLock.WriteLock writeLock = no0.n;
                writeLock.lock();
                try {
                    File[] fileArrListFiles = no0.k.listFiles();
                    if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                        HashMap map = new HashMap(fileArrListFiles.length);
                        ArrayList<File> arrayList = new ArrayList(fileArrListFiles.length);
                        for (File file : fileArrListFiles) {
                            if (file.isFile()) {
                                arrayList.add(file);
                                map.put(file, Long.valueOf(file.lastModified()));
                            }
                        }
                        Collections.sort(arrayList, new Ao0(map));
                        for (File file2 : arrayList) {
                            no0.l.put(file2.getName(), file2);
                            break;
                        }
                    }
                    writeLock.unlock();
                    Handler handler = no0.t;
                    TY ty = no0.s;
                    handler.removeCallbacks(ty);
                    handler.postDelayed(ty, WorkRequest.MIN_BACKOFF_MILLIS);
                    return;
                } catch (Throwable th) {
                    writeLock.unlock();
                    throw th;
                }
            default:
                No0.t(no0, 0L);
                return;
        }
    }
}
