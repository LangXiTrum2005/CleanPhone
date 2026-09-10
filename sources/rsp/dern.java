package rsp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: TtmlNode.java */
/* JADX INFO: loaded from: classes.dex */
public final class dern {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final HashMap<String, Integer> f36954apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f36955attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final competently f36956beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final String[] f36957competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final dern f36958cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final boolean f36959dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final HashMap<String, Integer> f36960formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public List<dern> f36961impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final String f36962impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final long f36963marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f36964saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final String f36965taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final long f36966wireman;

    public dern(String str, String str2, long j, long j2, competently competentlyVar, String[] strArr, String str3, String str4, dern dernVar) {
        this.f36955attabal = str;
        this.f36964saneness = str2;
        this.f36965taiyuan = str4;
        this.f36956beachfront = competentlyVar;
        this.f36957competently = strArr;
        this.f36959dern = str2 != null;
        this.f36966wireman = j;
        this.f36963marial = j2;
        this.f36962impromptu = (String) decarock.attabal.marial(str3);
        this.f36958cutely = dernVar;
        this.f36954apical = new HashMap<>();
        this.f36960formularize = new HashMap<>();
    }

    public static SpannableStringBuilder apical(String str, Map<String, libya.attabal.saneness> map) {
        if (!map.containsKey(str)) {
            libya.attabal.saneness sanenessVar = new libya.attabal.saneness();
            sanenessVar.kowloon(new SpannableStringBuilder());
            map.put(str, sanenessVar);
        }
        return (SpannableStringBuilder) decarock.attabal.marial(map.get(str).marial());
    }

    public static dern dern(String str, long j, long j2, competently competentlyVar, String[] strArr, String str2, String str3, dern dernVar) {
        return new dern(str, null, j, j2, competentlyVar, strArr, str2, str3, dernVar);
    }

