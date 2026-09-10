package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8A, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C8A {
    public static String[] A06 = {"jkVScMAnmSDw5NjtFKaMDw93YHVTZfVV", "X8vR6FaiUrrVUV4OyPqbjTz4nTbdT", "DJqg7VUdCo9q2ysxPrWS1RTdTLsj", "4FrbkvGGO58oIWN02YSUZA4iQkwc41Il", "lEgbsVLzgPUjgc1", "ISDPu1y88m9uUW9z", "L6djBwtYOA2bka2PQ69EdZLSIG4ne", "x8MPEelqUvAzBLNZGFUUNdgpeh0HUacA"};
    public C2708no A00;
    public C2708no A01;
    public C2708no A02;
    public BP<C2708no> A03 = BP.A03();
    public AbstractC2752oX<C2708no, Timeline> A04 = AbstractC2752oX.A04();
    public final C2827pl A05;

    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2708no A00(InterfaceC10633b interfaceC10633b, BP<C2708no> bp, C2708no c2708no, C2827pl c2827pl) {
        int iA07;
        Object obj;
        int i2;
        Timeline timelineA7g = interfaceC10633b.A7g();
        int iA7c = interfaceC10633b.A7c();
        Object objA0M = timelineA7g.A0N() ? null : timelineA7g.A0M(iA7c);
        if (interfaceC10633b.AAd()) {
            iA07 = -1;
        } else {
            boolean zA0N = timelineA7g.A0N();
            String[] strArr = A06;
            if (strArr[7].charAt(14) != strArr[3].charAt(14)) {
                throw new RuntimeException();
            }
            A06[6] = "fPIpfte6042F2VeKOBsTFTkNJVxhR";
            if (zA0N) {
                iA07 = -1;
            } else {
                iA07 = timelineA7g.A0H(iA7c, c2827pl).A07(C5C.A0O(interfaceC10633b.A7e()) - c2827pl.A0C());
            }
        }
        for (int i3 = 0; i3 < bp.size(); i3++) {
            C2708no c2708no2 = bp.get(i3);
            if (A04(c2708no2, objA0M, interfaceC10633b.AAd(), interfaceC10633b.A7Y(), interfaceC10633b.A7Z(), iA07)) {
                return c2708no2;
            }
        }
        if (bp.isEmpty() && c2708no != null && A04(c2708no, obj, interfaceC10633b.AAd(), interfaceC10633b.A7Y(), interfaceC10633b.A7Z(), i2)) {
            obj = objA0M;
            i2 = iA07;
            return c2708no;
        }
        obj = objA0M;
        i2 = iA07;
        return null;
    }

    public C8A(C2827pl c2827pl) {
        this.A05 = c2827pl;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oV != com.google.common.collect.ImmutableMap$Builder<com.facebook.ads.androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, com.facebook.ads.androidx.media3.common.Timeline> */
    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "builder of ImmutableMap should be a buildOrThrow")
    private void A02(Timeline timeline) {
        C2750oV<C2708no, Timeline> c2750oVA03 = AbstractC2752oX.A03();
        if (this.A03.isEmpty()) {
            A03(c2750oVA03, this.A01, timeline);
            C2708no c2708no = this.A02;
            C2708no c2708no2 = this.A01;
            if (A06[4].length() == 25) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[2] = "UxUdIKnoAyUMpq9t4QIr4fpxRPT3";
            strArr[1] = "6BCX8szW2uTmGViuSf00Yq1AObOIr";
            if (!CB.A01(c2708no, c2708no2)) {
                A03(c2750oVA03, this.A02, timeline);
            }
            if (!CB.A01(this.A00, this.A01) && !CB.A01(this.A00, this.A02)) {
                A03(c2750oVA03, this.A00, timeline);
            }
        } else {
            for (int i2 = 0; i2 < this.A03.size(); i2++) {
                A03(c2750oVA03, this.A03.get(i2), timeline);
            }
            if (!this.A03.contains(this.A00)) {
                A03(c2750oVA03, this.A00, timeline);
            }
        }
        this.A04 = c2750oVA03.A07();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oV != com.google.common.collect.ImmutableMap$Builder<com.facebook.ads.androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, com.facebook.ads.androidx.media3.common.Timeline> */
    private void A03(C2750oV<C2708no, Timeline> c2750oV, C2708no c2708no, Timeline timeline) {
        if (c2708no == null) {
            return;
        }
        if (timeline.A0A(c2708no.A04) != -1) {
            c2750oV.A05(c2708no, timeline);
            return;
        }
        Timeline existingTimeline = this.A04.get(c2708no);
        if (existingTimeline == null) {
            return;
        }
        c2750oV.A05(c2708no, existingTimeline);
    }

    public static boolean A04(C2708no c2708no, Object obj, boolean z2, int i2, int i3, int i4) {
        if (c2708no.A04.equals(obj)) {
            return (z2 && c2708no.A00 == i2 && c2708no.A01 == i3) || (!z2 && c2708no.A00 == -1 && c2708no.A02 == i4);
        }
        return false;
    }

    public final Timeline A05(C2708no c2708no) {
        return this.A04.get(c2708no);
    }

    public final C2708no A06() {
        return this.A00;
    }

    public final void A07(InterfaceC10633b interfaceC10633b) {
        this.A00 = A00(interfaceC10633b, this.A03, this.A01, this.A05);
        A02(interfaceC10633b.A7g());
    }
}
