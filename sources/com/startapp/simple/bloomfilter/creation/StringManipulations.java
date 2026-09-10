package com.startapp.simple.bloomfilter.creation;

/* JADX INFO: loaded from: classes6.dex */
class StringManipulations {
    private static final char[] HEX_CHARS = "0123456789abcdef".toCharArray();

    private boolean encodedLenghtIsNotEven(String str) {
        return str.length() % 2 != 0;
    }

    public String bytesToHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = i2 * 2;
            char[] cArr2 = HEX_CHARS;
            byte b2 = bArr[i2];
            cArr[i3] = cArr2[(b2 & 240) >>> 4];
            cArr[i3 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public byte[] hexToByte(String str) {
        if (encodedLenghtIsNotEven(str)) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        int length = str.length();
        for (int i2 = 0; i2 < length; i2 += 2) {
            bArr[i2 / 2] = (byte) (Character.digit(str.charAt(i2 + 1), 16) + (Character.digit(str.charAt(i2), 16) << 4));
        }
        return bArr;
    }
}
