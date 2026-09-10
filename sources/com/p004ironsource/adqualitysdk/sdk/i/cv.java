package com.p004ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class cv extends cz {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1469 = 97;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1470 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1471 = 1;

    /* JADX WARN: Code duplicated, block: B:16:0x00a0  */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Object m1728(cp cpVar, List<Object> list) {
        boolean zBooleanValue;
        JSONObject jSONObject;
        String str = (String) cz.m1785(list, 0, String.class);
        StringBuilder sb = new StringBuilder();
        sb.append(cpVar.m1616());
        sb.append(m1729((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, 154 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\u0000", false).intern());
        sb.append(Integer.toHexString(str.hashCode()));
        String string = sb.toString();
        Throwable th = (Throwable) cz.m1785(list, 1, Throwable.class);
        if (list.size() > 2) {
            if (cz.m1784(list, 2, JSONObject.class)) {
                JSONObject jSONObject2 = (JSONObject) cz.m1785(list, 2, JSONObject.class);
                if (list.size() > 3) {
                    int i2 = f1470 + 43;
                    f1471 = i2 % 128;
                    if (i2 % 2 != 0 ? !cz.m1784(list, 3, Boolean.class) : !cz.m1784(list, 3, Boolean.class)) {
                        jSONObject = jSONObject2;
                        zBooleanValue = false;
                    } else {
                        f1470 = (f1471 + 111) % 128;
                        zBooleanValue = ((Boolean) cz.m1785(list, 3, Boolean.class)).booleanValue();
                        jSONObject = jSONObject2;
                    }
                } else {
                    jSONObject = jSONObject2;
                    zBooleanValue = false;
                }
            } else {
                zBooleanValue = !cz.m1784(list, 2, Boolean.class) ? false : ((Boolean) cz.m1785(list, 2, Boolean.class)).booleanValue();
                jSONObject = null;
            }
            kb.m2747(cpVar.m1616(), str, string, th, jSONObject, zBooleanValue);
        } else {
            kb.m2747(cpVar.m1616(), str, string, th, null, false);
        }
        int i3 = f1471 + 13;
        f1470 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 41 / 0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1729(int i2, int i3, int i4, String str, boolean z2) {
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
                    cArr2[i6] = (char) (cArr2[i6] - f1469);
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
