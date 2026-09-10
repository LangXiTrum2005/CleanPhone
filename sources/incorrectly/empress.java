package incorrectly;

import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.ironsource.Z3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: DefaultAnalyticsCollector.java */
/* JADX INFO: loaded from: classes.dex */
public class empress implements incorrectly.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final decarock.wireman f28674attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public decarock.impassible<saneness> f28675beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public androidx.media3.common.cord f28676competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final androidx.media3.common.oilcan.dern f28677dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public decarock.cutely f28678impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final SparseArray<saneness.attabal> f28679marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final androidx.media3.common.oilcan.saneness f28680saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public boolean f28681taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final attabal f28682wireman;

    /* JADX INFO: compiled from: DefaultAnalyticsCollector.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final androidx.media3.common.oilcan.saneness f28683attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public androidx.media3.exoplayer.source.formularize.saneness f28684beachfront;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public androidx.media3.exoplayer.source.formularize.saneness f28686marial;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public androidx.media3.exoplayer.source.formularize.saneness f28688wireman;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public ImmutableList<androidx.media3.exoplayer.source.formularize.saneness> f28687saneness = ImmutableList.of();

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public ImmutableMap<androidx.media3.exoplayer.source.formularize.saneness, androidx.media3.common.oilcan> f28685dern = ImmutableMap.of();

        public attabal(androidx.media3.common.oilcan.saneness sanenessVar) {
            this.f28683attabal = sanenessVar;
        }

        public static androidx.media3.exoplayer.source.formularize.saneness dern(androidx.media3.common.cord cordVar, ImmutableList<androidx.media3.exoplayer.source.formularize.saneness> immutableList, androidx.media3.exoplayer.source.formularize.saneness sanenessVar, androidx.media3.common.oilcan.saneness sanenessVar2) {
            androidx.media3.common.oilcan currentTimeline = cordVar.getCurrentTimeline();
            int currentPeriodIndex = cordVar.getCurrentPeriodIndex();
            Object objImpassible = currentTimeline.monoploid() ? null : currentTimeline.impassible(currentPeriodIndex);
            int iWireman = (cordVar.isPlayingAd() || currentTimeline.monoploid()) ? -1 : currentTimeline.beachfront(currentPeriodIndex, sanenessVar2).wireman(decarock.grimness.outmarry(cordVar.getCurrentPosition()) - sanenessVar2.triweekly());
            for (int i = 0; i < immutableList.size(); i++) {
                androidx.media3.exoplayer.source.formularize.saneness sanenessVar3 = immutableList.get(i);
                if (taiyuan(sanenessVar3, objImpassible, cordVar.isPlayingAd(), cordVar.getCurrentAdGroupIndex(), cordVar.getCurrentAdIndexInAdGroup(), iWireman)) {
                    return sanenessVar3;
                }
            }
            if (immutableList.isEmpty() && sanenessVar != null && taiyuan(sanenessVar, objImpassible, cordVar.isPlayingAd(), cordVar.getCurrentAdGroupIndex(), cordVar.getCurrentAdIndexInAdGroup(), iWireman)) {
                return sanenessVar;
            }
            return null;
        }

        public static boolean taiyuan(androidx.media3.exoplayer.source.formularize.saneness sanenessVar, Object obj, boolean z, int i, int i2, int i3) {
            if (!sanenessVar.f12518attabal.equals(obj)) {
                return false;
            }
            if (z && sanenessVar.f12521saneness == i && sanenessVar.f12519dern == i2) {
                return true;
            }
            return !z && sanenessVar.f12521saneness == -1 && sanenessVar.f12520marial == i3;
        }

        public void apical(List<androidx.media3.exoplayer.source.formularize.saneness> list, androidx.media3.exoplayer.source.formularize.saneness sanenessVar, androidx.media3.common.cord cordVar) {
            this.f28687saneness = ImmutableList.copyOf((Collection) list);
            if (!list.isEmpty()) {
                this.f28686marial = list.get(0);
                this.f28684beachfront = (androidx.media3.exoplayer.source.formularize.saneness) decarock.attabal.marial(sanenessVar);
            }
            if (this.f28688wireman == null) {
                this.f28688wireman = dern(cordVar, this.f28687saneness, this.f28686marial, this.f28683attabal);
            }
            impassible(cordVar.getCurrentTimeline());
        }

        public androidx.media3.common.oilcan beachfront(androidx.media3.exoplayer.source.formularize.saneness sanenessVar) {
            return this.f28685dern.get(sanenessVar);
        }

        public androidx.media3.exoplayer.source.formularize.saneness competently() {
            return this.f28686marial;
        }

        public void cutely(androidx.media3.common.cord cordVar) {
            this.f28688wireman = dern(cordVar, this.f28687saneness, this.f28686marial, this.f28683attabal);
        }

        public void formularize(androidx.media3.common.cord cordVar) {
            this.f28688wireman = dern(cordVar, this.f28687saneness, this.f28686marial, this.f28683attabal);
            impassible(cordVar.getCurrentTimeline());
        }

        public final void impassible(androidx.media3.common.oilcan oilcanVar) {
            ImmutableMap.saneness<androidx.media3.exoplayer.source.formularize.saneness, androidx.media3.common.oilcan> sanenessVarBuilder = ImmutableMap.builder();
            if (this.f28687saneness.isEmpty()) {
                saneness(sanenessVarBuilder, this.f28686marial, oilcanVar);
                if (!com.google.common.base.taiyuan.attabal(this.f28684beachfront, this.f28686marial)) {
                    saneness(sanenessVarBuilder, this.f28684beachfront, oilcanVar);
                }
                if (!com.google.common.base.taiyuan.attabal(this.f28688wireman, this.f28686marial) && !com.google.common.base.taiyuan.attabal(this.f28688wireman, this.f28684beachfront)) {
                    saneness(sanenessVarBuilder, this.f28688wireman, oilcanVar);
                }
            } else {
                for (int i = 0; i < this.f28687saneness.size(); i++) {
                    saneness(sanenessVarBuilder, this.f28687saneness.get(i), oilcanVar);
                }
                if (!this.f28687saneness.contains(this.f28688wireman)) {
                    saneness(sanenessVarBuilder, this.f28688wireman, oilcanVar);
                }
            }
            this.f28685dern = sanenessVarBuilder.dern();
        }

        public androidx.media3.exoplayer.source.formularize.saneness impromptu() {
            return this.f28684beachfront;
        }

        public androidx.media3.exoplayer.source.formularize.saneness marial() {
            if (this.f28687saneness.isEmpty()) {
                return null;
            }
            return (androidx.media3.exoplayer.source.formularize.saneness) com.google.common.collect.achondroplasia.beachfront(this.f28687saneness);
        }

        public final void saneness(ImmutableMap.saneness<androidx.media3.exoplayer.source.formularize.saneness, androidx.media3.common.oilcan> sanenessVar, androidx.media3.exoplayer.source.formularize.saneness sanenessVar2, androidx.media3.common.oilcan oilcanVar) {
            if (sanenessVar2 == null) {
                return;
            }
            if (oilcanVar.saneness(sanenessVar2.f12518attabal) != -1) {
                sanenessVar.competently(sanenessVar2, oilcanVar);
                return;
            }
            androidx.media3.common.oilcan oilcanVar2 = this.f28685dern.get(sanenessVar2);
            if (oilcanVar2 != null) {
                sanenessVar.competently(sanenessVar2, oilcanVar2);
            }
        }

        public androidx.media3.exoplayer.source.formularize.saneness wireman() {
            return this.f28688wireman;
        }
    }

    public empress(decarock.wireman wiremanVar) {
        this.f28674attabal = (decarock.wireman) decarock.attabal.marial(wiremanVar);
        this.f28675beachfront = new decarock.impassible<>(decarock.grimness.hydrovane(), wiremanVar, new decarock.impassible.saneness() { // from class: incorrectly.adultoid
            @Override // decarock.impassible.saneness
            public final void attabal(Object obj, androidx.media3.common.kowloon kowloonVar) {
                empress.homozygous((saneness) obj, kowloonVar);
            }
        });
        androidx.media3.common.oilcan.saneness sanenessVar = new androidx.media3.common.oilcan.saneness();
        this.f28680saneness = sanenessVar;
        this.f28677dern = new androidx.media3.common.oilcan.dern();
        this.f28682wireman = new attabal(sanenessVar);
        this.f28679marial = new SparseArray<>();
    }

    public static /* synthetic */ void achondroplasia(saneness.attabal attabalVar, String str, long j, long j2, saneness sanenessVar) {
        sanenessVar.itchy(attabalVar, str, j);
        sanenessVar.cuirassed(attabalVar, str, j2, j);
    }

    public static /* synthetic */ void attendance(saneness.attabal attabalVar, int i, saneness sanenessVar) {
        sanenessVar.kowloon(attabalVar);
        sanenessVar.dent(attabalVar, i);
    }

    public static /* synthetic */ void grimness(saneness.attabal attabalVar, int i, androidx.media3.common.cord.marial marialVar, androidx.media3.common.cord.marial marialVar2, saneness sanenessVar) {
        sanenessVar.peridotite(attabalVar, i);
        sanenessVar.walach(attabalVar, marialVar, marialVar2, i);
    }

    public static /* synthetic */ void polder(saneness.attabal attabalVar, androidx.media3.common.polder polderVar, saneness sanenessVar) {
        sanenessVar.clubfoot(attabalVar, polderVar);
        sanenessVar.yemenite(attabalVar, polderVar.f11146attabal, polderVar.f11148saneness, polderVar.f11147dern, polderVar.f11149wireman);
    }

    public static /* synthetic */ void sayid(saneness.attabal attabalVar, boolean z, saneness sanenessVar) {
        sanenessVar.triweekly(attabalVar, z);
        sanenessVar.seminary(attabalVar, z);
    }

    public static /* synthetic */ void seminary(saneness.attabal attabalVar, String str, long j, long j2, saneness sanenessVar) {
        sanenessVar.graveside(attabalVar, str, j);
        sanenessVar.splinterproof(attabalVar, str, j2, j);
    }

    @Override // androidx.media3.exoplayer.drm.saneness
    public final void adultoid(int i, androidx.media3.exoplayer.source.formularize.saneness sanenessVar) {
        final saneness.attabal attabalVarPrefect = prefect(i, sanenessVar);
        cosy(attabalVarPrefect, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, new decarock.impassible.attabal() { // from class: incorrectly.treadless
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).czestochowa(attabalVarPrefect);
            }
        });
    }

    @Override // incorrectly.attabal
    public final void apical(final androidx.media3.exoplayer.kowloon kowloonVar) {
        final saneness.attabal attabalVarOsteal = osteal();
        cosy(attabalVarOsteal, Z3.i, new decarock.impassible.attabal() { // from class: incorrectly.rotuma
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).sensatory(attabalVarOsteal, kowloonVar);
            }
        });
    }

    @Override // incorrectly.attabal
    public final void arytenoidectomy(final int i, final long j, final long j2) {
        final saneness.attabal attabalVarLicking = licking();
        cosy(attabalVarLicking, 1011, new decarock.impassible.attabal() { // from class: incorrectly.creditor
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).starveling(attabalVarLicking, i, j, j2);
            }
        });
    }

    @Override // incorrectly.attabal
    public void attabal(final AudioSink.attabal attabalVar) {
        final saneness.attabal attabalVarLicking = licking();
        cosy(attabalVarLicking, IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID, new decarock.impassible.attabal() { // from class: incorrectly.timberyard
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).formularize(attabalVarLicking, attabalVar);
            }
        });
    }

    public final saneness.attabal basify(androidx.media3.exoplayer.source.formularize.saneness sanenessVar) {
        decarock.attabal.marial(this.f28676competently);
        androidx.media3.common.oilcan oilcanVarBeachfront = sanenessVar == null ? null : this.f28682wireman.beachfront(sanenessVar);
        if (sanenessVar != null && oilcanVarBeachfront != null) {
            return immediately(oilcanVarBeachfront, oilcanVarBeachfront.impromptu(sanenessVar.f12518attabal, this.f28680saneness).f11137dern, sanenessVar);
        }
        int iArytenoidectomy = this.f28676competently.arytenoidectomy();
        androidx.media3.common.oilcan currentTimeline = this.f28676competently.getCurrentTimeline();
        if (iArytenoidectomy >= currentTimeline.arytenoidectomy()) {
            currentTimeline = androidx.media3.common.oilcan.f11093attabal;
        }
        return immediately(currentTimeline, iArytenoidectomy, null);
    }

    @Override // incorrectly.attabal
    public final void beachfront(final androidx.media3.exoplayer.kowloon kowloonVar) {
        final saneness.attabal attabalVarLicking = licking();
        cosy(attabalVarLicking, 1007, new decarock.impassible.attabal() { // from class: incorrectly.itchy
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).arytenoidectomy(attabalVarLicking, kowloonVar);
            }
        });
    }

    @Override // incorrectly.attabal
    public final void competently(final androidx.media3.exoplayer.kowloon kowloonVar) {
        final saneness.attabal attabalVarLicking = licking();
        cosy(attabalVarLicking, 1015, new decarock.impassible.attabal() { // from class: incorrectly.sealless
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).nosophobia(attabalVarLicking, kowloonVar);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.saneness
    public final void cord(int i, androidx.media3.exoplayer.source.formularize.saneness sanenessVar) {
        final saneness.attabal attabalVarPrefect = prefect(i, sanenessVar);
        cosy(attabalVarPrefect, IronSourceError.ERROR_RV_LOAD_DURING_LOAD, new decarock.impassible.attabal() { // from class: incorrectly.premeiotic
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).impassible(attabalVarPrefect);
            }
        });
    }

    public final void cosy(saneness.attabal attabalVar, int i, decarock.impassible.attabal<saneness> attabalVar2) {
        this.f28679marial.put(i, attabalVar);
        this.f28675beachfront.apical(i, attabalVar2);
    }

    @Override // androidx.media3.exoplayer.drm.saneness
    public final void cuirassed(int i, androidx.media3.exoplayer.source.formularize.saneness sanenessVar, final Exception exc) {
        final saneness.attabal attabalVarPrefect = prefect(i, sanenessVar);
        cosy(attabalVarPrefect, 1024, new decarock.impassible.attabal() { // from class: incorrectly.peridotite
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).molybdenite(attabalVarPrefect, exc);
            }
        });
    }

    @Override // incorrectly.attabal
    public final void cutely(final Exception exc) {
        final saneness.attabal attabalVarLicking = licking();
        cosy(attabalVarLicking, IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, new decarock.impassible.attabal() { // from class: incorrectly.beachfront
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).attabal(attabalVarLicking, exc);
            }
        });
    }

    @Override // incorrectly.attabal
    public final void dern(final Exception exc) {
        final saneness.attabal attabalVarLicking = licking();
        cosy(attabalVarLicking, Z3.j, new decarock.impassible.attabal() { // from class: incorrectly.polder
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).grimness(attabalVarLicking, exc);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.impassible
    public final void dovishness(int i, androidx.media3.exoplayer.source.formularize.saneness sanenessVar, final ethene.arytenoidectomy arytenoidectomyVar) {
        final saneness.attabal attabalVarPrefect = prefect(i, sanenessVar);
        cosy(attabalVarPrefect, 1004, new decarock.impassible.attabal() { // from class: incorrectly.grimness
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).dovishness(attabalVarPrefect, arytenoidectomyVar);
            }
        });
    }

    public final void fastrack() {
        final saneness.attabal attabalVarSakeen = sakeen();
        cosy(attabalVarSakeen, IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, new decarock.impassible.attabal() { // from class: incorrectly.saran
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).kattegat(attabalVarSakeen);
            }
        });
        this.f28675beachfront.taiyuan();
    }

    @Override // incorrectly.attabal
    public final void formularize(final Object obj, final long j) {
        final saneness.attabal attabalVarLicking = licking();
        cosy(attabalVarLicking, 26, new decarock.impassible.attabal() { // from class: incorrectly.clubfoot
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj2) {
                ((saneness) obj2).sayid(attabalVarLicking, obj, j);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.saneness
    public final void gintrap(int i, androidx.media3.exoplayer.source.formularize.saneness sanenessVar, final int i2) {
        final saneness.attabal attabalVarPrefect = prefect(i, sanenessVar);
        cosy(attabalVarPrefect, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, new decarock.impassible.attabal() { // from class: incorrectly.walach
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                empress.attendance(attabalVarPrefect, i2, (saneness) obj);
            }
        });
    }

    @Override // incorrectly.attabal
    public final void graveside() {
        if (this.f28681taiyuan) {
            return;
        }
        final saneness.attabal attabalVarSakeen = sakeen();
        this.f28681taiyuan = true;
        cosy(attabalVarSakeen, -1, new decarock.impassible.attabal() { // from class: incorrectly.trm
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).monoploid(attabalVarSakeen);
            }
        });
    }

    @RequiresNonNull({"player"})
    public final saneness.attabal immediately(androidx.media3.common.oilcan oilcanVar, int i, androidx.media3.exoplayer.source.formularize.saneness sanenessVar) {
        androidx.media3.exoplayer.source.formularize.saneness sanenessVar2 = oilcanVar.monoploid() ? null : sanenessVar;
        long jElapsedRealtime = this.f28674attabal.elapsedRealtime();
        boolean z = oilcanVar.equals(this.f28676competently.getCurrentTimeline()) && i == this.f28676competently.arytenoidectomy();
        long jSaneness = 0;
        if (sanenessVar2 == null || !sanenessVar2.saneness()) {
            if (z) {
                jSaneness = this.f28676competently.getContentPosition();
            } else if (!oilcanVar.monoploid()) {
                jSaneness = oilcanVar.triweekly(i, this.f28677dern).saneness();
            }
        } else if (z && this.f28676competently.getCurrentAdGroupIndex() == sanenessVar2.f12521saneness && this.f28676competently.getCurrentAdIndexInAdGroup() == sanenessVar2.f12519dern) {
            jSaneness = this.f28676competently.getCurrentPosition();
        }
        return new saneness.attabal(jElapsedRealtime, oilcanVar, i, sanenessVar2, jSaneness, this.f28676competently.getCurrentTimeline(), this.f28676competently.arytenoidectomy(), this.f28682wireman.wireman(), this.f28676competently.getCurrentPosition(), this.f28676competently.saneness());
    }

    @Override // incorrectly.attabal
    public final void impassible(final androidx.media3.common.polloi polloiVar, final androidx.media3.exoplayer.arytenoidectomy arytenoidectomyVar) {
        final saneness.attabal attabalVarLicking = licking();
        cosy(attabalVarLicking, 1017, new decarock.impassible.attabal() { // from class: incorrectly.stratoscope
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).permissivist(attabalVarLicking, polloiVar, arytenoidectomyVar);
            }
        });
    }

    @Override // incorrectly.attabal
    public final void impromptu(final long j) {
        final saneness.attabal attabalVarLicking = licking();
        cosy(attabalVarLicking, 1010, new decarock.impassible.attabal() { // from class: incorrectly.cutely
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).lerp(attabalVarLicking, j);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.impassible
    public final void kattegat(int i, androidx.media3.exoplayer.source.formularize.saneness sanenessVar, final ethene.kowloon kowloonVar, final ethene.arytenoidectomy arytenoidectomyVar) {
        final saneness.attabal attabalVarPrefect = prefect(i, sanenessVar);
        cosy(attabalVarPrefect, 1000, new decarock.impassible.attabal() { // from class: incorrectly.privatdozent
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).cord(attabalVarPrefect, kowloonVar, arytenoidectomyVar);
            }
        });
    }

    @Override // incorrectly.attabal
    public final void kowloon(final Exception exc) {
        final saneness.attabal attabalVarLicking = licking();
        cosy(attabalVarLicking, IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID, new decarock.impassible.attabal() { // from class: incorrectly.supplicat
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).saran(attabalVarLicking, exc);
            }
        });
    }

    public final saneness.attabal licking() {
        return basify(this.f28682wireman.impromptu());
    }

    @Override // incorrectly.attabal
    public final void marial(final String str) {
        final saneness.attabal attabalVarLicking = licking();
        cosy(attabalVarLicking, TTAdConstant.IMAGE_MODE_1012, new decarock.impassible.attabal() { // from class: incorrectly.nosophobia
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).dern(attabalVarLicking, str);
            }
        });
    }

    public final saneness.attabal microchemistry(PlaybackException playbackException) {
        androidx.media3.exoplayer.source.formularize.saneness sanenessVar;
        return (!(playbackException instanceof ExoPlaybackException) || (sanenessVar = ((ExoPlaybackException) playbackException).mediaPeriodId) == null) ? sakeen() : basify(sanenessVar);
    }

    @Override // androidx.media3.exoplayer.source.impassible
    public final void molybdenite(int i, androidx.media3.exoplayer.source.formularize.saneness sanenessVar, final ethene.kowloon kowloonVar, final ethene.arytenoidectomy arytenoidectomyVar, final IOException iOException, final boolean z) {
        final saneness.attabal attabalVarPrefect = prefect(i, sanenessVar);
        cosy(attabalVarPrefect, 1003, new decarock.impassible.attabal() { // from class: incorrectly.starveling
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).impromptu(attabalVarPrefect, kowloonVar, arytenoidectomyVar, iOException, z);
            }
        });
    }

    @Override // incorrectly.attabal
    public final void monoploid(final long j, final int i) {
        final saneness.attabal attabalVarOsteal = osteal();
        cosy(attabalVarOsteal, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, new decarock.impassible.attabal() { // from class: incorrectly.dovishness
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).supplicat(attabalVarOsteal, j, i);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.impassible
    public final void oilcan(int i, androidx.media3.exoplayer.source.formularize.saneness sanenessVar, final ethene.kowloon kowloonVar, final ethene.arytenoidectomy arytenoidectomyVar) {
        final saneness.attabal attabalVarPrefect = prefect(i, sanenessVar);
        cosy(attabalVarPrefect, 1002, new decarock.impassible.attabal() { // from class: incorrectly.hydrovane
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).milliradian(attabalVarPrefect, kowloonVar, arytenoidectomyVar);
            }
        });
    }

    @Override // incorrectly.attabal
    public final void onAudioDecoderInitialized(final String str, final long j, final long j2) {
        final saneness.attabal attabalVarLicking = licking();
        cosy(attabalVarLicking, 1008, new decarock.impassible.attabal() { // from class: incorrectly.formularize
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                empress.achondroplasia(attabalVarLicking, str, j2, j, (saneness) obj);
            }
        });
    }

    @Override // androidx.media3.common.cord.wireman
    public void onAvailableCommandsChanged(final androidx.media3.common.cord.saneness sanenessVar) {
        final saneness.attabal attabalVarSakeen = sakeen();
        cosy(attabalVarSakeen, 13, new decarock.impassible.attabal() { // from class: incorrectly.lotta
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).polder(attabalVarSakeen, sanenessVar);
            }
        });
    }

    @Override // polyfoil.wireman.attabal
    public final void onBandwidthSample(final int i, final long j, final long j2) {
        final saneness.attabal attabalVarTectonization = tectonization();
        cosy(attabalVarTectonization, 1006, new decarock.impassible.attabal() { // from class: incorrectly.permissivist
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).privatdozent(attabalVarTectonization, i, j, j2);
            }
        });
    }

    @Override // androidx.media3.common.cord.wireman
    public void onCues(final List<libya.attabal> list) {
        final saneness.attabal attabalVarSakeen = sakeen();
        cosy(attabalVarSakeen, 27, new decarock.impassible.attabal() { // from class: incorrectly.graveside
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).merc(attabalVarSakeen, list);
            }
        });
    }

    @Override // androidx.media3.common.cord.wireman
    public void onDeviceInfoChanged(final androidx.media3.common.formularize formularizeVar) {
        final saneness.attabal attabalVarSakeen = sakeen();
        cosy(attabalVarSakeen, 29, new decarock.impassible.attabal() { // from class: incorrectly.cuirassed
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).cutely(attabalVarSakeen, formularizeVar);
            }
        });
    }

    @Override // androidx.media3.common.cord.wireman
    public void onDeviceVolumeChanged(final int i, final boolean z) {
        final saneness.attabal attabalVarSakeen = sakeen();
        cosy(attabalVarSakeen, 30, new decarock.impassible.attabal() { // from class: incorrectly.polloi
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).apical(attabalVarSakeen, i, z);
            }
        });
    }

    @Override // incorrectly.attabal
    public final void onDroppedFrames(final int i, final long j) {
        final saneness.attabal attabalVarOsteal = osteal();
        cosy(attabalVarOsteal, 1018, new decarock.impassible.attabal() { // from class: incorrectly.arytenoidectomy
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).lotta(attabalVarOsteal, i, j);
            }
        });
    }

    @Override // androidx.media3.common.cord.wireman
    public final void onIsLoadingChanged(final boolean z) {
        final saneness.attabal attabalVarSakeen = sakeen();
        cosy(attabalVarSakeen, 3, new decarock.impassible.attabal() { // from class: incorrectly.lerp
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                empress.sayid(attabalVarSakeen, z, (saneness) obj);
            }
        });
    }

    @Override // androidx.media3.common.cord.wireman
    public void onIsPlayingChanged(final boolean z) {
        final saneness.attabal attabalVarSakeen = sakeen();
        cosy(attabalVarSakeen, 7, new decarock.impassible.attabal() { // from class: incorrectly.apical
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).trm(attabalVarSakeen, z);
            }
        });
    }

    @Override // androidx.media3.common.cord.wireman
    public final void onMediaItemTransition(final androidx.media3.common.adultoid adultoidVar, final int i) {
        final saneness.attabal attabalVarSakeen = sakeen();
        cosy(attabalVarSakeen, 1, new decarock.impassible.attabal() { // from class: incorrectly.wireman
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).adultoid(attabalVarSakeen, adultoidVar, i);
            }
        });
    }

    @Override // androidx.media3.common.cord.wireman
    public void onMediaMetadataChanged(final androidx.media3.common.gintrap gintrapVar) {
        final saneness.attabal attabalVarSakeen = sakeen();
        cosy(attabalVarSakeen, 14, new decarock.impassible.attabal() { // from class: incorrectly.mathsort
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).coi(attabalVarSakeen, gintrapVar);
            }
        });
    }

    @Override // androidx.media3.common.cord.wireman
    public final void onMetadata(final Metadata metadata) {
        final saneness.attabal attabalVarSakeen = sakeen();
        cosy(attabalVarSakeen, 28, new decarock.impassible.attabal() { // from class: incorrectly.taiyuan
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).restrictive(attabalVarSakeen, metadata);
            }
        });
    }

    @Override // androidx.media3.common.cord.wireman
    public final void onPlayWhenReadyChanged(final boolean z, final int i) {
        final saneness.attabal attabalVarSakeen = sakeen();
        cosy(attabalVarSakeen, 5, new decarock.impassible.attabal() { // from class: incorrectly.molybdenite
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).treadless(attabalVarSakeen, z, i);
            }
        });
    }

    @Override // androidx.media3.common.cord.wireman
    public final void onPlaybackParametersChanged(final androidx.media3.common.preprohormone preprohormoneVar) {
        final saneness.attabal attabalVarSakeen = sakeen();
        cosy(attabalVarSakeen, 12, new decarock.impassible.attabal() { // from class: incorrectly.dern
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).marial(attabalVarSakeen, preprohormoneVar);
            }
        });
    }

    @Override // androidx.media3.common.cord.wireman
    public final void onPlaybackStateChanged(final int i) {
        final saneness.attabal attabalVarSakeen = sakeen();
        cosy(attabalVarSakeen, 4, new decarock.impassible.attabal() { // from class: incorrectly.cord
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).saneness(attabalVarSakeen, i);
            }
        });
    }

    @Override // androidx.media3.common.cord.wireman
    public final void onPlaybackSuppressionReasonChanged(final int i) {
        final saneness.attabal attabalVarSakeen = sakeen();
        cosy(attabalVarSakeen, 6, new decarock.impassible.attabal() { // from class: incorrectly.impassible
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).taiyuan(attabalVarSakeen, i);
            }
        });
    }

    @Override // androidx.media3.common.cord.wireman
    public final void onPlayerError(final PlaybackException playbackException) {
        final saneness.attabal attabalVarMicrochemistry = microchemistry(playbackException);
        cosy(attabalVarMicrochemistry, 10, new decarock.impassible.attabal() { // from class: incorrectly.gintrap
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).timberyard(attabalVarMicrochemistry, playbackException);
            }
        });
    }

    @Override // androidx.media3.common.cord.wireman
    public void onPlayerErrorChanged(final PlaybackException playbackException) {
        final saneness.attabal attabalVarMicrochemistry = microchemistry(playbackException);
        cosy(attabalVarMicrochemistry, 10, new decarock.impassible.attabal() { // from class: incorrectly.monoploid
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).gintrap(attabalVarMicrochemistry, playbackException);
            }
        });
    }

    @Override // androidx.media3.common.cord.wireman
    public final void onPlayerStateChanged(final boolean z, final int i) {
        final saneness.attabal attabalVarSakeen = sakeen();
        cosy(attabalVarSakeen, -1, new decarock.impassible.attabal() { // from class: incorrectly.impromptu
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).cultivated(attabalVarSakeen, z, i);
            }
        });
    }

    @Override // androidx.media3.common.cord.wireman
    public void onPositionDiscontinuity(int i) {
    }

    @Override // androidx.media3.common.cord.wireman
    public final void onSkipSilenceEnabledChanged(final boolean z) {
        final saneness.attabal attabalVarLicking = licking();
        cosy(attabalVarLicking, 23, new decarock.impassible.attabal() { // from class: incorrectly.cultivated
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).creditor(attabalVarLicking, z);
            }
        });
    }

    @Override // androidx.media3.common.cord.wireman
    public final void onSurfaceSizeChanged(final int i, final int i2) {
        final saneness.attabal attabalVarLicking = licking();
        cosy(attabalVarLicking, 24, new decarock.impassible.attabal() { // from class: incorrectly.seminary
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).oilcan(attabalVarLicking, i, i2);
            }
        });
    }

    @Override // androidx.media3.common.cord.wireman
    public final void onTimelineChanged(androidx.media3.common.oilcan oilcanVar, final int i) {
        this.f28682wireman.formularize((androidx.media3.common.cord) decarock.attabal.marial(this.f28676competently));
        final saneness.attabal attabalVarSakeen = sakeen();
        cosy(attabalVarSakeen, 0, new decarock.impassible.attabal() { // from class: incorrectly.sayid
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).preterite(attabalVarSakeen, i);
            }
        });
    }

    @Override // androidx.media3.common.cord.wireman
    public void onTracksChanged(final androidx.media3.common.supplicat supplicatVar) {
        final saneness.attabal attabalVarSakeen = sakeen();
        cosy(attabalVarSakeen, 2, new decarock.impassible.attabal() { // from class: incorrectly.triweekly
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).rotuma(attabalVarSakeen, supplicatVar);
            }
        });
    }

    @Override // incorrectly.attabal
    public final void onVideoDecoderInitialized(final String str, final long j, final long j2) {
        final saneness.attabal attabalVarLicking = licking();
        cosy(attabalVarLicking, Z3.l, new decarock.impassible.attabal() { // from class: incorrectly.restrictive
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                empress.seminary(attabalVarLicking, str, j2, j, (saneness) obj);
            }
        });
    }

    @Override // androidx.media3.common.cord.wireman
    public final void onVideoSizeChanged(final androidx.media3.common.polder polderVar) {
        final saneness.attabal attabalVarLicking = licking();
        cosy(attabalVarLicking, 25, new decarock.impassible.attabal() { // from class: incorrectly.overspeculate
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                empress.polder(attabalVarLicking, polderVar, (saneness) obj);
            }
        });
    }

    @Override // androidx.media3.common.cord.wireman
    public final void onVolumeChanged(final float f) {
        final saneness.attabal attabalVarLicking = licking();
        cosy(attabalVarLicking, 22, new decarock.impassible.attabal() { // from class: incorrectly.marial
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).coffeecake(attabalVarLicking, f);
            }
        });
    }

    public final saneness.attabal osteal() {
        return basify(this.f28682wireman.competently());
    }

    @Override // incorrectly.attabal
    public final void polloi(List<androidx.media3.exoplayer.source.formularize.saneness> list, androidx.media3.exoplayer.source.formularize.saneness sanenessVar) {
        this.f28682wireman.apical(list, sanenessVar, (androidx.media3.common.cord) decarock.attabal.marial(this.f28676competently));
    }

    public final saneness.attabal prefect(int i, androidx.media3.exoplayer.source.formularize.saneness sanenessVar) {
        decarock.attabal.marial(this.f28676competently);
        if (sanenessVar != null) {
            return this.f28682wireman.beachfront(sanenessVar) != null ? basify(sanenessVar) : immediately(androidx.media3.common.oilcan.f11093attabal, i, sanenessVar);
        }
        androidx.media3.common.oilcan currentTimeline = this.f28676competently.getCurrentTimeline();
        if (i >= currentTimeline.arytenoidectomy()) {
            currentTimeline = androidx.media3.common.oilcan.f11093attabal;
        }
        return immediately(currentTimeline, i, null);
    }

    @Override // incorrectly.attabal
    public void release() {
        ((decarock.cutely) decarock.attabal.taiyuan(this.f28678impromptu)).post(new Runnable() { // from class: incorrectly.kattegat
            @Override // java.lang.Runnable
            public final void run() {
                this.f28741kowloon.fastrack();
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.impassible
    public final void rotuma(int i, androidx.media3.exoplayer.source.formularize.saneness sanenessVar, final ethene.kowloon kowloonVar, final ethene.arytenoidectomy arytenoidectomyVar) {
        final saneness.attabal attabalVarPrefect = prefect(i, sanenessVar);
        cosy(attabalVarPrefect, 1001, new decarock.impassible.attabal() { // from class: incorrectly.splinterproof
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).empress(attabalVarPrefect, kowloonVar, arytenoidectomyVar);
            }
        });
    }

    public final saneness.attabal sakeen() {
        return basify(this.f28682wireman.wireman());
    }

    @Override // incorrectly.attabal
    public void saneness(final AudioSink.attabal attabalVar) {
        final saneness.attabal attabalVarLicking = licking();
        cosy(attabalVarLicking, IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT, new decarock.impassible.attabal() { // from class: incorrectly.coffeecake
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).wireman(attabalVarLicking, attabalVar);
            }
        });
    }

    @Override // incorrectly.attabal
    public void sealless(final androidx.media3.common.cord cordVar, Looper looper) {
        decarock.attabal.competently(this.f28676competently == null || this.f28682wireman.f28687saneness.isEmpty());
        this.f28676competently = (androidx.media3.common.cord) decarock.attabal.marial(cordVar);
        this.f28678impromptu = this.f28674attabal.createHandler(looper, null);
        this.f28675beachfront = this.f28675beachfront.marial(looper, new decarock.impassible.saneness() { // from class: incorrectly.competently
            @Override // decarock.impassible.saneness
            public final void attabal(Object obj, androidx.media3.common.kowloon kowloonVar) {
                saneness sanenessVar = (saneness) obj;
                sanenessVar.underbelly(cordVar, new saneness.C0651saneness(kowloonVar, this.f28632attabal.f28679marial));
            }
        });
    }

    @Override // incorrectly.attabal
    public void stratoscope(saneness sanenessVar) {
        decarock.attabal.marial(sanenessVar);
        this.f28675beachfront.dern(sanenessVar);
    }

    @Override // incorrectly.attabal
    public final void taiyuan(final androidx.media3.common.polloi polloiVar, final androidx.media3.exoplayer.arytenoidectomy arytenoidectomyVar) {
        final saneness.attabal attabalVarLicking = licking();
        cosy(attabalVarLicking, 1009, new decarock.impassible.attabal() { // from class: incorrectly.oilcan
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).stratoscope(attabalVarLicking, polloiVar, arytenoidectomyVar);
            }
        });
    }

    public final saneness.attabal tectonization() {
        return basify(this.f28682wireman.marial());
    }

    @Override // incorrectly.attabal
    public final void triweekly(final androidx.media3.exoplayer.kowloon kowloonVar) {
        final saneness.attabal attabalVarOsteal = osteal();
        cosy(attabalVarOsteal, 1020, new decarock.impassible.attabal() { // from class: incorrectly.preprohormone
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).preprohormone(attabalVarOsteal, kowloonVar);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.saneness
    public final void trm(int i, androidx.media3.exoplayer.source.formularize.saneness sanenessVar) {
        final saneness.attabal attabalVarPrefect = prefect(i, sanenessVar);
        cosy(attabalVarPrefect, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, new decarock.impassible.attabal() { // from class: incorrectly.milliradian
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).overspeculate(attabalVarPrefect);
            }
        });
    }

    @Override // incorrectly.attabal
    public final void wireman(final String str) {
        final saneness.attabal attabalVarLicking = licking();
        cosy(attabalVarLicking, 1019, new decarock.impassible.attabal() { // from class: incorrectly.kowloon
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).polloi(attabalVarLicking, str);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.saneness
    public final void yemenite(int i, androidx.media3.exoplayer.source.formularize.saneness sanenessVar) {
        final saneness.attabal attabalVarPrefect = prefect(i, sanenessVar);
        cosy(attabalVarPrefect, IronSourceError.ERROR_RV_LOAD_DURING_SHOW, new decarock.impassible.attabal() { // from class: incorrectly.dent
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).mathsort(attabalVarPrefect);
            }
        });
    }

    @Override // androidx.media3.common.cord.wireman
    public final void onPositionDiscontinuity(final androidx.media3.common.cord.marial marialVar, final androidx.media3.common.cord.marial marialVar2, final int i) {
        if (i == 1) {
            this.f28681taiyuan = false;
        }
        this.f28682wireman.cutely((androidx.media3.common.cord) decarock.attabal.marial(this.f28676competently));
        final saneness.attabal attabalVarSakeen = sakeen();
        cosy(attabalVarSakeen, 11, new decarock.impassible.attabal() { // from class: incorrectly.yemenite
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                empress.grimness(attabalVarSakeen, i, marialVar, marialVar2, (saneness) obj);
            }
        });
    }

    @Override // androidx.media3.common.cord.wireman
    public void onCues(final libya.saneness sanenessVar) {
        final saneness.attabal attabalVarSakeen = sakeen();
        cosy(attabalVarSakeen, 27, new decarock.impassible.attabal() { // from class: incorrectly.merc
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((saneness) obj).sealless(attabalVarSakeen, sanenessVar);
            }
        });
    }

    @Override // androidx.media3.common.cord.wireman
    public void onRenderedFirstFrame() {
    }

    @Override // androidx.media3.common.cord.wireman
    public void onLoadingChanged(boolean z) {
    }

    public static /* synthetic */ void homozygous(saneness sanenessVar, androidx.media3.common.kowloon kowloonVar) {
    }

    @Override // androidx.media3.common.cord.wireman
    public void onEvents(androidx.media3.common.cord cordVar, androidx.media3.common.cord.dern dernVar) {
    }
}
