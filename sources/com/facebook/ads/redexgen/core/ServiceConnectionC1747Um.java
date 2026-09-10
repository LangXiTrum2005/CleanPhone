package com.facebook.ads.redexgen.core;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Um, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ServiceConnectionC1747Um implements ServiceConnection {
    public static byte[] A01;
    public static String[] A02 = {"Vw4807oGxAdaHl5Al", "61OeIm55zagm9eF8TwwypJ2x", "EMmzBhTNP4w9g", "EYH0yzb9nIvkx5HKrwnVnQphst8", "oJpEUQYv6dauwAdzygMcXKep8asdjHHS", "ZEL", "ZTCWoVSxq9DuX", "VaiI"};
    public final /* synthetic */ C1748Un A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b2 = (byte) ((bArrCopyOfRange[i5] - i4) - 13);
            if (A02[7].length() != 4) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[6] = "dt08HEEvYnWJr";
            strArr[2] = "T3OITLjrwLx4m";
            bArrCopyOfRange[i5] = b2;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{98, 116, -127, -123, 120, 114, 116, 47, 114, 126, 125, 125, 116, 114, -125, 116, 115, -66, -48, -35, -31, -44, -50, -48, -117, -49, -44, -34, -50, -38, -39, -39, -48, -50, -33, -48, -49};
    }

    static {
        A01();
    }

    public ServiceConnectionC1747Um(C1748Un c1748Un) {
        this.A00 = c1748Un;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.A00.A08(AbstractC1712Td.A1r, new C1713Te(A00(0, 17, 2)));
        this.A00.A01 = true;
        this.A00.A00 = new Messenger(iBinder);
        Message messageObtain = Message.obtain((Handler) null, 1);
        messageObtain.setData(this.A00.A00());
        try {
            this.A00.A00.send(messageObtain);
        } catch (RemoteException e2) {
            this.A00.A07(AbstractC1712Td.A1q, new C1713Te(e2));
        }
        this.A00.A03.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.A00.A08(AbstractC1712Td.A1s, new C1713Te(A00(17, 20, 94)));
        try {
            this.A00.A03.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.A00.A00 = null;
        this.A00.A01 = false;
    }
}