    public static void marial(SpannableStringBuilder spannableStringBuilder) {
        for (attabal attabalVar : (attabal[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), attabal.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(attabalVar), spannableStringBuilder.getSpanEnd(attabalVar), "");
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
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    public static dern wireman(String str) {
        return new dern(null, beachfront.saneness(str), C.TIME_UNSET, C.TIME_UNSET, null, null, "", null, null);
    }

    public final void arytenoidectomy(long j, boolean z, String str, Map<String, libya.attabal.saneness> map) {
        this.f36954apical.clear();
        this.f36960formularize.clear();
        if (TtmlNode.TAG_METADATA.equals(this.f36955attabal)) {
            return;
        }
        if (!"".equals(this.f36962impromptu)) {
            str = this.f36962impromptu;
        }
        String str2 = str;
        if (this.f36959dern && z) {
            apical(str2, map).append((CharSequence) decarock.attabal.marial(this.f36964saneness));
            return;
        }
        if (TtmlNode.TAG_BR.equals(this.f36955attabal) && z) {
            apical(str2, map).append('\n');
            return;
        }
        if (impassible(j)) {
            for (Map.Entry<String, libya.attabal.saneness> entry : map.entrySet()) {
                this.f36954apical.put(entry.getKey(), Integer.valueOf(((CharSequence) decarock.attabal.marial(entry.getValue().marial())).length()));
            }
            boolean zEquals = TtmlNode.TAG_P.equals(this.f36955attabal);
            int i = 0;
            while (i < competently()) {
                beachfront(i).arytenoidectomy(j, z || zEquals, str2, map);
                i++;
                j = j;
                map = map;
            }
            Map<String, libya.attabal.saneness> map2 = map;
            if (zEquals) {
                beachfront.dern(apical(str2, map2));
            }
            for (Map.Entry<String, libya.attabal.saneness> entry2 : map2.entrySet()) {
                this.f36960formularize.put(entry2.getKey(), Integer.valueOf(((CharSequence) decarock.attabal.marial(entry2.getValue().marial())).length()));
            }
        }
    }

    public void attabal(dern dernVar) {
        if (this.f36961impassible == null) {
            this.f36961impassible = new ArrayList();
        }
        this.f36961impassible.add(dernVar);
    }

    public dern beachfront(int i) {
        List<dern> list = this.f36961impassible;
        if (list != null) {
            return list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public int competently() {
        List<dern> list = this.f36961impassible;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public long[] cutely() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        taiyuan(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    public String[] formularize() {
        return this.f36957competently;
    }

    public boolean impassible(long j) {
        long j2 = this.f36966wireman;
        if (j2 == C.TIME_UNSET && this.f36963marial == C.TIME_UNSET) {
            return true;
        }
        if (j2 <= j && this.f36963marial == C.TIME_UNSET) {
            return true;
        }
        if (j2 != C.TIME_UNSET || j >= this.f36963marial) {
            return j2 <= j && j < this.f36963marial;
        }
        return true;
    }

    public List<libya.attabal> impromptu(long j, Map<String, competently> map, Map<String, marial> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        triweekly(j, this.f36962impromptu, arrayList);
        TreeMap treeMap = new TreeMap();
        arytenoidectomy(j, false, this.f36962impromptu, treeMap);
        kowloon(j, map, map2, this.f36962impromptu, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                marial marialVar = (marial) decarock.attabal.marial(map2.get(pair.first));
                arrayList2.add(new libya.attabal.saneness().beachfront(bitmapDecodeByteArray).apical(marialVar.f36979saneness).formularize(0).impromptu(marialVar.f36976dern, 0).taiyuan(marialVar.f36978marial).triweekly(marialVar.f36973beachfront).competently(marialVar.f36974competently).polloi(marialVar.f36975cutely).attabal());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            marial marialVar2 = (marial) decarock.attabal.marial(map2.get(entry.getKey()));
            libya.attabal.saneness sanenessVar = (libya.attabal.saneness) entry.getValue();
            marial((SpannableStringBuilder) decarock.attabal.marial(sanenessVar.marial()));
            sanenessVar.impromptu(marialVar2.f36976dern, marialVar2.f36981wireman);
            sanenessVar.taiyuan(marialVar2.f36978marial);
            sanenessVar.apical(marialVar2.f36979saneness);
            sanenessVar.triweekly(marialVar2.f36973beachfront);
            sanenessVar.monoploid(marialVar2.f36980taiyuan, marialVar2.f36977impromptu);
            sanenessVar.polloi(marialVar2.f36975cutely);
            arrayList2.add(sanenessVar.attabal());
        }
        return arrayList2;
    }

    public final void kowloon(long j, Map<String, competently> map, Map<String, marial> map2, String str, Map<String, libya.attabal.saneness> map3) {
        if (impassible(j)) {
            String str2 = "".equals(this.f36962impromptu) ? str : this.f36962impromptu;
            Iterator<Map.Entry<String, Integer>> it = this.f36960formularize.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int iIntValue = this.f36954apical.containsKey(key) ? this.f36954apical.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    saneness(map, (libya.attabal.saneness) decarock.attabal.marial(map3.get(key)), iIntValue, iIntValue2, ((marial) decarock.attabal.marial(map2.get(str2))).f36975cutely);
                }
            }
            for (int i = 0; i < competently(); i++) {
                beachfront(i).kowloon(j, map, map2, str2, map3);
            }
        }
    }

    public final void saneness(Map<String, competently> map, libya.attabal.saneness sanenessVar, int i, int i2, int i3) {
        competently competentlyVarBeachfront = beachfront.beachfront(this.f36956beachfront, this.f36957competently, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) sanenessVar.marial();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            sanenessVar.kowloon(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (competentlyVarBeachfront != null) {
            beachfront.attabal(spannableStringBuilder2, i, i2, competentlyVarBeachfront, this.f36958cutely, map, i3);
            if (TtmlNode.TAG_P.equals(this.f36955attabal)) {
                if (competentlyVarBeachfront.apical() != Float.MAX_VALUE) {
                    sanenessVar.impassible((competentlyVarBeachfront.apical() * (-90.0f)) / 100.0f);
                }
                if (competentlyVarBeachfront.impassible() != null) {
                    sanenessVar.arytenoidectomy(competentlyVarBeachfront.impassible());
                }
                if (competentlyVarBeachfront.impromptu() != null) {
                    sanenessVar.cutely(competentlyVarBeachfront.impromptu());
                }
            }
        }
    }

    public final void taiyuan(TreeSet<Long> treeSet, boolean z) {
        boolean zEquals = TtmlNode.TAG_P.equals(this.f36955attabal);
        boolean zEquals2 = TtmlNode.TAG_DIV.equals(this.f36955attabal);
        if (z || zEquals || (zEquals2 && this.f36965taiyuan != null)) {
            long j = this.f36966wireman;
            if (j != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f36963marial;
            if (j2 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f36961impassible == null) {
            return;
        }
        for (int i = 0; i < this.f36961impassible.size(); i++) {
            this.f36961impassible.get(i).taiyuan(treeSet, z || zEquals);
        }
    }

    public final void triweekly(long j, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f36962impromptu)) {
            str = this.f36962impromptu;
        }
        if (impassible(j) && TtmlNode.TAG_DIV.equals(this.f36955attabal) && this.f36965taiyuan != null) {
            list.add(new Pair<>(str, this.f36965taiyuan));
            return;
        }
        for (int i = 0; i < competently(); i++) {
            beachfront(i).triweekly(j, str, list);
        }
    }
}
