package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.do, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class Cdo {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f1727 = 27371;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1728 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1729;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f1730;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1731;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f1732;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean f1733;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1734;

    public Cdo(JSONObject jSONObject) {
        this.f1733 = jSONObject.optBoolean(m1959(View.MeasureSpec.getSize(0), (char) Color.alpha(0), "ꣻऀꮖ齆", "말\uf888䰹䶱炕ۑ\uded6溼䬨씩", "\u0000\u0000\u0000\u0000").intern());
        this.f1732 = jSONObject.optBoolean(m1959((-369488159) - Color.green(0), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), "\ue114﨎ᗩ쁮", "\ue3dd没\ud953Ӥ돵\ueadd쌊▵떻", "\u0000\u0000\u0000\u0000").intern());
        this.f1734 = dw.m2051(jSONObject.optString(m1959(ViewConfiguration.getMinimumFlingVelocity() >> 16, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 54390), "諟閁癁棔", "壆ꅈ묆了뺜筗", "\u0000\u0000\u0000\u0000").intern()));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m1960() {
        int i2 = f1729 + 9;
        f1728 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1733;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean m1961() {
        int i2 = (f1728 + 85) % 128;
        f1729 = i2;
        boolean z2 = this.f1732;
        f1728 = (i2 + 107) % 128;
        return z2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m1962() {
        String str;
        int i2 = f1728 + 57;
        int i3 = i2 % 128;
        f1729 = i3;
        if (i2 % 2 != 0) {
            str = this.f1734;
            int i4 = 50 / 0;
        } else {
            str = this.f1734;
        }
        int i5 = i3 + 121;
        f1728 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1959(int i2, char c2, String str, String str2, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (j.f2569) {
            try {
                char[] cArr4 = (char[]) cArr3.clone();
                char[] cArr5 = (char[]) cArr.clone();
                cArr4[0] = (char) (c2 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i2));
                int length = cArr2.length;
                char[] cArr6 = new char[length];
                j.f2567 = 0;
                while (true) {
                    int i3 = j.f2567;
                    if (i3 < length) {
                        int i4 = (i3 + 2) % 4;
                        int i5 = (i3 + 3) % 4;
                        int i6 = cArr4[i3 % 4] * 32718;
                        char c3 = cArr5[i4];
                        char c4 = (char) ((i6 + c3) % 65535);
                        j.f2568 = c4;
                        cArr5[i5] = (char) (((cArr4[i5] * 32718) + c3) / 65535);
                        cArr4[i5] = c4;
                        int i7 = j.f2567;
                        cArr6[i7] = (char) (((((long) (c4 ^ cArr2[i7])) ^ f1730) ^ ((long) f1731)) ^ ((long) f1727));
                        j.f2567 = i7 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str4;
    }
}
