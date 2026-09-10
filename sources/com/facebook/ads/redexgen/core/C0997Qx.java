package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0997Qx {
    public static byte[] A0R;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public HashMap<C1175Yc, YW> A0G;
    public HashSet<Integer> A0H;
    public List<String> A0I;
    public List<String> A0J;
    public List<String> A0K;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public List<String> A0L;
    public List<String> A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;

    static {
        A0j();
    }

    public static String A0b(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0R, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 26);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0j() {
        A0R = new byte[]{-59, -61, -46, -42, -53, -47, -48, -53, -48, -55};
    }

    @Deprecated
    public C0997Qx() {
        this.A06 = Integer.MAX_VALUE;
        this.A05 = Integer.MAX_VALUE;
        this.A04 = Integer.MAX_VALUE;
        this.A03 = Integer.MAX_VALUE;
        this.A0F = Integer.MAX_VALUE;
        this.A0E = Integer.MAX_VALUE;
        this.A0Q = true;
        this.A0M = MetaExoPlayerCustomizedCollections.A01();
        this.A0D = 0;
        this.A0L = MetaExoPlayerCustomizedCollections.A01();
        this.A0I = MetaExoPlayerCustomizedCollections.A01();
        this.A0B = 0;
        this.A02 = Integer.MAX_VALUE;
        this.A01 = Integer.MAX_VALUE;
        this.A0J = MetaExoPlayerCustomizedCollections.A01();
        this.A0K = MetaExoPlayerCustomizedCollections.A01();
        this.A0C = 0;
        this.A00 = 0;
        this.A0P = false;
        this.A0O = false;
        this.A0N = false;
        this.A0G = new HashMap<>();
        this.A0H = new HashSet<>();
    }

    public C0997Qx(Context context) {
        this();
        A0r(context);
        A0s(context, true);
    }

    public C0997Qx(Bundle bundle) {
        List listA01;
        this.A06 = bundle.getInt(YN.A0e, YN.A0U.A06);
        this.A05 = bundle.getInt(YN.A0d, YN.A0U.A05);
        this.A04 = bundle.getInt(YN.A0c, YN.A0U.A04);
        this.A03 = bundle.getInt(YN.A0b, YN.A0U.A03);
        this.A0A = bundle.getInt(YN.A0i, YN.A0U.A0A);
        this.A09 = bundle.getInt(YN.A0h, YN.A0U.A09);
        this.A08 = bundle.getInt(YN.A0g, YN.A0U.A08);
        this.A07 = bundle.getInt(YN.A0f, YN.A0U.A07);
        this.A0F = bundle.getInt(YN.A0v, YN.A0U.A0F);
        this.A0E = bundle.getInt(YN.A0t, YN.A0U.A0E);
        this.A0Q = bundle.getBoolean(YN.A0u, YN.A0U.A0Q);
        this.A0M = OI.A07((String[]) AbstractC1710i4.A00(bundle.getStringArray(YN.A0p), new String[0]));
        this.A0D = bundle.getInt(YN.A0q, YN.A0U.A0D);
        String[] preferredVideoLanguages1 = (String[]) AbstractC1710i4.A00(bundle.getStringArray(YN.A0o), new String[0]);
        this.A0L = A0a(preferredVideoLanguages1);
        String[] preferredVideoLanguages2 = new String[0];
        this.A0I = A0a((String[]) AbstractC1710i4.A00(bundle.getStringArray(YN.A0j), preferredVideoLanguages2));
        this.A0B = bundle.getInt(YN.A0l, YN.A0U.A0B);
        this.A02 = bundle.getInt(YN.A0a, YN.A0U.A02);
        this.A01 = bundle.getInt(YN.A0Z, YN.A0U.A01);
        String[] preferredVideoLanguages3 = new String[0];
        this.A0J = OI.A07((String[]) AbstractC1710i4.A00(bundle.getStringArray(YN.A0k), preferredVideoLanguages3));
        String[] preferredVideoLanguages4 = new String[0];
        this.A0K = A0a((String[]) AbstractC1710i4.A00(bundle.getStringArray(YN.A0m), preferredVideoLanguages4));
        this.A0C = bundle.getInt(YN.A0n, YN.A0U.A0C);
        this.A00 = bundle.getInt(YN.A0Y, YN.A0U.A00);
        this.A0P = bundle.getBoolean(YN.A0s, YN.A0U.A0P);
        this.A0O = bundle.getBoolean(YN.A0X, YN.A0U.A0O);
        this.A0N = bundle.getBoolean(YN.A0W, YN.A0U.A0N);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(YN.A0r);
        if (parcelableArrayList == null) {
            listA01 = MetaExoPlayerCustomizedCollections.A01();
        } else {
            listA01 = C1523ey.A01(YW.A03, parcelableArrayList);
        }
        this.A0G = new HashMap<>();
        for (int i = 0; i < listA01.size(); i++) {
            YW yw = (YW) listA01.get(i);
            this.A0G.put(yw.A00, yw);
        }
        int[] iArr = (int[]) AbstractC1710i4.A00(bundle.getIntArray(YN.A0V), new int[0]);
        this.A0H = new HashSet<>();
        for (int i2 : iArr) {
            this.A0H.add(Integer.valueOf(i2));
        }
    }

    public C0997Qx(YN yn) {
        A0l(yn);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4T != com.google.common.collect.ImmutableList$Builder<java.lang.String> */
    public static OI<String> A0a(String[] strArr) {
        C4T c4tA01 = OI.A01();
        for (String str : (String[]) AbstractC1517es.A01(strArr)) {
            c4tA01.A04(AbstractC1600gE.A0k((String) AbstractC1517es.A01(str)));
        }
        return c4tA01.A05();
    }

    private void A0k(Context context) {
        CaptioningManager captioningManager;
        if ((AbstractC1600gE.A02 < 23 && Looper.myLooper() == null) || (captioningManager = (CaptioningManager) context.getSystemService(A0b(0, 10, 72))) == null || !captioningManager.isEnabled()) {
            return;
        }
        this.A0C = 1088;
        Locale locale = captioningManager.getLocale();
        if (locale != null) {
            this.A0K = OI.A04(AbstractC1600gE.A0o(locale));
        }
    }

    @EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioLanguages", "preferredAudioMimeTypes", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
    private void A0l(YN yn) {
        this.A06 = yn.A06;
        this.A05 = yn.A05;
        this.A04 = yn.A04;
        this.A03 = yn.A03;
        this.A0A = yn.A0A;
        this.A09 = yn.A09;
        this.A08 = yn.A08;
        this.A07 = yn.A07;
        this.A0F = yn.A0F;
        this.A0E = yn.A0E;
        this.A0Q = yn.A0Q;
        this.A0M = yn.A0M;
        this.A0D = yn.A0D;
        this.A0L = yn.A0L;
        this.A0I = yn.A0I;
        this.A0B = yn.A0B;
        this.A02 = yn.A02;
        this.A01 = yn.A01;
        this.A0J = yn.A0J;
        this.A0K = yn.A0K;
        this.A0C = yn.A0C;
        this.A00 = yn.A00;
        this.A0P = yn.A0P;
        this.A0O = yn.A0O;
        this.A0N = yn.A0N;
        this.A0H = new HashSet<>(yn.A0H);
        this.A0G = new HashMap<>(yn.A0G);
    }

    public C0997Qx A0q(int i, int i2, boolean z) {
        this.A0F = i;
        this.A0E = i2;
        this.A0Q = z;
        return this;
    }

    public C0997Qx A0r(Context context) {
        if (AbstractC1600gE.A02 >= 19) {
            A0k(context);
        }
        return this;
    }

    public C0997Qx A0s(Context context, boolean z) {
        Point viewportSize = AbstractC1600gE.A0W(context);
        return A0q(viewportSize.x, viewportSize.y, z);
    }

    public C0997Qx A0t(YN yn) {
        A0l(yn);
        return this;
    }

    public YN A0u() {
        return new YN(this);
    }
}
