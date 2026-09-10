package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class dn {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1718 = 154;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1719 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1720;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String f1721;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1722;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ISAdQualityAdType f1723;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private List<String> f1724;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private JSONObject f1725;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1726;

    public dn(JSONObject jSONObject) {
        this.f1723 = ISAdQualityAdType.UNKNOWN;
        this.f1722 = dw.m2051(jSONObject.optString(m1952(-TextUtils.lastIndexOf("", '0', 0, 0), 4 - View.MeasureSpec.makeMeasureSpec(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 266, "\ufff5\u0004\t\u0000", false).intern()));
        String strM2051 = dw.m2051(jSONObject.optString(m1952(ExpandableListView.getPackedPositionGroup(0L) + 2, (Process.myPid() >> 22) + 6, 255 - TextUtils.lastIndexOf("", '0', 0, 0), "\ufffe\ufffb\uffff\n\u0013￮", true).intern()));
        if (!TextUtils.isEmpty(strM2051)) {
            this.f1723 = ISAdQualityAdType.fromInt(Integer.parseInt(strM2051));
        }
        this.f1725 = jSONObject.optJSONObject(m1952(6 - Gravity.getAbsoluteGravity(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 6, Color.argb(0, 0, 0, 0) + 261, "\b\u0002\ufff6\u0007\ufff6\u0005", true).intern());
        this.f1724 = kc.m2762(jSONObject, m1952(3 - TextUtils.getOffsetAfter("", 0), Gravity.getAbsoluteGravity(0, 0) + 10, TextUtils.getOffsetBefore("", 0) + 261, "\t\ufff8\ufff6\b\ufffa\ufffe\t\ufffe\u000b\ufffe", true).intern(), new ArrayList());
        this.f1726 = dw.m2051(jSONObject.optString(m1952(View.resolveSize(0, 0) + 1, 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 259, "\t\r\u0000￼\u000e\uffdd\u0000\u0003\u000b￼", false).intern()));
        this.f1721 = dw.m2051(jSONObject.optString(m1952(1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 14 - Color.alpha(0), 258 - View.getDefaultSize(0, 0), "\n\u000f�\ufffa￮\u0001�\u000f\u000b\uffdf�\f\f�", false).intern()));
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final String m1953() {
        int i2 = f1719 + 91;
        int i3 = i2 % 128;
        f1720 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.f1721;
        f1719 = (i3 + 55) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final ISAdQualityAdType m1954() {
        int i2 = f1720;
        ISAdQualityAdType iSAdQualityAdType = this.f1723;
        int i3 = i2 + 97;
        f1719 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 27 / 0;
        }
        return iSAdQualityAdType;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m1955() {
        int i2 = f1720;
        String str = this.f1722;
        f1719 = (i2 + 15) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m1956() {
        int i2 = f1719 + 31;
        f1720 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1726;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final List<String> m1957() {
        List<String> list;
        int i2 = f1719;
        int i3 = i2 + 53;
        f1720 = i3 % 128;
        if (i3 % 2 != 0) {
            list = this.f1724;
            int i4 = 39 / 0;
        } else {
            list = this.f1724;
        }
        f1720 = (i2 + 51) % 128;
        return list;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m1958() {
        int i2 = f1719 + 29;
        f1720 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1725;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1952(int i2, int i3, int i4, String str, boolean z2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f672) {
            try {
                char[] cArr2 = new char[i3];
                b.f673 = 0;
                while (true) {
                    int i5 = b.f673;
                    if (i5 >= i3) {
                        break;
                    }
                    b.f671 = cArr[i5];
                    cArr2[b.f673] = (char) (b.f671 + i4);
                    int i6 = b.f673;
                    cArr2[i6] = (char) (cArr2[i6] - f1718);
                    b.f673 = i6 + 1;
                }
                if (i2 > 0) {
                    b.f674 = i2;
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr2, 0, cArr3, 0, i3);
                    int i7 = b.f674;
                    System.arraycopy(cArr3, 0, cArr2, i3 - i7, i7);
                    int i8 = b.f674;
                    System.arraycopy(cArr3, i8, cArr2, 0, i3 - i8);
                }
                if (z2) {
                    char[] cArr4 = new char[i3];
                    b.f673 = 0;
                    while (true) {
                        int i9 = b.f673;
                        if (i9 >= i3) {
                            break;
                        }
                        cArr4[i9] = cArr2[(i3 - i9) - 1];
                        b.f673 = i9 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
