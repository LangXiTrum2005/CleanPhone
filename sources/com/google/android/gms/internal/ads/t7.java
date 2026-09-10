package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20232f;

    public /* synthetic */ t7(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f20227a = i10;
        this.f20228b = i11;
        this.f20229c = i12;
        this.f20230d = i13;
        this.f20231e = i14;
        this.f20232f = i15;
    }

    public static t7 a(String str) {
        go.k.i(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < strArrSplit.length; i15++) {
            String strF = com.google.android.gms.internal.play_billing.q1.F(strArrSplit[i15].trim());
            strF.getClass();
            switch (strF) {
                case "end":
                    i12 = i15;
                    break;
                case "text":
                    i14 = i15;
                    break;
                case "layer":
                    i10 = i15;
                    break;
                case "start":
                    i11 = i15;
                    break;
                case "style":
                    i13 = i15;
                    break;
            }
        }
        if (i11 == -1 || i12 == -1 || i14 == -1) {
            return null;
        }
        return new t7(i10, i11, i12, i13, i14, strArrSplit.length);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static t7 b(String str) {
        ps1.v(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i10 >= length) {
                if (i12 == -1 || i13 == -1 || i15 == -1) {
                    return null;
                }
                return new t7(i11, i12, i13, i14, i15, length);
            }
            String strE = x10.e(strArrSplit[i10].trim());
            switch (strE.hashCode()) {
                case 100571:
                    if (strE.equals(TtmlNode.END)) {
                        i13 = i10;
                    }
                    break;
                case 3556653:
                    if (strE.equals("text")) {
                        i15 = i10;
                    }
                    break;
                case 102749521:
                    if (strE.equals("layer")) {
                        i11 = i10;
                    }
                    break;
                case 109757538:
                    if (strE.equals("start")) {
                        i12 = i10;
                    }
                    break;
                case 109780401:
                    if (strE.equals(TtmlNode.TAG_STYLE)) {
                        i14 = i10;
                    }
                    break;
            }
            i10++;
        }
    }
}
