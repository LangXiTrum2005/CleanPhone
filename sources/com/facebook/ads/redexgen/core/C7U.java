package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7U, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7U {
    public static byte[] A01;
    public SharedPreferences A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{41, 44, 62, 45, 58, 60, 33, 59, 33, 38, 47, 1, 44, 80, 69, 69, 67, 88, 83, 68, 69, 88, 94, 95, 120, 85, 93, 95, 93, 86, 91, 106, 109, 24, 20, 22, 85, 29, 26, 24, 30, 25, 20, 20, cw.n, 85, 26, 31, 8, 85, 18, 31, 29, 26, 115, 118, 114, 118, 107, 94, 123, 75, 109, 126, 124, 116, 118, 113, 120};
    }

    public C7U(AnonymousClass85 anonymousClass85) {
        this.A00 = anonymousClass85.getSharedPreferences(ProcessUtils.getProcessSpecificName(A00(33, 21, 4), anonymousClass85), 0);
    }

    public final C7T A02() {
        SharedPreferences sharedPreferences = this.A00;
        String strA00 = A00(0, 13, 55);
        if (sharedPreferences.contains(strA00)) {
            return new C7T(this.A00.getString(strA00, A00(0, 0, 75)), this.A00.getBoolean(A00(54, 15, 96), false), C7S.A08, this.A00.getLong(A00(26, 7, 65), -1L));
        }
        return C7T.A00();
    }

    public final String A03() {
        return this.A00.getString(A00(13, 13, 78), A00(0, 0, 75));
    }

    public final void A04(C7T c7t) {
        SharedPreferences.Editor editorEdit = this.A00.edit();
        editorEdit.putString(A00(0, 13, 55), c7t.A03());
        editorEdit.putBoolean(A00(54, 15, 96), c7t.A04());
        editorEdit.putLong(A00(26, 7, 65), c7t.A01());
        editorEdit.apply();
    }

    public final void A05(String str) {
        SharedPreferences.Editor editorEdit = this.A00.edit();
        editorEdit.putString(A00(13, 13, 78), str);
        editorEdit.apply();
    }
}
