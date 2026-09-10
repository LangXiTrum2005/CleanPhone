package com.google.android.material.carousel;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: KeylineState.java */
/* JADX INFO: loaded from: classes3.dex */
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final float f19888attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final int f19889beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final List<dern> f19890dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f19891marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f19892saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f19893wireman;

    /* JADX INFO: compiled from: KeylineState.java */
    public static final class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final float f19894attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final float f19895beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final float f19896competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final float f19897dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final float f19898impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final boolean f19899marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final float f19900saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final float f19901wireman;

        public dern(float f, float f2, float f3, float f4) {
            this(f, f2, f3, f4, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        public static dern attabal(dern dernVar, dern dernVar2, float f) {
            return new dern(phrasemonger.saneness.attabal(dernVar.f19894attabal, dernVar2.f19894attabal, f), phrasemonger.saneness.attabal(dernVar.f19900saneness, dernVar2.f19900saneness, f), phrasemonger.saneness.attabal(dernVar.f19897dern, dernVar2.f19897dern, f), phrasemonger.saneness.attabal(dernVar.f19901wireman, dernVar2.f19901wireman, f));
        }

        public dern(float f, float f2, float f3, float f4, boolean z, float f5, float f6, float f7) {
            this.f19894attabal = f;
            this.f19900saneness = f2;
            this.f19897dern = f3;
            this.f19901wireman = f4;
            this.f19899marial = z;
            this.f19895beachfront = f5;
            this.f19896competently = f6;
            this.f19898impromptu = f7;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: KeylineState.java */
    public static final class C0297saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final float f19902attabal;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public dern f19907marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f19908saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public dern f19910wireman;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final List<dern> f19905dern = new ArrayList();

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public int f19903beachfront = -1;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public int f19904competently = -1;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public float f19906impromptu = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public int f19909taiyuan = -1;

        public C0297saneness(float f, int i) {
            this.f19902attabal = f;
            this.f19908saneness = i;
        }

        public static float cutely(float f, float f2, int i, int i2) {
            return (f - (i * f2)) + (i2 * f2);
        }

        public C0297saneness attabal(float f, float f2, float f3) {
            return wireman(f, f2, f3, false, true);
        }

        public C0297saneness beachfront(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, float f6) {
            if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return this;
            }
            if (z2) {
                if (z) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i = this.f19909taiyuan;
                if (i != -1 && i != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f19909taiyuan = this.f19905dern.size();
            }
            dern dernVar = new dern(Float.MIN_VALUE, f, f2, f3, z2, f4, f5, f6);
            if (z) {
                if (this.f19910wireman == null) {
                    this.f19910wireman = dernVar;
                    this.f19903beachfront = this.f19905dern.size();
                }
                if (this.f19904competently != -1 && this.f19905dern.size() - this.f19904competently > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f3 != this.f19910wireman.f19901wireman) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f19907marial = dernVar;
                this.f19904competently = this.f19905dern.size();
            } else {
                if (this.f19910wireman == null && dernVar.f19901wireman < this.f19906impromptu) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f19907marial != null && dernVar.f19901wireman > this.f19906impromptu) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f19906impromptu = dernVar.f19901wireman;
            this.f19905dern.add(dernVar);
            return this;
        }

        public C0297saneness competently(float f, float f2, float f3, int i) {
            return impromptu(f, f2, f3, i, false);
        }

        public C0297saneness dern(float f, float f2, float f3, boolean z) {
            return wireman(f, f2, f3, z, false);
        }

        public C0297saneness impromptu(float f, float f2, float f3, int i, boolean z) {
            if (i > 0 && f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                for (int i2 = 0; i2 < i; i2++) {
                    dern((i2 * f3) + f, f2, f3, z);
                }
            }
            return this;
        }

        public C0297saneness marial(float f, float f2, float f3, boolean z, boolean z2, float f4) {
            return beachfront(f, f2, f3, z, z2, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        public C0297saneness saneness(float f, float f2, float f3) {
            return dern(f, f2, f3, false);
        }

        public saneness taiyuan() {
            if (this.f19910wireman == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f19905dern.size(); i++) {
                dern dernVar = this.f19905dern.get(i);
                arrayList.add(new dern(cutely(this.f19910wireman.f19900saneness, this.f19902attabal, this.f19903beachfront, i), dernVar.f19900saneness, dernVar.f19897dern, dernVar.f19901wireman, dernVar.f19899marial, dernVar.f19895beachfront, dernVar.f19896competently, dernVar.f19898impromptu));
            }
            return new saneness(this.f19902attabal, arrayList, this.f19903beachfront, this.f19904competently, this.f19908saneness);
        }

        public C0297saneness wireman(float f, float f2, float f3, boolean z, boolean z2) {
            float fAbs;
            float f4 = f3 / 2.0f;
            float f5 = f - f4;
            float f6 = f4 + f;
            int i = this.f19908saneness;
            if (f6 > i) {
                fAbs = Math.abs(f6 - Math.max(f6 - f3, i));
            } else {
                fAbs = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (f5 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    fAbs = Math.abs(f5 - Math.min(f5 + f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                }
            }
            return marial(f, f2, f3, z, z2, fAbs);
        }
    }

    public static saneness arytenoidectomy(saneness sanenessVar, int i) {
        C0297saneness c0297saneness = new C0297saneness(sanenessVar.competently(), i);
        float f = (i - sanenessVar.apical().f19900saneness) - (sanenessVar.apical().f19901wireman / 2.0f);
        int size = sanenessVar.impromptu().size() - 1;
        while (size >= 0) {
            dern dernVar = sanenessVar.impromptu().get(size);
            c0297saneness.wireman((dernVar.f19901wireman / 2.0f) + f, dernVar.f19897dern, dernVar.f19901wireman, size >= sanenessVar.dern() && size <= sanenessVar.cutely(), dernVar.f19899marial);
            f += dernVar.f19901wireman;
            size--;
        }
        return c0297saneness.taiyuan();
    }

    public static saneness kowloon(saneness sanenessVar, saneness sanenessVar2, float f) {
        if (sanenessVar.competently() != sanenessVar2.competently()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<dern> listImpromptu = sanenessVar.impromptu();
        List<dern> listImpromptu2 = sanenessVar2.impromptu();
        if (listImpromptu.size() != listImpromptu2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < sanenessVar.impromptu().size(); i++) {
            arrayList.add(dern.attabal(listImpromptu.get(i), listImpromptu2.get(i), f));
        }
        return new saneness(sanenessVar.competently(), arrayList, phrasemonger.saneness.dern(sanenessVar.dern(), sanenessVar2.dern(), f), phrasemonger.saneness.dern(sanenessVar.cutely(), sanenessVar2.cutely(), f), sanenessVar.f19889beachfront);
    }

    public dern apical() {
        List<dern> list = this.f19890dern;
        return list.get(list.size() - 1);
    }

    public int attabal() {
        return this.f19889beachfront;
    }

    public List<dern> beachfront() {
        return this.f19890dern.subList(this.f19893wireman, this.f19891marial + 1);
    }

    public float competently() {
        return this.f19888attabal;
    }

    public int cutely() {
        return this.f19891marial;
    }

    public int dern() {
        return this.f19893wireman;
    }

    public dern formularize() {
        for (int size = this.f19890dern.size() - 1; size >= 0; size--) {
            dern dernVar = this.f19890dern.get(size);
            if (!dernVar.f19899marial) {
                return dernVar;
            }
        }
        return null;
    }

    public int impassible() {
        Iterator<dern> it = this.f19890dern.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().f19899marial) {
                i++;
            }
        }
        return this.f19890dern.size() - i;
    }

    public List<dern> impromptu() {
        return this.f19890dern;
    }

    public dern marial() {
        for (int i = 0; i < this.f19890dern.size(); i++) {
            dern dernVar = this.f19890dern.get(i);
            if (!dernVar.f19899marial) {
                return dernVar;
            }
        }
        return null;
    }

    public dern saneness() {
        return this.f19890dern.get(this.f19893wireman);
    }

    public dern taiyuan() {
        return this.f19890dern.get(this.f19891marial);
    }

    public int triweekly() {
        return this.f19892saneness;
    }

    public dern wireman() {
        return this.f19890dern.get(0);
    }

    public saneness(float f, List<dern> list, int i, int i2, int i3) {
        this.f19888attabal = f;
        this.f19890dern = Collections.unmodifiableList(list);
        this.f19893wireman = i;
        this.f19891marial = i2;
        while (i <= i2) {
            if (list.get(i).f19895beachfront == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.f19892saneness++;
            }
            i++;
        }
        this.f19889beachfront = i3;
    }
}
