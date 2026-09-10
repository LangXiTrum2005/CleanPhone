package com.umeng.analytics.pro;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dd {
    public abstract int a(byte[] bArr, int i, int i2) throws de;

    public void a(int i) {
    }

    public abstract boolean a();

    public abstract void b() throws de;

    public void b(byte[] bArr) throws de {
        b(bArr, 0, bArr.length);
    }

    public abstract void b(byte[] bArr, int i, int i2) throws de;

    public abstract void c();

    public void d() throws de {
    }

    public byte[] f() {
        return null;
    }

    public int g() {
        return 0;
    }

    public int h() {
        return -1;
    }

    public boolean i() {
        return a();
    }

    public int d(byte[] bArr, int i, int i2) throws de {
        int i3 = 0;
        while (i3 < i2) {
            int iA = a(bArr, i + i3, i2 - i3);
            if (iA <= 0) {
                throw new de(AbstractC3950lJ.q("Cannot read. Remote side has closed. Tried to read ", i2, " bytes, but only got ", i3, " bytes. (This is often indicative of an internal error on the server side. Please check your server logs.)"));
            }
            i3 += iA;
        }
        return i3;
    }
}
