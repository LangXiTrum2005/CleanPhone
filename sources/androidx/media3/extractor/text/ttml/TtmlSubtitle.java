package androidx.media3.extractor.text.ttml;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.Subtitle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
final class TtmlSubtitle implements Subtitle {
    public final TtmlNode X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final long[] f7390Y;
    public final Map Z;
    public final HashMap e0;
    public final HashMap f0;

    public TtmlSubtitle(TtmlNode ttmlNode, HashMap map, HashMap map2, HashMap map3) {
        this.X = ttmlNode;
        this.e0 = map2;
        this.f0 = map3;
        this.Z = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i2 = 0;
        ttmlNode.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i2] = ((Long) it.next()).longValue();
            i2++;
        }
        this.f7390Y = jArr;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final List getCues(long j) {
        TtmlNode ttmlNode = this.X;
        ArrayList<Pair> arrayList = new ArrayList();
        ttmlNode.g(j, ttmlNode.f7361h, arrayList);
        TreeMap treeMap = new TreeMap();
        ttmlNode.i(j, false, ttmlNode.f7361h, treeMap);
        HashMap map = this.e0;
        ttmlNode.h(j, this.Z, map, ttmlNode.f7361h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) this.f0.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                TtmlRegion ttmlRegion = (TtmlRegion) map.get(pair.first);
                ttmlRegion.getClass();
                Cue.Builder builder = new Cue.Builder();
                builder.f5605b = bitmapDecodeByteArray;
                builder.f5608h = ttmlRegion.f7376b;
                builder.f5609i = 0;
                builder.f5607e = ttmlRegion.f7377c;
                builder.f = 0;
                builder.g = ttmlRegion.f7378e;
                builder.f5610l = ttmlRegion.f;
                builder.m = ttmlRegion.g;
                builder.f5612p = ttmlRegion.j;
                arrayList2.add(builder.a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            TtmlRegion ttmlRegion2 = (TtmlRegion) map.get(entry.getKey());
            ttmlRegion2.getClass();
            Cue.Builder builder2 = (Cue.Builder) entry.getValue();
            CharSequence charSequence = builder2.f5604a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (DeleteTextSpan deleteTextSpan : (DeleteTextSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), DeleteTextSpan.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(deleteTextSpan), spannableStringBuilder.getSpanEnd(deleteTextSpan), (CharSequence) "");
            }
            for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i3 = i2 + 1;
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
                if (spannableStringBuilder.charAt(i6) == '\n') {
                    int i7 = i6 + 1;
                    if (spannableStringBuilder.charAt(i7) == ' ') {
                        spannableStringBuilder.delete(i7, i6 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
                if (spannableStringBuilder.charAt(i8) == ' ') {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == '\n') {
                        spannableStringBuilder.delete(i8, i9);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            builder2.f5607e = ttmlRegion2.f7377c;
            builder2.f = ttmlRegion2.d;
            builder2.g = ttmlRegion2.f7378e;
            builder2.f5608h = ttmlRegion2.f7376b;
            builder2.f5610l = ttmlRegion2.f;
            builder2.k = ttmlRegion2.f7380i;
            builder2.j = ttmlRegion2.f7379h;
            builder2.f5612p = ttmlRegion2.j;
            arrayList2.add(builder2.a());
        }
        return arrayList2;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final long getEventTime(int i2) {
        return this.f7390Y[i2];
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final int getEventTimeCount() {
        return this.f7390Y.length;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final int getNextEventTimeIndex(long j) {
        long[] jArr = this.f7390Y;
        int iB = Util.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }
}
