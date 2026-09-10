package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class No0 extends BF {
    public final File k;
    public final LinkedHashMap l = new LinkedHashMap(0, 0.75f, true);
    public final ReentrantReadWriteLock.ReadLock m;
    public final ReentrantReadWriteLock.WriteLock n;
    public final Set o;
    public volatile long p;
    public volatile float q;
    public final C4165nl r;
    public final TY s;
    public final Handler t;

    public No0(File file) throws IOException {
        int i = 0;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.m = reentrantReadWriteLock.readLock();
        this.n = reentrantReadWriteLock.writeLock();
        this.o = Collections.newSetFromMap(new ConcurrentHashMap());
        this.p = 104857600L;
        this.q = 0.5f;
        this.r = new C4165nl(2);
        this.s = new TY(this, 3);
        this.t = new Handler(Looper.getMainLooper());
        if (file.exists() && file.isDirectory() && file.canRead() && file.canWrite()) {
            this.k = file;
            com.bytedance.sdk.component.OY.lc.LD(new C5139yo0(this, "DiskLruCache", 5, i));
            return;
        }
        throw new IOException("dir error!  ".concat(String.valueOf("exists: " + file.exists() + ", isDirectory: " + file.isDirectory() + ", canRead: " + file.canRead() + ", canWrite: " + file.canWrite())));
    }

    public static void t(No0 no0, long j) {
        HashSet<String> hashSet;
        String string;
        no0.getClass();
        HashSet hashSet2 = new HashSet();
        no0.n.lock();
        try {
            Iterator it = no0.l.entrySet().iterator();
            long length = 0;
            while (it.hasNext()) {
                length += ((File) ((Map.Entry) it.next()).getValue()).length();
            }
            if (length <= j) {
                no0.n.unlock();
                return;
            }
            long j2 = (long) (j * no0.q);
            hashSet = new HashSet();
            try {
                for (Map.Entry entry : no0.l.entrySet()) {
                    File file = (File) entry.getValue();
                    if (file == null || !file.exists()) {
                        hashSet.add(entry.getKey());
                    } else {
                        C4165nl c4165nl = no0.r;
                        String name = file.getName();
                        synchronized (c4165nl) {
                            try {
                                if (!TextUtils.isEmpty(name)) {
                                    boolean zContainsKey = c4165nl.f4758a.containsKey(name);
                                    if (!zContainsKey) {
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        long length2 = file.length();
                        File file2 = new File(file.getAbsolutePath() + "-tmp");
                        if (file.renameTo(file2)) {
                            hashSet2.add(file2);
                            length -= length2;
                            hashSet.add(entry.getKey());
                        }
                    }
                    if (length <= j2) {
                        break;
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    no0.l.remove((String) it2.next());
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            hashSet = null;
        }
        no0.n.unlock();
        Iterator it3 = no0.o.iterator();
        while (it3.hasNext()) {
            ((C4385qE) it3.next()).getClass();
            Vo0 vo0 = AbstractC4648tE.b;
            vo0.getClass();
            if (hashSet != null && !hashSet.isEmpty()) {
                int size = hashSet.size() + 1;
                String[] strArr = new String[size];
                Map map = (Map) vo0.f3895a.get(0);
                int i = -1;
                for (String str : hashSet) {
                    if (map != null) {
                        map.remove(str);
                    }
                    i++;
                    strArr[i] = str;
                }
                strArr[i + 1] = String.valueOf(0);
                try {
                    SQLiteDatabase writableDatabase = vo0.b.getWritableDatabase();
                    StringBuilder sb = new StringBuilder("key IN(");
                    if (size <= 0) {
                        string = "";
                    } else {
                        StringBuilder sb2 = new StringBuilder(size << 1);
                        sb2.append("?");
                        for (int i2 = 1; i2 < size; i2++) {
                            sb2.append(",?");
                        }
                        string = sb2.toString();
                    }
                    sb.append(string);
                    sb.append(") AND flag=?");
                    writableDatabase.delete("video_http_header_t", sb.toString(), strArr);
                } catch (Throwable unused3) {
                }
            }
            if (AbstractC4648tE.c) {
                "cache file removed, ".concat(String.valueOf(hashSet));
            }
        }
        com.bytedance.sdk.component.OY.lc.LD(new Bo0(no0, "trimSize", 1, hashSet2, 0));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BF
    public final void e(String str) {
        Integer num;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C4165nl c4165nl = this.r;
        synchronized (c4165nl) {
            if (!TextUtils.isEmpty(str) && (num = (Integer) c4165nl.f4758a.get(str)) != null) {
                if (num.intValue() == 1) {
                    c4165nl.f4758a.remove(str);
                    return;
                }
                c4165nl.f4758a.put(str, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BF
    public final void f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C4165nl c4165nl = this.r;
        synchronized (c4165nl) {
            if (!TextUtils.isEmpty(str)) {
                Integer num = (Integer) c4165nl.f4758a.get(str);
                if (num == null) {
                    c4165nl.f4758a.put(str, 1);
                    return;
                }
                c4165nl.f4758a.put(str, Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BF
    public final File g(String str) {
        ReentrantReadWriteLock.ReadLock readLock = this.m;
        if (!readLock.tryLock()) {
            return null;
        }
        File file = (File) this.l.get(str);
        readLock.unlock();
        return file;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BF
    public final File o(String str) {
        ReentrantReadWriteLock.ReadLock readLock = this.m;
        readLock.lock();
        LinkedHashMap linkedHashMap = this.l;
        File file = (File) linkedHashMap.get(str);
        readLock.unlock();
        if (file != null) {
            return file;
        }
        File file2 = new File(this.k, str);
        ReentrantReadWriteLock.WriteLock writeLock = this.n;
        writeLock.lock();
        linkedHashMap.put(str, file2);
        writeLock.unlock();
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((C4385qE) it.next()).getClass();
            if (AbstractC4648tE.c) {
                "new cache created: ".concat(String.valueOf(str));
            }
        }
        Handler handler = this.t;
        TY ty = this.s;
        handler.removeCallbacks(ty);
        handler.postDelayed(ty, WorkRequest.MIN_BACKOFF_MILLIS);
        return file2;
    }

    public final void u() {
        C4959wm0 c4959wm0C = C4959wm0.c();
        c4959wm0C.getClass();
        C5051xo0 c5051xo0 = new C5051xo0(c4959wm0C);
        if (PK.a()) {
            com.bytedance.sdk.component.OY.lc.LD(c5051xo0);
            No0 no0 = AbstractC4648tE.f5026a;
        } else {
            c5051xo0.run();
            No0 no1 = AbstractC4648tE.f5026a;
        }
        Context context = AbstractC4648tE.d;
        if (context != null) {
            Vo0 vo0B = Vo0.b(context);
            Map map = (Map) vo0B.f3895a.get(0);
            if (map != null) {
                map.clear();
            }
            vo0B.c.execute(new RunnableC5227zo0(vo0B));
        }
        this.t.removeCallbacks(this.s);
        int i = 1;
        com.bytedance.sdk.component.OY.lc.LD(new C5139yo0(this, "clear", i, i));
    }
}
