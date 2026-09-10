package com.thinkup.core.common.no.o;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/* JADX INFO: loaded from: classes6.dex */
public class on extends o0 {
    public on(String str, int i2, long j) {
        super(str, i2, j);
    }

    @Override // com.thinkup.core.common.no.o.o0
    public final oo o(o0.o oVar, String str, String str2, int i2) throws Throwable {
        m mVar = new m((short) (Math.random() * 65535.0d), i2, str2);
        byte[] bArrM = mVar.m();
        InetAddress byName = InetAddress.getByName(str);
        DatagramSocket datagramSocket = null;
        try {
            final DatagramSocket datagramSocket2 = new DatagramSocket();
            try {
                DatagramPacket datagramPacket = new DatagramPacket(bArrM, bArrM.length, byName, this.m);
                try {
                    datagramSocket2.setSoTimeout((int) this.o);
                } catch (Throwable unused) {
                    datagramSocket2.setSoTimeout(500);
                }
                oVar.o.add(new Runnable() { // from class: com.thinkup.core.common.no.o.on.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            datagramSocket2.disconnect();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        try {
                            datagramSocket2.close();
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    }
                });
                datagramSocket2.send(datagramPacket);
                DatagramPacket datagramPacket2 = new DatagramPacket(new byte[1500], 1500);
                datagramSocket2.receive(datagramPacket2);
                oo ooVar = new oo(str, mVar, datagramPacket2.getData());
                datagramSocket2.close();
                return ooVar;
            } catch (Throwable th) {
                th = th;
                datagramSocket = datagramSocket2;
                if (datagramSocket != null) {
                    datagramSocket.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private on(String str, int i2, long j, int i3) {
        super(str, i2, j, i3);
    }
}
