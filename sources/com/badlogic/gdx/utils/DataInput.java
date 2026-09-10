package com.badlogic.gdx.utils;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class DataInput extends DataInputStream {
    private char[] chars;

    public DataInput(InputStream inputStream) {
        super(inputStream);
        this.chars = new char[32];
    }

    private void readUtf8_slow(int i, int i2, int i3) throws IOException {
        char[] cArr = this.chars;
        while (true) {
            switch (i3 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    cArr[i2] = (char) i3;
                    break;
                case 12:
                case 13:
                    cArr[i2] = (char) (((i3 & 31) << 6) | (readByte() & 63));
                    break;
                case 14:
                    cArr[i2] = (char) (((i3 & 15) << 12) | ((readByte() & 63) << 6) | (readByte() & 63));
                    break;
            }
            i2++;
            if (i2 >= i) {
                return;
            } else {
                i3 = readByte() & 255;
            }
        }
    }

    public int readInt(boolean z) throws IOException {
        byte b = readByte();
        int i = b & 127;
        if ((b & 128) != 0) {
            byte b2 = readByte();
            i |= (b2 & 127) << 7;
            if ((b2 & 128) != 0) {
                byte b3 = readByte();
                i |= (b3 & 127) << 14;
                if ((b3 & 128) != 0) {
                    byte b4 = readByte();
                    i |= (b4 & 127) << 21;
                    if ((b4 & 128) != 0) {
                        i |= (readByte() & 127) << 28;
                    }
                }
            }
        }
        return z ? i : (i >>> 1) ^ (-(i & 1));
    }

    @Null
    public String readString() throws IOException {
        int i = readInt(true);
        if (i == 0) {
            return null;
        }
        if (i == 1) {
            return "";
        }
        int i2 = i - 1;
        if (this.chars.length < i2) {
            this.chars = new char[i2];
        }
        char[] cArr = this.chars;
        int i3 = 0;
        byte b = 0;
        while (i3 < i2) {
            b = readByte();
            if (b < 0) {
                break;
            }
            cArr[i3] = (char) b;
            i3++;
        }
        if (i3 < i2) {
            readUtf8_slow(i2, i3, b & 255);
        }
        return new String(cArr, 0, i2);
    }
}
