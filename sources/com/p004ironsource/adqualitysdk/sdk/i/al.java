package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class al {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f300 = {'s', 'e', 't', '_', 'g', 'm', 'n', 'a', 'l', 'v', 'p', 'y', 'i', AbstractJsonLexerKt.UNICODE_ESC, 'c', 'd'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f301 = 4;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f302 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f303;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final ai f304;

    public al(ai aiVar) {
        this.f304 = aiVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static JSONObject m420(ISAdQualitySegment iSAdQualitySegment) {
        JSONObject jSONObject = new JSONObject(iSAdQualitySegment.getCustomData());
        try {
            if (!TextUtils.isEmpty(iSAdQualitySegment.getName())) {
                int i2 = f302 + 47;
                f303 = i2 % 128;
                jSONObject.put(i2 % 2 != 0 ? m419((byte) (116 >> ExpandableListView.getPackedPositionChild(0L)), "\u0004\b\u0007\u0006", Drawable.resolveOpacity(0, 0) * 3).intern() : m419((byte) (ExpandableListView.getPackedPositionChild(0L) + 48), "\u0004\b\u0007\u0006", 4 - Drawable.resolveOpacity(0, 0)).intern(), iSAdQualitySegment.getName());
            }
            if (iSAdQualitySegment.getAge() != -1) {
                jSONObject.put(m419((byte) (TextUtils.lastIndexOf("", '0') + 50), "\u0003\u0004\u0005\u0000", AndroidCharacter.getMirror('0') - ',').intern(), iSAdQualitySegment.getAge());
            }
            if (!TextUtils.isEmpty(iSAdQualitySegment.getGender())) {
                jSONObject.put(m419((byte) (63 - TextUtils.lastIndexOf("", '0', 0)), "\u0004\b\u0002\u0005", 4 - KeyEvent.getDeadChar(0, 0)).intern(), iSAdQualitySegment.getGender());
            }
            if (iSAdQualitySegment.getLevel() != -1) {
                f302 = (f303 + 21) % 128;
                jSONObject.put(m419((byte) (119 - (ViewConfiguration.getFadingEdgeLength() >> 16)), "\u0004\f\n\t", 4 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), iSAdQualitySegment.getLevel());
            }
            if (iSAdQualitySegment.getIsPaying() != null) {
                jSONObject.put(m419((byte) (113 - TextUtils.lastIndexOf("", '0', 0)), "\u0002\b\u000b\u000f", (ViewConfiguration.getWindowTouchSlop() >> 8) + 4).intern(), iSAdQualitySegment.getIsPaying().get());
            }
            if (iSAdQualitySegment.getInAppPurchasesTotal() != -1.0d) {
                jSONObject.put(m419((byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 34), "\u0004\u0000\u0006\u000b\u0095", Color.alpha(0) + 5).intern(), iSAdQualitySegment.getInAppPurchasesTotal());
            }
            if (iSAdQualitySegment.getUserCreationDate() != 0) {
                f303 = (f302 + 19) % 128;
                jSONObject.put(m419((byte) (123 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), "\u0001\f\u000f\f", TextUtils.getTrimmedLength("") + 4).intern(), iSAdQualitySegment.getUserCreationDate());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m421(ISAdQualitySegment iSAdQualitySegment) {
        ai aiVar;
        byte b2;
        int iMakeMeasureSpec;
        int i2 = f302 + 113;
        f303 = i2 % 128;
        if (i2 % 2 != 0) {
            aiVar = this.f304;
            b2 = (byte) (100 >>> (PointF.length(2.0f, 0.0f) > 1.0f ? 1 : (PointF.length(2.0f, 0.0f) == 1.0f ? 0 : -1)));
            iMakeMeasureSpec = 83 >>> View.MeasureSpec.makeMeasureSpec(1, 1);
        } else {
            aiVar = this.f304;
            b2 = (byte) (34 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
            iMakeMeasureSpec = 11 - View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        aiVar.m374(m419(b2, "\u0001\u0002\u0003\u0000\u0001\u0002\u0005\u0006\u0002\u0005\u0096", iMakeMeasureSpec).intern(), m420(iSAdQualitySegment));
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m419(byte b2, String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2343) {
            try {
                char[] cArr2 = f300;
                char c2 = f301;
                char[] cArr3 = new char[i2];
                if (i2 % 2 != 0) {
                    i2--;
                    cArr3[i2] = (char) (cArr[i2] - b2);
                }
                if (i2 > 1) {
                    i.f2348 = 0;
                    while (true) {
                        int i3 = i.f2348;
                        if (i3 >= i2) {
                            break;
                        }
                        i.f2347 = cArr[i3];
                        i.f2345 = cArr[i.f2348 + 1];
                        if (i.f2347 == i.f2345) {
                            cArr3[i.f2348] = (char) (i.f2347 - b2);
                            cArr3[i.f2348 + 1] = (char) (i.f2345 - b2);
                        } else {
                            i.f2346 = i.f2347 / c2;
                            i.f2342 = i.f2347 % c2;
                            i.f2344 = i.f2345 / c2;
                            i.f2341 = i.f2345 % c2;
                            if (i.f2342 == i.f2341) {
                                i.f2346 = a.b(i.f2346, c2, 1, c2);
                                i.f2344 = a.b(i.f2344, c2, 1, c2);
                                int i4 = (i.f2346 * c2) + i.f2342;
                                int i5 = (i.f2344 * c2) + i.f2341;
                                int i6 = i.f2348;
                                cArr3[i6] = cArr2[i4];
                                cArr3[i6 + 1] = cArr2[i5];
                            } else if (i.f2346 == i.f2344) {
                                i.f2342 = a.b(i.f2342, c2, 1, c2);
                                i.f2341 = a.b(i.f2341, c2, 1, c2);
                                int i7 = (i.f2346 * c2) + i.f2342;
                                int i8 = (i.f2344 * c2) + i.f2341;
                                int i9 = i.f2348;
                                cArr3[i9] = cArr2[i7];
                                cArr3[i9 + 1] = cArr2[i8];
                            } else {
                                int i10 = (i.f2346 * c2) + i.f2341;
                                int i11 = (i.f2344 * c2) + i.f2342;
                                int i12 = i.f2348;
                                cArr3[i12] = cArr2[i10];
                                cArr3[i12 + 1] = cArr2[i11];
                            }
                        }
                        i.f2348 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
