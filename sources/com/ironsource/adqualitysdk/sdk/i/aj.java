package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class aj {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f275 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f276 = 9032285313147363625L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f277 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final ai f278;

    public aj(ai aiVar) {
        this.f278 = aiVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static JSONObject m410(ISAdQualitySegment iSAdQualitySegment) {
        JSONObject jSONObject = new JSONObject(iSAdQualitySegment.getCustomData());
        try {
            if (!TextUtils.isEmpty(iSAdQualitySegment.getName())) {
                jSONObject.put(m409("慚⋅\ue651ꯥ", ExpandableListView.getPackedPositionGroup(0L) + 17291).intern(), iSAdQualitySegment.getName());
            }
            if (iSAdQualitySegment.getAge() != -1) {
                int i10 = f275 + 71;
                f277 = i10 % 128;
                jSONObject.put(i10 % 2 == 0 ? m409("慚㣑퉼涇", KeyEvent.normalizeMetaState(1) + 15194).intern() : m409("慚㣑퉼涇", 22937 - KeyEvent.normalizeMetaState(0)).intern(), iSAdQualitySegment.getAge());
            }
            if (!TextUtils.isEmpty(iSAdQualitySegment.getGender())) {
                int i11 = f275 + 79;
                f277 = i11 % 128;
                jSONObject.put(i11 % 2 == 0 ? m409("慚‗\ue3feꕌ", Color.alpha(0) + 12159).intern() : m409("慚‗\ue3feꕌ", 16729 - Color.alpha(0)).intern(), iSAdQualitySegment.getGender());
            }
            if (iSAdQualitySegment.getLevel() != -1) {
                jSONObject.put(m409("慚鉎蝉롤", 62219 - KeyEvent.normalizeMetaState(0)).intern(), iSAdQualitySegment.getLevel());
            }
            if (iSAdQualitySegment.getIsPaying() != null) {
                jSONObject.put(m409("慚툮ަ笵", ImageFormat.getBitsPerPixel(0) + 45944).intern(), iSAdQualitySegment.getIsPaying().get());
            }
            if (iSAdQualitySegment.getInAppPurchasesTotal() != -1.0d) {
                jSONObject.put(m409("慚ꨱ\uf7aå䲙", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 52080).intern(), iSAdQualitySegment.getInAppPurchasesTotal());
            }
            if (iSAdQualitySegment.getUserCreationDate() != 0) {
                f275 = (f277 + 45) % 128;
                jSONObject.put(m409("慚飥鈸豦", ImageFormat.getBitsPerPixel(0) + 63930).intern(), iSAdQualitySegment.getUserCreationDate());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m411(ISAdQualitySegment iSAdQualitySegment) {
        int i10 = f275 + 119;
        f277 = i10 % 128;
        int i11 = i10 % 2;
        ai aiVar = this.f278;
        long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        aiVar.m385(m409("慚揭搟暕毞汩溈猣瑄目笗", i11 == 0 ? (jCurrentThreadTimeMillis > (-1L) ? 1 : (jCurrentThreadTimeMillis == (-1L) ? 0 : -1)) + 31425 : 674 - (jCurrentThreadTimeMillis > (-1L) ? 1 : (jCurrentThreadTimeMillis == (-1L) ? 0 : -1))).intern(), m410(iSAdQualitySegment));
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m409(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2435) {
            try {
                i.f2436 = i10;
                char[] cArr2 = new char[cArr.length];
                i.f2434 = 0;
                while (true) {
                    int i11 = i.f2434;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f276);
                        i.f2434++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
