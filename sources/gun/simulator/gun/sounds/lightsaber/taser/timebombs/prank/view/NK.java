package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class NK extends MediaDataSource {
    public static final ConcurrentHashMap e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NG f3452a;
    public long b = -2147483648L;
    public final Context c;
    public final Uo0 d;

    public NK(Context context, Uo0 uo0) {
        this.c = context;
        this.d = uo0;
        this.f3452a = new NG(uo0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.NXR();
        NG ng = this.f3452a;
        if (ng != null) {
            try {
                if (!ng.f) {
                    ng.h.close();
                }
                File file = ng.c;
                if (file != null) {
                    file.setLastModified(System.currentTimeMillis());
                }
                File file2 = ng.d;
                if (file2 != null) {
                    file2.setLastModified(System.currentTimeMillis());
                }
            } catch (Throwable unused) {
            }
            ng.f = true;
        }
        e.remove(this.d.STP());
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        if (this.b == -2147483648L) {
            long j = -1;
            if (this.c == null || TextUtils.isEmpty(this.d.NXR())) {
                return -1L;
            }
            NG ng = this.f3452a;
            if (ng.d.exists()) {
                ng.f3449a = ng.d.length();
            } else {
                synchronized (ng.b) {
                    int i = 0;
                    while (true) {
                        try {
                            if (ng.f3449a == -2147483648L) {
                                i += 15;
                                try {
                                    ng.b.wait(5L);
                                    if (i > 20000) {
                                        break;
                                    }
                                } catch (InterruptedException unused) {
                                    throw new IOException("total length InterruptException");
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                this.b = j;
            }
            j = ng.f3449a;
            this.b = j;
        }
        return this.b;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        NG ng = this.f3452a;
        ng.getClass();
        try {
            int i3 = -1;
            if (j != ng.f3449a) {
                int i4 = 0;
                int i5 = 0;
                while (!ng.f) {
                    synchronized (ng.b) {
                        try {
                            File file = ng.d;
                            if (j < (file.exists() ? file.length() : ng.c.length())) {
                                ng.h.seek(j);
                                i5 = ng.h.read(bArr, i, i2);
                            } else {
                                i4 += 33;
                                ng.b.wait(33L);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (i5 > 0) {
                        i3 = i5;
                        break;
                    }
                    if (i4 >= 20000) {
                        throw new SocketTimeoutException();
                    }
                }
            }
            int length = bArr.length;
            Objects.toString(Thread.currentThread());
            return i3;
        } catch (Throwable th2) {
            if (th2 instanceof IOException) {
                throw th2;
            }
            throw new IOException();
        }
    }
}
