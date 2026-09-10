package com.smartdigimkt.r3;

import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import com.smartdigimkt.n8.l;
import java.io.File;
import java.io.FileDescriptor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public class h {

    public class a implements Runnable {
        final /* synthetic */ com.smartdigimkt.w6.f X;

        /* JADX INFO: renamed from: com.smartdigimkt.r3.h$a$a, reason: collision with other inner class name */
        public class RunnableC0576a implements Runnable {
            final /* synthetic */ ExecutorService X;

            public RunnableC0576a(ExecutorService executorService) {
                this.X = executorService;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    b bVarA = h.a(com.smartdigimkt.d7.d.c().d(4, l.b(a.this.X.k0())));
                    if (bVarA != null) {
                        a.this.X.o(bVarA.f38074a);
                        a.this.X.n(bVarA.f38075b);
                    }
                } catch (Throwable unused) {
                }
                try {
                    synchronized (this.X) {
                        try {
                            this.X.notifyAll();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
        }

        public a(com.smartdigimkt.w6.f fVar) {
            this.X = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2);
            executorServiceNewFixedThreadPool.submit(new RunnableC0576a(executorServiceNewFixedThreadPool));
            try {
                synchronized (executorServiceNewFixedThreadPool) {
                    executorServiceNewFixedThreadPool.wait(5000L);
                }
                executorServiceNewFixedThreadPool.shutdownNow();
            } catch (Throwable unused) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f38074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f38075b;
    }

    public static b a(String str) {
        b bVar = null;
        try {
            if (TextUtils.isEmpty(str) || !new File(str).exists()) {
                return null;
            }
            b bVar2 = new b();
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(str);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                mediaMetadataRetriever.release();
                bVar2.f38074a = Integer.parseInt(strExtractMetadata);
                bVar2.f38075b = Integer.parseInt(strExtractMetadata2);
                return bVar2;
            } catch (Exception e2) {
                e = e2;
                bVar = bVar2;
            }
        } catch (Exception e3) {
            e = e3;
        }
        e.printStackTrace();
        return bVar;
    }

    public static b a(FileDescriptor fileDescriptor) {
        b bVar = null;
        if (fileDescriptor == null) {
            return null;
        }
        try {
            b bVar2 = new b();
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(fileDescriptor);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                mediaMetadataRetriever.release();
                bVar2.f38074a = Integer.parseInt(strExtractMetadata);
                bVar2.f38075b = Integer.parseInt(strExtractMetadata2);
                return bVar2;
            } catch (Exception e2) {
                e = e2;
                bVar = bVar2;
                e.printStackTrace();
                return bVar;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static b a(int i2, int i3, int i4, int i5) {
        if (i2 == 0 || i3 == 0) {
            return null;
        }
        b bVar = new b();
        float f = (i2 * 1.0f) / i3;
        float f2 = i4;
        float f3 = i5;
        if (f < (1.0f * f2) / f3) {
            bVar.f38075b = i5;
            bVar.f38074a = (int) (f3 * f);
            return bVar;
        }
        bVar.f38074a = i4;
        bVar.f38075b = (int) (f2 / f);
        return bVar;
    }

    public static b a(FileDescriptor fileDescriptor, int i2, int i3) {
        b bVarA = a(fileDescriptor);
        if (bVarA == null) {
            return null;
        }
        float f = (bVarA.f38074a * 1.0f) / bVarA.f38075b;
        float f2 = i2;
        float f3 = i3;
        if (f < (1.0f * f2) / f3) {
            bVarA.f38075b = i3;
            bVarA.f38074a = (int) Math.ceil(f3 * f);
            return bVarA;
        }
        bVarA.f38074a = i2;
        bVarA.f38075b = (int) Math.ceil(f2 / f);
        return bVarA;
    }

    public static void a(com.smartdigimkt.w6.f fVar, com.smartdigimkt.w6.g gVar) {
        if (fVar == null) {
            return;
        }
        synchronized (fVar) {
            try {
                if (!fVar.u0() && !TextUtils.isEmpty(fVar.k0())) {
                    fVar.a(true);
                    if (fVar.l0() <= 0 && fVar.j0() <= 0) {
                        if (gVar != null && gVar.Z() == 3 && fVar.h0() == 1 && TextUtils.equals(gVar.q0(), "2")) {
                            com.smartdigimkt.l7.b.a().g(new a(fVar));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
