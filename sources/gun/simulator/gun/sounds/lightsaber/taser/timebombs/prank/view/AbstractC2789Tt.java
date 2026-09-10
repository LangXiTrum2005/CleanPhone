package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Tt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2789Tt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f3799a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    public static void a(String str, String str2, String str3, InterfaceC2763St interfaceC2763St) {
        Object obj;
        ConcurrentHashMap concurrentHashMap;
        StringBuilder sb = new StringBuilder();
        byte[] bArr = {110, -104, 125, 17, -63, 58, 119, 9, 115, -109, 65};
        byte[] bArr2 = {7, -10, 30, 126, -84, 74, 27, 108};
        int i = 0;
        int i2 = 0;
        while (i < 11) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        File file = new File(str2, DM.m(sb, new String(bArr, StandardCharsets.UTF_8), str3));
        File file2 = new File(str2, str3);
        if (file2.exists()) {
            file2.getAbsolutePath();
            interfaceC2763St.n();
            return;
        }
        ConcurrentHashMap concurrentHashMap2 = f3799a;
        synchronized (concurrentHashMap2) {
            try {
                Object obj2 = concurrentHashMap2.get(str);
                if (obj2 == null) {
                    obj2 = new Object();
                    concurrentHashMap2.put(str, obj2);
                }
                obj = obj2;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (obj) {
            while (true) {
                try {
                    try {
                        concurrentHashMap = b;
                        if (!concurrentHashMap.containsKey(str) || ((Integer) concurrentHashMap.get(str)).intValue() != 1) {
                            break;
                        } else {
                            obj.wait();
                        }
                    } catch (InterruptedException e) {
                        StringBuilder sb2 = new StringBuilder();
                        byte[] bArr3 = {com.umeng.analytics.pro.cw.l, 36, 97, 70, -106, -111, 87, -95, 106, 45, 119, 65, -106, -101, 82, -1, 106};
                        byte[] bArr4 = {74, 75, 22, 40, -6, -2, 54, -59};
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < 17) {
                            if (i4 >= 8) {
                                i4 = 0;
                            }
                            bArr3[i3] = (byte) (bArr3[i3] ^ bArr4[i4]);
                            i3++;
                            i4++;
                        }
                        sb2.append(new String(bArr3, StandardCharsets.UTF_8));
                        sb2.append(e.getMessage());
                        new IOException(sb2.toString());
                        Thread.currentThread().interrupt();
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (file2.exists()) {
                file2.getAbsolutePath();
                interfaceC2763St.n();
            } else {
                concurrentHashMap.put(str, 1);
                C4981x20.u().t(new RunnableC2737Rt(file, interfaceC2763St, str, file2, obj));
            }
        }
    }
}
