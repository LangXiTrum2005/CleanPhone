package androidx.media3.exoplayer;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PlaylistTimeline.java */
/* JADX INFO: loaded from: classes.dex */
public final class attendance extends androidx.media3.exoplayer.attabal {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final int[] f11539apical;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final int[] f11540cutely;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final androidx.media3.common.oilcan[] f11541formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final Object[] f11542impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final int f11543impromptu;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final int f11544taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public final HashMap<Object, Integer> f11545triweekly;

    /* JADX INFO: compiled from: PlaylistTimeline.java */
    public class attabal extends ethene.triweekly {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final androidx.media3.common.oilcan.dern f11546beachfront;

        public attabal(androidx.media3.common.oilcan oilcanVar) {
            super(oilcanVar);
            this.f11546beachfront = new androidx.media3.common.oilcan.dern();
        }

        @Override // ethene.triweekly, androidx.media3.common.oilcan
        public androidx.media3.common.oilcan.saneness competently(int i, androidx.media3.common.oilcan.saneness sanenessVar, boolean z) {
            androidx.media3.common.oilcan.saneness sanenessVarCompetently = super.competently(i, sanenessVar, z);
            if (super.triweekly(sanenessVarCompetently.f11137dern, this.f11546beachfront).beachfront()) {
                sanenessVarCompetently.graveside(sanenessVar.f11134attabal, sanenessVar.f11139saneness, sanenessVar.f11137dern, sanenessVar.f11140wireman, sanenessVar.f11138marial, androidx.media3.common.attabal.f10748competently, true);
                return sanenessVarCompetently;
            }
            sanenessVarCompetently.f11135beachfront = true;
            return sanenessVarCompetently;
        }
    }

    public attendance(Collection<? extends picketboat> collection2, ethene.oilcan oilcanVar) {
        this(kattegat(collection2), supplicat(collection2), oilcanVar);
    }

    public static androidx.media3.common.oilcan[] kattegat(Collection<? extends picketboat> collection2) {
        androidx.media3.common.oilcan[] oilcanVarArr = new androidx.media3.common.oilcan[collection2.size()];
        Iterator<? extends picketboat> it = collection2.iterator();
        int i = 0;
        while (it.hasNext()) {
            oilcanVarArr[i] = it.next().saneness();
            i++;
        }
        return oilcanVarArr;
    }

    public static Object[] supplicat(Collection<? extends picketboat> collection2) {
        Object[] objArr = new Object[collection2.size()];
        Iterator<? extends picketboat> it = collection2.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next().attabal();
            i++;
        }
        return objArr;
    }

    @Override // androidx.media3.exoplayer.attabal
    public int adultoid(int i) {
        return decarock.grimness.beachfront(this.f11539apical, i + 1, false, false);
    }

    @Override // androidx.media3.common.oilcan
    public int arytenoidectomy() {
        return this.f11543impromptu;
    }

    @Override // androidx.media3.exoplayer.attabal
    public int cord(int i) {
        return this.f11540cutely[i];
    }

    @Override // androidx.media3.exoplayer.attabal
    public int cuirassed(int i) {
        return this.f11539apical[i];
    }

    @Override // androidx.media3.exoplayer.attabal
    public int graveside(int i) {
        return decarock.grimness.beachfront(this.f11540cutely, i + 1, false, false);
    }

    @Override // androidx.media3.exoplayer.attabal
    public int molybdenite(Object obj) {
        Integer num = this.f11545triweekly.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // androidx.media3.exoplayer.attabal
    public androidx.media3.common.oilcan oilcan(int i) {
        return this.f11541formularize[i];
    }

    @Override // androidx.media3.exoplayer.attabal
    public Object rotuma(int i) {
        return this.f11542impassible[i];
    }

    public List<androidx.media3.common.oilcan> sealless() {
        return Arrays.asList(this.f11541formularize);
    }

    @Override // androidx.media3.common.oilcan
    public int taiyuan() {
        return this.f11544taiyuan;
    }

    public attendance yemenite(ethene.oilcan oilcanVar) {
        androidx.media3.common.oilcan[] oilcanVarArr = new androidx.media3.common.oilcan[this.f11541formularize.length];
        int i = 0;
        while (true) {
            androidx.media3.common.oilcan[] oilcanVarArr2 = this.f11541formularize;
            if (i >= oilcanVarArr2.length) {
                return new attendance(oilcanVarArr, this.f11542impassible, oilcanVar);
            }
            oilcanVarArr[i] = new attabal(oilcanVarArr2[i]);
            i++;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public attendance(androidx.media3.common.oilcan[] oilcanVarArr, Object[] objArr, ethene.oilcan oilcanVar) {
        super(false, oilcanVar);
        int i = 0;
        int length = oilcanVarArr.length;
        this.f11541formularize = oilcanVarArr;
        this.f11540cutely = new int[length];
        this.f11539apical = new int[length];
        this.f11542impassible = objArr;
        this.f11545triweekly = new HashMap<>();
        int length2 = oilcanVarArr.length;
        int iArytenoidectomy = 0;
        int iTaiyuan = 0;
        int i2 = 0;
        while (i < length2) {
            androidx.media3.common.oilcan oilcanVar2 = oilcanVarArr[i];
            this.f11541formularize[i2] = oilcanVar2;
            this.f11539apical[i2] = iArytenoidectomy;
            this.f11540cutely[i2] = iTaiyuan;
            iArytenoidectomy += oilcanVar2.arytenoidectomy();
            iTaiyuan += this.f11541formularize[i2].taiyuan();
            this.f11545triweekly.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.f11543impromptu = iArytenoidectomy;
        this.f11544taiyuan = iTaiyuan;
    }
}
