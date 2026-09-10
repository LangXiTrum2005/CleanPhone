package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.concurrent.futures.ResolvableFuture;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ProfileVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ResolvableFuture f7983a = new ResolvableFuture();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f7984b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static CompilationStatus f7985c = null;

    public static class Api33Impl {
        public static PackageInfo a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    public static class Cache {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f7988c;
        public final long d;

        public Cache(int i2, int i3, long j, long j2) {
            this.f7986a = i2;
            this.f7987b = i3;
            this.f7988c = j;
            this.d = j2;
        }

        public static Cache a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                Cache cache = new Cache(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return cache;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }

        public final void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f7986a);
                dataOutputStream.writeInt(this.f7987b);
                dataOutputStream.writeLong(this.f7988c);
                dataOutputStream.writeLong(this.d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof Cache)) {
                Cache cache = (Cache) obj;
                if (this.f7987b == cache.f7987b && this.f7988c == cache.f7988c && this.f7986a == cache.f7986a && this.d == cache.d) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.f7987b), Long.valueOf(this.f7988c), Integer.valueOf(this.f7986a), Long.valueOf(this.d));
        }
    }

    public static class CompilationStatus {

        @Retention(RetentionPolicy.SOURCE)
        public @interface ResultCode {
        }
    }

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? Api33Impl.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static CompilationStatus b() {
        CompilationStatus compilationStatus = new CompilationStatus();
        f7985c = compilationStatus;
        f7983a.k(compilationStatus);
        return f7985c;
    }

    public static void c(Context context, boolean z2) {
        Cache cacheA;
        int i2;
        if (z2 || f7985c == null) {
            synchronized (f7984b) {
                if (!z2) {
                    try {
                        if (f7985c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 28 && i3 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i4 = 0;
                    boolean z3 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z4 = file2.exists() && length2 > 0;
                    try {
                        long jA = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                cacheA = Cache.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            cacheA = null;
                        }
                        if (cacheA != null && cacheA.f7988c == jA && (i2 = cacheA.f7987b) != 2) {
                            i4 = i2;
                        } else if (z3) {
                            i4 = 1;
                        } else if (z4) {
                            i4 = 2;
                        }
                        if (z2 && z4 && i4 != 1) {
                            i4 = 2;
                        }
                        if (cacheA != null && cacheA.f7987b == 2 && i4 == 1 && length < cacheA.d) {
                            i4 = 3;
                        }
                        Cache cache = new Cache(1, i4, jA, length2);
                        if (cacheA == null || !cacheA.equals(cache)) {
                            try {
                                cache.b(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
