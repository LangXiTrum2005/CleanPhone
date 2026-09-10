package formularization;

import p002kotlin.Metadata;
import p002kotlin.Unit;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lformularization/attabal;", "", "owner", "", "saneness", "(Ljava/lang/Object;)Z", "", "attabal", "(Ljava/lang/Object;Lwretchedly/dern;)Ljava/lang/Object;", "wireman", "(Ljava/lang/Object;)V", "dern", "()Z", "isLocked", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface attabal {

    /* JADX INFO: renamed from: formularization.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Mutex.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C0613attabal {
        public static /* synthetic */ Object attabal(attabal attabalVar, Object obj, wretchedly.dern dernVar, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            return attabalVar.attabal(obj, dernVar);
        }

        public static /* synthetic */ void dern(attabal attabalVar, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            attabalVar.wireman(obj);
        }

        public static /* synthetic */ boolean saneness(attabal attabalVar, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            return attabalVar.saneness(obj);
        }
    }

    Object attabal(Object obj, wretchedly.dern<? super Unit> dernVar);

    boolean dern();

    boolean saneness(Object owner);

    void wireman(Object owner);
}
