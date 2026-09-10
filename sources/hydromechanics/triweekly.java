package hydromechanics;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.kattegat;
import androidx.media3.common.sealless;
import androidx.media3.common.yemenite;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.homozygous;
import androidx.media3.exoplayer.lampshade;
import androidx.media3.exoplayer.libyan;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.collect.czestochowa;
import com.google.common.primitives.Ints;
import com.ironsource.Z3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import decarock.grimness;
import ethene.restrictive;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: compiled from: DefaultTrackSelector.java */
/* JADX INFO: loaded from: classes.dex */
public class triweekly extends cord implements lampshade.attabal {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final Ordering<Integer> f28189apical = Ordering.from(new Comparator() { // from class: hydromechanics.wireman
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return triweekly.graveside((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final rotuma.saneness f28190beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final boolean f28191competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public androidx.media3.common.saneness f28192cutely;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public marial f28193impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Context f28194marial;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public competently f28195taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Object f28196wireman;

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class beachfront {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f28200attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f28201dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int[] f28202saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final String f28199wireman = grimness.igbo(0);

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public static final String f28198marial = grimness.igbo(1);

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public static final String f28197beachfront = grimness.igbo(2);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && beachfront.class == obj.getClass()) {
                beachfront beachfrontVar = (beachfront) obj;
                if (this.f28200attabal == beachfrontVar.f28200attabal && Arrays.equals(this.f28202saneness, beachfrontVar.f28202saneness) && this.f28201dern == beachfrontVar.f28201dern) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f28200attabal * 31) + Arrays.hashCode(this.f28202saneness)) * 31) + this.f28201dern;
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static class competently {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Spatializer f28203attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public Handler f28204dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final boolean f28205saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public Spatializer$OnSpatializerStateChangedListener f28206wireman;

        /* JADX INFO: compiled from: DefaultTrackSelector.java */
        public class attabal implements Spatializer$OnSpatializerStateChangedListener {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final /* synthetic */ triweekly f28207attabal;

            public attabal(triweekly triweeklyVar) {
                this.f28207attabal = triweeklyVar;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
                this.f28207attabal.saran();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
                this.f28207attabal.saran();
            }
        }

        public competently(Spatializer spatializer) {
            this.f28203attabal = spatializer;
            this.f28205saneness = spatializer.getImmersiveAudioLevel() != 0;
        }

        public static competently competently(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new competently(audioManager.getSpatializer());
        }

        public boolean attabal(androidx.media3.common.saneness sanenessVar, androidx.media3.common.polloi polloiVar) {
            int iSeminary = grimness.seminary((MimeTypes.AUDIO_E_AC3_JOC.equals(polloiVar.f11218triweekly) && polloiVar.f11215stratoscope == 16) ? 12 : polloiVar.f11215stratoscope);
            if (iSeminary == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iSeminary);
            int i = polloiVar.f11219trm;
            if (i != -1) {
                channelMask.setSampleRate(i);
            }
            return this.f28203attabal.canBeSpatialized(sanenessVar.attabal().f11287attabal, channelMask.build());
        }

        public void beachfront() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.f28206wireman;
            if (spatializer$OnSpatializerStateChangedListener == null || this.f28204dern == null) {
                return;
            }
            this.f28203attabal.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            ((Handler) grimness.impromptu(this.f28204dern)).removeCallbacksAndMessages(null);
            this.f28204dern = null;
            this.f28206wireman = null;
        }

        public boolean dern() {
            return this.f28203attabal.isAvailable();
        }

        public boolean marial() {
            return this.f28205saneness;
        }

        public void saneness(triweekly triweeklyVar, Looper looper) {
            if (this.f28206wireman == null && this.f28204dern == null) {
                this.f28206wireman = new attabal(triweeklyVar);
                Handler handler = new Handler(looper);
                this.f28204dern = handler;
                Spatializer spatializer = this.f28203attabal;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new hyalinization.grimness(handler), this.f28206wireman);
            }
        }

        public boolean wireman() {
            return this.f28203attabal.isEnabled();
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class cutely extends taiyuan<cutely> {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public final boolean f28209adultoid;

        /* JADX INFO: renamed from: cord, reason: collision with root package name */
        public final int f28210cord;

        /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
        public final int f28211cuirassed;

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
        public final boolean f28212dovishness;

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
        public final boolean f28213gintrap;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public final marial f28214graveside;

        /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
        public final int f28215kattegat;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public final boolean f28216molybdenite;

        /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
        public final int f28217oilcan;

        /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
        public final int f28218preprohormone;

        /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
        public final int f28219rotuma;

        /* JADX INFO: renamed from: sealless, reason: collision with root package name */
        public final boolean f28220sealless;

        /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
        public final boolean f28221stratoscope;

        /* JADX INFO: renamed from: trm, reason: collision with root package name */
        public final boolean f28222trm;

        /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
        public final boolean f28223yemenite;

        /* JADX WARN: Code duplicated, block: B:31:0x004b  */
        /* JADX WARN: Code duplicated, block: B:51:0x0079  */
        public cutely(int i, yemenite yemeniteVar, int i2, marial marialVar, int i3, int i4, boolean z) {
            boolean z2;
            boolean z3;
            androidx.media3.common.polloi polloiVar;
            int i5;
            int i6;
            int i7;
            androidx.media3.common.polloi polloiVar2;
            int i8;
            int i9;
            int i10;
            super(i, yemeniteVar, i2);
            this.f28214graveside = marialVar;
            int i11 = marialVar.f28259empress ? 24 : 16;
            this.f28222trm = marialVar.f28269sayid && (i4 & i11) != 0;
            if (!z || (((i8 = (polloiVar2 = this.f28312polloi).f11197graveside) != -1 && i8 > marialVar.f11015attabal) || ((i9 = polloiVar2.f11184adultoid) != -1 && i9 > marialVar.f11035saneness))) {
                z2 = false;
            } else {
                float f = polloiVar2.f11194dovishness;
                if ((f == -1.0f || f <= marialVar.f11021dern) && ((i10 = polloiVar2.f11217taiyuan) == -1 || i10 <= marialVar.f11039wireman)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            this.f28216molybdenite = z2;
            if (!z || (((i5 = (polloiVar = this.f28312polloi).f11197graveside) != -1 && i5 < marialVar.f11029marial) || ((i6 = polloiVar.f11184adultoid) != -1 && i6 < marialVar.f11016beachfront))) {
                z3 = false;
            } else {
                float f2 = polloiVar.f11194dovishness;
                if ((f2 == -1.0f || f2 >= marialVar.f11017competently) && ((i7 = polloiVar.f11217taiyuan) == -1 || i7 >= marialVar.f11027impromptu)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            this.f28209adultoid = z3;
            this.f28212dovishness = lampshade.beachfront(i3, false);
            androidx.media3.common.polloi polloiVar3 = this.f28312polloi;
            float f3 = polloiVar3.f11194dovishness;
            this.f28213gintrap = f3 != -1.0f && f3 >= 10.0f;
            this.f28219rotuma = polloiVar3.f11217taiyuan;
            this.f28218preprohormone = polloiVar3.beachfront();
            this.f28211cuirassed = triweekly.supplicat(this.f28312polloi.f11188beachfront, marialVar.f11026impassible);
            int i12 = this.f28312polloi.f11188beachfront;
            this.f28221stratoscope = i12 == 0 || (i12 & 1) != 0;
            int i13 = 0;
            while (true) {
                if (i13 >= marialVar.f11023formularize.size()) {
                    i13 = Integer.MAX_VALUE;
                    break;
                }
                String str = this.f28312polloi.f11218triweekly;
                if (str != null && str.equals(marialVar.f11023formularize.get(i13))) {
                    break;
                } else {
                    i13++;
                }
            }
            this.f28210cord = i13;
            this.f28223yemenite = lampshade.marial(i3) == 128;
            this.f28220sealless = lampshade.adultoid(i3) == 64;
            this.f28215kattegat = triweekly.restrictive(this.f28312polloi.f11218triweekly);
            this.f28217oilcan = impassible(i3, i11);
        }

        public static int apical(List<cutely> list, List<cutely> list2) {
            return czestochowa.apical().competently((cutely) Collections.max(list, new Comparator() { // from class: hydromechanics.dovishness
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return triweekly.cutely.taiyuan((triweekly.cutely) obj, (triweekly.cutely) obj2);
                }
            }), (cutely) Collections.max(list2, new Comparator() { // from class: hydromechanics.dovishness
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return triweekly.cutely.taiyuan((triweekly.cutely) obj, (triweekly.cutely) obj2);
                }
            }), new Comparator() { // from class: hydromechanics.dovishness
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return triweekly.cutely.taiyuan((triweekly.cutely) obj, (triweekly.cutely) obj2);
                }
            }).wireman(list.size(), list2.size()).competently((cutely) Collections.max(list, new Comparator() { // from class: hydromechanics.gintrap
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return triweekly.cutely.cutely((triweekly.cutely) obj, (triweekly.cutely) obj2);
                }
            }), (cutely) Collections.max(list2, new Comparator() { // from class: hydromechanics.gintrap
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return triweekly.cutely.cutely((triweekly.cutely) obj, (triweekly.cutely) obj2);
                }
            }), new Comparator() { // from class: hydromechanics.gintrap
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return triweekly.cutely.cutely((triweekly.cutely) obj, (triweekly.cutely) obj2);
                }
            }).cutely();
        }

        public static int cutely(cutely cutelyVar, cutely cutelyVar2) {
            Ordering orderingReverse = (cutelyVar.f28216molybdenite && cutelyVar.f28212dovishness) ? triweekly.f28189apical : triweekly.f28189apical.reverse();
            czestochowa czestochowaVarApical = czestochowa.apical();
            if (cutelyVar.f28214graveside.f11033preprohormone) {
                czestochowaVarApical = czestochowaVarApical.competently(Integer.valueOf(cutelyVar.f28219rotuma), Integer.valueOf(cutelyVar2.f28219rotuma), triweekly.f28189apical.reverse());
            }
            return czestochowaVarApical.competently(Integer.valueOf(cutelyVar.f28218preprohormone), Integer.valueOf(cutelyVar2.f28218preprohormone), orderingReverse).competently(Integer.valueOf(cutelyVar.f28219rotuma), Integer.valueOf(cutelyVar2.f28219rotuma), orderingReverse).cutely();
        }

        public static ImmutableList<cutely> formularize(int i, yemenite yemeniteVar, marial marialVar, int[] iArr, int i2) {
            int iSealless = triweekly.sealless(yemeniteVar, marialVar.f11037taiyuan, marialVar.f11020cutely, marialVar.f11013apical);
            ImmutableList.attabal attabalVarBuilder = ImmutableList.builder();
            for (int i3 = 0; i3 < yemeniteVar.f11332attabal; i3++) {
                int iBeachfront = yemeniteVar.attabal(i3).beachfront();
                attabalVarBuilder.attabal(new cutely(i, yemeniteVar, i3, marialVar, iArr[i3], i2, iSealless == Integer.MAX_VALUE || (iBeachfront != -1 && iBeachfront <= iSealless)));
            }
            return attabalVarBuilder.impassible();
        }

        public static int taiyuan(cutely cutelyVar, cutely cutelyVar2) {
            czestochowa czestochowaVarImpromptu = czestochowa.apical().impromptu(cutelyVar.f28212dovishness, cutelyVar2.f28212dovishness).wireman(cutelyVar.f28211cuirassed, cutelyVar2.f28211cuirassed).impromptu(cutelyVar.f28221stratoscope, cutelyVar2.f28221stratoscope).impromptu(cutelyVar.f28213gintrap, cutelyVar2.f28213gintrap).impromptu(cutelyVar.f28216molybdenite, cutelyVar2.f28216molybdenite).impromptu(cutelyVar.f28209adultoid, cutelyVar2.f28209adultoid).competently(Integer.valueOf(cutelyVar.f28210cord), Integer.valueOf(cutelyVar2.f28210cord), Ordering.natural().reverse()).impromptu(cutelyVar.f28223yemenite, cutelyVar2.f28223yemenite).impromptu(cutelyVar.f28220sealless, cutelyVar2.f28220sealless);
            if (cutelyVar.f28223yemenite && cutelyVar.f28220sealless) {
                czestochowaVarImpromptu = czestochowaVarImpromptu.wireman(cutelyVar.f28215kattegat, cutelyVar2.f28215kattegat);
            }
            return czestochowaVarImpromptu.cutely();
        }

        @Override // hydromechanics.triweekly.taiyuan
        public int attabal() {
            return this.f28217oilcan;
        }

        public final int impassible(int i, int i2) {
            if ((this.f28312polloi.f11188beachfront & 16384) != 0 || !lampshade.beachfront(i, this.f28214graveside.f28267picketboat)) {
                return 0;
            }
            if (!this.f28216molybdenite && !this.f28214graveside.f28264lotta) {
                return 0;
            }
            if (!lampshade.beachfront(i, false) || !this.f28209adultoid || !this.f28216molybdenite || this.f28312polloi.f11217taiyuan == -1) {
                return 1;
            }
            marial marialVar = this.f28214graveside;
            return (marialVar.f11018cord || marialVar.f11033preprohormone || (i & i2) == 0) ? 1 : 2;
        }

        @Override // hydromechanics.triweekly.taiyuan
        /* JADX INFO: renamed from: triweekly, reason: merged with bridge method [inline-methods] */
        public boolean dern(cutely cutelyVar) {
            if (!this.f28222trm && !grimness.dern(this.f28312polloi.f11218triweekly, cutelyVar.f28312polloi.f11218triweekly)) {
                return false;
            }
            if (this.f28214graveside.f28257coi) {
                return true;
            }
            return this.f28223yemenite == cutelyVar.f28223yemenite && this.f28220sealless == cutelyVar.f28220sealless;
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class dern extends taiyuan<dern> implements Comparable<dern> {

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public final int f28224graveside;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public final int f28225molybdenite;

        public dern(int i, yemenite yemeniteVar, int i2, marial marialVar, int i3) {
            super(i, yemeniteVar, i2);
            this.f28225molybdenite = lampshade.beachfront(i3, marialVar.f28267picketboat) ? 1 : 0;
            this.f28224graveside = this.f28312polloi.beachfront();
        }

        public static ImmutableList<dern> taiyuan(int i, yemenite yemeniteVar, marial marialVar, int[] iArr) {
            ImmutableList.attabal attabalVarBuilder = ImmutableList.builder();
            for (int i2 = 0; i2 < yemeniteVar.f11332attabal; i2++) {
                attabalVarBuilder.attabal(new dern(i, yemeniteVar, i2, marialVar, iArr[i2]));
            }
            return attabalVarBuilder.impassible();
        }

        public static int wireman(List<dern> list, List<dern> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        @Override // hydromechanics.triweekly.taiyuan
        public int attabal() {
            return this.f28225molybdenite;
        }

        @Override // hydromechanics.triweekly.taiyuan
        /* JADX INFO: renamed from: cutely, reason: merged with bridge method [inline-methods] */
        public boolean dern(dern dernVar) {
            return false;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
        public int compareTo(dern dernVar) {
            return Integer.compare(this.f28224graveside, dernVar.f28224graveside);
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class impromptu extends taiyuan<impromptu> implements Comparable<impromptu> {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public final boolean f28226adultoid;

        /* JADX INFO: renamed from: cord, reason: collision with root package name */
        public final int f28227cord;

        /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
        public final boolean f28228cuirassed;

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
        public final boolean f28229dovishness;

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
        public final int f28230gintrap;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public final boolean f28231graveside;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public final int f28232molybdenite;

        /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
        public final int f28233preprohormone;

        /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
        public final int f28234rotuma;

        public impromptu(int i, yemenite yemeniteVar, int i2, marial marialVar, int i3, String str) {
            int iYemenite;
            super(i, yemeniteVar, i2);
            int i4 = 0;
            this.f28231graveside = lampshade.beachfront(i3, false);
            int i5 = this.f28312polloi.f11202marial & (~marialVar.f11022dovishness);
            this.f28226adultoid = (i5 & 1) != 0;
            this.f28229dovishness = (i5 & 2) != 0;
            ImmutableList<String> immutableListOf = marialVar.f11025graveside.isEmpty() ? ImmutableList.of("") : marialVar.f11025graveside;
            int i6 = 0;
            while (true) {
                if (i6 >= immutableListOf.size()) {
                    i6 = Integer.MAX_VALUE;
                    iYemenite = 0;
                    break;
                } else {
                    iYemenite = triweekly.yemenite(this.f28312polloi, immutableListOf.get(i6), marialVar.f11024gintrap);
                    if (iYemenite > 0) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.f28230gintrap = i6;
            this.f28234rotuma = iYemenite;
            int iSupplicat = triweekly.supplicat(this.f28312polloi.f11188beachfront, marialVar.f11012adultoid);
            this.f28233preprohormone = iSupplicat;
            this.f28228cuirassed = (this.f28312polloi.f11188beachfront & 1088) != 0;
            int iYemenite2 = triweekly.yemenite(this.f28312polloi, str, triweekly.creditor(str) == null);
            this.f28227cord = iYemenite2;
            boolean z = iYemenite > 0 || (marialVar.f11025graveside.isEmpty() && iSupplicat > 0) || this.f28226adultoid || (this.f28229dovishness && iYemenite2 > 0);
            if (lampshade.beachfront(i3, marialVar.f28267picketboat) && z) {
                i4 = 1;
            }
            this.f28232molybdenite = i4;
        }

        public static ImmutableList<impromptu> taiyuan(int i, yemenite yemeniteVar, marial marialVar, int[] iArr, String str) {
            ImmutableList.attabal attabalVarBuilder = ImmutableList.builder();
            for (int i2 = 0; i2 < yemeniteVar.f11332attabal; i2++) {
                attabalVarBuilder.attabal(new impromptu(i, yemeniteVar, i2, marialVar, iArr[i2], str));
            }
            return attabalVarBuilder.impassible();
        }

        public static int wireman(List<impromptu> list, List<impromptu> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        @Override // hydromechanics.triweekly.taiyuan
        public int attabal() {
            return this.f28232molybdenite;
        }

        @Override // hydromechanics.triweekly.taiyuan
        /* JADX INFO: renamed from: cutely, reason: merged with bridge method [inline-methods] */
        public boolean dern(impromptu impromptuVar) {
            return false;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
        public int compareTo(impromptu impromptuVar) {
            czestochowa czestochowaVarWireman = czestochowa.apical().impromptu(this.f28231graveside, impromptuVar.f28231graveside).competently(Integer.valueOf(this.f28230gintrap), Integer.valueOf(impromptuVar.f28230gintrap), Ordering.natural().reverse()).wireman(this.f28234rotuma, impromptuVar.f28234rotuma).wireman(this.f28233preprohormone, impromptuVar.f28233preprohormone).impromptu(this.f28226adultoid, impromptuVar.f28226adultoid).competently(Boolean.valueOf(this.f28229dovishness), Boolean.valueOf(impromptuVar.f28229dovishness), this.f28234rotuma == 0 ? Ordering.natural() : Ordering.natural().reverse()).wireman(this.f28227cord, impromptuVar.f28227cord);
            if (this.f28233preprohormone == 0) {
                czestochowaVarWireman = czestochowaVarWireman.taiyuan(this.f28228cuirassed, impromptuVar.f28228cuirassed);
            }
            return czestochowaVarWireman.cutely();
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class marial extends kattegat {

        /* JADX INFO: renamed from: attendance, reason: collision with root package name */
        public static final String f28235attendance;

        /* JADX INFO: renamed from: basify, reason: collision with root package name */
        public static final String f28236basify;

        /* JADX INFO: renamed from: claque, reason: collision with root package name */
        @Deprecated
        public static final marial f28237claque;

        /* JADX INFO: renamed from: deadwork, reason: collision with root package name */
        public static final String f28238deadwork;

        /* JADX INFO: renamed from: dhss, reason: collision with root package name */
        public static final String f28239dhss;

        /* JADX INFO: renamed from: hardpan, reason: collision with root package name */
        public static final String f28240hardpan;

        /* JADX INFO: renamed from: herdbook, reason: collision with root package name */
        public static final String f28241herdbook;

        /* JADX INFO: renamed from: homozygous, reason: collision with root package name */
        public static final String f28242homozygous;

        /* JADX INFO: renamed from: immediately, reason: collision with root package name */
        public static final String f28243immediately;

        /* JADX INFO: renamed from: lampshade, reason: collision with root package name */
        public static final String f28244lampshade;

        /* JADX INFO: renamed from: libyan, reason: collision with root package name */
        public static final String f28245libyan;

        /* JADX INFO: renamed from: mastfed, reason: collision with root package name */
        public static final String f28246mastfed;

        /* JADX INFO: renamed from: molet, reason: collision with root package name */
        public static final String f28247molet;

        /* JADX INFO: renamed from: outmarry, reason: collision with root package name */
        public static final String f28248outmarry;

        /* JADX INFO: renamed from: prefect, reason: collision with root package name */
        public static final String f28249prefect;

        /* JADX INFO: renamed from: sakeen, reason: collision with root package name */
        public static final String f28250sakeen;

        /* JADX INFO: renamed from: setterwort, reason: collision with root package name */
        public static final String f28251setterwort;

        /* JADX INFO: renamed from: technofreak, reason: collision with root package name */
        public static final String f28252technofreak;

        /* JADX INFO: renamed from: tectonization, reason: collision with root package name */
        public static final String f28253tectonization;

        /* JADX INFO: renamed from: unconsolidated, reason: collision with root package name */
        public static final marial f28254unconsolidated;

        /* JADX INFO: renamed from: vesuvio, reason: collision with root package name */
        public static final String f28255vesuvio;

        /* JADX INFO: renamed from: achondroplasia, reason: collision with root package name */
        public final SparseBooleanArray f28256achondroplasia;

        /* JADX INFO: renamed from: coi, reason: collision with root package name */
        public final boolean f28257coi;

        /* JADX INFO: renamed from: czestochowa, reason: collision with root package name */
        public final boolean f28258czestochowa;

        /* JADX INFO: renamed from: empress, reason: collision with root package name */
        public final boolean f28259empress;

        /* JADX INFO: renamed from: gusty, reason: collision with root package name */
        public final boolean f28260gusty;

        /* JADX INFO: renamed from: igbo, reason: collision with root package name */
        public final boolean f28261igbo;

        /* JADX INFO: renamed from: julian, reason: collision with root package name */
        public final SparseArray<Map<restrictive, beachfront>> f28262julian;

        /* JADX INFO: renamed from: lightstruck, reason: collision with root package name */
        public final boolean f28263lightstruck;

        /* JADX INFO: renamed from: lotta, reason: collision with root package name */
        public final boolean f28264lotta;

        /* JADX INFO: renamed from: monroe, reason: collision with root package name */
        public final boolean f28265monroe;

        /* JADX INFO: renamed from: palmyra, reason: collision with root package name */
        public final boolean f28266palmyra;

        /* JADX INFO: renamed from: picketboat, reason: collision with root package name */
        public final boolean f28267picketboat;

        /* JADX INFO: renamed from: preterite, reason: collision with root package name */
        public final boolean f28268preterite;

        /* JADX INFO: renamed from: sayid, reason: collision with root package name */
        public final boolean f28269sayid;

        /* JADX INFO: renamed from: sensatory, reason: collision with root package name */
        public final boolean f28270sensatory;

        /* JADX INFO: renamed from: underbelly, reason: collision with root package name */
        public final boolean f28271underbelly;

        /* JADX INFO: renamed from: wostteth, reason: collision with root package name */
        public final boolean f28272wostteth;

        /* JADX INFO: compiled from: DefaultTrackSelector.java */
        public static final class attabal extends kattegat.dern {

            /* JADX INFO: renamed from: creditor, reason: collision with root package name */
            public boolean f28273creditor;

            /* JADX INFO: renamed from: grimness, reason: collision with root package name */
            public boolean f28274grimness;

            /* JADX INFO: renamed from: hydrovane, reason: collision with root package name */
            public final SparseArray<Map<restrictive, beachfront>> f28275hydrovane;

            /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
            public boolean f28276kattegat;

            /* JADX INFO: renamed from: merc, reason: collision with root package name */
            public boolean f28277merc;

            /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
            public boolean f28278oilcan;

            /* JADX INFO: renamed from: polder, reason: collision with root package name */
            public boolean f28279polder;

            /* JADX INFO: renamed from: privatdozent, reason: collision with root package name */
            public boolean f28280privatdozent;

            /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
            public boolean f28281restrictive;

            /* JADX INFO: renamed from: saran, reason: collision with root package name */
            public boolean f28282saran;

            /* JADX INFO: renamed from: sealless, reason: collision with root package name */
            public boolean f28283sealless;

            /* JADX INFO: renamed from: seminary, reason: collision with root package name */
            public boolean f28284seminary;

            /* JADX INFO: renamed from: starveling, reason: collision with root package name */
            public boolean f28285starveling;

            /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
            public boolean f28286supplicat;

            /* JADX INFO: renamed from: trm, reason: collision with root package name */
            public boolean f28287trm;

            /* JADX INFO: renamed from: walach, reason: collision with root package name */
            public final SparseBooleanArray f28288walach;

            /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
            public boolean f28289yemenite;

            public static SparseArray<Map<restrictive, beachfront>> cultivated(SparseArray<Map<restrictive, beachfront>> sparseArray) {
                SparseArray<Map<restrictive, beachfront>> sparseArray2 = new SparseArray<>();
                for (int i = 0; i < sparseArray.size(); i++) {
                    sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
                }
                return sparseArray2;
            }

            @Override // androidx.media3.common.kattegat.dern
            /* JADX INFO: renamed from: itchy, reason: merged with bridge method [inline-methods] */
            public attabal supplicat(Context context, boolean z) {
                super.supplicat(context, z);
                return this;
            }

            @Override // androidx.media3.common.kattegat.dern
            /* JADX INFO: renamed from: milliradian, reason: merged with bridge method [inline-methods] */
            public attabal sealless(Context context) {
                super.sealless(context);
                return this;
            }

            @Override // androidx.media3.common.kattegat.dern
            /* JADX INFO: renamed from: permissivist, reason: merged with bridge method [inline-methods] */
            public marial trm() {
                return new marial(this);
            }

            public final void premeiotic() {
                this.f28287trm = true;
                this.f28278oilcan = false;
                this.f28289yemenite = true;
                this.f28283sealless = false;
                this.f28276kattegat = true;
                this.f28286supplicat = false;
                this.f28281restrictive = false;
                this.f28277merc = false;
                this.f28279polder = false;
                this.f28284seminary = true;
                this.f28274grimness = true;
                this.f28282saran = true;
                this.f28280privatdozent = false;
                this.f28273creditor = true;
                this.f28285starveling = false;
            }

            public attabal timberyard(kattegat kattegatVar) {
                super.yemenite(kattegatVar);
                return this;
            }

            @Override // androidx.media3.common.kattegat.dern
            /* JADX INFO: renamed from: treadless, reason: merged with bridge method [inline-methods] */
            public attabal kattegat(int i, int i2, boolean z) {
                super.kattegat(i, i2, z);
                return this;
            }

            @Deprecated
            public attabal() {
                this.f28275hydrovane = new SparseArray<>();
                this.f28288walach = new SparseBooleanArray();
                premeiotic();
            }

            public attabal(Context context) {
                super(context);
                this.f28275hydrovane = new SparseArray<>();
                this.f28288walach = new SparseBooleanArray();
                premeiotic();
            }

            public attabal(marial marialVar) {
                super(marialVar);
                this.f28287trm = marialVar.f28264lotta;
                this.f28278oilcan = marialVar.f28269sayid;
                this.f28289yemenite = marialVar.f28259empress;
                this.f28283sealless = marialVar.f28257coi;
                this.f28276kattegat = marialVar.f28258czestochowa;
                this.f28286supplicat = marialVar.f28270sensatory;
                this.f28281restrictive = marialVar.f28271underbelly;
                this.f28277merc = marialVar.f28268preterite;
                this.f28279polder = marialVar.f28272wostteth;
                this.f28284seminary = marialVar.f28261igbo;
                this.f28274grimness = marialVar.f28260gusty;
                this.f28282saran = marialVar.f28267picketboat;
                this.f28280privatdozent = marialVar.f28266palmyra;
                this.f28273creditor = marialVar.f28263lightstruck;
                this.f28285starveling = marialVar.f28265monroe;
                this.f28275hydrovane = cultivated(marialVar.f28262julian);
                this.f28288walach = marialVar.f28256achondroplasia.clone();
            }
        }

        static {
            marial marialVarTrm = new attabal().trm();
            f28254unconsolidated = marialVarTrm;
            f28237claque = marialVarTrm;
            f28240hardpan = grimness.igbo(1000);
            f28241herdbook = grimness.igbo(1001);
            f28252technofreak = grimness.igbo(1002);
            f28248outmarry = grimness.igbo(1003);
            f28239dhss = grimness.igbo(1004);
            f28255vesuvio = grimness.igbo(1005);
            f28251setterwort = grimness.igbo(1006);
            f28246mastfed = grimness.igbo(1007);
            f28235attendance = grimness.igbo(1008);
            f28242homozygous = grimness.igbo(1009);
            f28244lampshade = grimness.igbo(1010);
            f28245libyan = grimness.igbo(1011);
            f28238deadwork = grimness.igbo(TTAdConstant.IMAGE_MODE_1012);
            f28247molet = grimness.igbo(Z3.i);
            f28250sakeen = grimness.igbo(Z3.j);
            f28243immediately = grimness.igbo(1015);
            f28236basify = grimness.igbo(Z3.l);
            f28253tectonization = grimness.igbo(1017);
            f28249prefect = grimness.igbo(1018);
        }

        public static marial competently(Context context) {
            return new attabal(context).trm();
        }

        public static boolean dern(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean marial(Map<restrictive, beachfront> map, Map<restrictive, beachfront> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<restrictive, beachfront> entry : map.entrySet()) {
                restrictive key = entry.getKey();
                if (!map2.containsKey(key) || !grimness.dern(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        public static boolean wireman(SparseArray<Map<restrictive, beachfront>> sparseArray, SparseArray<Map<restrictive, beachfront>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (iIndexOfKey < 0 || !marial(sparseArray.valueAt(i), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        public attabal beachfront() {
            return new attabal();
        }

        @Deprecated
        public boolean cutely(int i, restrictive restrictiveVar) {
            Map<restrictive, beachfront> map = this.f28262julian.get(i);
            return map != null && map.containsKey(restrictiveVar);
        }

        @Override // androidx.media3.common.kattegat
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && marial.class == obj.getClass()) {
                marial marialVar = (marial) obj;
                if (super.equals(marialVar) && this.f28264lotta == marialVar.f28264lotta && this.f28269sayid == marialVar.f28269sayid && this.f28259empress == marialVar.f28259empress && this.f28257coi == marialVar.f28257coi && this.f28258czestochowa == marialVar.f28258czestochowa && this.f28270sensatory == marialVar.f28270sensatory && this.f28271underbelly == marialVar.f28271underbelly && this.f28268preterite == marialVar.f28268preterite && this.f28272wostteth == marialVar.f28272wostteth && this.f28261igbo == marialVar.f28261igbo && this.f28260gusty == marialVar.f28260gusty && this.f28267picketboat == marialVar.f28267picketboat && this.f28266palmyra == marialVar.f28266palmyra && this.f28263lightstruck == marialVar.f28263lightstruck && this.f28265monroe == marialVar.f28265monroe && dern(this.f28256achondroplasia, marialVar.f28256achondroplasia) && wireman(this.f28262julian, marialVar.f28262julian)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.media3.common.kattegat
        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f28264lotta ? 1 : 0)) * 31) + (this.f28269sayid ? 1 : 0)) * 31) + (this.f28259empress ? 1 : 0)) * 31) + (this.f28257coi ? 1 : 0)) * 31) + (this.f28258czestochowa ? 1 : 0)) * 31) + (this.f28270sensatory ? 1 : 0)) * 31) + (this.f28271underbelly ? 1 : 0)) * 31) + (this.f28268preterite ? 1 : 0)) * 31) + (this.f28272wostteth ? 1 : 0)) * 31) + (this.f28261igbo ? 1 : 0)) * 31) + (this.f28260gusty ? 1 : 0)) * 31) + (this.f28267picketboat ? 1 : 0)) * 31) + (this.f28266palmyra ? 1 : 0)) * 31) + (this.f28263lightstruck ? 1 : 0)) * 31) + (this.f28265monroe ? 1 : 0);
        }

        public boolean impromptu(int i) {
            return this.f28256achondroplasia.get(i);
        }

        @Deprecated
        public beachfront taiyuan(int i, restrictive restrictiveVar) {
            Map<restrictive, beachfront> map = this.f28262julian.get(i);
            if (map != null) {
                return map.get(restrictiveVar);
            }
            return null;
        }

        public marial(attabal attabalVar) {
            super(attabalVar);
            this.f28264lotta = attabalVar.f28287trm;
            this.f28269sayid = attabalVar.f28278oilcan;
            this.f28259empress = attabalVar.f28289yemenite;
            this.f28257coi = attabalVar.f28283sealless;
            this.f28258czestochowa = attabalVar.f28276kattegat;
            this.f28270sensatory = attabalVar.f28286supplicat;
            this.f28271underbelly = attabalVar.f28281restrictive;
            this.f28268preterite = attabalVar.f28277merc;
            this.f28272wostteth = attabalVar.f28279polder;
            this.f28261igbo = attabalVar.f28284seminary;
            this.f28260gusty = attabalVar.f28274grimness;
            this.f28267picketboat = attabalVar.f28282saran;
            this.f28266palmyra = attabalVar.f28280privatdozent;
            this.f28263lightstruck = attabalVar.f28273creditor;
            this.f28265monroe = attabalVar.f28285starveling;
            this.f28262julian = attabalVar.f28275hydrovane;
            this.f28256achondroplasia = attabalVar.f28288walach;
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class saneness extends taiyuan<saneness> implements Comparable<saneness> {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public final String f28290adultoid;

        /* JADX INFO: renamed from: cord, reason: collision with root package name */
        public final int f28291cord;

        /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
        public final boolean f28292cuirassed;

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
        public final marial f28293dovishness;

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
        public final boolean f28294gintrap;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public final boolean f28295graveside;

        /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
        public final int f28296kattegat;

        /* JADX INFO: renamed from: merc, reason: collision with root package name */
        public final boolean f28297merc;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public final int f28298molybdenite;

        /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
        public final int f28299oilcan;

        /* JADX INFO: renamed from: polder, reason: collision with root package name */
        public final boolean f28300polder;

        /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
        public final int f28301preprohormone;

        /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
        public final int f28302restrictive;

        /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
        public final int f28303rotuma;

        /* JADX INFO: renamed from: sealless, reason: collision with root package name */
        public final int f28304sealless;

        /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
        public final boolean f28305stratoscope;

        /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
        public final int f28306supplicat;

        /* JADX INFO: renamed from: trm, reason: collision with root package name */
        public final int f28307trm;

        /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
        public final boolean f28308yemenite;

        public saneness(int i, yemenite yemeniteVar, int i2, marial marialVar, int i3, boolean z, com.google.common.base.impassible<androidx.media3.common.polloi> impassibleVar, int i4) {
            int i5;
            int iYemenite;
            int iYemenite2;
            super(i, yemeniteVar, i2);
            this.f28293dovishness = marialVar;
            int i6 = marialVar.f28261igbo ? 24 : 16;
            this.f28292cuirassed = marialVar.f28270sensatory && (i4 & i6) != 0;
            this.f28290adultoid = triweekly.creditor(this.f28312polloi.f11220wireman);
            this.f28294gintrap = lampshade.beachfront(i3, false);
            int i7 = 0;
            while (true) {
                i5 = Integer.MAX_VALUE;
                if (i7 >= marialVar.f11038triweekly.size()) {
                    iYemenite = 0;
                    i7 = Integer.MAX_VALUE;
                    break;
                } else {
                    iYemenite = triweekly.yemenite(this.f28312polloi, marialVar.f11038triweekly.get(i7), false);
                    if (iYemenite > 0) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.f28301preprohormone = i7;
            this.f28303rotuma = iYemenite;
            this.f28291cord = triweekly.supplicat(this.f28312polloi.f11188beachfront, marialVar.f11028kowloon);
            androidx.media3.common.polloi polloiVar = this.f28312polloi;
            int i8 = polloiVar.f11188beachfront;
            this.f28305stratoscope = i8 == 0 || (i8 & 1) != 0;
            this.f28308yemenite = (polloiVar.f11202marial & 1) != 0;
            int i9 = polloiVar.f11215stratoscope;
            this.f28304sealless = i9;
            this.f28296kattegat = polloiVar.f11219trm;
            int i10 = polloiVar.f11217taiyuan;
            this.f28306supplicat = i10;
            this.f28295graveside = (i10 == -1 || i10 <= marialVar.f11031monoploid) && (i9 == -1 || i9 <= marialVar.f11014arytenoidectomy) && impassibleVar.apply(polloiVar);
            String[] strArrNosophobia = grimness.nosophobia();
            int i11 = 0;
            while (true) {
                if (i11 >= strArrNosophobia.length) {
                    iYemenite2 = 0;
                    i11 = Integer.MAX_VALUE;
                    break;
                } else {
                    iYemenite2 = triweekly.yemenite(this.f28312polloi, strArrNosophobia[i11], false);
                    if (iYemenite2 > 0) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f28307trm = i11;
            this.f28299oilcan = iYemenite2;
            for (int i12 = 0; i12 < marialVar.f11032polloi.size(); i12++) {
                String str = this.f28312polloi.f11218triweekly;
                if (str != null && str.equals(marialVar.f11032polloi.get(i12))) {
                    i5 = i12;
                    break;
                }
            }
            this.f28302restrictive = i5;
            this.f28297merc = lampshade.marial(i3) == 128;
            this.f28300polder = lampshade.adultoid(i3) == 64;
            this.f28298molybdenite = cutely(i3, z, i6);
        }

        public static ImmutableList<saneness> taiyuan(int i, yemenite yemeniteVar, marial marialVar, int[] iArr, boolean z, com.google.common.base.impassible<androidx.media3.common.polloi> impassibleVar, int i2) {
            ImmutableList.attabal attabalVarBuilder = ImmutableList.builder();
            for (int i3 = 0; i3 < yemeniteVar.f11332attabal; i3++) {
                attabalVarBuilder.attabal(new saneness(i, yemeniteVar, i3, marialVar, iArr[i3], z, impassibleVar, i2));
            }
            return attabalVarBuilder.impassible();
        }

        public static int wireman(List<saneness> list, List<saneness> list2) {
            return ((saneness) Collections.max(list)).compareTo((saneness) Collections.max(list2));
        }

        @Override // hydromechanics.triweekly.taiyuan
        /* JADX INFO: renamed from: apical, reason: merged with bridge method [inline-methods] */
        public boolean dern(saneness sanenessVar) {
            int i;
            String str;
            int i2;
            if (!this.f28293dovishness.f28268preterite && ((i2 = this.f28312polloi.f11215stratoscope) == -1 || i2 != sanenessVar.f28312polloi.f11215stratoscope)) {
                return false;
            }
            if (!this.f28292cuirassed && ((str = this.f28312polloi.f11218triweekly) == null || !TextUtils.equals(str, sanenessVar.f28312polloi.f11218triweekly))) {
                return false;
            }
            marial marialVar = this.f28293dovishness;
            if (!marialVar.f28271underbelly && ((i = this.f28312polloi.f11219trm) == -1 || i != sanenessVar.f28312polloi.f11219trm)) {
                return false;
            }
            if (marialVar.f28272wostteth) {
                return true;
            }
            return this.f28297merc == sanenessVar.f28297merc && this.f28300polder == sanenessVar.f28300polder;
        }

        @Override // hydromechanics.triweekly.taiyuan
        public int attabal() {
            return this.f28298molybdenite;
        }

        public final int cutely(int i, boolean z, int i2) {
            if (!lampshade.beachfront(i, this.f28293dovishness.f28267picketboat)) {
                return 0;
            }
            if (!this.f28295graveside && !this.f28293dovishness.f28258czestochowa) {
                return 0;
            }
            marial marialVar = this.f28293dovishness;
            if (marialVar.f11030molybdenite.f11072attabal == 2 && !triweekly.starveling(marialVar, i, this.f28312polloi)) {
                return 0;
            }
            if (!lampshade.beachfront(i, false) || !this.f28295graveside || this.f28312polloi.f11217taiyuan == -1) {
                return 1;
            }
            marial marialVar2 = this.f28293dovishness;
            if (marialVar2.f11018cord || marialVar2.f11033preprohormone) {
                return 1;
            }
            return ((!marialVar2.f28263lightstruck && z) || marialVar2.f11030molybdenite.f11072attabal == 2 || (i & i2) == 0) ? 1 : 2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
        public int compareTo(saneness sanenessVar) {
            Ordering orderingReverse = (this.f28295graveside && this.f28294gintrap) ? triweekly.f28189apical : triweekly.f28189apical.reverse();
            czestochowa czestochowaVarCompetently = czestochowa.apical().impromptu(this.f28294gintrap, sanenessVar.f28294gintrap).competently(Integer.valueOf(this.f28301preprohormone), Integer.valueOf(sanenessVar.f28301preprohormone), Ordering.natural().reverse()).wireman(this.f28303rotuma, sanenessVar.f28303rotuma).wireman(this.f28291cord, sanenessVar.f28291cord).impromptu(this.f28308yemenite, sanenessVar.f28308yemenite).impromptu(this.f28305stratoscope, sanenessVar.f28305stratoscope).competently(Integer.valueOf(this.f28307trm), Integer.valueOf(sanenessVar.f28307trm), Ordering.natural().reverse()).wireman(this.f28299oilcan, sanenessVar.f28299oilcan).impromptu(this.f28295graveside, sanenessVar.f28295graveside).competently(Integer.valueOf(this.f28302restrictive), Integer.valueOf(sanenessVar.f28302restrictive), Ordering.natural().reverse());
            if (this.f28293dovishness.f11033preprohormone) {
                czestochowaVarCompetently = czestochowaVarCompetently.competently(Integer.valueOf(this.f28306supplicat), Integer.valueOf(sanenessVar.f28306supplicat), triweekly.f28189apical.reverse());
            }
            czestochowa czestochowaVarCompetently2 = czestochowaVarCompetently.impromptu(this.f28297merc, sanenessVar.f28297merc).impromptu(this.f28300polder, sanenessVar.f28300polder).competently(Integer.valueOf(this.f28304sealless), Integer.valueOf(sanenessVar.f28304sealless), orderingReverse).competently(Integer.valueOf(this.f28296kattegat), Integer.valueOf(sanenessVar.f28296kattegat), orderingReverse);
            if (grimness.dern(this.f28290adultoid, sanenessVar.f28290adultoid)) {
                czestochowaVarCompetently2 = czestochowaVarCompetently2.competently(Integer.valueOf(this.f28306supplicat), Integer.valueOf(sanenessVar.f28306supplicat), orderingReverse);
            }
            return czestochowaVarCompetently2.cutely();
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static abstract class taiyuan<T extends taiyuan<T>> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final yemenite f28309arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final int f28310kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final int f28311monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public final androidx.media3.common.polloi f28312polloi;

        /* JADX INFO: compiled from: DefaultTrackSelector.java */
        public interface attabal<T extends taiyuan<T>> {
            List<T> attabal(int i, yemenite yemeniteVar, int[] iArr);
        }

        public taiyuan(int i, yemenite yemeniteVar, int i2) {
            this.f28310kowloon = i;
            this.f28309arytenoidectomy = yemeniteVar;
            this.f28311monoploid = i2;
            this.f28312polloi = yemeniteVar.attabal(i2);
        }

        public abstract int attabal();

        public abstract boolean dern(T t);
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class wireman implements Comparable<wireman> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final boolean f28313arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final boolean f28314kowloon;

        public wireman(androidx.media3.common.polloi polloiVar, int i) {
            this.f28314kowloon = (polloiVar.f11202marial & 1) != 0;
            this.f28313arytenoidectomy = lampshade.beachfront(i, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public int compareTo(wireman wiremanVar) {
            return czestochowa.apical().impromptu(this.f28313arytenoidectomy, wiremanVar.f28313arytenoidectomy).impromptu(this.f28314kowloon, wiremanVar.f28314kowloon).cutely();
        }
    }

    public triweekly(Context context) {
        this(context, new hydromechanics.attabal.saneness());
    }

    public static String creditor(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    public static /* synthetic */ int graveside(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public static void grimness(cord.attabal attabalVar, int[][][] iArr, libyan[] libyanVarArr, rotuma[] rotumaVarArr) {
        boolean z;
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= attabalVar.wireman()) {
                z = true;
                break;
            }
            int iMarial = attabalVar.marial(i3);
            rotuma rotumaVar = rotumaVarArr[i3];
            if ((iMarial == 1 || iMarial == 2) && rotumaVar != null && hydrovane(iArr[i3], attabalVar.beachfront(i3), rotumaVar)) {
                if (iMarial == 1) {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i3;
                } else {
                    if (i != -1) {
                        z = false;
                        break;
                    }
                    i = i3;
                }
            }
            i3++;
        }
        if (z && ((i2 == -1 || i == -1) ? false : true)) {
            libyan libyanVar = new libyan(0, true);
            libyanVarArr[i2] = libyanVar;
            libyanVarArr[i] = libyanVar;
        }
    }

    public static boolean hydrovane(int[][] iArr, restrictive restrictiveVar, rotuma rotumaVar) {
        if (rotumaVar == null) {
            return false;
        }
        int iWireman = restrictiveVar.wireman(rotumaVar.getTrackGroup());
        for (int i = 0; i < rotumaVar.length(); i++) {
            if (lampshade.cutely(iArr[iWireman][rotumaVar.getIndexInTrackGroup(i)]) != 32) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x000f  */
    public static Point kattegat(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            if ((i3 > i4) == (i > i2)) {
                i2 = i;
                i = i2;
            }
        } else {
            i2 = i;
            i = i2;
        }
        int i5 = i3 * i;
        int i6 = i4 * i2;
        return i5 >= i6 ? new Point(i2, grimness.cutely(i6, i3)) : new Point(grimness.cutely(i5, i4), i);
    }

    public static void oilcan(restrictive restrictiveVar, kattegat kattegatVar, Map<Integer, sealless> map) {
        sealless seallessVar;
        for (int i = 0; i < restrictiveVar.f26059attabal; i++) {
            sealless seallessVar2 = kattegatVar.f11019cuirassed.get(restrictiveVar.saneness(i));
            if (seallessVar2 != null && ((seallessVar = map.get(Integer.valueOf(seallessVar2.attabal()))) == null || (seallessVar.f11291saneness.isEmpty() && !seallessVar2.f11291saneness.isEmpty()))) {
                map.put(Integer.valueOf(seallessVar2.attabal()), seallessVar2);
            }
        }
    }

    public static boolean polder(androidx.media3.common.polloi polloiVar) {
        String str = polloiVar.f11218triweekly;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/ac3":
            case "audio/ac4":
            case "audio/eac3":
                return true;
            default:
                return false;
        }
    }

    public static /* synthetic */ List polloi(final triweekly triweeklyVar, marial marialVar, boolean z, int[] iArr, int i, yemenite yemeniteVar, int[] iArr2) {
        triweeklyVar.getClass();
        return saneness.taiyuan(i, yemeniteVar, marialVar, iArr2, z, new com.google.common.base.impassible() { // from class: hydromechanics.impassible
            @Override // com.google.common.base.impassible
            public final boolean apply(Object obj) {
                return this.f28175kowloon.merc((androidx.media3.common.polloi) obj);
            }
        }, iArr[i]);
    }

    public static int restrictive(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "video/dolby-vision":
                return 5;
            case "video/av01":
                return 4;
            case "video/hevc":
                return 3;
            case "video/avc":
                return 1;
            case "video/x-vnd.on2.vp9":
                return 2;
            default:
                return 0;
        }
    }

    public static int sealless(yemenite yemeniteVar, int i, int i2, boolean z) {
        int i3;
        int i4 = Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
            for (int i5 = 0; i5 < yemeniteVar.f11332attabal; i5++) {
                androidx.media3.common.polloi polloiVarAttabal = yemeniteVar.attabal(i5);
                int i6 = polloiVarAttabal.f11197graveside;
                if (i6 > 0 && (i3 = polloiVarAttabal.f11184adultoid) > 0) {
                    Point pointKattegat = kattegat(z, i, i2, i6, i3);
                    int i7 = polloiVarAttabal.f11197graveside;
                    int i8 = polloiVarAttabal.f11184adultoid;
                    int i9 = i7 * i8;
                    if (i7 >= ((int) (pointKattegat.x * 0.98f)) && i8 >= ((int) (pointKattegat.y * 0.98f)) && i9 < i4) {
                        i4 = i9;
                    }
                }
            }
        }
        return i4;
    }

    public static void seminary(marial marialVar, cord.attabal attabalVar, int[][][] iArr, libyan[] libyanVarArr, rotuma[] rotumaVarArr) {
        int i = -1;
        boolean z = false;
        int i2 = 0;
        for (int i3 = 0; i3 < attabalVar.wireman(); i3++) {
            int iMarial = attabalVar.marial(i3);
            rotuma rotumaVar = rotumaVarArr[i3];
            if (iMarial != 1 && rotumaVar != null) {
                return;
            }
            if (iMarial == 1 && rotumaVar != null && rotumaVar.length() == 1) {
                if (starveling(marialVar, iArr[i3][attabalVar.beachfront(i3).wireman(rotumaVar.getTrackGroup())][rotumaVar.getIndexInTrackGroup(0)], rotumaVar.getSelectedFormat())) {
                    i2++;
                    i = i3;
                }
            }
        }
        if (i2 == 1) {
            int i4 = marialVar.f11030molybdenite.f11074saneness ? 1 : 2;
            libyan libyanVar = libyanVarArr[i];
            if (libyanVar != null && libyanVar.f11960saneness) {
                z = true;
            }
            libyanVarArr[i] = new libyan(i4, z);
        }
    }

    public static boolean starveling(marial marialVar, int i, androidx.media3.common.polloi polloiVar) {
        if (lampshade.kowloon(i) == 0) {
            return false;
        }
        if (marialVar.f11030molybdenite.f11073dern && (lampshade.kowloon(i) & 2048) == 0) {
            return false;
        }
        if (marialVar.f11030molybdenite.f11074saneness) {
            boolean z = (polloiVar.f11221yemenite == 0 && polloiVar.f11213sealless == 0) ? false : true;
            boolean z2 = (lampshade.kowloon(i) & 1024) != 0;
            if (z && !z2) {
                return false;
            }
        }
        return true;
    }

    public static void stratoscope(cord.attabal attabalVar, marial marialVar, rotuma.attabal[] attabalVarArr) {
        int iWireman = attabalVar.wireman();
        for (int i = 0; i < iWireman; i++) {
            restrictive restrictiveVarBeachfront = attabalVar.beachfront(i);
            if (marialVar.cutely(i, restrictiveVarBeachfront)) {
                beachfront beachfrontVarTaiyuan = marialVar.taiyuan(i, restrictiveVarBeachfront);
                attabalVarArr[i] = (beachfrontVarTaiyuan == null || beachfrontVarTaiyuan.f28202saneness.length == 0) ? null : new rotuma.attabal(restrictiveVarBeachfront.saneness(beachfrontVarTaiyuan.f28200attabal), beachfrontVarTaiyuan.f28202saneness, beachfrontVarTaiyuan.f28201dern);
            }
        }
    }

    public static int supplicat(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    public static void trm(cord.attabal attabalVar, kattegat kattegatVar, rotuma.attabal[] attabalVarArr) {
        int iWireman = attabalVar.wireman();
        HashMap map = new HashMap();
        for (int i = 0; i < iWireman; i++) {
            oilcan(attabalVar.beachfront(i), kattegatVar, map);
        }
        oilcan(attabalVar.impromptu(), kattegatVar, map);
        for (int i2 = 0; i2 < iWireman; i2++) {
            sealless seallessVar = (sealless) map.get(Integer.valueOf(attabalVar.marial(i2)));
            if (seallessVar != null) {
                attabalVarArr[i2] = (seallessVar.f11291saneness.isEmpty() || attabalVar.beachfront(i2).wireman(seallessVar.f11290attabal) == -1) ? null : new rotuma.attabal(seallessVar.f11290attabal, Ints.impassible(seallessVar.f11291saneness));
            }
        }
    }

    public static int yemenite(androidx.media3.common.polloi polloiVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(polloiVar.f11220wireman)) {
            return 4;
        }
        String strCreditor = creditor(str);
        String strCreditor2 = creditor(polloiVar.f11220wireman);
        if (strCreditor2 == null || strCreditor == null) {
            return (z && strCreditor2 == null) ? 1 : 0;
        }
        if (strCreditor2.startsWith(strCreditor) || strCreditor.startsWith(strCreditor2)) {
            return 3;
        }
        return grimness.licking(strCreditor2, "-")[0].equals(grimness.licking(strCreditor, "-")[0]) ? 2 : 0;
    }

    @Override // hydromechanics.trm
    public void apical(androidx.media3.common.saneness sanenessVar) {
        boolean zEquals;
        synchronized (this.f28196wireman) {
            zEquals = this.f28192cutely.equals(sanenessVar);
            this.f28192cutely = sanenessVar;
        }
        if (zEquals) {
            return;
        }
        saran();
    }

    @Override // androidx.media3.exoplayer.lampshade.attabal
    public void attabal(homozygous homozygousVar) {
        privatdozent(homozygousVar);
    }

    public final <T extends taiyuan<T>> Pair<rotuma.attabal, Integer> clubfoot(int i, cord.attabal attabalVar, int[][][] iArr, taiyuan.attabal<T> attabalVar2, Comparator<List<T>> comparator) {
        int i2;
        RandomAccess randomAccessOf;
        cord.attabal attabalVar3 = attabalVar;
        ArrayList arrayList = new ArrayList();
        int iWireman = attabalVar3.wireman();
        int i3 = 0;
        while (i3 < iWireman) {
            if (i == attabalVar3.marial(i3)) {
                restrictive restrictiveVarBeachfront = attabalVar3.beachfront(i3);
                for (int i4 = 0; i4 < restrictiveVarBeachfront.f26059attabal; i4++) {
                    yemenite yemeniteVarSaneness = restrictiveVarBeachfront.saneness(i4);
                    List<T> listAttabal = attabalVar2.attabal(i3, yemeniteVarSaneness, iArr[i3][i4]);
                    boolean[] zArr = new boolean[yemeniteVarSaneness.f11332attabal];
                    int i5 = 0;
                    while (i5 < yemeniteVarSaneness.f11332attabal) {
                        T t = listAttabal.get(i5);
                        int iAttabal = t.attabal();
                        if (zArr[i5] || iAttabal == 0) {
                            i2 = iWireman;
                        } else {
                            if (iAttabal == 1) {
                                randomAccessOf = ImmutableList.of(t);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t);
                                int i6 = i5 + 1;
                                while (i6 < yemeniteVarSaneness.f11332attabal) {
                                    T t2 = listAttabal.get(i6);
                                    int i7 = iWireman;
                                    if (t2.attabal() == 2 && t.dern(t2)) {
                                        arrayList2.add(t2);
                                        zArr[i6] = true;
                                    }
                                    i6++;
                                    iWireman = i7;
                                }
                                randomAccessOf = arrayList2;
                            }
                            i2 = iWireman;
                            arrayList.add(randomAccessOf);
                        }
                        i5++;
                        iWireman = i2;
                    }
                }
            }
            i3++;
            attabalVar3 = attabalVar;
            iWireman = iWireman;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((taiyuan) list.get(i8)).f28311monoploid;
        }
        taiyuan taiyuanVar = (taiyuan) list.get(0);
        return Pair.create(new rotuma.attabal(taiyuanVar.f28309arytenoidectomy, iArr2), Integer.valueOf(taiyuanVar.f28310kowloon));
    }

    @Override // hydromechanics.trm
    public boolean competently() {
        return true;
    }

    public Pair<rotuma.attabal, Integer> dent(cord.attabal attabalVar, int[][][] iArr, final int[] iArr2, final marial marialVar) throws ExoPlaybackException {
        if (marialVar.f11030molybdenite.f11072attabal == 2) {
            return null;
        }
        return clubfoot(2, attabalVar, iArr, new taiyuan.attabal() { // from class: hydromechanics.taiyuan
            @Override // hydromechanics.triweekly.taiyuan.attabal
            public final List attabal(int i, yemenite yemeniteVar, int[] iArr3) {
                return triweekly.cutely.formularize(i, yemeniteVar, marialVar, iArr3, iArr2[i]);
            }
        }, new Comparator() { // from class: hydromechanics.cutely
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return triweekly.cutely.apical((List) obj, (List) obj2);
            }
        });
    }

    @Override // hydromechanics.cord
    public final Pair<libyan[], rotuma[]> kowloon(cord.attabal attabalVar, int[][][] iArr, int[] iArr2, androidx.media3.exoplayer.source.formularize.saneness sanenessVar, androidx.media3.common.oilcan oilcanVar) throws ExoPlaybackException {
        marial marialVar;
        competently competentlyVar;
        synchronized (this.f28196wireman) {
            try {
                marialVar = this.f28193impromptu;
                if (marialVar.f28260gusty && grimness.f25080attabal >= 32 && (competentlyVar = this.f28195taiyuan) != null) {
                    competentlyVar.saneness(this, (Looper) decarock.attabal.taiyuan(Looper.myLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int iWireman = attabalVar.wireman();
        rotuma.attabal[] attabalVarArrWalach = walach(attabalVar, iArr, iArr2, marialVar);
        trm(attabalVar, marialVar, attabalVarArrWalach);
        stratoscope(attabalVar, marialVar, attabalVarArrWalach);
        for (int i = 0; i < iWireman; i++) {
            int iMarial = attabalVar.marial(i);
            if (marialVar.impromptu(i) || marialVar.f11036stratoscope.contains(Integer.valueOf(iMarial))) {
                attabalVarArrWalach[i] = null;
            }
        }
        rotuma[] rotumaVarArrAttabal = this.f28190beachfront.attabal(attabalVarArrWalach, saneness(), sanenessVar, oilcanVar);
        libyan[] libyanVarArr = new libyan[iWireman];
        for (int i2 = 0; i2 < iWireman; i2++) {
            libyanVarArr[i2] = (marialVar.impromptu(i2) || marialVar.f11036stratoscope.contains(Integer.valueOf(attabalVar.marial(i2))) || (attabalVar.marial(i2) != -2 && rotumaVarArrAttabal[i2] == null)) ? null : libyan.f11958dern;
        }
        if (marialVar.f28266palmyra) {
            grimness(attabalVar, iArr, libyanVarArr, rotumaVarArrAttabal);
        }
        if (marialVar.f11030molybdenite.f11072attabal != 0) {
            seminary(marialVar, attabalVar, iArr, libyanVarArr, rotumaVarArrAttabal);
        }
        return Pair.create(libyanVarArr, rotumaVarArrAttabal);
    }

    public Pair<rotuma.attabal, Integer> mathsort(cord.attabal attabalVar, int[][][] iArr, final marial marialVar) throws ExoPlaybackException {
        if (marialVar.f11030molybdenite.f11072attabal == 2) {
            return null;
        }
        return clubfoot(4, attabalVar, iArr, new taiyuan.attabal() { // from class: hydromechanics.marial
            @Override // hydromechanics.triweekly.taiyuan.attabal
            public final List attabal(int i, yemenite yemeniteVar, int[] iArr2) {
                return triweekly.dern.taiyuan(i, yemeniteVar, marialVar, iArr2);
            }
        }, new Comparator() { // from class: hydromechanics.beachfront
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return triweekly.dern.wireman((List) obj, (List) obj2);
            }
        });
    }

    public final boolean merc(androidx.media3.common.polloi polloiVar) {
        boolean z;
        competently competentlyVar;
        competently competentlyVar2;
        synchronized (this.f28196wireman) {
            try {
                if (this.f28193impromptu.f28260gusty && !this.f28191competently && polloiVar.f11215stratoscope > 2 && (!polder(polloiVar) || (grimness.f25080attabal >= 32 && (competentlyVar2 = this.f28195taiyuan) != null && competentlyVar2.marial()))) {
                    z = grimness.f25080attabal >= 32 && (competentlyVar = this.f28195taiyuan) != null && competentlyVar.marial() && this.f28195taiyuan.dern() && this.f28195taiyuan.wireman() && this.f28195taiyuan.attabal(this.f28192cutely, polloiVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public Pair<rotuma.attabal, Integer> overspeculate(cord.attabal attabalVar, int[][][] iArr, final marial marialVar, final String str) throws ExoPlaybackException {
        if (marialVar.f11030molybdenite.f11072attabal == 2) {
            return null;
        }
        return clubfoot(3, attabalVar, iArr, new taiyuan.attabal() { // from class: hydromechanics.apical
            @Override // hydromechanics.triweekly.taiyuan.attabal
            public final List attabal(int i, yemenite yemeniteVar, int[] iArr2) {
                return triweekly.impromptu.taiyuan(i, yemeniteVar, marialVar, iArr2, str);
            }
        }, new Comparator() { // from class: hydromechanics.formularize
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return triweekly.impromptu.wireman((List) obj, (List) obj2);
            }
        });
    }

    public Pair<rotuma.attabal, Integer> peridotite(cord.attabal attabalVar, int[][][] iArr, final int[] iArr2, final marial marialVar) throws ExoPlaybackException {
        final boolean z = false;
        for (int i = 0; i < attabalVar.wireman(); i++) {
            if (2 == attabalVar.marial(i) && attabalVar.beachfront(i).f26059attabal > 0) {
                z = true;
                break;
            }
        }
        return clubfoot(1, attabalVar, iArr, new taiyuan.attabal() { // from class: hydromechanics.competently
            @Override // hydromechanics.triweekly.taiyuan.attabal
            public final List attabal(int i2, yemenite yemeniteVar, int[] iArr3) {
                return triweekly.polloi(this.f28156attabal, marialVar, z, iArr2, i2, yemeniteVar, iArr3);
            }
        }, new Comparator() { // from class: hydromechanics.impromptu
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return triweekly.saneness.wireman((List) obj, (List) obj2);
            }
        });
    }

    public final void privatdozent(homozygous homozygousVar) {
        boolean z;
        synchronized (this.f28196wireman) {
            z = this.f28193impromptu.f28265monroe;
        }
        if (z) {
            beachfront(homozygousVar);
        }
    }

    public final void saran() {
        boolean z;
        competently competentlyVar;
        synchronized (this.f28196wireman) {
            try {
                z = this.f28193impromptu.f28260gusty && !this.f28191competently && grimness.f25080attabal >= 32 && (competentlyVar = this.f28195taiyuan) != null && competentlyVar.marial();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            marial();
        }
    }

    public rotuma.attabal splinterproof(int i, restrictive restrictiveVar, int[][] iArr, marial marialVar) throws ExoPlaybackException {
        if (marialVar.f11030molybdenite.f11072attabal == 2) {
            return null;
        }
        int i2 = 0;
        yemenite yemeniteVar = null;
        wireman wiremanVar = null;
        for (int i3 = 0; i3 < restrictiveVar.f26059attabal; i3++) {
            yemenite yemeniteVarSaneness = restrictiveVar.saneness(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < yemeniteVarSaneness.f11332attabal; i4++) {
                if (lampshade.beachfront(iArr2[i4], marialVar.f28267picketboat)) {
                    wireman wiremanVar2 = new wireman(yemeniteVarSaneness.attabal(i4), iArr2[i4]);
                    if (wiremanVar == null || wiremanVar2.compareTo(wiremanVar) > 0) {
                        yemeniteVar = yemeniteVarSaneness;
                        i2 = i4;
                        wiremanVar = wiremanVar2;
                    }
                }
            }
        }
        if (yemeniteVar == null) {
            return null;
        }
        return new rotuma.attabal(yemeniteVar, i2);
    }

    @Override // hydromechanics.trm
    public void taiyuan() {
        competently competentlyVar;
        synchronized (this.f28196wireman) {
            try {
                if (grimness.f25080attabal >= 32 && (competentlyVar = this.f28195taiyuan) != null) {
                    competentlyVar.beachfront();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.taiyuan();
    }

    public rotuma.attabal[] walach(cord.attabal attabalVar, int[][][] iArr, int[] iArr2, marial marialVar) throws ExoPlaybackException {
        int iWireman = attabalVar.wireman();
        rotuma.attabal[] attabalVarArr = new rotuma.attabal[iWireman];
        Pair<rotuma.attabal, Integer> pairDent = dent(attabalVar, iArr, iArr2, marialVar);
        String str = null;
        Pair<rotuma.attabal, Integer> pairMathsort = (marialVar.f11034rotuma || pairDent == null) ? mathsort(attabalVar, iArr, marialVar) : null;
        if (pairMathsort != null) {
            attabalVarArr[((Integer) pairMathsort.second).intValue()] = (rotuma.attabal) pairMathsort.first;
        } else if (pairDent != null) {
            attabalVarArr[((Integer) pairDent.second).intValue()] = (rotuma.attabal) pairDent.first;
        }
        Pair<rotuma.attabal, Integer> pairPeridotite = peridotite(attabalVar, iArr, iArr2, marialVar);
        if (pairPeridotite != null) {
            attabalVarArr[((Integer) pairPeridotite.second).intValue()] = (rotuma.attabal) pairPeridotite.first;
        }
        if (pairPeridotite != null) {
            Object obj = pairPeridotite.first;
            str = ((rotuma.attabal) obj).f28184attabal.attabal(((rotuma.attabal) obj).f28186saneness[0]).f11220wireman;
        }
        Pair<rotuma.attabal, Integer> pairOverspeculate = overspeculate(attabalVar, iArr, marialVar, str);
        if (pairOverspeculate != null) {
            attabalVarArr[((Integer) pairOverspeculate.second).intValue()] = (rotuma.attabal) pairOverspeculate.first;
        }
        for (int i = 0; i < iWireman; i++) {
            int iMarial = attabalVar.marial(i);
            if (iMarial != 2 && iMarial != 1 && iMarial != 3 && iMarial != 4) {
                attabalVarArr[i] = splinterproof(iMarial, attabalVar.beachfront(i), iArr[i], marialVar);
            }
        }
        return attabalVarArr;
    }

    public triweekly(Context context, rotuma.saneness sanenessVar) {
        this(context, marial.competently(context), sanenessVar);
    }

    public triweekly(Context context, kattegat kattegatVar, rotuma.saneness sanenessVar) {
        this(kattegatVar, sanenessVar, context);
    }

    public triweekly(kattegat kattegatVar, rotuma.saneness sanenessVar, Context context) {
        this.f28196wireman = new Object();
        this.f28194marial = context != null ? context.getApplicationContext() : null;
        this.f28190beachfront = sanenessVar;
        if (kattegatVar instanceof marial) {
            this.f28193impromptu = (marial) kattegatVar;
        } else {
            this.f28193impromptu = (context == null ? marial.f28254unconsolidated : marial.competently(context)).beachfront().timberyard(kattegatVar).trm();
        }
        this.f28192cutely = androidx.media3.common.saneness.f11271competently;
        boolean z = context != null && grimness.unconsolidated(context);
        this.f28191competently = z;
        if (!z && context != null && grimness.f25080attabal >= 32) {
            this.f28195taiyuan = competently.competently(context);
        }
        if (this.f28193impromptu.f28260gusty && context == null) {
            decarock.triweekly.impromptu("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    @Override // hydromechanics.trm
    public lampshade.attabal dern() {
        return this;
    }
}
