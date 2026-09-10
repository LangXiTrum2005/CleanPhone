package endosteum;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: Jobs.java */
/* JADX INFO: loaded from: classes2.dex */
public final class impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<maggot.saneness, com.bumptech.glide.load.engine.competently<?>> f25721attabal = new HashMap();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Map<maggot.saneness, com.bumptech.glide.load.engine.competently<?>> f25722saneness = new HashMap();

    public com.bumptech.glide.load.engine.competently<?> attabal(maggot.saneness sanenessVar, boolean z) {
        return saneness(z).get(sanenessVar);
    }

    public void dern(maggot.saneness sanenessVar, com.bumptech.glide.load.engine.competently<?> competentlyVar) {
        saneness(competentlyVar.arytenoidectomy()).put(sanenessVar, competentlyVar);
    }

    public final Map<maggot.saneness, com.bumptech.glide.load.engine.competently<?>> saneness(boolean z) {
        return z ? this.f25722saneness : this.f25721attabal;
    }

    public void wireman(maggot.saneness sanenessVar, com.bumptech.glide.load.engine.competently<?> competentlyVar) {
        Map<maggot.saneness, com.bumptech.glide.load.engine.competently<?>> mapSaneness = saneness(competentlyVar.arytenoidectomy());
        if (competentlyVar.equals(mapSaneness.get(sanenessVar))) {
            mapSaneness.remove(sanenessVar);
        }
    }
}
