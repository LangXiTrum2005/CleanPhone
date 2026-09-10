package com.google.android.exoplayer2.offline;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.scheduler.RequirementsWatcher;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadManager {
    public static final Requirements o = new Requirements(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DefaultDownloadIndex f18262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InternalHandler f18263c;
    public final e d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet f18264e;
    public int f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18266i;
    public int j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f18267l;
    public List m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RequirementsWatcher f18268n;

    public static final class DownloadUpdate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Download f18269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f18270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f18271c;
        public final Exception d;

        public DownloadUpdate(Download download, boolean z2, ArrayList arrayList, Exception exc) {
            this.f18269a = download;
            this.f18270b = z2;
            this.f18271c = arrayList;
            this.d = exc;
        }
    }

    public static final class InternalHandler extends Handler {
        public static final /* synthetic */ int m = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HandlerThread f18272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DefaultDownloadIndex f18273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DefaultDownloaderFactory f18274c;
        public final Handler d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ArrayList f18275e;
        public final HashMap f;
        public int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f18276h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f18277i;
        public int j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f18278l;

        public InternalHandler(HandlerThread handlerThread, DefaultDownloadIndex defaultDownloadIndex, DefaultDownloaderFactory defaultDownloaderFactory, Handler handler, int i2, boolean z2) {
            super(handlerThread.getLooper());
            this.f18272a = handlerThread;
            this.f18273b = defaultDownloadIndex;
            this.f18274c = defaultDownloaderFactory;
            this.d = handler;
            this.f18277i = i2;
            this.j = 5;
            this.f18276h = z2;
            this.f18275e = new ArrayList();
            this.f = new HashMap();
        }

        public static Download a(Download download, int i2, int i3) {
            return new Download(download.f18255a, i2, download.f18257c, System.currentTimeMillis(), download.f18258e, i3, 0, download.f18259h);
        }

        public final Download b(String str, boolean z2) {
            int iC = c(str);
            if (iC != -1) {
                return (Download) this.f18275e.get(iC);
            }
            if (!z2) {
                return null;
            }
            try {
                return this.f18273b.d(str);
            } catch (IOException e2) {
                Log.d("DownloadManager", "Failed to load download: " + str, e2);
                return null;
            }
        }

        public final int c(String str) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.f18275e;
                if (i2 >= arrayList.size()) {
                    return -1;
                }
                if (((Download) arrayList.get(i2)).f18255a.X.equals(str)) {
                    return i2;
                }
                i2++;
            }
        }

        public final void d(Download download) {
            int i2 = download.f18256b;
            Assertions.d((i2 == 3 || i2 == 4) ? false : true);
            int iC = c(download.f18255a.X);
            ArrayList arrayList = this.f18275e;
            if (iC == -1) {
                arrayList.add(download);
                Collections.sort(arrayList, new b());
            } else {
                boolean z2 = download.f18257c != ((Download) arrayList.get(iC)).f18257c;
                arrayList.set(iC, download);
                if (z2) {
                    Collections.sort(arrayList, new b());
                }
            }
            try {
                this.f18273b.j(download);
            } catch (IOException e2) {
                Log.d("DownloadManager", "Failed to update index.", e2);
            }
            this.d.obtainMessage(2, new DownloadUpdate(download, false, new ArrayList(arrayList), null)).sendToTarget();
        }

        public final Download e(Download download, int i2, int i3) {
            Assertions.d((i2 == 3 || i2 == 4) ? false : true);
            Download downloadA = a(download, i2, i3);
            d(downloadA);
            return downloadA;
        }

        public final void f(Download download, int i2) {
            if (i2 == 0) {
                if (download.f18256b == 1) {
                    e(download, 0, 0);
                }
            } else if (i2 != download.f) {
                int i3 = download.f18256b;
                if (i3 == 0 || i3 == 2) {
                    i3 = 1;
                }
                d(new Download(download.f18255a, i3, download.f18257c, System.currentTimeMillis(), download.f18258e, i2, 0, download.f18259h));
            }
        }

        public final void g() {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                ArrayList arrayList = this.f18275e;
                if (i2 >= arrayList.size()) {
                    return;
                }
                Download download = (Download) arrayList.get(i2);
                HashMap map = this.f;
                Task task = (Task) map.get(download.f18255a.X);
                DefaultDownloaderFactory defaultDownloaderFactory = this.f18274c;
                int i4 = download.f18256b;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            task.getClass();
                            Assertions.d(!task.e0);
                            if (this.f18276h || this.g != 0 || i3 >= this.f18277i) {
                                e(download, 0, 0);
                                task.a(false);
                            }
                        } else {
                            if (i4 != 5 && i4 != 7) {
                                throw new IllegalStateException();
                            }
                            if (task != null) {
                                if (!task.e0) {
                                    task.a(false);
                                }
                            } else if (!this.f18278l) {
                                DownloadRequest downloadRequest = download.f18255a;
                                Task task2 = new Task(download.f18255a, defaultDownloaderFactory.a(downloadRequest), download.f18259h, true, this.j, this);
                                map.put(downloadRequest.X, task2);
                                this.f18278l = true;
                                task2.start();
                            }
                        }
                    } else if (task != null) {
                        Assertions.d(!task.e0);
                        task.a(false);
                    }
                } else if (task != null) {
                    Assertions.d(!task.e0);
                    task.a(false);
                } else if (this.f18276h || this.g != 0 || this.k >= this.f18277i) {
                    task = null;
                } else {
                    Download downloadE = e(download, 2, 0);
                    DownloadRequest downloadRequest2 = downloadE.f18255a;
                    Task task3 = new Task(downloadE.f18255a, defaultDownloaderFactory.a(downloadRequest2), downloadE.f18259h, false, this.j, this);
                    map.put(downloadRequest2.X, task3);
                    int i5 = this.k;
                    this.k = i5 + 1;
                    if (i5 == 0) {
                        sendEmptyMessageDelayed(11, 5000L);
                    }
                    task3.start();
                    task = task3;
                }
                if (task != null && !task.e0) {
                    i3++;
                }
                i2++;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:155:0x0321  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r23v0, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v6 */
        /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList] */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            ?? arrayList;
            int i2;
            DownloadCursor downloadCursorG = null;
            int i3 = 7;
            int i4 = 0;
            i = 0;
            int i5 = 0;
            int i6 = 0;
            switch (message.what) {
                case 0:
                    int i7 = message.arg1;
                    DefaultDownloadIndex defaultDownloadIndex = this.f18273b;
                    ArrayList arrayList2 = this.f18275e;
                    this.g = i7;
                    try {
                        try {
                            defaultDownloadIndex.l();
                            downloadCursorG = defaultDownloadIndex.g(0, 1, 2, 5, 7);
                            while (downloadCursorG.moveToNext()) {
                                arrayList2.add(DefaultDownloadIndex.e(((DefaultDownloadIndex.DownloadCursorImpl) downloadCursorG).X));
                            }
                        } catch (Throwable th) {
                            Util.h(downloadCursorG);
                            throw th;
                        }
                    } catch (IOException e2) {
                        Log.d("DownloadManager", "Failed to load index.", e2);
                        arrayList2.clear();
                        break;
                    }
                    Util.h(downloadCursorG);
                    this.d.obtainMessage(0, new ArrayList(arrayList2)).sendToTarget();
                    g();
                    i5 = 1;
                    this.d.obtainMessage(1, i5, this.f.size()).sendToTarget();
                    return;
                case 1:
                    this.f18276h = message.arg1 != 0;
                    g();
                    i5 = 1;
                    this.d.obtainMessage(1, i5, this.f.size()).sendToTarget();
                    return;
                case 2:
                    this.g = message.arg1;
                    g();
                    i5 = 1;
                    this.d.obtainMessage(1, i5, this.f.size()).sendToTarget();
                    return;
                case 3:
                    String str = (String) message.obj;
                    int i8 = message.arg1;
                    DefaultDownloadIndex defaultDownloadIndex2 = this.f18273b;
                    if (str != null) {
                        Download downloadB = b(str, false);
                        if (downloadB != null) {
                            f(downloadB, i8);
                        } else {
                            try {
                                defaultDownloadIndex2.n(i8, str);
                            } catch (IOException e3) {
                                Log.d("DownloadManager", "Failed to set manual stop reason: ".concat(str), e3);
                            }
                        }
                        break;
                    } else {
                        while (true) {
                            ArrayList arrayList3 = this.f18275e;
                            if (i6 < arrayList3.size()) {
                                f((Download) arrayList3.get(i6), i8);
                                i6++;
                            } else {
                                try {
                                    defaultDownloadIndex2.b();
                                    try {
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put(DownloadService.KEY_STOP_REASON, Integer.valueOf(i8));
                                        defaultDownloadIndex2.f18250b.getWritableDatabase().update(defaultDownloadIndex2.f18249a, contentValues, DefaultDownloadIndex.f18248e, null);
                                    } catch (SQLException e4) {
                                        throw new DatabaseIOException(e4);
                                    }
                                } catch (IOException e5) {
                                    Log.d("DownloadManager", "Failed to set manual stop reason", e5);
                                }
                            }
                            break;
                        }
                    }
                    g();
                    i5 = 1;
                    this.d.obtainMessage(1, i5, this.f.size()).sendToTarget();
                    return;
                case 4:
                    this.f18277i = message.arg1;
                    g();
                    i5 = 1;
                    this.d.obtainMessage(1, i5, this.f.size()).sendToTarget();
                    return;
                case 5:
                    this.j = message.arg1;
                    i5 = 1;
                    this.d.obtainMessage(1, i5, this.f.size()).sendToTarget();
                    return;
                case 6:
                    DownloadRequest downloadRequest = (DownloadRequest) message.obj;
                    int i9 = message.arg1;
                    Download downloadB2 = b(downloadRequest.X, true);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (downloadB2 != null) {
                        Requirements requirements = DownloadManager.o;
                        int i10 = downloadB2.f18256b;
                        long j = (i10 == 5 || i10 == 3 || i10 == 4) ? jCurrentTimeMillis : downloadB2.f18257c;
                        if (i10 != 5 && i10 != 7) {
                            i3 = i9 != 0 ? 1 : 0;
                        }
                        DownloadRequest downloadRequest2 = downloadB2.f18255a;
                        downloadRequest2.getClass();
                        Assertions.b(downloadRequest2.X.equals(downloadRequest.X));
                        List list = downloadRequest2.e0;
                        if (list.isEmpty()) {
                            arrayList = Collections.EMPTY_LIST;
                        } else {
                            List list2 = downloadRequest.e0;
                            if (list2.isEmpty()) {
                                arrayList = Collections.EMPTY_LIST;
                            } else {
                                arrayList = new ArrayList(list);
                                for (int i11 = 0; i11 < list2.size(); i11++) {
                                    StreamKey streamKey = (StreamKey) list2.get(i11);
                                    if (!arrayList.contains(streamKey)) {
                                        arrayList.add(streamKey);
                                    }
                                }
                            }
                        }
                        d(new Download(new DownloadRequest(downloadRequest2.X, downloadRequest.f18282Y, downloadRequest.Z, arrayList, downloadRequest.f0, downloadRequest.g0, downloadRequest.h0), i3, j, jCurrentTimeMillis, i9));
                    } else {
                        d(new Download(downloadRequest, i9 != 0 ? 1 : 0, jCurrentTimeMillis, jCurrentTimeMillis, i9));
                    }
                    g();
                    i5 = 1;
                    this.d.obtainMessage(1, i5, this.f.size()).sendToTarget();
                    return;
                case 7:
                    String str2 = (String) message.obj;
                    Download downloadB3 = b(str2, true);
                    if (downloadB3 == null) {
                        Log.c("DownloadManager", "Failed to remove nonexistent download: " + str2);
                    } else {
                        e(downloadB3, 5, 0);
                        g();
                    }
                    i5 = 1;
                    this.d.obtainMessage(1, i5, this.f.size()).sendToTarget();
                    return;
                case 8:
                    DefaultDownloadIndex defaultDownloadIndex3 = this.f18273b;
                    ArrayList arrayList4 = new ArrayList();
                    try {
                        DownloadCursor downloadCursorG2 = defaultDownloadIndex3.g(3, 4);
                        while (downloadCursorG2.moveToNext()) {
                            try {
                                arrayList4.add(DefaultDownloadIndex.e(((DefaultDownloadIndex.DownloadCursorImpl) downloadCursorG2).X));
                            } catch (Throwable th2) {
                                try {
                                    ((DefaultDownloadIndex.DownloadCursorImpl) downloadCursorG2).close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                        ((DefaultDownloadIndex.DownloadCursorImpl) downloadCursorG2).close();
                        while (true) {
                            ArrayList arrayList5 = this.f18275e;
                            if (i2 >= arrayList5.size()) {
                                for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                                    arrayList5.add(a((Download) arrayList4.get(i12), 5, 0));
                                }
                                Collections.sort(arrayList5, new b());
                                try {
                                    defaultDownloadIndex3.m();
                                    break;
                                } catch (IOException e6) {
                                    Log.d("DownloadManager", "Failed to update index.", e6);
                                }
                                ArrayList arrayList6 = new ArrayList(arrayList5);
                                for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                                    this.d.obtainMessage(2, new DownloadUpdate((Download) arrayList5.get(i13), false, arrayList6, null)).sendToTarget();
                                }
                                g();
                                i5 = 1;
                                this.d.obtainMessage(1, i5, this.f.size()).sendToTarget();
                                return;
                            }
                            arrayList5.set(i2, a((Download) arrayList5.get(i2), 5, 0));
                            i2++;
                        }
                    } catch (IOException unused) {
                        Log.c("DownloadManager", "Failed to load downloads.");
                    }
                    i2 = 0;
                    break;
                case 9:
                    Task task = (Task) message.obj;
                    String str3 = task.X.X;
                    this.f.remove(str3);
                    boolean z2 = task.e0;
                    if (z2) {
                        this.f18278l = false;
                    } else {
                        int i14 = this.k - 1;
                        this.k = i14;
                        if (i14 == 0) {
                            removeMessages(11);
                        }
                    }
                    if (!task.h0) {
                        Exception exc = task.i0;
                        if (exc != null) {
                            Log.d("DownloadManager", "Task failed: " + task.X + ", " + z2, exc);
                        }
                        Download downloadB4 = b(str3, false);
                        downloadB4.getClass();
                        int i15 = downloadB4.f18256b;
                        if (i15 == 2) {
                            Assertions.d(!z2);
                            Download download = new Download(downloadB4.f18255a, exc == null ? 3 : 4, downloadB4.f18257c, System.currentTimeMillis(), downloadB4.f18258e, downloadB4.f, exc == null ? 0 : 1, downloadB4.f18259h);
                            ArrayList arrayList7 = this.f18275e;
                            arrayList7.remove(c(download.f18255a.X));
                            try {
                                this.f18273b.j(download);
                            } catch (IOException e7) {
                                Log.d("DownloadManager", "Failed to update index.", e7);
                            }
                            this.d.obtainMessage(2, new DownloadUpdate(download, false, new ArrayList(arrayList7), exc)).sendToTarget();
                        } else {
                            if (i15 != 5 && i15 != 7) {
                                throw new IllegalStateException();
                            }
                            Assertions.d(z2);
                            if (downloadB4.f18256b == 7) {
                                int i16 = downloadB4.f;
                                e(downloadB4, i16 == 0 ? 0 : 1, i16);
                                g();
                            } else {
                                DownloadRequest downloadRequest3 = downloadB4.f18255a;
                                int iC = c(downloadRequest3.X);
                                ArrayList arrayList8 = this.f18275e;
                                arrayList8.remove(iC);
                                try {
                                    DefaultDownloadIndex defaultDownloadIndex4 = this.f18273b;
                                    String str4 = downloadRequest3.X;
                                    defaultDownloadIndex4.b();
                                    try {
                                        defaultDownloadIndex4.f18250b.getWritableDatabase().delete(defaultDownloadIndex4.f18249a, "id = ?", new String[]{str4});
                                    } catch (SQLiteException e8) {
                                        throw new DatabaseIOException(e8);
                                    }
                                } catch (IOException unused2) {
                                    Log.c("DownloadManager", "Failed to remove from database");
                                }
                                this.d.obtainMessage(2, new DownloadUpdate(downloadB4, true, new ArrayList(arrayList8), null)).sendToTarget();
                            }
                        }
                        g();
                        break;
                    } else {
                        g();
                    }
                    this.d.obtainMessage(1, i5, this.f.size()).sendToTarget();
                    return;
                case 10:
                    Task task2 = (Task) message.obj;
                    int i17 = message.arg1;
                    int i18 = message.arg2;
                    int i19 = Util.f18979a;
                    long j2 = ((((long) i17) & 4294967295L) << 32) | (4294967295L & ((long) i18));
                    Download downloadB5 = b(task2.X.X, false);
                    downloadB5.getClass();
                    if (j2 == downloadB5.f18258e || j2 == -1) {
                        return;
                    }
                    d(new Download(downloadB5.f18255a, downloadB5.f18256b, downloadB5.f18257c, System.currentTimeMillis(), j2, downloadB5.f, downloadB5.g, downloadB5.f18259h));
                    return;
                case 11:
                    while (true) {
                        ArrayList arrayList9 = this.f18275e;
                        if (i4 >= arrayList9.size()) {
                            sendEmptyMessageDelayed(11, 5000L);
                            return;
                        }
                        Download download2 = (Download) arrayList9.get(i4);
                        if (download2.f18256b == 2) {
                            try {
                                this.f18273b.j(download2);
                            } catch (IOException e9) {
                                Log.d("DownloadManager", "Failed to update index.", e9);
                            }
                        }
                        i4++;
                    }
                    break;
                case 12:
                    Iterator it = this.f.values().iterator();
                    while (it.hasNext()) {
                        ((Task) it.next()).a(true);
                    }
                    try {
                        this.f18273b.l();
                        break;
                    } catch (IOException e10) {
                        Log.d("DownloadManager", "Failed to update index.", e10);
                    }
                    this.f18275e.clear();
                    this.f18272a.quit();
                    synchronized (this) {
                        notifyAll();
                        break;
                    }
                    return;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    public interface Listener {
        default void onDownloadChanged(DownloadManager downloadManager, Download download, Exception exc) {
        }

        default void onDownloadRemoved(DownloadManager downloadManager, Download download) {
        }

        default void onDownloadsPausedChanged(DownloadManager downloadManager, boolean z2) {
        }

        default void onIdle(DownloadManager downloadManager) {
        }

        default void onInitialized(DownloadManager downloadManager) {
        }

        default void onRequirementsStateChanged(DownloadManager downloadManager, Requirements requirements, int i2) {
        }

        default void onWaitingForRequirementsChanged(DownloadManager downloadManager, boolean z2) {
        }
    }

    public static class Task extends Thread implements Downloader.ProgressListener {
        public final DownloadRequest X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Downloader f18279Y;
        public final DownloadProgress Z;
        public final boolean e0;
        public final int f0;
        public volatile InternalHandler g0;
        public volatile boolean h0;
        public Exception i0;
        public long j0 = -1;

        public Task(DownloadRequest downloadRequest, Downloader downloader, DownloadProgress downloadProgress, boolean z2, int i2, InternalHandler internalHandler) {
            this.X = downloadRequest;
            this.f18279Y = downloader;
            this.Z = downloadProgress;
            this.e0 = z2;
            this.f0 = i2;
            this.g0 = internalHandler;
        }

        public final void a(boolean z2) {
            if (z2) {
                this.g0 = null;
            }
            if (this.h0) {
                return;
            }
            this.h0 = true;
            this.f18279Y.cancel();
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.e0) {
                    this.f18279Y.remove();
                } else {
                    long j = -1;
                    int i2 = 0;
                    while (!this.h0) {
                        try {
                            this.f18279Y.a(this);
                            break;
                        } catch (IOException e2) {
                            if (!this.h0) {
                                long j2 = this.Z.f18280a;
                                if (j2 != j) {
                                    i2 = 0;
                                    j = j2;
                                }
                                int i3 = i2 + 1;
                                if (i3 > this.f0) {
                                    throw e2;
                                }
                                Thread.sleep(Math.min(i2 * 1000, 5000));
                                i2 = i3;
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e3) {
                this.i0 = e3;
            }
            InternalHandler internalHandler = this.g0;
            if (internalHandler != null) {
                internalHandler.obtainMessage(9, this).sendToTarget();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [com.google.android.exoplayer2.offline.a] */
    public DownloadManager(Context context, DatabaseProvider databaseProvider, Cache cache, HttpDataSource.Factory factory, ExecutorService executorService) {
        DefaultDownloadIndex defaultDownloadIndex = new DefaultDownloadIndex(databaseProvider);
        CacheDataSource.Factory factory2 = new CacheDataSource.Factory();
        factory2.f18844a = cache;
        factory2.d = factory;
        DefaultDownloaderFactory defaultDownloaderFactory = new DefaultDownloaderFactory(factory2, executorService);
        this.f18261a = context.getApplicationContext();
        this.f18262b = defaultDownloadIndex;
        this.j = 3;
        this.f18266i = true;
        this.m = Collections.EMPTY_LIST;
        this.f18264e = new CopyOnWriteArraySet();
        Handler handlerM = Util.m(new Handler.Callback() { // from class: com.google.android.exoplayer2.offline.a
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                Requirements requirements = DownloadManager.o;
                DownloadManager downloadManager = this.X;
                downloadManager.getClass();
                int i2 = message.what;
                CopyOnWriteArraySet copyOnWriteArraySet = downloadManager.f18264e;
                if (i2 == 0) {
                    List list = (List) message.obj;
                    downloadManager.f18265h = true;
                    downloadManager.m = Collections.unmodifiableList(list);
                    boolean zD = downloadManager.d();
                    Iterator it = copyOnWriteArraySet.iterator();
                    while (it.hasNext()) {
                        ((DownloadManager.Listener) it.next()).onInitialized(downloadManager);
                    }
                    if (zD) {
                        downloadManager.a();
                    }
                } else if (i2 == 1) {
                    int i3 = message.arg1;
                    int i4 = message.arg2;
                    int i5 = downloadManager.f - i3;
                    downloadManager.f = i5;
                    downloadManager.g = i4;
                    if (i4 != 0 || i5 != 0) {
                        return true;
                    }
                    Iterator it2 = copyOnWriteArraySet.iterator();
                    while (it2.hasNext()) {
                        ((DownloadManager.Listener) it2.next()).onIdle(downloadManager);
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException();
                    }
                    DownloadManager.DownloadUpdate downloadUpdate = (DownloadManager.DownloadUpdate) message.obj;
                    downloadManager.m = Collections.unmodifiableList(downloadUpdate.f18271c);
                    boolean zD2 = downloadManager.d();
                    boolean z2 = downloadUpdate.f18270b;
                    Download download = downloadUpdate.f18269a;
                    if (z2) {
                        Iterator it3 = copyOnWriteArraySet.iterator();
                        while (it3.hasNext()) {
                            ((DownloadManager.Listener) it3.next()).onDownloadRemoved(downloadManager, download);
                        }
                    } else {
                        Iterator it4 = copyOnWriteArraySet.iterator();
                        while (it4.hasNext()) {
                            ((DownloadManager.Listener) it4.next()).onDownloadChanged(downloadManager, download, downloadUpdate.d);
                        }
                    }
                    if (zD2) {
                        downloadManager.a();
                        return true;
                    }
                }
                return true;
            }
        });
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        InternalHandler internalHandler = new InternalHandler(handlerThread, defaultDownloadIndex, defaultDownloaderFactory, handlerM, this.j, this.f18266i);
        this.f18263c = internalHandler;
        e eVar = new e(this);
        this.d = eVar;
        RequirementsWatcher requirementsWatcher = new RequirementsWatcher(context, eVar, o);
        this.f18268n = requirementsWatcher;
        int iB = requirementsWatcher.b();
        this.k = iB;
        this.f = 1;
        internalHandler.obtainMessage(0, iB, 0).sendToTarget();
    }

    public final void a() {
        Iterator it = this.f18264e.iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).onWaitingForRequirementsChanged(this, this.f18267l);
        }
    }

    public final void b(RequirementsWatcher requirementsWatcher, int i2) {
        Requirements requirements = requirementsWatcher.f18308c;
        if (this.k != i2) {
            this.k = i2;
            this.f++;
            this.f18263c.obtainMessage(2, i2, 0).sendToTarget();
        }
        boolean zD = d();
        Iterator it = this.f18264e.iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).onRequirementsStateChanged(this, requirements, i2);
        }
        if (zD) {
            a();
        }
    }

    public final void c(boolean z2) {
        if (this.f18266i == z2) {
            return;
        }
        this.f18266i = z2;
        this.f++;
        this.f18263c.obtainMessage(1, z2 ? 1 : 0, 0).sendToTarget();
        boolean zD = d();
        Iterator it = this.f18264e.iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).onDownloadsPausedChanged(this, z2);
        }
        if (zD) {
            a();
        }
    }

    public final boolean d() {
        boolean z2;
        if (!this.f18266i && this.k != 0) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.m.size()) {
                    z2 = false;
                    break;
                }
                if (((Download) this.m.get(i2)).f18256b == 0) {
                    z2 = true;
                    break;
                }
                i2++;
            }
        } else {
            z2 = false;
            break;
        }
        boolean z3 = this.f18267l != z2;
        this.f18267l = z2;
        return z3;
    }
}
