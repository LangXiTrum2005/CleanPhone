package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.Subtitle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class WebvttSubtitle implements Subtitle {
    public final List X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final long[] f7429Y;
    public final long[] Z;

    public WebvttSubtitle(ArrayList arrayList) {
        this.X = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f7429Y = new long[arrayList.size() * 2];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            WebvttCueInfo webvttCueInfo = (WebvttCueInfo) arrayList.get(i2);
            int i3 = i2 * 2;
            long[] jArr = this.f7429Y;
            jArr[i3] = webvttCueInfo.f7409b;
            jArr[i3 + 1] = webvttCueInfo.f7410c;
        }
        long[] jArr2 = this.f7429Y;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.Z = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // androidx.media3.extractor.text.Subtitle
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
            long[] jArr = this.f7429Y;
            if (jArr[i3] <= j && j < jArr[i3 + 1]) {
                WebvttCueInfo webvttCueInfo = (WebvttCueInfo) list.get(i2);
                Cue cue = webvttCueInfo.f7408a;
                if (cue.f5598e == -3.4028235E38f) {
                    arrayList2.add(webvttCueInfo);
                } else {
                    arrayList.add(cue);
                }
            }
            i2++;
        }
        Collections.sort(arrayList2, new a(1));
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            Cue.Builder builderA = ((WebvttCueInfo) arrayList2.get(i4)).f7408a.a();
            builderA.f5607e = (-1) - i4;
            builderA.f = 1;
            arrayList.add(builderA.a());
        }
        return arrayList;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final long getEventTime(int i2) {
        Assertions.b(i2 >= 0);
        long[] jArr = this.Z;
        Assertions.b(i2 < jArr.length);
        return jArr[i2];
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final int getEventTimeCount() {
        return this.Z.length;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final int getNextEventTimeIndex(long j) {
        long[] jArr = this.Z;
        int iB = Util.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }
}
