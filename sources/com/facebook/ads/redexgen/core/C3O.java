package com.facebook.ads.redexgen.core;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3O, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3O extends Handler {
    public static byte[] A09;
    public static String[] A0A = {"huWs6nyYMzfxZtpl5l", "fgwmKB6Qyc6FtxfQKB9IkKk97cCBhoPq", "Jv452jFQqMHbXRCew", "VJzjxvVEvnwAHRNG0UVfEBBm35lAgOcC", "2O55YLspBlua8aaDjHW6JYUsijhI69vr", "eg8WpOT66b5I3PrsSw6YGr9", "zIsMPTJraAXX1U7X8ddpQ67iDmaNCfrq", "78M1aKJi48odvK"};
    public Messenger A00;
    public CZ A01;
    public boolean A02;
    public final ServiceConnection A03;
    public final Handler A04;
    public final Messenger A05;
    public final InterfaceC03681f A06;
    public final C1827k0 A07;
    public final BY A08;

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 57);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A09 = new byte[]{-102, -83, -85, -83, -79, -66, -83, -84, 104, -80, -87, -74, -84, -69, -80, -87, -77, -83, 104, -82, -87, -79, -76, -83, -84, 116, 104, -85, -73, -84, -83, -126, 104, -116, -115, -117, -104, -119, 122, 124, -124, 122, -128, 126, -104, 122, -123, -117, 126, 122, 125, -110, -104, 126, -111, -126, -116, -115, -116, -104, -124, 126, -110, 0, 1, -1, 12, -3, -18, -16, -8, -18, -12, -14, 12, -10, -5, 0, 1, -18, -7, -7, -14, -15, 12, -8, -14, 6, -28, -27, -29, -16, -31, -46, -44, -36, -46, -40, -42, -16, -36, -42, -22};
    }

    static {
        A06();
    }

    public C3O(C1827k0 c1827k0) {
        super(Looper.getMainLooper());
        this.A04 = new Handler(Looper.getMainLooper());
        this.A03 = new ServiceConnection() { // from class: com.facebook.ads.redexgen.X.3N
            @Override // android.content.ServiceConnection
            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                this.A00.A04.removeCallbacks(this.A00.A08);
                this.A00.A00 = new Messenger(iBinder);
                if (!AbstractC05819p.A07(this.A00.A07)) {
                    return;
                }
                this.A00.A07(this.A00.A00);
            }

            @Override // android.content.ServiceConnection
            public final void onServiceDisconnected(ComponentName componentName) {
                this.A00.A09();
            }
        };
        this.A07 = c1827k0;
        this.A05 = new Messenger(this);
        InterfaceC03721j funnelModule = c1827k0.A00(c1827k0);
        if (funnelModule != null) {
            this.A06 = funnelModule.ABi();
        } else {
            this.A06 = new C2028nL();
        }
        this.A08 = new C1935lo(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(Messenger messenger) {
        Message messageObtain = Message.obtain((Handler) null, 1);
        messageObtain.replyTo = this.A05;
        messageObtain.setData(C3X.A00(this.A07));
        try {
            messenger.send(messageObtain);
        } catch (RemoteException unused) {
        }
    }

    public final void A09() {
        if (this.A02) {
            this.A02 = false;
            this.A07.unbindService(this.A03);
            this.A00 = null;
        }
    }

    public final void A0A(String str, CZ cz, int i) {
        if (this.A02) {
            this.A06.AHT(i);
            this.A01 = cz;
            Message messageObtain = Message.obtain((Handler) null, i);
            messageObtain.replyTo = this.A05;
            if (str != null) {
                Bundle bundle = new Bundle();
                bundle.putString(A05(88, 15, 88), str);
                messageObtain.setData(bundle);
            }
            try {
                if (this.A00 != null) {
                    this.A00.send(messageObtain);
                    return;
                }
                return;
            } catch (RemoteException e) {
                this.A06.AHU(e.toString());
                return;
            }
        }
        InterfaceC03681f interfaceC03681f = this.A06;
        if (A0A[3].charAt(16) != '0') {
            throw new RuntimeException();
        }
        A0A[1] = "UrwnsONYHFKEsBm1tj1C3JCQoMa7O9rm";
        interfaceC03681f.AHV();
    }

    public final void A0B(boolean z) {
        this.A06.AHQ();
        this.A02 = C3M.A04(this.A07, z, this.A03);
        if (this.A02) {
            Messenger messenger = this.A00;
            if (A0A[2].length() != 17) {
                throw new RuntimeException();
            }
            A0A[6] = "P62SHD49IwhaYJMd1yj6mhn8O1XS0mYq";
            if (messenger == null) {
                this.A04.postDelayed(this.A08, AbstractC05819p.A01(this.A07));
                return;
            }
            return;
        }
        AnonymousClass92.A04(this.A07);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            if (message.what == 2) {
                C3M.A02(this.A07, message);
                this.A06.AHP();
                return;
            }
            if (message.what == 20 || message.what == 40 || message.what == 30) {
                this.A06.AHR(message.what);
                if (message.what == 20) {
                    AbstractC05819p.A06(this.A07);
                }
                String str = A05(0, 33, 15) + message.what;
                AnonymousClass92.A04(this.A07);
                return;
            }
            if (message.what == 4) {
                this.A06.AHS();
                Bundle data = message.getData();
                if (this.A01 != null) {
                    boolean z = data.getBoolean(A05(33, 30, 0), false);
                    String strA05 = A05(88, 15, 88);
                    if (A0A[3].charAt(16) != '0') {
                        throw new RuntimeException();
                    }
                    A0A[0] = "zzNr3SVv6qtYyPyvWR";
                    if (z) {
                        this.A01.AEK(data.getString(strA05));
                    } else if (data.getBoolean(A05(63, 25, 116), false)) {
                        this.A01.AEL(data.getString(strA05));
                    }
                }
            }
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
