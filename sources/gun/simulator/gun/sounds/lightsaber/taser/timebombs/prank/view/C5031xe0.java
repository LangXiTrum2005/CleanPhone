package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xe0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5031xe0 implements InterfaceC4495ra0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4767ue0 f5236a;
    public final long[] b;
    public final Map c;
    public final Map d;
    public final Map e;

    public C5031xe0(C4767ue0 c4767ue0, HashMap map, HashMap map2, HashMap map3) {
        this.f5236a = c4767ue0;
        this.d = map2;
        this.e = map3;
        this.c = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        c4767ue0.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.b = jArr;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public final List getCues(long j) {
        C4767ue0 c4767ue0 = this.f5236a;
        c4767ue0.getClass();
        ArrayList<Pair> arrayList = new ArrayList();
        c4767ue0.g(j, c4767ue0.h, arrayList);
        TreeMap treeMap = new TreeMap();
        c4767ue0.i(j, false, c4767ue0.h, treeMap);
        Map map = this.c;
        Map map2 = this.d;
        c4767ue0.h(j, map, map2, c4767ue0.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) this.e.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                C4855ve0 c4855ve0 = (C4855ve0) map2.get(pair.first);
                c4855ve0.getClass();
                arrayList2.add(new C2417Fk(null, null, null, bitmapDecodeByteArray, c4855ve0.c, 0, c4855ve0.e, c4855ve0.b, 0, Integer.MIN_VALUE, -3.4028235E38f, c4855ve0.f, c4855ve0.g, false, ViewCompat.MEASURED_STATE_MASK, c4855ve0.j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C4855ve0 c4855ve1 = (C4855ve0) map2.get(entry.getKey());
            c4855ve1.getClass();
            C2391Ek c2391Ek = (C2391Ek) entry.getValue();
            CharSequence charSequence = c2391Ek.f3034a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (C4698to c4698to : (C4698to[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C4698to.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c4698to), spannableStringBuilder.getSpanEnd(c4698to), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c2391Ek.e = c4855ve1.c;
            c2391Ek.f = c4855ve1.d;
            c2391Ek.g = c4855ve1.e;
            c2391Ek.h = c4855ve1.b;
            c2391Ek.l = c4855ve1.f;
            c2391Ek.k = c4855ve1.i;
            c2391Ek.j = c4855ve1.h;
            c2391Ek.p = c4855ve1.j;
            arrayList2.add(c2391Ek.a());
        }
        return arrayList2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public final long getEventTime(int i) {
        return this.b[i];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public final int getEventTimeCount() {
        return this.b.length;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public final int getNextEventTimeIndex(long j) {
        long[] jArr = this.b;
        int iB = Ug0.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }
}
