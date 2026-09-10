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

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C10673h {
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
    public HashMap<C2823pg, C2821pe> A0G;
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
        A0P();
    }

    public static String A0H(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0R, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 34);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0P() {
        A0R = new byte[]{63, 61, 44, 40, 53, 51, 50, 53, 50, 59};
    }

    @Deprecated
    public C10673h() {
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

    public C10673h(Context context) {
        this();
        A0n(context);
        A0o(context, true);
    }

    public C10673h(Bundle bundle) {
        List listA01;
        this.A06 = bundle.getInt(C2819pc.A0e, C2819pc.A0U.A06);
        this.A05 = bundle.getInt(C2819pc.A0d, C2819pc.A0U.A05);
        this.A04 = bundle.getInt(C2819pc.A0c, C2819pc.A0U.A04);
        this.A03 = bundle.getInt(C2819pc.A0b, C2819pc.A0U.A03);
        this.A0A = bundle.getInt(C2819pc.A0i, C2819pc.A0U.A0A);
        this.A09 = bundle.getInt(C2819pc.A0h, C2819pc.A0U.A09);
        this.A08 = bundle.getInt(C2819pc.A0n(), C2819pc.A0U.A08);
        this.A07 = bundle.getInt(C2819pc.A0f, C2819pc.A0U.A07);
        this.A0F = bundle.getInt(C2819pc.A0v, C2819pc.A0U.A0F);
        this.A0E = bundle.getInt(C2819pc.A0t, C2819pc.A0U.A0E);
        this.A0Q = bundle.getBoolean(C2819pc.A0u, C2819pc.A0U.A0Q);
        this.A0M = BP.A07((String[]) AbstractC2523ka.A00(bundle.getStringArray(C2819pc.A0p), new String[0]));
        this.A0D = bundle.getInt(C2819pc.A0q, C2819pc.A0U.A0D);
        String[] preferredVideoLanguages1 = (String[]) AbstractC2523ka.A00(bundle.getStringArray(C2819pc.A0o), new String[0]);
        this.A0L = A0G(preferredVideoLanguages1);
        String[] preferredVideoLanguages2 = new String[0];
        this.A0I = A0G((String[]) AbstractC2523ka.A00(bundle.getStringArray(C2819pc.A0j), preferredVideoLanguages2));
        this.A0B = bundle.getInt(C2819pc.A0l, C2819pc.A0U.A0B);
        this.A02 = bundle.getInt(C2819pc.A0a, C2819pc.A0U.A02);
        this.A01 = bundle.getInt(C2819pc.A0Z, C2819pc.A0U.A01);
        String[] preferredVideoLanguages3 = new String[0];
        this.A0J = BP.A07((String[]) AbstractC2523ka.A00(bundle.getStringArray(C2819pc.A0k), preferredVideoLanguages3));
        String[] preferredVideoLanguages4 = new String[0];
        this.A0K = A0G((String[]) AbstractC2523ka.A00(bundle.getStringArray(C2819pc.A0m), preferredVideoLanguages4));
        this.A0C = bundle.getInt(C2819pc.A0n, C2819pc.A0U.A0C);
        this.A00 = bundle.getInt(C2819pc.A0e(), C2819pc.A0U.A00);
        this.A0P = bundle.getBoolean(C2819pc.A0s, C2819pc.A0U.A0P);
        this.A0O = bundle.getBoolean(C2819pc.A0X, C2819pc.A0U.A0O);
        this.A0N = bundle.getBoolean(C2819pc.A0W, C2819pc.A0U.A0N);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(C2819pc.A0r);
        if (parcelableArrayList == null) {
            listA01 = MetaExoPlayerCustomizedCollections.A01();
        } else {
            listA01 = AnonymousClass44.A01(C2821pe.A02, parcelableArrayList);
        }
        this.A0G = new HashMap<>();
        for (int i2 = 0; i2 < listA01.size(); i2++) {
            C2821pe c2821pe = (C2821pe) listA01.get(i2);
            this.A0G.put(c2821pe.A00, c2821pe);
        }
        int[] iArr = (int[]) AbstractC2523ka.A00(bundle.getIntArray(C2819pc.A0V), new int[0]);
        this.A0H = new HashSet<>();
        for (int i3 : iArr) {
            this.A0H.add(Integer.valueOf(i3));
        }
    }

    public C10673h(C2819pc c2819pc) {
        A0R(c2819pc);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<java.lang.String> */
    public static BP<String> A0G(String[] strArr) {
        C2K c2kA01 = BP.A01();
        for (String str : (String[]) AbstractC10843y.A01(strArr)) {
            c2kA01.A04(C5C.A0k((String) AbstractC10843y.A01(str)));
        }
        return c2kA01.A05();
    }

    private void A0Q(Context context) {
        CaptioningManager captioningManager;
        if ((C5C.A02 < 23 && Looper.myLooper() == null) || (captioningManager = (CaptioningManager) context.getSystemService(A0H(0, 10, 126))) == null || !captioningManager.isEnabled()) {
            return;
        }
        this.A0C = 1088;
        Locale locale = captioningManager.getLocale();
        if (locale != null) {
            this.A0K = BP.A04(C5C.A0o(locale));
        }
    }

    @EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioLanguages", "preferredAudioMimeTypes", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
    private void A0R(C2819pc c2819pc) {
        this.A06 = c2819pc.A06;
        this.A05 = c2819pc.A05;
        this.A04 = c2819pc.A04;
        this.A03 = c2819pc.A03;
        this.A0A = c2819pc.A0A;
        this.A09 = c2819pc.A09;
        this.A08 = c2819pc.A08;
        this.A07 = c2819pc.A07;
        this.A0F = c2819pc.A0F;
        this.A0E = c2819pc.A0E;
        this.A0Q = c2819pc.A0Q;
        this.A0M = c2819pc.A0M;
        this.A0D = c2819pc.A0D;
        this.A0L = c2819pc.A0L;
        this.A0I = c2819pc.A0I;
        this.A0B = c2819pc.A0B;
        this.A02 = c2819pc.A02;
        this.A01 = c2819pc.A01;
        this.A0J = c2819pc.A0J;
        this.A0K = c2819pc.A0K;
        this.A0C = c2819pc.A0C;
        this.A00 = c2819pc.A00;
        this.A0P = c2819pc.A0P;
        this.A0O = c2819pc.A0O;
        this.A0N = c2819pc.A0N;
        this.A0H = new HashSet<>(c2819pc.A0H);
        this.A0G = new HashMap<>(c2819pc.A0G);
    }

    public C10673h A0W(C2819pc c2819pc) {
        A0R(c2819pc);
        return this;
    }

    public C10673h A0m(int i2, int i3, boolean z2) {
        this.A0F = i2;
        this.A0E = i3;
        this.A0Q = z2;
        return this;
    }

    public C10673h A0n(Context context) {
        if (C5C.A02 >= 19) {
            A0Q(context);
        }
        return this;
    }

    public C10673h A0o(Context context, boolean z2) {
        Point viewportSize = C5C.A0W(context);
        return A0m(viewportSize.x, viewportSize.y, z2);
    }

    public C2819pc A0p() {
        return new C2819pc(this);
    }
}
