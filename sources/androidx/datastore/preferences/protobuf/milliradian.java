package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: SchemaUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class milliradian {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Class<?> f9785attabal = stratoscope();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final lerp<?, ?> f9787saneness = trm();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final lerp<?, ?> f9786dern = new lotta();

    public static int adultoid(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iSplinterproof = CodedOutputStream.splinterproof(i) * size;
        if (!(list instanceof stratoscope)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                iSplinterproof += obj instanceof ByteString ? CodedOutputStream.taiyuan((ByteString) obj) : CodedOutputStream.mathsort((String) obj);
                i2++;
            }
            return iSplinterproof;
        }
        stratoscope stratoscopeVar = (stratoscope) list;
        while (i2 < size) {
            Object raw = stratoscopeVar.getRaw(i2);
            iSplinterproof += raw instanceof ByteString ? CodedOutputStream.taiyuan((ByteString) raw) : CodedOutputStream.mathsort((String) raw);
            i2++;
        }
        return iSplinterproof;
    }

    public static int apical(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iFormularize = formularize(list);
        return z ? CodedOutputStream.splinterproof(i) + CodedOutputStream.oilcan(iFormularize) : iFormularize + (size * CodedOutputStream.splinterproof(i));
    }

    public static int arytenoidectomy(int i, List<?> list, premeiotic premeioticVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iSplinterproof = CodedOutputStream.splinterproof(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            iSplinterproof += obj instanceof cuirassed ? CodedOutputStream.trm((cuirassed) obj) : CodedOutputStream.restrictive((saran) obj, premeioticVar);
        }
        return iSplinterproof;
    }

    public static int attabal(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.splinterproof(i) + CodedOutputStream.oilcan(size) : size * CodedOutputStream.marial(i, true);
    }

    public static int beachfront(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.splinterproof(i) + CodedOutputStream.oilcan(size * 4) : size * CodedOutputStream.triweekly(i, 0);
    }

    public static void clubfoot(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSFixed32List(i, list, z);
    }

    public static int competently(List<?> list) {
        return list.size() * 4;
    }

    public static <UT, UB> UB cord(Object obj, int i, List<Integer> list, gintrap.saneness<?> sanenessVar, UB ub, lerp<UT, UB> lerpVar) {
        if (sanenessVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (sanenessVar.findValueByNumber(iIntValue) == null) {
                    ub = (UB) merc(obj, i, iIntValue, ub, lerpVar);
                    it.remove();
                }
            }
            return ub;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = list.get(i3);
            int iIntValue2 = num.intValue();
            if (sanenessVar.findValueByNumber(iIntValue2) != null) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                ub = (UB) merc(obj, i, iIntValue2, ub, lerpVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    public static void creditor(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeEnumList(i, list, z);
    }

    public static <UT, UB> UB cuirassed(Object obj, int i, List<Integer> list, gintrap.dern dernVar, UB ub, lerp<UT, UB> lerpVar) {
        if (dernVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!dernVar.isInRange(iIntValue)) {
                    ub = (UB) merc(obj, i, iIntValue, ub, lerpVar);
                    it.remove();
                }
            }
            return ub;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = list.get(i3);
            int iIntValue2 = num.intValue();
            if (dernVar.isInRange(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                ub = (UB) merc(obj, i, iIntValue2, ub, lerpVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    public static void cultivated(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSInt64List(i, list, z);
    }

    public static int cutely(int i, List<saran> list, premeiotic premeioticVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iGraveside = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iGraveside += CodedOutputStream.graveside(i, list.get(i2), premeioticVar);
        }
        return iGraveside;
    }

    public static void dent(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSFixed64List(i, list, z);
    }

    public static int dern(int i, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iSplinterproof = size * CodedOutputStream.splinterproof(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            iSplinterproof += CodedOutputStream.taiyuan(list.get(i2));
        }
        return iSplinterproof;
    }

    public static int dovishness(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iGintrap = gintrap(list);
        return z ? CodedOutputStream.splinterproof(i) + CodedOutputStream.oilcan(iGintrap) : iGintrap + (size * CodedOutputStream.splinterproof(i));
    }

    public static int formularize(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dovishness)) {
            int iRotuma = 0;
            while (i < size) {
                iRotuma += CodedOutputStream.rotuma(list.get(i).intValue());
                i++;
            }
            return iRotuma;
        }
        dovishness dovishnessVar = (dovishness) list;
        int iRotuma2 = 0;
        while (i < size) {
            iRotuma2 += CodedOutputStream.rotuma(dovishnessVar.getInt(i));
            i++;
        }
        return iRotuma2;
    }

    public static int gintrap(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dovishness)) {
            int iClubfoot = 0;
            while (i < size) {
                iClubfoot += CodedOutputStream.clubfoot(list.get(i).intValue());
                i++;
            }
            return iClubfoot;
        }
        dovishness dovishnessVar = (dovishness) list;
        int iClubfoot2 = 0;
        while (i < size) {
            iClubfoot2 += CodedOutputStream.clubfoot(dovishnessVar.getInt(i));
            i++;
        }
        return iClubfoot2;
    }

    public static int graveside(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof sealless)) {
            int iWalach = 0;
            while (i < size) {
                iWalach += CodedOutputStream.walach(list.get(i).longValue());
                i++;
            }
            return iWalach;
        }
        sealless seallessVar = (sealless) list;
        int iWalach2 = 0;
        while (i < size) {
            iWalach2 += CodedOutputStream.walach(seallessVar.getLong(i));
            i++;
        }
        return iWalach2;
    }

    public static void grimness(int i, List<Boolean> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeBoolList(i, list, z);
    }

    public static void hydrovane(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFixed64List(i, list, z);
    }

    public static int impassible(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int iTriweekly = triweekly(list);
        return z ? CodedOutputStream.splinterproof(i) + CodedOutputStream.oilcan(iTriweekly) : iTriweekly + (list.size() * CodedOutputStream.splinterproof(i));
    }

    public static int impromptu(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.splinterproof(i) + CodedOutputStream.oilcan(size * 8) : size * CodedOutputStream.arytenoidectomy(i, 0L);
    }

    public static <T, UT, UB> void kattegat(lerp<UT, UB> lerpVar, T t, T t2) {
        lerpVar.arytenoidectomy(t, lerpVar.apical(lerpVar.competently(t), lerpVar.competently(t2)));
    }

    public static int kowloon(int i, Object obj, premeiotic premeioticVar) {
        return obj instanceof cuirassed ? CodedOutputStream.stratoscope(i, (cuirassed) obj) : CodedOutputStream.kattegat(i, (saran) obj, premeioticVar);
    }

    public static int marial(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dovishness)) {
            int iImpassible = 0;
            while (i < size) {
                iImpassible += CodedOutputStream.impassible(list.get(i).intValue());
                i++;
            }
            return iImpassible;
        }
        dovishness dovishnessVar = (dovishness) list;
        int iImpassible2 = 0;
        while (i < size) {
            iImpassible2 += CodedOutputStream.impassible(dovishnessVar.getInt(i));
            i++;
        }
        return iImpassible2;
    }

    public static void mathsort(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeInt32List(i, list, z);
    }

    public static <UT, UB> UB merc(Object obj, int i, int i2, UB ub, lerp<UT, UB> lerpVar) {
        if (ub == null) {
            ub = lerpVar.beachfront(obj);
        }
        lerpVar.marial(ub, i, i2);
        return ub;
    }

    public static void milliradian(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeUInt64List(i, list, z);
    }

    public static int molybdenite(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iGraveside = graveside(list);
        return z ? CodedOutputStream.splinterproof(i) + CodedOutputStream.oilcan(iGraveside) : iGraveside + (size * CodedOutputStream.splinterproof(i));
    }

    public static int monoploid(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iPolloi = polloi(list);
        return z ? CodedOutputStream.splinterproof(i) + CodedOutputStream.oilcan(iPolloi) : iPolloi + (size * CodedOutputStream.splinterproof(i));
    }

    public static Class<?> oilcan() {
        if (clubfoot.f9694wireman) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void overspeculate(int i, List<?> list, Writer writer, premeiotic premeioticVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.beachfront(i, list, premeioticVar);
    }

    public static void peridotite(int i, List<?> list, Writer writer, premeiotic premeioticVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.attabal(i, list, premeioticVar);
    }

    public static void permissivist(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSInt32List(i, list, z);
    }

    public static lerp<?, ?> polder() {
        return f9787saneness;
    }

    public static int polloi(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dovishness)) {
            int iStarveling = 0;
            while (i < size) {
                iStarveling += CodedOutputStream.starveling(list.get(i).intValue());
                i++;
            }
            return iStarveling;
        }
        dovishness dovishnessVar = (dovishness) list;
        int iStarveling2 = 0;
        while (i < size) {
            iStarveling2 += CodedOutputStream.starveling(dovishnessVar.getInt(i));
            i++;
        }
        return iStarveling2;
    }

    public static void premeiotic(int i, List<String> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeStringList(i, list);
    }

    public static int preprohormone(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof sealless)) {
            int iPermissivist = 0;
            while (i < size) {
                iPermissivist += CodedOutputStream.permissivist(list.get(i).longValue());
                i++;
            }
            return iPermissivist;
        }
        sealless seallessVar = (sealless) list;
        int iPermissivist2 = 0;
        while (i < size) {
            iPermissivist2 += CodedOutputStream.permissivist(seallessVar.getLong(i));
            i++;
        }
        return iPermissivist2;
    }

    public static void privatdozent(int i, List<Double> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeDoubleList(i, list, z);
    }

    public static boolean restrictive(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int rotuma(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iPreprohormone = preprohormone(list);
        return z ? CodedOutputStream.splinterproof(i) + CodedOutputStream.oilcan(iPreprohormone) : iPreprohormone + (size * CodedOutputStream.splinterproof(i));
    }

    public static int saneness(List<?> list) {
        return list.size();
    }

    public static void saran(int i, List<ByteString> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeBytesList(i, list);
    }

    public static <T> void sealless(restrictive restrictiveVar, T t, T t2, long j) {
        sayid.splinterproof(t, j, restrictiveVar.mergeFrom(sayid.sealless(t, j), sayid.sealless(t2, j)));
    }

    public static lerp<?, ?> seminary() {
        return f9786dern;
    }

    public static void splinterproof(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeInt64List(i, list, z);
    }

    public static void starveling(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFixed32List(i, list, z);
    }

    public static Class<?> stratoscope() {
        if (clubfoot.f9694wireman) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void supplicat(Class<?> cls) {
        Class<?> cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && !clubfoot.f9694wireman && (cls2 = f9785attabal) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static int taiyuan(List<?> list) {
        return list.size() * 8;
    }

    public static void timberyard(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeUInt32List(i, list, z);
    }

    public static int triweekly(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof sealless)) {
            int iCord = 0;
            while (i < size) {
                iCord += CodedOutputStream.cord(list.get(i).longValue());
                i++;
            }
            return iCord;
        }
        sealless seallessVar = (sealless) list;
        int iCord2 = 0;
        while (i < size) {
            iCord2 += CodedOutputStream.cord(seallessVar.getLong(i));
            i++;
        }
        return iCord2;
    }

    public static lerp<?, ?> trm() {
        try {
            Class<?> clsOilcan = oilcan();
            if (clsOilcan == null) {
                return null;
            }
            return (lerp) clsOilcan.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void walach(int i, List<Float> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFloatList(i, list, z);
    }

    public static int wireman(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iMarial = marial(list);
        return z ? CodedOutputStream.splinterproof(i) + CodedOutputStream.oilcan(iMarial) : iMarial + (size * CodedOutputStream.splinterproof(i));
    }

    public static <T, FT extends molybdenite.saneness<FT>> void yemenite(kowloon<FT> kowloonVar, T t, T t2) {
        molybdenite<T> molybdeniteVarDern = kowloonVar.dern(t2);
        if (molybdeniteVarDern.triweekly()) {
            return;
        }
        kowloonVar.wireman(t).dovishness(molybdeniteVarDern);
    }
}
