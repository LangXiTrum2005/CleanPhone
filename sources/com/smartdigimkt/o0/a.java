package com.smartdigimkt.o0;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f37281a = -2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f37282b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f37283c = 2;
    public static final int d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f37284e = 4;
    public static final int f = 5;
    public static final int g = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f37285h = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f37286i = 8;
    public static final int j = 9;
    public static final int k = 10;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f37287l = 11;
    public static final int m = 12;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f37288n = 13;
    public static final int o = 14;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f37289p = 15;

    public static String a(com.smartdigimkt.i0.a aVar) {
        if (aVar == null) {
            return "Network error,Load failed";
        }
        try {
            int i2 = aVar.f35790a;
            com.smartdigimkt.n0.c cVar = aVar.f35792c;
            int i3 = cVar != null ? cVar.f36913a : 0;
            if (i2 == -2) {
                return "Network is canceled";
            }
            if (i2 == 1) {
                return "Network error,Load failed";
            }
            if (i2 == 880023) {
                return "timeout";
            }
            if (i2 == 880041) {
                return "Network error,UnknownHostException";
            }
            if (i2 == 14) {
                return "Network error,I/O exception response null";
            }
            if (i2 == 15) {
                return "Network error,I/O exception contents null";
            }
            switch (i2) {
                case 3:
                    return "Network error,timeout exception";
                case 4:
                    return "Network unknown error";
                case 5:
                    return "Network error,https is not work,please check your phone time";
                case 6:
                    if (i3 == 0) {
                        return "Network error,please check ";
                    }
                    return "Network error,please check state code" + i3;
                case 7:
                    if (i3 == 0) {
                        return "The server returns an exception ";
                    }
                    return "The server returns an exception state code " + i3;
                case 8:
                    return "Cast exception, return data can't be casted correctly";
                case 9:
                case 12:
                    return "Network error,disconnected network exception";
                case 10:
                    return "Network error,socket timeout exception";
                case 11:
                    return "Network error,sslp exception";
                default:
                    return "Network error,I/O exception";
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return "Network error,Load failed";
        }
    }
}
