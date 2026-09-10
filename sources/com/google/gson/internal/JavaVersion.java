package com.google.gson.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class JavaVersion {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21231a;

    static {
        int i2;
        String property = System.getProperty("java.version");
        try {
            String[] strArrSplit = property.split("[._]");
            i2 = Integer.parseInt(strArrSplit[0]);
            if (i2 == 1 && strArrSplit.length > 1) {
                i2 = Integer.parseInt(strArrSplit[1]);
            }
        } catch (NumberFormatException unused) {
            i2 = -1;
        }
        if (i2 == -1) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i3 = 0; i3 < property.length(); i3++) {
                    char cCharAt = property.charAt(i3);
                    if (!Character.isDigit(cCharAt)) {
                        break;
                    }
                    sb.append(cCharAt);
                }
                i2 = Integer.parseInt(sb.toString());
            } catch (NumberFormatException unused2) {
                i2 = -1;
            }
        }
        if (i2 == -1) {
            i2 = 6;
        }
        f21231a = i2;
    }
}
