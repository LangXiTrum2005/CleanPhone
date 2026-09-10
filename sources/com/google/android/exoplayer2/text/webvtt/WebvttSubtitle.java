package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class WebvttSubtitle implements Subtitle {
    public final List X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final long[] f18661Y;
    public final long[] Z;

    public WebvttSubtitle(ArrayList arrayList) {
        this.X = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f18661Y = new long[arrayList.size() * 2];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            WebvttCueInfo webvttCueInfo = (WebvttCueInfo) arrayList.get(i2);
            int i3 = i2 * 2;
            long[] jArr = this.f18661Y;
            jArr[i3] = webvttCueInfo.f18642b;
            jArr[i3 + 1] = webvttCueInfo.f18643c;
        }
        long[] jArr2 = this.f18661Y;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.Z = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final List getCues(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        while (true) {
            List list = this.X;
            if (i2 >= list.size()) {
                break;
            }
            int i3 = i2 * 2;
            long[] jArr = this.f18661Y;
            if (jArr[i3] <= j && j < jArr[i3 + 1]) {
                WebvttCueInfo webvttCueInfo = (WebvttCueInfo) list.get(i2);
                Cue cue = webvttCueInfo.f18641a;
                if (cue.f0 == -3.4028235E38f) {
                    arrayList2.add(webvttCueInfo);
                } else {
                    arrayList.add(cue);
                }
            }
            i2++;
        }
        Collections.sort(arrayList2, new a(1));
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            Cue cue2 = ((WebvttCueInfo) arrayList2.get(i4)).f18641a;
            Cue.Builder builder = new Cue.Builder();
            builder.f18454a = cue2.X;
            builder.f18455b = cue2.e0;
            builder.f18456c = cue2.f18453Y;
            builder.d = cue2.Z;
            builder.g = cue2.h0;
            builder.f18458h = cue2.i0;
            builder.f18459i = cue2.j0;
            builder.j = cue2.o0;
            builder.k = cue2.p0;
            builder.f18460l = cue2.k0;
            builder.m = cue2.l0;
            builder.f18461n = cue2.m0;
            builder.o = cue2.n0;
            builder.f18462p = cue2.q0;
            builder.q = cue2.r0;
            builder.f18457e = (-1) - i4;
            builder.f = 1;
            arrayList.add(builder.a());
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final long getEventTime(int i2) {
        Assertions.b(i2 >= 0);
        long[] jArr = this.Z;
        Assertions.b(i2 < jArr.length);
        return jArr[i2];
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final int getEventTimeCount() {
        return this.Z.length;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final int getNextEventTimeIndex(long j) {
        long[] jArr = this.Z;
        int iB = Util.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }
}
