package hydromechanics;

import androidx.media3.common.yemenite;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.MultimapBuilder;
import com.google.common.collect.claque;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: AdaptiveTrackSelection.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal extends dern {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public long f28131adultoid;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final long f28132apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final ImmutableList<C0640attabal> f28133arytenoidectomy;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final long f28134cutely;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public long f28135dovishness;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final int f28136formularize;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public int f28137graveside;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final int f28138impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final polyfoil.wireman f28139impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final float f28140kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public int f28141molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final decarock.wireman f28142monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public float f28143polloi;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final long f28144taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public final float f28145triweekly;

    /* JADX INFO: renamed from: hydromechanics.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AdaptiveTrackSelection.java */
    public static final class C0640attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final long f28146attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final long f28147saneness;

        public C0640attabal(long j, long j2) {
            this.f28146attabal = j;
            this.f28147saneness = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0640attabal)) {
                return false;
            }
            C0640attabal c0640attabal = (C0640attabal) obj;
            return this.f28146attabal == c0640attabal.f28146attabal && this.f28147saneness == c0640attabal.f28147saneness;
        }

        public int hashCode() {
            return (((int) this.f28146attabal) * 31) + ((int) this.f28147saneness);
        }
    }

    /* JADX INFO: compiled from: AdaptiveTrackSelection.java */
    public static class saneness implements rotuma.saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f28148attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final float f28149beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final float f28150competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f28151dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final decarock.wireman f28152impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final int f28153marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f28154saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int f28155wireman;

        public saneness() {
            this(10000, 25000, 25000, 0.7f);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0015  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // hydromechanics.rotuma.saneness
        public final rotuma[] attabal(rotuma.attabal[] attabalVarArr, polyfoil.wireman wiremanVar, androidx.media3.exoplayer.source.formularize.saneness sanenessVar, androidx.media3.common.oilcan oilcanVar) {
            polyfoil.wireman wiremanVar2;
            rotuma rotumaVarSaneness;
            ImmutableList immutableListCompetently = attabal.competently(attabalVarArr);
            rotuma[] rotumaVarArr = new rotuma[attabalVarArr.length];
            int i = 0;
            while (i < attabalVarArr.length) {
                rotuma.attabal attabalVar = attabalVarArr[i];
                if (attabalVar != null) {
                    int[] iArr = attabalVar.f28186saneness;
                    if (iArr.length == 0) {
                        wiremanVar2 = wiremanVar;
                    } else {
                        if (iArr.length == 1) {
                            rotumaVarSaneness = new preprohormone(attabalVar.f28184attabal, iArr[0], attabalVar.f28185dern);
                            wiremanVar2 = wiremanVar;
                        } else {
                            wiremanVar2 = wiremanVar;
                            rotumaVarSaneness = saneness(attabalVar.f28184attabal, iArr, attabalVar.f28185dern, wiremanVar2, (ImmutableList) immutableListCompetently.get(i));
                        }
                        rotumaVarArr[i] = rotumaVarSaneness;
                    }
                } else {
                    wiremanVar2 = wiremanVar;
                }
                i++;
                wiremanVar = wiremanVar2;
            }
            return rotumaVarArr;
        }

        public attabal saneness(yemenite yemeniteVar, int[] iArr, int i, polyfoil.wireman wiremanVar, ImmutableList<C0640attabal> immutableList) {
            return new attabal(yemeniteVar, iArr, i, wiremanVar, this.f28148attabal, this.f28154saneness, this.f28151dern, this.f28155wireman, this.f28153marial, this.f28149beachfront, this.f28150competently, immutableList, this.f28152impromptu);
        }

        public saneness(int i, int i2, int i3, float f) {
            this(i, i2, i3, 1279, 719, f, 0.75f, decarock.wireman.f25152attabal);
        }

        public saneness(int i, int i2, int i3, int i4, int i5, float f, float f2, decarock.wireman wiremanVar) {
            this.f28148attabal = i;
            this.f28154saneness = i2;
            this.f28151dern = i3;
            this.f28155wireman = i4;
            this.f28153marial = i5;
            this.f28149beachfront = f;
            this.f28150competently = f2;
            this.f28152impromptu = wiremanVar;
        }
    }

    public attabal(yemenite yemeniteVar, int[] iArr, int i, polyfoil.wireman wiremanVar, long j, long j2, long j3, int i2, int i3, float f, float f2, List<C0640attabal> list, decarock.wireman wiremanVar2) {
        long j4;
        super(yemeniteVar, iArr, i);
        if (j3 < j) {
            decarock.triweekly.impromptu("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j4 = j;
        } else {
            j4 = j3;
        }
        this.f28139impromptu = wiremanVar;
        this.f28144taiyuan = j * 1000;
        this.f28134cutely = j2 * 1000;
        this.f28132apical = j4 * 1000;
        this.f28136formularize = i2;
        this.f28138impassible = i3;
        this.f28145triweekly = f;
        this.f28140kowloon = f2;
        this.f28133arytenoidectomy = ImmutableList.copyOf((Collection) list);
        this.f28142monoploid = wiremanVar2;
        this.f28143polloi = 1.0f;
        this.f28137graveside = 0;
        this.f28131adultoid = C.TIME_UNSET;
        this.f28135dovishness = -2147483647L;
    }

    public static void beachfront(List<ImmutableList.attabal<C0640attabal>> list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            ImmutableList.attabal<C0640attabal> attabalVar = list.get(i);
            if (attabalVar != null) {
                attabalVar.attabal(new C0640attabal(j, jArr[i]));
            }
        }
    }

    public static ImmutableList<ImmutableList<C0640attabal>> competently(rotuma.attabal[] attabalVarArr) {
        ArrayList arrayList = new ArrayList();
        for (rotuma.attabal attabalVar : attabalVarArr) {
            if (attabalVar == null || attabalVar.f28186saneness.length <= 1) {
                arrayList.add(null);
            } else {
                ImmutableList.attabal attabalVarBuilder = ImmutableList.builder();
                attabalVarBuilder.attabal(new C0640attabal(0L, 0L));
                arrayList.add(attabalVarBuilder);
            }
        }
        long[][] jArrImpromptu = impromptu(attabalVarArr);
        int[] iArr = new int[jArrImpromptu.length];
        long[] jArr = new long[jArrImpromptu.length];
        for (int i = 0; i < jArrImpromptu.length; i++) {
            long[] jArr2 = jArrImpromptu[i];
            jArr[i] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        beachfront(arrayList, jArr);
        ImmutableList<Integer> immutableListTaiyuan = taiyuan(jArrImpromptu);
        for (int i2 = 0; i2 < immutableListTaiyuan.size(); i2++) {
            int iIntValue = immutableListTaiyuan.get(i2).intValue();
            int i3 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i3;
            jArr[iIntValue] = jArrImpromptu[iIntValue][i3];
            beachfront(arrayList, jArr);
        }
        for (int i4 = 0; i4 < attabalVarArr.length; i4++) {
            if (arrayList.get(i4) != null) {
                jArr[i4] = jArr[i4] * 2;
            }
        }
        beachfront(arrayList, jArr);
        ImmutableList.attabal attabalVarBuilder2 = ImmutableList.builder();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            ImmutableList.attabal attabalVar2 = (ImmutableList.attabal) arrayList.get(i5);
            attabalVarBuilder2.attabal(attabalVar2 == null ? ImmutableList.of() : attabalVar2.impassible());
        }
        return attabalVarBuilder2.impassible();
    }

    public static long[][] impromptu(rotuma.attabal[] attabalVarArr) {
        long[][] jArr = new long[attabalVarArr.length][];
        for (int i = 0; i < attabalVarArr.length; i++) {
            rotuma.attabal attabalVar = attabalVarArr[i];
            if (attabalVar == null) {
                jArr[i] = new long[0];
            } else {
                jArr[i] = new long[attabalVar.f28186saneness.length];
                int i2 = 0;
                while (true) {
                    int[] iArr = attabalVar.f28186saneness;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    long j = attabalVar.f28184attabal.attabal(iArr[i2]).f11217taiyuan;
                    long[] jArr2 = jArr[i];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i2] = j;
                    i2++;
                }
                Arrays.sort(jArr[i]);
            }
        }
        return jArr;
    }

    public static ImmutableList<Integer> taiyuan(long[][] jArr) {
        claque claqueVarCompetently = MultimapBuilder.marial().attabal().competently();
        for (int i = 0; i < jArr.length; i++) {
            long[] jArr2 = jArr[i];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i2 = 0;
                while (true) {
                    long[] jArr3 = jArr[i];
                    double dLog = 0.0d;
                    if (i2 >= jArr3.length) {
                        break;
                    }
                    long j = jArr3[i2];
                    if (j != -1) {
                        dLog = Math.log(j);
                    }
                    dArr[i2] = dLog;
                    i2++;
                }
                int i3 = length - 1;
                double d = dArr[i3] - dArr[0];
                int i4 = 0;
                while (i4 < i3) {
                    double d2 = dArr[i4];
                    i4++;
                    claqueVarCompetently.put(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i4]) * 0.5d) - dArr[0]) / d), Integer.valueOf(i));
                }
            }
        }
        return ImmutableList.copyOf(claqueVarCompetently.values());
    }

    @Override // hydromechanics.dern, hydromechanics.rotuma
    public void enable() {
        this.f28131adultoid = C.TIME_UNSET;
    }

    @Override // hydromechanics.rotuma
    public int getSelectedIndex() {
        return this.f28141molybdenite;
    }

    @Override // hydromechanics.dern, hydromechanics.rotuma
    public void onPlaybackSpeed(float f) {
        this.f28143polloi = f;
    }

    @Override // hydromechanics.dern, hydromechanics.rotuma
    public void disable() {
    }
}
