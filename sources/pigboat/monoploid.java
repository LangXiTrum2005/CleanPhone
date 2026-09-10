package pigboat;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.technofreak;
import p002kotlin.Metadata;
import p002kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lpigboat/monoploid;", "", "<init>", "()V", "Lkotlinx/coroutines/technofreak;", "attabal", "()Lkotlinx/coroutines/technofreak;", "saneness", "Lkotlinx/coroutines/technofreak;", "dispatcher", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class monoploid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final monoploid f35364attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final technofreak dispatcher;

    static {
        monoploid monoploidVar = new monoploid();
        f35364attabal = monoploidVar;
        trm.beachfront("kotlinx.coroutines.fast.service.loader", true);
        dispatcher = monoploidVar.attabal();
    }

    public final technofreak attabal() {
        Object next;
        technofreak technofreakVarMarial;
        try {
            List listHydrovane = SequencesKt___SequencesKt.hydrovane(p002kotlin.sequences.arytenoidectomy.competently(ServiceLoader.load(arytenoidectomy.class, arytenoidectomy.class.getClassLoader()).iterator()));
            Iterator it = listHydrovane.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iDern = ((arytenoidectomy) next).dern();
                    do {
                        Object next2 = it.next();
                        int iDern2 = ((arytenoidectomy) next2).dern();
                        if (iDern < iDern2) {
                            next = next2;
                            iDern = iDern2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            arytenoidectomy arytenoidectomyVar = (arytenoidectomy) next;
            if (arytenoidectomyVar != null && (technofreakVarMarial = polloi.marial(arytenoidectomyVar, listHydrovane)) != null) {
                return technofreakVarMarial;
            }
            return polloi.saneness(null, null, 3, null);
        } catch (Throwable th) {
            return polloi.saneness(th, null, 2, null);
        }
    }
}
