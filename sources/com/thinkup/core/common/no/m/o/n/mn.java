package com.thinkup.core.common.no.m.o.n;

import com.thinkup.core.common.no.m.m00;
import com.thinkup.core.common.no.m.on0;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes6.dex */
public final class mn {
    public static final int m = 308;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f42028n = 100;
    public static final int o = 307;
    public final on0 o0;
    public final String om;
    public final int oo;

    public mn(on0 on0Var, int i2, String str) {
        this.o0 = on0Var;
        this.oo = i2;
        this.om = str;
    }

    private static mn o(m00 m00Var) {
        return new mn(m00Var.m(), m00Var.n(), m00Var.o0());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.o0 == on0.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.oo);
        if (this.om != null) {
            sb.append(' ');
            sb.append(this.om);
        }
        return sb.toString();
    }

    public static mn o(String str) throws ProtocolException {
        on0 on0Var;
        int i2;
        String strSubstring;
        if (str.startsWith("HTTP/1.")) {
            i2 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                on0Var = on0.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                on0Var = on0.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            on0Var = on0.HTTP_1_0;
            i2 = 4;
        }
        int i3 = i2 + 3;
        if (str.length() < i3) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i4 = Integer.parseInt(str.substring(i2, i3));
            if (str.length() <= i3) {
                strSubstring = "";
            } else {
                if (str.charAt(i3) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i2 + 4);
            }
            return new mn(on0Var, i4, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }
}
