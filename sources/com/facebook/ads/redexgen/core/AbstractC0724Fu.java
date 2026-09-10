package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.badlogic.gdx.Input;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0724Fu {
    public static byte[] A00;
    public static String[] A01 = {"e7juOHCMVCS96MucXvvyM5upzpE0CxcL", "6Axk6XM18YFtFlcC0tEdKqjogVlmemrm", "CHYE97fUe", "94l1C", "pvrd7E3JtMrEOvPAC3lcGaqqDdvc2Rnk", "mswd2ljSuB4EOxjza27Iz7krcpdQKmDN", "x2gmwPWroRNX0socjzMaFBH0Y3mBhUE3", "1dJrelJWCcDuEHtNsp3IaM8Oqex3ZZ7a"};

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-73, -32, 10, -73, -32, 5, 10, 11, -8, 5, 11, -73, -2, -8, 4, -4, 10, -73, -8, 3, 3, 6, cw.l, -4, -5, -47, -73, -121, -80, -38, -121, -80, -43, -38, -37, -56, -43, -37, -121, -50, -56, -44, -52, -38, -95, -121, -57, cw.l, 22, 22, cw.l, 19, 12, -57, cw.k, 8, 19, 19, 9, 8, 10, 18, -57, 28, 25, 19, -57, 8, 29, 8, cw.n, 19, 8, 9, 19, 12, -31, -57, 79, -104, -94, -126, -93, -98, -95, -108, 105, 79, 90, -95, -9, -22, -27, -26, -16, -95, -10, -13, -19, -95, -22, -12, -95, -17, -10, -19, -19, -69, -95, 4, cw.n, cw.l, -49, 7, 2, 4, 6, 3, cw.n, cw.n, 12, -49, 12, 2, 21, 2, cw.m, 2, -42, -41, -46, -43, -56, -35, -34, -39, -36, -49, -55, -33, -36, -42, -55, -31, -49, -52, -55, -48, -53, -42, -42, -52, -53, -51, -43, -30, -43, -48, -47, -37, -53, -31, -34, -40};
        String[] strArr = A01;
        if (strArr[5].charAt(19) != strArr[7].charAt(19)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "ump74";
        strArr2[2] = "QJx5Vwz5z";
    }

    static {
        A02();
    }

    public static AbstractC0723Ft A00(C0727Fx c0727Fx, Bundle bundle, boolean z) {
        AbstractC0723Ft c1596gA;
        c0727Fx.A05().A0H().A00(false);
        C2T c2tA1b = c0727Fx.A04().A1b();
        double dA00 = AbstractC0720Fq.A00(c2tA1b);
        boolean isWatchAndBrowse = c0727Fx.A04().A1b().A0Q();
        boolean zA06 = AbstractC0720Fq.A06(c0727Fx.A00(), c0727Fx.A01(), dA00);
        AbstractC03841v abstractC03841vA00 = C03851w.A00(c0727Fx.A05(), c0727Fx.A06(), A01(0, 0, 8), C5.A00(c0727Fx.A04().A1b().A0H().A05()), new HashMap(), c0727Fx.A04().A1c());
        boolean z2 = !TextUtils.isEmpty(c2tA1b.A0F().A09());
        if (C05789m.A1s(c0727Fx.A05())) {
            C1828k1 c1828k1A05 = c0727Fx.A05();
            String[] strArr = A01;
            if (strArr[4].charAt(27) == strArr[6].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "oHCvC4ERmXYMU8sW9KKIPv7pnY2wXb01";
            strArr2[7] = "G3HUaMks2xBdg2z9mSbIts1gYwx1OgmU";
            c1828k1A05.A0B().AJs(c0727Fx.A02(), c0727Fx.A04().A1g(), z2);
        }
        boolean zA03 = A03(c0727Fx, z2);
        if ((isWatchAndBrowse && (abstractC03841vA00 instanceof N8)) || zA03) {
            c1596gA = new C1580fu(c0727Fx, zA03);
        } else if (z2) {
            c1596gA = new LS(c0727Fx);
        } else if (!z2 && C05789m.A2Y(c0727Fx.A05())) {
            c1596gA = new LT(c0727Fx, zA06);
        } else if (zA06) {
            c1596gA = new C1601gF(c0727Fx, c0727Fx.A00() == 2);
        } else {
            c1596gA = new C1596gA(c0727Fx, AbstractC0720Fq.A04(dA00));
        }
        if (z) {
            c1596gA.A14(c2tA1b, c0727Fx.A04().A1g(), dA00, bundle);
        }
        return c1596gA;
    }

    public static boolean A03(C0727Fx c0727Fx, boolean z) {
        boolean z2 = false;
        if (!c0727Fx.A04().A1T() || !z) {
            return false;
        }
        Uri uriA00 = C5.A00(c0727Fx.A04().A1b().A0H().A05());
        String authority = uriA00.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            c0727Fx.A05().A0F().ABf();
            return false;
        }
        boolean isInstantGamesEnabled = authority.equals(A01(128, 5, 58));
        boolean isInstantGames = uriA00.getQueryParameter(A01(Input.Keys.NUMPAD_MULTIPLY, 9, 67)) == null;
        String queryParameter = uriA00.getQueryParameter(A01(133, 22, 65));
        boolean isGoogleFallBackUrlAvailable = !TextUtils.isEmpty(queryParameter) && queryParameter.contains(c0727Fx.A04().A0j());
        boolean zEquals = c0727Fx.A05().getPackageName().equals(A01(109, 19, 120));
        boolean zA1U = c0727Fx.A04().A1U();
        if (isInstantGamesEnabled && isInstantGames && isGoogleFallBackUrlAvailable && (!zEquals || zA1U)) {
            z2 = true;
        }
        if (!z2 && Build.VERSION.SDK_INT >= 24) {
            c0727Fx.A05().A0F().ABe(A01(78, 11, 6) + isInstantGamesEnabled + A01(89, 20, 88) + isInstantGames + A01(46, 32, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) + isGoogleFallBackUrlAvailable + A01(27, 19, 62) + zEquals + A01(0, 27, 110) + zA1U);
        }
        return z2;
    }
}
