package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.os.IBinder;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ex, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1522ex {
    public static Method A00;
    public static byte[] A01;
    public static String[] A02 = {"yo3rzsHP", "ovGXPfera5IqPEl3yU6zb5JBHB3EIWiy", "u74kyRaxonnBYt1Y6p51HpVqv6hsrgGn", "QtPwpOHXWsaUu4k3Vckzdn9pXy2eEal7", "mlzCy4wxJD9Se8jXAiMGCsQSs6QItMsI", "apx1YwFHo6hUNLh041KALOIOcxntWD5v", "DpuUZqleS9Sqvpcm8LX8B8CCleS5JVHp", "asAzLd28WO2RncRAV7tJWCdNYMaRZ2g0"};

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{-59, -8, -15, -25, -17, -24, -40, -9, -20, -17, -59, -32, -24, -21, -28, -29, -97, -13, -18, -97, -24, -19, -11, -18, -22, -28, -97, -26, -28, -13, -56, -63, -24, -19, -29, -28, -15, -97, -11, -24, -32, -97, -15, -28, -27, -21, -28, -30, -13, -24, -18, -19, -65, -38, -30, -27, -34, -35, -103, -19, -24, -103, -21, -34, -19, -21, -30, -34, -17, -34, -103, -32, -34, -19, -62, -69, -30, -25, -35, -34, -21, -103, -26, -34, -19, -31, -24, -35, 39, 37, 52, 9, 2, 41, 46, 36, 37, 50};
    }

    static {
        A03();
    }

    public static IBinder A00(Bundle bundle, String str) {
        if (AbstractC1600gE.A02 >= 18) {
            return bundle.getBinder(str);
        }
        return A01(bundle, str);
    }

    public static IBinder A01(Bundle bundle, String str) {
        Method method = A00;
        String strA02 = A02(0, 10, 57);
        if (method == null) {
            try {
                Method getIBinder = Bundle.class.getMethod(A02(88, 10, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE), String.class);
                A00 = getIBinder;
                Method getIBinder2 = A00;
                getIBinder2.setAccessible(true);
                method = A00;
            } catch (NoSuchMethodException e) {
                AbstractC1561fb.A09(strA02, A02(52, 36, 47), e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            if (A02[6].charAt(28) == 'M') {
                throw new RuntimeException();
            }
            A02[6] = "KeBilsTN2QfbLy1yq08AcqYsRCtkUmmi";
            AbstractC1561fb.A09(strA02, A02(10, 42, 53), e2);
            return null;
        }
    }
}
