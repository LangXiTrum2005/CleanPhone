package androidx.media3.exoplayer.source;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import cybernatic.merc;
import cybernatic.privatdozent;
import cybernatic.restrictive;
import decarock.grimness;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: DefaultMediaSourceFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class wireman implements triweekly {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public long f12717apical;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public formularize.attabal f12718beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public marial f12719competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public long f12720cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final attabal f12721dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public float f12722formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public float f12723impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public androidx.media3.exoplayer.upstream.saneness f12724impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public strother.polloi.attabal f12725marial;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public long f12726taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public boolean f12727triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public androidx.media3.datasource.attabal.InterfaceC0080attabal f12728wireman;

    /* JADX INFO: compiled from: DefaultMediaSourceFactory.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final cybernatic.adultoid f12729attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public strother.polloi.attabal f12730beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public polyfoil.marial f12731competently;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public puffin.monoploid f12733impromptu;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public androidx.media3.exoplayer.upstream.saneness f12736taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public androidx.media3.datasource.attabal.InterfaceC0080attabal f12737wireman;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Map<Integer, com.google.common.base.arytenoidectomy<formularize.attabal>> f12735saneness = new HashMap();

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final Map<Integer, formularize.attabal> f12732dern = new HashMap();

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public boolean f12734marial = true;

        public attabal(cybernatic.adultoid adultoidVar, strother.polloi.attabal attabalVar) {
            this.f12729attabal = adultoidVar;
            this.f12730beachfront = attabalVar;
        }

        public static /* synthetic */ formularize.attabal dern(attabal attabalVar, androidx.media3.datasource.attabal.InterfaceC0080attabal interfaceC0080attabal) {
            attabalVar.getClass();
            return new polloi.saneness(interfaceC0080attabal, attabalVar.f12729attabal);
        }

        public void apical(int i) {
            cybernatic.adultoid adultoidVar = this.f12729attabal;
            if (adultoidVar instanceof cybernatic.formularize) {
                ((cybernatic.formularize) adultoidVar).apical(i);
            }
        }

        public formularize.attabal beachfront(int i) throws ClassNotFoundException {
            formularize.attabal attabalVar = this.f12732dern.get(Integer.valueOf(i));
            if (attabalVar != null) {
                return attabalVar;
            }
            formularize.attabal attabalVar2 = competently(i).get();
            polyfoil.marial marialVar = this.f12731competently;
            if (marialVar != null) {
                attabalVar2.dern(marialVar);
            }
            puffin.monoploid monoploidVar = this.f12733impromptu;
            if (monoploidVar != null) {
                attabalVar2.wireman(monoploidVar);
            }
            androidx.media3.exoplayer.upstream.saneness sanenessVar = this.f12736taiyuan;
            if (sanenessVar != null) {
                attabalVar2.marial(sanenessVar);
            }
            attabalVar2.attabal(this.f12730beachfront);
            attabalVar2.beachfront(this.f12734marial);
            this.f12732dern.put(Integer.valueOf(i), attabalVar2);
            return attabalVar2;
        }

        public final com.google.common.base.arytenoidectomy<formularize.attabal> competently(int i) throws ClassNotFoundException {
            com.google.common.base.arytenoidectomy<formularize.attabal> arytenoidectomyVar;
            com.google.common.base.arytenoidectomy<formularize.attabal> arytenoidectomyVar2;
            com.google.common.base.arytenoidectomy<formularize.attabal> arytenoidectomyVar3 = this.f12735saneness.get(Integer.valueOf(i));
            if (arytenoidectomyVar3 != null) {
                return arytenoidectomyVar3;
            }
            final androidx.media3.datasource.attabal.InterfaceC0080attabal interfaceC0080attabal = (androidx.media3.datasource.attabal.InterfaceC0080attabal) decarock.attabal.marial(this.f12737wireman);
            if (i == 0) {
                final Class<? extends U> clsAsSubclass = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(formularize.attabal.class);
                arytenoidectomyVar = new com.google.common.base.arytenoidectomy() { // from class: ethene.impromptu
                    @Override // com.google.common.base.arytenoidectomy
                    public final Object get() {
                        return androidx.media3.exoplayer.source.wireman.triweekly(clsAsSubclass, interfaceC0080attabal);
                    }
                };
            } else {
                if (i != 1) {
                    if (i == 2) {
                        final Class<? extends U> clsAsSubclass2 = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(formularize.attabal.class);
                        arytenoidectomyVar = new com.google.common.base.arytenoidectomy() { // from class: ethene.cutely
                            @Override // com.google.common.base.arytenoidectomy
                            public final Object get() {
                                return androidx.media3.exoplayer.source.wireman.triweekly(clsAsSubclass2, interfaceC0080attabal);
                            }
                        };
                    } else if (i == 3) {
                        final Class<? extends U> clsAsSubclass3 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(formularize.attabal.class);
                        arytenoidectomyVar2 = new com.google.common.base.arytenoidectomy() { // from class: ethene.apical
                            @Override // com.google.common.base.arytenoidectomy
                            public final Object get() {
                                return androidx.media3.exoplayer.source.wireman.impassible(clsAsSubclass3);
                            }
                        };
                    } else {
                        if (i != 4) {
                            throw new IllegalArgumentException("Unrecognized contentType: " + i);
                        }
                        arytenoidectomyVar2 = new com.google.common.base.arytenoidectomy() { // from class: ethene.formularize
                            @Override // com.google.common.base.arytenoidectomy
                            public final Object get() {
                                return androidx.media3.exoplayer.source.wireman.attabal.dern(this.f26023kowloon, interfaceC0080attabal);
                            }
                        };
                    }
                    this.f12735saneness.put(Integer.valueOf(i), arytenoidectomyVar2);
                    return arytenoidectomyVar2;
                }
                final Class<? extends U> clsAsSubclass4 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(formularize.attabal.class);
                arytenoidectomyVar = new com.google.common.base.arytenoidectomy() { // from class: ethene.taiyuan
                    @Override // com.google.common.base.arytenoidectomy
                    public final Object get() {
                        return androidx.media3.exoplayer.source.wireman.triweekly(clsAsSubclass4, interfaceC0080attabal);
                    }
                };
            }
            arytenoidectomyVar2 = arytenoidectomyVar;
            this.f12735saneness.put(Integer.valueOf(i), arytenoidectomyVar2);
            return arytenoidectomyVar2;
        }

        public void cutely(puffin.monoploid monoploidVar) {
            this.f12733impromptu = monoploidVar;
            Iterator<formularize.attabal> it = this.f12732dern.values().iterator();
            while (it.hasNext()) {
                it.next().wireman(monoploidVar);
            }
        }

        public void formularize(androidx.media3.exoplayer.upstream.saneness sanenessVar) {
            this.f12736taiyuan = sanenessVar;
            Iterator<formularize.attabal> it = this.f12732dern.values().iterator();
            while (it.hasNext()) {
                it.next().marial(sanenessVar);
            }
        }

        public void impassible(boolean z) {
            this.f12734marial = z;
            this.f12729attabal.saneness(z);
            Iterator<formularize.attabal> it = this.f12732dern.values().iterator();
            while (it.hasNext()) {
                it.next().beachfront(z);
            }
        }

        public void impromptu(polyfoil.marial marialVar) {
            this.f12731competently = marialVar;
            Iterator<formularize.attabal> it = this.f12732dern.values().iterator();
            while (it.hasNext()) {
                it.next().dern(marialVar);
            }
        }

        public void taiyuan(androidx.media3.datasource.attabal.InterfaceC0080attabal interfaceC0080attabal) {
            if (interfaceC0080attabal != this.f12737wireman) {
                this.f12737wireman = interfaceC0080attabal;
                this.f12735saneness.clear();
                this.f12732dern.clear();
            }
        }

        public void triweekly(strother.polloi.attabal attabalVar) {
            this.f12730beachfront = attabalVar;
            this.f12729attabal.attabal(attabalVar);
            Iterator<formularize.attabal> it = this.f12732dern.values().iterator();
            while (it.hasNext()) {
                it.next().attabal(attabalVar);
            }
        }
    }

    public wireman(Context context) {
        this(new androidx.media3.datasource.saneness.attabal(context));
    }

    public static formularize apical(androidx.media3.common.adultoid adultoidVar, formularize formularizeVar) {
        androidx.media3.common.adultoid.wireman wiremanVar = adultoidVar.f10614beachfront;
        if (wiremanVar.f10739saneness == 0 && wiremanVar.f10740wireman == Long.MIN_VALUE && !wiremanVar.f10735beachfront) {
            return formularizeVar;
        }
        androidx.media3.common.adultoid.wireman wiremanVar2 = adultoidVar.f10614beachfront;
        return new ClippingMediaSource(formularizeVar, wiremanVar2.f10739saneness, wiremanVar2.f10740wireman, !wiremanVar2.f10736competently, wiremanVar2.f10738marial, wiremanVar2.f10735beachfront);
    }

    public static /* synthetic */ cybernatic.arytenoidectomy[] competently(wireman wiremanVar, androidx.media3.common.polloi polloiVar) {
        return new cybernatic.arytenoidectomy[]{wiremanVar.f12725marial.attabal(polloiVar) ? new strother.triweekly(wiremanVar.f12725marial.dern(polloiVar), polloiVar) : new saneness(polloiVar)};
    }

    public static formularize.attabal impassible(Class<? extends formularize.attabal> cls) {
        try {
            return cls.getConstructor(null).newInstance(null);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public static formularize.attabal triweekly(Class<? extends formularize.attabal> cls, androidx.media3.datasource.attabal.InterfaceC0080attabal interfaceC0080attabal) {
        try {
            return cls.getConstructor(androidx.media3.datasource.attabal.InterfaceC0080attabal.class).newInstance(interfaceC0080attabal);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // androidx.media3.exoplayer.source.formularize.attabal
    /* JADX INFO: renamed from: arytenoidectomy, reason: merged with bridge method [inline-methods] */
    public wireman wireman(puffin.monoploid monoploidVar) {
        this.f12721dern.cutely((puffin.monoploid) decarock.attabal.beachfront(monoploidVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // androidx.media3.exoplayer.source.formularize.attabal
    @Deprecated
    /* JADX INFO: renamed from: cutely, reason: merged with bridge method [inline-methods] */
    public wireman beachfront(boolean z) {
        this.f12727triweekly = z;
        this.f12721dern.impassible(z);
        return this;
    }

    public final formularize formularize(androidx.media3.common.adultoid adultoidVar, formularize formularizeVar) {
        decarock.attabal.marial(adultoidVar.f10619saneness);
        adultoidVar.f10619saneness.getClass();
        return formularizeVar;
    }

    @Override // androidx.media3.exoplayer.source.formularize.attabal
    /* JADX INFO: renamed from: kowloon, reason: merged with bridge method [inline-methods] */
    public wireman dern(polyfoil.marial marialVar) {
        this.f12721dern.impromptu((polyfoil.marial) decarock.attabal.marial(marialVar));
        return this;
    }

    @Override // androidx.media3.exoplayer.source.formularize.attabal
    /* JADX INFO: renamed from: monoploid, reason: merged with bridge method [inline-methods] */
    public wireman marial(androidx.media3.exoplayer.upstream.saneness sanenessVar) {
        this.f12724impromptu = (androidx.media3.exoplayer.upstream.saneness) decarock.attabal.beachfront(sanenessVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f12721dern.formularize(sanenessVar);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.formularize.attabal
    /* JADX INFO: renamed from: polloi, reason: merged with bridge method [inline-methods] */
    public wireman attabal(strother.polloi.attabal attabalVar) {
        this.f12725marial = (strother.polloi.attabal) decarock.attabal.marial(attabalVar);
        this.f12721dern.triweekly(attabalVar);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.formularize.attabal
    public formularize saneness(androidx.media3.common.adultoid adultoidVar) {
        decarock.attabal.marial(adultoidVar.f10619saneness);
        String scheme = adultoidVar.f10619saneness.f10706attabal.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((formularize.attabal) decarock.attabal.marial(this.f12718beachfront)).saneness(adultoidVar);
        }
        if (Objects.equals(adultoidVar.f10619saneness.f10712saneness, "application/x-image-uri")) {
            return new competently.saneness(grimness.outmarry(adultoidVar.f10619saneness.f10713taiyuan), (marial) decarock.attabal.marial(this.f12719competently)).saneness(adultoidVar);
        }
        androidx.media3.common.adultoid.impromptu impromptuVar = adultoidVar.f10619saneness;
        int iPreterite = grimness.preterite(impromptuVar.f10706attabal, impromptuVar.f10712saneness);
        if (adultoidVar.f10619saneness.f10713taiyuan != C.TIME_UNSET) {
            this.f12721dern.apical(1);
        }
        try {
            formularize.attabal attabalVarBeachfront = this.f12721dern.beachfront(iPreterite);
            androidx.media3.common.adultoid.competently.attabal attabalVarAttabal = adultoidVar.f10620wireman.attabal();
            if (adultoidVar.f10620wireman.f10675attabal == C.TIME_UNSET) {
                attabalVarAttabal.apical(this.f12726taiyuan);
            }
            if (adultoidVar.f10620wireman.f10679wireman == -3.4028235E38f) {
                attabalVarAttabal.cutely(this.f12722formularize);
            }
            if (adultoidVar.f10620wireman.f10677marial == -3.4028235E38f) {
                attabalVarAttabal.impromptu(this.f12723impassible);
            }
            if (adultoidVar.f10620wireman.f10678saneness == C.TIME_UNSET) {
                attabalVarAttabal.taiyuan(this.f12720cutely);
            }
            if (adultoidVar.f10620wireman.f10676dern == C.TIME_UNSET) {
                attabalVarAttabal.competently(this.f12717apical);
            }
            androidx.media3.common.adultoid.competently competentlyVarBeachfront = attabalVarAttabal.beachfront();
            if (!competentlyVarBeachfront.equals(adultoidVar.f10620wireman)) {
                adultoidVar = adultoidVar.attabal().dern(competentlyVarBeachfront).attabal();
            }
            formularize formularizeVarSaneness = attabalVarBeachfront.saneness(adultoidVar);
            ImmutableList<androidx.media3.common.adultoid.apical> immutableList = ((androidx.media3.common.adultoid.impromptu) grimness.impromptu(adultoidVar.f10619saneness)).f10707beachfront;
            if (!immutableList.isEmpty()) {
                formularize[] formularizeVarArr = new formularize[immutableList.size() + 1];
                formularizeVarArr[0] = formularizeVarSaneness;
                for (int i = 0; i < immutableList.size(); i++) {
                    if (this.f12727triweekly) {
                        final androidx.media3.common.polloi polloiVarPolder = new androidx.media3.common.polloi.saneness().sensatory(immutableList.get(i).f10633saneness).treadless(immutableList.get(i).f10631dern).preterite(immutableList.get(i).f10634wireman).coi(immutableList.get(i).f10632marial).timberyard(immutableList.get(i).f10629beachfront).cultivated(immutableList.get(i).f10630competently).polder();
                        polloi.saneness sanenessVar = new polloi.saneness(this.f12728wireman, new cybernatic.adultoid() { // from class: ethene.competently
                            @Override // cybernatic.adultoid
                            public final cybernatic.arytenoidectomy[] createExtractors() {
                                return androidx.media3.exoplayer.source.wireman.competently(this.f26014saneness, polloiVarPolder);
                            }
                        });
                        androidx.media3.exoplayer.upstream.saneness sanenessVar2 = this.f12724impromptu;
                        if (sanenessVar2 != null) {
                            sanenessVar.marial(sanenessVar2);
                        }
                        formularizeVarArr[i + 1] = sanenessVar.saneness(androidx.media3.common.adultoid.saneness(immutableList.get(i).f10628attabal.toString()));
                    } else {
                        gintrap.saneness sanenessVar3 = new gintrap.saneness(this.f12728wireman);
                        androidx.media3.exoplayer.upstream.saneness sanenessVar4 = this.f12724impromptu;
                        if (sanenessVar4 != null) {
                            sanenessVar3.saneness(sanenessVar4);
                        }
                        formularizeVarArr[i + 1] = sanenessVar3.attabal(immutableList.get(i), C.TIME_UNSET);
                    }
                }
                formularizeVarSaneness = new MergingMediaSource(formularizeVarArr);
            }
            return formularize(adultoidVar, apical(adultoidVar, formularizeVarSaneness));
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    public wireman(Context context, cybernatic.adultoid adultoidVar) {
        this(new androidx.media3.datasource.saneness.attabal(context), adultoidVar);
    }

    public wireman(androidx.media3.datasource.attabal.InterfaceC0080attabal interfaceC0080attabal) {
        this(interfaceC0080attabal, new cybernatic.formularize());
    }

    public wireman(androidx.media3.datasource.attabal.InterfaceC0080attabal interfaceC0080attabal, cybernatic.adultoid adultoidVar) {
        this.f12728wireman = interfaceC0080attabal;
        strother.impromptu impromptuVar = new strother.impromptu();
        this.f12725marial = impromptuVar;
        attabal attabalVar = new attabal(adultoidVar, impromptuVar);
        this.f12721dern = attabalVar;
        attabalVar.taiyuan(interfaceC0080attabal);
        this.f12726taiyuan = C.TIME_UNSET;
        this.f12720cutely = C.TIME_UNSET;
        this.f12717apical = C.TIME_UNSET;
        this.f12722formularize = -3.4028235E38f;
        this.f12723impassible = -3.4028235E38f;
        this.f12727triweekly = true;
    }

    /* JADX INFO: compiled from: DefaultMediaSourceFactory.java */
    public static final class saneness implements cybernatic.arytenoidectomy {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final androidx.media3.common.polloi f12738attabal;

        public saneness(androidx.media3.common.polloi polloiVar) {
            this.f12738attabal = polloiVar;
        }

        @Override // cybernatic.arytenoidectomy
        public boolean attabal(cybernatic.monoploid monoploidVar) {
            return true;
        }

        @Override // cybernatic.arytenoidectomy
        public int beachfront(cybernatic.monoploid monoploidVar, restrictive restrictiveVar) throws IOException {
            return monoploidVar.skip(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // cybernatic.arytenoidectomy
        public void marial(cybernatic.polloi polloiVar) {
            privatdozent privatdozentVarTrack = polloiVar.track(0, 3);
            polloiVar.beachfront(new merc.saneness(C.TIME_UNSET));
            polloiVar.endTracks();
            privatdozentVarTrack.dern(this.f12738attabal.attabal().sensatory("text/x-unknown").privatdozent(this.f12738attabal.f11218triweekly).polder());
        }

        @Override // cybernatic.arytenoidectomy
        public void release() {
        }

        @Override // cybernatic.arytenoidectomy
        public void seek(long j, long j2) {
        }
    }
}
