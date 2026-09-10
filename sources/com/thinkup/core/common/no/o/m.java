package com.thinkup.core.common.no.o;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.IDN;

/* JADX INFO: loaded from: classes6.dex */
final class m extends o {
    private final String mm;
    private final int mo;

    public m(short s, int i2, String str) {
        this(s, i2, str, (byte) 0);
    }

    private String n() {
        return this.mm;
    }

    public final byte[] m() throws IOException {
        String str = this.mm;
        if (str == null || str.length() == 0) {
            throw new IOException("host can not empty");
        }
        int i2 = this.om;
        if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 5) {
            throw new IOException("opCode is not valid");
        }
        int i3 = this.on;
        if (i3 != 0 && i3 != 1) {
            throw new IOException("rd is not valid");
        }
        int i4 = this.mo;
        if (i4 != 1 && i4 != 28 && i4 != 5 && i4 != 16) {
            throw new IOException("recordType is not valid");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeShort(this.oo);
        dataOutputStream.writeByte((this.om << 3) + this.on);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(1);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        for (String str2 : this.mm.split("[.。．｡]")) {
            if (str2.length() > 63) {
                throw new IOException("host part is too long");
            }
            byte[] bytes = IDN.toASCII(str2).getBytes();
            dataOutputStream.write(bytes.length);
            dataOutputStream.write(bytes, 0, bytes.length);
        }
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(this.mo);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(1);
        return byteArrayOutputStream.toByteArray();
    }

    public final int o() {
        return this.mo;
    }

    private m(short s, int i2, String str, byte b2) {
        this.oo = s;
        this.om = 0;
        this.on = 1;
        this.mo = i2;
        this.mm = str;
    }
}
