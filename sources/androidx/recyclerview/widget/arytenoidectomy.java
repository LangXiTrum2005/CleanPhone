package androidx.recyclerview.widget;

import androidx.collection.gintrap;
import androidx.collection.splinterproof;

/* JADX INFO: compiled from: ViewInfoStore.java */
/* JADX INFO: loaded from: classes.dex */
public class arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final splinterproof<RecyclerView.stratoscope, attabal> f13368attabal = new splinterproof<>();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final gintrap<RecyclerView.stratoscope> f13369saneness = new gintrap<>();

    /* JADX INFO: compiled from: ViewInfoStore.java */
    public static class attabal {

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static technofreak.competently<attabal> f13370wireman = new technofreak.impromptu(20);

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f13371attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public RecyclerView.formularize.dern f13372dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public RecyclerView.formularize.dern f13373saneness;

        public static void attabal() {
            while (f13370wireman.saneness() != null) {
            }
        }

        public static void dern(attabal attabalVar) {
            attabalVar.f13371attabal = 0;
            attabalVar.f13373saneness = null;
            attabalVar.f13372dern = null;
            f13370wireman.attabal(attabalVar);
        }

        public static attabal saneness() {
            attabal attabalVarSaneness = f13370wireman.saneness();
            return attabalVarSaneness == null ? new attabal() : attabalVarSaneness;
        }
    }

    /* JADX INFO: compiled from: ViewInfoStore.java */
    public interface saneness {
        void attabal(RecyclerView.stratoscope stratoscopeVar, RecyclerView.formularize.dern dernVar, RecyclerView.formularize.dern dernVar2);

        void dern(RecyclerView.stratoscope stratoscopeVar, RecyclerView.formularize.dern dernVar, RecyclerView.formularize.dern dernVar2);

        void saneness(RecyclerView.stratoscope stratoscopeVar);

        void wireman(RecyclerView.stratoscope stratoscopeVar, RecyclerView.formularize.dern dernVar, RecyclerView.formularize.dern dernVar2);
    }

    public void apical(RecyclerView.stratoscope stratoscopeVar) {
        arytenoidectomy(stratoscopeVar);
    }

    public void arytenoidectomy(RecyclerView.stratoscope stratoscopeVar) {
        attabal attabalVar = this.f13368attabal.get(stratoscopeVar);
        if (attabalVar == null) {
            return;
        }
        attabalVar.f13371attabal &= -2;
    }

    public void attabal(RecyclerView.stratoscope stratoscopeVar, RecyclerView.formularize.dern dernVar) {
        attabal attabalVarSaneness = this.f13368attabal.get(stratoscopeVar);
        if (attabalVarSaneness == null) {
            attabalVarSaneness = attabal.saneness();
            this.f13368attabal.put(stratoscopeVar, attabalVarSaneness);
        }
        attabalVarSaneness.f13371attabal |= 2;
        attabalVarSaneness.f13373saneness = dernVar;
    }

    public void beachfront() {
        this.f13368attabal.clear();
        this.f13369saneness.attabal();
    }

    public RecyclerView.stratoscope competently(long j) {
        return this.f13369saneness.marial(j);
    }

    public void cutely() {
        attabal.attabal();
    }

    public void dern(long j, RecyclerView.stratoscope stratoscopeVar) {
        this.f13369saneness.taiyuan(j, stratoscopeVar);
    }

    public final RecyclerView.formularize.dern formularize(RecyclerView.stratoscope stratoscopeVar, int i) {
        attabal attabalVarFormularize;
        RecyclerView.formularize.dern dernVar;
        int iMarial = this.f13368attabal.marial(stratoscopeVar);
        if (iMarial >= 0 && (attabalVarFormularize = this.f13368attabal.formularize(iMarial)) != null) {
            int i2 = attabalVarFormularize.f13371attabal;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                attabalVarFormularize.f13371attabal = i3;
                if (i == 4) {
                    dernVar = attabalVarFormularize.f13373saneness;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    dernVar = attabalVarFormularize.f13372dern;
                }
                if ((i3 & 12) == 0) {
                    this.f13368attabal.taiyuan(iMarial);
                    attabal.dern(attabalVarFormularize);
                }
                return dernVar;
            }
        }
        return null;
    }

    public RecyclerView.formularize.dern impassible(RecyclerView.stratoscope stratoscopeVar) {
        return formularize(stratoscopeVar, 8);
    }

    public boolean impromptu(RecyclerView.stratoscope stratoscopeVar) {
        attabal attabalVar = this.f13368attabal.get(stratoscopeVar);
        return (attabalVar == null || (attabalVar.f13371attabal & 1) == 0) ? false : true;
    }

    public void kowloon(saneness sanenessVar) {
        for (int size = this.f13368attabal.getSize() - 1; size >= 0; size--) {
            RecyclerView.stratoscope stratoscopeVarCompetently = this.f13368attabal.competently(size);
            attabal attabalVarTaiyuan = this.f13368attabal.taiyuan(size);
            int i = attabalVarTaiyuan.f13371attabal;
            if ((i & 3) == 3) {
                sanenessVar.saneness(stratoscopeVarCompetently);
            } else if ((i & 1) != 0) {
                RecyclerView.formularize.dern dernVar = attabalVarTaiyuan.f13373saneness;
                if (dernVar == null) {
                    sanenessVar.saneness(stratoscopeVarCompetently);
                } else {
                    sanenessVar.dern(stratoscopeVarCompetently, dernVar, attabalVarTaiyuan.f13372dern);
                }
            } else if ((i & 14) == 14) {
                sanenessVar.attabal(stratoscopeVarCompetently, attabalVarTaiyuan.f13373saneness, attabalVarTaiyuan.f13372dern);
            } else if ((i & 12) == 12) {
                sanenessVar.wireman(stratoscopeVarCompetently, attabalVarTaiyuan.f13373saneness, attabalVarTaiyuan.f13372dern);
            } else if ((i & 4) != 0) {
                sanenessVar.dern(stratoscopeVarCompetently, attabalVarTaiyuan.f13373saneness, null);
            } else if ((i & 8) != 0) {
                sanenessVar.attabal(stratoscopeVarCompetently, attabalVarTaiyuan.f13373saneness, attabalVarTaiyuan.f13372dern);
            }
            attabal.dern(attabalVarTaiyuan);
        }
    }

    public void marial(RecyclerView.stratoscope stratoscopeVar, RecyclerView.formularize.dern dernVar) {
        attabal attabalVarSaneness = this.f13368attabal.get(stratoscopeVar);
        if (attabalVarSaneness == null) {
            attabalVarSaneness = attabal.saneness();
            this.f13368attabal.put(stratoscopeVar, attabalVarSaneness);
        }
        attabalVarSaneness.f13373saneness = dernVar;
        attabalVarSaneness.f13371attabal |= 4;
    }

    public void monoploid(RecyclerView.stratoscope stratoscopeVar) {
        for (int iImpassible = this.f13369saneness.impassible() - 1; iImpassible >= 0; iImpassible--) {
            if (stratoscopeVar == this.f13369saneness.triweekly(iImpassible)) {
                this.f13369saneness.formularize(iImpassible);
                break;
            }
        }
        attabal attabalVarRemove = this.f13368attabal.remove(stratoscopeVar);
        if (attabalVarRemove != null) {
            attabal.dern(attabalVarRemove);
        }
    }

    public void saneness(RecyclerView.stratoscope stratoscopeVar) {
        attabal attabalVarSaneness = this.f13368attabal.get(stratoscopeVar);
        if (attabalVarSaneness == null) {
            attabalVarSaneness = attabal.saneness();
            this.f13368attabal.put(stratoscopeVar, attabalVarSaneness);
        }
        attabalVarSaneness.f13371attabal |= 1;
    }

    public boolean taiyuan(RecyclerView.stratoscope stratoscopeVar) {
        attabal attabalVar = this.f13368attabal.get(stratoscopeVar);
        return (attabalVar == null || (attabalVar.f13371attabal & 4) == 0) ? false : true;
    }

    public RecyclerView.formularize.dern triweekly(RecyclerView.stratoscope stratoscopeVar) {
        return formularize(stratoscopeVar, 4);
    }

    public void wireman(RecyclerView.stratoscope stratoscopeVar, RecyclerView.formularize.dern dernVar) {
        attabal attabalVarSaneness = this.f13368attabal.get(stratoscopeVar);
        if (attabalVarSaneness == null) {
            attabalVarSaneness = attabal.saneness();
            this.f13368attabal.put(stratoscopeVar, attabalVarSaneness);
        }
        attabalVarSaneness.f13372dern = dernVar;
        attabalVarSaneness.f13371attabal |= 8;
    }
}
