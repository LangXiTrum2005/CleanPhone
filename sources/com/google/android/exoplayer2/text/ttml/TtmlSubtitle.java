package com.google.android.exoplayer2.text.ttml;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
final class TtmlSubtitle implements Subtitle {
    public final TtmlNode X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final long[] f18625Y;
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
        this.f18625Y = jArr;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final List getCues(long j) {
        TtmlNode ttmlNode = this.X;
        ArrayList<Pair> arrayList = new ArrayList();
        ttmlNode.g(j, ttmlNode.f18607h, arrayList);
        TreeMap treeMap = new TreeMap();
        ttmlNode.i(j, false, ttmlNode.f18607h, treeMap);
        HashMap map = this.e0;
        ttmlNode.h(j, this.Z, map, ttmlNode.f18607h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) this.f0.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                TtmlRegion ttmlRegion = (TtmlRegion) map.get(pair.first);
                ttmlRegion.getClass();
                Cue.Builder builder = new Cue.Builder();
                builder.f18455b = bitmapDecodeByteArray;
                builder.f18458h = ttmlRegion.f18611b;
                builder.f18459i = 0;
                builder.f18457e = ttmlRegion.f18612c;
                builder.f = 0;
                builder.g = ttmlRegion.f18613e;
                builder.f18460l = ttmlRegion.f;
                builder.m = ttmlRegion.g;
                builder.f18462p = ttmlRegion.j;
                arrayList2.add(builder.a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            TtmlRegion ttmlRegion2 = (TtmlRegion) map.get(entry.getKey());
            ttmlRegion2.getClass();
            Cue.Builder builder2 = (Cue.Builder) entry.getValue();
            CharSequence charSequence = builder2.f18454a;
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
            builder2.f18457e = ttmlRegion2.f18612c;
            builder2.f = ttmlRegion2.d;
            builder2.g = ttmlRegion2.f18613e;
            builder2.f18458h = ttmlRegion2.f18611b;
            builder2.f18460l = ttmlRegion2.f;
            builder2.k = ttmlRegion2.f18615i;
            builder2.j = ttmlRegion2.f18614h;
            builder2.f18462p = ttmlRegion2.j;
            arrayList2.add(builder2.a());
        }
        return arrayList2;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final long getEventTime(int i2) {
        return this.f18625Y[i2];
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final int getEventTimeCount() {
        return this.f18625Y.length;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final int getNextEventTimeIndex(long j) {
        long[] jArr = this.f18625Y;
        int iB = Util.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }
}
