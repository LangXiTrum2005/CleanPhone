package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes2.dex */
public final class S20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3696a;
    public long b;
    public Object c;

    public S20(int i) {
        if (i != 1) {
            return;
        }
        this.c = new ArrayList();
        this.f3696a = 1;
    }

    public static byte[] b(DataInputStream dataInputStream, byte b) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = {b, dataInputStream.readByte()};
        byteArrayOutputStream.write(bArr);
        while (true) {
            if (bArr[0] == 13 && bArr[1] == 10) {
                return byteArrayOutputStream.toByteArray();
            }
            bArr[0] = bArr[1];
            byte b2 = dataInputStream.readByte();
            bArr[1] = b2;
            byteArrayOutputStream.write(b2);
        }
    }

    public final AC a(byte[] bArr) throws KT {
        long j;
        FW.h(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
        String str = new String(bArr, 0, bArr.length - 2, C3398f10.g);
        ((List) this.c).add(str);
        int i = this.f3696a;
        if (i == 1) {
            if (!AbstractC3486g10.f4397a.matcher(str).matches() && !AbstractC3486g10.b.matcher(str).matches()) {
                return null;
            }
            this.f3696a = 2;
            return null;
        }
        if (i != 2) {
            throw new IllegalStateException();
        }
        try {
            Matcher matcher = AbstractC3486g10.c.matcher(str);
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                strGroup.getClass();
                j = Long.parseLong(strGroup);
            } else {
                j = -1;
            }
            if (j != -1) {
                this.b = j;
            }
            if (!str.isEmpty()) {
                return null;
            }
            if (this.b > 0) {
                this.f3696a = 3;
                return null;
            }
            AC acJ = AC.j((List) this.c);
            ((List) this.c).clear();
            this.f3696a = 1;
            this.b = 0L;
            return acJ;
        } catch (NumberFormatException e) {
            throw KT.b(str, e);
        }
    }
}
