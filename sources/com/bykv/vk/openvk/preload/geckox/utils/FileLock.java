package com.bykv.vk.openvk.preload.geckox.utils;

import android.os.Process;
import com.applovin.impl.Z;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class FileLock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Integer> f13013a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f13015c;

    static {
        System.loadLibrary("file_lock_pgl");
    }

    private FileLock(String str, int i2) {
        this.f13015c = str;
        this.f13014b = i2;
    }

    public static FileLock a(String str) {
        try {
            int iD = d(str);
            nLockFile(iD);
            return new FileLock(str, iD);
        } catch (Exception e2) {
            StringBuilder sbY = android.support.v4.media.a.y("lock failed, file:", str, ", pid:");
            sbY.append(Process.myPid());
            sbY.append(" caused by:");
            sbY.append(e2.getMessage());
            throw new RuntimeException(sbY.toString());
        }
    }

    public static FileLock b(String str) {
        try {
            int iD = d(str);
            if (nTryLock(iD)) {
                return new FileLock(str, iD);
            }
            return null;
        } catch (Exception e2) {
            throw new RuntimeException(Z.m(e2, android.support.v4.media.a.y("try lock failed, file:", str, " caused by:")));
        }
    }

    public static FileLock c(String str) throws Exception {
        try {
            int iD = d(str);
            if (nTryLock(iD)) {
                return new FileLock(str, iD);
            }
            new FileLock(str, iD).b();
            return null;
        } catch (Exception e2) {
            throw new RuntimeException(Z.m(e2, android.support.v4.media.a.y("try lock failed, file:", str, " caused by:")));
        }
    }

    private static int d(String str) throws Exception {
        Integer numValueOf;
        Map<String, Integer> map = f13013a;
        synchronized (map) {
            try {
                numValueOf = map.get(str);
                if (numValueOf == null) {
                    new File(str).getParentFile().mkdirs();
                    numValueOf = Integer.valueOf(nGetFD(str));
                    map.put(str, numValueOf);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return numValueOf.intValue();
    }

    private static native int nGetFD(String str) throws Exception;

    private static native void nLockFile(int i2) throws Exception;

    private static native void nLockFileSegment(int i2, int i3) throws Exception;

    private static native void nRelease(int i2) throws Exception;

    private static native boolean nTryLock(int i2) throws Exception;

    private static native void nUnlockFile(int i2) throws Exception;

    public static FileLock a(String str, int i2) {
        try {
            int iD = d(str);
            nLockFileSegment(iD, i2);
            return new FileLock(str, iD);
        } catch (Exception e2) {
            throw new RuntimeException(Z.m(e2, android.support.v4.media.a.y("lock segment failed, file:", str, " caused by:")));
        }
    }

    public final void b() {
        Integer numRemove;
        Map<String, Integer> map = f13013a;
        synchronized (map) {
            numRemove = map.remove(this.f13015c);
        }
        try {
            nRelease(numRemove.intValue());
        } catch (Exception e2) {
            throw new RuntimeException("release lock failed, file:" + this.f13015c + " caused by:" + e2.getMessage());
        }
    }

    public final void a() {
        try {
            nUnlockFile(this.f13014b);
        } catch (Exception unused) {
            throw new RuntimeException("release lock failed，path:" + this.f13015c);
        }
    }
}
