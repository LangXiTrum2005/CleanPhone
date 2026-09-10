package sg.bigo.ads.common.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f47529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f47530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f47531c;
    private static long d;

    public static long a() {
        if (System.currentTimeMillis() - f47530b > ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
            f47529a = e();
            f47530b = System.currentTimeMillis();
        }
        return f47529a;
    }

    public static long b(Context context) {
        ActivityManager.MemoryInfo memoryInfoD = d(context);
        if (memoryInfoD == null) {
            return 0L;
        }
        return f.a(memoryInfoD.totalMem, 3);
    }

    public static int c(Context context) {
        try {
            return (int) Math.min(15728640L, (((long) ((ActivityManager) context.getSystemService("activity")).getLargeMemoryClass()) / 8) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        } catch (Exception unused) {
            return 15728640;
        }
    }

    private static ActivityManager.MemoryInfo d(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (Exception unused) {
            return null;
        }
    }

    private static long e() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (Throwable th) {
            sg.bigo.ads.common.t.a.a(0, "StorageUtils", "getExternalStorageRemainSpace" + th.getMessage());
            return 0L;
        }
    }

    private static long f() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    public static long a(Context context) {
        ActivityManager.MemoryInfo memoryInfoD = d(context);
        if (memoryInfoD == null) {
            return 0L;
        }
        return f.a(memoryInfoD.availMem, 3);
    }

    public static boolean b() {
        return f() > ServiceProvider.HTTP_CACHE_DISK_SIZE;
    }

    public static long c() {
        if (System.currentTimeMillis() - d > ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
            try {
                f47531c = f();
            } catch (Throwable th) {
                sg.bigo.ads.common.t.a.a(0, "StorageUtils", th.toString());
            }
            d = System.currentTimeMillis();
        }
        return f47531c;
    }

    public static File d() {
        return new File(Environment.getExternalStorageDirectory(), "Pictures");
    }

    public static <T> Set<T> a(final int i2) {
        return Collections.newSetFromMap(new LinkedHashMap<T, Boolean>() { // from class: sg.bigo.ads.common.utils.p.1
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<T, Boolean> entry) {
                return size() > i2;
            }
        });
    }
}
